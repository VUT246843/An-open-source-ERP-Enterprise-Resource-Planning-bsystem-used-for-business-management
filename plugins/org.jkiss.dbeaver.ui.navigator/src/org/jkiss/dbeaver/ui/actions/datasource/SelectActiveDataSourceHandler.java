{
import org.eclipse.jface.action.*;
            connectedDataSources.removeIf(o -> !o.isConnected());
                menuItems.add(new Separator());
            return;
            return;
 *
        if (workbenchWindow != null) {
        DBPContextProvider contextProvider = GeneralUtils.adapt(workbenchPart, DBPContextProvider.class);
    @Override
            }
import org.eclipse.ui.handlers.HandlerUtil;
            singleDataSources.sort(DBUtils.nameComparator());
        DBPDataSourceContainer dataSource = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
            return new Action(newDataSource.getName(), Action.AS_CHECK_BOX) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                    new ActionContributionItem(
                menuItems.add(new ActionContributionItem(new Action("Other ...") {
            }
            for (DBPDataSourceContainer ds : connectedDataSources) {
                        DBeaverIcons.getImageDescriptor(driver.getIcon()),
 * See the License for the specific language governing permissions and
                    driverIter.remove();
    @NotNull

        DBPImage connectionIcon;
            return null;
    @Override
            if (dsNode != null) {
        }
                    public void run() {
package org.jkiss.dbeaver.ui.actions.datasource;
                List<DBPDataSourceContainer> dsList = driverIter.next().getValue();
            DBPDataSourceContainer curDataSource = getDataSourceContainerFromPart(workbenchWindow.getActivePage().getActivePart());
import org.eclipse.ui.menus.UIElement;
        }
    }
 * You may obtain a copy of the License at
            final DBPDataSourceContainer dataSourceContainer = getDataSourceContainerFromPart(workbenchWindow.getActivePage().getActivePart());
            IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
                    }
            }
        openDataSourceSelector(workbenchWindow, activeProject, dataSource);
    private static List<? extends DBPDataSourceContainer> getAvailableDataSources() {
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
        }
    }
            // Cut too long lists
                }
                    if (fileDataSource != null) {
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        }
                        setImageDescriptor(DBeaverIcons.getImageDescriptor(dsNode.getNodeIcon()));
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            }
        if (dataSource == null) {
                    singleDataSources.add(dsList.get(0));
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
                }
                {
                for (DBPDataSourceContainer ds : singleDataSources) {
                        driverMenu.add(
                    menuItems.add(driverMenu);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    static IDataSourceContainerUpdate getDataSourceContainerProvider(IWorkbenchPart workbenchPart) {

                menuItems.add(new Separator());
        String connectionName;
        }
                for (Map.Entry<DBPDriver, List<DBPDataSourceContainer>> de : driverMap.entrySet()) {
                gc.dispose();
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (getDataSourceContainerProvider(activeEditor) == null) {
                menuItems.add(new Separator());
import org.jkiss.dbeaver.ui.UIUtils;
            return (IDataSourceContainerUpdate)contextProvider;
import org.jkiss.dbeaver.utils.GeneralUtils;
            connectionName = dataSource.getName();
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        element.setTooltip(UINavigatorMessages.toolbar_datasource_selector_combo_datasource_tooltip);
                    MenuManager driverMenu = new MenuManager(
                            createDataSourceChangeAction((IDataSourceContainerUpdate) activeEditor, curDataSource, ds, DBNUtils.getNodeByObject(ds))));
            }
    public Object execute(ExecutionEvent event) throws ExecutionException
        }
        }
        if (contextProvider == null) {
        return null;

                        return fileDataSource.getRegistry().getDataSources();

                return DataSourceRegistry.getAllDataSources();
        if (contextProvider instanceof IDataSourceContainerUpdate) {
        if ("true".equals(parameters.get("noCustomLabel"))) {
        }
        if (activeProject == null) {
}            }
                }
import org.eclipse.ui.IEditorPart;
                public boolean isChecked() {
            for (DBPDataSourceContainer ds : dataSources) {
            }
                }));
import org.jkiss.dbeaver.ui.UITextUtils;
            UIUtils.getActiveWorkbenchShell(),
                if (curFile != null) {
                    }
                    activeProject = DBPPlatformDesktop.getInstance().getWorkspace().getProject(curFile.getProject());
                    DBPDriver driver = de.getKey();
