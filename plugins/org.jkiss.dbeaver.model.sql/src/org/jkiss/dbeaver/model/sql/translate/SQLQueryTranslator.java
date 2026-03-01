}
 * The type Sql query translator.
                    }
                if (extendedDialect != null) {
import org.jkiss.dbeaver.model.sql.*;
                            defChanged = true;
    private boolean translateColumnDataType(ColumnDefinition cd, SQLDialectDDLExtension extendedDialect, SQLDialect targetDialect) {
                    if (extendedDialect != null && expr.getOperation().equals(AlterOperation.ALTER)) {
        SQLQueryTranslator defaultSQLQueryTranslator = new SQLQueryTranslator(context);
     * @param targetDialect   the target dialect
            if (extendedDialect != null &&
                !extendedDialect.supportsNoActionIndex() &&
 * limitations under the License.

        return Collections.singletonList(query);
            sql.append(element.getText());
        String scriptDelimiter = targetDialect.getScriptDelimiters()[0];
                    newDataType = extendedDialect.getUuidDataType();
            CreateTable createTable = (CreateTable) statement;
            }
        List<SQLScriptElement> sqlScriptElements = SQLScriptParser.parseScript(null, sourceDialect, preferenceStore, script);
                    }
                                //no action
                    if (columnDataTypeList == null) {
     * Translates script to target dialect.
import org.jkiss.code.NotNull;
        };
    }
            case "UUID" -> {
        List<SQLScriptElement> result = new ArrayList<>();
            }
                    }
                        }
                        expr.setOperation(AlterOperation.valueOf(extendedDialect.getAlterColumnOperation().toUpperCase()));
                }
    /**
    }
     *
            case "BLOB" -> newDataType = (extendedDialect != null) ? extendedDialect.getBlobDataType() : "blob";
     *

                                    int indexOf = cd.getColumnSpecs().indexOf(columnSpec);
        if (targetDialect instanceof SQLDialectDDLExtension) {

    /**
            cd.getColDataType().setDataType(newDataType);
                        defChanged |= translateColumnDataType(columnDataType, extendedDialect, targetDialect);
            return translateQuery((SQLQuery) element);
    /**
        }
            case "TEXT" -> newDataType = (extendedDialect != null) ? extendedDialect.getTextDataType() : "text";
            : "";
                    }
import net.sf.jsqlparser.statement.create.table.ForeignKeyIndex;
        return extraQueries;
                }
            }
        Statement statement = query.getStatement();
    @NotNull

            query.setText(newQueryText);
/**
     * @param preferenceStore the preference store
     * @param element the element
import java.util.Locale;
    ) {

                                } else if (extendedDialect != null) {
            case SQLConstants.DATA_TYPE_BIGINT -> {
        var colDataType = cd.getColDataType() != null
                        ForeignKeyIndex fkIndex = (ForeignKeyIndex) index;
        return sql.toString();
public class SQLQueryTranslator implements SQLTranslator {
        return prefStore;
                            fkIndex.removeReferentialAction(ReferentialAction.Type.DELETE);

                defChanged = true;
                        ReferentialAction ra = fkIndex.getReferentialAction(ReferentialAction.Type.DELETE);
 *
    private SQLTranslateContext sqlTranslateContext;
    @NotNull

     * Translates statement to target dialect.
            case "NCLOB" -> newDataType = (extendedDialect != null) ? extendedDialect.getNClobDataType() : "varchar";
    }
                                        "ALTER SEQUENCE " + sequenceName + " OWNED BY " + createTable.getTable()
                }
        boolean defChanged = false;
     */
                                    if (extraQueries == null) {
            for (ColumnDefinition cd : columnDefinitions) {
    @NotNull
                if (extendedDialect != null) {
                                    extraQueries.add(new SQLQuery(null, createSeqQuery));
            return Collections.singletonList(query);
    public SQLTranslateContext getSqlTranslateContext() {
     * @param statement the statement
        @NotNull SQLDialect targetDialect,
                        if (ra != null && ReferentialAction.Action.NO_ACTION.equals(ra.getAction())) {
import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
        if (statement != null) {
        List<SQLScriptElement> postExtraQueries = new ArrayList<>();
            case "SET" -> {
 *

        @NotNull DBPPreferenceStore preferenceStore,
import java.io.IOException;
                            default:
            if (extendedDialect != null && extendedDialect.supportsCreateIfExists()) {
     *
            default -> {
            }
                if (extendedDialect != null) {
import java.util.Collections;
 * You may obtain a copy of the License at
                }
            extraQueries.addAll(postExtraQueries);
                                    cd.getColumnSpecs().add("NEXTVAL('" + sequenceName + "')");
        @NotNull Statement statement
     * @param script          the script
    /**
        SQLDialect targetDialect = sqlTranslateContext.getTargetDialect();
            ) {
                    newDataType = "";
        SQLDialectDDLExtension extendedDialect = null;
            }
    /**
            String newQueryText = SQLFormatUtils.formatSQL(null,
     * @param sqlTranslateContext the sql translate context
            }

import java.util.ArrayList;
            public void save() throws IOException {

                        }
                        continue;
                }
 */

    ) throws DBException {
        this.sqlTranslateContext = sqlTranslateContext;
        if (newDataType != null) {
     */
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;

 * See the License for the specific language governing permissions and

                for (AlterExpression expr : alter.getAlterExpressions()) {
        }
import org.jkiss.dbeaver.DBException;
     *
    }
     * Sets sql translate context.
    @NotNull
                    sqlTranslateContext.getSyntaxManager(),
            case "NVARCHAR" -> {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2026 DBeaver Corp and others
                                    cd.getColumnSpecs().add("DEFAULT");


            case "BOOLEAN" -> {


     */
import java.util.List;
import net.sf.jsqlparser.statement.alter.Alter;
    }
                for (var index : createTable.getIndexes()) {
                if (extendedDialect != null) {

     * @return the list
import org.jkiss.utils.CommonUtils;
        }
            }
        String newDataType = null;
        } else if (statement instanceof Alter alter) {
        return sqlTranslateContext;
                    }
            case "TIMESTAMP" -> {

        return false;
        DBPPreferenceStore prefStore = new SimplePreferenceStore() {
 *


            if (extraQueries == null) {
     * @return the list
import net.sf.jsqlparser.statement.create.table.CreateTable;
                extraQueries = new ArrayList<>();
    private List<? extends SQLScriptElement> translateQuery(@NotNull SQLQuery query) {
            //no action
                                    cd.getColumnSpecs().set(indexOf, extendedDialect.getAutoIncrementKeyword());
                                    defChanged = true;
import net.sf.jsqlparser.statement.alter.AlterOperation;
                                        extraQueries = new ArrayList<>();
            }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            return translateStatement(query, statement);
        }
import net.sf.jsqlparser.statement.Statement;
    public List<? extends SQLScriptElement> translate(@NotNull SQLScriptElement element) throws DBException {
    @NotNull
        if (statement instanceof CreateTable) {
                    newDataType = extendedDialect.getTimestampDataType();
                            case "AUTO_INCREMENT":
                    if (index instanceof ForeignKeyIndex) {

        for (SQLScriptElement element : sqlScriptElements) {
                    newDataType = extendedDialect.getBigIntegerType();
        this.sqlTranslateContext = sqlTranslateContext;
            extraQueries.add(query);
                        switch (columnSpec.toUpperCase(Locale.ENGLISH)) {
        SQLTranslateContext context = new SQLTranslateContext(sourceDialect, targetDialect, preferenceStore);
import net.sf.jsqlparser.statement.ReferentialAction;
                    for (ColumnDefinition columnDataType : columnDataTypeList) {

                                    postExtraQueries.add(new SQLQuery(null, linkSeqWithTable));
                                    String createSeqQuery = "CREATE SEQUENCE " + sequenceName;
     * @param sourceDialect   the source dialect
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLQueryTranslator(@NotNull SQLTranslateContext sqlTranslateContext) {
     *

    protected List<? extends SQLScriptElement> translateStatement(
/*
 * Unless required by applicable law or agreed to in writing, software
     * @param sqlTranslateContext the sql translate context
                                    String schemaName = createTable.getTable().getSchemaName();
     * Instantiates sql query translator.
            result.addAll(defaultSQLQueryTranslator.translate(element));

     * Translates sql script element.
        for (SQLScriptElement element : result) {
        }

                    newDataType = extendedDialect.getBooleanDataType();
     * @return the sql translate context
                                            .getFullyQualifiedName() + "." + cd.getColumnName();
    /**
                if (extendedDialect != null) {
        }
            }
                createTable.setIfNotExists(false);
            if (alter.getAlterExpressions() != null) {
                    newDataType = extendedDialect.getNVarCharDataType() + (parenthesisIndex > 0 ? ' ' + colDataType.substring(parenthesisIndex) : "");
        @NotNull SQLDialect sourceDialect,
     * @param query     the query
 *     http://www.apache.org/licenses/LICENSE-2.0
            ? cd.getColDataType().getDataType().toUpperCase(Locale.ENGLISH)
            sql.append(scriptDelimiter).append("\n");
            }
        }
     */
        if (extraQueries == null) {
        if (defChanged) {
                                }

                        defChanged = true;

     *
package org.jkiss.dbeaver.model.sql.translate;
     */
            var columnDefinitions = createTable.getColumnDefinitions();

                                    cd.getColumnSpecs().remove(columnSpec);
    public static DBPPreferenceStore getDefaultPreferenceStore() {
                }
                    for (String columnSpec : new ArrayList<>(cd.getColumnSpecs())) {
    @NotNull
            extendedDialect = (SQLDialectDDLExtension) targetDialect;
 */
            }
                                    String sequenceName = schemaName == null ? sequenceWithoutSchemaName :
        }
                                break;
        prefStore.setValue(SQLModelPreferences.SQL_FORMAT_FORMATTER, "default");
            return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
        String baseDataType = colDataType.substring(0, parenthesisIndex > 0 ? parenthesisIndex : colDataType.length()).trim();
     * @throws DBException the db exception
                                if (!targetDialect.supportsColumnAutoIncrement()) {
                    statement.toString());
                !CommonUtils.isEmpty(createTable.getIndexes())
                defChanged |= translateColumnDataType(cd, extendedDialect, targetDialect);
    public static String translateScript(
    }

                        expr.hasColumn(extendedDialect.supportsAlterHasColumn());
     * @throws DBException the db exception
            @Override
            case "CLOB" -> newDataType = (extendedDialect != null) ? extendedDialect.getClobDataType() : "varchar";
        int parenthesisIndex = colDataType.indexOf('(');
    @NotNull
    }
     * Gets sql translate context.

                    var columnDataTypeList = expr.getColDataTypeList();
 * Licensed under the Apache License, Version 2.0 (the "License");
        return Collections.singletonList(element);

        }
    }
                }
                                    defChanged = true;
                }
        StringBuilder sql = new StringBuilder();
                            case "IDENTITY":
                }
            }
        if (element instanceof SQLQuery) {
    }
        switch (baseDataType) {
                                    String linkSeqWithTable =

                                        "_" + CommonUtils.escapeIdentifier(cd.getColumnName());

        @NotNull SQLQuery query,
        }
 * you may not use this file except in compliance with the License.
        @NotNull String script
     */
                if (!CommonUtils.isEmpty(cd.getColumnSpecs())) {
import net.sf.jsqlparser.statement.alter.AlterExpression;
                                        schemaName + "." + sequenceWithoutSchemaName;
            }
        List<SQLScriptElement> extraQueries = null;
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
                                break;
     * @return the string
    public void setSqlTranslateContext(@NotNull SQLTranslateContext sqlTranslateContext) {
                if (extendedDialect != null && !extendedDialect.supportsAlterColumnSet()) {
                                    }
                                    String sequenceWithoutSchemaName = CommonUtils.escapeIdentifier(createTable.getTable().getName()) +
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
