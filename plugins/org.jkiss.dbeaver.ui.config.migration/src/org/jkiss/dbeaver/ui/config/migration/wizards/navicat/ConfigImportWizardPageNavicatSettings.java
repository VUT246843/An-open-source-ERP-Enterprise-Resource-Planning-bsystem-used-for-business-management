	
        placeholder.setLayout(new GridLayout(1, true));
    {
            ImportConfigMessages.config_import_wizard_navicat_connection_export_file,
	private File inputFile;
                getWizard().getContainer().updateButtons();
 * limitations under the License.
	private TextWithOpenFile filePathText;
import java.io.File;
package org.jkiss.dbeaver.ui.config.migration.wizards.navicat;
 * you may not use this file except in compliance with the License.
                inputFile = new File(filePathText.getText());
	}
	@Override
	public File getInputFile() {
 *
import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.utils.GeneralUtils;
        });
import org.eclipse.swt.layout.GridData;
        
	
            placeholder,
            new String[] {"*.ncx"});
                    setErrorMessage(null);
 *

 */
        return inputFile != null && inputFile.exists();

	
    }
 * Unless required by applicable law or agreed to in writing, software
        setTitle(ImportConfigMessages.config_import_wizard_navicat_name);
import org.eclipse.swt.widgets.Combo;
public class ConfigImportWizardPageNavicatSettings extends WizardPage {
	public void createControl(Composite parent) {
                if (!inputFile.exists()) {
    }

import org.eclipse.swt.events.ModifyListener;
 * See the License for the specific language governing permissions and
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_navicat_connection_export_file);
        encodingCombo = UIUtils.createEncodingCombo(placeholder, GeneralUtils.DEFAULT_ENCODING);
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
import org.eclipse.swt.events.ModifyEvent;
    }
	private Combo encodingCombo;
		return inputFile;
import org.jkiss.dbeaver.ui.UIUtils;
        
	@Override
import org.eclipse.swt.SWT;
    public boolean isPageComplete() {
	}
        filePathText.getTextControl().addModifyListener(new ModifyListener() {
import org.eclipse.swt.layout.GridLayout;
}
 * distributed under the License is distributed on an "AS IS" BASIS,

	
        super(ImportConfigMessages.config_import_wizard_navicat_name);
	protected ConfigImportWizardPageNavicatSettings()
        setControl(placeholder);
import org.eclipse.jface.wizard.WizardPage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        

 * You may obtain a copy of the License at
            @Override
	
        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                    setErrorMessage(NLS.bind(ImportConfigMessages.config_import_wizard_file_doesnt_exist_error, inputFile.getAbsolutePath()));
            public void modifyText(ModifyEvent e) {
        return encodingCombo.getText();
 * Licensed under the Apache License, Version 2.0 (the "License");
        UIUtils.createControlLabel(placeholder, ImportConfigMessages.config_import_wizard_file_encoding);
	public String getInputFileEncoding() {
                }
                } else {
 * DBeaver - Universal Database Manager
        filePathText = new TextWithOpenFile(
        setDescription(ImportConfigMessages.config_import_wizard_navicat_description);
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
            }
import org.eclipse.swt.widgets.Composite;
/*
		Composite placeholder = new Composite(parent, SWT.NONE);
 * Copyright (C) 2010-2025 DBeaver Corp and others
