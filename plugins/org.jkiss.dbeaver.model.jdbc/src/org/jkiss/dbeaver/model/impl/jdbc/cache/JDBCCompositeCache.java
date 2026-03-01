        if (forParent == null) {
        return false;
    {
                (forParent != null && (!forParent.isPersisted() || objectCache.containsKey(forParent))))
                                if (!isEmptyObjectRowsAllowed()) {
            synchronized (objectCache) {

                                        globalCache.add(info.object);
                            String parentName = forParent != null ?
                                if (row != null) {
                // All objects are read. Now assign them to parents
                                }
                                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                if (parent == null) {
        public boolean needsCaching;
        } finally {
                        objectInfo.rows.sort((Comparator<? super ROW_REF>) DBUtils.orderComparator());
            return getCachedObjects();
                if (forParent != null || !parentObjectMap.isEmpty()) {
    }
                PARENT parent = getParent(object);
                            }
        @NotNull JDBCResultSet resultSet
                if (type.isInstance(object)) {
                objectCache.remove(parent);
    {
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String objectName)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private static final String DEFAULT_OBJECT_NAME = "#DBOBJ";
import org.jkiss.code.Nullable;
 * Composite objects cache.
                dbStat.executeStatement();
                    for (List<OBJECT> children : objectCache.values()) {
                    objectCache.put(colEntry.getKey(), objects);
                                objectName = getDefaultObjectName(dbResult, parentName);
                    } finally {
/**
    }
        }
        }
    public List<OBJECT> getObjects(@NotNull DBRProgressMonitor monitor, OWNER owner, PARENT forParent)
                            }
                                forParent.getName() :
                            if (CommonUtils.isEmpty(objectName)) {
            for (OBJECT object : objects) {

        @NotNull JDBCSession session,
                                if (objectCache.containsKey(parent)) {
                return DBUtils.findObject(objectCache.get(forParent), objectName);
        loadObjects(monitor, owner, null);
        if (!monitor.isCanceled() && !monitor.isForceCacheUsage()) {
        Object objectColumnName)
                parentObjects.add(object);
    }
                    }
        synchronized (objectCache) {
                                if (object == null || !isValidObject(monitor, owner, object)) {
    abstract protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull OBJECT object, @NotNull List<ROW_REF> children);
                if (!objectCache.isEmpty()) {
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
        assert (dataSource != null);
                        cacheChildren(monitor, objectInfo.object, objectInfo.rows);
                    objectCache.put(forParent, new ArrayList<>());
                    }
 * Each row object refers to some other DB objects.
                                OBJECT object = fetchObject(session, owner, parent, objectName, dbResult);
                                JDBCUtils.safeGetStringTrimmed(dbResult, objectColumnName.toString());
    {


        super.removeObject(object, resetFullCache);
        }
    {
                            ROW_REF[] rowRef = fetchObjectRow(session, parent, objectInfo.object, dbResult);
 * Examples: table index, constraint.

        }
            objectCache.clear();
            if (resetFullCache) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

    abstract protected ROW_REF[] fetchObjectRow(
                        // Save precached objects in global cache
        super.cacheObject(object);
                        continue;

                        dbResult.close();
                }
                dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
        if (objects != null) {
    }
                    Collection<ObjectInfo> objectInfos = colEntry.getValue().values();
                        // Cache global object list
                        // Add precached objects to global cache too
            }
import org.jkiss.dbeaver.model.DBPDataSource;
            }
        List<OBJECT> objects = getObjects(monitor, owner, forParent);
 *
import org.jkiss.dbeaver.model.DBUtils;
 * you may not use this file except in compliance with the License.

    {
        }
        this.objectColumnName = objectColumnName;

        synchronized (objectCache) {
                                    continue;
        if (removedObjects != null) {
        synchronized (objectCache) {
    }
import java.sql.SQLException;
            for (OBJECT obj : removedObjects) {
            parentCache.loadObjects(monitor, owner);
                    for (PARENT tmpParent : parentCache.getTypedObjects(monitor, owner, parentType)) {

    }
                    if (objectInfo.rows.size() > 1 && objectInfo.rows.getFirst() instanceof DBPObjectWithOrdinalPosition) {
        return getObjects(monitor, owner, null);
            try (JDBCStatement dbStat = prepareObjectsStatement(session, owner, forParent)) {
            }
                                    }
        final List<ROW_REF> rows = new ArrayList<>();
        super.setCache(objects);
        {

                                return;
    public void setCache(@NotNull List<OBJECT> objects) {
    }
                                }
    @Override
                            ObjectInfo objectInfo = objectMap.get(objectName);
                // Cache data in individual objects only if we have read something or have certain parent object

            this.objectCache.clear();
            {
            }
            for (Map.Entry<PARENT, Map<String, ObjectInfo>> colEntry : parentObjectMap.entrySet()) {

                            }
                }

    }
                    // Sort rows using order comparator
                            synchronized (objectCache) {
    PARENT extends DBSObject,
                log.debug("Error reading cache " + getClass().getSimpleName() + ", feature not supported: " + ex.getMessage());
 * DBeaver - Universal Database Manager
 * Each composite object consists from several rows.

    }
                            if (objMap != null) {

import org.jkiss.dbeaver.model.struct.DBSObject;
                for (ObjectInfo objectInfo : colEntry.getValue().values()) {
                                }
                        }
                            objectCache.put(tmpParent, new ArrayList<>());
        this.parentType = parentType;
        Object parentColumnName,
                    }
        } else {
    // Second cache function. Needed for complex entities which refers to each other (foreign keys)
            // Cache children lists (we do it in the end because children caching may operate with other model objects)
 * <p>
    @Override
                            for (ROW_REF row : rowRef) {
                            }
        // Load tables and columns first

        }
 * See the License for the specific language governing permissions and
        monitor.beginTask("Load composite cache", 1);
                                    // So entire object is broken, let's just skip it.

            }
            }

    // Checks whether object may not have any children or this situation should be treated as an error.

            loadObjects(monitor, owner, forParent);
                for (ObjectInfo objectInfo : colEntry.getValue().values()) {
        @NotNull JDBCSession session,
    {
        synchronized (this) {
    ) throws SQLException;
    }
    @Override

        // Load index columns
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @Nullable PARENT forParent, @NotNull String objectName)

            return getCachedObject(objectName);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            parentCache.loadChildren(monitor, owner, null);
}
                                continue;
                            }
                                    // Already cached
                throw new DBDatabaseException(ex, dataSource);

            } else {
            for (Map.Entry<PARENT, Map<String, ObjectInfo>> colEntry : parentObjectMap.entrySet()) {
            return;
    protected String getDefaultObjectName(JDBCResultSet dbResult, String parentName) {
                    if (forParent == null) {
    {
                    if (objectInfo.needsCaching) {
    {
    abstract protected OBJECT fetchObject(
                            if (rowRef == null || rowRef.length == 0) {
    }
        final OBJECT object;
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
    ROW_REF extends DBSObject>
            this.object = object;
            } else {
    }
        }
        throws DBException
                    List<OBJECT> objects = new ArrayList<>(objectInfos.size());
                        }
                }
        this.parentCache = parentCache;
        public ObjectInfo(OBJECT object)
                                objectInfo = new ObjectInfo(object);
                    return allChildren;

                                    if (!info.broken) {
                            PARENT parent = forParent;
 */
            if (monitor.isForceCacheUsage() ||
            }
                    // Collect objects from object cache
    @Nullable
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull OWNER owner,
    public List<OBJECT> getCachedObjects(@Nullable PARENT forParent)
        return (PARENT) object.getParentObject();
            }
        }
            }
    public void clearObjectCache(@NotNull PARENT forParent) {
                    }
                if (subCache != null) {

                        if (!parentObjectMap.containsKey(tmpParent) && !objectCache.containsKey(tmpParent)) {
                            }
                        while (dbResult.next()) {
                                    continue;
                                    // At least one of rows is broken.
                // Now set empty object list for other parents
    @Override
        }
    @Override
        } else {
        }

    }
        throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    OBJECT extends DBSObject,
        @NotNull OBJECT forObject,
        return parentName == null ? DEFAULT_OBJECT_NAME : parentName.toUpperCase() + "_" + DEFAULT_OBJECT_NAME;
                        }
    private final Class<PARENT> parentType;
