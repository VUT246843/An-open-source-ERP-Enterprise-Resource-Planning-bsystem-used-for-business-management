 *
import org.jkiss.dbeaver.DBException;
    

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        if (getConnectionTable() == null) {
 * Unless required by applicable law or agreed to in writing, software
                if (importConnection.getDriverInfo() == null) {
                    isCompleted = true;
        }
        if (!dbvisConfigHome.exists()) {
            throw new DBException(ImportConfigMessages.config_import_wizard_page_dbvis_label_installation_not_found);
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
    }
 */
        }
 *

 * you may not use this file except in compliance with the License.
/*
    public boolean isPageComplete() {
                } else {
            }
            return false;
        File homeFolder = RuntimeUtils.getUserHomeDir();
    }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

        setTitle(ImportConfigMessages.config_import_wizard_dbvis_name);
public class ConfigImportWizardPageDbvis extends ConfigImportWizardPage {
 * You may obtain a copy of the License at
                    break;
        super(ImportConfigMessages.config_import_wizard_dbvis_name);
        importData = configurationImporter.importConfiguration(importData, dbvisConfigHome);
    protected ConfigImportWizardPageDbvis() {
import org.jkiss.dbeaver.ui.config.migration.dbvis.DbvisConfigurationImporter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.TableItem;
            if (item.getChecked() && item.getData() instanceof ImportConnectionInfo importConnection) {
    @Override
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public static final String DBVIS_HOME_FOLDER = ".dbvis";
                    isCompleted = false;
        for (TableItem item : getConnectionTable().getItems()) {
        DbvisConfigurationImporter configurationImporter = new DbvisConfigurationImporter();

import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
}
 * limitations under the License.


import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.ui.config.migration.ImportConfigImages;
    protected void loadConnections(ImportData importData) throws DBException {
        setDescription(ImportConfigMessages.config_import_wizard_dbvis_description);
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
import java.io.File;
    }
    @Override
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;

 *
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        setErrorMessage(null);
                }
        return isCompleted;
        File dbvisConfigHome = new File(homeFolder, DBVIS_HOME_FOLDER);
        setImageDescriptor(ImportConfigImages.getImageDescriptor("icons/dbvis_big.png"));
                    setErrorMessage(NLS.bind(ImportConfigMessages.config_import_wizard_error, importConnection.getAlias()));
        boolean isCompleted = false;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.config.migration.wizards.dbvis;
