        sql += "\nORDER BY s.sequence_schema, s.sequence_name LIMIT " + (params.getMaxResults() - result.size());
                        }
                    final VerticaObjectType objectType = VerticaObjectType.valueOf(tableType);
                        @Override
            dbStat.setString(1, params.getMask());
            (searchInComments ? "LEFT JOIN v_catalog.comments c ON n.node_id = c.object_id\n" : "") +
                            }
    }
import java.sql.SQLException;
        }
        return dataSource;
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        @Override
                        @Override
                                throw new DBException("Column '" + columnName + "' not found in table '"

        }

            dbStat.setString(1, params.getMask());
        List<DBSObjectReference> result,
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                            if (constraint == null) {
                            return object;
            if (searchInComments) {
        };
                                    + DBUtils.getFullyQualifiedName(dataSource, getContainer().getName(), tableBase.getName()) + "'");
                dbStat.setString(searchInComments ? 3 : 2, parentSchema.getName());
import org.jkiss.dbeaver.model.struct.DBSObject;
        DBRProgressMonitor monitor = session.getProgressMonitor();
        }
                            return constraint;
    VerticaStructureAssistant(VerticaDataSource dataSource) {
                        continue; // filtered
                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        if (searchInComments) {

        DBRProgressMonitor monitor = session.getProgressMonitor();
        @NotNull JDBCSession session,
        stmt += " ORDER BY table_schema, table_name, column_name LIMIT " + (params.getMaxResults() - result.size());
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
 *
        }
            VerticaObjectType.SEQUENCE,
                        @Override

        boolean searchInComments
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                while (!monitor.isCanceled() && dbResult.next()) {
import java.util.List;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
 * you may not use this file except in compliance with the License.
                        continue; // filtered
                            if (object == null) {
                            VerticaNode object = getContainer().getClusterNode(monitor, objectName);
        if (parentSchema != null) sql += " AND s.sequence_schema = ?";
                while (!monitor.isCanceled() && dbResult.next()) {
        }
    }
            (searchInComments ? "LEFT JOIN v_catalog.comments c ON tc.constraint_id = c.object_id " : "") +
        String stmt = "SELECT table_schema, table_name, column_name FROM v_catalog.columns WHERE column_name";
                dbStat.setString(2, parentSchema.getName());
}

                    final String objectName = dbResult.getString(3);
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
    private void findViewColumnsByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
            if (addTables) objectTypeClause.append(",");

                    final String objectName = dbResult.getString(1);
                            if (object == null) {
        JDBCDataSource dataSource = executionContext.getDataSource();
                    result.add(new AbstractObjectReference<>(objectName, schema, description, objectType.getClass(), objectType) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
                            }
                    final String objectName = dbResult.getString(2);
    }
                    String schemaName = dbResult.getString(1);
        sql += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
    @Override
            }
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
            "\nFROM v_catalog.all_tables WHERE " + (searchInComments ? "(" : "") + "TABLE_NAME";
                    if (schema == null) {
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
                while (!monitor.isCanceled() && dbResult.next()) {
                                    + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");

        if (objectTypesList.contains(RelationalObjectType.TYPE_VIEW)) {
            if (searchInComments) {
 * DBeaver - Universal Database Manager
            dbStat.setString(1, params.getMask());
                            }
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                    });
    }
        boolean searchInComments = !avoidCommentsReading && params.isSearchInComments();
                            GenericTableBase object = getContainer().getTable(monitor, tableName);
                            GenericTableColumn column = object.getAttribute(monitor, columnName);
            }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        sql += "\nORDER BY SCHEMA_NAME, TABLE_NAME LIMIT " + (params.getMaxResults() - result.size());
            dbStat.setString(1, params.getMask());
            "LEFT JOIN v_catalog.schemata s ON tc.constraint_schema_id = s.schema_id\n" +
                }
