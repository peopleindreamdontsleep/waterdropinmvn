package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\Config.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigParser}.
 */
public interface ConfigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(ConfigParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(ConfigParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#sparkBlock}.
	 * @param ctx the parse tree
	 */
	void enterSparkBlock(ConfigParser.SparkBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#sparkBlock}.
	 * @param ctx the parse tree
	 */
	void exitSparkBlock(ConfigParser.SparkBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#inputBlock}.
	 * @param ctx the parse tree
	 */
	void enterInputBlock(ConfigParser.InputBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#inputBlock}.
	 * @param ctx the parse tree
	 */
	void exitInputBlock(ConfigParser.InputBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#filterBlock}.
	 * @param ctx the parse tree
	 */
	void enterFilterBlock(ConfigParser.FilterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#filterBlock}.
	 * @param ctx the parse tree
	 */
	void exitFilterBlock(ConfigParser.FilterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#outputBlock}.
	 * @param ctx the parse tree
	 */
	void enterOutputBlock(ConfigParser.OutputBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#outputBlock}.
	 * @param ctx the parse tree
	 */
	void exitOutputBlock(ConfigParser.OutputBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ConfigParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ConfigParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ConfigParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ConfigParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#plugin}.
	 * @param ctx the parse tree
	 */
	void enterPlugin(ConfigParser.PluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#plugin}.
	 * @param ctx the parse tree
	 */
	void exitPlugin(ConfigParser.PluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(ConfigParser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(ConfigParser.EntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(ConfigParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(ConfigParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ConfigParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ConfigParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ConfigParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ConfigParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#qstr}.
	 * @param ctx the parse tree
	 */
	void enterQstr(ConfigParser.QstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#qstr}.
	 * @param ctx the parse tree
	 */
	void exitQstr(ConfigParser.QstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ConfigParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ConfigParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(ConfigParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(ConfigParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(ConfigParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(ConfigParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(ConfigParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(ConfigParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ConfigParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ConfigParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ConfigParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ConfigParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(ConfigParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(ConfigParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldReferenceExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldReferenceExpression(ConfigParser.FieldReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldReferenceExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldReferenceExpression(ConfigParser.FieldReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(ConfigParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ConfigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(ConfigParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ConfigParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ConfigParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ConfigParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ConfigParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ConfigParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ConfigParser.BoolContext ctx);
}