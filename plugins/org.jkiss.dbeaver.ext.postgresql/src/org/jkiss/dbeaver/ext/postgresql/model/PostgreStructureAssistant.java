
                    objects.add(new AbstractObjectReference<>(procName, procSchema, null, PostgreProcedure.class, RelationalObjectType.TYPE_PROCEDURE,
        }
        if (database == null) {
                    if (schema == null) {
                    if (schemaFilter.matches(schema.getName())) {
                        log.debug("Attribute's schema '" + schemaId + "' not found");
        return objectType == RelationalObjectType.TYPE_TABLE
        if (params.isSearchInComments()) {
    @Override

        private boolean isCaseSensitive() {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        private String getDescriptionClause() {
        queryParams.setMaxResults(objectsSearchParams.getMaxResults() - objects.size());
            ((PostgreObject) parentObject).getDatabase() : executionContext.getDefaultCatalog();
        }
        private final String columnsToSelect;
        queryParams.setCaseSensitive(params.isCaseSensitive());
        queryParams.setMaxResults(params.getMaxResults() - references.size());
                                throw new DBException("Table '" + tableId + "' not found in schema '" + constrSchema.getName() + "'");
        // Load constraints
                                              @NotNull ObjectsSearchParams params, @NotNull Collection<? super DBSObjectReference> objects)
    public DBSObjectType[] getSearchObjectTypes() {
                    objects.add(new AbstractObjectReference<>(attributeName, constrSchema, null, PostgreTableBase.class, RelationalObjectType.TYPE_TABLE_COLUMN) {
                    });
 * You may obtain a copy of the License at
            queryParams.setDescriptionClause("col_description(c.oid, x.attnum)");
            throw new DBDatabaseException(ex, getDataSource());
        private void setWhereClause(@Nullable String whereClause) {
                if (references.size() >= params.getMaxResults()) {
                    });
            "pp.proname"
            this.caseSensitive = caseSensitive;
 *
                        continue;
                        @Override
        if (!CommonUtils.isEmpty(schema)) {
        @NotNull
    }
            fillParams(dbStat, params, schemas, params.isSearchInDefinitions());

        }
        }
                            return table;
    }
import org.jkiss.dbeaver.DBDatabaseException;
        if (queryParams.getDescriptionClause() != null) {
        @Nullable
        private String getName() {
        QueryParams queryParams = new QueryParams(
                    if (tableSchema == null) {
        QueryParams queryParams = new QueryParams(
        PostgreDatabase database,
        List<DBSObjectReference> references
 * limitations under the License.
        }

            queryParams.setDefinitionClause("pg_get_constraintdef(pc.\"oid\")");
                nsList.add(pgCatalog);
    private void findSchemaByMask(
 * Unless required by applicable law or agreed to in writing, software
                        }

        queryParams.setCaseSensitive(objectsSearchParams.isCaseSensitive());
                while (!monitor.isCanceled() && dbResult.next()) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
        DBSObject parentObject = params.getParentObject();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

            return Collections.unmodifiableCollection(schemas);
        ObjectsSearchParams params,
    @Override
            RelationalObjectType.TYPE_SCHEMA,
    }
            executionContext = database.getMetaContext();
                        log.debug("Can't resolve table '" + tableName + "' - owner schema " + schemaId + " not found");
            return descriptionClause;
        }
            "n.oid AS oid, n.nspname AS schema_name",
/*
            fillParams(dbStat, params, schemas, params.isSearchInDefinitions());
                } else if (type == RelationalObjectType.TYPE_SCHEMA) {

                    break;

                            (tableType == PostgreClass.RelKind.v ? PostgreView.class : PostgreMaterializedView.class),
                    findSchemaByMask(session, database, params, references);

        String sql = buildFindQuery(queryParams);
        }
                    final long schemaId = JDBCUtils.safeGetLong(dbResult, "relnamespace");
                        log.debug("Can't resolve schema '" + schemaName + " not found");
        return new DBSObjectType[] {
            // Limit object search with available schemas (use filters - #648)
                } else if (type == RelationalObjectType.TYPE_TABLE_COLUMN) {
            "pc.connamespace",
        }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
                        }
    }
import java.sql.SQLException;
            RelationalObjectType.TYPE_CONSTRAINT,
                    findConstraintsByMask(session, database, nsList, params, references);
    {
    public DBSObjectType[] getAutoCompleteObjectTypes()
                        nsList.add(schema);
        PostgreDataSource dataSource = executionContext.getDataSource();
            "pp." + proceduresOidColumn + " as poid, pp.*",
            this.whereClause = whereClause;
        // Load tables
                    objects.add(new AbstractObjectReference<>(constrName, constrSchema, null, PostgreTableConstraintBase.class, RelationalObjectType.TYPE_CONSTRAINT) {
        PostgreDatabase database = parentObject instanceof PostgreObject ?
        @NotNull
                    findTablesByMask(session, database, nsList, params, references);
                    final String procName = JDBCUtils.safeGetString(dbResult, "proname");
        if (params.isSearchInComments()) {
                        continue;
        }
        }
        private int getMaxResults() {
            DBSObjectFilter schemaFilter = dataSource.getContainer().getObjectFilter(PostgreSchema.class, database, true);
                        @Override
        }
        queryParams.setMaxResults(params.getMaxResults() - objects.size());


            "pc.conname",
    @NotNull
        }
            "pg_namespace n",

        sql.append("ORDER BY ").append(queryParams.getOrderBy()).append(" LIMIT ").append(queryParams.getMaxResults());

                while (!monitor.isCanceled() && dbResult.next()) {
    private static void findTableColumnsByMask(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull List<PostgreSchema> schemas,
        private String getNamespace() {
        if (params.isSearchInComments()) {
                        }
        @NotNull
                    }
                while (!monitor.isCanceled() && dbResult.next()) {
            }
        } else {
                                                throws SQLException, DBException {
            RelationalObjectType.TYPE_PROCEDURE,

        return new DBSObjectType[] {
        return new DBSObjectType[]{
    @Override
                    final PostgreSchema procSchema = database.getSchema(session.getProgressMonitor(), schemaId);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                        RelationalObjectType.TYPE_TABLE) {
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        private final String fromClause;
            fillParams(dbStat, objectsSearchParams, schemas, false);
                            PostgreProcedure procedure = procSchema.getProcedure(monitor, procId);
            this.definitionClause = definitionClause;
        @NotNull
                    findProceduresByMask(session, database, nsList, params, references);
                    }
                if (type == RelationalObjectType.TYPE_TABLE) {
    }
            queryParams.setDefinitionClause("pc.relkind = 'v' AND pg_get_viewdef(pc.\"oid\")");
                            if (procedure == null) {
        @NotNull
            }
                    if (constrSchema == null) {
            sql.append("OR ").append(queryParams.getDescriptionClause()).append(likeClause);
import org.jkiss.dbeaver.DBException;

        private String definitionClause;
            "x.attname",
                    final String constrName = JDBCUtils.safeGetString(dbResult, "conname");
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            return table.getAttribute(monitor, attributeName);
        if (executionContext.getDefaultCatalog() != database) {
        DBRProgressMonitor monitor = session.getProgressMonitor();
                        RelationalObjectType.TYPE_SCHEMA) {
        String sql = buildFindQuery(queryParams);
            "pg_catalog." + serverType.getProceduresSystemTable() + " pp",
                                throw new DBException("Procedure '" + procName + "' not found in schema '" + procSchema.getName() + "'");
        List<PostgreSchema> nsList = new ArrayList<>();
            "pc.relnamespace",
            "pc.conname"

        }
    private static void findProceduresByMask(@NotNull JDBCSession session, @NotNull PostgreDatabase database,
        if (params.isSearchInDefinitions()) {
            "pc.relname"
            return whereClause;
                            }
    private static final Log log = Log.getLog(PostgreStructureAssistant.class);
        private String getWhereClause() {
        );
        }
                    findTableColumnsByMask(session, database, nsList, params, references);

            this.schemas = schemas;
        queryParams.setWhereClause("c.oid=x.attrelid");
            if (pgCatalog != null) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
            RelationalObjectType.TYPE_TABLE,
                while (!monitor.isCanceled() && dbResult.next()) {
                        DBUtils.getQuotedIdentifier(procSchema) + "." + proc.getOverloadedName()) {
    private static void findConstraintsByMask(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull final List<PostgreSchema> schemas,
            }
            PostgreUtils.setArrayParameter(statement, idx, schema);
        if (params.isSearchInDefinitions()) {
 * PostgreStructureAssistant
        @Nullable
            return definitionClause;
            this.columnsToSelect = columnsToSelect;

                                             @NotNull final List<PostgreSchema> schemas, @NotNull ObjectsSearchParams params,

        } else if (!params.isGlobalSearch()) {

            PostgreSchema pgCatalog = database.getCatalogSchema(monitor);
        private boolean caseSensitive;
            queryParams.setDescriptionClause("obj_description(pc.oid, 'pg_constraint')");
        // Load constraints
            this.name = name;
                            if (constraint == null) {
        List<DBSObjectReference> references = new ArrayList<>();
        }
    public DBSObjectType[] getHyperlinkObjectTypes()
            for (String sn : executionContext.getSearchPath()) {
        );
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import java.util.List;
        @NotNull
        statement.setString(1, params.getMask());
            }
import java.util.Collections;
        }
            statement.setString(idx, params.getMask());
                if (schema != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
            RelationalObjectType.TYPE_TABLE,
        @Nullable
                            }
        PostgreSchema ownerSchema = parentObject instanceof PostgreSchema ? (PostgreSchema) parentObject : null;

                    references.add(new AbstractObjectReference<>(schemaName, database, null,
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            sql.append(queryParams.getWhereClause()).append(" AND ");
    private static String buildFindQuery(@NotNull QueryParams queryParams) {
                            }
                    if (procSchema == null) {
                for (PostgreSchema schema : database.getSchemas(monitor)) {
            "pc.relname",
    @Override
                                               @NotNull ObjectsSearchParams objectsSearchParams,
            for (DBSObjectType type : params.getObjectTypes()) {
    private static void findTablesByMask(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull final List<PostgreSchema> schemas,
            "pp.pronamespace",
                    });
                PostgreSchema schema = database.getSchema(monitor, PostgreUtils.getRealSchemaName(database, sn));
        }
        @NotNull
        private String whereClause;
        String sql = buildFindQuery(queryParams);
        }
    ) throws SQLException, DBException {
        };
            RelationalObjectType.TYPE_PROCEDURE,

        @NotNull

                    final PostgreSchema constrSchema = database.getSchema(session.getProgressMonitor(), schemaId);
            this.fromClause = fromClause;
        return queryParams;
/**
            "pc.oid,pc.relname,pc.relnamespace,pc.relkind",
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            return maxResults;
                } else if (type == RelationalObjectType.TYPE_PROCEDURE) {
            sql.append(" OR (").append(queryParams.getDefinitionClause()).append(likeClause).append(")");
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            database = dataSource.getDefaultInstance();
import org.jkiss.dbeaver.model.DBUtils;
        }
        }
            dbStat.setString(1, params.getMask());
    {
        }
            "n.nspname"
        private String getOrderBy() {

import org.jkiss.code.NotNull;
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull PostgreExecutionContext executionContext,
package org.jkiss.dbeaver.ext.postgresql.model;
                            final PostgreTableConstraintBase constraint = PostgreUtils.getObjectById(monitor, constrSchema.getConstraintCache(), constrSchema, constrId);
        QueryParams queryParams = buildQueryParamsForSchemaSearch(params, references);
 *
        if (ownerSchema != null) {
            schemas,
                            @NotNull Collection<? extends PostgreSchema> schemas, @NotNull String namespace, @NotNull String orderBy) {
                        @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            return caseSensitive;
            "pc.oid, pc.conname, pc.connamespace",
import java.util.ArrayList;

                        @Override


            return namespace;
        }


        return objectType == RelationalObjectType.TYPE_CONSTRAINT || objectType == RelationalObjectType.TYPE_PROCEDURE;
        if (params.isSearchInComments()) {
            RelationalObjectType.TYPE_TABLE,
        @NotNull

                    final PostgreClass.RelKind tableType = PostgreClass.RelKind.valueOf(JDBCUtils.safeGetString(dbResult, "relkind"));
            sql.append(SQLUtils.generateParamList(queryParams.getSchemas().size())).append(") ");
 * you may not use this file except in compliance with the License.
        StringBuilder sql = new StringBuilder("SELECT ").append(queryParams.getColumnsToSelect());
                                throw new DBException("Table '" + tableName + "' not found in schema '" + tableSchema.getName() + "'");
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        if (addParentheses) {
        }
                }
import org.jkiss.utils.CommonUtils;
            RelationalObjectType.TYPE_CONSTRAINT,
                    nsList.add(schema);
                        tableType == PostgreClass.RelKind.r ? PostgreTable.class :
        }
        private QueryParams(@NotNull String columnsToSelect, @NotNull String fromClause, @NotNull String name,
        queryParams.setCaseSensitive(params.isCaseSensitive());
            || objectType == RelationalObjectType.TYPE_TABLE_COLUMN;
            "pp.proname",
                    final long schemaId = JDBCUtils.safeGetLong(dbResult, "oid");
            "c.relnamespace",
        private int maxResults;
                            final PostgreTableBase table = PostgreUtils.getObjectById(monitor, constrSchema.getTableCache(), constrSchema, tableId);
        private String descriptionClause;
        queryParams.setCaseSensitive(params.isCaseSensitive());
        }
            "pg_catalog.pg_constraint pc",
            idx++;
            "pg_catalog.pg_class pc",
                } else if (type == RelationalObjectType.TYPE_CONSTRAINT) {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        }
                    final long tableId = JDBCUtils.safeGetLong(dbResult, "attrelid");
        );
    @NotNull
            }

        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, ModelMessages.model_jdbc_find_objects_by_name)) {
            // Limit object search with search path
            this.namespace = namespace;
                while (!monitor.isCanceled() && dbResult.next()) {

        private String getFromClause() {
    {
    }
                    });
        private final String orderBy;
            || objectType == RelationalObjectType.TYPE_PROCEDURE
                    });
 * See the License for the specific language governing permissions and

        sql.append(" FROM ").append(queryParams.getFromClause()).append(" WHERE ");

    @Override
        DBRProgressMonitor monitor = session.getProgressMonitor();
                    final String attributeName = JDBCUtils.safeGetString(dbResult, "attname");

                }


    @Override
        private void setDescriptionClause(@Nullable String descriptionClause) {
        );
 * Copyright (C) 2010-2024 DBeaver Corp and others
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
        } catch (SQLException ex) {


                    final String schemaName = JDBCUtils.safeGetString(dbResult, "schema_name");
        return sql.toString();
            "",
            schemas,
            queryParams.setDefinitionClause("pp.prokind <> 'm' AND pp.prokind <> 'a' AND pg_get_functiondef(pp.\"" + proceduresOidColumn + "\")");
            if (schemaFilter != null && schemaFilter.isEnabled()) {
                                             @NotNull Collection<? super DBSObjectReference> objects) throws SQLException, DBException {
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

                        }
        //queryParams.setWhereClause("pp.proname NOT LIKE '\\_%'");
            RelationalObjectType.TYPE_TABLE,
        queryParams.setWhereClause("has_schema_privilege(n.nspname, 'USAGE')");
 */
            "x.attname,x.attrelid,x.atttypid,c.relnamespace",
        };
            || objectType == RelationalObjectType.TYPE_CONSTRAINT
 *
                        continue;
                    final String tableName = JDBCUtils.safeGetString(dbResult, "relname");
            nsList.add(0, ownerSchema);
                            PostgreTableBase table = tableSchema.getTable(monitor, tableId);

            }
                    PostgreProcedure proc = new PostgreProcedure(monitor, procSchema, dbResult);
        queryParams.setWhereClause("pc.relkind in('r','v','m','f','p')"); // r = ordinary table, v = view, m = materialized view, f = foreign table, p = partitioned table
    }
        return new DBSObjectType[] {
        if (objectsSearchParams.isSearchInComments()) {
        @Nullable
            this.descriptionClause = descriptionClause;
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
        return references;
        PostgreServerExtension serverType = database.getDataSource().getServerType();
        return dataSource;
            schemas,
            fillParams(dbStat, params, schemas, params.isSearchInDefinitions());
                            return constraint;


                    final PostgreSchema constrSchema = database.getSchema(session.getProgressMonitor(), schemaId);
        }
                            if (table == null) {
                }
    }
            };
        private String getDefinitionClause() {
            sql.append("AND ").append(queryParams.getNamespace()).append(" IN (");

        private final Collection<? extends PostgreSchema> schemas;
        private final String namespace;

        @NotNull
            }
    }
            "x.attname"
        // Load procedures

        String sql = buildFindQuery(queryParams);
}
        DBRProgressMonitor monitor = session.getProgressMonitor();
        QueryParams queryParams = new QueryParams(
        }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * DBeaver - Universal Database Manager
    }
                                               @NotNull Collection<? super DBSObjectReference> objects) throws SQLException, DBException {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        }
        }
            }

    public PostgreStructureAssistant(PostgreDataSource dataSource)
    @NotNull
                            if (table == null) {
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }

        }
                }
        private void setCaseSensitive(boolean caseSensitive) {
                    final PostgreSchema tableSchema = database.getSchema(session.getProgressMonitor(), schemaId);
    private static void fillParams(@NotNull JDBCPreparedStatement statement, @NotNull ObjectsSearchParams params,
        }
        @NotNull
                    }
    }
            "n.nspname",
                }
