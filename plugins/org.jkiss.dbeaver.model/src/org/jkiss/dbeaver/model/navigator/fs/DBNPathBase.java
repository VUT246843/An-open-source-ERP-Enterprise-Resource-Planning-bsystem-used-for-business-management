    }
            String action = (doCopy ? "Copy" : "Move") + " resource(s)";
            }
        children = ArrayUtils.add(DBNNode.class, children, child);

    public <T> T getAdapter(@NotNull Class<T> adapter) {

                        Files.copy(resource, targetFile, options);
                if (resource.getParent().equals(folder)) {
                    // Copy files
        DBNPath child = new DBNPath(this, path);
        } else {


import org.jkiss.dbeaver.model.meta.Property;
            throw new DBException("File rename is not supported by file system '" + path.getFileSystem().provider().getScheme(), e);
    @Property(viewable = false, order = 11)
    private static final ByteNumberFormat numberFormat = new ByteNumberFormat();
            } catch (IOException e) {
    }
                }
                }
    }
        return false;
            T result = rm.adaptResource(rootNode.getRoot(), getPath(), adapter);
                    }
                            wasMoved = true;
    private transient FileTime lastModified;
            result = Collections.emptyList();
            filterChildren(result);

    @Property(viewable = true, order = 11)

    }
        }
                            Files.copy(inputStream, folder.resolve(node.getNodeDisplayName()));
        if (children == null) {
    @Override
                && otherNode != this
    @Override
            throw new DBException("Error creating NIO resource", e);
            nodeToRefresh.refreshNode(monitor, this);


    }
    public DBNPathBase getChild(Path thePath) {
 */
    public void addChildResource(Path path) {
            (DBNFileSystemRoot) this :
        }
        if (result.isEmpty()) {
                return;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
import java.io.InputStream;
                    continue;
        Path thisResource = getPath();
    @Override
        }
        if (size == null) {
    @NotNull
        return getPath() == null ? "" : getPath().toString();

        }
 *
    @Nullable
                        if (!wasMoved) {
        }
    }


    }
                "\ninto folder " + folder + "?";
        if (children == null) {
        } catch (IOException e) {
    protected DBNPathBase(DBNNode parentNode) {
    }
        Path path = getPath();
                    } finally {
    @Override
        DBNFileSystemRoot rootNode = getFileSystemRoot();
        if (children == null && isDirectory() && !monitor.isForceCacheUsage()) {
 * DBeaver - Universal Database Manager
    @Override
    }
                }
 * DBNPath

                boolean doDelete = false;
                    }
                    Path targetFile = folder.resolve(resource.getFileName().toString());
    }
        return getPath() == null ? "" : getPath().toAbsolutePath().toString();
            sortChildren(childNodes);
                            break;
public abstract class DBNPathBase extends DBNNode implements DBNLazyNode {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
                        } catch (Exception e) {
        if (rootNode != null && getOwnerProject() instanceof DBFResourceAdapter rm) {
                    log.debug("Resource " + resource + " doesn't not exists");
    public boolean allowsChildren() {
        this.fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, DBNEvent.NodeChange.REFRESH, this));
import java.util.stream.Stream;
        }
    protected boolean isTheSameFileSystem(DBNNode node) {
import org.jkiss.dbeaver.model.navigator.*;
        Arrays.sort(list, (o1, o2) -> {

                        // Delete source file after copy
            if (child instanceof DBNPathBase && thePath.equals(((DBNPathBase) child).getPath())) {
            monitor.done();
 * See the License for the specific language governing permissions and
        }
        }
    @NotNull
                monitor.subTask((doCopy ? "Copy" : "Move") + " file " + resource);
                Path resource = node.getAdapter(Path.class);
            return;
            final DBNNode[] childNodes = result.toArray(new DBNNode[0]);

        size = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        result.add(this.makeNode(srcFile.next()));
                        }
        }
    }
    @Override
//    @Property(viewable = false, order = 100)
                    continue;
                log.debug("Error reading file '" + getPath() + "' size", e);
            boolean doCopy = !isTheSameFileSystem(nodes.iterator().next());

        children = null;
                    try (InputStream inputStream = node.getAdapter(InputStream.class)) {
        if (lastModified == null) {

            folder = thisResource;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        DBNPathBase child = getChild(path);
        } catch (UnsupportedOperationException e) {
            return;
        Path folder;

            return;
                        }
        super.dispose(reflect);
                && !this.isChildOf(otherNode);
    }
            return;
    @Property(viewable = true, order = 11)
    @Override
                        // Try to move first
