 * See the License for the specific language governing permissions and
                             String userName)  {
    @Override
    private static final Log log = Log.getLog(IoTDBAbstractUser.class);
    public List<IoTDBGrant> getGlobalPrivileges(DBRProgressMonitor monitor) throws DBException {

    }
                        if (pri.kind == IoTDBPrivilegeInfo.Kind.GLOBAL) {
     * Load grants from the database
        }
import org.jkiss.code.Nullable;
    public String getDescription() {
 *
    @Property(viewable = true, order = 1)
            return this.globalPrivileges;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others

        this.userName = userName;
        return dataSource.getContainer();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * limitations under the License.
                        String scope = rs.getString("Scope");
    public List<IoTDBGrant> getSchemaPrivileges(DBRProgressMonitor monitor) throws DBException {
                            schemaPri.add(new IoTDBGrant(this, privileges, role, scope, grantOption));
            }
/*
    }
 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            this.globalPrivileges = new ArrayList<>();
    @Override
import org.jkiss.dbeaver.model.access.DBAUser;

        }
    }
            return this.schemaPrivileges;
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public List<IoTDBGrant> getGrants(DBRProgressMonitor monitor) throws DBException {

     *

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    @NotNull

        return userName;
    @Nullable
            loadGrants(monitor);
     */
        return "";
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext dbpEvaluationContext) {
    protected List<IoTDBGrant> globalPrivileges;
        List<IoTDBGrant> grants = new ArrayList<>();
     * @param monitor progress monitor
        this.dataSource = dataSource;

            try (JDBCStatement stmt = session.createStatement()) {
    @NotNull


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isPersisted() {
 * you may not use this file except in compliance with the License.

                        String role = rs.getString("Role");
                    List<IoTDBGrant> schemaPri = new ArrayList<>();
        return this;
    }
        if (!isPersisted()) {

                }
    }
 */
    public String userName;
    @Override
        loadGrants(monitor);
    }
                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
        }
    @Override
    protected List<IoTDBGrant> schemaPrivileges;
            return this.globalPrivileges;
            return this.schemaPrivileges;
                    }
import org.jkiss.dbeaver.ext.iotdb.IoTDBPrivilegeInfo;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        this.persisted = b;
                        }
                        List<IoTDBPrivilege> privileges = new ArrayList<>();
    @Override
        return persisted;
        }
        return grants;
    }
import org.jkiss.dbeaver.Log;
    @Override
        return this.globalPrivileges;
import org.jkiss.dbeaver.model.*;
                    this.globalPrivileges = globalPri;
                    while (rs.next()) {

        if (this.schemaPrivileges != null) {
    public IoTDBDataSource getDataSource() {
package org.jkiss.dbeaver.ext.iotdb.model;
        return userName;

import org.jkiss.dbeaver.DBDatabaseException;
        if (this.globalPrivileges == null) {
        this.userName = userName;
    public void setUserName(String userName) {
    }
import org.jkiss.dbeaver.model.access.DBARole;
     *
            String sql = String.format("list privileges of user %s", userName);
    }
    }
        grants.addAll(getGlobalPrivileges(monitor));
import java.util.List;
    protected IoTDBDataSource dataSource;
    public void setPersisted(boolean b) {
    /**
    public String getUserName() {
 * DBeaver - Universal Database Manager
    @Override
                        } else {
    protected boolean persisted;


            throw new DBDatabaseException(e, this.getDataSource());
import org.jkiss.code.NotNull;
                        boolean grantOption = rs.getBoolean("GrantOption");
                            globalPri.add(new IoTDBGrant(this, privileges, role, scope, grantOption));
    }

        } catch (Exception e) {
        this.schemaPrivileges = null;
    }
        loadGrants(dbrProgressMonitor);
 *
import java.util.ArrayList;
        if (this.globalPrivileges != null) {
        return this.schemaPrivileges;

        loadGrants(monitor);
    public IoTDBAbstractUser(IoTDBDataSource dataSource,
        DBUtils.fireObjectUpdate(this);

        this.globalPrivileges = null;
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        grants.addAll(getSchemaPrivileges(monitor));
        }
        }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor dbrProgressMonitor) throws DBException {
public class IoTDBAbstractUser implements DBAUser, DBARole, DBPRefreshableObject, DBPSaveableObject, DBPQualifiedObject {
        if (!isPersisted()) {
     * @throws DBException if an error occurs
 * distributed under the License is distributed on an "AS IS" BASIS,
        return dataSource;
                        IoTDBPrivilege pri = dataSource.getPrivilege(monitor, privilegeName);
        this.persisted = true;


        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load Grants")) {
                        privileges.add(pri);
                    this.schemaPrivileges = schemaPri;
import org.jkiss.dbeaver.model.meta.Property;
            this.schemaPrivileges = new ArrayList<>();
import org.jkiss.dbeaver.DBException;
 *

                    List<IoTDBGrant> globalPri = new ArrayList<>();
            log.error("Error loading grants", e);

                        String privilegeName = rs.getString("Privileges");
    public void loadGrants(DBRProgressMonitor monitor) throws DBException {

    public String getName() {
    }
