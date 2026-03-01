        @NotNull GenericStructContainer container,
import java.util.List;
    }
            name,
                            int procType = JDBCUtils.safeGetInt(dbResult, "RETURNS_RESULT");
        return new H2Sequence(
        } else {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                                type = DBSProcedureType.FUNCTION;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return true;
    @Override
            JDBCPreparedStatement dbStat;
                            if (procType == 2) {
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        if (tableType != null && isView(tableType)) {
import org.jkiss.code.Nullable;
        if (!column.isPersisted()) {
            return new GenericView(container, tableName, tableType, dbResult);
                            }
        }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        }
        } else {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
        }
                return DBSEntityConstraintType.UNIQUE_KEY;
 * you may not use this file except in compliance with the License.
            return dbStat;
            dbStat = session.prepareStatement("SELECT tc.*, tc.CONSTRAINT_NAME AS PK_NAME, ccu.COLUMN_NAME, cc.CHECK_CLAUSE AS CHECK_EXPRESSION FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS tc LEFT JOIN\n" +
    ) {
        return new H2Table(container, tableName, tableType, dbResult);
    }
import org.jkiss.dbeaver.DBDatabaseException;
    @NotNull
                dbStat.setString(1, container.getName());
                                resultType = GenericFunctionResultType.UNKNOWN;
    @Override
            description,

        @Nullable GenericCatalog catalog,
            if (forParent != null) {
                    "SELECT VIEW_DEFINITION FROM INFORMATION_SCHEMA.VIEWS " +

        }
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @NotNull
            String description = JDBCUtils.safeGetString(dbResult, "REMARKS");
    }
            constraintColumns.add(new GenericTableConstraintColumn(object, tableColumn, tableColumn.getOrdinalPosition()));

    }
            if (CommonUtils.isNotEmpty(columnList) && !CommonUtils.isEmpty(attributes)) {
        // Maybe someday something will change, but until we will show anything for system views
                "WHERE c.CONSTRAINT_TYPE <> 'REFERENTIAL' AND c.CONSTRAINT_SCHEMA = ? "

 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable JDBCResultSet dbResult
                    for (String columnName : strings) {
    @Override
import org.jkiss.utils.ArrayUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Optional<? extends GenericTableColumn> match = attributes.stream().filter(item -> DBUtils.getUnQuotedIdentifier(dataSource, item.getName()).equals(columnList)).findFirst();
    @Override
            return "AUTO_INCREMENT";
                }
    public boolean supportsCheckConstraints() {
    }
            "SELECT * FROM INFORMATION_SCHEMA.SEQUENCES WHERE SEQUENCE_SCHEMA=?");
        // Some columns are changed in H2 version 2 and some new columns added

                    // It can be only one key column
        return new H2DataSource(monitor, container);
                        String aliasName = JDBCUtils.safeGetString(dbResult, new2H2 ? "ROUTINE_NAME" : "ALIAS_NAME");
                                type = DBSProcedureType.FUNCTION;
        }
    @Override
 *
 * DBeaver - Universal Database Manager
        @Nullable String tableType,
import org.jkiss.dbeaver.model.DBUtils;
            }
                        H2RoutineAlias routineAlias = new H2RoutineAlias(container, aliasName, description, type, resultType, dbResult);
            List<GenericTableConstraintColumn> constraintColumns = new ArrayList<>();
    public GenericTableBase createTableOrViewImpl(
    }
