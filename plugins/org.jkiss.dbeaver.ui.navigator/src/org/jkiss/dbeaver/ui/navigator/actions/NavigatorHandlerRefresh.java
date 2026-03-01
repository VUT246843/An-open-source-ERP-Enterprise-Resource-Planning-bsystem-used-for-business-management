            return refreshNavigator(refreshObjects);
import org.eclipse.ui.IEditorReference;
/*
                    if (!refreshedSet.isEmpty()) {
            protected Boolean runTask() {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;
                            Throwable lastLoadError = refreshed.getLastLoadError();
                        }
import org.jkiss.dbeaver.model.struct.DBSObject;
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");



                    monitor.worked(1);
                            }
                IEditorPart editorPart = er.getEditor(false);
                    try {
            return false;
    }
        }
                }
        INavigatorModelView navigatorView = GeneralUtils.adapt(workbenchPart, INavigatorModelView.class);

import org.jkiss.dbeaver.utils.GeneralUtils;
                        }
            for (IEditorReference er : UIUtils.getActiveWorkbenchWindow().getActivePage().getEditorReferences()) {
                        // Skip locked nodes
                        return null;
import org.eclipse.ui.handlers.HandlerUtil;
            //return null;
                monitor.done();
        if (!refreshObjects.isEmpty()) {
 * DBeaver - Universal Database Manager
            }
    }
                        for (DBNNode refreshed : refreshedSet) {
                        DBNNode nextNode = iter.next();
            }
                                log.warn("Unable to disconnect from datasource");
            }

                    rootNode = databaseEditorInput.getNavigatorNode();
                                return true;
    static boolean refreshInNavigator(ExecutionEvent event, IWorkbenchPart workbenchPart, boolean refreshRoot) {
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
//                    if (!showConfirmation(node)) {
                    if (node.isDisposed() || node.isLocked()) {
 *
//                    }
        // If navigator refresh is possible then do not refresh active part directly
                            if (node == refreshed || node.isChildOf(refreshed)) {
        } else if (selection instanceof IStructuredSelection structSelection) {
                }
                            }
        if (workbenchPart instanceof IRefreshablePart refreshablePart) {
                IEditorInput editorInput = databaseEditor.getEditorInput();
                        continue;
                    // Check this node was already refreshed
                        DBWorkbench.getPlatformUI().showError("Refresh", "Error refreshing node", ex);
                        nodeEditor.getTitle()) == IDialogConstants.YES_ID;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }.execute();
                if (editorInput instanceof IDatabaseEditorInput databaseEditorInput) {
        final List<DBNNode> refreshObjects = new ArrayList<>();

                        // Do not refresh non-persistent objects
import org.eclipse.jface.viewers.IStructuredSelection;
    }
        return true;
                                ((DBNDataSource) node).getDataSourceContainer().disconnect(monitor);
                    if (databaseObject == null || !databaseObject.isPersisted()) {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
        // Refresh objects
import java.util.*;
                    return true;
                return Status.OK_STATUS;
    @Override
                            }
import org.eclipse.core.runtime.Status;
        Job refreshJob = new AbstractJob("Refresh navigator object(s)") {
        }
 */
        if (rootNode == null) {
        refreshJob.schedule();
        if (refreshInNavigator(event, workbenchPart, false)) {

                        // USe parent if this node is a folder
        // Try to refresh as refreshable part
            // Nothing to refresh
            if (workbenchPart instanceof IEditorPart editorPart) {
                    DBNDatabaseNode editorNode = ((DatabaseEditorInput<?>) editorPart.getEditorInput()).getNavigatorNode();

            }
            }
        }
//                        continue;
            if (refreshablePart.refreshPart(this, true) == IRefreshablePart.RefreshResult.CANCELED) {
import org.jkiss.dbeaver.ui.UIConfirmation;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.code.NotNull;
                    }
                }
                    }
                    return ConfirmationDialog.confirmAction(
        };
                    }
                            try {

}

                IEditorPart nodeEditor = NavigatorHandlerObjectOpen.findEntityEditor(UIUtils.getActiveWorkbenchWindow(), node);
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
 *
