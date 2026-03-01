    }
    @Override
/*
    protected String substituteDriverName(String name) {
                            for (Element urlVarElement : XMLUtils.getChildElementList(driverElement, "UrlVariable")) {
                                if (!CommonUtils.isEmpty(path)) {
                    Element urlVarsElement = XMLUtils.getChildElement(dbElement, "UrlVariables");
                                database,
                                    port = varValue;
            Element databasesElement = XMLUtils.getChildElement(configDocument.getDocumentElement(), "Databases");
                                }
import org.jkiss.utils.xml.XMLUtils;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        Element driverElement = XMLUtils.getChildElement(urlVarsElement, "Driver");
                    }
                        // Parse libraries
    public String getConfigurationFile() {
                    String alias = XMLUtils.getChildElementBody(dbElement, "Alias");
                     */
}
                    if (urlVarsElement != null) {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
                        if (!CommonUtils.isEmpty(lastName)) {
                    //String passwordEncoded = XMLUtils.getChildElementBody(dbElement, "Password");
                            }
    public String getConfigurationFolder() {
                    if (!CommonUtils.isEmpty(name) && !CommonUtils.isEmpty(sampleURL) && !CommonUtils.isEmpty(driverClass)) {
                    // "LastVersion");
 */
import org.w3c.dom.Document;
import org.jkiss.utils.xml.XMLException;
                    /*
                                port,
    public static final String VERSION = "version.7.x.x"; //$NON-NLS-1$
    public static final String CONFIG_FOLDER = "config70"; //$NON-NLS-1$
                for (Element driverElement : XMLUtils.getChildElementList(driversElement, "Driver")) {
package org.jkiss.dbeaver.ui.config.migration.dbvis;
                    String password = null;
    }
import java.io.File;
 * See the License for the specific language governing permissions and
                                    hostName = varValue;
                                if ("Server".equals(varName)) {
 * DBeaver - Universal Database Manager
                    String sampleURL = XMLUtils.getChildElementBody(driverElement, "URLFormat");
                        }
            throw new DBException("Configuration parse error: " + e.getMessage());
import org.w3c.dom.Element;
                        if (locationsElement != null) {
            }

                                user,
                    String name = XMLUtils.getChildElementBody(driverElement, "Name");
                    if (!CommonUtils.isEmpty(alias) && !CommonUtils.isEmpty(driverName)
                    String url = XMLUtils.getChildElementBody(dbElement, "Url");
                            for (Element locationElement : XMLUtils.getChildElementList(locationsElement, "Location")) {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
public class DbvisConfigurationCreatorv7 extends DbvisAbstractConfigurationCreator {
                                hostName,
                    // String lastVersion = XMLUtils.getChildElementBody(driverElement,
 *
    @Override
                        }
                                driver,

        File configFile) throws DBException {
                                url,
        return CONFIG_FOLDER;
        return importData;
        return name;
            Document configDocument = XMLUtils.parseDocument(configFile);
                    String user = XMLUtils.getChildElementBody(dbElement, "Userid");
                     * String(Base64.decode(passwordEncoded), ContentUtils.DEFAULT_ENCODING); }
                            ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
                     * catch (UnsupportedEncodingException e) { // Ignore } }
                        && (!CommonUtils.isEmpty(url) || !CommonUtils.isEmpty(hostName))) {
                        }
                        ImportDriverInfo driver = importData.getDriver(driverName);
                for (Element dbElement : XMLUtils.getChildElementList(databasesElement, "Database")) {
        return CONFIG_FILE;
        try {
                        }
                    String driverName = XMLUtils.getChildElementBody(dbElement, "Driver");
                        ImportDriverInfo driver = new ImportDriverInfo(null, name, sampleURL, driverClass);
    @Override


    public static final String CONFIG_FILE = "dbvis.xml"; //$NON-NLS-1$
                    }
                        adaptSampleUrl(driver);

                                }

                        importData.addDriver(driver);
                                    database = varValue;
    }
                                alias,
                        if (driver != null) {
    @Override
import org.jkiss.utils.CommonUtils;
                                dbElement.getAttribute("id"),
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (XMLException e) {
                                password);
        // not require to substitute

                    String lastName = XMLUtils.getChildElementBody(driverElement, "LastName");
            if (driversElement != null) {
                }
        }
                                    driver.addLibrary(path);
                    String hostName = null, port = null, database = null;
                        Element locationsElement = XMLUtils.getChildElement(driverElement, "Locations");
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
                            driver.setDescription(lastName);
 *
                    }
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
            Element driversElement = XMLUtils.getChildElement(configDocument.getDocumentElement(), "Drivers");
                    String driverClass = XMLUtils.getChildElementBody(driverElement, "DefaultClass");
                }
            if (databasesElement != null) {

                        if (driverElement != null) {
                                String path = XMLUtils.getChildElementBody(locationElement, "Path");
                                } else if ("Database".equals(varName)) {
                            importData.addConnection(connectionInfo);

                            }
 *     http://www.apache.org/licenses/LICENSE-2.0

            }
                                } else if ("Port".equals(varName)) {
 * limitations under the License.
 * you may not use this file except in compliance with the License.
                     * if (!CommonUtils.isEmpty(passwordEncoded)) { try { password = new
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
                                final String varName = urlVarElement.getAttribute("UrlVariableName");
    public ImportData create(ImportData importData,
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
                                final String varValue = XMLUtils.getElementBody(urlVarElement);
