        }
            this.customUrl = customUrl;
        public String getName() {
            final File[] connectionFolders = sysConfFolder.listFiles(new FilenameFilter() {
            this.info = info;
        public String getPort() {
    private void parseConnections(File connectionsFile, ImportData importData) throws DBException {
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
                            oraDriver, null, conn.getName(), url, info.getHost(), info.getPort(), dbName, info.getUser(), null

        for (File sysConfFolder : sysConfFolders) {
import org.jkiss.dbeaver.DBException;
            return role;
    @Override
import org.jkiss.utils.xml.XMLUtils;
        oraDriver = new ImportDriverInfo(null, "Oracle", "jdbc:oracle:thin:@{host}[:{port}]/{database}", "oracle.jdbc.OracleDriver");
        public void setConnectionType(OracleConstants.ConnectionType connectionType) {

        }
        String tnsNamesPath;
            log.error("Configuration parse error", e);
        }
        }
        @SerializedName("serviceName")
                    connectionInfo.setUser(OracleConstants.OS_AUTH_PROP);
        });

        @SerializedName("name")
        setTitle("SQL Developer");
        public String getUser() {
                    throw new DBException(OracleUIMessages.config_import_wizard_page_sql_developer_label_installation_not_found);
                final Element refAddressesElement = XMLUtils.getChildElement(refElement, "RefAddresses");
            final File connectionsJsonFile = new File(connectionFolder, SQLD_CONFIG_JSON_FILE);
            }

                    if (!CommonUtils.isEmpty(info.getSID())) {
                if (CommonUtils.isEmpty(conName)) {
        super("SQLDeveloper");
        }

        return url.toString();
        }
        if (tnsNamesPath != null) {
        private String role;

                        continue;
    private final ImportDriverInfo oraDriver;
import org.jkiss.dbeaver.ext.oracle.oci.OCIUtils;
        private String sid;

import org.jkiss.utils.xml.XMLException;
                if (refAddressesElement != null) {

        Map<String, String> tnsNames = OCIUtils.readTnsNames(OCIUtils.getDefaultOraHomePath(), false);
        @SerializedName("customUrl")
        public ConnectionInfo getInfo() {
                        connectionInfo.setUser(OracleConstants.OS_AUTH_PROP);

        private String name;
package org.jkiss.dbeaver.ext.oracle.ui.tools.sqldeveloper;
                        // try and set tns path property so that network alias drop down will
        if (!sqlDevHome.exists()) {
            Document configDocument = XMLUtils.parseDocument(connectionsFile);
    protected ConfigImportWizardPageSqlDeveloper() {
            }
            for (Element refElement : XMLUtils.getChildElementList(configDocument.getDocumentElement(), "Reference")) {
            Gson gson = new GsonBuilder().create();
import com.google.gson.GsonBuilder;
                    }
 */


        final File[] sysConfFolders = sqlDevHome.listFiles(new FilenameFilter() {
                    } else if (!CommonUtils.isEmpty(info.getServiceName())) {
            return connections;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
        public String getSID() {
                    if (isTnsConnection) {

                String serviceName = propsMap.get("serviceName");
            final File connectionFolder = connectionFolders[0];
                    connectionInfo.setProviderProperty(OracleConstants.PROP_INTERNAL_LOGON, role);
    private String getTnsUrl(String alias) {
                String dbName = CommonUtils.isEmpty(sid) ? serviceName : sid;

        private String OsAuth;
        public String getRole() {
                    connectionInfo.setProviderProperty(OracleConstants.PROP_CONNECTION_TYPE, String.valueOf(info.getConnectionType()));
        }
            }
        }
        public void setSID(String sid) {
            throw new DBException("Configuration parse error: " + e.getMessage());
 * limitations under the License.
    }
            final File connectionsFile = new File(connectionFolder, SQLD_CONFIG_FILE);
                    if (!CommonUtils.isEmpty(info.getRole())) {
    }
        if (sysConfFolders == null || sysConfFolders.length == 0) {
    public static final String SQLD_CONFIG_JSON_FILE = "connections.json";
        // if tnsNames contains entry for alias, append to url
        }
            this.hostname = hostname;
                    // database name should be set to network alias as with connections
        }
        public void setName(String name) {
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;

    public static final String SQLD_SYSCONFIG_FOLDER = "system";
                    importData.addConnection(connectionInfo);
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionType;
 *
            this.sid = sid;
                String port = propsMap.get("port");
 * you may not use this file except in compliance with the License.
        @SerializedName("info")
                }

        }
            tnsNamesPath = OCIUtils.getDefaultOraHomePath().getPath();

        @SerializedName("connections")
}

        private ConnectionInfo info;

    public static final String SQLD_HOME_FOLDER = "SQL Developer";

        }
                    String url = isTnsConnection ? getTnsUrl(info.getUrl()) : info.getUrl();
 *
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
        @SerializedName("hostname")
                        );
                    if (CommonUtils.isEmpty(info.getHost()) && CommonUtils.isEmpty(info.getUrl())) {
        }
    public static class ConnectionDescription {

            if (connectionsFile.exists()) {
            url.append(tnsNames.get(alias));

        }
        // if found append tns path and return, else return nothing
    public static final String SQLD_CONNECTIONS_FOLDER = "o.jdeveloper.db.connection";
        public void setUrl(String customUrl) {
                        String addrContent = XMLUtils.getChildElementBody(refAddr, "Contents");
                String url = propsMap.get("customUrl");
                return name.contains(SQLD_SYSCONFIG_FOLDER);
                        String addrType = refAddr.getAttribute("addrType");
 * Unless required by applicable law or agreed to in writing, software

        }
                    ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        importData.addDriver(oraDriver);

import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIActivator;
                    // created within dbeaver
        }
                String role = propsMap.get("role");
            return sid;
    public class ConnectionInfo {
                String host = propsMap.get("hostname");
import org.jkiss.dbeaver.ui.config.migration.wizards.ConfigImportWizardPage;

    public static final String SQLD_CONFIG_FILE = "connections.xml";
            } else if (connectionsJsonFile.exists()) {
                ConnectionList connResult = gson.fromJson(br, ConnectionList.class);
        public void setOsAuth(String OS_AUTHENTICATION) {
                    }
            if (connectionFolders == null || connectionFolders.length != 1) {
            }
                            connectionInfo.setProviderProperty(OracleConstants.PROP_AUTH_LOGON_AS, info.getRole());
        url.append("jdbc:oracle:thin:@");
                for (ConnectionDescription conn : connResult.getConnections()) {
        }
                } else if (!CommonUtils.isEmpty(serviceName)) {
            });
    }
                if (CommonUtils.toBoolean(osAuth)) {
        @SerializedName("user")
                }

        @SerializedName("OS_AUTHENTICATION")

        @SerializedName("sid")
import com.google.gson.Gson;

        public void setHost(String hostname) {
                String sid = propsMap.get("sid");
        private String serviceName;
                    }
                parseJsonConnections(connectionsJsonFile, importData);
                        }
                final String conName = refElement.getAttribute("name");
import com.google.gson.JsonSyntaxException;
import java.util.LinkedHashMap;

                if (!CommonUtils.isEmpty(role)) {
        public OracleConstants.ConnectionType getConnectionType() {
        private List<ConnectionDescription> connections = new ArrayList<>();
 *
                    ConnectionInfo info = conn.getInfo();
 * See the License for the specific language governing permissions and
            this.name = name;
        public String getHost() {
                    boolean isTnsConnection = info.getConnectionType() == OracleConstants.ConnectionType.TNS;
        }
        setImageDescriptor(OracleUIActivator.getImageDescriptor("icons/sqldeveloper_big.png"));
            // else check default oraHome
import org.jkiss.dbeaver.utils.RuntimeUtils;
import java.util.ArrayList;
        }
            }
 * You may obtain a copy of the License at
import java.util.Map;
                        continue;
        @SerializedName("type")
        // try tnsAdmin by default
        public void setInfo(ConnectionInfo info) {
    }

 * DBeaver - Universal Database Manager
                }

                String user = propsMap.get("user");
        // look for tnsNames

        try {

                        connectionInfo.setProviderProperty(OracleConstants.PROP_SID_SERVICE, OracleConnectionType.SERVICE.name());
            try (Reader br = new BufferedReader(new FileReader(connectionsFile))) {
                }
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        } else {
        } catch (XMLException e) {
        public void setType(String type) {
    }
public class ConfigImportWizardPageSqlDeveloper extends ConfigImportWizardPage {
            this.serviceName = serviceName;
                importData.addConnection(connectionInfo);
        if (tnsNames != null && tnsNames.containsKey(alias)) {
        }
            return user;
                        if (info.getRole().equals(OracleConnectionRole.SYSDBA.getTitle())
            @Override
                    }
        }
            // if found, return as is

        }

            if (!sqlDevHome.exists()) {
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
            sqlDevHome = new File(homeFolder, "Application Data/" + SQLD_HOME_FOLDER);
import org.jkiss.utils.CommonUtils;
import org.w3c.dom.Element;
            return port;
        File sqlDevHome = new File(homeFolder, "AppData/Roaming/" + SQLD_HOME_FOLDER);
        }

    private void parseJsonConnections(File connectionsFile, ImportData importData) throws JsonSyntaxException {
            this.port = port;

            return name;


import com.google.gson.annotations.SerializedName;

                        }
            return hostname;
        return tnsNamesPath == null ? null : tnsNamesPath + "/" + OCIUtils.TNSNAMES_FILE_PATH;

    private static final Log log = Log.getLog(ConfigImportWizardPageSqlDeveloper.class);

            return tnsNamesPath;

                }
    }
        public void setServiceName(String serviceName) {
                sqlDevHome = new File(homeFolder, ".sqldeveloper"); // On Linux
        }
                if (!CommonUtils.isEmpty(sid)) {
    }
                }
        @SerializedName("OracleConnectionType")

        private String hostname;
                    continue;
