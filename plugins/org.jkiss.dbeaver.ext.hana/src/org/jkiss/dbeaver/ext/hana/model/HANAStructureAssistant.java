                                        + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
                        continue; // filtered
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        DBRProgressMonitor monitor = session.getProgressMonitor();
            }
                                throw new DBException("Column '" + columnName + "' not found in table '"
                    String columnName = dbResult.getString(3);
                        continue; // filtered
                    String description = dbResult.getString(4);
        String stmt = "SELECT SCHEMA_NAME, VIEW_NAME, COMMENTS FROM SYS.VIEWS WHERE";
            if (parentSchema != null) {
            }
                            if (object == null) {
                            if (object == null) {
                }
                }
                            return object;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                HANAObjectType.SYNONYM
                                       List<DBSObjectReference> result) throws SQLException {
            }

                }

                                @Override
        stmt += " ORDER BY SCHEMA_NAME, OBJECT_NAME LIMIT " + (params.getMaxResults() - result.size());
                    String objectName = dbResult.getString(2);
import java.util.Set;
                            RelationalObjectType.TYPE_TABLE_COLUMN) {
        stmt += " ORDER BY SCHEMA_NAME, TABLE_NAME, COLUMN_NAME LIMIT " + (params.getMaxResults() - result.size());
                HANAObjectType.SCHEMA
import org.jkiss.code.NotNull;
                                throw new DBException("Can't find object '" + getName() + "' in '"
                    String objectName = dbResult.getString(2);
                            }
                        }
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";

                    result.add(new AbstractObjectReference<DBSObject>(objectName, schema, description, GenericTableColumn.class,
                    }
            RelationalObjectType.TYPE_VIEW_COLUMN, 
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        DBRProgressMonitor monitor = session.getProgressMonitor();
                    if (schema == null)

                HANAObjectType.PROCEDURE,
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            findViewColumnsByMask(session, parentSchema, params, references);
            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                for (DBSObjectType objectType : objectTypes) {
        stmt += params.isCaseSensitive() ? " TABLE_NAME LIKE ?" : " UPPER(TABLE_NAME) LIKE ?";
                    if (schema == null)
                    String columnName = dbResult.getString(3);
                                    getName());
import java.sql.SQLException;
 * You may obtain a copy of the License at
import org.jkiss.utils.ArrayUtils;


                        }
                HANAObjectType.TABLE,
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            if (parentSchema != null) {
        stmt += isNeedSearchSchemas ? ")" : "";
    public DBSObjectType[] getSupportedObjectTypes() {
            }
                while (!monitor.isCanceled() && dbResult.next()) {
            public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            String searchString = params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase();
        DBRProgressMonitor monitor = session.getProgressMonitor();
                return schema;
        if (objectType == RelationalObjectType.TYPE_TABLE_COLUMN)

        result.add(new AbstractObjectReference<>(schemaName, schema.getParentObject(), null, HANAObjectType.SCHEMA.getTypeClass(),
    }
            }

                    });
                dbStat.setString(2, parentSchema.getName());
                    String objectName = dbResult.getString(2);
                    final String objectName = dbResult.getString(2);
    }
                                throw new DBException("Can't find object '" + getName() + "' in '"
                        addSchemaToResult(schemaName, result);
                    });

                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
        if (objectType == RelationalObjectType.TYPE_PROCEDURE)
                            if (column == null) {

    }
                        continue; // filtered
                                public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                    if (schema == null)
                    });
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 */
                            GenericTableBase object = ((GenericObjectContainer) getContainer()).getTable(monitor,
                            return object;
                                 List<DBSObjectReference> result) throws SQLException {
            findProceduresByMask(session, parentSchema, params, references);
                                throw new DBException("Column '" + columnName + "' not found in table '"
            if (parentSchema != null) {
                        continue; // filtered
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.ArrayList;
                                @NotNull
                while (!monitor.isCanceled() && dbResult.next()) {
            }
        boolean isNeedSearchSchemas = Set.of(params.getObjectTypes()).contains(HANAObjectType.SCHEMA);

            HANAObjectType.TABLE,
                HANAObjectType.VIEW,
            }
                HANAObjectType.SYNONYM,
 * Licensed under the Apache License, Version 2.0 (the "License");
                        @Override
            stmt += params.isCaseSensitive() ? "UPPER(SCHEMA_NAME)" : "SCHEMA_NAME" + " LIKE ? )";
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (isNeedSearchSchemas) {
            @Override
        stmt += " AND OBJECT_TYPE IN (" + objectTypeClause + ")";

        stmt += " ORDER BY SCHEMA_NAME, TABLE_NAME LIMIT " + (params.getMaxResults() - result.size());
    private void findProceduresByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
            HANAObjectType.TABLE,
            public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                }
                            }

        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                                throw new DBException("Can't find object '" + getName() + "' in '"
                dbStat.setString(paramIndex++, parentSchema.getName());
                        continue; // filtered
    public DBSObjectType[] getAutoCompleteObjectTypes() {

        GenericSchema parentSchema = params.getParentObject() instanceof GenericSchema ? (GenericSchema) params.getParentObject() : null;
    }
    private void searchNotColumnObjects(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
                dbStat.setString(2, parentSchema.getName());
    private final HANADataSource dataSource;
                            if (column == null) {
        }
                }
                                    }
    private void findViewsByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
                HANAObjectType.VIEW,
            }
        }
                    if (schema == null)
                                    return super.getFullyQualifiedName(context);
                    String schemaName = dbResult.getString(1);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    private void findTablesByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
        };
                    String objectName = dbResult.getString(2);
        return dataSource;
            if (ArrayUtils.containsAny(objectTypes,
                    objectTypeClause.append("'TABLE', 'VIEW', 'SYNONYM', 'PROCEDURE'");
            throw new DBDatabaseException(ex, dataSource);
        }

    }
                                      List<DBSObjectReference> result) throws SQLException {
                        continue;
                dbStat.setString(2, parentSchema.getName());
                if (objectTypeClause.length() == 0) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            }
    @NotNull
 *
 *
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                        @Override
                            return column;
                searchNotColumnObjects(session, parentSchema, params, result, objectTypeClause.toString());
                            new AbstractObjectReference<DBSObject>(objectName, schema, null, objectType.getTypeClass(), objectType) {
import org.jkiss.dbeaver.model.struct.DBSObject;

                            }
        });
                    objectTypeClause.append("'").append(objectType.getTypeName()).append("'");
                        }
                    result.add(new AbstractObjectReference<GenericObjectContainer>(objectName, schema, description, GenericTable.class,
                                        throws SQLException {
        List<DBSObjectReference> result = new ArrayList<>();
    @Override
                            return object;
        final DBSObject schema = dataSource.getSchema(schemaName);
                                throw new DBException("Can't find object '" + getName() + "' in '"
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
        this.dataSource = dataSource;
                                        + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");

                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
            }
                                                      @NotNull ObjectsSearchParams params) throws DBException {
                            GenericProcedure object = ((GenericObjectContainer) getContainer()).getProcedure(monitor,
                                        + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
                    if (schema == null) {
            }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            GenericTableBase object = ((GenericObjectContainer) getContainer()).getTable(monitor,
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
                                public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    private void addSchemaToResult(String schemaName, List<DBSObjectReference> result) {
        stmt += " ORDER BY SCHEMA_NAME, VIEW_NAME LIMIT " + (params.getMaxResults() - result.size());
                            RelationalObjectType.TYPE_TABLE_COLUMN) {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        }
                            }
            stmt += "OR (OBJECT_TYPE = 'SCHEMA' AND ";
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                        }

    }
                            }
        return result;
        }
