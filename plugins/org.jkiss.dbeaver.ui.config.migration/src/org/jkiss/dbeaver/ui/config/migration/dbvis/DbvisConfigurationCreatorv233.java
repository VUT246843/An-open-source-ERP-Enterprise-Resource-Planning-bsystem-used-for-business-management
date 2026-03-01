        return CONFIG_FILE;
        } catch (XMLException e) {
    }
                }
    public ImportData create(
                        importData.addConnection(connectionInfo);
                            sshHandler.setProperty(DBWHandlerConfiguration.PROP_PORT, sshConfiguration.getSshPort());
                                            driverDescriptor.getSampleURL(),
                                    }
        return importData;
                                        driver = new ImportDriverInfo(driverDescriptor.getId(),
                Element sshServersElement = XMLUtils.getChildElement(sshConfigDocument.getDocumentElement(), "SshServers");
                    }
                for (Element dbElement : XMLUtils.getChildElementList(databasesElement, "Database")) {
                                            driverDescriptor.getDriverClassName());
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        sshConfig.setIsEnabled(XMLUtils.getChildElementBody(sshServerElement, "Enabled"));
                                String sampleURL = XMLUtils.getChildElementBody(driverTypeDocumentElement, "URLFormat");
            File sshServersFile = new File(configFile.getParent(), SSH_CONFIG_FILE);
                                        log.error("Driver descriptor not found for: " + driverName);
                            builder.append(type)
                            DBWHandlerConfiguration sshHandler = new DBWHandlerConfiguration(sslHD, null);
        if (driversubstitutedName == null) {
                            }
            Document configDocument = XMLUtils.parseDocument(configFile);
                        }
            Map<String, DbvisSshServerConfiguration> sshServerConfigurations = new LinkedHashMap<>();
                                Element driverTypeDocumentElement = driverTypeDocument.getDocumentElement();
                                final String varName = urlVarElement.getAttribute("UrlVariableName");
 * See the License for the specific language governing permissions and
import org.jkiss.utils.xml.XMLUtils;
    @Override
                        if (sshConfiguration != null) {
                    }
                                } else if ("Port".equals(varName)) {
                    String driverName = XMLUtils.getChildElementBody(dbElement, "Driver");
                    Element urlVarsElement = XMLUtils.getChildElement(dbElement, "UrlVariables");
                                    if (driverDescriptor != null) {
            throw new DBException("Configuration parse error: " + e.getMessage());
                            }
                        sshConfig.setSshKnownHostsFile(XMLUtils.getChildElementBody(sshServerElement, "SshKnownHostsFile"));
            Element databasesElement = XMLUtils.getChildElement(configDocument.getDocumentElement(), "Databases");
    @Override
                                if (!CommonUtils.isEmpty(driverName)) {
                            if (sshServers != null) {

                        sshConfig.setId(sshServerElement.getAttribute("id"));
                        DbvisSshServerConfiguration sshConfig = new DbvisSshServerConfiguration();
                            user,

                    ImportDriverInfo driver = null;
    public static final String CONFIG_FOLDER = "config233"; //$NON-NLS-1$

                                }
import java.util.HashMap;
                                    DriverDescriptor driverDescriptor = getDriverByName(driverName);
                            }

import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;

                                        break;
 * You may obtain a copy of the License at
                                    port = varValue;
        try {
            }
    ) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
                            password);
                            hostName,
    public String getConfigurationFolder() {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
                                .append(".xml");
            }
                                .append("_")
import org.jkiss.dbeaver.model.net.ssh.SSHConstants;

    public static final String VERSION = "version.24.3.x"; //$NON-NLS-1$
                        sshConfig.setSshConfigFile(XMLUtils.getChildElementBody(sshServerElement, "SshConfigFile"));
import org.jkiss.code.NotNull;
        }
