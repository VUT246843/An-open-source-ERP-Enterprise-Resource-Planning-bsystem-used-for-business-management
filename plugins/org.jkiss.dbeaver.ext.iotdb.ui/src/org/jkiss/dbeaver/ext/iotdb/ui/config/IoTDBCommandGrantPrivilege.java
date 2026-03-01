 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
 */
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBRelationalUser;
                                      String database,
            default -> "";
            grantScript = "GRANT " + privilegeName + " ON " + scope + " TO USER " + getObject().getName();
 *     http://www.apache.org/licenses/LICENSE-2.0
            case 3 -> revokeScript;

 *
 * limitations under the License.
        String operationScript = switch (operationType) {
     * revoke [3]
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor,
 * Copyright (C) 2010-2024 DBeaver Corp and others

import java.util.Map;
                                      int type,
    public IoTDBCommandGrantPrivilege(IoTDBRelationalUser user,
        if (database.isEmpty() || table.isEmpty()) {
     * revoke grant [0]


import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * You may obtain a copy of the License at
            }
            new SQLDatabasePersistAction("Grant or Revoke Privilege", grantScript)
                                      IoTDBPrivilege privilege) {
        } else {

/*
    }
                scopeType = 1;

            case 2 -> grantScript + " WITH GRANT OPTION";
        return operationType == 0 ? new DBEPersistAction[] {
    private int operationType;
     *
        String revokeScript = "";
            revokeScript = "REVOKE " + privilegeName + " ON " + scope + " FROM USER " + getObject().getName();
        };
            new SQLDatabasePersistAction("Grant or Revoke Privilege", operationScript)
 *
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String table;
package org.jkiss.dbeaver.ext.iotdb.ui.config;
    @Override
            revokeScript = "REVOKE " + privilegeName + " FROM USER " + getObject().getName();

 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return
            case 1 -> grantScript;
            grantScript = "GRANT " + privilegeName + " TO USER " + getObject().getName();
            int scopeType = 0;
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBPrivilege;

                                      String table,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    private String database;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * grant [1]
        } : new DBEPersistAction[] {
}

        String grantScript = "";
import org.jkiss.code.NotNull;
public class IoTDBCommandGrantPrivilege extends DBECommandAbstract<IoTDBRelationalUser> {
                                                @NotNull DBCExecutionContext executionContext,
            case 0 -> revokeScript;
     */
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        this.operationType = type;
        super(user, "Grant or Revoke Privilege");
            if (database.equals("(ALL)")) {
        this.privilege = privilege;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software


            } else if (table.equals("(ALL)")) {
     * grant with option [2]
                scopeType = 2;
        };
        this.table = table;
 * you may not use this file except in compliance with the License.
            String scope = scopeType == 0 ? (database + "." + table) : (scopeType == 1 ? ("DATABASE " + database) : "ANY");
    /**
                                                @NotNull Map<String, Object> options) {
        String privilegeName = privilege.getName().toUpperCase();
            new SQLDatabasePersistAction("Grant or Revoke Privilege", operationScript),
        }
        this.database = database;
    private IoTDBPrivilege privilege;
    @NotNull
