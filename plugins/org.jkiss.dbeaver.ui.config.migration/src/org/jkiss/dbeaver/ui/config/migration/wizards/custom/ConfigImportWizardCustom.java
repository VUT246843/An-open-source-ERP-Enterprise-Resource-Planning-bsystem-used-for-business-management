    @Override
        return pageSettings.getImportType();
 *

        return pageDriver.getSelectedDriver();
    public DBPDriver getDriver() {
        return pageSettings.getInputFileEncoding();
/*
import org.jkiss.dbeaver.model.connection.DBPDriver;
        super.addPages();
 * See the License for the specific language governing permissions and
    enum ImportType {
    public File getInputFile() {
    protected ConfigImportWizardPageCustomConnections createMainPage() {
    @Override
 */
        pageSettings = new ConfigImportWizardPageCustomSettings();
public class ConfigImportWizardCustom extends ConfigImportWizard {
    private ConfigImportWizardPageCustomSettings pageSettings;
 * limitations under the License.
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizard;
    }
        return new ConfigImportWizardPageCustomConnections();

}    public String getInputFileEncoding() {
    }
        pageDriver = new ConfigImportWizardPageCustomDriver();


    }
    }
    public ConfigImportWizardCustom.ImportType getImportType() {
 * Unless required by applicable law or agreed to in writing, software
 *
    public void addPages() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    private ConfigImportWizardPageCustomDriver pageDriver;
 *
 * You may obtain a copy of the License at
    }

package org.jkiss.dbeaver.ui.config.migration.wizards.custom;
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.File;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        addPage(pageSettings);

 * DBeaver - Universal Database Manager
        CSV,


        return pageSettings.getInputFile();



    }
        addPage(pageDriver);
        XML
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
