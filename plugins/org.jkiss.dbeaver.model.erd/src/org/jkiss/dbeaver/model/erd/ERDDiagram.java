            if (erdEntity.getObject() == table) {

    public void setLayoutManualDesired(boolean layoutManualDesired) {
 * DBeaver - Universal Database Manager
    }
    /**
            if (i < 0) {
    public void setDiagramMonitor(DBRProgressMonitor monitor) {
    }
        copy.entityMap.putAll(this.entityMap);
        DataSourceInfo dsInfo = dataSourceMap.get(dataSource);
    }
                entities.add(entity);
    @Override
 */
            }
            erdEntity.resolveRelations(this, reflect);
    }
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
    public String getName() {

        return null;
            try {

            notes.add(note);
        monitor.beginTask("Load entities metadata", entities.size());
        monitor.done();
                    catalogName,

import org.jkiss.dbeaver.model.struct.DBSEntity;
     *
import org.eclipse.core.runtime.IProgressMonitor;

    @Override
            this.index = index;
        return children;
import org.jkiss.code.Nullable;

                dataSourceContainerMap.putIfAbsent(dataSource, new LinkedHashMap<>());
    }

     * @return - DBRProgressMonitor
    public Map<DBSEntity, ERDEntity> getEntityMap() {

        SQLIdentifierDetector idd = new SQLIdentifierDetector(dataSource.getSQLDialect());

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
        }
    public void fromMap(@NotNull ERDContext context, Map<String, Object> map) {
    public void addErrorMessage(String message) {
    @NotNull
        // Resolve incomplete relations
        return dataSourceMap.keySet();
                entity.firePropertyChange(PROP_OUTPUT, null, rel);
                    objectContainer,
     */
            return;
                rel.setInitBends(bends);

            } else {
    private  DBRProgressMonitor monitor;

            for (ERDElement<?> element : allElements) {
    private final List<ERDEntity> entities = new ArrayList<>();
            @NotNull
        };
            for (ERDAssociation rel : entity.getAssociations()) {
}


            return;
    }
        }
            monitor.subTask("Load " + erdEntity.getName());
            List<Map<String, Object>> assocList = new ArrayList<>();
            }
            if (dsInfo.entities.isEmpty()) {
     */
        try {


    @Nullable
            monitor.worked(1);
     */
    /**
            return;
        copy.entities.addAll(this.entities);

        }
    private final Map<DBPDataSourceContainer, DataSourceInfo> dataSourceMap = new LinkedHashMap<>();

        resolveRelations(reflect);
                return super.getNestedMonitor();
import org.jkiss.dbeaver.model.struct.DBSObject;
                log.warn("Entity relationship can't be loaded", e);
    public DBSObjectContainer getRootObjectContainer() {

            allElements.addAll(this.getEntities());
        final Map<DBSObjectContainer, Integer> containers = dataSourceContainerMap.get(dataSourceContainer);
            for (ERDAssociation rel : entity.getReferences()) {
    /**
        ERDDiagram copy = new ERDDiagram(object, name, contentProvider);
            notes.remove(note);
    }
        IntKeyMap<ERDEntity> idMap = new IntKeyMap<>();
        return notes;

import org.jkiss.utils.CommonUtils;
            entityMap.put(object, entity);


import org.jkiss.dbeaver.model.DBPDataSource;
        this.entityMap.clear();
    public List<ERDEntity> getEntities() {
    }
            DBPDataSourceContainer dataSource = object.getDataSource().getContainer();
                DBSObject entity = DBUtils.getObjectByPath(
        synchronized (notes) {
    private static class DataSourceInfo {
            allElements.addAll(this.getNotes());
    @Override
    }
    }
    @Nullable
        map.put("entities",
            }
    }
        } catch (DBException e) {
        synchronized (notes) {
            dataList.put("icons", context.getIcons());
    public void clear() {
            return containers.keySet();


            }
        copy.layoutManualAllowed = this.layoutManualAllowed;
            firePropertyChange(PROP_CHILD, entity, null);
/*
            for (Map<String, Object> entityMap : JSONUtils.getObjectList(dataList, "entities")) {
        }
 */


    }
        for (ERDAssociation rel : sourceEntity.getReferences()) {
            entityMap.put(table, erdEntity);
    }
/*
        synchronized (entities) {

        Map<String, Object> dataList = JSONUtils.getObject(map, "data");

    }

            addEntity(erdEntity, false);
    }
            if (monitor.isCanceled()) {
    private boolean layoutManualAllowed = false;
                table = DBVUtils.getRealEntity(monitor, table);
        return entities;
    /**

                entities.add(i, entity);
        }
    public DBRProgressMonitor getMonitor() {


            log.debug("Object " + object.getName() + " is not connected with datasource");
 * See the License for the specific language governing permissions and

    }
                Map<DBSObjectContainer, Integer> containerMap = dataSourceContainerMap.get(dataSource);
 */
            DBSObjectContainer container = DBUtils.getParentOfType(DBSObjectContainer.class, entity.getObject());
    }

        if (reflect) {
        children.addAll(notes);
                continue;
            DBPDataSourceContainer dataSource = entity.getObject().getDataSource().getContainer();
        if (object == null) {
    }
                    log.error("Can't find entity " + entityFQN + " in " + objectContainer.getName());
    public Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo) {

                containerMap.putIfAbsent(container, containerMap.size());
        return new BaseProgressMonitor() {

    public int getEntityCount() {
    @Override

        // Load entities
        }
        return entityMap;


                ERDEntity erdEntity = new ERDEntity((DBSEntity) entity);
                erdEntity.addModelRelations(monitor, this, true, false);

            }
        return layoutManualAllowed;
                    entityFQN = JSONUtils.getString(entityMap, "name");

    public List<ERDEntity> getEntities(DBPDataSourceContainer dataSourceContainer) {
        DBSEntity object = entity.getObject();

 * you may not use this file except in compliance with the License.

            throw new IllegalArgumentException("Name cannot be null");
import org.jkiss.utils.IntKeyMap;
                String entityFQN = JSONUtils.getString(entityMap, "fqn");
                rel.getTargetEntity().firePropertyChange(PROP_INPUT, null, rel);

    }
        if (reflect) {
            }
    }
            log.debug("Null object passed");
            }
        copy.layoutManualDesired = this.layoutManualDesired;
    }
        return contentProvider;
        }
            }


        synchronized (entities) {
        Map<String, Object> map = new LinkedHashMap<>();
            return entities.indexOf(entity);
        return rootObjectContainer;
    private final Map<DBSEntity, ERDEntity> entityMap = new IdentityHashMap<>();
    @Override
            }
     * @return Returns whether we can lay out individual entities manually using the XYLayout
            if (rel.getSourceEntity() == targetEntity && relName.equals(rel.getObject().getName())) {
        this.monitor = null;
            public IProgressMonitor getNestedMonitor() {
            entityCache.add(erdEntity);
    }
     * @param monitor - active progress monitor 
    private final ERDContentProvider contentProvider;

            return index == null ? 0 : index;
    /**
        {
            if (container != null) {
    private DBSObjectContainer rootObjectContainer;
            try {
        if (dataSource == null) {
    public synchronized void removeEntity(ERDEntity entity, boolean reflect) {
 * You may obtain a copy of the License at
        synchronized (entities) {

        }
            }
 *
 * Represents a Schema in the model. Note that this class also includes
                }
        if (name == null) {
                if (CommonUtils.isEmpty(entityFQN)) {
    private void resolveRelations(boolean reflect) {
            } catch (DBException e) {
    public void setRootObjectContainer(@NotNull DBSObjectContainer rootObjectContainer) {
        }
        this.layoutManualDesired = layoutManualDesired;

    }
            return monitor;

        }


        this.layoutManualAllowed = layoutManualAllowed;
     *
        return needsAutoLayout;

        return layoutManualDesired;

                result.add(entity);
                }
    private final List<ERDNote> notes = new ArrayList<>();
                entity.firePropertyChange(PROP_INPUT, null, rel);
    }
     */
            }

    }
    }
