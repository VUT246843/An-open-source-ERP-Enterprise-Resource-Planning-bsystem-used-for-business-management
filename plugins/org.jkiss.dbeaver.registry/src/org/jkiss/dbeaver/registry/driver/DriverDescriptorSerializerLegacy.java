                            xml.addAttribute(RegistryConstants.ATTR_DISABLED, true);
                xml.addAttribute(RegistryConstants.ATTR_ANONYMOUS, driver.isAnonymousAccess());
                            int versionMatch = VersionUtils.compareVersions(version, preferredVersion);
            if (!CommonUtils.isEmpty(driver.getDescription())) {
 * Unless required by applicable law or agreed to in writing, software
                xml.addAttribute(RegistryConstants.ATTR_PROPAGATE_DRIVER_PROPERTIES, driver.isPropagateDriverProperties());
                    } else {
                                        .getAbsolutePath();
                case RegistryConstants.TAG_DRIVER: {
                    value = value.substring(0, value.length() - PATH_VERSION_OBSOLETE_RELEASE.length()) + ":" + MavenArtifactReference.VERSION_PATTERN_RELEASE;
                                        String normalizedFilePath = file.getFile().toString();
                                for (DriverFileInfo file : files) {
                    String disabledAttr = attributes.getValue(RegistryConstants.ATTR_DISABLED);
                            }

            }
        DriverLoaderDescriptor curDriverLoader;
                    break;
                    xml.addAttribute(RegistryConstants.ATTR_PATH, location.getPath().getAbsolutePath());
                    String loaderId = attributes.getValue("loader");
public class DriverDescriptorSerializerLegacy extends DriverDescriptorSerializer {
                    } else if (lib == null) {
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                if (provider.isTemporary()) {
                                        if (isDistributed) {
                        }
        xml.setBeautify(true);
            if (!CommonUtils.isEmpty(driver.getDefaultUser())) {
                    }
 */
            throws IOException {
                    if (attributes.getValue(RegistryConstants.ATTR_USE_URL_TEMPLATE) != null) {
                                continue;
                            curDriver.setConnectionProperty(paramName, paramValue);
                        curDriver.setSampleURL(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_URL), curDriver.getSampleURL()));
                    if (!isDistributed && !providedDrivers && !custom && lib == null) {
                    }
            }
                        if (!Objects.equals(DriverLoaderDescriptor.DEFAULT_LOADER_ID, driverLoader.getLoaderId())) {
                            }
            for (Map.Entry<String, Object> paramEntry : driver.getCustomParameters().entrySet()) {
                                            normalizedFilePath = DriverUtils.getDistributedLibraryPath(file.getFile()).replace('\\', '/');
                                        if (!CommonUtils.isEmpty(file.getVersion())) {
                List<DriverDescriptor> drivers = provider.getDrivers().stream().filter(DriverDescriptor::isModified)
                        } else {
                            lib.setDisabled(false);
                        mvnLibrary.setForcedVersion(CommonUtils.toBoolean(attributes.getValue("forced-version")));
import org.jkiss.utils.xml.XMLBuilder;
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {

                                log.warn("Datasource provider '" + providerId + "' not found. Bad driver description.");
                            }
            }
                    curProvider = null;

                    if (CommonUtils.isEmpty(idAttr)) {
            if (!CommonUtils.isEmpty(driver.getDriverClassName())) {
            }
                        }
                                            continue;
            if (value.startsWith(DriverLibraryMavenArtifact.PATH_PREFIX)) {
            if (!CommonUtils.isEmpty(driver.getDefaultServer())) {
        }
                    if (providedDrivers || curProvider.isDriversManageable()) {
                        }

                    boolean custom = CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_CUSTOM), true);
                xml.addAttribute(RegistryConstants.ATTR_CUSTOM_DRIVER_LOADER, driver.isCustomDriverLoader());
                        if (!CommonUtils.isEmpty(paramName) && !CommonUtils.isEmpty(paramValue)) {
                    if (curProvider == null) {
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
                        for (DBPDriverLibraryProvider dlp : libraryProviders) {
                    String disabledAttr = attributes.getValue(RegistryConstants.ATTR_DISABLED);
                            log.warn("Driver loader '" + loaderId + "' not found for driver '" + curDriver.getFullId() + "'");
                            log.warn("Auth model '" + loaderId + "' not found");
                        curDriver.setUseURL((
                }
                        }
                        curDriver.setThreadSafeDriver(CommonUtils.getBoolean(attributes.getValue("threadSafe"), curDriver.isThreadSafeDriver()));
                        }
                    break;
                        }
                                log.warn("Empty path for library file");
import org.jkiss.dbeaver.utils.GeneralUtils;
                        final String paramName = attributes.getValue(RegistryConstants.ATTR_NAME);
                                        }
                        }
        DBPDriverLibrary curLibrary;
                        lib.setDisabled(true);
                                    }
        private boolean isLibraryUpgraded = false;
                                            var workspaceFolder = DBWorkbench
            }
            }
                    }
                }
                    if (!CommonUtils.isEmpty(libraryProviders)) {
                        String providerId = attributes.getValue(RegistryConstants.ATTR_PROVIDER);
                        if (lib.isEmbedded()) {
            if (!CommonUtils.isEmpty(driver.getDefaultDatabase())) {
        }
        private static final String PATH_VERSION_OBSOLETE_RELEASE = ":release";
        DriverDescriptor curDriver;
                            xml.addAttribute("loader", driverLoader.getLoaderId());
                                        attributes.getValue(RegistryConstants.ATTR_VERSION),
            // Client homes
import org.jkiss.dbeaver.utils.VersionUtils;
                    }
            }
                }
        public DriversParser(boolean provided) {
                }
                        curDriver.setDescription(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_DESCRIPTION), curDriver.getDescription()));
                        if (lib.isDisabled()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        }
                        curDriver.disabledAllDefaultLibraries();
                        log.warn("No id for driver provider");
                                        );
    private static final boolean isDistributed = DBWorkbench.isDistributed();
                                DriverFileInfo info = new DriverFileInfo(
                                        // check if we need to store local file in storage
                    try (XMLBuilder.Element ignored1 = xml.startElement(RegistryConstants.TAG_PROPERTY)) {
import java.io.IOException;
                    curLibrary = lib;

                                }
                    if (attributes.getValue(RegistryConstants.ATTR_SUPPORTS_DISTRIBUTED_MODE) != null) {
                xml.addAttribute(RegistryConstants.ATTR_DISABLED, true);
                        curDriver.setDriverDefaultPort(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_PORT), curDriver.getDefaultPort()));
                                    var workspaceFolder = DBWorkbench
                                                .getAbsolutePath();
                    }
                            if (curProvider == null && !isDetachedProcess) {
                                            log.warn("File missing in " + file.getId());
                    String version = attributes.getValue(RegistryConstants.ATTR_VERSION);
                    curDriver = curProvider.getDriver(idAttr);
                xml.addAttribute(RegistryConstants.ATTR_DEFAULT_DATABASE, driver.getDefaultDatabase());


                        if (curProvider == null) {
                                            xml.addAttribute(RegistryConstants.ATTR_VERSION, file.getVersion());
                xml.addAttribute(RegistryConstants.ATTR_DEFAULT_SERVER, driver.getDefaultServer());
    public static class DriversParser implements SAXListener {
import org.jkiss.dbeaver.Log;
                        curDriver.setDriverClassName(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_CLASS), curDriver.getDriverClassName()));
                    break;

                }
                if (driver.isCustom() || !CommonUtils.equalObjects(paramEntry.getValue(), driver.getDefaultParameters().get(paramEntry.getKey()))) {
import org.jkiss.utils.CommonUtils;
                case RegistryConstants.TAG_PROVIDER: {
            switch (localName) {
                        }
                        }
                    if (attributes.getValue(RegistryConstants.ATTR_CUSTOM_DRIVER_LOADER) != null) {
import java.nio.file.Path;
                                curDriverLoader.addLibraryProvider(libProvider);
    }
                        }
