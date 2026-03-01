        }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridData;
    @Override
package org.jkiss.dbeaver.ui.navigator.dialogs;
import org.jkiss.code.Nullable;
        return object;
    public SelectDatabaseDialog(
        }
        super(parentShell,
        @NotNull Shell parentShell,
    }
            if (!newInstances.equals(selectedInstances)) {
    }
            return;
        Control buttonBar = super.createButtonBar(parent);
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
    {
                log.error(e);

            selectedInstances.clear();

    }
        }
    @NotNull
        @NotNull DBPDataSourceContainer dataSourceContainer,
                            }
    }
        instanceList.setLayoutData(gd);
        instanceList.createProgressPanel();
        DBNDatabaseNode object = super.getSelectedObject();
                UIUtils.getCatalogSchemaTerms(dataSourceContainer, true)),
                            DBSObject activeInstance = instanceContainer.getChild(monitor, currentInstanceName);
                // Do not show error (it will close the dialog)
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    @NotNull
                DBNDatabaseNode databaseNode = DBNUtils.getNodeByObject(monitor, object, false);
import org.eclipse.swt.widgets.Control;
            if (object instanceof DBSObjectContainer) {
        @Nullable String currentInstanceName,
        if (defaultContext == null) {
            updateButtons();
        if (object == null && !CommonUtils.isEmpty(selectedInstances)) {
                objectList.loadData();
/*
                @Override
        if (selectedInstances != null && currentInstanceName != null && getContextDefaults() != null
                UIUtils.showMessageBox(getShell(), "No database objects were found", "No database objects were found. Please set active datasource (" +
 * Unless required by applicable law or agreed to in writing, software

        }

import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
                    objectsCollection = Collections.singletonList(schema);
 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.IStructuredSelection;
                Collection<? extends DBSObject> objectsCollection;
                    }
            "SchemaSelector", //$NON-NLS-1$
            return selectedObject.getObject().getName();
                                if (activeInstanceNode != null) {
                    DBSSchema schema = contextDefaults.getDefaultSchema();
                    } catch (DBException e) {
            rootObject = dataSourceContainer.getDataSource();
                    nodeList.add(databaseNode);
                return getNodeList(monitor, objectsCollection);
        return defaultContext.getContextDefaults();
                }
    @Override
        for (DBSObject object : objectList) {
                        result = getNodeList(monitor, instances);
            true,

        DBNDatabaseNode selectedObject = getSelectedObject();
                        throw new InvocationTargetException(e);
        DBSObjectContainer instanceContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
        });
                selectedObjects.clear();
                        }
                enableButton(IDialogConstants.OK_ID, false);
                selectedInstances.addAll(newInstances);
                                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            } catch (DBException e) {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                    ActionUtils.findCommandDescription(ConnectionCommands.CMD_SELECT_CONNECTION, UIUtils.getActiveWorkbenchWindow(), true) +

        if (currentInstanceName == null || selectedInstances.isEmpty()) {

        if (contextDefaults != null && contextDefaults.supportsCatalogChange() && contextDefaults.supportsSchemaChange()) {
            if (isDialogComplete()) {
                    objectsCollection = ((DBSObjectContainer) rootObject).getChildren(monitor);
                        break;
import java.lang.reflect.InvocationTargetException;
}
            try {
            }
        }
            return null;
        }
/**
        int nodesLimit = DBWorkbench.getPlatform().getPreferenceStore().getInt(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE);
import org.jkiss.utils.CommonUtils;
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
                return Collections.emptyList();
 */
 *
            if (instance != null && !CommonUtils.equalObjects(instance.getNodeDisplayName(), currentInstanceName)) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;

        if (selectedObject != null && selectedObject.getObject() instanceof DBSCatalog) {
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                return;
            }
            objects,
        if (currentInstanceName == null || dataSource == null) {
    }
        return buttonBar;
            }
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
    }
    private final List<DBNDatabaseNode> selectedInstances = new ArrayList<>();
                }
    @Nullable
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
        @NotNull Collection<DBNDatabaseNode> selected)
                selectedInstances.clear();

        this.dataSourceContainer = dataSourceContainer;
            }
    @Override
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return selectedInstances.getFirst();
            true,
        gd.minimumWidth = 500;
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    if (nodeList.size() >= nodesLimit) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNUtils;
import java.util.Collections;
        if (CommonUtils.isEmpty(objectList)) {
        return objects;
        DBSObject rootObject;
                        objectList.loadData();
    @Nullable

        } else {
            List<DBNDatabaseNode> newInstances = selection.toList();
                if (rootObject instanceof DBSCatalog && contextDefaults != null && !contextDefaults.supportsSchemaChange()) {
import org.eclipse.swt.layout.GridLayout;
        DBPDataSource dataSource = dataSourceContainer.getDataSource();
            DBNDatabaseNode instanceNode = DBUtils.findObject(selectedInstances, currentInstanceName);
                    }
import java.util.List;
    private volatile String currentInstanceName;
    protected void createUpperControls(@NotNull Composite dialogArea) {
    protected List<DBNDatabaseNode> getObjects(@NotNull DBRProgressMonitor monitor) {
                if (databaseNode != null) {
        DBCExecutionContextDefaults<?,?> contextDefaults = getContextDefaults();
        if (selectedInstances.isEmpty()) {
        }
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    @Nullable

                } else {
            NLS.bind(
            }
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
        ((GridLayout)group.getLayout()).numColumns++;
        return true;
    private DBCExecutionContextDefaults<?,?> getContextDefaults() {
        instanceList.getSelectionProvider().addSelectionChangedListener(event -> {

                    selObjects.add(node);
            if (instanceContainer == null) {
                        if (!CommonUtils.isEmpty(currentInstanceName) && selectedInstances.isEmpty()) {
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.dbeaver.DBException;
import org.eclipse.osgi.util.NLS;
            return Collections.emptyList();
                if (DBNUtils.isDefaultElement(node)) {
            objectList.getSelectionProvider().setSelection(new StructuredSelection(selObjects));
            new DBRRunnableWithResult<>() {
    public DBNDatabaseNode getSelectedObject() {
import org.jkiss.dbeaver.model.DBUtils;
            }
 * you may not use this file except in compliance with the License.
                UIUtils.asyncExec(this::okPressed);
            && getContextDefaults().supportsSchemaChange()) {
        GridData gd = new GridData(GridData.FILL_BOTH);
import java.util.Collection;
public class SelectDatabaseDialog extends ObjectListDialog<DBNDatabaseNode> {
    private static List<DBNDatabaseNode> getNodeList(@NotNull DBRProgressMonitor monitor, @Nullable Collection<? extends DBSObject> objectList) {
    @Override
        DBPDataSource dataSource = dataSourceContainer.getDataSource();
        DBCExecutionContext defaultContext = DBUtils.getDefaultContext(instanceContainer, true);
    @NotNull
import org.eclipse.swt.widgets.Shell;
        });
        if (rootObject instanceof DBSObjectContainer) {
import org.eclipse.jface.viewers.StructuredSelection;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            DBSObjectContainer instanceContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
                        Collection<? extends DBSObject> instances = instanceContainer.getChildren(monitor);
                }
    }
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.DBPDataSource;
            selectedInstances,
 * SelectDatabaseDialog
    }

        return nodeList;
                currentInstanceName = instance.getNodeDisplayName();
            for (DBNDatabaseNode  node : items) {
            List<Object> selObjects = new ArrayList<>();
    protected boolean isDialogComplete() {
    private final DBPDataSourceContainer dataSourceContainer;
 * limitations under the License.
import org.eclipse.jface.dialogs.IDialogConstants;
import java.util.ArrayList;
        instanceList.loadData();
            group,
        closeOnFocusLost(instanceList.getItemsViewer().getControl());

            createInstanceSelector(dialogArea, instanceContainer);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
import org.eclipse.swt.SWT;
    protected void handleObjectsLoaded(@NotNull Collection<DBNDatabaseNode> items, boolean append) {
        instanceList.setDoubleClickHandler(event -> {
        // Now select the default object
import org.jkiss.dbeaver.Log;
    public String getCurrentInstanceName() {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 *
        DatabaseObjectListControl<DBNDatabaseNode> instanceList = createObjectSelector(
    private void createInstanceSelector(@NotNull Composite group, @NotNull DBSObjectContainer instanceContainer) {
        gd.heightHint = 300;
            rootObject = instanceNode == null ? null : instanceNode.getObject();
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
            return super.isDialogComplete();
        @NotNull Collection<DBNDatabaseNode> objects,
    protected Control createButtonBar(@NotNull Composite parent) {
                                DBNDatabaseNode activeInstanceNode = DBNUtils.getNodeByObject(monitor, activeInstance, false);
        }
        }
    }
            DBNDatabaseNode instance = selectedInstances.isEmpty() ? null : selectedInstances.getFirst();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
        this.currentInstanceName = currentInstanceName;
                UIMessages.label_choose,
 *
                                    selectedInstances.add(activeInstanceNode);

        return currentInstanceName;
        );
    }
        enableButton(IDialogConstants.OK_ID, false);
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
import org.jkiss.dbeaver.ui.ActionUtils;
        }
        if (objectList.getSelectionProvider().getSelection().isEmpty()) {
            "DatabaseInstanceSelector",
        List<DBNDatabaseNode> nodeList = new ArrayList<>(objectList.size());

                    try {
            return;
                            if (activeInstance != null) {
                }
    }
    private static final Log log = Log.getLog(SelectDatabaseDialog.class);
                // Clear schemas too
                DBCExecutionContextDefaults<?,?> contextDefaults = getContextDefaults();
            selectedInstances.addAll(selection.toList());
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    ") for this editor.", SWT.ICON_ERROR);
            selected);
