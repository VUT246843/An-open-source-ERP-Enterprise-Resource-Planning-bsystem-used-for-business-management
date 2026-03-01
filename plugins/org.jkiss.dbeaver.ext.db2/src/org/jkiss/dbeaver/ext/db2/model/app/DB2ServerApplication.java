    @Property(viewable = false)
        // It needs to activate some monitoring flags that are usually off..
    }
    public String getApplicationName()
    public Long getClientPId()

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.clientProtocol = JDBCUtils.safeGetString(dbResult, "CLIENT_PROTOCOL");
        this.statusChangeTime = JDBCUtils.safeGetString(dbResult, "STATUS_CHANGE_TIME");
    public String getApplicationStatus()
    }
        return tpmonClientUserid;
        this.numAssociatedAgents = JDBCUtils.safeGetLong(dbResult, "NUM_ASSOC_AGENTS");
        this.authorisationId = JDBCUtils.safeGetString(dbResult, "AUTHID");
        this.tpmonAccountingString = JDBCUtils.safeGetString(dbResult, "TPMON_ACC_STR");
    {
    @Property(viewable = false, category = DB2Constants.CAT_CLIENT)

    public String getTpmonClientWorkstationNane()
        return Objects.hash(agentId, applicationId);
    private String tpmonClientUserid;
 */
    public Long getNumAssociatedAgents()
 *
    {
    @Property(viewable = true, editable = false, order = 5)
        this.applicationId = JDBCUtils.safeGetString(dbResult, "APPL_ID");

    private final Long agentId;
    // -----------------------
    @Property(viewable = true, editable = false, order = 4)
        return tpmonClientWorkstationNane;
    public String getClientDatabaseAlias()

        return coordNodeNum;
    public String getAuthorisationId()
    private String authorisationId;
        return statusChangeTime;
        return tpmonClientApplicationName;
    }
package org.jkiss.dbeaver.ext.db2.model.app;
        this.applicationName = JDBCUtils.safeGetString(dbResult, "APPL_NAME");
        return agentId.toString();
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    {
    public String getStatusChangeTime()
    @Property(viewable = false)
    }
    @Property(viewable = true, editable = false, order = 7, category = DB2Constants.CAT_CLIENT)
    private String clientNName;
        this.databaseName = JDBCUtils.safeGetString(dbResult, "DB_NAME");
        this.agentId = JDBCUtils.safeGetLong(dbResult, "AGENT_ID");
    }

    private String statusChangeTime;

    @Property(viewable = false, category = DB2Constants.CAT_CLIENT)
