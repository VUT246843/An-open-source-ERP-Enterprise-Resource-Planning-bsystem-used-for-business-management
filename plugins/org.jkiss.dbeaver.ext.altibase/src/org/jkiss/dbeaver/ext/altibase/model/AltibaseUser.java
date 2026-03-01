            throw new DBDatabaseException(e, getDataSource());
public class AltibaseUser extends AltibaseGrantee {
import org.jkiss.code.Nullable;
                                break;
        return AltibaseTablespace.resolveTablespaceReference(monitor, this, "defaultTablespace");
        this.defaultTablespace = JDBCUtils.safeGetString(resultSet, "DEFAULT_TBS_NAME");
    @Nullable
import java.util.stream.Collectors;


    private Object tempTablespace;
 *
    }
                dbStat.executeStatement();

        userTbsList = null;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

        }
                    + " UNION ALL"
    private boolean isSysUser = false;
    }
        if (isSysUser) {
            }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, getParentObject(), "Load tablespaces for user")) {

            return defaultTablespace;
    }
 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 11)
                dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
import java.util.Map;
} */
    private Object profile;
                    + " SELECT t.name FROM system_.sys_tbs_users_ tu, v$tablespaces t, system_.sys_users_ u"
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Collection;
import org.jkiss.dbeaver.model.meta.LazyProperty;
            AltibaseUser user) throws SQLException {
 * See the License for the specific language governing permissions and
        super.refreshObject(monitor);
    private int passwordGraceTime;
    }
import java.util.ArrayList;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public Object getDefaultTablespace(DBRProgressMonitor monitor) throws DBException {

import java.sql.SQLException;

        }
            dbStat.setString(1, user.getName());

        } else {
        this.lockDate = JDBCUtils.safeGetTimestamp(resultSet, "ACCOUNT_LOCK_DATE");
            return null;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            return tempTablespace;
    public AltibaseUser(AltibaseDataSource dataSource, JDBCResultSet resultSet) {

        return passwordexpiryDate;
        return userTbsList;
    }
        return name;
                JDBCResultSet dbResult = dbStat.getResultSet();
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return lockDate;
    @Nullable
    private Timestamp lockDate;
                    }  


            dbStat.setString(2, user.getName());
        return AltibaseTablespace.resolveTablespaceReference(monitor, this, "tempTablespace");
    private Timestamp passwordexpiryDate;
            try (JDBCStatement dbStat = prepareTablespaceName4UserLoadStatement(session, this)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        while (dbResult.next()) {
    @NotNull
    @Property(viewable = true, order = 2)
    }

    private ArrayList<AltibaseTablespace> userTbsList = null;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


package org.jkiss.dbeaver.ext.altibase.model;
                        }

 *     http://www.apache.org/licenses/LICENSE-2.0
                            if (dbTbsMap.containsKey(tbsName)) {
            qry = "SELECT t.name FROM  v$tablespaces t ORDER BY 1";
        this.name = JDBCUtils.safeGetString(resultSet, "USER_NAME");
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
import org.jkiss.dbeaver.DBDatabaseException;
                .stream().collect(Collectors.toMap(AltibaseTablespace::getName, AltibaseTablespace -> AltibaseTablespace));
            return profile;
import java.sql.Timestamp;
    }
        if (!isSysUser) {
        }
    public Collection<AltibaseTablespace> getTablespaces(DBRProgressMonitor monitor) throws DBException {
    public String getName() {
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    }
                            tbsName = dbResult.getString(1);
    @Override
    @LazyProperty(cacheValidator = AltibaseTablespace.TablespaceReferenceValidator.class)

    }
                    + " WHERE u.user_name = ? AND (u.default_tbs_id = t.id OR u.temp_tbs_id  = t.id)"
 *
                    + " WHERE u.user_name = ? AND u.user_id = tu.user_id AND tu.tbs_id = t.id AND tu.is_access = 1"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    private Timestamp createDate;
                    } finally {
        } else {

        }
        return createDate;
    @Property(viewable = true, order = 15)

        this.tempTablespace = JDBCUtils.safeGetString(resultSet, "TEMP_TBS_NAME");

import org.jkiss.dbeaver.model.DBUtils;
        this.createDate = JDBCUtils.safeGetTimestamp(resultSet, "CREATED");
                            }
    public int getPasswordGraceTime() {

    @LazyProperty(cacheValidator = AltibaseTablespace.TablespaceReferenceValidator.class)
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
                        dbResult.close();
 *
    public Timestamp getLockDate() {
        this.passwordexpiryDate = JDBCUtils.safeGetTimestamp(resultSet, "PASSWORD_EXPIRY_DATE");

    public Timestamp getPasswordexpiryDate() {
    @Property(viewable = true, order = 6)
        return dbStat;
    @Override
        } else if ("profile".equals(propertyId)) {
        // SYS and SYSTEM_ users are able to access all tablespaces in a DBMS.
    public Timestamp getCreateDate() {
        return this;
    public Object getLazyReference(Object propertyId) {
        isSysUser = AltibaseConstants.isSysUser(name);
                if (dbResult != null) {
        } catch (SQLException e) {
        userTbsList = new ArrayList<AltibaseTablespace>();
                    + " ORDER BY 1 ASC";
    @Property(viewable = true, order = 5)

import org.jkiss.dbeaver.model.DBConstants;
    public Object getTempTablespace(DBRProgressMonitor monitor) throws DBException {
            qry = "SELECT t.name FROM  v$tablespaces t, system_.sys_users_ u"
                                userTbsList.add(dbTbsMap.get(tbsName));
    private Object defaultTablespace;
        if ("defaultTablespace".equals(propertyId)) {
                }
        } else if ("tempTablespace".equals(propertyId)) {
        this.passwordGraceTime = JDBCUtils.safeGetInt(resultSet, "PASSWORD_GRACE_TIME");
    @Property(viewable = true, order = 10)
    public JDBCStatement prepareTablespaceName4UserLoadStatement(JDBCSession session, 
        String qry;
/*
 * Unless required by applicable law or agreed to in writing, software


                    try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return passwordGraceTime;

        final JDBCPreparedStatement dbStat = session.prepareStatement(qry);

        String tbsName = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(dataSource, JDBCUtils.safeGetString(resultSet, "USER_NAME"));
 * You may obtain a copy of the License at
                            }
    @Property(viewable = true, order = 9)
        Map<String, AltibaseTablespace> dbTbsMap = getDataSource().getTablespaces(monitor)
    @Override
    }

                            if (monitor.isCanceled()) {
