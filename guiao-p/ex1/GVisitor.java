// Generated from G.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(GParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(GParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(GParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(GParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(GParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replace}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(GParser.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link GParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GParser.LiteralContext ctx);
}