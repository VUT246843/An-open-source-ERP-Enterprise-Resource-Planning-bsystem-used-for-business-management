                parent,
                CommonUtils.notEmpty(view.getConfiguration().getDashboardName()));
    }
 * You may obtain a copy of the License at
            view.getConfiguration().setOpenConnectionOnActivate(connectOnActivationCheck.getSelection());
/*
            String dbName = dashboardNameText.getText();
    }
                throw new IOException("Empty dashboard name");
            dashboardIdText.setEnabled(false);
    {
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

            );
            Text dashboardIdText = UIUtils.createLabelText(viewGroup,
    public DashboardViewConfigDialog(Shell shell, DashboardViewer view) {
                viewGroup,
            connectOnActivationCheck = UIUtils.createCheckbox(
        }
            view.getConfiguration().setDashboardName(dbName);
import java.io.IOException;
        super.createButtonsForButtonBar(parent);
            );
                public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.widgets.Button;
            DBWorkbench.getPlatformUI().showError("Error saving dashboard view", null, e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
import org.jkiss.dbeaver.model.rm.RMConstants;


            }
                view.getConfiguration().isInitDefaultCharts(),
 * See the License for the specific language governing permissions and
import org.eclipse.jface.dialogs.IDialogSettings;
    private Text dashboardNameText;
                view.getConfiguration().isOpenConnectionOnActivate(),
                viewGroup,
    @NotNull
                    new DashboardManagerDialog(UIUtils.getActiveWorkbenchShell()).open();
    }

            separateConnectionCheck.setEnabled(false);*/
 *
            super.okPressed();
            initWithDefaultChartsCheck = UIUtils.createCheckbox(
import org.eclipse.osgi.util.NLS;
import org.jkiss.utils.CommonUtils;
        super(shell, NLS.bind(UIDashboardMessages.dialog_dashboard_view_config_title, view.getDataSourceContainer().getName()), null);
                UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_connect_tooltip,
    @Override
package org.jkiss.dbeaver.ui.dashboard.view;
                .addSelectionListener(new SelectionAdapter() {
}
import org.eclipse.swt.widgets.Text;
        try {
            });

import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_init_default,


import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        return parent;
public class DashboardViewConfigDialog extends BaseDialog {
    private Button connectOnActivationCheck;
 * Unless required by applicable law or agreed to in writing, software
    @Override
    private Button initWithDefaultChartsCheck;
                    }
    @Override


            ((GridData) managerButton.getLayoutData()).horizontalAlignment = GridData.BEGINNING;
 *
    protected void createButtonsForButtonBar(Composite parent) {
            separateConnectionCheck
                CommonUtils.notEmpty(view.getConfiguration().getDashboardId()));
                IDialogConstants.CANCEL_ID,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;
        }
    @Override

                }
        }
    }
    }
                2,
            // #4209 Dashboard: disable separate connection option (too aggressive)
import org.eclipse.swt.events.SelectionEvent;
            Composite viewGroup = UIUtils.createTitledComposite(

        Composite composite = super.createDialogArea(parent);
                        viewConfiguration.setUseSeparateConnection(((Button)e.widget).getSelection());
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
            ((GridData) managerButton.getLayoutData()).grabExcessHorizontalSpace = true;
                UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_connect,
        } catch (IOException e) {
                UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_init_default_tooltip,
                GridData.FILL_HORIZONTAL
    private final DashboardViewer view;
    {
            managerButton.addSelectionListener(new SelectionAdapter() {
 * you may not use this file except in compliance with the License.
                    @Override


 *
        if (DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
            view.getConfigurationList().saveConfiguration();
        return null;//UIUtils.getDialogSettings(DIALOG_ID);
                2);
                composite,
        this.view = view;

                "ID",
                UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg,
                    public void widgetSelected(SelectionEvent e) {

            if (CommonUtils.isEmpty(dbName)) {
import org.eclipse.swt.widgets.Shell;
    protected void okPressed() {
                UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_display_name,
            final Button managerButton = createButton(
            view.getConfiguration().setInitDefaultCharts(initWithDefaultChartsCheck.getSelection());
 * DBeaver - Universal Database Manager
                false
            dashboardNameText = UIUtils.createLabelText(viewGroup,
import org.eclipse.swt.layout.GridData;
            /*Button separateConnectionCheck = UIUtils.createCheckbox(viewGroup, UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_use_separate_conn, UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_use_separate_conn_tooltip, viewConfiguration.isUseSeparateConnection(), 2);
import org.jkiss.dbeaver.ui.UIUtils;


                });
import org.eclipse.swt.events.SelectionAdapter;
    protected IDialogSettings getDialogBoundsSettings()
                UIDashboardMessages.dialog_add_dashboard_button_manage,
 * limitations under the License.
        {
    protected Composite createDialogArea(@NotNull Composite parent)
 */
                2);
                @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
