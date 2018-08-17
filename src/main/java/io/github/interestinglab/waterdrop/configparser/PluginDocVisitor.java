package io.github.interestinglab.waterdrop.configparser;
// Generated from E:/wordspacesec/waterdropinmvn/src/main/antlr4\PluginDoc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PluginDocParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PluginDocVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#waterdropPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaterdropPlugin(PluginDocParser.WaterdropPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginBlock(PluginDocParser.PluginBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PluginDocParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginGroup(PluginDocParser.PluginGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(PluginDocParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginDesc(PluginDocParser.PluginDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginAuthor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginAuthor(PluginDocParser.PluginAuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginHomepage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginHomepage(PluginDocParser.PluginHomepageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginVersion(PluginDocParser.PluginVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#pluginOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginOption(PluginDocParser.PluginOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(PluginDocParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#optionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionName(PluginDocParser.OptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#optionRequired}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionRequired(PluginDocParser.OptionRequiredContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#optionDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDefaultValue(PluginDocParser.OptionDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PluginDocParser#optionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDesc(PluginDocParser.OptionDescContext ctx);
}