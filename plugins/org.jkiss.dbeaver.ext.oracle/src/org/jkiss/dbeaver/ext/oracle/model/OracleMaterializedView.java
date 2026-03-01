            return;
/**
                        additionalInfo.staleness = JDBCUtils.safeGetString(dbResult, "STALENESS");
import java.util.Collection;
 * You may obtain a copy of the License at
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException {

    {
package org.jkiss.dbeaver.ext.oracle.model;
            }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
 */
        this.query = source;
        @Property(viewable = false, order = 22)
    private String query;
            return rewriteEnabled;

        }
        synchronized (additionalInfo) {
                        additionalInfo.container = JDBCUtils.safeGetString(dbResult, "CONTAINER_NAME");
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException


        public boolean isRewriteEnabled()
            return refreshMethod;
            additionalInfo.loaded = true;

        @Property(viewable = false, order = 21)

    public String getMViewText() {
public class OracleMaterializedView extends OracleTableBase implements OracleSourceObject, DBSObjectLazy<OracleDataSource>
}
        public String getBuildMode()

                    query = OracleUtils.getDDL(monitor, getTableTypeName(), this, newFormat, options);
import org.jkiss.dbeaver.model.meta.Property;
            } catch (DBException e) {
            newFormat = (OracleDDLFormat) options.get(OracleConstants.PREF_KEY_DDL_FORMAT);
        if (isFormatInOptions) {
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        {
                        additionalInfo.lastRefreshDate = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REFRESH_DATE");
 * Oracle materialized view
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)
import java.sql.ResultSet;
                dbStat.setString(2, getName());
    public OracleMaterializedView(OracleSchema schema, String name)
    @NotNull
    public TableAdditionalInfo getAdditionalInfo() {
            if (!additionalInfo.loaded && monitor != null) {
    {
        public String getRefreshMethod()
        ResultSet dbResult)
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

                    query = OracleUtils.getDDL(monitor, getTableTypeName(), this, currentDDLFormat, options);
    {
    @Override
                    if (dbResult.next()) {
            return additionalInfo;
    public Collection<OracleTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.Log;
    public OracleTableIndex getIndex(DBRProgressMonitor monitor, String name) throws DBException {
        {
        this.valid = OracleUtils.getObjectStatus(monitor, this, OracleObjectType.MATERIALIZED_VIEW);


        this.currentDDLFormat = currentDDLFormat;
    public static class AdditionalInfo extends TableAdditionalInfo {
import org.jkiss.dbeaver.model.meta.LazyProperty;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
        return additionalInfo.container;

    {
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.DBException;
        return this.getContainer().indexCache.getObjects(monitor, getContainer(), this);
        public String getRewriteCapability()
        public Date getLastRefreshDate()
    @Override
                        additionalInfo.rewriteEnabled = JDBCUtils.safeGetBoolean(
            }

            return buildMode;
            "SELECT COMMENTS FROM ALL_MVIEW_COMMENTS WHERE OWNER=? AND MVIEW_NAME=?",
            return lastRefreshType;
        {
    }
            return rewriteCapability;

                    message = message.replace("*/", "* /");
                dbStat.setString(1, getSchema().getName());
    }
        }
    }
                "Compile materialized view",
        }
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
    {
        @Property(viewable = false, order = 16)
    }
                        additionalInfo.fastRefreshable = JDBCUtils.safeGetString(dbResult, "FAST_REFRESHABLE");
                log.warn("Error getting view definition from system package", e);
        return new DBEPersistAction[] {

                }
                        additionalInfo.mviewValid = OracleConstants.RESULT_STATUS_VALID.equals(
            return updatable;
        {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * See the License for the specific language governing permissions and
        private boolean mviewValid;
    public Object getLazyReference(Object propertyId)
        public String getLastRefreshType()
        private boolean updatable;
        private String fastRefreshable;
        private String buildMode;
        if (query == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return staleness;

        if (!isPersisted()) {
                    additionalInfo.loaded = true;
        private String staleness;
            } catch (SQLException e) {
import org.jkiss.utils.CommonUtils;
        }
    }
        @Property(viewable = false, order = 19)
        }
    }
        private String rewriteCapability;
                if (query == null || !isFormatInOptions) {
    @Association
        @Property(viewable = false, order = 17)
        {
        }
    public void setCurrentDDLFormat(OracleDDLFormat currentDDLFormat) {
        return this.getContainer().indexCache.getObject(monitor, getContainer(), this, name);
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
        return query;
        return getAdditionalInfo(monitor).container;
            getSchema().getName(),

        @Property(viewable = false, order = 18)
    @Override
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
    }
            try {
        OracleDDLFormat newFormat = OracleDDLFormat.FULL;
    @Override

                if (message != null) {
        public String getStaleness()
    @PropertyGroup()
    protected String getTableTypeName() {
        private Date lastRefreshDate;
        {

 */
    }
        private volatile boolean loaded = false;
import java.util.Date;

 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    public OracleMaterializedView(
    {
        super(schema, name, false);
{
            }

        private String lastRefreshType;
import java.sql.SQLException;
import java.util.Map;

    @Override
                "SELECT * FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), getDataSource(), "MVIEWS") + " WHERE OWNER=? AND MVIEW_NAME=?")) {
            return refreshMode;
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor)
        }
import org.jkiss.dbeaver.model.meta.Association;
                }

    public void setObjectDefinitionText(String source)
                            dbResult, "REWRITE_ENABLED",

    @Override
    }
            currentDDLFormat = OracleDDLFormat.getCurrentFormat(getDataSource());
        return "MATERIALIZED_VIEW";
    }

                            OracleConstants.RESULT_YES_VALUE);
        private boolean rewriteEnabled;
                        additionalInfo.updatable = JDBCUtils.safeGetBoolean(
        return JDBCUtils.queryString(
        {

    }
        return getContainer().tableCache.refreshObject(monitor, getContainer(), this);
 * Unless required by applicable law or agreed to in writing, software
                            OracleConstants.RESULT_YES_VALUE);
    {
        private Object container;
    {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        additionalInfo.refreshMode = JDBCUtils.safeGetString(dbResult, "REFRESH_MODE");
    @Override
        return additionalInfo;

            getName());

                            dbResult, "UPDATABLE",
            return fastRefreshable;
        }
    }
            )};
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
        public boolean isUpdatable()
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    public DBSObjectState getObjectState()
/*
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
                String message = e.getMessage();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    currentDDLFormat = newFormat;
import org.jkiss.code.Nullable;
                query = "/*\nError generating materialized view DDL:\n" + message + "\n*/";
                loadAdditionalInfo(monitor);
        @Property(viewable = false, order = 15)
                            JDBCUtils.safeGetString(dbResult, "COMPILE_STATE"));
        }
                }
                "ALTER MATERIALIZED VIEW " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
        {


                        additionalInfo.buildMode = JDBCUtils.safeGetString(dbResult, "BUILD_MODE");
    private static final Log log = Log.getLog(OracleMaterializedView.class);


            return lastRefreshDate;
        private String refreshMethod;
        private boolean valid;
 * DBeaver - Universal Database Manager
        private String refreshMode;
        }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        @Property(viewable = false, order = 23)
    {
    @Association
        }
    }
    }
