    @Override
    }

    @Property(viewable = true, order = 1)

    @Override
    public String getOptions() {
    public PostgreTablespace(PostgreDatabase database, ResultSet dbResult)
    }
        if (CommonUtils.isNotEmpty(getOptions())) {

        return sb.toString();
 * You may obtain a copy of the License at
        throws SQLException {
    private String name;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software




        sb.append(DBUtils.getQuotedIdentifier(this)).append(" OWNER ").append(DBUtils.getQuotedIdentifier(getOwner(monitor)));
    private String loc;
    }
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
/**

        this.options = opts == null ? "" : String.join(",", opts);
import org.jkiss.dbeaver.DBException;
        this.loadInfo(dbResult);
import org.jkiss.utils.CommonUtils;
    }
    }
        return options;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

        if (getDataSource().getServerType().supportsTablespaceLocation()) {
}
        }
    public String getLoc() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public void setLoc(String loc) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.name = JDBCUtils.safeGetString(dbResult, "spcname");
 * PostgreTablespace
 * you may not use this file except in compliance with the License.
    }
        if (CommonUtils.isNotEmpty(getLoc())) {
        this.loc = loc;

import java.sql.SQLException;
    private void loadInfo(ResultSet dbResult) {
        this.options = "";
 * See the License for the specific language governing permissions and
        return oid;

        this.name = "newtablespace";
    public void setOptions(String options) {
        this.name = name;
    public long getObjectId() {
        return name;

    public String getName() {
    }
        this.oid = 0;
    public void setObjectDefinitionText(String sourceText) throws DBException {
 */
    private String options;
package org.jkiss.dbeaver.ext.postgresql.model;
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            sb.append("\nWITH (").append(getOptions()).append(")");
    public void setOwnerId(long ownerId) {
    @Property(viewable = true, order = 4)

        super(database);
    @NotNull
import java.sql.ResultSet;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        StringBuilder sb = new StringBuilder("CREATE TABLESPACE ");
    }

        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
        String[] opts = PostgreUtils.safeGetStringArray(dbResult, "spcoptions");
        this.options = options;

 *
import org.jkiss.dbeaver.model.DBUtils;
    public PostgreTablespace(PostgreDatabase database) {
        return loc;
/*
        this.ownerId = 0;
    @Override
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "spcowner");
    @Override
 *
        return getDatabase().getRoleById(monitor, ownerId);
    }
 */
import java.util.Map;
        this.loc = "";
    @Property(viewable = true, order = 3)
    @Property(viewable = true, order = 2)
    }
public class PostgreTablespace extends PostgreInformation implements PostgreScriptObject {
        }
import org.jkiss.dbeaver.model.meta.Property;


    }
    }


            sb.append(" LOCATION '").append(getLoc()).append("'");

 *

    public void setName(String name) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private long oid;
            this.loc = JDBCUtils.safeGetString(dbResult, "loc");
    }
        super(database);
        this.ownerId = ownerId;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private long ownerId;
