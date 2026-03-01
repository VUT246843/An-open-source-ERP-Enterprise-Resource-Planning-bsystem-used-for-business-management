        return tables;
            long cardinality = JDBCUtils.safeGetLong(dbResult, JDBCConstants.INDEX_CARDINALITY);
                    indexType = DBSIndexType.OTHER;
import org.jkiss.dbeaver.model.struct.DBSObject;
            super(dataSource);
            DBSIndexType indexType;
        return views;
            boolean autoIncrement = false;
        }
        }
            if (table.isSystem()) {
                views.add((CubridView) view);
                return null;
                    cardinality, name, indexType, true);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {

    @Nullable
            String dataType = JDBCUtils.safeGetString(dbResult, "data_type");
                dbStat.setString(1, columnName);
        return this.getDataSource().getContainer().getNavigatorSettings().isShowSystemObjects();
        @Override
                name = parent.getName().toUpperCase(Locale.ENGLISH) + "_INDEX";
    @Override
                @NotNull CubridTableIndex object,
            String columnName = JDBCUtils.safeGetString(dbResult, "attr_name");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
        protected void cacheChildren(
    public class CubridIndexCache extends JDBCCompositeCache<GenericStructContainer, CubridTable, CubridTableIndex, GenericTableIndexColumn>

        }
    private String comment;
    }
        }
 *

        protected GenericTableIndexColumn[] fetchObjectRow(

    }
import org.jkiss.code.Nullable;
            }
import org.jkiss.code.NotNull;
        }
        return getDataSource().isDBAGroup();
