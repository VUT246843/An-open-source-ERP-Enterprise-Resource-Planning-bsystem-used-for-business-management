    @Nullable
package org.jkiss.dbeaver.ui.actions.datasource;
public class DataSourceReadonlyHandler extends AbstractDataSourceHandler implements IElementUpdater {

        DataSourceDescriptor descriptor = container instanceof DataSourceDescriptor ? (DataSourceDescriptor) container : null;
        return null;
            if (page != null) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return null;
                    return (DBPDataSourceContainer) selectedObject;
            element.setChecked(false);
import java.util.Map;

    public void updateElement(@NotNull UIElement element, @Nullable Map parameters) {
            }
            }
        if (dataSourceContainer != null) {
import org.eclipse.ui.commands.IElementUpdater;
            element.setChecked(isReadonly);
                element.setTooltip(NLS.bind(CoreMessages.toolbar_checkbox_connection_readonly_tooltip, currentDescriptor.getName()));
        }
                        return dataSource.getContainer();
import org.jkiss.dbeaver.model.DBPDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                    return container;
            element.setIcon(DBeaverIcons.getImageDescriptor(DBIcon.TREE_UNLOCKED));
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            boolean isReadonly = currentDescriptor.isConnectionReadOnly();
        if (window != null) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.core.CoreMessages;
        final DataSourceDescriptor dataSourceContainer = currentDescriptor;
            if (dataSourceContainer.isConnected()) {
                dataSourceContainer.persistConfiguration();
            if (dataSourceContainer.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
        }
 *

                }
 * You may obtain a copy of the License at
            currentDescriptor = descriptor;
    @Nullable
                    DBPDataSource dataSource = selectedObject.getDataSource();
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static DBPDataSourceContainer getActiveDataSourceContainer(@NotNull IWorkbenchWindow window) {
            } else {
                    }
import org.eclipse.osgi.util.NLS;
                IWorkbenchPart activePart = page.getActivePart();
        } else {
            if (isReadonly) {
                element.setTooltip(NLS.bind(CoreMessages.toolbar_checkbox_connection_not_readonly_tooltip, currentDescriptor.getName()));
                DBPDataSourceContainer container = getDataSourceContainerFromPart(activePart);
                if (container != null) {
            dataSourceContainer.setConnectionReadOnly(!dataSourceContainer.isConnectionReadOnly());
        if (descriptor != currentDescriptor) {
            DataSourceToolbarUtils.triggerRefreshReadonlyElement();
    }
import org.eclipse.ui.IWorkbenchPart;
import org.jkiss.dbeaver.ui.UIIcon;
                DBSObject selectedObject = NavigatorUtils.getSelectedObject(selection);
            }
            if (selection != null) {
                DBPDataSource dataSource = dataSourceContainer.getDataSource();
 *
import org.eclipse.ui.IWorkbenchPage;
            element.setTooltip(CoreMessages.dialog_connection_wizard_final_checkbox_connection_readonly);
                    if (dataSource != null) {
import org.jkiss.code.Nullable;
                    dataSourceContainer.setConnectionReadOnly(!dataSourceContainer.isConnectionReadOnly());
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (dataSource != null && !DataSourceInvalidateHandler.invalidateDataSource(dataSource)) {
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;


            }
        DBPDataSourceContainer container = getActiveDataSourceContainer(element.getServiceLocator().getService(IWorkbenchWindow.class));
    }
import org.eclipse.ui.IWorkbenchWindow;
/*
            ISelection selection = window.getSelectionService().getSelection();
import org.eclipse.ui.menus.UIElement;
    @Override
import org.eclipse.core.commands.ExecutionEvent;
                }

    @Override
 */
                element.setIcon(DBeaverIcons.getImageDescriptor(DBIcon.TREE_UNLOCKED));

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.eclipse.jface.viewers.ISelection;
        }
 * you may not use this file except in compliance with the License.
                if (selectedObject instanceof DBPDataSourceContainer) {
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;

        if (currentDescriptor != null) {
            IWorkbenchPage page = window.getActivePage();
                }
import org.jkiss.dbeaver.model.rm.RMConstants;

import org.jkiss.dbeaver.model.DBIcon;
 * limitations under the License.
                element.setIcon(DBeaverIcons.getImageDescriptor(UIIcon.SQL_READONLY));
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
import org.eclipse.core.commands.ExecutionException;
}
    public Object execute(@Nullable ExecutionEvent event) throws ExecutionException {
                } else if (selectedObject != null) {
    }
    private DataSourceDescriptor currentDescriptor = null;