import org.jkiss.dbeaver.model.struct.*;


                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            this.maxResults = maxResults;
                        continue;
                                                      @NotNull ObjectsSearchParams params) throws DBException {
        if (params.isSearchInDefinitions()) {
                    final long schemaId = JDBCUtils.safeGetLong(dbResult, "connamespace");
            RelationalObjectType.TYPE_PROCEDURE
    @NotNull
    }
        if (queryParams.getDefinitionClause() != null) {
            RelationalObjectType.TYPE_TABLE_COLUMN,
        //TODO: currently, we do not search for data types, although it's absolutely possible.
 */
            statement.setString(idx, params.getMask());
        QueryParams queryParams = new QueryParams(
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        DBRProgressMonitor monitor = session.getProgressMonitor();
        private Collection<PostgreSchema> getSchemas() {
        String proceduresOidColumn = serverType.getProceduresOidColumn();
    public DBSObjectType[] getSupportedObjectTypes()
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
    {
        }
        @Nullable
                            return procedure;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        JDBCSession session,
                            return schema;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        DBRProgressMonitor monitor = session.getProgressMonitor();
                    final long schemaId = JDBCUtils.safeGetLong(dbResult, "pronamespace");
        private void setDefinitionClause(@Nullable String definitionClause) {
                    objects.add(new AbstractObjectReference<>(tableName, tableSchema, null,
            this.orderBy = orderBy;

                                throw new DBException("Constraint '" + constrName + "' not found in schema '" + constrSchema.getName() + "'");
        if (queryParams.getWhereClause() != null) {
            }
            queryParams.setDescriptionClause("obj_description(pc.oid, 'pg_class')");
        if (!queryParams.getSchemas().isEmpty()) {

            return columnsToSelect;
            Collections.emptyList(),
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        private final String name;
                        continue;
        }
        boolean addParentheses = queryParams.getDefinitionClause() != null || queryParams.getDescriptionClause() != null;
        }
        @Nullable
    @NotNull
    private static final class QueryParams {
                        @Override
    protected JDBCDataSource getDataSource()
                    }

        }
        };
        String sql = buildFindQuery(queryParams);
                                   @Nullable List<? extends PostgreSchema> schema, boolean fillSearchInDefinitions) throws SQLException {
    @NotNull

        }
                            }

        if (fillSearchInDefinitions) {
            idx++;
                    final long procId = JDBCUtils.safeGetLong(dbResult, "poid");
                    }
            schemas,
    }
        @NotNull
            return fromClause;
            return orderBy;
    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
                }


                                         @NotNull ObjectsSearchParams params, @NotNull Collection<? super DBSObjectReference> objects)
        queryParams.setCaseSensitive(params.isCaseSensitive());
                }
