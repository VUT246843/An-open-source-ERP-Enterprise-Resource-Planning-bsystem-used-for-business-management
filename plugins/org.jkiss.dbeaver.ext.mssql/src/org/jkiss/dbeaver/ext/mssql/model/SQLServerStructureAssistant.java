        SQLServerSchema schema = null;
    public DBSObjectType[] getSearchObjectTypes() {
            .append("' AND name LIKE '#%' AND name LIKE ? AND OBJECT_ID(CONCAT('").append(SQLServerConstants.TEMPDB_DATABASE).append("..', QUOTENAME(name))) <> 0");
            databases = Collections.singletonList(database);
                            final String objectName = JDBCUtils.safeGetString(dbResult, "name");
        boolean hasMask = !CommonUtils.isEmpty(params.getMask()) && !params.getMask().equals("%");
        if (params.getMask().startsWith("%#") || params.getMask().startsWith("#")) {
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
                        e
                if (rowsToFetch < 1) {
    private void searchTempTables(@NotNull JDBCSession session, @NotNull ObjectsSearchParams params, @NotNull List<DBSObjectReference> objects) throws DBException {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            return Collections.emptyList();
    @Override
        }
            sqlBuilder.append(" LEFT JOIN sys.extended_properties ep ON ((o.parent_object_id = 0 AND ep.minor_id = 0 AND o.object_id = ep.major_id) OR (o.parent_object_id <> 0 AND ep.minor_id = o.parent_object_id AND ep.major_id = o.object_id)) ");
                            return objectNameTrimmed;
                }
        }

                                schema.getTableCache().setFullCache(false);
                    final String objectNameTrimmed = extractTempTableName(objectName);
            }
                }
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
    private List<DBSObjectReference> findAllObjects(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerExecutionContext executionContext,
            boolean addParentheses = params.isSearchInComments() || params.isSearchInDefinitions();
                    return Collections.emptyList();
    public DBSObjectType[] getAutoCompleteObjectTypes()
        }
    private final SQLServerDataSource dataSource;

            if (name.charAt(i) != '_') {
                                object = schema.getChild(session.getProgressMonitor(), objectName);
                sqlBuilder.append(") ");
            for (SQLServerDatabase database: databases) {
                }
    }
    {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        StringBuilder objectTypeClause = new StringBuilder(100);
            sqlBuilder.append("WHERE name LIKE ? \n");
                return objects;
        if (objectTypeClause.length() == 0) {
                    objects.add(new AbstractObjectReference<>(objectName, database, null, objectType.getTypeClass(), objectType) {
                        while (dbResult.next() && !session.getProgressMonitor().isCanceled() && objects.size() < params.getMaxResults()) {
                }
                                // Likely not cached, invalidate and try again
                    rowsToFetch,
                        }
                SQLServerDatabase database = executionContext.getContextDefaults().getDefaultCatalog();
                }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString())) {
            SQLServerObjectType.IF,
                return Collections.emptyList();
            RelationalObjectType.TYPE_PROCEDURE,
                        dbStat.setLong(idx, schema.getObjectId());
                    final String objectName = JDBCUtils.safeGetString(dbResult, "name");
    @NotNull
            }
            } else {

                        idx++;
            RelationalObjectType.TYPE_VIEW,
                    if (hasMask) {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            });
