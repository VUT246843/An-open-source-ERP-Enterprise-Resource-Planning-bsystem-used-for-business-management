 *
    public File getInputFile() {
    @Override
/*
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ConfigImportWizardToad extends ConfigImportWizard {
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
 *

        return pageFile.getInputFile();
    protected ConfigImportWizardPage createMainPage() {
    @Override
        addPage(pageFile);
 * DBeaver - Universal Database Manager
    }
    public void addPages() {
 * you may not use this file except in compliance with the License.

 *
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizard;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

 * You may obtain a copy of the License at

        super.addPages();
    private ConfigImportWizardPageToadFile pageFile;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.ext.oracle.ui.tools.toad;
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.io.File;
        pageFile = new ConfigImportWizardPageToadFile();
 * limitations under the License.
        return new ConfigImportWizardPageToadConnections();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

}
