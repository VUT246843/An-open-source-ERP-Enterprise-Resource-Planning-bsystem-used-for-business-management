	
        addPage(pageSettings);
        return new ConfigImportWizardPageNavicatConnections();

	
	public File getInputFile() {
/*
	@Override
 *
	private ConfigImportWizardPageNavicatSettings pageSettings;
 * DBeaver - Universal Database Manager
    public void addPages() {
	
    protected ConfigImportWizardPageNavicatConnections createMainPage() {
	
    }
        return pageDriver.getSelectedDriver();
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizard;
        pageSettings = new ConfigImportWizardPageNavicatSettings();
	}
public class ConfigImportWizardNavicat extends ConfigImportWizard {
 * you may not use this file except in compliance with the License.

		return pageSettings;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.File;

    public String getInputFileEncoding() {

import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
        return pageSettings.getInputFileEncoding();
    }
	}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
	public ConfigImportWizardPageNavicatSettings getPageSettings() {
	
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
	
        return pageSettings.getInputFile();
 *
	@Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * limitations under the License.
}
	private ConfigImportWizardPageNavicatDriver pageDriver;

		return pageDriver;
	public DBPDriver getDriver() {
        addPage(pageDriver);
 */
		pageDriver = new ConfigImportWizardPageNavicatDriver();
 *
    }
        super.addPages();
	

 * Unless required by applicable law or agreed to in writing, software
	public ConfigImportWizardPageNavicatDriver getPageDriver() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.config.migration.wizards.navicat;
