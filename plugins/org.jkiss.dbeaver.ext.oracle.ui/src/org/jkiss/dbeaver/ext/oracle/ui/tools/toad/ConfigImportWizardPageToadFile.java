    }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        });
    }
            } else {

 * distributed under the License is distributed on an "AS IS" BASIS,

        setDescription("Import Toad connections");
            inputFile = new File(filePathText.getText());
            "Toad connections export file (.xml)",
package org.jkiss.dbeaver.ext.oracle.ui.tools.toad;
 * DBeaver - Universal Database Manager
        return inputFile;
    }
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
                setErrorMessage("File '" + inputFile.getAbsolutePath() + "' doesn't exist");

import org.eclipse.swt.widgets.Composite;
        setControl(placeholder);
 * limitations under the License.
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
        UIUtils.createControlLabel(placeholder, "Toad connections export file (.xml)");
import org.eclipse.swt.SWT;
        setTitle("Toad");
    public void createControl(Composite parent) {
    public File getInputFile() {
        return inputFile != null && inputFile.exists();
import org.eclipse.swt.layout.GridData;
}
 */
                setErrorMessage(null);
        filePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    }

 * See the License for the specific language governing permissions and
public class ConfigImportWizardPageToadFile extends WizardPage {

            getWizard().getContainer().updateButtons();
    protected ConfigImportWizardPageToadFile() {
 *

    private File inputFile;
            placeholder,
    @Override
    public boolean isPageComplete() {
 * Unless required by applicable law or agreed to in writing, software

/*

        placeholder.setLayout(new GridLayout(1, true));
            new String[]{"*.xml", "*"});
import java.io.File;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private TextWithOpenFile filePathText;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        super("Toad");
 * You may obtain a copy of the License at
    @Override
        filePathText = new TextWithOpenFile(
import org.eclipse.jface.wizard.WizardPage;
        Composite placeholder = new Composite(parent, SWT.NONE);
        filePathText.getTextControl().addModifyListener(e -> {
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.layout.GridLayout;
 *
            if (!inputFile.exists()) {
