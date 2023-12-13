// Generated from G.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GParser}.
 */
public interface GListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(GParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(GParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInput(GParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInput(GParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(GParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(GParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrim(GParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrim(GParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(GParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(GParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replace}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReplace(GParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replace}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReplace(GParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GParser.LiteralContext ctx);
}