import java.io.*;

            public boolean accept(File dir, String name) {
import org.jkiss.dbeaver.Log;
        try {
        if (tnsNames == null) {
        }
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;

                }

                    // for tns connection, connections file will contain network alias 
                    if (CommonUtils.toBoolean(info.getOsAuth())) {
                    for (Element refAddr : XMLUtils.getChildElementList(refAddressesElement, "StringRefAddr")) {
        public String getType() {
        public void setRole(String role) {
                    String dbName = isTnsConnection ? info.getUrl() 
                    return name.contains(SQLD_CONNECTIONS_FOLDER);
    }


        }
                                || info.getRole().equals(OracleConnectionRole.SYSOPER.getTitle())) {
                        connectionInfo.setProviderProperty(OracleConstants.PROP_SID_SERVICE, OracleConnectionType.SID.name());
        }
        // if not found, check tnsAdmin
        @SerializedName("role")
            this.role = role;

            }
                String osAuth = propsMap.get("OS_AUTHENTICATION");
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleConnectionRole;
                public boolean accept(File dir, String name) {
        }
        }
        private String type;
                    }
        setDescription("Import Oracle SQL Developer connections");
        public String getServiceName() {
            throw new DBException("SQL Developer config not found");
                    }
                        : CommonUtils.isEmpty(info.getSID()) ? info.getServiceName() : info.getSID();
                    connectionInfo.setProviderProperty(OracleConstants.PROP_SID_SERVICE, OracleConnectionType.SERVICE.name());
            return type;
            return connectionType;
        private OracleConstants.ConnectionType connectionType;
        private String port;
