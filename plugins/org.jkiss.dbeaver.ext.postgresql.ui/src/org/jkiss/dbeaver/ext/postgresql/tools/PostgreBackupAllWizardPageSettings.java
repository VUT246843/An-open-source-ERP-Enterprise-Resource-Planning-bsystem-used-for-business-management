 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            2
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_roles,
import org.eclipse.swt.events.SelectionListener;



            2

/*
 */
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.postgresql.tools;
 *

            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_roles_tip,

            2
        );
        updatePageCompletion();
        tablespacesOnly = UIUtils.createCheckbox(formatGroup,
            2
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_metadata_tip,
 * DBeaver - Universal Database Manager
        noPrivilegesCheck.addSelectionListener(changeListener);

            settings.isNoPrivileges(),
            GridData.FILL_HORIZONTAL);
        );
    private Button tablespacesOnly;
    protected void updateState() {
            composite,
        settings.setOutputFolderPattern(CommonUtils.isEmpty(fileName) ? null : fileName);
        addRolesPasswords = UIUtils.createCheckbox(formatGroup,
    public PostgreBackupAllWizardPageSettings(PostgreBackupAllWizard wizard) {
    public void saveState() {
        Composite outputGroup = UIUtils.createTitledComposite(
        settings.setNoPrivileges(noPrivilegesCheck.getSelection());

    private Button globalsOnly;
        metadataOnly = UIUtils.createCheckbox(formatGroup,
            settings.isExportOnlyMetadata(),
        noOwnerCheck.addSelectionListener(changeListener);
        );
        setControl(composite);
            PostgreMessages.wizard_backup_all_page_setting_title_setting,
            2
        getContainer().updateButtons();


        );
import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;
import org.eclipse.swt.widgets.Composite;
    }
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_tablespaces_tip,
        );
        addRolesPasswords.addSelectionListener(changeListener);
    private Button noOwnerCheck;
        settings.setExportOnlyMetadata(metadataOnly.getSelection());

        );
        createSecurityGroup(extraGroup);
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite formatGroup = UIUtils.createTitledComposite(
        UIUtils.createControlLabel(formatGroup, PostgreMessages.wizard_backup_all_page_setting_label_encoding);
 * Copyright (C) 2010-2026 DBeaver Corp and others

            2
}
            PostgreMessages.wizard_backup_all_page_setting_checkbox_add_passwords,
 *
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.UIUtils;
        settings.setOutputFilePattern(outputFileText.getText());
            2,
import org.eclipse.swt.widgets.Combo;
        noOwnerCheck = UIUtils.createCheckbox(formatGroup,

        SelectionListener changeListener = SelectionListener.widgetSelectedAdapter(e -> updateState());
        setDescription(PostgreMessages.wizard_backup_all_page_setting_title);
        settings.setNoOwner(noOwnerCheck.getSelection());
        globalsOnly.addSelectionListener(changeListener);
    }
        );
        settings.setExportOnlyGlobals(globalsOnly.getSelection());
        Composite composite = UIUtils.createPlaceholder(parent, 1);
            composite,
        Composite extraGroup = UIUtils.createComposite(composite, 2);

import org.eclipse.swt.layout.GridData;
        settings.setAddRolesPasswords(addRolesPasswords.getSelection());

            PostgreMessages.wizard_backup_page_setting_group_output,
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Button;
            PostgreMessages.wizard_backup_all_page_setting_checkbox_no_owner_tip,
        rolesOnly.addSelectionListener(changeListener);
    public void createControl(Composite parent) {
        PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, null);
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_tablespaces,
    @Override
    private Button rolesOnly;
        rolesOnly = UIUtils.createCheckbox(formatGroup,
        PostgreBackupAllSettings settings = wizard.getSettings();
    private Button addRolesPasswords;
    }
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        metadataOnly.addSelectionListener(changeListener);

            PostgreMessages.wizard_backup_all_page_setting_checkbox_no_privileges,
        encodingCombo.setText(settings.getEncoding());
        encodingCombo = UIUtils.createEncodingCombo(formatGroup, null);
            settings.isExportOnlyGlobals(),

    private Button metadataOnly;
            settings.isNoOwner(),
            2,
        super.saveState();
        settings.setExportOnlyTablespaces(tablespacesOnly.getSelection());
            PostgreMessages.wizard_backup_all_page_setting_checkbox_no_owner,
    private Combo encodingCombo;
    @Override
        globalsOnly = UIUtils.createCheckbox(formatGroup,
        settings.setEncoding(encodingCombo.getText());
        saveState();
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_global_tip,
            GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreBackupAllSettings;

        super(wizard, PostgreMessages.wizard_backup_all_page_setting_title_setting);
        encodingCombo.addSelectionListener(changeListener);
        String fileName = outputFolderText.getText();
        PostgreBackupAllSettings settings = wizard.getSettings();
 * limitations under the License.
        createExtraArgsInput(outputGroup);
            settings.isExportOnlyTablespaces(),
    }
            PostgreMessages.wizard_backup_all_page_setting_checkbox_no_privileges_tip,
            settings.isExportOnlyRoles(),
    private Button noPrivilegesCheck;

            2
 * Licensed under the Apache License, Version 2.0 (the "License");
        noPrivilegesCheck = UIUtils.createCheckbox(formatGroup,
        tablespacesOnly.addSelectionListener(changeListener);
        setTitle(PostgreMessages.wizard_backup_all_page_setting_title);
 * Unless required by applicable law or agreed to in writing, software
public class PostgreBackupAllWizardPageSettings extends PostgreToolWizardPageSettings<PostgreBackupAllWizard> {
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_metadata,
            PostgreMessages.wizard_backup_all_page_setting_checkbox_add_passwords_tip,
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        settings.setExportOnlyRoles(rolesOnly.getSelection());
        createOutputFolderInput(outputGroup, settings);
            PostgreMessages.wizard_backup_all_page_setting_checkbox_only_global,

    @Override
            settings.isAddRolesPasswords(),
