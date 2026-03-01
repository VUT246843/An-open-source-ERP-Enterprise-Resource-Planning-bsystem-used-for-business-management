        }
 *
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
    @Override
        } catch (SQLException e) {
        }
        @Property(viewable = true, order = 1)
        extends SQLToolExecuteHandler<OBJECT_TYPE, SETTINGS> implements SQLToolRunStatisticsGenerator<OBJECT_TYPE, SETTINGS, DBEPersistAction> {
 */


package org.jkiss.dbeaver.ext.postgresql.tasks;
                statusList.add(new ToolStatus(object, warning.getMessage()));
}
    public class ToolStatus extends SQLToolStatistics<OBJECT_TYPE> {
    @NotNull
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
            return super.getObject();
import org.jkiss.dbeaver.model.exec.DBCStatement;
 * limitations under the License.
        List<ToolStatus> statusList = new ArrayList<>();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.struct.DBSObject;
        @Property(viewable = true, order = 2)

import java.util.List;
        public String getMessage() {
        public OBJECT_TYPE getObject() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            if (warnNum == 0) {
                warnNum++;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
    public List<ToolStatus> getExecuteStatistics(@NotNull OBJECT_TYPE object, @NotNull SETTINGS settings, @NotNull DBEPersistAction action, @NotNull

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCException;
 *
        return statusList;
        }
        try {
                warning = warning.getNextWarning();
import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
import java.sql.SQLWarning;

 * Unless required by applicable law or agreed to in writing, software
import java.sql.SQLException;
        @Override
        }
        ToolStatus(OBJECT_TYPE object, String message) {
    DBCSession session, @NotNull DBCStatement dbStat) throws DBCException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            // ignore
        private final String message;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;
            }
public abstract class PostgreToolWithStatus<OBJECT_TYPE extends DBSObject, SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>>
            SQLWarning warning = ((JDBCStatement) dbStat).getWarnings();
            super(object);
            while (warning != null) {
            int warnNum = 0;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
                statusList.add(new ToolStatus(object, "Done"));
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
            }
            return message;
    }
import org.jkiss.dbeaver.model.sql.task.SQLToolRunStatisticsGenerator;
    }
            this.message = message;

 *