/**
        if (sourceObject.getSchema() != null && !sourceObject.getSchema().isSystem()) {
            if ("CHECK".equals(type)) {
            dbStat.setString(1, owner.getName());
        return super.getViewDDL(monitor, sourceObject, options);
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            GenericTableColumn tableColumn = match.get();
        statement.setString(1, container.getSchema().getName());
    }
 *
        super();
    public boolean isTableCommentEditable() {
                + (forParent != null ? "AND tc.TABLE_NAME = ?" : ""));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.utils.CommonUtils;
            }
    private void findConstraintColumns(GenericUniqueKey object, GenericDataSource dataSource, List<GenericTableConstraintColumn> constraintColumns, String columnList, List<? extends GenericTableColumn> attributes) {
                if (columnList.contains(",")) {
    public boolean isSystemSchema(GenericSchema schema) {
                        }
        }
            return null;
                            return dbResult.getString(1);
    public void loadProcedures(@NotNull DBRProgressMonitor monitor, @NotNull GenericObjectContainer container) throws DBException {
            JDBCUtils.safeGetLong(dbResult, "INCREMENT"),
                throw new DBDatabaseException(e, dataSource);
        return true;
                        GenericFunctionResultType resultType = null;
    @Nullable
                "LEFT JOIN INFORMATION_SCHEMA.CHECK_CONSTRAINTS cc ON tc.CONSTRAINT_SCHEMA = cc.CONSTRAINT_SCHEMA AND tc.CONSTRAINT_NAME = cc.CONSTRAINT_NAME\n" +
        String description = JDBCUtils.safeGetString(dbResult, "REMARKS");
                    }
        boolean isVersion2 = container.getDataSource().isServerVersionAtLeast(2, 0);
import org.jkiss.dbeaver.ext.generic.model.*;
                            if ("FUNCTION".equals(routineType)) {
    public boolean supportsUniqueKeys() {
                    dbStat.setString(1, sourceObject.getContainer().getName());

            }

        return true;
        return new H2Schema(dataSource, catalog, schemaName);
    }
    }
        return super.createConstraintColumnsImpl(session, parent, object, pkObject, dbResult);
    @NotNull
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container)

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (CommonUtils.isNotEmpty(type)) {
        boolean new2H2 = container.getDataSource().isServerVersionAtLeast(2, 0);
 */
        if (new2H2) {
        );
                        container.addProcedure(routineAlias);
            try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read H2 view source")) {
    @Override
import java.util.ArrayList;
            dbStat = session.prepareStatement("SELECT c.*, c.CONSTRAINT_NAME AS PK_NAME FROM INFORMATION_SCHEMA.\"CONSTRAINTS\" c \n" +
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) {
            String columnList = JDBCUtils.safeGetString(dbResult, "COLUMN_LIST");
    @Override
    public boolean isTableColumnCommentEditable() {
    }
        return "AUTO_INCREMENT";
 * H2MetaModel
import java.sql.SQLException;
            return DBSEntityConstraintType.PRIMARY_KEY;
            isVersion2 ? JDBCUtils.safeGetLong(dbResult, "MAXIMUM_VALUE") : JDBCUtils.safeGetLong(dbResult, "MAX_VALUE"),
    }
        return true;
        }
 * See the License for the specific language governing permissions and
    @Override
        return super.getUniqueConstraintType(dbResult);
                    // We have a few columns in the key. Let's find them all.
        String name = JDBCUtils.safeGetString(dbResult, "SEQUENCE_NAME");
        @NotNull GenericDataSource dataSource,
