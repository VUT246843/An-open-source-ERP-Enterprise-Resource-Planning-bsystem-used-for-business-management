            // do nothing
                }
        private final IFile file;
            final DBPProject project = node.getOwnerProject();
    public List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource) {
            DBPDataSourceRegistry dataSourceRegistry = resource.getOwnerProject().getDataSourceRegistry();
 */
            }
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        }
        } else {
import java.util.List;

    }
                if (status.isOK()) {
        }
                throw new DBException("Can't find datasource '" + storage.getDataSourceId() + "'"); //$NON-NLS-2$

        }
        updateBookmark(node, title, file);
    {
                                // Doesn't matter
 * distributed under the License is distributed on an "AS IS" BASIS,
                final Collection<String> dataSourcePath = storage.getDataSourcePath();
    @Override
                        // Update bookmark image
        BookmarkStorage storage = new BookmarkStorage(
 *
            }
            throw new DBException("Can't detect folder for bookmark");

            BookmarkNodeLoader nodeLoader = new BookmarkNodeLoader(dsNode, storage, null);
            UIUtils.runInProgressService(nodeLoader);
import org.jkiss.dbeaver.ui.UIUtils;
                            }

 * you may not use this file except in compliance with the License.
                        status);
        } catch (InterruptedException e) {
        }
    }
        }
    public String getTypeName(@NotNull IResource resource)
    }
        final BookmarkStorage storage = new BookmarkStorage((IFile) resource, false);
                }
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

                            } catch (Exception e) {

        final DBNProject projectNode = DBWorkbench.getPlatform().getNavigatorModel().getRoot().getProjectNode(resource.getProject());
                                nextChild = node;
 * limitations under the License.
        if (CommonUtils.isEmpty(title)) {
            } catch (Exception e) {
import org.jkiss.dbeaver.model.app.DBPProject;
            return new DBNBookmarkFolder(parentNode, resource, this);

*/
        @Override
                    nodeLoader.databaseNode, null, UIUtils.getActiveWorkbenchWindow()));
        if (projectNode == null) {
    @Override
            if (dataSourceContainer != null) {
            }
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            });
    }
    @Override
            try {
                CoreMessages.model_project_open_bookmark, CoreMessages.model_project_cant_open_bookmark, e.getTargetException());
import java.util.ArrayList;
            BookmarkStorage storage = bookmark.getStorage();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                break;
                throw new InvocationTargetException(e);
        final DBNProject projectNode = NavigatorResources.getProjectNode(
            if (dataSourceContainer == null) {
import org.jkiss.code.NotNull;
            }
        private final BookmarkStorage storage;
        }
        }
    private static void openNodeByPath(final DBNDataSource dsNode, final IFile file, final BookmarkStorage storage)
