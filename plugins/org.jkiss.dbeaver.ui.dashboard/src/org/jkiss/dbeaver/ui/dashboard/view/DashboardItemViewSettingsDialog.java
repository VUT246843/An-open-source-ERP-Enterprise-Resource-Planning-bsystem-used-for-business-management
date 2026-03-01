    }
        dashboardContainer.getGroup().getView().saveChanges();
 * limitations under the License.
        DashboardRendererDescriptor renderer = DashboardUIRegistry.getInstance().getViewType(dashboardContainer.getItemDescriptor().getDashboardRenderer());
    public DashboardItemViewSettingsDialog(Shell shell, DashboardItemContainer dashboardContainer, DashboardConfiguration viewConfiguration) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

        if (itemViewSettingsEditor != null) {
            descriptionText.setLayoutData(gd);
    private static final boolean SHOW_QUERIES_BUTTON = false;
                            serviceSQL.openSQLViewer(
                GridData.FILL_HORIZONTAL
import org.jkiss.dbeaver.model.DBIcon;
                Button queriesButton = new Button(btnGroup, SWT.PUSH);
        super(shell, NLS.bind(UIDashboardMessages.dialog_dashboard_item_config_title, dashboardContainer.getItemDescriptor().getName()), null);
        }
    protected void okPressed() {
                    public void widgetSelected(SelectionEvent e) {
 *

        this.dashboardContainer = dashboardContainer;
        }
import org.eclipse.jface.dialogs.IDialogConstants;
 * you may not use this file except in compliance with the License.
    protected Composite createDialogArea(Composite parent)
import org.eclipse.swt.events.SelectionEvent;
            gd.widthHint = 200;
                        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
import org.eclipse.jface.dialogs.IDialogSettings;
            Composite configComposite = UIUtils.createComposite(composite, 1);

                queriesButton.setEnabled(dashboardContainer.getDataSourceContainer().isConnected());
                        StringBuilder sql = new StringBuilder();

 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
        }

        createButton(parent, IDialogConstants.CANCEL_ID, UIDashboardMessages.dialog_dashboard_item_config_buttons_configuration, false).addSelectionListener(new SelectionAdapter() {
                                UIDashboardMessages.dialog_dashboard_item_config_buttons_sqlqueries_dash,
/*
public class DashboardItemViewSettingsDialog extends BaseDialog {
                                false, false);
            @Override
    protected Control createContents(Composite parent) {
    private IObjectPropertyConfigurator<DashboardItemViewSettings, DashboardItemViewSettings> itemViewSettingsEditor;
                        }
            try {
            descriptionText.addModifyListener(e -> itemViewSettings.setDescription(descriptionText.getText()));
 *     http://www.apache.org/licenses/LICENSE-2.0
                queriesButton.setLayoutData(new GridData(GridData.END, GridData.BEGINNING, true, false));

                        }
import org.jkiss.dbeaver.ui.UIUtils;
            );
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
                                DBIcon.TREE_SCRIPT,

import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
        Composite composite = super.createDialogArea(parent);
}    }
                .setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));

            gd.heightHint = 50;
import org.eclipse.osgi.util.NLS;

                DBWorkbench.getPlatformUI().showError("Error creating configuration editor", null, e);
            }
package org.jkiss.dbeaver.ui.dashboard.view;
import org.eclipse.swt.events.SelectionAdapter;
            Text descriptionText = new Text(infoGroup, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
                editDialog.open();
import org.jkiss.dbeaver.model.DBUtils;
        return parent;
    }

        dashboardContainer.updateDashboardView();
        this.itemViewSettings = new DashboardItemViewSettings(dashboardContainer.getItemConfiguration());
    protected void createButtonsForButtonBar(Composite parent) {
        {
    {
            itemViewSettingsEditor.loadSettings(itemViewSettings);
            itemViewSettingsEditor.createControl(configComposite, itemViewSettings, () -> {});
            configComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
                        if (serviceSQL != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                            sql.append(query.getQueryText()).append(";\n");
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;

 * DBeaver - Universal Database Manager

    private final DashboardConfiguration viewConfiguration;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
        if (renderer != null) {
        super.okPressed();
                });
    private final DashboardItemViewSettings itemViewSettings;
            itemViewSettingsEditor.saveSettings(itemViewSettings);
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfiguration;

            public void widgetSelected(SelectionEvent e) {
                                DBUtils.getDefaultContext(dashboardContainer.getDataSourceContainer().getDataSource(), true),
 * See the License for the specific language governing permissions and
            UIUtils.createLabelText(infoGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardinfo_labels_name,
        });
    protected IDialogSettings getDialogBoundsSettings()
import org.eclipse.swt.layout.GridData;

        if (itemViewSettingsEditor != null) {


    }
                composite,
                4,
                    @Override
        return contents;
        Control contents = super.createContents(parent);
                itemViewSettingsEditor = renderer.createItemViewSettingsEditor();
        super.createButtonsForButtonBar(parent);
    @Override
                queriesButton.addSelectionListener(new SelectionAdapter() {
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        viewConfiguration.updateItemConfig(this.itemViewSettings);

        this.viewConfiguration = viewConfiguration;
                btnGroup.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 4, 1));
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
import org.eclipse.swt.SWT;
import org.jkiss.utils.CommonUtils;
                                sql.toString(),
                    }
 *
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;
import org.jkiss.dbeaver.ui.DBeaverIcons;
            if (SHOW_QUERIES_BUTTON) {
                        for (DashboardItemConfiguration.QueryMapping query : itemViewSettings.getItemConfiguration().getQueries()) {
                Composite btnGroup = UIUtils.createComposite(infoGroup, 1);
 */
            UIUtils.createControlLabel(infoGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardinfo_labels_description).setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    }

    {

                    itemViewSettings.getItemConfiguration().getName(), SWT.BORDER | SWT.READ_ONLY)
        }
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
            descriptionText.setText(CommonUtils.notEmpty(itemViewSettings.getDescription()));
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
            Composite infoGroup = UIUtils.createTitledComposite(
    @Override
                queriesButton.setText(UIDashboardMessages.dialog_dashboard_item_config_buttons_sqlqueries);
    private final DashboardItemContainer dashboardContainer;
            } catch (Exception e) {
 *
                UIDashboardMessages.dialog_dashboard_item_config_dashboardinfo,
                queriesButton.setImage(DBeaverIcons.getImage(DBIcon.TREE_SCRIPT));
                DashboardItemConfigurationDialog editDialog = new DashboardItemConfigurationDialog(getShell(), itemViewSettings.getItemConfiguration(), false);
        return null;//UIUtils.getDialogSettings(DIALOG_ID);
