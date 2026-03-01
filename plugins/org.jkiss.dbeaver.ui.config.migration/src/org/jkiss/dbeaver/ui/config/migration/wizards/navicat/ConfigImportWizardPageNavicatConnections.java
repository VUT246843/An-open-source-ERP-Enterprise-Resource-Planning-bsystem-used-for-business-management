            password
        String password = decryptPassword(conProps.get("Password"));
    protected ConfigImportWizardPageNavicatConnections()
    private void importNCX(ImportData importData, ImportDriverInfo driver, Reader reader) throws XMLException
        } catch (Exception e) {
    
    {
            Map<String, String> conProps = new HashMap<>();
    {
            return "";
        String name = conProps.get("ConnectionName");
        }
        }
 *

        }
     * @return Plain-text of password or empty string if unable to decrypt
            makeConnectionFromProps(importData, driver, conProps);
     */
        try (InputStream is = new FileInputStream(inputFile)) {
package org.jkiss.dbeaver.ui.config.migration.wizards.navicat;
import org.w3c.dom.Element;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
import org.w3c.dom.Attr;
    private void makeConnectionFromProps(ImportData importData, ImportDriverInfo driver, Map<String, String> conProps)
        final DBPDriver driver = wizard.getDriver();
        if (CommonUtils.isEmpty(name)) {
            return;
        for (Element conElement : XMLUtils.getChildElementList(document.getDocumentElement())) {

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        ImportDriverInfo driverInfo = new ImportDriverInfo(driver.getId(), driver.getName(), driver.getSampleURL(),
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
    private NavicatEncrypt decryptor;
            conProps.get("UserName"), 


import java.io.*;
                importNCX(importData, driverInfo, reader);
     * @param encryptedPassword
            driver, 
import org.w3c.dom.Document;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
 *
            conProps.get("Host"), 
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ConfigImportWizardPageNavicatConnections extends ConfigImportWizardPage {
    }


import org.jkiss.utils.xml.XMLUtils;
            }
        importData.addDriver(driverInfo);
 * limitations under the License.
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
    protected void loadConnections(ImportData importData) throws DBException
        try {
            for (int i = 0; i < attrs.getLength(); i++) {
import org.w3c.dom.NamedNodeMap;
    }
import org.jkiss.utils.xml.XMLException;
        File inputFile = wizard.getInputFile();

    /**
            name, 
import org.jkiss.dbeaver.DBException;
        super(ImportConfigMessages.config_import_wizard_navicat_name);
    }
                conProps.put(attr.getName(), attr.getValue());
    {
        ConfigImportWizardNavicat wizard = (ConfigImportWizardNavicat) getWizard();
     * 
            NamedNodeMap attrs = conElement.getAttributes();
        decryptor = new NavicatEncrypt();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            conProps.get("Database"), 
    
        setErrorMessage(null);
/*
    }
    {
            try (Reader reader = new InputStreamReader(is, wizard.getInputFileEncoding())) {
            setErrorMessage(e.getMessage());
        setDescription(ImportConfigMessages.config_import_wizard_navicat_description);
        Document document = XMLUtils.parseDocument(reader);
    {
 * You may obtain a copy of the License at
import java.util.Map;
        } catch (Exception e) {

         ));
        setTitle(ImportConfigMessages.config_import_wizard_navicat_name);
            "",
}
    private String decryptPassword(String encryptedPassword)
                driver.getDriverClassName());
        }
    

                Attr attr = (Attr) attrs.item(i);
        importData.addConnection(new ImportConnectionInfo(
 *
            conProps.get("Port"), 
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 */

 * See the License for the specific language governing permissions and
            return decryptor.decrypt(encryptedPassword);

import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
    }
import java.util.HashMap;
            name, 
     * Decrypts password chiper-text
