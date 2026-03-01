    private List<IoTDBAbstractUser> users;
        List<IoTDBPrivilege> newPrivileges = new ArrayList<>();
    }
                        currentUserName = rs.getString("CurrentUser");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;

 * Unless required by applicable law or agreed to in writing, software
        }
/*
        if (privileges == null) {
     * @param name name of the privilege
        }
import org.jkiss.dbeaver.ext.iotdb.IoTDBPrivilegeInfo;
    private List<IoTDBAbstractUser> loadUsers(DBRProgressMonitor monitor) throws DBException {
                           boolean tree) throws DBException {

            try (JDBCStatement stmt = session.createStatement()) {



    /**
     *
    }
     *
    }
                }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        List<IoTDBPrivilege> privs = new ArrayList<>();
    }
        return users;
     *
                    }
                    return userList;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                    }
    private static final Log log = Log.getLog(IoTDBDataSource.class);
 * limitations under the License.
    public void generatePrivilegesList() {
            }
        } catch (Exception e) {
        String[] globalPrivileges = isTree ? IoTDBPrivilegeInfo.treeGlobalPrivileges : IoTDBPrivilegeInfo.tableGlobalPrivileges;
                        String tmpUserName = rs.getString("User");
            }
        if (users == null) {
                           @NotNull GenericMetaModel metaModel,
                                    hasManageUserPrivilege = true;
            generatePrivilegesList();
     *
                                new IoTDBRelationalUser(this, tmpUserName, monitor);
    }
        String[] dbPrivileges = isTree ? IoTDBPrivilegeInfo.treeSeriesPrivileges : IoTDBPrivilegeInfo.tableDatabasePrivileges;
        for (String privilege : dbPrivileges) {
    public List<IoTDBPrivilege> getAllPrivileges() {

                                    break;
        for (IoTDBPrivilege priv : getAllPrivileges()) {
import org.jkiss.dbeaver.Log;
                        }
        return privs;
            try (JDBCStatement stmt = session.createStatement()) {
     *
 * See the License for the specific language governing permissions and

    /**
    }

import org.jkiss.dbeaver.DBDatabaseException;
                privs.add(priv);
package org.jkiss.dbeaver.ext.iotdb.model;
import org.jkiss.code.NotNull;
    }
     * Get the privilege by name
        IoTDBPrivilegeInfo.Kind k = isGlobal ? IoTDBPrivilegeInfo.Kind.GLOBAL :
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Users")) {

        }
            log.error("Error loading users", e);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
     *
     * Load users from the database
     * @param monitor progress monitor
                    try (JDBCStatement stmt2 = session.createStatement()) {
        this.users = loadUsers(monitor);
    /**
     *
    public List<IoTDBAbstractUser> getUsers(DBRProgressMonitor monitor) throws DBException {
 *
import org.jkiss.dbeaver.DBException;
        }
                            continue;
            throw new DBDatabaseException(e, this);
        this.privileges = newPrivileges;
    public boolean isTree() {
     * @return List of IoTDBUser
        String currentUserName = "";
        }
        List<IoTDBAbstractUser> userList = new ArrayList<>();
    public boolean isTable() {
 *


        }
    }
     * Get the list of users
            return userList;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
     *
                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
        for (String privilege : globalPrivileges) {
                        userList.add(user);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

     * @throws DBException if an error occurs
     */


    private final boolean isTree;
     * Generate the list of privileges according to tree or table model
     * @param isGlobal true if global, false if schema

                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
    /**
     * @return IoTDBPrivilege
     * @return List of IoTDBUser
    /**
                           @NotNull DBPDataSourceContainer container,
     * @param monitor progress monitor
     * @throws DBException if an error occurs

     * @return List of IoTDBPrivilege

     * @return List of IoTDBPrivilege according to tree or table model
    public IoTDBPrivilege getPrivilege(DBRProgressMonitor monitor,
                    }
                            while (rs2 != null && rs2.next()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (Exception e) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Show Current User & Check Privileges")) {
    }
 * You may obtain a copy of the License at

     */
            }
                (isTree ? IoTDBPrivilegeInfo.Kind.SERIES : IoTDBPrivilegeInfo.Kind.DATABASE);
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                       String name) throws DBException {
        boolean hasManageUserPrivilege = false;
                }

                                }
     * @throws DBException if an error occurs
                        IoTDBAbstractUser user = isTree ? new IoTDBUser(this, currentUserName) :
                        IoTDBAbstractUser user = isTree ? new IoTDBUser(this, tmpUserName) :
            log.error("Error showing current user or checking privileges", e);
     * Get the list of privileges by kind
    /**
     *
        super(monitor, container, metaModel, new GenericSQLDialect());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            if (priv.getKind() == k) {

                            }
    @Override
                    sql = "list privileges of user " + (isTree ? currentUserName : DBUtils.getQuotedIdentifier(this, currentUserName, true, true));
            newPrivileges.add(new IoTDBPrivilege(this, privilege, kind));
    public IoTDBDataSource(DBRProgressMonitor monitor,
        }
     */
        return !isTree;
        }
     *
                                if ("MANAGE_USER".equals(rs2.getString("Privileges"))) {
            users = loadUsers(monitor);
 *

            newPrivileges.add(new IoTDBPrivilege(this, privilege, IoTDBPrivilegeInfo.Kind.GLOBAL));
     * @param monitor progress monitor
 * you may not use this file except in compliance with the License.
        return DBUtils.findObject(getAllPrivileges(), name, true);
                    while (rs != null && rs.next()) {
     * Get the list of privileges
    public List<IoTDBPrivilege> getPrivilegesByKind(boolean isGlobal) {
     */
        this.isTree = tree;

                    if (rs != null && rs.next()) {
     *

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        return isTree;
    private List<IoTDBPrivilege> privileges;    // All global and schema privileges
     */
                        try (JDBCResultSet rs2 = stmt2.executeQuery(sql)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        super.refreshObject(monitor);
        IoTDBPrivilegeInfo.Kind kind = isTree ? IoTDBPrivilegeInfo.Kind.SERIES : IoTDBPrivilegeInfo.Kind.DATABASE;
                        userList.add(user);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                        if (currentUserName.equals(tmpUserName)) {
import java.util.ArrayList;
import org.jkiss.dbeaver.model.DBUtils;
     *
 * DBeaver - Universal Database Manager
public class IoTDBDataSource extends GenericDataSource {
import java.util.List;
            throw new DBDatabaseException(e, this);
}
     */
        return privileges;
            String sql = "list user";
        if (!hasManageUserPrivilege) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
                                new IoTDBRelationalUser(this, currentUserName, monitor);
        return this;
            String sql = "show current_user";
