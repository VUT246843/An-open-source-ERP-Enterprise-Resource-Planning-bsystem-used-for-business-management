}
                    "CRTDATE\n" +
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
        if (defaultSchema != null) {
    public DamengDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel) throws DBException {
/*
        }
    }
                    "TYPE$ = 'UR'\n" +
    protected void initializeContextState(DBRProgressMonitor monitor, JDBCExecutionContext context, JDBCExecutionContext initFrom) throws DBException {
            return;
                    "NAME");
            return new DamengTablespace(dataSource, resultSet);
    public Collection<DamengRole> getRoles(DBRProgressMonitor monitor) throws DBException {
        return GenericDataSource.getDataKind(typeName, valueType);
import org.jkiss.dbeaver.DBException;
                    "AND (INFO2 IS NULL\n" +
        return DamengUtils.getObjectById(monitor, userCache, this, userId);
        @NotNull
 * limitations under the License.
    }

        protected DamengRole fetchObject(@NotNull JDBCSession session, @NotNull DamengDataSource damengDataSource, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {

    private final TablespaceCache tablespaceCache = new TablespaceCache();

        super(monitor, container, metaModel, new DamengSQLDialect());
                    // INFO3 BYTE(0-1) default tablespace id
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
                    "FROM\n" +
        @Override
    public TablespaceCache getTablespaceCache() {
        @NotNull

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
    public static DBPDataKind getDataKind(@NotNull String typeName, int valueType) {
 *
                    "USER_OBJ.SUBTYPE$ = 'USER'");

        DamengExecutionContext executionMetaContext = (DamengExecutionContext) initFrom;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
            return new DamengUser(dataSource, resultSet);
        DamengExecutionContext executionContext = (DamengExecutionContext) context;
    }
    public DBPDataKind resolveDataKind(@NotNull String typeName, int valueType) {
        return userCache.getAllObjects(monitor, this);
    private final RoleCache roleCache = new RoleCache();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (initFrom == null) {
        @Override
                    "SYSOBJECTS\n" +
import java.sql.SQLException;
 */

        return DamengUtils.getObjectById(monitor, tablespaceCache, this, tableSpaceId);

        return this;
    }
    }
                    "OR INFO2 != 1)\n" +
        return tablespaceCache;
    }
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengDataSource dataSource) throws SQLException {
            return session.prepareStatement("SELECT\n" +

    }

                    "USER_OBJ.*,\n" +
        return getDataKind(typeName, valueType);
            return session.prepareStatement("SELECT * FROM V$TABLESPACE");
    public static class TablespaceCache extends JDBCObjectCache<DamengDataSource, DamengTablespace> {
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    @Override
 * Unless required by applicable law or agreed to in writing, software
        }
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DamengSchema defaultSchema = executionMetaContext.getDefaultSchema();
    @Override
                    "INFO1,\n" +
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengDataSource dataSource) throws SQLException {
    }
                    "TS.ID AS TABLESPACE_ID,\n" +
            return DBPDataKind.DATETIME;
 *
package org.jkiss.dbeaver.ext.dameng.model;
 */

    }

    }

    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, JDBCDatabaseMetaData metaData) {
 * DBeaver - Universal Database Manager
    @Override


        }
    }
    private final UserCache userCache = new UserCache();

        @Override
import java.sql.Types;
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        @NotNull

        @Override
                    "FROM\n" +
                    "USER_OBJ.INFO3 & 0x000000000000FFFF = TS.ID\n" +
    public Collection<DamengTablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException {
                    "AND INFO1 = 0\n" +
        protected DamengTablespace fetchObject(@NotNull JDBCSession session, @NotNull DamengDataSource dataSource, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
import java.util.Collection;
            executionContext.setDefaultSchema(monitor, defaultSchema);
        if (valueType == Types.JAVA_OBJECT && DamengConstants.INTERVAL_TYPES.contains(typeName)) {
                    "ORDER BY\n" +
        return roleCache.getAllObjects(monitor, this);
                    "WHERE\n" +
public class DamengDataSource extends GenericDataSource {
                    "VALID,\n" +
        @Override
    static class UserCache extends JDBCObjectCache<DamengDataSource, DamengUser> {
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengDataSource damengDataSource) throws SQLException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    static class RoleCache extends JDBCObjectCache<DamengDataSource, DamengRole> {
                    "LEFT JOIN SYSUSERS ON\n" +
        }
        }
                    "ID,\n" +
        }
    public DamengTablespace getTablespaceById(DBRProgressMonitor monitor, long tableSpaceId) throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            executionContext.refreshDefaults(monitor, true);

        return new JDBCDataSourceInfo(metaData);

    @Association
                    "WHERE\n" +
                    "SYSUSERS.*,\n" +
    }
    @Association
import org.jkiss.dbeaver.model.meta.Association;
                    "TS.NAME AS TABLESPACE\n" +
        return new DamengExecutionContext(instance, type);
/**
    @NotNull
        tablespaceCache.clearCache();
                    "AND SUBTYPE$ = 'ROLE'\n" +
                    "NAME,\n" +

    }
    public DamengUser getUserById(DBRProgressMonitor monitor, long userId) throws DBException {

    }
        super.refreshObject(monitor);
    }

        @Override
        protected DamengUser fetchObject(@NotNull JDBCSession session, @NotNull DamengDataSource dataSource, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
 * @author Shengkai Bai
 * you may not use this file except in compliance with the License.
                    "SYSOBJECTS USER_OBJ\n" +
    @Nullable
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    "LEFT JOIN SYS.V$TABLESPACE TS ON\n" +

        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            return new DamengRole(damengDataSource, resultSet);
    }

    public Collection<DamengUser> getUsers(DBRProgressMonitor monitor) throws DBException {


                    "SYSUSERS.ID = USER_OBJ.ID\n" +
        }
    @Association
    @NotNull
            return session.prepareStatement("SELECT\n" +

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        return tablespaceCache.getAllObjects(monitor, this);

