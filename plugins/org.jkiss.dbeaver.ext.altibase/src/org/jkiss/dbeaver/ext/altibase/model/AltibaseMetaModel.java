import org.jkiss.dbeaver.model.struct.DBSObject;

     */
                        if (pkg == null) {
                String exMsg = String.format("Unknown constraint type [NAME] %s [TYPE] %d", 
                    + " SYSTEM_.SYS_PROC_PARSE_ PP, SYSTEM_.SYS_USERS_ U, SYSTEM_.SYS_PROCEDURES_ P"
                );
                        + " AND U.USER_ID = P.USER_ID"
    
                                " U.USER_NAME = ? AND U.USER_ID = S.SYNONYM_OWNER_ID")
        try (JDBCStatement dbStat = prepareProcedurePackagedLoadStatement(session, container)) {
     * Get a specific Library DDL
                        + " , TR.USER_NAME AS TRIGGER_SCHEMA"
                "SELECT u.user_name, l.* FROM system_.sys_database_links_ l, system_.sys_users_ u"
        
            try {
    // Database Links
                + (isNullObject ? "" : " AND l.library_name = ?")

    }
        return new AltibaseDataSource(monitor, container, this);

                    if (monitor.isCanceled()) {

    public AltibaseSchema createSchemaImpl(@NotNull GenericDataSource dataSource, 

        return getDDLFromDbmsMetadata(monitor, sourceObject, null, "DIRECTORY");
                + " c.constraint_type, "
                return DBSEntityConstraintType.NOT_NULL;
                    + " ORDER BY SEQ_NO ASC";
        String ddl = getDDLFromDbmsMetadata(monitor, sourceObject, sourceObject.getSchema().getName(), 
            try {
        }

                                " SYNONYM_OWNER_ID IS NULL" 
    }
 * DBeaver - Universal Database Manager
        
                if (rs != null) {
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
            case 0:
        ResultSet rs = null;
            case 6:
                // get dependent ddl 
        }
                        + " U.USER_NAME = ?"
                        + " U.USER_ID = T.USER_ID "
                } finally {
        GenericMetaObject metaObject = getMetaObject(GenericConstants.OBJECT_TABLE);
        String indexName,
                + " AND STATUS = 0"; // valid
                    + " [BASE OBJECT] " + schemaName + "." + sourceObject.getName(), e);
                                DBSProcedureType.PROCEDURE,
        int valueType,
        return getDDLFromDbmsMetadata(monitor, sourceObject, (String) options.get("SCHEMA"), "SYNONYM");
        dbStat.setString(2, pkgName);
                        + " FROM SYSTEM_.SYS_PACKAGES_ P, SYSTEM_.SYS_USERS_ U"
                nonUnique,
                        JDBCUtils.safeGetString(dbResult, "PK_NAME"), constraintType);
    
            case "SEQUENCE":
                        + " , TDT.TABLE_NAME AS DMLTABLE_NAME"
    }
                + " WHERE l.user_id = u.user_id AND u.user_name = ?"
                + " AND c.constraint_id = ccol.constraint_id"
                        + " WHERE"
                break;

                            } else {
            java.lang.NullPointerException
            String sql;

                        + " ) TDT"
        if (trigger.getParentObject() instanceof GenericTable) {
    
        return new AltibaseSynonym(container,
                                    (subType == 0) ? DBSProcedureType.PROCEDURE : DBSProcedureType.FUNCTION, 
        if (!isNullObject) {
    // Packages
        } finally {
                        + " ON TR.TRIGGER_OID = TDT.TRIGGER_OID");

    @Override
                        + " PACKAGE_NAME, PACKAGE_TYPE, AUTHID, STATUS"
        GenericProcedure procedure;
                                    pkgSchema,
    @Override
                        + ", PP.SUB_TYPE" /* SUB_TYPE 0: procedure, 1: function */

                            + " SEQ_NO ASC";
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject,
                break;
                        + " TRIGGER_OID"
        @NotNull GenericTableBase table,
                        + " , STMT_TYPE"
                        + " SYSTEM_.SYS_USERS_ U"
    public JDBCPreparedStatement prepareProcedurePackagedColumnLoadStatement(JDBCSession session, 
        boolean isNullObject = object == null && objectName == null;
                        + " , SYSTEM_.SYS_TRIGGER_DML_TABLES_"
    // Library
        dbStat.setString(1, container.getName());
        return dbStat;
                        + " FROM system_.sys_procedures_ p, system_.sys_users_ u"
            @NotNull GenericMetaObject tableObject, @NotNull JDBCResultSet dbResult) {
        }
        
        
                + " count(*)"
            }
                table = new AltibaseView(session, owner, tableName, tableType, dbResult);

    public String getIndexDDL(DBRProgressMonitor monitor, AltibaseTableIndex sourceObject, 
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
    /**
            case "TABLE":
        Integer precision,
        String defaultValue,

            if (sourceObject.isSystemGenerated()) {
                             @NotNull Map<String, Object> options) throws DBException {
            addTableDependentDdl(ddl, "COMMENT", monitor, sourceObject, schemaName);
        boolean hasDbmsMetadata;

                        + " , CASE2(TR.EVENT_TIME = 1, 'BEFORE', TR.EVENT_TIME = 2, 'AFTER'," 
        return AltibaseConstants.USER_SYSTEM_.equals(schema.getName());
                    + " WHERE"
    /**

                    + " WHERE"
                                log.warn("Fail to create Package: " + key);
    }
        
                sql = "SELECT"
                + " WHERE"
                            + " ,SYSTEM_.SYS_MATERIALIZED_VIEWS_ MV"
                        if (CommonUtils.isEmpty(procName)) {
        return getDDLFromDbmsMetadata(monitor, sourceObject, (String) options.get("SCHEMA"), "DB_LINK");
         */
        return new AltibasePackage(container, packageName, resultSet);
                }
    /**
            cstmt.setString(2, value);
                        break;

                        + " ORDER BY"

                            // if body found,
        
    // Synonyms

                        + " u.user_name = ?"
                        + "   TR.OWNER_SCHEMA"
                            + " AND VP.USER_ID = U.USER_ID"
    @Override
        } catch (SQLException e) {
                + " ORDER BY link_name ASC");
import java.sql.*;
        } catch (SQLException se) {
        return dbStat;
            jcstmt = session.prepareCall("exec ? := dbms_metadata.get_ddl(?, ?, ?)");
    public boolean supportsCheckConstraints() {
            throw new DBDatabaseException(e, dataSource);
    /**
    public JDBCStatement preparePackageLoadStatement(JDBCSession session, 
                pstmt.setString(2, sourceObject.getName());
        PreparedStatement pstmt = null;
                        + " SYNONYM_NAME, OBJECT_OWNER_NAME, OBJECT_NAME"
    private String geDDLFromCatalog(DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName, String sql, 
        boolean hasParent = (forParent != null);
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
        return ddl.toString();
                        + " FROM"
}
            ddl = getViewProcDDLFromCatalog(monitor, sourceObject, sourceObject.getSchema().getName(), sql);
                        + " FROM "
            jrs.close();
                indexName,
                
                    + " t.user_name = ?"
        @Nullable JDBCResultSet dbResult,
                                container,
                    }
                null, //description

    public JDBCStatement prepareProcedurePackagedLoadStatement(JDBCSession session, 
import org.jkiss.code.Nullable;
                        + " AND U.USER_NAME = ?"
    public String getPackageDDL(DBRProgressMonitor monitor, AltibasePackage sourceObject, int packageType) throws DBException {
            ddl = getTriggerDDLFromCatalog(monitor, trigger, schemaName, sql);
                        + " AND VP.USER_ID = U.USER_ID"
            ddl = getPackageDDLFromCatalog(monitor, sourceObject, sourceObject.getSchema().getName(), sql, hasDbmsMetadata);
    //////////////////////////////////////////////////////
            cstmt = conn.prepareCall("exec dbms_metadata.set_transform_param(?, ?)");
                        }
                log.error(exMsg);

                return DBSEntityConstraintType.PRIMARY_KEY;
                + " (ccol.constraint_col_order + 1) AS KEY_SEQ,"
        CallableStatement cstmt = null;
                                valid,
                cstmt = conn.prepareCall("exec ? := dbms_metadata.get_ddl(?, ?, ?)");
            dbStat.setString(2, object != null ? object.getName() : objectName);
                    + " FROM "
                dbResult);
            log.warn("Can't read DDL", e);
     */
                table = new AltibaseQueue(owner, tableName, tableType, dbResult);
                        + " FROM SYSTEM_.SYS_USERS_ U, SYSTEM_.SYS_PACKAGE_PARAS_ PP, V$DATATYPE D"
                        + " parse"
        if (tableType != null && isView(tableType)) {
        } catch (SQLException e) {
    //////////////////////////////////////////////////////
    public boolean isSystemSchema(GenericSchema schema) {
        long columnSize,
        boolean isPublic = container.getName().equalsIgnoreCase(AltibaseConstants.USER_PUBLIC);
                if (content != null) {
        return dbStat;
        // Key: schemaName.objName, Value: AltibasePackage
        return new AltibaseLibrary(container, resultSet);
            dbStat.setString(2, table.getName()); // table name
                        + " p.*"
            case "SYSTEM VIEW":
import org.jkiss.dbeaver.DBException;
            condition = constraintType.equals(DBSEntityConstraintType.CHECK) ?
        String ddl = "";
        
                    dbResult.close();
 */
        }
    @Override

        return true;
            // Invalid data length.
    }

                persisted);
                        + " [BASE OBJECT] " + schemaName + "." + sourceObject.getName(), e);
                    + " AND P.PROC_NAME = ?"
                        }
                        String pkgName = JDBCUtils.safeGetString(dbResult, "PACKAGE_NAME");
        String sql = "SELECT "
                        }
            } finally {

                return DBSEntityConstraintType.UNIQUE_KEY;
    @Override
        
    }
 * Unless required by applicable law or agreed to in writing, software
     */
        }
    }
            if (tableType.equalsIgnoreCase(AltibaseConstants.OBJ_TYPE_MATERIALIZED_VIEW)) {
    
                        + " FROM "
    @Override
        }
    /**

            if (dbResult != null) {
        }
                "SELECT"
    }
        if (CommonUtils.isEmpty(ddlFromMetadata)) {
    /**
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
                // SQLTERMINATOR: F
                        + " AND T.TABLE_NAME = ?"
                        + " WHERE"
                if (monitor.isCanceled()) {
                    }
    /**
            dbStat.setString(2, object != null ? object.getName() : objectName);
    public JDBCStatement prepareSynonymsLoadStatement(@NotNull JDBCSession session, 

                        + " PP.*, D.TYPE_NAME"
        } catch (SQLException e) {
    }
        final JDBCPreparedStatement dbStat = session.prepareStatement(
     */
                    dbResult.close();
                        + " SYSTEM_.SYS_USERS_ U"
                        + " SYSTEM_.SYS_VIEW_PARSE_ VP, SYSTEM_.SYS_USERS_ U, SYSTEM_.SYS_TABLES_ T"
        DBSIndexType indexType,

        
                                : 
        return dbStat;
    
                            }
        if (CommonUtils.isEmpty(ddlFromMetadata)) {
            @Nullable AltibaseDbLink object, @Nullable String objectName) throws SQLException {
     * Get Procedure/Function/Typeset
        if (CommonUtils.isEmpty(ddl)) {
                        + " NVL2(SYNONYM_OWNER_ID, SYNONYM_OWNER_ID, -1) AS SYNONYM_OWNER_ID,"

                        + " , SYSTEM_.SYS_TABLES_ T"
    @Override
            String sql = "SELECT "
        
 * Licensed under the Apache License, Version 2.0 (the "License");

        String schemaName = sourceObject.getContainer().getName();

     * Get a specific Package DDL

        switch (constraintType) {

                    ddl.append(AltibaseConstants.NEW_LINE)
        } else {
                remarks, defaultValue, autoIncrement, autoGenerated
                + " PACKAGE_NAME = 'DBMS_METADATA' "
    }
    /**
                                DBSProcedureType.FUNCTION,
    }
    
        
                + (isNullObject ? "" : " AND l.link_name = ?")
        String ddl = null;
                        log.error("Unknown PSM type found: " + procName + ": " + procType);
    @Override
            // Dependent index
                        + " (SELECT "
            }
 *
    private String getTriggerDDLFromCatalog(DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName, String sql) {
     * Get a specific Job DDL


                }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                    + " U.USER_NAME = ?"
        GenericTableBase table = super.createTableImpl(session, owner, tableObject, dbResult);
                            }
    }
        return getDDLFromDbmsMetadata(monitor, sourceObject, null, "REPLICATION");
                        + " , CASE2(TR.GRANULARITY = 1, 'FOR EACH ROW', TR.GRANULARITY = 12," 
        return new AltibaseSequence(container, dbResult);
     */

                        null,
        String getDepDdlQry = "SELECT dbms_metadata.get_dependent_ddl(?, ?, ?) FROM DUAL";
    public boolean supportsSynonyms(@NotNull GenericDataSource dataSource) {
                if (pstmt != null) {
                            if (procedure != null) {
        
        StringBuilder ddl = new StringBuilder();
            @NotNull GenericStructContainer container) throws SQLException {
 *     http://www.apache.org/licenses/LICENSE-2.0
        
                    }
        if (table != null) {
        dbStat.setString(3, procName);
                        + " AND VP.VIEW_ID = T.TABLE_ID"
    @Override
                + (isNullObject ? "" : " AND d.directory_name = ?")

            cstmt.setString(1, key);
                    case AltibaseConstants.PSM_TYPE_PROCEDURE:
        @Nullable JDBCResultSet dbResult) {

                    + " AND sts.trigger_oid = t.trigger_oid"
    /**
                JDBCUtils.safeGetString(dbResult, "OBJECT_NAME"));

        if (newTriggerName == null) {
                + " AND u.user_id = c.user_id"
                + " u.user_name AS TABLE_SCHEME,"
        return true;
        if (CommonUtils.isEmpty(ddl)) {
    @Override
    //////////////////////////////////////////////////////
                        + " AND T.TABLE_NAME " + ((table == null) ? " IS NOT NULL" : "= ?") + ") TR "
            String triggerName, @NotNull JDBCResultSet dbResult) throws DBException {
    }
        dbStat.setString(1, container.getName());
        if (hasParent) {
 * you may not use this file except in compliance with the License.
        String constraintName,
        }
                    cstmt.close();
            }
    /**
            at Altibase.jdbc.driver.AltibaseParameterMetaData.getParameterMode(AltibaseParameterMetaData.java:31)
                /* Name, type ordering is required to package specification is prior to body. */
     */
        final JDBCPreparedStatement dbStat = session.prepareStatement(
                        tableName,
    }
    }
            case 3:
                        + " , T.TABLE_NAME"
            qry.append(" AND t.table_name = ?");

    @Override
        

        JDBCPreparedStatement jpstmt = null;
import java.util.HashMap;
                tableType,
                    while (dbResult.next()) {
            case 2:
                pstmt.setString(1, depObjectType);
    private static final Log log = Log.getLog(AltibaseMetaModel.class);
            at org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCCallableStatementImpl.<init>(JDBCCallableStatementImpl.java:115)
        }
                columnSize,
    //////////////////////////////////////////////////////
    }
            } else {

                        .append(altiIndex.getObjectDefinitionText(monitor, options))
                + " FROM"
                content = GenericUtils.safeGetString(metaObject, jrs, colname);
        
    // Procedure load
        String remarks,
                + " AND ccol.column_id = col.column_id");
            @NotNull GenericStructContainer container, @NotNull GenericTableBase parent, 
        ddl = getDDLFromDbmsMetadata(monitor, trigger, schemaName, "TRIGGER");
    }
                        break;
        String pkgSchema = container.getName();
    /**
                dbResult);
            schemaName = trigger.getParentObject().getParentObject().getName();
                        + " , TR.IS_ENABLE"
    }
                                    null);
import org.jkiss.dbeaver.ext.altibase.AltibaseUtils;
     * Get a specific Replication DDL
    public GenericTableColumn createTableColumnImpl(
    @Override
                        + " ,U.USER_NAME AS OWNER_SCHEMA"
                        + " WHERE"
    }
                
    public GenericSynonym createSynonymImpl(@NotNull JDBCSession session, 
        return hasDbmsMetadataPacakge;
        String ddlFromMetadata;
                return new AltibaseView(
        Map<String, AltibasePackage> packageMap = new HashMap<String, AltibasePackage>();

            schemaName = trigger.getParentObject().getName();
                        + " WHERE"
     * Get DDL from DBMS_METADATA package in case of dependent DDL.
                AltibaseTableIndex altiIndex = (AltibaseTableIndex) index;
        dbStat.setString(1, container.getName()); // user name
                        + " U.USER_NAME = ?"
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
        
            JDBCSession session, Map<String, AltibasePackage> packageMap) throws SQLException, DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private void loadPackageDepedentProcedures(DBRProgressMonitor monitor, @NotNull GenericObjectContainer container, 

    /**
    public boolean isTableCommentEditable() {
    private String getDDLFromDbmsMetadata(DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName, String objectType) {
                try {
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, 
        return table;
                        null,
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
            Map<String, Object> options) throws DBException {
        
        long cardinality,
            @Nullable GenericCatalog catalog, @NotNull String schemaName) throws DBException {
    /**

    ) {
     * Create Package implementation
     */
    }
        if (CommonUtils.isEmpty(ddl)) {
        if (dbResult != null) {
                    procName = JDBCUtils.safeGetString(dbResult, "PROC_NAME");
        return geDDLFromCatalog(monitor, sourceObject, schemaName, sql, "SUBSTRING", false);
    @Override
     * Get DDL from DBMS_METADATA package
                        procedure = new AltibaseProcedureStandAlone(

        } 
    
        
            @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) {
            dbStat.executeStatement();
    /**
    /**
     */
                        + " AND P.PACKAGE_OID = PP.PACKAGE_OID"
     * Create DbLink implementation
                                    container,
                        + " WHERE"
                    + " AND PP.PACKAGE_OID = P.PACKAGE_OID"
        String content = null;

            } catch (SQLException e) {
        return new AltibaseConstraint(table, constraintName, null, constraintType, persisted, condition, validated);
                "",
                            + " SYSTEM_.SYS_VIEW_PARSE_ VP"
        return ddl;

                    rs.close();
        return true;
        final JDBCPreparedStatement dbStat = session.prepareStatement(
                Connection conn = session.getOriginal();
                cstmt.close();
            jrs = jpstmt.executeQuery();
    
    }
    }

                    break;
                        + " ORDER BY PACKAGE_NAME, PACKAGE_TYPE ASC"); 
        int radix,
        return geDDLFromCatalog(monitor, sourceObject, schemaName, sql, "PARSE", false);
            // Comment

        return ddl;
                        + " U.USER_NAME = ?"
        return getDDLFromDbmsMetadata(monitor, sourceObject, null, "JOB");
     * Statement to load Library
                        + " and u.user_id = p.user_id"
                    while (dbResult.next()) {
        if (depDdl != null && depDdl.length() > 0) {
                + "WHERE u.user_id = l.user_id AND u.user_name =  ? "
                
    }
                container,
    /**

    /**
     * 
    private String getDepDDLFromDbmsMetadata(DBRProgressMonitor monitor, DBSObject sourceObject, 
            if (jrs.next()) {
        long charLength,
                        + " AND ( PARA_ORDER = 1 OR PARA_ORDER = 0 )"); /* 0 is if no parameter, 1 is the first parameter if any */
     */
                                    true, // No way to determine package-dependant procedure status from Altibase metadata
                                pkg.setStatus(JDBCUtils.safeGetBoolean(dbResult, "STATUS", "0"));
                // SQLTERMINATOR: T
                    }
    @Override
                }
        depDdl = getDepDDLFromDbmsMetadata(monitor, sourceObject, schemaName, depObjType);
            JDBCSession session, Map<String, AltibasePackage> packageMap) throws SQLException, DBException {
                    default:
                        + " FROM "
        
        final JDBCPreparedStatement dbStat = session.prepareStatement(qry.toString());
    }
                    + " substring"
     */
        if (!isNullObject) {

            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
                        tableType,
            dbStat.setString(1, container.getName());
        return dbStat;
                        + " PP.PACKAGE_NAME"

 * distributed under the License is distributed on an "AS IS" BASIS,

            while (jrs.next()) {
        }
        JDBCResultSet dbResult,
                        + " TDT.STMT_TYPE IS NULL, NULL, 'Unknown') AS DML_STMT_TYPE"
            ddl.append(AltibaseConstants.NEW_LINE).append(depDdl).append(AltibaseConstants.NEW_LINE);
                }
            at org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCFactoryDefault.createCallableStatement(JDBCFactoryDefault.java:48)
            loadPackageDepedentProcedures(monitor, container, session, packageMap); 
                        + " AND T.TABLE_TYPE = 'V'"
                                valid,
     * Create Library implementation
