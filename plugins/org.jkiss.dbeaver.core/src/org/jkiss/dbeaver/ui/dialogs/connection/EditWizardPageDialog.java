    }
        this.wizard = wizard;
        super(wizard.getShell(), wizardPage.getTitle(), null);
    }
package org.jkiss.dbeaver.ui.dialogs.connection;
 *
    protected void okPressed() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void cancelPressed() {
 */
        super.cancelPressed();
 * Wizard page dialog
/*
        Composite dialogArea = super.createDialogArea(parent);
    private ConnectionWizard wizard;
}

        this.dataSource = dataSource;
    @Override
        this.page = wizardPage;
/**
 */
 * limitations under the License.
        page.deactivatePage();
 * You may obtain a copy of the License at
    }
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    protected EditWizardPageDialog(ConnectionWizard wizard, ConnectionWizardPage wizardPage, DataSourceDescriptor dataSource) {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    private DataSourceDescriptor dataSource;
    private ConnectionWizardPage page;
        page.setWizard(wizard);
        page.activatePage();
    protected Composite createDialogArea(Composite parent) {

public class EditWizardPageDialog extends BaseDialog {




import org.jkiss.dbeaver.registry.DataSourceDescriptor;
 *
        return dialogArea;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;
        super.okPressed();
 * Unless required by applicable law or agreed to in writing, software
    }
 * See the License for the specific language governing permissions and
        page.saveSettings(dataSource);
        page.createControl(dialogArea);
