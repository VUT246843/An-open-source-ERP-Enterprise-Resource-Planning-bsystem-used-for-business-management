                for (Field field : fields) {
    protected class CacheIterator implements Iterator<OBJECT> {
            if (objectMap != null) {
    protected void deepCopyCachedObject(@NotNull Object srcObject, @NotNull Object dstObject) {
                this.objectMap = new HashMap<>();
                            ((DBSObjectCache<?, ?>) dstValue).clearCache();
            return null;
            this.objectList = objects;
     *                   It can be modified by this functions
import org.jkiss.dbeaver.model.*;
        synchronized (cacheSync) {
        }
        }

/*
    }
    @Override
import java.lang.reflect.Field;
    private final Object cacheSync = new Object();
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        return false;
    public <SUB_TYPE> SUB_TYPE getObject(DBRProgressMonitor monitor, OWNER owner, String name, Class<SUB_TYPE> type)
 */
        throws DBException {
        for (Method getter : field.getDeclaringClass().getMethods()) {
            if (this.objectList != null) {
            this.fullCache = true;
        }

    protected String getObjectName(@NotNull OBJECT object) {
            if (dataSource != null &&
    }
                    final int modifiers = field.getModifiers();

    @NotNull
                    final Object dstValue = field.get(dstObject);


 * DBeaver - Universal Database Manager
        }
                }
        if (!caseSensitive) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (this.objectMap.containsKey(name)) {
    }
        return this.fullCache;
    }
            }
    }

    public void removeObject(@NotNull OBJECT object, boolean resetFullCache) {
        }
            return objectList == null ? 0 : objectList.size();
        return false;
/**
        if (name == null) {
        if (object instanceof DBPUniqueObject) {
            if (this.objectList == null) {
import org.jkiss.code.Nullable;
    @Override
    public OBJECT getCachedObject(@Nullable String name) {
        }

    }
                    if (checkDuplicateName(name, object)) {
            if (resetFullCache) {
        return true;
            name = ((DBPUniqueObject) object).getUniqueName();
import java.lang.reflect.Modifier;
    /**
    public void setCache(@NotNull List<OBJECT> objects) {
            }
                    this.objectMap.remove(getObjectName(object));
            return listIterator.hasNext();
        @NotNull DBRProgressMonitor monitor,
                    detectCaseSensitivity(objectList.getFirst());
        synchronized (cacheSync) {


     * (because they might be referenced somewhere).
                   (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == DBRProgressMonitor.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
     *
                String name = getObjectName(object);
        final OBJECT object = getObject(monitor, owner, name);
import org.jkiss.dbeaver.model.meta.PropertyGroup;
                            if (dstValue != null && srcValue != null && dstValue.getClass() == srcValue.getClass()) {

                            break;
 *
    }
    public void cacheObject(@NotNull OBJECT object) {
import org.jkiss.utils.BeanUtils;
            listIterator.remove();
    }
    }
            if (getter.getName().equals(getterName) &&
    }
                for (OBJECT object : objectList) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                }
    public static boolean isPropertyGetter(Method method) {
                this.objectList.remove(object);

        this.caseSensitive = caseSensitive;
                    field.setAccessible(true);
        return result;
                objects = new ArrayList<>(objects);
    protected void mergeCache(List<OBJECT> objects) {
    protected volatile boolean caseSensitive = true;
        } else {
import java.util.*;
                    final Object srcValue = field.get(srcObject);
            }
    public List<OBJECT> getCachedObjects() {
            log.error("Can't make object copy: src class " + srcObject.getClass().getName() + "' != dest class '" + dstObject.getClass().getName() + "'");
    }
            return;
        synchronized (cacheSync) {
        synchronized (cacheSync) {
        String getterName = "get" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1);
            this.objectMap = null;
 */
    }
    }
                    fullCache = false;
            return isValidDuplicateObject(object);
    protected volatile boolean fullCache = false;
        return name;
    public void renameObject(@NotNull OBJECT object, @NotNull String oldName, @NotNull String newName) {
public abstract class AbstractObjectCache<OWNER extends DBSObject, OBJECT extends DBSObject>
            }
    @Nullable
 * limitations under the License.
    implements DBSObjectCache<OWNER, OBJECT> {
                final Field[] fields = theClass.getDeclaredFields();
    public int getCacheSize() {
     * Copies all fields (recursively) and clears all nested caches
 * you may not use this file except in compliance with the License.
            }
                } else {
                        } else {
                result.add(type.cast(object));
                    String newObjectName = newObject.getName();
            return method.getParameterTypes().length == 0 ||
                this.caseSensitive = false;

    protected boolean isValidDuplicateObject(OBJECT object) {
        private final Iterator<OBJECT> listIterator = objectList.iterator();
                        if (newObjectName.equals(oldObjectName)) {
            if (this.objectMap != null) {
                        this.objectMap.remove(getObjectName(object));
                return;
    protected void detectCaseSensitivity(DBSObject object) {
        return listOrderComparator;
        }

                    }
    }

                dataSource.getSQLDialect().storesUnquotedCase() == DBPIdentifierCase.MIXED) {
        @Override
                        String oldObjectName = oldObject.getName();
                    oldName = oldName.toUpperCase(Locale.ENGLISH);
    }
                isPropertyGetter(getter) &&
        List<SUB_TYPE> result = new ArrayList<>();
                    this.objectList.remove(object);
        }
    /**
        }
                            // Ignore final fields

            this.fullCache = false;

        }
        if (srcObject.getClass() != dstObject.getClass()) {
        throws DBException {
            return (curObject = listIterator.next());
                        }
        }
                if (this.objectMap != null) {
        if (BeanUtils.isGetterName(method.getName())) {
        }
     */
        synchronized (cacheSync) {

                            }
                }
                    i++;
            if (objectList == null) {
            if (this.objectMap != null) {
    protected void invalidateObjects(DBRProgressMonitor monitor, OWNER owner, Iterator<OBJECT> objectIter) throws DBException {
        synchronized (cacheSync) {
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean isFullyCached() {
        }
                            ((Collection<?>) dstValue).clear();
                        this.objectMap.put(name, object);
    }
    public Object getCacheSync() {

            return objectList == null || name == null ? null : getObjectMap().get(caseSensitive ? name : name.toUpperCase());
        @NotNull OWNER owner,
    // Use this monitor to void entire cache object locking
    private static final Log log = Log.getLog(AbstractObjectCache.class);

            if (type.isInstance(object)) {

        @Override
    public void clearChildrenOf(DBSObject parent) {
        return type.isInstance(object) ? type.cast(object) : null;
                    } else {
    public Comparator<OBJECT> getListOrderComparator() {
        }

    public void setListOrderComparator(Comparator<OBJECT> listOrderComparator) {
                objectMap.remove(getObjectName(curObject));
    }
     * Performs a deep copy of srcObject into dstObject.

                }
                }
    @Nullable
    protected AbstractObjectCache() {
                        continue;
                    if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers)) {
                        if (dstValue != null) {
                this.objectList = new ArrayList<>();

                    if (DBSObjectCache.class.isAssignableFrom(field.getType())) {
        }
        String name;
     */
            }
        }
    public void clearCache() {
        return CommonUtils.isEmpty(objectList);
            for (int i = 0; i < objectList.size(); ) {
            }
                    }
    private Map<String, OBJECT> getObjectMap() {
        synchronized (cacheSync) {
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.model.struct.cache;
 *
                detectCaseSensitivity(object);
                    } else if (Collection.class.isAssignableFrom(field.getType())) {
        }
                    }
                    this.objectMap.put(name, object);

            log.debug("Duplicate object name '" + name + "' in cache " + this.getClass().getSimpleName() + ". Last value: " + DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL));
        this.listOrderComparator = listOrderComparator;

        return true;
        }
                            // Just in case check that values not null and have the same type
    protected boolean isValidObject(@NotNull DBRProgressMonitor monitor, @Nullable OWNER owner, @NotNull OBJECT object) throws DBException {
                if (object.getParentObject() == parent) {
                            // This is a group of properties. Copy recursively

        public OBJECT next() {
     * @param objectList object list which will be saved in the cache.
            return objectList == null ? Collections.emptyList() : objectList;
    public boolean isEmpty() {
        }

        if (this.caseSensitive) {
}

            return this.objectMap;
                }
            }
                if (!caseSensitive) {
        for (OBJECT object : getAllObjects(monitor, owner)) {

    }
            DBPDataSource dataSource = object.getDataSource();
        synchronized (cacheSync) {
                }
import org.jkiss.dbeaver.Log;
                    String name = getObjectName(object);
                return true;
     * Adds custom objects to cache after rea; cache data was read

                            continue;
    private boolean checkDuplicateName(String name, OBJECT object) {
                    newName = newName.toUpperCase(Locale.ENGLISH);
            }
    }
     * If objects with the same name were already cached - leave them in cache
    }


    public <SUB_TYPE> List<SUB_TYPE> getTypedObjects(@NotNull DBRProgressMonitor monitor, OWNER owner, Class<SUB_TYPE> type)

    }
    }
        public void remove() {
                // Merge lists
            this.objectList.add(object);
        setCache(objects);
        } catch (Throwable e) {
        synchronized (cacheSync) {
                        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (isPropertyGroupField(field)) {
                if (this.objectMap.remove(oldName) == object) {
                        } else if (Modifier.isFinal(modifiers)) {
            name = object.getName();

                if (!objectList.isEmpty()) {

                    if (this.objectMap != null) {
    }
                    for (OBJECT oldObject : objectList) {
            }
            if (this.objectMap == null) {
    private List<OBJECT> objectList;
                            objects.set(i, oldObject);
        @Override
    }
import org.jkiss.utils.CommonUtils;
     * Merges new cache with existing.
    @Override
    public static boolean isPropertyGroupField(Field field) {
    }


                    this.objectMap.put(newName, object);
    private Comparator<OBJECT> listOrderComparator;
                                deepCopyCachedObject(srcValue, dstValue);
    }
 * You may obtain a copy of the License at
        }
    protected void addCustomObjects(

import org.jkiss.dbeaver.model.struct.DBSObject;
            if (this.objectList != null) {
 * See the License for the specific language governing permissions and
                fullCache = false;

        return cacheSync;
    public void setFullCache(boolean fullCache) {
    @Override
            return name.toUpperCase();
    }
                getter.getAnnotation(PropertyGroup.class) != null) {
        synchronized (cacheSync) {
                        }
            this.objectList = null;
            this.objectMap = null;
                        if (Modifier.isTransient(modifiers) && dstValue != null) {
                    }

        synchronized (cacheSync) {
            }
                        }
        }
import java.lang.reflect.Method;

        this.fullCache = fullCache;
                    }
                for (int i = 0; i < objects.size(); i++) {
    public void setCaseSensitive(boolean caseSensitive) {
            for (Class<?> theClass = srcObject.getClass(); theClass != Object.class; theClass = theClass.getSuperclass()) {

        try {
    private Map<String, OBJECT> objectMap;
    @NotNull
            }
 *
                            // Just copy value
    }
        private OBJECT curObject;
        }
 * Various objects cache
    }
                    OBJECT newObject = objects.get(i);

                if (checkDuplicateName(name, object)) {
    /**
        }
    }
                }
        @NotNull List<OBJECT> objectList) throws DBException {
            log.error("Error copying object state", e);
            detectCaseSensitivity(object);
            }
        }
    @Override

        public boolean hasNext() {
                OBJECT object = objectList.get(i);
import org.jkiss.dbeaver.DBException;
    }
        return false;
        }
    }
        public CacheIterator() {
                            field.set(dstObject, srcValue);
