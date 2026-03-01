
                childrenCache.put(parent, nestedCache);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, owner, "Load child objects")) {
 */
                                continue;
                            List<CHILD> children = objectMap.computeIfAbsent(object, k -> new ArrayList<>());

    public List<CHILD> getChildren(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, final OBJECT forObject) throws DBException {
            }
import org.jkiss.dbeaver.model.messages.ModelMessages;
    public CHILD getChild(@Nullable DBRProgressMonitor monitor, @NotNull OWNER owner, final OBJECT forObject, @NotNull String objectName) throws DBException {
import org.jkiss.dbeaver.DBException;
            loadChildren(monitor, owner, forObject);
                dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
                            CHILD child = fetchChild(session, owner, object, dbResult);
                // Create new empty children cache
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                // but possibly this feature is not supported [JDBC: SQLite]
                        for (Map.Entry<OBJECT, List<CHILD>> colEntry : objectMap.entrySet()) {
    public void clearChildrenCache(OBJECT forParent) {
            return childrenCache.containsKey(parent);
            super.loadObjects(monitor, owner);
                                // Now set empty column list for other tables
            SimpleObjectCache<OBJECT, CHILD> nestedCache = childrenCache.get(forObject);
        }
                nestedCache.setCache(new ArrayList<>());
                this.childrenCache.remove(forParent);

                        if (monitor.isCanceled()) {
            return nestedCache == null ? null : nestedCache.getAllObjects(monitor, null);
        if (monitor.isForceCacheUsage() || monitor.isCanceled() ||
    }
package org.jkiss.dbeaver.model.impl.jdbc.cache;
 * Unless required by applicable law or agreed to in writing, software

        }
import org.jkiss.dbeaver.model.DBConstants;
                                // just skip
            SimpleObjectCache<OBJECT, CHILD> nestedCache = childrenCache.get(forObject);
        throws SQLException;
                        }
            // We have to reuse them because there could be some references in cached model

    protected SimpleObjectCache<OBJECT, CHILD> createNestedCache() {
        }
                            return;
    }
import org.jkiss.dbeaver.model.struct.cache.SimpleObjectCache;
                                // Already read
            try (JDBCStatement dbStat = prepareChildrenStatement(session, owner, forObject)) {
import org.jkiss.dbeaver.model.struct.cache.DBSStructCache;
    @Nullable
     */
                                }

            nestedCache.setCache(children);
 * you may not use this file except in compliance with the License.
    }

                                    }
                            }
                // This may happen only when invoked for newly created object (e.g. when we create new column
                                    objectName = JDBCUtils.safeGetStringTrimmed(dbResult, objectNameColumn.toString());
                            children.add(child);

            // Load columns
                                for (OBJECT tmpObject : getAllObjects(monitor, owner)) {
                                    log.debug("Object '" + objectName + "' not found in struct cache (" + getClass().getSimpleName() + ")");
                JDBCResultSet dbResult = dbStat.getResultSet();
                this.childrenCache.clear();
                                }
    }
 * See the License for the specific language governing permissions and
     *             on error
     *            monitor
            SimpleObjectCache<OBJECT, CHILD> nestedCache = childrenCache.get(forObject);
                                if (objectNameColumn instanceof Number) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                                String objectName;

 */
                                    if (!isChildrenCached(tmpObject) && !objectMap.containsKey(tmpObject)) {
            }
    }
