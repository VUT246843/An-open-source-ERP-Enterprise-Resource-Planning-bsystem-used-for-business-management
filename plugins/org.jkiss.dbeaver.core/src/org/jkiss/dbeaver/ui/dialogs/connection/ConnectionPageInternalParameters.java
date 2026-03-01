 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
public class ConnectionPageInternalParameters extends ConnectionWizardPage {
        GridDataFactory.fillDefaults()
    }
        createParametersGroup(host);
        );
 */
        );
                return (String) element;

        Composite group = UIUtils.createTitledComposite(
 * DBeaver - Universal Database Manager

        createCustomPropertiesGroup(host);
            .applyTo(viewer.getControl());
    public void createControl(Composite parent) {

    public void saveSettings(@NotNull DBPDataSourceContainer dataSource) {
import org.eclipse.swt.SWT;

            CoreMessages.dialog_connection_internal_parameters_parameters_project_id,
            CoreMessages.dialog_connection_internal_parameters_custom,


import org.jkiss.code.NotNull;
            CoreMessages.dialog_connection_internal_parameters_tip,
            }
import org.jkiss.dbeaver.ui.ShellUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void createParametersGroup(@NotNull Composite parent) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
            SWT.NONE,
        });

        viewer.setInput(preferences.preferenceNames());
        UIUtils.createInfoLink(
        ((GridData) connectionIdText.getLayoutData()).horizontalSpan = 3;
            CoreMessages.dialog_connection_internal_parameters_parameters_driver_provider_id,
        driverIdText.setEditable(false);
            .hint(200, 100)
        );
            parent,
import org.jkiss.dbeaver.registry.DataSourcePreferenceStore;
            1,
        );
                return preferences.getString((String) element);
    }
        Text projectIdText = UIUtils.createLabelText(

 *

    }
 * limitations under the License.
import org.eclipse.jface.viewers.TableViewer;
        TableViewerColumn valueColumn = new TableViewerColumn(viewer, SWT.NONE);
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        connectionIdText.setEditable(false);
    public boolean isPageComplete() {
            group,
import org.eclipse.swt.widgets.Composite;
        ((GridData) projectIdText.getLayoutData()).horizontalSpan = 3;
        // Nothing to save

            group,
    }
        );
 *

        Text driverProviderIdText = UIUtils.createLabelText(
        setDescription(CoreMessages.dialog_connection_internal_parameters_description);
            group,
    }
        viewer.getTable().setHeaderVisible(true);
}

        );
        DBPDriver driver = dataSourceDescriptor.getDriver();

            group,


            CoreMessages.dialog_connection_internal_parameters_parameters_connection_id,
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        Composite group = UIUtils.createTitledComposite(
            300
            dataSourceDescriptor.getProject().getId()

import org.eclipse.jface.layout.GridLayoutFactory;
    }
import org.eclipse.jface.viewers.ColumnLabelProvider;
        return true;
    private void createCustomPropertiesGroup(@NotNull Composite parent) {
        UIUtils.asyncExec(() -> UIUtils.packColumns(viewer.getTable()));
            parent,
            @Override
            CoreMessages.dialog_connection_internal_parameters_parameters_driver_id,
            public String getText(Object element) {

        keyColumn.setLabelProvider(new ColumnLabelProvider() {
        valueColumn.setLabelProvider(new ColumnLabelProvider() {
            host,
/*
            dataSourceDescriptor.getId()
import org.jkiss.dbeaver.model.connection.DBPDriver;
    @Override
        keyColumn.getColumn().setText(CoreMessages.dialog_connection_internal_parameters_custom_key);
            GridData.FILL_BOTH
import org.eclipse.jface.layout.GridDataFactory;

            driver.getProviderId()
        projectIdText.setEditable(false);
        DataSourcePreferenceStore preferences = dataSourceDescriptor.getPreferenceStore();
        );
        initializeDialogUnits(parent);
            CoreMessages.dialog_connection_internal_parameters_parameters,
    @Override
        TableViewerColumn keyColumn = new TableViewerColumn(viewer, SWT.NONE);
    private final DataSourceDescriptor dataSourceDescriptor;
        driverProviderIdText.setEditable(false);

        TableViewer viewer = new TableViewer(group, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
package org.jkiss.dbeaver.ui.dialogs.connection;
        Text driverIdText = UIUtils.createLabelText(

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        Text connectionIdText = UIUtils.createLabelText(

        setControl(host);
            .grab(true, true)
        viewer.setContentProvider(new ArrayContentProvider());

import org.eclipse.swt.widgets.Text;
    ConnectionPageInternalParameters(@NotNull DataSourceDescriptor dataSourceDescriptor) {
import org.eclipse.swt.layout.GridData;
import org.eclipse.jface.viewers.ArrayContentProvider;
            @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.core.CoreMessages;
            1,
            }
import org.eclipse.jface.viewers.TableViewerColumn;
        host.setLayout(GridLayoutFactory.fillDefaults().create());
            public String getText(Object element) {
            driver.getId()
            GridData.FILL_HORIZONTAL
            () -> ShellUtils.launchProgram(HelpUtils.getHelpExternalReference("Admin-Manage-Preferences")),
        Composite host = new Composite(parent, SWT.NONE);
import org.jkiss.dbeaver.utils.HelpUtils;

        valueColumn.getColumn().setText(CoreMessages.dialog_connection_internal_parameters_custom_value);
        this.dataSourceDescriptor = dataSourceDescriptor;
        super(ConnectionPageInternalParameters.class.getSimpleName());
            4,

        setTitle(CoreMessages.dialog_connection_internal_parameters_title);

        });
