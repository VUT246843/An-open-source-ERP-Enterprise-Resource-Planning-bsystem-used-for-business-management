        if (filePathText.getText().trim().isEmpty()) {
        filePathText.setText(getDefaultPathToFile());

}

 * Licensed under the Apache License, Version 2.0 (the "License");
    private TextWithOpenFile filePathText;
    @Override
public class ConfigImportWizardPageSqlWorkbenchSettings extends WizardPage {

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;

            setErrorMessage(null);
        if (!inputFile.exists()) {

        placeholder.setLayout(new GridLayout(1, true));
        setDescription(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_file_description);
    private String getDefaultPathToFile() {
        setTitle(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_name);
    public boolean isPageComplete() {
        filePathText.getTextControl().addModifyListener(e -> setInputFileAndUpdateButtons());
        setInputFileAndUpdateButtons();
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 * See the License for the specific language governing permissions and
        }
import org.eclipse.swt.layout.GridData;
    public void createControl(Composite parent) {
        if (RuntimeUtils.isWindows()) {
            setErrorMessage(NLS.bind(ImportConfigMessages.config_import_wizard_file_doesnt_exist_error, inputFile.getAbsolutePath()));
            getWizard().getContainer().updateButtons();
        Composite placeholder = new Composite(parent, SWT.NONE);
        inputFile = new File(filePathText.getText());


        return "";
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
 */

 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    @Override
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.wizard.WizardPage;
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
        } else {
        }

 *
    private void setInputFileAndUpdateButtons() {
import org.eclipse.swt.widgets.Composite;
            return;
    }
import java.io.File;
    }
 *
            return RuntimeUtils.getWorkingDirectory("MySQL\\Workbench\\connections.xml");
    public File getInputFile() {


 * Copyright (C) 2010-2025 DBeaver Corp and others
        return inputFile != null && inputFile.exists();
 * Unless required by applicable law or agreed to in writing, software
    private File inputFile;
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_custom_input_file);
 * You may obtain a copy of the License at
        super(ImportConfigMessages.config_import_wizard_custom_driver_settings);
    }
 * limitations under the License.
            new String[]{"*.xml"});
        setControl(placeholder);

        filePathText = new TextWithOpenFile(placeholder, ImportConfigMessages.config_import_wizard_custom_input_file_configuration,

package org.jkiss.dbeaver.ui.config.migration.wizards.sqlworkbench;
        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return inputFile;
    protected ConfigImportWizardPageSqlWorkbenchSettings() {