/**
        this.needsAutoLayout = needsAutoLayout;
        monitor.done();
        }
    }

                break;
import org.jkiss.code.NotNull;
    }
        return entityMap.get(table);
        if (reflect) {
        }
    }


        }
                for (ERDAssociation rel : element.getAssociations()) {

 * diagram specific information (layoutManualDesired and layoutManualAllowed fields)
/*
    public boolean containsTable(DBSEntity table) {
        return errorMessages;
        }
            dsInfo.entities.add(entity);
    public int getEntityOrder(ERDEntity entity) {
    public int getContainerIndex(DBPDataSourceContainer dataSource, DBSObjectContainer container) {
    private static final Log log = Log.getLog(ERDDiagram.class);
        if (reflect) {
    @NotNull
        return copy;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
        for (ERDEntity erdEntity : entityCache) {
    }
    public ERDEntity getEntity(DBSEntity table) {
            monitor.worked(1);

            log.error("Can't detect datasource");

        if (reflect) {
        for (DBSEntity table : entities) {
    public Collection<DBSObjectContainer> getObjectContainers(@NotNull DBPDataSourceContainer dataSourceContainer) {
    public void clearErrorMessages() {
     */
    private final Map<DBPDataSourceContainer, Map<DBSObjectContainer, Integer>> dataSourceContainerMap = new LinkedHashMap<>();
            }

 * Created on Jul 13, 2004
