import org.jkiss.code.NotNull;
        return this;
    // Associations
        this.name = JDBCUtils.safeGetString(dbResult, "SERVERNAME");
import org.jkiss.dbeaver.ext.db2.model.cache.DB2RemoteServerOptionCache;

 */
        String db2WrapperName = JDBCUtils.safeGetString(dbResult, "WRAPNAME");




/**
        if (db2WrapperName != null) {
    {
    private String type;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    public DB2RemoteServer(DB2DataSource db2DataSource, ResultSet dbResult) throws DBException


        this.version = JDBCUtils.safeGetString(dbResult, "SERVERVERSION");


    // -----------------

    public String getName()
    public String getType()
    }
    }
        return name;
    @Property(viewable = true, editable = false, order = 1)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
    // -----------------
    }
 *
public class DB2RemoteServer extends DB2GlobalObject implements DBPRefreshableObject {

    // -----------------
    private String version;
    // Constructors
    }
 * DBeaver - Universal Database Manager
    @Property(viewable = true, editable = false, order = 4)
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
 */

 * limitations under the License.
 * DB2 Federated Remote Server

 *
    @Override
    @Association
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * you may not use this file except in compliance with the License.
    // -----------------


    @Property(viewable = true, editable = false, order = 3)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    {
        return remarks;
import java.util.Collection;
    public DB2Wrapper getDb2Wrapper()
    private final DB2RemoteServerOptionCache optionsCache = new DB2RemoteServerOptionCache();
        return type;

    {
    }
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getVersion()
    {
    }
import java.sql.ResultSet;
 * @author Denis Forveille
import org.jkiss.dbeaver.model.meta.Property;
    // -----------------
    }
        super(db2DataSource, true);
    private String remarks;
    // -----------------
    @Property(viewable = true, editable = false, order = 2)
 * See the License for the specific language governing permissions and
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    @Property(viewable = true, editable = false, length = PropertyLength.MULTILINE, order = 5)
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    {

}
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {
package org.jkiss.dbeaver.ext.db2.model.fed;
 * 
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return version;
    public Collection<DB2RemoteServerOption> getOptions(DBRProgressMonitor monitor) throws DBException
    @Override
        this.type = JDBCUtils.safeGetString(dbResult, "SERVERTYPE");
/*


 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 * You may obtain a copy of the License at
 *
            this.db2Wrapper = getDataSource().getWrapper(new VoidProgressMonitor(), db2WrapperName);
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        return optionsCache.getAllObjects(monitor, this);
    private DB2Wrapper db2Wrapper;
import org.jkiss.dbeaver.ext.db2.model.DB2GlobalObject;
    private String name;
        optionsCache.clearCache();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return db2Wrapper;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Properties
    public String getRemarks()
import org.jkiss.dbeaver.model.meta.Association;
 * Licensed under the Apache License, Version 2.0 (the "License");
