        super(container, tableName, tableType, dbResult);
        @Override
            }
        }
        protected GenericTableIndexColumn[] fetchObjectRow(
        @NotNull
                        indexColumns.add(new GenericTableIndexColumn(index, attribute, attribute.getOrdinalPosition(), false));
        } else {
                } else {
    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * limitations under the License.
                            indexColumns.add(new GenericTableIndexColumn(index, attribute, attribute.getOrdinalPosition(), false));
    @Nullable
    public boolean isIndexTable(){
        return false;
            } catch (DBException e) {

        if (isIndexTable()) {
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPNamedObject2;
     */
        @Override
                }
        return super.refreshObject(monitor);
        List<DBSIndexType> indexTypes = new ArrayList<>();
    public Collection<DBSIndexType> getTableIndexTypes() {
        return indexTypes;
                throws DBException
    }
            index.setColumns(rows);
        JDBCResultSet dbResult)
            return dbStat;
            String comment = JDBCUtils.safeGetString(dbResult, "comment");
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    }
            ArrayList<GenericTableIndexColumn> indexColumns = new ArrayList<>();
            String indexTableName = CommonUtils.notEmpty(JDBCUtils.safeGetString(dbResult, "idx_tab_name")).trim();
                        if (attribute != null) {

    }
        @Override

        }
                    if (attribute != null) {
        {
                        GenericTableColumn attribute = parent.getAttribute(session.getProgressMonitor(), column.trim());
        return hiveIndexCache == null ?
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBIcon;
        protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull HiveIndex index, @NotNull List<GenericTableIndexColumn> rows)
        }

        String indexName, @NotNull
            hiveIndexCache = null;
        indexTypes.add(new DBSIndexType("BITMAP", "Bitmap"));

                return new HiveIndex(parent, hiveIndexName, true, comment, indexType, table);
            }
    }
 * DBeaver - Universal Database Manager
 *

        }
 *

        {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @Nullable
            if (forParent != null) {

                    }

                    String[] indexColumnNames = columnNames.split(",");
/*
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.utils.ArrayUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (!container.getDataSource().isServerVersionAtLeast(4, 0)) {
                        }

    public synchronized List<HiveTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
package org.jkiss.dbeaver.ext.hive.model;
    public HiveTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
        } else {
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.dbeaver.model.DBPImageProvider;
    }
        @Override
            }
            @NotNull HiveTable parent, @NotNull HiveIndex index, @NotNull JDBCResultSet dbResult)
            return DBIcon.TREE_TABLE;
                throws SQLException
        return (List<HiveTableColumn>) super.getAttributes(monitor);
            return ArrayUtils.toArray(GenericTableIndexColumn.class, indexColumns);
                dbStat.setString(1, forParent.getName());
        HiveTableIndexCache()
import org.jkiss.dbeaver.ext.generic.model.*;

    public Collection<? extends GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {

    @Override
            @NotNull JDBCSession session,
        {
import java.util.List;
    public boolean supportUniqueIndexes() {
import org.jkiss.dbeaver.DBException;
    public DBPImage getObjectImage() {
 *

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
        {
    private final HiveTableIndexCache hiveIndexCache;
 * Unless required by applicable law or agreed to in writing, software
        }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable
import java.sql.SQLException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    class HiveTableIndexCache extends JDBCCompositeCache<GenericStructContainer, HiveTable, HiveIndex, GenericTableIndexColumn> {
            String indexType = CommonUtils.notEmpty(JDBCUtils.safeGetString(dbResult, "idx_type")).trim();
        return getTableType().equals("INDEX_TABLE");
                    }
    @Override
            hiveIndexCache = new HiveTableIndexCache();
            hiveIndexCache.getObjects(monitor, getContainer(), this);
    @Override
                HiveTable table = (HiveTable) owner.getTable(dbResult.getSession().getProgressMonitor(), indexTableName);
            if (columnNames != null) {
        @Nullable

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                    GenericTableColumn attribute = parent.getAttribute(session.getProgressMonitor(), columnNames.trim());
    @Override
 * See the License for the specific language governing permissions and
        indexTypes.add(new DBSIndexType("COMPACT", "Compact"));

        protected HiveIndex fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @NotNull HiveTable parent, @NotNull
            return DBIcon.TREE_TABLE_INDEX;
                    for (String column : indexColumnNames) {
        }
                log.debug("Can't read table from index" + indexName, e);
    /**
            JDBCPreparedStatement dbStat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class HiveTable extends GenericTable implements DBPImageProvider, DBPNamedObject2 {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        {
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
            return new HiveIndex(parent, hiveIndexName, true, comment, indexType, null);
            String columnNames = JDBCUtils.safeGetString(dbResult, "col_names");
    @Override
        }
import org.jkiss.code.NotNull;
            super(getCache(), HiveTable.class, "tab_name", "idx_name");
            String hiveIndexName = CommonUtils.notEmpty(JDBCUtils.safeGetString(dbResult, "idx_name")).trim();
import java.util.ArrayList;
                if (columnNames.contains(",")) {
import java.util.Collection;
            super.getIndexes(monitor) :
    }
            hiveIndexCache.clearCache();
            try {
        HiveTable forParent)
     * Index cache implementation
}
        if (hiveIndexCache != null) {
            dbStat = session.prepareStatement("SHOW INDEX ON ?");
 * distributed under the License is distributed on an "AS IS" BASIS,
