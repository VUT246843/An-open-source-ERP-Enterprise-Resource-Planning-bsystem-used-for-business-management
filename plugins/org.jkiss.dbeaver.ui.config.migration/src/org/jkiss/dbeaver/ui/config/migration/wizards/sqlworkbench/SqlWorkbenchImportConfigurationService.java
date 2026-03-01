    private void configureSsh(Element parameterValues, ImportConnectionInfo connectionInfo) {
        String sshUserName = getElementValueOrEmptyString(parameterValues, "sshUserName");
            return;
            sslHandler.setEnabled(true);
    private final Set<String> keyWords;
        if (matcher.matches()) {
        }
        String userName = getElementValueOrEmptyString(parameterValues, "userName");
        return null;

}
 * you may not use this file except in compliance with the License.
            null);
    private void configureDriverProperties(Element parameterValues, ImportConnectionInfo connectionInfo) {
            hostName,
        String isSslOff = "0";
    private SqlWorkbenchImportConfigurationService() {

        configureSsh(parameterValues, connectionInfo);
        String sslCA = getElementValueOrEmptyString(parameterValues, "sslCA");
    }
            importData.addConnection(parseConnection(conElement));

            .findAny()
        String hostName = getElementValueOrEmptyString(parameterValues, "hostName");
        }
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
        ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
        String driverModel = split[split.length - 1];
 */
        sshHandler.setEnabled(true);
                () -> mysqlDriver = new ImportDriverInfo(
 *

        for (Element element : XMLUtils.getChildElementList(parameterValues)) {
            null,
    public static final SqlWorkbenchImportConfigurationService INSTANCE = new SqlWorkbenchImportConfigurationService();
        NetworkHandlerDescriptor sslHD = NetworkHandlerRegistry.getInstance().getDescriptor(DBWUtils.SSH_TUNNEL);
            alias,
                    dbpDriver.getId(),
            }
        sshHandler.setProperty(DBWHandlerConfiguration.PROP_PORT, sshPort);
    }
import org.jkiss.utils.xml.XMLException;
            null,
import org.w3c.dom.Element;

