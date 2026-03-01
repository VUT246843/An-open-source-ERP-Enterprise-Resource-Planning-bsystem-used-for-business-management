import org.jkiss.dbeaver.model.struct.DBSObject;

    public PostgreTrigger getTrigger(DBRProgressMonitor monitor, String name)

    }
                diskSpace = -1L;
    }
 * You may obtain a copy of the License at
    }
{

            // Query disk size
import org.jkiss.utils.CommonUtils;
    @Association
            if (diskSpace == null) {

            // Re-read statistics on the next try
    public boolean isRefreshSchemaStatisticsOnTableRefresh () {
        super(container, dbResult);
                readTableStatistics((JDBCSession) session);
    public boolean hasStatistics() {
        throws DBException
            return;
                if (dbResult.next()) {
    public long getRowCountEstimate() {
    public TriggerCache getTriggerCache() {

        }
                "\nLEFT OUTER JOIN pg_catalog.pg_description d ON d.objoid=x.oid AND d.objsubid=0 " +
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 25, formatter = ByteNumberFormat.class)
    }
    {
            // Do not count rows for views
        @Override
            String statement = "SELECT x.oid,x.*,p.pronamespace as func_schema_id,d.description" +

        if (!isPersisted()) {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreTableReal owner)
    class TriggerCache extends JDBCObjectLookupCache<PostgreTableReal, PostgreTrigger> {
                return null;

            } catch (Exception e) {

    }
    private void readTableStats(DBRProgressMonitor monitor) {
            if (CommonUtils.isEmpty(name)) {
import java.sql.SQLException;
 *
        }
            throws SQLException, DBException
    @Association
            }
        this.tableRelSize = 0;

    protected transient volatile Long rowCount;
    }
 * you may not use this file except in compliance with the License.
import java.util.List;
    public DBSObjectType getObjectType() {


        }
            this.diskSpace = null;
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read row count")) {
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    protected void readTableStatistics(@NotNull JDBCSession session) throws DBException, SQLException {
    {
        try {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.meta.Association;


public abstract class PostgreTableReal extends PostgreTableBase implements DBPObjectStatistics
            String name = JDBCUtils.safeGetString(dbResult, "tgname");
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
        throws DBException
        @NotNull
        } finally {
                prepareStatement.setString(2, object != null ? object.getName() : objectName);
    @Nullable
    @Override
        } catch (DBException e) {
    public void setObjectDefinitionText(String sourceText) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        @Override
            dbStat.setLong(1, getObjectId());
        }

 *
        // Query row count
            throws SQLException, DBException
    public PostgreTableReal(DBRProgressMonitor monitor, PostgreTableContainer container, PostgreTableReal source, boolean persisted) throws DBException {

    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 24, formatter = ByteNumberFormat.class)
    protected long rowCountEstimate;
        throw new DBException("Table DDL is read-only");
        if (!isPersisted() || this instanceof PostgreView || !getDataSource().isServerVersionAtLeast(8, 1)) {
        {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        readTableStats(monitor);
    public long getStatObjectSize() {

            PostgreTableConstraint constr = new PostgreTableConstraint(monitor, this, srcConstr);
    }
    public long getRelationSize(DBRProgressMonitor monitor) {
        {
    // Copy constructor
        }
    @Nullable

    }
        this.rowCount = null;
        return getSchema().getConstraintCache().getObject(monitor, getSchema(), this, ukName);
                    "FROM pg_rewrite r\n" +
    }
        }
        }
            return;
        return true;
        return ruleCache != null ? ruleCache.getAllObjects(monitor, this) : Collections.emptyList();
import org.jkiss.dbeaver.model.meta.Property;
        {
                    fetchStatistics(dbResult);

        @NotNull
        PostgreTableContainer container,
                (getDataSource().isServerVersionAtLeast(9, 0) ? " AND NOT x.tgisinternal" : "");
    {
 * limitations under the License.

                    "pg_catalog.pg_total_relation_size(?) as total_rel_size," +
}

        }
    protected transient volatile Long diskSpace;
    public Collection<PostgreRule> getRules(DBRProgressMonitor monitor)
                "\nFROM pg_catalog.pg_trigger x" +
        super(monitor, container, source, persisted);
        @Override
        return tableRelSize;
                "SELECT r.oid,r.*, pg_get_ruledef(r.oid) AS definition\n" +
            return rowCount;
    protected PostgreTableReal(PostgreTableContainer container)
        tableRelSize = dbResult.getLong("rel_size");
    {
        return super.refreshObject(monitor);
    public Collection<PostgreTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        }
    @Override
        {
            getSchema().getConstraintCache().cacheObject(constr);
            throws SQLException
    }

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
        return diskSpace == null ? 0 : diskSpace;
 */

    }
    @Override
        }
import org.jkiss.dbeaver.model.DBPObjectStatistics;
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
package org.jkiss.dbeaver.ext.postgresql.model;
            return;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        throws DBException
import java.sql.ResultSet;
 * Unless required by applicable law or agreed to in writing, software
    }
            prepareStatement.setLong(1, owner.getObjectId());
                    "pg_catalog.pg_relation_size(?) as rel_size"))
            return new PostgreRule(session.getProgressMonitor(), owner, dbResult);
        }
            log.debug("Can't fetch row count", e);
                    "WHERE r.ev_class=" + owner.getObjectId() + " AND r.rulename <> '_RETURN'::name");
        }
    public List<PostgreTrigger> getTriggers(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return triggerCache != null ? triggerCache.getObject(monitor, this, name) : null;
        if (!getDataSource().getServerType().supportsRelationSizeCalc()) {
            return session.prepareStatement(
import org.jkiss.dbeaver.model.DBConstants;
        return getSchema().getConstraintCache().getTypedObjects(monitor, getSchema(), this, PostgreTableConstraint.class);
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull PostgreTableReal owner, @Nullable PostgreTrigger object, @Nullable String objectName) throws SQLException {
    {
        }
        ResultSet dbResult)
import java.util.Collections;
    public Long getRowCount(DBRProgressMonitor monitor)
            "select " +
        if (!getDataSource().getServerType().supportsTableStatistics()) {
    private static final Log log = Log.getLog(PostgreTableReal.class);
 * PostgreTable base
    }
    protected PostgreTableReal(
            dbStat.setLong(2, getObjectId());
            }
    }
                log.debug("Can't fetch disk space", e);
    public PostgreTableConstraintBase getConstraint(@NotNull DBRProgressMonitor monitor, String ukName)
    @Nullable
    private final RuleCache ruleCache = getDataSource().getServerType().supportsRules() ? new RuleCache() : null;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, expensive = true, order = 23)
            rowCount = -1L;
    }
            rowCount = countData(new AbstractExecutionSource(this, session.getExecutionContext(), this), session, null, DBSDataContainer.FLAG_NONE);


    }
    {
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
    public Long getDiskSpace(DBRProgressMonitor monitor)
        throws DBException
                }
            getSchema().resetStatistics();
        super(container);
            return null;
        this.rowCountEstimate = JDBCUtils.safeGetLong(dbResult, "reltuples");
 */
                "\nWHERE x.tgrelid = ?" +
    @Override
        return diskSpace;
    }
            return;
        return rowCount;
    }
        return diskSpace != null;
            }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
            JDBCPreparedStatement prepareStatement = session.prepareStatement(statement);

    @NotNull

    class RuleCache extends JDBCObjectCache<PostgreTableReal, PostgreRule> {
        }

            try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Calculate relation size on disk")) {
