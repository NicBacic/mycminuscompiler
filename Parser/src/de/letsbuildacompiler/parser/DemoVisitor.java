// Generated from Demo.g4 by ANTLR 4.2
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#VectorAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorAssignment(@NotNull DemoParser.VectorAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull DemoParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#IfElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(@NotNull DemoParser.IfElseContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Bneq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBneq(@NotNull DemoParser.BneqContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Bleq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBleq(@NotNull DemoParser.BleqContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DemoParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#SimpleAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(@NotNull DemoParser.SimpleAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Bgeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBgeq(@NotNull DemoParser.BgeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#funcCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(@NotNull DemoParser.FuncCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#IntegerParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerParam(@NotNull DemoParser.IntegerParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull DemoParser.PrintlnContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(@NotNull DemoParser.EmptyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull DemoParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#VectorParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorParam(@NotNull DemoParser.VectorParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull DemoParser.StatementListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DemoParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull DemoParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(@NotNull DemoParser.VectorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#IntegerParamDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerParamDeclaration(@NotNull DemoParser.IntegerParamDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#SimpleVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVarDeclaration(@NotNull DemoParser.SimpleVarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#VectorVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorVarDeclaration(@NotNull DemoParser.VectorVarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Bg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBg(@NotNull DemoParser.BgContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull DemoParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Bl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBl(@NotNull DemoParser.BlContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#MainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(@NotNull DemoParser.MainStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull DemoParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Beq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeq(@NotNull DemoParser.BeqContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull DemoParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull DemoParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull DemoParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull DemoParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#ProgPartFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPartFunctionDefinition(@NotNull DemoParser.ProgPartFunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull DemoParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link DemoParser#Minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull DemoParser.MinusContext ctx);
}