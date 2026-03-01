    public OracleUserProfile(OracleDataSource dataSource, ResultSet resultSet) {
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        @Property(viewable = true, order = 2)
        public String getType()
        @Property(viewable = true, order = 3)
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
import org.jkiss.dbeaver.model.meta.Association;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *


public class OracleUserProfile extends OracleGlobalObject
        @NotNull
     */
    @Property(viewable = true, order = 1)
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
        this.name = JDBCUtils.safeGetString(resultSet, "PROFILE");

        super(dataSource, resultSet != null);
        }
        }

import org.jkiss.code.NotNull;

            return limit;

    /**
    public Collection<ProfileResource> getResources(DBRProgressMonitor monitor) throws DBException

}
 *
        return name;
        {
        @Override
     * ProfileResource
    }
        }

            super(profile, JDBCUtils.safeGetString(resultSet, "RESOURCE_NAME"), true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
            this.type = JDBCUtils.safeGetString(resultSet, "RESOURCE_TYPE");
    @NotNull
    private String name;
 *
import org.jkiss.dbeaver.model.meta.Property;
            this.limit = JDBCUtils.safeGetString(resultSet, "LIMIT");
package org.jkiss.dbeaver.ext.oracle.model;
/*
    {
        {
        return getDataSource().profileCache.getChildren(monitor, getDataSource(), this);
        public String getName() {
        public String getLimit()
    }
 * DBeaver - Universal Database Manager

        @Property(viewable = true, order = 1)
    @Override
    }
 */
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(OracleUserProfile.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
{
 * you may not use this file except in compliance with the License.

 * limitations under the License.
import org.jkiss.dbeaver.Log;
        public ProfileResource(OracleUserProfile profile, ResultSet resultSet) {

 * OracleUserProfile
            return type;
 */

    public static class ProfileResource extends OracleObject<OracleUserProfile>
 * distributed under the License is distributed on an "AS IS" BASIS,
        private static final Log log = Log.getLog(ProfileResource.class);
 * See the License for the specific language governing permissions and

        }
import java.util.Collection;
    public String getName() {
            return super.getName();
        private String type;
    @Association

    }
        private String limit;
