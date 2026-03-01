    }
        }
        return aClass;
        this.parentNode = null;
        while (currentNode != null && !(currentNode instanceof DBNRoot)) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getNodeTargetName() {
    static final Log log = Log.getLog(DBNNode.class);
    public String getDescription() {
    public abstract DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException;

    @Deprecated
    }
     * <p>
    public DBNNode getParentNode() {
     * Where typeN is path element for particular database item, name is database object name.
            if (!pathBuilder.isEmpty()) {
     */
     *
    protected void fireNodeEvent(final DBNEvent event) {
    }
     * @return a unique path to the node containing information about the reals hierarchy
    }
    @NotNull
     * Node item path in form [nodeType://]<path>
    }
            String odn2 = o2.getNodeDisplayName();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return navigableOnly ? allowsNavigableChildren() : allowsChildren();
    }
    /**


        resource,
            return null;
     * Unique identifier of a node within its parent.
        return false;
    }
        if (CommonUtils.isEmpty(itemsType)) {
        return false;

    @Nullable
                continue;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");


        if (this.getParentNode() != null) {
        if (!DBSObject.class.isAssignableFrom(aClass)) {
    @NotNull
     * @deprecated the path is not unique and does not contain complete information to find the correct node
        for (DBNNode node = getParentNode(); node != null; node = node.getParentNode()) {
                return true;
    }
                    if (childrenClass != null && DBSObjectContainer.class.isAssignableFrom(childrenClass)) {

     * If refresh cannot be done in this level then refreshes parent node.
    }
        return null;
    public boolean isChildOf(DBNNode node) {
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
    /**
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * <p>
    @Override
package org.jkiss.dbeaver.model.navigator;
    @NotNull
    public String getNodeBriefInfo() {
                    Class<? extends DBSObject> childrenClass = DBNNode.getFolderChildrenClass((DBXTreeFolder) child);
     * Node type. May be used internally.
            pathBuilder.insert(0, nodeId);
        return false;
}
    public abstract String getNodeType();
                        return true;
     * @return full item node path



        } else {
            log.error("Class '" + aClass.getName() + "' doesn't extend DBSObject");
        database,
        return false;


    public boolean supportsDrop(@Nullable DBNNode otherNode) {
            log.error("Items class '" + itemsType + "' not found");
     *
            return null;
            return null;
        StringBuilder pathName = new StringBuilder();
        return null;
        }
                pathBuilder.insert(0, '/');
     */
    @Nullable

     * nodeType can be 'resource', 'folder' or 'database'.
    }
    }
        return getParentNode() != null && getParentNode().isLocked();
                currentNode = currentNode.getParentNode();

        return null;
            }
    @Override

    protected final DBNNode parentNode;
    public String getName() {
 * limitations under the License.
    }
        return NodePathType.node.getPrefix() + pathBuilder;
     * If missing then 'database' will be used (backward compatibility).
        return false;
    }
                return 1;
    }

    @Override
    protected DBNNode() {
    }
        return getNodeType();

            return null;
    @NotNull
    public <T> T getAdapter(@NotNull Class<T> adapter) {
/**
    @Nullable
    }
        return parentNode == null ? null : parentNode.getModel();
import java.util.List;
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
        List<DBXTreeNode> children = meta.getChildren(node);
    /**
        pathName.append(getNodeDisplayName());
            boolean isFolder1 = o1 instanceof DBNLocalFolder;
        DBPImage image = getNodeIcon();
     */
     * @param monitor progress monitor
        }
    @Nullable
        if (project == null) {
    }

     * Used to copy target name in clipboard and in DND operations.
                return ((DBNProject) node).getProject();

     *
        return allowsChildren();
                return DBIcon.TREE_FOLDER;
        return true;
            }
     * event which will cause actual tree nodes refresh. Underlying object could present multiple times in
        return getNodeDescription();
            return image;
     * @return real refreshed node or null if nothing was refreshed
     */
     * Internal node name. Usually it is the same as getName.

     * Do not actually change navigation tree. If some underlying object is refreshed it must fire DB model
 *
    }

            if (currentNode instanceof DBNLocalFolder folder) {
 *     http://www.apache.org/licenses/LICENSE-2.0
     * navigation model - each occurrence will be refreshed then.
    public DBPProject getOwnerProjectOrNull() {


            boolean isFolder2 = o2 instanceof DBNLocalFolder;
/*
    public String getNodeId() {
     * Node uri path in form [node://]<parentPath>/<path>
            if (parent == node) {
 * DBNNode

            }
        public String getPrefix() {
            }
    @NotNull
    public static Class<? extends DBSObject> getFolderChildrenClass(DBXTreeFolder meta) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
 * You may obtain a copy of the License at
    @Nullable

     */
                return -1;
 * Unless required by applicable law or agreed to in writing, software

    @NotNull

 * DBeaver - Universal Database Manager
    public static boolean nodeHasStructureContainers(@NotNull DBNNode node, @NotNull DBXTreeNode meta) {
 *
    @NotNull
                return DBIcon.TREE_PAGE;

    protected boolean allowsNavigableChildren() {
    @Nullable
    }
        }
        return getNodeUri();
        throw new DBException("Drop is not supported");
    @Nullable
    public DBNModel getModel() {

            } else if (!isFolder1 && isFolder2) {
public abstract class DBNNode implements DBPNamedObject, DBPNamedObjectLocalized, DBPObjectWithDescription, DBPPersistedObject, DBPAdaptable {
     * Equals to regular node name by default.
import java.util.Comparator;
            return name() + "://";
        nodes.sort((Comparator<DBNNode>) (o1, o2) -> {
    public String getLocalizedName(@NotNull String locale) {
 */
            }
    }
            if (!CommonUtils.isEmpty(parentName)) {
                }
        for (DBNNode parent = getParentNode(); parent != null && !(parent instanceof DBNDataSource); parent = parent.getParentNode()) {
            String odn1 = o1.getNodeDisplayName();
        if (aClass == null) {
    }



    public boolean supportsRename() {
    /**
        return getName();
    }

    }
            } else {
                pathName.insert(0, '.').insert(0, parentName);
                currentNode = folder.getLogicalParent();
        }
     * @throws DBException on any internal exception
        if (!CommonUtils.isEmpty(children)) {
     */
    @NotNull

    void clearNode(boolean reflect) {
    public boolean isFiltered() {
import org.jkiss.code.Nullable;
    public Throwable getLastLoadError() {
     */
    public abstract DBPImage getNodeIcon();
        return parentNode;
    public DBPProject getOwnerProject() {
        }

            }
    }

        return getNodeDisplayName();

    @NotNull
    }
    public enum NodePathType {
import java.util.Collection;
    public abstract String getNodeDescription();
    @Override
    }
 */
        String itemsType = CommonUtils.toString(meta.getType());
    }
        getModel().fireNodeEvent(event);
            String nodeId = DBNUtils.encodeNodePath(currentNode.getNodeId());
    @NotNull
        } else {
        return getName();
            if (this.hasChildren(false)) {
        });
                if (child instanceof DBXTreeFolder) {
        }
    @Override
        dbvfs,
            throw new IllegalStateException("Node doesn't have owner project");
    @NotNull


    }
    /**
        return null;
            }
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException {

import org.jkiss.dbeaver.Log;
    @NotNull

import org.jkiss.utils.CommonUtils;
    public String toString() {
        return false;
        }
    }
    @Nullable
    public boolean hasChildren(boolean navigableOnly) {
     */
            String parentName = parent.getNodeDisplayName();
        var pathBuilder = new StringBuilder();


        throw new DBException("Rename is not supported");
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
    public final String getNodeUri() {
                // FIXME: When traversing to root, nested folders are skipped. This is a workaround so that we don't skip them.
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
    protected abstract boolean allowsChildren();
        for (DBNNode parent = getParentNode(); parent != null; parent = parent.getParentNode()) {
import org.jkiss.dbeaver.DBException;
            for (DBXTreeNode child : children) {
            }
            if (node instanceof DBNProject) {
            }
    public abstract String getNodeDisplayName();
import org.jkiss.dbeaver.model.*;
    public DBPImage getNodeIconDefault() {
        return false;
                // skip folders
    public String getNodeFullName() {

     * use {@link #getNodeUri()} instead
     * Node type in display format.

    public boolean allowsOpen() {
    /**
    }
            return CommonUtils.notEmpty(odn1).compareToIgnoreCase(CommonUtils.notEmpty(odn2));
    @NotNull
     * @param source  event source
            return this.getParentNode().refreshNode(monitor, source);

    public boolean isPersisted() {
    @Nullable
    public abstract String getNodeItemPath();
     * For resources and folders path is just a hierarchy path divided with / (slash).
        return project;

    }
    }
    public boolean isDisposed() {
    static void sortNodes(@NotNull List<? extends DBNNode> nodes) {

    protected void dispose(boolean reflect) {
        return pathName.toString();
            } else {
    }
    public String getNodeTypeLabel() {
    }

    }
    /**
        folder,
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others

        ext, other, node;
        return getNodeDisplayName();
        DBPProject project = getOwnerProjectOrNull();
    public boolean isManageable() {
    }

        this.parentNode = parentNode;
    }
            if (parent instanceof DBNDatabaseFolder) {
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.app.DBPProject;
     * For database nodes path has form: type1=name1/type2=name2/...[/typeX]
    @Override
    public boolean isLocked() {
import org.jkiss.code.NotNull;
        var currentNode = this;
        }
     * Refreshes node.
    /**
        Class<DBSObject> aClass = meta.getSource().getObjectClass(itemsType, DBSObject.class);
    protected DBNNode(DBNNode parentNode) {
    }
        if (image == null) {
                    }
            if (isFolder1 && !isFolder2) {
 * See the License for the specific language governing permissions and
        return true;


