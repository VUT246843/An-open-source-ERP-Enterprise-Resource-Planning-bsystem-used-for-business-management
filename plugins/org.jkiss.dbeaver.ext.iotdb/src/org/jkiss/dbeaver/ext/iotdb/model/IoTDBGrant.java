    }
    public boolean canHighlightDatabase(String db) {

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
    }

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override



    @Nullable
public class IoTDBGrant implements DBSObject, DBAPrivilegeGrant {
    }
        this.privileges = privileges;
    }
    @Override
    public void setRole(String role) {
}
        return privileges.toArray(new DBAPrivilege[0]);
    public IoTDBGrant(IoTDBAbstractUser user,



    public Object getSubject(@NotNull DBRProgressMonitor dbrProgressMonitor) throws DBException {

    public void setGrantOption(Boolean grantOption) {

    @Override
    }
        return this.user;
                      boolean grantOption) {
    public boolean isGranted() {
                      List<IoTDBPrivilege> privileges,
        this.scope = scope;
import org.jkiss.dbeaver.model.DBPDataSource;
    public Object getObject(@NotNull DBRProgressMonitor dbrProgressMonitor) throws DBException {
                      String role,
    @Nullable
        this.grantOption = grantOption;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return scope.startsWith("*.") || scope.startsWith(db + ".");
    public String getScope() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 2)
    @Property(viewable = true, order = 3)
        this.role = role;

    @Override
    private String scope;
    }

        return scope;
    public boolean matches(String db, String tb) {
        return user;
    @Property(viewable = true, order = 1)
    }

    @NotNull
    }
        return true;
    }
        this.role = role;
        this.grantOption = grantOption;

    public Boolean getGrantOption() {
    private String role;
        return null;
    }
        this.user = user;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
 *
                      String scope,

import java.util.List;

 * You may obtain a copy of the License at
        return role;
    public String getName() {
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.iotdb.model;
    }

    public DBPDataSource getDataSource() {
    }
    @Override
        return "testObject";

        return this.user.getDataSource();
    @Override
        return privileges.get(0).name;
        return scope.startsWith("*.") || scope.equals(db + ".*") || scope.equals(db + "." + tb);
    private final List<IoTDBPrivilege> privileges;
 *
        this.scope = scope;
    }

    @Override

    }
    public String getRole() {
    public String getDescription() {
    }
        return grantOption;
    public DBAPrivilege[] getPrivileges() {

import org.jkiss.dbeaver.model.access.DBAPrivilegeGrant;
 */
    }

import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isPersisted() {
    @Override
    }

    public DBSObject getParentObject() {
        return scope.equals("*.*") || scope.equals(db + "." + tb) || scope.equals(db + "." + "*");
    public boolean canHighlightTable(String db, String tb) {
    }
    @Nullable
 * limitations under the License.
    private Boolean grantOption;
    @NotNull
import org.jkiss.dbeaver.Log;
    private final IoTDBAbstractUser user;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
    @Override
    public void setScope(String scope) {
/*
        return grantOption;
    @Property(viewable = true, editable = true, order = 4)
import org.jkiss.dbeaver.model.meta.Property;
 *
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