import java.util.*;
                            }
        }
            log.debug("[TEST] Skip composite cache read in test mode");
                if (dbResult != null)
 */
        throws DBException
                    List<OBJECT> allChildren = new ArrayList<>();

                    if (colEntry.getValue() == null || objectCache.containsKey(colEntry.getKey())) {
    }
 * limitations under the License.
        if (forParent == null) {
        @NotNull JDBCResultSet resultSet
                }
        } catch (SQLException ex) {
                        objectInfo.needsCaching = true;
                                    objectInfo.rows.add(row);
    @Override
        @NotNull String childName,
                                    continue;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                        cacheChildren2(monitor, objectInfo.object, objectInfo.rows);
        if (DBWorkbench.getPlatform().isUnitTestMode()) {
            synchronized (objectCache) {
            }
                        // Do not overwrite this object's cache
    @Override
{

        synchronized (objectCache) {

        throws DBException
            monitor.done();
                                // No parent - can't evaluate it

                }
                                continue;
        throws DBException
    }
        List<TYPE> result = new ArrayList<>();
            }
                (forParent == null && isFullyCached()) ||
            List<OBJECT> objects = objectCache.computeIfAbsent(parent, k -> new ArrayList<>());
    }
                        allChildren.addAll(children);
    protected JDBCCompositeCache(
        @NotNull PARENT parent,
                        objects.add(objectInfo.object);
import org.jkiss.dbeaver.model.DBPObjectWithOrdinalPosition;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, owner, "Load composite objects")) {
                } else if (!parentObjectMap.containsKey(forParent) && !objectCache.containsKey(forParent)) {
                                }
    ) throws SQLException, DBException;
                                log.debug("Empty parent name in " + this);
        if (forParent == null) {
                            if (monitor.isCanceled()) {
 *
                    }
                if (forParent == null) {
                super.removeObject(obj, false);
    private final JDBCStructCache<OWNER,?,?> parentCache;
    {
        }
        loadObjects(monitor, owner, forParent);
                                    //log.debug("Object '" + objectName + "' metadata corrupted - NULL child returned");
                    }
    public List<OBJECT> getAllObjects(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner)
    implements DBSCompositeCache<PARENT, OBJECT>
    }
 *
        @Nullable PARENT forParent
    public <TYPE extends OBJECT> List<TYPE > getTypedObjects(@NotNull DBRProgressMonitor monitor, OWNER owner, PARENT forParent, Class<TYPE> type)
                }
                                }
                            Map<String, ObjectInfo> objectMap = parentObjectMap.computeIfAbsent(parent, k -> new TreeMap<>());
    public void removeObject(@NotNull OBJECT object, boolean resetFullCache)

        DBPDataSource dataSource = owner.getDataSource();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        @NotNull JDBCSession session,
        }
        List<OBJECT> removedObjects = objectCache.remove(forParent);
