    }
            log.debug("Token = " + token);
                    long ddlStart = 1L;
            return null;
            }

        if (db2Table == null) {
        result = result.replace(" MODIFIES SQL ", "\r\nMODIFIES SQL ");
                    Clob ddlStmt;
        // to prevent the pairing from being evaluated word-by-word by the command line processor (CLP).
        String db2SchemaName, String db2ModuleName) throws DBException

            monitor.done();

            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        for (DB2Schema db2Schema : db2DataSource.getSchemas(monitor)) {

        sb.append("  FROM SYSCAT.TBSPACEAUTH TA");
import org.jkiss.utils.CommonUtils;
    private static final String SEL_XMLSTRINGS = "SELECT * FROM SYSCAT.XMLSTRINGS ORDER BY STRINGID WITH UR";
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    listDBParameters.add(new DB2Parameter((DB2DataSource) session.getDataSource(), dbResult));
    // ---------------------
        try (JDBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), db2DataSource, "Get Error Code")) {
                return db2Tablespace;
        if (sqlca == null) {
        result = result.replaceAll("\\r\\n ", "\r\n");
        return db2Schema.getModule(monitor, db2ModuleName);

                }
    }
    // ADMIN ACTIONS
 * 

                }
    // ------------------------
        result = result.replace(" CONTAINS SQL ", "\r\nCONTAINS SQL ");
    private DB2Utils()
    // ------------------------
        result = result.replace(" NO EXTERNAL ", "\r\nNO EXTERNAL ");
                }
        }
    public static DB2Routine findUDFBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
    {
    {
        return null;

        result = result.replace(" CALLED ON NULL INPUT ", "\r\nCALLED ON NULL INPUT ");
            return null;
            return null;
        result = result.replace(" INHERIT SPECIAL ", "\r\nINHERIT SPECIAL ");
import org.jkiss.dbeaver.ext.db2.info.DB2XMLString;
        }
     * Retrieves the server variant information from the DB2 SQLCA.
        char[] sqlwarn = sqlca.getSqlWarn();
                                ddlStmt.free();
                }
 * DBeaver - Universal Database Manager
        }
        // If you use only one set of double quotation marks (for example, "My Table"), all words are converted into uppercase,
    // DBCFG/DBMCFG/XMLStrings
        }
        result = result.replace("\r\nOR REPLACE", " OR REPLACE");
                    return false;
    }

    public static List<DB2XMLString> readXMLStrings(DBRProgressMonitor monitor, JDBCSession session) throws SQLException
        if (db2Schema == null) {
        result = result.replace(" DYNAMIC RESULT ", "\r\nDYNAMIC RESULT ");
        }
    // TODO DF: Tables in SYSTOOLS tables must exist first
                stmtSPClean.executeUpdate();
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Verify EXPLAIN tables")) {
        return db2Schema.getUDF(monitor, db2FunctionName);
            log.debug("Terminated OK");
    private static final String CALL_ADMIN_CMD = "CALL SYSPROC.ADMIN_CMD('%s')";
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
        sb.append("                     '").append(DB2TablespaceDataType.A.name()).append("'");
        return db2Schema.getTable(monitor, db2TableName);

        // Enclose multiword table names with the backslash and two sets of double quotation marks (for example, "\"My Table\"")

 */
    {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            try (JDBCCallableStatement stmtSP = session.prepareCall(CALL_INST_OBJ)) {
        log.debug("Call admin_cmd with '" + command + "'");
    public static DB2Nickname findNicknameBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
        result = result.replace(" BEGIN ", "\r\nBEGIN\r\n");
        }
                stmtSP.setString(4, explainTableSchemaName); // Schema
        sb.append(" WITH UR");
        result = result.replaceAll("\\r\\n;", ";");
    // ------------------------

                    }
    }
        result = result.replace(" READS SQL DATA ", "\r\nREADS SQL DATA ");
                if (e.getErrorCode() == CALL_INST_OBJ_BAD_RC) {
    public static String generateDDLforTable(DBRProgressMonitor monitor, String statementDelimiter, DB2DataSource dataSource,
                    listTablespaces.add(dbResult.getString(1));
 * You may obtain a copy of the License at
            // First Check with given schema
    {
                stmtSP.execute();
        DB2Table db2Table = db2Schema.getTable(monitor, db2TableName);
            try (JDBCCallableStatement stmtSP = session.prepareCall(CALL_INST_OBJ)) {
            (includeViews ? "" : "-noview ") + "-e -x -xd -td %s -t %s",

        if (db2Schema == null) {
            }
        return db2Schema.getPackage(monitor, db2PackageName);
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);

            }


    static {

        if (db2Schema == null) {


        return db2Schema.getTrigger(monitor, db2TriggerName);
        // doc:
                return true;
import org.jkiss.dbeaver.ext.db2.model.app.DB2ServerApplication;

        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        sb.append("     , SYSCAT.TABLESPACES T");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    // Generate DDL
        result = result.replace(" NEW SAVEPOINT ", "\r\nNEW SAVEPOINT ");
            return null;
        return listTablespaces;
        return listXMLStrings;
    //
            return null;
    }
    {
            return DB2Messages.no_ddl_for_spaces_in_name;
        sb.append("                     )");
import org.jkiss.dbeaver.model.sql.SQLConstants;

                    listApplications.add(new DB2ServerApplication(dbResult));
    public static DB2MaterializedQueryTable findMaterializedQueryTableBySchemaNameAndName(DBRProgressMonitor monitor,
    {
            } catch (SQLException e) {
    public static DB2TableColumn findColumnBySchemaNameAndTableNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
    // ------------------------
        result = result.replace(" EXTERNAL ACTION ", "\r\nEXTERNAL ACTION ");
        throws DBException
            return null;
            monitor.done();
        return result;
    // ---------------------
        String tablespaceName) throws DBCException


    public static @NotNull char getServerVariant(@NotNull DBRProgressMonitor monitor, @NotNull JDBCSession session) throws SQLException {
        try (JDBCSession session = DBUtils.openUtilSession(monitor, dataSource, "ADMIN_CMD")) {
    public static List<DB2ServerApplication> readApplications(DBRProgressMonitor monitor, JDBCSession session) throws SQLException
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        if (db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL).contains(" ")) {


        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
    // ------------------------
    {
    // Options of db2look that do not seem to work: -dp . "-a" seems to work on v10.1+, "-l" seems OK in all versions
        SEL_LIST_TS_EXPLAIN = sb.toString();
    {
        List<DB2Parameter> listDBParameters = new ArrayList<>();
        }
            }
            return null;
/**
        log.debug("Check EXPLAIN tables in '" + explainTableSchemaName + "'");
            return null;
            monitor.worked(1);
            return null;
 * @author Denis Forveille
        if (db2Table.getSchema().isSystem()) {
            throw new DBDatabaseException(e, dataSource);
    private static final int    CALL_INST_OBJ_BAD_RC = -438;
import java.sql.SQLException;
        }
                while (dbResult.next()) {
    {

        }
    public static DB2Table findTableBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
        }
    private static final String SEL_DBMCFG     = "SELECT * FROM SYSIBMADM.DBMCFG ORDER BY NAME WITH UR";
        } finally {
        if (db2Schema == null) {
import org.jkiss.dbeaver.model.exec.DBCException;
                "FROM SYSTOOLS.DB2LOOK_INFO " +
        log.debug("readApplications");
            }
                }
import java.sql.Clob;
        }
    // ------------------------
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    
                        ddlStmt = dbResult.getClob(1);
    }
     */

                "WHERE OP_TOKEN = ? " +
        DB2Sqlca sqlca = DB2Sqlca.from(session.getOriginal());
    public static DB2Bufferpool findBufferpoolById(DBRProgressMonitor monitor, DB2DataSource db2DataSource, Integer bufferpoolId)
        List<DB2XMLString> listXMLStrings = new ArrayList<>();
                stmtSP.setString(1, command);
                stmtSP.setString(4, explainTableSchemaName); // Schema
    public static DB2Trigger findTriggerBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
        return listDBMParameters;

        monitor.beginTask("Executing command " + command, 1);

    public static String formatSQLProcedureDDL(DB2DataSource db2DataSource, String rawText)

    // ------------------------
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Create EXPLAIN tables")) {
        return null;
            monitor.worked(2);
            return 0;
        }

        sb.append(" ORDER BY TA.TBSPACE");
            return 0;
        if (db2DataSource == null) {
                stmtSP.registerOutParameter(2, java.sql.Types.INTEGER);

    }
    private static final String GET_MSG        = "VALUES (SYSPROC.SQLERRM(?))";
            return null;
        }
    private static final String SEL_LIST_TS_EXPLAIN;
        }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        log.debug("readXMLStrings");


        sb.append("SELECT TA.TBSPACE");
        throws DBCException
    // ---------------
        if (db2Schema == null) {
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Generate DDL")) {
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
                }

        result = result.replaceAll(";", ";\r\n");
    {
            // Clean
    public static final String SEL_APP        = "SELECT * FROM SYSIBMADM.APPLICATIONS WITH UR";
    {
                log.debug("Creation EXPLAIN Tables : OK");
            monitor.done();

    }
            return null;
                    return db2XMLSchema;
    public static DB2View findViewBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource, String db2SchemaName,
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        List<DB2Parameter> listDBMParameters = new ArrayList<>();
    public static DB2Routine findMethodBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
    {
import org.jkiss.dbeaver.DBDatabaseException;
                        try {
        // We have to iterate all Schemas...
        String db2SchemaName, String db2SequenceName) throws DBException
    }
                stmtSP.setString(3, tablespaceName); // Tablespace
        throws DBException
    // ------------------------
        result = result.replace(" OLD SAVEPOINT ", "\r\nOLD SAVEPOINT ");
        if (db2Schema == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                stmtSP.setString(1, SQLConstants.KEYWORD_EXPLAIN); // EXPLAIN
    // DBA Data and Actions

        List<String> listTablespaces = new ArrayList<>();
            JDBCUtils.executeProcedure(session, sql);
                            } catch (Throwable e) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        int token;

        String db2SchemaName, String db2FunctionName) throws DBException
                while (dbResult.next()) {

        log.debug("Generate DDL for " + db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL));
        if (db2Schema == null) {

                stmtSP.setString(3, ""); // Tablespace
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
    }
    {
        result = result.replaceAll("WHERE\\r\\n", "WHERE ");
        }
        return db2Schema.getMaterializedQueryTable(monitor, db2NicknameName);
    // DF: Use "Undocumented" SYSPROC.DB2LK_GENERATE_DDL stored proc
        StringBuilder sb = new StringBuilder(512);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                            }
    }
                            try {
                }
        throws DBException


    }
            }
        // As a workaround, display a message to the end-user
 */
            }
        // Suppress the CRs before ";"
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        result = result.replaceAll("FETCH\\r\\n", "FETCH ");
        // Remove some CRs
        log.debug("readDBCfg");
        // Pure utility class, no instanciation allowed
    }
            }
    private static final String CALL_INST_OBJ        = "CALL SYSPROC.SYSINSTALLOBJECTS(?,?,?,?)";


        }
                                sb.append(stmtSubString.trim()).append(LINE_SEP).append("\n");
            if (CommonUtils.equalObjects(db2Bufferpool.getId(), bufferpoolId)) {
    {
            }
        monitor.beginTask("Check EXPLAIN tables", 1);
    }
    {
 * you may not use this file except in compliance with the License.
            monitor.done();
                            if (CommonUtils.isNotEmpty(stmtSubString)) {
                    while (dbResult.next()) {
    }
            return sb.toString();
        // The DB2LK_GENERATE_DDL SP does not work when the name contains a space, even after trying to apply what is said in the
                if (db2XMLSchema.getId().equals(xmlSchemaId)) {
 * See the License for the specific language governing permissions and

        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
    {
                "SELECT SQL_STMT " +
        return null;
    }

    }
        StringBuilder sb = new StringBuilder(2048);

        } finally {
    //
        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_XMLSTRINGS)) {
 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)
        result = result.replaceAll("SET\\r\\n", "SET ");
        }
                        }
        }
    }
    }
        }
        if (db2Schema == null) {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
        String db2SchemaName, String db2NicknameName) throws DBException
        // The DB2LK_GENERATE_DDL SP does not generate DDL for System Tables for some reason...
                log.error("SQLException occured during EXPLAIN tables creation in schema " + explainTableSchemaName, e);
        } finally {
                throw new DBCException(e, session.getExecutionContext());
                                log.debug("Error freeing CLOB: " + e.getMessage());
        }
                stmtSP.setString(2, "V"); // Verify
