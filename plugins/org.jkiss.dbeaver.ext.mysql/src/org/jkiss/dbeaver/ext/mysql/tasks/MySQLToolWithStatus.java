 * you may not use this file except in compliance with the License.


        private final String messageText;
{
/*
        @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * limitations under the License.
 * You may obtain a copy of the License at
    public List<ToolStatus> getExecuteStatistics(@NotNull OBJECT_TYPE object, @NotNull SETTINGS settings, @NotNull DBEPersistAction action, @NotNull
            super(object);
 * distributed under the License is distributed on an "AS IS" BASIS,
                        object,
import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
            return messageType;

            return statusList;
public abstract class MySQLToolWithStatus<OBJECT_TYPE extends DBSObject, SETTINGS extends SQLToolExecuteSettings<OBJECT_TYPE>>

import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.ArrayList;
 */
        ToolStatus(OBJECT_TYPE object, String messageType, String messageText) {
            List<ToolStatus> statusList = new ArrayList<>();
 *
        private final String messageType;

        }

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!(dbResult instanceof JDBCResultSet)) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return messageText;
        }
                        JDBCUtils.safeGetString((JDBCResultSet) dbResult, "Msg_type"),
                statusList.add(
            return super.getObject();
    }

            while (dbResult.nextRow()) {
        @Property(viewable = true, order = 3)
    extends SQLToolExecuteHandler<OBJECT_TYPE, SETTINGS> implements SQLToolRunStatisticsGenerator<OBJECT_TYPE, SETTINGS, DBEPersistAction>
            }
        @Override
    DBCSession session, @NotNull DBCStatement dbStat) throws DBException {
        DBCResultSet dbResult = dbStat.openResultSet();
        public String getMessageType() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
import org.jkiss.dbeaver.model.sql.task.SQLToolRunStatisticsGenerator;
        public String getMessageText() {
 * DBeaver - Universal Database Manager
                    new ToolStatus(
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Property(viewable = true, order = 1)
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCResultSet;

        try (dbResult) {

    public class ToolStatus extends SQLToolStatistics<OBJECT_TYPE> {
import org.jkiss.dbeaver.model.exec.DBCStatement;
import org.jkiss.dbeaver.model.exec.DBCSession;
        public OBJECT_TYPE getObject() {
            return Collections.emptyList();
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import java.util.List;
import org.jkiss.dbeaver.model.meta.Property;
            this.messageText = messageText;
 * Abstract tool with status
import java.util.Collections;
}
 *
        }
    @NotNull
/**
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.mysql.tasks;

 * See the License for the specific language governing permissions and
            this.messageType = messageType;
                        JDBCUtils.safeGetString((JDBCResultSet) dbResult, "Msg_text")));
    }
