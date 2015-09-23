// Generated from D:/MyProjects/mrh-database/generator/src/main/java/net/matthoyt/database/generator\DbGen.g4 by ANTLR 4.5.1
package net.matthoyt.database.generator;
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
	void enterProg(DbGenParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DbGenParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(DbGenParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(DbGenParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DbGenParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DbGenParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DbGenParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DbGenParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(DbGenParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(DbGenParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DbGenParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DbGenParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#skipColumn}.
	 * @param ctx the parse tree
	 */
	void enterSkipColumn(DbGenParser.SkipColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#skipColumn}.
	 * @param ctx the parse tree
	 */
	void exitSkipColumn(DbGenParser.SkipColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#columnEnum}.
	 * @param ctx the parse tree
	 */
	void enterColumnEnum(DbGenParser.ColumnEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#columnEnum}.
	 * @param ctx the parse tree
	 */
	void exitColumnEnum(DbGenParser.ColumnEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(DbGenParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(DbGenParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#additionalOptions}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalOptions(DbGenParser.AdditionalOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#additionalOptions}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalOptions(DbGenParser.AdditionalOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DbGenParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DbGenParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbGenParser#sqlBlock}.
	 * @param ctx the parse tree
	 */
	void enterSqlBlock(DbGenParser.SqlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbGenParser#sqlBlock}.
	 * @param ctx the parse tree
	 */
	void exitSqlBlock(DbGenParser.SqlBlockContext ctx);
}