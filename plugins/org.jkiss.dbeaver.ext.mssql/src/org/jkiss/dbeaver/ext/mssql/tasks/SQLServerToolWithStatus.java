import java.sql.SQLException;
public abstract class SQLServerToolWithStatus<OBJECT_TYPE extends DBSObject, SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>>
 * you may not use this file except in compliance with the License.

            while (warning != null) {
    DBCSession session, @NotNull DBCStatement dbStat) throws DBCException {
        @Property(viewable = true, order = 2)
        }
                statusList.add(new ToolStatus(object, "Done"));
 */
    public List<ToolStatus> getExecuteStatistics(@NotNull OBJECT_TYPE object, @NotNull SETTINGS settings, @NotNull DBEPersistAction action, @NotNull
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * See the License for the specific language governing permissions and
        @Property(viewable = true, order = 1)
        } catch (SQLException e) {


            return message;
import java.util.ArrayList;
    @NotNull
        }
        try {
/*
        public OBJECT_TYPE getObject() {
        ToolStatus(OBJECT_TYPE object, String message) {
    }
import org.jkiss.code.NotNull;
import java.util.List;
 * limitations under the License.

    @Override
 *

        extends SQLToolExecuteHandler<OBJECT_TYPE, SETTINGS> implements SQLToolRunStatisticsGenerator<OBJECT_TYPE, SETTINGS, DBEPersistAction> {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.mssql.tasks;
            super(object);
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;

                warning = warning.getNextWarning();
            if (warnNum == 0) {
import org.jkiss.dbeaver.model.sql.task.SQLToolRunStatisticsGenerator;
        }
                warnNum++;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        public String getMessage() {

            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            SQLWarning warning = ((JDBCStatement) dbStat).getWarnings();
    public class ToolStatus extends SQLToolStatistics<OBJECT_TYPE> {
import org.jkiss.dbeaver.model.exec.DBCStatement;
import org.jkiss.dbeaver.model.exec.DBCException;
            }
        return statusList;
 *
        @Override
            // ignore
                statusList.add(new ToolStatus(object, warning.getMessage()));
    }
}
        private final String message;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<ToolStatus> statusList = new ArrayList<>();
import java.sql.SQLWarning;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.meta.Property;
 * You may obtain a copy of the License at
            return super.getObject();
            this.message = message;
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Unless required by applicable law or agreed to in writing, software
 *
            int warnNum = 0;
