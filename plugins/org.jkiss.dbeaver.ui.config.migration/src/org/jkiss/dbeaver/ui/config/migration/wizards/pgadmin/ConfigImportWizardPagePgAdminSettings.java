
        filePathText.getTextControl().addModifyListener(e -> setInputFileAndUpdateButtons());

    private void setInputFileAndUpdateButtons() {
import org.eclipse.osgi.util.NLS;
        if (filePathText.getText().isBlank()) {
    private TextWithOpenFile filePathText;
 * limitations under the License.
        setControl(placeholder);
        return inputFile != null && inputFile.exists();
import org.jkiss.code.NotNull;
        Composite placeholder = UIUtils.createPlaceholder(parent, 1);

        return inputFile;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            new String[]{"*.json"}
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void createControl(@NotNull Composite parent) {

    }
        }
    public File getInputFile() {
    public boolean isPageComplete() {
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 */

import org.eclipse.swt.layout.GridData;

 * distributed under the License is distributed on an "AS IS" BASIS,
        inputFile = new File(filePathText.getText());
import org.jkiss.dbeaver.ui.UIUtils;
        setInputFileAndUpdateButtons();
    }
    @Override
        setDescription(ImportConfigMessages.config_import_wizard_pgadmin_description);
            getWizard().getContainer().updateButtons();
            return;
 *
import org.eclipse.jface.wizard.WizardPage;
/*
    }
    @NotNull
    protected ConfigImportWizardPagePgAdminSettings() {

        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_custom_input_file);
            setErrorMessage(null);
 *
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
    private File inputFile;

 *

public class ConfigImportWizardPagePgAdminSettings extends WizardPage {
        } else {
        }
        if (!inputFile.exists()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.config.migration.wizards.pgadmin;
        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * You may obtain a copy of the License at
        filePathText = new TextWithOpenFile(
            placeholder,
        setTitle(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_name);
        super(ImportConfigMessages.config_import_wizard_custom_driver_settings);
            ImportConfigMessages.config_import_wizard_custom_input_file_configuration,
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
        );

}
 * you may not use this file except in compliance with the License.
import java.io.File;
            setErrorMessage(NLS.bind(ImportConfigMessages.config_import_wizard_file_doesnt_exist_error, inputFile.getAbsolutePath()));
import org.eclipse.swt.widgets.Composite;

