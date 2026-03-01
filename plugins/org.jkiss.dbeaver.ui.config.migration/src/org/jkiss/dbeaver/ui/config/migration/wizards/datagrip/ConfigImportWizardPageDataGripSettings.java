import org.eclipse.swt.events.SelectionAdapter;
            ImportConfigMessages.config_import_wizard_custom_input_file_configuration,
                    }

        for (Path path : configPaths) {
            setErrorMessage(NLS.bind(
                        filePathText.setText(file);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.config.migration.datagrip.api.DataGripDataSourceConfigXmlService;
        inputFile = Path.of(filePathText.getText());
            "Project folder",
                @Override
            placeholder,
            ));
            setErrorMessage(null);
/*
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (file != null) {
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
    private Combo filePathText;
package org.jkiss.dbeaver.ui.config.migration.wizards.datagrip;
        );
 */
            placeholder,
            filePathText.select(0);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    private void setInputFileAndUpdateButtons() {
        return inputFile;
                }

        filePathText.addModifyListener(e -> setInputFileAndUpdateButtons());
            new SelectionAdapter() {
        setTitle(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_name);
import java.nio.file.Path;
import java.util.List;
 *
        }
    DataGripDataSourceConfigXmlService dataGripDataSourceConfigXmlService = DataGripDataSourceConfigXmlServiceImpl.INSTANCE;
        return inputFile != null && Files.exists(inputFile);
 * DBeaver - Universal Database Manager
import java.nio.file.Files;
    private Path inputFile;
    }
    @Override
                ImportConfigMessages.config_import_wizard_file_doesnt_exist_error,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.SWT;

            }
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
import org.eclipse.jface.wizard.WizardPage;

    public void createControl(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.events.SelectionEvent;
                    String file = DialogUtils.openDirectoryDialog(getShell(), "JetBrains project directory", null);
}
        UIUtils.createPushButton(
    @Override
        }
                inputFile.toAbsolutePath().toString()
import org.eclipse.osgi.util.NLS;
    public boolean isPageComplete() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            UIIcon.OPEN,
    }
                public void widgetSelected(SelectionEvent e) {
 * See the License for the specific language governing permissions and
        }
        filePathText = UIUtils.createLabelCombo(
        );



    public Path getInputFile() {
            ImportConfigMessages.config_import_wizard_custom_input_file_configuration,
        Composite placeholder = UIUtils.createComposite(parent, 3);
        setControl(placeholder);

    }
            SWT.DROP_DOWN | SWT.BORDER
 * You may obtain a copy of the License at
        super(ImportConfigMessages.config_import_wizard_custom_driver_settings);
        if (!Files.exists(inputFile)) {

        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        List<Path> configPaths = dataGripDataSourceConfigXmlService.tryExtractRecentProjectPath();
import org.jkiss.dbeaver.ui.UIIcon;
        setInputFileAndUpdateButtons();
    public ConfigImportWizardPageDataGripSettings() {
        getWizard().getContainer().updateButtons();
        if (!configPaths.isEmpty()) {
            filePathText.add(path.toString());
 * limitations under the License.

import org.jkiss.dbeaver.ui.config.migration.datagrip.impl.DataGripDataSourceConfigXmlServiceImpl;


 *
 *
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
public class ConfigImportWizardPageDataGripSettings extends WizardPage {
        setDescription(ImportConfigMessages.config_import_wizard_jetbrains_description);
import org.eclipse.swt.widgets.Composite;
        } else {
