 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.core.CoreMessages;
        );
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
    public boolean isPageComplete() {
    }
import org.eclipse.swt.widgets.Composite;
 *
public class ConfigurationImportWizardPage extends WizardPage {

            CoreMessages.dialog_workspace_import_wizard_group,
        file.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
/*
package org.jkiss.dbeaver.tools.configuration;
             return false;
import org.eclipse.jface.wizard.WizardPage;
        file = new TextWithOpenFile(importSettingsGroup, CoreMessages.dialog_workspace_import_wizard_file_select_title,

        }
        setControl(composite);
            composite,
    public ConfigurationImportWizardPage() {
    public ConfigurationImportData getConfigurationImportData() {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite importSettingsGroup = UIUtils.createTitledComposite(

    public void createControl(Composite parent) {
    private TextWithOpen file;
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        file.getTextControl().addModifyListener(e -> getContainer().updateButtons());
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        UIUtils.createControlLabel(importSettingsGroup, CoreMessages.dialog_workspace_import_wizard_file_select_name);
        return new ConfigurationImportData(file.getTextControl().getText());

            2,
 *
    }
            return !file.getText().isEmpty() && Path.of(file.getText()).toFile().exists() && file.getText().endsWith(
 *
                ".zip");
 * DBeaver - Universal Database Manager
            GridData.FILL_BOTH
        setTitle(CoreMessages.dialog_workspace_import_wizard_title);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
 */
        setMessage(CoreMessages.dialog_workspace_import_wizard_start_message_configure_settings);
        super(CoreMessages.dialog_workspace_import_wizard_name);
import java.nio.file.Path;
        Composite composite = UIUtils.createComposite(parent, 1);
 * You may obtain a copy of the License at
        } catch (Exception exception) {
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
            new String[]{"*.zip"});
    }
import org.jkiss.dbeaver.ui.controls.TextWithOpen;
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.layout.GridData;
    }


