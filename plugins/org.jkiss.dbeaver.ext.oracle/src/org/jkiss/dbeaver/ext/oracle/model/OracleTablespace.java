    private boolean bigFile;
    @Override
    @Property(editable = true, order = 31)
        }
    private long pctIncrease;
import org.jkiss.dbeaver.DBException;
/**
    ///////////////////////////////////////////////
            return ddlStringHolder;
        this.minExtLen = JDBCUtils.safeGetLong(dbResult, "MIN_EXTLEN");
    }
        @Override
            loadSizes(monitor);
        AUTO
        this.forceLogging = JDBCUtils.safeGetBoolean(dbResult, "FORCE_LOGGING", OracleConstants.RESULT_YES_VALUE);
            }
        return availableSize;
    public static class TablespaceReferenceValidator implements IPropertyCacheValidator<DBSObjectLazy<OracleDataSource>> {
    private boolean defTableCompression;
    {
    }
    public boolean isPluggedIn()
import org.jkiss.dbeaver.model.DBPScriptObject;
    private long minExtents;
    public enum SegmentSpaceManagement {
    public long getMinExtents()

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String ddlStringHolder = null;
        return minExtLen;
    }
        this.logging = CommonUtils.valueOf(Logging.class, JDBCUtils.safeGetString(dbResult, "LOGGING"), null, true);

    public Contents getContents()

    {

        return pluggedIn;
        GUARANTEE,
    {
    @Property(editable = true, order = 37)
        ddlStringHolder = ddl.trim();
        return pctIncrease;
    {
        }

    private boolean forceLogging;
        protected OracleSegment<OracleTablespace> fetchObject(@NotNull JDBCSession session, @NotNull OracleTablespace owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
    }

        ddlStringHolder = null;
        return usedSize;
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
        return status;

                            "DBMS_METADATA.SET_TRANSFORM_PARAM(DBMS_METADATA.SESSION_TRANSFORM,'SQLTERMINATOR',true);\n" +
    private ExtentManagement extentManagement;
    {
                            "end;");
    public Collection<OracleSegment<OracleTablespace>> getSegments(DBRProgressMonitor monitor) throws DBException
    public enum AllocationType {
    private Contents contents;
import org.jkiss.dbeaver.Log;
        NOGUARANTEE,
        }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    }
        SYSTEM,
            if (file.getRelativeNo() == relativeFileNo) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                "(SELECT SUM(S.BYTES) USED_SPACE FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + "DBA_SEGMENTS S WHERE S.TABLESPACE_NAME=?) XS")) {
    public Long getUsedSize(DBRProgressMonitor monitor) throws DBException {
    public long getNextExtent()
    {
        {

        String objectType = "TABLESPACE";
            return
                        fetchSizes(dbResult);

            throw new DBDatabaseException("Can't read tablespace statistics", e, getDataSource());
            return new OracleDataFile(owner, resultSet, owner.getContents() == Contents.TEMPORARY);

        return segmentSpaceManagement;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return usedSize == null ? 0 : usedSize;
        READ_ONLY
    public Long getAvailableSize(DBRProgressMonitor monitor) throws DBException {
    private volatile Long usedSize;
        return initialExtent;
        return fileCache.getAllObjects(monitor, this);
        return forceLogging;
import org.jkiss.utils.CommonUtils;
        if (ddl == null) {
        return logging;
    @Override
        usedSize = dbResult.getLong("USED_SPACE");
    }
        for (OracleDataFile file : fileCache.getAllObjects(monitor, this)) {
    public enum Contents {
        availableSize = dbResult.getLong("AVAILABLE_SPACE");
    private void loadSizes(DBRProgressMonitor monitor) throws DBException {
 *

    }
    {
        UNIFORM,
    @Property(editable = true, order = 35)
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load source code for " + objectType + " '" + objectName + "'")) {
import java.sql.ResultSet;
    }
        this.extentManagement = CommonUtils.valueOf(ExtentManagement.class, JDBCUtils.safeGetString(dbResult, "EXTENT_MANAGEMENT"), null, true);
    public FileCache getFileCache() {
import org.jkiss.dbeaver.model.DBPObjectStatistics;
            }
 * You may obtain a copy of the License at
        {
    @Override
    @Override
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM\n" +
        return this;
    }
    @Property(viewable = true, editable = true, order = 22, formatter = ByteNumberFormat.class)

    @Property(editable = true, order = 38)
        LOGGING,
    }

        super(dataSource, true);
    {
    {
    }
    {
        @Override
        this.bigFile = JDBCUtils.safeGetBoolean(dbResult, "BIGFILE", OracleConstants.RESULT_YES_VALUE);

        {
    }
 * limitations under the License.
    public Logging isLogging()
    }
    }
        @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return blockSize;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
import org.jkiss.dbeaver.model.meta.Association;

    }
        segmentCache.clearCache();
    public enum Logging {
    public long getBlockSize()
    public long getMinExtLen()
                dbStat.setString(2, getName());
    }

        return usedSize != null;
        USER,
        public boolean isPropertyCached(@NotNull DBSObjectLazy<OracleDataSource> object, @NotNull Object propertyId)
    private long minExtLen;
 * Unless required by applicable law or agreed to in writing, software
        return maxExtents;
    public Collection<OracleDataFile> getFiles(DBRProgressMonitor monitor) throws DBException
    @Property(editable = true, order = 25)
    }
                } catch (SQLException e) {
        return null;
    @Property(editable = true, order = 36)
        MANUAL,
    {

        }
import org.jkiss.dbeaver.model.meta.Property;
                    JDBCUtils.executeProcedure(
                try {
    private static final Log log = Log.getLog(OracleTablespace.class);

        return allocationType;
    }

    }
    @Association
                "SELECT * FROM " + OracleUtils.getSysUserViewName(session.getProgressMonitor(), owner.getDataSource(), "SEGMENTS") +
    public boolean hasStatistics() {
    }
                "(SELECT SUM(F.BYTES) AVAILABLE_SPACE FROM " + OracleUtils.getSysSchemaPrefix(getDataSource()) + "DBA_DATA_FILES F WHERE F.TABLESPACE_NAME=?) XDF,\n" +
    }

    private long initialExtent;
    }
    private long nextExtent;
            return dbStat;
        }
        this.retention = CommonUtils.valueOf(Retention.class, JDBCUtils.safeGetString(dbResult, "RETENTION"), null, true);
            final JDBCPreparedStatement dbStat = session.prepareStatement(
    public ExtentManagement getExtentManagement()
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (SQLException e) {
    static class SegmentCache extends JDBCObjectCache<OracleTablespace, OracleSegment<OracleTablespace>> {
            }
            return dbStat;
 * See the License for the specific language governing permissions and

        ONLINE,
        return name;
        this.maxExtents = JDBCUtils.safeGetLong(dbResult, "MAX_EXTENTS");
    @Property(editable = true, order = 32)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(editable = true, order = 33)
        availableSize = null;
    public AllocationType getAllocationType()
    }
    public boolean isForceLogging()
    public boolean isBigFile()

                object.getDataSource().tablespaceCache.isFullyCached() ||

    @NotNull
{
            return OracleUtils.resolveLazyReference(monitor, dataSource, dataSource.tablespaceCache, referrer, propertyId);
        @Override
    @Property(viewable = true, editable = true, order = 1)
    public enum Status {
    public Status getStatus()
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        }
            loadSizes(monitor);

        this.blockSize = JDBCUtils.safeGetLong(dbResult, "BLOCK_SIZE");
        this.allocationType = CommonUtils.valueOf(AllocationType.class, JDBCUtils.safeGetString(dbResult, "ALLOCATION_TYPE"), null, true);
        TEMPORARY,
    @Association
    // Statistics
        this.minExtents = JDBCUtils.safeGetLong(dbResult, "MIN_EXTENTS");
    private final SegmentCache segmentCache = new SegmentCache();

    public OracleDataFile getFile(DBRProgressMonitor monitor, long relativeFileNo) throws DBException
    }
        getDataSource().resetStatistics();

    private SegmentSpaceManagement segmentSpaceManagement;
            true);
    @NotNull
    private final FileCache fileCache = new FileCache();
 * Oracle tablespace
    {
        this.initialExtent = JDBCUtils.safeGetLong(dbResult, "INITIAL_EXTENT");
    public long getMaxExtents()
    @Property(editable = true, order = 30)
    {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        NOT_APPLY
    }

    }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleTablespace owner) throws SQLException
    @Property(editable = true, order = 26)
}
 *

        String objectName = getName();
                    log.error("Can't apply DDL transform parameters", e);
                }
        }
        String ddl = null;
    }
                    (owner.getContents() == Contents.TEMPORARY ? "TEMP" : "DATA") +
            JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS),
    @Property(viewable = true, order = 5, formatter = ByteNumberFormat.class)
    }
    public boolean isDefTableCompression()
            ddl = OracleUtils.fetchDDL(session, objectType, objectName);
    private String name;

        }
        if (availableSize == null) {
    }
    {
    }
    }
    {

    {
    private long blockSize;
        } catch (SQLException e) {
        this.status = CommonUtils.valueOf(
                object.getLazyReference(propertyId) == null ||


    }
        this.name = JDBCUtils.safeGetString(dbResult, "TABLESPACE_NAME");
    public enum Retention {
    public enum ExtentManagement {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @Override
import org.jkiss.dbeaver.DBDatabaseException;
        NOLOGGING,

    @Override
    static class FileCache extends JDBCObjectCache<OracleTablespace, OracleDataFile> {
/*
                object.getLazyReference(propertyId) instanceof OracleTablespace ||
import org.jkiss.dbeaver.model.struct.DBSObject;
        fileCache.clearCache();
            return referrer.getLazyReference(propertyId);
        return defTableCompression;
    {
    }
        return bigFile;

        return ddlStringHolder;

 */

        final OracleDataSource dataSource = referrer.getDataSource();
        protected OracleDataFile fetchObject(@NotNull JDBCSession session, @NotNull OracleTablespace owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException

        {
    private Logging logging;
                        "begin\n" +

                " WHERE TABLESPACE_NAME=? ORDER BY SEGMENT_NAME");
        @NotNull

        this.segmentSpaceManagement = CommonUtils.valueOf(SegmentSpaceManagement.class, JDBCUtils.safeGetString(dbResult, "SEGMENT_SPACE_MANAGEMENT"), null, true);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return contents;
                    "_FILES WHERE TABLESPACE_NAME=? ORDER BY FILE_NAME");
    static Object resolveTablespaceReference(DBRProgressMonitor monitor, DBSObjectLazy<OracleDataSource> referrer, @Nullable Object propertyId) throws DBException
        this.defTableCompression = "ENABLED".equals(JDBCUtils.safeGetString(dbResult, "DEF_TAB_COMPRESSION"));
    public long getStatObjectSize() {
        if (ddlStringHolder != null) {
    {
        return extentManagement;
        return retention;
    void fetchSizes(JDBCResultSet dbResult) throws SQLException {
    @Property(editable = true, order = 39)
        DICTIONARY,
    @Property(viewable = true, editable = true, order = 29)
            ddl = "-- EMPTY DDL";
        @Override
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleTablespace owner) throws SQLException
            log.error("Can't fetch DDL for " + objectType + ":" + objectName, e);
 * you may not use this file except in compliance with the License.
            return new OracleSegment<>(session.getProgressMonitor(), owner, resultSet);
            dbStat.setString(1, owner.getName());
 * Copyright (C) 2010-2026 DBeaver Corp and others
                dbStat.setString(1, getName());

        }
                    if (dbResult.next()) {
import org.jkiss.dbeaver.model.DBUtils;

        return fileCache;
            Status.class,
    {
    @Property(editable = true, order = 23)

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        return minExtents;
    public Retention getRetention()

        }
 *
    @Property(editable = true, order = 24)
 */
    private AllocationType allocationType;
        this.pluggedIn = JDBCUtils.safeGetBoolean(dbResult, "PLUGGED_IN", OracleConstants.RESULT_YES_VALUE);
    }
            dbStat.setString(1, owner.getName());

        OFFLINE,
import org.jkiss.code.Nullable;
    }
    @Property(editable = true, order = 34)
    }
    @Property(editable = true, order = 27)


