package de.letsbuildacompiler.compiler;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import de.letsbuildacompiler.compiler.exceptions.InvalidIndexException;
import de.letsbuildacompiler.compiler.exceptions.UndeclaredVariableException;
import de.letsbuildacompiler.compiler.exceptions.VariableAlreadyDefinedException;
import de.letsbuildacompiler.parser.DemoBaseVisitor;
import de.letsbuildacompiler.parser.DemoParser;
import de.letsbuildacompiler.parser.DemoParser.BeqContext;
import de.letsbuildacompiler.parser.DemoParser.BgContext;
import de.letsbuildacompiler.parser.DemoParser.BgeqContext;
import de.letsbuildacompiler.parser.DemoParser.BlContext;
import de.letsbuildacompiler.parser.DemoParser.BleqContext;
import de.letsbuildacompiler.parser.DemoParser.BneqContext;
import de.letsbuildacompiler.parser.DemoParser.DivContext;
import de.letsbuildacompiler.parser.DemoParser.EmptyContext;
import de.letsbuildacompiler.parser.DemoParser.ExpressionListContext;
import de.letsbuildacompiler.parser.DemoParser.FunctionCallContext;
import de.letsbuildacompiler.parser.DemoParser.FunctionDefinitionContext;
import de.letsbuildacompiler.parser.DemoParser.IfContext;
import de.letsbuildacompiler.parser.DemoParser.IfElseContext;
import de.letsbuildacompiler.parser.DemoParser.IntegerParamContext;
import de.letsbuildacompiler.parser.DemoParser.IntegerParamDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.MainStatementContext;
import de.letsbuildacompiler.parser.DemoParser.MinusContext;
import de.letsbuildacompiler.parser.DemoParser.MultContext;
import de.letsbuildacompiler.parser.DemoParser.NumberContext;
import de.letsbuildacompiler.parser.DemoParser.PlusContext;
import de.letsbuildacompiler.parser.DemoParser.PrintlnContext;
import de.letsbuildacompiler.parser.DemoParser.ProgramContext;
import de.letsbuildacompiler.parser.DemoParser.SimpleAssignmentContext;
import de.letsbuildacompiler.parser.DemoParser.SimpleVarDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.VariableContext;
import de.letsbuildacompiler.parser.DemoParser.VectorAssignmentContext;
import de.letsbuildacompiler.parser.DemoParser.VectorContext;
import de.letsbuildacompiler.parser.DemoParser.VectorParamContext;
import de.letsbuildacompiler.parser.DemoParser.VectorVarDeclarationContext;
import de.letsbuildacompiler.parser.DemoParser.WhileContext;

public class CMinusVisitor extends DemoBaseVisitor<String> {
	
	private Map<String, Integer> variables = new HashMap<>();
	private Map<String, Integer> vector = new HashMap<>();
	private String breakCondition = "";
	
	@Override
	public String visitPrintln(PrintlnContext ctx) {
		return "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" + 
				 visit(ctx.argument) + "\n" + 
				"  invokevirtual java/io/PrintStream/println(I)V\n";
	}
	
	@Override
	public String visitPlus(PlusContext ctx) {
		return visitChildren(ctx) + "\n" +
			"iadd";
	}
	
	@Override
	public String visitMinus(MinusContext ctx) {
		return visitChildren(ctx) + "\n" +
				"isub";
	}
	
	@Override
	public String visitDiv(DivContext ctx) {
		return visitChildren(ctx) + "\n" +
				"idiv";
	}
	
	@Override
	public String visitMult(MultContext ctx) {
		return visitChildren(ctx) + "\n" +
				"imul";
	}
	
	@Override
	public String visitBg(BgContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmple " + breakCondition;
	}

	@Override
	public String visitBl(BlContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmpge " + breakCondition;
	}

	@Override
	public String visitBeq(BeqContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmpne " + breakCondition;
	}

	@Override
	public String visitBgeq(BgeqContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmplt " + breakCondition;
	}
	
	@Override
	public String visitBleq(BleqContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmpgt " + breakCondition;
	}
	
	@Override
	public String visitBneq(BneqContext ctx) {
		return visitChildren(ctx) + "\n" +
				"if_icmpeq " + breakCondition;
	}

	@Override
	public String visitNumber(NumberContext ctx) {
		return "ldc " + ctx.number.getText();
	}
	
	@Override
	public String visitSimpleVarDeclaration(SimpleVarDeclarationContext ctx) {
		if (variables.containsKey(ctx.varName.getText())) {
			throw new VariableAlreadyDefinedException(ctx.varName);
		}
		variables.put(ctx.varName.getText(), variables.size());
		return "";
	}
	
	private void saveVectorInSymbolTable(Token varName) {
		if (variables.containsKey(varName.getText())) {
			throw new VariableAlreadyDefinedException(varName);
		}
		variables.put(varName.getText(), variables.size());
	}
	
	@Override
	public String visitVectorVarDeclaration(VectorVarDeclarationContext ctx) {
		saveVectorInSymbolTable(ctx.varName);
		if(ctx.expr == null) {
			return "";
		}
		
//		int index = Integer.parseInt(ctx.number.getText());
//		if (index <= 0) {
//			throw new InvalidIndexException(ctx.varName, index);
//		}
		vector.put(ctx.varName.getText(), variables.size());
		return 	visit(ctx.expr) + "\n" +
				"newarray int" + "\n" +
				"astore_" + requireVariableIndex(ctx.varName);
	}
	
