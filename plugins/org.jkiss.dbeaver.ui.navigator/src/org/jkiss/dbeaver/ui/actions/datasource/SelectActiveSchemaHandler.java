        DBPDataSourceContainer dataSourceContainer = DataSourceToolbarUtils.getCurrentDataSource(HandlerUtil.getActiveWorkbenchWindow(event));
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * limitations under the License.
        String schemaName = "< N/A >";
        SelectDatabaseDialog dialog = new SelectDatabaseDialog(
            } else {
                            schemaName = defaultSchema.getName() + "@" + defaultCatalog.getName();

                }
        @Nullable String curInstanceName,
                }
        try {
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {

                    setUser(true);

                DBCExecutionContext executionContext = ((IDatabaseEditorInput) editorInput).getExecutionContext();
import org.eclipse.ui.IWorkbenchWindow;
    public void updateElement(UIElement element, Map parameters) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                    });
            return;


                        schemaIcon = DBIcon.TREE_SCHEMA;
    }
                    executionContext,
    ) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                // Change current schema
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                DBCExecutionContextDefaults<?, ?> contextDefaults = null;
 *
            UIUtils.runInProgressService(contextDefaultObjectsReader);
                    if (defaultCatalog != null && (defaultSchema != null || contextDefaults.supportsSchemaChange())) {
                        @Override
                        }
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.ui.UIUtils;
                    activeEditor.addPropertyListener(new IPropertyListener() {
import org.jkiss.dbeaver.utils.GeneralUtils;
            if (executionContext != null) {
            }
                        @Override
        @Override
    @Override
                DBCExecutionContext executionContext = getExecutionContextFromPart(activeEditor);
                );
                if (contextDefaults != null) {
                        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
                                activeEditor.removePropertyListener(this);
                }
        if (dataSource != null && dataSource.isConnected()) {
        String schemaTooltip = UIUtils.getCatalogSchemaTerms(dataSource, true);
import java.lang.reflect.InvocationTargetException;
        contextDefaultObjectsReader.setReadNodes(true);
import org.eclipse.core.runtime.Status;
            if (defObjects == null) defObjects = new DBSObject[0];
                }
                menuItems.add(
            DBCExecutionContext executionContext = getExecutionContextFromPart(activeEditor);
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
                                activeEditor,
                                (object instanceof DBSSchema ? node.getNodeDisplayName() : null));
                        }
                    } catch (DBException e) {
                    }
import org.eclipse.ui.menus.UIElement;
            DBSObject[] defObjects = null;
            if (SelectActiveDataSourceHandler.getDataSourceContainerProvider(activeEditor) == null) {
            RuntimeUtils.runTask(contextDefaultObjectsReader, "Read database list", DB_LIST_READ_TIMEOUT);
                if (executionContext != null) {
                        schemaName = defaultSchema.getName();
                }
        }