import org.jkiss.dbeaver.Log;
                                            driverDescriptor.getDriverClassName());
                        sshConfig.setSshPort(XMLUtils.getChildElementBody(sshServerElement, "SshPort"));
                        sshServerConfigurations.put(sshConfig.getId(), sshConfig);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
                                    hostName = varValue;
                                .append("driverType")
package org.jkiss.dbeaver.ui.config.migration.dbvis;
                                    if (driverDescriptor != null) {
                                sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PASSWORD);
                                for (Element sshServer : XMLUtils.getChildElementList(sshServers, "SshServer")) {
                    }
                    } else {
                        && (!CommonUtils.isEmpty(url) || !CommonUtils.isEmpty(hostName))) {
        @NotNull ImportData importData,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                            String[] driverIdSegments = driverId.split("-");
                                        adaptSampleUrl(driver);
                            if (sshConfiguration.getAuthenticationType() == SSHConstants.AuthType.PUBLIC_KEY) {
    public static final Map<String, String> dbvis2dbeaverDriverNames = new HashMap<>();
                                    log.error("Driver descriptor not found by path: " + driverFile.getAbsolutePath());
                        sshConfig.setSshUserid(XMLUtils.getChildElementBody(sshServerElement, "SshUserid"));

    public String getConfigurationFile() {
                            url,
                            File driverFile = new File(configFile.getParent(), builder.toString());
                                if ("Server".equals(varName)) {
import org.w3c.dom.Element;
import java.util.Map;
                    String user = XMLUtils.getChildElementBody(dbElement, "Userid");
                    }
                                    database = varValue;
import org.jkiss.utils.xml.XMLException;
                    String type = XMLUtils.getChildElementBody(dbElement, "Type");
                        Element driverElement = XMLUtils.getChildElement(urlVarsElement, "Driver");
                                .append(driverIdSegments[0])
 *
 * DBeaver - Universal Database Manager
                                    String enabled = XMLUtils.getChildElementBody(sshServer, "Enabled");
                            connectionInfo.addNetworkHandler(sshHandler);
                            String driverId = driverElement.getAttribute("DriverId");
 *
                            port,
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                            Element sshServers = XMLUtils.getChildElement(dbElement, "SshServers");
                                if (!CommonUtils.isEmpty(name) && !CommonUtils.isEmpty(sampleURL)) {
import org.jkiss.dbeaver.model.net.DBWUtils;
 */
        return driversubstitutedName;
public class DbvisConfigurationCreatorv233 extends DbvisAbstractConfigurationCreator {
        dbvis2dbeaverDriverNames.put("Db2 LUW", "Db2 for LUW"); //$NON-NLS-1$ $NON-NLS-2$
                                .append("_")
                            StringBuilder builder = new StringBuilder("databaseinfo/user/driverTypes/");
                    if (CommonUtils.isEmpty(url) && CommonUtils.isEmpty(hostName)) {
        @NotNull File configFile
                                    }
    protected String substituteDriverName(String driverName) {
    }
                                            driverDescriptor.getName(),
 * Unless required by applicable law or agreed to in writing, software
                            sshHandler.setProperty(DBWHandlerConfiguration.PROP_HOST, sshConfiguration.getSshHost());
                            driver,
                        log.error("Can not extract data for: " + driverName);
                            } else {
                                    } else {
                                sshHandler.setProperty(SSHConstants.PROP_KEY_PATH, sshConfiguration.getSshPrivateKeyFile());
                Document sshConfigDocument = XMLUtils.parseDocument(sshServersFile);
                            sshHandler.setUserName(sshConfiguration.getSshUserid());
    // substitution map for current version of DBvisualiser

                            }
                            sshHandler.setEnabled(true);

                    String hostName = null, port = null, database = null;
                            NetworkHandlerDescriptor sslHD = NetworkHandlerRegistry.getInstance().getDescriptor(DBWUtils.SSH_TUNNEL);
                        sshConfig.setAuthenticationType(XMLUtils.getChildElementBody(sshServerElement, "AuthenticationType"));
        dbvis2dbeaverDriverNames.put("H2 2.x Embedded", "H2 Embedded V.2"); //$NON-NLS-1$ $NON-NLS-2$
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
            driversubstitutedName = driverName;
                            sshHandler.setProperty(SSHConstants.PROP_IMPLEMENTATION, sshConfiguration.getSshImplementationType());
                        sshConfig.setSshPrivateKeyFile(XMLUtils.getChildElementBody(sshServerElement, "SshPrivateKeyFile"));
                                        adaptSampleUrl(driver);
 * limitations under the License.
                        sshConfig.setDescription(XMLUtils.getChildElementBody(sshServerElement, "Description"));
            if (sshServersFile.exists()) {
            DbvisSshServerConfiguration sshConfiguration = null;
        }
                                final String varValue = XMLUtils.getElementBody(urlVarElement);
                        }
                            for (Element urlVarElement : XMLUtils.getChildElementList(driverElement, "UrlVariable")) {
                        if (driverElement != null) {
                        sshConfig.setName(XMLUtils.getChildElementBody(sshServerElement, "Name"));
        return CONFIG_FOLDER;
                                String identifier = XMLUtils.getChildElementBody(driverTypeDocumentElement, "Identifier");
import org.jkiss.utils.CommonUtils;
import java.io.File;
                                .append(type)
                if (sshServersElement != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                .append("/")
                            } else {
                                } else if ("Database".equals(varName)) {
import org.w3c.dom.Document;
                        sshConfig.setSshImplementationType(XMLUtils.getChildElementBody(sshServerElement, "SshImplementationType"));
                                }
import org.jkiss.dbeaver.DBException;
                        hostName = "localhost"; //$NON-NLS-1$
    }
    public static final String CONFIG_FILE = "dbvis.xml"; //$NON-NLS-1$
}
                                .append("_")
                    String password = null;
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                    for (Element sshServerElement : XMLUtils.getChildElementList(sshServersElement, "SshServer")) {
                                }
                        sshConfig.setSshHost(XMLUtils.getChildElementBody(sshServerElement, "SshHost"));
                                        log.error("Driver descriptor not found for: " + driverName);
                                    } else {
                                    DriverDescriptor driverDescriptor = getDriverByName(name);
                            alias,
                            dbElement.getAttribute("id"),
        dbvis2dbeaverDriverNames.put("Oracle 9i", "Oracle"); //$NON-NLS-1$ $NON-NLS-2$
                                    }
                                .append(driverId)
                                        driver = new ImportDriverInfo(identifier, driverDescriptor.getName(), sampleURL,
                            database,
            if (databasesElement != null) {

                            if (driverFile.exists()) {
                                Document driverTypeDocument = XMLUtils.parseDocument(driverFile);
    @Override
import java.util.LinkedHashMap;
    private static final Log log = Log.getLog(DbvisConfigurationCreatorv233.class);
    @Override
                                    if (enabled.equals("true")) {
                        ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
 *
        String driversubstitutedName = dbvis2dbeaverDriverNames.get(driverName);
                                String name = XMLUtils.getChildElementBody(driverTypeDocumentElement, "Label");
                    if (!CommonUtils.isEmpty(alias) && !CommonUtils.isEmpty(driverName)
                                }
                        sshConfig.setSshConnectTimeout(XMLUtils.getChildElementBody(sshServerElement, "SshConnectTimeout"));
    
 * Licensed under the Apache License, Version 2.0 (the "License");
                    String alias = XMLUtils.getChildElementBody(dbElement, "Alias");
                }
                    String url = XMLUtils.getChildElementBody(dbElement, "Url");
    static {
/*
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
                                } else {
                    if (urlVarsElement != null) {
                                        sshConfiguration = sshServerConfigurations.get(sshServer.getAttribute("id"));
                            sshHandler.setSavePassword(true);
    public static final String SSH_CONFIG_FILE = "sshservers.xml"; //$NON-NLS-1$
 * you may not use this file except in compliance with the License.
                                sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PUBLIC_KEY);
    }
