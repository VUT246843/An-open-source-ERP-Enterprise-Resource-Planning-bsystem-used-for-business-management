 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

    public Object getLazyReference(Object propertyId) {
        userPrivCache.clearCache();
                            + " system_.sys_users_ ge"
package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.DBException;
        }
import org.jkiss.dbeaver.model.meta.Association;
        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
                            + " , gr.user_name AS grantor_name"
        return userPrivCache.getAllObjects(monitor, this);
    public AltibaseRole(AltibaseDataSource dataSource, ResultSet resultSet) {
     * Get grantee and grantor pair
    static class UserPrivCache extends JDBCObjectCache<AltibaseRole, AltibasePrivUser> {
 *

 * DBeaver - Universal Database Manager
/**
        super(dataSource, JDBCUtils.safeGetString(resultSet, "USER_NAME"));
        return super.refreshObject(monitor);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    }
import org.jkiss.code.NotNull;
}
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.sql.SQLException;
                            + " AND r.grantee_id = ge.user_id"
 */
        return null;
    @Nullable

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 */
                            + " AND u.user_id = r.role_id"
        @Override
 *
    @NotNull
 * you may not use this file except in compliance with the License.
    public String getName() {
import org.jkiss.dbeaver.model.struct.DBSObject;
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
     */
    private final UserPrivCache userPrivCache = new UserPrivCache();
    }
                            + " u.user_name = ?"
                            + " , system_.sys_users_ gr"
import org.jkiss.code.Nullable;
                            + " ge.user_name AS grantee_name"
                        + " WHERE"
                            + " AND r.grantor_id = gr.user_id"

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

 * distributed under the License is distributed on an "AS IS" BASIS,
    public Collection<AltibasePrivUser> getUserPrivs(DBRProgressMonitor monitor) throws DBException {
                            + " , system_.sys_users_ u"
    @Nullable
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull AltibaseRole owner) throws SQLException {
        @Override
 * AltibaseRole

    /**
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.model.meta.Property;
    }
import java.sql.ResultSet;
            dbStat.setString(1, owner.getName());
/*
                        + " ORDER BY grantee_name, grantor_name");
    @Association
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.access.DBARole;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Collection;
                        + " FROM"

        protected AltibasePrivUser fetchObject(@NotNull JDBCSession session, @NotNull AltibaseRole owner, 
            final JDBCPreparedStatement dbStat = session.prepareStatement(
                            + " , system_.sys_user_roles_ r"
    @Override
            return new AltibasePrivUser(owner, resultSet);
 * See the License for the specific language governing permissions and
            return dbStat;
                    "SELECT"
    @Property(viewable = true, order = 2)
        return name;
public class AltibaseRole extends AltibaseGrantee implements DBARole {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
        @NotNull
    @Override

