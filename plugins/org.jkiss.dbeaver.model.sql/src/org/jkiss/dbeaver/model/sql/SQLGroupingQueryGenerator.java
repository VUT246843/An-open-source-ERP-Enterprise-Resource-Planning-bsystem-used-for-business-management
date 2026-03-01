

            if (numberOfSameColumnNames > 0) {
    @NotNull
                    Expression expression = SQLSemanticProcessor.parseExpression(func);
                    // so don't forget it while replacing the table reference
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
                if (select.getFromItem() instanceof Table table) {
        }
            statement = SQLSemanticProcessor.parseQuery(dataSource.getSQLDialect(), queryText);
                    selectItems.add(sei);
            sql.append(queryText);
                if (useAliasForColumns) {
        if (showDuplicatesOnly) {
                    selectItems.add(new SelectItem<>(groupAttribute.prepareExpression()));
                    sql.append(" as ").append(funcAliases[i]);
        for (int i = 0; i < groupFunctions.size(); i++) {

                for (int i = 0; i < groupFunctions.size(); i++) {
            if (container != null) {

import org.jkiss.dbeaver.model.DBPDataSource;
            sql.append(" > 1");
        if (!alias.isEmpty()) {
        StringBuilder alias = new StringBuilder();
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        @Override
                sql.append(queryText);
            if (statement != null) {
 * You may obtain a copy of the License at
        }
        funcAliases = new String[groupFunctions.size()];
                select.setOrderByElements(null);
                }

        return "i_" + funcIndex;
                List<SelectItem<?>> selectItems = new ArrayList<>();
        }
                }
    }
                return funcAliases.length > i
                queryText = statement.toString();
 * See the License for the specific language governing permissions and
                    select.setFromItem(formattedTable);
                }
        }
    private static final Log log = Log.getLog(SQLGroupingQueryGenerator.class);
                }
        this.syntaxManager = syntaxManager;
            } else {
    private final List<SQLGroupingAttribute> groupAttributes;

import org.jkiss.dbeaver.DBException;
            sql.append(" FROM (\n");
public class SQLGroupingQueryGenerator {
            sql.append("SELECT ");
        String function = groupFunctions.get(funcIndex);
    private final boolean showDuplicatesOnly;
                ? getDatabase().getDatabaseName() + sqlDialect.getCatalogSeparator()
            if (useAliasForColumns) {
    // TODO: Remove this class when https://github.com/dbeaver/pro/issues/3140 will be resolved
        boolean showDuplicatesOnly
    }
        return -1;
                    String func = groupFunctions.get(i);
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.dialect = dialect;
        String subqueryAlias;
            }
            }
            }
        this.groupFunctions = groupFunctions;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.PlainSelect;
        for (int i = 0; i < groupAttributes.size(); i++) {
/*
    public SQLGroupingQueryGenerator(
                select.setSelectItems(selectItems);
        public FormattedTable(Table table, SQLDialect sqlDialect) {

                alias.append(delimeter);
        }
                    // implicitly parsed where-conditions might have use table alias if presented,
                }
                for (SQLGroupingAttribute groupAttribute : groupAttributes) {
    public String generateGroupingQuery(String queryText) throws DBException {
import net.sf.jsqlparser.schema.Table;
        if (queryText == null || queryText.isEmpty()) {
import org.jkiss.code.NotNull;
            }
        StringBuilder sql = new StringBuilder();
            sql.append("\nHAVING ");
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
                throw new DBException("Empty data container");
                .filter(a -> a.startsWith(alias.toString().toLowerCase(Locale.ENGLISH)))
                    formattedTable.setAlias(table.getAlias());
import java.util.*;
    public static final String FUNCTION_COUNT = "COUNT";
                    SelectItem<?> sei = new SelectItem<>(expression);
        }
            super(table.getDatabase(), table.getSchemaName(), table.getName());
            }
        boolean isCTE = statement instanceof Select select && select.getWithItemsList() != null && !select.getWithItemsList().isEmpty();
    @NotNull
    @NotNull
        return funcAliases;
        @NotNull List<String> groupFunctions,
                if (i > 0) {
            }

    }
            if (dataSource.getSQLDialect().supportsAliasInHaving() && foundCountIndex >= 0) {
        @NotNull
                    ? i
                    if (useAliasForColumns) {
                funcAliases[i] = groupFunctions.get(i);
            int foundCountIndex = countFunctionIndex();
import net.sf.jsqlparser.expression.Alias;
            sql.append(groupAttributes.get(i).prepareSqlString(subqueryAlias));
    private String[] funcAliases = new String[0];
            if (statement instanceof PlainSelect select) {
 *
import net.sf.jsqlparser.expression.Expression;
                    FormattedTable formattedTable = new FormattedTable(table, sqlDialect);
        for (String delimiter : syntaxManager.getStatementDelimiters()) {

    private final SQLSyntaxManager syntaxManager;
            log.debug("SQL parse error", e);
        }
                queryText = queryText.substring(0, queryText.length() - delimiter.length());
     * It is necessary because `net.sf.jsqlparser.schema.Table` only supports a dot as a separator.
        }
        this.groupAttributes = groupAttributes;
}
            } else if (c == '(' || c == ')') {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
            }

        this.dataSource = dataSource;
        this.showDuplicatesOnly = showDuplicatesOnly;
        for (int i = 0; i < function.length(); i++) {

                    sql.append(", ");
import net.sf.jsqlparser.statement.select.Select;
    private int countFunctionIndex() {
            }
        } else {
    private final DBPDataSource dataSource;
 *

        try {
import org.jkiss.dbeaver.model.struct.DBSEntity;
                queryText = container.getName();
            }
            }

    private final List<String> groupFunctions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            subqueryAlias = null;
            for (int i = 0; i < groupFunctions.size(); i++) {
        @NotNull List<SQLGroupingAttribute> groupAttributes,
            }
package org.jkiss.dbeaver.model.sql;
                : "";

                String func = groupFunctions.get(i);
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
    /**
                // very special case
                alias.append(delimeter).append(numberOfSameColumnNames);
        while (!alias.isEmpty() && alias.charAt(alias.length() - 1) == delimeter) {
    ) {
        } catch (Throwable e) {
            String databaseName = !CommonUtils.isEmpty(getDatabase().getDatabaseName())
        }
    @NotNull
            if (Character.isLetterOrDigit(c) || c == delimeter) {
 */
 * DBeaver - Universal Database Manager

        private final SQLDialect sqlDialect;
        boolean useAliasForColumns = dataSource.getSQLDialect().supportsAliasInSelect();
            alias.deleteCharAt(alias.length() - 1);
        for (int i = 0; i < groupFunctions.size(); i++) {
            String schemaName = getSchemaName() != null ? getSchemaName() + sqlDialect.getStructSeparator() : "";
        char delimeter = '_';
            return databaseName + schemaName + getName();
                SQLDialect sqlDialect = dataSource.getSQLDialect();
        if (!(container instanceof DBSEntity) && dialect.supportsSubqueries() && !isCTE) {
            } else {
    }
        this.container = container;
            long numberOfSameColumnNames = Arrays.stream(funcAliases)
    @NotNull
                        sei.setAlias(new Alias(funcAliases[i]));
 * limitations under the License.
    }
                .count();
            }
            for (int i = 0; i < groupAttributes.size(); i++) {
                    : -1;
        }
            if (i > 0) {
import net.sf.jsqlparser.statement.select.SelectItem;
                alias.append(c);
                funcAliases[i] = makeGroupFunctionAlias(groupFunctions, i);
        @NotNull DBSDataContainer container,
     * Represents a formatted table in an SQL query.
     */

 * you may not use this file except in compliance with the License.
                sql.append(", ");
            return alias.toString().toLowerCase(Locale.ENGLISH);
    public String[] getFuncAliases() {
    private String makeGroupFunctionAlias(List<String> groupFunctions, int funcIndex) {
    public static final String DEFAULT_FUNCTION = FUNCTION_COUNT + "(*)";
    private final DBSDataContainer container;
                .filter(Objects::nonNull)

                sql.append(", ").append(func);
    private static class FormattedTable extends Table {
        public String getFullyQualifiedName() {
                sql.append(funcAliases[foundCountIndex]);


        }
        @NotNull SQLSyntaxManager syntaxManager,
            while (queryText.endsWith(delimiter)) {

        @NotNull DBPDataSource dataSource,
            } else {
    private final SQLDialect dialect;
        Statement statement = null;
        }
    }
                sql.append(DEFAULT_FUNCTION);
            this.sqlDialect = sqlDialect;
            sql.append("\n) ").append(subqueryAlias);
        return sql.toString();

        sql.append("\nGROUP BY ");
    @NotNull
            if (groupFunctions.get(i).equalsIgnoreCase(DEFAULT_FUNCTION)) {
    @NotNull
            subqueryAlias = "src";
     * This class is used to format the table name according to the specified SQL dialect.
    @NotNull
                sql.append(groupAttributes.get(i).prepareSqlString(subqueryAlias));
        @NotNull SQLDialect dialect,
            char c = function.charAt(i);
