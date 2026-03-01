            return;
    /**
        }
                    List<Table> tables = delete.getTables();
        parseQuery();
                Table table = update.getTable();
    public String getExtraErrorMessage() {
            } else if (statement instanceof Delete delete) {
            if (statement instanceof PlainSelect plainSelect) {

                if (CommonUtils.isNotEmpty(name)) {
    }
                plainSelect.getForMode() == null;
 * Unless required by applicable law or agreed to in writing, software
    }
                        .filter(this::isValidSelectItem)
        this.length = length;
        parseQuery();

            }
    }

    private static class SingleTableMeta implements DBCEntityMetaData {
        return resultsOffset;
    }
        return queryTitle;
    public List<SQLQueryParameter> getParameters() {
                    }
        for (Join join : joins) {
 * SQLQuery
            unquoteIdentifier(tableMeta.getEntityName()));

 * You may obtain a copy of the License at
                }
import net.sf.jsqlparser.statement.select.*;
    public SQLQuery(@Nullable DBPDataSource dataSource, @NotNull String text, @NotNull SQLQuery sourceQuery) {
    }
    }
            unquoteIdentifier(tableMeta.getSchemaName()),
        queryTitle = null;
        }

import java.util.stream.Collectors;
     *

        @Override

    }
    public boolean equals(Object obj) {
                this.parseError = new DBException("Empty query");
    @NotNull
 *
                    return i;
        if (name == null) {
            return catalogName;
                }
            return true;
    @Override
    public DBPDataSource getDataSource() {
        }
     */
        @NotNull
                        .map(item -> new SQLSelectItem(this, item))
        if (statement instanceof Delete delete) {
    public void setResultSetLimit(int rowOffset, int maxRows) {
    }
    private Boolean isEndsWithDelimiter = null;
     * Copy constructor.
        return data;
        this.resultsMaxRows = maxRows;
                } else {
            return delete.getWhere() == null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private SQLQueryType type;
    @NotNull
    public boolean isDropDangerous() {
                        .collect(Collectors.toList());
import java.util.Collections;
                return item;
    }
import net.sf.jsqlparser.statement.create.view.CreateView;
    @NotNull
                statement instanceof CreateIndex) {
    @Nullable
        public List<? extends DBCAttributeMetaData> getAttributes() {
                (schemaName == null ? 2 : schemaName.hashCode()) *
            dropStatement.getName() != null
    }
     *
        public String toString() {
    private List<SQLQueryParameter> parameters;
import net.sf.jsqlparser.statement.merge.Merge;
                }
                                hasSubSelects = true;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    public Throwable getParseError() {


            return false;
    }
        this(dataSource, text, 0, text.length());
            } else if (statement instanceof Commit) {
        return statement;
        public String getEntityName() {
        @Override
        return type;
    }
        private final String tableName;
 *
        final Matcher matcher = QUERY_TITLE_PATTERN.matcher(text);
    }
        }
                this.statement = null;
        this.parameters = parameters;
                        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return text;
        return extraErrorMessage;
            DBUtils.getUnQuotedIdentifier(dataSource, name);
        }
        return text;
            return plainSelect.getForMode() != null || plainSelect.getIntoTables() != null;
                statement instanceof Drop ||
                    final List<SQLSelectItem> items = CommonUtils.safeList(plainSelect.getSelectItems()).stream()

            } else if (statement instanceof Merge) {
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
        }
        }
    private void fillSingleSource(Table fromItem) {
                            fillSingleSource(fromTable);
    }
    }


                type = SQLQueryType.UPDATE;
    }
        return resultsMaxRows;
    private int resultsOffset = -1;