package org.jkiss.dbeaver.ext.h2.model;
    public H2MetaModel() {
public class H2MetaModel extends GenericMetaModel {
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public GenericTableConstraintColumn[] createConstraintColumnsImpl(@NotNull JDBCSession session, @NotNull GenericTableBase parent, @NotNull
            GenericDataSource dataSource = sourceObject.getDataSource();

 * limitations under the License.
import org.jkiss.code.NotNull;
                            continue;
            }
    ) {
                throw new DBDatabaseException(e, container.getDataSource());
    public GenericUniqueKey createConstraintImpl(@NotNull GenericTableBase table, String constraintName, DBSEntityConstraintType constraintType, JDBCResultSet dbResult, boolean persisted) {
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
                "INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE ccu ON tc.CONSTRAINT_SCHEMA = ccu.CONSTRAINT_SCHEMA AND tc.CONSTRAINT_NAME = ccu.CONSTRAINT_NAME\n" +
    GenericUniqueKey object, GenericMetaObject pkObject, JDBCResultSet dbResult) throws DBException {
    @Override
*/
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
    @Override
            isVersion2 ? JDBCUtils.safeGetLong(dbResult, "MINIMUM_VALUE") : JDBCUtils.safeGetLong(dbResult, "MIN_VALUE"),

                + (forParent != null ? "AND c.TABLE_NAME = ?" : ""));
            dbResult
        return new H2Constraint(table, constraintName, null, constraintType, persisted, null);
        throws SQLException {
    @Override
import java.util.Map;
            return new H2Constraint(table, constraintName, description, constraintType, persisted, checkExpression);
                return DBSEntityConstraintType.CHECK;

        return statement;
                                resultType = GenericFunctionResultType.UNKNOWN;
                } else {
                        }
    @Override
        if (!owner.getDataSource().isServerVersionAtLeast(2, 0)) {
            return null;
        if (!dataSource.isServerVersionAtLeast(2, 0) && dbResult != null) { // H2 Version 2 has COLUMN_NAME and works fine
        return schema.getName().equals("INFORMATION_SCHEMA");
                        DBSProcedureType type = DBSProcedureType.PROCEDURE;
        }


                dbStat.setString(2, forParent.getName());
                        if (CommonUtils.isEmpty(aliasName)) {
            return ArrayUtils.toArray(GenericTableConstraintColumn.class, constraintColumns);
        }
    public String getAutoIncrementClause(GenericTableColumn column) {

}
        if (dbResult != null) {

                        String description = JDBCUtils.safeGetString(dbResult, "REMARKS");
        String type = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_TYPE");
 * You may obtain a copy of the License at
                    findConstraintColumns(object, dataSource, constraintColumns, columnList, attributes);
    }
        @NotNull String schemaName
        return super.getTableDDL(monitor, sourceObject, options);
        return true;
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public JDBCStatement prepareUniqueConstraintsLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable GenericTableBase forParent) throws SQLException, DBException {

    @Override
        JDBCPreparedStatement statement = session.prepareStatement(
                        return "-- H2 view definition not found";
        GenericDataSource dataSource = parent.getDataSource();
            }
import java.util.Optional;
    }
                }
                    dbStat.setString(2, sourceObject.getName());
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
 *
            // For existing columns auto-increment will in DEFAULT clause
    @Override

    public GenericSchema createSchemaImpl(
/*

    @Override
 * Unless required by applicable law or agreed to in writing, software
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) throws DBException, SQLException {
                        findConstraintColumns(object, dataSource, constraintColumns, columnName, attributes);
            String checkExpression = JDBCUtils.safeGetString(dbResult, "CHECK_EXPRESSION");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    }
    }
            return dbStat;
            isVersion2 ? JDBCUtils.safeGetLong(dbResult, "BASE_VALUE") : JDBCUtils.safeGetLong(dbResult, "CURRENT_VALUE"),
            container,
                        }
                        if (dbResult.nextRow()) {
            if ("UNIQUE".equals(type)) {
                            }
            }
        // But VIEW_DEFINITION field is empty for system views in the INFORMATION_SCHEMA.VIEWS
    @Override
                "WHERE tc.CONSTRAINT_TYPE NOT IN ('REFERENTIAL', 'FOREIGN KEY') AND tc.CONSTRAINT_SCHEMA = ?"
                    while (dbResult.nextRow()) {

            if (forParent != null) {
    }
                    }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                        } else {
            JDBCPreparedStatement dbStat;
                        if (new2H2) {
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            sql = "SELECT * FROM INFORMATION_SCHEMA.FUNCTION_ALIASES WHERE ALIAS_SCHEMA = ?";
                }
    @Override
        // We tried here using SELECT SQL FROM INFORMATION_SCHEMA.TABLES, but it is not good
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load functions aliases")) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                    String[] strings = columnList.split(",");
        } else {
        String sql;
        }

            } catch (SQLException e) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        "WHERE TABLE_SCHEMA=? AND TABLE_NAME=?")) {
                    }
        @Nullable String tableName,
                dbStat.setString(2, forParent.getName());
        if (match.isPresent()) {

            List<? extends GenericTableColumn> attributes = parent.getAttributes(dbResult.getSession().getProgressMonitor());
        }
    }
    @Override
    }
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
/*
        // And this SQL result does not have info about keys or indexes

        // Since version 2 H2 keeps part of data in the system views.
    }

            dbStat.setString(1, owner.getName());
            sql = "SELECT * FROM INFORMATION_SCHEMA.ROUTINES WHERE ROUTINE_SCHEMA = ?";
                            String routineType = JDBCUtils.safeGetString(dbResult, "ROUTINE_TYPE");
        if (CommonUtils.isEmpty(name)) {
