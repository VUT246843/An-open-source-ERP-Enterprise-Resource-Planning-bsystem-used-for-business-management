        addBreakpoint(monitor, bpGlobal);
            log.debug(String.format("Unable to get source for OID %s", e.getMessage()));
                        PostgreDebugStackFrame frame = new PostgreDebugStackFrame(level, targetname, func, linenumber, args);
 * true) in this state possible to call getStack, getVariables, setVariables,
                        return localPort;
            PostgreDebugStackFrame postgreStack = (PostgreDebugStackFrame) stack;
                    }
        }
                    log.debug(String.format("Database Product Version %s", JDBCinfo.getDatabaseProductVersion()));
        switch (attachKind) {
                    Integer localPort = tryParsePortNumber(warn.getMessage());
                    if (!rs.next()) {
                    if (rs.next()) {

        log.debug("try continue execution");
        // Use controller connection
                log.debug(String.format("Active schema %s", instance.getMetaContext().getDefaultSchema()));
    private static final String SQL_STEP_OVER = "select pldbg_step_over(?sessionid)";
    }

                    if (value instanceof String) {
        }
                    log.debug("------------DATABASE DRIVER INFO---------------");
    }
    @Override
                }

    }
import java.util.ArrayList;
    @Override
        execStep(SQL_STEP_INTO, " step into for ", DBGEvent.STEP_INTO);
            String unmatched = "Parameter value count (" + paramValues.size() + ") doesn't match actual function parameters (" + parameters.size() + ")";
        throw new DBGException("Suspend not implemented");
                        PostgreDebugVariable var = new PostgreDebugVariable(name, varclass, linenumber, isunique, isconst,
                    } else {
        if (stack instanceof PostgreDebugStackFrame) {
                            isnotnull, dtype, value);
    }
                    log.debug(String.format("Create slot OID %s", dbgOID));
        PostgreDebugBreakpointDescriptor bp = (PostgreDebugBreakpointDescriptor) descriptor;
     * The debugger focus remains on the selected frame until you change it or
                        sessionId = rs.getInt("sessionid");
        }
                    Thread.sleep(LOCAL_WAIT_MS);
            Integer portNumber = waitPortNumber(asyncStatement);
 * <br/>

                log.debug(String.format("Error catching local port number %s", e.getMessage()));
    }
        functionOid = CommonUtils.toInt(configuration.get(PostgreDebugConstants.ATTR_FUNCTION_OID));
    private static final String SQL_ATTACH_TO_PORT = "select pldbg_attach_to_port(?portnumber)";
                }
                            query.append("SELECT ");
                }
                        log.debug("Unable to create debug instance");
            log.error("Unable to abort global target", e);
    public String getSource(DBGStackFrame stack) throws DBGException {
                    }
                }
public class PostgreDebugSession extends DBGJDBCSession {
        execStep(SQL_CONTINUE, " continue for ", DBGEvent.RESUME);
 * client should invoke this function after creation also created implicit
     *

import java.util.List;
            try (PreparedStatement stmt = session.prepareStatement(SQL_SET_VAR)) {
                            if (i > 0) {
     */
                        boolean isunique = rs.getBoolean("isunique");
    private static final String SQL_PREPARE_SLOT = " select pldbg_oid_debug(?objectid)";
        log.debug("Attaching globally....");
        String taskName = String.valueOf(sessionId) + nameParameter + sessionInfo.getID();
        runAsync(sql, taskName, begin, end);
     * <p>
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        removeBreakpoint(monitor, bpGlobal);
                    log.debug(String.format("Driver Version %s", JDBCinfo.getDriverVersion()));

    private PostgreDebugSessionInfo getSessionDescriptor(DBRProgressMonitor monitor, JDBCExecutionContext connection) throws DBGException {
        }
                    log.debug("-----------------------------------------------");
                            valueHandler.bindValueObject(session, localStatement, parameter, i, paramValue);
    }

            String version = JDBCUtils.executeQuery(session, SQL_CHECK_PLUGIN);

    private PostgreDebugBreakpointDescriptor bpGlobal;
    @Override

    }
    @Override
    private static final String SQL_CHECK_PLUGIN = "select 'Server version: ' || serverversionstr || '.\nProxy API version: ' ||  proxyapiver from pldbg_get_proxy_info()";
    private boolean checkDebugPlugin(DBRProgressMonitor monitor) {
                        return src;
                    } finally {

        throw new DBGException(message);
        }
        }
     * attached to postgres procedure by attach method
     */

            default:
    }
            log.debug("Local detached");
