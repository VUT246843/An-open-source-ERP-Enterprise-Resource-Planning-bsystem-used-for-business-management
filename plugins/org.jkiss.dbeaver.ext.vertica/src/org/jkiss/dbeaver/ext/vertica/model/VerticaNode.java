    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private String nodeAddress;

    @Override

 *
    }
    }
        this.nodeAddress = JDBCUtils.safeGetString(dbResult, "node_address");
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private String nodeAddressFamily;

        this.lastMsgFromNodeAt = JDBCUtils.safeGetTimestamp(dbResult, "last_msg_from_node_at");
/*
        return name;
/**
    public DBSObject getParentObject() {
        return exportAddress;
import org.jkiss.dbeaver.model.DBPDataSource;

    public boolean isEphemeral() {
    @Property(order = 21)
    private String name;
 *
    @Override

        return nodeAddressFamily;
import org.jkiss.dbeaver.model.meta.Property;

    private String nodeState;
    @Property(order = 9)
        return nodeAddress;
package org.jkiss.dbeaver.ext.vertica.model;
    }

    @Property(order = 22)
    public String getName() {
    public String getNodeAddress() {
    @NotNull
 * limitations under the License.
    public Date getLastMsgFromNodeAt() {
    protected VerticaNode(VerticaDataSource dataSource, JDBCResultSet dbResult) {
        this.nodeDownSince = JDBCUtils.safeGetTimestamp(dbResult, "node_down_since");

        return lastMsgFromNodeAt;
        this.exportAddress = JDBCUtils.safeGetString(dbResult, "export_address");
    public DBPDataSource getDataSource() {


        return standingInFor;
    @Property(viewable = true, order = 4)
{
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.standingInFor = JDBCUtils.safeGetString(dbResult, "standing_in_for");
    }
        return catalogPath;
    private String nodeType;
    }
    }
        return dataSource;

    public String getNodeType() {

        return nodeDownSince;

    }
        this.nodeState = JDBCUtils.safeGetString(dbResult, "node_state");
    @Property(order = 8)
    }
    @Property(order = 6)
        return isEphemeral;
        this.exportAddressFamily = JDBCUtils.safeGetString(dbResult, "export_address_family");
    }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    private String exportAddress;
    @Property(viewable = true, order = 1)
    private boolean isEphemeral;
    private Date lastMsgFromNodeAt;
        return exportAddressFamily;
    private String standingInFor;
        return nodeState;
    private String exportAddressFamily;
    public String getStandingInFor() {
    public String getNodeAddressFamily() {

    public String getCatalogPath() {
import java.util.Date;
        return nodeType;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getExportAddressFamily() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        this.nodeAddressFamily = JDBCUtils.safeGetString(dbResult, "node_address_family");

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    @Property(viewable = true, order = 2)
        this.dataSource = dataSource;
    public String getExportAddress() {
        this.catalogPath = JDBCUtils.safeGetString(dbResult, "catalog_path");
    }
        return dataSource;
        return true;
        this.isEphemeral = JDBCUtils.safeGetBoolean(dbResult, "is_ephemeral");
 */

 * DBeaver - Universal Database Manager
        this.nodeType = JDBCUtils.safeGetString(dbResult, "node_type");

 */
    @Property(viewable = true, order = 3)
 *
    public boolean isPersisted() {
    @Property(order = 20)
        this.name = JDBCUtils.safeGetString(dbResult, "node_name");
    public Date getNodeDownSince() {
 * VerticaNode

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(order = 7)
}
public class VerticaNode implements DBSObject
 * Unless required by applicable law or agreed to in writing, software
    }
    }

    public String getDescription() {
    final private VerticaDataSource dataSource;

    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    private String catalogPath;

    private Date nodeDownSince;
    }
    @Property(order = 5)
    public String getNodeState() {
    @Override
        return null;
