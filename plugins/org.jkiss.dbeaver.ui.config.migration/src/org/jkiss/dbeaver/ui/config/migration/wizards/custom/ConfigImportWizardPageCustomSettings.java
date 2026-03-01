 * Unless required by applicable law or agreed to in writing, software
            GridData.FILL_HORIZONTAL
import org.jkiss.dbeaver.ui.UIUtils;
    }
         * 
 *
    public void createControl(Composite parent) {
    {
 *
            2,
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridLayout;
    private TextWithOpenFile filePathText;
 * distributed under the License is distributed on an "AS IS" BASIS,
        );
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (!inputFile.exists()) {
        xmlButton.setSelection(true);

    {
            @Override
    }
                : ConfigImportWizardCustom.ImportType.XML;
        setControl(placeholder);
import org.eclipse.swt.widgets.Combo;
        csvButton.setText("CSV");
 *

        Composite typeGroup = UIUtils.createTitledComposite(
            {
        setTitle(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_name);
        return inputFile;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
        placeholder.setLayout(new GridLayout(1, true));
            }
import java.io.File;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;

 */

    }
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
         * xmlButton.addSelectionListener(typeListener);
 * Licensed under the Apache License, Version 2.0 (the "License");
            public void modifyText(ModifyEvent e)

    public File getInputFile()
    {
    protected ConfigImportWizardPageCustomSettings()

    public boolean isPageComplete()

            placeholder,
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_custom_input_file);
    public ConfigImportWizardCustom.ImportType getImportType()

 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
    {
import org.jkiss.dbeaver.utils.GeneralUtils;

                    setErrorMessage(NLS.bind(ImportConfigMessages.config_import_wizard_file_doesnt_exist_error, inputFile.getAbsolutePath()));
         * final SelectionAdapter typeListener = new SelectionAdapter() {
 * you may not use this file except in compliance with the License.
        });
        return encodingCombo.getText();
         * csvButton.addSelectionListener(typeListener);
        csvButton = new Button(typeGroup, SWT.RADIO);
 * limitations under the License.
    private Combo encodingCombo;
        setDescription(ImportConfigMessages.config_import_wizard_custom_driver_import_settings_file_format_description);
    }
import org.eclipse.jface.wizard.WizardPage;


/*

        return inputFile != null && inputFile.exists();
import org.eclipse.swt.widgets.Composite;
                    setErrorMessage(null);
         */
public class ConfigImportWizardPageCustomSettings extends WizardPage {
    }
import org.eclipse.swt.events.ModifyEvent;
        encodingCombo = UIUtils.createEncodingCombo(placeholder, GeneralUtils.DEFAULT_ENCODING);
        xmlButton.setText("XML");
 * You may obtain a copy of the License at
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_file_encoding);
        return csvButton.getSelection() ? ConfigImportWizardCustom.ImportType.CSV

    private Button xmlButton;
    private Button csvButton;
package org.jkiss.dbeaver.ui.config.migration.wizards.custom;
                new String[] { "*", "*.csv", "*.xml", "*.*" });
        super(ImportConfigMessages.config_import_wizard_custom_driver_settings);
import org.eclipse.swt.layout.GridData;
                inputFile = new File(filePathText.getText());
        xmlButton = new Button(typeGroup, SWT.RADIO);
                } else {
    @Override
    {
        filePathText.getTextControl().addModifyListener(new ModifyListener() {
    public String getInputFileEncoding()
    private File inputFile;
            ImportConfigMessages.config_import_wizard_custom_input_type,
import org.eclipse.swt.widgets.Button;

                }
         * @Override public void widgetSelected(SelectionEvent e) { boolean
}

                getWizard().getContainer().updateButtons();
        Composite placeholder = new Composite(parent, SWT.NONE);

        /*
         * isCSV = csvButton.getSelection(); } };
import org.eclipse.osgi.util.NLS;
    }
        filePathText = new TextWithOpenFile(placeholder, ImportConfigMessages.config_import_wizard_custom_input_file_configuration,
        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
