/**
    }

    {
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.ArrayList;

        if (!isFullyCached() && !monitor.isForceCacheUsage()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    abstract protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner)
        if (DBWorkbench.getPlatform().isUnitTestMode()) {
                                dbResult.close();
                if (!handleCacheReadError(e)) {

                    throw new DBException("Internal driver error", ex);
            throw new DBException(ModelMessages.error_not_connected_to_database);
 */
                                while (dbResult.next()) {

import org.jkiss.dbeaver.runtime.DBWorkbench;

 *
        }
        this.invalidateObjects(monitor, owner, new CacheIterator());
        if (dataSource == null) {
                        monitor.subTask("Load " + getCacheName());
                                    if (object == null || !isValidObject(monitor, owner, object)) {
import org.jkiss.dbeaver.model.DBUtils;

    {
        if (!isFullyCached() && !monitor.isForceCacheUsage()) {
        DBPDataSource dataSource = owner.getDataSource();
 * DBeaver - Universal Database Manager
 *

                        if (dbResult != null) {
    private static final Log log = Log.getLog(JDBCObjectCache.class);
                        JDBCResultSet dbResult = dbStat.getResultSet();
        }
    public void beforeCacheLoading(@NotNull JDBCSession session, OWNER owner) throws DBException {
            log.debug("[TEST] Skip cache read in test mode");

    protected String getCacheName() {
                                    if (monitor.isCanceled()) {
        return false;
        if (comparator != null && !CommonUtils.isEmpty(tmpObjectList)) {
    }
{
        }
        // Do nothing
    private static final int DEFAULT_MAX_CACHE_SIZE = 1000000;
                                    }
 * Unless required by applicable law or agreed to in writing, software

                    beforeCacheLoading(session, owner);
                                    OBJECT object = fetchObject(session, owner, dbResult);
                                }
    @NotNull
        if (isFullyCached() || monitor.isForceCacheUsage() || monitor.isCanceled()) {

    public List<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner)
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
                    try (JDBCStatement dbStat = prepareObjectsStatement(session, owner)) {
                }
                                        return;
                    } finally {
    @Override

import java.util.List;
    {
import org.jkiss.code.NotNull;
                        }
                                    // Do not log every object load. This overheats UI in case of long lists
 */
    // Can be implemented to provide custom cache error handler
            this.loadObjects(monitor, owner);
        Comparator<OBJECT> comparator = getListOrderComparator();

    }
                        dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            return;
    private int maximumCacheSize = DEFAULT_MAX_CACHE_SIZE;
            loadObjects(monitor, owner);
        return getCachedObject(name);
        List<OBJECT> tmpObjectList = new ArrayList<>();
    // Maximum number of objects in cache
                        dbStat.executeStatement();
                    throw new DBDatabaseException(ex, dataSource);
            // Load cache from database only for persisted objects
 * distributed under the License is distributed on an "AS IS" BASIS,
        throws DBException
    @NotNull
    }
    public void setMaximumCacheSize(int maximumCacheSize) {
 * limitations under the License.

        throws DBException
 * See the License for the specific language governing permissions and
        return getCachedObjects();
                                    //monitor.subTask(object.getName());
 * Licensed under the Apache License, Version 2.0 (the "License");
            } catch (Exception e) {
import java.util.Comparator;
                    }
import org.jkiss.dbeaver.DBException;
        throws DBException
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
                                    if (tmpObjectList.size() == maximumCacheSize) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBConstants;
            try {
    @NotNull

                }
 *
            }
import org.jkiss.dbeaver.model.messages.ModelMessages;
                        afterCacheLoading(session, owner);
        }
    abstract protected OBJECT fetchObject(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull JDBCResultSet resultSet)
    @Override
        detectCaseSensitivity(owner);

        throws SQLException;
        this.maximumCacheSize = maximumCacheSize;
                    throw e;

public abstract class JDBCObjectCache<OWNER extends DBSObject, OBJECT extends DBSObject> extends AbstractObjectCache<OWNER, OBJECT>
                            try {
            return;
    @Nullable
                                        log.warn("Maximum cache size exceeded (" + maximumCacheSize + ") in " + this);
import org.jkiss.dbeaver.model.DBPDataSource;
    }
                } catch (DBException ex) {
    }

}
    }
    public void afterCacheLoading(@NotNull JDBCSession session, OWNER owner) throws DBException {
    protected synchronized void loadObjects(DBRProgressMonitor monitor, OWNER owner)


                                    tmpObjectList.add(object);
package org.jkiss.dbeaver.model.impl.jdbc.cache;
        return getClass().getSimpleName();
        mergeCache(tmpObjectList);
            tmpObjectList.sort(comparator);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.DBDatabaseException;

/*
        }
        addCustomObjects(monitor, owner, tmpObjectList);
                            } finally {
import java.sql.SQLException;
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name)
    protected JDBCObjectCache() {
 * Simple cache which may read objects from database and keep them.
                } catch (SQLException ex) {
                    throw ex;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                } catch (Exception ex) {
                            }
    }
                                        continue;
                                    }
        throws SQLException, DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        if (owner.isPersisted()) {
                try (JDBCSession session = DBUtils.openMetaSession(monitor, owner, "Load objects from " + DBUtils.getObjectTypeName(owner) + " '" + owner.getName() + "'")) {
 * You may obtain a copy of the License at
        }
 * Various objects cache.
    }

                                    }
        // Do nothing
import org.jkiss.dbeaver.Log;
                                        break;

    protected boolean handleCacheReadError(@NotNull Exception error) {
import org.jkiss.utils.CommonUtils;