import java.util.stream.Collectors;
            Map<DBPDriverLoader, List<? extends DBPDriverLibrary>> libraries = new LinkedHashMap<>();
                    }

                                        if (file.getFileCRC() != 0) {
import org.jkiss.utils.xml.SAXReader;
                }
 *
            if (driver.isAnonymousAccess()) {
                            }
            if (!CommonUtils.isEmpty(driver.getCategory())) {

                        curDriver.setCustomDriverLoader((
                                }
                        {
    private static final Log log = Log.getLog(DriverDescriptorSerializerLegacy.class);
                                            // we need to relativize path and exclude path variables in config file
                    }
            }
                    List<DBPDriverLibraryProvider> libraryProviders = loader.getLibraryProviders();
                                        .getPlatform().getWorkspace()
                            List<DriverFileInfo> files = dld.getResolvedFiles().get(lib);
                    }
        try (var ignored = xml.startElement(RegistryConstants.TAG_DRIVERS)) {
                        return;
                            if (!curDriverLoader.getLibraryProviders().contains(libProvider)) {
                case RegistryConstants.TAG_PROPERTY: {
                                    long crc = Long.parseLong(crcString, 16);
import org.jkiss.utils.IOUtils;
                        if (providedDrivers || curDriver.isCustom()) {
                if (drivers.isEmpty()) {
                                    if (!IOUtils.isFileFromDefaultFS(workspaceFolder)) {
            if (!driver.isInstantiable()) {
            }
                                            // relativize path to workspace folder because in external fs path
                }
                        if (!CommonUtils.isEmpty(lib.getPreferredVersion())) {
                        // Perhaps this library isn't included in driver bundle
                    }
                        curProvider.addDriver(curDriver);
                        //log.debug("Skip obsolete custom library '" + path + "'");
                }
                        final String paramValue = attributes.getValue(RegistryConstants.ATTR_VALUE);
                                xml.addAttribute("forced-version", true);
                        mvnLibrary.setLoadOptionalDependencies(CommonUtils.toBoolean(attributes.getValue("load-optional-dependencies")));
                            CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_SUPPORTS_DISTRIBUTED_MODE), true)));
                        if (!CommonUtils.isEmpty(paramName)) {
                        return;
                        // so let's just skip it
                } else {
                        curDriver.setDriverDefaultServer(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_DEFAULT_SERVER), curDriver.getDefaultServer()));
                        path = replacePathVariables(path);
                            log.warn("Datasource provider '" + idAttr + "' not found. Bad provider description.");