import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
import java.util.Set;
            return;
        } else {
        String idMysql = "mysql8";
        if (conElement == null) {
        if (conElement == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBWHandlerConfiguration sshHandler = new DBWHandlerConfiguration(sslHD, null);
    @Nullable
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConfigurationException;
            if (!keyWords.contains(element.getAttribute("key"))) {
        Element element = getElemByNameAndTagKeyValue(conElement, keyValue);
        return XMLUtils.getElementBody(element);
            sshHandler.setProperty(SSHConstants.PROP_KEY_PATH, sshKeyFile);
        NetworkHandlerDescriptor sslHD = NetworkHandlerRegistry.getInstance().getDescriptor("mysql_ssl");
        if (parameterValues == null) {
import org.jkiss.utils.xml.XMLUtils;
        connectionInfo.addNetworkHandler(sslHandler);

/*
import org.jkiss.code.NotNull;
        sslHandler.setProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT, sslCA);
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(SqlWorkbenchImportConfigurationService.class);
                    dbpDriver.getDriverClassName()),
            return "";
import org.jkiss.dbeaver.model.impl.net.SSLHandlerTrustStoreImpl;
            mysqlDriver,
    public void importXML(ImportData importData, Reader reader) throws XMLException {
            userName,
                    idMysql,
    private void configureAuthType(Element conElement, Element parameterValues, ImportConnectionInfo connectionInfo) {
        sslHandler.setProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT, sslCert);
        } else {
        String sshKeyFile = getElementValueOrEmptyString(parameterValues, "sshKeyFile");

        }
        if (element == null) {
        }
    private ImportConnectionInfo parseConnection(Element conElement) {
        String driver = getElementValueOrEmptyString(conElement, "driver");
                return element;
        }
    }
        String sslKey = getElementValueOrEmptyString(parameterValues, "sslKey");
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at

        String port = getElementValueOrEmptyString(parameterValues, "port");
        configureAuthType(conElement, parameterValues, connectionInfo);
 *

        String sshHost = getElementValueOrEmptyString(parameterValues, "sshHost");
import org.w3c.dom.Document;
 *
        Document document = XMLUtils.parseDocument(reader);
            sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PASSWORD);
            "krb5cache", "mysqlplugindir");

    private final Pattern urlPattern = Pattern.compile("^(?<host>[a-zA-Z0-9.-]+):(?<port>\\d+)$");
    private ImportDriverInfo mysqlDriver;
import org.jkiss.dbeaver.model.net.ssh.SSHConstants;
        if (CommonUtils.isNotEmpty(krbPathConfig)) {
            .filter(dbpDriver -> dbpDriver.getId().equals(idMysql))
        sslHandler.setProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY, sslKey);
            .iterator().next());
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        configureDriverProperties(parameterValues, connectionInfo);
        }
        sslHandler.setProperty("ssl.cipher.suites", sslCipher);

            return null;

            sslHandler.setEnabled(false);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (kerberosDriverTypes.contains(driverModel)) {
package org.jkiss.dbeaver.ui.config.migration.wizards.sqlworkbench;

        sshHandler.setUserName(sshUserName);
    private final Set<String> kerberosDriverTypes = Set.of("ldap_kerberos", "ldap_sasl_kerberos");
            return "";

        }
import java.util.Collection;
        configureSsl(parameterValues, connectionInfo);
                    "com.mysql.cj.jdbc.Driver"));
 * DBeaver - Universal Database Manager
            "sshPassword", "sshUserName", "sslCA", "sslCert", "sslCipher", "sslKey", "useSSL", "userName", "kerberosMode", "krb5",
                }
                    "MySQL",
    //for matching like: db1.dev.dbeaver.com:22
        }

    }
        String krbPathConfig = getElementValueOrEmptyString(parameterValues, "krb5");
    private String getElementValueOrEmptyString(@Nullable Element conElement, @NotNull String keyValue) {
    }
                String driverPropertyValue = XMLUtils.getElementBody(element);
            connectionInfo.setAuthProperty("krb5.conf.path", krbPathConfig);
public class SqlWorkbenchImportConfigurationService {

            sshHandler.setProperty(SSHConstants.PROP_AUTH_TYPE, SSHConstants.AuthType.PUBLIC_KEY);
    }
    }
        }


        }
            port,
        Element parameterValues = getElemByNameAndTagKeyValue(conElement, "parameterValues");
    }
        }
            sshHost = matcher.group("host");
import java.io.Reader;
 * See the License for the specific language governing permissions and
        String sslCipher = getElementValueOrEmptyString(parameterValues, "sslCipher");
        sshHandler.setSavePassword(true);
    private Element getElemByNameAndTagKeyValue(@Nullable Element conElement, String keyValue) {
                    dbpDriver.getSampleURL(),

                if (CommonUtils.isNotEmpty(driverPropertyValue)) {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
        if (CommonUtils.isEmpty(sshHost)) {
 * limitations under the License.
        sshHandler.setProperty(SSHConstants.PROP_IMPLEMENTATION, "sshj");
        for (Element element : XMLUtils.getChildElementList(conElement)) {
        DriverUtils.getAllDrivers().stream()
    @Nullable
import org.jkiss.dbeaver.model.net.DBWUtils;
        keyWords = Set.of("", "hostName", "password", "port", "schema", "sshCompressionLevel", "sshHost", "sshKeyFile",
        connectionInfo.addNetworkHandler(sshHandler);
        if (!CommonUtils.isEmpty(sshKeyFile)) {
import org.jkiss.utils.CommonUtils;

            null,
        if (isSslOff.equals(getElementValueOrEmptyString(parameterValues, "useSSL"))) {

        for (Element conElement : allElements) {
            throw new ImportConfigurationException("Can't find parameterValues tag in the xml");


        return connectionInfo;
                    connectionInfo.setProperty(element.getAttribute("key"), driverPropertyValue);

            log.warn("Can't find driver tag in the xml");
import java.util.regex.Matcher;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportData;
                    dbpDriver.getName(),
import java.util.regex.Pattern;
        String[] split = driver.split("\\.");
            .ifPresentOrElse(dbpDriver -> mysqlDriver = new ImportDriverInfo(
                    "jdbc:mysql://{host}[:{port}]/[{database}]",
        }
        Matcher matcher = urlPattern.matcher(sshHost);
            connectionInfo.setAuthModelId("mysql_krb5");
        String alias = getElementValueOrEmptyString(conElement, "name");
        DBWHandlerConfiguration sslHandler = new DBWHandlerConfiguration(sslHD, null);
        }
 * Unless required by applicable law or agreed to in writing, software
    private void configureSsl(Element parameterValues, ImportConnectionInfo connectionInfo) {
            if (keyValue.equals(element.getAttribute("key"))) {

import org.jkiss.dbeaver.registry.driver.DriverUtils;
        Collection<Element> allElements = XMLUtils.getChildElementList(XMLUtils.getChildElementList(document.getDocumentElement())
            sshPort = matcher.group("port");
        String sshPort = null;
        if (driver == null) {
        sshHandler.setProperty(DBWHandlerConfiguration.PROP_HOST, sshHost);
            }
    }
        String sslCert = getElementValueOrEmptyString(parameterValues, "sslCert");