import org.jkiss.dbeaver.Log;
        monitor.beginTask("Load entities' relations", entities.size());
 *
            dsInfo.entities.remove(entity);
    public List<ERDObject<?>> getContents() {

            }
        }
                    context.getMonitor(),
        List<ERDEntity> result = new ArrayList<>();
    /**
        if (containers != null) {

            for (ERDAssociation rel : entity.getAssociations()) {
    }
    private final List<String> errorMessages = new ArrayList<>();
     */
    }

        addEntity(entity, -1, reflect);
        if (fullInfo) {
    public int getDataSourceIndex(DBPDataSourceContainer dataSource) {
    /**
        }
                    continue;
        errorMessages.add(message);
 *
        this.rootObjectContainer = rootObjectContainer;
            erdEntity.setPrimary(table == dbObject);
        errorMessages.clear();
                }

    public Collection<DBPDataSourceContainer> getDataSources() {
    public void addNote(ERDNote note, boolean reflect) {
        }
    }
        children.addAll(entities);
 * limitations under the License.
     * @param layoutManualAllowed The layoutManualAllowed to set.
    private boolean needsAutoLayout;

        List<ERDEntity> entityCache = new ArrayList<>();
            @Override
        for (ERDEntity erdEntity : getEntities()) {
import org.jkiss.dbeaver.DBException;
        return result;
public class ERDDiagram extends ERDObject<DBSObject> implements ERDContainer {

import org.jkiss.dbeaver.model.data.json.JSONUtils;
            if (entityMap.containsKey(table)) {
    }
    }
        for (ERDEntity entity : entities) {
    public ERDDiagram copy() {
     * @return the Tables for the current schema
        }
                    DBUtils.getDefaultContext(dataSource, true),
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        int index;
            ERDEntity erdEntity = ERDUtils.makeEntityFromObject(monitor, this, entityCache, table, null);
    }
        return dsInfo == null ? Collections.emptyList() : dsInfo.entities;
        if (monitor != null && !monitor.isCanceled()) {
        DBPDataSource dataSource = context.getDataSourceContainer().getDataSource();
        return false;
     * The method allow to pass progress monitor for processing
    }
    public ERDDiagram(DBSObject container, String name, ERDContentProvider contentProvider) {
        this.contentProvider = contentProvider;
        this.entities.clear();
 * @author Serge Rider
    }
            firePropertyChange(PROP_CHILD, null, entity);
        } else if (object.getDataSource() == null) {
    }
     * The method return monitor for diagram context
    public void disableDiagramMonitor() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isNeedsAutoLayout() {
    public List<ERDNote> getNotes() {
            entities.remove(entity);
        }

                    assocList.add(rel.toMap(context, fullInfo));
        }
    }
            firePropertyChange(PROP_CHILD, null, note);
            log.error(e);
    public void addEntity(ERDEntity entity, boolean reflect) {
            }


        return false;

        super(container);
     * @return Returns the layoutManualDesired.
*/
            this.getEntities().stream().map(e -> e.toMap(context, fullInfo)).collect(Collectors.toList()));
            firePropertyChange(PROP_CHILD, note, null);
     */
                    schemaName,
import org.jkiss.dbeaver.model.DBUtils;


            monitor.subTask("Load " + table.getName());
            if (monitor.isCanceled()) {
        }
            map.put("data", dataList);
    public List<String> getErrorMessages() {
        if (containerMap != null) {
        return 0;
    }
     * @param layoutManualDesired The layoutManualDesired to set.
    public void setName(String name) {
                String catalogName = idParts.length > 2 ? idParts[0] : null;
        List<ERDEntity> entities = new ArrayList<>();
    public void fillEntities(DBRProgressMonitor monitor, Collection<DBSEntity> entities, DBSObject dbObject) throws DBException {
                if (!(entity instanceof DBSEntity)) {
    /**
        }
                log.error("Error resolving real entity for " + table.getName());
            List<ERDElement<?>> allElements = new ArrayList<>();
        DBSObjectContainer objectContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
            }
            map.put("associations", assocList);
    }
        public DataSourceInfo(int index) {
    public boolean isLayoutManualDesired() {
                String[] idParts = idd.splitIdentifier(entityFQN);
        if (objectContainer == null) {
                    tableName);
            return;
            for (ERDAssociation rel : entity.getReferences()) {
    public ERDContentProvider getContentProvider() {
                idMap.put(entityId, erdEntity);

            DataSourceInfo dsInfo = dataSourceMap.computeIfAbsent(dataSource, dsc -> new DataSourceInfo(dataSourceMap.size()));
    public void setNeedsAutoLayout(boolean needsAutoLayout) {
                break;
            log.error("Can't detect root object container for " + dataSource.getName());
        // Load relations
    public void removeNote(ERDNote note, boolean reflect) {
                String schemaName = idParts.length > 2 ? idParts[1] : (idParts.length > 1 ? idParts[0] : null);
            Map<String, Object> dataList = new LinkedHashMap<>();
            entityMap.remove(entity.getObject());

        }

            }

    private boolean layoutManualDesired = true;
        Integer index;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    }
                rel.getSourceEntity().firePropertyChange(PROP_OUTPUT, null, rel);
        }
            if (entity.getObject() == table) {


    public boolean isLayoutManualAllowed() {
    public boolean isEditEnabled() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return name;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
package org.jkiss.dbeaver.model.erd;
        this.name = name;
                int entityId = JSONUtils.getInteger(entityMap, "id");
        }
    public List<ERDEntity> getEntities(DBSEntity table) {
        this.monitor = monitor;
            } catch (Exception e) {
 * although ideally these should be in a separate model hierarchy
    }

import java.util.stream.Collectors;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        return entities.size();
                erdEntity.fromMap(context, entityMap);
        DataSourceInfo dsInfo = dataSourceMap.get(dataSourceContainer);
            DataSourceInfo dsInfo = dataSourceMap.get(dataSource);
        for (ERDEntity erdEntity : entities) {

import org.jkiss.dbeaver.model.runtime.BaseProgressMonitor;
                addEntity(erdEntity, false);
        Map<DBSObjectContainer, Integer> containerMap = dataSourceContainerMap.get(dataSource);
import java.util.*;
                String tableName = idParts[idParts.length - 1];
 * Unless required by applicable law or agreed to in writing, software
    public void addEntity(ERDEntity entity, int i, boolean reflect) {
            }
     * @return the name of the schema
     */
            index = containerMap.get(container);
 *

        this.name = name;
                return true;
    private String name;
        return dsInfo == null ? 0 : dsInfo.index;

        return map;
    public void addInitRelationBends(ERDElement<?> sourceEntity, ERDElement<?> targetEntity, String relName, List<int[]> bends) {
    public void setLayoutManualAllowed(boolean layoutManualAllowed) {
        List<ERDObject<?>> children = new ArrayList<>(entities.size() + notes.size());
                dataSourceMap.remove(dataSource);
