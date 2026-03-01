import java.nio.file.Path;
import org.jkiss.dbeaver.Log;
            ImportConnectionInfo connectionInfo = dataGripDataSourceConfigXmlService.buildIdeaConnectionFromProps(dataSourceProps);
        try {
    private static final Log log = Log.getLog(ConfigImportWizardPageDataGripConnections.class);
package org.jkiss.dbeaver.ui.config.migration.wizards.datagrip;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.config.migration.datagrip.impl.DataGripDataSourceConfigXmlServiceImpl;
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
/*
 * You may obtain a copy of the License at
 */
 * limitations under the License.
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;

            importData.addConnection(connectionInfo);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            importData.addDriver(connectionInfo.getDriverInfo());
        Map<String, Map<String, String>> uuidToDataSourceProps = dataGripDataSourceConfigXmlService.buildIdeaConfigProps(
    }

import java.nio.file.Files;
        if (!Files.exists(ideaDirectory)) {
        }
        }

 *
        }

 * See the License for the specific language governing permissions and
    public ConfigImportWizardPageDataGripConnections() {

            log.warn("Exception during to import connections", e);
 *
    DataGripDataSourceConfigXmlService dataGripDataSourceConfigXmlService = DataGripDataSourceConfigXmlServiceImpl.INSTANCE;
            tryLoadConnection(importData);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
public class ConfigImportWizardPageDataGripConnections extends ConfigImportWizardPage {
        setDescription(ImportConfigMessages.config_import_wizard_header_import_configuration);
}
        for (Map<String, String> dataSourceProps : uuidToDataSourceProps.values()) {
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
    protected void loadConnections(ImportData importData) throws DBException {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(ImportConfigMessages.config_import_wizard_page_caption_connections);
        Path ideaDirectory = wizard.getInputFile();
        setErrorMessage(null);

            setErrorMessage(e.getMessage());
    private void tryLoadConnection(ImportData importData) throws Exception {
            return;

import java.util.Map;
        setTitle(ImportConfigMessages.config_import_wizard_page_caption_connections);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        ConfigImportWizardDataGrip wizard = (ConfigImportWizardDataGrip) getWizard();
import org.jkiss.dbeaver.ui.config.migration.datagrip.api.DataGripDataSourceConfigXmlService;
                ideaDirectory.toString());
        } catch (Exception e) {