import org.jkiss.code.NotNull;
        }
                        additionalInfo.rewriteCapability = JDBCUtils.safeGetString(dbResult, "REWRITE_CAPABILITY");
        getContainer().constraintCache.clearObjectCache(this);
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
import org.jkiss.dbeaver.model.exec.DBCException;
    public Object getContainer(DBRProgressMonitor monitor) throws DBException
        }

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
    @Property(viewable = true, order = 10)
    }
 * limitations under the License.
    {
        OracleSchema schema,
            new OracleObjectPersistAction(
    }
                throw new DBCException(e, session.getExecutionContext());
        getContainer().indexCache.clearObjectCache(this);
        {
        return OracleSourceType.MATERIALIZED_VIEW;
 *
    @NotNull
    }


        public String getFastRefreshable()
    public OracleSourceType getSourceType()

    private OracleDDLFormat currentDDLFormat;

 *
        public String getRefreshMode()
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            session,
    {
        @Property(viewable = false, order = 20)
    @Override
 * you may not use this file except in compliance with the License.
        return true;
                    }
    }
    protected String queryTableComment(JDBCSession session) throws SQLException {
                        additionalInfo.lastRefreshType = JDBCUtils.safeGetString(dbResult, "LAST_REFRESH_TYPE");
        @Property(viewable = false, order = 14)
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                } else {

 *
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (query == null || currentDDLFormat != newFormat && isPersisted()) {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
                        additionalInfo.refreshMethod = JDBCUtils.safeGetString(dbResult, "REFRESH_METHOD");
        }
        }
        super(schema, dbResult);
                OracleObjectType.MATERIALIZED_VIEW,
    @Override
    }
    @Override
        return query;
        boolean isFormatInOptions = !CommonUtils.isEmpty(options) && options.containsKey(OracleConstants.PREF_KEY_DDL_FORMAT);
import org.jkiss.dbeaver.model.meta.PropertyGroup;
    public boolean isView() {
    @Nullable
