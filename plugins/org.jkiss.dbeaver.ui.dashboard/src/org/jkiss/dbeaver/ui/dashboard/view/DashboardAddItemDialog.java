
            }
    }
import org.eclipse.swt.widgets.Button;
 * See the License for the specific language governing permissions and
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
            viewConfiguration.getProject(),
    @Override
/**
                new DashboardManagerDialog(UIUtils.getActiveWorkbenchShell()).open();
 * limitations under the License.
/*
            viewConfiguration.getDataSourceContainer(),
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardActivator;
    private static final String DIALOG_ID = "DBeaver.DashboardAddDialog";//$NON-NLS-1$
import org.jkiss.dbeaver.ui.dashboard.view.catalogpanel.DashboardCatalogPanel;
        managerButton.addSelectionListener(new SelectionAdapter() {
 * Unless required by applicable law or agreed to in writing, software
    public DashboardItemConfiguration getSelectedDashboard() {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

        final Button managerButton = createButton(parent, IDialogConstants.CANCEL_ID, UIDashboardMessages.dialog_add_dashboard_button_manage, false);

} *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    protected IDialogSettings getDialogBoundsSettings() {
                okPressed();
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
        createButton(parent, IDialogConstants.OK_ID, UIDashboardMessages.dialog_add_dashboard_button_add, true).setEnabled(false);
 */
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfiguration;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DashboardAddItemDialog extends BaseDialog {
        return catalogPanel.getSelectedDashboard();
        return UIUtils.getSettingsSection(UIDashboardActivator.getDefault().getDialogSettings(), DIALOG_ID);
            @Override
import org.eclipse.swt.widgets.Shell;
    @Override
    @Override

        ((GridData) managerButton.getLayoutData()).grabExcessHorizontalSpace = true;
    }
            public void widgetSelected(SelectionEvent e) {
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);

            false) {
    protected Composite createDialogArea(Composite parent) {

import org.eclipse.swt.events.SelectionAdapter;

package org.jkiss.dbeaver.ui.dashboard.view;
    private final DashboardConfiguration viewConfiguration;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            protected void handleChartSelectedFinal() {

            @Override
 * Dashboard add dialog

 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void createButtonsForButtonBar(Composite parent) {
    private DashboardCatalogPanel catalogPanel;
 * DBeaver - Universal Database Manager

        ((GridData) managerButton.getLayoutData()).horizontalAlignment = GridData.BEGINNING;
 *

    public DashboardAddItemDialog(Shell parentShell, DashboardConfiguration viewConfiguration) {
import org.eclipse.swt.widgets.Composite;
            protected void handleChartSelected() {

 * You may obtain a copy of the License at
        ((GridData)parent.getLayoutData()).grabExcessHorizontalSpace = true;
        catalogPanel = new DashboardCatalogPanel(
    }
 */
        });

            }
            item -> viewConfiguration.getItemConfig(item.getId()) != null,
            dialogArea,
import org.jkiss.dbeaver.ui.UIUtils;
        Composite dialogArea = super.createDialogArea(parent);

                enableButton(IDialogConstants.OK_ID, getSelectedDashboard() != null);
import org.eclipse.jface.dialogs.IDialogSettings;
        };
            }
            @Override
        super(parentShell, UIDashboardMessages.dialog_add_dashboard_dialog_title, null);

    }
 *
        return dialogArea;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.viewConfiguration = viewConfiguration;