import java.util.Objects;
    // Properties

    @Override
    // -----------------
    private final String applicationId;
    {
 * limitations under the License.
    {
    }
    private String clientProductId;
    private Integer coordNodeNum;
import org.jkiss.dbeaver.model.admin.sessions.AbstractServerSession;
    public String getClientProtocol()
    @Property(viewable = true, editable = false, order = 8, category = DB2Constants.CAT_CLIENT)
    public String getTpmonClientUserid()
    @Property(viewable = false)
    @Property(viewable = false, category = DB2Constants.CAT_CLIENT)
        // DF: no "Active Query" easily available in DB2
    public String getTpmonAccountingString()
    }
    // -----------------------
    @Override
    @Property(viewable = false)
    public String getClientNName()
    private String applicationName;
        return authorisationId;
    @Property(viewable = true, editable = false, order = 2)
 * 
    private String tpmonClientApplicationName;
        if (this == o) return true;
    @Override
    public String getSequenceNo()
    }
 */
    {
/**
    public String getClientProductId()
    }
import org.jkiss.dbeaver.ext.db2.DB2Constants;

 * @author Denis Forveille

    private Long numAssociatedAgents;
        this.tpmonClientApplicationName = JDBCUtils.safeGetString(dbResult, "TPMON_CLIENT_APP");
        this.tpmonClientWorkstationNane = JDBCUtils.safeGetString(dbResult, "TPMON_CLIENT_WKSTN");
        return agentId.toString();
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return numAssociatedAgents;
        return clientNName;

    @Property(viewable = true, editable = false, order = 1)
    }

    }
    @Property(viewable = true, category = DB2Constants.CAT_CLIENT)
        this.clientPId = JDBCUtils.safeGetLong(dbResult, "CLIENT_PID");
        return Objects.equals(agentId, that.agentId) && Objects.equals(applicationId, that.applicationId);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = false)
import org.jkiss.dbeaver.model.meta.Property;
        return clientProtocol;
}


        this.clientNName = JDBCUtils.safeGetString(dbResult, "CLIENT_NNAME");
    {
        return clientDatabaseAlias;
        return applicationId;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DB2 Application
    {
    }
    {

    @Override

 * DBeaver - Universal Database Manager
    {
    public DB2ServerApplication(ResultSet dbResult)
    }
    }
        this.numAssociatedAgents = JDBCUtils.safeGetLong(dbResult, "COORD_AGENT_PID");
    {
    }
    @Property(viewable = true, editable = false, order = 6)
    }
        if (o == null || getClass() != o.getClass()) return false;
    public String getDatabaseName()
        return clientProductId;
    {
    public Long getAgentId()
 * you may not use this file except in compliance with the License.
    {

    }
    }
        return null;
    }

        return applicationStatus;
    {
    @Property(viewable = true, editable = false, order = 11, category = DB2Constants.CAT_CLIENT)

        return tpmonAccountingString;
        this.clientDatabaseAlias = JDBCUtils.safeGetString(dbResult, "CLIENT_DB_ALIAS");
    private Long coordAgentPid;
    private String databaseName;
    }
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.ResultSet;
public class DB2ServerApplication extends AbstractServerSession {
    public String getTpmonClientApplicationName()
    // Constructors
        return sequenceNo;

    {
    }
    {
    private String tpmonClientWorkstationNane;
    private String applicationStatus;
    }
        // ..and most applications are not currently executing an SQL...
    private String clientDatabaseAlias;
    public String getSessionId() {

    @Property(viewable = true, editable = false, order = 10, category = DB2Constants.CAT_CLIENT)
 *
        return clientPId;
        return clientPlatform;
    private String sequenceNo;
    @Override
    public int hashCode() {

    @Property(viewable = false)
    private String tpmonAccountingString;
/*

    }
        DB2ServerApplication that = (DB2ServerApplication) o;

    public String getActiveQuery()
    @Property(viewable = true, editable = false, order = 3)
    public Integer getCoordNodeNum()
    public String getApplicationId()
    {

    public String toString()
 * See the License for the specific language governing permissions and
    {
    private Long clientPId;
 * Unless required by applicable law or agreed to in writing, software
    {
    public String getClientPlatform()
    private String clientPlatform;
        this.applicationStatus = JDBCUtils.safeGetString(dbResult, "APPL_STATUS");
    }
    }
    }
        this.coordNodeNum = JDBCUtils.safeGetInteger(dbResult, "COORD_NODE_NUM");
        this.tpmonClientUserid = JDBCUtils.safeGetString(dbResult, "TPMON_CLIENT_USERID");

    @Property(viewable = true, editable = false, order = 9, category = DB2Constants.CAT_CLIENT)
        this.clientProductId = JDBCUtils.safeGetString(dbResult, "CLIENT_PRDID");



        return databaseName;

        return coordAgentPid;


        return agentId;
        this.clientPlatform = JDBCUtils.safeGetString(dbResult, "CLIENT_PLATFORM");


    // -----------------
 * You may obtain a copy of the License at
    {
    }
    public boolean equals(Object o) {
    {
    private String clientProtocol;
    public Long getCoordAgentPid()
        this.sequenceNo = JDBCUtils.safeGetString(dbResult, "SEQUENCE_NO");
 *
        return applicationName;
