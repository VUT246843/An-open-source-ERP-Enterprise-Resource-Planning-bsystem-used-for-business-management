            dbStat.setString(1, owner.getName());
                                + " AND g.obj_type = 'A'"
 * You may obtain a copy of the License at
                            + " ) UNION ALL ("
                            + " FROM"
 *     http://www.apache.org/licenses/LICENSE-2.0
                                + " AND g.priv_id = p.priv_id AND p.priv_type = 1"
                                + " system_.sys_grant_object_ g, "
     * Returns role(s) belongs to a user 
                            + " ,system_.sys_users_ gr"
            dbStat.setString(1, owner.getName());
                                + " , schema.user_name AS schema_name"
                                    + " 3, 'Typeset',"
     */
                    + "FROM system_.sys_users_ u1,  system_.sys_users_ u2, system_.sys_grant_system_ g "
                                + " , t.table_name AS obj_name"
                            + " SELECT"
                                + " , p.priv_name AS priv_name"
            for (int i = 1; i < 6; i++) {
                                + " system_.sys_users_ schema, system_.sys_users_ grantor, system_.sys_users_ grantee,"
                                + " , g.with_grant_option AS with_grant_option"
                            + " ((SELECT"
    
 */
                                + " system_.sys_privileges_ p, "
                                + " AND g.obj_id = t.library_id"
        @Override
                                + " system_.sys_grant_object_ g, "
                            + " WHERE"
                                + " system_.sys_grant_object_ g, "
                                + " , t.proc_name AS obj_name"
        return this;
import org.jkiss.dbeaver.DBException;
                                + " AND schema.user_id = g.user_id"
                            + " FROM"
                                    + " 'Unknown') as obj_type"
    protected final RolePrivCache rolePrivCache = new RolePrivCache();
        @NotNull
        systemPrivCache.clearCache();
                dbStat.setString(i, owner.getName());
import org.jkiss.code.NotNull;
     */
        @Override
                                + " AND g.priv_id = p.priv_id AND p.priv_type = 1"
                                + " system_.sys_procedures_ t"
                                + " system_.sys_grant_object_ g, "
                            + " ur.user_name AS role_name"
}
 *
                            + " WHERE"

                                    + " 'V', 'View',"

        }

    
                            + " ,system_.sys_user_roles_ r"
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                            + " AND r.role_id != 0 /* exclude public */");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    protected String name;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull
                                + " AND g.grantor_id = grantor.user_id"
                                + " grantee.user_name = ? AND g.grantee_id = grantee.user_id"
    private final SystemPrivCache systemPrivCache = new SystemPrivCache();
    private final ObjectPrivCache objectPrivCache = new ObjectPrivCache();
                                + " , g.with_grant_option AS with_grant_option"
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    
                                + " grantor.user_name AS grantor_name"
    }
 * Unless required by applicable law or agreed to in writing, software
                                    + " 'S', 'Sequence', "
                                + " AND (g.obj_type = 'T' OR g.obj_type = 'S')"
                                + " AND g.obj_id = t.proc_oid"
                                + " AND g.obj_type = 'D'"
        rolePrivCache.clearCache();
                                + " grantor.user_name AS grantor_name"

        protected AltibasePrivObject fetchObject(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner, 
                                + " system_.sys_grant_object_ g, "
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                            + " AND r.role_id = ur.user_id"
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                                + " AND g.grantor_id = grantor.user_id"
        @NotNull
        }
 *
                            + " ,gr.user_name AS grantor_name"
            final JDBCPreparedStatement dbStat = session.prepareStatement(
                                + " grantor.user_name AS grantor_name"
                        + " FROM"
        objectPrivCache.clearCache();
    
import java.sql.SQLException;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * you may not use this file except in compliance with the License.
                                + " grantee.user_name = ? AND g.grantee_id = grantee.user_id"
                                + " system_.sys_directories_ t"
                                + " , t.directory_name AS obj_name"
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        protected AltibasePrivSystem fetchObject(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner, 
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                + " AND g.grantor_id = grantor.user_id"
    }
                                + " grantee.user_name = ? AND g.grantee_id = grantee.user_id"
                                + " system_.sys_users_ schema, system_.sys_users_ grantor, system_.sys_users_ grantee,"
                            + " SELECT"
                    + "WHERE p.priv_type = 2 "
                            + " ) UNION ALL ("
    }
                                + " , DECODE(t.object_type, "
        @Override
                            + " FROM"
