                    }
                            CoreMessages.actions_navigator_bookmark_error_message, e);
            final DBNNode node = NavigatorUtils.getSelectedNode(selection);
                            DBNResource targetNode = NavigatorResources.getNodeByResource(node.getModel(), targetFolder);

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                        });
                DBWorkbench.getPlatformUI().showError(
package org.jkiss.dbeaver.ui.actions.common;
        @Override
    @Override
        }
            this.node = node;
                        treeViewer.expandAll();
                }
                        gd.heightHint = 200;

        }

                        final GridData gd = new GridData(GridData.FILL_BOTH);
                            if (object instanceof DBNResource && ((DBNResource) object).getResource() instanceof IFolder) {


                        final TreeViewer treeViewer = foldersNavigator.getViewer();
        }
            }
                                targetFolder = (IFolder) ((DBNResource) object).getResource();
                        DatabaseNavigatorTree foldersNavigator = new DatabaseNavigatorTree((Composite) area, bookmarksFolderNode, SWT.BORDER | SWT.SINGLE, true);
 * Copyright (C) 2010-2024 DBeaver Corp and others

}            final DBPProject project = node.getOwnerProject();
        final Shell activeShell = HandlerUtil.getActiveShell(event);
        }
            if (node instanceof DBNDataSource) {
            }
            if (project != null) {
import org.jkiss.dbeaver.ui.UIUtils;
                IFolder bookmarksFolder = BookmarksHandlerImpl.getBookmarksFolder(project, false);
                return null;
            return targetFolder;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        protected IDialogSettings getDialogBoundsSettings() {
import org.jkiss.dbeaver.model.app.DBPProject;
        AddBookmarkDialog dialog = new AddBookmarkDialog(activeShell, node);
                } catch (DBException e) {
import org.eclipse.jface.dialogs.IDialogSettings;
                                return element instanceof DBNResource && ((DBNResource) element).getResource() instanceof IFolder;
/*

public class AddBookmarkHandler extends NavigatorHandlerObjectBase {
                try {
        private DBNDatabaseNode node;
                        treeViewer.addSelectionChangedListener(event -> {
    private static class AddBookmarkDialog extends EnterNameDialog {
                        if (targetFolder != null && targetFolder.exists()) {
            if (project == null || !project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {

import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                            @Override
                        }
                    DBWorkbench.getPlatformUI().showError(
            super(parentShell, CoreMessages.actions_navigator_bookmark_title, node.getNodeDisplayName());
            final Composite area = super.createDialogArea(parent);

import org.eclipse.swt.widgets.Composite;
            }
import org.eclipse.ui.handlers.HandlerUtil;
                    createBookmarkDialog(dbNode, activeShell);

                            if (targetNode != null) {

    }
            }
import org.jkiss.dbeaver.core.CoreMessages;
        final String title = dialog.chooseName();

 * limitations under the License.
        public IFolder getTargetFolder() {
                            }
 *
import org.eclipse.core.commands.ExecutionException;
                }
import org.eclipse.jface.viewers.*;
 * You may obtain a copy of the License at
            return area;
        protected Composite createDialogArea(Composite parent) {
        }
                                treeViewer.setSelection(new StructuredSelection(targetNode));
import org.eclipse.swt.SWT;
            BookmarksHandlerImpl.createBookmark(node, title, dialog.getTargetFolder());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            CoreMessages.actions_navigator_bookmark_error_title,
import org.eclipse.swt.widgets.Shell;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
                            }
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectBase;
                        UIUtils.createControlLabel(area, "Bookmark folder");
                    if (bookmarksFolderNode != null) {
                    DBNResource bookmarksFolderNode = NavigatorResources.getNodeByResource(node.getModel(), bookmarksFolder);
import org.eclipse.core.resources.IFolder;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            DBPProject project = node.getOwnerProject();

                            IStructuredSelection structSel = (IStructuredSelection) event.getSelection();
                        foldersNavigator.setLayoutData(gd);
        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
import org.eclipse.swt.layout.GridData;
                    "Connection itself cannot be bookmarked. Choose some element under a connection element.");
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
            if (node instanceof DBNDatabaseNode dbNode) {
import org.jkiss.dbeaver.model.navigator.*;
import org.jkiss.dbeaver.ui.resources.bookmarks.BookmarksHandlerImpl;
                        treeViewer.addFilter(new ViewerFilter() {
                if (bookmarksFolder != null) {
import org.jkiss.dbeaver.model.rm.RMConstants;
        return null;
                            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            return UIUtils.getDialogSettings("DBeaver.AddBookmarkDialog"); //$NON-NLS-1$
 *
        if (title != null) {
import org.eclipse.core.commands.ExecutionEvent;
        private IFolder targetFolder;
                            Object object = structSel.isEmpty() ? null : structSel.getFirstElement();
        public AddBookmarkDialog(Shell parentShell, DBNDatabaseNode node) {
                            public boolean select(Viewer viewer, Object parentElement, Object element) {
                        gd.widthHint = 200;
 */
    }
                return null;
                        });
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * See the License for the specific language governing permissions and
 *
    public static void createBookmarkDialog(DBNDatabaseNode node, Shell activeShell) throws DBException {
                    CoreMessages.actions_navigator_bookmark_error_title,
