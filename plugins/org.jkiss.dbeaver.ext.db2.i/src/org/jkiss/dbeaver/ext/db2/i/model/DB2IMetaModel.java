        }
            (forParent != null ? " AND tc.TABLE_NAME = ?" : ""));
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/**
                            definition = SQLFormatUtils.formatSQL(dataSource, definition);
        } else {
                        String definition = dbResult.getString(1);
            return DBSEntityConstraintType.CHECK;
        return dbStat;
        if ("UNIQUE".equals(constraintType)) {
            "",
                dbStat.setString(1, sourceObject.getContainer().getName());
        GenericDataSource dataSource = sourceObject.getDataSource();
        } catch (SQLException e) {
        return true;
import org.jkiss.dbeaver.DBDatabaseException;
 * DB2IMetaModel
            dbStat.setString(2, ownerName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
package org.jkiss.dbeaver.ext.db2.i.model;
            String ownerName = owner.getName();

    }
    }
                    }
                    if (dbResult.nextRow()) {
 * limitations under the License.
import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(DB2IMetaModel.class);
                            definition = "-- View definition not available";
                "SELECT ROUTINE_DEFINITION FROM QSYS2.SYSROUTINES " +
                    return "-- DB2 i view definition not found";
    @Override
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read DB2 for i procedure source")) {

        String sequenceName = JDBCUtils.safeGetString(dbResult, "SEQUENCE_NAME");
    public GenericUniqueKey createConstraintImpl(@NotNull GenericTableBase table, String constraintName, DBSEntityConstraintType constraintType, JDBCResultSet dbResult, boolean persisted) {
                dbStat.setString(1, sourceObject.getContainer().getName());
        GenericDataSource dataSource = sourceObject.getDataSource();
    public JDBCStatement prepareUniqueConstraintsLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable GenericTableBase forParent) throws SQLException {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            dbStat.setString(3, schemaName);
            String schemaName = forParent.getSchema().getName();
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) {
            "\nUNION ALL" +
            "SELECT * FROM \"SYSIBM\".SEQUENCES\n" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.model.DBUtils;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) {
    @Override
            container,
                        String definition = dbResult.getString(1);
                        }
            sequenceName,
                            // SYS views as example can have empty definition

                    if (dbResult.nextRow()) {
                    "WHERE ROUTINE_SCHEMA=? AND ROUTINE_NAME=?"))
    }
                }
        }
import java.util.Map;
                        if (definition != null) {
    @Override
            throw new DBDatabaseException(e, dataSource);
                        return definition;
        String checkClause = null;
            return DBSEntityConstraintType.UNIQUE_KEY;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                "SELECT VIEW_DEFINITION FROM QSYS2.SYSVIEWS " +
        if (CommonUtils.isEmpty(sequenceName)) {
            }
    public boolean supportsCheckConstraints() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read DB2I view source")) {
 *
                dbStat.setString(2, sourceObject.getName());
 * you may not use this file except in compliance with the License.
        return new DB2ITable(container, tableName, tableType, dbResult);
            JDBCUtils.safeGetLong(dbResult, "MAXIMUM_VALUE"),
 * DBeaver - Universal Database Manager
    @Override

}
            dbStat.setString(1, schemaName);
            "LEFT OUTER JOIN \"SYSIBM\".TABLE_CONSTRAINTS tc ON tc.CONSTRAINT_SCHEMA = cc.CONSTRAINT_SCHEMA AND tc.CONSTRAINT_NAME = cc.CONSTRAINT_NAME\n" +

        if (dbResult != null) {
    @Override
        } else if ("CHECK".equals(constraintType)) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;


                        return definition;
    public DB2IMetaModel() {
                        if (CommonUtils.isNotEmpty(definition)) {
                        } else {
    }
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
            return null;
    }
            "\nSELECT cc.CONSTRAINT_NAME AS PK_NAME, tc.TABLE_NAME, 0 as KEY_SEQ, '' as COLUMN_NAME, 'CHECK' AS CONSTRAINT_TYPE, cc.CHECK_CLAUSE FROM QSYS2.CHECK_CONSTRAINTS cc\n" +
    @NotNull
        return new DB2IConstraint(table, constraintName, null, constraintType, persisted, checkClause);
        dbStat = session.prepareStatement("SELECT K.CONSTRAINT_NAME AS PK_NAME, K.TABLE_NAME, K.COLUMN_POSITION AS KEY_SEQ, K.COLUMN_NAME, tc.CONSTRAINT_TYPE, '' AS CHECK_CLAUSE FROM QSYS2.SYSKEYCST K\n" +

    @Override
            throw new DBDatabaseException(e, dataSource);

            JDBCUtils.safeGetLong(dbResult, "MINIMUM_VALUE"),
                    return "-- DB2 i procedure definition not found";
    public boolean isTableCommentEditable() {
        }
            return new GenericView(container, tableName, tableType, dbResult);
        return true;
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
    public boolean supportsUniqueKeys() {
 */

            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            "LEFT OUTER JOIN \"SYSIBM\".TABLE_CONSTRAINTS tc ON tc.CONSTRAINT_SCHEMA = K.CONSTRAINT_SCHEMA AND tc.CONSTRAINT_NAME = K.CONSTRAINT_NAME\n" +
        return new GenericSequence(
    public boolean isTableColumnCommentEditable() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            (forParent != null ? " AND K.TABLE_NAME = ?" : "") +
    }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
 *
