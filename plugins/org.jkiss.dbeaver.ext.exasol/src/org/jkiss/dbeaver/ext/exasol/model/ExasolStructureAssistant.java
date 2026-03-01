    @Override

                                     @NotNull DBSObjectType objectType, @NotNull ObjectsSearchParams params,
        //don't use parameter marks because of performance
                                if (foreignKey == null)
    }
    private static final DBSObjectType[] SUPP_OBJ_TYPES = {ExasolObjectType.TABLE, ExasolObjectType.VIEW, ExasolObjectType.COLUMN, ExasolObjectType.SCRIPT, ExasolObjectType.FOREIGNKEY, ExasolObjectType.PRIMARYKEY};
    }
                           @NotNull Collection<? super DBSObjectReference> references) throws DBException, SQLException {
            sql.append(clause.get(0));
    public DBSObjectType[] getSupportedObjectTypes() {
                                @Override
        clause.add(getLikeClause(viewNameColumn, mask, params.isCaseSensitive()));
        return objectType == ExasolObjectType.TABLE
                        continue;
                    }
}
                while (!isFetchCompleted(monitor, references, limit) && resultSet.next()) {
                                        @NotNull List<DBSObjectReference> references) throws SQLException, DBException {
        }
import org.jkiss.dbeaver.DBException;
        sql.append("COLUMN_NAME LIKE '").append(mask).append("'");
                        continue;
                    log.debug("Result set is null when looking for Exasol table objects");
//      SELECT
                    final Class<?> classType;
                                    return table;
                    if (tableName == null || columnName == null) {
                        String viewSchemaName = JDBCUtils.safeGetString(resultSet, viewSchemaColumn);
                    String schemaName = JDBCUtils.safeGetString(dbResult, "TABLE_SCHEM");
            sql.append("OR REMARKS LIKE '").append(mask).append("') ");
                            ExasolTable table = tableSchema.getTable(monitor, tableName);

        return "SYS." + dataSource.getTablePrefix(ExasolSysTablePrefix.ALL) + "_" + suffix;
        sql.append("TABLE_NAME LIKE '").append(mask).append("' ");
            }
                                    }
            sql.append(viewSchemaColumn).append(", ");
                            }
        sql.append(schemaMask).append("' AND ");
        this.sqlConstraintsAll = "/*snapshot execution*/ SELECT CONSTRAINT_SCHEMA,CONSTRAINT_TABLE, CONSTRAINT_TYPE, CONSTRAINT_NAME FROM SYS."

    @NotNull
                                ExasolTableUniqueKey primaryKey = table.getConstraint(monitor, constName);
                    String viewName = JDBCUtils.safeGetString(resultSet, viewNameColumn);
                            new AbstractObjectReference<>(scriptName, tableSchema,null, ExasolScript.class, RelationalObjectType.TYPE_PROCEDURE) {
    }
        try (JDBCStatement statement = session.createStatement()) {
import org.jkiss.dbeaver.Log;
        }
    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
            findConstraintsByMask(session, schema, params, references, "FOREIGN KEY");
        String mask = ExasolUtils.quoteString(params.getMask());
        }
                            }
            clause.add(getLikeClause("SCRIPT_TEXT", mask, params.isCaseSensitive()));
    @NotNull
        DBRProgressMonitor monitor = session.getProgressMonitor();
                            } else  {


                    log.debug("Result set is null");
//              OR SCRIPT_COMMENT LIKE ?)
        } else {
        String sql = "";
                        }
        if (schema == null && !params.isGlobalSearch()) {
    }
                                    if (tableSchema == null) {
    }
        }
                                return foreignKey;
                                    throw new DBException("Primary Key '" + constName + "' for Table '" + tableName + "' not found in schema '" + schemaName + "'");
        String mask = ExasolUtils.quoteString(params.getMask());
                    }
        sql.append("AND TABLE_TYPE = 'TABLE'");
            clause.add(getLikeClause("VIEW_COMMENT", mask, params.isCaseSensitive()));
            sql.append("(");
