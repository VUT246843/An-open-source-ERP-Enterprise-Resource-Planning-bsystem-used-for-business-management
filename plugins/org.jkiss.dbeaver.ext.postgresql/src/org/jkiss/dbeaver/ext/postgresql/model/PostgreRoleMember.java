    private final PostgreRole owner;
    }
        return owner;
    @Property(viewable = true, order = 2)
        return owner.getDatabase().getRoleById(monitor, member);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.postgresql.model;

        return owner.getDatabase().getRoleById(monitor, role);
    @Property(viewable = true, order = 3)
    public PostgreRoleMember(PostgreRole owner, ResultSet dbResult)
        this.member = JDBCUtils.safeGetLong(dbResult, "member");
    public String toString() {


    @Property(viewable = true, order = 4)

    private long grantor;
    @Override
    @Override
    }
    }
 *
import java.sql.ResultSet;
    public String getName()
}
        this.role = JDBCUtils.safeGetLong(dbResult, "roleid");
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.


    public String getDescription() {
    @NotNull
    {

    }

        return true;
    private void loadInfo(ResultSet dbResult)
        this.loadInfo(dbResult);
        return member + "." + role;
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.model.struct.DBSObject;
    public boolean isAdminOption() {

 * Unless required by applicable law or agreed to in writing, software
        return owner.getDataSource();
import org.jkiss.dbeaver.model.meta.Property;
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.adminOption = JDBCUtils.safeGetBoolean(dbResult, "admin_option");
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 1)

    @Override
 * DBeaver - Universal Database Manager
        return owner.getDatabase().getRoleById(monitor, grantor);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
public class PostgreRoleMember implements DBSObject {

    }
    @Override
/*
/**


        throws SQLException

    public PostgreRole getGrantor(DBRProgressMonitor monitor) throws DBException {
    }
import java.sql.SQLException;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    }
 * PostgreRoleMember
    public PostgreDataSource getDataSource() {
    public boolean isPersisted() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    }
        return adminOption;
 * limitations under the License.

    @NotNull
    @Override
    private long role;
        this.grantor = JDBCUtils.safeGetLong(dbResult, "grantor");
    @Nullable

    private boolean adminOption;
    private long member;
 */
 * You may obtain a copy of the License at
    @Override
        throws SQLException
        return getName();

    @Nullable
    public PostgreRole getMember(DBRProgressMonitor monitor) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
import org.jkiss.code.NotNull;
        this.owner = owner;
    }

    {
 * Licensed under the Apache License, Version 2.0 (the "License");
