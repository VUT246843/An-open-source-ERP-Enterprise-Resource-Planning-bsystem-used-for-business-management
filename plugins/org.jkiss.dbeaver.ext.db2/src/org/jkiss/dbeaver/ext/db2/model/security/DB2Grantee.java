
    public Collection<DB2AuthTable> getTablesAuths(DBRProgressMonitor monitor) throws DBException

    @Override

    }
 *
    // Filter
    {
    @SuppressWarnings("unchecked")

        if (listAuths == null) {
    // -----------------------
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------

 * See the License for the specific language governing permissions and
    @Association
    {
    @Association
    {
    // -----------------------
import java.util.ArrayList;
 */
    {
    {
    {
        authCache.clearCache();
    @Association
    @Association
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public abstract DB2AuthIDType getType();
    {
        }
    // Constructors
    public Collection<DB2AuthProcedure> getProceduresAuths(DBRProgressMonitor monitor) throws DBException

    {

import java.util.HashMap;

}
    private Map<Class<?>, Collection<? extends DB2AuthBase>> cachePerObject;
    {
import java.sql.ResultSet;
    private final DB2GranteeDatabaseAuthCache databaseAuthCache = new DB2GranteeDatabaseAuthCache();
        this.name = JDBCUtils.safeGetStringTrimmed(resultSet, keyColName);
        return getAuths(monitor, DB2AuthColumn.class);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return getAuths(monitor, DB2AuthSchema.class);
    @Association
    }
    private final DB2GranteeAuthCache authCache = new DB2GranteeAuthCache();
        databaseAuthCache.clearCache();
    // Business Contract
    // Associations

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
import org.jkiss.dbeaver.ext.db2.model.DB2GlobalObject;
/*


    }
package org.jkiss.dbeaver.ext.db2.model.security;

    @Association
    }
        return getAuths(monitor, DB2AuthProcedure.class);
        return this;
    public Collection<DB2AuthView> getViewsAuths(DBRProgressMonitor monitor) throws DBException
            for (DB2AuthBase db2Auth : authCache.getAllObjects(monitor, this)) {
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
    }


        roleCache.clearCache();
    // Properties
    public String getName()
    public Collection<DB2AuthSchema> getSchemasAuths(DBRProgressMonitor monitor) throws DBException
        return getAuths(monitor, DB2AuthXMLSchema.class);
    {
 * @author Denis Forveille
 * limitations under the License.
    private <T extends DB2AuthBase> Collection<T> getAuths(DBRProgressMonitor monitor, Class<T> authClass) throws DBException
    public Collection<DB2AuthPackage> getPackagesAuths(DBRProgressMonitor monitor) throws DBException
        cachePerObject = new HashMap<>(12);
        return getAuths(monitor, DB2AuthVariable.class);
    public Collection<DB2DatabaseAuth> getDatabaseAuths(DBRProgressMonitor monitor) throws DBException

    @NotNull
 * DB2 Super class for Users, Groups and Roles (=Grantees)
        return getAuths(monitor, DB2AuthIndex.class);

        Collection<T> listAuths = (Collection<T>) cachePerObject.get(authClass.getClass());
        super(dataSource, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return databaseAuthCache.getAllObjects(monitor, this);
    @Association
    {
    }
        return getAuths(monitor, DB2AuthPackage.class);
        return listAuths;
    @Association


    }
    @Association
    @Association
    public Collection<DB2AuthXMLSchema> getXMLSchemasAuths(DBRProgressMonitor monitor) throws DBException
    // -----------------
    }


    public Collection<DB2AuthColumn> getColumnsAuths(DBRProgressMonitor monitor) throws DBException
        return getAuths(monitor, DB2AuthModule.class);
    @Association
    public Collection<DB2AuthTablespace> getTablespacesAuths(DBRProgressMonitor monitor) throws DBException
    {
/**

import org.jkiss.dbeaver.model.meta.Property;
    private String name;
    {
    }
                }

    public Collection<DB2AuthVariable> getVariablesAuths(DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                if (authClass.isInstance(db2Auth)) {
        return getAuths(monitor, DB2AuthTable.class);
 *

 *
    @Association
            }
        return getAuths(monitor, DB2AuthTablespace.class);
                    listAuths.add((T) db2Auth);
import org.jkiss.dbeaver.model.struct.DBSObject;
    // -----------------
import java.util.Map;
    }
    // -----------------
    // Helper

    @Property(viewable = true, order = 1)
    }
    {
        return getAuths(monitor, DB2AuthMaterializedQueryTable.class);
    public Collection<DB2RoleAuth> getRoles(DBRProgressMonitor monitor) throws DBException
    @Association
    }
    // -----------------
 * You may obtain a copy of the License at
import java.util.Collection;
    @Override
        return roleCache.getAllObjects(monitor, this);
    // -----------------
    public Collection<DB2AuthModule> getModulesAuths(DBRProgressMonitor monitor) throws DBException
        return getAuths(monitor, DB2AuthSequence.class);
    // -----------------
public abstract class DB2Grantee extends DB2GlobalObject implements DBPRefreshableObject {

    }
 * 
    public Collection<DB2AuthIndex> getIndexesAuths(DBRProgressMonitor monitor) throws DBException
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    {

    @Association

        return getAuths(monitor, DB2AuthView.class);
    // -----------------
import org.jkiss.dbeaver.model.meta.Association;

import org.jkiss.code.NotNull;
    {
    @Association

    }
    }
 * Unless required by applicable law or agreed to in writing, software
    private final DB2GranteeRoleCache roleCache = new DB2GranteeRoleCache();
    }
    }
    @Association
    }
    public Collection<DB2AuthMaterializedQueryTable> getMQTAuths(DBRProgressMonitor monitor) throws DBException


    {
    public Collection<DB2AuthSequence> getSequencesAuths(DBRProgressMonitor monitor) throws DBException
        cachePerObject.clear();



 * DBeaver - Universal Database Manager
    {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Collection<DB2AuthUDF> getFunctionsAuths(DBRProgressMonitor monitor) throws DBException
    public DB2Grantee(DBRProgressMonitor monitor, DB2DataSource dataSource, ResultSet resultSet, String keyColName)
            listAuths = new ArrayList<>();
        return name;
 */
    }
        return getAuths(monitor, DB2AuthUDF.class);