import java.util.List;
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
        stmt += isNeedSearchSchemas ? "(" : "";
            RelationalObjectType.TYPE_TABLE_COLUMN,
 *     http://www.apache.org/licenses/LICENSE-2.0
            findViewsByMask(session, parentSchema, params, references);
                            });
        if (objectType == RelationalObjectType.TYPE_VIEW)

        } catch (SQLException ex) {
        String stmt = "SELECT SCHEMA_NAME, TABLE_NAME, COMMENTS FROM SYS.TABLES WHERE";
    }
        if (objectType == RelationalObjectType.TYPE_TABLE)
                }
                                     @NotNull ObjectsSearchParams params, @NotNull List<DBSObjectReference> references)
                                    if (object == null) {

            if (parentSchema != null) {
            }
                HANAObjectType.PROCEDURE,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
            }
                                }
        String stmt = "SELECT SCHEMA_NAME, VIEW_NAME, COLUMN_NAME, COMMENTS FROM SYS.VIEW_COLUMNS WHERE";
                                throw new DBException("Can't find object '" + getName() + "' in '"
                                    getName());
                        continue;



            }
    protected void findObjectsByMask(@NotNull JDBCExecutionContext executionContext, @NotNull JDBCSession session, @NotNull DBSObjectType objectType,
        stmt += params.isCaseSensitive() ? " COLUMN_NAME LIKE ?" : " UPPER(COLUMN_NAME) LIKE ?";
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
                            GenericTableColumn column = object.getAttribute(monitor, columnName);
            HANAObjectType.VIEW,
            int paramIndex = 1;
        if (schema == null) {
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull JDBCExecutionContext executionContext,
            if (isNeedSearchSchemas) {
                (GenericSchema) params.getParentObject() : (params.isGlobalSearch() || !(executionContext instanceof GenericExecutionContext) ? null : ((GenericExecutionContext) executionContext).getDefaultSchema());

                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        DBRProgressMonitor monitor = session.getProgressMonitor();
                                    DBSObject object = objectType.findObject(session.getProgressMonitor(), schema, objectName);
        }
        }
            if (ArrayUtils.contains(objectTypes, RelationalObjectType.TYPE_VIEW_COLUMN)) {
                    String objectName = dbResult.getString(2);
            if (parentSchema != null) {
                    if (HANAObjectType.SCHEMA.equals(objectType)) {
                }
 *
                            GenericTableBase object = ((GenericObjectContainer) getContainer()).getTable(monitor,

            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        @Override
        stmt += " ORDER BY SCHEMA_NAME, VIEW_NAME, COLUMN_NAME LIMIT " + (params.getMaxResults() - result.size());
                        @Override

                    result.add(new AbstractObjectReference<DBSObject>(objectName, schema, description, GenericProcedure.class,
public class HANAStructureAssistant extends JDBCStructureAssistant<JDBCExecutionContext> {


        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
        stmt += params.isCaseSensitive() ? " COLUMN_NAME LIKE ?" : " UPPER(COLUMN_NAME) LIKE ?";
import org.jkiss.dbeaver.ext.generic.model.*;
 * Unless required by applicable law or agreed to in writing, software
                                    getName());
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                            RelationalObjectType.TYPE_VIEW) {
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
                findTableColumnsByMask(session, parentSchema, params, result);

                    });
import org.jkiss.dbeaver.DBDatabaseException;
                    final HANAObjectType objectType = HANAObjectType.valueOf(objectTypeName);
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
    @NotNull
        GenericSchema parentSchema = params.getParentObject() instanceof GenericSchema ?
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
                        log.trace("Schema '" + schemaName + "' not found. Probably was filtered");
                HANAObjectType.TABLE,
}
        return new DBSObjectType[]{
                                        return DBUtils.getQuotedIdentifier(dataSource, objectName);
        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, "Find objects by mask")) {
                    });
    public HANAStructureAssistant(HANADataSource dataSource) {
                        }
        if (parentSchema != null)stmt += " AND SCHEMA_NAME = ?";
        if (objectType == RelationalObjectType.TYPE_VIEW_COLUMN)
import org.jkiss.dbeaver.model.DBUtils;


                    result.add(new AbstractObjectReference<DBSObject>(objectName, schema, description, GenericTableColumn.class,
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
        DBRProgressMonitor monitor = session.getProgressMonitor();
            HANAObjectType.SCHEMA,
                                  List<DBSObjectReference> result) throws SQLException {
                                    return object;

                }
            }
    private void findViewColumnsByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
            @Override

            HANAObjectType.SYNONYM,
                                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                    result.add(
                            if (object == null) {
                    String schemaName = dbResult.getString(1);
                            RelationalObjectType.TYPE_PROCEDURE) {
                return super.getFullyQualifiedName(context);
import org.jkiss.dbeaver.DBException;
                    String schemaName = dbResult.getString(1);
                    final String objectTypeName = dbResult.getString(3);
            HANAObjectType.SYNONYM

import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;

        return new DBSObjectType[]{
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
    }
    }
        stmt += params.isCaseSensitive() ? " PROCEDURE_NAME LIKE ?" : " UPPER(PROCEDURE_NAME) LIKE ?";
        String stmt = "SELECT SCHEMA_NAME, OBJECT_NAME, OBJECT_TYPE FROM SYS.OBJECTS WHERE";
            if (parentSchema != null) {
            )) {
        DBSObjectType[] objectTypes = params.getObjectTypes();
                dbStat.setString(paramIndex, searchString);

        return new DBSObjectType[] {
            log.warn(HANAObjectType.SCHEMA + " '" + schemaName + "' is not found");
    protected JDBCDataSource getDataSource() {
    private void findTableColumnsByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
                    if (objectTypeClause.length() > 0) objectTypeClause.append(",");
    }
        }
                    final String schemaName = dbResult.getString(1);
                                @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
            HANAObjectType.PROCEDURE,
        String stmt = "SELECT SCHEMA_NAME, PROCEDURE_NAME FROM SYS.PROCEDURES WHERE";

                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            }
            findTablesByMask(session, parentSchema, params, references);
                findViewColumnsByMask(session, parentSchema, params, result);
    }
                            RelationalObjectType.TYPE_TABLE) {
                                        + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
    @NotNull
        String stmt = "SELECT SCHEMA_NAME, TABLE_NAME, COLUMN_NAME, COMMENTS FROM SYS.TABLE_COLUMNS WHERE";
                        @Override
                                        List<DBSObjectReference> result, String objectTypeClause) throws SQLException {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
        }
                            if (object == null) {
                dbStat.setString(2, parentSchema.getName());
                    }
                            return column;
                                        + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
        stmt += params.isCaseSensitive() ? " VIEW_NAME LIKE ?" : " UPPER(VIEW_NAME) LIKE ?";
                    String description = dbResult.getString(3);
                                        + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
                while (!monitor.isCanceled() && dbResult.next()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
            @NotNull
 * See the License for the specific language governing permissions and
                while (!monitor.isCanceled() && dbResult.next()) {
                while (!monitor.isCanceled() && dbResult.next()) {

        DBRProgressMonitor monitor = session.getProgressMonitor();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        StringBuilder objectTypeClause = new StringBuilder(100);
                while (!monitor.isCanceled() && dbResult.next()) {
            HANAObjectType.VIEW,
            if (ArrayUtils.contains(objectTypes, RelationalObjectType.TYPE_TABLE_COLUMN)) {
                                        List<DBSObjectReference> result) throws SQLException {
    @NotNull
                    String schemaName = dbResult.getString(1);
    }
                            }
                            if (object == null) {
                                }
                                    getName());
                    String description = null;
package org.jkiss.dbeaver.ext.hana.model;
    }
            }
                    String description = dbResult.getString(3);
                                        throw new DBException(objectTypeName + " '" + objectName + "' not found in schema '" + schema.getName() + "'");

    public DBSObjectType[] getHyperlinkObjectTypes() {
        };
       };
            dbStat.setString(paramIndex++, searchString);
            return;
        stmt += " ORDER BY SCHEMA_NAME, PROCEDURE_NAME LIMIT " + (params.getMaxResults() - result.size());
                    result.add(new AbstractObjectReference<DBSObject>(objectName, schema, description, GenericTable.class,
                dbStat.setString(2, parentSchema.getName());
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            }
                            GenericTableBase object = getContainer().getTable(monitor, getName());
            dbStat.setString(1, params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase());
            findTableColumnsByMask(session, parentSchema, params, references);
            }
                                        + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
                    String description = dbResult.getString(4);
/*
                            GenericTableColumn column = object.getAttribute(monitor, columnName);
                    if (schema == null)
            HANAObjectType.SCHEMA) {
        stmt += params.isCaseSensitive() ? " OBJECT_NAME LIKE ?" : " UPPER(OBJECT_NAME) LIKE ?";
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
    @Override
                    String schemaName = dbResult.getString(1);
                                    if (objectType == HANAObjectType.SYNONYM && HANAConstants.SCHEMA_PUBLIC.equals(schemaName)) {

