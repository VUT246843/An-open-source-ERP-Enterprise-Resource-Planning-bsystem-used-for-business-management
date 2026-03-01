    private ConfigImportWizardPageDataGripSettings pageSettings;
 *     http://www.apache.org/licenses/LICENSE-2.0

    protected ConfigImportWizardPageDataGripConnections createMainPage() {
package org.jkiss.dbeaver.ui.config.migration.wizards.datagrip;
        pageSettings = new ConfigImportWizardPageDataGripSettings();
 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


 * you may not use this file except in compliance with the License.
    public Path getInputFile() {
}    }
 *


 * See the License for the specific language governing permissions and
        return new ConfigImportWizardPageDataGripConnections();
        super.addPages();
 */
    @Override
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.nio.file.Path;
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizard;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    }
        addPage(pageSettings);

/*
    @Override
 * Unless required by applicable law or agreed to in writing, software


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void addPages() {


 * limitations under the License.
public class ConfigImportWizardDataGrip extends ConfigImportWizard {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return pageSettings.getInputFile();
