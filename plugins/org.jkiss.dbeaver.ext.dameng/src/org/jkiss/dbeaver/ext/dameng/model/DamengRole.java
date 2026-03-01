    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        return createTime;

import org.jkiss.dbeaver.model.meta.Property;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengRole damengRole) throws SQLException {

                            "AND GRANTS.OBJID = ? ");

    @Association
        @NotNull
                    "AND URID = ?");
    }
    private ObjectPrivCache objectPrivCache = new ObjectPrivCache();
        return null;
        @Override

    }
                            "AND OBJ.ID = GRANTS.URID\n" +

        this.objectPrivCache.clearCache();
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPScriptObject;
    public DBPDataSource getDataSource() {
                            "WHERE GRANTS.PRIVID = -1\n" +
        protected DamengPrivUser fetchObject(@NotNull JDBCSession session, @NotNull DamengRole damengRole, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        @Override

    private Long id;
    }
import org.jkiss.dbeaver.model.access.DBARole;
    public Collection<DamengPrivSystem> getSystemPrivs(DBRProgressMonitor monitor) throws DBException {
    public Collection<DamengPrivUser> getUserPrivs(DBRProgressMonitor monitor) throws DBException {
    public DamengRole(DamengDataSource damengDataSource, JDBCResultSet resultSet) {
                    "PRIVID AS ID,\n" +
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
 *
    }
            return dbStat;
public class DamengRole implements DBARole, DBPScriptObject, DBPObjectWithLongId, DBPRefreshableObject {
                    "AND (OBJID != -1 OR COLID != -1)\n" +
import java.util.Collection;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                    "GRANT_OBJ.ID = GRANTS.OBJID\n" +
        return true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private SystemPrivCache systemPrivCache = new SystemPrivCache();
                    "WHERE\n" +
        }

 * you may not use this file except in compliance with the License.
    static class UserPrivCache extends JDBCObjectCache<DamengRole, DamengPrivUser> {

                    "FROM\n" +
    @Override
import org.jkiss.dbeaver.model.meta.Association;
                            "OBJ.NAME,\n" +
    @Association
        @Override
    }
    @Property(viewable = true, order = 2)
        }
        this.userPrivCache.clearCache();


    }
        }
                    "FROM\n" +

}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    static class SystemPrivCache extends JDBCObjectCache<DamengRole, DamengPrivSystem> {
    }
    public boolean isPersisted() {
    }
                    "AND PRIVID != -1\n" +

import java.sql.SQLException;
        return this;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return DamengUtils.getDDL(monitor, this, DamengConstants.ObjectType.ROLE, null);
                    "SYSOBJECTS GRANTOR_OBJ\n" +
    private DamengDataSource dataSource;
        return userPrivCache.getAllObjects(monitor, this);
 * See the License for the specific language governing permissions and
    }
                    "GRANTOR_OBJ.name AS GRANTOR_NAME,\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    public Collection<DamengPrivObject> getObjectPrivs(DBRProgressMonitor monitor) throws DBException {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
            return dbStat;
    }
                    "WHERE\n" +
        return systemPrivCache.getAllObjects(monitor, this);
    private UserPrivCache userPrivCache = new UserPrivCache();
                            "AND OBJ.TYPE$ = 'UR'\n" +
            dbStat.setLong(1, damengRole.getObjectId());
            return new DamengPrivUser(damengRole, resultSet);

                    "GRANTABLE,\n" +
                    "GRANT_OBJ.TYPE$ AS TYPE,\n" +
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

                    "SELECT DISTINCT OBJ.ID,\n" +
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengRole damengRole) throws SQLException {
        }
        return objectPrivCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.DBException;
            final JDBCPreparedStatement dbStat = session.prepareStatement("SELECT\n" +
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return id;
                    "AND GRANTOR_OBJ.ID = GRANTS.GRANTOR\n" +
    @Override
                    "SF_GET_SYS_PRIV(PRIVID) AS PRIV,\n" +
                            "OBJ.SUBTYPE$ FROM \n" +
            return new DamengPrivSystem(damengRole, resultSet);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
    }
        @NotNull

package org.jkiss.dbeaver.ext.dameng.model;
                    "LEFT JOIN SYSOBJECTS GRANT_OBJ ON\n" +
import java.sql.Timestamp;

        protected DamengPrivSystem fetchObject(@NotNull JDBCSession session, @NotNull DamengRole damengRole, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    public Timestamp getCreateTime() {
import java.util.Map;
                            "sysgrants GRANTS\n" +
    public String getDescription() {
 * limitations under the License.

 * @author Shengkai Bai
/*
        this.createTime = JDBCUtils.safeGetTimestamp(resultSet, DamengConstants.CRTDATE);
    public long getObjectId() {
        @NotNull

 */
 * DBeaver - Universal Database Manager
    public String getName() {
        this.name = JDBCUtils.safeGetString(resultSet, DamengConstants.NAME);
        return name;
                    "SF_GET_SYS_PRIV(PRIVID) AS PRIV,\n" +
                    "OR COLID != -1)\n" +


        }
    }
    }
                    "SF_GET_OBJ_FULL_NAME(OBJID,COLID) AS OBJECT_NAME,\n" +

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DamengRole damengRole) throws SQLException {
        this.dataSource = damengDataSource;
                    "AND URID = ?");
    @NotNull
            final JDBCPreparedStatement dbStat = session.prepareStatement("SELECT\n" +
        protected DamengPrivObject fetchObject(@NotNull JDBCSession session, @NotNull DamengRole damengRole, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                    "AND PRIVID != -1\n" +
    @Override
            dbStat.setLong(1, damengRole.getObjectId());

import org.jkiss.dbeaver.model.DBPRefreshableObject;

        }

 */
            dbStat.setLong(1, damengRole.getObjectId());
                    "SYSOBJECTS GRANT_OBJ,\n" +
        return getDataSource().getContainer();
    private Timestamp createTime;

    @Override
                    "SYSGRANTS GRANTS,\n" +
    @Association
        this.id = JDBCUtils.safeGetLong(resultSet, DamengConstants.ID);
                    "GRANTABLE\n" +

                            "GRANTS.GRANTABLE,\n" +


import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        return dataSource;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.systemPrivCache.clearCache();
    @Override

            return dbStat;
    }
                    "GRANT_OBJ.NAME AS GRANTOR_NAME,\n" +
                    "NOT (OBJID != -1\n" +
    @Property(viewable = true, order = 1)
                    "DECODE(GRANT_OBJ.SUBTYPE$,'PROC',DECODE(GRANT_OBJ.INFO1 & 0X01,0,'FUNCTION',1,'PROCEDURE'),GRANT_OBJ.SUBTYPE$) AS SUB_TYPE\n" +
    @Override
import org.jkiss.dbeaver.model.DBPObjectWithLongId;

    @Property(viewable = true, order = 3)
        @Override


    public DBSObject getParentObject() {
                            "SYSOBJECTS OBJ,\n" +
            return new DamengPrivObject(damengRole, resultSet);
    }
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
    static class ObjectPrivCache extends JDBCObjectCache<DamengRole, DamengPrivObject> {
                    "SYSGRANTS GRANTS\n" +
    private String name;
    @Override
        @Override
                    "GRANTS.GRANTOR = GRANT_OBJ.ID\n" +
    @NotNull
 *
