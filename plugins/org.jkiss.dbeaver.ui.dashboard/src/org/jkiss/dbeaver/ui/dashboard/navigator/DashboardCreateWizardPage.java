 * DBeaver - Universal Database Manager
        });

            updateState();
        super("New dashboard");
        setControl(configGroup);
    public String getDashboardId() {

        if (CommonUtils.isEmpty(dashboardId)) {
import org.jkiss.dbeaver.model.rm.RMConstants;
        final Text dashboardNameText = UIUtils.createLabelText(configGroup, "Name", null); //$NON-NLS-1$
 *
        if (project == null || !project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {

        setTitle("Create new dashboard" + (dataSourceContainer == null ? "" : " for '" + dataSourceContainer.getName() + "'"));
    public String getDashboardName() {
            if (oldId.equals(dashboardIdText.getText())) {
            updateState();
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.code.Nullable;
        initDefChartsCheck.addSelectionListener(new SelectionAdapter() {
    }
            @Override
    public boolean isInitDefCharts() {
    @Nullable
    @Override
    public void createControl(Composite parent) {
        Composite configGroup = UIUtils.createTitledComposite(parent, "Settings", 2, GridData.FILL_BOTH);

        return getErrorMessage() == null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;


 *
 * limitations under the License.
                initDefCharts = initDefChartsCheck.getSelection();
        dashboardIdText.addModifyListener(e -> {
            dashboardName = dashboardNameText.getText();
        }
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;

        }
        return dashboardName;
            2);
}
                dashboardIdText.setText(CommonUtils.notEmpty(CommonUtils.escapeIdentifier(dashboardName)).toLowerCase());
    private String dashboardId;
import org.eclipse.swt.layout.GridData;

class DashboardCreateWizardPage extends WizardPage {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
            public void widgetSelected(SelectionEvent e) {

            configGroup,
import org.jkiss.dbeaver.ui.UIUtils;
        setDescription("Specify dashboard properties");
        return initDefCharts;
    private boolean initDefCharts;

    public boolean isPageComplete() {
            setErrorMessage("Set dashboard ID");
        return dashboardId;
import org.eclipse.swt.events.SelectionEvent;
            String oldId = CommonUtils.notEmpty(CommonUtils.escapeIdentifier(dashboardName)).toLowerCase();
        });
        getContainer().updateButtons();
 * Unless required by applicable law or agreed to in writing, software

    protected DashboardCreateWizardPage(@Nullable DBPProject project, DBPDataSourceContainer dataSourceContainer) {
    }
        Button initDefChartsCheck = UIUtils.createCheckbox(
            dashboardId = dashboardIdText.getText();
import org.eclipse.jface.wizard.WizardPage;

        dashboardNameText.addModifyListener(e -> {

/*
        });
        }

            return false;
import org.eclipse.swt.widgets.Button;
        setErrorMessage(null);
            UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_init_default_tooltip,
    }
    }
    }
    }
            }
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    private String dashboardName;
        this.project = project;
            setErrorMessage("Set dashboard name");
            setErrorMessage("The user needs more permissions to create a new diagram.");
    private void updateState() {

 * See the License for the specific language governing permissions and
            }
    }

        final Text dashboardIdText = UIUtils.createLabelText(configGroup, "ID", null); //$NON-NLS-1$
import org.jkiss.dbeaver.model.app.DBPProject;
            true,
 *
import org.eclipse.swt.widgets.Text;

        if (CommonUtils.isEmpty(dashboardName)) {
    private DBPProject project;
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.ui.dashboard.navigator;

 */
            UIDashboardMessages.dialog_dashboard_view_config_group_viewcfg_checkbox_init_default,
