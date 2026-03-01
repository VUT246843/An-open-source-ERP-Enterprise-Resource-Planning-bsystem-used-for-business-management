 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
            try (Reader reader = new InputStreamReader(is)) {

 * limitations under the License.
        try (InputStream is = new FileInputStream(inputFile)) {
import org.jkiss.code.NotNull;
        File inputFile = wizard.getInputFile();

    private static final Log log = Log.getLog(ConfigImportWizardPageSqlWorkbenchConnections.class);
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
        setErrorMessage(null);
package org.jkiss.dbeaver.ui.config.migration.wizards.sqlworkbench;
        } catch (Exception e) {
                sqlWorkbenchImportConfigurationService.importXML(importData, reader);

import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
/*
            log.warn("Exception during loading connections", e);
    protected ConfigImportWizardPageSqlWorkbenchConnections() {
    protected void loadConnections(@NotNull ImportData importData) throws DBException {
 *
public class ConfigImportWizardPageSqlWorkbenchConnections extends ConfigImportWizardPage {
 */
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    @Override
 * Unless required by applicable law or agreed to in writing, software

    }
        }
        setDescription(ImportConfigMessages.config_import_wizard_header_import_configuration);

        super(ImportConfigMessages.config_import_wizard_page_caption_connections);
import java.io.*;
        ConfigImportWizardSqlWorkbench wizard = (ConfigImportWizardSqlWorkbench) getWizard();
}
 * See the License for the specific language governing permissions and
            setErrorMessage(e.getMessage());
        setTitle(ImportConfigMessages.config_import_wizard_page_caption_connections);
            }

        SqlWorkbenchImportConfigurationService.INSTANCE;

    private final SqlWorkbenchImportConfigurationService sqlWorkbenchImportConfigurationService =
import org.jkiss.dbeaver.DBException;