import java.util.ArrayList;
                }
        return offset;
        if (statement instanceof PlainSelect plainSelect) {
                    }
        public String getCatalogName() {
     * Overrides results offset/limit for this particular query
import org.jkiss.dbeaver.model.DBPDataSource;
        this.text = this.originalText;
        if (CommonUtils.isEmpty(this.extraErrorMessage)) {

        String schemaName = fromItem.getSchemaName();
import net.sf.jsqlparser.statement.create.view.AlterView;
    private void parseQuery() {
                        }
        @Override
    public int getSelectItemAsteriskIndex() {
        this.resultsOffset = rowOffset;
    public int getSelectItemCount() {
                        }


            FromItem rightItem = join.getRightItem();
                    if (fromItem instanceof Table fromTable && isPotentiallySingleSourceSelect(plainSelect)) {
    }
        return selectItems == null || selectItems.size() <= index ? null : selectItems.get(index);
     */
        for (SQLSelectItem item : selectItems) {
        return List.of(this);
import org.jkiss.dbeaver.model.DBUtils;
import net.sf.jsqlparser.statement.create.schema.CreateSchema;
    }

                            }
import net.sf.jsqlparser.schema.Column;

     */
    public void setText(@NotNull String text) {
            return null;
    public Boolean isEndsWithDelimiter() {
    public void setData(Object data) {
        }
        this.text = text;
        try {
        String tableName = fromItem.getName();

    }
            this.type = SQLQueryType.UNKNOWN;

        }
            return (catalogName == null ? 1 : catalogName.hashCode()) *
        rawSingleTableMetadata = createOriginalSourceTableMetaData(fromItem);
        return createUnquotedTableMetaData(createOriginalSourceTableMetaData(fromItem));
            if (item.getName().equals(name)) {
        this.parameters = sourceQuery.parameters;
import net.sf.jsqlparser.statement.create.procedure.CreateProcedure;
        }
    public boolean isMutatingStatement() {
        if (preserveOriginal) {
    @Nullable
            } else if (statement instanceof Update update) {
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
    }
            statement instanceof Drop dropStatement &&
                    for (String comment : dataSource.getSQLDialect().getSingleLineComments()) {
    }
                    fillSingleSource(delete.getTable());
                statement instanceof CreateView ||
        @NotNull
        return CommonUtils.isEmpty(plainSelect.getJoins()) &&
            this.originalText = sourceQuery.originalText;
        public int hashCode() {
                tableName.hashCode();
        @Override
        if (matcher.find()) {
    }
            } else if (statement instanceof RollbackStatement) {
                }
import net.sf.jsqlparser.schema.Table;

                type = SQLQueryType.UNKNOWN;
                if (CommonUtils.isNotEmpty(name)) {


            } else if (statement instanceof Alter ||
        return allSelectEntitiesNames;
                                hasDirectSelects = true;
    public void setOffset(int offset) {
        } else if (statement instanceof Update update) {
    }

                type = SQLQueryType.DELETE;
import net.sf.jsqlparser.statement.delete.Delete;
    public int getOffset() {
    public void addExtraErrorMessage(String extraErrorMessage) {
package org.jkiss.dbeaver.model.sql;
        this.offset = offset;
    private String unquoteIdentifier(String name) {

                    allSelectEntitiesNames.add(name);

    }
                plainSelect.getLimit() == null &&
            return Collections.emptyList();
import net.sf.jsqlparser.schema.Database;
    @Nullable
            statement = SQLSemanticProcessor.parseQuery(dataSource == null ? null : dataSource.getSQLDialect(), text);
                {
            for (int i = 0; i < selectItems.size(); i++) {
            this.extraErrorMessage = this.extraErrorMessage + System.lineSeparator() + extraErrorMessage;

     * Contains only entities names without schema/catalog identifiers.
                    }
        if (getType() == SQLQueryType.UNKNOWN) {
        @Override
        this.length = length;
                String name = ((Table) rightItem).getName();
            if (expr instanceof Column) {
    }
    }
import net.sf.jsqlparser.statement.create.table.CreateTable;

    public Statement getStatement() {
        parseQuery();
            } else if (statement instanceof Insert insert) {
        this.data = data;
import net.sf.jsqlparser.statement.update.Update;
            allSelectEntitiesNames.add(fromItemName);
        return false;
            return false;
    private int resultsMaxRows = -1;
    }
     * @return true is this query is a plain select
 * DBeaver - Universal Database Manager
        return new SingleTableMeta(
/**
            return CommonUtils.equalObjects(catalogName, md2.catalogName) &&
    }
    @Override

            statement instanceof CreateView || statement instanceof CreateFunction || statement instanceof CreateProcedure ||
    public SQLSelectItem getSelectItem(int index) {
import net.sf.jsqlparser.statement.create.function.CreateFunction;
 */
        @Nullable
        public String getSchemaName() {
        this.type = SQLQueryType.UNKNOWN;
import net.sf.jsqlparser.statement.create.sequence.CreateSequence;
        }

import org.jkiss.code.Nullable;
        private final String schemaName;
        return true;
    private String queryTitle;
    public String getOriginalText() {


        return raw ? rawSingleTableMetadata : singleTableMeta;

        private SingleTableMeta(String catalogName, String schemaName, @NotNull String tableName) {
        }
    private SingleTableMeta createOriginalSourceTableMetaData(Table fromItem) {

    public void setLength(int length) {
    /**
                CommonUtils.equalObjects(tableName, md2.tableName);
    }
    /**
        return statement != null &&
                final String name = CommonUtils.trim(((Column) expr).getColumnName());
                        for (SelectItem<?> si : plainSelect.getSelectItems()) {
 * you may not use this file except in compliance with the License.

            statement instanceof Alter || statement instanceof AlterView || statement instanceof AlterSequence);
    }
                type = SQLQueryType.INSERT;
    /**

public class SQLQuery implements SQLScriptElement {
            }
            return schemaName;
     * User defined data object. May be used to identify statements.
import org.jkiss.code.NotNull;
        }
                CommonUtils.equalObjects(schemaName, md2.schemaName) &&

        }
    public int getResultsMaxRows() {

                if (item.getName().contains("*")) {
                fillSingleSource(insert.getTable());
    @NotNull
            (plainSelect.getGroupBy() == null || CommonUtils.isEmpty(plainSelect.getGroupBy().getGroupByExpressionList())) &&
                return false;
        if (this.parameters != null) {

        return parameters;
    }
            if (CommonUtils.isEmpty(text)) {
    public SQLQueryType getType() {
            return CommonUtils.isEmpty(plainSelect.getIntoTables()) &&
                        fillSingleSource(tables.get(0));

        return length;

            this.parseError = e;
import net.sf.jsqlparser.statement.create.index.CreateIndex;
    }
    @Override
    public SQLSelectItem getSelectItem(String name) {
                // Detect single source table (no joins, no group by, no sub-selects)
import net.sf.jsqlparser.expression.Expression;
    @Nullable
    public SQLQuery(@Nullable DBPDataSource dataSource, @NotNull String text, int offset, int length) {
            && dropStatement.getType() != null;
    public Object getData() {
                        boolean hasSubSelects = false;
            statement instanceof Insert || statement instanceof CreateTable || statement instanceof CreateIndex ||


        }
            if (!(obj instanceof SingleTableMeta md2)) {
            } else {
    public boolean isModifying() {

        this(dataSource, text, sourceQuery, true);
    private String text;


                }
        return statement != null && (statement instanceof Drop || statement instanceof Delete || statement instanceof Update ||
        }
        return new SingleTableMeta(catalogName, schemaName, tableName);
    public String getQueryTitle() {
        List<Join> joins = plainSelect.getJoins();
 * distributed under the License is distributed on an "AS IS" BASIS,
            queryTitle = matcher.group(1).trim();
    public void setParameters(@Nullable List<SQLQueryParameter> parameters) {
        }
        String fromItemName = fromItem.getName();
    private static final Pattern QUERY_TITLE_PATTERN = Pattern.compile("^\\s*(?:--|//|/\\*)\\s*(?:name|title)\\s*:\\s*(.+)$", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    private SingleTableMeta singleTableMeta, rawSingleTableMetadata;
        } else {


        if (parsed) {
        return null;
            }
    public boolean isPlainSelect() {
                    // Extract select items info
        this.dataSource = dataSource;

                return;
    }
            this.tableName = tableName;
                type = SQLQueryType.SELECT;
        }
        this.data = sourceQuery.data;
        }
        if (dataSource != null) {
        singleTableMeta = createUnquotedTableMetaData(rawSingleTableMetadata);
        return originalText;
    }

        private final String catalogName;
import net.sf.jsqlparser.statement.alter.sequence.AlterSequence;
                    }



        this.originalText = originalText;
        @Override
        return dataSource == null ?
        @Nullable
                            } else if (si.getExpression() instanceof Column) {
        public boolean equals(Object obj) {
    private final DBPDataSource dataSource;
        }
        }
    }
        this.originalText = this.text = text;
    SingleTableMeta createTableMetaData(Table fromItem) {
        @Override
    public List<SQLScriptElement> getScriptElements() {


            return null;
        if (selectItems != null) {
                type = SQLQueryType.MERGE;
        parseQuery();
        this.isEndsWithDelimiter = value;
        parseQuery();
    /**
    }
    }


import net.sf.jsqlparser.statement.create.synonym.CreateSynonym;
                    if (!CommonUtils.isEmpty(plainSelect.getJoins()) && fromItem instanceof Table) {
        }
import net.sf.jsqlparser.statement.Commit;
    public int getLength() {
    @Nullable


                    if (!items.isEmpty()) {
import net.sf.jsqlparser.statement.Statement;
    public List<String> getAllSelectEntitiesNames() {
        return parseError;
            }
                type = SQLQueryType.COMMIT;
        parseQuery();
     * @return data or null
    private Statement statement;
        String catalogName = database == null ? null : database.getDatabaseName();
import net.sf.jsqlparser.statement.RollbackStatement;
            }
    public void setEndsWithDelimiter(boolean value) {
                    if (tables != null && tables.size() == 1) {
                            if (si.getExpression() instanceof ParenthesedSelect) {
    }
            return DBUtils.getSimpleQualifiedName(catalogName, schemaName, tableName);
    private List<SQLSelectItem> selectItems;
        }
        }
        return selectItems == null ? 0 : selectItems.size();


                plainSelect.getTop() == null &&
                        if (name.startsWith(comment)) {

    @NotNull
    private boolean isPotentiallySingleSourceSelect(PlainSelect plainSelect) {
    }
        this(dataSource, text, sourceQuery.offset, sourceQuery.length);
    private Throwable parseError;
        return obj instanceof SQLQuery && text.equals(((SQLQuery) obj).text);
        return this.isEndsWithDelimiter;
    }
                        selectItems = items;
            this.schemaName = schemaName;
        parseQuery();
    @NotNull
        if (selectItems == null) {
    }

        Database database = fromItem.getDatabase();
                    }

                statement instanceof CreateTable ||
            final Expression expr = item.getExpression();
     * Sometime we want to know all source containers names from the query if it is Select statement and it has JOINs.
    public SQLQuery(@Nullable DBPDataSource dataSource, @NotNull String text, @NotNull SQLQuery sourceQuery, boolean preserveOriginal) {
import java.util.regex.Matcher;
import java.util.regex.Pattern;
}
    @NotNull
                        createTargetName(plainSelect, (Table) fromItem);
    private int length;
        } else {
    private String originalText;
    private final List<String> allSelectEntitiesNames = new ArrayList<>();
    }
    }
    }
                type = SQLQueryType.DDL;
    }
 * See the License for the specific language governing permissions and
                type = SQLQueryType.ROLLBACK;
    @NotNull
    }
    private SingleTableMeta createUnquotedTableMetaData(SingleTableMeta tableMeta) {
import net.sf.jsqlparser.statement.insert.Insert;
            CommonUtils.isEmpty(plainSelect.getIntoTables());
    public void setOriginalText(@NotNull String originalText) {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        parsed = true;
    public String toString() {
            }
    }
            return tableName;
            return update.getWhere() == null;
        if (statement == null) {
import java.util.List;
        } catch (Throwable e) {
    public String getText() {
     * Copies query state but sets new query string.
        if (statement instanceof PlainSelect plainSelect) {
    private boolean parsed = false;
     * @param plainSelect plain Select class
            this.catalogName = catalogName;
            //log.debug("Error parsing SQL query [" + query + "]:" + CommonUtils.getRootCause(e).getMessage());

import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
    }
                    fillSingleSource(table);
                if (delete.getTable() != null) {
        // Workaround for JSQLParser not respecting the `#` comment in MySQL and treating them as valid values
                if (table != null) {
    public boolean isDeleteUpdateDangerous() {
    public int getResultsOffset() {
                    FromItem fromItem = plainSelect.getFromItem();


import net.sf.jsqlparser.statement.drop.Drop;
            setParameters(this.parameters);
    private void createTargetName(@NotNull PlainSelect plainSelect, @NotNull Table fromItem) {
        return false;
                SQLSelectItem item = selectItems.get(i);
     * Plain select is a SELECT statement without INTO clause, without LIMIT or TOP modifiers
    }
            if (rightItem instanceof Table) {
        if (CommonUtils.isNotEmpty(fromItemName)) {
    }
     */
        // Extract query title
            unquoteIdentifier(tableMeta.getCatalogName()),
 *
    private boolean isValidSelectItem(@NotNull SelectItem<?> item) {

    public SQLQuery(@Nullable DBPDataSource dataSource, @NotNull String text) {
            statement instanceof CreateSchema || statement instanceof CreateSequence || statement instanceof CreateSynonym ||
                        if (hasDirectSelects || !hasSubSelects) {
                        boolean hasDirectSelects = false;


            }
import net.sf.jsqlparser.statement.alter.Alter;
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
            this.extraErrorMessage = extraErrorMessage;
    private String extraErrorMessage;
    }
     */
    public DBCEntityMetaData getEntityMetadata(boolean raw) {

    private int offset;
    private Object data;
/*
    public void reset() {
        return dataSource;
                            return false;

     *
        }


        this.offset = offset;
    }
            DBUtils.getUnQuotedIdentifier(name, SQLConstants.DEFAULT_IDENTIFIER_QUOTE) :
        return -1;
import org.jkiss.dbeaver.DBException;
     * For the data transfer target file name, as example.