package org.jkiss.dbeaver.model.impl.jdbc.cache;
    extends AbstractObjectCache<OWNER, OBJECT>
                        this.invalidateObjects(monitor, owner, new CacheIterator());
    {
                    result.add(type.cast(object));
                            globalCache.addAll(objects);
        synchronized (objectCache) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                            // Add to map
                }

    protected PARENT getParent(@NotNull OBJECT object)
        public boolean broken;
 * Each row object name is unique within main object.
                            }
    private final Map<PARENT, List<OBJECT>> objectCache = new LinkedHashMap<>();
                    }
                            }
/*
import org.jkiss.dbeaver.model.struct.cache.DBSCompositeCache;
    private final Object parentColumnName;


 * Each composite object belongs to some parent object (table usually) and it's name is unique within it's parent.
        @NotNull PARENT parent,
    }
            }
                return;
import org.jkiss.dbeaver.DBDatabaseException;
                        }
    @Override


                                    objectInfo.broken = true;
                    if (objectInfo.needsCaching) {
        Map<PARENT, Map<String, ObjectInfo>> parentObjectMap = new LinkedHashMap<>();
                    }
                    try {
                // Otherwise we assume that this function is not supported for mass data reading
                            String objectName = objectColumnName instanceof Number ?
        return getCachedObjects(forParent);
    {
                for (Map.Entry<PARENT, Map<String, ObjectInfo>> colEntry : parentObjectMap.entrySet()) {
        throws DBException
                                objectName = object.getName();

                }
    private final Object objectColumnName;
        return getCachedObject(objectName);
                                (parentColumnName instanceof Number ?
        @NotNull OWNER owner,

                        for (Map<String, ObjectInfo> objMap : parentObjectMap.values()) {
            return;
        if (monitor.isCanceled()) {
    @NotNull
    protected boolean isEmptyObjectRowsAllowed() {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;
    protected void cacheChildren2(@NotNull DBRProgressMonitor monitor, @NotNull OBJECT object, @NotNull List<ROW_REF> children) {
    public void cacheObject(@NotNull OBJECT object)
                List<OBJECT> subCache = objectCache.get(parent);
                                objectMap.put(objectName, objectInfo);
    // First cache must cache all unique constraint, second must cache foreign keys references which refers unique keys
        this.parentColumnName = parentColumnName;

                                for (ObjectInfo info : objMap.values()) {
                JDBCResultSet dbResult = dbStat.getResultSet();
    ) throws SQLException, DBException;
                            if (objectInfo == null) {
import org.jkiss.utils.CommonUtils;
        // Fill global cache
public abstract class JDBCCompositeCache<
                                JDBCUtils.safeGetString(dbResult, ((Number) objectColumnName).intValue()) :

                return objectCache.get(forParent);
                    }
        }
    protected static final Log log = Log.getLog(JDBCCompositeCache.class);

                            if (forParent == null && CommonUtils.isEmpty(parentName)) {
            synchronized (objectCache) {
            if (JDBCUtils.isFeatureNotSupportedError(dataSource, ex)) {
            for (OBJECT object : objects) {
        super.clearCache();
                                // Use default name
    private class ObjectInfo {

                                    JDBCUtils.safeGetStringTrimmed(dbResult, parentColumnName.toString()));
            objects.add(object);
    protected void loadObjects(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @Nullable PARENT forParent)

 * Unless required by applicable law or agreed to in writing, software
        }
    abstract protected JDBCStatement prepareObjectsStatement(
        JDBCStructCache<OWNER,?,?> parentCache,
        }
                    for (ObjectInfo objectInfo : objectInfos) {
    OWNER extends DBSObject,
                            if (parent == null) {

            }
        Class<PARENT> parentType,
                                parent = parentCache.getObject(monitor, owner, parentName, parentType);
        return result;
    public void clearCache() {
                                    log.debug("Object '" + objectName + "' owner '" + parentName + "' not found");
 * Licensed under the Apache License, Version 2.0 (the "License");
                    subCache.remove(object);
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.code.NotNull;
                        super.setCache(globalCache);
 * You may obtain a copy of the License at
                        List<OBJECT> globalCache = new ArrayList<>();
                                    JDBCUtils.safeGetString(dbResult, ((Number) parentColumnName).intValue()) :
            PARENT parent = getParent(object);
                        for (List<OBJECT> objects : objectCache.values()) {
                                    // Can't fetch object
            synchronized (objectCache) {
                List<OBJECT> parentObjects = objectCache.computeIfAbsent(parent, k -> new ArrayList<>());
            PARENT parent = getParent(object);
