                CoreMessages.dialog_connection_wizard_final_checkbox_show_system_objects_tip,
 * See the License for the specific language governing permissions and
                        mergeEntities.setEnabled(false);
package org.jkiss.dbeaver.ui.dialogs.connection;
            showSystemObjects = UIUtils.createCheckbox(
            boolean mergeEntitiesEnabled;
                }
    private Button showOnlyEntities;
                @Override
        super(shell, CoreMessages.dialog_connection_wizard_final_group_navigator, null);
            hideFolders = UIUtils.createCheckbox(
 */
import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.ui.UIUtils;
                CoreMessages.dialog_connection_wizard_final_checkbox_merge_entities_tip,
                public void widgetSelected(SelectionEvent e) {
    }
    protected Composite createDialogArea(@NotNull Composite parent) {
}
                CoreMessages.dialog_connection_wizard_final_checkbox_show_system_objects,
        navigatorSettings.setShowUtilityObjects(showUtilityObjects.getSelection());
import org.jkiss.dbeaver.core.CoreMessages;
            }
                navigatorSettings.isHideFolders(),
 *
    @Nullable
                GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
                navigatorSettings.isShowSystemObjects(),
                CoreMessages.dialog_connection_wizard_final_checkbox_show_only_entities,
import org.jkiss.code.NotNull;
        navigatorSettings.setMergeEntities(mergeEntities.getSelection());
                        if (mergeEntities.getSelection()) {
            Composite miscGroup = UIUtils.createTitledComposite(
            if (dataSourceDescriptor != null) {
                1);
                1);
    public DBNBrowseSettings getNavigatorSettings() {
    private Button mergeEntities;
                CoreMessages.dialog_connection_wizard_final_checkbox_show_util_objects_tip,

                miscGroup,
        return navigatorSettings;
            mergeEntities = UIUtils.createCheckbox(
                miscGroup,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                miscGroup,
                }
            }
                miscGroup,
    @Override
                1,
                1);
        this.navigatorSettings = new DataSourceNavigatorSettings(navigatorSettings);
                    if (hideFolders.getSelection()) {
                            hideFolders.setEnabled(true);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                    }



    }
                            hideFolders.setEnabled(false);
                mergeEntitiesEnabled = false;
                1);
 *
        return composite;
 * Unless required by applicable law or agreed to in writing, software

            hideFolders.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.layout.GridData;
                        }
 *
                navigatorSettings.isMergeEntities(),
            });
                navigatorSettings.isShowUtilityObjects(),
    @Override
        @NotNull DBNBrowseSettings navigatorSettings,
                mergeEntitiesEnabled = dataSourceDescriptor.getDriver().getProviderDescriptor().getTreeDescriptor().supportsEntityMerge();
    private Button hideFolders;
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
        navigatorSettings.setHideFolders(hideFolders.getSelection());
    private final DBPDataSourceContainer dataSourceDescriptor;
import org.eclipse.swt.widgets.Shell;
                composite,
    @NotNull

                miscGroup,


        {
            mergeEntities.addSelectionListener(new SelectionAdapter() {
        navigatorSettings.setShowOnlyEntities(showOnlyEntities.getSelection());
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

                hideFolders.setEnabled(false);
                mergeEntities.setEnabled(false);
            } else {
                        } else if (!hideFolders.getEnabled()) {
            if (hideFolders.getEnabled()) {
 * limitations under the License.
                CoreMessages.pref_page_ui_general_group_general,
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void okPressed() {
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettings;
                CoreMessages.dialog_connection_wizard_final_checkbox_hide_folders,
 * You may obtain a copy of the License at
                @Override
                CoreMessages.dialog_connection_wizard_final_checkbox_merge_entities,

    public EditConnectionNavigatorSettingsDialog(
 * Copyright (C) 2010-2026 DBeaver Corp and others


    }

/*
                CoreMessages.dialog_connection_wizard_final_checkbox_show_only_entities_tip,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * DBeaver - Universal Database Manager
    private final DataSourceNavigatorSettings navigatorSettings;

            showUtilityObjects = UIUtils.createCheckbox(
                navigatorSettings.isShowOnlyEntities(),
                CoreMessages.dialog_connection_wizard_final_checkbox_hide_folders_tip,
        this.dataSourceDescriptor = dataSourceDescriptor;
                CoreMessages.dialog_connection_wizard_final_checkbox_show_util_objects,

        Composite composite = super.createDialogArea(parent);
        super.okPressed();
    }
        @Nullable DBPDataSourceContainer dataSourceDescriptor) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            if (mergeEntities.getEnabled()) {
    private Button showSystemObjects;
import org.eclipse.swt.events.SelectionAdapter;
                public void widgetSelected(SelectionEvent e) {

        navigatorSettings.setShowSystemObjects(showSystemObjects.getSelection());
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.events.SelectionEvent;

public class EditConnectionNavigatorSettingsDialog extends BaseDialog {
                1);
import org.jkiss.code.Nullable;
                    if (hideFolders != null) {
                mergeEntities.setEnabled(mergeEntitiesEnabled);
                    } else if (mergeEntitiesEnabled) {
                        mergeEntities.setEnabled(true);
        @NotNull Shell shell,
            });
                    }
            showOnlyEntities = UIUtils.createCheckbox(
    private Button showUtilityObjects;
