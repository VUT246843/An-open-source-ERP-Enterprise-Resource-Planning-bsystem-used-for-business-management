
        return null;
            fileSystem.refreshRoots(monitor);
    public boolean isDisposed() {
    @Override
        @Nullable DBNFileSystemRoot[] mergeWith
    public boolean isManageable() {
        DBNFileSystemRoot[] roots = getChildren(monitor);

    public String toString() {
    }
import org.jkiss.dbeaver.model.DBIcon;
        } else {
                if (root.getName().equals(name)) {
        if (fileSystem == null || DBWorkbench.getPlatform().isShuttingDown()) {
                for (DBNFileSystemRoot oldRoot : mergeWith) {
        if (mergeWith != null) {
        return true;
    }
    }
    public DBNFileSystemRoot[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {

    @Deprecated
    }

        return null;
        children = null;
    @NotNull
        return this;
    public String getName() {
    public DBNFileSystem(@NotNull DBNNode parentNode, @NotNull DBFVirtualFileSystem fileSystem) {

        if (children == null) {
 * you may not use this file except in compliance with the License.
        }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
        DBFFileSystemDescriptor provider = DBWorkbench.getPlatform().getFileSystemRegistry().getFileSystemProvider(
    @Override
    }
        return fileSystem.getFileSystemDisplayName();
    }
        return provider == null ? DBIcon.TREE_FOLDER_LINK : provider.getIcon();

    }
        }

    ) throws DBException {
    private static final Log log = Log.getLog(DBNFileSystem.class);
    public DBFVirtualFileSystem getFileSystem() {
    }
            }
        return children;
 *
                    }
        return children == null;
            }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            children = readChildNodes(monitor, children);
import org.jkiss.dbeaver.runtime.DBWorkbench;
//    @Property(viewable = false, order = 100)
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * limitations under the License.
    public void refreshResourceState(Object source) {
}
 * See the License for the specific language governing permissions and
            return new DBNFileSystemRoot[0];
        return true;
                        newChild = oldRoot;
    public String getNodeDisplayName() {
            return null;
import java.util.*;
            if (CommonUtils.equalObjects(root.getRoot(), dbfRoot)) {
 * DBeaver - Universal Database Manager
        if (children == null) {
import org.jkiss.code.Nullable;
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
    @Override
        DBFVirtualFileSystem fileSystem = this.fileSystem;
        for (DBNFileSystemRoot root : children) {
 * Unless required by applicable law or agreed to in writing, software
    public DBNFileSystemRoot getRoot(DBFVirtualFileSystemRoot dbfRoot) {
    }
            }
    @NotNull
            return null;
        this.fileSystem = fileSystem;
            for (DBNFileSystemRoot root : roots) {
            }
 *


        return fileSystem.getDescription();


                    break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.model.DBConstants;
    @Nullable
import org.jkiss.dbeaver.model.meta.Property;

            if (mergeWith != null) {
                    if (oldRoot.getName().equals(rootPath.getName())) {
import org.jkiss.utils.CommonUtils;
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 1)
        }
    }
    @NotNull
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

            if (root.getRoot().getRootId().equals(path)) {
    public boolean needsInitialization() {
        }
package org.jkiss.dbeaver.model.navigator.fs;
    }
    }
        }
        for (DBFVirtualFileSystemRoot rootPath : fileSystem.getRootFolders(monitor)) {
    }
    public boolean supportsRename() {
    public String getNodeItemPath() {
            return o1.getNodeDisplayName().compareToIgnoreCase(o2.getNodeDisplayName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Collection<DBPDataSourceContainer> getAssociatedDataSources() {
    @Override
    @Override
            sortChildren(childNodes);


    }
        if (path.endsWith(":")) {
                return root;
    public DBPImage getNodeIcon() {
            final DBNFileSystemRoot[] childNodes = result.toArray(new DBNFileSystemRoot[0]);
        if (result.isEmpty()) {


        List<DBNFileSystemRoot> result = new ArrayList<>();
    }
    }
                }
        return fileSystem.getId();
        }
    protected void sortChildren(DBNNode[] list) {
            return childNodes;
import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystem;
 */
import org.jkiss.dbeaver.model.navigator.DBNEvent;
    @Override
    @NotNull
    @NotNull
            result.add(newChild);

        fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, this));
    private DBNFileSystemRoot[] children;

import org.jkiss.dbeaver.Log;

public class DBNFileSystem extends DBNNode implements DBNLazyNode
    @NotNull
        for (DBNFileSystemRoot root : children) {
import org.jkiss.dbeaver.model.DBPImage;

 *
 */
        });
                }
            for (DBNFileSystemRoot oldRoot : mergeWith) {
{
            DBNFileSystemRoot newChild = null;
        return Collections.emptyList();
    public boolean allowsChildren() {
                if (!result.contains(oldRoot)) {
            }
        }
import org.jkiss.code.NotNull;
            if (newChild == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        break;
        return NodePathType.dbvfs.name() + ".fileSystem";
    public DBNFileSystemRoot getRoot(@NotNull String path) {
            this.children = readChildNodes(monitor, null);
    }
                    DBNUtils.disposeNode(oldRoot, false);
    public String getNodeType() {
    @Override
                newChild = new DBNFileSystemRoot(this, rootPath);
        return fileSystem.getFileSystemDisplayName();
import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystemRoot;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        return fileSystem;
import org.jkiss.dbeaver.model.navigator.DBNLazyNode;
            return new DBNFileSystemRoot[0];
    @Override
        Arrays.sort(list, (o1, o2) -> {
    @Override
    @Nullable

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public String getNodeDescription() {
    @Nullable
    public String getNodeTypeLabel() {
    protected void dispose(boolean reflect) {
    @NotNull
    @Nullable
    @Override
 * You may obtain a copy of the License at
                }
    @Override
import org.jkiss.dbeaver.model.fs.DBFFileSystemDescriptor;
        return ModelMessages.fs_file_system;
/*
        return null;

    @Override
        return false;
        if (children != null) {
    protected DBNFileSystemRoot[] readChildNodes(

        if (mergeWith != null) {
    }
        }
                return root;
        getModel().fireNodeUpdate(this, this, DBNEvent.NodeChange.REFRESH);
    public DBNFileSystemRoot getChild(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {

    }
        this.fileSystem = null;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            }
    @Override
    @NotNull
        if (children == null && !monitor.isForceCacheUsage()) {
        if (roots != null) {
    }

import org.jkiss.dbeaver.DBException;
    }
        //path.
    }
            fileSystem.getProviderId());
        }
                    return root;

    @Nullable

        return fileSystem == null || super.isDisposed();
            path = path.substring(0, path.length() - 1);
    @Override
    @Override

        super.dispose(reflect);

    @Override

        @NotNull DBRProgressMonitor monitor,
    }
    private DBFVirtualFileSystem fileSystem;
    }
        super(parentNode);
        return getParentNode().getNodeItemPath() + "/" + getName();
/**

 * DBNFileSystem