import java.util.Collection;
                            + " ))"
                            + " ) UNION ALL ("
    }
                                + " AND g.obj_type = 'Y'"
                                + " AND schema.user_id = g.user_id"

        }
    static class RolePrivCache extends JDBCObjectCache<AltibaseGrantee, AltibasePrivRole> {
        protected AltibasePrivRole fetchObject(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner, 
     * Returns object privileges belongs to a user 
    }
    @Override
                            + " ) UNION ALL ("
    @Association
                                + " , 'Package' as obj_type"
                            + " system_.sys_users_ ge"
                                + " system_.sys_users_ schema, system_.sys_users_ grantor, system_.sys_users_ grantee,"
        return objectPrivCache.getAllObjects(monitor, this);
            }
    public Collection<AltibasePrivSystem> getSystemPrivs(DBRProgressMonitor monitor) throws DBException {
                                + " , g.with_grant_option AS with_grant_option"
                                + " , t.library_name AS obj_name"
                    + "WHERE g.grantee_id = u2.user_id and u2.user_name = ? and u1.user_id = g.grantor_id"
                    + "FROM system_.sys_privileges_ p LEFT OUTER JOIN "
                                + " system_.sys_tables_ t"
                                + " grantee.user_name = ? AND g.grantee_id = grantee.user_id"
 * See the License for the specific language governing permissions and
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner) throws SQLException {
                                + " , g.with_grant_option AS with_grant_option"

                                + " AND g.grantor_id = grantor.user_id"
    static class SystemPrivCache extends JDBCObjectCache<AltibaseGrantee, AltibasePrivSystem> {
                                + " , schema.user_name AS schema_name"
                                + " system_.sys_libraries_ t"
                                + " , p.priv_name AS priv_name"
public abstract class AltibaseGrantee extends AltibaseGlobalObject 

            return dbStat;
    /**
                            + " SELECT"
                                + " AND g.obj_id = t.package_oid AND t.package_type = 6"
                                + " , p.priv_name AS priv_name"
    /**
                    + ") gr ON p.priv_id = gr.priv_id "
        super(dataSource, true);
                            + " WHERE"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return new AltibasePrivRole(owner, resultSet);
 * limitations under the License.
import org.jkiss.code.Nullable;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner) throws SQLException {
     * Returns system privileges belongs to a user 
                                + " system_.sys_privileges_ p, "
    
                            + " ,system_.sys_users_ ur"
                                + " AND g.priv_id = p.priv_id AND p.priv_type = 1"
/*
                                + " AND g.obj_id = t.table_id"
                                + " system_.sys_packages_ t"
                                + " AND g.obj_id = t.directory_id"
 * distributed under the License is distributed on an "AS IS" BASIS,
                                + " grantor.user_name AS grantor_name"
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                                + " AND schema.user_id = g.user_id"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                                + " AND g.priv_id = p.priv_id AND p.priv_type = 1"
    @Association
                            + " FROM"
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                                    + " 1, 'Function',"
                            + " ORDER BY grantor_name, obj_type, schema_name, obj_name, priv_name");
        this.name = name;
                                + " , schema.user_name  AS schema_name"
                            + " SELECT"
                                + " system_.sys_privileges_ p, "
                            + " FROM"
        @Override
                    "SELECT"
    public Collection<AltibasePrivRole> getRolePrivs(DBRProgressMonitor monitor) throws DBException {
                            + " AND gr.user_id = r.grantor_id"
                            + " AND ur.user_type = 'R'"
    
                                + " , 'Package' as obj_type"
                            + " ge.user_name = ?"
    implements DBAUser, DBSObjectLazy<AltibaseDataSource>, DBPRefreshableObject {
        return rolePrivCache.getAllObjects(monitor, this);
                                + " AND g.grantor_id = grantor.user_id"
    static class ObjectPrivCache extends JDBCObjectCache<AltibaseGrantee, AltibasePrivObject> {
                                + " system_.sys_users_ schema, system_.sys_users_ grantor, system_.sys_users_ grantee,"
                                + " grantor.user_name AS grantor_name"
                                + " AND schema.user_id = g.user_id"
    public Collection<AltibasePrivObject> getObjectPrivs(DBRProgressMonitor monitor) throws DBException {
        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    }
        }
    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull AltibaseGrantee owner) throws SQLException {
    /**
import org.jkiss.dbeaver.model.meta.Association;

                            + " AND ge.user_id = r.grantee_id"
            final JDBCPreparedStatement dbStat = session.prepareStatement(
                                + " AND g.obj_type = 'P'"
                                + " system_.sys_privileges_ p, "
                            + " WHERE"
     */
            return dbStat;
    }
package org.jkiss.dbeaver.ext.altibase.model;
            return new AltibasePrivObject(owner, resultSet);
        }
                                + " AND schema.user_id = g.user_id"
                                + " , schema.user_name AS schema_name"
                                + " AND g.priv_id = p.priv_id AND p.priv_type = 1"
                                + " , schema.user_name AS schema_name"
                                + " , 'Package' as obj_type"
                                + " , t.package_name AS obj_name"
                    "SELECT p.priv_name, gr.grantor_name "
                    + "(SELECT priv_id, u1.user_name AS grantor_name "
                                + " system_.sys_privileges_ p, "
                                + " system_.sys_users_ schema, system_.sys_users_ grantor, system_.sys_users_ grantee,"

                                + " , g.with_grant_option AS with_grant_option"
            return new AltibasePrivSystem(owner, resultSet);
                                    + " 'T', 'Table',"

 *
                            + " WHERE"
        @Override
    @Association
        return systemPrivCache.getAllObjects(monitor, this);
                                    + " 'Q', 'Queue',"
                                    + " 'Unknown') as obj_type"
    public AltibaseGrantee(AltibaseDataSource dataSource, String name) {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
 * DBeaver - Universal Database Manager

                                + " , p.priv_name AS priv_name"
                    "SELECT * FROM"
import org.jkiss.dbeaver.model.access.DBAUser;
                        + " WHERE"
                    + "ORDER BY p.priv_name");
                                + " , p.priv_name AS priv_name"
    
    @Nullable
                                + " , DECODE(t.table_type, "
                                    + " 0, 'Procedure',"
                                + " grantee.user_name = ? AND g.grantee_id = grantee.user_id"
            return dbStat;