import org.xml.sax.Attributes;
                        curDriver.setPropagateDriverProperties(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_PROPAGATE_DRIVER_PROPERTIES), curDriver.isPropagateDriverProperties()));
                                        filePath = workspaceFolder.resolve(path);
                        curDriver.setAnonymousAccess(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_ANONYMOUS), curDriver.isAnonymousAccess()));
                            if (!(driverLoader instanceof DriverLoaderDescriptor dld)) {
                    continue;
                    // Save custom parameters for custom drivers. It can help with PG drivers, as example (we must store serverType for PG-clones).
                        }

 * DBeaver - Universal Database Manager
                    libraries.put(loader, driver.getDriverLibraries());
            if (!CommonUtils.isEmpty(driver.getSampleURL())) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        DBPDriverLibraryProvider libProvider = DataSourceProviderRegistry.getInstance().getAuthModel(loaderId);

                            }
                xml.addAttribute(RegistryConstants.ATTR_DEFAULT_USER, driver.getDefaultUser());
                                        curLibrary.getType(),
                            curProvider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(providerId);
                    if (curDriver != null) {
        @Override
                xml.addAttribute(RegistryConstants.ATTR_EMBEDDED, driver.isEmbedded());
                        if (!CommonUtils.isEmpty(version) && lib instanceof DriverLibraryMavenArtifact mavenLib) {
                        xml.addAttribute(RegistryConstants.ATTR_VALUE, CommonUtils.toString(propEntry.getValue()));
                        if (!CommonUtils.isEmpty(category)) {
            }
                    if (curDriverLoader == null) {
    }
                                        }
            }
                                xml.addAttribute("ignore-dependencies", true);

                            xml.addAttribute(RegistryConstants.ATTR_EMBEDDED, true);
                        xml.addAttribute(RegistryConstants.ATTR_CUSTOM, lib.isCustom());
                    }
                xml.addAttribute(RegistryConstants.ATTR_DESCRIPTION, driver.getDescription());
                        curDriver.setInstantiable(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_INSTANTIABLE), curDriver.isInstantiable()));
                    }
                                        xml.addAttribute(RegistryConstants.ATTR_ID, file.getId());
                        if (lib.isDisabled()) {
            }
            }