/*
import java.util.ArrayList;
                    if (schema != null) {

import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
            return originalName;
                            DBSObject object = schema.getChild(session.getProgressMonitor(), objectName);
            if (params.isSearchInDefinitions()) {
                            return object;
}
 *
            if (parentObject instanceof SQLServerObject) {
        return new DBSObjectType[] {
                sqlBuilder.append("OR (ep.name = 'MS_Description' AND CAST(ep.value AS nvarchar) LIKE ?)");
            SQLServerObjectType.S,
        return new DBSObjectType[] {
            return Collections.emptyList();
            SQLServerObjectType.U,
  
        List<DBSObjectReference> objects = new ArrayList<>();

                            SQLServerSchema objectSchema = schemaId == 0 ? null : database.getSchema(session.getProgressMonitor(), schemaId);
    {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
    @NotNull
            SQLServerObjectType.U,
                        }
    @Override
    public DBSObjectType[] getSupportedObjectTypes()
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * you may not use this file except in compliance with the License.

                    SQLServerUtils.getSystemTableName(database, "all_objects"),
            if (globalSearch) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    SQLServerUtils.getSystemTableName(database, "schemas"));
import org.jkiss.utils.CommonUtils;
        if (parentObject == null || parentObject instanceof DataSourceDescriptor) {
                            + (schema != null ? schema.getName() : "null"),
 *
                databases = Collections.singletonList(database);
            }
        }
    @NotNull
            SQLServerObjectType.SN,
                                    if (object == null) {
                                throw new DBException(objectType.name() + " '" + objectName + "' not found");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    database = executionContext.getDataSource().getDefaultDatabase(monitor);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return findAllObjects(monitor, executionContext, params);
import org.jkiss.dbeaver.model.DBConstants;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            } else if (objectType == RelationalObjectType.TYPE_CONSTRAINT) {
                        dbStat.setString(idx++, params.getMask());
                    break;
    private static String extractTempTableName(@NotNull String originalName) {
        } else if (isNeedSchemaSearch) {
                                @Override
                            {
            SQLServerObjectType.V,

    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
        } else if (parentObject instanceof SQLServerSchema) {
                searchTempTables(session, params, objects);
import java.util.List;
            dbStat.setString(1, "%" + params.getMask() + "%");
            } else if (objectType == RelationalObjectType.TYPE_VIEW) {
        final StringBuilder sql = new StringBuilder()
            SQLServerObjectType.P,
import org.jkiss.dbeaver.DBDatabaseException;
        return new DBSObjectType[] {
                databases = executionContext.getDataSource().getDatabases(monitor);

    @NotNull
import org.jkiss.dbeaver.Log;
                            dbStat.setString(idx, params.getMask());

    @Override
        }
import org.jkiss.dbeaver.DBException;
            SQLServerObjectType.IT,

            if (objectType instanceof SQLServerObjectType) {
                    sqlBuilder.append(" ");
                            final long schemaId = JDBCUtils.safeGetLong(dbResult, "schema_id");
                sqlBuilder.append("(");
                                                    @NotNull ObjectsSearchParams params) throws DBException {
                            }
    @Override
 *
                        if (params.isSearchInComments()) {
                    }
                supObjectTypes.addAll(SQLServerObjectType.getTypesForClass(SQLServerView.class));
                    // Among other reasons, this can happen if access is denied for the current database
                int rowsToFetch = params.getMaxResults() - objects.size();
                            final String objectTypeName = JDBCUtils.safeGetStringTrimmed(dbResult, "type");
        if (params.isSearchInComments()) {
import org.jkiss.code.NotNull;
                        }
        }
                supObjectTypes.addAll(SQLServerObjectType.getTypesForClass(SQLServerTableForeignKey.class));
                if (database == null || schema == null) {
                    }
        final String name = originalName.substring(0, 116);
                                objectType)
                            dbStat.setString(idx, params.getMask());
            }
            SQLServerDatabase database = (SQLServerDatabase) parentObject;
                }
            }
        }
            .append("\nWHERE type = '").append(SQLServerObjectType.U.name())
            if (objectTypeClause.length() > 0) objectTypeClause.append(",");
                    return Collections.emptyList();
                                        throw new DBException(objectTypeName + " '" + objectName + "' not found");


            sqlBuilder.append("o.name LIKE ? ");
                supObjectTypes.addAll(SQLServerObjectType.getTypesForClass(SQLServerTable.class));
    {
                if (database == null) {
            };
                    "Unable to perform metadata search in mssql instance. databaseName="
            throw new DBDatabaseException("Error while searching in system catalog", e, dataSource);
                            objects.add(new AbstractObjectReference<DBSObject>(
                sqlBuilder.append("OR OBJECT_DEFINITION(o.object_id) LIKE ?");
 * SQLServerStructureAssistant
        if (supObjectTypes.isEmpty()) {


 * Licensed under the Apache License, Version 2.0 (the "License");
                                                      @NotNull ObjectsSearchParams params) throws DBException {
                            idx++;
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
            }

                                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            .append("SELECT TOP ").append(params.getMaxResults() - objects.size()).append(" *")
            SQLServerObjectType.V,
            RelationalObjectType.TYPE_PROCEDURE,
                    final SQLServerObjectType objectType = SQLServerObjectType.valueOf(JDBCUtils.safeGetStringTrimmed(dbResult, "type"));
        Collection<SQLServerObjectType> supObjectTypes = new ArrayList<>(params.getObjectTypes().length + 2);
        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, "Find objects by name")) {
    }
            if (!globalSearch) {
            } else {
    @Override
                try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
                                objectSchema != null ? objectSchema : database,
                databases = Collections.singletonList(database);
    }
import java.util.Collections;
                databases = Collections.singletonList(((SQLServerObject) parentObject).getDatabase());
                            if (object == null) {
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
    }
    }
        return name;
        }
    public DBSObjectType[] getHyperlinkObjectTypes()
                        }

                            final SQLServerObjectType objectType = SQLServerObjectType.valueOf(objectTypeName);
                if (schema == null) {
            SQLServerObjectType.IT,
                    int idx = 1;
        for (DBSObjectType objectType : params.getObjectTypes()) {
        };
    private static final Log log = Log.getLog(SQLServerStructureAssistant.class);
        if (hasMask) {

            // Global temporary tables does not contain padding in their names. Use as-is

                schema = executionContext.getContextDefaults().getDefaultSchema();
                if (params.isSearchInComments()) {
    {
                    } else if (isNeedSchemaSearch) {
            sqlBuilder.append("AND ");
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
    public SQLServerStructureAssistant(SQLServerDataSource dataSource)
            sqlBuilder.append("ORDER BY o.name");

    }
                }
        for (SQLServerObjectType objectType : supObjectTypes) {
            sqlBuilder.append("AND o.schema_id = ? ");
            sqlBuilder.append("FROM %s\n");
        boolean globalSearch = params.isGlobalSearch();
            }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            SQLServerObjectType.SN,
        final SQLServerSchema schema = database.getSchema(session.getProgressMonitor(), SQLServerConstants.DEFAULT_SCHEMA_NAME);
            schema = (SQLServerSchema) parentObject;
 * DBeaver - Universal Database Manager
            SQLServerObjectType.FN,
                            }
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
 * You may obtain a copy of the License at
                SQLServerDatabase database = executionContext.getContextDefaults().getDefaultCatalog();
            } else if (parentObject instanceof DBPDataSourceContainer) {
 */
                        dbStat.setString(1, params.getMask());
            if (addParentheses) {
                    database = executionContext.getDataSource().getDefaultDatabase(monitor);
        };

        return true;
            return Collections.emptyList();
        for (int i = name.length() - 1; i >= 0; i--) {

            try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, "Find temp tables by name")) {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
package org.jkiss.dbeaver.ext.mssql.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    rowsToFetch,
            SQLServerObjectType.X,
                            idx++;

    }
        }
            SQLServerObjectType.FT,
                    }
            SQLServerObjectType.S,
            SQLServerObjectType.U,
        }
        StringBuilder sqlBuilder = new StringBuilder("SELECT TOP %d schema_id, name, type FROM %s o");
        }
