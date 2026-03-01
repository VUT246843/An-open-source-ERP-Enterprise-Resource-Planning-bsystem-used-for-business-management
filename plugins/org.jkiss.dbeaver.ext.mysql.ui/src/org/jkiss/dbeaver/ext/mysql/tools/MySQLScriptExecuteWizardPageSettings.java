
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
        //updateState();
import org.eclipse.swt.events.SelectionEvent;
 */
            MySQLUIMessages.tools_script_execute_wizard_page_settings_group_settings,
    }
            settingsGroup, MySQLUIMessages.tools_script_execute_wizard_page_settings_label_log_level, SWT.DROP_DOWN | SWT.READ_ONLY);
    }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

        Composite extraGroup = UIUtils.createComposite(composite, 2);
            MySQLUIMessages.tools_script_execute_wizard_page_settings_script_configuration);
        createExtraArgsInput(settingsGroup);
import org.jkiss.dbeaver.ui.UIUtils;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.TextWithOpenFileRemote;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            SWT.OPEN | SWT.SINGLE,
 *
    }
        settings.setInputFile(fileName);
            return false;
            outputGroup,
    public void createControl(Composite parent) {
        for (MySQLScriptExecuteSettings.LogLevel logLevel : MySQLScriptExecuteSettings.LogLevel.values()) {
        String fileName = inputFileText.getText();
        }
        settings.setIsForeignKeyCheckDisabled(disableForeignKeyChecks.getSelection());

    private Combo logLevelCombo;
        }
    }
            MySQLUIMessages.tools_script_execute_wizard_page_settings_set_db_import_settings :
    @Override
 * Unless required by applicable law or agreed to in writing, software
            }

            settingsGroup,
        logLevelCombo.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.app.DBPProject;
            @Override
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            MySQLUIMessages.tools_script_execute_wizard_page_settings_script_configuration);
        settingsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return super.determinePageCompletion();
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        );
        setDescription(wizard.isImport() ?
            false,
        DBPProject project = getWizard().getProject();
    @Override



/*
            public void widgetSelected(SelectionEvent e) {
            new String[]{"*.sql", "*.txt", "*"},
        saveState();
import org.eclipse.swt.events.SelectionAdapter;
        }
            MySQLUIMessages.tools_script_execute_wizard_page_settings_checkbox_disable_foreign_key_checks,
import org.eclipse.swt.widgets.Combo;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private Button disableForeignKeyChecks;
        );
        Composite settingsGroup = UIUtils.createTitledComposite(


            logLevelCombo.add(logLevel.name());
        inputText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        settings.setLogLevel(CommonUtils.valueOf(MySQLScriptExecuteSettings.LogLevel.class, logLevelCombo.getText()));
package org.jkiss.dbeaver.ext.mysql.tools;
            inputFileText.setText(wizard.getSettings().getInputFile());

        Composite outputGroup = UIUtils.createTitledComposite(

            setErrorMessage("Input file not specified");
        super.saveState();
        updatePageCompletion();
            MySQLUIMessages.tools_script_execute_wizard_page_settings_import_configuration :
            MySQLUIMessages.tools_script_execute_wizard_page_settings_label_input_file,
        if (wizard.getSettings().getInputFile() == null) {

        super(wizard, wizard.isImport() ?
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
    public void saveState() {
        setTitle(wizard.isImport() ?

            2,
            composite, MySQLUIMessages.tools_script_execute_wizard_page_settings_group_input, 3, GridData.FILL_HORIZONTAL);
import org.eclipse.swt.widgets.Text;

        inputFileText = inputText.getTextControl();
            true,
 * Copyright (C) 2010-2026 DBeaver Corp and others

        createSecurityGroup(extraGroup);
            project);
            GridData.HORIZONTAL_ALIGN_BEGINNING
        TextWithOpenFile inputText = new TextWithOpenFileRemote(
}
    protected boolean determinePageCompletion() {
    MySQLScriptExecuteWizardPageSettings(MySQLScriptExecuteWizard wizard) {
            MySQLUIMessages.tools_script_execute_wizard_page_settings_checkbox_disable_foreign_key_checks_tooltip,
public class MySQLScriptExecuteWizardPageSettings extends MySQLWizardPageSettings<MySQLScriptExecuteWizard> {
        logLevelCombo = UIUtils.createLabelCombo(

        MySQLScriptExecuteSettings settings = wizard.getSettings();
            MySQLUIMessages.tools_script_execute_wizard_page_settings_import_configuration :
    private Text inputFileText;
 * limitations under the License.
            2
            composite,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
        disableForeignKeyChecks = UIUtils.createCheckbox(
        logLevelCombo.select(wizard.getLogLevel().ordinal());
            MySQLUIMessages.tools_script_execute_wizard_page_settings_set_script_execution_settings);
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Composite;
        if (wizard.getSettings().getInputFile() != null) {
        setControl(composite);
 *
        });

    protected void updateState() {
    @Override
                wizard.getSettings().setLogLevel(CommonUtils.valueOf(MySQLScriptExecuteSettings.LogLevel.class, logLevelCombo.getText()));
import org.jkiss.dbeaver.ext.mysql.tasks.MySQLScriptExecuteSettings;
 *
