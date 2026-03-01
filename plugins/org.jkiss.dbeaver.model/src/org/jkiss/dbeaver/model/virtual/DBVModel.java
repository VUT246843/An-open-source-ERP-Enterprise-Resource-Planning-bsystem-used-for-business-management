            if (container == null) {
    static void removeFromCache(@NotNull DBVEntityForeignKey foreignKey) {
    }
        if (path.length == 0) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return findEntity(entity, entity.getName(), createNew);
    public DBVModel(@NotNull DBPDataSourceContainer dataSourceContainer) {
 * Unless required by applicable law or agreed to in writing, software


    }
    }
                globalReferenceCache.put(newRefEntityId, fkList);
    public DBPDataSourceContainer getDataSourceContainer() {
    public void serialize(DBRProgressMonitor monitor, JsonWriter json) throws IOException, DBException {

    @Nullable
 * limitations under the License.
    @NotNull
                return null;
 * Virtual database model

        this.id = dataSourceContainer.getId();
    public void setId(@NotNull String id) {
    public static class ModelChangeListener implements DBPEventListener {
    }
                String newName = (String)options.get(DBEObjectRenamer.PROP_NEW_NAME);
    }
        for (int i = 1; i < path.length; i++) {
                if (oldName != null && newName != null) {
import org.jkiss.utils.xml.SAXListener;
    @Deprecated
    public DBVObject findObject(DBSObject source, boolean create) {
        String oldRefEntityId = newRefEntityId.replace("/" + newName, "/" + oldName);
    }

        synchronized (globalReferenceCache) {
import org.jkiss.dbeaver.DBException;
import java.util.Map;
            log.warn("Datasource '" + dataSource + "' is not an object container");
                vEntity.handleRename(oldName, newName);
        @Override

                    return container.getEntity(item.getName(), create);

/*

     */
            DBVEntity vEntity = vModel.findEntity(object, oldName, false);
        copyFrom(source);
    public DBPDataSource getDataSource() {
            container = container.getContainer(item.getName(), createNew);
            return null;
        if (path[0] != dataSourceContainer) {
                vEntity.persistConfiguration();
                if (i == path.length - 1) {
        }
        DBNModel navigatorModel = DBNUtils.getNavigatorModel(object);
        }
    }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
            return null;
            if (vEntity != null) {

            }
            }
        }
        this.id = id;
    }

import org.jkiss.code.NotNull;
                return (DBSObjectContainer) dataSource;
        }
        }
        if (path.length == 0) {
        return dataSourceContainer == null ? null : dataSourceContainer.getDataSource();
public class DBVModel extends DBVContainer {
        super.copyFrom(model, this);

import java.io.IOException;
            }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
    @Deprecated
    @Nullable
            log.warn("Empty entity path");
            log.warn("Entity's root must be datasource container '" + dataSourceName + "'");
        }
        DBVContainer container = this;
        }
                    globalReferenceCache.remove(refEntityId);
    public String getId() {
    }
        }
    @Nullable
                dataSourceContainer.connect(monitor, true, true);
            if (!globalReferenceCache.isEmpty()) {
        return container.getEntity(entityName, createNew);
            DBSObject item = path[i];
    public void resetData() {
    public void serialize(XMLBuilder xml) throws IOException {
            if (dataSource == null) {
 *
        synchronized (globalReferenceCache) {
import com.google.gson.stream.JsonWriter;
    private static final Map<String, List<DBVEntityForeignKey>> globalReferenceCache = new HashMap<>();
        if (objectNode != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    @Nullable


            }
            }
import java.util.ArrayList;
                String oldName = (String)options.get(DBEObjectRenamer.PROP_OLD_NAME);
            } else {
    }
    private String id;
        }
 * See the License for the specific language governing permissions and
            List<DBVEntityForeignKey> fkList = globalReferenceCache.get(oldRefEntityId);
                container = childContainer;
        super.dispose();

    }
    }
            if (fkList != null) {
        DBVContainer container = this;
        return null;
        DBNDatabaseNode objectNode = navigatorModel.getNodeByObject(object);

        }
    @Override
            return;
        DBSObject[] path = DBUtils.getObjectPath(source, true);
    @Nullable
            }
    @Override
        if (dataSourceContainer != null) {
            List<DBVEntityForeignKey> fkList = globalReferenceCache.computeIfAbsent(foreignKey.getRefEntityId(), s -> new ArrayList<>());
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
        super(null, id, map);
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
        if (object.getDataSource() != null) {
import org.jkiss.utils.xml.XMLBuilder;
import org.jkiss.dbeaver.model.navigator.DBNModel;
    public DBVModel(@NotNull DBPDataSourceContainer dataSourceContainer, @NotNull DBVModel source) {
    public SAXListener getModelParser() {
            return new HashMap<>(globalReferenceCache);
    }
            return null;
import org.jkiss.dbeaver.model.*;
package org.jkiss.dbeaver.model.virtual;
            String dataSourceName = dataSourceContainer != null ? dataSourceContainer.getName() : null;
            if (dataSource instanceof DBSObjectContainer) {
    }

import java.util.List;
    // Copy constructor
        }
    public void setDataSourceContainer(@Nullable DBPDataSourceContainer dataSourceContainer) {

            List<DBVEntityForeignKey> fkList = globalReferenceCache.get(refEntityId);
            String objectNodePath = objectNode.getNodeUri();
     *
        this(dataSourceContainer);
    public static Map<String, List<DBVEntityForeignKey>> getGlobalReferenceCache() {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public static List<DBVEntityForeignKey> getGlobalReferences(DBNDatabaseNode databaseNode) {
                    fk.getEntity().persistConfiguration();
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    public void copyFrom(DBVModel model) {
    }
            if (fkList != null) {
    DBVEntity findEntity(DBSEntity entity, String entityName, boolean createNew) {
            if (childContainer == null) {
    private static void renameEntityInGlobalCache(String newRefEntityId, String oldName, String newName) {

     * @return entity virtual entity
        if (navigatorModel == null) {
 *
                }
    @NotNull
import java.util.HashMap;
                // Handle table renames
    static void addToCache(@NotNull DBVEntityForeignKey foreignKey) {
            DBSObject object = event.getObject();
        this.clearEntities();
                for (DBVEntityForeignKey fk : fkList) {
            String refEntityId = foreignKey.getRefEntityId();
 *
    //private Map<String, Object> extensions = new LinkedHashMap<>();
            DBSObject item = path[i];
     * Search for virtual entity descriptor
        this.dataSourceContainer = dataSourceContainer;
        synchronized (globalReferenceCache) {
        public void handleDataSourceEvent(@NotNull DBPEvent event) {
        return new DBVModelSerializerLegacy.ModelParser(this);
                Map<String, Object> options = event.getOptions();
        DBVModelSerializerLegacy.serializeContainer(xml, this);
        synchronized (globalReferenceCache) {
        this.clearProperties();
    public static void checkGlobalCacheIsEmpty() {
                }
    }
            DBPDataSource dataSource = dataSourceContainer.getDataSource();
    /**
            }
    public DBVModel(@NotNull String id, @NotNull Map<String, Object> map) {
        synchronized (globalReferenceCache) {
     * @param entity    entity
                }
        if (path[0] != dataSourceContainer) {
    }
            }

            return globalReferenceCache.get(databaseNode.getNodeUri());
        DBVModelSerializerModern.serializeContainer(monitor, json, this);
    @Override
            return null;

        this.clearContainers();
        this.id = id;

        this.dataSourceContainer = dataSourceContainer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return id;
    private static void handleEntityRename(DBSEntity object, String oldName, String newName) {
        for (int i = 1; i < path.length; i++) {
            DBVModel vModel = object.getDataSource().getContainer().getVirtualModel();
        }
    // Pass explicit entity name - it is needed to handle entity rename (we will use old entity name here)
    }
 * You may obtain a copy of the License at

            String dataSourceName = dataSourceContainer != null ? dataSourceContainer.getName() : null;
            log.warn("Empty entity path");

                dataSource = dataSourceContainer.getDataSource();

    }
                }
    }

                return null;
    public DBSObjectContainer getRealContainer(DBRProgressMonitor monitor) throws DBException {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
            if (event.getAction() == DBPEvent.Action.OBJECT_UPDATE && object instanceof DBSEntity) {
            DBVContainer childContainer = container.getContainer(item.getName(), create);
    private DBPDataSourceContainer dataSourceContainer;
        synchronized (globalReferenceCache) {
        }
    }


                    handleEntityRename((DBSEntity) object, oldName, newName);
/**
        return container;
    public DBVEntity findEntity(DBSEntity entity, boolean createNew) {
                if (fkList.isEmpty()) {
    }
        }
    }
            renameEntityInGlobalCache(objectNodePath, oldName, newName);
 * DBeaver - Universal Database Manager
            log.warn("Entity's root must be datasource container '" + dataSourceName + "'");
        return dataSourceContainer;
                globalReferenceCache.remove(oldRefEntityId);

            fkList.add(foreignKey);
                log.error("Virtual references cache is not empty. Possible memory leak: " + globalReferenceCache);
            }
        }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                    fk.setRefEntityId(newRefEntityId);
     * @param createNew create new entity if missing
        DBSObject[] path = DBUtils.getObjectPath(entity, false);
        }

    public void dispose() {
import org.jkiss.dbeaver.model.struct.DBSEntity;

        super(null, dataSourceContainer.getId());
}

                fkList.remove(foreignKey);
