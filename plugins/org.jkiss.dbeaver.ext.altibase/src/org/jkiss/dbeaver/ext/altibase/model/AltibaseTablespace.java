        public static TbsType getTbsTypeByIdx(int stateIdx) {
        return String.valueOf(pageSizeInBytes);
        DISK_USER_TEMP(6),
        TbsType(int stateIdx) {
    @Property(viewable = true, order = 8, formatter = ByteNumberFormat.class)
        
        return extentManagement;
    }
                @NotNull AltibaseTablespace owner, 
     */
    }
    /**
                qry4Size = "SELECT "
package org.jkiss.dbeaver.ext.altibase.model;
            dbStat.setInt(2, owner.id);
        /**
            
    private String qry4Size;
                            + " , DECODE(max_sizE, 0, (SELECT VALUE1"
     */
    }
    public enum State {
     * Whether this is memory tablespace or not. 
    /**
    @Property(viewable = true, order = 4)
            case MEMORY_SYSTEM_DATA:
    
                return new AltibaseDataFile4Mem(owner, resultSet);
                monitor, this, "Load tablespace '" + getName() + "' statistics")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        protected JDBCStatement prepareObjectsStatement(
                        + " u.user_id = ip.user_id"
    private final State state;
     *  Returns Table and partition belongs to this partition  
        return dataFileCount;

    }
        usedSize = null;
                break;
    static class IndexPartnCache extends JDBCObjectCache<AltibaseTablespace, AltibaseTablespaceObj4Index> {
import org.jkiss.dbeaver.ext.altibase.AltibaseUtils;
            case MEMORY_USER_DATA:
                            + " ((u.tx_ext_cnt+u.used_ext_cnt+u.unstealable_ext_cnt) * prop.extent_size) USED_SIZE"

            return UNKNOWN;
                dbStat.setInt(1, getId());
    }
     * Return file collection belongs to this tablespace.

    
        
    
        }
     */
                        + " u.user_name"
        final AltibaseDataSource dataSource = referrer.getDataSource();
    /**
import org.jkiss.dbeaver.model.meta.Property;
 *     http://www.apache.org/licenses/LICENSE-2.0
            
        
                            + " (SELECT tablespace_id, SUM((fixed_used_mem + var_used_mem)) USED"
        DISK_USER_DATA(4),
    private volatile Long availableSize;
 *
                           + " FROM x$segment"
import java.sql.ResultSet;
import java.util.Collection;
    @Property(viewable = true, order = 3)
                      + " FROM V$VOL_TABLESPACES) M LEFT OUTER JOIN "
        
                @NotNull JDBCSession session, 
                 */
                                + " , space_id"
    
    
            dbStat.setInt(1, owner.id);
        return tablePartnCache.getAllObjects(monitor, this);
        }
            return;
                    + " WHERE"
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                + " , current_size "
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public TbsType getTbsTypeEnum() {
    public boolean getIsLogCompression() {
    
    }
                qry =  " SELECT"


            
    public Collection<AltibaseTablespaceObj4Index> getAltibaseTablespaceObj4Indexes(DBRProgressMonitor monitor) throws DBException {
                        + " system_.sys_users_ u, system_.sys_indices_ i, system_.sys_users_ ut, system_.sys_tables_ t"
        MEMORY_SYSTEM_DICTIONARY(0),
                        + " u.user_id = t.user_id AND (t.table_type = 'T' OR t.table_type = 'Q') AND "
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        }
                            + " nvl(xts.used_SIZE, 0) USED_SIZE"
            return new AltibaseTablespaceObj4Index(owner, resultSet);
                            + " FROM V$DATAFILES"
import java.sql.SQLException;
    public AltibaseDataFile getFile(DBRProgressMonitor monitor, int fileId) throws DBException {
        State(int stateIdx) {
     */
    }
        return pageSizeInBytes;
            String qry = null;
    public boolean isMemTbs() {
                        + " ,ip.index_partition_name"
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
    }
    @Property(viewable = true, order = 5)
                    + " FROM"
                @NotNull AltibaseTablespace owner) throws SQLException {
        }
        DISCARDED(1024),
        return AltibaseUtils.resolveLazyReference(monitor, dataSource, dataSource.tablespaceCache, referrer, propertyId);
    static Object resolveTablespaceReference(DBRProgressMonitor monitor, DBSObjectLazy<AltibaseDataSource> referrer, 

                        + " u.user_name, t.table_name AS obj_name, null as partition_name"
    
    /**
            dbStat.setInt(1, owner.id);
 * you may not use this file except in compliance with the License.
        return indexPartnCache.getAllObjects(monitor, this);
        }
    }
        return availableSize;
        setQry4Size();
        } catch (SQLException e) {
    
    @Association
        switch (this.tbsType) {
            }
                       + " WHERE t.id = D.spaceid AND t.id = ?";
            case MEMORY_SYSTEM_DICTIONARY:
        @NotNull
                           + " FROM x$temptable_stats "
    public int getPageSizeInKBytes() {
                            + " GROUP BY tablespace_id ) "
            final JDBCPreparedStatement dbStat = session.prepareStatement(qry);
        DISK_SYSTEM_DATA(3),
    }
                       + " FROM v$tablespaces t LEFT OUTER JOIN "
                            + " MT ON m.space_id = mt.tablespace_id"
    
     */
    public int getPageSizeInBytes() {
                           + " GROUP BY SPACEID) D"
    public boolean hasStatistics() {
                            + " , mt.current_size "
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
import org.jkiss.dbeaver.DBException;
        }
                            + " , p.checkpoint_path || '/' || dbfile_name NAME"
                        + " ,NULL AS partition_name"
    /**
    
        public static State getStateByIdx(int stateIdx) {
            this.stateIdx = stateIdx;
    

        if (usedSize == null) {
        }
         */
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
    public int getId() {
import org.jkiss.dbeaver.model.DBPObjectStatistics;
 *
                            + " , mt.space_id SPACEID"
                break;
                           + ", (SELECT SPACEID"
    @Override
                        + " ,i.index_name AS obj_name"
        availableSize = null;
                                + " , space_name || '-1-0' dbfile_name"
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    
        availableSize = totalSize - usedSize;
                            + " mt.ID ID"
    
                @NotNull JDBCSession session, 
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                           + ", (SELECT SPACEID"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            this.stateIdx = stateIdx;
                qry4Size = "";
        getDataSource().resetStatistics();
            } else {
     * Return tables belongs to this tablespace.
                    + " ("
                            + " d.mem_max_db_size TOTAL_SIZE "
import org.jkiss.dbeaver.model.struct.DBSObject;
            
                @NotNull JDBCSession session, 
        
                    + " WHERE"
    @Override
            throw new DBDatabaseException("Can't read tablespace statistics", e, getDataSource());
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return fileCache.getAllObjects(monitor, this);
    public String getName() {
                            + " FROM v$memtbl_info"
            for (State status : State.values()) {
        @Override
        this.segmentManagement  = JDBCUtils.safeGetString(dbResult, "SEGMENT_MANAGEMENT");    
                        + " WHERE t.id = ?";
                        + " WHERE"
        }
        }

                        + " AND i.is_partitioned = 'T'"
import org.jkiss.dbeaver.DBDatabaseException;
            return dbStat;
    /**
                qry4Size = "SELECT"
     * Return page size in bytes as String
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
        
        this.extentManagement   = JDBCUtils.safeGetString(dbResult, "EXTENT_MANAGEMENT");
    }
    public Long getUsedSize(DBRProgressMonitor monitor) throws DBException {
    @Association
        try (final JDBCSession session = DBUtils.openMetaSession(
                @NotNull JDBCSession session, 
            final JDBCPreparedStatement dbStat = session.prepareStatement(qry);

    private void setQry4Size() {
                        + " ,i.index_name AS obj_name"
    private final int dataFileCount;
    public Long getAvailableSize(DBRProgressMonitor monitor) throws DBException {
 * You may obtain a copy of the License at
                            + " nvl(ds.used, 0) 'USED_SIZE'"
import org.jkiss.utils.ByteNumberFormat;
    
            }
 */
    }
        this.tbsType            = TbsType.getTbsTypeByIdx(JDBCUtils.safeGetInt(dbResult, "TYPE"));
    private final String extentManagement;
        this.isLogCompression   = (JDBCUtils.safeGetInt(dbResult, "ATTR_LOG_COMPRESS") == 1);
                            + " , NVL(mt.used , 0) USED_SIZE"
                           + " GROUP BY SPACEID) D"
        @Override
                            + " (d.max * t.page_size) TOTAL_SIZE,"
        protected JDBCStatement prepareObjectsStatement(
                    + " SELECT"

            for (TbsType type : TbsType.values()) {
        this.state              = State.getStateByIdx(JDBCUtils.safeGetInt(dbResult, "STATE"));
                        + " AND i.index_id = ip.index_id"
                        + " AND i.table_id = t.table_id AND ut.user_id = t.user_id"
        fileCache.clearCache();
                        + " u.user_name, t.table_name AS obj_name, tp.partition_name"
                            + " FROM V$DATAFILES"
    }
        /**
    public String getTbsType() {
        this.dataFileCount      = JDBCUtils.safeGetInt(dbResult, "DATAFILE_COUNT");
    public long getStatObjectSize() {

     * Return used size (byte) in tablespace
        protected JDBCStatement prepareObjectsStatement(

    protected AltibaseTablespace(AltibaseDataSource dataSource, ResultSet dbResult) {
                           + ", (SELECT SPACEID"
        return null;
            return object.getLazyReference(propertyId) instanceof AltibaseTablespace ||
                           + " GROUP BY tbs_id) xts ON t.id = xts.tbs_id"
                        + " u.user_id = i.user_id AND i.is_partitioned = 'F'"
                if (stateIdx == type.stateIdx) {
    @Property(viewable = true, order = 9)
        
        indexPartnCache.clearCache();
                           + " , SUM(DECODE(MAXSIZE, 0, CURRSIZE, MAXSIZE)) AS MAX"
    @Override
                    + " )"
        protected AltibaseTablespaceObj4Index fetchObject(

                @NotNull AltibaseTablespace owner) throws SQLException {
                return file;
            availableSize = 0L;
    void fetchSizes(JDBCResultSet dbResult) throws SQLException {
        }
        MEMORY_SYSTEM_DATA(1),
        return id;
     */
/*
        @Override
                break;
     */
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    @Property(viewable = true, order = 6)
            default:
    /**
                    + " WHERE"

                    + " SELECT"
    }
    }
        this.pageSizeInBytes    = JDBCUtils.safeGetInt(dbResult, "PAGE_SIZE");
                    + " ("
            
                    + " FROM"
    public FileCache getFileCache() {
                qry = "SELECT * FROM V$DATAFILES WHERE SPACEID = ? ORDER BY NAME";
    public String getExtentManagement() {
                @NotNull JDBCSession session, 
                return true;
        return name;
    

                       + " WHERE t.id = D.spaceid AND t.id = ?";
    public static class TablespaceReferenceValidator implements IPropertyCacheValidator<DBSObjectLazy<AltibaseDataSource>> {
        long totalSize = dbResult.getLong("TOTAL_SIZE");
                        + " AND ip.tbs_id = ?"
        }
     */
    }
    private final String name;
                           + " GROUP BY SPACEID) D"
                               + " , SUM(DECODE(MAXSIZE, 0, CURRSIZE, MAXSIZE)) AS MAX"
     */
        if (qry.length() < 1) {
                                + " , space_id"
    
        
                           + " (SELECT space_id, sum(total_used_size) USED"
        }
     * Return page size in bytes as int
            loadSizes(monitor);
    /**
                            + " SELECT "
                            + " space_id"
        return pageSizeInBytes;
                            + " UNION ALL"
                                                  + " FROM V$PROPERTY"
    private volatile Long usedSize;
                @NotNull AltibaseTablespace owner, 
                    + " ORDER BY 1, 2, 3";
    public enum TbsType {
    private final boolean isLogCompression;
                                                  + " WHERE NAME = 'VOLATILE_MAX_DB_SIZE'), MAX_SIZE) AS MAX_SIZE"
    
    
            case MEMORY_USER_DATA:
         * Get TBS status by its state index value. 
                    + " UNION ALL "
                        + " FROM v$database d, v$tablespaces t left outer join"
        }
                    + " FROM"
                                + " , dbfile_size"
        MEMORY_USER_DATA(2),
    @Property(viewable = true, order = 11, formatter = ByteNumberFormat.class)
            return UNKNOWN;
public class AltibaseTablespace extends AltibaseGlobalObject implements DBPRefreshableObject, DBPObjectStatistics {
    public String getState() {
        ONLINE(2),
                    object.getDataSource().tablespaceCache.isFullyCached();
                            + " (SELECT "
            if (file.getId() == fileId) {
    }
    @Property(viewable = true, order = 1)
            }
                    return type;
        switch (this.tbsType) {
                            + " ) mt,"
        
    @Property(viewable = true, order = 10, formatter = ByteNumberFormat.class)
    @Override
}
                                + " , current_size "
     * Load tablespace size
                            + "(d.max * t.page_size) TOTAL_SIZE,"
                }
            @Nullable Object propertyId) throws DBException {
            case DISK_USER_DATA:
        super(dataSource, true);
        return tbsType.name();
    /**
     */
    
                break;
import org.jkiss.code.Nullable;
    }
            loadSizes(monitor);
                    + " WHERE m.space_id = ?";
                                + " , dbfile_size"
        @Override
                        + " FROM"
import org.jkiss.code.NotNull;
        VOLATILE_USER_DATA(8),
        return state.name();
    @NotNull
                + " ORDER BY 1,2,3";
                            + " (SELECT tablespace_id, round(sum(fixed_used_mem + var_used_mem),2) used"
            case VOLATILE_USER_DATA:
            
            return dbStat;
        BACKUP_DISCARDED(1028),
            }
    
            case DISK_SYSTEM_TEMP:
    }
            return new AltibaseTablespaceObj4Table(owner, resultSet);
 * Unless required by applicable law or agreed to in writing, software

                    + " SELECT"
    }
 * See the License for the specific language governing permissions and
    final IndexPartnCache indexPartnCache = new IndexPartnCache();
                        + " AND i.tbs_id = ?"
    private final int pageSizeInBytes;
    }
    
                            + " FROM v$mem_tablespaces"
                    + " WHERE"
 * Licensed under the Apache License, Version 2.0 (the "License");
        protected AltibaseDataFile fetchObject(
    }
                               + " (SELECT tbs_id, sum(normal_area_size) used_SIZE "
        return isLogCompression;
            case DISK_USER_TEMP:
    }
            case DISK_SYSTEM_UNDO:
                    "SELECT * FROM"
    }
    public Collection<AltibaseTablespaceObj4Table> getAltibaseTablespaceObj4Tables(DBRProgressMonitor monitor) throws DBException {
    }
    final FileCache fileCache = new FileCache();
            }
     *  Returns data files  
                return new AltibaseDataFile4Disk(owner, resultSet);
                @NotNull AltibaseTablespace owner) throws SQLException {
                       + " FROM v$tablespaces t LEFT OUTER JOIN "
    public int getDataFileCount() {
        
                @NotNull AltibaseTablespace owner, 
            case MEMORY_SYSTEM_DICTIONARY:
        String qry = getQry4Size();

        this.name               = JDBCUtils.safeGetString(dbResult, "NAME");
        @Override
     * Returns AltibaseDataFile matches to fileId
                /*
        @Override
        @NotNull
    @Association
    }
        return fileCache;
    final TablePartnCache tablePartnCache = new TablePartnCache();
                 * The memory data file consists of two sets, xxx-0-0 and xxx-1-0.
        return tbsType;
        return segmentManagement;
            default:
        BACKUP_ONLINE(6),
                    object.getLazyReference(propertyId) == null ||
                    
        return usedSize != null;
     */
                            + " FROM V$DATAFILES"
                    + " SELECT"
                       + " WHERE t.id = D.spaceid AND t.id = ?";
                        + " u.user_name"
        }
                                + " 1 ID"
         */
                        + " m.max_size TOTAL_SIZE"
                        + " t.is_partitioned = 'T' AND t.table_id = tp.table_id AND tp.tbs_id = ?"
    }
    }
                            + " (d.max * t.page_size) TOTAL_SIZE,"
                        + " system_.sys_users_ u, system_.sys_indices_ i, system_.sys_index_partitions_ ip, "
                    "SELECT * FROM"
        BACKUP_OFFLINE(5),
            
    private final String segmentManagement;
        return this;
    }
    }
                        + " , t.table_name"
            final JDBCPreparedStatement dbStat = session.prepareStatement(qry);
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                           + " GROUP by space_id) ds on ds.space_id = t.id"
import org.jkiss.dbeaver.model.DBPRefreshableObject;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(qry)) {
            String qry = 
                return false;
                    + " UNION ALL"
        UNKNOWN(-1);
            }
                            + " , mt.dbfile_size DBFILE_SIZE"
            dbStat.setInt(2, owner.id);
        tablePartnCache.clearCache();
    /**
                    return status;
        }
                    + " FROM"
                           + " , SUM(DECODE(MAXSIZE, 0, CURRSIZE, MAXSIZE)) AS MAX"
                qry4Size = "SELECT "
                        + " system_.sys_users_ u, system_.sys_tables_ t, system_.sys_table_partitions_ tp"
            case MEMORY_SYSTEM_DATA:
                            + " GROUP by tablespace_id) mt on t.id = mt.tablespace_id"
    /**
 *
    
    public String getSegmentManagement() {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                    if (dbResult.next()) {
                break;
    private final int id;
                + " )"
                        + " t.is_partitioned = 'F' AND t.tbs_id = ?"
                @NotNull JDBCSession session, 

        }
            String qry = 
        for (AltibaseDataFile file : fileCache.getAllObjects(monitor, this)) {
     * Return Tablespace type as enumeration
     */
    static class FileCache extends JDBCObjectCache<AltibaseTablespace, AltibaseDataFile> {
    public Collection<AltibaseDataFile> getFiles(DBRProgressMonitor monitor) throws DBException {
            dbStat.setInt(1, owner.id);
        @NotNull
            if (owner.isMemTbs()) {
    private final TbsType tbsType;
            usedSize = 0L;
                    + " FROM"
        DISK_SYSTEM_UNDO(7),

        return usedSize == null ? 0 : usedSize;
        
    // Statistics
 * Copyright (C) 2010-2026 DBeaver Corp and others
        private final int stateIdx;
        UNKNOWN(-1);
                        + " AND i.table_id = t.table_id AND ut.user_id = t.user_id"
                        + " system_.sys_users_ ut, system_.sys_tables_ t"
                             + " v$mem_tablespace_checkpoint_paths p"
    }
                        + " (SELECT"
    /**

            return dbStat;
     * Return avaiable size (byte) in tablespace
    }
                    }
            
                        + " , NVL(mt.used, 0) used_size"
    }
                        + " system_.sys_users_ u, system_.sys_tables_ t"
    static class TablePartnCache extends JDBCObjectCache<AltibaseTablespace, AltibaseTablespaceObj4Table> {
    
        
     *  Returns Table and partition belongs to this partition  
        DROPPPED(128),
                qry4Size = "SELECT "
                           + " (select value1 extent_size from v$property where name = 'SYS_UNDO_TBS_EXTENT_SIZE') prop"
                            + " FROM V$MEMTBL_INFO"
                        + " ORDER BY ID ASC";
    
    public void loadSizes(DBRProgressMonitor monitor) throws DBException {
        }
        return usedSize;
        return qry4Size;
        public boolean isPropertyCached(@NotNull DBSObjectLazy<AltibaseDataSource> object, @NotNull Object propertyId) {
                        + " , ut.user_name AS table_schema"
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (availableSize == null) {
    }
        protected AltibaseTablespaceObj4Table fetchObject(
     */

                        fetchSizes(dbResult);
            } else {
                            + " p.space_id = mt.space_id AND mt.space_id = ?"
         * Get TBS type get its index value. 
                }
                       + " FROM v$tablespaces t, v$disk_undo_usage u,"
            if (owner.isMemTbs()) {
        DISK_SYSTEM_TEMP(5),
    
    
    ///////////////////////////////////////////////
    public String getQry4Size() {
        private final int stateIdx;
                        + " u.user_id = t.user_id AND (t.table_type = 'T' OR t.table_type = 'Q') AND "
                if (stateIdx == status.stateIdx) {
    @Property(viewable = true, order = 2)
        this.id                 = JDBCUtils.safeGetInt(dbResult, "ID");
 * DBeaver - Universal Database Manager
                        + " , ut.user_name AS table_schema"
    public String getPageSizeInBytesStr() {
                }
        usedSize = dbResult.getLong("USED_SIZE");
                        + " , t.table_name"
    @Property(viewable = true, order = 7)
                            + " FROM v$mem_tablespaces"
                qry4Size = "SELECT "
        @Override
            case DISK_SYSTEM_DATA:
    /**
                                + " , space_name || '-0-0' dbfile_name"
        OFFLINE(1),
                                + " 0 ID"

import org.jkiss.dbeaver.model.meta.Association;
