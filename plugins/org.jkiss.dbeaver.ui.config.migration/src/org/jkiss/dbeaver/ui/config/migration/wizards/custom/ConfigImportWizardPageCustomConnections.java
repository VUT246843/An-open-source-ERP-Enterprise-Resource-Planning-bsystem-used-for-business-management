

            }
import org.jkiss.utils.xml.XMLUtils;
        
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
            conProps.get("password")
        importData.addDriver(driverInfo);
                    importCSV(importData, driverInfo, reader);
import java.io.*;
        File inputFile = wizard.getInputFile();
 * Licensed under the Apache License, Version 2.0 (the "License");
        final CSVReader csvReader = new CSVReader(reader);
        );
            return;

    private void importXML(ImportData importData, ImportDriverInfo driver, Reader reader) throws XMLException {
            conProps.get("user"),
 *
 * DBeaver - Universal Database Manager
    }
/*
public class ConfigImportWizardPageCustomConnections extends ConfigImportWizardPage {
 * distributed under the License is distributed on an "AS IS" BASIS,
        final String[] header = csvReader.readNext();
    {
                    break;
        }
                }
 * limitations under the License.
import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
        setDescription(ImportConfigMessages.config_import_wizard_header_import_configuration);
        log.debug("load connection: " + ici.toString());

                } else {
import org.jkiss.dbeaver.model.connection.DBPDriver;

import org.w3c.dom.Attr;
    @Override
            if (ArrayUtils.isEmpty(line)) {
            makeConnectionFromProps(importData, driver, conProps);
import org.jkiss.utils.xml.XMLException;
            final String[] line = csvReader.readNext();
            conProps.get("database"),

import org.jkiss.utils.csv.CSVReader;
                Attr attr = (Attr) attrs.item(i);
            setErrorMessage(e.getMessage());
 *     http://www.apache.org/licenses/LICENSE-2.0
                conProps.put(attr.getName(), attr.getValue());
        }
            }
    {
                conProps.put(header[i], line[i]);
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
            }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
            conProps.get("id"),
            Map<String, String> conProps = new HashMap<>();
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            return;

        } catch (Exception e) {
                break;
            conProps.get("url"),
    }
 * You may obtain a copy of the License at
    }

            try (Reader reader = new InputStreamReader(is, wizard.getInputFileEncoding())) {
}
            setErrorMessage(ImportConfigMessages.config_import_wizard_no_connection_found_error);
        setTitle(ImportConfigMessages.config_import_wizard_page_caption_connections);
    private static final Log log = Log.getLog(ConfigImportWizardPageCustomConnections.class);
        ImportDriverInfo driverInfo = new ImportDriverInfo(driver.getId(), driver.getName(), driver.getSampleURL(), driver.getDriverClassName());
                    importXML(importData, driverInfo, reader);
        Document document = XMLUtils.parseDocument(reader);
            conProps.get("port"),
import org.w3c.dom.Document;
    protected void loadConnections(ImportData importData) throws DBException




import org.jkiss.utils.CommonUtils;
    }
        importData.addConnection(ici);
 *
import org.w3c.dom.Element;
import java.util.HashMap;
            Map<String, String> conProps = new HashMap<>();
import org.jkiss.utils.ArrayUtils;
            driver,
        for (;;) {
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
            makeConnectionFromProps(importData, driver, conProps);
 *
            for (int i = 0; i < line.length; i++) {
package org.jkiss.dbeaver.ui.config.migration.wizards.custom;
            for (int i = 0; i < attrs.getLength(); i++) {
        if (ArrayUtils.isEmpty(header)) {
        setErrorMessage(null);
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
 */
        try (InputStream is = new FileInputStream(inputFile)) {
import org.w3c.dom.NamedNodeMap;
        String name = conProps.get("name");
                if (i >= header.length) {
        ImportConnectionInfo ici = new ImportConnectionInfo(
    private void importCSV(ImportData importData, ImportDriverInfo driver, Reader reader) throws IOException {
        super(ImportConfigMessages.config_import_wizard_page_caption_connections);
        if (CommonUtils.isEmpty(name)) {
            conProps.get("host"),

            NamedNodeMap attrs = conElement.getAttributes();
        final DBPDriver driver = wizard.getDriver();
            name,
    }
    private void makeConnectionFromProps(ImportData importData, ImportDriverInfo driver, Map<String, String> conProps) {
        }

        }
        for (Element conElement : XMLUtils.getChildElementList(document.getDocumentElement())) {
import org.jkiss.dbeaver.DBException;

 * Unless required by applicable law or agreed to in writing, software
        ConfigImportWizardCustom wizard = (ConfigImportWizardCustom) getWizard();
    protected ConfigImportWizardPageCustomConnections()
        }
                if (wizard.getImportType() == ConfigImportWizardCustom.ImportType.CSV) {
import org.jkiss.dbeaver.Log;
                }