import org.jkiss.utils.xml.SAXListener;
                            } else {
                                            // may contain additional information like a bucket name
                        if (loaderId != null) {
        }
                    String path = normalizeLibraryPath(attributes.getValue(RegistryConstants.ATTR_PATH));
                        curDriver.setAllowsEmptyPassword(CommonUtils.getBoolean(attributes.getValue("allowsEmptyPassword"), curDriver.isAllowsEmptyPassword()));
                    String idAttr = attributes.getValue(RegistryConstants.ATTR_ID);
            // Parameters
                        curDriver.setSupportsDistributedMode((
                            String preferredVersion = CommonUtils.toString(lib.getPreferredVersion(), "0");
                xml.addAttribute(RegistryConstants.ATTR_CLASS, driver.getDriverClassName());
                    DBPDriverLoader driverLoader = libEntry.getKey();
                        if (lib instanceof DriverLibraryMavenArtifact mavenArtifact) {
            }
                                    && DBWorkbench.getPlatform().getApplication().isMultiuser()
            if (driver.isAllowsEmptyPassword()) {
                            if (mavenArtifact.isForcedVersion()) {
                    for (DriverDescriptor driver : drivers) {
            }
                            curDriver.setCategory(category);
                    }
            }
    public void serializeDrivers(OutputStream os, List<DataSourceProviderDescriptor> providers) throws IOException {
import org.jkiss.dbeaver.registry.maven.MavenArtifactReference;
                    if (curDriver != null) {
                                attributes.getValue(RegistryConstants.ATTR_PATH)));
                    xml.addAttribute(RegistryConstants.ATTR_ID, provider.getId());
                if (value.endsWith(PATH_VERSION_OBSOLETE_RELEASE)) {
                                xml.addAttribute("load-optional-dependencies", true);
                                    }
                        curDriver.addNativeClientLocation(
                case RegistryConstants.TAG_PARAMETER: {
                        }
                    continue;

                                            substitutePathVariables(pathSubstitutions, normalizedFilePath)
                        serializeDriver(xml, driver);
                            CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_USE_URL_TEMPLATE), true)));
        }

                        }
import java.util.*;
                    String typeStr = attributes.getValue(RegistryConstants.ATTR_TYPE);
                    break;
                    }
        @Override
                                Path filePath = Path.of(path);
                                // Version in config higher than in bundles. Probably a manual update - just overwrite it.
import java.io.OutputStream;
                        }
                                mavenLib.setPreferredVersion(version);
 * You may obtain a copy of the License at
                        xml.addAttribute(RegistryConstants.ATTR_NAME, paramEntry.getKey());
                            if (mavenArtifact.isIgnoreDependencies()) {
                        curDriverLoader = curDriver.getDefaultDriverLoader();
import org.jkiss.code.NotNull;
            }
                            // (DriverLoaderDescriptor#getAllLibraries)
        }
