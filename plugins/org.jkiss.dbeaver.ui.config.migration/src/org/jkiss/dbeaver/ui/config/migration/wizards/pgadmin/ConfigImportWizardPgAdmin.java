 *     http://www.apache.org/licenses/LICENSE-2.0
        super.addPages();

        return new ConfigImportWizardPagePgAdminConnections();
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizard;
    public void addPages() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override
        return pageSettings.getInputFile();
 * limitations under the License.
 */
 *
 * Unless required by applicable law or agreed to in writing, software

    }
package org.jkiss.dbeaver.ui.config.migration.wizards.pgadmin;
 * you may not use this file except in compliance with the License.
public class ConfigImportWizardPgAdmin extends ConfigImportWizard {
    public File getInputFile() {
 *

    @NotNull
        pageSettings = new ConfigImportWizardPagePgAdminSettings();


 * DBeaver - Universal Database Manager
}
    protected ConfigImportWizardPagePgAdminConnections createMainPage() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.File;
 *
        addPage(pageSettings);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private ConfigImportWizardPagePgAdminSettings pageSettings;

    @Override
/*
 * You may obtain a copy of the License at

    }
