import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;

        String scheme = uri.getScheme();
                    }
    private DBPDriver tryFindDriverByToken(String name) {

            }
                Node sshEnabled = allElements.item(++i);
            Map<String, String> dataSourceProps = uuidToDataSourceProps.get(uuidToDataSourceEntry.getKey());
        } catch (Exception e) {
            "",
 *

    public @NotNull ImportConnectionInfo buildIdeaConnectionFromProps(@NotNull Map<String, String> conProps) {
                        driver = driver.getReplacedBy();
        }
    private DataGripDataSourceConfigXmlServiceImpl() {
                dataSourceProps = new HashMap<>();
import java.nio.file.Files;

import java.net.URI;
                String projectConfigPath = getRecentProjectPathFromXml(projectFile);
 * You may obtain a copy of the License at
        }
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConfigurationException;
        List<Path> allPossiblePathToFileFromFolder = getAllExistingPathsToFileFromFolder(pathToIdeaFolder, pathToSshFile);
    public static final DataGripDataSourceConfigXmlServiceImpl INSTANCE = new DataGripDataSourceConfigXmlServiceImpl();
 *
        for (int i = 0; i < optionList.getLength(); i++) {
    private DBPDriver tryExtractDriverByUrl(String url) {
                }
            Map<String, String> mergeValue = uuidToDataSourceFromDifferentXml.get(uuidToDataSourceEntry.getKey());
            List<Path> result = new ArrayList<>();

    private static final Log log = Log.getLog(DataGripDataSourceConfigXmlServiceImpl.class);

    }
            }
        return URI.create(cleanURI);
 * DBeaver - Universal Database Manager

    private Map<String, Map<String, String>> importXML(Path filePath) throws XMLException {
                continue;
        Path pathToDataSourceLocal = Path.of(pathToIdeaFolder, DataGripConfigXMLConstant.IDEA_FOLDER, DataGripConfigXMLConstant.DATASOURCE_LOCAL_XML_FILENAME);

                conProps = uuidToDatasourceProps.getOrDefault(uuidOfNewDataSource, new HashMap<>());
            if (driver == null) {
                .toList();
            }
            if (DataGripConfigXMLConstant.SSH_PROPERTIES_TAG.equals(element.getNodeName())) {
            NamedNodeMap attrs = element.getAttributes();
    }
        return findDriver(scheme, null);
        Document document = XMLUtils.parseDocument(filePath.toAbsolutePath().toString());
    }
        } else {
import java.util.*;
        return RuntimeUtils.getWorkingDirectory(defaultWorkingDirectory.toString());
        String[] split = path.split("\\$/");
                if (driver.getName().equalsIgnoreCase(name) || driver.getId().equalsIgnoreCase(name)
        }
        Path lastModifiedPath = null;

                    while (driverDescriptor.getReplacedBy() != null) {
            defaultWorkingDirectory = Path.of("Application Support", DataGripConfigXMLConstant.JET_BRAINS_HOME_FOLDER);
                if (!CommonUtils.isEmpty(projectConfigPath)) {

}
                Node value = attrs.getNamedItem("value");
        if (indexOf == -1) {
                conProps.put(element.getNodeName(), element.getFirstChild().getNodeValue());
            Map<String, String> sshConfig = sshIdToSshConfigMap.get(sshUuid);
            if (conPropEntry.getKey().startsWith(DataGripConfigXMLConstant.PROPERTIES_TAG + "$")) {
        for (Path path : allPossiblePathToFileFromFolder) {
    }


            sshHandler.setProperty("authType", "AGENT");
            for (DriverDescriptor driver : drivers) {
        List<String> nameTokens = Arrays.stream(name.split("_")).toList();
                connectionInfo.setProperty(conPropEntry.getKey().substring(DataGripConfigXMLConstant.PROPERTIES_TAG.length() + 1), conPropEntry.getValue());
            Map<String, String> config = configEntry.getValue();
        return null;
        uuidToDatasourceProps.put(uuid, conProps);
    @Override
                conProps.put(DataGripConfigXMLConstant.PROPERTIES_TAG + "$" + name, value == null ? "" : value.getNodeValue());
        Path pathToSshFile = Path.of(DataGripConfigXMLConstant.IDEA_OPTIONS_FOLDER, DataGripConfigXMLConstant.SSH_CONFIG_XML_FILENAME);
        }
            for (Path ideaFolder : ideaFolders) {
                    || driver.getName().equalsIgnoreCase(refDriverName)

import org.jkiss.code.NotNull;
            cleanURI = url;
    }
                uuid = attrs.getNamedItem(DataGripConfigXMLConstant.ID_ATTRIBUTE).getNodeValue();
            if (DataGripConfigXMLConstant.SSH_CONFIG_TAG.equals(element.getNodeName())) {

            }
                .filter(Files::isDirectory)
        }
        Map<String, Map<String, String>> uuidToDataSourceProps,


import java.io.File;
                }
        String cleanURI;
    @NotNull
            //SSH_CONFIG_TAG - tag from sshConfig.xml
            //host, port and database will be determinate by url
                    return driver;
            sshHandler.setProperty("authType", "PASSWORD");
            Path path = Path.of(System.getProperty(StandardConstants.ENV_USER_HOME),".config", DataGripConfigXMLConstant.JET_BRAINS_HOME_FOLDER);
            if (dataSourceProps == null) {
import org.jkiss.dbeaver.ui.config.migration.datagrip.DataGripConfigXMLConstant;
            !element.getFirstChild().getNodeValue().isBlank();
        for (Map.Entry<String, Map<String, String>> uuidToDataSourceEntry : uuidToDataSourceProps.entrySet()) {
 * you may not use this file except in compliance with the License.
            conProps.get(DataGripConfigXMLConstant.DATASOURCE_NAME_PATH),
            }

        Map<String, Map<String, String>> uuidToDataSourceFromDifferentXml = importXML(pathToDataSourceLocal);
 * Licensed under the Apache License, Version 2.0 (the "License");
                driver = tryExtractDriverByUrl(conProps.get(DataGripConfigXMLConstant.JDBC_URL_TAG));
 * Copyright (C) 2010-2026 DBeaver Corp and others
            List<DriverDescriptor> drivers = dataSourceProvider.getDrivers();
            null,

            url,
            config.putAll(sshConfig);
        if (RuntimeUtils.isMacOS()) {
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportConnectionInfo;
            sshConfig.putAll(importXML(path));
            Node element = allElements.item(i);
            return result;
                    }
        return uuidToDatasourceProps;
                if (Files.exists(pathToFile)) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
        if (allElements.getLength() == 0) {
            return path;
        configureDriverProperties(connectionInfo, conProps);
        log.debug("load connection: " + connectionInfo);




        uuidToDataSourceProps.putAll(importXML(pathToDataSource));
 */
    }
        NodeList allElements = document.getElementsByTagName("*");
        if (split.length < 2) {
        return System.getProperty(StandardConstants.ENV_USER_HOME) + File.separator + osDependencePath;
    }
                continue;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                || dataSourceProvider.getName().equalsIgnoreCase(name)
    @Override
    private List<Path> getAllExistingPathsToFileFromFolder(String pathToIdeaFolder, Path pathSuffixToFile) throws IOException {
            long lastModifiedMilis = Files.getLastModifiedTime(path).toMillis();

        String jdbcString = "jdbc:";
        connectionInfo.addNetworkHandler(sshHandler);

                return attributes.getNamedItem("value").getNodeValue();
            }
                    result.add(pathToFile);
            }
                    if (Files.exists(projectPath)) {
            Node item = optionList.item(i);
            conProps.get(DataGripConfigXMLConstant.DATASOURCE_UUID_PATH),
public class DataGripDataSourceConfigXmlServiceImpl implements DataGripDataSourceConfigXmlService {
            NamedNodeMap attributes = item.getAttributes();
    public List<Path> tryExtractRecentProjectPath() {
            null,
import org.jkiss.utils.xml.XMLException;
        // * - for getting all element
            if (DataGripConfigXMLConstant.DATASOURCE_TAG.equals(element.getNodeName())) {
        String pathFromUserHome = split[1];
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
            log.warn("Can't extract recent project path for DataGrip", e);

import java.io.IOException;
    }
                uuid = uuidOfNewDataSource;
        if (!CommonUtils.isEmpty(conProps.get(DataGripConfigXMLConstant.SSH_KEY_FILE_PATH))) {
            driverInfo,
        );
import org.jkiss.code.Nullable;
                conProps.put(DataGripConfigXMLConstant.SSH_PROPERTIES_UUID_PATH, sshUuid.getFirstChild().getNodeValue());
        //todo to think about predefined map from idea name to our driver for exceptional case
                    while (driver.getReplacedBy() != null) {
        String osDependencePath = CommonUtils.makeOsDependencePath(pathFromUserHome);
                String name = attrs.getNamedItem("name").getNodeValue();
                if (attr == null) continue;
            }
        DBPDriver driver;
        if (driver == null) {
        sshHandler.setSavePassword(true);
/*
        }


            return "";
            }
    private Map<String, Map<String, String>> tryReadIdeaSshConfig(String pathToJetBrainsHomeDirectory) {
        String url = conProps.get(DataGripConfigXMLConstant.JDBC_URL_TAG);
    }
 * See the License for the specific language governing permissions and
                conProps.put(DataGripConfigXMLConstant.SSH_PROPERTIES_ENABLE_PATH, sshEnabled.getFirstChild().getNodeValue());
        for (Path path : pathToRecentProjectXmlList) {
        Path defaultWorkingDirectory = Path.of(DataGripConfigXMLConstant.JET_BRAINS_HOME_FOLDER);
    }
                Node sshUuid = allElements.item(++i);
            cleanURI = url.substring(indexOf + jdbcString.length());
        sshHandler.setUserName(conProps.get(DataGripConfigXMLConstant.SSH_USERNAME_PATH));
        Map<String, Map<String, String>> uuidToDataSourceProps,
        String refDriverName = conProps.get(DataGripConfigXMLConstant.DRIVER_REF_TAG);
        return lastModifiedPath;
        String uuid = null;
        Document document = XMLUtils.parseDocument(filePath.toAbsolutePath().toString());

                lastModifiedPath = path;
        return List.of();
                maxMilis = lastModifiedMilis;
        return uuidToDataSourceProps;
                conProps = uuidToDatasourceProps.computeIfAbsent(uuid, key -> new HashMap<>());
        long maxMilis = Long.MIN_VALUE;
    }
            for (int j = 0; j < attrs.getLength(); j++) {

        sshHandler.setProperty(DBWHandlerConfiguration.PROP_HOST, conProps.get(DataGripConfigXMLConstant.SSH_HOST_PATH));
    private String replaceUserHomePath(String path) {
    private Map<String, Map<String, String>> mergeTwoMapProps(
        try {

            return result;
        }
                        driverDescriptor = driverDescriptor.getReplacedBy();
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
        return uuidToDataSourceProps;
        }
        return uuidToDataSourceProps;
            List<Path> result = new ArrayList<>();
    public @NotNull Map<String, Map<String, String>> buildIdeaConfigProps(@NotNull String pathToIdeaFolder) throws Exception {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.config.migration.datagrip.api.DataGripDataSourceConfigXmlService;
                    Path projectPath = Path.of(replaceUserHomePath(projectConfigPath));
        }
                String uuidOfNewDataSource = attrs.getNamedItem(DataGripConfigXMLConstant.UUID_ATTRIBUTE).getNodeValue();
        for (Map.Entry<String, String> conPropEntry : conProps.entrySet()) {
    private ImportDriverInfo buildDriverInfo(Map<String, String> conProps) {
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
                Path pathToFile = ideaFolder.resolve(pathSuffixToFile);
            return null;


            String sshUuid = config.get(DataGripConfigXMLConstant.SSH_PROPERTIES_UUID_PATH);
    }
                }
    private void configureDriverProperties(ImportConnectionInfo connectionInfo, Map<String, String> conProps) {


    private void configureSshConfig(ImportConnectionInfo connectionInfo, Map<String, String> conProps) {
            if (lastModifiedMilis > maxMilis) {
        sshHandler.setProperty(DBWHandlerConfiguration.PROP_PORT, conProps.get(DataGripConfigXMLConstant.SSH_PORT_PATH));
        URI uri = parseURL(url);
    }
                String key = String.format("%s.%s", element.getNodeName(), attr.getName());

        }
        NodeList optionList = document.getElementsByTagName(DataGripConfigXMLConstant.OPTION_TAG);
    private Map<String, Map<String, String>> mergeSshConfigToIdeaConfigMap(
        Map<String, Map<String, String>> uuidToDataSourceFromDifferentXml
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
            if (mergeValue != null) {
            List<Path> pathToRecentProjectXmlList = getAllExistingPathsToFileFromFolder(getJetBrainsDirectory(), pathSuffixToFile);
        for (int i = 0; i < allElements.getLength(); i++) {
        }
import org.jkiss.dbeaver.Log;
                if (driver != null) {
                    return driverDescriptor;
        } else if ("OPEN_SSH".equals(conProps.get(DataGripConfigXMLConstant.SSH_CONFIG_AUTH_TYPE))) {
            }
        return new HashMap<>();
        }
            log.warn("Could not read Idea ssh config", e);

        return sshConfig;
    }
                if (name.startsWith(DataGripConfigXMLConstant.INTELIJ_CUSTOM_VALUE)) continue;
                    return driver;
        } catch (Exception e) {
        Map<String, Map<String, String>> sshIdToSshConfigMap = tryReadIdeaSshConfig(getJetBrainsDirectory());
            //can't read ssh config, move on
        return connectionInfo;
            Node nameAttr = attributes.getNamedItem("name");
    }
            return path.toString();
            throw new ImportConfigurationException("No elements found");
import org.jkiss.dbeaver.model.net.DBWUtils;
                dataSourceProps.putAll(mergeValue);

        try (Stream<Path> paths = Files.list(Paths.get(pathToIdeaFolder))) {
            List<Path> ideaFolders = paths
                    uuidToDatasourceProps.put(uuid, conProps);
            }
import org.w3c.dom.*;
        for (Map.Entry<String, Map<String, String>> configEntry : uuidToDataSourceProps.entrySet()) {
 * limitations under the License.
        return null;
        DBWHandlerConfiguration sshHandler = new DBWHandlerConfiguration(sslHD, null);
package org.jkiss.dbeaver.ui.config.migration.datagrip.impl;
    private DBPDriver findDriver(@NotNull String name, @Nullable String refDriverName) {
            if (isNodeHasTextValue(element)) {
            Path pathSuffixToFile = Path.of(DataGripConfigXMLConstant.IDEA_OPTIONS_FOLDER, DataGripConfigXMLConstant.RECENT_PROJECT_XML_FILENAME);
    @Override
        Map<String, Map<String, String>> uuidToDataSourceProps = new HashMap<>();
        int indexOf = url.indexOf(jdbcString);
                }
        }
        ImportConnectionInfo connectionInfo = new ImportConnectionInfo(
            return readIdeaSshConfig(pathToJetBrainsHomeDirectory);
        if (nameTokens.size() > 1) {
        Map<String, Map<String, String>> sshIdToSshConfigMap
        NetworkHandlerDescriptor sslHD = NetworkHandlerRegistry.getInstance().getDescriptor(DBWUtils.SSH_TUNNEL);
            if (nameAttr != null && DataGripConfigXMLConstant.LAST_OPENED_PROJECT_TAG.equals(nameAttr.getNodeValue())) {
        Map<String, Map<String, String>> sshConfig = new HashMap<>();
        sshHandler.setEnabled(true);
    }
            }
                || dataSourceProvider.getId().equalsIgnoreCase(refDriverName)
        String name = conProps.get(DataGripConfigXMLConstant.DATABASE_NAME_PATH);
        List<DataSourceProviderDescriptor> dataSourceProviders = dataSourceProviderRegistry.getDataSourceProviders();
        }
        }
                    || driver.getId().equalsIgnoreCase(refDriverName)) {
 *

    private String getJetBrainsDirectory() {
        for (DataSourceProviderDescriptor dataSourceProvider : dataSourceProviders) {
            }
    }
    }

                        result.add(projectPath);
import org.jkiss.utils.CommonUtils;
        try {
import org.jkiss.dbeaver.ui.config.migration.wizards.ImportDriverInfo;
        Map<String, Map<String, String>> uuidToDatasourceProps = new HashMap<>();
        Path pathToDataSource = Path.of(pathToIdeaFolder, DataGripConfigXMLConstant.IDEA_FOLDER, DataGripConfigXMLConstant.DATASOURCE_XML_FILENAME);
                || dataSourceProvider.getName().equalsIgnoreCase(refDriverName)) {
    ) {
        return element.hasChildNodes() && element.getChildNodes().getLength() > 0 &&
            }
            driver = tryFindDriverByToken(name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return "";
            }
            sshHandler.setProperty("keyPath", conProps.get(DataGripConfigXMLConstant.SSH_KEY_FILE_PATH));
 * Unless required by applicable law or agreed to in writing, software
        return new ImportDriverInfo(driver);
import java.nio.file.Path;
    private Map<String, Map<String, String>> readIdeaSshConfig(String pathToIdeaFolder) throws Exception {
import java.util.stream.Stream;

        ImportDriverInfo driverInfo = buildDriverInfo(conProps);
            ""
        configureSshConfig(connectionInfo, conProps);
            if (dataSourceProvider.getId().equalsIgnoreCase(name)
        if (optionList.getLength() == 0) {
            }
    private String getRecentProjectPathFromXml(Path filePath) throws IOException, XMLException {
                    DriverDescriptor driverDescriptor = drivers.get(0);

            if (DataGripConfigXMLConstant.PROPERTIES_TAG.equals(element.getNodeName())) {
        if (name == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Path getMostRecentFile(List<Path> pathToRecentProjectXmlList) throws IOException {
                conProps.put(key, attr.getValue());
        uuidToDataSourceProps = mergeTwoMapProps(uuidToDataSourceProps, uuidToDataSourceFromDifferentXml);
        }
    }
            }
        sshHandler.setProperty("implementation", "sshj");
    private static boolean isNodeHasTextValue(Node element) {
        DataSourceProviderRegistry dataSourceProviderRegistry = DataSourceProviderRegistry.getInstance();
import org.jkiss.utils.StandardConstants;
            log.info("Using linux path for import config home directory: " + path);
            //SSH_PROPERTIES_TAG - tag from dataSourceLocal.xml
        }
        }
        } else if (RuntimeUtils.isLinux()){
    ) {
                }
                }
            sshHandler.setProperty("authType", "PUBLIC_KEY");

        Map<String, String> conProps = new HashMap<>();

    }
            for (String nameToken : nameTokens) {
    }
                if (uuid != null) {
                driver = findDriver(nameToken, null);
            }
        }
import org.jkiss.utils.xml.XMLUtils;
            conProps.get(DataGripConfigXMLConstant.USERNAME_PATH),
        }
                if (!drivers.isEmpty()) {
        DBPDriver driver = findDriver(name, refDriverName);
            for (Path projectFile : pathToRecentProjectXmlList) {
                log.warn("Unexpectedly haven't found data source properties for " + uuidToDataSourceEntry.getKey());
        } else {
        uuidToDataSourceProps = mergeSshConfigToIdeaConfigMap(uuidToDataSourceProps, sshIdToSshConfigMap);
import java.nio.file.Paths;
    private URI parseURL(String url) {
                    }
                Attr attr = (Attr) attrs.item(j);
            if (sshConfig == null) {
