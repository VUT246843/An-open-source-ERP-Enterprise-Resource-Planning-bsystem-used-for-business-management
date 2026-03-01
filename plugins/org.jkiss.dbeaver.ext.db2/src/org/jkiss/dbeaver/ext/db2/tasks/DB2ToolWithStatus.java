import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
public abstract class DB2ToolWithStatus <OBJECT_TYPE extends DBSObject, SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>>
import org.jkiss.dbeaver.model.exec.DBCException;

        }
        public OBJECT_TYPE getObject() {
            while (warning != null) {
            this.message = message;
package org.jkiss.dbeaver.ext.db2.tasks;
            return super.getObject();

    DBCSession session, @NotNull DBCStatement dbStat) throws DBCException {

import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.exec.DBCStatement;
 *
            SQLWarning warning = ((JDBCStatement) dbStat).getWarnings();
    }
        public String getMessage() {
            int warnNum = 0;
    public class ToolStatus extends SQLToolStatistics<OBJECT_TYPE> {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
                warning = warning.getNextWarning();
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
import java.util.List;
 * You may obtain a copy of the License at
        @Property(viewable = true, order = 2)
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    public List<ToolStatus> getExecuteStatistics(@NotNull OBJECT_TYPE object, @NotNull SETTINGS settings, @NotNull DBEPersistAction action, @NotNull
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;

import java.sql.SQLWarning;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        return statusList;
        }
 * limitations under the License.
        @Override
        } catch (SQLException e) {
 * DBeaver - Universal Database Manager
    }
        ToolStatus(OBJECT_TYPE object, String message) {

import org.jkiss.dbeaver.model.meta.Property;
            }
        private final String message;
 *
        try {
import java.util.ArrayList;
            // ignore

        List<ToolStatus> statusList = new ArrayList<>();
        @Property(viewable = true, order = 1)
                warnNum++;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.code.NotNull;
            if (warnNum == 0) {
            super(object);
 */
}
 * See the License for the specific language governing permissions and
            return message;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        extends SQLToolExecuteHandler<OBJECT_TYPE, SETTINGS> implements SQLToolRunStatisticsGenerator<OBJECT_TYPE, SETTINGS, DBEPersistAction> {
    @Override
        }
import org.jkiss.dbeaver.model.sql.task.SQLToolRunStatisticsGenerator;
        }
                statusList.add(new ToolStatus(object, "Done")); //$NON-NLS-1$
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
                statusList.add(new ToolStatus(object, warning.getMessage()));

