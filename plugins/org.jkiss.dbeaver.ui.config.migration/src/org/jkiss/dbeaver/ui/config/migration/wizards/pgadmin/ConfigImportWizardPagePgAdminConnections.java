 * DBeaver - Universal Database Manager
 * limitations under the License.

    }
        try (Reader reader = Files.newBufferedReader(inputFile.toPath())) {
}
import java.io.Reader;
public class ConfigImportWizardPagePgAdminConnections extends ConfigImportWizardPage {
        setErrorMessage(null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.config.migration.wizards.pgadmin;
        setTitle(ImportConfigMessages.config_import_wizard_page_caption_connections);
import org.jkiss.code.NotNull;
        super(ImportConfigMessages.config_import_wizard_page_caption_connections);
        File inputFile = wizard.getInputFile();
import org.jkiss.dbeaver.Log;
        setDescription(ImportConfigMessages.config_import_wizard_header_import_configuration);
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;

 *
import org.jkiss.dbeaver.DBException;
/*
 * See the License for the specific language governing permissions and
            setErrorMessage(e.getMessage());

    private static final Log log = Log.getLog(ConfigImportWizardPagePgAdminConnections.class);
import java.io.File;
 */
    @Override
 * You may obtain a copy of the License at
    public ConfigImportWizardPagePgAdminConnections() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;

 * Unless required by applicable law or agreed to in writing, software
        }
    protected void loadConnections(@NotNull ImportData importData) throws DBException {

            IMPORT_CONFIGURATION_SERVICE.importJSON(importData, reader);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.file.Files;

    private static final PgAdminImportConfigurationService IMPORT_CONFIGURATION_SERVICE = PgAdminImportConfigurationService.INSTANCE;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
 *
 *
            log.warn("Exception during loading connections", e);
        ConfigImportWizardPgAdmin wizard = (ConfigImportWizardPgAdmin) getWizard();
        } catch (Exception e) {

