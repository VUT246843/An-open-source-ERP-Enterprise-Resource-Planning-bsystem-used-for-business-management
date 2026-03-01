 * See the License for the specific language governing permissions and
/**
    public void setObjectDefinitionText(String sourceText) throws DBException {
    }
import org.jkiss.dbeaver.model.meta.Property;
import java.sql.SQLException;
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                   "FOR " + getName() + "\n\t" +
        }
    @NotNull
    private String[] serverOptions;

    @Property(viewable = true, order = 4)
    public String getName()
    public PostgreUserMapping(PostgreForeignServer foreignServer, ResultSet dbResult)

package org.jkiss.dbeaver.ext.postgresql.model;
    }
    }
                "CREATE USER MAPPING" + "\n\t" + 
            super(foreignServer.getDatabase());
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    }
    private PostgreForeignServer foreignServer;
    }
 * PostgreForeignServer
    public String[] getUserMappingOptions() {
public class PostgreUserMapping extends PostgreInformation implements PostgreScriptObject {

        return userMappingOptions;
            this.loadInfo(dbResult);

 *
    }
 *
    public long getObjectId() {
import org.jkiss.dbeaver.DBException;

            "-- User Mapping: " + getName() + "\n\n" +
 * Copyright (C) 2010-2025 DBeaver Corp and others
        throws SQLException
                   "SERVER " + foreignServer.getName() + "\n\t" +


        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
 * you may not use this file except in compliance with the License.
 */
 * Unless required by applicable law or agreed to in writing, software
    private long oid;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.foreignServer = foreignServer;
 */

        {

    private void loadInfo(ResultSet dbResult)
    {
        return name;
}
        this.serverOptions = PostgreUtils.safeGetStringArray(dbResult, "srvoptions");
    @Override
        return oid;
/*

                "-- DROP USER MAPPING FOR " + getName() + " SERVER " + foreignServer.getName() + ";\n\n" +
    {
                   "OPTIONS " + PostgreUtils.getOptionsString(this.userMappingOptions);
    @Property(viewable = true, order = 5)
import org.jkiss.code.NotNull;

import java.sql.ResultSet;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        this.name = JDBCUtils.safeGetString(dbResult, "rolname");
        this.userMappingOptions = PostgreUtils.safeGetStringArray(dbResult, "umoptions");
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        throws SQLException
    @Override
    private String name;

 * DBeaver - Universal Database Manager
    }
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    public String[] getServerOptions() {
    @Property(viewable = true, order = 3)
        return serverOptions;
 * You may obtain a copy of the License at
    private String[] userMappingOptions;
        return
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
