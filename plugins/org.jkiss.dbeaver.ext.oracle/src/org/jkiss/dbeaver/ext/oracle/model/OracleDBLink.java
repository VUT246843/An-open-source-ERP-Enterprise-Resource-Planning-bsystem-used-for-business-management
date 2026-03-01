import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
        return host;
        return object;
    public Date getCreated()
        this.userName = JDBCUtils.safeGetString(dbResult, "USERNAME");
import org.jkiss.utils.CommonUtils;
    private String host;
}
        if (object == null) {
    @Property(viewable = true, order = 4)
    public static Object resolveObject(DBRProgressMonitor monitor, OracleSchema schema, String dbLink) throws DBException

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


 * limitations under the License.
    }
 */
    }
 *
            return dbLink;
    public String getHost()
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * DBeaver - Universal Database Manager
    public String getUserName()
    }
 *
/*
package org.jkiss.dbeaver.ext.oracle.model;
    {

 * DB Link
        super(schema, JDBCUtils.safeGetString(dbResult, "DB_LINK"), true);
        this.host = JDBCUtils.safeGetString(dbResult, "HOST");
public class OracleDBLink extends OracleSchemaObject {
/**
    private static final Log log = Log.getLog(OracleDBLink.class);
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
    {
    @Property(viewable = true, editable = true, order = 3)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
    {
    {
import org.jkiss.dbeaver.model.meta.Property;
import java.sql.ResultSet;
        }
    protected OracleDBLink(DBRProgressMonitor progressMonitor, OracleSchema schema, ResultSet dbResult)
        this.created = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = true, order = 2)
import java.util.Date;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }


    private String userName;


 *
        final OracleDBLink object = schema.dbLinkCache.getObject(monitor, schema, dbLink);
 */
    private Date created;
        if (CommonUtils.isEmpty(dbLink)) {



        return userName;
        return created;
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
            log.warn("DB Link '" + dbLink + "' not found in schema '" + schema.getName() + "'");
    {
