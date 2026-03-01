 *
    private long oid;


    private void loadInfo(ResultSet dbResult)

import org.jkiss.code.NotNull;
    @Override
import java.sql.SQLException;
 * you may not use this file except in compliance with the License.
        super(accessMethod.getDatabase());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    private PostgreAccessMethod accessMethod;
    @Property(viewable = true, order = 3)

    public String getName()
 * See the License for the specific language governing permissions and
    @NotNull
 *
    }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    private long namespaceId;
public class PostgreOperatorFamily extends PostgreInformation {
    {
    private long ownerId;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * PostgreOperatorFamily
        this.loadInfo(dbResult);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return oid;
import org.jkiss.dbeaver.DBException;
    }
        return accessMethod.getDatabase().getSchema(monitor, namespaceId);
    @Property(viewable = true, order = 4)
    public PostgreOperatorFamily(PostgreAccessMethod accessMethod, ResultSet dbResult)
        throws SQLException

    public long getObjectId() {
    }
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "opfowner");
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Property(viewable = true, order = 2)
import org.jkiss.dbeaver.model.meta.Property;
        this.name = JDBCUtils.safeGetString(dbResult, "opfname");
    }

        throws SQLException
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
 * limitations under the License.

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.ResultSet;
    {

    {
}
        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
package org.jkiss.dbeaver.ext.postgresql.model;
 */
    public PostgreSchema getNamespace(DBRProgressMonitor monitor) throws DBException {
 */

        this.accessMethod = accessMethod;
    }
        return name;
        this.namespaceId = JDBCUtils.safeGetLong(dbResult, "opfnamespace");
    @Property(viewable = true, order = 1)
 * distributed under the License is distributed on an "AS IS" BASIS,
        return accessMethod.getDatabase().getRoleById(monitor, ownerId);
 * DBeaver - Universal Database Manager
/*
    private String name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**

    }
