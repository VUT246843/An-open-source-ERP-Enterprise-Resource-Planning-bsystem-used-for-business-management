    }
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.Log;
        if (rootDbNodeIndex < 0) {
                synchronized (listeners) {
        synchronized (eventCache) {
        synchronized (nodeMap) {
            // No overlay
    }
 */

    public void setModelAuthContext(SMSessionContext modelAuthContext) {
    }
                projectDatabases.refreshChildren();
    private final List<INavigatorListener> listeners = new ArrayList<>();
                nodeList.add(node);

                @SuppressWarnings("unchecked")

        DBNDatabaseNode node = getNodeByObject(object);
        }
    public void fireNodeUpdate(Object source, DBNNode node, DBNEvent.NodeChange nodeChange)
            for (Function<DBNNode, Boolean> f : nodeFilters) {
*/
                        cached = cacheNodeChildren(monitor, child, objectToCache, addFiltered);
    public void ensureProjectLoaded(DBPProject project) {
            if (node == null) {
        NodePath nodePath = getNodePath(path);
                .map(DBNUtils::encodeNodePath)
        }
    public static synchronized DBPImage getStateOverlayImage(DBPImage image, DBSObjectState state)
        }
        }
            return Status.OK_STATUS;
                    badNode = true;

    {
import org.jkiss.utils.CommonUtils;
            if (datasourceById.containsKey(potentialDatasourceId)) {
            new EventProcessingJob().schedule();
            }
                // Parent node read
            throw new DBException("Node level " + currentLevel + " out of range: " + (nodePath.pathItems.size() - 1));
        }
            expectedNodePathName = nodePath.pathItems.get(currentLevel);

        return new NodePath(nodeType, items);
    private final List<Function<DBNNode, Boolean>> nodeFilters = new ArrayList<>();
            return null;
            }

        if (detectedNode == null) {
        return new DBNProject(parent, project);
        }
                + currentNode.getNodeUri() + "'." + "\nAllowed children: " + Arrays.toString(children));
        if (currentLevel == nodePath.pathItems.size() - 1) {

        object = DBUtils.getPublicObjectContainer(object);


    {

            // As it was requested explicitly - let's add new node
            } else {
    public static void updateConfigAndRefreshDatabases(DBNNode node)
    {
            return type.getPrefix() + pathItems.toString();
                if (nodeMap.remove(node.getObject()) != node) {
            if (part.isSubPartition()) {
            try {
    private DBNRoot root;
import org.jkiss.code.Nullable;
     */
                    eventCache.clear();
        addNode(node, false);
import org.jkiss.dbeaver.model.struct.DBSObjectState;
        }
                this.listeners.add(listener);
        this.modelProjects = modelProjects;
            this.listeners.clear();
        DBSObject[] path = DBUtils.getObjectPath(object, true);
                }
 *
import org.jkiss.dbeaver.model.DBIconComposite;
                }
import org.jkiss.dbeaver.model.struct.DBSObject;
                // It is actual parent and there are no folders
    public void dispose() {
    public boolean isGlobal() {
            setSystem(true);
    }


                return null;
        }
            return this.getNodeByObject(object);
                // Second node - make a list
    public SMSessionContext getModelAuthContext() {
        if (nodePath.legacyFormat) {
    {
            Thread.currentThread().setName("Database navigator events processor");
 * Also ties DBSObjects to thee model (DBNNode).
        for (DBNNode parentNode = node; parentNode != null; parentNode = parentNode.getParentNode()) {
        }
                break;
        return false;
     * Find node by path.
        NodePath path = getNodePath(relativePath);
    {
    }
    private final transient List<DBNEvent> eventCache = new ArrayList<>();
        final List<String> items = CommonUtils.splitString(path, '/');
        protected IStatus run(IProgressMonitor monitor) {
        }
                            break;
    }
    }
            List<DBNDatabaseNode> nodeList = (List<DBNDatabaseNode>) obj;
    private final DBPPlatform platform;
 *
        }
                }
    private class EventProcessingJob extends Job {
    /**
                    });
        }
            return image;
                log.debug("Error dereferencing virtual entity", e);
                List<DBNNode> nodeList = new ArrayList<>(2);
                        for (int i = 0; i < realEvents.length; i++) {
    private DBNNode findNodeByPath(
 * you may not use this file except in compliance with the License.
        }
        @NotNull DBPProject project,
        NodePath nodePath = getNodePath(path);

            }
 * It will work but some actions will not work well
                }
        //1 because project node is 0, fake resource node must be 1 in the path
            super("Navigator notifier");
        }
        if (object instanceof DBNDatabaseNode) {
import org.eclipse.core.runtime.Status;
            this.pathItems = pathItems;
    }
                @SuppressWarnings("unchecked")
                List<DBNNode> nodeList = (List<DBNNode>) obj;
                    DBWorkbench.getPlatformUI().executeInMainThread(() -> {
        for (int i = rootDbNodeIndex + 1; i < nodePath.pathItems.size(); i++) {
        }
    //this 'node' exist to avoid collision between resource folders and other root nodes
        String expectedNodePathName = nodePath.pathItems.get(currentLevel);
                }
    }
    public DBNDataSource getDataSourceByPath(@NotNull DBPProject project, @NotNull String path) {
                return null;
        NodePath(DBNNode.NodePathType type, List<String> pathItems) {
        if (node == null) {
                    break;

    public void addListener(INavigatorListener listener)
        } else {
        if (overlayImage == null) {
 * DBNModel.
            // Empty state


            return null;
            log.debug("Node '" + expectedNodePathName + "' not found in parent node '"
                }
    public DBNRoot getRoot()
/*
    }
        }
            }

     * @param project      Project to which the path is relative
        if (currentLevel >= nodePath.pathItems.size()) {
     */
            this.legacyFormat = type != DBNNode.NodePathType.node;
                    nodeMap.remove(node.getObject());
        }
        final NodePath nodePath = getNodePath(path);
        return modelProjects;
        return modelAuthContext;
    }
            }
                // Just remove it
                badNode = true;
        return findNodeByPath(monitor, projectNode, nodePath, nodeLevel);
                    realEvents = eventCache.toArray(new DBNEvent[0]);
            throw new IllegalStateException("Can't initialize navigator model more than once");
                this.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, DBNEvent.NodeChange.UNLOAD, node));
            }
        EventProcessingJob() {
                detectedNode = child;
        DBNNode.NodePathType nodeType = DBNNode.NodePathType.other;
        if (CommonUtils.isEmpty(nodePath.pathItems)) {
        if (currentLevel == 1 && FAKE_RESOURCE_ROOT_NODE.equals(expectedNodePathName)) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            node.addChildItem(objectToCache);
                    if (itemsClass != null && itemsClass.isAssignableFrom(objectToCache.getClass())) {
            return (DBNDatabaseNode)object;
        if (state == null) {
            } else if (obj instanceof List) {
import org.jkiss.dbeaver.model.app.DBPProject;
        List<String> pathItems;
        synchronized (this.listeners) {
        int nodeLevel = getNodePath(projectNodePath).pathItems.size();
            if (obj == null) {
        if (projectNode == null) {
    public DBNModel(DBPPlatform platform, @Nullable List<? extends DBPProject> modelProjects) {
                        Class<?> itemsClass = ((DBNDatabaseFolder) child).getChildrenClass();
        return new DBIconComposite(image, false, null, null, null, overlayImage);
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
            while (!platform.isShuttingDown()) {
                    log.error(e);
     *


 * distributed under the License is distributed on an "AS IS" BASIS,
            return null;
                // No found
        }
            }
        for (DBNNode.NodePathType type : DBNNode.NodePathType.values()) {
    public DBNNode getNodeByPath(@NotNull DBRProgressMonitor monitor, @NotNull String path) throws DBException {
            if (obj == null) {
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
                        continue;
            return;
 * It's strongly recommended to not put the same DBSObject in tree model multiple times.
            ((DBIconComposite) image).setBottomRight(overlayImage);
        // Not found
       
            return (DBNDatabaseNode)obj;
            if (this.listeners.contains(listener)) {
    }
        this.fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, nodeChange, node));
        }
    }
        synchronized (nodeMap) {
        @Override
        }
    private static NodePath getNodePath(@NotNull String path) {
        DBSObject[] path = DBUtils.getObjectPath(object, false);
    }
        }
    //example: you can create 'datasources' folder, and nodeUri will be the same as for DBNProjectDatabases
                nodeType = type;
        return null;
        @NotNull DBRProgressMonitor monitor,
                    Class<?> itemsClass = ((DBNDatabaseFolder) child).getChildrenClass();
        }
    }
        }
            }
    public DBPPlatform getPlatform() {
            final String prefix = type.getPrefix();
                    badNode = true;

import org.jkiss.dbeaver.utils.RuntimeUtils;
        DBNProject projectNode = getRoot().getProjectNode(project);
        if (root != null) {
                log.error("Object's " + object.getName() + "' parent node is not a database node: " + node.getParentNode());
        if (nodePath.legacyFormat) {
                this.nodeMap.clear();
        if (!nodeFilters.isEmpty()) {
            return projectNode.getDatabases().getDataSource(nodePath.first());
    void removeNode(DBNDatabaseNode node, boolean reflect)
                // Multiple nodes
    public void addFilter(Function<DBNNode, Boolean> filter) {

        if (projectNode == null) {
                        }
            if (nodeList.isEmpty()) {

        }
    }
import org.eclipse.core.runtime.IProgressMonitor;

                if (realListeners == null || realListeners.length == 0) {
                .collect(Collectors.joining("/"));
    public void fireNodeEvent(final DBNEvent event)
                return node;
    }
import org.jkiss.dbeaver.model.struct.DBSEntity;
        }
        return node;
        } else {
    @Nullable
            return detectedNode;
    @Nullable
import org.jkiss.dbeaver.DBException;
                return (DBNDatabaseNode) node.getParentNode();
    {

public class DBNModel {
            return nodeList.get(0);
import org.eclipse.core.runtime.IStatus;

                if (nodeList.isEmpty()) {
    @Nullable
                    cached = true;
                try {
    //TODO: create real resource root node
 *
                parentObject = part.getParentTable();
        Map<String, DBNDataSource> datasourceById = Arrays.stream(databaseRootNode.getDataSources())
            // It seems this object was filtered out
        @NotNull DBNNode currentNode,
        }
        for (int i = 0; i < path.length; i++) {

            DBNDatabaseNode[] children = node.getChildNodes();
                nodeMap.put(node.getObject(), node);
    public void removeListener(INavigatorListener listener)
        }
                    }
            // Never be here
                        return node;
        }
                // New node
                return null;
                        }
     * Converts a project-relative path to the full node path.
                return datasourceById.get(potentialDatasourceId);
            Object obj = nodeMap.get(node.getObject());
                        if (itemsClass != null && itemsClass.isAssignableFrom(object.getClass())) {
    }
        DBNProjectDatabases databaseRootNode = projectNode.getDatabases();
    }

    boolean isNodeVisible(DBNNode node) {
        int rootDbNodeIndex = nodePath.pathItems.indexOf(databaseRootNode.getNodeId());
    @Nullable
    private transient INavigatorListener[] listenersCopy = null;
            log.warn("Remove unregistered meta node object " + node.getNodeDisplayName());
                // Multiple nodes
            } catch (DBException e) {
        return null;
    @Nullable
        this.platform = platform;
                for (INavigatorListener listener : listeners) {
        if (badNode) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            this.root.dispose(false);
            }
                break;
        synchronized (this.listeners) {
    }
                return null;
            currentLevel++;

            projectNode.getDatabases();
        final DBPImage overlayImage = state.getOverlayImage();

        }
            } else if (obj instanceof List) {
            }
        if (nodePath.legacyFormat) {
        //skip fake root resource node
 *
    ) throws DBException {
/*
        return modelProjects == null;

            return null;
                log.warn("Listener " + listener + " already registered in model");

        DBNNode detectedNode = null;
            if (parentNode instanceof DBNProjectDatabases projectDatabases) {
            obj = nodeMap.get(object);
                }
            if (path.startsWith(prefix)) {
        return true;
            return projectNode.getNodeUri() + '/' + path.pathItems.stream()
                List<DBNNode> nodeList = (List<DBNNode>) obj;
        DBNNode[] children = currentNode.getChildren(monitor);
        if (projectNode != null) {
            return (DBNDatabaseNode)object;
                log.error(e.getMessage());
        }
            }
                log.warn("Listener " + listener + " wasn't registered in model");

        }
            return currentNode;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
import java.util.function.Function;
                if (!f.apply(node)) {

                // Parent node is not read
        if (image instanceof DBIconComposite) {
            try {
                    if (child instanceof DBNDatabaseFolder) {
            return null;
                    continue;
     * @return Full node path with prefix, or {@code null} if the project node is not found or the path is not valid.
    }
    }
    {
                    }
                return null;
            if (nodeList.size() > 1) {

    /**
            if (!listeners.isEmpty()) {
            }
                nodeMap.put(node.getObject(), nodeList);

        }
                            return child;
}

        }
        synchronized (nodeMap) {
    private boolean cacheNodeChildren(DBRProgressMonitor monitor, DBNDatabaseNode node, DBSObject objectToCache, boolean addFiltered) throws DBException
            // it can be folder name or datasource id
        if (node != null) {
    {
    private final List<? extends DBPProject> modelProjects;

        return null;
                }
                break;

 * Unless required by applicable law or agreed to in writing, software
            node = getNodeByObject(item);

        DBSObject parentObject = object.getParentObject();
                    }
                } else if (child.getObject() == objectToCache) {
        }
                path = path.substring(prefix.length());
import org.jkiss.utils.ArrayUtils;
            eventCache.add(event);
                    realListeners = listenersCopy;
        public String first() {
        if (this.root != null) {
            return image;
                }
            String potentialDatasourceId = nodePath.pathItems.get(i);
                return null;
    public DBNDatabaseNode getNodeByObject(DBRProgressMonitor monitor, DBSObject object, boolean addFiltered)
            throw new DBException("Node from another project");
                // Try to find parent node withing children
     * @param relativePath Path relative to the project node, without path prefix.
    }
    }

import org.jkiss.dbeaver.model.DBPImage;
        } else if (obj instanceof List) {

        }
                if (child instanceof DBNDatabaseFolder) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    {
        this.modelAuthContext = modelAuthContext;
        return findNodeByPath(monitor, getRoot(), nodePath, 0);
    ) throws DBException {
    public DBNDatabaseNode getParentNode(DBSObject object)
                object = DBVUtils.getRealEntity(monitor, (DBSEntity)object);
                            }
    {
     *
                projectDatabases.getDataSourceRegistry().flushConfig();
        this.root = new DBNRoot(this);
        boolean cached = false;
            this.listenersCopy = this.listeners.toArray(new INavigatorListener[0]);
                    if (eventCache.isEmpty()) {
        DBNDatabaseNode[] children = node.getChildren(monitor);
    }
            log.debug("Project node not found");
        }
    public String toProjectPath(@NotNull DBPProject project, @NotNull String relativePath) {

    }
    @NotNull

    }
        }
        DBNDatabaseNode node = getNodeByObject(object);
            this.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, DBNEvent.NodeChange.LOAD, node));
        if ((object instanceof DBSTablePartition part) && part.needFullPath()) {
        DBNProject projectNode = getRoot().getProjectNode(project);
                for (DBNDatabaseNode child : children) {
        }
    public List<? extends DBPProject> getModelProjects() {
            } catch (DBException e) {
        if (isGlobal()) {
    @Nullable
        @NotNull NodePath nodePath,
            }

 */
 * Contains all objects which are shown in navigator tree.
        if (obj == null) {
            } else {
            }
        if (!ArrayUtils.isEmpty(children)) {
                for (DBNDatabaseNode node : nodeList) {
     * Creates navigator model.
                        }
        DBNProject projectNode = getRoot().getProjectNode(project);

            return true;
        }
                final DBNEvent[] realEvents;
        if (object == null) {
        return getNodeByObject(object);
            return null;
            this.type = type;

    void addNode(DBNDatabaseNode node)
            }
import org.eclipse.core.runtime.jobs.Job;

        }
        if (projectNode == null) {
package org.jkiss.dbeaver.model.navigator;
                } catch (Exception e) {
        String projectNodePath = projectNode.getNodeUri();
    {
        @NotNull String path
    public DBNNode getNodeByPath(
    }
            if (node == null) {
        return platform;
        if (children == null) {
            } else if (obj instanceof DBNNode) {
            return DBNLegacyUtils.legacyGetNodeByPath(monitor, projectNode, nodePath);
        }

            .collect(Collectors.toMap(DBNDataSource::getNodeId, Function.identity()));
        }
            Object obj = nodeMap.get(node.getObject());
            DBSObject nextItem = path[i + 1];
        }
        }
        }
        if (object instanceof DBNDatabaseNode) {
                                listener.nodeChanged(realEvents[i]);


import org.jkiss.dbeaver.model.auth.SMSessionContext;
        final boolean legacyFormat;
        DBNProject projectNode = root == null ? null : root.getProjectNode(project);
    {
    }
            this.listenersCopy = this.listeners.toArray(new INavigatorListener[0]);
        @NotNull DBRProgressMonitor monitor,
                }
        }
            for (DBNDatabaseNode child : children) {
        if (!isGlobal() || platform.isShuttingDown()) {
    public static final String FAKE_RESOURCE_ROOT_NODE = "resources";
        } else if (obj instanceof DBNDatabaseNode) {
        if (!path.startsWith(projectNodePath)) {

            }
    private SMSessionContext modelAuthContext;
                cacheNodeChildren(monitor, node, nextItem, addFiltered);
            if (item == DBUtils.getPublicObjectContainer(parentObject)) {
    }
        Object obj;

                synchronized (eventCache) {
    protected DBNProject createProjectNode(DBNRoot parent, DBPProject project) {
            }
            } else if (obj instanceof DBNNode) {
            return null;
                nodeList.add((DBNNode)obj);
            DBSObject item = path[i];
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.app.DBPPlatform;
    }
        }
    public DBNDatabaseNode getNodeByObject(DBSObject object)
            throw new IllegalStateException();
        }
    {
        } else {
        }
            return node;
            return DBNLegacyUtils.legacyGetNodeByPath(monitor, this, nodePath);
                    return false;