	@Override
	public String visitSimpleAssignment(SimpleAssignmentContext ctx) {
		return visit(ctx.expr) + "\n" +
				"istore " + requireVariableIndex(ctx.varName);
	}
	
	@Override
	public String visitVectorAssignment(VectorAssignmentContext ctx) {
		String i;
		try {
			return "aload_" + requireVariableIndex(ctx.varName) + "\n"+
					visit(ctx.left) + "\n" +
					visit(ctx.right) + "\n" + 
					"iastore";
		} catch (Exception e) {
		  throw e;
		}
	}
	
	@Override
	public String visitVariable(VariableContext ctx) {
		Integer isVec = vector.get(ctx.varName.getText());
		if(isVec != null) {
			return "aload_" + requireVariableIndex(ctx.varName);
		}
		return "iload " + requireVariableIndex(ctx.varName);
	}
	
	@Override
	public String visitVector(VectorContext ctx) {

		try {
			return "aload_" + requireVariableIndex(ctx.varName) + "\n" +
					visit(ctx.right) + "\n" +
					"iaload";
		} catch (Exception e) {
		  throw e;
		}
	}
	
	@Override
	public String visitExpressionList(ExpressionListContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public String visitWhile(WhileContext ctx) {
		String labelLoop = "Loop" + ctx.start.getLine();
		breakCondition = "OffLoop" + ctx.stop.getLine();
		return labelLoop + ":\n" + visitChildren(ctx) + "\n" +
				"goto " + labelLoop + "\n" +
				breakCondition + ":";
	}
	
	@Override
	public String visitIf(IfContext ctx) {
		breakCondition = "BreakIf" + ctx.stop.getLine();
		return visitChildren(ctx) + "\n" +
				breakCondition + ":\n";
	}

	@Override
	public String visitIfElse(IfElseContext ctx) {
		breakCondition = "ElseCondition" + ctx.ifStats.getStop().getLine();
		String labelElse = breakCondition;
		String instructions = visit(ctx.expr) + "\n";
		breakCondition = "BreakCondition" + ctx.stop.getLine();
		return instructions + 
			   visit(ctx.ifStats) + "\n" +
			   "goto " + breakCondition + "\n" +
			   labelElse + ":\n" +
			   visit(ctx.elseStats) + "\n" +
			   breakCondition + ":\n";
	}

	private String formatArgumentsToFunctionCall(String instructions, int numberOfParameters) {
		int i;
		String s = "";
		if (instructions != null) {
			String inst[] = instructions.split("\n");
			for(i = 0; i < inst.length; i++) {
				if(inst[i].charAt(0) == 'a') {
					s += "[I";
				} else {
					s += "I";
				}
			}
		}
		return s;
	}
	
	@Override
	public String visitFunctionCall(FunctionCallContext ctx) {
		String instructions = "";
		String argumentsInstructions = visit(ctx.arguments);
		if (argumentsInstructions != null) {
			instructions += argumentsInstructions + '\n';
		}
		instructions += "invokestatic HelloWorld/" + ctx.funcName.getText() + "(";
		int numberOfParameters = ctx.arguments.expressions.size();
		instructions += formatArgumentsToFunctionCall(argumentsInstructions, numberOfParameters);
		instructions += ")I";
		return instructions;
	}
	
	@Override
	public String visitEmpty(EmptyContext ctx) {
		return "";
	}
	
	private String formatString(String s) {
		return s.replace("\n", "");
	}
	
	@Override
	public String visitIntegerParamDeclaration(IntegerParamDeclarationContext ctx) {
		String params = formatString(visitChildren(ctx));
		return params;
	}
	
	@Override
	public String visitIntegerParam(IntegerParamContext ctx) {
		visitChildren(ctx);
		return "I";
	}

	@Override
	public String visitVectorParam(VectorParamContext ctx) {
		visitChildren(ctx);
		return "[I";
	}

	
	@Override
	public String visitFunctionDefinition(FunctionDefinitionContext ctx) {
		Map<String, Integer> oldVariables = variables;
		Map<String, Integer> oldVector = vector;
		variables = new HashMap<>();
		vector = new HashMap<>();
		String params = visit(ctx.params);
		String statementInstructions = visit(ctx.statements);
		String result = ".method public static " + ctx.funcName.getText() + "(";
		result += params;
		result += ")I\n" +
				".limit locals 100\n" +
				".limit stack 100\n" +
				(statementInstructions == null ? "" : statementInstructions + "\n") +
				visit(ctx.returnValue) + "\n" +
				"ireturn\n" +
				".end method";
		variables = oldVariables;
		vector = oldVector;
		return result;
	}
	
	private String stringRepeat(String string, int count) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < count; ++i) {
			result.append(string);
		}
		return result.toString();
	}

	@Override
	public String visitProgram(ProgramContext ctx) {
		String mainCode = "";
		String functions = "";
		for(int i = 0; i < ctx.getChildCount(); ++i) {
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof MainStatementContext) {
				mainCode += instructions + "\n";
			} else {
				functions += instructions + "\n";
			}
		}
		return functions + "\n" +
		".method public static main([Ljava/lang/String;)V\n" + 
		"  .limit stack 100\n" + 
		"  .limit locals 100\n" + 
		"  \n" + 
		 mainCode + "\n" + 
		"  return\n" + 
		"  \n" + 
		".end method";
	}
	
	private int requireVariableIndex(Token varNameToken) {
		Integer varIndex = variables.get(varNameToken.getText());
		if (varIndex == null) {
			throw new UndeclaredVariableException(varNameToken);
		}
		return varIndex;
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
}