/*
import org.jkiss.dbeaver.DBException;
    private final TriggerCache triggerCache = getDataSource().getServerType().supportsTriggers() ? new TriggerCache() : null;
import org.jkiss.utils.ByteNumberFormat;

 * DBeaver - Universal Database Manager
            return prepareStatement;
        if (rowCount == null) {

        }

            }
    }
            // Do not count rows for views
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
        return triggerCache != null ? triggerCache.getAllObjects(monitor, this) : List.of();
        if (this.diskSpace != null && isRefreshSchemaStatisticsOnTableRefresh()) {

        readTableStats(monitor);
    {

import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import java.util.Collection;
        protected PostgreRule fetchObject(@NotNull JDBCSession session, @NotNull PostgreTableReal owner, @NotNull JDBCResultSet dbResult)
        return triggerCache;
        protected PostgreTrigger fetchObject(@NotNull JDBCSession session, @NotNull PostgreTableReal owner, @NotNull JDBCResultSet dbResult)
        if (diskSpace != null || !getDataSource().getServerType().supportsTableStatistics()) {
    }
    @Property(category = DBConstants.CAT_STATISTICS, viewable = true, order = 22)
    }
    }
    {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

    protected void fetchStatistics(JDBCResultSet dbResult) throws DBException, SQLException {
 *     http://www.apache.org/licenses/LICENSE-2.0
        diskSpace = dbResult.getLong("total_rel_size");

                "\nLEFT OUTER JOIN pg_catalog.pg_proc p ON p.oid=x.tgfoid " +
        }
            }
import org.jkiss.code.Nullable;
        if (rowCount != null) {
 *
        return rowCountEstimate;
import org.jkiss.dbeaver.model.DBUtils;
            return new PostgreTrigger(session.getProgressMonitor(), owner, name, dbResult);
 * distributed under the License is distributed on an "AS IS" BASIS,

/**

    }

        for (PostgreTableConstraint srcConstr : CommonUtils.safeCollection(source.getConstraints(monitor))) {

        return RelationalObjectType.TYPE_TABLE;
            if (object != null || CommonUtils.isNotEmpty(objectName)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected transient volatile long tableRelSize;
 * See the License for the specific language governing permissions and
                (object != null || CommonUtils.isNotEmpty(objectName) ? "\nAND x.tgname = ?" : "") +
        @Override
