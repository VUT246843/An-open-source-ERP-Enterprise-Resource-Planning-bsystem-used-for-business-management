        return getContainer().tableCache.getChildren(monitor, getContainer(), this);
            } else {
        return super.getContainer();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                    NULL AS HIERARCHY,
        //this.comment = JDBCUtils.safeGetString(dbResult, "COMMENTS");

                WHERE p.%s = ? AND p.TABLE_NAME = ?
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
/**
            final String tabView = hasDBA ? "DBA_TAB_PRIVS" : "ALL_TAB_PRIVS";
        throws DBException
        protected OraclePrivTable fetchObject(
            final String ownerColTab = hasDBA ? "OWNER" : "TABLE_SCHEMA";
    }
    @Override
    @Override
import org.jkiss.dbeaver.Log;
                    p.%s,
                return new OraclePrivTable(tableBase, resultSet);
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
        );
}
            for (OracleTableColumn col : CommonUtils.safeCollection(getAttributes(monitor))) {
        setName(name);
    }

import org.jkiss.code.Nullable;
    {
    @Override
    @Nullable
        return null;
            OracleTableBase refTable = refSchema.tableCache.getObject(monitor, refSchema, tableName);
                FROM %s p
                    p.TABLE_NAME,
        return comment;
        super(oracleSchema, true);
    public OracleTableConstraint getConstraint(DBRProgressMonitor monitor, String ukName)
    public void setComment(String comment)
        } catch (Exception e) {
                    p.COLUMN_NAME,

    @Override
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Date getCreated() {
                                log.warn("Column '" + colName + "' not found in table '" + getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            @NotNull JDBCResultSet resultSet) throws SQLException, DBException {

                    ownerColTab, commonTabExpr, typeTabExpr, tabView, ownerColTab,
    }
        @NotNull
        }
                    %s AS COMMON,
            }

    {

                "WHERE OWNER=? AND TABLE_NAME=? AND TABLE_TYPE=?",
        }
    @Override
        return getContainer().constraintCache.getObjects(monitor, getContainer(), this);
                    p.GRANTOR,
import java.util.*;
                    log.error("Can't fetch table '" + getName() + "' comment", e);
        visibleIf = OracleTableNotPartitionPropertyValidator.class)
        {
                            String colName = resultSet.getString(1);
    }
    public static class TableAdditionalInfo {
    }
                    p.PRIVILEGE,
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.INDEX, OracleTableIndex.class),
        if (refSchema == null) {
    }
    private Date lastDDLTime;

    public OracleTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
    {
            final String commonTabExpr = hasDBA ? "p.COMMON" : "CAST(NULL AS VARCHAR2(3))";
    {
                || object.getDataSource().dataTypeCache.isFullyCached();
            dbStat.setString(3, tableBase.getSchema().getName());


    {
        throws DBException
        this.created = JDBCUtils.safeGetTimestamp(dbResult, OracleConstants.COLUMN_CREATED);
        getContainer().tableTriggerCache.clearObjectCache(this);
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100,
        return getContainer().tableCache.refreshObject(monitor, getContainer(), this);
        return created;
    @Nullable
    @Override

    @Override
        }
import java.sql.SQLException;

                log.warn("Referenced table '" + tableName + "' not found in schema '" + ownerName + "'");
    {
    public OracleSchema getSchema()
    {
            dbStat.setString(4, tableBase.getName());
                            OracleTableColumn col = getAttribute(monitor, colName);
    public List<OracleTableTrigger> getTriggers(@NotNull DBRProgressMonitor monitor)
    {
    {

    }
        }

            log.warn("Referenced schema '" + ownerName + "' not found");
                    p.GRANTEE,
    }

    }
    @Override
    }

        try {
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table comments")) {
    }
        return getComment(monitor);
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
        return OracleUtils.getDDL(monitor, getTableTypeName(), this, ddlFormat, options);
 * distributed under the License is distributed on an "AS IS" BASIS,
            getSchema().getName(),
    @Association
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
    public String getDescription()

    public String getDDL(DBRProgressMonitor monitor, OracleDDLFormat ddlFormat, Map<String, Object> options)

    }
 * OracleTable base
 * Copyright (C) 2010-2025 DBeaver Corp and others

    }
                    %s AS TYPE
    @Override
        volatile boolean loaded = false;
                    try (JDBCResultSet resultSet = stat.executeQuery()) {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        return getContainer().constraintCache.getObject(monitor, getContainer(), this, ukName);
        return null;
    {
                    %s AS TYPE
    public DBSTableForeignKey getForeignKey(DBRProgressMonitor monitor, String ukName) throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

    public Collection<OracleTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
        protected JDBCStatement prepareObjectsStatement(
    }
        this.valid = OracleConstants.RESULT_STATUS_VALID.equals(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS));
                    stat.setString(1, getSchema().getName());

    {
        this.valid = true;
    public Date getLastDDLTime() {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    public List<OracleTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
            final String commonColExpr = hasDBA ? "p.COMMON" : "CAST(NULL AS VARCHAR2(3))";
            dbStat.setString(1, tableBase.getSchema().getName());
        throws DBException
    {
    @Override
    {
    }
        return comment;
    }
    @NotNull
    {
    @Association
        return lastDDLTime;
                """.formatted(
            dbStat.setString(2, tableBase.getName());
            return dbStat;
        @Override
                    p.TABLE_NAME,

    }

    private Date created;
            if (isPersisted() && !DBWorkbench.getPlatform().isUnitTestMode()) {
    public Collection<OraclePrivTable> getTablePrivs(DBRProgressMonitor monitor) throws DBException
            comment = "";
                        }
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table column comments")) {
                }
                return new OraclePrivTableColumn(tableBase, resultSet);
        throws DBException
import org.jkiss.dbeaver.DBException;
            final boolean hasDBA = tableBase.getDataSource()
    }
                        comment = "";

                FROM %s p
        public boolean isPropertyCached(@NotNull OracleTableBase object, @NotNull Object propertyId)
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.PRIMARY_KEY, OracleTableConstraint.class),
        } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        setName(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_NAME));
    public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException
    @Property(viewable = true, order = 14, visibleIf = OracleTableNotPartitionPropertyValidator.class)
            final String typeColExpr   = "CAST('COLUMN' AS VARCHAR2(10))";
    @Property(viewable = true, order = 13, visibleIf = OracleTableNotPartitionPropertyValidator.class)
    public List<DBSEntityConstraintInfo> getSupportedConstraints() {
import java.sql.ResultSet;
    private final TablePrivCache tablePrivCache = new TablePrivCache();
    @Nullable
        super(schema, name, persisted);
                    OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), (OracleDataSource) session.getDataSource(), "COL_COMMENTS") + " cc " +
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
    }

import org.jkiss.code.NotNull;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.*;
        @Override
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
            @NotNull OracleTableBase tableBase,
                    p.GRANTEE,
            DBSEntityConstraintInfo.of(DBSEntityConstraintType.CHECK, OracleTableConstraint.class)
        return getComment();
                    }
                        while (resultSet.next()) {


    {

    {
    public Collection<OracleTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor)
        return Collections.emptyList();
                UNION ALL
    public Collection<OracleTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException
            log.warn("Error fetching table '" + getName() + "' column comments", e);
    {
    }

    public Collection<OracleDependencyGroup> getDependencies(DBRProgressMonitor monitor) {
        this.comment = comment;
            }
    }
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        getContainer().constraintCache.clearObjectCache(this);
                            }
    }
    }
                    "WHERE CC.OWNER=? AND cc.TABLE_NAME=?"))
                col.cacheComment();
{
    @Nullable
    {
    {
import org.jkiss.utils.CommonUtils;
            getTableTypeName());
 * You may obtain a copy of the License at
        final DBSObjectCache<OracleTableBase, OracleTableColumn> childrenCache = getContainer().getTableCache().getChildrenCache(this);
            @NotNull JDBCSession session,
/*


                    p.GRANTOR,
 * Licensed under the Apache License, Version 2.0 (the "License");
        return getSchema().tableTriggerCache.getObjects(monitor, getSchema(), this);
        return OracleDependencyGroup.of(this);
            final JDBCPreparedStatement dbStat = session.prepareStatement("""
            String type = JDBCUtils.safeGetString(resultSet, "TYPE");
    {
                    p.GRANTABLE,
                    p.PRIVILEGE,
import org.jkiss.dbeaver.ext.oracle.model.source.OracleStatefulObject;
 */

                    comment = queryTableComment(session);

        OracleSchema refSchema = dataSource.getSchema(monitor, ownerName);

        public boolean isPropertyCached(@NotNull OracleTableBase object, @NotNull Object propertyId) {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                .isViewAvailable(session.getProgressMonitor(), OracleConstants.SCHEMA_SYS, OracleConstants.VIEW_DBA_TAB_PRIVS);
    }
        return getContainer().tableCache;
            final String colView = hasDBA ? "DBA_COL_PRIVS" : "ALL_COL_PRIVS";
    void loadColumnComments(DBRProgressMonitor monitor) {

        boolean isLoaded() { return loaded; }

    }

            DBSEntityConstraintInfo.of(DBSEntityConstraintType.UNIQUE_KEY, OracleTableConstraint.class),
                            } else {
            );
    @Override
    public String getDescription(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.struct.*;
                    %s AS COMMON,

                    }
 *
        super(oracleSchema, true);
    @Override
            this);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            return refTable;
    public String getName()
            final String typeTabExpr   = hasDBA ? "p.TYPE"   : "CAST('TABLE' AS VARCHAR2(10))";
            session,
    protected boolean valid;
    protected OracleTableBase(OracleSchema schema, String name, boolean persisted)
                {
            return childrenCache.getCachedObjects();
            }

