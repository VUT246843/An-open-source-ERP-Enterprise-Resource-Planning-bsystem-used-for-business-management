import java.util.ArrayList;
 * You may obtain a copy of the License at
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBGJDBCWorker job = this.workerJob;
                throw new DBGException("SQL error", e);


 *     http://www.apache.org/licenses/LICENSE-2.0
                stmt.execute(sqlCommand);

    protected abstract String composeAbortCommand();
        }
        controller.fireEvent(event);
        if (!isAttached()) {
    }
                stmt.execute(sqlQuery);
        }

 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
     * Return true if session up and running debug thread
 * limitations under the License.
     */
import org.jkiss.dbeaver.Log;
            try (Statement stmt = session.createStatement()) {
            } catch (SQLException e) {
    }
 * you may not use this file except in compliance with the License.


 *
        }

            return;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

    }
     * 
        workerJob = new DBGJDBCWorker(this, name, commandSQL, begin, end);
     * @return boolean
            try (Statement stmt = session.createStatement()) {
     * 



import org.jkiss.dbeaver.debug.*;


 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        return new ArrayList<>(breakpoints);

    public abstract JDBCExecutionContext getControllerConnection();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public abstract boolean isAttached();
    /**
        this.controller = controller;
 * Unless required by applicable law or agreed to in writing, software
        workerJob.schedule();
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Add breakpoint")) {
 * DBeaver - Universal Database Manager
                String sqlCommand = composeRemoveBreakpointCommand(bp);
 */
            breakpoints.remove(bp);
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }

                workerJob = null;
    public void addBreakpoint(DBRProgressMonitor monitor, DBGBreakpointDescriptor descriptor) throws DBGException {
    /**

 *
     * Start thread for SQL command
    protected void runAsync(String commandSQL, String name, DBGEvent begin, DBGEvent end) throws DBGException {
        if (!isDone() && workerJob != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            public void done(IJobChangeEvent event) {
                throw new DBGException("SQL error", e);
    /**
            }
            workerJob = null;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    @Override
import java.sql.Statement;
     * @return boolean
            } catch (SQLException e) {
        return (job != null && !job.isFinished());
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public void removeBreakpoint(DBRProgressMonitor monitor, DBGBreakpointDescriptor bp) throws DBGException {
    }
    }
    private final List<DBGBreakpointDescriptor> breakpoints = new ArrayList<>(1);
    protected DBGJDBCSession(DBGBaseController controller) {

    public void closeSession(DBRProgressMonitor monitor) throws DBGException {
    @Override
import java.sql.SQLException;
    }
    protected void fireEvent(DBGEvent event) {
package org.jkiss.dbeaver.debug.jdbc;
     */
            @Override
        return controller;
        doDetach(monitor);



 *
 * See the License for the specific language governing permissions and
        try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Remove breakpoint")) {
            breakpoints.add(descriptor);

 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected abstract void doDetach(DBRProgressMonitor monitor) throws DBGException;

     */
    public abstract boolean isDone();
     * Return true if debug session up and running on server
    public List<? extends DBGBreakpointDescriptor> getBreakpoints() {
/*
    private static final Log log = Log.getLog(DBGJDBCSession.class);
                String sqlQuery = composeAddBreakpointCommand(descriptor);
    @Override
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import java.util.List;
            }
    protected DBGBaseController getController() {
        workerJob.addJobChangeListener(new JobChangeAdapter() {
    public boolean isWaiting() {

    protected abstract String composeRemoveBreakpointCommand(DBGBreakpointDescriptor descriptor);
            workerJob.cancel();
}

    private final DBGBaseController controller;
    protected volatile DBGJDBCWorker workerJob;
public abstract class DBGJDBCSession implements DBGSession {
    protected abstract String composeAddBreakpointCommand(DBGBreakpointDescriptor descriptor);