/**
                            CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_CUSTOM_DRIVER_LOADER), false)));
            if (!CommonUtils.isEmpty(driver.getDefaultPort())) {
                    isLibraryUpgraded = false;
                    try (XMLBuilder.Element ignored1 = xml.startElement(RegistryConstants.TAG_LIBRARY)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (lib != null && CommonUtils.getBoolean(disabledAttr)) {
                            }
 * you may not use this file except in compliance with the License.
                                // Version in config is lower than in bundle. Probably it came from product version update - just reset it.
        private final boolean providedDrivers;
import org.jkiss.code.Nullable;
                case RegistryConstants.TAG_CLIENT_HOME:

                        if (loaderId == null) {
                                        if (file.getFile() == null) {
                                String crcString = attributes.getValue("crc");
                xml.addAttribute("allowsEmptyPassword", driver.isAllowsEmptyPassword());

            return value;
                    }
                                        if (!IOUtils.isFileFromDefaultFS(file.getFile()) && file.getFile().isAbsolute()) {
                xml.addAttribute(RegistryConstants.ATTR_CATEGORY, driver.getCategory());
        // TODO: support of 3.5.1 -> 3.5.2 maven dependencies migration
                }
        Map<String, String> pathSubstitutions = getPathSubstitutions();
                                    if (crc != 0) {
                    String idAttr = attributes.getValue(RegistryConstants.ATTR_ID);
                        }
            // Libraries
                    }
                        curDriver.setDisabled(true);
                                            RegistryConstants.ATTR_PATH,
                    }

                                    try (XMLBuilder.Element ignored2 = xml.startElement(RegistryConstants.TAG_FILE)) {
                    break;
                    }
                            }
                }
                    if (curDriver == null) {
                        final String paramName = attributes.getValue(RegistryConstants.ATTR_NAME);
            for (DBPDriverLoader loader : driver.getAllDriverLoaders()) {
                                    filePath, path
            // Properties
                            }
                xml.addAttribute("threadSafe", driver.isThreadSafeDriver());
import org.jkiss.dbeaver.registry.RegistryConstants;
            }
                                        info.setFileCRC(crc);
                    break;
    private static final boolean isDetachedProcess = DBWorkbench.getPlatform().getApplication().isDetachedProcess();
                    DBPDriverLibrary lib = curDriver.getDriverLibrary(path);
                        libraries.put(loader, additionalLibraries);
                        List<DBPDriverLibrary> additionalLibraries = new ArrayList<>();
                case RegistryConstants.TAG_LIBRARY: {
                xml.addAttribute(RegistryConstants.ATTR_SUPPORTS_DISTRIBUTED_MODE, driver.isSupportsDistributedMode());
                    xml.addAttribute(RegistryConstants.ATTR_ID, location.getName());
                        lib = DriverLibraryAbstract.createFromPath(curDriver, type, path, version);
                    if (curDriver == null) {
import org.jkiss.dbeaver.ModelPreferences;
    public static final String DRIVERS_FILE_NAME = "drivers.xml"; //$NON-NLS-1$
            for (Map.Entry<String, Object> propEntry : driver.getConnectionProperties().entrySet()) {
        }
                                        }
                        type = DBPDriverLibrary.FileType.jar;
            xml.addAttribute(RegistryConstants.ATTR_CUSTOM, driver.isCustom());
                            return;
 *
                                                .getPlatform().getWorkspace()
        xml.flush();
            for (Map.Entry<DBPDriverLoader, List<? extends DBPDriverLibrary>> libEntry : libraries.entrySet()) {
                        }
                            path = replacePathVariables(path);
                                if ((curDriver.isCustom() || curLibrary.isDownloadable())

                    try (XMLBuilder.Element ignored1 = xml.startElement(RegistryConstants.TAG_PARAMETER)) {
                    } else if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
                                        }
                    curDriver.setModified(true);
            for (DataSourceProviderDescriptor provider : providers) {
                        }
            }

            }
                    if (curDriver != null && curLibrary != null && curDriverLoader != null && !isLibraryUpgraded) {
            if (driver.isEmbedded()) {
 * DriverDescriptorSerializerLegacy
                }
                            if (mavenArtifact.isLoadOptionalDependencies()) {

            if (driver.isPropagateDriverProperties()) {
                        String category = attributes.getValue(RegistryConstants.ATTR_CATEGORY);
 *
                    .collect(Collectors.toList());
                    if (CommonUtils.isEmpty(typeStr)) {
                        xml.addAttribute(RegistryConstants.ATTR_TYPE, lib.getType().name());
                    if (loaderId != null) {
                            if (files != null) {
                        xml.addAttribute(RegistryConstants.ATTR_NAME, propEntry.getKey());
                        xml.addAttribute(RegistryConstants.ATTR_PATH, substitutePathVariables(pathSubstitutions, lib.getPath()));
                                curDriverLoader.addLibraryFile(curLibrary, info);
                                if (!CommonUtils.isEmpty(crcString)) {
            }

                            xml.addAttribute(RegistryConstants.ATTR_VERSION, lib.getPreferredVersion());
                                    }
                }

                                isLibraryUpgraded = true;
            this.providedDrivers = provided;
                            if (CommonUtils.isEmpty(path)) {
            if (!CommonUtils.isEmpty(driver.getCategories())) {
                    if (CommonUtils.getBoolean(disabledAttr)) {
                    if (!CommonUtils.isEmpty(path)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
                    if (lib instanceof DriverLibraryMavenArtifact mvnLibrary) {
package org.jkiss.dbeaver.registry.driver;
                    }

                xml.addAttribute(RegistryConstants.ATTR_PORT, driver.getDefaultPort());

                        if (path != null) {
                    curProvider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(idAttr);
                            new LocalNativeClientLocation(
            if (driver.isCustomDriverLoader()) {

import org.jkiss.dbeaver.runtime.DBWorkbench;
                            if (!isDetachedProcess) {
    }
                    }
                                        }
            }
            }
            if (localName.equals(RegistryConstants.TAG_LIBRARY)) {
 * limitations under the License.
                }
                    if (curProvider == null) {
                            // Overwrite version only if it is higher than the original one
                        if (libProvider == null) {
        @Override
                                            normalizedFilePath = workspaceFolder.relativize(file.getFile()).toString();
                if (loader == driver.getDefaultDriverLoader()) {
                    curDriver = null;
                        String path = attributes.getValue(RegistryConstants.ATTR_PATH);
        XMLBuilder xml = new XMLBuilder(os, GeneralUtils.UTF8_ENCODING);
                            // library was enabled in config file
                        return;
                    }
                        curDriver.resetDriverInstance();
                            additionalLibraries.addAll(dlp.getDriverLibraries());
 *     http://www.apache.org/licenses/LICENSE-2.0
                xml.addAttribute(RegistryConstants.ATTR_URL, driver.getSampleURL());
                        if (!CommonUtils.isEmpty(providerId)) {
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
                        final String paramValue = attributes.getValue(RegistryConstants.ATTR_VALUE);
                            } else if (versionMatch < 0 && DBWorkbench.getPlatform().getPreferenceStore()
                    break;
                            if (versionMatch > 0 || mavenLib.isForcedVersion()) {
                            // Driver library will be loaded from the custom library provider if a loader is defined
    // In detached process we usually have just one driver
                        curDriver.setEmbedded(CommonUtils.getBoolean(attributes.getValue(RegistryConstants.ATTR_EMBEDDED), curDriver.isEmbedded()));
                    }
                    }
                    }
                        // Or this is predefined library from some previous version - as it wasn't defined in plugin.xml
                try (XMLBuilder.Element ignored1 = xml.startElement(RegistryConstants.TAG_CLIENT_HOME)) {
                            curDriver.setDriverParameter(paramName, paramValue, false);
                                }
                        mvnLibrary.setIgnoreDependencies(CommonUtils.toBoolean(attributes.getValue("ignore-dependencies")));
                            log.warn("Library outside of driver (" + attributes.getValue(RegistryConstants.ATTR_PATH) + ")");
                    }
 */
                try (var ignored2 = xml.startElement(RegistryConstants.TAG_PROVIDER)) {
}
                drivers.removeIf(driverDescriptor -> driverDescriptor.getReplacedBy() != null);
                        curDriver.setDriverDefaultUser(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_DEFAULT_USER), curDriver.getDefaultUser()));
        private static String normalizeLibraryPath(String value) {
                if (!CommonUtils.equalObjects(propEntry.getValue(), driver.getDefaultConnectionProperties().get(propEntry.getKey()))) {
 * See the License for the specific language governing permissions and
            if (driver.isDisabled()) {
                        }
    private void serializeDriver(XMLBuilder xml, DriverDescriptor driver)
                        curDriver.setDriverDefaultDatabase(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_DEFAULT_DATABASE), curDriver.getDefaultDatabase()));
                        type = CommonUtils.valueOf(DBPDriverLibrary.FileType.class, typeStr, DBPDriverLibrary.FileType.jar);
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {
            }
                                log.warn("Driver '" + idAttr + "' outside of datasource provider");
                        }
            }
                        if (!isDetachedProcess) {
                case RegistryConstants.TAG_FILE: {
            xml.addAttribute(RegistryConstants.ATTR_ID, driver.getId());
import org.jkiss.dbeaver.model.connection.*;
                            }
                    }
                            curDriver.setName(CommonUtils.toString(attributes.getValue(RegistryConstants.ATTR_NAME), curDriver.getName()));
            for (DBPNativeClientLocation location : driver.getNativeClientHomes()) {
                                        xml.addAttribute(
                xml.addAttribute(RegistryConstants.ATTR_INSTANTIABLE, driver.isInstantiable());
                    curDriverLoader = loaderId == null ? null : curDriver.preCreateDriverLoader(loaderId);
                    }
                curLibrary = null;
            if (!driver.isSupportsDistributedMode()) {

        DataSourceProviderDescriptor curProvider;
                                .getBoolean(ModelPreferences.UI_DRIVERS_VERSION_UPDATE)) {
                                        attributes.getValue(RegistryConstants.ATTR_ID),
                }
                        if (!isDetachedProcess) {
                        xml.addAttribute(RegistryConstants.ATTR_VALUE, CommonUtils.toString(paramEntry.getValue()));
                                ) {
                        }
                    if (curDriver != null) {
        }
            }
            }


                            }
                            curDriver.addDriverLibrary(lib, false);
                    DBPDriverLibrary.FileType type;
/*
        try (XMLBuilder.Element ignored0 = xml.startElement(RegistryConstants.TAG_DRIVER)) {
                                            xml.addAttribute("crc", Long.toHexString(file.getFileCRC()));
                xml.addAttribute(RegistryConstants.ATTR_CATEGORIES, String.join(",", driver.getCategories()));
                for (DBPDriverLibrary lib : libEntry.getValue()) {
            xml.addAttribute(RegistryConstants.ATTR_NAME, driver.getName());
                    } else {
                    }
                                );
                        curDriver = new DriverDescriptor(curProvider, idAttr);
                    if (providedDrivers && lib == null && !(curDriver.getDriverLibraries().isEmpty())){
            if (driver.isThreadSafeDriver() != driver.isOrigThreadSafeDriver()) {
                                attributes.getValue(RegistryConstants.ATTR_ID),
                                mavenLib.resetVersion();
                    curDriver = null;