import org.jkiss.dbeaver.ext.db2.info.DB2Parameter;

    {
            // Read result
        return db2Schema.getMethod(monitor, db2MethodName);
    // EXPLAIN
        }
        }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_LIST_TS_EXPLAIN)) {
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        return listApplications;
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return db2Schema.getSequence(monitor, db2SequenceName);
            try (JDBCCallableStatement stmtSP = session.prepareCall("CALL SYSPROC.DB2LK_GENERATE_DDL(?,?)")) {
            return null;
    }
        }

                "ORDER BY OP_SEQUENCE WITH UR")
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        monitor.beginTask("Create EXPLAIN Tables", 1);
    }
        return db2Schema.getMaterializedQueryTable(monitor, db2MQTName);
        return sqlwarn[7];
    }
 *
        // Put a CR after ";"
            log.debug("Calling DB2LK_GENERATE_DDL with command : " + command);
        result = result.replaceAll("FROM\\r\\n", "FROM ");
        }
        // Put each definition keywords on one line
            }
 * DB2 Utils

    public static String getMessageFromCode(DB2DataSource db2DataSource, Integer sqlErrorCode) throws SQLException, DBCException {
                    listDBMParameters.add(new DB2Parameter((DB2DataSource) session.getDataSource(), dbResult));
    public static List<DB2Parameter> readDBCfg(DBRProgressMonitor monitor, JDBCSession session) throws SQLException
    }
        return db2Schema.getProcedure(monitor, db2ProcedureName);
        if (db2Schema == null) {
        return db2Schema.getIndex(monitor, db2IndexName);
            return null;
        sb.append(" WHERE TA.GRANTEE IN ('PUBLIC',SESSION_USER)");
    {
        sb.append("   AND TA.USEAUTH In ('Y','G')");
    {
    private static final String LINE_SEP             = ";\n";
import org.jkiss.dbeaver.model.DBUtils;

        }


            return null;
    // Admin Command
        }
    }
    {

    public static List<DB2Parameter> readDBMCfg(DBRProgressMonitor monitor, JDBCSession session) throws SQLException
    }
        log.debug("Create EXPLAIN tables in " + explainTableSchemaName);
    }
    {
                return db2Bufferpool;

        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_DBMCFG)) {
        }
        return listDBParameters;
        String command = String.format(
                        } finally {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                try (JDBCResultSet dbResult = stmtSel.executeQuery()) {
/*
        String db2SchemaName, String db2MQTName) throws DBException
    public static DB2Routine findProcedureBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
                while (dbResult.next()) {
        }
        List<DB2ServerApplication> listApplications = new ArrayList<>();
    }
            statementDelimiter,
package org.jkiss.dbeaver.ext.db2;
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        return db2Schema.getNickname(monitor, db2NicknameName);
    private static final String SEL_DBCFG      = "SELECT * FROM SYSIBMADM.DBCFG ORDER BY NAME  WITH UR";
    }
        if (db2DataSource == null) {
 *
        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_DBCFG)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCCallableStatement;
        String db2SchemaName, String db2TriggerName) throws DBException
        String db2SchemaName, String db2TableName) throws DBException
                stmtSP.setString(1, SQLConstants.KEYWORD_EXPLAIN); // EXPLAIN
        }
        sb.append("   AND T.TBSPACE = TA.TBSPACE");

            return DB2Messages.no_ddl_for_system_tables;
                    listXMLStrings.add(new DB2XMLString((DB2DataSource) session.getDataSource(), dbResult));
                while (dbResult.next()) {
                stmtSP.executeUpdate();
import org.jkiss.code.NotNull;
        }
        DB2DataSource db2DataSource, String db2SchemaName, String db2NicknameName) throws DBException
    }
        return db2Schema.getView(monitor, db2ViewName);
    public static void createExplainTables(DBRProgressMonitor monitor, DB2DataSource dataSource, String explainTableSchemaName,
        }
                token = stmtSP.getInt(2);
        return db2Table.getAttribute(monitor, db2ColumnName);
    }

    // TODO DF: many things in this class could probably be factorized or generic-field

        log.debug("readDBMCfg");
            if (CommonUtils.equalObjects(db2Tablespace.getTbspaceId(), tablespaceId)) {
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
}
            try (JDBCCallableStatement stmtSPClean = session.prepareCall("CALL SYSPROC.DB2LK_CLEAN_TABLE(?)")) {
        result = result.replace("CREATE\r\n    PROCEDURE", "CREATE PROCEDURE");
            return null;

        result = result.replace(" NOT DETERMINISTIC ", "\r\nNOT DETERMINISTIC ");
import org.jkiss.dbeaver.DBException;
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (db2DataSource == null) {
                throw new DBCException(e, session.getExecutionContext());
        sb.append("                    ,'").append(DB2TablespaceDataType.L.name()).append("'");
                    log.debug("No valid EXPLAIN tables found in schema '" + explainTableSchemaName + "'.");
        for (DB2Bufferpool db2Bufferpool : db2DataSource.getBufferpools(monitor)) {
                stmtSP.setString(2, "C"); // Create
import java.util.List;

            db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL));
        if (db2Schema == null) {
    public static DB2XMLSchema findXMLSchemaByById(DBRProgressMonitor monitor, DB2DataSource db2DataSource, Long xmlSchemaId)

        String result = SQLFormatUtils.formatSQL(db2DataSource, rawText);

        // Put some kwywords on the same line
    // http://pic.dhe.ibm.com/infocenter/db2luw/v10r5/topic/com.ibm.db2.luw.admin.cmd.doc/doc/r0002051.html
        // As a workaround, display a message to the end-user


        
        String db2SchemaName, String db2PackageName) throws DBException


        if (db2Schema == null) {
                log.debug("EXPLAIN tables with schema " + explainTableSchemaName + " found.");
        String db2SchemaName, String db2IndexName) throws DBException

    public static void callAdminCmd(DBRProgressMonitor monitor, DB2DataSource dataSource, String command) throws SQLException, DBCException {
    // EXPLAIN
            return JDBCUtils.queryString(session, GET_MSG, sqlErrorCode);
    // ---------------
        sb.append("   AND T.DATATYPE IN (");
    /**
    }
public class DB2Utils {

    // APPLICATIONS
        try (JDBCPreparedStatement dbStat = session.prepareStatement(SEL_APP)) {
    public static DB2MaterializedQueryTable findMQTBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
        result = result.replace(" AUTONOMOUS ", "\r\nAUTONOMOUS ");
            return null;

    {
        result = result.replace(" SPECIFIC ", "\r\nSPECIFIC ");
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablespaceDataType;
            } catch (SQLException e) {
        if (sqlwarn == null || sqlwarn.length < 8) {
import org.jkiss.dbeaver.Log;
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);
        } finally {
        }
    public static Boolean checkExplainTables(DBRProgressMonitor monitor, DB2DataSource dataSource, String explainTableSchemaName)
            }
    public static DB2Package findPackageBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
                            ddlLength = ddlStmt.length() + 1L;
 * limitations under the License.
        if (db2Schema == null) {
                    long ddlLength;
        DB2Schema db2Schema = db2DataSource.getSchema(monitor, db2SchemaName);

                }

        log.debug("Get List Of Usable Tablespaces For Explain Tables");
        result = result.replace(" PARAMETER CCSID ", "\r\nPARAMETER CCSID ");
        String db2ViewName) throws DBException
                log.debug("RC:" + e.getErrorCode() + " SQLState:" + e.getSQLState() + " " + e.getMessage());
            for (DB2XMLSchema db2XMLSchema : db2Schema.getXMLSchemas(monitor)) {
    private static final Log log = Log.getLog(DB2Utils.class);
        String db2SchemaName, String db2TableName, String db2ColumnName) throws DBException
        result = result.replaceAll("INTO\\r\\n", "INTO ");
            ) {

    public static DB2Index findIndexBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
            return null;
                stmtSP.executeUpdate();
        result = result.replace(" COMMIT ON RETURN ", "\r\nCOMMIT ON RETURN ");
        // Remove CR space
    // Ref to db2look :
        String sql = String.format(CALL_ADMIN_CMD, command);
        String db2SchemaName, String db2MethodName) throws DBException
    public static DB2Module findModuleBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,
                while (dbResult.next()) {
    public static DB2Tablespace findTablespaceById(DBRProgressMonitor monitor, DB2DataSource db2DataSource, Integer tablespaceId)
            monitor.worked(3);
        DB2Table db2Table, boolean includeViews) throws DBException
    // Objects Finders
    public static List<String> getListOfUsableTsForExplain(DBRProgressMonitor monitor, JDBCSession session) throws SQLException
        monitor.beginTask("Generating DDL", 3);
        

                stmtSPClean.setInt(1, token);
 * Unless required by applicable law or agreed to in writing, software
        String db2SchemaName, String db2ProcedureName) throws DBException
    {
                stmtSel.setInt(1, token);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                            }
            try (JDBCPreparedStatement stmtSel = session.prepareStatement(
    {
        // First let the defaut SQL formater operate
import org.jkiss.dbeaver.ext.db2.model.*;
import java.util.ArrayList;
    public static DB2Sequence findSequenceBySchemaNameAndName(DBRProgressMonitor monitor, DB2DataSource db2DataSource,

        if (db2Schema == null) {

import org.jkiss.dbeaver.ext.db2.model.fed.DB2Nickname;
            }
        result = result.replace(" LANGUAGE ", "\r\nLANGUAGE ");
            return null;
        if (db2Schema == null) {

                            String stmtSubString = ddlStmt.getSubString(ddlStart, (int) ddlLength);
    // Error Message
        // and the db2look command looks for an uppercase table name (for example, MY TABLE).
        for (DB2Tablespace db2Tablespace : db2DataSource.getTablespaces(monitor)) {

        result = result.replace(" DETERMINISTIC ", "\r\nDETERMINISTIC ");


