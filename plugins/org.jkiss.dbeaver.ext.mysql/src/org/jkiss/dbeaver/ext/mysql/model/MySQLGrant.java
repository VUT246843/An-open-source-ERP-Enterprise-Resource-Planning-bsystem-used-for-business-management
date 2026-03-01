    public String getCatalog()
    private final MySQLUser user;
        this.grantOption = grantOption;
    }

                        }

    @Nullable
            && SQLUtils.matchesLike(catalog.getName(), catalogName));
        return tableName;
    public DBPDataSource getDataSource() {
 * Copyright (C) 2010-2024 DBeaver Corp and others


    @Property(viewable = true, order = 10)


        return catalogName;
        for (MySQLPrivilege priv : privileges) {
    }
            }
 */
                    }
    public String getTable()
    }
    }

        this.tableName = tableName;
import org.jkiss.utils.CommonUtils;


    @NotNull
        return grantOption;
import java.util.List;
    public boolean isEmpty()

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public static final Pattern TABLE_GRANT_PATTERN = Pattern.compile("GRANT\\s+(.+)\\s+ON\\s+`?([^`]+)`?\\.`?([^`]+)`?\\s+TO\\s+");


    @Nullable
                    if (!isAllTables()) {

import org.jkiss.dbeaver.model.struct.DBSObject;
    }

import org.jkiss.dbeaver.model.DBPDataSource;
    public boolean isAllCatalogs()
        }
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

        return false;
        return allPrivileges ? "ALL PRIVILEGES" : privileges.toString();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    }
    @Override
     * Returns true if the given catalog exists and it is comparable to this grant catalog
    }
        return CommonUtils.isEmpty(catalogName) || "*".equals(catalogName);
    @Override
    }
                MySQLCatalog catalog = user.getDataSource().getCatalog(catalogName);
    @Property(viewable = true, order = 11)
/**
        return (table == null && isAllTables()) || (table != null && table.getName().equalsIgnoreCase(tableName));
    {
    }
    }
        return (catalog == null && isAllCatalogs())
import org.jkiss.dbeaver.model.access.DBAPrivilegeGrant;
    public boolean isGranted() {
    public String getPrivilegeNames() {
    }
        }

    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    private final String catalogName;
    }
    @Property(viewable = true, order = 1)
        return privileges.toArray(new MySQLPrivilege[0]);
 * You may obtain a copy of the License at
        return "*".equals(catalogName);
    {
    public boolean matches(MySQLTableBase table)
        return user;
        this.user = user;
import org.jkiss.code.Nullable;
 * User privilege grant
import org.jkiss.dbeaver.model.meta.Property;
    private final List<MySQLPrivilege> privileges;
        return "*".equals(tableName);
    @Override
    public MySQLUser getSubject(@NotNull DBRProgressMonitor monitor) {
        return null;

package org.jkiss.dbeaver.ext.mysql.model;
    private final boolean allPrivileges;
                }
    }
                            return table;
            if (priv.getKind() != MySQLPrivilege.Kind.ADMIN) {
public class MySQLGrant implements DBSObject, DBAPrivilegeGrant {
 * See the License for the specific language governing permissions and
import java.util.regex.Pattern;

    {
    private boolean grantOption;
    }
    {
        this.grantOption = grantOption;
 * limitations under the License.
    public Object getObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
 *
    public MySQLGrant(MySQLUser user, List<MySQLPrivilege> privileges, @Nullable String catalogName, @Nullable String tableName, boolean allPrivileges, boolean grantOption)
        return catalogName + "." + tableName;
    {
    public boolean isGrantOption()
            if (!isAllCatalogs()) {

    public void addPrivilege(MySQLPrivilege privilege)

        return this.user;
 * DBeaver - Universal Database Manager
        this.privileges = privileges;
 * Unless required by applicable law or agreed to in writing, software
    }
        return privileges.isEmpty() && !isAllPrivileges() && !isGrantOption();
    /**
    {
        return allPrivileges;

        this.allPrivileges = allPrivileges;
    public String getDescription() {
    }
import org.jkiss.dbeaver.DBException;
    public boolean isPersisted() {
    }
        privileges.remove(privilege);
    {
        return true;
    {
    {
    {
    public MySQLUser getParentObject() {
    public String getName() {
    {

        return this.user.getDataSource();
    public boolean matches(@Nullable MySQLCatalog catalog) {

/*
    }
                return true;

    @NotNull

 * you may not use this file except in compliance with the License.
    @Override

        privileges.add(privilege);
    @Override
    public boolean isStatic() {
    public static final Pattern GLOBAL_GRANT_PATTERN = Pattern.compile("GRANT\\s+(.+)\\s+ON\\s+(.+)\\s+TO\\s+");
            }
}

 *
    {
        return true;
        this.catalogName = catalogName;
                        MySQLTable table = catalog.getTable(monitor, tableName);
        return allPrivileges ? "ALL PRIVILEGES" : privileges.toString();
    }
    public MySQLPrivilege[] getPrivileges()
    @Nullable

    @Override
        if (catalogName != null) {
    @Nullable
     */
    public void removePrivilege(MySQLPrivilege privilege)
            || (catalog != null && CommonUtils.isNotEmpty(catalogName) && !isAllCatalogs()
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isAllTables()
    public boolean isAllPrivileges()
import org.jkiss.code.NotNull;

                if (catalog != null) {
    @Override
    {
    }
    }
     * or the given catalog is empty, but the grant applies to all catalogs.
    public boolean hasNonAdminPrivileges()
 *
    public void setGrantOption(boolean grantOption)
    private final String tableName;
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                        if (table != null) {
    @Nullable
    }
