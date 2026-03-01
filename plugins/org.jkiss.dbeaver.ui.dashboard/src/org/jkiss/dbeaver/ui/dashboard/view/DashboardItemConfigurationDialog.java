
    private void updateButtons() {
import org.jkiss.utils.CommonUtils;
                CommonUtils.notEmpty(itemDescriptor.getDescription()),
package org.jkiss.dbeaver.ui.dashboard.view;
            itemConfigurationEditor = renderer.createItemConfigurationEditor();

            idText = UIUtils.createLabelText(infoGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_id, itemDescriptor.getId(), SWT.BORDER | baseStyle);
            displayNameText = UIUtils.createLabelText(infoGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_display_name, itemDescriptor.getDisplayName(), SWT.BORDER | baseStyle);
                GridData.FILL_HORIZONTAL
            );
                infoGroup,
 * You may obtain a copy of the License at
                idText.addModifyListener(e -> updateButtons());
        itemDescriptor.setId(idText.getText());
            descriptionText.addModifyListener(e -> updateButtons());
import org.eclipse.swt.layout.GridData;

        this.newItem = isNewItem;
    private Text displayNameText;
    private IObjectPropertyConfigurator<DashboardItemConfiguration, DashboardItemConfiguration> itemConfigurationEditor;
}import org.jkiss.dbeaver.runtime.DBWorkbench;
        Button okButton = getButton(IDialogConstants.OK_ID);
    private final DashboardItemConfiguration itemDescriptor;
        if (itemConfigurationEditor != null) {
        if (readOnly) {
 *
        }
    @Override
            );
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;


            nameText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));
        }
                    (itemConfigurationEditor == null || itemConfigurationEditor.isComplete())

 * Copyright (C) 2010-2026 DBeaver Corp and others
                UIDashboardMessages.dialog_edit_dashboard_maininfo,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            Composite configComposite = UIUtils.createTitledComposite(
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
            itemConfigurationEditor.saveSettings(itemDescriptor);

        itemDescriptor.setName(nameText.getText());
        return contents;
    }
public class DashboardItemConfigurationDialog extends BaseDialog {
        }
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
            );
        }
import org.eclipse.jface.dialogs.IDialogSettings;
        DashboardRegistry.getInstance().saveSettings();
        {
                composite,
            nameText.addModifyListener(e -> updateButtons());
    private Text idText;
 * DBeaver - Universal Database Manager
    {
 */
        } catch (Exception e) {
            itemConfigurationEditor.createControl(configComposite, itemDescriptor, this::updateButtons);
import org.eclipse.jface.dialogs.IDialogConstants;
    @Override
    protected IDialogSettings getDialogBoundsSettings()
        itemDescriptor.setDescription(descriptionText.getText());
                UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_description,
    protected Control createContents(Composite parent) {


        Control contents = super.createContents(parent);
            if (newItem) {
    protected Composite createDialogArea(Composite parent)
        if (okButton != null) {
        return null;//UIUtils.getDialogSettings(DIALOG_ID);

                idText.setEditable(false);
            UIUtils.createInfoLabel(composite, UIDashboardMessages.dialog_edit_dashboard_infolabels_predifined_dashboard);
        super.okPressed();
                GridData.FILL_HORIZONTAL


                composite,

            descriptionText = UIUtils.createLabelText(
 * limitations under the License.

    @Override

        }
    private void saveSettings() {
                4,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;
 * Unless required by applicable law or agreed to in writing, software
            DBWorkbench.getPlatformUI().showError("Error creating configuration editor", null, e);
            } else {

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        Composite composite = super.createDialogArea(parent);
            displayNameText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));
    {

            okButton.setEnabled(
                itemDescriptor.isCustom() &&
        return parent;
        try {
    @Override
        itemDescriptor.setDisplayName(displayNameText.getText());
                SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | baseStyle);
    }
    }
import org.eclipse.swt.SWT;
    protected void okPressed() {
        DashboardRendererDescriptor renderer = DashboardUIRegistry.getInstance().getViewType(itemDescriptor.getDashboardRenderer());
                    !idText.getText().isEmpty() &&
    private Text descriptionText;
            nameText = UIUtils.createLabelText(infoGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_name, itemDescriptor.getName(), SWT.BORDER | baseStyle);

            ((GridData) descriptionText.getLayoutData()).heightHint = 30;
        if (itemConfigurationEditor != null) {
        int baseStyle = !readOnly ? SWT.NONE : SWT.READ_ONLY;
    }
        super(shell, NLS.bind(UIDashboardMessages.dialog_edit_dashboard_title, itemDescriptor.getName()), null);
                UIDashboardMessages.dialog_dashboard_item_config_dashboardinfo,


    }
        }
    }

import org.jkiss.dbeaver.ui.UIUtils;
        boolean readOnly = !itemDescriptor.isCustom();
            ((GridData) descriptionText.getLayoutData()).widthHint = 300;
        updateButtons();
        this.itemDescriptor = itemDescriptor;

import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;

import org.eclipse.swt.widgets.*;
            Composite infoGroup = UIUtils.createTitledComposite(
import org.eclipse.osgi.util.NLS;
                    !nameText.getText().isEmpty() &&
    private Text nameText;
    }
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
 * you may not use this file except in compliance with the License.
 *
    public DashboardItemConfigurationDialog(Shell shell, DashboardItemConfiguration itemDescriptor, boolean isNewItem) {
        saveSettings();
/*
    private final boolean newItem;
 *

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            idText.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 3, 1));
                1,
            itemConfigurationEditor.loadSettings(itemDescriptor);
