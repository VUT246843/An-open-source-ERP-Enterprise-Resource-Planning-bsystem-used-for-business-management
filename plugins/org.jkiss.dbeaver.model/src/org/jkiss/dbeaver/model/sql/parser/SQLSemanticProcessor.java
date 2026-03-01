import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
     * </ul>

        // WHERE
                }
        String filterOrder = filter.getOrder();
            // Maybe it is a join
    }
        }
            sqlQuery,
        throw new DBException("Can't inject filters to a query that is not a plain SELECT statement");
            element.setExpression(expression);
    }
                        }
            log.warn("Unexpected awaiting tasks found while terminating JSqlParser executor.");
    }
 * See the License for the specific language governing permissions and
    private static CCJSqlParser buildParser(@Nullable SQLDialect dialect, @NotNull String sql) throws DBCException {
        }
     * Extract alias (or source table name) for specified constraint from SQL select.

        if (isDynamicAttribute(attribute)) {
            return true;
            throw new DBCException("Error initializing SQL parser: " + e.getMessage(), e);
        CCJSqlParser parser = buildParser(dialect, sql);
            }
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
            return CCJSqlParserUtil.parseCondExpression(expression, allowPartialParse);
        return callWithTimeout(parser, parser::Statement);
                DBSEntity entity = DBUtils.getEntityFromMetaData(monitor, DBUtils.getDefaultContext(dataSource, true), entityMetaData);
    ) throws DBException {
        if (schema == null || schema.isEmpty()) {
    public static Expression parseExpression(String expression) throws DBCException {
     *

     *  It is configurable


            }
    }
                    if (qs.length == 2 && "[".equals(qs[0]) && "]".equals(qs[1])) {
        final String schema = table.getSchemaName();

        @NotNull DBPDataSource dataSource,
        return true;
     * @param dialect SQL dialect used to check and quote identifiers
            if (e instanceof InterruptedException) {
        final boolean schemaQuoted = dialect.isQuotedIdentifier(schema);
                new ParenthesedExpressionList<>(sourceWhere),
import org.jkiss.code.NotNull;

    ) throws DBException {

        }
        DBSAttributeBase ca = constraint.getAttribute();
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
                element.setExpression(orderExpr);
     */
    }
            return false;

import org.jkiss.dbeaver.model.exec.DBCException;
                        break;
        if (!CommonUtils.isEmpty(filterOrder)) {
    }
        if (!(attribute instanceof DBDAttributeBinding attributeBinding)) {
        String constrTable;
        List<DBDAttributeConstraint> orderConstraints = filter.getOrderConstraints();

    private static final int PARSE_FUTURE_TIMEOUT_MS = 1000; // if we can't parse fast, we don't want to
        }
    }
            future.cancel(true);
        }
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
     *   <li>{@code "a"."b" -> "a.b"}</li>
        return null;
            return null;

        if (attribute instanceof DBDAttributeBinding attributeBinding) {
                    }
        }
        @NotNull DBPDataSource dataSource,
        return callWithTimeout(parser, parser::Statements);
    ) throws DBException {
            // Use column table only if there are multiple source tables (joins)
/**
            }

                        return false;

                    if (dataFilter.hasOrdering()) {
                    return statement.toString();
                if (co.isOrderDescending()) {
            // It's good place to use parseExpression, but it parse fine just one column name, not "column1,column2" or "column1 DESC"
        return schema + '.' + name;

 * Semantic SQL processor
            select.setWhere(new AndExpression(
        if (select instanceof PlainSelect plainSelect) {

     *

import org.jkiss.dbeaver.model.DBUtils;
                if (patchSelectQuery(monitor, dataSource, plainSelect, dataFilter)) {
    @NotNull
            return name;
import net.sf.jsqlparser.JSQLParserException;
    }
            constrTable = metaAttribute == null ? null : metaAttribute.getEntityName();
            dataSource,
        try {
        } catch (Throwable e) {
        return true;
     *   <li>{@code "a.b" -> "a.b"}</li>
    }

        if (filter.hasOrdering()) {
        DBSAttributeBase attribute = co.getAttribute();
    @Nullable
    }
            }
    /**
    private static final Log log = Log.getLog(SQLSemanticProcessor.class);
                }
                if (join.getRightItem() instanceof Table table && equalTables(table, tableName)) {

        if (table == null) {
    private static Expression getOrderConstraintExpression(DBRProgressMonitor monitor, DBPDataSource dataSource, PlainSelect select, DBDDataFilter filter, DBDAttributeConstraint co, boolean forceNumeric) throws DBException {
        return parseCondExpression(expression, true);
    public static Expression parseExpression(String expression, boolean allowPartialParse) throws DBCException {
import org.jkiss.dbeaver.Log;


            if (dialect != null) {
                .withAllowComplexParsing(ALLOW_COMPLEX_PARSING);
        }

            if (entityMetaData != null) {
import org.jkiss.dbeaver.ModelPreferences;
            }

            Statement statement = parseQuery(dialect, query);
    public static Table findTableByNameOrAlias(Select select, String tableName) {
        @NotNull DBPDataSource dataSource,
     * Searches in FROM and JOIN
        @NotNull DBPDataSource dataSource,
package org.jkiss.dbeaver.model.sql.parser;
            throw new DBCException("Error parsing SQL query: " + e.getMessage(), e);
        List<OrderByElement> orderByElements = select.getOrderByElements();
     * @throws DBException if the table cannot be determined from the SELECT
    private static boolean patchSelectQuery(
    }
        if (select instanceof PlainSelect plainSelect) {
        } catch (ParseException e) {
    private static void addOrderByClause(
            }
     *   <li>{@code "a".b -> "a".b}</li>
    }
        @Nullable DBRProgressMonitor monitor,
            if (orderColumnIndex == -1) {
    @NotNull
    public static Table getConstraintTable(DBPDataSource dataSource, PlainSelect select, DBDAttributeConstraint constraint) {
                    if (!isValidTableColumn(monitor, dataSource, table, co)) {
            }
        addWhereToSelect(select, condString);
        } else if (ca instanceof DBSEntityAttribute entityAttribute) {

        }
    }
                if (entity != null) {
            }
            if (!CommonUtils.isEmpty(select.getJoins())) {
    }
        @NotNull String sqlQuery,


     *  Solution - always wrap query in subselect + add patched WHERE and ORDER
 *
        if (!executor.shutdownNow().isEmpty()) {
    }
        } catch (ExecutionException e) {
                }
            }
        StringBuilder whereString = new StringBuilder();
        @NotNull DBDDataFilter filter
            return parser;
    public static String addFiltersToQuery(
        }
        Expression filterWhere = SQLSemanticProcessor.parseCondExpression(condString);
                        if (table.getAlias() != null) {
    @NotNull
        if (constrTable == null) {
                    return statement.toString();
            DBCEntityMetaData entityMetaData = attributeMetaData.getEntityMetaData();
    }
            attribute = attributeBinding.getMetaAttribute();
     */
                for (String[] qs : ArrayUtils.safeArray(dialect.getIdentifierQuoteStrings())) {
import org.jkiss.code.Nullable;
                orderByElements.add(element);
        }
    public static void addWhereToSelect(PlainSelect select, String condString) throws DBCException {
    ) throws DBException {
            addWhereCondition(dataSource, select, filter);
        }
public class SQLSemanticProcessor {
            constrTable = entityAttribute.getParentObject().getName();
 */
        CCJSqlParser parser = buildParser(dialect, sql);

        } catch (TimeoutException | InterruptedException e) {
            if (fromItem instanceof Table table) {
        } catch (JSQLParserException e) {
    public static List<Statement> parseQueries(@Nullable SQLDialect dialect, @NotNull String sql) throws DBCException {
        if (t1.getAlias() != null) {
     *  Applying filters changes query formatting (thus it changes column names in expressions)
import org.jkiss.utils.ArrayUtils;
 *
            throw new DBCException("Failed to parse SQL query within reasonable time", e);
            if (statement instanceof PlainSelect plainSelect) {
    /**
        }
    }
            DBUtils.getUnQuotedIdentifier(dataSource, tableName).equals(DBUtils.getUnQuotedIdentifier(dataSource, table.getName()))) {

        @NotNull DBDDataFilter dataFilter
            return CCJSqlParserUtil.parseExpression(expression, allowPartialParse);
import net.sf.jsqlparser.expression.Expression;
        // ORDER
    private static final ExecutorService executor = Executors.newCachedThreadPool();
            }
        return dataSource.getSQLDialect().getQueryGenerator().getQueryWithAppliedFilters(
                boolean forceNumeric = filter.hasNameDuplicates(columnName) || !SQLUtils.PATTERN_SIMPLE_NAME.matcher(columnName).matches();
        return DBUtils.isDynamicAttribute(attributeBinding.getAttribute());
    }
    @NotNull
import java.util.ArrayList;
        try {
        } catch (JSQLParserException e) {
    }
        if (!(select.getFromItem() instanceof Table table)) {
import java.util.concurrent.*;
        } else if (CommonUtils.isJavaIdentifier(attrName)) {
    public static Statement parseQuery(@NotNull String sql) throws DBCException {
        } else {
        @NotNull DBDDataFilter filter
    public static boolean isSelectQuery(SQLDialect dialect, String query) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.model.DBPDataSource;
            OrderByElement element = new OrderByElement();
 * limitations under the License.
                    element.setAscDescPresent(true);
    public static void addWhereToSelect(PlainSelect select, Expression conditionExpr) {
            ));
            Expression expression = new CustomExpression(filterOrder);
                } else if (plainSelect.getWithItemsList() != null && !plainSelect.getWithItemsList().isEmpty()) {
        }
    public static String getSimpleTableName(@NotNull PlainSelect select, @NotNull SQLDialect dialect) throws DBException {
        } catch (Throwable e) {
 */
        final String name   = table.getName();
     *   <li>{@code a."b" -> a."b"}</li>
    public static Table getTableFromSelect(Select select) {
                        return false;
                orderTable = null;
        FromItem fromItem = select.getFromItem();
            orderByElements.add(element);
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
            addOrderByClause(monitor, dataSource, select, filter);
        try {
                + DBUtils.getUnQuotedIdentifier(name, "\"");
    public static Statement parseQuery(@Nullable SQLDialect dialect, @NotNull String sql) throws DBCException {
        @NotNull DBPDataSource dataSource,
    @Nullable
        if (forceNumeric || attrName.isEmpty()) {
    }
                + '.'
        @NotNull PlainSelect select,
                OrderByElement element = new OrderByElement();
            return null;
import net.sf.jsqlparser.statement.select.*;
                    } else {

                        break;
        final boolean nameQuoted   = dialect.isQuotedIdentifier(name);
    @NotNull
            orderExpr = SQLSemanticProcessor.parseExpression(attrName);
import org.jkiss.dbeaver.model.sql.SQLUtils;
        }
                        } else {
                    }
        } else {
    }
     * @deprecated Use {@link SQLQueryGenerator#getQueryWithAppliedFilters(DBRProgressMonitor, DBPDataSource, String, DBDDataFilter)} instead
            throw new DBCException("Error parsing SQL expression", e);
            return statement instanceof PlainSelect plainSelect && CommonUtils.isEmpty(plainSelect.getIntoTables());
        addWhereToSelect(select, filterWhere);
            //orderExpr = new LongValue(co.getAttribute().getOrdinalPosition() + 1);
        try {
    ) throws DBException {
        }
        }
            Table orderTable = CommonUtils.isEmpty(select.getJoins()) ? null : getConstraintTable(dataSource, select, co);
                    Table table = getConstraintTable(dataSource, select, co);
     */
                    }
    private static Table findTableInFrom(DBPDataSource dataSource, FromItem fromItem, String tableName) {
            //orderExpr = new CustomExpression(attrName);
                            co.setEntityAlias(table.getAlias().getName());
    private static boolean isValidTableColumn(DBRProgressMonitor monitor, DBPDataSource dataSource, Table table, DBDAttributeConstraint co) throws DBException {


            // TODO: set tableAlias for all column references in expression
            FromItem fromItem = plainSelect.getFromItem();
        String condString = whereString.toString();
        return parseQuery(null, sql);
            select.setOrderByElements(orderByElements);
                if (co.hasCondition() && !isDynamicAttribute(co.getAttribute())) {
            return CommonUtils.equalObjects(t1.getName(), name);
            return true;
            // expression = CCJSqlParserUtil.parseExpression(filterOrder);
                return table;
 * Unless required by applicable law or agreed to in writing, software
            for (DBDAttributeConstraint co : orderConstraints) {
                }
                            co.setEntityAlias(table.getName());
            CCJSqlParser parser = new CCJSqlParser(sqlWithoutComments)
        try {
        Expression orderExpr;
            return dialect.getQuotedIdentifier(merged, true, true);
            }
        return null;
        }
            DBCAttributeMetaData metaAttribute = binding.getMetaAttribute();
        if (ca instanceof DBDAttributeBinding binding) {
import net.sf.jsqlparser.parser.CCJSqlParser;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        if (orderByElements == null) {
import net.sf.jsqlparser.schema.Column;
        }
    public static Expression parseCondExpression(String expression, boolean allowPartialParse) throws DBCException {
        }
        if (table != null && attribute instanceof DBCAttributeMetaData attributeMetaData) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            //log.debug(e);
        return parseExpression(expression, true);
    }

     * Returns a simple table name in the form of schema.table with proper quoting rules.
            final String merged = DBUtils.getUnQuotedIdentifier(schema, "\"")
        }
        @Nullable DBRProgressMonitor monitor,

     * @param select  SQL SELECT statement
        }
            for (DBDAttributeConstraint co : filter.getConstraints()) {
                    if (table != null) {
                        addOrderByClause(monitor, dataSource, plainSelect, dataFilter);
import net.sf.jsqlparser.parser.ParseException;
                return table;
            // No such attribute in entity. Do not use table prefix (#6927)
    public static void shutdownExecutor() {
            orderByElements = new ArrayList<>();
            orderExpr = new LongValue(orderColumnIndex);
            orderExpr = new Column(orderTable, attrName);
 * DBeaver - Universal Database Manager
    public static boolean isForceFilterSubQuery(DBPDataSource dataSource) {
    private static <T> T callWithTimeout(@NotNull CCJSqlParser parser, @NotNull Callable<T> task) throws DBCException {
            return table;
        try {
            FromItem fromItem = plainSelect.getFromItem();
        } else {

 * you may not use this file except in compliance with the License.
        if (!CommonUtils.isEmpty(orderConstraints)) {
        if (sourceWhere == null) {
/*
        return table;
    @Deprecated
        return orderExpr;

            Statement statement = parseQuery(dataSource.getSQLDialect(), sqlQuery);
        }
                    table = findTableInFrom(dataSource, join.getRightItem(), constrTable);
        SQLUtils.appendConditionString(filter, dataSource, null, whereString, true);
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                        parser.withSquareBracketQuotation(true);
                Expression orderExpr = getOrderConstraintExpression(monitor, dataSource, select, filter, co, forceNumeric);
        } else {
        @NotNull PlainSelect select,
        if (schemaQuoted && nameQuoted) {
     * @return string representation of the table name
import net.sf.jsqlparser.expression.operators.relational.ParenthesedExpressionList;
            for (Join join : CommonUtils.safeCollection(plainSelect.getJoins())) {
        @NotNull PlainSelect select,
    }
        }
}

import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
        @NotNull String sqlQuery,
import net.sf.jsqlparser.schema.Table;
import org.jkiss.dbeaver.model.struct.DBSEntity;


    }
                    if (table != null) {


                Thread.currentThread().interrupt();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                }
import org.jkiss.dbeaver.DBException;
                }
        }
            return future.get(PARSE_FUTURE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                    }
            dataFilter
     * Examples of transformations:
        Future<T> future = executor.submit(task);
        if (filter.hasConditions()) {
            if (fromItem instanceof Table table && equalTables(table, tableName)) {
 *

        @NotNull DBDDataFilter filter
import net.sf.jsqlparser.statement.Statement;
            if (!isValidTableColumn(monitor, dataSource, orderTable, co)) {

                for (Join join : select.getJoins()) {
            select.setWhere(conditionExpr);
import net.sf.jsqlparser.expression.LongValue;
     *   <li>{@code a.b    -> a.b}</li>
import org.jkiss.dbeaver.model.sql.SQLQueryGenerator;
     * <ul>
        Expression sourceWhere = select.getWhere();
        }
    public static boolean equalTables(Table t1, String name) {
                select.getFromItem().getClass().getSimpleName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
    }
        );
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
        }
            return DBUtils.isDynamicAttribute(attribute);
                    return table;

            throw new DBException("Cannot determine table name: FROM is " +
            return CommonUtils.equalObjects(t1.getAlias().getName(), name);
                    entityAttribute = entity.getAttribute(monitor, co.getAttributeName());
        Table table = findTableInFrom(dataSource, fromItem, constrTable);
        if (fromItem instanceof Table table &&
    @NotNull
            monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static void addWhereCondition(
 * You may obtain a copy of the License at

            return entityAttribute != null;
        String attrName = DBUtils.getQuotedIdentifier(dataSource, co.getAttributeName());
    @Nullable
import java.util.List;
    private static final boolean ALLOW_COMPLEX_PARSING = false;

    public static Expression parseCondExpression(String expression) throws DBCException {
                    addWhereCondition(dataSource, plainSelect, dataFilter);
            parser.interrupted = true;
                    }
        return dataSource.getSQLDialect().supportsSubqueries() && dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.SQL_FILTER_FORCE_SUBSELECT);
        @NotNull DBRProgressMonitor monitor,
            }
                String columnName = co.getAttributeName();
        @NotNull DBDDataFilter dataFilter
                new ParenthesedExpressionList<>(conditionExpr)

import org.jkiss.dbeaver.model.data.DBDDataFilter;
        final String sqlWithoutComments = dialect == null ? sql : SQLUtils.stripComments(dialect, sql);
import org.jkiss.dbeaver.model.sql.SQLDialect;
    }
            throw new DBCException("Error parsing conditional SQL expression", e);
                    element.setAsc(false);
                throw new DBException("Can't generate column order: no position found");
        }
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.utils.CommonUtils;
     *
        if (t1 == null || name == null) {
    @Nullable
        return null;
            int orderColumnIndex = SQLUtils.getConstraintOrderIndex(filter, co);
    public static String injectFiltersToQuery(
            DBSEntityAttribute entityAttribute = null;
            throw new DBException("Error parsing SQL query", e);
    private static boolean isDynamicAttribute(@Nullable DBSAttributeBase attribute) {
