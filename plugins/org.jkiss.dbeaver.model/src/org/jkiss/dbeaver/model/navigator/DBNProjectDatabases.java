                            };
                                }
                        if (containerNode instanceof DBNDatabaseFolder && event.getObject().getClass().getName().equals(((DBNDatabaseFolder) containerNode).getMeta().getType())) {
    public boolean allowsOpen() {
        DBNModel model = getModel();
        return true;
    public DBNDataSource getDataSource(String id) {
        children = null;
                oldContainer.setFolder(srcFolder);
                    addDataSource(container, true, event.getEnabled() != null && event.getEnabled());
            case AFTER_CONNECT: {
    @Override
    {
                return null;
                    folderNodes.put(folder, folderNode);
{
            || otherNode instanceof DBNDataSource
        return dataSourceRegistry;
                            parentNode = model.getParentNode(event.getObject());
                    if (event.getAction() == DBPEvent.Action.OBJECT_SELECT) {
    public String getNodeDescription()
        return (DBNProject) super.getParentNode();
    public boolean supportsDrop(@Nullable DBNNode otherNode) {

    {
                                // That's ok
                    return dataSource;
            for (Iterator<DBNDataSource> iter = dataSources.iterator(); iter.hasNext(); ) {
    @Override
                folderNodes.put(folder, folderNode);
    public String getName()
    {
 * DBeaver - Universal Database Manager
                // current node already contains provided data source
    public void moveNodesToFolder(Collection<DBNNode> nodes, DBPDataSourceFolder toFolder) throws DBException {
            }
                                dbmNode.clearNode(false);
                    DBNEvent.Action.ADD,


                DBPDataSourceContainer newContainer = oldContainer.createCopy(dataSourceRegistry);
import org.jkiss.dbeaver.DBException;
                dataSource.moveToFolder(dataSource.getOwnerProject(), toFolder);
            for (DBNDataSource dataSource : dataSources) {
                folder.getFolder().setParent(toFolder);
                    DBNDatabaseNode parentNode = null;
    public String getNodeItemPath() {
    }
                DBPDataSourceFolder srcFolder = oldContainer.getFolder();
                    // the same registry
                oldContainer.setFolder(null);
                            } catch (InterruptedException e) {
            }
                reveal ? DBNEvent.NodeChange.SELECT : DBNEvent.NodeChange.REFRESH,
public class DBNProjectDatabases extends DBNNode implements DBNContainer, DBPEventListener
    @Property(viewable = true, order = 1)
        }
        this.dataSourceRegistry = dataSourceRegistry;
    private volatile DBNNode[] children;
        Set<DBPDataSourceRegistry> registryToRefresh = new LinkedHashSet<>();
                }
                    {
        return "datasources";
                                loaderJob.join();
    @NotNull
 */
        }

import org.jkiss.dbeaver.utils.GeneralUtils;

    public Object getValueObject()
                if (dataSource.getObject() == descriptor) {
/*
    public String getNodeDisplayName()
                }
    }
                }
                this,

                registryToRefresh.add(folder.getDataSourceRegistry());
                getModel().fireNodeEvent(new DBNEvent(
        return getParentNode().getNodeItemPath() + "/" + getNodeDisplayName();
            return null;
        this.children = null;
        super.dispose(reflect);
            }
                    childNodes.add(dataSource);
                DBNLocalFolder folderNode = folderNodes.get(folder);
                                    }
                        nodeChange = DBNEvent.NodeChange.REFRESH;
                            dbmNode.updateChildrenOrder(false);
        }
        for (DBPDataSourceRegistry registry : registryToRefresh) {
    @Nullable
                // Add only visible root datasources
            dataSources.clear();
 * DBNProjectDatabases
    }
    private DBPDataSourceRegistry dataSourceRegistry;
                    if (parentNode == null) {
                            // We have to load children here
                        } else {
                    if (node != null && node.getParentNode() instanceof DBNDatabaseNode) {
 * See the License for the specific language governing permissions and
    @Override

 * you may not use this file except in compliance with the License.
    @NotNull
        return newNode;
    @NotNull
                if (oldContainer.getRegistry() == dataSourceRegistry) {
        return dataSourceRegistry == null;
        switch (event.getAction()) {
    protected void dispose(boolean reflect) {

                                }
            }
                            // Otherwise it may be a wrong node (e.g. grand-parent node)
        children = null;
            dataSourceRegistry.removeDataSourceListener(this);

                    childNodes.add(folderNode);
 * limitations under the License.
                DBNDataSource dataSource = iter.next();
        folderNodes.clear();
        return dataSourceRegistry;
    }
    }
        }
    }
                    removeDataSource((DBPDataSourceContainer) event.getObject());
                        nodeChange);
        }
        for (DBPDataSourceContainer ds : projectDataSources) {
                    if (event.getObject() instanceof DBPDataSourceContainer) {
                            if (!enabled) {
                }
                }
                            source = DBNEvent.FORCE_REFRESH;
            getModel().fireNodeEvent(new DBNEvent(
    private final IdentityHashMap<DBPDataSourceFolder, DBNLocalFolder> folderNodes = new IdentityHashMap<>();
                    break;
    }
    public void handleDataSourceEvent(@NotNull DBPEvent event)
                            }
                if (folder.getParent() == null) {
                    Object source = event;
        synchronized (dataSources) {
                            }
                if (dbmNode != null) {
    @Override
    @Override
                    return dataSource;
 * You may obtain a copy of the License at
                registryToRefresh.add(oldContainer.getRegistry());
import org.jkiss.dbeaver.model.*;
        return DBIcon.TREE_DATABASE_CATEGORY;
                    folderNode = new DBNLocalFolder(this, folder);
 *
        for (DBNNode node : nodes) {
        }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;

                break;

                        parentNode = model.getParentNode(event.getObject());

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
                                // Clear disabled node
            addDataSource(ds, false, false);
    @Override
    @Deprecated

                    } else {
    {
            if (dataSources.stream().anyMatch(node -> node.getDataSourceContainer() == descriptor)) {
                    boolean parentFound = (parentNode != null);
    {
    {
                if (folderNode == null) {
            getFolderNode(dsFolder);
                    if (dataSource == null ||
    public String getNodeType() {
                DBNUtils.disposeNode(dataSource, reflect);
                DBPDataSourceContainer oldContainer = dataSource.getDataSourceContainer();
    {
            || otherNode instanceof DBNLocalFolder && ((DBNLocalFolder) otherNode).getDataSourceRegistry() == dataSourceRegistry;
            sortNodes(childNodes);

                        parentNode = model.getParentNode(event.getObject());
            case OBJECT_SELECT: {
                        ((DBNDatabaseNode)node.getParentNode()).removeChildItem(event.getObject());
                if (dataSource.getDataSourceContainer() == ds) {
                            try {
                            loaderJob.schedule();
    @Nullable
    public DBPDataSourceRegistry getDataSourceRegistry()
                        if (!parentFound) {
                    }
    }
    @Override

                        }
                    iter.remove();
                                    setUser(true);
                                nodeChange = DBNEvent.NodeChange.UNLOAD;
        if (dataSourceRegistry != null) {
                registryToRefresh.add(dataSourceRegistry);
    @NotNull
                }
        List<? extends DBPDataSourceContainer> projectDataSources = this.dataSourceRegistry.getDataSources();
                        }
            // Add root folders
        }
                        if (enabled != null) {
                        continue;
            DBNUtils.disposeNode(removedNode, true);
    public void refreshChildren()
    {
    }
    public DBNLocalFolder getFolderNode(DBPDataSourceFolder folder)
import java.util.*;
                    continue;
    }
                    final DBNDatabaseNode node = model.getNodeByObject(event.getObject());

import org.jkiss.dbeaver.model.meta.Property;

                DBNEvent.Action.ADD,
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return true;
        synchronized (dataSources) {
        }
                DBNDatabaseNode dbmNode = model.getNodeByObject(event.getObject());
    @Override
                    folderNode));
            }
            refreshChildren();
        }
package org.jkiss.dbeaver.model.navigator;
            if (folderNode == null) {
            children = null;
        if (dsFolder != null) {
    @Override
                }
    public DBNProjectDatabases(DBNProject parentNode, DBPDataSourceRegistry dataSourceRegistry)
                if (event.getObject() instanceof DBPDataSourceContainer) {
                        event.getAction() == DBPEvent.Action.BEFORE_CONNECT ?
                }
        return "Connections";
        }
            return !dataSources.isEmpty() || !dataSourceRegistry.getRootFolders().isEmpty();
            for (DBNDataSource dataSource : dataSources) {
            for (DBPDataSourceFolder folder : dataSourceRegistry.getAllFolders()) {
    @Override
            } else if (node instanceof DBNLocalFolder folder) {
    }
/**
                            // Use container node only if it a folder with exact object type
                                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    @Nullable
                            parentNode.addChildItem(event.getObject());
                        dbmNode,
            case BEFORE_CONNECT:
                        event,
 *
    {
    @Override
    }
import org.eclipse.core.runtime.IStatus;
    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor)
                        source,
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
                    this,
    }
            case OBJECT_REMOVE:
    public Class<DBPDataSourceContainer> getChildrenClass()
            }
        return getNodeDisplayName();
    @Override

                    model.fireNodeUpdate(
                        dataSource.getDataSourceContainer().isHidden() ||
                    removedNode = dataSource;
            }
                }
                } else {



    }
        synchronized (dataSources) {
                        }
    @NotNull
import org.jkiss.code.Nullable;
 */
    {
    @NotNull
                        parentFound = false;

    public boolean hasChildren(boolean navigableOnly) {
    {
        if (reflect) {

                if (dbmNode != null) {
        super(parentNode);
        return otherNode == null
    }
    public DBNDataSource getDataSource(DBPDataSourceContainer ds) {
            dataSources.add(newNode);
    public DBPImage getNodeIcon()
                                @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
                    DBNEvent.NodeChange nodeChange;
            if (node instanceof DBNDataSource dataSource) {
        synchronized (dataSources) {
                                    } catch (Exception e) {
        synchronized (dataSources) {

        if (!getModel().isNodeVisible(newNode)) {
                break;


                    if (parentNode != null) {
    public String getChildrenType()
            for (DBNDataSource dataSource : dataSources) {
                    model.fireNodeUpdate(
                                children = null;
    @Override
    }
}
                        }

            synchronized (dataSources) {
                    if (parentNode == null) {
    }
                }
                                {
                            if (enabled) {
    @Override
                            DBNEvent.NodeChange.BEFORE_LOAD : DBNEvent.NodeChange.AFTER_LOAD);
                            } else {

                        } else {
    }
        return null;
                if (dataSource.getDataSourceContainer().getId().equals(id)) {
            List<DBNNode> childNodes = new ArrayList<>();

    public boolean isDisposed() {
            }
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                        // Not yet loaded. Parent node might be a folder (like Tables)
        }
    private DBNDataSource addDataSource(@NotNull DBPDataSourceContainer descriptor, boolean reflect, boolean reveal)
                                        nodeToLoad.getChildren(monitor);
            this.children = childNodes.toArray(new DBNNode[0]);
                    }
                folderNode = new DBNLocalFolder(this, folder);
    {

            return folderNode;

            DBNLocalFolder folderNode = folderNodes.get(folder);
                        }
import org.jkiss.code.NotNull;
                    }
    public DBNDataSource[] getDataSources() {
                }
        }
                            if (event.getAction() == DBPEvent.Action.OBJECT_UPDATE) {
                        dbmNode,
                            // Add only if object wasn't yet added (e.g. by create new object command)

    @NotNull
    }
                            }
        synchronized (dataSources) {
                                    try {
            return dataSources.toArray(new DBNDataSource[0]);
                    }
    public boolean allowsChildren() {
                        }
                            parentNode = (DBNDatabaseNode) containerNode;
                    }
                            final AbstractJob loaderJob = new AbstractJob("Load sibling nodes of new database object") {
        }
    }
        return ModelMessages.model_navigator_Connection;
                for (DBNDataSource dataSource : dataSources) {

        synchronized (folderNodes) {
    }
                            final DBNDatabaseNode nodeToLoad = parentNode;
    }
                    }
        return getParentNode().getProject().getName() + ModelMessages.model_navigator__connections;
                                // Force reorder.
                        }
    @Override
    void removeDataSource(DBPDataSourceContainer descriptor) {
                            nodeChange = DBNEvent.NodeChange.REFRESH;
        getModel().fireNodeUpdate(this, this, DBNEvent.NodeChange.STRUCT_REFRESH);
                newContainer.setFolder(toFolder);
                        dataSource.getDataSourceContainer().getFolder() != null) {
        refreshChildren();
        return children;
    }
                DBNDatabaseNode dbmNode = model.getNodeByObject(event.getObject());
                if (event.getObject() instanceof DBPDataSourceContainer container) {
            case OBJECT_ADD:
                dataSourceRegistry.addDataSource(newContainer);

        }
                } else if (model.getNodeByObject(event.getObject()) == null) {

                        if (event.getData() == DBPEvent.REORDER) {
    @Override

                        }
                        if (parentNode.getChildNodes() == null && parentNode.hasChildren(false)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return DBPDataSourceContainer.class;
                break;
            }
        }
        if (removedNode != null) {
        DBPDataSourceFolder dsFolder = descriptor.getFolder();
                                nodeChange = DBNEvent.NodeChange.LOAD;
                        if (parentNode != null && parentNode.getChildNodes() != null && !parentNode.hasChildItem(event.getObject())) {

                                getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.UPDATE, this));
                    }
        return "datasources";

                        if (enabled != null && enabled) {
            // Add folder node to cache
    @Nullable

                // Set folder to null to avoid its creation during copy
                break;
            }
                    Boolean enabled = event.getEnabled();
                                        return GeneralUtils.makeExceptionStatus(e);
            case OBJECT_UPDATE:
            }
    public DBNProject getParentNode() {
 *
    {
                            // Second try
                        if (enabled != null) {
            registry.flushConfig();
        this.dataSourceRegistry.addDataSourceListener(this);
        synchronized (dataSources) {

    @Nullable
    @Override
 * Unless required by applicable law or agreed to in writing, software
    {
            dataSourceRegistry = null;
        DBNDataSource removedNode = null;
                newNode));
    }
                            }
                oldContainer.getRegistry().removeDataSource(oldContainer);
                                    return Status.OK_STATUS;
        DBNDataSource newNode = new DBNDataSource(this, descriptor);
import org.eclipse.core.runtime.Status;
        if (children == null && !monitor.isForceCacheUsage()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    public String getNodeId() {
                //log.warn("Folder node '" + folder.getFolderPath() + "' not found");
    }
                    }
        moveNodesToFolder(nodes, null);
import org.jkiss.dbeaver.model.edit.DBEObjectManager;


                        Object containerNode = event.getOptions().get(DBEObjectManager.OPTION_CONTAINER);
    private final List<DBNDataSource> dataSources = new ArrayList<>();
    }
                                @Override
        }
    }
    @Override
