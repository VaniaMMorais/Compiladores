// Generated from Frac.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracParser}.
 */
public interface FracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(FracParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(FracParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FracParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FracParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FracParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FracParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(FracParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(FracParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(FracParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(FracParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(FracParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(FracParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reduceExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReduceExpr(FracParser.ReduceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reduceExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReduceExpr(FracParser.ReduceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(FracParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(FracParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumSubExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumSubExpr(FracParser.SumSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumSubExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumSubExpr(FracParser.SumSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(FracParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(FracParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(FracParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link FracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(FracParser.IdExprContext ctx);
}