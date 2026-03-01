            this.lockDate = JDBCUtils.safeGetTimestamp(resultSet, "LOCK_DATE");
            this.id = JDBCUtils.safeGetLong(resultSet, "USER_ID");
 */
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
    public void setPersisted(boolean persisted) {

    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.sql.SQLDialect;

    private Timestamp createDate;
    }
            return profile;

                        session,
    @Property(order = 11, visibleIf = OracleUserPropertyValidator.class)
    }
    }
    public String getExternalName() {
    }

                    sqlDialect,
        if (resultSet != null) {
            this.name = JDBCUtils.safeGetString(resultSet, "USERNAME");
    private boolean isLocked;
/**
                    sql,
                    )
                        OracleUtils.DBMSMetaGrantedObjectType.TABLESPACE_QUOTA
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        public boolean isPropertyCached(@NotNull OracleUser object, @NotNull Object propertyId) {
    private Timestamp lockDate;

    public static class OracleUserPropertyValidator implements IPropertyValueValidator<OracleUser, Object> {
        @NotNull StringBuilder sql
    public String getName() {
        return password;
        return OracleTablespace.resolveTablespaceReference(monitor, this, "tempTablespace");
                SQLUtils.addMultiStatementDDL(
    }
            SQLDialect sqlDialect = getDataSource().getSQLDialect();

    public Object getLazyReference(Object propertyId) {
    @Property(order = 8, visibleIf = OracleUserPropertyValidator.class)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    /**
        }
                    OracleUtils.invokeDBMSMetadataGetGrantedDDL(

    }
 * you may not use this file except in compliance with the License.
    }
            this.expiryDate = JDBCUtils.safeGetTimestamp(resultSet, "EXPIRY_DATE");
        return OracleMessages.edit_oracle_user_disabled_fields_info_label;
        }
        this.confirmPassword = confirmPassword;

            }
        return persisted;
        for (OraclePrivRole rolePriv : rolePrivs) {
    @NotNull
        @Override
    }
                OracleUtils.addDDLLine(
            return CommonUtils.toBoolean(object.getDataSource().getContainer().getConnectionConfiguration()
                appendDefaultRolesDDL(monitor, sql);
    }
                }
        public boolean isValidValue(@NotNull OracleUser object, @Nullable Object value) throws IllegalArgumentException {
    @Property(order = 1)


    public Timestamp getCreateDate() {
    public String getInfoLabel() {
            return object.getDataSource().supportsUserEdit();
            "Load definition for USER '" + this.name + "'"
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
        this.persisted = persisted;
            if (i > 0) {
import java.util.ArrayList;
        return confirmPassword;

                    sqlDialect,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPSaveableObject;
    @Nullable
                .getProviderProperty(OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS));
            this.isLocked = status != null && status.contains("LOCKED");
                .getProviderProperty(OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS));
    public Object getProfile(DBRProgressMonitor monitor) throws DBException {
        } else {
        sql.append("-- DROP USER ").append(DBUtils.getQuotedIdentifier(this)).append(";\n\n");
        }

                    OracleUtils.invokeDBMSMetadataGetGrantedDDL(
    @LazyProperty(cacheValidator = ProfileReferenceValidator.class)
            .append(DBUtils.getQuotedIdentifier(getDataSource(), getName()))
                    sql,
    ) throws DBException {
                Object role = rolePriv.getRole(monitor);
                );
            this.status = JDBCUtils.safeGetString(resultSet, "ACCOUNT_STATUS");
import org.jkiss.dbeaver.model.sql.SQLUtils;
import java.sql.Timestamp;
                    )
        if (defaultRoles.isEmpty()) {
    DBPScriptObject {
    @Property(visibleIf = OracleUserModifyValueValidator.class, editable = true, updatable = true, order = 12, password = true)
    @Property(order = 3, visibleIf = OracleUserPropertyValidator.class)
    @Override
        }
                    object.getDataSource().profileCache.isFullyCached();
            this.externalName = JDBCUtils.safeGetString(resultSet, "EXTERNAL_NAME");
import org.jkiss.dbeaver.Log;
            return
    public OracleUser(OracleDataSource dataSource, ResultSet resultSet) {
            return !CommonUtils.toBoolean(object.getDataSource().getContainer().getConnectionConfiguration()


import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        for (int i = 0; i < defaultRoles.size(); i++) {
                        this,
        return super.refreshObject(monitor);
        @Override
    }
    public Object getDefaultTablespace(DBRProgressMonitor monitor) throws DBException {
        }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
 *
    private static final Log log = Log.getLog(OracleUser.class);
                        session,
import org.jkiss.utils.CommonUtils;
        }
                    defaultRoles.add(oracleRole.getName());
            monitor,

import org.jkiss.dbeaver.model.struct.DBSObjectLazy;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            return null;
            String userDDL = OracleUtils.fetchDDL(session, "USER", this.getName());
        return id;
                        OracleUtils.DBMSMetaGrantedObjectType.ROLE_GRANT
    private String name;

 * See the License for the specific language governing permissions and
import java.util.Map;
/*

        return createDate;
                        session,
            if (getDataSource().isAtLeastV10()) {
                );
        isLocked = locked;
 * limitations under the License.
    }
    public boolean isLocked() {
            this.persisted = false;
    @Association
    }
    @Property(order = 6, visibleIf = OracleUserPropertyValidator.class)
    public static class ProfileReferenceValidator implements IPropertyCacheValidator<OracleUser> {
    public String getConfirmPassword() {
    }
        } else if ("profile".equals(propertyId)) {
    private Object profile;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                SQLUtils.addMultiStatementDDL(
    }
        return rolePrivCache.getAllObjects(monitor, this);

    }
        return sql.toString();

    protected transient String confirmPassword;
    public long getId() {
            }
    }

                        this,
        )) {
        if ("defaultTablespace".equals(propertyId)) {
                object.getLazyReference(propertyId) instanceof OracleUserProfile ||

        }
import org.jkiss.dbeaver.DBException;
                        this,

        super(dataSource);
        List<String> defaultRoles = new ArrayList<>();

    public String getStatus() {
            if (rolePriv.isDefaultRole()) {
        } else {
    @Property(viewable = true, order = 4, visibleIf = OracleUserPropertyValidator.class)
    protected transient String password;
    public Timestamp getLockDate() {
     * @return password or null
        return consumerGroup;
import java.util.Collection;
    }
    @Override
    private Object defaultTablespace;

                    OracleUtils.invokeDBMSMetadataGetGrantedDDL(
            return defaultTablespace;
        } else if ("tempTablespace".equals(propertyId)) {
        StringBuilder sql = new StringBuilder();
        try (JDBCSession session = DBUtils.openMetaSession(
        return externalName;
        public boolean isValidValue(@NotNull OracleUser object, @Nullable Object value) throws IllegalArgumentException {
        public boolean isValidValue(@NotNull OracleUser object, @Nullable Object value) throws IllegalArgumentException {
    private String status;
 * You may obtain a copy of the License at
    }
            this.consumerGroup = JDBCUtils.safeGetString(resultSet, "INITIAL_RSRC_CONSUMER_GROUP");
    }
    }
    @NotNull
                        session,

    public String getConsumerGroup() {

    }
        }
    @Override
    }
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        return OracleTablespace.resolveTablespaceReference(monitor, this, "defaultTablespace");
    }
            return object.getDataSource().supportsUserEdit() && CommonUtils.toBoolean(object.getDataSource().getContainer().getConnectionConfiguration()
    }
            this.profile = JDBCUtils.safeGetString(resultSet, "PROFILE");
        Collection<OraclePrivRole> rolePrivs = getRolePrivs(monitor);
        return lockDate;
    }
        return isLocked;
import org.jkiss.dbeaver.model.meta.*;
 * Unless required by applicable law or agreed to in writing, software

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return name;
                );

        return expiryDate;
     *
    }
                    sqlDialect,
    }
        }
                        OracleUtils.DBMSMetaGrantedObjectType.SYSTEM_GRANT
    @Property(order = 10, visibleIf = OracleUserPropertyValidator.class)
                );
import java.util.List;
    private Object tempTablespace;
            this.persisted = true;
 * OracleUser
    public void setLocked(boolean locked) {
        } catch (SQLException e) {
        @Override
        this.password = password;
                if (role instanceof OracleRole oracleRole) {
import java.sql.SQLException;
    public static class OracleUserModifyValueValidator implements IPropertyValueValidator<OracleUser, Object> {
import org.jkiss.dbeaver.model.access.DBAUser;
     */

     * Passwords are never read from database. It is used to create/alter schema/user
        }
            this.defaultTablespace = JDBCUtils.safeGetString(resultSet, "DEFAULT_TABLESPACE");
                    sql,
        super(dataSource);
    public String getPassword() {
    @Override


        return OracleUtils.resolveLazyReference(monitor, getDataSource(), getDataSource().profileCache, this, "profile");
 * DBeaver - Universal Database Manager
        this.name = name;

    @Property(visibleIf = OracleUserLockedValueValidator.class, editable = true, updatable = true, order = 14)
            sql.append(DBUtils.getQuotedIdentifier(getDataSource(), defaultRoles.get(i)));
                .getProviderProperty(OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS));
    public void setPassword(String password) {
    @Property(visibleIf = OracleUserPropertyHiddenValidator.class, order = 15, info = true)
    @Property(viewable = true, order = 5)
        sql.append("\nALTER USER ")
    public static class OracleUserPropertyHiddenValidator implements IPropertyValueValidator<OracleUser, Object> {

    public void setConfirmPassword(String confirmPassword) {
            return;
}
            .append(" DEFAULT ROLE ");

        return status;
    public Object getTempTablespace(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.code.NotNull;
                    sql,
    private void appendDefaultRolesDDL(
        public boolean isValidValue(@NotNull OracleUser object, @Nullable Object value) throws IllegalArgumentException {
import org.jkiss.dbeaver.model.DBPScriptObject;
 */
    @Property(order = 9, visibleIf = OracleUserPropertyValidator.class)
    private Timestamp expiryDate;
    private boolean persisted;
import java.sql.ResultSet;
    @Nullable
            this,

import org.jkiss.dbeaver.model.DBUtils;
public class OracleUser extends OracleGrantee implements DBAUser, DBSObjectLazy<OracleDataSource>, DBPSaveableObject, DBPRefreshableObject,

            return tempTablespace;
            this.createDate = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");


    }
            OracleUtils.addDDLLine(sql, userDDL);
        @Override

    public void setName(String name) {
 *
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;

            throw new DBException("Failed of getting Oracle user definition", e);
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBRProgressMonitor monitor,
    @Property(order = 7, visibleIf = OracleUserPropertyValidator.class)
    private long id;
    }
                sql.append(", ");
                    )


            }
    }
    public boolean isPersisted() {
    private String consumerGroup;
    public Timestamp getExpiryDate() {
                        OracleUtils.DBMSMetaGrantedObjectType.OBJECT_GRANT
 *
                        this,
                    OracleUtils.invokeDBMSMetadataGetGrantedDDL(

    @Property(visibleIf = OracleUserModifyValueValidator.class, editable = true, updatable = true, order = 13, password = true)
    private String externalName;
package org.jkiss.dbeaver.ext.oracle.model;
        @Override
                SQLUtils.addMultiStatementDDL(
    @Override
                    object.getLazyReference(propertyId) == null ||
    public OracleUser(OracleDataSource dataSource) {
            this.tempTablespace = JDBCUtils.safeGetString(resultSet, "TEMPORARY_TABLESPACE");
        sql.append(";\n");




                    )
    }
    public Collection<OraclePrivRole> getRolePrivs(DBRProgressMonitor monitor) throws DBException {
    public static class OracleUserLockedValueValidator implements IPropertyValueValidator<OracleUser, Object> {
                // PL/SQL-block
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

import org.jkiss.dbeaver.model.DBPRefreshableObject;
