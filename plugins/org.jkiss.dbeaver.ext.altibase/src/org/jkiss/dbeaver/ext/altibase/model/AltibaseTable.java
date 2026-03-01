import org.jkiss.utils.CommonUtils;
        }
    public String getTableType() {
    private String tablespace;
    
            boolean hasGeometryColumns = CommonUtils.safeCollection(attributes).stream()
/*
    }
                    }
                    if (dbResult.next()) {
import org.jkiss.dbeaver.DBException;
            tableAliasName = (tableAlias != null) ? tableAlias + "." : "";
        
    @Override
        
    static class TablePrivCache extends JDBCObjectCache<AltibaseTable, AltibasePrivTable> {
    private static final int SIZE_IDX_DISK = 1;
        String tableAliasName;

                    + " AND p.priv_type = 1"
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
package org.jkiss.dbeaver.ext.altibase.model;
                    query.append("ASEWKT(").append(tableAliasName).append(columnName).append(", 32000) as ").append(columnName);
    }
        } catch (Exception e) {
    
        DBRProgressMonitor monitor,
    protected void fetchTableSize(JDBCResultSet dbResult) throws SQLException {
            // Use this hack for geometry columns data reading
    private transient volatile Long[] tableSize;
    
    
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
    public AltibaseTable(GenericStructContainer container, String tableName, String tableType, JDBCResultSet dbResult) {
        
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
                    + " AND g.grantor_id = grantor.user_id"
        return true;
                dbStat.setString(1, getSchema().getName());
            try (JDBCPreparedStatement dbStat = session.prepareStatement(

    
    // Statistics
public class AltibaseTable extends GenericTable implements DBPNamedObject2, DBPObjectStatistics {
        return (!hasStatistics()) ? 0 : tableSize[SIZE_IDX_MEM] + tableSize[SIZE_IDX_DISK];
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
import org.jkiss.dbeaver.model.exec.DBCException;
                dbStat.setString(2, getName());
    }
        protected AltibasePrivTable fetchObject(@NotNull JDBCSession session, @NotNull AltibaseTable tableBase, 
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public boolean hasStatistics() {
    protected void appendSelectSource(

    private static final int SIZE_IDX_MEM = 0;
                    + " , DECODE(grantee.user_type, 'U', 'User', 'R', 'Role') as grantee_type"
                return;
    protected void resetSize() {
                }
        if (this.tableSize == null) {
        }


        tableSize = new Long[2];
            throw new DBCException("Error reading table statistics", e);
                String columnName = DBUtils.getQuotedIdentifier(col);

            int i = 0;
        return partitioned;
                + " ORDER BY priv_name, grantor_name, grantee_name");
    @Property(viewable = true, order = 16, editable = false)
                + " WHERE"
        }
        
                if (AltibaseConstants.TYPE_NAME_GEOMETRY.equalsIgnoreCase(col.getTypeName())) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                dbStat.setString(2, getName());
import org.jkiss.dbeaver.Log;
            tableSize[i] = 0L; 
        if (tablespace != null) {
        } catch (DBException e) {
        if (tablespace == null) {
    protected boolean isTruncateSupported() {
            List<? extends GenericTableColumn> attributes = getAttributes(monitor);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
    
    @Override
                } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        return tablePrivCache.getAllObjects(monitor, this);
            for (GenericTableColumn col : CommonUtils.safeCollection(attributes)) {
                    + " ,system_.sys_privileges_ p"

            loadSize(monitor);

        }
    }
            }
    }
        return super.refreshObject(monitor);
                        partitioned = JDBCUtils.safeGetBoolean(dbResult, 2, AltibaseConstants.RESULT_T_VALUE);
            loadSize(monitor);
    @Property(viewable = true, order = 23, editable = false, formatter = ByteNumberFormat.class)
    private boolean partitioned;
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        return tableSize != null;
                }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (int i = 0; i < 2; i++) {
        return tableSize[SIZE_IDX_MEM];
    ) {
}
                }
import org.jkiss.utils.ByteNumberFormat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.util.List;
                resetSize();
            throw new DBCException("Error reading tablespace name", e);
        }
        @Override
import org.jkiss.dbeaver.model.DBPNamedObject2;
 *
        }
            getTablespace(monitor);
            }
    @Property(viewable = true, order = 20, editable = false, formatter = ByteNumberFormat.class, category = DBConstants.CAT_STATISTICS)
            log.warn("Can't read table attributes.", e);
            }
    
        
        }
                    query.append(",");
                        fetchTableSize(dbResult);
import java.sql.SQLException;
                dbStat.setString(1, getSchema().getName());
            if (!hasGeometryColumns) {
    
    
                    + " system_.sys_users_ schema"
    @Override
    public Long getTableSize(DBRProgressMonitor monitor) throws DBCException {
        if (!hasStatistics()) {
    public String getTablespace(DBRProgressMonitor monitor) throws DBException {
                    + " ,system_.sys_users_ grantor"
                    + " ,system_.sys_users_ grantee"
    private static final Log log = Log.getLog(AltibaseTable.class);
                .anyMatch(e -> AltibaseConstants.TYPE_NAME_GEOMETRY.equalsIgnoreCase(e.getTypeName()));
        try {
    @Override
        getTablespace(monitor);
    ///////////////////////////////////
                    + " ,system_.sys_tables_ t"
        tableSize = null;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.DBUtils;
            resetSize();
                super.appendSelectSource(monitor, query, tableAlias, rowIdAttribute);
    }
    }
    /*
                        tablespace = JDBCUtils.safeGetString(dbResult, 1);


                + "WHERE u.user_id = t.user_id AND u.user_name = ? AND t.table_name = ?")) {
    @Association
    ///////////////////////////////////
                    + " ,p.priv_name AS priv_name"
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.code.NotNull;
        tableSize[SIZE_IDX_MEM] = (long) JDBCUtils.safeGetLong(dbResult, "MEMORY_SIZE");
        DBDPseudoAttribute rowIdAttribute

    }
                    + " schema.user_name = ? AND t.table_name = ?"

 * limitations under the License.
    @Override
        return tableSize[SIZE_IDX_MEM] + tableSize[SIZE_IDX_DISK];
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, 
        super(container, tableName, tableType, dbResult);
import org.jkiss.dbeaver.model.DBConstants;
        @NotNull
 */
                    if (dbResult.next()) {
    
                    + " AND g.priv_id = p.priv_id"
    
     * Returns object privileges on a table: SELECT, UPDATE, INSERT, DELETE
     */
        if (!hasStatistics()) {
     */
    }
            dbStat.setString(1, tableBase.getSchema().getName());
import org.jkiss.dbeaver.model.DBPObjectStatistics;
    
    private final TablePrivCache tablePrivCache = new TablePrivCache();
        }
                    + " AND g.grantee_id = grantee.user_id"
                "SELECT memory_size, disk_size FROM system_.sys_table_size_ WHERE USER_NAME = ? AND TABLE_NAME = ?")) {
                + " FROM"
    @Property(viewable = true, order = 15, editable = false)
        } catch (Exception e) {
            return dbStat;
    public Long getTableSizeInDisk(DBRProgressMonitor monitor) throws DBCException {
                    + " , grantee.user_name AS grantee_name"
    }
import org.jkiss.dbeaver.model.meta.Property;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import java.util.Collection;
        String tableAlias,
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        tableSize[SIZE_IDX_DISK] = (long) JDBCUtils.safeGetLong(dbResult, "DISK_SIZE");
        return tableSize[SIZE_IDX_DISK];
                    query.append(tableAliasName).append(columnName).append(" as ").append(columnName);
        
    private void loadSize(DBRProgressMonitor monitor) throws DBCException {
    @Property(viewable = true, order = 22, editable = false, formatter = ByteNumberFormat.class)
            if (!hasStatistics()) {
                    + " grantor.user_name AS grantor_name"

                "SELECT tbs_name, is_partitioned FROM system_.sys_tables_ t, system_.sys_users_ u "
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    
    
                    + " AND g.obj_id = t.table_id"
 * See the License for the specific language governing permissions and
                @NotNull AltibaseTable tableBase) throws SQLException {
        }
        resetSize();

                    }
        } finally {
    
    public Collection<AltibasePrivTable> getTablePrivs(DBRProgressMonitor monitor) throws DBException {
     * In order to use a conversion function for geometry type.
        return super.getTableType();
    
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load tablespace")) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            }
    }
 * DBeaver - Universal Database Manager
            return new AltibasePrivTable(tableBase, resultSet);
 * Unless required by applicable law or agreed to in writing, software
    public long getStatObjectSize() {
        if (!hasStatistics()) {
        StringBuilder query,
    public boolean getPartitionedTable(DBRProgressMonitor monitor) throws DBException {
            loadSize(monitor);
            dbStat.setString(2, tableBase.getName());
                    + " AND schema.user_id = t.user_id"

            return tablespace;
                }
                    + " ,system_.sys_grant_object_ g"
    /**
    }
            final JDBCPreparedStatement dbStat = session.prepareStatement(
        getTableSize(monitor);
                "SELECT"
import org.jkiss.dbeaver.model.meta.Association;
        }
                    + " ,g.with_grant_option AS with_grant_option"
    // Tablespace
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public Long getTableSizeInMemory(DBRProgressMonitor monitor) throws DBCException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    }
    }
                if (i++ > 0) {
        tablePrivCache.clearCache();
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, hidden = true)
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
    }
 *
        }
        return tablespace;

 *
