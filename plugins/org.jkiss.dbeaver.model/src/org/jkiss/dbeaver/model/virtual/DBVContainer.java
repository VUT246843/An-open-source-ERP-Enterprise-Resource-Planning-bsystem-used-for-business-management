    }
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
import java.util.Collection;
    @Nullable
    }
        log.warn("Child '" + name + "' of '" + realParent.getName() + "' is not an object container");
    }
/**

    }
        return "container";
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDescription() {
    synchronized void removeEntity(DBVEntity entity) {
 */
    @Nullable
            this.name = container.name;
    @NotNull
                containers.put(child.getName(), child);
        for (DBVEntity child : container.getEntities()) {
    void renameEntity(DBVEntity entity, String oldName, String newName) {
        super.copyFrom(container);
    }

    public void setDescription(String description) {
    static final String CONFIG_PREFIX = "@";
        }
        }
    public Collection<DBVEntity> getEntities() {
            addContainer(container);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return null;
    @Override
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager


    }
    }
    void addContainer(DBVContainer container) {

    protected void clearEntities() {

        assert parent != null;
            if (id.startsWith(ENTITY_PREFIX)) {
    @Override
        return !containers.isEmpty() ? containers.values() : entities.values();
            return true;
    public synchronized DBVEntity getEntity(String name, boolean createNew) {
            containers.put(myChild.getName(), myChild);
        }
            DBVEntity myChild = new DBVEntity(this, child, targetModel);
            } else if (element.getValue() instanceof Map<?, ?> valMap) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBVEntity entity = entities.get(name);
        return entities.values();

    }
            return null;
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
            if (child.hasValuableData()) {
        return !containers.isEmpty() ? DBVContainer.class : DBVEntity.class;
                return true;
    @Nullable
    private String description;
import org.jkiss.code.NotNull;
    private final Map<String, DBVContainer> containers = new LinkedHashMap<>();
        this.description = description;
            container = new DBVContainer(this, name);
        }
    }
        }
        // do nothing
    public DBVContainer(@Nullable DBVContainer parent, @NotNull String name) {


            }

    }

    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
                entities.put(entity.getName(), entity);
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    public DBPDataSource getDataSource() {
        this.containers.clear();
package org.jkiss.dbeaver.model.virtual;


    @NotNull
        DBVContainer container = containers.get(name);
        return container;
            if (entity.hasValuableData()) {
    }
            return (DBSObjectContainer) child;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    static final String ENTITY_PREFIX = ":";
        this.parent = parent;
    public boolean hasValuableData() {
            entity = new DBVEntity(this, name, (String) null);
        if (entities.remove(oldName) != null) {

        }
    void copyFrom(DBVContainer container, DBVModel targetModel) {
        for (DBVContainer child : container.getContainers()) {
            DBVContainer myChild = new DBVContainer(this, child.getName());
        return false;

        if (realParent == null) {

        this.containers.clear();
        for (DBVContainer child : getContainers()) {
                DBVEntity entity = new DBVEntity(this, id.substring(ENTITY_PREFIX.length()), (Map<String, Object>) element.getValue());
            entities.put(myChild.getName(), myChild);
                String configMap = id.substring(CONFIG_PREFIX.length());

        return containers.values();
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
            this.name = targetModel.getId();

    @Nullable
public class DBVContainer extends DBVObject implements DBSObjectContainer {
 */
            entity.dispose();
    }
    }
        return parent;
        }
 * limitations under the License.
            String id = element.getKey();
 * See the License for the specific language governing permissions and
    @Override
        this.parent = parent;
    synchronized void addEntity(DBVEntity entity) {
    @Override
        if (entity == null && createNew) {
        this.entities.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
    @NotNull

    }
        entity.dispose();

            myChild.copyFrom(child, targetModel);
    public String toString() {

    }
        if (!CommonUtils.isEmpty(getProperties())) {
        this.name = name;
    public DBSObjectContainer getRealContainer(DBRProgressMonitor monitor) throws DBException {
        }
            }
    DBVContainer(@Nullable DBVContainer parent, String name, Map<String, Object> map) {

        return name;
    public String getType() {
import org.jkiss.dbeaver.model.DBPDataSource;
            container.dispose();
        containers.put(container.getName(), container);
        return !containers.isEmpty() ? containers.get(childName) : entities.get(childName);

import org.jkiss.dbeaver.DBException;
    private final DBVContainer parent;
        this.name = name;
    }
        DBSObjectContainer realParent = parent.getRealContainer(monitor);
        }
        } else {
        }
        if (child instanceof DBSObjectContainer) {

                DBVContainer child = new DBVContainer(this, id, (Map<String, Object>) valMap);
    }
    }
}
    public Collection<DBVContainer> getContainers() {
    }
        }
        entities.clear();



        }
                return true;
    }
        this.entities.clear();
    }

        if (container == null && createNew) {
import org.jkiss.code.Nullable;
    @Override

        if (parent == null) {
    public DBVContainer getContainer(String name, boolean createNew) {

        return null;
        containers.clear();
        for (DBVContainer container : containers.values()) {
                    loadPropertiesFrom(map, id);
        for (Map.Entry<String, Object> element : map.entrySet()) {
import java.util.Map;
    }
        entities.put(entity.getName(), entity);

        return entity;
            }
    private final Map<String, DBVEntity> entities = new LinkedHashMap<>();
    }
        entities.remove(entity.getName());



        }

import org.jkiss.dbeaver.model.struct.DBSObject;
    protected void clearContainers() {
        this.description = container.description;
    public String getName() {
    @Override
        for (DBVEntity entity : entities.values()) {
 * Virtual container
    public DBVContainer getParentObject() {
        for (DBVEntity entity : getEntities()) {
            entities.put(name, entity);
    @Override
    @Override
    }
    @NotNull
            entities.put(newName, entity);
    @Nullable
 * You may obtain a copy of the License at
                if (configMap.equals("properties")) {
            } else if (id.startsWith(CONFIG_PREFIX)) {
import java.util.LinkedHashMap;
    synchronized void dispose() {
                }
        return description;
    private String name;
 * you may not use this file except in compliance with the License.
        DBSObject child = realParent.getChild(monitor, name);
    }
    @Override
        return parent.getDataSource();
        if (container instanceof DBVModel) {
 *

 * Unless required by applicable law or agreed to in writing, software

        }
    }
        return name;
/*
