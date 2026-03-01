import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    {
/*
            indexName,
        try {
    {
 * DBeaver - Universal Database Manager
import java.sql.SQLException;
            cardinality,

        }
            case DatabaseMetaData.tableIndexHashed:
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
        indexObject = tableCache.getDataSource().getMetaObject(GenericConstants.OBJECT_INDEX);
    @Override
        return new GenericTableIndexColumn[] { new GenericTableIndexColumn(
    JDBCResultSet dbResult)

//                break;
 *
/**

    IndexCache(TableCache tableCache)
        GenericTableColumn tableColumn = parent.getAttribute(session.getProgressMonitor(), columnName);
        throws SQLException, DBException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (CommonUtils.isEmpty(columnName)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    owner.getSchema() == null || DBUtils.isVirtualObject(owner.getSchema()) ? null : owner.getSchema().getName(),
    String indexName, @NotNull
            isNonUnique,
 *
    }
    @Override
                return null;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
                break;
            case DatabaseMetaData.tableIndexClustered:
                    throw (SQLException)e;
            default:
        if (tableColumn == null) {
        throws SQLException, DBException

    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
//                indexType = DBSIndexType.STATISTIC;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable
            }
            tableCache,
    {
            !"D".equalsIgnoreCase(ascOrDesc)) };
 */
        if (CommonUtils.isEmpty(indexName)) {
        String indexQualifier = GenericUtils.safeGetStringTrimmed(indexObject, dbResult, JDBCConstants.INDEX_QUALIFIER);
                    false,
            log.debug("Column '" + columnName + "' not found in table '" + parent.getName() + "' for index '" + object.getName() + "'");
                break;
                }

            return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
public class IndexCache extends JDBCCompositeCache<GenericStructContainer, GenericTableBase, GenericTableIndex, GenericTableIndexColumn> {
                break;
import java.util.Locale;
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_INDEX, JDBCConstants.INDEX_NAME));
    protected GenericTableIndex fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @NotNull GenericTableBase parent, @NotNull
    protected GenericTableIndexColumn[] fetchObjectRow(
                indexType = DBSIndexType.OTHER;
    @NotNull
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
        String columnName = trimName ?
            GenericUtils.safeGetStringTrimmed(indexObject, dbResult, JDBCConstants.COLUMN_NAME)
        return owner.getDataSource().getMetaModel().createIndexImpl(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            } else {

                if (e instanceof SQLException) {
 *
            ordinalPosition,
            parent,
    @Nullable
    @Override
    }
        }
import org.jkiss.dbeaver.model.DBUtils;
                indexType = DBSIndexType.UNKNOWN;
            case DatabaseMetaData.tableIndexOther:
            // [JDBC] Some drivers return empty index names
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableIndex index, @NotNull List<GenericTableIndexColumn> rows)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
            return session.getMetaData().getIndexInfo(
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
 */
 * See the License for the specific language governing permissions and
            : GenericUtils.safeGetString(indexObject, dbResult, JDBCConstants.COLUMN_NAME);

        @NotNull JDBCSession session,
        index.setColumns(rows);
            true);
import java.sql.DatabaseMetaData;
    }
    }
import org.jkiss.code.Nullable;
            indexQualifier,
            tableColumn,
        super(
            if (forParent == null) {
 * you may not use this file except in compliance with the License.
                    owner.getCatalog() == null ? null : owner.getCatalog().getName(),
        boolean trimName = parent.getDataSource().getMetaModel().isTrimObjectNames();
    @Override
package org.jkiss.dbeaver.ext.generic.model;
        @NotNull GenericTableBase parent, @NotNull GenericTableIndex object, @NotNull JDBCResultSet dbResult)
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        }
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_INDEX, JDBCConstants.TABLE_NAME),
                indexType = DBSIndexType.CLUSTERED;
        switch (indexTypeNum) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    true).getSourceStatement();
    }
        }
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
        } catch (Exception e) {
    private final GenericMetaObject indexObject;
        throws SQLException
                throw new SQLException(e);
        int indexTypeNum = GenericUtils.safeGetInt(indexObject, dbResult, JDBCConstants.TYPE);

        DBSIndexType indexType;
 * limitations under the License.
import java.util.List;
        long cardinality = GenericUtils.safeGetLong(indexObject, dbResult, JDBCConstants.INDEX_CARDINALITY);
}
import org.jkiss.utils.CommonUtils;
                    forParent == null ? owner.getDataSource().getAllObjectsPattern() : forParent.getName(),
                // Table index statistic. Not a real index.
                throw new SQLException("Catalog/schema indexes read not supported", e);


                log.debug("Skip statistics index '" + indexName + "' in '" + DBUtils.getObjectFullName(parent, DBPEvaluationContext.DDL) + "'");
            return null;
            GenericTableBase.class,
import org.jkiss.code.NotNull;
 * Index cache implementation
            object,
                indexType = DBSIndexType.HASHED;
            // Maybe a statistics index without column
    GenericTableBase forParent)
            indexType,
        boolean isNonUnique = GenericUtils.safeGetBoolean(indexObject, dbResult, JDBCConstants.NON_UNIQUE);
        int ordinalPosition = GenericUtils.safeGetInt(indexObject, dbResult, JDBCConstants.ORDINAL_POSITION);

            indexName = parent.getName().toUpperCase(Locale.ENGLISH) + "_INDEX";
 * Unless required by applicable law or agreed to in writing, software

                break;
            case DatabaseMetaData.tableIndexStatistic:
        String ascOrDesc = GenericUtils.safeGetStringTrimmed(indexObject, dbResult, JDBCConstants.ASC_OR_DESC);
