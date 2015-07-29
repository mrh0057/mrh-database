// Generated from C:/Users/mrh0057/OneDrive/GitProjects/mrh-database/generator/src/main/java/net/matthoyt/database/generator\DbGen.g4 by ANTLR 4.5
package net.matthoyt.database.generator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DbGenParser}.
 */
public interface DbGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DbGenParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull DbGenParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull DbGenParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull DbGenParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull DbGenParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(@NotNull DbGenParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(@NotNull DbGenParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull DbGenParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull DbGenParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(@NotNull DbGenParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(@NotNull DbGenParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull DbGenParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull DbGenParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#skipColumn}.
	 * @param ctx the parse tree
	 */
	void enterSkipColumn(@NotNull DbGenParser.SkipColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#skipColumn}.
	 * @param ctx the parse tree
	 */
	void exitSkipColumn(@NotNull DbGenParser.SkipColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#columnEnum}.
	 * @param ctx the parse tree
	 */
	void enterColumnEnum(@NotNull DbGenParser.ColumnEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#columnEnum}.
	 * @param ctx the parse tree
	 */
	void exitColumnEnum(@NotNull DbGenParser.ColumnEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(@NotNull DbGenParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(@NotNull DbGenParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#additionalOptions}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalOptions(@NotNull DbGenParser.AdditionalOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#additionalOptions}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalOptions(@NotNull DbGenParser.AdditionalOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull DbGenParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull DbGenParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#sqlBlock}.
	 * @param ctx the parse tree
	 */
	void enterSqlBlock(@NotNull DbGenParser.SqlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#sqlBlock}.
	 * @param ctx the parse tree
	 */
	void exitSqlBlock(@NotNull DbGenParser.SqlBlockContext ctx);
}