import java.util.stream.Collectors;

import java.nio.file.Files;
            setPath(Files.move(path, path.getParent().resolve(newName)));
    }
import org.jkiss.dbeaver.model.fs.DBFResourceAdapter;
    @Deprecated
    @Override


import org.jkiss.dbeaver.Log;
        this.children = null;

        fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, child));
    }

    }

    }
        // Confirm\

    }
    public String getNodeDescription() {
        if (children == null) {
                        monitor.worked(1);
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
    public String getResourceSize() throws IOException {
            return adapter.cast(getPath());
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
        monitor.beginTask("Drop files", nodes.size());
        if (children == null) {
                }
                && otherNode.getParentNode() != this
        }
            String message =
        //path.
        for (DBNNode child : children) {
import java.util.*;
        DBNFileSystemRoot rootNode = getFileSystemRoot();
        } else {
    @Nullable
        for (DBNNode child : children) {
                if (Files.notExists(resource)) {
        if (otherNode == null) {
                }
                } finally {
import java.io.IOException;
        return NodePathType.dbvfs.name() + ".path";
                    log.debug("Resource " + resource + " is not a file");
        } catch (Exception e) {
            return true;
        try {
                        }
        super(parentNode);
    }
        if (getOwnerProject() instanceof DBFResourceAdapter rm) {
    @Override
import java.nio.file.attribute.FileTime;
                    if (doDelete) {
    }
        return getParentNode().getNodeItemPath() + "/" + getName();
            for (DBNNode node : nodes) {
    // Cache expensive properties
                try {
        }
    public abstract Path getPath();
    }

                    if (doCopy) {
    protected abstract void setPath(Path path);
            return null;
        return getPath() != null && Files.exists(getPath());
        {
        }
                            doCopy = true;
    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        getModel().fireNodeUpdate(this, this, DBNEvent.NodeChange.REFRESH);
            } catch (IOException e) {
            return o1.getNodeDisplayName().compareToIgnoreCase(o2.getNodeDisplayName());
        return new DBNPath(this, resource);
    @Nullable
                    }
        if (adapter == Path.class) {
                            doDelete = true;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    private transient Long size;
import org.jkiss.dbeaver.model.DBPImage;
                    if (!doCopy) {
                boolean doCopy = !isTheSameFileSystem(node);
        }
                    monitor.worked(1);
    }
    protected DBNNode[] readChildNodes(DBRProgressMonitor monitor) throws DBException {
    }
    @Nullable
    @Override
            lastModified = Files.getLastModifiedTime(getPath());

    }

        return null;
                        if (monitor.isCanceled()) {
    public String getNodeType() {
        return null;

import java.nio.file.StandardCopyOption;

    @Override
        if (isDirectory()) {
            DBNUtils.getParentOfType(DBNFileSystemRoot.class, this);
/*
                }
    public boolean isManageable() {
        return rootNode != null && rootNode.getRoot().getFileSystem().isDirectory(getPath());
                if (resource == null) {
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
                try (Stream<Path> fileList = Files.list(path)) {
            }
            return EMPTY_NODES;
    }
import org.jkiss.dbeaver.DBException;
    }

                        }
                        try {
        }
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
            return childNodes;
 * you may not use this file except in compliance with the License.
            try {

        if (thisResource == null) {
                        boolean wasMoved = false;
    private static final DBNNode[] EMPTY_NODES = new DBNNode[0];
import java.nio.file.Path;
            this.children = readChildNodes(monitor);
                nodes.stream().map(DBNNode::getNodeDisplayName).collect(Collectors.joining(",")) +
    @NotNull
        }
    public void removeChildResource(Path path) {
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException {
    private static final Log log = Log.getLog(DBNPath.class);
    public boolean supportsRename() {

                    return 1;
    @Override

 * limitations under the License.
import org.jkiss.code.Nullable;
        fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, this));

        return children == null;
    }
    }
        }
            if (!DBWorkbench.getPlatformUI().confirmAction(action, message)) {
                            options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };
        return true;
import java.nio.file.CopyOption;
        } else {
        } finally {
                        CopyOption[] options = new CopyOption[0];
                    }
                } else if (p2.isDirectory() && !p1.isDirectory()) {
package org.jkiss.dbeaver.model.navigator.fs;
    }
        }
        if (lastModified.toMillis() <= 0) {
 */
        }

    public String getNodeDisplayName() {
                            monitor.subTask("Copy file");
    @Override
                            Files.move(resource, targetFile);
        lastModified = null;
        return null;
    public DBNPathBase getChild(String name) {
                size = 0L;
        if (child != null) {
    public boolean isDirectory() {

        return false;
    private DBNNode[] children;
            folder = thisResource.getParent();
                if (p1.isDirectory() && !p2.isDirectory()) {
/**
    @Nullable
    }
        DBNNode nodeToRefresh = this;
import org.jkiss.utils.ArrayUtils;

        if (!this.isDirectory()) {
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
        return isDirectory();
 *
        }

    public String getResourceLocation() {
}
        return numberFormat.format(size);
            }
                    }
            if (result != null) {
        }
            children = ArrayUtils.remove(DBNNode.class, children, child);
            }
        return children;
                        if (inputStream != null) {
        });

    public String toString() {
            if (child.getName().equals(name)) {
            }
    }
            // Refresh folder
        if (isDirectory() && Files.exists(path)) {
    protected void dispose(boolean reflect) {
    }
    }

        List<DBNNode> result;
                }
            }
                throw new DBException("Error reading directory members", e);
            return (otherNode.getAdapter(Path.class) != null || (otherNode instanceof DBNStreamData source && source.supportsStreamData()))
    }
                        Files.delete(resource);
            if (size == null) {


        try {

                    // Already in this container
    }
    public boolean needsInitialization() {
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 1)
                return (DBNPathBase) child;
import org.jkiss.code.NotNull;
    @Override
                        }
        if (nodes.isEmpty()) {


    }

                return result;
    public DBPImage getNodeIcon() {
        return path == null ? super.toString() : path.toString();
                if (monitor.isCanceled()) {
        return getPath().getFileName().toString();

                        // Note that move is not supported by some file systems
    @Override
            return null;
    public String getResourceLastModified() throws IOException {
                    return -1;
 * Unless required by applicable law or agreed to in writing, software
    }
            try {
 * You may obtain a copy of the License at
    public Collection<DBPDataSourceContainer> getAssociatedDataSources() {


                    continue;
        return this;
    public String getResourcePath() {
            if (o1 instanceof DBNPathBase p1 && o2 instanceof DBNPathBase p2) {
            }

                return (DBNPathBase) child;
import org.jkiss.utils.ByteNumberFormat;
    protected void filterChildren(List<DBNNode> list) {
        }
                    result = new ArrayList<>();
            return getParentNode().supportsDrop(otherNode);
        return Collections.emptyList();
                    for (Iterator<Path> srcFile = fileList.iterator(); srcFile.hasNext(); ) {
            nodeToRefresh = getParentNode();
            }
            throw new DBException("Cannot rename resource '" + getPath() + "'", e);
                }
                action + "\n" +
                size = getPath() == null ? 0 : Files.size(getPath());
        }
        return true;
            fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, child));
                    continue;
    @Property(viewable = true, order = 10)

                if (!Files.isRegularFile(resource)) {
                            log.debug("Underlying FS doesn't support file move. Do copy instead");
    public String getNodeItemPath() {
        return lastModified.toString();
                        if (Files.exists(targetFile)) {
            // Drop supported only if both nodes are resource with the same handler and DROP feature is supported
    protected boolean isResourceExists() {
    private DBNFileSystemRoot getFileSystemRoot() {
                    break;
    @NotNull
            return null;
    protected void sortChildren(DBNNode[] list) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        Path path = getPath();
    private DBNPathBase makeNode(Path resource) {
        return this instanceof DBNFileSystemRoot ?
        return super.getAdapter(adapter);
        Path path = getPath();

        return getOwnerProject().getWorkspace().getResourceIcon(this);
    public void refreshResourceState(Object source) {
import org.jkiss.dbeaver.model.DBConstants;
