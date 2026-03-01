            PostgreMessages.wizard_restore_page_setting_label_setting,

    private TextWithOpenFile inputFileText;

    PostgreRestoreWizardPageSettings(PostgreRestoreWizard wizard)
        setTitle(PostgreMessages.wizard_restore_page_setting_title);
            GridData.FILL_HORIZONTAL

        updatePageCompletion();
        Listener updateListener = event -> updateState();


/*
            2,

    private Combo formatCombo;
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseRestoreSettings;


        inputFileText = new TextWithOpenFileRemote(
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;

        super(wizard, PostgreMessages.wizard_restore_page_setting_title_setting);
import org.eclipse.swt.events.SelectionEvent;
            PostgreMessages.wizard_restore_page_setting_label_choose_backup_file,

            return false;
            inputGroup,
import org.eclipse.swt.layout.GridData;
            }
            2
            settings.isCreateDatabase(),
                PostgreMessages.wizard_restore_page_setting_confirm_dialog_title,
            composite,
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;

            PostgreMessages.wizard_restore_page_setting_btn_clean_first_tip,
        Composite extraGroup = UIUtils.createComposite(composite, 2);
import org.jkiss.dbeaver.ext.postgresql.tasks.PostgreDatabaseBackupSettings;
    public void saveState()
 *     http://www.apache.org/licenses/LICENSE-2.0

            settings.isNoOwner(),
        inputFileText.setOpenFolder(wizard.getSettings().getFormat() == PostgreDatabaseBackupSettings.ExportFormat.DIRECTORY);
    }
            GridData.FILL_HORIZONTAL
 *
        cleanFirstButton.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.events.SelectionAdapter;
    protected boolean determinePageCompletion() {
        );
        );
                shell,

 * See the License for the specific language governing permissions and
        for (PostgreDatabaseBackupSettings.ExportFormat format : PostgreDatabaseBackupSettings.ExportFormat.values()) {
        settings.setFormat(PostgreDatabaseBackupSettings.ExportFormat.values()[formatCombo.getSelectionIndex()]);
        }
            PostgreMessages.wizard_backup_page_setting_checkbox_restore_create_database,
 * DBeaver - Universal Database Manager
        UIUtils.createControlLabel(inputGroup, PostgreMessages.wizard_restore_page_setting_label_backup_file);
        settings.setInputFile(inputFileText.getText());


 * limitations under the License.
        formatCombo = UIUtils.createLabelCombo(formatGroup, PostgreMessages.wizard_restore_page_setting_label_format, SWT.DROP_DOWN | SWT.READ_ONLY);
 *
        PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, null);
        }
        getContainer().updateButtons();
        inputFileText.getTextControl().addListener(SWT.Modify, updateListener);
import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;
        Composite inputGroup = UIUtils.createTitledComposite(
    private Button cleanFirstButton;
        setControl(composite);

                if (cleanFirstButton.getSelection() && !confirmDropDatabaseAction()) {
            formatCombo.add(format.getTitle());
            SWT.OPEN | SWT.SINGLE,
 *
    protected void updateState() {
        setDescription(PostgreMessages.wizard_restore_page_setting_description);
            return false;
    private boolean confirmDropDatabaseAction() {
    }
}
        createSecurityGroup(extraGroup);
    private Button createDatabase;
        Composite formatGroup = UIUtils.createTitledComposite(
    @Override
            PostgreMessages.wizard_backup_page_setting_checkbox_restore_create_database_tip,
        PostgreDatabaseRestoreSettings settings = wizard.getSettings();
            );
        settings.setCleanFirst(cleanFirstButton.getSelection());
 */
        Shell shell = getContainer().getShell();
            composite,
        return false;
    @Override
        settings.setCreateDatabase(createDatabase.getSelection());
        noOwnerCheck.addListener(SWT.Selection, updateListener);
        );
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.SWT;
package org.jkiss.dbeaver.ext.postgresql.tools;
        formatCombo.select(settings.getFormat().ordinal());
        createDatabase = UIUtils.createCheckbox(formatGroup,
 * Licensed under the Apache License, Version 2.0 (the "License");
        createExtraArgsInput(inputGroup);
    }
            PostgreMessages.wizard_backup_page_setting_checkbox_no_owner,
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        );
        });
        cleanFirstButton = UIUtils.createCheckbox(formatGroup,
        	PostgreMessages.wizard_restore_page_setting_btn_clean_first,
        formatCombo.addListener(SWT.Selection, updateListener);
    private Button noOwnerCheck;
            @Override
    {
        PostgreDatabaseRestoreSettings settings = wizard.getSettings();
        noOwnerCheck = UIUtils.createCheckbox(formatGroup,
        saveState();
            setErrorMessage("Input file not specified");
                DBIcon.STATUS_WARNING
            return UIUtils.confirmAction(
import org.jkiss.dbeaver.ui.controls.TextWithOpenFileRemote;

            public void widgetSelected(SelectionEvent e) {
 * You may obtain a copy of the License at
        }
        formatCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            PostgreMessages.wizard_restore_page_setting_label_input,
                }
 * Unless required by applicable law or agreed to in writing, software
        settings.setNoOwner(noOwnerCheck.getSelection());
    @Override

            PostgreMessages.wizard_backup_page_setting_checkbox_restore_no_owner_tip,
    }
            2
        if (wizard.getSettings().getInputFile() == null) {

    }
import org.jkiss.dbeaver.model.DBIcon;

            2,
            true,
        inputFileText.setText(settings.getInputFile());
            settings.isCleanFirst(),
        return super.determinePageCompletion();
            2
import org.jkiss.dbeaver.ui.UIUtils;
    {
            new String[] {"*.backup","*.sql","*"},
            getWizard().getProject());
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    cleanFirstButton.setSelection(false);
    public void createControl(Composite parent)
        );
        cleanFirstButton.addListener(SWT.Selection, updateListener);
class PostgreRestoreWizardPageSettings extends PostgreToolWizardPageSettings<PostgreRestoreWizard> {
        if (shell == null) {
    {
    }
                PostgreMessages.wizard_restore_page_setting_confirm_dialog_message,

        if (shell.isVisible() || wizard.getSettings().isCleanFirst()) {
        inputFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        createDatabase.addListener(SWT.Selection, updateListener);