import java.sql.DatabaseMetaData;
                default:
    @Nullable
                throws SQLException, DBException {
    public CubridIndexCache getCubridIndexCache() {
                case DatabaseMetaData.tableIndexOther:
    @Nullable
                    indexType = DBSIndexType.CLUSTERED;

    public boolean supportsSystemView() {
        @Nullable
    }
                throws SQLException, DBException {

            int ordinalPosition = JDBCUtils.safeGetInt(dbResult, JDBCConstants.ORDINAL_POSITION);
    @NotNull
import java.sql.SQLException;
            }

    @NotNull
    }
        @Override
    }
        return getDataSource().isDBAGroup();
            if (view.isSystem()) {
        CubridIndexCache(@NotNull TableCache tableCache) {
    public String getName() {
        List<CubridTable> tables = new ArrayList<>();
        return name;
    public boolean supportsSynonym() {
                try (JDBCResultSet result = dbStat.executeQuery()) {
    private String name;
public class CubridUser extends GenericSchema
                @NotNull JDBCResultSet dbResult)
            @NotNull List<GenericTableIndexColumn> children) {
        for (GenericView view : super.getViews(monitor)) {

        for (GenericTable table : super.getPhysicalTables(monitor)) {
        protected CubridTableIndex fetchObject(
                case DatabaseMetaData.tableIndexStatistic:
    public CubridDataSource getDataSource() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                views.add((CubridView) view);
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                throws SQLException {
    public List<CubridView> getViews(@NotNull DBRProgressMonitor monitor) throws DBException {
                @NotNull GenericTableBase table,
                @NotNull JDBCSession session,
            @NotNull GenericStructContainer owner,
    public TableCache createTableCache(@NotNull GenericDataSource datasource) {
            super(tableCache, CubridTable.class, JDBCConstants.TABLE_NAME, JDBCConstants.INDEX_NAME);
    @Override

        @NotNull
        this.name = schemaName;
            @NotNull String indexName,
        return comment;
                    return null;

    }
            sql = ((CubridDataSource) owner.getDataSource()).wrapShardQuery(sql);
        super(dataSource, null, schemaName);
 * You may obtain a copy of the License at

        return getDataSource().getSupportMultiSchema();
    }
    @Override
    {
    @Property(viewable = true, order = 2)
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
            GenericTableColumn tableColumn = parent.getAttribute(session.getProgressMonitor(), columnName);
            int indexTypeNum = JDBCUtils.safeGetInt(dbResult, JDBCConstants.TYPE);

        return cubridIndexCache;
        }
                case DatabaseMetaData.tableIndexHashed:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 1)
    @Override
            if (!view.isSystem()) {
            @NotNull CubridTableIndex object,
        @NotNull
 * DBeaver - Universal Database Manager
        List<CubridTable> tables = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
                }
                @NotNull JDBCResultSet dbResult)
    public class CubridTableCache extends TableCache

            indexes.addAll(table.getIndexes(monitor));

import org.jkiss.dbeaver.model.DBUtils;
            @NotNull String schemaName,
package org.jkiss.dbeaver.ext.cubrid.model;
    }
    @Nullable
    }
            @Nullable String comment) {
    private final CubridIndexCache cubridIndexCache;

import java.util.List;
                    break;
/*
            throws DBException {
        return getTable(monitor, childName.toLowerCase());
            String columnName = JDBCUtils.safeGetString(dbResult, JDBCConstants.COLUMN_NAME);

            boolean isForeignKey = "YES".equals(JDBCUtils.safeGetString(dbResult, "is_foreign_key"));
    }
        }
                case DatabaseMetaData.tableIndexClustered:
 * See the License for the specific language governing permissions and
        List<GenericTableIndex> indexes = new ArrayList<>();
            }
                    if (result.next()) {
 *
            String sql = "show columns from " + DBUtils.getQuotedIdentifier(getDataSource(), tableName) + " where Field = ?";
            }
    public List<CubridTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    }
    @NotNull
            String name = indexName;
        @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.dbeaver.DBException;
            }
            switch (indexTypeNum) {
        return new CubridTableCache(datasource);
                return null;
    }

        for (CubridTable table : getPhysicalTables(monitor)) {
    @NotNull

            String ascOrDesc = JDBCUtils.safeGetStringTrimmed(dbResult, JDBCConstants.ASC_OR_DESC);
    @Nullable
                @NotNull GenericStructContainer owner,
    public List<CubridView> getSystemViews(@NotNull DBRProgressMonitor monitor) throws DBException {

            boolean isNonUnique = JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.NON_UNIQUE);
            @NotNull GenericDataSource dataSource,
                tables.add((CubridTable) table);
            }
        for (GenericTable table : super.getPhysicalTables(monitor)) {
            if (tableColumn == null) {
    public CubridUser(
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
import org.jkiss.dbeaver.model.meta.Property;

import java.util.Locale;
    public boolean showSystemTableFolder() {
        @Override


        return indexes;
    public List<? extends CubridTable> getPhysicalSystemTables(@NotNull DBRProgressMonitor monitor)
        }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
        for (GenericView view : super.getViews(monitor)) {
                        showDataType = JDBCUtils.safeGetString(result, "Type");
                    break;

        @Override
    }
 * you may not use this file except in compliance with the License.
            };
                    break;
        return getDataSource().isDBAGroup();
            if (!table.isSystem()) {
            @NotNull DBRProgressMonitor monitor,
                throws SQLException, DBException {
            String indexQualifier = JDBCUtils.safeGetStringTrimmed(dbResult, JDBCConstants.INDEX_QUALIFIER);
    @Nullable
                    indexType = DBSIndexType.UNKNOWN;
    }
            if (CommonUtils.isEmpty(columnName)) {
                @NotNull JDBCSession session,
        this.cubridIndexCache = new CubridIndexCache(this.getTableCache());
                        autoIncrement = CubridConstants.AUTO_INCREMENT.equals(JDBCUtils.safeGetString(result, "Extra"));
            return session.getMetaData().getIndexInfo(null, null, forParent.getUniqueName(), false, true).getSourceStatement();
    public String getComment() {
    @NotNull
            @NotNull JDBCSession session,

    public boolean supportsTrigger() {
    }
    @NotNull
 *
                    object, tableColumn, ordinalPosition, !"D".equalsIgnoreCase(ascOrDesc))

        return tables;
            object.setColumns(children);
        return views;
                tables.add((CubridTable) table);
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Nullable

        protected GenericTableColumn fetchChild(
            return new CubridTableIndex(parent, isNonUnique, indexQualifier,
        List<CubridView> views = new ArrayList<>();
    @NotNull
        protected CubridTableCache(@NotNull GenericDataSource dataSource) {
                    indexType = DBSIndexType.HASHED;
            String showDataType = null;
 * limitations under the License.
            return new GenericTableIndexColumn[]{new GenericTableIndexColumn(
    public List<GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
        List<CubridView> views = new ArrayList<>();
                    }
            }
            @NotNull JDBCResultSet dbResult)
            String tableName = table.isSystem() ? table.getName() : ((CubridDataSource) getDataSource()).getMetaModel().getTableOrViewName(table);
                @NotNull CubridTable parent,
            if (CommonUtils.isEmpty(name)) {
    }
            @NotNull CubridTable parent,
{
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable CubridTable forParent)
import java.util.ArrayList;
    }
        return (CubridDataSource) super.getDataSource();
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        this.comment = comment;
            return new CubridTableColumn(table, columnName, showDataType == null ? dataType : showDataType, autoIncrement, isForeignKey, dbResult);
                    break;
 */
    public boolean supportsSystemTable() {
        }
import org.jkiss.utils.CommonUtils;
    {



