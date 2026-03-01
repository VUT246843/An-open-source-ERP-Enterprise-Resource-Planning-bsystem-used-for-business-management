                            true
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (dbnNode == null) {
import org.jkiss.dbeaver.ui.navigator.project.ProjectNavigatorView;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                        }
import org.eclipse.core.commands.ExecutionException;
                        } else {
                if (dbnNode != null) {
                    }
                        if (objectNode != null) {
                DBPDataSourceContainer dsContainer = provider.getDataSourceContainer();
import org.jkiss.dbeaver.model.struct.DBSInstance;
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
                            DBCExecutionContextDefaults<?,?> contextDefaults = executionContext.getContextDefaults();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                showResourceInNavigator(navigatorView, file);
                        dbnNode = globalNavigatorModel.findNode(databaseObject);
import org.eclipse.ui.IWorkbenchPage;
                    navigatorView.showNode(dbnNode);
        }
import org.eclipse.ui.texteditor.ITextEditor;
                    if (activeEditor instanceof DBPContextProvider contextProvider) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.core.commands.ExecutionEvent;

                    }
                            activeObject = DBUtils.getDefaultOrActiveObject(dataSource.getDefaultInstance());
    }
                        );
import org.eclipse.ui.IEditorPart;
                            showObject = dataSource.getContainer();

            return null;
        final IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
        }

 * you may not use this file except in compliance with the License.
                        DBSObject showObject = objectToSelect;
            }
                        }
                        if (showObject instanceof DBSInstance && !(showObject instanceof DBPDataSourceContainer)) {
                                activeObject = contextDefaults.getDefaultSchema();
        if (activeEditor == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (activeEditor.getEditorInput() instanceof IDatabaseEditorInput editorInput) {
                    }
package org.jkiss.dbeaver.ui.navigator.actions;
                    if (activeObject == null) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
                DBNNode dbnNode = editorInput.getNavigatorNode();
import org.jkiss.dbeaver.model.navigator.*;
                (navigatorView instanceof ProjectNavigatorView && activeEditor instanceof ITextEditor)) {
import org.eclipse.core.resources.IFile;
import org.jkiss.dbeaver.ui.navigator.project.ProjectExplorerView;
                        DBCExecutionContext executionContext = contextProvider.getExecutionContext();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            NavigatorViewBase.getGlobalNavigatorModel().getRoot(), editorFile.getProject());
 * Unless required by applicable law or agreed to in writing, software

                        if (showObject instanceof DBPDataSource dataSource) {
                        DBPDataSource dataSource = dsContainer.getDataSource();

                            showObject = objectToSelect.getParentObject();

                    DBSObject objectToSelect = activeObject;
                                }
 * limitations under the License.
            IFile file = EditorUtils.getFileFromInput(activeEditor.getEditorInput());
            if (file != null) {
    private void showResourceInNavigator(NavigatorViewBase activePart, IFile editorFile) {
                        }
                        }
                        if (executionContext != null) {
import org.jkiss.dbeaver.ui.UIUtils;
                            activeObject = dsContainer;
import org.eclipse.core.commands.AbstractHandler;
        activePage.activate(navigatorView);
/*
 *
                DBSObject activeObject = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    });
                                if (activeObject == null) {
    @Override
                    final NavigatorViewBase view = navigatorView;
        DBNProject projectNode = NavigatorResources.getProjectNode(
 * Copyright (C) 2010-2024 DBeaver Corp and others
                            monitor,
                if (dsContainer != null) {
                }
                            showObject,
                    if (databaseObject != null) {
                                    activeObject = contextDefaults.getDefaultCatalog();
        }
        if (resource != null) {
        }
        } else {
                            view.showNode(objectNode);
        DBNResource resource = NavigatorResources.findResource(projectNode, editorFile);
                        }
            return null;
import org.jkiss.dbeaver.model.*;
                        if (dataSource != null) {
        return null;
 *
 *

        if (navigatorView == null) {
        NavigatorViewBase navigatorView = NavigatorUtils.getActiveNavigatorView(event);
                            }
public class NavigatorHandlerLinkEditor extends AbstractHandler {
import org.eclipse.ui.handlers.HandlerUtil;
                            if (contextDefaults != null) {
 * You may obtain a copy of the License at

            DBNModel globalNavigatorModel = navigatorView.getGlobalNavigatorModel();
                    DBSObject databaseObject = editorInput.getDatabaseObject();
            activePart.showNode(resource);
        if (navigatorView instanceof ProjectExplorerView ||

                    UIUtils.runInUI(activePage.getWorkbenchWindow(), monitor -> {
                }
            } else if (activeEditor instanceof DBPDataSourceContainerProvider provider) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                        DBNDatabaseNode objectNode = globalNavigatorModel.getNodeByObject(
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 */

            }
}        final IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