import java.util.Map;
 * <br/>
            log.debug(String.format("Return %d src char(s)", src.length()));
                }
            SQLWarning warn = null;
        }
                                    if (!paramValue.equalsIgnoreCase("true") && !paramValue.equalsIgnoreCase("false")) {

                    }
                }
 * breakpoint for target procedure, after this call debug session in
    }
                        String value = rs.getString("value");

     * nested function in the call stack (because that's the function that's
                                                parameters.get(i).getName(),
                        fireEvent(new DBGEvent(this, DBGEvent.TERMINATE, DBGEvent.CLIENT_REQUEST));
    private Integer waitPortNumber(@NotNull CompletableFuture<JDBCCallableStatement> asyncStatement) throws DBGException {

                                                paramValue
                            }
    private static final String SQL_ATTACH = "select pldbg_wait_for_target(?sessionid)";
import org.eclipse.core.runtime.jobs.Job;
                return workerJob == null || workerJob.isFinished();
                try (ResultSet rs = stmt.executeQuery(SQL_CURRENT_SESSION)) {
    private static final String SQL_LISTEN = "select pldbg_create_listener() as sessionid";
            log.debug(String.format("Unable to select frame %s", e.getMessage()));
    private static final int LOCAL_WAIT_MS = 500; // 0.5 sec
    public DBGSessionInfo getSessionInfo() {
        } catch (SQLException e) {
        }
        }
                        }

     */
                        //    because the chain of warnings will be disrupted after the clearWarnings() call due to its implementation flaw,
                    log.debug(String.format("Database Version %s", JDBCinfo.getDatabaseVersion()));

    @Override
            if (warn != null) {
     * procedure
    }
            log.debug("Debug controller session created.");

        try {
                        String query = rs.getString("query");
                            }