import org.eclipse.jface.dialogs.IDialogConstants;



 * you may not use this file except in compliance with the License.
    
                        createDataSourceChangeAction((IDataSourceContainerUpdate) activeEditor, curDataSource, ds, dsNode)));
                while (menuItems.size() > MAX_MENU_ITEM_SIZE) {
import org.eclipse.core.resources.IFile;
            }
        protected void fillContributionItems(List<IContributionItem> menuItems) {
        //Get project from active editor
                } else {
                    DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(curFile.getProject());
        return activeProject;

import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
        @Override
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            return;
            return null;
 *
                        driver.getId());
        }
                IFile curFile = EditorUtils.getFileFromInput(activeEditor.getEditorInput());
                        return projectMeta.getDataSourceRegistry().getDataSources();
            };
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
import org.jkiss.dbeaver.ui.IDataSourceContainerUpdate;
                connectionName = UITextUtils.getShortText(gc, connectionName, 200);
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
            return null;
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
            if (!singleDataSources.isEmpty()) {
 *
        DBPProject activeProject = dataSource == null ? null : dataSource.getProject();

            dataSources.removeAll(connectedDataSources);
        DBPDataSourceContainer dataSource = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
 * limitations under the License.
                menuItems.add(

    }
                return dataSourceContainer.getRegistry().getDataSources();
                List<DBPDataSourceContainer> driverDS = driverMap.computeIfAbsent(ds.getDriver(), k -> new ArrayList<>());
import org.eclipse.core.commands.ExecutionException;
                if (curFile != null) {
    }
                            createDataSourceChangeAction(
            if (activeEditor != null) {
                    menuItems.add(
            DBNDatabaseNode dsNode = null;//dataSource.getProject().getNavigatorModel().getNodeByObject(dataSource);
 * DBeaver - Universal Database Manager
        if (newDataSource == dataSource) {
            connectionName = "< N/A >";
 */
            if (menuItems.size() > MAX_MENU_ITEM_SIZE) {
                @Override
            // We cannot use dynamic icons here. Eclipse needs real URI

            GC gc = new GC(workbenchWindow.getShell());
        dialog.setModeless(true);
        DBPDataSourceContainer newDataSource = dialog.getDataSource();


 * Licensed under the Apache License, Version 2.0 (the "License");
    public static class MenuContributor extends DataSourceMenuContributor {
    {
        return Collections.emptyList();
                return;
                IFile curFile = EditorUtils.getFileFromInput(activeEditor.getEditorInput());
                    if (projectMeta != null) {
                        driver.getName(),
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                connectionIcon = dataSource.getDriver().getIcon();
            connectionIcon = DBIcon.TREE_DATABASE;
                    @Override
        DBPProject activeProject = getActiveProject(dataSource, activeEditor);
        if (!(activeEditor instanceof IDataSourceContainerUpdate)) {
                    DBPDataSourceContainer fileDataSource = EditorUtils.getFileDataSource(curFile);
                }
    private static DBPProject getActiveProject(@Nullable DBPDataSourceContainer dataSource, @Nullable IEditorPart activeEditor) {
                return;
            for (Iterator<Map.Entry<DBPDriver, List<DBPDataSourceContainer>>> driverIter = driverMap.entrySet().iterator(); driverIter.hasNext(); ) {
        SelectDataSourceDialog dialog = new SelectDataSourceDialog(
                }
        element.setText(connectionName);
            try {
            if (!driverMap.isEmpty()) {
                        openDataSourceSelector(workbenchWindow, getActiveProject(curDataSource, activeEditor), curDataSource);
            Map<DBPDriver, List<DBPDataSourceContainer>> driverMap = new TreeMap<>(DBUtils.nameComparator());
            }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
            return;
                    activeEditor.setDataSourceContainer(newDataSource);
                    return newDataSource == curDataSource;
import org.eclipse.core.commands.ExecutionEvent;
        if (workbenchWindow != null && workbenchWindow.getActivePage() != null) {
    }
                }
        private Action createDataSourceChangeAction(IDataSourceContainerUpdate activeEditor, DBPDataSourceContainer curDataSource, DBPDataSourceContainer newDataSource, DBNDatabaseNode dsNode) {
                    for (DBPDataSourceContainer ds : de.getValue()) {
            } finally {
        }
import org.eclipse.swt.graphics.GC;
                }
import java.util.*;
            }
                DBNDatabaseNode dsNode = DBNUtils.getNodeByObject(ds);
    }
                    }
                @Override
import org.jkiss.dbeaver.registry.DataSourceRegistry;
                    menuItems.remove(menuItems.size() - 1);

                public void run() {
                }
        element.setIcon(DBeaverIcons.getImageDescriptor(connectionIcon));
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
                                (IDataSourceContainerUpdate) activeEditor, curDataSource, ds, null));
        if (dialog.open() == IDialogConstants.CANCEL_ID) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
            if (!(activeEditor instanceof IDataSourceContainerUpdate)) {
                    }
    private static final int MAX_MENU_ITEM_SIZE = 25;
            List<DBPDataSourceContainer> singleDataSources = new ArrayList<>();
            } else {
            }
            activeProject, dataSource);

            if (activeEditor != null) {
        }
            }
        } else {
            if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
                if (dsList.size() == 1) {
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
    public static void openDataSourceSelector(IWorkbenchWindow workbenchWindow, DBPProject activeProject, DBPDataSourceContainer dataSource) {
        IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
            List<? extends DBPDataSourceContainer> dataSources = getAvailableDataSources();
                    activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();

            if (dataSourceContainer != null) {
        }
            } else {
                        new ActionContributionItem(
public class SelectActiveDataSourceHandler extends AbstractDataSourceHandler implements IElementUpdater
    }
        ((IDataSourceContainerUpdate) activeEditor).setDataSourceContainer(newDataSource);

            final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
import org.jkiss.code.NotNull;

                    if (dsNode != null) {
import org.jkiss.dbeaver.model.app.DBPProject;
    public void updateElement(UIElement element, Map parameters) {
            List<? extends DBPDataSourceContainer> connectedDataSources = new ArrayList<>(dataSources);
                driverDS.add(ds);
        } else {
import org.eclipse.ui.commands.IElementUpdater;
                    }
                connectionIcon = dsNode.getNodeIcon();
                }