//            return chCache != null && !CommonUtils.isEmpty(chCache.getCachedObjects());
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Reads children objects from database
 *
                            if (objectMap.isEmpty()) {
/**
            return;
                        } else if (!objectMap.containsKey(forObject)) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*
     * Returns cache for child objects. Creates cache i it doesn't exists
                        }
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                                    continue;
    @NotNull
        if (!monitor.isForceCacheUsage()) {
     * @throws org.jkiss.dbeaver.DBException
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
import org.jkiss.code.NotNull;
        this.clearChildrenCache(null);
                                // isChildrenCached may return true if the same cache was read in other thread
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        synchronized (childrenCache) {
    extends JDBCObjectCache<OWNER, OBJECT>
import org.jkiss.code.Nullable;
                                if (object == null) {
                                // Nothing was read. May be it means empty list of children
                            if (child == null) {
        } catch (SQLException ex) {
        }
        }
                        }
    }
    abstract protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull OWNER owner, @Nullable OBJECT forObject)
                                    continue;
import org.jkiss.dbeaver.model.struct.DBSObject;
     *            object for which to read children. If null then reads children for all objects in this container.
import org.jkiss.dbeaver.Log;
        if (forObject == null) {
            throw new DBDatabaseException(ex, dataSource);
    protected boolean isChildrenCached(OBJECT parent) {
    /**
import java.util.*;
                            }
        if (dataSource == null) {
                                }
            if (nestedCache == null) {
                            }
                }
 * DBeaver - Universal Database Manager
            // If we have some child objects read before that - do not clear them.
            (forObject == null && this.childrenCached) ||
                                        cacheChildren(tmpObject, new ArrayList<>());
    @Override
            //clearChildrenCache(null);
    private final Object objectNameColumn;
                        }
        }
            }
    protected JDBCStructCache(Object objectNameColumn) {
        }
                                cacheChildren(colEntry.getKey(), colEntry.getValue());
    private static final Log log = Log.getLog(JDBCStructCache.class);
import org.jkiss.dbeaver.model.DBUtils;
                    }
            return nestedCache == null ? null : nestedCache.getObject(monitor, forObject, objectName);

     * @param forObject parent object
                                return;
        throws SQLException, DBException;
        synchronized (childrenCache) {
            return nestedCache;
        return nestedCache;
            if (nestedCache == null) {
                        // All children are read. Now assign them to parents
                    try {
        }
        synchronized (childrenCache) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
     * @return cache
                                this.childrenCached = true;
     * @param forObject
                dbStat.executeStatement();
        }
                            }
                                continue;
                                    objectName = JDBCUtils.safeGetString(dbResult, ((Number) objectNameColumn).intValue());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                                } else {
    }
    @Override
 * You may obtain a copy of the License at
        if (monitor != null) {

    private final Map<OBJECT, SimpleObjectCache<OBJECT, CHILD>> childrenCache = new IdentityHashMap<>();
                childrenCache.put(forObject, nestedCache);

            (forObject != null && (!forObject.isPersisted() || isChildrenCached(forObject)))) {
    public void removeObject(@NotNull OBJECT object, boolean resetFullCache) {
                            // Add to map
                            if (object == null) {
            if (forParent != null) {
                            OBJECT object = forObject;
import org.jkiss.dbeaver.model.DBPDataSource;
            } else {
                        while (dbResult.next()) {
                // in a new created table)
            Map<OBJECT, List<CHILD>> objectMap = new HashMap<>();
        nestedCache.setCaseSensitive(caseSensitive);

            throw new DBException(ModelMessages.error_not_connected_to_database);
        super.removeObject(object, resetFullCache);
    }
        super.clearCache();
        this.objectNameColumn = objectNameColumn;
                if (dbResult != null) {
                            if (isChildrenCached(object)) {
 * limitations under the License.

                nestedCache = this.createNestedCache();
                    } finally {
            SimpleObjectCache<OBJECT, CHILD> nestedCache = childrenCache.get(parent);
                            } else {
                            }
        clearChildrenCache(object);

    @Nullable
    abstract protected CHILD fetchChild(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull OBJECT parent, @NotNull JDBCResultSet dbResult)

 *

                                }
     * @param monitor
        }
        synchronized (childrenCache) {
import java.sql.SQLException;
    private volatile boolean childrenCached = false;
                            cacheChildren(forObject, new ArrayList<>());
                            }

     *
        SimpleObjectCache<OBJECT, CHILD> nestedCache = new SimpleObjectCache<>();
                        if (forObject == null) {
        DBPDataSource dataSource = owner.getDataSource();
     *
    protected void cacheChildren(OBJECT parent, List<CHILD> children) {
                                if (objectName == null) {
    public void clearCache() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        dbResult.close();
import org.jkiss.dbeaver.DBDatabaseException;

 *     http://www.apache.org/licenses/LICENSE-2.0
                            if (monitor.isCanceled()) {
        synchronized (childrenCache) {
    public synchronized void loadChildren(DBRProgressMonitor monitor, OWNER owner, @Nullable final OBJECT forObject) throws DBException {
                            if (!isChildrenCached(colEntry.getKey())) {
            loadChildren(monitor, owner, forObject);
     */
//            SimpleObjectCache<OBJECT, CHILD> chCache = childrenCache.get(parent);
        }
        }
 *

                                    log.debug("NULL object name in " + this);
 * JDBC structured objects cache.
        synchronized (childrenCache) {
            childrenCached = false;
    }


}    public DBSObjectCache<OBJECT, CHILD> getChildrenCache(@NotNull final OBJECT forObject) {
                nestedCache = this.createNestedCache();
    /**
    implements DBSStructCache<OWNER, OBJECT, CHILD> {
    }

 * Stores objects themselves and their child objects.
public abstract class JDBCStructCache<OWNER extends DBSObject, OBJECT extends DBSObject, CHILD extends DBSObject>
                                object = super.getCachedObject(objectName);
