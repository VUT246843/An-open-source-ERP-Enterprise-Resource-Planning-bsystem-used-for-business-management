        if (divPos != -1) {
        String portReplacement = "{port}";
                            if (!CommonUtils.isEmpty(path)) {
            String portString = portMatcher.group(1);
        } catch (XMLException e) {
                ImportConnectionInfo connectionInfo = new ImportConnectionInfo(driverInfo, null, name, url, null, null, null, userName, password);
    {
                    continue;
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
        if (port != null) {
import org.jkiss.utils.xml.XMLException;
 * See the License for the specific language governing permissions and

                }
                portString = portMatcher.group(2);
                    // Parse libraries

import org.w3c.dom.Element;
        setImageDescriptor(ImportConfigImages.getImageDescriptor("icons/squirrel_big.png"));
        sampleURL = PATTERN_OPTIONAL.matcher(sampleURL).replaceAll("");
 *
    public static final String SQL_DRIVERS_FILE = "SQLDrivers.xml";
        sampleURL = PATTERN_HOST_PORT.matcher(sampleURL).replaceAll("{host}:{port}");
        int divPos = sampleURL.indexOf("?");
        File aliasesFile = new File(sqlConfigHome, SQL_ALIASES_FILE);
        if (divPos != -1) {

            throw new DBException("SQL Squirrel configuration file not found. Possibly version older than 2.3 is installed.");

import org.jkiss.dbeaver.ui.config.migration.ImportConfigMessages;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setDescription(ImportConfigMessages.config_import_wizard_squirrel_description);
                //String webURL = XMLUtils.getChildElementBody(driverElement, "websiteUrl");
                    if (jarFileNames != null) {
                    final Element jarFileNames = XMLUtils.getChildElement(driverElement, "jarFileNames");
                final ImportDriverInfo driverInfo = importData.getDriverByID(driverId);
            }
        final Matcher portMatcher = PATTERN_PORT.matcher(sampleURL);
public class ConfigImportWizardPageSquirrel extends ConfigImportWizardPage {
        }
            sampleURL = sampleURL.substring(0, divPos);
            // Parse aliases
        try {
import org.jkiss.dbeaver.ui.config.migration.ImportConfigImages;
    private void adaptSampleUrl(ImportDriverInfo driverInfo)
import org.jkiss.dbeaver.utils.RuntimeUtils;
        sampleURL = PATTERN_HOST.matcher(sampleURL).replaceAll("{host}");
 *
                if (driverInfo == null) {
import java.io.File;
        }
    protected ConfigImportWizardPageSquirrel()
    public static final String SQL_ALIASES_FILE = "SQLAliases23.xml";
            // Parse drivers
                    continue;
        if (!aliasesFile.exists()) {
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
        String port = null;
            throw new DBException("SQL Squirrel drivers configuration file not found. Possibly corrupted installation.");
                if (portString.startsWith(":")) {
                }
                final Element driverIdentifier = XMLUtils.getChildElement(driverElement, "identifier");
        }
    private static Pattern PATTERN_HOST_PORT = Pattern.compile("<server:port>", Pattern.CASE_INSENSITIVE);

                            }
    private static Pattern PATTERN_DATABASE = Pattern.compile("dbname|<dbname>|<db-name>|<db_name>|<databaseName>|<database-name>|<database_name>|<database>|<full_db_path>|<pathname>|<alias>|<schema>|<default_schema>|<default-schema>", Pattern.CASE_INSENSITIVE);

        if (portMatcher.find()) {
    }
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
    }
import org.jkiss.utils.xml.XMLUtils;
        File sqlConfigHome = new File(homeFolder, SQL_HOME_FOLDER);
                String driverId = driverIdentifier == null ? null : XMLUtils.getChildElementBody(driverIdentifier, "string");
 * DBeaver - Universal Database Manager

    protected void loadConnections(ImportData importData) throws DBException
            for (Element driverElement : XMLUtils.getChildElementList(driversDocument.getDocumentElement(), "Bean")) {
 * limitations under the License.

                String password = XMLUtils.getChildElementBody(aliasElement, "password");
            driverInfo.setDefaultPort(port);
            for (Element aliasElement : XMLUtils.getChildElementList(aliasesDocument.getDocumentElement(), "Bean")) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
        }
                }
                }


    }
            }
        File homeFolder = RuntimeUtils.getUserHomeDir();
                }
        if (!sqlConfigHome.exists()) {
                        }
            if (CommonUtils.isEmpty(portString)) {
        super(ImportConfigMessages.config_import_wizard_squirrel_name);
    private static Pattern PATTERN_HOST = Pattern.compile("<server>|<server_name>|<hostname>|<host_name>|<host>", Pattern.CASE_INSENSITIVE);
    {
        if (!driversFile.exists()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            Document aliasesDocument = XMLUtils.parseDocument(aliasesFile);

                final Element driverIdentifier = XMLUtils.getChildElement(aliasElement, "driverIdentifier");
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static Pattern PATTERN_OPTIONAL = Pattern.compile("\\[|\\]");
 */
                importData.addConnection(connectionInfo);
                }
        sampleURL = portMatcher.replaceAll(portReplacement);
                String name = XMLUtils.getChildElementBody(aliasElement, "name");
import org.jkiss.dbeaver.DBException;
                String driverClass = XMLUtils.getChildElementBody(driverElement, "driverClassName");
                String url = XMLUtils.getChildElementBody(aliasElement, "url");
                if (CommonUtils.isEmpty(driverId)) {
                String userName = XMLUtils.getChildElementBody(aliasElement, "userName");
                    importData.addDriver(driver);
        }
                if (!CommonUtils.isEmpty(name) && !CommonUtils.isEmpty(sampleURL) && !CommonUtils.isEmpty(driverClass)) {
        }
import java.util.regex.Pattern;
        setTitle(ImportConfigMessages.config_import_wizard_squirrel_name);

import org.w3c.dom.Document;

import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;

                    continue;
        sampleURL = PATTERN_DATABASE.matcher(sampleURL).replaceAll("{database}");
            Document driversDocument = XMLUtils.parseDocument(driversFile);
 * You may obtain a copy of the License at
                if (CommonUtils.isEmpty(driverId)) {
    @Override
                if (!"net.sourceforge.squirrel_sql.fw.sql.SQLDriver".equals(driverElement.getAttribute("Class"))) {
                port = portString;

                String sampleURL = XMLUtils.getChildElementBody(driverElement, "url");
        String sampleURL = driverInfo.getSampleURL();
                String name = XMLUtils.getChildElementBody(driverElement, "name");
package org.jkiss.dbeaver.ui.config.migration.wizards.squirrel;
/*
                                driver.addLibrary(path);
import java.util.regex.Matcher;
            if (!CommonUtils.isEmpty(portString)) {
                    ImportDriverInfo driver = new ImportDriverInfo(driverId, name, sampleURL, driverClass);
    {

import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
        File driversFile = new File(sqlConfigHome, SQL_DRIVERS_FILE);

 *
                String driverId = driverIdentifier == null ? null : XMLUtils.getChildElementBody(driverIdentifier, "string");
        }
                    portReplacement = ":" + portReplacement;
        driverInfo.setSampleURL(sampleURL);
        divPos = sampleURL.indexOf(";");

                        for (Element locationElement : XMLUtils.getChildElementList(jarFileNames, "Bean")) {
    public static final String SQL_HOME_FOLDER = ".squirrel-sql";
                    }
            }
}
            }
        }
                }
                    continue;
                    portString = portString.substring(1);
            throw new DBException("Configuration parse error: " + e.getMessage());
                            String path = XMLUtils.getChildElementBody(locationElement, "string");
                if (!"net.sourceforge.squirrel_sql.client.gui.db.SQLAlias".equals(aliasElement.getAttribute("Class"))) {

                    continue;
    private static Pattern PATTERN_PORT = Pattern.compile("<port>|<port_number>|<(:?[0-9]+)>|(:[0-9]+)", Pattern.CASE_INSENSITIVE);
                    adaptSampleUrl(driver);
            throw new DBException(ImportConfigMessages.config_import_wizard_page_squirrel_label_installation_not_found);
            sampleURL = sampleURL.substring(0, divPos);