import java.util.Arrays;
        if (searchInComments) {
            (searchInComments ? "LEFT JOIN v_catalog.comments c ON p.projection_id = c.object_id\n" : "") +
            sql += " OR c.\"comment\"" + (params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?") + ")";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return new DBSObjectType[]{
                            if (object == null) {
    @Override
                    final String description = searchInComments ? dbResult.getString(2) : "";
        String sql = "SELECT s.schema_name, al.table_name, tc.constraint_name, tc.constraint_type" +
            sql += " OR c.\"comment\"" + (params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?") + ")";
        }
                            if (object == null) {
            "LEFT JOIN v_catalog.all_tables al ON al.table_id = tc.table_id\n" +
        String sql = "SELECT schema_name, table_name, CASE WHEN table_type = 'SYSTEM TABLE' THEN 'SYSTEM_TABLE' ELSE table_type END, remarks" +
                                throw new DBException("Can't find column table '" + tableName + "' in '"

        if (objectType == RelationalObjectType.TYPE_TABLE || objectType == RelationalObjectType.TYPE_VIEW) {
        if (searchInComments) {
        if (searchInComments) {
            if (searchInComments) {
                        continue; // filtered
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                                throw new DBException("Can't find object '" + objectName + "' in '"
            + " FROM v_catalog.sequences s\n" +
            sql += " OR c.\"comment\"" + (params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?") + ")";
            if (parentSchema != null) {
        boolean searchInComments
    }
                    final boolean isFK = constraintType.equals("f");
        boolean searchInComments
                    result.add(new AbstractObjectReference<>(objectName, dataSource, description, VerticaNode.class, VerticaObjectType.NODE) {
                        continue; // filtered
        stmt += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
            }
                    result.add(new AbstractObjectReference<GenericObjectContainer>(columnName, schema, null, GenericTableColumn.class, RelationalObjectType.TYPE_TABLE_COLUMN) {
        }
            }
            if (parentSchema != null) {
                                throw new DBException("Can't find object '" + getName() + "' in '"
            if (parentSchema != null) {
                                throw new DBException(tableType + " '" + objectName + "' not found in schema '" + schema.getName() + "'");
                while (!monitor.isCanceled() && dbResult.next()) {
            findTableColumnsByMask(session, parentSchema, params, references);
                            DBSTableConstraint constraint;
                            if (column == null) {
        @Nullable GenericSchema parentSchema,
            findViewColumnsByMask(session, parentSchema, params, references);
                        @Override
            }
                    }
        DBRProgressMonitor monitor = session.getProgressMonitor();
                                    + object.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
                            if (column == null) {
package org.jkiss.dbeaver.ext.vertica.model;
                }
 * limitations under the License.
    private void findNodesByMask(
                    String tableName = dbResult.getString(2);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        DBRProgressMonitor monitor = session.getProgressMonitor();
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        if (addTables) {
        @NotNull ObjectsSearchParams params,
                    String columnName = dbResult.getString(3);
        }
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
                            if (tableBase == null) {
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
        stmt += " ORDER BY table_schema, table_name, column_name LIMIT " + (params.getMaxResults() - result.size());

        String stmt = "SELECT table_schema, table_name, column_name from v_catalog.view_columns WHERE column_name";
                            }
            " WHERE " + (searchInComments ? "(" : "") + "tc.constraint_name";
        if (parentSchema != null) sql += " AND s.schema_name = ?";
            }
                    result.add(new AbstractObjectReference<>(objectName, schema, description, VerticaSequence.class, VerticaObjectType.SEQUENCE) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dbStat.setString(2, parentSchema.getName());
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        }
                            return column;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            }
            if (parentSchema != null) {
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
                        }
                dbStat.setString(2, params.getMask());

                    final String objectName = dbResult.getString(2);
                                       @NotNull List<DBSObjectReference> result, boolean searchInComments) throws SQLException {
                                constraint = tableBase.getConstraint(monitor, objectName);

            if (parentSchema != null) {
                        }
    }
        return objectType != RelationalObjectType.TYPE_TABLE_COLUMN && objectType != RelationalObjectType.TYPE_VIEW_COLUMN;
        sql += " AND table_type IN (" + objectTypeClause.toString() + ")";
                        }
        boolean addTables = objectTypesList.contains(RelationalObjectType.TYPE_TABLE);
                            }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                }
                    if (schema == null) {
        if (objectType == RelationalObjectType.TYPE_VIEW_COLUMN) {
import org.jkiss.code.Nullable;

    ) throws SQLException {
        if (objectType == VerticaObjectType.PROJECTION) {
            VerticaObjectType.VIEW
public class VerticaStructureAssistant extends JDBCStructureAssistant<JDBCExecutionContext> {
        if (objectType == RelationalObjectType.TYPE_CONSTRAINT) {
                    result.add(new AbstractObjectReference<>(objectName, schema, description, isFK ? GenericTableForeignKey.class : VerticaConstraint.class, RelationalObjectType.TYPE_CONSTRAINT) {
                    VerticaSchema schema = (VerticaSchema) (parentSchema != null ? parentSchema : dataSource.getSchema(schemaName));
                    String tableName = dbResult.getString(2);
        String sql = "SELECT n.node_name" + (searchInComments ? ", c.\"comment\"" : "") +
        String sql = "SELECT p.projection_schema, p.projection_name" + (searchInComments ? ",c.\"comment\"" : "") +
        if (objectType == VerticaObjectType.SEQUENCE) {
        };

                            return object;
                            if (isFK) {
            " FROM v_catalog.nodes n \n" +
/*
 *
    public DBSObjectType[] getAutoCompleteObjectTypes() {
                        }
                    final String description = searchInComments ? dbResult.getString(5) : "";
    }
            "WHERE n.node_name";
                    if (schema == null)
            RelationalObjectType.TYPE_TABLE_COLUMN,
                    });
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
            }
                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
            "WHERE " + (searchInComments ? "(" : "") + "p.projection_name";
        StringBuilder objectTypeClause = new StringBuilder(100);
            findNodesByMask(session, params, references, searchInComments);
                            }
                                        List<DBSObjectReference> result) throws SQLException {
                dbStat.setString(2, params.getMask());
                            } else {
                    final String schemaName = dbResult.getString(1);
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
            }

            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        @Override
        @NotNull List<DBSObjectReference> result,
            }
        }
                            }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void findConstraintsByMask(@NotNull JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
    @Override
                            VerticaProjection object = getContainer().getProjection(monitor, objectName);

    private void findProjectionsByMask(@NotNull JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
        @NotNull ObjectsSearchParams params,
                            return object;
                                throw new DBException("Can't find constraint table '" + tableName + "' in '"
            findProjectionsByMask(session, parentSchema, params, references, searchInComments);
                        @Override
            }
        if (objectType == RelationalObjectType.TYPE_TABLE_COLUMN) {

            if (searchInComments) {
        if (parentSchema != null) stmt += " AND SCHEMA_NAME = ?";
                    result.add(new AbstractObjectReference<>(objectName, schema, description, VerticaProjection.class, VerticaObjectType.PROJECTION) {
        }

        stmt += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
            RelationalObjectType.TYPE_TABLE,
            }
                dbStat.setString(searchInComments ? 3 : 2, parentSchema.getName());
    @NotNull
            " FROM v_catalog.projections p\n" +
 * See the License for the specific language governing permissions and
        if (searchInComments) {
                            return object;
                while (!monitor.isCanceled() && dbResult.next()) {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        sql += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";

            (searchInComments ? "LEFT JOIN v_catalog.comments c ON s.sequence_id = c.object_id\n" : "") +
            }
    protected void findObjectsByMask(@NotNull JDBCExecutionContext executionContext, @NotNull JDBCSession session, @NotNull DBSObjectType objectType, @NotNull ObjectsSearchParams params, @NotNull List<DBSObjectReference> references) throws DBException, SQLException {
    ) throws SQLException {
            findSequencesByMask(session, parentSchema, params, references, searchInComments);
                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
        }
        if (parentSchema != null) sql += " AND SCHEMA_NAME = ?";
            dbStat.setString(1, params.getMask());
                dbStat.setString(2, params.getMask());
                    final String schemaName = dbResult.getString(1);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
                            }
                                throw new DBException("Can't find object '" + objectName + "' in '"
            VerticaObjectType.NODE
import org.jkiss.dbeaver.ext.generic.model.*;

                    String schemaName = dbResult.getString(1);
 * You may obtain a copy of the License at
                    String columnName = dbResult.getString(3);
            objectTypeClause.append("'VIEW'");
        sql += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
        }
    }
    private void findTableColumnsByMask(JDBCSession session, GenericSchema parentSchema, @NotNull ObjectsSearchParams params,
        @NotNull ObjectsSearchParams params,
        sql += "\nORDER BY s.schema_name, tc.constraint_name LIMIT " + (params.getMaxResults() - result.size());
 * Copyright (C) 2010-2024 DBeaver Corp and others
                            DBSObject object = objectType.findObject(monitor, schema, objectName);
import org.jkiss.code.NotNull;
                            GenericTableBase object = getContainer().getTable(monitor, tableName);
        }
            "WHERE " + (searchInComments ? "(" : "") + " s.sequence_name";
    }
        DBRProgressMonitor monitor = session.getProgressMonitor();

 *
        if (parentSchema != null) sql += " AND p.projection_schema = ?";
            RelationalObjectType.TYPE_CONSTRAINT,
                    final String description = searchInComments ? dbResult.getString(4) : "";
                dbStat.setString(searchInComments ? 3 : 2, parentSchema.getName());

                    });
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public DBSObjectType[] getSupportedObjectTypes() {
        DBRProgressMonitor monitor = session.getProgressMonitor();
                }
                }
    }
            }
        return new DBSObjectType[]{
                            if (object == null) {
                while (!monitor.isCanceled() && dbResult.next()) {
                                throw new DBException("Can't find constraint '" + objectName + "' in '"
                                constraint = tableBase.getAssociation(monitor, objectName);
        String sql = "SELECT s.sequence_schema, s.sequence_name" + (searchInComments ? ", c.\"comment\"" : "")
                }
                    final String description = searchInComments ? dbResult.getString(3) : "";
        }
                    if (schema == null)
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
        @NotNull List<DBSObjectReference> result,
                dbStat.setString(2, params.getMask());
                        continue; // filtered
        }
            dbStat.setString(1, params.getMask());
            }
        if (dataSource instanceof VerticaDataSource) {
        }
        GenericSchema parentSchema = params.isGlobalSearch() ? null : params.getParentObject() instanceof GenericSchema ? (GenericSchema) params.getParentObject() : null;
            RelationalObjectType.TYPE_VIEW_COLUMN,
                            GenericTableColumn column = object.getAttribute(monitor, columnName);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
                    final String schemaName = dbResult.getString(1);
        sql += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
            RelationalObjectType.TYPE_TABLE,

            objectTypeClause.append("'TABLE','SYSTEM TABLE'");
                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
            }
            findTablesAndViewsByMask(session, parentSchema, params, references, searchInComments);
        @Nullable GenericSchema parentSchema,
                    }

            dbStat.setString(1, params.getMask());
            " FROM v_catalog.table_constraints tc\n" +
    }
                        }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
            }
        DBRProgressMonitor monitor = session.getProgressMonitor();
                    });
                    final String tableName = dbResult.getString(2);
                            }
        this.dataSource = dataSource;
        @NotNull JDBCSession session,
        boolean avoidCommentsReading = false;
                    }
                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
        sql += "\nORDER BY n.node_name LIMIT " + (params.getMaxResults() - result.size());
                                throw new DBException("Can't find column view '" + tableName + "' in '"
    ) throws SQLException {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                while (!monitor.isCanceled() && dbResult.next()) {
                    if (schema == null) {
                    }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    if (schema == null) {
    private void findSequencesByMask(
                    final String schemaName = dbResult.getString(1);
                    final String objectName = dbResult.getString(2);
                            }
            if (parentSchema != null) {
                                       @NotNull List<DBSObjectReference> result, boolean searchInComments) throws SQLException {
            sql += " OR c.\"comment\"" + (params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?");
                }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Unless required by applicable law or agreed to in writing, software
        sql += "\nORDER BY p.projection_schema, p.projection_name LIMIT " + (params.getMaxResults() - result.size());
    }
                            }
                                throw new DBException("Column '" + columnName + "' not found in table '"
        }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                dbStat.setString(searchInComments ? 3 : 2, parentSchema.getName());

                                    + DBUtils.getFullQualifiedName(dataSource, getContainer()) + "'");
import org.jkiss.dbeaver.model.DBUtils;
                    });

                            GenericSequence object = getContainer().getSequence(monitor, objectName);
            if (searchInComments) {
    protected JDBCDataSource getDataSource() {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            findConstraintsByMask(session, parentSchema, params, references, searchInComments);
                        continue; // filtered

        }
                    final String description = searchInComments ? dbResult.getString(3) : "";
    private final VerticaDataSource dataSource;
import org.jkiss.dbeaver.DBException;
                    });
        sql += params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?";
        List<DBSObjectType> objectTypesList = Arrays.asList(params.getObjectTypes());
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        }
                    final String tableType = dbResult.getString(3);
                    final String constraintType = dbResult.getString(4);
                        }
                            GenericTableBase tableBase = getContainer().getTable(monitor, tableName);
            VerticaObjectType.VIEW,

                            if (object == null) {
                                       List<DBSObjectReference> result) throws SQLException {
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
    }
        @NotNull JDBCSession session,
            }
                    result.add(new AbstractObjectReference<GenericObjectContainer>(columnName, schema, null, GenericTableColumn.class, RelationalObjectType.TYPE_VIEW_COLUMN) {
        }
            sql += " OR remarks" + (params.isCaseSensitive() ? " LIKE ?" : " ILIKE ?") + ")";
            VerticaObjectType.PROJECTION,
            (searchInComments ? ",c.\"comment\"" : "") +
                    GenericSchema schema = parentSchema != null ? parentSchema : dataSource.getSchema(schemaName);
            avoidCommentsReading = ((VerticaDataSource) dataSource).avoidCommentsReading();
                            return column;
    private void findTablesAndViewsByMask(
                dbStat.setString(2, params.getMask());
    @Override
                    });
        if (objectType == VerticaObjectType.NODE) {
    @NotNull
