    }
import java.sql.SQLException;
    private final DBGJDBCSession debugSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } finally {
            monitor.subTask(sql);
            try (Statement stmt = session.createStatement()) {
        this.before = begin;
 * distributed under the License is distributed on an "AS IS" BASIS,
                debugSession.fireEvent(before);

 */

public class DBGJDBCWorker extends AbstractJob {
    }
        monitor.beginTask("Execute debug job", 1);
}
    @Override
                return Status.OK_STATUS;
        try (JDBCSession session = debugSession.getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Run debug job")) {
/*
 *
            return GeneralUtils.makeExceptionStatus(String.format("Failed to execute %s", sql), e);
                debugSession.fireEvent(after);
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import java.sql.Statement;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            monitor.done();

 * limitations under the License.
    private final DBGEvent after;

 * DBeaver - Universal Database Manager
    private final String sql;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.GeneralUtils;
 * You may obtain a copy of the License at
                stmt.execute(sql);
    private final DBGEvent before;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(name);
        this.after = end;
        this.sql = sqlCommand;
    @NotNull

            }

        }
        this.debugSession = debugSession;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
    public DBGJDBCWorker(DBGJDBCSession debugSession, String name, String sqlCommand, DBGEvent begin, DBGEvent end) {
        } catch (SQLException e) {
import org.jkiss.dbeaver.debug.DBGEvent;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others


 *
 *
package org.jkiss.dbeaver.debug.jdbc;