public class AltibaseMetaModel extends GenericMetaModel {

    //////////////////////////////////////////////////////
            ddl.append(ddlFromMetadata).append(";").append(AltibaseConstants.NEW_LINE);
                        + " TABLE_NAME, CURRENT_SEQ, START_SEQ, INCREMENT_SEQ, CACHE_SIZE, MAX_SEQ, MIN_SEQ, IS_CYCLE"
                    + " system_.sys_triggers_ t"
 * Altibase DataSource
        return ddl.toString();
                return AltibaseConstraint.TIMESTAMP;
    public JDBCStatement prepareLibraryLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container,
    private void loadPSMs(DBRProgressMonitor monitor, @NotNull GenericObjectContainer container, 
import org.jkiss.dbeaver.ext.generic.model.*;
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject,
            dbStat.setString(2, object != null ? object.getName() : objectName);
                    switch (procType) {
     * Statement to load package dependent procedure/function
        return dbStat;
                "SELECT"
    public JDBCStatement prepareTableTriggersLoadStatement(@NotNull JDBCSession session, 
                JDBCUtils.safeGetInt(dbResult, "SYNONYM_OWNER_ID"),
            String sql = "SELECT "
                    (packageType == AltibaseConstants.PACKAGE_TYPE_SPEC) ? "PACKAGE_SPEC" : "PACKAGE_BODY");
            } 
                        + " FROM"
            if (se.getSQLState().equals(AltibaseConstants.SQL_STATE_TOO_LONG)) {
            }
    //////////////////////////////////////////////////////
    ) {
                + "WHERE u.user_id = d.user_id AND u.user_name =  ? "

package org.jkiss.dbeaver.ext.altibase.model;
            */
                        + " AND T.TABLE_TYPE= 'S'"
                + " ORDER BY library_name ASC");
    public GenericUniqueKey createConstraintImpl(
        String ddlFromMetadata;
                        dbResult);
    // Procedure/Function/Typeset
        dbStat.setString(1, container.getName());
import org.jkiss.dbeaver.Log;

