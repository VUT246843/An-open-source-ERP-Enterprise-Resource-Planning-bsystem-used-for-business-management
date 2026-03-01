    private TextWithOpenFile file;
    }
        Composite exportSettingsGroup = UIUtils.createTitledComposite(
        return new ConfigurationExportData(file.getText());
 * Copyright (C) 2010-2026 DBeaver Corp and others
            2,

 * DBeaver - Universal Database Manager

        setControl(composite);
import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            },
            SWT.SAVE | SWT.SINGLE, false
    }
    public ConfigurationExportData getExportData() {

            new String[]{
/*
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.tools.configuration;
import org.eclipse.swt.layout.GridData;
        );
 *
import org.jkiss.dbeaver.ui.UIUtils;


        setMessage(CoreMessages.dialog_workspace_export_wizard_start_message_configure_settings);
        file.getTextControl().addModifyListener(e -> updateState());
import org.jkiss.dbeaver.core.CoreMessages;
 * distributed under the License is distributed on an "AS IS" BASIS,
                "*.zip"
public class ConfigurationExportWizardPage extends WizardPage {
        file.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        getContainer().updateButtons();
import org.eclipse.jface.wizard.WizardPage;
            if (!CommonUtils.isEmpty(file.getText())) {
            CoreMessages.dialog_workspace_export_wizard_group,

        } catch (InvalidPathException exception) {
 * limitations under the License.

        setTitle(CoreMessages.dialog_workspace_export_wizard_page_title);

        Composite composite = UIUtils.createComposite(parent, 1);

        );
    private void updateState()
            }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.InvalidPathException;
        file = new TextWithOpenFile(exportSettingsGroup, CoreMessages.dialog_workspace_export_wizard_file_path_dialog,
 *
    {
import org.jkiss.code.NotNull;
    }
    @Override
 * You may obtain a copy of the License at
        return false;
                Path path = Path.of(file.getText());
        }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.controls.TextWithOpenFile;
    protected ConfigurationExportWizardPage() {
            composite,
            return false;
import org.eclipse.swt.SWT;
        try {
 */
import java.nio.file.Path;
    public boolean isPageComplete() {
    public void createControl(@NotNull Composite parent) {
    @Override
}
    }
            GridData.FILL_BOTH
        super(CoreMessages.dialog_workspace_export_wizard_page_name);
 * you may not use this file except in compliance with the License.
                return true;
        UIUtils.createControlLabel(exportSettingsGroup, CoreMessages.dialog_workspace_export_wizard_file_name);
        updateState();
 *