/*

                }
            return serviceName;

    
                final Map<String, String> propsMap = new LinkedHashMap<>();
                ImportConnectionInfo connectionInfo = new ImportConnectionInfo(oraDriver, null, conName, url, host, port, dbName, user, null);
                            propsMap.put(addrType, addrContent);
                        // be populated after import
        }

            this.OsAuth = OS_AUTHENTICATION;
        }
                }
                        connectionInfo.setProviderProperty(OracleConstants.PROP_INTERNAL_LOGON, info.getRole());

            return customUrl;
        public void setPort(String port) {
                if (!sqlDevHome.exists()) {
    private String getDefaultTnsNamesPath() {
import org.w3c.dom.Document;
            return OsAuth;
        public List<ConnectionDescription> getConnections() {

        @SerializedName("port")
        StringBuilder url = new StringBuilder();
            this.user = user;

        public String getOsAuth() {
        tnsNamesPath = System.getenv(OracleConstants.VAR_TNS_ADMIN);
        private String user;
    public static class ConnectionList {
                parseConnections(connectionsFile, importData);
                    if (CommonUtils.isEmpty(conn.getName())) {
        public String getUrl() {
            return info;
                        connectionInfo.setProviderProperty(OracleConstants.PROP_TNS_PATH, getDefaultTnsNamesPath());
    protected void loadConnections(ImportData importData) throws DBException {
            this.type = type;
                @Override
                if (CommonUtils.isEmpty(host) && CommonUtils.isEmpty(url)) {


            this.connectionType = connectionType;

        File homeFolder = RuntimeUtils.getUserHomeDir();
                        if (!CommonUtils.isEmpty(addrType) && !CommonUtils.isEmpty(addrContent)) {
        public void setUser(String user) {
            tnsNames = OCIUtils.readTnsNames(null, true);
                    connectionInfo.setProviderProperty(OracleConstants.PROP_SID_SERVICE, OracleConnectionType.SID.name());

                        // dbeaver only supports SYSDBA, SYSOPER, and default auth logon roles

        } catch (Exception e) {
                continue;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    continue;
                    // in url field instead of actual url
        private String customUrl;
    }