import org.eclipse.core.commands.ExecutionEvent;

                    for (Iterator<DBNNode> iter = refreshObjects.iterator(); iter.hasNext(); ) {
                            refreshedSet.add(refreshed);
            for (Object object : structSelection) {
                        break;
import org.eclipse.core.commands.ExecutionException;
                        if (refreshed != null) {
        final IWorkbenchPart workbenchPart = HandlerUtil.getActivePart(event);
            }
                    }
        }
    public static boolean refreshNavigator(final Collection<? extends DBNNode> refreshObjects)
        return false;
                        }
                        }
                        boolean skip = false;
                    }
        // Check for open editors with selected objects
                            }
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
    {
public class NavigatorHandlerRefresh extends AbstractHandler {
                    DBSObject databaseObject = databaseEditorInput.getDatabaseObject();
import org.jkiss.dbeaver.model.navigator.*;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            }
                    if (node instanceof DBNDatabaseFolder && !(node.getParentNode() instanceof DBNDatabaseFolder) && node.getParentNode() instanceof DBNDatabaseNode) {
        }
        return new UIConfirmation() {
                if (editorPart.getEditorInput() instanceof IDatabaseEditorInput databaseEditorInput) {
        // Because active part should be refresh in navigator event handler
                        node = node.getParentNode();
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
                        ConfirmationDialog.QUESTION,

        return null;
                }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                return null;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.commands.AbstractHandler;
            @Override
            if (workbenchPart instanceof IDatabaseEditor databaseEditor) {
        // Try to get navigator view and refresh node

                        if (skip) {
                                log.info("Unable to refresh datasource, disconnecting");

import org.eclipse.jface.dialogs.IDialogConstants;
                            continue;
    public Object execute(ExecutionEvent event) throws ExecutionException {
                                skip = true;

import org.eclipse.ui.IEditorInput;
        DBNNode rootNode = navigatorView.getRootNode();
                } else {
            return null;
    private static final Log log = Log.getLog(NavigatorHandlerRefresh.class);
                    refreshObjects.add((DBNNode) object);
import org.jkiss.dbeaver.ui.UIUtils;
                monitor.beginTask("Refresh objects", refreshObjects.size());
        //final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
 * you may not use this file except in compliance with the License.
                            if (lastLoadError != null) {
import org.eclipse.core.runtime.IStatus;
 * Unless required by applicable law or agreed to in writing, software

                }
import org.jkiss.dbeaver.Log;
            @Override
import org.eclipse.ui.IWorkbenchPart;
                for (DBNNode node : refreshObjects) {
                if (nodeEditor != null && nodeEditor.isDirty()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
                if (editorPart instanceof IRefreshablePart && editorPart.getEditorInput() instanceof DatabaseEditorInput && editorPart.isDirty()) {
        if (rootNode != null && rootNode.getParentNode() instanceof DBNDatabaseNode || (refreshRoot && rootNode instanceof DBNProjectDatabases)) {
                        DBNNode refreshed = node.refreshNode(monitor, DBNEvent.FORCE_REFRESH);
import org.jkiss.dbeaver.ui.IRefreshablePart;
        refreshJob.setUser(true);
                Set<DBNNode> refreshedSet = new HashSet<>();
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                    catch (Throwable ex) {
        }
            }
package org.jkiss.dbeaver.ui.navigator.actions;
                    }
 *
    public NavigatorHandlerRefresh() {
                                throw lastLoadError;
    }
    private static boolean showConfirmation(DBNNode node) {
                        }
            refreshObjects.add(rootNode);
            @NotNull
                        null,
                }
                    setName("Refresh '" + node.getNodeDisplayName() + "'...");
        if (navigatorView == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (object instanceof DBNNode) {
                            if (((IRefreshablePart) editorPart).refreshPart(navigatorView, true) == IRefreshablePart.RefreshResult.CANCELED) {
        if (!refreshObjects.isEmpty()) {
                            } catch (DBException e) {
                        if (node instanceof DBNDataSource) {
                                iter.remove();
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                    // Check for dirty editor (some local changes) and ask for confirmation
import org.eclipse.jface.viewers.ISelection;
        }
                        if (nextNode == editorNode || editorNode.isChildOf(nextNode) || nextNode.isChildOf(editorNode)) {
                                break;
import org.jkiss.dbeaver.ui.editors.DatabaseEditorInput;
                        NavigatorPreferences.CONFIRM_ENTITY_REVERT,
import org.eclipse.ui.IEditorPart;
 * See the License for the specific language governing permissions and

 * Copyright (C) 2010-2025 DBeaver Corp and others
                            if (nextNode == editorNode) {
                    if (monitor.isCanceled()) {

