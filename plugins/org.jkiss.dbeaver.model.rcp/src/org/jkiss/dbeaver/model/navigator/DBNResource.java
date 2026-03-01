            if (!newName.equals(resource.getName())) {
    @Override

            if (localFile != null) {
            IResource contentLocation = node instanceof DBNProjectDesktop projectDesktop ?
    protected boolean isResourceExists() {
            fileStoreSingleFileCopy(monitor, otherResource, dstStore);
        DBPResourceHandler newHandler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resource);
        if (newHandler != handler) {
                        throw new DBException("Can't copy " + otherResource.getName() + " to " + resource.getName(), e);
        return members;
    }

        IResource resource = getResource();
                    newName += "." + ext;
    public String getNodeTargetName() {
import org.jkiss.dbeaver.DBException;
    }
        this.handler = handler;
                    return adapter.cast(file.getContents());
            return null;
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
//            for (DBNNode child : children) {
    public void setCachedChildren(DBNNode[] children) {
                DBNUtils.disposeNode(child, reflect);
            } else {
            }
    @Override
        } catch (CoreException e) {
    private void fileStoreRecursiveCopy(
    public boolean supportsRename() {
        if (resource instanceof IProject) {
        if (resource instanceof IFile file) {

        if (result.isEmpty()) {
import java.text.SimpleDateFormat;
}
                                true,
import org.jkiss.code.Nullable;
        @NotNull DBRProgressMonitor monitor,
                    } catch (CoreException e) {

        return (getFeatures() & DBPResourceHandler.FEATURE_RENAME) != 0;

                    resource.move(resource.getFullPath().removeLastSegments(1).append(newName), true, monitor.getNestedMonitor());
        super(parentNode);
        if (!project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
    }
            if (workspace instanceof DBPWorkspaceDesktop workspaceDesktop) {
    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        } else {
    @Override
    public IResource getResource() {
    public long getStreamSize() {
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException {

    @Override
import java.text.DecimalFormat;
        this.resource = null;
    private IResource resource;


        if (children != null) {

    }
    @NotNull
        return handler == null || resource == null ? null : handler.getResourceDescription(resource);
import org.jkiss.dbeaver.utils.ResourceUtils;
            }
        List<DBNNode> result = new ArrayList<>();
                return file.getContents();
                try {
        }
import java.util.ArrayList;
        }
            children = null;
        } finally {
    }
    public boolean supportsPaste(@NotNull DBNNode other) {
    @Nullable
                            if (DBWorkbench.isDistributed() && !CommonUtils.equalObjects(otherResource.getProject(), resource.getProject())) {
            this.children = readChildResourceNodes(monitor, this);
        @NotNull DBRProgressMonitor monitor,
//            }
        @NotNull DBRProgressMonitor monitor,
        if (resource == null) {


        DBPImage iconImage = this.getResourceNodeIcon();
                if (!CommonUtils.isEmpty(ext)) {
import org.jkiss.dbeaver.model.fs.nio.EFSNIOResource;
    }
    }
public class DBNResource extends DBNNode implements DBNStreamData, DBNNodeWithCache, DBNLazyNode {
        return resource == null || super.isDisposed();
                IPath location = resource.getLocation();
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    public boolean needsInitialization() {
        if (srcUri == null) {
            return false;
                for (IResource member : members) {
    protected static void sortChildren(DBNNode[] list) {
                            fileStoreRecursiveCopy(monitor, otherResource);
    ) throws DBException, CoreException {
            if (adapter.isAssignableFrom(resource.getClass())) {
import java.io.IOException;
    }
                return adapter.cast(resource);
        }
            }
        }
                return location == null ? null : adapter.cast(location.toPath());
    @NotNull

    protected String getResourceNodeType() {
                    }
        return children;
        } else {

            monitor.getNestedMonitor()
            return lastModified <= 0 ? "" : DATE_FORMAT.format(lastModified);
            }
    @NotNull

            children = null;

        return ResourceUtils.getFileLength(resource);
        return resource == null ? super.toString() : resource.toString();
    @Property(viewable = true, order = 11)
            default -> DBIcon.TREE_PAGE;
import org.eclipse.core.filesystem.EFS;
    @Override
        NavigatorResources.refreshThisResource(monitor, this);
import org.eclipse.core.filesystem.IFileStore;
    public String getResourceLocation() {
    public void pasteNodes(@NotNull Collection<DBNNode> nodes) throws DBException {
        }
        return resource instanceof IContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

            return members;
    @NotNull
        }
        return resource instanceof IFile && resource.getLocation() == null;
        return iconImage;
            if (!pathName.isEmpty()) {

                } else {
        IPath location = resource.getLocation();
                            otherResource.move(
 * See the License for the specific language governing permissions and
        // Drop supported only if both nodes are resource with the same handler and DROP feature is supported
                return DBIcon.TREE_FOLDER;
        fileStoreRecursiveCopy(monitor, otherResource, null);
                        result.add(newChild);
    }
import java.io.InputStream;
    @Override
                                throw new DBException("Cross-project resource move is not supported in distributed workspaces");
        DBPImage resourceImage = handler.getResourceIcon(resource);
        }
        }
                        } else {

            sortChildren(childNodes);

    public String getNodeType() {


    private DBNNode[] children;
    ) throws DBException, CoreException {
        return pathName.toString();
            pathName.insert(0, resource.getName());
    }

    }
        if (getOwnerProject().isVirtual()) {
            } else if (adapter == InputStream.class && resource instanceof IFile file) {
            final DBNNode[] childNodes = result.toArray(new DBNNode[0]);
        }
                    }
package org.jkiss.dbeaver.model.navigator;
    public void refreshResourceState(Object source) {
    public String getNodeDisplayName() {
    }
        return location == null ? null : location.toString();


            }
    public void setHandler(DBPResourceHandler handler) {
        monitor.beginTask("Copy files", nodes.size());
                    } catch (CoreException e) {
    }
 */
        try {
                    DBNNode newChild = NavigatorResources.makeNode(node, member);
            EFS.OVERWRITE | EFS.SHALLOW,

                    if (newChild != null) {
                }
            handler = newHandler;

    }
    public DBNResource(DBNNode parentNode, IResource resource, DBPResourceHandler handler) {
    }
    }
            case IResource.FOLDER -> resource.isLinked() ? DBIcon.TREE_FOLDER_LINK : DBIcon.TREE_FOLDER;
    public DBPResourceHandler getHandler() {
import org.eclipse.core.runtime.IPath;
                        throw new DBException("Error creating folder " + resource.getName(), e);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                }
        // Supports streaming only for remote files
    }
            throw new DBException("Destination resource has no location URI");
                }
                        // Add as explicit member
import org.eclipse.core.runtime.CoreException;
        }

                            }
            for (DBNNode node : nodes) {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.meta.Property;
import java.net.URI;
            }
            return numberFormat.format(ResourceUtils.getFileLength(resource));
        }
    }
        return children;
                        resource.refreshLocal(IResource.DEPTH_ONE, monitor.getNestedMonitor());
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT);
 *
    private void fileStoreSingleFileCopy(
            if (adapter == Path.class) {
            for (DBNNode child : children) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    @Override
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
    @Override
import org.jkiss.dbeaver.model.rm.RMConstants;
                members = addImplicitMembers(node, members);
    protected DBPImage getResourceNodeIcon() {

    public boolean supportsStreamData() {
            && otherNode.getParentNode() != this;
        return otherNode.getAdapter(IResource.class) != null
 *     http://www.apache.org/licenses/LICENSE-2.0
        return handler;
    @Override
        }
                } catch (CoreException e) {
        return switch (resource.getType()) {
                    }
    @Nullable
        return null;
                        folder.create(true, true, new NullProgressMonitor());
        if (otherResource instanceof IFolder folderSource) {
        IResource resource = node.getAdapter(IResource.class);
            && otherNode != this
        if (!(resource instanceof IFolder) || (getFeatures() & DBPResourceHandler.FEATURE_MOVE_INTO) == 0) {
                        }

        return EFS.getStore(dstUri);
        return handler == null ? 0 : handler.getFeatures(resource);
                        if (otherResource instanceof EFSNIOResource) {
    @Override

            throw new DBException("Source resource has no location URI");
                if (otherResource != null) {
            } catch (CoreException e) {
 * DBNResource
    public String getNodeDescription() {
    @Override
        if (resource instanceof IFile) {
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
                }
                    }
    @Property(viewable = true, order = 10)
        );
    }
import java.nio.file.Path;
        }
                    try {
    public InputStream openInputStream() throws DBException, IOException {
                                resource.getFullPath().append(otherResource.getName()),
    @Override

                IResource[] members = container.members(false);
        this.children = children;
 */
import java.util.Collection;
    @Override
        } catch (CoreException e) {
                return localFile.toString();
            if (contentLocation instanceof IContainer container && contentLocation.exists()) {
            }
        this.handler = handler;
    public int getFeatures() {
    }
    @Override
    }
    public String toString() {
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
            DBPProject project = node.getOwnerProject();
    @NotNull
        if (resource instanceof IFile) {
            if (this.hasChildren(false)) {
        }
 * DBeaver - Universal Database Manager
        return "resource";
            iconImage = new DBIconComposite(iconImage, false, null, null, null, DBIcon.OVER_LOCK);
        }
    }
        }
    }

    }
        };
        if (reflect) {
    public String getNodeItemPath() {
    ) throws DBException, CoreException {
                        NavigatorResources.refreshFileStore(monitor, resource);
    @Override
            }
    @Override
import org.jkiss.utils.ArrayUtils;
                return DBIcon.TREE_PAGE;
        @NotNull IResource otherResource,
            for (IResource memeber : folderSource.members()) {
        if (resource == null) {
            if (newName.indexOf('.') == -1 && resource instanceof IFile) {
        return super.getAdapter(adapter);
            DBPWorkspace workspace = project.getWorkspace();


    @NotNull

        return super.getNodeTargetName();
    }
        IPath location = resource.getLocation();
            }
                if (resource instanceof IFolder folder) {
import org.jkiss.dbeaver.model.app.*;
    public Collection<DBPDataSourceContainer> getAssociatedDataSources() {
        if (location != null) {
        }
            try {
        if (resource == null || handler == null) {
    @Override
        return resource != null && resource.exists();
                }
        try {
                                monitor.getNestedMonitor());
                for (DBPResourceHandlerDescriptor rh : workspaceDesktop.getAllResourceHandlers()) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private void fileStoreRecursiveCopy(
    }
            return null;

 * you may not use this file except in compliance with the License.
        if (otherNode == null) {
            }


            throw new DBException("Cannot rename resource : " + e.getMessage(), e);
    }

    }
                pathName.insert(0, '/');
        if (children != null) {
    }
    public boolean isDisposed() {
            }

                    resource.move(resource.getFullPath().removeLastSegments(1).append(newName), IResource.SHALLOW, monitor.getNestedMonitor());

        return children == null;
            return null;
    }
/*
//                child.dispose(false);

                String ext = resource.getFileExtension();

        }
            long lastModified = ResourceUtils.getResourceLastModified(resource);

    static IResource[] addImplicitMembers(DBNNode node, IResource[] members) {
        }
            // Do not read descriptions for virtual (remote) projects
        return resource.getName();
    }
            }
                projectDesktop.getProject().getRootResource() :
        }

    private static final NumberFormat numberFormat = new DecimalFormat();
            IResource resource = dbnResource.getResource();
    }
    }
    public static DBNNode[] readChildResourceNodes(DBRProgressMonitor monitor, DBNNode node) throws DBException {
        getModel().fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, this));
        @Nullable IFileStore destinationStore
import org.eclipse.core.resources.*;
        if (resourceImage != null) {
        }
        dstStore = dstStore.getChild(otherResource.getName());
    @NotNull
        if (dstUri == null) {
                node.getAdapter(IResource.class);
 * Unless required by applicable law or agreed to in writing, software
    }
        throw new DBException("Resource '" + getNodeTargetName() + "' doesn't support streaming");
        Arrays.sort(list, NavigatorResources.COMPARATOR);
    @Property(id = DBConstants.PROP_ID_NAME, viewable = true, order = 1)
        URI srcUri = otherResource.getLocationURI();
                    if (rhDefaultRoot != null && !rhDefaultRoot.exists()) {
 *
            monitor.done();
        }
    @Override
/**
        this.resource = resource;
    public DBNNode[] getCachedChildren() {
        }
        }
                monitor.worked(1);

            dstStore,
        return NodePathType.resource.getPrefix() + projectPath;
    }
    @NotNull

            case IResource.PROJECT -> DBIcon.PROJECT;

    private static final DBNNode[] EMPTY_NODES = new DBNNode[0];
                fileStoreRecursiveCopy(monitor, memeber, dstStore);
 * limitations under the License.
    @NotNull
        @NotNull IResource otherResource
        return handler == null ? null : handler.getAssociatedDataSources(this);
    public String getResourcePath() {
import java.util.Arrays;
    @Deprecated
        String projectPath = getRawNodeItemPath();

    }
    public boolean allowsChildren() {
            dstStore.mkdir(EFS.NONE, monitor.getNestedMonitor());
        for (DBNNode node = this; node instanceof DBNResource dbnResource; node = node.getParentNode()) {
    }
 *
        if (children == null && !monitor.isForceCacheUsage()) {
    }
                }
    @Property(viewable = true, order = 11)
        if (resource != null) {
            getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, this));
            Path localFile = location.toPath();
            }
        @NotNull IResource otherResource,
        try {
                    throw new DBException("Can't get resource from node " + node.getName());
            return EMPTY_NODES;
    }
                    log.error("Error getting file contents", e);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        @NotNull IFileStore dstStore
    @Nullable
    private DBPResourceHandler handler;

        URI dstUri = resource.getLocationURI();
                if (resource.isLinked()) {
import java.util.List;
            return true;
        EFS.getStore(srcUri).copy(

    public String getResourceLastModified() {
        throw new DBException("Paste is not supported");
        DBPProject project = getOwnerProject();
    public DBPImage getNodeIcon() {
        this.handler = null;
    @Override
        StringBuilder pathName = new StringBuilder();

    }
            // Potentially any other node could be dropped in the folder
    }
        return null;
    public String getResourceSize() {
import org.jkiss.code.NotNull;
            if (!resource.exists()) {
    @Override

    }
                    try {

    @Override
    @Override
        return false;
                } else {
        return handler == null ? getResourceNodeType() : handler.getTypeName(resource);
            }
    @Nullable

        }

    }
    }
    public boolean isManageable() {
    protected void dispose(boolean reflect) {
import org.eclipse.core.runtime.NullProgressMonitor;
        }
            return resourceImage;
                IResource otherResource = node.getAdapter(IResource.class);
    }
        super.dispose(reflect);
        return resource;
    @Override
        return this;
    private IFileStore getDestinationStore() throws DBException, CoreException {
                        members = ArrayUtils.add(IResource.class, members, rhDefaultRoot);

        }

            throw new DBException("Can't read container's members", e);
    public String getRawNodeItemPath() {
    @Override
import org.jkiss.dbeaver.model.*;
                    IFolder rhDefaultRoot = workspaceDesktop.getResourceDefaultRoot(project, rh, false);
        IFileStore dstStore = destinationStore != null ? destinationStore : getDestinationStore();
        return resource == null ? "" : resource.getFullPath().toOSString();
        return true;
            return childNodes;
    }

    }
import java.text.NumberFormat;

                throw new IOException(e);
    @Property(order = 11)
