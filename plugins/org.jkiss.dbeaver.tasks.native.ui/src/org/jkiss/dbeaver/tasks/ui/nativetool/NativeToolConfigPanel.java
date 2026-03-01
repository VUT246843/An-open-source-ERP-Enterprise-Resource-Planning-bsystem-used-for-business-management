            newDataSource = (DBPDataSourceContainer) selectedObject;
                    AbstractNativeToolSettings settings = ieWizard.getSettings();
                }
                1,
                    selectedObject = objectClass.cast(child);
                @Override
            return TaskNativeUIMessages.tools_wizard_error_no_database_object_selected;
        curDataSource.persistConfiguration();
                1,
                if (catalogNode[0] != null) {
                    try {
                GridData.FILL_BOTH
    private static final Log log = Log.getLog(NativeToolConfigPanel.class);
                @Override
        this.providerClass = providerClass;
            };
    public void saveSettings() {
                    updateHomeSelector();
    private void updateHomeSelector() {
                protected boolean isDatabaseObjectVisible(DBSObject obj) {
        }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
import org.eclipse.swt.widgets.Composite;
            homesSelector.addSelectionChangedListener(event -> propertyChangeListener.run());
                        }
        this.runnableContext = runnableContext;
            for (DBSObject child = obj; child != null; child = child.getParentObject()) {
    public boolean isComplete() {
    }

                    if (settings instanceof AbstractImportExportSettings) {
                }

            Composite clientGroup = UIUtils.createTitledComposite(
    {
                GridData.FILL_HORIZONTAL

import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
import java.util.List;
                @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.navigator.database.DatabaseObjectsSelectorPanel;
        ieWizard = (AbstractNativeToolWizard) wizard;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/*
        for (DBSObject obj : databaseObjects) {
    @Override

import org.jkiss.dbeaver.Log;
    @Override
            return TaskNativeUIMessages.tools_wizard_error_no_native_client_selected;
                            return true;
                        log.debug(e);
                ieWizard.getRunnableContext().run(true, true, monitor ->
                        databaseObjects.add(selectedObject);
        if (CommonUtils.isEmpty(homesSelector.getSelectedHome())) {
            newDataSource = selectedObject.getDataSource().getContainer();
            } catch (InterruptedException e) {
        if (selectedObject == null) {
    }
                    }
                            (driver.getNativeClientManager() != null && driver.getNativeClientManager().supportsNativeClients());
                    selectedObject = element instanceof DBSWrapper && objectClass.isInstance(((DBSWrapper) element).getObject()) ?
        }
                    }

    }
        DBPDataSourceContainer newDataSource = null;
        final String selectedHome = homesSelector.getSelectedHome();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPDriver;
    public String getErrorMessage() {
                if (objectClass.isInstance(child)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
    private final DBRRunnableContext runnableContext;

        } else if (selectedObject != null) {
            }
        DBPDataSourceContainer container = ieWizard.getSettings().getDataSourceContainer();
public abstract class NativeToolConfigPanel<OBJECT_TYPE extends DBSObject> implements DBTTaskConfigPanel {
                    }
                    //selectorPanel.checkNodes(selCatalogs, true);

        DBTTaskType taskType,
                protected boolean isDatabaseFolderVisible(DBNDatabaseFolder folder) {

}
        Class<OBJECT_TYPE> objectClass,
                @Override
                parent,
                }

    }
                TaskNativeUIMessages.tools_wizard_client_group_title,
import org.jkiss.utils.CommonUtils;
        {
import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
                this.runnableContext) {
        this.taskType = taskType;
 * Unless required by applicable law or agreed to in writing, software
        }
                // ignore
        if (selectedObject instanceof DBPDataSourceContainer) {
 * limitations under the License.
            Composite databasesGroup = UIUtils.createTitledComposite(
 * See the License for the specific language governing permissions and
                    List<DBSObject> databaseObjects = settings.getDatabaseObjects();
 *
    public void createControl(Composite parent,     TaskConfigurationWizard wizard, Runnable propertyChangeListener) {
        {
                DBNDatabaseNode[] catalogNode = new DBNDatabaseNode[1];
    private final DBTTaskType taskType;
                    }
                    return objectClass.isInstance(obj);
            homesSelector = new ClientHomesSelector(clientGroup, TaskNativeUIMessages.tools_wizard_client_group_client);
                parent,
                protected boolean isFolderVisible(DBNLocalFolder folder) {
            try {
    private ClientHomesSelector homesSelector;
                        return false;
        curDataSource.getConnectionConfiguration().setClientHomeId(selectedHome);
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

    private AbstractNativeToolWizard ieWizard;
                    propertyChangeListener.run();
            );
import java.util.Collections;
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                }
                protected boolean isDataSourceVisible(DBNDataSource dataSource) {
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
    private OBJECT_TYPE selectedObject;
            } catch (InvocationTargetException e) {
        if (newDataSource != null && curDataSource != newDataSource) {
        curDataSource = newDataSource;
import java.lang.reflect.InvocationTargetException;
    @Override
        return homesSelector.getSelectedHome() != null && selectedObject != null;
                    } catch (Exception e) {

        DBRRunnableContext runnableContext,
    }
                databasesGroup,
        }

                        objectClass.cast(((DBSWrapper) element).getObject()) : null;
import org.jkiss.dbeaver.model.navigator.*;
import org.eclipse.swt.layout.GridData;
    }
import org.jkiss.dbeaver.model.struct.DBSWrapper;
        return null;
            homesSelector.populateHomes(newDataSource.getDriver(), newDataSource.getConnectionConfiguration().getClientHomeId(), true);
 * you may not use this file except in compliance with the License.


    @Override
    private final Class<? extends DBPDataSourceProvider> providerClass;

import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
                    break;
package org.jkiss.dbeaver.tasks.ui.nativetool;
                        DBPDriver driver = dataSource.getDataSourceContainer().getDriver();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (selectorPanel != null && (selectedObject != null || container != null)) {
            homesSelector.getPanel().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        if (isDataSourceVisible(ds)) {

    public void loadSettings() {

                        return providerClass.isInstance(driver.getDataSourceProvider()) &&
                false,

                }
                    return false;
        }
    private final Class<OBJECT_TYPE> objectClass;
                DBWorkbench.getPlatformUI().showError("Catalogs", " Error loading catalog list", e.getTargetException());

    private DatabaseObjectsSelectorPanel selectorPanel;
        Class<? extends DBPDataSourceProvider> providerClass)
        List<DBSObject> databaseObjects = ieWizard.getSettings().getDatabaseObjects();
import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesSelector;
                    List<DBNNode> selCatalogs = Collections.singletonList(catalogNode[0]);
import org.jkiss.dbeaver.model.struct.DBSObject;
                        ((AbstractImportExportSettings) settings).fillExportObjectsFromInput();
    }

 *
            );

    @Override
        }
    public NativeToolConfigPanel(
    private DBPDataSourceContainer curDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
                    return folder.getChildrenClass() == objectClass;
            selectorPanel = new DatabaseObjectsSelectorPanel(
                    selectorPanel.setSelection(selCatalogs);
 */
                    catalogNode[0] = DBNUtils.getNodeByObject(monitor, selectedObject != null ? selectedObject : container, false));
                @Override
                    for (DBNDataSource ds : folder.getNestedDataSources()) {
        }
                TaskNativeUIMessages.tools_wizard_database_group_title,
                protected void onSelectionChange(Object element) {
import org.jkiss.dbeaver.model.task.DBTTaskType;
                    databaseObjects.clear();
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanel;
 * You may obtain a copy of the License at
        this.objectClass = objectClass;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (selectedObject != null) {
