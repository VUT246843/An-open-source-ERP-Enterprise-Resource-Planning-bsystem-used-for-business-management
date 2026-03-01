        updatePageCompletion();

    }
    private Text inputFileText;
        super(wizard, PostgreMessages.tool_script_title_execute);
    PostgreScriptExecuteWizardPageSettings(PostgreScriptExecuteWizard wizard) {
        inputText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
package org.jkiss.dbeaver.ext.postgresql.tools;
 * DBeaver - Universal Database Manager

        Composite inputGroup = UIUtils.createTitledComposite(
        this.inputFileText = inputText.getTextControl();
}
 * you may not use this file except in compliance with the License.
 *
        super.saveState();
    @Override
        createSecurityGroup(extraGroup);

    protected void updateState() {
 * Unless required by applicable law or agreed to in writing, software
        PostgreUIUtils.addCompatibilityInfoLabelForForks(composite, wizard, null);
import org.jkiss.dbeaver.ext.postgresql.PostgreUIUtils;
 * See the License for the specific language governing permissions and
            PostgreMessages.tool_script_label_input_file,
            composite, PostgreMessages.tool_script_label_input, 3, GridData.FILL_HORIZONTAL);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }
        setControl(composite);
 *
        setTitle(PostgreMessages.tool_script_title_execute);
            true,
 * You may obtain a copy of the License at
        }
        Composite composite = UIUtils.createPlaceholder(parent, 1);


import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
        }
public class PostgreScriptExecuteWizardPageSettings extends PostgreToolWizardPageSettings<PostgreScriptExecuteWizard> {
import org.eclipse.swt.SWT;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.controls.TextWithOpenFileRemote;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Text;
        return super.determinePageCompletion();
    }
            SWT.OPEN | SWT.SINGLE,
 *

 * Copyright (C) 2010-2026 DBeaver Corp and others

        wizard.getSettings().setInputFile(inputFileText.getText());
        if (wizard.getSettings().getInputFile() == null) {

            new String[]{"*.sql", "*.txt", "*"},
        saveState();
 */
    @Override
            inputGroup,
    @Override
    }
        if (wizard.getSettings().getInputFile() != null) {
            setErrorMessage("Input file not specified");

        getContainer().updateButtons();
 * limitations under the License.

            getWizard().getProject());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

    public void saveState() {

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

    public void createControl(Composite parent) {
    protected boolean determinePageCompletion() {
        setDescription(PostgreMessages.tool_script_description_execute);
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
            inputFileText.setText(wizard.getSettings().getInputFile());
        TextWithOpenFile inputText = new TextWithOpenFileRemote(
            return false;
/*
        Composite extraGroup = UIUtils.createComposite(composite, 2);
