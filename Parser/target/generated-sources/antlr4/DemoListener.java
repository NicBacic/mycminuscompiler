// Generated from Demo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code VectorAssignment}
	 * labeled alternative in {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVectorAssignment(@NotNull DemoParser.VectorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorAssignment}
	 * labeled alternative in {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVectorAssignment(@NotNull DemoParser.VectorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull DemoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull DemoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link DemoParser#ifElseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(@NotNull DemoParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link DemoParser#ifElseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(@NotNull DemoParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bneq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBneq(@NotNull DemoParser.BneqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bneq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBneq(@NotNull DemoParser.BneqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bleq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBleq(@NotNull DemoParser.BleqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bleq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBleq(@NotNull DemoParser.BleqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DemoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DemoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(@NotNull DemoParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(@NotNull DemoParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bgeq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBgeq(@NotNull DemoParser.BgeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bgeq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBgeq(@NotNull DemoParser.BgeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpression(@NotNull DemoParser.FuncCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpression(@NotNull DemoParser.FuncCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerParam}
	 * labeled alternative in {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterIntegerParam(@NotNull DemoParser.IntegerParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerParam}
	 * labeled alternative in {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitIntegerParam(@NotNull DemoParser.IntegerParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull DemoParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull DemoParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(@NotNull DemoParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(@NotNull DemoParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull DemoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull DemoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorParam}
	 * labeled alternative in {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void enterVectorParam(@NotNull DemoParser.VectorParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorParam}
	 * labeled alternative in {@link DemoParser#param}.
	 * @param ctx the parse tree
	 */
	void exitVectorParam(@NotNull DemoParser.VectorParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull DemoParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull DemoParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DemoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DemoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull DemoParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull DemoParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVector(@NotNull DemoParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vector}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVector(@NotNull DemoParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerParamDeclaration}
	 * labeled alternative in {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntegerParamDeclaration(@NotNull DemoParser.IntegerParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerParamDeclaration}
	 * labeled alternative in {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntegerParamDeclaration(@NotNull DemoParser.IntegerParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleVarDeclaration}
	 * labeled alternative in {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVarDeclaration(@NotNull DemoParser.SimpleVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleVarDeclaration}
	 * labeled alternative in {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVarDeclaration(@NotNull DemoParser.SimpleVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VectorVarDeclaration}
	 * labeled alternative in {@link DemoParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVectorVarDeclaration(@NotNull DemoParser.VectorVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VectorVarDeclaration}
	 * labeled alternative in {@link DemoParser#vectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVectorVarDeclaration(@NotNull DemoParser.VectorVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bg}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBg(@NotNull DemoParser.BgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bg}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBg(@NotNull DemoParser.BgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull DemoParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull DemoParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bl}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBl(@NotNull DemoParser.BlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bl}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBl(@NotNull DemoParser.BlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(@NotNull DemoParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(@NotNull DemoParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link DemoParser#iteratorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull DemoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link DemoParser#iteratorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull DemoParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Beq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBeq(@NotNull DemoParser.BeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Beq}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBeq(@NotNull DemoParser.BeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull DemoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull DemoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull DemoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull DemoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull DemoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull DemoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterProgPartFunctionDefinition(@NotNull DemoParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitProgPartFunctionDefinition(@NotNull DemoParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link DemoParser#ifElseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull DemoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link DemoParser#ifElseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull DemoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull DemoParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull DemoParser.MinusContext ctx);
}