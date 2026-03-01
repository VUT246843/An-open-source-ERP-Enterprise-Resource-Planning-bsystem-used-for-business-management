import org.jkiss.code.Nullable;
/*
    @Property(viewable = true, order = 2)
    private Timestamp remoteFaultDetectTime;
            return dbStat;
    public List<AltibaseReplicationReceiver> getReplicationReceivers(@NotNull DBRProgressMonitor monitor) throws DBException {
                "Refresh state of replication '" + this.getName() + "'")) {
                @NotNull AltibaseReplication owner) throws SQLException {
import org.jkiss.dbeaver.model.*;




 * Unless required by applicable law or agreed to in writing, software
    ///////////////////////////////////
            return dbStat;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    implements DBSObjectLazy<AltibaseDataSource>, DBPRefreshableObject, DBPScriptObject, DBPStatefulObject, DBPObjectStatistics {
        remoteFaultDetectTime = JDBCUtils.safeGetTimestamp(resultSet, "REMOTE_FAULT_DETECT_TIME");
        return options;
    private String conflictResolution;
        role = JDBCUtils.safeGetString(resultSet, "ROLE");
    public String getConflictResolution() {
                @NotNull AltibaseReplication owner) throws SQLException {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                            + " WHERE u.user_id = p.user_id AND u.user_name = ? AND proc_name = ?")) {
    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    static class ReceiverCache extends JDBCObjectCache<AltibaseReplication, AltibaseReplicationReceiver> {

    }
    @Property(viewable = true, order = 10)
                dbStat.executeStatement();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Property(viewable = true, order = 30)
        return giveUpTime;

    @Property(viewable = true, order = 32)
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return remoteFaultDetectTime;
 * You may obtain a copy of the License at
            }
    private long giveUpXsn;
    public String getRecoverable() {
            dbStat.setString(1, owner.getName());
    @Property(viewable = true, order = 13)
                    }
        return ddl;
    private int options;

    }
    @Nullable

    public int getParallelApplierCount() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            gap = senderCache.getCachedObjects().get(0).getGapSizeInByte();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getName() {

    public DBSObjectState getObjectState() {
        }
 * you may not use this file except in compliance with the License.
    @NotNull


import java.util.Collection;
                            + "WHERE s.rep_name = ? AND s.rep_name = g.rep_name AND p.name = 'REPLICATION_GAP_UNIT'");
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 11)

    @NotNull
    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
    public String getRemoteConnType() {
        }
     * Returns a replication's children: replication item


        return role;
 * limitations under the License.
                    if (dbResult != null && dbResult.next()) {
        return recoverable;


    }

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    }
    private long xsn;
        @Override
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        @Override
import java.util.Map;
     */


    @Property(viewable = true, order = 12)