import java.util.Collection;
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
/**
                            + database.getName()
 * limitations under the License.
            SQLServerObjectType.V,
            }

 */
        this.dataSource = dataSource;
        }
                                objectName,
            SQLServerObjectType.TF,
                while (dbResult.next() && !session.getProgressMonitor().isCanceled()) {
                        }
            if (params.isSearchInComments()) {
        if (originalName.startsWith("##")) {
                            if (object == null) {
                    log.debug(
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                                    }
        } catch (Throwable e) {
            .append("\nFROM ").append(SQLServerUtils.getSystemTableName(database, "all_objects"))
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerExecutionContext executionContext,
                } catch (SQLException e) {
        } else {
                                }
    @Override

        DBSObject parentObject = params.getParentObject();
    }
    }
    }
                supObjectTypes.add((SQLServerObjectType) objectType);
                        @Override
                                    return object;
                        @Override
            SQLServerObjectType.FS,

        return new DBSObjectType[] {
                            + ", schema="
                    );
    @NotNull
            SQLServerDatabase database = schema.getDatabase();
        final SQLServerDatabase database = dataSource.getDatabase(session.getProgressMonitor(), SQLServerConstants.TEMPDB_DATABASE);
                return name.substring(0, i + 1);
                    dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
                supObjectTypes.addAll(SQLServerObjectType.getTypesForClass(SQLServerProcedure.class));
import java.sql.SQLException;
        sqlBuilder.append(" WHERE o.type IN (").append(objectTypeClause).append(") ");
            }
        if (CommonUtils.isEmpty(databases)) {
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
                                null,
    @NotNull
                schema = executionContext.getContextDefaults().getDefaultSchema();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            SQLServerObjectType.FN,
            SQLServerObjectType.P,
            }
        return objects;
            } else if (objectType == RelationalObjectType.TYPE_TABLE) {
            RelationalObjectType.TYPE_TABLE,
                        public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        } else if (parentObject instanceof SQLServerDatabase) {
        if (schema != null) {
            SQLServerObjectType.X,
            databases = Collections.singletonList(database);
        String template = sqlBuilder.toString();
                List<DBSObjectReference> objects = new ArrayList<>();
    }
        Collection<SQLServerDatabase> databases;
            sqlBuilder.append(" UNION ALL\nSELECT TOP %d schema_id, name, 'SCHEMA'\n");
            objectTypeClause.append("'").append(objectType.getTypeID()).append("'");
                if (database == null) {
                String sql = String.format(template,
            SQLServerObjectType.SCHEMA
                                objectType.getTypeClass(),

public class SQLServerStructureAssistant implements DBSStructureAssistant<SQLServerExecutionContext> {
        };
                    });
                                    DBSObject object = objectType.findObject(session.getProgressMonitor(), objectSchema, objectName);
 * See the License for the specific language governing permissions and
            }
        return true;
            SQLServerObjectType.SN
            } else if (objectType == RelationalObjectType.TYPE_PROCEDURE) {
        }
            if (addParentheses) {
            }
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
                }
                        @NotNull
        boolean isNeedSchemaSearch = supObjectTypes.contains(SQLServerObjectType.SCHEMA);
                supObjectTypes.addAll(SQLServerObjectType.getTypesForClass(SQLServerTableCheckConstraint.class));
                        if (params.isSearchInDefinitions()) {