import java.sql.SQLException;


                    }
    }
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
    private boolean pluggedIn;
    }
    @Property(viewable = true, order = 4, formatter = ByteNumberFormat.class)
        this.pctIncrease = JDBCUtils.safeGetLong(dbResult, "PCT_INCREASE");
    protected OracleTablespace(OracleDataSource dataSource, ResultSet dbResult)
package org.jkiss.dbeaver.ext.oracle.model;
                return file;
        LOCAL
        }
        return nextExtent;
    private Retention retention;
    @Property(editable = true, order = 28)
 * DBeaver - Universal Database Manager
    public long getInitialExtent()
                "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(owner.getDataSource()) + "DBA_" +
        this.contents = CommonUtils.valueOf(Contents.class, JDBCUtils.safeGetString(dbResult, "CONTENTS"), null, true);
        }
import java.util.Collection;
    private volatile Long availableSize;
    public String getName()
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load tablespace '" + getName() + "' statistics")) {
        usedSize = null;
        if (!dataSource.isAdmin()) {
    public long getPctIncrease()
        }
    }

    {
import java.util.Map;
    {
                }
    public SegmentSpaceManagement getSegmentSpaceManagement()
    private long maxExtents;
        {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        this.nextExtent = JDBCUtils.safeGetLong(dbResult, "NEXT_EXTENT");
        PERMANENT,
            if (this.getDataSource().isAtLeastV9()) {
        if (usedSize == null) {
    {



    {
import org.jkiss.utils.ByteNumberFormat;
import org.jkiss.code.NotNull;
    {
    }
        return segmentCache.getAllObjects(monitor, this);
    }
            Status.OFFLINE,
    }
public class OracleTablespace extends OracleGlobalObject implements DBPRefreshableObject, DBPObjectStatistics, DBPScriptObject
    {
        } else {
                        session,
    private Status status;

        UNDO
                !object.getDataSource().isAdmin();
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
