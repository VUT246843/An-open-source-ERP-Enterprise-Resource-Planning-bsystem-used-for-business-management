
    private Date createDate;

        if (CommonUtils.isNotEmpty(loginTypeChar)) {

    @Nullable
    public SQLServerDataSource getDataSource() {
    }

import org.jkiss.dbeaver.model.meta.Property;
    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return DBSObjectState.NORMAL;
        return password;
        String defaultDatabaseName = JDBCUtils.safeGetString(resultSet, "default_database_name");

        this.dataSource = dataSource;
    public void setDisabled(boolean disabled) {
    public DBSObject getParentObject() {
    }
        K("Login mapped to an asymmetric key");
    @Override
    }

    public DBSObjectState getObjectState() {
    public SQLServerLogin(@NotNull SQLServerDataSource dataSource, @NotNull String loginName, @NotNull JDBCResultSet resultSet) {
    @Property(viewable = true, order = 5)
    private boolean isDisabled;
        isDisabled = disabled;
    @NotNull
    // Auxiliary constructor for creating via UI-configurator
import org.jkiss.utils.CommonUtils;
        this.isDisabled = JDBCUtils.safeGetBoolean(resultSet, "is_disabled");

                defaultDatabase = database;
        S("SQL Server login"),

            SQLServerDatabase database = dataSource.getDatabase(defaultDatabaseName);
            return loginType;
    @Property(viewable = true, updatable = true, order = 8)
        C("Login mapped to a certificate"),
 * DBeaver - Universal Database Manager
    }
    public long getLoginId() {
            this.loginType = loginType;
        return loginId;
        this.defaultLanguageName = JDBCUtils.safeGetString(resultSet, "default_language_name");
    @Property(viewable = true, order = 4)
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setLoginName(@NotNull String loginName) {
import org.jkiss.code.NotNull;
        return true;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.createDate = JDBCUtils.safeGetDate(resultSet, "create_date");

        if (isDisabled) {
        return dataSource;
    }
    @Nullable private String defaultLanguageName;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
    }
        return dataSource.getContainer();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }

        this.loginId = JDBCUtils.safeGetLong(resultSet, "principal_id");
 * See the License for the specific language governing permissions and
    @Nullable private SQLServerDatabase defaultDatabase;
    @Property(viewable = true, order = 9)
import org.jkiss.dbeaver.model.access.DBAUser;
    }
 *
    }
        this.password = password;

 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    @Property(viewable = true, order = 6)
    public boolean isFixedRole() {
        String loginTypeChar = JDBCUtils.safeGetString(resultSet, "type");
    }
    @Override


        return createDate;
        return isFixedRole;
 */
    public SQLServerLogin(SQLServerDataSource dataSource, @NotNull String loginName) {
    private final SQLServerDataSource dataSource;
        this.modifyDate = JDBCUtils.safeGetDate(resultSet, "modify_date");
        return isDisabled;
        return modifyDate;

    public String getDescription() {
    @NotNull
        U("Windows login"),
        R("Server role"),
    }
    public String getPassword() {
        X("External group"), // from Azure Active Directory group or applications
    public Date getCreateDate() {
    public String getDefaultLanguageName() {
    private Date modifyDate;
    @Property(viewable = true, order = 7)

    private String password; // Added through the creation dialog
    @NotNull

 * You may obtain a copy of the License at
        this.loginName = loginName;
    public boolean isDisabled() {
    }
import org.jkiss.code.Nullable;


        G("Windows group"),
    @Nullable
        private final String loginType;
    public void setPassword(String password) {
        this.loginName = loginName;
import java.util.Date;
    @NotNull private String loginName;
package org.jkiss.dbeaver.ext.mssql.model;
    }
        return loginName;
    private LoginType loginType;
    @Property(viewable = true, order = 2)

        LoginType(String loginType) {
        if (CommonUtils.isNotEmpty(defaultDatabaseName)) {
public class SQLServerLogin implements DBAUser, DBPStatefulObject {
            this.loginType = CommonUtils.valueOf(LoginType.class, loginTypeChar);
 * limitations under the License.
    public String getName() {
    @Nullable
}
    }
 *


        return defaultLanguageName;
    @Override
    @Property(viewable = true, order = 3)

    }
    public Date getModifyDate() {
        return defaultDatabase;
    private boolean isFixedRole;
        E("External Login"), // from Azure Active Directory

        public String getLoginType() {
    @Property(viewable = true, order = 1)
        }
        return loginType == null ? null : loginType.getLoginType();
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    private long loginId;
        this.isFixedRole = JDBCUtils.safeGetBoolean(resultSet, "is_fixed_role");
 * distributed under the License is distributed on an "AS IS" BASIS,

        }
    public boolean isPersisted() {
import org.jkiss.dbeaver.model.DBPStatefulObject;
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    public enum LoginType {
 *
    }
    }


        this.dataSource = dataSource;
    }
            return DBSObjectState.INVALID;

    public SQLServerDatabase getDefaultDatabase() {
        }
        this.loginName = loginName;
    }

    public String getLoginTypeName() {
        }
            if (database != null) {
        return null;
 * you may not use this file except in compliance with the License.