import org.eclipse.osgi.util.NLS;





                    log.debug("Frame selected");
                        throw new DBGException("Error creating target slot");
    }
            }
                }
        log.debug("Creating controller session.");
                            nextWarn = warn.getNextWarning(); // poll for the consequent warns on the last processed in a chain
     *
        String objId = String.valueOf(function.getObjectId());
                    }
        }
 * setBreakpoint or execStepXXX\continue<br/>
                Integer result = Integer.valueOf(notice.substring(MAGIC_PORT.length() + 1).trim());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
     * Wait for port number passed from main executed statement
    public List<DBGVariable<?>> getVariables(DBGStackFrame stack) throws DBGException {
                try (ResultSet rs = stmt.executeQuery(sql)) {
}
    /**
        log.debug("Get source for func OID in debug session");
                            if (CommonUtils.isEmpty(paramValue)) {

     * @param commandPattern - SQL command for execute step

        throw new DBGException("Unable to rcv port number");

     *
    public void setVariableVal(DBGVariable<?> variable, Object value) throws DBGException {
                        // And Now His Watch Is Ended
            try (Statement stmt = session.createStatement()) {

            }
    }
            .replaceAll("\\?obj", String.valueOf(functionOid))
     * This method attach debug session to debug object (procedure) and wait
 * Copyright (C) 2010-2025 DBeaver Corp and others
                IOUtils.close(controllerConnection);
        } catch (SQLException e) {

                    log.debug("Error while attaching to port");
            if (isGlobalSession(controller.getDebugConfiguration())) {
        }
                        // we cannot use clearWarnings() for two reasons:
        @NotNull JDBCExecutionContext connection,
                                query.append(",");
                        int level = rs.getInt("level");
    }
        super(controller);
            log.debug("Global attached");
                                        throw new DBGException(NLS.bind(

        String sql = SQL_SELECT_FRAME.replaceAll("\\?sessionid", String.valueOf(sessionId)).replaceAll("\\?frameno",
            CompletableFuture<JDBCCallableStatement> asyncStatement =  new CompletableFuture<JDBCCallableStatement>();
            log.debug("Error while attaching to port");
        }
            }
    private static final String SQL_SET_VAR = "select pldbg_deposit_value(?,?,?,?)";
 * limitations under the License.
                            }
        try (JDBCSession session = getControllerConnection().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Get session source")) {
                    }

            } catch (Exception e) {
    @NotNull
                        fireEvent(new DBGEvent(this, DBGEvent.RESUME, DBGEvent.STEP_RETURN));
                        //    (see https://github.com/pgjdbc/pgjdbc/blob/5c9928d81e4a337518c1e1104ea17f4b29269320/pgjdbc/src/main/java/org/postgresql/jdbc/PgStatement.java#L652)

            String src = getSource(postgreStack.getOid());
    @Override
    private static final String SQL_CONTINUE = "select pldbg_continue(?sessionid)";

            throw new DBGException("SQL error", e);
                        log.debug("Error execute local statement: " + e.getMessage());
                    log.debug("No additional Driver info");
            CallableStatement statement = asyncStatement.get();
            try (Statement stmt = session.createStatement()) {
                        warn = nextWarn;
                            log.error(e1);

        }
        List<PostgreProcedureParameter> parameters = function.getInputParameters();
        String sql = SQL_ATTACH_TO_PORT.replaceAll("\\?portnumber", String.valueOf(localPortNumber));

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    private void attachGlobal(DBRProgressMonitor monitor, int oid, int targetPID) throws DBGException {
                                            new Object[]{
        log.debug("Select frame");
                            if (!PostgreConstants.EC_QUERY_CANCELED.equals(sqlState)) {
            throw new DBGException("SQL error", e);
                        String args = rs.getString("args");
                        log.debug(String.format("Return %d src char(s)", src.length()));
        } else {
    public void attach(DBRProgressMonitor monitor, Map<String, Object> configuration) throws DBException {
        log.debug("Attaching...");
                        throw new DBGException("Unable to create debug instance");
            super.closeSession(monitor);
                }
                        int pid = rs.getInt("pid");
        log.debug("Global breakpoint added");
            @NotNull
    }
        DBGEvent begin = new DBGEvent(this, DBGEvent.RESUME, eventDetail);
        log.debug("try continue for");
                break;

    }
                                    if (!CommonUtils.isNumber(paramValue)) { 
 * Licensed under the Apache License, Version 2.0 (the "License");
                                case NUMERIC: 
            }

import java.util.concurrent.ExecutionException;
    }
            } else {

                    return null;
    public Integer getSessionId() {
        }
import org.jkiss.dbeaver.debug.jdbc.DBGJDBCSession;
                            asyncStatement.completeExceptionally(e);
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    PostgreDebugSession(DBRProgressMonitor monitor, DBGBaseController controller)
        log.debug("step into realized");
import java.sql.*;

        int totalWaitMs = 0;
            JDBCUtils.executeQuery(session, composeAbortCommand());
        log.debug(String.format("Return %d stack frame(s)", stack.size()));
            log.debug("Attaching locally....");
                    totalWaitMs += LOCAL_WAIT_MS;
                    throw new DBGException("Incorrect variable class");
import org.jkiss.dbeaver.ext.postgresql.debug.PostgreDebugConstants;
            throw new DBGException("SQL error", e);
                        log.debug("Local statement executed (ANHWIE)");
    @Override
                                                "numeric",
 * <br/>
 *     http://www.apache.org/licenses/LICENSE-2.0
            default:
     * Return source for func OID in debug session
            attachLocal(monitor, function, parameterValues);
            }
                }
    public boolean isDone() {
    public boolean canStepInto() {
            JDBCDataSource src = this.controllerConnection.getDataSource();
                if (pgSrc.getInfo() instanceof JDBCDataSourceInfo) {

                log.debug("Local statement executed");

        String sessionParam = String.valueOf(getSessionId());
import org.jkiss.utils.IOUtils;
/*
            throw new DBGException("PostgreSQL debug plugin is not installed on the server.\n" +

                    while (rs.next()) {
            sessionId = attachToPort(monitor, portNumber);
 * You may obtain a copy of the License at

                        log.debug(String.format("Prepared local call %s", query));
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                        StringBuilder query = new StringBuilder();


            return;
        String taskName = "PostgreSQL Debug - Global session " + sessionParam;
    private Integer tryParsePortNumber(@Nullable String notice) {
    public void execStepOver() throws DBGException {
 */
    }
            + ", breakpoints=" + getBreakpoints() + "targetId=(" + sessionInfo.getID() + ") Session=(" + sessionInfo.toString()
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Check debug plugin installation")) {
            return true;
                    return dbgOID;
                        String varclass = rs.getString("varclass");
        log.debug("Closing session.");
        String sql = commandPattern.replaceAll("\\?sessionid", String.valueOf(sessionId));
            .replaceAll("\\?obj", String.valueOf(functionOid))
                        String name = rs.getString("name");
                            } 
            attachKind = PostgreDebugAttachKind.GLOBAL;
                                    }
                        asyncStatement.complete(statement);
        if (localWorkerJob == null || Status.OK_STATUS.equals(localWorkerJob.getResult())) {
 * 3. when execStepXXX or continue will called session goes in <b>WAITING</b>
        log.debug("Set var value");
        try (JDBCSession session = getControllerConnection().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Get debug stack frame")) {

                                throw new DBGException(NLS.bind(
            JDBCExecutionContext connection = (JDBCExecutionContext) controllerConnection.getOwnerInstance().openIsolatedContext(monitor, "Debug process session", null);
 * true<br/>
                            return Status.CANCEL_STATUS;

 * 0. create session (now it can only attached to target Procedure)<br/>
                            query.append(" }");
            localWorkerJob = runLocalProc(connection, function, parameters, taskName, asyncStatement);
        log.debug("try step into");
                } else {
            try (Statement stmt = session.createStatement()) {
                instance = function.getDatabase();
        try (JDBCSession session = getControllerConnection().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Set debug variable")) {
            log.debug("Unable to abort local session");
    }
                    try {
                        }
    private int functionOid = -1;
        }

 * you may not use this file except in compliance with the License.
                        int dtype = rs.getInt("dtype");
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            throw new DBGException(unmatched);
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                    log.debug(String.format("Database Product Name %s", JDBCinfo.getDatabaseProductName()));
                                    break;
        String message = String.format("Unable to get source for stack %s", stack);
     * the target stops at another breakpoint.

        return stack;
                            switch (parameters.get(i).getDataKind()) {
            attachKind = PostgreDebugAttachKind.LOCAL;
    @Override
     *
        log.debug("Get vars values");
        long lineNumber = bp.isOnStart() ? -1 : bp.getLineNo();
        log.debug("Exec return not implemented");
        if (stack != null) {
                    String dbgOID = rs.getString(1);
            throw new DBGException("Error creating target", e);
    }
 * DBeaver - Universal Database Manager
        return sessionId > 0;
    private static final String SQL_DROP_BREAKPOINT = "select pldbg_drop_breakpoint(?sessionid, ?obj, ?line)";
            }

                    if (!rs.next()) {
            log.debug(unmatched);
                try (JDBCSession session = connection.openSession(monitor, DBCExecutionPurpose.USER, "Run SQL command")) {

                log.debug(String.format("Active user %s", instance.getMetaContext().getActiveUser()));
     * Return true if debug session up and running on server
     * @return boolean
        String sql = SQL_ATTACH.replaceAll("\\?sessionid", sessionParam);
 */
                                Thread.sleep(LOCAL_WAIT_MS);

     * You can change the debugger focus to other stack frames - once you do
                        try {

                        if (!asyncStatement.isDone()) {
                    while (rs.next()) {
                PostgreDataSource pgSrc = (PostgreDataSource) src;

                        log.debug(String.format("Waiting for the next warning %s", warn.getMessage()));
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    }
                        stmt.setInt(3, var.getLineNumber());

                    if (rs.next()) {
    }
            case LOCAL:

                        // 2. clearWarnings() cannot be used to release handled warns' memory even while polling with the getNextWarning(),
                }
        switch (attachKind) {
                    throw new DBGException("Error while attaching to port");
            throw new DBGException("Error attaching to port", e);
        runAsync(sql, taskName, begin, end);
            this.controllerConnection = (JDBCExecutionContext) instance.openIsolatedContext(monitor, "Debug controller session", null);
                        String src = rs.getString(1);
            String.valueOf(frameNumber));
        } catch (SQLException e) {
        try (JDBCSession session = getControllerConnection().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Select debug frame")) {
        log.debug("continue execution realized");
    public boolean canStepReturn() {
    }
import org.jkiss.dbeaver.ext.postgresql.debug.core.PostgreSqlDebugCore;
            try (Statement stmt = session.createStatement()) {
                            DBDValueHandler valueHandler = DBUtils.findValueHandler(session, parameter);
                        }


                        //    but see the previous point above.
                            String paramValue = paramValues.get(i);
    }
    @Override
     * @return boolean

package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
            PostgreDatabase instance;
    }
                        int attResult = rs.getInt(1);
            }
            throw new DBGException("SQL error", e);
                    } else {
                    }
    @Override
            log.debug(String.format("Error rcv port number %s", e.getMessage()));
    /**
    public boolean isAttached() {
    private static final Log log = Log.getLog(PostgreDebugSession.class);

        }
import org.jkiss.dbeaver.debug.core.DebugUtils;
        }
                        } else {
        try (JDBCSession session = connection.openSession(monitor, DBCExecutionPurpose.UTIL, "Attach to port")) {
            log.debug("Global deattached");
    private static final String SQL_SET_BREAKPOINT = "select pldbg_set_breakpoint(?sessionid, ?obj, ?line)";
        }
    }
    protected Job runLocalProc(
                                    parameters.get(i).getName()
            try (Statement stmt = session.createStatement()) {
    }
     * of a step/into or step/over), the debugger changes focus to most deeply
import java.util.concurrent.CompletableFuture;
            log.debug("Error setting var: " + e.getMessage());
        log.debug("Global session started");
                                            new Object[]{
     * step or continue) in debug thread
     */
            throw new DBGException("SQL error", e);
    private volatile Job localWorkerJob = null;
        }
        return SQL_DROP_BREAKPOINT.replaceAll("\\?sessionid", String.valueOf(getSessionId()))
            log.debug(String.format("Error creating debug session %s", e.getMessage()));
                                    break;
        throws DBGException {
    @Override
    public JDBCExecutionContext getControllerConnection() {
    private static final String SQL_ABORT = "select pldbg_abort_target(?sessionid)";
        log.debug(String.format("Adding breakpoint to line #%d", lineNumber));
        return sessionId;
                        } catch (Exception e1) {
        } catch (SQLException e) {
    private static final String SQL_STEP_INTO = "select pldbg_step_into(?sessionid)";
        log.debug(String.format("Attach to local port number %d", localPortNumber));
        } catch (DBException e) {
        } finally {
/*
                return false;
                    }
            case GLOBAL:

                        boolean isnotnull = rs.getBoolean("isnotnull");
            getController().fireEvent(new DBGEvent(this, DBGEvent.SUSPEND, DBGEvent.MODEL_SPECIFIC));
                        log.debug("Var value set");
                        stmt.setInt(1, sessionId);
                try (ResultSet rs = stmt.executeQuery(sql)) {
                            PostgreProcedureParameter parameter = parameters.get(i);

                    if (rs.next()) {
            createSlot(monitor, connection, function);
                return result;
                        log.debug("Unable to select frame");
                try (ResultSet rs = stmt.executeQuery(sql)) {
                            query.append(paramValue);
                        log.debug(String.format("Attached to local port %d", attResult));
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                        return attResult;
                log.debug(String.format("Catch local port number %d", result));
                        statement.execute();
    public void execContinue() throws DBGException {
                                        ));
                try (ResultSet rs = stmt.executeQuery(sql)) {
                log.debug("First warning received");
        } catch (SQLException e) {
                        query.append(")");
 * Unless required by applicable law or agreed to in writing, software
        } catch (SQLException e) {
                        throw new DBGException("Unable to select frame");
                        while (!statement.isClosed() && totalWaitMs < LOCAL_TIMEOT_MS && nextWarn == null) {
                do {
        "SELECT pid,usename,application_name,state,query\n" +
            // Execution already terminated
     * <p>
                        }
            log.error("Unable to abort local target", e);
                    } else {
    }

                } while (!statement.isClosed() && totalWaitMs < LOCAL_TIMEOT_MS);
            return src;
            log.debug("Error loading stack frame: " + e.getMessage());
                            String sqlState = e instanceof SQLException ? ((SQLException) e).getSQLState() : null;
    @NotNull
    public void execStepInto() throws DBGException {
        execContinue();
    private String createSlot(DBRProgressMonitor monitor, JDBCExecutionContext connection, PostgreProcedure function) throws DBGException {
                }
     * call stack). Whenever the target stops (at a breakpoint or as the result
        @NotNull CompletableFuture<JDBCCallableStatement> asyncStatement
            log.debug("Debug plugin not installed: " + e.getMessage());
                            } 
            
                            log.debug("Error clearing local statment");
import org.jkiss.code.Nullable;
            case LOCAL:
     */
        String sql = SQL_PREPARE_SLOT.replaceAll("\\?objectid", objId);
        log.debug(String.format("Waiting for port number with timeout %d", LOCAL_TIMEOT_MS));
                                ));
                        log.debug(String.format("Global session ID %d", sessionId));
                } else {
            throw new DBGException("Error rcv port number", e);

    private static final String SQL_SELECT_FRAME = "select * from pldbg_select_frame(?sessionid,?frameno)";
        return controllerConnection;
                        String applicationName = rs.getString("application_name");
        } catch (SQLException e) {
        try (JDBCSession session = getControllerConnection().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Read debug variables")) {
                                    }
    }
        return job;
                        query.append(function.getFullyQualifiedName(DBPEvaluationContext.DML)).append("(");
                            query.append("{ CALL ");
                    if (localPort !=  null) {
     */
            log.debug("Session closed.");
            }
     */
import org.jkiss.dbeaver.DBException;
                                            }
        job.schedule();
    }
        log.debug("Unable to rcv port number");
                    JDBCDataSourceInfo JDBCinfo = (JDBCDataSourceInfo) pgSrc.getInfo();
            selectFrame(stack.getLevel());
                        log.debug("Error creating target slot");
        return sessionInfo;


                        } else {
        DBGEvent end = new DBGEvent(this, DBGEvent.SUSPEND, eventDetail);
            + ") " + "]";
            String.valueOf(OID));
                "Refer to this WIKI article for installation instructions:\n" +
                                log.error(name, e);
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Abort global session")) {
    private static final int LOCAL_TIMEOT_MS = 50 * (2 * LOCAL_WAIT_MS); // 50 sec
    public List<DBGStackFrame> getStack() throws DBGException {
            int processId = CommonUtils.toInt(configuration.get(PostgreDebugConstants.ATTR_ATTACH_PROCESS));

        if (parameters.size() != paramValues.size()) {
        execStep(SQL_STEP_OVER, " step over for ", DBGEvent.STEP_OVER);
                                statement.close();
 * 1. attach to target this method attaches to a debugging target and listening
            log.debug("Local attached");
            log.debug("Debug plugin is installed:\n" + version);
    public void resume() throws DBGException {
        } catch (Exception e) {
     * Return true if session waiting target connection (on breakpoint, after
        List<DBGVariable<?>> vars = new ArrayList<>();
     * Create session with two description after creation session need to be
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
            throw new DBGException("SQL error", e);
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    }
        log.debug("continue for realized");
            while (!statement.isClosed() && totalWaitMs < LOCAL_TIMEOT_MS && warn == null) {
                    if (rs.next()) {
        } catch (SQLException e) {
                try (ResultSet rs = stmt.executeQuery(sql)) {

                            if (statement != null) {

            }

        boolean global = isGlobalSession(configuration);
            "FROM pg_stat_activity WHERE pid = pg_backend_pid()"; //$NON-NLS-1$
        }
                        for (int i = 0; i < parameters.size(); i++) {
            throw new DBGException("SQL error", e);
        @NotNull String name,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }

 *
                "https://github.com/dbeaver/dbeaver/wiki/PGDebugger#installation");
                            if (nextWarn == null) {
        PostgreDebugBreakpointDescriptor bp = (PostgreDebugBreakpointDescriptor) breakpointDescriptor;
        String sql = SQL_GET_VARS.replaceAll("\\?sessionid", String.valueOf(sessionId));
    public boolean canStepOver() {
                        stack.add(frame);
            log.debug("Error getting vars: " + e.getMessage());
    private static final String SQL_CURRENT_SESSION =
    }
    public void suspend() throws DBGException {

        String sql = SQL_GET_STACK.replaceAll("\\?sessionid", String.valueOf(getSessionId()));
                                    break;
     * executing).
                        String targetname = rs.getString("targetname");
    /**
    /**

                break;
            log.debug(String.format("Error creating target %s", e.getMessage()));
    /**

                        return new PostgreDebugSessionInfo(pid, usename, applicationName, state, query);
                return Status.OK_STATUS;
            }
        log.debug(String.format("Function OID %d", functionOid));
                break;
    private static final String SQL_SET_GLOBAL_BREAKPOINT = "select pldbg_set_global_breakpoint(?sessionid, ?obj, ?line, ?target)";
        try {
        } catch (SQLException e) {
import org.jkiss.dbeaver.debug.*;
        return "PostgreDebugSession " + (isWaiting() ? "WAITING" : "READY") + " [sessionId=" + sessionId
        if (global) {
        log.debug("Get stack");
    public void selectFrame(int frameNumber) throws DBGException {

                detachLocal(monitor, getControllerConnection());
                        connection.close();
                        throw new DBGException("Incorrect variable value class");
                    } catch (Exception e) {
    @Override
                        }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCCallableStatement;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
                    log.debug(String.format("Parsing warning %s", warn.getMessage()));
            try {
            }
                                                "boolean",
        }
        }
                        if (function.getProcedureType() == DBSProcedureType.PROCEDURE) {
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Attach to port")) {
import org.eclipse.core.runtime.Status;
 * See the License for the specific language governing permissions and
                    }
        try {

                        int linenumber = rs.getInt("linenumber");
*/
import org.jkiss.utils.CommonUtils;
                detachGlobal(monitor);
     * Execute step SQL command asynchronously, set debug session name to
    /**
                        int linenumber = rs.getInt("linenumber");
                                            PostgreDebugCoreMessages.PostgreSqlDebugCore_parameter_type_not_fit_message,
 * on the given port - waiting for run procedure in other session(s) debugger
    }
        return sqlPattern.replaceAll("\\?sessionid", String.valueOf(getSessionId()))
                        log.debug("Local port obtained");
     * @param nameParameter  - session 'name' part
                return sessionId > 0;
    private DBGSessionInfo sessionInfo;
        } catch (SQLException e) {
    protected String composeAbortCommand() {
        String sql = SQL_GET_SRC.replaceAll("\\?sessionid", String.valueOf(sessionId)).replaceAll("\\?oid",
 *
                        //    so Postgresql JDBC Driver repository recommends to poll on getNextWarning() 
import org.eclipse.core.runtime.IStatus;
                instance = dataSource.getDefaultInstance();
    }
                        }
        log.debug("step over realized");
    private static final String SQL_GET_SRC = "select pldbg_get_source(?sessionid,?oid)";

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;

    private boolean isGlobalSession(Map<String, Object> configuration) {

    private void detachGlobal(DBRProgressMonitor monitor) throws DBGException {
            List<String> parameterValues = (List<String>) configuration.get(PostgreDebugConstants.ATTR_FUNCTION_PARAMETERS);
    private static final String SQL_GET_VARS = "select * from pldbg_get_variables(?sessionid)";
                log.debug("Unknown Driver version");
    private static final String SQL_GET_STACK = "select * from pldbg_get_stack(?sessionid)";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private PostgreDebugAttachKind attachKind = PostgreDebugAttachKind.UNKNOWN;
        if (!isAttached()) {

            throw new DBGException("Error opening debug session", e);
        } catch (InterruptedException | ExecutionException | SQLException e) {

        if (!checkDebugPlugin(monitor)) {

        }

    private void detachLocal(DBRProgressMonitor monitor, JDBCExecutionContext connection) throws DBGException {
                        log.debug("Incorrect variable value class");
                                            PostgreDebugCoreMessages.PostgreSqlDebugCore_parameter_type_not_fit_message,

     * This function changes the debugger focus to the indicated frame (in the
                    }


                        statement = session.prepareCall(query.toString());
        return vars;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureParameter;
        PostgreDataSource dataSource = (PostgreDataSource) controller.getDataSourceContainer().getDataSource();
                return null;
            return;
 * Typical scenario for debug session <br/>

        @NotNull List<String> paramValues,
            } else {
                    throw new DBGException("Error getting session");
    private final JDBCExecutionContext controllerConnection;
    protected String composeAddBreakpointCommand(DBGBreakpointDescriptor descriptor) {
                                                paramValue
    }
import org.jkiss.dbeaver.Log;
                try (ResultSet rs = stmt.executeQuery(SQL_LISTEN)) {
    }
    private static final String MAGIC_PORT = "PLDBGBREAK";
    @Nullable
    
        return true;
                                        throw new DBGException(NLS.bind(

        DBGEvent end = new DBGEvent(this, DBGEvent.SUSPEND, DBGEvent.BREAKPOINT);

            log.debug(String.format("Attached local session UD = %d", sessionId));
            return false;

                                        ));
     * @return String
     * that, you can examine the source code for that frame, the variable values
    public void execStepReturn() throws DBGException {
     * in that frame, and the breakpoints in that target.
                        String state = rs.getString("state");
                                            }
    public String getSource(int OID) throws DBGException {
                        // 1. warnings added between calls to getWarnings() and clearWarnings() may be missed, 
     * forever while target or any (depend on targetPID) session will run target
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Attach global")) {
                    log.debug(String.format("Driver Name %s", JDBCinfo.getDriverName()));

        try (JDBCSession session = connection.openSession(monitor, DBCExecutionPurpose.UTIL, "Abort local session")) {
    @Override

                        stmt.execute();
        String sqlPattern = attachKind == PostgreDebugAttachKind.GLOBAL ? SQL_SET_GLOBAL_BREAKPOINT : SQL_SET_BREAKPOINT;
                        if (function.getProcedureType() == DBSProcedureType.PROCEDURE) {
        return null;
        return false;
        return SQL_ABORT.replaceAll("\\?sessionid", String.valueOf(sessionId));
     * [sessionID] name [managerPID]
/**
                        //    making the following warnings unobservable with getNextWarning(), and so forcing us to getWarnings() again,
        try {
                        for (int i = 0; i < parameters.size(); i++) {
                                    PostgreDebugCoreMessages.PostgreSqlDebugCore_parameters_not_set_message,
                                totalWaitMs += LOCAL_WAIT_MS;
    @Override
        throw new DBGException("Exec return not implemented");

                PostgreProcedure function = PostgreSqlDebugCore.resolveFunction(monitor, controller.getDataSourceContainer(), controller.getDebugConfiguration());
            }
    /**
        if (notice != null && notice.startsWith(MAGIC_PORT)) {
    }
            attachGlobal(monitor, functionOid, processId);
                        vars.add(var);
    }
    private int attachToPort(@NotNull DBRProgressMonitor monitor, int localPortNumber) throws DBGException {
                            String paramValue = paramValues.get(i);
            .replaceAll("\\?line", bp.isOnStart() ? "-1" : String.valueOf(bp.getLineNo()));
                                case BOOLEAN:
                        stmt.setString(2, var.getName());
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        }
    public void closeSession(DBRProgressMonitor monitor) throws DBGException {
        }
        Job job = new AbstractJob(name) {
    protected void doDetach(DBRProgressMonitor monitor) throws DBGException {
                        PostgreDebugVariable var = (PostgreDebugVariable) variable;
            try (Statement stmt = session.createStatement()) {
        } catch (SQLException e) {
                if (variable instanceof PostgreDebugVariable) {
                        String usename = rs.getString("usename");
        bpGlobal = new PostgreDebugBreakpointDescriptor(oid, -1);
            @Override

 * state until next breakpoint or end of procedure will be reached <br/>
        }
            this.sessionInfo = getSessionDescriptor(monitor, connection);
 * <b>WAITING</b> state - isDone returns false and is isWaiting returns
    private void attachLocal(DBRProgressMonitor monitor, PostgreProcedure function, List<String> parameters) throws DBGException {
                                                parameters.get(i).getName(),
                                return DebugUtils.newErrorStatus(name, e);
            try (Statement stmt = session.createStatement()) {
        log.debug("Run local proc");
        return PostgreDebugConstants.ATTACH_KIND_GLOBAL.equals(String.valueOf(configuration.get(PostgreDebugConstants.ATTR_ATTACH_KIND)));

                }

 * be reached and session goes in state <b>READY</b> (isDone - true, isWaiting -
    private int sessionId = -1;

import org.jkiss.dbeaver.ext.postgresql.debug.internal.PostgreDebugCoreMessages;
 * 2. when target procedure will called debug session implicit breakpoint will

            }
        } catch (DBException e) {
                        int func = rs.getInt("func");
    }


 * distributed under the License is distributed on an "AS IS" BASIS,
            PostgreProcedure function = PostgreSqlDebugCore.resolveFunction(monitor, controllerConnection.getDataSource().getContainer(), configuration);
                            }
    @Override
        };
                    log.debug("Incorrect variable class");
            case GLOBAL:
            String taskName = "PostgreSQL Debug - Local session " + sessionInfo.getID();
import org.jkiss.code.NotNull;
                                default:
    @Override
    }
            log.debug("Start local port waiting....");
            .replaceAll("\\?line", String.valueOf(lineNumber))
    ) throws DBGException {
        return true;
    protected String composeRemoveBreakpointCommand(DBGBreakpointDescriptor breakpointDescriptor) {
        log.debug("Get source");
            if (controllerConnection != null) {
 * <br/>
        log.debug(String.format("Create slot for object ID %s", objId));
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
    @Override
            }
                        boolean isconst = rs.getBoolean("isconst");

                        stmt.setString(4, (String) value);
 *
                    JDBCCallableStatement statement = null;
            throw new DBGException(e, dataSource);

            if (src instanceof PostgreDataSource) {
            JDBCUtils.executeQuery(session, composeAbortCommand());
                warn = statement.getWarnings(); // poll the first warn on the statement itself
        List<DBGStackFrame> stack = new ArrayList<>(1);
        log.debug(String.format("Return %d var(s)", vars.size()));
                        }
        DBGEvent begin = new DBGEvent(this, DBGEvent.RESUME, DBGEvent.MODEL_SPECIFIC);
        try (JDBCSession session = connection.openSession(monitor, DBCExecutionPurpose.UTIL, "Read session info")) {
            log.debug("Controller session creating.");

    public String toString() {
            
     */
    }
            try (Statement stmt = session.createStatement()) {
                if (warn == null) {
            .replaceAll("\\?target", bp.isAll() ? "null" : String.valueOf(bp.getTargetId()));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }

                        SQLWarning nextWarn = null;
    public void execStep(String commandPattern, String nameParameter, int eventDetail) throws DBGException {
        log.debug("try step over");
        @NotNull PostgreProcedure function,
    /**
