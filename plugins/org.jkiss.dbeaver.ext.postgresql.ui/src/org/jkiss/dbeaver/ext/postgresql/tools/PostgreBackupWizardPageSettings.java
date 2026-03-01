        settings.setNoPrivileges(noPrivilegesCheck.getSelection());

 * Licensed under the Apache License, Version 2.0 (the "License");
                updateState();
        return PostgreDatabaseBackupSettings.ExportFormat.values()[formatCombo.getSelectionIndex()];
    private Button dropObjects;
        super.saveState();
        String fileName = outputFolderText.getText();
            2
            PostgreMessages.wizard_backup_page_setting_group_setting,
import org.eclipse.swt.layout.GridData;
            settings.isCreateDatabase(),
            compressCombo.add(compStr);

        dropObjects.addSelectionListener(changeListener);
    public void createControl(Composite parent)
        createOutputFolderInput(outputGroup, settings);
            PostgreMessages.wizard_backup_page_setting_checkbox_use_insert_tip,
    {
import org.eclipse.swt.events.SelectionEvent;
            settings.isUseInserts(),
            @Override
        Composite extraGroup = UIUtils.createComposite(composite, 2);
    private Button noOwnerCheck;
        encodingCombo.setText(settings.getEncoding());
        settings.setCreateDatabase(createDatabase.getSelection());

                updateState();
        settings.setFormat(getChosenExportFormat());
            PostgreMessages.wizard_backup_page_setting_checkbox_no_privileges,
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;

        );
    {

    private PostgreBackupRestoreSettings.ExportFormat getChosenExportFormat() {
            public void widgetSelected(SelectionEvent e) {
        }
        setDescription(PostgreMessages.wizard_backup_page_setting_description);
 * You may obtain a copy of the License at
        useInsertsCheck = UIUtils.createCheckbox(formatGroup,
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        settings.setCompression(compressCombo.getText());
        );
    }
        useInsertsCheck.addSelectionListener(changeListener);
import org.jkiss.utils.CommonUtils;
        compressCombo.add("");
            PostgreMessages.wizard_backup_page_setting_checkbox_create_database,
        formatCombo.addSelectionListener(new SelectionAdapter() {
        UIUtils.createControlLabel(formatGroup, PostgreMessages.wizard_backup_page_setting_label_encoding);
        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );
            2
 */
        SelectionListener changeListener = new SelectionAdapter() {
        compressCombo = UIUtils.createLabelCombo(formatGroup, PostgreMessages.wizard_backup_page_setting_label_compression, SWT.DROP_DOWN | SWT.READ_ONLY);
            String compStr = String.valueOf(i);

        Composite formatGroup = UIUtils.createTitledComposite(
            PostgreMessages.wizard_backup_page_setting_group_output,
        settings.setOutputFilePattern(outputFileText.getText());

        encodingCombo.addSelectionListener(changeListener);
        settings.setOutputFolderPattern(CommonUtils.isEmpty(fileName) ? null : fileName);
        noOwnerCheck.addSelectionListener(changeListener);
        });
        );
                compressCombo.select(i);
 * See the License for the specific language governing permissions and
        createExtraArgsInput(outputGroup);
    private Button useInsertsCheck;
    private Combo compressCombo;
            composite,
        getContainer().updateButtons();
        if (compressCombo.getSelectionIndex() < 0) {
import org.eclipse.swt.widgets.Button;
    }
        compressCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            PostgreMessages.wizard_backup_page_setting_checkbox_no_privileges_tip,
            public void widgetSelected(SelectionEvent e) {
        settings.setUseInserts(useInsertsCheck.getSelection());

        settings.setNoOwner(noOwnerCheck.getSelection());

            2
import org.eclipse.swt.events.SelectionListener;

        formatCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));


import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;

        }
 *
            composite,
        	PostgreMessages.wizard_backup_page_setting_checkbox_use_insert,
        settings.setEncoding(encodingCombo.getText());
 * Unless required by applicable law or agreed to in writing, software
    }
        formatCombo = UIUtils.createLabelCombo(formatGroup, PostgreMessages.wizard_backup_page_setting_label_format, SWT.DROP_DOWN | SWT.READ_ONLY);
        compressCombo.addSelectionListener(changeListener);

            }

 * you may not use this file except in compliance with the License.
        return getChosenExportFormat().getExt();

class PostgreBackupWizardPageSettings extends PostgreToolWizardPageSettings<PostgreBackupWizard> {
 * distributed under the License is distributed on an "AS IS" BASIS,
            PostgreMessages.wizard_backup_page_setting_checkbox_drop_objects,
        PostgreDatabaseBackupSettings settings = wizard.getSettings();
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreBackupRestoreSettings;
            PostgreMessages.wizard_backup_page_setting_checkbox_create_database_tip,
        updatePageCompletion();
            PostgreMessages.wizard_backup_page_setting_checkbox_no_owner_tip,
        PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, null);
            settings.isDropObjects(),
        setTitle(PostgreMessages.wizard_backup_page_setting_title);
            if (compStr.equals(settings.getCompression())) {

    @Override

        for (int i = 0; i <= 9; i++) {
            GridData.FILL_HORIZONTAL
}

/*
            @Override
            settings.isNoPrivileges(),
        noOwnerCheck = UIUtils.createCheckbox(formatGroup,
import org.jkiss.dbeaver.ui.UIUtils;
            2

            2,
    }
    @Override
            PostgreMessages.wizard_backup_page_setting_checkbox_drop_objects_tip,
        noPrivilegesCheck = UIUtils.createCheckbox(formatGroup,
 *
                fixOutputFileExtension();

            }
    public void saveState() {
        Composite outputGroup = UIUtils.createTitledComposite(
package org.jkiss.dbeaver.ext.postgresql.tools;
            formatCombo.add(format.getTitle());
    @Override
    }
            compressCombo.select(0);
    {
import org.eclipse.swt.widgets.Combo;
        }

 * DBeaver - Universal Database Manager
            }
        createDatabase.addSelectionListener(changeListener);
    private Button createDatabase;
        settings.setDropObjects(dropObjects.getSelection());
        saveState();
        PostgreDatabaseBackupSettings settings = wizard.getSettings();
    protected void updateState()
    @Override
            settings.isNoOwner(),

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    private Button noPrivilegesCheck;
    }
        };
            2
        dropObjects = UIUtils.createCheckbox(formatGroup,
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupSettings;
import org.eclipse.swt.SWT;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected String getExtension() {
            2,
 *

        createDatabase = UIUtils.createCheckbox(formatGroup,
        formatCombo.select(settings.getFormat().ordinal());
            PostgreMessages.wizard_backup_page_setting_checkbox_no_owner,

        );
        encodingCombo = UIUtils.createEncodingCombo(formatGroup, null);
    PostgreBackupWizardPageSettings(PostgreBackupWizard wizard)
    private Combo encodingCombo;
        createSecurityGroup(extraGroup);
import org.eclipse.swt.events.SelectionAdapter;
            GridData.FILL_HORIZONTAL
        super(wizard, PostgreMessages.wizard_backup_page_setting_title_setting);
        );
        for (PostgreDatabaseBackupSettings.ExportFormat format : PostgreDatabaseBackupSettings.ExportFormat.values()) {
    private Combo formatCombo;
import org.eclipse.swt.widgets.Composite;

        setControl(composite);
        noPrivilegesCheck.addSelectionListener(changeListener);