import java.lang.reflect.InvocationTargetException;
                        }
 * Unless required by applicable law or agreed to in writing, software
            if (nodeLoader.databaseNode != null) {
        finally {
                                BookmarkNodeLoader nodeLoader = new BookmarkNodeLoader(dsNode, storage, resource);
                            }
        }
 *
            nodePath.add(0, parent.getNodeId());
            node.getDataSourceContainer().getId(),
                if (dsNode != null) {
                    DBNNode nextChild = null;
            final DBNDataSource dsNode = (DBNDataSource) DBNUtils.getNodeByObject(dataSourceContainer);
    public DBNResource makeNavigatorNode(@NotNull DBNNode parentNode, @NotNull IResource resource) throws CoreException, DBException
        return super.getFeatures(resource);
        List<String> nodePath = new ArrayList<>();
    private static final String BOOKMARK_EXT = "bm"; //$NON-NLS-1$
    }
                    if (nextChild == null) {
            dsNode.initializeNode(null, status -> {

        IFile file = ResourceUtils.getUniqueFile(
            if (dsNode == null) {
            return "bookmark folder"; //$NON-NLS-1$
                        storage.setImage(currentNode.getNodeIconDefault());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    return result[0];
                        throw new DBException("Can't find node '" + path + "' in '" + currentNode.getNodeFullName() + "'"); //$NON-NLS-2$ //$NON-NLS-3$
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;

        if (resource instanceof IFolder) {
    }
                            try {
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.DBWorkbench;
            storage.dispose();
import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (folder == null) {
                for (String path : dataSourcePath) {
                } else {
                    throw new DBException("Can't find database node by path");
    {
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;
                        for (DBNNode node : children) {
            throw new DBException("Can't find project node for '" + resource.getProject().getName() + "'"); //$NON-NLS-2$
        }

    {
    static DBNDatabaseNode getTargetBookmarkNode(DBRProgressMonitor monitor, DBNBookmark bookmark)

                if (currentNode instanceof DBNDatabaseNode) {
    @NotNull
        if (folder == null) {
    public static void createBookmark(final DBNDatabaseNode node, String title, IFolder folder) throws DBException
            this.file = file;
        }
                        "Can't open bookmark",
            DBWorkbench.getPlatformUI().showError(
        private final DBNDataSource dsNode;
        } else {
            node.getNodeIconDefault(),
                    DBNDatabaseNode[] result = new DBNDatabaseNode[1];
 *     http://www.apache.org/licenses/LICENSE-2.0
                    });
            this.storage = storage;
        }
    {
        BookmarkNodeLoader(DBNDataSource dsNode, BookmarkStorage storage, IFile file) {
                    final DBNNode[] children = currentNode.getChildren(monitor);
                UIUtils.syncExec(() -> view.showNode(nodeLoader.databaseNode));
            folder,
            UIUtils.runInProgressService(nodeLoader);

    @NotNull
import org.eclipse.core.runtime.NullProgressMonitor;
            CommonUtils.escapeFileName(title),
        ResourceUtils.checkFolderExists(folder);
        IFile resource = (IFile) bookmark.getResource();
        }
    }
import org.jkiss.dbeaver.model.navigator.*;
        private DBNDatabaseNode databaseNode;

        if (resource instanceof IFile) {
                    currentNode = nextChild;
    }
        try {
    public void openResource(@NotNull final IResource resource) throws CoreException, DBException
 * Bookmarks handler
import org.eclipse.core.resources.IFolder;
    private static class BookmarkNodeLoader implements DBRRunnableWithProgress {
        } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.utils.ResourceUtils;

                DBPDataSourceContainer dataSource = dataSourceRegistry.getDataSource(((DBNBookmark) resource).getStorage().getDataSourceId());
            return "bookmark"; //$NON-NLS-1$
                        }

        public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    @Override
import org.jkiss.dbeaver.DBException;
                    if (!ArrayUtils.isEmpty(children)) {

    }
/**

    }
    {
            BOOKMARK_EXT);
import org.eclipse.core.resources.IResource;
                                result[0] = nodeLoader.databaseNode;
                    return Collections.singletonList(dataSource);
                throw new DBException("Can't find datasource node for '" + dataSourceContainer.getName() + "'"); //$NON-NLS-2$
                    throw new DBException("Node '" + currentNode.getNodeFullName() + "' is not a database object");
import java.util.Collection;
                }
                    if (file != null) {
                final DBNDataSource dsNode = (DBNDataSource) DBNUtils.getNodeByObject(dataSourceContainer);
    public static IFolder getBookmarksFolder(DBPProject project, boolean forceCreate)
    }
 */

                } else if (currentNode != null) {
                }
            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;
        return DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(project, BookmarksHandlerImpl.class, forceCreate);

            }
            InputStream data = storage.serialize();
        try {
            }
        try {
        }
            this.dsNode = dsNode;
            final DBPDataSourceContainer dataSourceContainer = projectNode.getDatabases().getDataSourceRegistry().getDataSource(storage.getDataSourceId());
        try {
            DBWorkbench.getPlatform().getNavigatorModel().getRoot(), resource.getProject());
            return new DBNBookmark(parentNode, resource, this);
                }
    {
            if (nodeLoader.databaseNode != null) {
    {
        if (!(resource instanceof IFile)) {
    {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    {
                        file.setContents(storage.serialize(), true, false, RuntimeUtils.getNestedMonitor(monitor));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.ArrayUtils;
        }
import java.io.InputStream;
        }
/*
    public int getFeatures(IResource resource)
                } else {
import org.jkiss.dbeaver.core.CoreMessages;
            DBWorkbench.getPlatformUI().showError(
                if (dataSource != null) {
 *
            title = node.getNodeId();
        }
    public static void navigateNodeByPath(NavigatorViewBase view, final DBNDataSource dsNode, final BookmarkStorage storage)
            super.openResource(resource);
    @Nullable
            if (project != null) {
            throw new DBException("Error saving bookmark", e);
                    databaseNode = (DBNDatabaseNode) currentNode;
        return super.getAssociatedDataSources(resource);
                    dsNode.initializeNode(monitor, status -> {
        return null;
                    }
package org.jkiss.dbeaver.ui.resources.bookmarks;
            }
            // do nothing
/*
            title,
            BookmarkNodeLoader nodeLoader = new BookmarkNodeLoader(dsNode, storage, file);

}
                    DBWorkbench.getPlatformUI().showError(
        if (resource instanceof DBNBookmark) {
import org.eclipse.core.resources.IFile;
            return;
    {
                    }
                CoreMessages.model_project_open_bookmark, CoreMessages.model_project_cant_open_bookmark, e.getTargetException());
                            if (path.equals(node.getNodeId()) || path.equals(node.getNodeDisplayName())) {
            nodePath);

                folder = getBookmarksFolder(project, true);

            node.getNodeTypeLabel() + " " + node.getNodeId(), //$NON-NLS-1$
 * You may obtain a copy of the License at

            if (dataSourceRegistry != null) {
 * See the License for the specific language governing permissions and
                    }
import org.jkiss.code.Nullable;
public class BookmarksHandlerImpl extends AbstractResourceHandler {
import org.eclipse.core.runtime.CoreException;
    private static void updateBookmark(DBNDatabaseNode node, String title, IFile file)
                        if (status.isOK()) {
        } catch (InvocationTargetException e) {
        } catch (InterruptedException e) {
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
                                nodeLoader.run(monitor);
        if (resource instanceof IFile) {
        throws DBException
        }
                        "Open bookmark",
            }
        } catch (Exception e) {
                    // Open entity editor
                DBNNode currentNode = dsNode;
            final DBPDataSourceContainer dataSourceContainer = projectNode.getDatabases().getDataSourceRegistry().getDataSource(storage.getDataSourceId());
                    UIUtils.syncExec(() -> openNodeByPath(dsNode, (IFile) resource, storage));
                UIUtils.syncExec(() -> NavigatorHandlerObjectOpen.openEntityEditor(
            file.create(data, true, new NullProgressMonitor());
import java.util.Collections;
        if (projectNode != null) {
        for (DBNNode parent = node; !(parent instanceof DBNDataSource); parent = parent.getParentNode()) {
    @Override
