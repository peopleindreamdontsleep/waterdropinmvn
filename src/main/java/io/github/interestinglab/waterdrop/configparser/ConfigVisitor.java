package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\Config.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConfigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConfigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConfigParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(ConfigParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#sparkBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparkBlock(ConfigParser.SparkBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#inputBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputBlock(ConfigParser.InputBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#filterBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterBlock(ConfigParser.FilterBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#outputBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputBlock(ConfigParser.OutputBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ConfigParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ConfigParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#plugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlugin(ConfigParser.PluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntries(ConfigParser.EntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(ConfigParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ConfigParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ConfigParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#qstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQstr(ConfigParser.QstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ConfigParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(ConfigParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(ConfigParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(ConfigParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ConfigParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ConfigParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(ConfigParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldReferenceExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldReferenceExpression(ConfigParser.FieldReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(ConfigParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(ConfigParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ConfigParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ConfigParser.BoolContext ctx);
}