/**

        synchronized (this.listeners) {
            }
            return findNodeByPath(monitor, detectedNode, nodePath, currentLevel + 1);
                            for (INavigatorListener listener : listenersCopy) {
            node = getNodeByObject(item);
        if (!cached && addFiltered && node.isFiltered()) {
            @SuppressWarnings("unchecked")
    @Nullable
            }
            } else {

        int currentLevel
            if (!this.listeners.remove(listener)) {
        if (object instanceof DBSEntity) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (node.getParentNode() instanceof DBNDatabaseNode) {
            log.debug("Project node not found");
        DBNNode.NodePathType type;
        for (int i = 0; i < path.length - 1; i++) {
            DBSObject item = path[i];
    private static final Log log = Log.getLog(DBNModel.class);
                parentObject = part.getPartitionParent();
        @Override
        }
        }
 * See the License for the specific language governing permissions and
            this.listenersCopy = null;
        nodeFilters.add(filter);
import java.util.*;
        boolean badNode = false;
    }
            return image;
            if (ArrayUtils.isEmpty(children)) {
        if (path.type == DBNNode.NodePathType.other) {
        } else {
    public static class NodePath {
                    }
    public void initialize()
    @Nullable
    }
        }
    public DBNDatabaseNode findNode(DBSObject object)
                if (!nodeList.remove(node)) {
        items.replaceAll(DBNUtils::decodeNodePath);
import org.jkiss.code.NotNull;
     * @param modelProjects Model projects. If null then this is global navigator model. Otherwise it points to a session-like object.
            if (child.getNodeId().equals(expectedNodePathName)) {
            synchronized (nodeMap) {
                    if (node instanceof DBNDatabaseItem && !node.getMeta().isVirtual()) {
        public String toString() {
     */
    private final Map<DBSObject, Object> nodeMap = new HashMap<>();
            return pathItems.isEmpty() ? null : pathItems.get(0);
            }
    }
            }
            // Get just first one
import java.util.stream.Collectors;
            return null;
            this.root = null;
    void addNode(DBNDatabaseNode node, boolean reflect)
                nodeList.add(node);
 * (e.g. TreeViewer sometimes update only first TreeItem corresponding to model certain model object).
            }
    /**
            if (reflect) {
    {
    }
            }
    {
        for (DBNNode child : children) {
                }
        if (node != null) {
                    log.warn("Listener '" + listener + "' is not unregistered from DBM model");
                }
        if (reflect) {
        }
                final INavigatorListener[] realListeners;
     * Deprecated - use getNodeByPath with project parameter
                RuntimeUtils.pause(100);
        return root;
                        if (cached) {
        }
            }
            log.warn("Can't find tree node for object " + object.getName() + " (" + object.getClass().getName() + ")");
        }