import org.jkiss.code.Nullable;
                        PostgreSchema.class,
        if (addParentheses) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
            RelationalObjectType.TYPE_PROCEDURE,
    }
                                            throws SQLException, DBException {
            queryParams.setDescriptionClause("obj_description(pp.oid, 'pg_proc')");
    @Override
        QueryParams queryParams = new QueryParams(

                    if (constrSchema == null) {
                        }
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
                        log.debug("Constraint's schema '" + schemaId + "' not found");
                    final long tableId = JDBCUtils.safeGetLong(dbResult, "oid");

    private QueryParams buildQueryParamsForSchemaSearch(ObjectsSearchParams params, List<DBSObjectReference> references) {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        private void setMaxResults(int maxResults) {

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        String likeClause = queryParams.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
        this.dataSource = dataSource;

        private String getColumnsToSelect() {
import org.jkiss.dbeaver.Log;

                }
            sql.append("(");
                    final long constrId = JDBCUtils.safeGetLong(dbResult, "oid");
public class PostgreStructureAssistant implements DBSStructureAssistant<PostgreExecutionContext> {
        );
            RelationalObjectType.TYPE_TABLE_COLUMN,
            return name;

    }
    {
        }
                    final long schemaId = JDBCUtils.safeGetLong(dbResult, "relnamespace");
            sql.append(")");
    private final PostgreDataSource dataSource;
                        log.debug("Procedure's schema '" + schemaId + "' not found");
            "pg_catalog.pg_attribute x, pg_catalog.pg_class c",

                    final PostgreSchema schema = database.getSchema(session.getProgressMonitor(), schemaId);
        sql.append(queryParams.getName()).append(likeClause).append(" ");
            RelationalObjectType.TYPE_DATA_TYPE,
        int idx = 2;
import java.util.Collection;