import org.eclipse.ui.IPropertyListener;
            return null;
            }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * you may not use this file except in compliance with the License.
        if (activeEditor == null) {
                @Override
            if (selObject != defaultObject) {
                DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DBCExecutionContext executionContext = getExecutionContextFromPart(activeEditor);
import org.jkiss.dbeaver.utils.RuntimeUtils;
        DBNDatabaseNode selectedNode = selectedDB == null ?
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(node.getNodeIcon()));
                        return Status.OK_STATUS;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
                            schemaName = schemaObject.getName();
        if ("true".equals(parameters.get("noCustomLabel"))) {

                        if (defaultSchema != null) {
                                dataSourceContainer,
    @Override
                if (menuItems.size() >= nodesLimit) {
            DBWorkbench.getPlatformUI().showError("Schema list", "Error reading schema list", e.getTargetException());
                    if (schemaObject != null && DBUtils.getPublicObjectContainer(schemaObject) != dataSource) {
            contextDefaultObjectsReader.setReadNodes(true);
import org.jkiss.code.NotNull;
            HandlerUtil.getActiveShell(event),
                if (object == defaultObject || object == defaultObject.getParentObject()) {
        } catch (InvocationTargetException e) {
import org.eclipse.core.commands.ExecutionEvent;
                            changeDataBaseSelection(
import org.eclipse.jface.action.ActionContributionItem;


import org.jkiss.dbeaver.ui.editors.DatabaseLazyEditorInput;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;

import org.eclipse.jface.dialogs.IDialogConstants;

                        DBSObject schemaParent = schemaObject.getParentObject();
            }.schedule();
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
import org.eclipse.ui.IEditorPart;
        DBSObject selectedDB = null;
            new AbstractJob("Change active database") {
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.runtime.IStatus;
            for (DBNDatabaseNode node : contextDefaultObjectsReader.getNodeList()) {
        } catch (InterruptedException e) {
                    activeEditor,
            DBSObject selObject = node.getObject();
                        private final DBSObject object = node.getObject();
                    contextDefaultObjectsReader.getDefaultCatalogName(),

                        }
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.DBException;
                        }
        }
                return;
        static final int DB_LIST_READ_TIMEOUT = 3000;

                            schemaName = defaultCatalog.getName();
        return null;
 * DBeaver - Universal Database Manager
        DBNDatabaseNode node = dialog.getSelectedObject();
        element.setText(schemaName);
        ContextDefaultObjectsReader contextDefaultObjectsReader = new ContextDefaultObjectsReader(dataSourceContainer.getDataSource(), executionContext);
import java.util.Collections;
            return;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        DBPDataSourceContainer dataSource = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
        @Nullable String newInstanceName,

        }

                }
                }
            }
 *
                                executionContext,
        DBIcon schemaIcon = DBIcon.TYPE_OBJECT;
                        if (schemaParent instanceof DBSObjectContainer && !(schemaParent instanceof DBPDataSource)) {
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;

    public static final int DEFAULT_SCHEMA_LIST_LIMIT = 100;
        @Nullable IEditorPart activeEditor,
                    contextDefaults = executionContext.getContextDefaults();
package org.jkiss.dbeaver.ui.actions.datasource;
                if (editorInput instanceof DatabaseLazyEditorInput) {
        DBCExecutionContext executionContext,
        DBSObject defaultObject = contextDefaultObjectsReader.getDefaultObject();
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                        DBExecUtils.setExecutionContextDefaults(monitor, dataSource, executionContext, newInstanceName, curInstanceName, newObjectName);
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
            contextDefaultObjectsReader.getNodeList(),
            final DBPDataSource dataSource = dsContainer.getDataSource();
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.eclipse.jface.action.Action;
            int nodesLimit = Math.min(
 * You may obtain a copy of the License at
            return null;
            //schemaName = "<no schema>";
                    schemaName
            }
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
/*
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDatabaseDialog;

        dialog.setModeless(true);
            null : DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(selectedDB);
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                        return GeneralUtils.makeExceptionStatus(e);
                        schemaName = defaultCatalog.getName();
                    DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
            IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
            return null;
            dataSourceContainer,
    }
                    } else if (defaultCatalog != null) {
                changeDataBaseSelection(
                            schemaIcon = DBIcon.TREE_SCHEMA;
                                contextDefaultObjectsReader.getDefaultCatalogName(),
        }
        if (defaultObject != null) {
    public static class MenuContributor extends DataSourceMenuContributor {
        if (dataSourceContainer == null) {
            if (dataSourceContainer == null) {

                        } else {
        if (dsContainer != null && dsContainer.isConnected()) {
import org.eclipse.jface.action.IContributionItem;
                if (executionContext != null) {
                String schemaName = selObject instanceof DBSSchema ? selObject.getName() : null;
                        public boolean isChecked() {
                    break;
import java.util.List;
            if (editorInput instanceof IDatabaseEditorInput) {
                    dialog.getCurrentInstanceName(),
            log.debug("No active connection. Action is in disabled state.");
                DEFAULT_SCHEMA_LIST_LIMIT,
import org.jkiss.dbeaver.model.DBUtils;
            selectedNode == null ? Collections.emptyList() : Collections.singletonList(selectedNode));
            }
                ));
import org.jkiss.dbeaver.model.DBPDataSource;
                    }
 * See the License for the specific language governing permissions and
                    try {
import org.jkiss.dbeaver.model.DBIcon;
                    }
 *
            return null;
import org.eclipse.ui.commands.IElementUpdater;
                        {
                    selectedDB = object;
                        schemaIcon = DBIcon.TREE_DATABASE;
        DBPDataSourceContainer dsContainer,
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
import org.eclipse.ui.IEditorInput;
                DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
import org.jkiss.utils.ArrayUtils;
        if (node != null) {
        }
            return null;
        }
                    }
    }
                            schemaName = schemaObject.getName() + "@" + schemaParent.getName();
            DBPDataSourceContainer dataSourceContainer = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
import org.jkiss.dbeaver.model.impl.struct.ContextDefaultObjectsReader;
                        @Override
                        public void propertyChanged(Object source, int propId) {
                    DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
}                        public void run() {
                {
        }
        protected void fillContributionItems(List<IContributionItem> menuItems) {
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
            return;
import java.util.Map;
 */
        element.setTooltip(schemaTooltip);
                    new ActionContributionItem(new Action(node.getName(), Action.AS_CHECK_BOX) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
        if (SelectActiveDataSourceHandler.getDataSourceContainerProvider(activeEditor) == null) {

                            if (EntityEditor.PROP_TITLE == propId) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            }
                    DBSObject schemaObject = DBUtils.getSelectedObject(executionContext);
        }
                            schemaIcon = DBIcon.TREE_DATABASE;

            for (DBSObject object : contextDefaultObjectsReader.getObjectList()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                        } else {
            ContextDefaultObjectsReader contextDefaultObjectsReader = new ContextDefaultObjectsReader(dataSourceContainer.getDataSource(), executionContext);
                @NotNull
        }
        }
            IEditorInput editorInput = activeEditor.getEditorInput();
                    dataSourceContainer,
                    } else if (defaultSchema != null) {
public class SelectActiveSchemaHandler extends AbstractDataSourceHandler implements IElementUpdater {
                if (contextDefaults != null) {
import org.eclipse.core.commands.ExecutionException;
                            return ArrayUtils.contains(finalDefObjects, object);
                        }
                    defObjects = new DBSObject[] { contextDefaults.getDefaultCatalog(), contextDefaults.getDefaultSchema() };
    private static void changeDataBaseSelection(

            DBSObject[] finalDefObjects = defObjects;
        }
    }
        @Nullable String newObjectName
                                (object instanceof DBSCatalog ? object.getName() : contextDefaultObjectsReader.getDefaultCatalogName()),
            contextDefaultObjectsReader.getDefaultCatalogName(),
                }
        element.setIcon(DBeaverIcons.getImageDescriptor(schemaIcon));
                                DataSourceToolbarUtils.updateCommandsUI();
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
