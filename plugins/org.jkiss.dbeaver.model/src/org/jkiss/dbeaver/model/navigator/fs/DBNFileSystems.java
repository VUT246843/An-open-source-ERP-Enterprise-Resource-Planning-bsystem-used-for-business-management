                } else if (curPath instanceof DBNFileSystem fsNode) {

    public DBNPathBase findNodeByPath(@NotNull DBRProgressMonitor monitor, @NotNull String path) throws DBException {
import java.util.List;
    }
            if (firstError instanceof DBException dbe) {
        for (DBNFileSystem fsNode : children) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return false;

            try {
                newChild = new DBNFileSystem(this, fs);
                }
        if (children == null && !monitor.isForceCacheUsage()) {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
        return true;

import java.util.ArrayList;
        }
    }
    private void refreshFileSystems(DBRProgressMonitor monitor) throws DBException {
 * DBNFileSystems
            if (newChild == null) {


 *
            }
    @Override
 * Unless required by applicable law or agreed to in writing, software

        return true;
                if (rootFolder != null) {
import org.jkiss.code.NotNull;
        return null;
                this.children = new DBNFileSystem[0];
    @Nullable

        return children == null;

    @NotNull
    public DBNFileSystem[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
    }


                    }
        return NodePathType.dbvfs.name();
//    @Property(viewable = false, order = 100)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPHiddenObject;
    @Override
        URI uri;
    @Override
        if (fsId != null) {
    public DBPImage getNodeIcon() {
        String plainPath = uri.getSchemeSpecificPart();
        if (divPos != -1) {
        }
    public String getNodeDisplayName() {
    }
        return NodePathType.dbvfs.name();
                        curPath = this.getFileSystem(uri.getScheme(), name);
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
                for (DBNFileSystem oldFS : mergeWith) {
    }

import org.jkiss.dbeaver.model.DBIcon;
            return new DBNFileSystem[0];
import java.net.URI;
    @Deprecated
        String fsId = DBFUtils.getQueryParameters(uri.getRawQuery()).get(DBFFileSystemManager.QUERY_PARAM_FS_ID);
import org.jkiss.dbeaver.DBException;
        for (DBNFileSystem fsNode : ArrayUtils.safeArray(getChildren(monitor))) {
    public boolean needsInitialization() {

    @Override
            uri = new URI(path);
        return "Remote file systems";
                throw e;
    @NotNull
    @Override
        return NodePathType.dbvfs.name();
            DBNFileSystem newChild = null;
        }
                    DBNPathBase pathNode = (DBNPathBase) curPath;

    @Nullable
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 1)

        return children;
    @Override
        return null;
    @NotNull
    public String getName() {

import org.jkiss.dbeaver.model.meta.Property;
    }
                        break;
 */
            if (name.isEmpty()) {
import org.jkiss.dbeaver.model.fs.DBFUtils;
            getModel().fireNodeUpdate(this, this, DBNEvent.NodeChange.REFRESH);
    }
            plainPath = plainPath.substring(0, divPos);
                    }
                        newChild = oldFS;
public class DBNFileSystems extends DBNNode implements DBNNodeWithCache, DBPHiddenObject {
            throw new DBException("Error reading file system roots", firstError);
        if (children != null) {
    public String getNodeId() {
                DBNFileSystemRoot rootFolder = fsNode.getChild(monitor, id);
        @NotNull String path,
    private void disposeFileSystems() {
        super(parentNode);
                }
    public DBNPathBase findNodeByPath(
        }
        this.disposeFileSystems();
            children = null;
        if (project == null) {
                    if (equalsFS(fs, oldFS.getFileSystem())) {
        if (children == null) {
    }

                    curPath = pathNode.getChild(name);
    @NotNull
        return findNodeByPath(monitor, path, false);
    @Nullable
 * limitations under the License.
    }
    }

        Throwable firstError = null;
            throw new DBException("Bad path: " + path, e);
                return fsNode;
            try {
    }
    protected DBNFileSystem[] readChildNodes(
                if (curPath == null) {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
        return ModelMessages.fs_root;
            }
        return curPath instanceof DBNPathBase ? (DBNPathBase) curPath : null;
        if (children != null) {
                }
        @NotNull DBRProgressMonitor monitor,
 *
        return "FileSystems(" + getOwnerProject().getName()  +")";
    ) throws DBException {
        @Nullable DBNFileSystem[] mergeWith

                firstError = e;
    public void setCachedChildren(DBNNode[] children) {
    private boolean equalsFS(DBFVirtualFileSystem fs1, DBFVirtualFileSystem fs2) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.messages.ModelMessages;
                } else {
        return result.toArray(new DBNFileSystem[0]);
        super.dispose(reflect);
        try {
        }
        } catch (URISyntaxException e) {

 * DBeaver - Universal Database Manager
        return DBIcon.TREE_FILE;
    }
                    this.getChildren(monitor);

                    pathNode.getChildren(monitor);
                this.children = readChildNodes(monitor, children);
    @Override
    }
    @NotNull
    }
    @Override
    public DBNFileSystems(DBNProject parentNode) {

import java.net.URISyntaxException;
    public String getNodeDescription() {
    }

        }
            if (mergeWith != null) {
    @Override
        if (firstError != null) {
        }
    @NotNull
        return true;
                    curPath = fsNode.getRoot(name);
        for (String name : plainPath.split("/")) {
    }
    @Override

    public String getNodeTypeLabel() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        boolean shortPath
    public String getNodeType() {
    }
    @Override
        result.sort((o1, o2) -> o1.getNodeDisplayName().compareToIgnoreCase(o2.getNodeDisplayName()));
            if ((type == null || fs.getType().equals(type)) && fs.getId().equals(id)) {
        refreshFileSystems(monitor);
import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystem;
    public DBNFileSystem[] getCachedChildren() {

        // Detect file system and path
    @Override
/*
        }
 * See the License for the specific language governing permissions and
        return NodePathType.ext.getPrefix() + ((DBNProject) getParentNode()).getProject().getId() + "/" + getName();

    protected void dispose(boolean reflect) {
    ) throws DBException {

        DBNNode curPath = null;
    public String toString() {
            return null;
import org.jkiss.utils.ArrayUtils;
        for (DBFVirtualFileSystem fs : fileSystemManager.getVirtualFileSystems(monitor)) {
    @Override
    }
        }
                    return rootFolder;
    }

    @Override
                throw dbe;
import org.jkiss.dbeaver.model.DBConstants;

    }
        return this;
 *
    public DBNFileSystem getFileSystem(@Nullable String type, @NotNull String id) {
            result.add(newChild);

                if (curPath == null) {
    public DBNFileSystemRoot getRootFolder(@NotNull DBRProgressMonitor monitor, @NotNull String id) throws DBException {
            DBFVirtualFileSystem fs = fsNode.getFileSystem();
    }
    }
        }

        var project = getOwnerProject();
                    } else {
                    if (!shortPath) {

import org.jkiss.dbeaver.model.DBPImage;
            }
    }
                    fsNode.getChildren(monitor);
        monitor.beginTask("Read available file systems", 1);
                continue;
        @NotNull DBRProgressMonitor monitor,
    public boolean isHidden() {
                DBNUtils.disposeNode(fs, false);
        return children;
            } catch (Throwable e) {
    public String getNodeItemPath() {
            curPath = getFileSystem(uri.getScheme(), fsId);
            for (DBNFileSystem fs : children) {
package org.jkiss.dbeaver.model.navigator.fs;
        // ignore
    public boolean isManageable() {
        monitor.done();
 * You may obtain a copy of the License at
            // Cut off query part
    @Override
    }
    }
    @Override
    public boolean supportsRename() {
import org.jkiss.dbeaver.model.navigator.*;
        DBFFileSystemManager fileSystemManager = project.getFileSystemManager();
    }
import org.jkiss.dbeaver.model.fs.DBFFileSystemManager;
        }
            }
            {
            }
            }
        return "All virtual file systems";
 * you may not use this file except in compliance with the License.
                }
            }
                    return null;
            }
    @NotNull
    }
        List<DBNFileSystem> result = new ArrayList<>();

            }
    }

        }
                        curPath = this.getRootFolder(monitor, name);
        return fs1.getType().equals(fs2.getType()) && fs1.getId().equals(fs2.getId());
        int divPos = plainPath.lastIndexOf('?');
        }
    public boolean allowsChildren() {
    private DBNFileSystem[] children;
 */
/**

    @Override
import org.jkiss.code.Nullable;
    @Override
            children = readChildNodes(monitor, children);
            } catch (DBException e) {