package org.jkiss.dbeaver.ext.altibase.model;
    }
        return giveUpXsn;
        if (CommonUtils.isEmpty(ddl)) {
    public boolean getIsStarted() {
    public List<AltibaseReplicationItem> getReplicationItems(DBRProgressMonitor monitor) throws DBException {
        return isStarted;
    }
    public Collection<AltibaseReplicationSender> getReplicationSenders(@NotNull DBRProgressMonitor monitor) throws DBException {

                }
    @Override
    public String getRole() {
    }
        return this.getDataSource().getReplicationCache().refreshObject(monitor, getDataSource(), this);
        return name;
    public long getXsn() {
    // Statistics
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (senderCache.getCacheSize() > 0) {
    @Override
    @Property(viewable = true, order = 15)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private String name;
            final JDBCPreparedStatement dbStat = session.prepareStatement(

 * See the License for the specific language governing permissions and
    }

        }
    public Timestamp getGiveUpTime() {
        super((AltibaseDataSource) owner.getDataSource(), true);
 *
    private Timestamp giveUpTime;
                dbStat.setString(1, getName());
public class AltibaseReplication extends AltibaseGlobalObject 
    }

    @Override
        protected AltibaseReplicationReceiver fetchObject(@NotNull JDBCSession session, @NotNull AltibaseReplication owner, 
        }
    private boolean isStarted;
    }

    @Override
    }
    static class SenderCache extends JDBCObjectCache<AltibaseReplication, AltibaseReplicationSender> {
        parallelApplierCount = JDBCUtils.safeGetInt(resultSet, "PARALLEL_APPLIER_COUNT");
        }
    @NotNull


        options = JDBCUtils.safeGetInt(resultSet, "OPTIONS");
        remoteAddr = JDBCUtils.safeGetString(resultSet, "REMOTE_ADDR");
        return conflictResolution;
        remoteConnType = JDBCUtils.safeGetString(resultSet, "REMOTE_CONN_TYPE");
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 14)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return new AltibaseReplicationSender(owner, resultSet);

        return null;
            } catch (SQLException e) {
            dbStat.setString(1, owner.getName());
        return receiverCache.getAllObjects(monitor, this);
    public Object getLazyReference(Object propertyId) {
    }

    @NotNull
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
    }
                try (JDBCResultSet dbResult = dbStat.getResultSet()) {
    @Property(viewable = true, order = 16)
    public long getStatObjectSize() {
    private String remoteAddr;
    @Override
    private int parallelApplierCount;

        giveUpTime = JDBCUtils.safeGetTimestamp(resultSet, "GIVE_UP_TIME");
 *
        mode = JDBCUtils.safeGetString(resultSet, "REPL_MODE");
        return this.getDataSource().getReplicationCache().getChildren(monitor, this.getDataSource(), this);
    protected AltibaseReplication(GenericStructContainer owner, JDBCResultSet resultSet) {
    }
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    public boolean hasStatistics() {
        @NotNull
import java.sql.SQLException;
        recoverable = JDBCUtils.safeGetString(resultSet, "RECOVERABLE");
    @Property(viewable = true, order = 1)
        ddl = null;
import java.util.List;
        return mode;
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    public String getRemoteAddr() {
    private String role;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 

    }
    private String mode;
            return new AltibaseReplicationReceiver(owner, resultSet);
                        isStarted = JDBCUtils.safeGetBoolean(dbResult, 1, "1");
        return gap;

        return true;
import org.jkiss.dbeaver.model.struct.DBSObject;

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        @Override
 *
    }
        return parallelApplierCount;
    private final SenderCache senderCache = new SenderCache();
    private final ReceiverCache receiverCache = new ReceiverCache();
                    "SELECT status FROM system_.sys_users_ u, system_.sys_procedures_ p"
    private String recoverable;
    @Property(viewable = true, order = 3)

    @Override
    @Override
        conflictResolution = JDBCUtils.safeGetString(resultSet, "CONFLICT_RESOLUTION");
        name = JDBCUtils.safeGetString(resultSet, "REPLICATION_NAME");
    private String remoteConnType;
        }
    private String ddl;
        protected AltibaseReplicationSender fetchObject(@NotNull JDBCSession session, @NotNull AltibaseReplication owner, 
        giveUpXsn = JDBCUtils.safeGetLong(resultSet, "GIVE_UP_XSN");
        @Override

    }
    public int getOptions() {

    }
    @Property(viewable = true, order = 31)
    @Association


                    "SELECT s.*, (g.rep_gap * p.value1) as gap_size_in_byte FROM v$repsender s, v$repgap g,  v$property p "
        isStarted = JDBCUtils.safeGetBoolean(resultSet, "IS_STARTED", "1");
import org.jkiss.utils.CommonUtils;
        long gap = 0;
        @NotNull
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.struct.DBSObjectState;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;

    }

    @Override
        }
import org.jkiss.dbeaver.model.meta.Association;
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
            final JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * from v$repreceiver WHERE rep_name = ?");
        xsn = JDBCUtils.safeGetLong(resultSet, "XSN");
 * DBeaver - Universal Database Manager

    public String getMode() {
    public long getGiveUpXsn() {
    }
        return senderCache.getAllObjects(monitor, this);
                throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;


        return xsn;



    @Property(viewable = true, order = 20)
    }
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
 */
    public Timestamp getRemoteFaultDetectTime() {
import java.sql.Timestamp;
        return remoteConnType;
    @Association
        return remoteAddr;
        return isStarted ? DBSObjectState.ACTIVE : DBSObjectState.NORMAL;
            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getReplicationDDL(monitor, this, options) + ";";

    }