/*
        return new DB2IDataSource(monitor, container, this);
            null,
    @Override
    }

        if (tableType != null && isView(tableType)) {
                "WHERE SEQUENCE_SCHEMA=? ORDER BY SEQUENCE_NAME");
    }
        dbStat.setString(1, container.getSchema().getName());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *
        if (forParent != null) {
            dbStat.setString(4, tableName);
                        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return true;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        }
        String constraintType = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_TYPE");
            {
            dbStat.setString(2, tableName);
        }
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
        JDBCPreparedStatement dbStat;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
            "WHERE tc.CONSTRAINT_TYPE = 'CHECK' AND cc.CONSTRAINT_SCHEMA = ?" +
        super();
    @Override
    }
                            definition = "CREATE VIEW " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS " +  SQLFormatUtils.formatSQL(dataSource, definition);
                dbStat.setString(2, sourceObject.getName());
    @Override
{
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public boolean isSystemSchema(GenericSchema schema) {
        }
            dbStat.setString(1, ownerName);
import org.jkiss.utils.CommonUtils;
    @Override
import org.jkiss.dbeaver.ext.generic.model.*;
        String schemaName = schema.getName();
        return true;

    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
    }
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;



public class DB2IMetaModel extends GenericMetaModel
    }
        return "QSYS".equals(schemaName) || "QSYS2".equals(schemaName) || "SYSIBM".equals(schemaName) || "SYSPROC".equals(schemaName) || "SYSTOOLS".equals(schemaName);
import org.jkiss.dbeaver.DBException;
    @Override
 */
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import java.sql.SQLException;
        return dbStat;
            String tableName = forParent.getName();
        return true;
    }
    @Override
import org.jkiss.code.NotNull;
    }

        }
import org.jkiss.code.Nullable;
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {

                }
        } catch (SQLException e) {
    }
    public GenericTableBase createTableOrViewImpl(@NotNull GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
        return DBSEntityConstraintType.PRIMARY_KEY;
        JDBCPreparedStatement dbStat = session.prepareStatement(
    }
                    }
                    "WHERE TABLE_SCHEMA=? AND TABLE_NAME=?")) {
            JDBCUtils.safeGetLong(dbResult, "INCREMENT"));
            checkClause = JDBCUtils.safeGetString(dbResult, "CHECK_CLAUSE");
    @NotNull
            "WHERE tc.CONSTRAINT_TYPE <> 'FOREIGN KEY' AND K.CONSTRAINT_SCHEMA = ?" +
