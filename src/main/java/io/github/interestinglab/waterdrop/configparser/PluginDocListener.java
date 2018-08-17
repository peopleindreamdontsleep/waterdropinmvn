package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\PluginDoc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PluginDocParser}.
 */
public interface PluginDocListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#waterdropPlugin}.
	 * @param ctx the parse tree
	 */
	void enterWaterdropPlugin(PluginDocParser.WaterdropPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#waterdropPlugin}.
	 * @param ctx the parse tree
	 */
	void exitWaterdropPlugin(PluginDocParser.WaterdropPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginBlock}.
	 * @param ctx the parse tree
	 */
	void enterPluginBlock(PluginDocParser.PluginBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginBlock}.
	 * @param ctx the parse tree
	 */
	void exitPluginBlock(PluginDocParser.PluginBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PluginDocParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PluginDocParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginGroup}.
	 * @param ctx the parse tree
	 */
	void enterPluginGroup(PluginDocParser.PluginGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginGroup}.
	 * @param ctx the parse tree
	 */
	void exitPluginGroup(PluginDocParser.PluginGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(PluginDocParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(PluginDocParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginDesc}.
	 * @param ctx the parse tree
	 */
	void enterPluginDesc(PluginDocParser.PluginDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginDesc}.
	 * @param ctx the parse tree
	 */
	void exitPluginDesc(PluginDocParser.PluginDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginAuthor}.
	 * @param ctx the parse tree
	 */
	void enterPluginAuthor(PluginDocParser.PluginAuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginAuthor}.
	 * @param ctx the parse tree
	 */
	void exitPluginAuthor(PluginDocParser.PluginAuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginHomepage}.
	 * @param ctx the parse tree
	 */
	void enterPluginHomepage(PluginDocParser.PluginHomepageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginHomepage}.
	 * @param ctx the parse tree
	 */
	void exitPluginHomepage(PluginDocParser.PluginHomepageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginVersion}.
	 * @param ctx the parse tree
	 */
	void enterPluginVersion(PluginDocParser.PluginVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginVersion}.
	 * @param ctx the parse tree
	 */
	void exitPluginVersion(PluginDocParser.PluginVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#pluginOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginOption(PluginDocParser.PluginOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#pluginOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginOption(PluginDocParser.PluginOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(PluginDocParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(PluginDocParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#optionName}.
	 * @param ctx the parse tree
	 */
	void enterOptionName(PluginDocParser.OptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#optionName}.
	 * @param ctx the parse tree
	 */
	void exitOptionName(PluginDocParser.OptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#optionRequired}.
	 * @param ctx the parse tree
	 */
	void enterOptionRequired(PluginDocParser.OptionRequiredContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#optionRequired}.
	 * @param ctx the parse tree
	 */
	void exitOptionRequired(PluginDocParser.OptionRequiredContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#optionDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionDefaultValue(PluginDocParser.OptionDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#optionDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionDefaultValue(PluginDocParser.OptionDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PluginDocParser#optionDesc}.
	 * @param ctx the parse tree
	 */
	void enterOptionDesc(PluginDocParser.OptionDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link PluginDocParser#optionDesc}.
	 * @param ctx the parse tree
	 */
	void exitOptionDesc(PluginDocParser.OptionDescContext ctx);
}