     * Get dependent objects of a table to table DDL, such as comment. 
    @Override
        final JDBCPreparedStatement dbStat = session.prepareStatement(
                        + " WHERE"
    private String getPackageDDLFromCatalog(DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName, String sql, 
        
                        + " AND U.USER_ID = PP.USER_ID"

            }
                hasDbmsMetadataPacakge = (jrs.getInt(1) == 2);
        return dbStat;
                              @NotNull Map<String, Object> options) throws DBException {
    /**
        @Nullable String tableName,
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Get Dependent DDL from DBMS_METADATA")) {
        if (table == null) {
    public GenericTableBase createTableImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, 

                        int subType = JDBCUtils.safeGetInt(dbResult, "SUB_TYPE");
                }
    public AltibaseDbLink createDbLinkImpl(GenericStructContainer container, JDBCResultSet resultSet) {
            if (e.getErrorCode() != AltibaseConstants.EC_DBMS_METADATA_NOT_FOUND) {
            case "SYSTEM TABLE":
                JDBCUtils.safeGetString(dbResult, "SYNONYM_NAME"),
    @NotNull
                        tableName,
    
                if (cstmt != null) {
            loadPackages(monitor, container, session, packageMap);
                + " c.constraint_name AS PK_NAME, "
        }
     */
                        /* left outer join: DML target table could be null */
        
            result = cstmt.execute();
                        + " ORDER BY TABLE_NAME ASC");
            @Nullable AltibaseLibrary object, @Nullable String objectName) throws SQLException {
    public AltibaseTableIndex createIndexImpl(
    
        ddlFromMetadata = getDDLFromDbmsMetadata(monitor, sourceObject, schemaName, AltibaseConstants.DBOBJ_INDEX);

            String sql = "SELECT "
    }
        if (CommonUtils.isEmpty(newTriggerName)) {
                return DBSEntityConstraintType.FOREIGN_KEY;
        dbStat.setString(1, container.getName());
    }

            JDBCSession session) throws SQLException, DBException {
    @Override
 * limitations under the License.
    }
        boolean nonUnique,
    
                    case AltibaseConstants.PSM_TYPE_TYPESET:
                        continue;
            if (hasDbmsMetadataPacakge(session)) {

                rs = pstmt.executeQuery();
            @NotNull Map<String, Object> options) throws DBException {
    }
            }
        boolean persisted) {
                break;
    public AltibaseDirectory createDirectoryImpl(GenericStructContainer container, JDBCResultSet resultSet) {
    }
                        + " WHERE"
                        + " ORDER BY proc_name ASC"); 
            @NotNull GenericStructContainer container) throws SQLException {

    }
                                pkg.setBody(true);
    public AltibaseDataTypeCache createDataTypeCache(@NotNull GenericStructContainer container) {
        @NotNull GenericStructContainer container,
            @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) throws DBException {
            }
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, 
    public JDBCStatement prepareUniqueConstraintsLoadStatement(@NotNull JDBCSession session, 
                    setTransformParam(conn, sqlTerm, "F");
                        + " ORDER BY SYNONYM_NAME");
            

    public String getDbLinkDDL(DBRProgressMonitor monitor, AltibaseDbLink sourceObject, 
        String typeName,
        return getDDLFromDbmsMetadata(monitor, sourceObject, null, "LIBRARY");
                        + " AND T.TABLE_OID = S.SEQ_OID"
                            pkg = createPackageImpl(container, pkgName, dbResult);
    
                        + " TDT.STMT_TYPE = 33, 'UPDATE', "
                JDBCUtils.safeGetString(dbResult, "OBJECT_OWNER_NAME"),
        } catch (Exception e) {
                }

            GenericStructContainer container) throws SQLException {
        dbStat.setString(1, container.getName());
        
    
                            continue;
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
                table = new AltibaseMaterializedView(session, owner, tableName, tableType, dbResult);
     */
        String ddl = getDDLFromDbmsMetadata(monitor, sourceObject, sourceObject.getSchema().getName(), 
            dbStat.executeStatement();
    
    // Sequences
 * Copyright (C) 2010-2026 DBeaver Corp and others
            validated = "T".equals(JDBCUtils.safeGetString(dbResult, "VALIDATED"));

        return (ddl.length() < 1) ? "-- View definition not available" : ddl;
    }
                                throw new DBException("Duplicated package name found: " + key);
        } else {
    }
    
                        + " TR.EVENT_TYPE = 4, 'UPDATE', 'Unknown') AS EVENT_TYPE "
        
                        break;
            default:
                ddl.append(AltibaseConstants.NEW_LINE).append("*/");
        boolean hasDbmsMetadataPacakge = false;
     */
    public JDBCStatement preparePsmLoadStatement(JDBCSession session, 
        CallableStatement cstmt = null;
                            if (JDBCUtils.safeGetInt(dbResult, "PACKAGE_TYPE") == AltibaseConstants.PACKAGE_TYPE_BODY) {
     */
     */
            if (dbResult != null) {

    
            throws DBException {
            for (GenericTableIndex index : sourceObject.getIndexes(monitor)) {
        return new AltibaseDataTypeCache(container);
    }
            Map<String, Object> options) throws DBException {
        String tableName = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_NAME);
        StringBuilder ddl = new StringBuilder();
            case 7:
    //////////////////////////////////////////////////////
     * Get Package dependent procedure/function

    }
        hasDbmsMetadata = ddl.startsWith("--");
            jpstmt.setString(2, sourceObject.getName());
    }
        if (hasParent) {
        return new AltibaseDirectory(container, resultSet);
                + " t.table_name AS TABLE_NAME,"
                cstmt.setString(3, sourceObject.getName());
 *
    @Override
                + " FROM "

                if (conn != null) {
                            + " AND VP.VIEW_ID = MV.VIEW_ID"
        try (JDBCStatement dbStat = preparePsmLoadStatement(session, container)) {
    @Override
        boolean autoGenerated
            (JDBCCallableStatementImpl.java:316)
    /**
                                procName,

                pstmt = conn.prepareStatement(getDepDdlQry);
                "SELECT"
                throw new DBException(exMsg);
    }
    public AltibaseMetaModel() {
                + " AND t.table_id = c.table_id"
        } else {
    /**
        ddlFromMetadata = getDDLFromDbmsMetadata(monitor, sourceObject, schemaName, sourceObject.getTableType());
                try {
    public String getTriggerDDL(@NotNull DBRProgressMonitor monitor, 
                        + " , TR.REF_ROW_CNT"
    private boolean setTransformParam(Connection conn, String key, String value) throws SQLException {
                        + " SYSTEM_.SYS_SYNONYMS_ S " + ((isPublic) ? "" : ", SYSTEM_.SYS_USERS_ U")
        return dbStat;
        int sourceType,
        return ddl;
    /**
                        String pkgName = JDBCUtils.safeGetString(dbResult, "PACKAGE_NAME");
    // Directory
    @Override
            jpstmt.close();
                        container,
    
        if (!isPublic) {
     */
                    + " parse "
                + " system_.sys_constraints_ c, system_.sys_constraint_columns_ ccol"
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);

                conn = session.getOriginal();
        GenericDataSource dataSource = container.getDataSource();
        Integer scale,

                    + " FROM"
            if (sourceObject instanceof AltibaseMaterializedView) {
                        + " AND PP.DATA_TYPE = D.DATA_TYPE"
        StringBuilder qry = new StringBuilder("SELECT"
        String qualifier,
    public String getLibraryDDL(DBRProgressMonitor monitor, AltibaseLibrary sourceObject, 
                cstmt.registerOutParameter(1, Types.VARCHAR);
            JDBCResultSet jrs =  jpstmt.executeQuery();
                    if (procedure != null) {
            ddl.append(AltibaseConstants.NO_DBMS_METADATA).append(super.getTableDDL(monitor, sourceObject, options));
    /**
                        + " R.*"
            GenericStructContainer container) throws SQLException {
        }
                        procedure = null;
                indexType,
    public String getDirectoryDDL(DBRProgressMonitor monitor, AltibaseDirectory sourceObject, 
     */
                table = null;
                + " c.check_condition, "
     * Get a specific DbLink DDL
            case 5:
        return true;
                break;
                    + " SYSTEM_.SYS_PACKAGE_PARSE_ PP, SYSTEM_.SYS_USERS_ U, SYSTEM_.SYS_PACKAGES_ P"
            String colname, boolean hasDbmsMetdata) {
    /**
    }
    private void loadPackages(DBRProgressMonitor monitor, @NotNull GenericObjectContainer container, 
            Map<String, Object> options) throws DBException {
                            final AltibaseProcedurePackaged procedure = new AltibaseProcedurePackaged(
    //////////////////////////////////////////////////////
                return DBSEntityConstraintType.CHECK;
    /**
    
    /**
        @NotNull DBRProgressMonitor monitor,
        final JDBCPreparedStatement dbStat = session.prepareStatement(
     * Get DDL source from DBMS catalog (meta tables): View/Procedure/Function/Typeset/Trigger
    @Override
                    }
     */

                        container,
        
        if (!isNullObject) {
    public String getReplicationDDL(@NotNull DBRProgressMonitor monitor, @NotNull  AltibaseReplication sourceObject, 
    }
    }
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    public AltibasePackage createPackageImpl(GenericStructContainer container, 
    /**
    }
                        if (monitor.isCanceled()) {
                    JDBCUtils.safeGetString(dbResult, "CHECK_CONDITION") : "";
     * Check whether the connected DBMS has DBMS_METADATA package or not.
    }
                }

                        + " AND PP.PACKAGE_NAME = ?"
    }
     */
    /**

        depDdl = depDdl.replaceAll("\\n\\n", AltibaseConstants.NEW_LINE); // remove empty line
        return new AltibaseDbLink(container, resultSet);
            return null;
                        + " (SELECT"
        }
        return ddl;
    public boolean supportsUniqueKeys() {
    // Table Columns
                        String key = pkgSchema + "." + pkgName;
        JDBCPreparedStatement dbStat = session.prepareStatement(
        

        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Get DDL from DB")) {
            Map<String, Object> options) throws DBException {
                pstmt.setString(3, schemaName);
     * Set dbms_metadata.set_transform_param to change its output format 
                    pstmt.close();

        return result;
            newTriggerName = JDBCUtils.safeGetStringTrimmed(dbResult, "TRIGGER_NAME");
    }
            case "SYNONYM":
        return ddl;
        JDBCResultSet jrs = null;
            }
            }
import org.jkiss.code.NotNull;
                typeName, valueType, sourceType, ordinalPos,
    }
        return dbStat;
                cstmt.setString(2, objectType);
        String tableType = GenericUtils.safeGetStringTrimmed(tableObject, dbResult, JDBCConstants.TABLE_TYPE);
        }
                        + " parse "
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        
        } catch (Exception e) {
        Connection conn = null;
    }
                ddl = "-- DDL is too long to be fetched.";
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBDatabaseException;
                        + " AND T.USER_ID = U.USER_ID"
        }
            }
    public DBSEntityConstraintType getUniqueConstraintType(@NotNull JDBCResultSet dbResult) throws DBException, SQLException {
    public JDBCStatement prepareDbLinkLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container,
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
    public JDBCStatement prepareDirectoryLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container,
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        
    /**
                        + " AND U.USER_ID = P.USER_ID"

        String condition = "";
        final JDBCPreparedStatement dbStat = session.prepareStatement(

        try {
        return geDDLFromCatalog(monitor, sourceObject, schemaName, sql, "PARSE", hasDbmsMetdata);
            if (hasDbmsMetadataPacakge(session)) {
                            + " AND MV.MVIEW_NAME = ?"
            jrs.close();

                            if (pkg != null) {
            String packageName, JDBCResultSet resultSet) {
        // Load packages
        boolean autoIncrement,
                        } else {
                parent,


     * Statement to load DbLink
     * @throws DBException 
    public boolean supportsDatabaseTriggers(@NotNull GenericDataSource dataSource) {
                return AltibaseConstraint.LOCAL_UNIQUE_KEY;

        /* Reference:
        switch (tableType) {
                + " c.validated"
                            break;
                    procType = JDBCUtils.safeGetInt(dbResult, "OBJECT_TYPE");
    @Override
                log.warn("Failed to get dbms_metadata.get_dependent_ddl [TYPE] " + depObjectType 

        int ordinalPos,
                        // can't be here
        String sqlTerm = "SQLTERMINATOR";

                qualifier,
                        + " FROM SYSTEM_.SYS_PACKAGES_ P, SYSTEM_.SYS_USERS_ U, SYSTEM_.SYS_PACKAGE_PARAS_ PP"
        }
        String depDdl = null;
                    ddl = rs.getString(1);
            dbStat.setString(2, forParent.getName());
            }
            case "MATERIALIZED VIEW":
        @NotNull GenericTableBase table,

            @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws SQLException {
        }
                + " AND c.constraint_type != 0"

            jpstmt.setString(1, schemaName);
import java.util.Map;
        String procName;
                            } else {
                
                        AltibasePackage pkg = packageMap.get(key);
            String schemaName, String depObjectType) {
            if (cstmt != null) {
                                null);
    public GenericTrigger createTableTriggerImpl(@NotNull JDBCSession session, 
                    + " WHERE"
            @NotNull GenericTrigger trigger) throws DBException {
                "SELECT"
            }
        }
     * Statement to load Directory
        if (hasDbmsMetadata || CommonUtils.isEmpty(ddl)) {
        try (JDBCPreparedStatement jpstmt = session.prepareStatement(sql)) {
                                // can't be here


 * See the License for the specific language governing permissions and
    //////////////////////////////////////////////////////
    @Override
                        String procName = JDBCUtils.safeGetString(dbResult, "SUB_PROC_NAME");
        return new AltibaseTableIndex(
                "SELECT"

            Map<String, Object> options) throws DBException {
                newTriggerName,
        // Load packages
                + " u.user_name = ?"
import org.jkiss.utils.CommonUtils;
    public String getSynonymDDL(DBRProgressMonitor monitor, AltibaseSynonym sourceObject, 
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
                } finally {
                        String key = schemaName + "." + pkgName;
                    case AltibaseConstants.PSM_TYPE_FUNCTION:
                        + " FROM V$SEQ S, SYSTEM_.SYS_TABLES_ T, SYSTEM_.SYS_USERS_ U"
        boolean result = false;
    /**
                    + " FROM "
     */
                e.printStackTrace();

                                null);
    @NotNull
     */
            } else {
        }
                    + " ORDER BY PP.PACKAGE_TYPE, SEQ_NO ASC";
                setTransformParam(conn, sqlTerm, "T");
     * Altibase JDBC getProcedures method returns procedures and functions together
        } catch (Exception e) {
                "SELECT"
     * Get a specific Synonym DDL

/*
     * Get DDL source for View/Procedure/Function/Typeset
            JDBCResultSet dbResult = dbStat.getResultSet();
            boolean hasDbmsMetdata) {
        StringBuilder ddl = new StringBuilder(hasDbmsMetdata ? "" : AltibaseConstants.NO_DBMS_METADATA);
        dbStat.setString(1, pkgSchema);
    private void addTableDependentDdl(StringBuilder ddl, String depObjType, 
                    + " AND PP.USER_ID = U.USER_ID"


            default:
        }
     */

            try {
                    + " U.USER_NAME = ?"
     * Get a specific Directory DDL

            }
            }
import org.jkiss.dbeaver.model.DBConstants;
     */
                .append(AltibaseConstants.NEW_LINE).append("/*").append(AltibaseConstants.NEW_LINE);
    }
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Get DDL from DBMS_METADATA")) {
                    sourceObject.getSchema().getName(), ((AltibaseProcedureStandAlone) sourceObject).getProcedureTypeName());
        } finally {
                if (!altiIndex.isSystemGenerated()) {
                        + " AND PP.OBJECT_NAME = ?"
                        + " , TR.TRIGGER_NAME"
                    + " , system_.sys_trigger_strings_ sts"
    }
        dbStat.setString(1, container.getName());
     */
    @Override
    }
                                    procName,
                        + " 'TFOR EACH STATEMENT', 'Unknown') AS GRANULARITY"
                    + " AND PP.PACKAGE_TYPE = " + packageType
                dbResult.close();
            JDBCResultSet dbResult = dbStat.getResultSet();

                                container,

        final JDBCPreparedStatement dbStat = session.prepareStatement(
                }
                        + " TR.EVENT_TIME = 3, 'INSTEAD OF', 'Unknown') AS EVENT_TIME"
        return new AltibaseTable(

            
                columnName,
        try (JDBCStatement dbStat = preparePackageLoadStatement(session, container)) {
        return new AltibaseSchema(dataSource, catalog, schemaName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public GenericTableBase createTableOrViewImpl(

        @Nullable String tableType,
        int constraintType = JDBCUtils.safeGetInt(dbResult, "CONSTRAINT_TYPE");
                        + " WHERE"
            ddl.append(String.format(AltibaseConstants.NO_DDL_WITHOUT_DBMS_METADATA, AltibaseConstants.DBOBJ_INDEX));
                        // new package
                "SELECT"
                ddl.append("-- System generated index. Not for user creation.")
    @Override
                + " WHERE"
     */
     * Get DDL source for Package

            log.warn("Failed to get dbms_metadata.get_dependent_ddl [TYPE] " + depObjectType 
        }
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
     * Get Packages name and package object
                        procedure = new AltibaseTypeset(container, procName, valid);

        } finally {


                        container.addProcedure(procedure);
            if (sourceObject.isSystemGenerated()) {
                }
                        + " AND T.TABLE_ID = R.TABLE_ID "
        String schemaName = sourceObject.getTable().getSchema().getName();
                e.printStackTrace();
                table = new AltibaseTable(owner, tableName, tableType, dbResult);
    }
    @Override
import org.jkiss.dbeaver.model.DBUtils;
    // Constraints
                while (dbResult.next()) {
                        + " , TR.UPDATE_COLUMN_CNT"
    @Override
            log.warn("Can't check DBMS_METADATA", e);
 *
            String pkgSchema, String pkgName, String procName) throws SQLException {
                        + ", PP.OBJECT_NAME AS SUB_PROC_NAME"

    }
        } catch (Exception e) {
                    + " ORDER BY SEQ_NO ASC";
                        + " , TR.OWNER_TABLE AS OWNER" // DBeaver dependent column alias
        return new AltibaseTableTrigger(
                    + " WHERE"
                    + " AND P.PACKAGE_NAME = ?"
                        + " , CASE2(TR.EVENT_TYPE = 1, 'INSERT', TR.EVENT_TYPE = 2, 'DELETE'," 
        DBSEntityConstraintType constraintType,
                table,
                            break;
                "SELECT d.* FROM system_.sys_users_ u, system_.sys_directories_ d "

        boolean valid;
                        procedure = new AltibaseProcedureStandAlone(
        String ddl = getDDLFromDbmsMetadata(monitor, sourceObject, 
                    + " FROM "

        dbStat.setString(1, owner.getName());
            DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName) {
        boolean isNullObject = object == null && objectName == null;
                        + " , SYSTEM_.SYS_TABLES_ T"
        return true;
        boolean validated = true;
     */
                        }
                    + " AND PP.USER_ID = U.USER_ID"
     */
        boolean notNull,
                        + " DML_TABLE_ID = T.TABLE_ID"
        

    public String getJobDDL(DBRProgressMonitor monitor, AltibaseJob sourceObject, 
        return true;
                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                + " AND u.user_id = t.user_id"
            jpstmt = session.prepareStatement(sql);
                cstmt.execute();
            ddl.append(ddlFromMetadata).append(";");
        String columnName,
        boolean isNullObject = object == null && objectName == null;
        return dbStat;
                        + " WHERE "
        return dbStat;
    /**
    public void loadProcedures(@NotNull DBRProgressMonitor monitor, @NotNull GenericObjectContainer container)
        boolean persisted
                }
                    valid = JDBCUtils.safeGetBoolean(dbResult, "STATUS", "0");
    
        }
     * Create Directory implementation
            JDBCResultSet dbResult = dbStat.getResultSet();

    }
        String schemaName = container.getName();
    }
                + " col.column_name AS COLUMN_NAME, "
     */
     */
                        tableType,
        return ddl.toString();
            case "VIEW":
    
                    + " AND PP.PACKAGE_TYPE = P.PACKAGE_TYPE"
            Map<String, Object> options) throws DBException {

            log.warn("Failed to execute dbms_metadata.set_transform_param [KEY]" + key + ", [VALUE]" + value, e); 
        return true;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load procedures")) {
        
                        + " LEFT OUTER JOIN "
    public AltibaseLibrary createLibraryImpl(GenericStructContainer container, JDBCResultSet resultSet) {
                        + " AND U.USER_ID = T.USER_ID"
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
                        dbResult);
     * Statement to load package dependent procedure/function columns
    @Override
            /* Foreign key must be handled separately: c.constraint_type != 0 
                charLength, scale, precision, radix, notNull,
     * Statement to load packages
    /**
        final JDBCPreparedStatement dbStat = session.prepareStatement(
    @NotNull
     * Statement to load packages

            } catch (SQLException e) {
                + " system_.sys_users_ u, system_.sys_tables_ t, system_.sys_columns_ col,"
        String newTriggerName = triggerName;
                        + " ,T.TABLE_NAME AS OWNER_TABLE"
                        if (pkg != null) {

                    + " parse "
     */
                cstmt.setString(4, schemaName);
        return new AltibaseTableColumn(table,
                + " (SELECT db_name FROM v$database) AS TABLE_CAT,"
                        + " , SYSTEM_.SYS_TRIGGERS_ R "
/**
        final JDBCPreparedStatement dbStat = session.prepareStatement(
    @Override
         * Need to use native CallableStatement
    // Packages
                    ddl.append(content);
                        .append(AltibaseConstants.NEW_LINE);

    }
    }


        }
                if (rs.next()) {
            }
            at org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCCallableStatementImpl.getOutputParametersFromJDBC

            ddl = getViewProcDDLFromCatalog(monitor, sourceObject, sourceObject.getSchema().getName(), sql);
        int procType;

            dbStat.executeStatement();
     * such as put at the end of returned query with SQL Terminator

    }

            case "QUEUE":
            GenericStructContainer container) throws SQLException {

                cardinality,
        
                ddl = cstmt.getString(1);
                            }
        String schemaName = null;

                        + " ORDER BY PARA_ORDER ASC");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                AltibaseUtils.getDmbsMetaDataObjTypeName(sourceObject.getTableType()));
        }
     * Get a specific Index DDL
                        + " , U.USER_NAME"
        }
                        break;
    private boolean hasDbmsMetadataPacakge(JDBCSession session) {
            case 1:
     */

    //////////////////////////////////////////////////////
                "SELECT l.* FROM system_.sys_users_ u, system_.sys_libraries_ l "
                            + " ,SYSTEM_.SYS_USERS_ U"
                                pkg.addProcedure(procedure);
                                container.addPackage(pkg);
            @Nullable AltibaseDirectory object, @Nullable String objectName) throws SQLException {
        String ddl = "";
                        + " , CASE2(TDT.STMT_TYPE = 8, 'DELETE', TDT.STMT_TYPE = 19, 'INSERT'," 
                    + " AND t.trigger_name = ?"

    //////////////////////////////////////////////////////
    }
                    + " AND PP.PROC_OID = P.PROC_OID"
     */
            return null;
            log.warn("Can't read DDL from DBMS_METADATA", e);
                        + " , TDT.USER_NAME AS DMLTABLE_SCHEMA"
    private String getViewProcDDLFromCatalog(DBRProgressMonitor monitor, DBSObject sourceObject, String schemaName, String sql) {
                                    pkgName,
                        + " U.USER_NAME = ?"
    /**
                        + ((isPublic) ? 
    @NotNull
            @NotNull GenericStructContainer owner, @Nullable GenericTableBase forParent) throws SQLException {
     * Get DDL source for Trigger
    
        @NotNull GenericTableBase table,
                        AltibasePackage pkg = packageMap.get(key);
                tableName,
    
            loadPSMs(monitor, container, session);
    //////////////////////////////////////////////////////
                sql = "SELECT "
                        + " U.USER_NAME = ?"
 */
    // Triggers
    
        }
    }
                            + " U.USER_NAME = ?"
                    + " ORDER BY seqno";
                + " SYSTEM_.SYS_PACKAGES_ P" 
    }
                return new AltibaseMaterializedView(
    
                                packageMap.put(key, pkg);
                + " ORDER BY directory_name ASC");
                            
            
        }
    }
        }
        dbStat.setString(1, container.getName());

                                procName,
                        if (monitor.isCanceled()) {
 * You may obtain a copy of the License at
                }
