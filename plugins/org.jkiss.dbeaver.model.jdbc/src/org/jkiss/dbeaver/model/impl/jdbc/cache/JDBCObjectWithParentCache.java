                if (dbResult != null) try {

    private final Class<PARENT> parentType;
                            if (objMap != null) {
        }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, owner, "Load parent and object objects")) {
    private final Map<PARENT, List<OBJECT>> objectCache = new IdentityHashMap<>();
                } finally {
            if (monitor.isForceCacheUsage() ||
        synchronized (objectCache) {
    }
            objectCache.clear();
import org.jkiss.code.Nullable;
                    super.removeObject(obj, false);

                        // Save precached objects in global cache
    }
                for (OBJECT obj : removedObjects) {
            return;

                        if (parent == null) {
        } else {
                    objectCache.put(colEntry.getKey(), objects);
        super.cacheObject(object);
            objectCache.clear();
                            }


    @Override
        }
    public void removeObject(@NotNull OBJECT object, boolean resetFullCache) {
        throws DBException {
            } else {
    public void clearCache() {
            super.clearCache();
 * distributed under the License is distributed on an "AS IS" BASIS,
                            parent = parentCache.getObject(monitor, owner, parentName, parentType);
                        }
                            objectCache.put(tmpParent, new ArrayList<>());
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
            PARENT parent = getParent(object);
    private final JDBCStructCache<OWNER, ?, ?> parentCache;
                        if (monitor.isCanceled()) {
    @NotNull
import org.jkiss.utils.CommonUtils;
    private final Object objectColumnName;
    }
        if (monitor.isCanceled()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                    objectCache.put(forParent, new ArrayList<>());
        synchronized (this) {
                            }
                                log.debug("Parent object '" + parentName + "' not found");
        Map<PARENT, Map<String, OBJECT>> parentObjectMap = new LinkedHashMap<>();
        }

import org.jkiss.code.NotNull;
                }
                List<OBJECT> parentObjects = objectCache.computeIfAbsent(parent, k -> new ArrayList<>());
                parentObjects.add(object);
            } finally {
                }

                            JDBCUtils.safeGetStringTrimmed(dbResult, objectColumnName.toString());
    }
            synchronized (objectCache) {
                return;
 * You may obtain a copy of the License at
                    objects.addAll(objectInfos);

            this.objectCache.clear();
                    }
            } else {
}
        loadObjects(monitor, owner, forParent);
                // Otherwise we assume that this function is not supported for mass data reading
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                List<OBJECT> subCache = objectCache.get(parent);
    public void cacheObject(@NotNull OBJECT object) {
public abstract class JDBCObjectWithParentCache<OWNER extends DBSObject, PARENT extends DBSObject, OBJECT extends DBSObject> extends AbstractObjectCache<OWNER, OBJECT>
    public List<OBJECT> getCachedObjects(@Nullable PARENT forParent) {
            for (OBJECT object : objects) {
 *
        super.removeObject(object, resetFullCache);
        JDBCStructCache<OWNER, ?, ?> parentCache,
    @Override
        if (forParent == null) {
    public List<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner)
                            if (object == null || !isValidObject(monitor, owner, object)) {

 * See the License for the specific language governing permissions and
                // Cache data in individual objects only if we have read something or have certain parent object

    @Override
        super.setCache(objects);
        }
            }
                                JDBCUtils.safeGetStringTrimmed(dbResult, parentColumnName.toString()));
            objects.add(object);
        if (!monitor.isCanceled() && !monitor.isForceCacheUsage()) {
                    if (colEntry.getValue() == null || objectCache.containsKey(colEntry.getKey())) {
                            (parentColumnName instanceof Number ?

    public OBJECT getObject(DBRProgressMonitor monitor, OWNER owner, PARENT forParent, String objectName)
                        }
 *
                    while (dbResult.next()) {
                if (forParent != null || !parentObjectMap.isEmpty()) {
                    }
            }
        } catch (SQLException ex) {
        throws DBException {
        synchronized (objectCache) {
            }
        // Load parents first
                        PARENT parent = forParent;
        synchronized (objectCache) {
                        // Do not overwrite this object's cache
                throw new DBDatabaseException(ex, dataSource);
    @Override
        throws DBException {

            }
                            forParent.getName() :
        }
    implements DBSCompositeCache<PARENT, OBJECT> {
    private final Object parentColumnName;
    public List<OBJECT> getObjects(@NotNull DBRProgressMonitor monitor, OWNER owner, PARENT forParent)
import org.jkiss.dbeaver.DBException;
        return getCachedObject(objectName);
        }
    protected void loadObjects(@NotNull DBRProgressMonitor monitor, OWNER owner, @Nullable PARENT forParent)
    protected static final Log log = Log.getLog(JDBCObjectWithParentCache.class);
                        continue;
            monitor.done();
        this.objectColumnName = objectColumnName;
    }
                return DBUtils.findObject(objectCache.get(forParent), objectName);

            PARENT parent = getParent(object);
 * DBeaver - Universal Database Manager
        throws SQLException;
import java.util.*;
        loadObjects(monitor, owner, null);
        } else {
                }


                        // Add precached objects to global cache too
                if (subCache != null) {
                                globalCache.addAll(objMap.values());
    abstract protected OBJECT fetchObject(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull PARENT parent, String childName, @NotNull JDBCResultSet resultSet)
                    subCache.remove(object);
                            if (objectCache.containsKey(parent)) {
        }
package org.jkiss.dbeaver.model.impl.jdbc.cache;
                            globalCache.addAll(objects);
    @Override
            return getCachedObjects();
        if (forParent == null) {
        } else {
 * you may not use this file except in compliance with the License.
                    if (forParent == null) {
import org.jkiss.dbeaver.DBDatabaseException;
                        }
                } else if (!parentObjectMap.containsKey(forParent) && !objectCache.containsKey(forParent)) {
                JDBCResultSet dbResult = dbStat.getResultSet();
                        }

import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.DBUtils;
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
                            if (parent == null) {
                        for (List<OBJECT> objects : objectCache.values()) {
        throws SQLException, DBException;
    abstract protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner, @Nullable PARENT forParent)
        } finally {
                        }


        return (PARENT) object.getParentObject();
                    for (PARENT tmpParent : parentCache.getTypedObjects(monitor, owner, parentType)) {


 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                        for (Map<String, OBJECT> objMap : parentObjectMap.values()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
    }
    }
    }
        synchronized (objectCache) {
                        if (!parentObjectMap.containsKey(tmpParent) && !objectCache.containsKey(tmpParent)) {

            }
                                JDBCUtils.safeGetString(dbResult, ((Number) parentColumnName).intValue()) :
            if (JDBCUtils.isFeatureNotSupportedError(owner.getDataSource(), ex)) {
            }
 */
                            log.debug("Empty parent name in " + this);
 *
                dbStat.close();
    public void clearObjectCache(@NotNull PARENT forParent) {
    public void setCache(@NotNull List<OBJECT> objects) {
            JDBCStatement dbStat = prepareObjectsStatement(session, owner, forParent);
                    ArrayList<OBJECT> objects = new ArrayList<>(objectInfos.size());
                    Collection<OBJECT> objectInfos = colEntry.getValue().values();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        String parentName = forParent != null ?
                        if (objectInfo == null) {
                }
                DBPDataSource dataSource = owner.getDataSource();
                        super.setCache(globalCache);
                            }
        }

                            continue;
 * limitations under the License.

        throws DBException {
                dbStat.executeStatement();
                                continue;
                objectCache.remove(parent);
            if (removedObjects != null) {
        if (forParent == null) {
                                // Can't fetch object
import org.jkiss.dbeaver.Log;

            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);

                        OBJECT objectInfo = objectMap.get(objectName);
                                continue;
                            // No parent - can't evaluate it
 * Unless required by applicable law or agreed to in writing, software
    protected JDBCObjectWithParentCache(
        return getObjects(monitor, owner, null);
            try {
                        }
                        Map<String, OBJECT> objectMap = parentObjectMap.computeIfAbsent(parent, k -> new TreeMap<>());
 */
            synchronized (objectCache) {
        }
        this.parentType = parentType;
                        }
                        List<OBJECT> globalCache = new ArrayList<>();
                }
            }
                        this.invalidateObjects(monitor, owner, new CacheIterator());
                        String objectName = objectColumnName instanceof Number ?
                log.debug("Error reading cache " + getClass().getSimpleName() + ", feature not supported: " + ex.getMessage());
                            OBJECT object = fetchObject(session, owner, parent, objectName, dbResult);
            synchronized (objectCache) {
                    }
 *  This is basically cropped copy of JDBCCompositeCache, but without object children. Created specially for triggers.
                            }
            parentCache.loadObjects(monitor, owner);
        }
            List<OBJECT> objects = objectCache.computeIfAbsent(parent, k -> new ArrayList<>());
            return getCachedObject(objectName);
    }
        return getCachedObjects(forParent);
                if (forParent == null) {
        monitor.beginTask("Load parent and object cache", 1);

        Class<PARENT> parentType,



    }
                (forParent == null && isFullyCached()) ||
        super.clearCache();
                            return;

            if (resetFullCache) {
                        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @NotNull
import java.sql.SQLException;
        synchronized (objectCache) {
                    dbResult.close();
        this.parentCache = parentCache;
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSObject;
                // All objects are read. Now assign them to parents
/**
    protected PARENT getParent(OBJECT object) {
        }

        this.parentColumnName = parentColumnName;
            loadObjects(monitor, owner, forParent);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (forParent == null && CommonUtils.isEmpty(parentName)) {
            List<OBJECT> removedObjects = objectCache.remove(forParent);
        // Fill global cache

import org.jkiss.dbeaver.model.DBPDataSource;
        Object parentColumnName,
        }
                            objectName = object.getName();
                                continue;

                PARENT parent = getParent(object);
                        // Cache global object list
                            objectMap.put(objectName, objectInfo);
                // Now set empty object list for other parents
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
        if (forParent == null) {
                            JDBCUtils.safeGetString(dbResult, ((Number) objectColumnName).intValue()) :
        }
                        synchronized (objectCache) {
                            objectInfo = object;
                return objectCache.get(forParent);
                }
import org.jkiss.dbeaver.model.struct.cache.DBSCompositeCache;
        Object objectColumnName) {
                (forParent != null && (!forParent.isPersisted() || objectCache.containsKey(forParent)))) {
                        // Add to map
    }
                for (Map.Entry<PARENT, Map<String, OBJECT>> colEntry : parentObjectMap.entrySet()) {
        throws DBException {
    }
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String objectName)

                                // Already cached
    @Override
