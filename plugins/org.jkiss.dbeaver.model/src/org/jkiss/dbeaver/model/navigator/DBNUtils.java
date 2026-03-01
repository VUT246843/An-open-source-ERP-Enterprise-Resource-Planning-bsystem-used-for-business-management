        return null;
        if (comparator != null) {
        if (dataSource instanceof DBSObjectContainer container) {
     */
        node.dispose(reflect);
            }
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
}

public class DBNUtils {
    public static JexlContext makeContext(@NotNull DBNNode node) {
                            || Objects.equals(contextDefaults.getDefaultSchema(), object);
    public static boolean isReadOnly(@NotNull DBNNode node) {
 * DBeaver - Universal Database Manager
        }
        } else {
    public static DBNDatabaseNode getChildFolder(
            for (DBNNode node : children) {
        DBNModel model = getNavigatorModel(object);
        @NotNull DBNDatabaseNode node,
            if (child instanceof DBSEntity entity) {
           dbNode.getObject().getDataSource().getContainer().getNavigatorSettings().isMergeEntities();
                objectToOpen = entities.getFirst().getParentObject();

            return;
        if (children.length == 0) {
    @Nullable
        return result;
        for (DBSObject child : CommonUtils.safeCollection(container.getChildren(monitor))) {

    }
        }

        return model == null ? null : model.getNodeByObject(monitor, object, addFiltered);
            } else if (parent instanceof DBNRoot) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;

                if (o1 instanceof DBNContainer && o2 instanceof DBNContainer) {

        };

     */
                Arrays.sort(children, new NodeNameComparator());
        @NotNull DBSObjectContainer container,

                    {
    }
import org.jkiss.utils.AlphanumericComparator;
 * See the License for the specific language governing permissions and
        // Sort children is we have this feature on in preferences
        return DBNUtils.getNodeByObject(monitor, objectToOpen, true);
    {
                }

import org.jkiss.code.NotNull;
        } else if (element instanceof DBNProject nodeProject) {
    public static boolean isFolderNode(@NotNull DBNNode node) {
            result = filtered.toArray(new DBNNode[0]);
        if (objectToOpen == null) {

    }
                if (!(childNode instanceof DBNDatabaseFolder folder)) {
                return false;
        }

        if (prefStore.getBoolean(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY)) {
            return;
            return;
    public static DBXTreeItem getValidItemsMeta(
            public boolean has(String name) {
        return project.getNavigatorModel();
                    && dbNode.getValueObject() != null;
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        @NotNull DBRProgressMonitor monitor,
        }
                objectToOpen = dataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return children;
/*
                        return Objects.equals(contextDefaults.getDefaultCatalog(), object)
        @NotNull DBRProgressMonitor monitor,
 *
            }
        boolean forTree
           dbNode.getObject() instanceof DBSEntity &&

            @Override
    }
import org.jkiss.utils.ArrayUtils;

            objectToOpen = entities.getFirst();
            }
                        // but we cannot. Because after filters are applied child nodes may contain deeper nested type
    private static class NodeNameComparator implements Comparator<DBNNode> {
    /**
    }
                }

        }
     * The method encode symbols('/','%')
    public static String decodeNodePath(@NotNull String nodePath) {
            comparator = Objects.isNull(comparator)
                ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE);
                        !expectedChildrenType.isInstance(nodeChildren[0].getObject()))
        if (children != null && children.length > 0) {
        }
            Arrays.sort(children, comparator);
                        // Note: We should've check expectedNestedType.isInstance(nodeChildren[0].getObject())
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                if (node instanceof DBNDatabaseNode dbNode) {
            @Override
                    }
import org.jkiss.dbeaver.model.app.DBPProject;
            }
    }
import org.jkiss.dbeaver.model.struct.*;
            for (DBNDatabaseNode childNode : ArrayUtils.safeArray(node.getChildren(monitor))) {
    }
        if (forTree) {
        if (entities.size() == 1) {
        @NotNull Class<?> folderType
        boolean addFiltered
                : alphanumericComparator.compare(node1.getNodeDisplayName(), node2.getNodeDisplayName());
                ? alphanumericComparator.compareIgnoreCase(node1.getNodeDisplayName(), node2.getNodeDisplayName())
                }
        List<DBSEntity> entities = new ArrayList<>();
                return type.cast(parent);
            !dbNode.getDataSourceContainer().hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_METADATA);

    public static DBNDatabaseNode getDefaultDatabaseNodeToOpen(DBRProgressMonitor monitor, DBPDataSource dataSource) throws DBException {
                filtered.add(node);
    public static String getLastNodePathSegment(@NotNull String path) {
        if (prefStore.getBoolean(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST) || isMergedEntity(firstChild)) {
        DBNNode[] children = node.getChildren(monitor);
            return nodeProject.getProject() == DBWorkbench.getPlatform().getWorkspace().getActiveProject();
                    }
        }

        @NotNull List<DBSEntity> entities

            if (object != null) {

        if (ArrayUtils.isEmpty(children)) {
        }
            Arrays.sort(children, NodeFolderComparator.INSTANCE);
            return null;

                getConnectionEntities(monitor, oc, entities);
        if (firstChild instanceof DBNDatabaseItem item && item.getObject() instanceof DBSTableColumn) {
        public NodeNameComparator() {
                            return dbNode.getValueObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                final DBXTreeFolder meta = folder.getMeta();
 * Unless required by applicable law or agreed to in writing, software
                        case "dataSource":
        DBNNode firstChild = children[0];
 */
import org.jkiss.dbeaver.model.*;
                    continue;
            }
    private static boolean isMergedEntity(@NotNull DBNNode node) {
     *

        if (node == null) {
                }
        DBPPreferenceStore prefStore = DBWorkbench.getPlatform().getPreferenceStore();
                if (defaultContext != null) {

     *
                return null;
            DBSObject object = wrapper.getObject();
    }
        DBNNode[] result;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.navigator;
    }
    }
                    }
            return children;
                    if (nodeChildren != null && nodeChildren.length > 0 &&
                    if (contextDefaults != null) {
        if (itemsMeta != null && itemsMeta.isOptional()) {
 *
        @NotNull DBSObject object,
    ) {
 *
        // and if children are not folders

                if (object instanceof DBSInstance i && object.getParentObject() instanceof DBSInstanceContainer ic) {
                    if (objectClass != null && folderType.isAssignableFrom(objectClass)) {
            throw new DBException("No entities found in file datasource");
        }
        DBPProject project = DBUtils.getObjectOwnerProject(object);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        @Override
    public static DBNDatabaseNode getNodeByObject(@NotNull DBSObject object) {

    @Nullable
        int divPos = path.lastIndexOf('/');
        return itemsMeta;
     * @param path - path

    public static DBNDatabaseNode getNodeByObject(
        return model == null ? null : model.getNodeByObject(object);
    @Nullable
    /**
            int first = isFolderNode(node1) ? -1 : 1;

        }
        Comparator<DBNNode> comparator = null;
 * you may not use this file except in compliance with the License.
        return nodePath.replace("%2F", "/").replace("%25", "%");
                        // FIXME: support it for databases which support only tables
        if (project == null) {
                if (node instanceof DBPHiddenObject hiddenObject && hiddenObject.isHidden()) {

 * Copyright (C) 2010-2026 DBeaver Corp and others
    ) throws DBException {
        }
            List<DBNNode> filtered = new ArrayList<>();

            return node instanceof DBNContainer || node.allowsChildren();
            }
            });
        private final AlphanumericComparator alphanumericComparator = AlphanumericComparator.getInstance();
        }
            @Override
        }
                break;
    }
            children = filterNavigableChildren(children, forTree);
        }
            if (expectedChildrenType != null) {
            }
        private static boolean isFolderNode(DBNNode node) {
        DBNModel model = getNavigatorModel(object);
        }
            } else if (child instanceof DBSObjectContainer oc) {
import org.jkiss.dbeaver.Log;
            caseInsensitive = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(
        private final boolean caseInsensitive;

/**
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * limitations under the License.
            !(node instanceof DBNDataSource) &&
                List<DBXTreeNode> childMetas = itemsMeta.getChildren(dbNode);
    }
                        case "object":
    public static boolean isDefaultElement(@Nullable Object element) {
    }
            }
    public static <T> T getParentOfType(@NotNull Class<T> type, DBNNode node)
        @NotNull DBRProgressMonitor monitor,
        }
        for (DBNNode parent = node.getParentNode(); parent != null; parent = parent.getParentNode()) {
        @Override
        return null;
            log.error("Error reading child folder", e);
                }
            return caseInsensitive
                log.warn("Set is not implemented in DBX model");
                    continue;
                        return childNode;
        } else {
            }
            comparator = NodeFolderComparator.INSTANCE.thenComparing((o1, o2) -> {

            getConnectionEntities(monitor, container, entities);
                if (!CommonUtils.isEmpty(meta.getType())) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
    }
        return false;
            } else {
            int second = isFolderNode(node2) ? -1 : 1;
    public static String encodeNodePath(@NotNull String path) {
    ) {
    @Nullable
            if (node instanceof DBNDatabaseNode dbn && dbn.getObject() instanceof DBPObjectWithOrdinalPosition) {

        @NotNull DBNDatabaseNode dbNode
                        case "connected":

    @NotNull
                : comparator.thenComparing(new NodeNameComparator());

        }
                    DBNDatabaseNode[] nodeChildren = dbNode.getChildren(monitor);
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
                    return -1;
        if (firstChild instanceof DBNContainer) {
                    continue;
import java.util.*;
                            return dbNode.getDataSource();
                DBCExecutionContext defaultContext = DBUtils.getDefaultContext(object, false);
        DBXTreeItem itemsMeta = dbNode.getItemsMeta();

            if (prefStore.getBoolean(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY)) {
            // Specifically this handles optional catalogs and schemas in Generic driver
     */
        return divPos == -1 ? path : path.substring(divPos + 1);
                            return dbNode.getDataSource() != null;
        return new JexlContext() {
                        itemsMeta = nestedMeta;
        return node.allowsChildren();
    public static DBNNode[] getNodeChildrenFiltered(

        }
    }
                }
    }
     * @param nodePath - path
import org.jkiss.utils.CommonUtils;
            return first - second;

                    return 1;
    }
                }
        @NotNull DBRProgressMonitor monitor,
                if (childMetas.size() == 1 && childMetas.getFirst() instanceof DBXTreeItem nestedMeta) {
    public static void disposeNode(@NotNull DBNNode node, boolean reflect) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return ic.getDefaultInstance() == i;
     * @return - string path segment
            }
        }
        @NotNull DBNNode node,
                return 0;

        static final NodeFolderComparator INSTANCE = new NodeFolderComparator();
    @NotNull
 * Navigator helper functions
            if (type.isInstance(parent)) {
 */
        public int compare(DBNNode node1, DBNNode node2) {
        try {
    @Nullable

    ) throws DBException {
            }
            return;

                    }
import org.jkiss.code.Nullable;
                ? new NodeNameComparator()

    private static void sortNodes(@NotNull DBNNode[] children) {

    }
                if (node instanceof DBNDatabaseNode dbNode && !dbNode.getMeta().isNavigable()) {
    }
    public static DBNNode[] filterNavigableChildren(@NotNull DBNNode[] children, boolean forTree) {
     * The method decode symbols('%2F','%25')
            public Object get(String name) {
            result = children;
                    switch (name) {
                entities.add(entity);
                    return 0;
        if (element instanceof DBSWrapper wrapper) {
                    final Class<?> objectClass = meta.getSource().getObjectClass(meta.getType());
    private static void getConnectionEntities(
        if (firstChild.getAdapter(Path.class) != null) {
import java.nio.file.Path;
import org.jkiss.dbeaver.DBException;
                } else if (o2 instanceof DBNContainer) {
            return null;
import org.jkiss.dbeaver.ModelPreferences;
    private static final Log log = Log.getLog(DBNUtils.class);
                    DBCExecutionContextDefaults<?, ?> contextDefaults = defaultContext.getContextDefaults();
            Class<?> expectedChildrenType = dbNode.getChildrenOrFolderClass(itemsMeta);
        sortNodes(result);
        return path.replace("%", "%25").replace("/", "%2F");
            public void set(String name, Object value) {
        }
        return node instanceof DBNDatabaseNode dbNode &&
                return node instanceof DBNDatabaseNode dbNode && name.equals("object")
     * Get default node to open. Useful in case of open flat files with one table.
                }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;

    }
        }
        DBSObject objectToOpen;

    }

        return node instanceof DBNDatabaseNode dbNode &&
            }
        }
            // Maybe we need nested item.
import org.apache.commons.jexl3.JexlContext;
            if (entities.size() > 1) {

    private static class NodeFolderComparator implements Comparator<DBNNode> {

                // Get default context from default instance - not from active object
     * @return - node path object
    public static DBNModel getNavigatorModel(@NotNull DBSObject object) {
        } catch (DBException e) {
    ) throws DBException {
        public int compare(DBNNode node1, DBNNode node2) {
 * You may obtain a copy of the License at
        }
    @Nullable
    @Nullable
    /**
            return;
                } else if (o1 instanceof DBNContainer) {
        @NotNull DBRProgressMonitor monitor,
        if (firstChild instanceof DBNDatabaseItem item && item.getObject() instanceof DBPObjectWithOrdinalPosition) {