import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
                    ownerColTab, commonColExpr, typeColExpr, colView, ownerColTab)
    }
    protected String queryTableComment(JDBCSession session) throws SQLException {
                    stat.setString(2, getName());
    private static final Log log = Log.getLog(OracleTableBase.class);
            }
                            if (col == null) {
        return tablePrivCache.getAllObjects(monitor, this);
    @Association
                    NULL AS COLUMN_NAME,
        return getContainer().tableCache.getChild(monitor, getContainer(), this, attributeName);
    }
    public String getComment(DBRProgressMonitor monitor) {
        return null;
    public String getComment()
    }
    public abstract TableAdditionalInfo getAdditionalInfo();
    public static OracleTableBase findTable(DBRProgressMonitor monitor, OracleDataSource dataSource, String ownerName, String tableName) throws DBException
        return JDBCUtils.queryString(
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;



    protected abstract String getTableTypeName();
    public List<? extends OracleTableColumn> getCachedAttributes()
            getContainer(),
        return List.of(
 *
    @NotNull
                SELECT
        return super.getName();
                try (JDBCPreparedStatement stat = session.prepareStatement("SELECT COLUMN_NAME,COMMENTS FROM " +
    {
package org.jkiss.dbeaver.ext.oracle.model;
    @Association
            @NotNull OracleTableBase tableBase) throws SQLException {
    protected OracleTableBase(OracleSchema oracleSchema, ResultSet dbResult)
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<OracleTableBase> {

    public JDBCStructCache<OracleSchema, ? extends JDBCTable, ? extends JDBCTableColumn> getCache()
            if (refTable == null) {

        return DBUtils.getFullQualifiedName(getDataSource(),
        throws DBException

    @NotNull
                    if (comment == null) {
    }
        // Table partition
    public static class CommentsValidator implements IPropertyCacheValidator<OracleTableBase> {
            "SELECT COMMENTS FROM " + OracleUtils.getAdminAllViewPrefix(session.getProgressMonitor(), (OracleDataSource) session.getDataSource(), "TAB_COMMENTS") + " " +
 *
    @NotNull
                WHERE p.%s = ? AND p.TABLE_NAME = ?
        }
        return DBUtils.findObject(getAssociations(monitor), ukName);

    }
                            String colComment = resultSet.getString(2);
        if (comment == null) {
    }
    }

                SELECT
    public DBSObjectState getObjectState()
        throws DBException
            return object.getAdditionalInfo().isLoaded() // for isLazy() check when property already loaded in the cache returns true
            }
        @Override
    }
            @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.meta.*;
    @Override
        this.lastDDLTime = JDBCUtils.safeGetTimestamp(dbResult, OracleConstants.COLUMN_LAST_DDL_TIME);
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
                    p.HIERARCHY,
    {
            return object.comment != null;
        }
    static class TablePrivCache extends JDBCObjectCache<OracleTableBase, OraclePrivTable> {
    {
                                col.setComment(CommonUtils.notEmpty(colComment));
        if (childrenCache != null) {
        }
                }
                } catch (Exception e) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
            getName(),
 * limitations under the License.
        @Override
public abstract class OracleTableBase extends JDBCTable<OracleDataSource, OracleSchema>

                    p.GRANTABLE,
        }
 * Unless required by applicable law or agreed to in writing, software
    @Association
    @Override
            return null;
    protected OracleTableBase(@NotNull OracleSchema oracleSchema, @NotNull String name) {
 */
                    p.%s,

    implements DBPNamedObject2, DBPRefreshableObject, OracleStatefulObject, DBPObjectWithLazyDescription, DBSEntityConstrainable

    @LazyProperty(cacheValidator = CommentsValidator.class)
            if (OraclePrivTableColumn.COLUMN_TYPE.equals(type)) {
    @NotNull

    private String comment;
