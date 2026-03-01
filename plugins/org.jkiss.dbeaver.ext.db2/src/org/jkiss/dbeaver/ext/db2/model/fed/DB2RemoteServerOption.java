        return remoteServer;
import java.sql.Timestamp;
    @Property(viewable = true, editable = false, order = 1)
/*
    // Properties
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        return name;

    {
        return setting;
        return remarks;
    public DB2RemoteServer getRemoteServer()
 *

    public DB2RemoteServerOption(DB2RemoteServer remoteServer, ResultSet dbResult)
    public Timestamp getCreateTime()
    }
    // -----------------
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    public String getServerOptionKey()
        this.serverOptionKey = JDBCUtils.safeGetString(dbResult, "SERVEROPTIONKEY");
import org.jkiss.code.NotNull;

 * DB2 Federated Remote Server Option
package org.jkiss.dbeaver.ext.db2.model.fed;
/**
    }
    }
    public String getRemarks()
 * limitations under the License.
    }
 *
public class DB2RemoteServerOption extends DB2Object<DB2RemoteServer> {
}
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    @Property(viewable = true, editable = false, length = PropertyLength.MULTILINE, order = 5)
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * Unless required by applicable law or agreed to in writing, software


        return createTime;
 * @author Denis Forveille
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    private String setting;
    private String serverOptionKey;
import java.sql.ResultSet;
    }
    }
    {

 */
    public String getSetting()
    @Override



    public String getName()
    private final DB2RemoteServer remoteServer;

    {
        super(remoteServer, JDBCUtils.safeGetString(dbResult, "OPTION"), true);


    private Timestamp createTime;
 * You may obtain a copy of the License at
    // -----------------
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
        return serverOptionKey;
    // Constructors
        this.setting = JDBCUtils.safeGetString(dbResult, "SETTING");
    // -----------------------
    }
    @Property(viewable = true, editable = false, order = 4, category = DB2Constants.CAT_DATETIME)
    @Property(viewable = true, editable = false, order = 2)
    @NotNull
    private String remarks;

 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.PropertyLength;

    @Property(viewable = true, editable = false, order = 3)
import org.jkiss.dbeaver.ext.db2.model.DB2Object;
    {
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    {
 */
 * See the License for the specific language governing permissions and
        this.remoteServer = remoteServer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    // -----------------------
import org.jkiss.dbeaver.model.meta.Property;
 * you may not use this file except in compliance with the License.

    {
