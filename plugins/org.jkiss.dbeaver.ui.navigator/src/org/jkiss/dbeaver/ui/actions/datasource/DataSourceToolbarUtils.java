import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                String commandId = hi.getCommand().getElementId();
        ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
                        Object widget = element.getWidget();
        ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);


                UIUtils.getConnectionTypeColor(dataSourceContainer.getConnectionConfiguration().getConnectionType());
import org.eclipse.swt.graphics.Color;
        }
                                tbItem.setVisible(false);
                            }
                        }
            }
        }
import org.eclipse.e4.ui.model.application.ui.MUIElement;
    public static void refreshSelectorToolbar(IWorkbenchWindow window) {
            return null;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.jkiss.dbeaver.ui.UIUtils;
                if (CONNECTION_SELECTOR_TOOLBAR_ID.equals(element.getElementId())) {
import org.eclipse.ui.PlatformUI;

            DBPDataSourceContainer dataSourceContainer = null;
    public static void updateCommandsUI() {
                    }
        if (activeEditor == null) {
                            if (tbItem instanceof MHandledItem hi) {

    public static final String CONNECTION_SELECTOR_TOOLBAR_ID = "dbeaver-connection-selector";
 *
    public static void triggerRefreshReadonlyElement() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * You may obtain a copy of the License at
        if (commandService != null) {
                            }
public class DataSourceToolbarUtils {
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.rm.RMConstants;
    }
            return dscp.getDataSourceContainer();
                null :
 */
 * DBeaver - Universal Database Manager
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;
            commandService.refreshElements(ConnectionCommands.CMD_SELECT_SCHEMA, null);
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
                dataSourceContainer = dscp.getDataSourceContainer();
        updateCommandsUI();
import org.jkiss.dbeaver.model.struct.DBStructUtils;
                        if (widget instanceof Composite controlsPanel) {
        if (activeEditor instanceof DBPDataSourceContainerProvider dscp) {
                // support schema read or write
            Color bgColor = dataSourceContainer == null ?

                // Show schema selector only for active connections which
import org.jkiss.dbeaver.model.app.DBPProject;
import org.eclipse.ui.IWorkbenchWindow;
    }
import org.eclipse.ui.commands.ICommandService;

            boolean showSchemaSelector = false;
    }
            return null;
        }
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
                            }
                            for (Control cc : childControl) {
            DBPProject resourceProj = activeEditor == null ? null : EditorUtils.getFileProject(activeEditor.getEditorInput());
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
                        }
            //commandService.refreshElements("org.jkiss.dbeaver.ui.editors.sql.sync.connection", null);
                showSchemaSelector = DBStructUtils.isSchemasSupported(dataSourceContainer);
            for (MTrimElement element : topTrim.getChildren()) {
                            if (showConnectionSelector) {
    public static DBPDataSourceContainer getCurrentDataSource(IWorkbenchWindow workbenchWindow) {
            commandService.refreshElements(ConnectionCommands.CMD_READONLY, null);
        }

import org.eclipse.ui.IEditorPart;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (commandService != null) {
                                }
        // By some reason we can't locate the toolbar (#5712?). Let's just refresh elements then - its better than nothing
    }
                    return;
            IEditorPart activeEditor = window.getActivePage().getActiveEditor();
                            // So we need to hide/show it to force text update
        }
                            // Handle Eclipse bug. By default, it doesn't update contents of main toolbar elements
                                    tbItem.setVisible(showSchemaSelector);
            boolean showConnectionSelector = false;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
                            Control[] childControl = controlsPanel.getChildren();
                                    tbItem.setVisible(showConnectionSelector);
 * Unless required by applicable law or agreed to in writing, software
            if (activeEditor instanceof DBPDataSourceContainerProvider dscp) {
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
            }
 * you may not use this file except in compliance with the License.

                                } else {
            }
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        }
            MTrimBar topTrim = ((WorkbenchWindow) window).getTopTrim();
package org.jkiss.dbeaver.ui.actions.datasource;
                                if (ConnectionCommands.CMD_SELECT_SCHEMA.equals(commandId)) {
            if (dataSourceContainer != null && dataSourceContainer.isConnected()) {
 * See the License for the specific language governing permissions and
 *
            boolean canChangeConn = resourceProj == null || resourceProj.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}                                cc.setBackground(bgColor);
                                cc.setEnabled(showConnectionSelector && canChangeConn);
                    if (element instanceof MElementContainer<? extends MUIElement> container) {
                }
        if (window instanceof WorkbenchWindow && window.getActivePage() != null) {

/*
            commandService.refreshElements(ConnectionCommands.CMD_SELECT_CONNECTION, null);
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;


                        for (MUIElement tbItem : container.getChildren()) {

                showConnectionSelector = true;
import org.eclipse.swt.widgets.Control;
 *
