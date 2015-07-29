// Generated from C:/Users/mrh0057/OneDrive/GitProjects/mrh-database/generator/src/main/java/net/matthoyt/database/config\DbConfig.g4 by ANTLR 4.5
package net.matthoyt.database.config;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DbConfigParser}.
 */
public interface DbConfigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(@NotNull DbConfigParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(@NotNull DbConfigParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull DbConfigParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull DbConfigParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void enterSectionStart(@NotNull DbConfigParser.SectionStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#sectionStart}.
	 * @param ctx the parse tree
	 */
	void exitSectionStart(@NotNull DbConfigParser.SectionStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(@NotNull DbConfigParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(@NotNull DbConfigParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(@NotNull DbConfigParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(@NotNull DbConfigParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbConfigParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull DbConfigParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbConfigParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull DbConfigParser.PropertyContext ctx);
}