//      FROM
    private final ExasolDataSource dataSource;
                    if (tableName == null) {
//            OR VIEW_TEXT LIKE ?
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                while (!monitor.isCanceled() && references.size() < params.getMaxResults() && dbResult.next()) {
        } else if (objectType == ExasolObjectType.SCRIPT) {
    }
        try (JDBCStatement dbStat = session.createStatement()) {
                        if (viewSchemaName == null) {
    }

                    String columnName = JDBCUtils.safeGetString(dbResult, "COLUMN_NAME");
                                        if (table == null) {
        // Let's say that query execution takes 50% of the time and result set traversal takes another 50%
        DBSObject parentObject = params.getParentObject();

        return SUPP_OBJ_TYPES;
        DBRProgressMonitor monitor = session.getProgressMonitor();
                                }

    protected void findObjectsByMask(@NotNull ExasolExecutionContext executionContext, @NotNull JDBCSession session,
        private ViewReference(@NotNull ExasolSchema container, @NotNull String name) {
                    }
        DBRProgressMonitor monitor = session.getProgressMonitor();
                + " AND CONSTRAINT_NAME like '%s' AND CONSTRAINT_TYPE = '%s'";
        }
                                        throw new DBException("Table schema '" + schemaName + "' not found");
                    String schemaName = JDBCUtils.safeGetString(dbResult, "TABLE_SCHEM");
                                if (primaryKey == null)
        }
    private static final class ViewReference extends AbstractObjectReference<ExasolSchema> {
            }
                            if (classType.equals(ExasolTableForeignKey.class)) {

                    ExasolSchema exasolSchema = dataSource.getSchema(monitor, schemaName);
    }
        sql.append(" SELECT ");
                        viewSchema = dataSource.getSchema(session.getProgressMonitor(), viewSchemaName);
                    return;
    private String getMetadataTableName(@NotNull String suffix) {
    }
                            }
                        classType = ExasolTableUniqueKey.class;
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
            sql.append(String.format(" AND VIEW_SCHEMA = '%s'", ExasolUtils.quoteString(schema.getName())));
            try (JDBCResultSet dbResult = dbStat.executeQuery(sql.toString())) {

                                        table = tableSchema.getViewCache().getObject(monitor, tableSchema, tableName);
                if (resultSet == null) {
                }
        if (params.isSearchInComments()) {
        if (params.isSearchInComments()) {
    public DBSObjectType[] getSearchObjectTypes() {
                }
        String viewSchemaColumn = "VIEW_SCHEMA";
                    final String constName       = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_NAME");
                    if (viewName == null) {
                            new AbstractObjectReference<DBSObject>(columnName, tableSchema, null, ExasolTableColumn.class, RelationalObjectType.TYPE_TABLE_COLUMN) {
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                        }
    // -----------------
        String mask = ExasolUtils.quoteString(params.getMask());
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
    }
    @NotNull
                    );
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
                            ExasolSchema tableSchema = schema != null ? schema : dataSource.getSchema(monitor, schemaName);
                                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        DBRProgressMonitor monitor = session.getProgressMonitor();
                                        throw new DBException("Table schema '" + schemaName + "' not found");
        int halfOfWork = limit - references.size();
                                    ExasolTableBase table = tableSchema.getTable(monitor, tableName);
        if (schema != null) {
            schema = executionContext.getContextDefaults().getDefaultSchema();
                            new AbstractObjectReference<DBSObject>(tableName, exasolSchema, null, ExasolTable.class, RelationalObjectType.TYPE_TABLE) {

import java.sql.SQLException;
                    }
            findTableColumnsByMask(session, schema, params, references);
 * limitations under the License.
            }
        int limit = params.getMaxResults();
public class ExasolStructureAssistant extends JDBCStructureAssistant<ExasolExecutionContext> {
                                    throw new DBException("Foreign Key  '" + constName + "' for Table '" + tableName + "' not found in schema '" + schemaName + "'");
    }
    // -----------------
//              OR SCRIPT_TEXT LIKE ?
        log.debug("Search Mask:" + objectNameMask + " Object Type:" + objectType.getTypeName());
    private void findTableObjectByName(@NotNull JDBCSession session, @Nullable ExasolSchema schema, @NotNull ObjectsSearchParams params,
                    }
    private void findConstraintsByMask(@NotNull JDBCSession session, @Nullable ExasolSchema schema, @NotNull ObjectsSearchParams params,
        }

            return;

                            }
//          AND VIEW_SCHEMA = ?
            clause.add(getLikeClause("VIEW_TEXT", mask, params.isCaseSensitive()));
            ExasolSchema schema = getContainer();
                    if (constType.equals("PRIMARY KEY"))
                                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                    references.add(
                                @Override
    private static final DBSObjectType[] HYPER_LINKS_TYPES = {ExasolObjectType.TABLE, ExasolObjectType.COLUMN, ExasolObjectType.VIEW, ExasolObjectType.SCHEMA, ExasolObjectType.SCRIPT, ExasolObjectType.FOREIGNKEY, ExasolObjectType.PRIMARYKEY};
                }
                                    if (script == null) {
        }

                                    ExasolScript script = tableSchema.scriptCache.getObject(monitor, tableSchema, scriptName);
        List<String> clause = new ArrayList<>(3);
    @Override
        clause.add(getLikeClause("SCRIPT_NAME", mask, params.isCaseSensitive()));
 * DBeaver - Universal Database Manager
                    references.add(
                    return;
//      SELECT
            || objectType == ExasolObjectType.VIEW
        if (clause.size() == 1) {

                    log.debug("Result set is null when looking for Exasol procedures");
                    String tableName  = JDBCUtils.safeGetString(dbResult, "COLUMN_TABLE");
 *

//          VIEW_NAME
    @Override
                                     @NotNull List<DBSObjectReference> references) throws DBException, SQLException {
                                throw new DBException("Table '" + tableName + "' not found in schema  '" + schemaName + "' not found");
            findProceduresByMask(session, schema, params, references);
        @Override

        String viewNameColumn = "VIEW_NAME";
                            }
        }
                while (!monitor.isCanceled() && dbResult.next() && references.size() <= params.getMaxResults()) {
        }
        if (isCaseSensitive) {
                }
 * you may not use this file except in compliance with the License.
                    } else {
    private static final Log log = Log.getLog(ExasolStructureAssistant.class);

        try (JDBCStatement dbStat = session.createStatement()) {
            }
        } else if (objectType == ExasolObjectType.PRIMARYKEY) {
                                return primaryKey;
        StringBuilder sql = new StringBuilder("/*snapshot execution*/ SELECT SCRIPT_SCHEMA, SCRIPT_NAME FROM SYS.");
            || objectType == ExasolObjectType.SCRIPT;
                                    }

    // -----------------
    protected JDBCDataSource getDataSource() {
        //don't use parameter marks because of performance
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {

                                    ExasolTable table = tableSchema.getTableCache().getObject(monitor, tableSchema, tableName);
                                    }
    }
                    log.warn("Result set is null while looking for Exasol table columns");
        sql.append(dataSource.getTablePrefix(ExasolSysTablePrefix.ALL)).append("_SCRIPTS WHERE ");
                        classType = ExasolTableForeignKey.class;
    // -----------------

        }
        }
                    return;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others

                                    if (tableSchema == null)
        if (params.isSearchInDefinitions()) {
                    references.add(new AbstractObjectReference<DBSObject>(constName, dataSource.getSchema(monitor, schemaName), null, classType, RelationalObjectType.TYPE_CONSTRAINT) {
            if (view == null) {
            try (JDBCResultSet resultSet = statement.executeQuery(sql.toString())) {
                    if (scriptName == null) {
                            if (table == null)
                        continue;
    private static boolean isFetchCompleted(@NotNull DBRProgressMonitor monitor, @NotNull Collection<?> objects, int limit) {
        try (JDBCStatement dbStat = session.createStatement()) {
        StringBuilder sql = new StringBuilder("/*snapshot execution*/ SELECT TABLE_SCHEM,TABLE_NAME as column_table,COLUMN_NAME from \"$ODBCJDBC\".ALL_COLUMNS WHERE TABLE_SCHEM like '");
                            {
                    } else if (constType.equals("FOREIGN KEY"))
//      /*snapshot execution*/
        if (params.isSearchInComments()) {
            sql = String.format(sqlConstraintsAll, ExasolUtils.quoteString(params.getMask()), constType);

        }
            DBSObject view = schema.getViewCache().getObject(monitor, schema, viewName);
    @NotNull
        } else if (objectType == ExasolObjectType.COLUMN) {
                    references.add(new ViewReference(viewSchema, viewName));

    @NotNull
    @NotNull
            return view;
        if (isFetchCompleted(monitor, references, limit)) {
        }
        } finally {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
                }
    public DBSObjectType[] getAutoCompleteObjectTypes() {
            try (JDBCResultSet dbResult = dbStat.executeQuery(sql)) {
        } else {
package org.jkiss.dbeaver.ext.exasol.model;
        this.sqlConstraintsSchema = sqlConstraintsAll + " AND CONSTRAINT_SCHEMA = '%s'";
            sql = String.format(sqlConstraintsSchema, ExasolUtils.quoteString(schema.getName()), constType, ExasolUtils.quoteString(params.getMask()));
                        @Override
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
            }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            sql.append(String.format(" AND SCRIPT_SCHEMA = '%s'", ExasolUtils.quoteString(schema.getName())));
 */

    private void findViews(@NotNull JDBCSession session, @Nullable ExasolSchema schema, @NotNull ObjectsSearchParams params,
    public DBSObjectType[] getHyperlinkObjectTypes() {
    private void findTableColumnsByMask(@NotNull JDBCSession session, @Nullable ExasolSchema schema, @NotNull ObjectsSearchParams params,
    // Method Interface
                            continue;
                                    }
                }
                while (!monitor.isCanceled() && dbResult.next() && references.size() < params.getMaxResults()) {
            sql.append("(").append(String.join(" OR ", clause)).append(")");
import org.jkiss.dbeaver.ext.exasol.editors.ExasolObjectType;
//          SYS.EXA_DBA_SCRIPTS
            sql.append(" OR COLUMN_COMMENT LIKE '").append(mask).append("')");
                    );
                                @Override
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        return this.dataSource;
                    }
//      WHERE
        if (clause.size() == 1) {
                    final String schemaName = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_SCHEMA");
                                      @NotNull List<DBSObjectReference> references) throws SQLException, DBException {
        return String.format("UPPER(%s) LIKE '%s'", identifier, mask.toUpperCase(Locale.ROOT));
        StringBuilder sql = new StringBuilder(ExasolUtils.SNAPSHOT_EXEC);
        String mask = ExasolUtils.quoteString(params.getMask());
            sql.append(clause.get(0));
                    final String tableName  = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_TABLE");
import java.util.Locale;
        StringBuilder sql = new StringBuilder("/*snapshot execution*/ SELECT table_schem,table_name as column_table,table_type from \"$ODBCJDBC\".ALL_TABLES WHERE ");
        }
                if (dbResult == null) {
//          VIEW_SCHEMA,
    private static final DBSObjectType[] AUTOC_OBJ_TYPES = {ExasolObjectType.TABLE, ExasolObjectType.VIEW, ExasolObjectType.COLUMN, ExasolObjectType.SCHEMA, ExasolObjectType.SCRIPT};
                    return;
                                       @NotNull List<DBSObjectReference> references, String constType) throws SQLException, DBException {
    @Override
        } else if (objectType == ExasolObjectType.VIEW) {
        ExasolSchema schema = parentObject instanceof ExasolSchema ? (ExasolSchema) parentObject : null;
        if (params.isSearchInDefinitions()) {
//          AND SCRIPT_SCHEMA = ?
            try (JDBCResultSet dbResult = dbStat.executeQuery(sql.toString())) {
                    {
            findConstraintsByMask(session, schema, params, references, "PRIMARY KEY");
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                                        }
    @Override
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String sqlConstraintsSchema;
        //don't use parameter marks because of performance
            try (JDBCResultSet dbResult = dbStat.executeQuery(sql.toString())) {

                if (dbResult == null) {
        if (schema != null) {
                if (dbResult == null) {
        } else {
//      WHERE
                                    ExasolTableColumn tableColumn = table.getAttribute(monitor, columnName);
//          SCRIPT_SCHEMA,

                                       @NotNull Collection<? super DBSObjectReference> references) throws SQLException, DBException {
        return HYPER_LINKS_TYPES;
                throw new DBException(String.format("View '%s' not found in schema '%s'", viewName, schema.getName()));
        if (params.isSearchInComments()) {
                    );
        if (schema == null) {
                    log.debug("Result set is null when looking for Exasol constraints");
    private void findProceduresByMask(@NotNull JDBCSession session, @Nullable ExasolSchema schema, @NotNull ObjectsSearchParams params,
                if (dbResult == null) {
            || objectType == ExasolObjectType.SCRIPT
//      FROM
                        if (viewSchema == null) {
                    ExasolSchema tableSchema = schema != null ? schema : dataSource.getSchema(monitor, schemaName);
    }
                                    return script;
                                    if (table == null) {
        try (JDBCStatement dbStat = session.createStatement()) {
    }
        if (objectType == ExasolObjectType.TABLE) {
                                        throw new DBException("Script '" + script + "'  not found in schema '" + schemaName + "'");
                    });
                }
 *
        if (schema != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                }
import java.util.List;

        List<String> clause = new ArrayList<>(3);
                    String tableName  = JDBCUtils.safeGetString(dbResult, "COLUMN_TABLE");
    @Override
 * See the License for the specific language governing permissions and
                    ExasolSchema viewSchema = schema;
//          SYS.EXA_ALL_VIEWS
                                    ExasolSchema tableSchema = schema != null ? schema : dataSource.getSchema(monitor, schemaName);
            sql.append("(").append(String.join(" OR ", clause)).append(")");
                while (!monitor.isCanceled() && references.size() < params.getMaxResults() && dbResult.next()) {

                    {
            monitor.done();
import org.jkiss.dbeaver.model.struct.DBSObjectReference;

                                    if (tableColumn == null) {
        }
            sql.append("TABLE_SCHEM = '").append(schema.getName()).append("' AND ");
                                            throw new DBException("nor Table or view with name '" + tableName + "'  found in schema '" + schemaName + "'");
//          (VIEW_NAME LIKE ?
    public ExasolStructureAssistant(ExasolDataSource dataSource) {
                                    if (tableSchema == null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                                    }
//            OR VIEW_COMMENT LIKE ?)
                            log.warn(String.format("Schema '%s' not found in schema cache of datasource '%s'", viewSchemaName, dataSource));
                            continue;
                    String scriptName = JDBCUtils.safeGetString(dbResult, "SCRIPT_NAME");

            super(name, container, null, ExasolView.class, RelationalObjectType.TYPE_VIEW);
            findViews(session, schema, params, references);
            sql.append("(");
                            {
                        continue;
                                }
                monitor.worked(halfOfWork);
                                    return tableColumn;
        }
            findTableObjectByName(session, schema, params, references);
        String objectNameMask = params.getMask();
        return objectType == ExasolObjectType.VIEW
                                ExasolTableForeignKey foreignKey = (ExasolTableForeignKey) table.getAssociation(monitor, constName);
import java.util.ArrayList;

        this.dataSource = dataSource;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return String.format("%s LIKE '%s'", identifier, mask);



        return getSupportedObjectTypes();
        DBRProgressMonitor monitor = session.getProgressMonitor();
        if (params.isSearchInComments()) {
            }
                                    if (table == null) {
        if (params.isSearchInComments()) {
//      /*snapshot execution*/
 * You may obtain a copy of the License at
                            }
            clause.add(getLikeClause("SCRIPT_COMMENT", mask, params.isCaseSensitive()));
        sql.append(viewNameColumn).append(" FROM ").append(getMetadataTableName("VIEWS")).append(" WHERE ");
    @Override
        }
                            if (tableSchema == null)
import java.util.Collection;
                    if (viewSchema == null) {
    private static String getLikeClause(@NotNull String identifier, @NotNull String mask, boolean isCaseSensitive) {
        if (schema == null) {
                                    {
        }
                    ExasolSchema tableSchema = schema != null ? schema : dataSource.getSchema(monitor, schemaName);
                                        throw new DBException("no table column with name '" + columnName + "'  found in table '" + schemaName + "." + tableName + "'");
    }
                                }
    private final String sqlConstraintsAll;
                                        throw new DBException("Table '" + tableName + "' not found in schema '" + schemaName + "'");
 *
                }
        }
                                throw new DBException("Table schema '" + schemaName + "' not found");
    }
    // Constructors
                                        throw new DBException("Table schema '" + schemaName + "' not found");
                    String schemaName = JDBCUtils.safeGetString(dbResult, "SCRIPT_SCHEMA");
        return AUTOC_OBJ_TYPES;
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
                + dataSource.getTablePrefix(ExasolSysTablePrefix.ALL) + "_CONSTRAINTS WHERE CONSTRAINT_TYPE <> 'NOT NULL' "
            || objectType == ExasolObjectType.COLUMN;
                }
        } else if (objectType == ExasolObjectType.FOREIGNKEY) {
                    return;
//          SCRIPT_NAME
                                    }
        return monitor.isCanceled() || objects.size() >= limit;
/*
                    references.add(
    }
        monitor.beginTask("Fetching objects", halfOfWork * 2);
            String viewName = getName();
                        throw new DBException("Unkown constraint type" + constType);
        }
import org.jkiss.code.NotNull;
//          (SCRIPT_NAME LIKE ?
        //don't use parameter marks because of performance

        }

                                    }
    }
        String schemaMask = schema == null ? "%" : ExasolUtils.quoteString(schema.getName());

                        }
