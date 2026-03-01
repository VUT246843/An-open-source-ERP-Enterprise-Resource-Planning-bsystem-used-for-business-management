        }

 * you may not use this file except in compliance with the License.

/**
                    String ddl = sql.toString();
                            sql.append(ddl);
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.NotNull;
                            sql.append(";\n");
            return null;
    private static final Log log = Log.getLog(SQLiteUtils.class);

 *
import org.jkiss.dbeaver.model.struct.DBSObject;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(

    public static String readMasterDefinition(DBRProgressMonitor monitor, DBSObject sourceObject, SQLiteObjectType objectType, String sourceObjectName, GenericTableBase table) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
        } catch (Exception e) {
}
                        if (ddl != null) {
            Map<String, Object> options = new HashMap<>();
                        String ddl = resultSet.getString(1);
package org.jkiss.dbeaver.ext.sqlite;
                    dbStat.setString(paramIndex++, sourceObjectName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Load SQLite description")) {
                    + "\n" + "UNION ALL\n" + "SELECT sql FROM "
            }
    }
import org.jkiss.dbeaver.ext.sqlite.edit.SQLiteTableManager;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                if (sourceObjectName != null) {
        if (DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(table.getClass()) instanceof SQLiteTableManager tableManager) {
import org.jkiss.api.CompositeObjectId;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                }
    public static final CompositeObjectId DRIVER_REFERENCE = new CompositeObjectId("sqlite", "sqlite_jdbc");
                    StringBuilder sql = new StringBuilder();
 */
import java.util.Map;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.DBUtils;
                    while (resultSet.next()) {
                int paramIndex = 1;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    return ddl;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteTable;
    }
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {

                    }
/*
                    + "sqlite_temp_master WHERE type=? AND tbl_name=?" + (sourceObjectName != null ? " AND name=?" : "")
import java.util.HashMap;
 *
public class SQLiteUtils {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            log.debug(e);
            tableManager.addRecreateCommand(commandContext, table, options, sourceCommand);
 * DBeaver - Universal Database Manager

                                      DBUtils.getQuotedIdentifier(sourceObject.getParentObject()) + "." : "")
                }
                "SELECT sql FROM " + (sourceObject.getParentObject() instanceof GenericSchema ?
                    + "\n"))
 */
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
                dbStat.setString(paramIndex++, objectType.name());
                dbStat.setString(paramIndex++, table.getName());
                    dbStat.setString(paramIndex++, sourceObjectName);
                    //ddl = ddl.replaceAll("(?i)CREATE VIEW", "CREATE OR REPLACE VIEW");
                }
                dbStat.setString(paramIndex++, table.getName());
import org.jkiss.dbeaver.ext.sqlite.model.SQLiteObjectType;
                    + "sqlite_master WHERE type=? AND tbl_name=?" + (sourceObjectName != null ? " AND name=?" : "")
 * limitations under the License.
                if (sourceObjectName != null) {
 * You may obtain a copy of the License at
                        }
                dbStat.setString(paramIndex++, objectType.name());
    public static void makeRecreateTableCommand(DBECommandContext commandContext, SQLiteTable table, DBECommand sourceCommand) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBECommand;
 * SQLiteUtils
            {
