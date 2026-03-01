            }
                                    for (Element attrElement : XMLUtils.getChildElementList(conElement)) {
                                    if (CommonUtils.isEmpty(alias)) {
                                        user,
    private final ImportDriverInfo oraDriver;
                                        } else {
 * limitations under the License.
                                                OracleConnectionRole.class,
        importData.addDriver(oraDriver);
                                    ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
 * Copyright (C) 2010-2025 DBeaver Corp and others

        setDescription("Import Oracle Toad connections");
                                        }

            throw new DBException("Configuration parse error: " + e.getMessage(), e);
 * Licensed under the Apache License, Version 2.0 (the "License");
            setErrorMessage(e.getMessage());
                                    }
                                    }
                                        port,
                                            OracleConnectionType.SERVICE.name() :
                                        null,
                                    Map<String, String> attrMap = new LinkedHashMap<>();
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionType;
                                        attrMap.put(attrElement.getTagName(), elementBody.trim());
        setTitle("Toad");
                                        if (CommonUtils.isEmpty(elementBody)) {
import org.w3c.dom.Document;
                for (Element dbElement : XMLUtils.getChildElementList(refElement, "DbPlatform")) {
import org.jkiss.utils.CommonUtils;

                                    if (CommonUtils.isEmpty(alias)) {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.utils.xml.XMLException;
            for (Element refElement : XMLUtils.getChildElementList(configDocument.getDocumentElement(), "ConnectionHierarchy")) {
                }
                                    String guid = attrMap.get("GUID");
                                            CommonUtils.valueOf(
            "oracle.jdbc.OracleDriver");
import java.util.Map;
                                        if ("Default".equals(role)) {
                                        sshHandler.setEnabled(true);
        File inputFile = wizard.getInputFile();

                    if ("Oracle".equals(dbElement.getAttribute("name"))) {
                                    }
            try (Reader reader = new InputStreamReader(is)) {

import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
                                        host,
                                        }

                                            OracleConnectionType.SID.name());
                                    }
                parseConnections(importData, reader);
                                            continue;
                                    String role = attrMap.get("ConnectionMode");
                                        String sshPassword = attrMap.get("SSHPassword");
            null,
                                        OracleConstants.PROP_SID_SERVICE,

                                    String user = attrMap.get("User");
    @Override
                                        alias,
    }
                                        String sshPrivateKey = attrMap.get("SSHPrivateKey");
                                            OracleConstants.PROP_INTERNAL_LOGON,
import org.jkiss.dbeaver.DBException;
                                    }
        oraDriver = new ImportDriverInfo(
                                        sshHandler = new DBWHandlerConfiguration(sslHD, null);
public class ConfigImportWizardPageToadConnections extends ConfigImportWizardPage {
                                        sshHandler.setSavePassword(true);
        super("Toad");
                                    String host = attrMap.get("Host");
                                                role,
 *
    }
                                    if (CommonUtils.isEmpty(alias)) {
                                        alias = sid;
                                        }
                                        String sshRemotePort = attrMap.get("SSHRemotePort");
                                        alias = host;
    protected void loadConnections(ImportData importData) {
                                        sid,
        try {
        }


 * distributed under the License is distributed on an "AS IS" BASIS,
                            for (Element conElement : XMLUtils.getChildElementList(consElement, "Connection")) {
                                        connectionInfo.setProviderProperty(
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;
 * See the License for the specific language governing permissions and
                    }
                                    }
                                    if (!CommonUtils.isEmpty(sshHost)) {
}
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionRole;
                                        NetworkHandlerDescriptor sslHD = NetworkHandlerRegistry.getInstance().getDescriptor(DBWUtils.SSH_TUNNEL);
                                        sshHandler.setProperty(DBWHandlerConfiguration.PROP_PORT, sshPort);
import org.jkiss.dbeaver.model.net.ssh.SSHConstants;
 */
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                                    DBWHandlerConfiguration sshHandler = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                        alias = guid;
                                            sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PUBLIC_KEY);
                                        null);
        } catch (XMLException e) {
/*
                                    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIActivator;
                        for (Element consElement : XMLUtils.getChildElementList(dbElement, "Connections")) {
 * you may not use this file except in compliance with the License.
                                    if (sshHandler != null) {
            }
                                        sshHandler.setUserName(sshUser);
        setImageDescriptor(OracleUIActivator.getImageDescriptor("icons/toad_icon_big.png"));
    protected ConfigImportWizardPageToadConnections() {
                                        if (CommonUtils.isEmpty(host)) {
                                        String sshLocalPort = attrMap.get("SSHLocalPort");
                                if ("Oracle".equals(conElement.getAttribute("type"))) {
                                        String sshPort = attrMap.get("SSHPort");
import org.jkiss.utils.xml.XMLUtils;
                                    }
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
                                    if (CommonUtils.isEmpty(alias)) {
import java.io.*;

                                        String elementBody = XMLUtils.getElementBody(attrElement);
    }
                                }
                                    String sid = attrMap.get("Sid");
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
        } catch (Exception e) {
 * You may obtain a copy of the License at
 *
                                        oraDriver,
                                        connectionInfo.addNetworkHandler(sshHandler);
import java.util.LinkedHashMap;
                                    if (!CommonUtils.isEmpty(role)) {
                                                OracleConnectionRole.NORMAL).getTitle());

            Document configDocument = XMLUtils.parseDocument(reader);
                                        String sshUser = attrMap.get("SSHUser");
        try (InputStream is = new FileInputStream(inputFile)) {
                                    connectionInfo.setProviderProperty(
import org.jkiss.code.NotNull;

                                        }
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
                                        alias = sshHost;

 * Unless required by applicable law or agreed to in writing, software
                                    //String instanceName = attrMap.get("InstanceName");
import org.w3c.dom.Element;
 *     http://www.apache.org/licenses/LICENSE-2.0
                                        if ("ConnectionType".equals(attrElement.getTagName())) {
                                        sshHandler.setProperty(DBWHandlerConfiguration.PROP_HOST, sshHost);
                                    boolean isServiceType = false;
            "jdbc:oracle:thin:@{host}[:{port}]/{database}",

                                            role = OracleConnectionRole.NORMAL.name();
                                    String port = attrMap.get("Port");
    private void parseConnections(@NotNull ImportData importData, @NotNull Reader reader) throws DBException {
                                            isServiceType = "True".equals(attrElement.getAttribute("ServiceName"));
                                    String sshHost = attrMap.get("SSHHost");

import org.jkiss.dbeaver.model.net.DBWUtils;
package org.jkiss.dbeaver.ext.oracle.ui.tools.toad;
 *
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
            "Oracle",
                                        null,
                                        sshHandler.setProperty(SSHConstants.PROP_IMPLEMENTATION, "sshj");
                                            host = sshHost;
                                    String alias = attrMap.get("Alias");
                                            sshHandler.setPassword(sshPassword);
                                        isServiceType ?
                                        if (!CommonUtils.isEmpty(sshPrivateKey)) {
                                            sshHandler.setProperty(SSHConstants.PROP_KEY_PATH, sshPrivateKey);
                        }
                            }
                                        }
                                        String sshRemoteHost = attrMap.get("SSHRemoteHost");
                                            sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PASSWORD);

        ConfigImportWizardToad wizard = (ConfigImportWizardToad) getWizard();
        }
                                    importData.addConnection(connectionInfo);
