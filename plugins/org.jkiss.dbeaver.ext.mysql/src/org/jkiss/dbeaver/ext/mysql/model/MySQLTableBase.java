    }
    @Override
/*
import java.util.List;
 * See the License for the specific language governing permissions and
                }
        MySQLCatalog catalog,
        return isPartition;
import org.jkiss.code.NotNull;
        return getContainer().getTableCache().getChild(monitor, getContainer(), this, attributeName);
    {
    {
        super(catalog, source, false);
    }
    {
        return DBUtils.getFullQualifiedName(getDataSource(),
        columns.sort(DBUtils.orderComparator());
            this);
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Retrieve table DDL")) {


            return DBStructUtils.generateTableDDL(monitor, this, options, false);
/**
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBUtils;
import java.sql.PreparedStatement;
    public List<MySQLTableColumn> getCachedAttributes()
import org.jkiss.utils.CommonUtils;
            }
        return getContainer().getTableCache().refreshObject(monitor, getContainer(), this);
                    } else {
import java.sql.ResultSet;
 * You may obtain a copy of the License at
    {
        if (childrenCache != null) {


                try (ResultSet dbResult = dbStat.executeQuery()) {
package org.jkiss.dbeaver.ext.mysql.model;
        }
import org.jkiss.dbeaver.model.DBPRefreshableObject;
            return childrenCache.getCachedObjects();
    }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        ResultSet dbResult)
public abstract class MySQLTableBase extends JDBCTable<MySQLDataSource, MySQLCatalog>


    public List<MySQLTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntity;
        super(catalog, JDBCUtils.safeGetString(dbResult, 1), true);
    @Override
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    }
    public boolean isPartition() {
    }
    public MySQLTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
import java.util.Collections;
import org.jkiss.dbeaver.DBDatabaseException;
                        }
        throws DBException
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
 * limitations under the License.

import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private boolean isPartition;
    implements DBPNamedObject2,DBPRefreshableObject, MySQLSourceObject

            if (DBUtils.isHiddenObject(srcColumn)) {
    @NotNull
        List<MySQLTableColumn> columns = new ArrayList<>(childColumns);

    public String getDDL(DBRProgressMonitor monitor, Map<String, Object> options)
    }
 *
            MySQLTableColumn column = new MySQLTableColumn(monitor, this, srcColumn);
    {
                        } else {
    }
    public JDBCStructCache<MySQLCatalog, ? extends JDBCTable, ? extends JDBCTableColumn> getCache()
    public void setPartition(boolean partition) {
        }
    @Override
                    }

    {
    }
    {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        for (DBSEntityAttribute srcColumn : CommonUtils.safeCollection(source.getAttributes(monitor))) {
 *
 * you may not use this file except in compliance with the License.
    }
            return Collections.emptyList();
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
import java.util.ArrayList;
        }
    // Copy constructor
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return Collections.emptyList();
    protected MySQLTableBase(
        return columns;
    }

    @Override
            colCache.cacheObject(column);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.sql.SQLException;
            }
        return getContainer().getTableCache();

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!isPersisted()) {
            getContainer(),
            throw new DBDatabaseException(ex, getDataSource());
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
                "SHOW CREATE " + (isView() ? "VIEW" : "TABLE") + " " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {

                        if (isView()) {
 */
        // Copy columns
                    if (dbResult.next()) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        }
import org.jkiss.dbeaver.Log;
                            return dbResult.getString("Create View");
 *
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
import java.util.Map;
import org.jkiss.dbeaver.model.struct.DBStructUtils;

        if (childColumns == null) {
                            return dbResult.getString("Create Table");
{
        DBSObjectCache<MySQLTableBase, MySQLTableColumn> colCache = getContainer().getTableCache().getChildrenCache(this);

import org.jkiss.dbeaver.model.DBPNamedObject2;
        List<MySQLTableColumn> childColumns = getContainer().getTableCache().getChildren(monitor, getContainer(), this);
                        return "DDL is not available";
    @Override
        throws DBException

        isPartition = partition;
        } catch (SQLException ex) {
        DBSObjectCache<MySQLTableBase, MySQLTableColumn> childrenCache = getContainer().getTableCache().getChildrenCache(this);
    protected MySQLTableBase(MySQLCatalog catalog)
 * MySQLTable base
        super(catalog, false);
                continue;
 */
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
            try (PreparedStatement dbStat = session.prepareStatement(
}
    protected MySQLTableBase(DBRProgressMonitor monitor, MySQLCatalog catalog, DBSEntity source) throws DBException {
        }
    private static final Log log = Log.getLog(MySQLTableBase.class);
        throws DBException

