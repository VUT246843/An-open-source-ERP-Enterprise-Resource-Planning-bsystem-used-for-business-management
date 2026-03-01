            inputFileText.setText(wizard.getSettings().getInputFile());
        settings.setDataSourceContainer(selectedConnections.isEmpty() ? null : selectedConnections.get(0).getDataSource().getContainer());
 * You may obtain a copy of the License at
            setErrorMessage("Input file not specified");
        List<DBSObject> selectedConnections = settings.getDatabaseObjects();
    @Override
    @Override
package org.jkiss.dbeaver.ext.oracle.ui.tools;
            3,
    }
            new String[] { "*.sql", "*.txt", "*" },
    public void deactivatePage() {
        if (wizard.getSettings().getInputFile() == null) {
    @Override
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            SWT.OPEN | SWT.SINGLE,
        settings.setInputFile(inputFileText.getText());
    }
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
            OracleUIMessages.tools_script_execute_wizard_page_settings_label_input_file,

    public void createControl(Composite parent) {
 *
class OracleScriptExecuteWizardPageSettings extends AbstractNativeToolWizardPage<OracleScriptExecuteWizard> {


 * Unless required by applicable law or agreed to in writing, software
    public void saveState() {
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;
        OracleScriptExecuteSettings settings = wizard.getSettings();

        super(wizard, OracleUIMessages.tools_script_execute_wizard_page_settings_page_name);
 *
    }
    OracleScriptExecuteWizardPageSettings(OracleScriptExecuteWizard wizard) {
    @Override
            outputGroup,

import org.eclipse.swt.layout.GridData;
        super.deactivatePage();
            composite,
        if (wizard.getSettings().getInputFile() != null) {
        );
import org.jkiss.dbeaver.ui.UIUtils;
        saveState();
            return false;
        inputFileText = new TextWithOpenFileRemote(
        }
        }
 * limitations under the License.


    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.SWT;
    protected void updateState() {
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizardPage;
import java.util.List;
            getWizard().getProject());
    public void activatePage() {

 * See the License for the specific language governing permissions and
}
    protected boolean determinePageCompletion() {
        updateState();
 * distributed under the License is distributed on an "AS IS" BASIS,

        super.saveState();
        //updateState();
        inputFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            GridData.FILL_HORIZONTAL


/*
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
    }
    private TextWithOpenFile inputFileText;
        Composite outputGroup = UIUtils.createTitledComposite(
        saveState();
        return super.determinePageCompletion();

import org.jkiss.dbeaver.ui.controls.TextWithOpenFileRemote;
        Composite composite = UIUtils.createPlaceholder(parent, 1);
 * you may not use this file except in compliance with the License.
            false,


 */

    }
        getContainer().updateButtons();
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.oracle.tasks.OracleScriptExecuteSettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setTitle(OracleUIMessages.tools_script_execute_wizard_page_settings_page_name);
import org.eclipse.swt.widgets.Composite;
        setDescription(OracleUIMessages.tools_script_execute_wizard_page_settings_page_description);
        outputGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            OracleUIMessages.tools_script_execute_wizard_page_settings_group_input,
        setControl(composite);


