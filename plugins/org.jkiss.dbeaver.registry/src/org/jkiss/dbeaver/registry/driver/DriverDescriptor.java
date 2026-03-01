    }

        this.origDialectId = this.dialectId = config.getAttribute(RegistryConstants.ATTR_DIALECT);


    }
    private final String origName;
    @NotNull

        return origAnonymousAccess;
    private volatile boolean loadersInitialized = false;
    @NotNull
                .filter(s -> !s.isCustom())
        DBPPreferenceStore prefs = DBWorkbench.getPlatform().getPreferenceStore();
    public void setSampleURL(String sampleURL) {




        return singleConnection;
        } else {
        this.origDefaultHost = null;
    @NotNull
    private Set<String> supportedPageFields = new HashSet<>(Set.of(DBConstants.PROP_HOST, DBConstants.PROP_PORT, DBConstants.PROP_DATABASE));
    public DBPPropertyDescriptor[] getMainPropertyDescriptors() {
        this.origDefaultUser = this.driverDefaultUser = config.getAttribute(RegistryConstants.ATTR_DEFAULT_USER);
            if (!lib.isCustom() && !libs.contains(lib)) {
        this.origDefaultServer = null;
    }
    }
            if (library != null) {
        loaders.add(getDefaultDriverLoader());
    public boolean isAnonymousAccess() {
    @Override
    @Override
            }
        this.useURLTemplate = true;
        Object valueObject = prop == null ? value : GeneralUtils.convertString(value, prop.getDataType());
            }
    public String getDefaultUser() {
    private boolean notAvailableDriver;
    }
        this.allowsEmptyPassword = allowsEmptyPassword;
    private String sampleURL;
        }
    public DBPDriverLoader getDriverLoader(@NotNull DBPDataSourceContainer dataSourceContainer) {
    private String driverDefaultServer;
        String driversHome = platform.getPreferenceStore().getString(ModelPreferences.UI_DRIVERS_HOME);
    }
            // Copy props from source

        return libraries;
                } else {
import org.eclipse.core.runtime.IConfigurationElement;
        this.category = copyFrom.category;
            }
    public void setModified(boolean modified) {

        return false;
    public boolean isOrigEmbedded() {
                    } else {
        return nonAvailabilityReason != null;
     * Driver icon, includes overlays for driver conditions (custom, invalid, etc)..
    }
                throw new RuntimeException("Error getting drivers temp folder", e);
    // used to download drivers from external fs or distributed to a temp folder
    }
                        .toList());
                log.error(e);
    }
    }

    @Override
    public void applyFrom(@NotNull DriverDescriptor copyFrom) {

                        customConnectionProperties.put(paramName, paramValue);
    List<DBPNativeClientLocation> getNativeClientHomes() {
        this.mainPropertyDescriptors.addAll(copyFrom.mainPropertyDescriptors);

    @Override
        return sampleURL;
        }
    public DriverDescriptor(DataSourceProviderDescriptor providerDescriptor, IConfigurationElement config) {
        driverCopy.setDriverDefaultDatabase(this.getDefaultDatabase());
        this.driverDefaultHost = driverDefaultHost;
        for (DBPDriverLibrary lib : libraries) {
                    paramValue = param.getValue();
            } catch (UnsupportedEncodingException e) {

        for (DBPDriverLibrary lib : this.origLibraries) {
        if (provider instanceof DBPNativeClientLocationManager) {
    void setUseURL(boolean useURLTemplate) {
    public String getNonAvailabilityReason() {
        this.custom = custom;
                if (!CommonUtils.isEmpty(copyFromDriverId)) {
        this.origEmbedded = this.embedded = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_EMBEDDED));
        }
                    Arrays.stream(pp[0].getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))
            if (platform.getWorkspace().getAbsolutePath().getParent() == null) {
        return providerPropertyDescriptors.toArray(new ProviderPropertyDescriptor[0]);
                    DriverDescriptor copyFromDriver = providerDescriptor.getDriver(copyFromDriverId);
        if (driverLoaders == null) {
        for (DBPDriverLibrary file : libraries) {
        this.supportsDriverProperties = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_SUPPORTS_DRIVER_PROPERTIES), true);
    public boolean isInternalDriver() {
    private final Map<String, Object> defaultConnectionProperties = new HashMap<>();
        return true;
    @NotNull

    private String dialectId;
            loader = new DriverLoaderDescriptor(loaderId, this);
                    }

    private DBPImage iconError;
    public void setConnectionProperty(String name, String value) {
            homeFolder = Path.of(driversHome);
            // OSes
        } else {
    public boolean isCustomEndpointInformation() {
import java.util.stream.Collectors;
    public String getOrigClassName() {
        this.useURLTemplate = useURLTemplate;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private boolean customDriverLoader;
    public void resetDriverInstance() {

        this.origSampleURL = null;

import org.jkiss.utils.ArrayUtils;
    @Override
import org.jkiss.dbeaver.registry.NativeClientDescriptor;
    }
    }
        this.supportsDistributedMode = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_SUPPORTS_DISTRIBUTED_MODE), true);
    }

        }
        return providerDescriptor.getId();
        if (supportedSystems.isEmpty()) {
        return origDescription;
        this.providerDescriptor = providerDescriptor;
    private boolean embedded, origEmbedded;

    private String driverDefaultDatabase;
                lib.setDisabled(true);
    }

 */
    }
    }
        this.supportsDistributedMode = copyFrom.supportsDistributedMode;
    }

        return custom;
        customParameters.put(name, valueObject);


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

        return divPos == -1 ? sourcesString : sourcesString.substring(0, divPos);

            IConfigurationElement[] notAvailable = config.getChildren(RegistryConstants.ATTR_NOT_AVAILABLE_DRIVER);
    public void setAllowsEmptyPassword(boolean allowsEmptyPassword) {
        if (supportedPageFields.length > 0) {
    public void setDescription(String description) {
                this.libraries.add(library);
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
            }
    @NotNull
        if (defaultDriverLoader == null) {
                String providerId = replace.getAttribute(RegistryConstants.ATTR_PROVIDER);
            for (IConfigurationElement os : config.getChildren(RegistryConstants.TAG_OS)) {
                        if (!CommonUtils.isEmpty(driverLibraries) && !driverLoaders.containsKey(authModel.getId())) {

        providerPropertyDescriptors.addAll(props);
    }
    public Set<String> getSupportedPageFields() {
    private String nonAvailabilityDescription;
        }
 * you may not use this file except in compliance with the License.
        customConnectionProperties.clear();
        }
    }
        final String librariesString = DBWorkbench.getPlatform().getPreferenceStore().getString(ModelPreferences.UI_DRIVERS_GLOBAL_LIBRARIES);

        }
        }
    public boolean isLicenseRequired() {
    @Override
        }
                return defProperty.getDefaultValue();
    public String getLicense() {
import org.jkiss.dbeaver.registry.RegistryConstants;
        ArrayList<DBPDriverLoader> loaders = new ArrayList<>();
                    driver.getId().equals(replaceInfo.driverId)) {
    }
        this.driverDefaultDatabase = copyFrom.driverDefaultDatabase;
        driverCopy.setName(this.getOrigName());
    @Override
    }
        }
        if (!libraries.contains(descriptor)) {
                        log.debug("Driver '" + copyFromDriverId + "' not found. Cannot copy main properties into '" + getId() + "'");
        this.threadSafe = true;
    public void disabledAllDefaultLibraries() {
        return id;
            }
            this.providerId = providerId;
                        originalConnectionProperties.put(paramName, paramValue);
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
            for (IConfigurationElement replace : replaceElements) {
    }
        return defaultParameters;
        this.categories = Arrays.asList(CommonUtils.split(config.getAttribute(RegistryConstants.ATTR_CATEGORIES), ","));
    private DBPImage logoImage;
    public static String[] getDriversSources() {
        this.origDescription = null;


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    
        this.driverDefaultHost = copyFrom.driverDefaultHost;
    private int promoted;
        this.origDescription = this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    @Override
    public void setDriverDefaultDatabase(String driverDefaultDatabase) {
        if (!CommonUtils.isEmpty(acceptedStr)) {

    }
        return logoImage;
        if (setDefault) {

            System.setProperty(PROP_DRIVERS_LOCATION, driversHome.toAbsolutePath().toString());
            .resolve(DBFileController.TYPE_DATABASE_DRIVER);
        DBPPlatform platform = DBWorkbench.getPlatform();

        }
    @Override
            // Connection properties
    private String webURL;
    @Override
    @Override
    @Nullable
        mainPropertyDescriptors.addAll(props);
        }
    /**
                        .flatMap(List<ProviderPropertyDescriptor>::stream)
        return lib;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                String paramName = param.getAttribute(RegistryConstants.ATTR_NAME);

        this.origSampleURL = this.sampleURL = config.getAttribute(RegistryConstants.ATTR_SAMPLE_URL);
    }
    }

    public boolean isInstantiable() {
    }
    }

    public Map<String, Object> getDriverParameters() {
    }
        // Try to use custom drivers path from preferences
        makeIconExtensions();
        private ReplaceInfo(String providerId, String driverId) {
        }
    public DBPImage getPlainIcon() {
    public void setDisabled(boolean disabled) {
        for (DBPDriverLibrary lib : libraries) {
    private final List<DBPDriverLibrary> libraries = new ArrayList<>();
            return iconNormal;
                .map(DBPDriverConfigurationType::valueOf)
                        driverLoaders = new LinkedHashMap<>();
            // Save in registry
            return iconError;
            driverLoaders = new LinkedHashMap<>();
        String providerId;
                        this.providerPropertyDescriptors.addAll(copyFromDriver.providerPropertyDescriptors);
        return disabled;
        return nonAvailabilityTitle;
        if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
    public DBPDriver createOriginalCopy() {
    private DBPImage iconPlain;
            if (nc.findDistribution(this) != null) {
    @Nullable
                libCopy.setDisabled(false);
    public synchronized DriverLoaderDescriptor getDefaultDriverLoader() {
    public List<String> getCategories() {
            this.iconNormal = this.iconPlain;
        if (connectionInfo.getConfigurationType() == DBPDriverConfigurationType.URL) {

                }
        if (resetCache && descriptor instanceof DriverLibraryMavenArtifact mavenLib) {
        this.promoted = copyFrom.promoted;
import org.jkiss.dbeaver.model.*;
    }
        return pathList.toArray(new String[0]);
                .collect(Collectors.toSet());
 * DBeaver - Universal Database Manager
        this.customParameters.putAll(copyFrom.customParameters);

        } else {
        return origDefaultUser;
            resetDriverInstance();
        this.nonAvailabilityReason = copyFrom.nonAvailabilityReason;
    }
    @NotNull
        }

    @Override
    private final List<DBPNativeClientLocation> nativeClientHomes = new ArrayList<>();
    public boolean replaces(DriverDescriptor driver) {
    private final String origClassName;
                return lib;
        this.iconBig = this.iconPlain;
    }
        if (!loader.isLoaded() && loader.isFailed()) {
    @Override
                final Path licenseFile = file.getLocalFile();
            this.iconBig = copyFrom.iconBig;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        } else {
        this.notAvailableDriver = copyFrom.notAvailableDriver;
    public String getFullName() {
    @Override

        OSDescriptor localSystem = DBWorkbench.getPlatform().getLocalSystem();
        return providerDescriptor.getInstance(this);
                    libraryLocal2.setUseOriginalJar(true);
        this.clientRequired = copyFrom.clientRequired;
    public boolean isAllowsEmptyPassword() {
    @Override
        this.id = CommonUtils.notEmpty(config.getAttribute(RegistryConstants.ATTR_ID));
                if (!CommonUtils.isEmpty(providerId) && !CommonUtils.isEmpty(driverId)) {
            // Driver parameters
                }
    public DriverDescriptor getReplacedBy() {

        this.driverDefaultUser = driverDefaultUser;
        return !isTemporary() && modified;
     *
        }
        return origInstantiable;
        return getDefaultDriverLoader();
            IConfigurationElement[] replaceElements = config.getChildren(RegistryConstants.TAG_REPLACE);
    }
        this.nonAvailabilityDescription = copyFrom.nonAvailabilityDescription;
    }
    }
            if (!lib.isDisabled()) {
            this.categories = new ArrayList<>();
        DBPDataSourceProvider provider = getDataSourceProvider();

            this.driverClassName = driverClassName;
        return value;
                    return RuntimeUtils.getUserHomeDir().toPath().resolve(DBConstants.DEFAULT_DRIVERS_FOLDER);
            this.iconPlain = DBIcon.DATABASE_DEFAULT;
        return customDriverLoader;
    }
    @Override

        if (this.iconPlain == null) {
        this.allowsEmptyPassword = copyFrom.allowsEmptyPassword;

            if (lib.getPath().equals(path)) {
    }
        if (driversHome != null) {
        }
        this.origAnonymousAccess = this.anonymousAccess = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_ANONYMOUS));
    @Nullable
        } else {
            applyFrom(copyFrom);
        return providerDescriptor.getScriptDialect();
        return webURL;
    void setCustomDriverLoader(boolean customDriverLoader) {
    boolean acceptLicense(String licenseText) {
    static {
            IConfigurationElement[] pp = config.getChildren(RegistryConstants.TAG_PROVIDER_PROPERTIES);
            this.logoImage = iconToImage(logoImageAttr);
                        // Use readAllBytes because readString may fail if file charset is inconsistent

        this.custom = true;
        this.name = name;
            DriverLibraryAbstract library = DriverLibraryAbstract.createFromConfig(this, lib);
    @Override
    @Override
    }
    }
    }
    @Override

                    DriverDescriptor copyFromDriver = providerDescriptor.getDriver(copyFromDriverId);

                this.nonAvailabilityDescription = element.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    @NotNull
    public List<DBPDriverLibrary> getEnabledDriverLibraries() {
                filtered.add(lib);
    @NotNull
                DBPDriverLibrary libCopy = libraryLocal.copyLibrary(this);
        }
    }
        }
    public List<DBPNativeClientLocation> getNativeClientLocations() {
    @NotNull
        }

        this.id = id;
        this.databaseDocumentationSuffixURL = config.getAttribute(RegistryConstants.ATTR_DATABASE_DOCUMENTATION_SUFFIX_URL);
        return licenseRequired;
                .forEach(libr -> libr.setDisabled(true));
    public String getWebURL() {
        return false;
        this.driverDefaultPort = driverDefaultPort;

        return driverDefaultHost;
        this.sampleURL = sampleURL;
            return (DBPNativeClientLocationManager) provider;
            }
        return driverDefaultUser;
        this.nativeClientHomes.addAll(copyFrom.nativeClientHomes);
    }
    public List<DBPDriverLibrary> getOrigLibraries() {
 *
            if (dialect != null) {
    public String getOrigDefaultUser() {
    }


        }
    }
    }
        this.webURL = copyFrom.webURL;
    @Override

                        os.getAttribute(RegistryConstants.ATTR_NAME),
    public void setReplacedBy(DriverDescriptor replaceBy) {
        return temporary || providerDescriptor.isTemporary();
                if (CommonUtils.isEmpty(paramValue)) {
    @Nullable
            return DatabaseURL.generateUrlByTemplate(this, connectionInfo);
    private static final Log log = Log.getLog(DriverDescriptor.class);
    private String nonAvailabilityTitle;
    }
    public void setCustom(boolean custom) {
    private final String origDescription;
    @Override
        for (DBPDriverLibrary library : copyFrom.libraries) {
        DriverDescriptor driverCopy = getProviderDescriptor().createDriver(this);
        this.customDriverLoader = copyFrom.customDriverLoader;

    @Override


        if (isCustom()) {
    }
    public boolean isSampleURLApplicable() {
                String paramValue = param.getAttribute(RegistryConstants.ATTR_VALUE);

    @NotNull
        this.licenseRequired = copyFrom.licenseRequired;
    private final Map<String, Object> customConnectionProperties = new HashMap<>();
            return null;
        this.defaultParameters.putAll(copyFrom.defaultParameters);
    public String getId() {
    private final List<String> categories;
    }
        this.category = CommonUtils.nullIfEmpty(category);
            return true;
                String copyFromDriverId = pp[0].getAttribute("copyFrom");
    @Override

            mavenLib.resetVersion();
    @Override

        this.origThreadSafe = true;
    }
        } else {
        List<DBPNativeClientLocation> ids = new ArrayList<>();

        this.origLibraries.addAll(this.libraries);


        this.providerPropertyDescriptors.addAll(copyFrom.providerPropertyDescriptors);
        return getProviderDescriptor().isDriversManageable();
                    .resolve(DBFileController.TYPE_DATABASE_DRIVER);
            }
        }
    Map<String, Object> getCustomParameters() {
            }
    @Override
            result.add(new Pair<String, String>(replaceInfo.providerId, replaceInfo.driverId));
        return embedded;

    public String getName() {
    @NotNull
                        .flatMap(List<ProviderPropertyDescriptor>::stream)
                    }

    private final String id;
                    homeFolder = homeFolder.getParent().resolve(DBConstants.DEFAULT_DRIVERS_FOLDER);
        loaders.addAll(driverLoaders.values());
import java.util.stream.Stream;
        return customParameters;

     * @return icon
    }
        return origDefaultDatabase;
    @Nullable
    public String getSampleURL() {
        return driverDefaultDatabase;
                }
import org.jkiss.dbeaver.utils.RuntimeUtils;
                libraries.add(URLDecoder.decode(library, GeneralUtils.UTF8_ENCODING));
            return true;
    }
        return origSampleURL;
    @Override
    }
            }
     * Plain icon (without any overlays).
        {
    public static Path getCustomDriversHome() {
        {
    public boolean addDriverLibrary(DBPDriverLibrary descriptor, boolean resetCache) {
    }
    public DBPImage getIcon() {
        return origPropagateDriverProperties;
    private final Map<String, Object> defaultParameters = new HashMap<>();
        for (DBPDriverLibrary lib : libs) {
                    } else {

    }
    public Map<String, Object> getConnectionProperties() {
        return customParameters;
            } catch (IOException e) {
                    }
            this.iconNormal = new DBIconComposite(this.iconPlain, false, null, null, DBIcon.OVER_LAMP, null);
            }
    @Override
            SQLDialectMetadata dialect = DBWorkbench.getPlatform().getSQLDialectRegistry().getDialect(dialectId);
    private final String origSampleURL;
    }
        driverCopy.setConnectionProperties(this.getOriginalConnectionProperties());
        for (DBPDriverLoader dld : getAllDriverLoaders()) {
                if (!CommonUtils.isEmpty(copyFromDriverId)) {
        }
 * Unless required by applicable law or agreed to in writing, software
        for (OSDescriptor system : supportedSystems) {
        return anonymousAccess;
        this.origAllowsEmptyPassword = this.allowsEmptyPassword = CommonUtils.getBoolean(config.getAttribute("allowsEmptyPassword"));
        return null;
    public boolean isPropagateDriverProperties() {
    private boolean supportsDriverProperties;

                String copyFromDriverId = pp[0].getAttribute("copyFrom");
    @Override
                }
    @NotNull
    public boolean isEmbedded() {
    public String getNonAvailabilityTitle() {
    public boolean isOrigPropagateDriverProperties() {
    public String getOrigDefaultDatabase() {
        this.replacedBy = replaceBy;
    }

            if (defProperty != null) {
    @Override
            defaultDriverLoader = new DriverLoaderDescriptor(DriverLoaderDescriptor.DEFAULT_LOADER_ID, this);
        return new ArrayList<>(categories);
    public void setDriverDefaultPort(String driverDefaultPort) {
    public boolean supportsVirtualKeys() {
    // Map of driver loaders. Key=auth model ID
        this.iconError = new DBIconComposite(this.iconPlain, false, null, null, isCustom() ? DBIcon.OVER_LAMP : null, DBIcon.OVER_ERROR);
    @Override

                    if (!paramName.startsWith(DBConstants.INTERNAL_PROP_PREFIX)) {
        this.description = copyFrom.description;
    public static String[] getGlobalLibraries() {
    }

                this.nonAvailabilityTitle = element.getAttribute(RegistryConstants.ATTR_TITLE);

            }
                    if (copyFromDriver == null) {
                this.nonAvailabilityReason = element.getAttribute(RegistryConstants.ATTR_MESSAGE);
    @Override
    }
            ((DriverLoaderDescriptor)dld).resetDriverInstance();
    }
                Files.createDirectories(homeFolder);
    public boolean isSupportsDistributedMode() {
    public static final DriverDescriptor NULL_DRIVER = new DriverDescriptor("NULL");

    /**
    }
                        return new String(Files.readAllBytes(licenseFile));
        return origDefaultPort;
    @Nullable
            if (driverId.equals(replace.driverId)) {

        return instantiable;
            this.configurationTypes = Stream.of(supportedConfigurationTypes)

    private boolean origThreadSafe, threadSafe;
    public boolean isOrigAllowsEmptyPassword() {
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
                }
            }
    private String driverClassName;
            }
    @Override

        }
    @Override
            try {
    @Nullable


    }

import org.jkiss.dbeaver.model.meta.Property;
            }
        driverCopy.setThreadSafeDriver(this.isOrigThreadSafeDriver());

     *
        if (!CommonUtils.isEmpty(logoImageAttr)) {
    public DriverDescriptor(DataSourceProviderDescriptor providerDescriptor, String id, DriverDescriptor copyFrom) {
        }
    private DBPImage iconBig;
        DBPPropertyDescriptor prop = getProviderDescriptor().getDriverProperty(name);
        if (!loadersInitialized) {
    private static final String PROP_DRIVERS_LOCATION = "DRIVERS_LOCATION";
    @NotNull
                homeFolder = platform.getApplication().getDefaultWorkingFolder();
    }
        if (!CommonUtils.isEmpty(dialectId)) {
                }

                            loader.addLibraryProvider(authModel);
        for (ReplaceInfo replaceInfo : driverReplacements) {


    public String getOrigDescription() {
        this.useURLTemplate = copyFrom.useURLTemplate;
                return dialect;
    public String getDriverClassName() {

    public String getConnectionURL(@NotNull DBPConnectionConfiguration connectionInfo) {
        ids.addAll(nativeClientHomes);

        return providerDescriptor.getTreeDescriptor();
    public Map<String, Object> getDefaultDriverParameters() {
    @Nullable
        this.temporary = temporary;
        Path customFolder = getCustomDriversHome();
        this.propertiesWebURL = copyFrom.webURL;
    @Override

        Object value = customParameters.get(name);
    public DBPDriverLibrary getDriverLibrary(String path) {
    }
    public boolean isNotAvailable() {
                    }
    private boolean propagateDriverProperties;
        return driverDefaultServer;
    public DriverDescriptor(DataSourceProviderDescriptor providerDescriptor, String id) {
    @Override
        return category;
    public DriverLoaderDescriptor preCreateDriverLoader(String loaderId) {
import java.io.UnsupportedEncodingException;
            }
    }

    public ProviderPropertyDescriptor[] getProviderPropertyDescriptors() {
        return supportedPageFields;
        String sourcesString = DBWorkbench.getPlatform().getPreferenceStore().getString(ModelPreferences.UI_DRIVERS_SOURCES);
                supportedSystems.add(new OSDescriptor(
        if (value == null) {

    public String getDefaultHost() {
    }
        return null;
                String paramValue = param.getAttribute(RegistryConstants.ATTR_VALUE);
            if (lib instanceof DriverLibraryLocal libraryLocal && !lib.isCustom()) {
        this.custom = false;
        return useURLTemplate;


    @NotNull


        if (copyFrom != null) {
                }
        }
        return homeFolder;
import org.jkiss.dbeaver.model.app.DBPPlatform;
    @Override
    public static Path getExternalDriversStorageFolder() {
        DriverLibraryAbstract lib = DriverLibraryAbstract.createFromPath(this, fileType, path, null);
        } else if (isSampleURLForced()) {
import org.jkiss.dbeaver.Log;
        if (loader == null) {
        @NotNull DBPDataSourceContainer dataSourceContainer
            for (IConfigurationElement element : notAvailable) {

            if (lib.getPath().equals(path)) {
        return description;
            licenseText))
        }
    public boolean isSupportedByLocalSystem() {
        }
    }
                String driverId = replace.getAttribute(RegistryConstants.ATTR_DRIVER);
    private static class ReplaceInfo {
        String logoImageAttr = config.getAttribute("logoImage");
    }
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.ModelPreferences;
     * @return plain icon
    }
    public boolean isOrigAnonymousAccess() {
    }
    }
    @NotNull
        this.origName = null;
        this.category = config.getAttribute(RegistryConstants.ATTR_CATEGORY);
                        this.mainPropertyDescriptors.addAll(copyFromDriver.mainPropertyDescriptors);
                        log.warn(e);
            } else {
        return iconPlain;
    public boolean matchesId(@NotNull String driverId) {
    @NotNull


 * Licensed under the Apache License, Version 2.0 (the "License");
                return lib;
    public void setDriverDefaultHost(String driverDefaultHost) {
        this.threadSafe = copyFrom.threadSafe;
    }
    }
    }
            for (IConfigurationElement param : paramElements) {
    public boolean isTemporary() {
    @NotNull
    public List<Pair<String,String>> getDriverReplacementsInfo() {
        return DBWorkbench.getPlatform().getWorkspace().getAbsolutePath()
        this.nonAvailabilityTitle = copyFrom.nonAvailabilityTitle;
        return customConnectionProperties;

            // Generate URL by template
    private boolean instantiable, origInstantiable;
    }
        }
        this.origDefaultDatabase = null;
            IConfigurationElement[] paramElements = config.getChildren(RegistryConstants.TAG_PARAMETER);
        }
    }
        this.driverDefaultUser = copyFrom.driverDefaultUser;
    public void validateFilesPresence(
        }
public class DriverDescriptor extends AbstractDescriptor implements DBPDriver {
    private final String origDefaultHost, origDefaultPort, origDefaultDatabase, origDefaultServer, origDefaultUser;
        }
        } else {
    @Override
        }
    public void setDriverParameters(Map<String, Object> parameters) {
        customConnectionProperties.put(name, value);
    public boolean isSingleConnection() {
        this(providerDescriptor, id, null);
        }
    }
        this.useURLTemplate = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_USE_URL_TEMPLATE), true);
    public boolean isOrigInstantiable() {

import org.jkiss.dbeaver.utils.GeneralUtils;

                this.mainPropertyDescriptors.addAll(
    public List<DriverFileSource> getDriverFileSources() {
        return false;

        DriverLoaderDescriptor loader = driverLoaders.get(loaderId);

    @Property(viewable = true, order = 2)
        this.origDefaultUser = null;
        if (clientManager != null) {
                if (homeFolder != null && homeFolder.getParent() != null) {
    public boolean isOrigThreadSafeDriver() {
        return supportsDistributedMode;
            this.fileSources.add(new DriverFileSource(lib));

        this.instantiable = copyFrom.instantiable;
        this(DataSourceProviderDescriptor.NULL_PROVIDER, id);
    }
        }
    @Nullable

        return nonAvailabilityReason;
                if (!CommonUtils.isEmpty(paramName) && !CommonUtils.isEmpty(paramValue)) {

    }

        return name;
        return filtered;
/*
    // Static utilities

    }
        this.supportsDriverProperties = copyFrom.supportsDriverProperties;
        this.name = copyFrom.name;
    public static Path getDriversContribFolder() throws IOException {
    }
        return loaders;
        this.propagateDriverProperties = propagateDriverProperties;
            if (!ArrayUtils.isEmpty(pp)) {
    @Override
        String driverId;
            customFolder = customFolder.resolve(distributedFolderName);
        return fileSources;
    }
    public void setSupportsDistributedMode(boolean supportsDistributedMode) {
        this.origName = this.name = CommonUtils.notEmpty(config.getAttribute(RegistryConstants.ATTR_LABEL));
            } else {

                }

                        .map(ProviderPropertyDescriptor::extractProviderProperties)
                            DriverLoaderDescriptor loader = new DriverLoaderDescriptor(authModel.getId(), this);
    @Override
    }
    @Nullable
    public Set<DBPDriverConfigurationType> getSupportedConfigurationTypes() {
        if (copyFrom != null) {
                ));
        this.databaseDocumentationSuffixURL = copyFrom.databaseDocumentationSuffixURL;
            defaultParameters.put(name, valueObject);
            prefs.setValue(LICENSE_ACCEPT_KEY + getId(), true + ":" + System.currentTimeMillis() + ":" + System.getProperty(StandardConstants.ENV_USER_NAME));
                driverCopy.libraries.add(libCopy);
    @Override
        return customFolder;
        return origDefaultServer;

        return origEmbedded;
    }
    @Override
        DriverLoaderDescriptor loader = getDefaultDriverLoader();
                        }

    @Override

            }


            return name;
        this.driverDefaultServer = driverDefaultServer;

    private final DataSourceProviderDescriptor providerDescriptor;
    }
        this.libraries.clear();

        }


        this.supportsDistributedMode = supportsDistributedMode;
    public String getOrigDefaultServer() {
    private void makeIconExtensions() {
            this.iconPlain = providerDescriptor.getIcon();
        if (this.iconPlain == null) {
        return nativeClientHomes;
    private volatile Map<String, DriverLoaderDescriptor> driverLoaders;
    }
        this.driverDefaultDatabase = driverDefaultDatabase;
        this.providerDescriptor = providerDescriptor;
import org.jkiss.dbeaver.model.impl.ProviderPropertyDescriptor;
                        log.debug("Driver '" + copyFromDriverId + "' not found. Cannot copy provider properties into '" + getId() + "'");

    }
                return platform.getTempFolder(new LoggingProgressMonitor(), DBFileController.DATA_FOLDER)
    public Object getDriverParameter(String name) {
    }
    public boolean isDisabled() {
        String distributedFolderName = platform.getApplication().defaultDistributedDriversFolderName();
import org.jkiss.code.NotNull;
        return false;
    @Nullable
    @Override
        }
        for (DriverFileSource fs : copyFrom.fileSources) {
        }

            return true;
    public void setAnonymousAccess(boolean anonymousAccess) {
        this.libraries.addAll(deletedLibs);
    ) throws DBException {
            this.iconPlain = copyFrom.iconPlain;
        if (DBWorkbench.getPlatformUI().acceptLicense(
    private final Map<String, Object> originalConnectionProperties = new HashMap<>();
        return Path.of(Platform.getInstallLocation().getDataArea(DBConstants.DEFAULT_DRIVERS_FOLDER).toExternalForm());
            this.fileSources.add(new DriverFileSource(fs));
 * See the License for the specific language governing permissions and
        return driverClassName;
    @Override
            lib.setDisabled(false);
    @Override
        }
    }
            for (IConfigurationElement param : propElements) {
    private String databaseDocumentationSuffixURL;
        this.origThreadSafe = this.threadSafe = CommonUtils.getBoolean(config.getAttribute("threadSafe"), true);

        this.singleConnection = copyFrom.singleConnection;
        return replacedBy;

    }
        } else {
    }
    @Override
        this.promoted = 0;
            }
    public DBPImage getIconBig() {
    public String getOrigSampleURL() {
            this.iconBig = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON_BIG));
        this.sampleURL = copyFrom.sampleURL;
    public List<DBPDriverLoader> getAllDriverLoaders() {
        for (DBPDriverLibrary lib : this.libraries) {
        return providerDescriptor;
    @Override
        this.webURL = config.getAttribute(RegistryConstants.ATTR_WEB_URL);
    public boolean isThreadSafeDriver() {
    @NotNull
        this.modified = modified;
        this.customEndpointInformation = copyFrom.customEndpointInformation;

import org.jkiss.dbeaver.DBException;
        nativeClientHomes.addAll(locations);

        return false;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
            DBPPropertyDescriptor defProperty = providerDescriptor.getDriverProperty(name);
        }
            IConfigurationElement[] propElements = config.getChildren(RegistryConstants.TAG_PROPERTY);
    @Override

    }
        String[] supportedConfigurationTypes = CommonUtils.split(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public void setDriverDefaultUser(String driverDefaultUser) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    public boolean isCustom() {
                    }
    @Nullable
        super(providerDescriptor.getPluginId());
    private String driverDefaultHost;

import org.jkiss.utils.CommonUtils;

        return nonAvailabilityDescription;
    }
            nativeClientHomes.add(location);
    }
        return propagateDriverProperties;
    }
        } else {
                if (!CommonUtils.isEmpty(paramName) && !CommonUtils.isEmpty(paramValue)) {
    @Override
    public void setNativeClientLocations(Collection<DBPNativeClientLocation> locations) {
            try {
                    } catch (IOException e) {
    private boolean useURLTemplate;
    public void setConnectionProperties(Map<String, Object> parameters) {
    }
                log.warn("Can't create drivers folder '" + homeFolder.toAbsolutePath() + "'", e);

        if (CommonUtils.isEmpty(category) || name.contains(category)) {
    @Override

import java.nio.file.Path;
        this.customDriverLoader = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_CUSTOM_DRIVER_LOADER), false);
    }
    public boolean isCustomDriverLoader() {
    private static final String LICENSE_ACCEPT_KEY = "driver.license.accept.";
        int divPos = sourcesString.indexOf('|');
        driverCopy.setDriverDefaultHost(this.getDefaultHost());
        for (IConfigurationElement lib : config.getChildren(RegistryConstants.TAG_FILE_SOURCE)) {
        }

        DriverLoaderDescriptor loader = driverLoaders.get(authModel.getId());
    }
    @Nullable
        driverCopy.setDriverDefaultUser(this.getDefaultUser());
        this.singleConnection = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_SINGLE_CONNECTION));
                if (!loadersInitialized) {
    @NotNull
            return category + " / " + name;
        }
    @Property(viewable = true, order = 1)
     */
        return isSampleURLApplicable() && !CommonUtils.equalObjects(sampleURL, origSampleURL);
    public String getCategory() {
        if (distributedFolderName != null) {
        this.origDefaultServer = this.driverDefaultServer = config.getAttribute(RegistryConstants.ATTR_DEFAULT_SERVER);
        nativeClientHomes.clear();
        List<DBPDriverLibrary> deletedLibs = new ArrayList<>();
        this.embedded = copyFrom.embedded;
        this.notAvailableDriver = false;
    }
        }
        if (driverId.equals(this.id)) {
        return threadSafe;
        this.description = description;
        List<DBPDriverLibrary> filtered = new ArrayList<>();
    @Override
import org.eclipse.core.runtime.Platform;
    }
    @NotNull
        getDriverLoader(dataSourceContainer).validateFilesPresence(monitor);

        String sourcesString = DBWorkbench.getPlatform().getPreferenceStore().getString(ModelPreferences.UI_DRIVERS_SOURCES);
    @NotNull
    private DBPImage iconNormal;
        {
            "You have to accept license of '" + getFullName() + " ' to continue",
            if (system.matches(localSystem)) {
    @NotNull
        return allowsEmptyPassword;
        for (String library : CommonUtils.splitString(librariesString, '|')) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean licenseRequired;
            this.iconPlain = providerDescriptor.getIcon();
import java.net.URLDecoder;

    }
                }
    @Override
 */
    }
            return true;

    @Override
        }
                homeFolder = platform.getWorkspace().getAbsolutePath().getParent().resolve(DBConstants.DEFAULT_DRIVERS_FOLDER);
    public void setEmbedded(boolean embedded) {
}
import java.nio.file.Files;
        }
    public String getDatabaseDocumentationSuffixURL() {
        for (IConfigurationElement lib : config.getChildren(RegistryConstants.TAG_FILE)) {
        }
    @Override
        return name;
        final List<String> libraries = new ArrayList<>();
    /////////////////////////////////////////
        this.iconPlain = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    public void setThreadSafeDriver(boolean threadSafe) {
     */
    }
import org.jkiss.code.Nullable;
    @NotNull
    }
    public void setDriverParameter(String name, String value, boolean setDefault) {

    }
    public void setName(String name) {
        this.driverDefaultServer = copyFrom.driverDefaultServer;
        this.origPropagateDriverProperties = this.propagateDriverProperties =
        this.defaultConnectionProperties.putAll(copyFrom.defaultConnectionProperties);

import org.jkiss.dbeaver.model.meta.PropertyLength;
        customParameters.putAll(parameters);
            return getDataSourceProvider().getConnectionURL(this, connectionInfo);
        return customEndpointInformation;
    }
        driverCopy.setDriverClassName(this.getOrigClassName());
        this.configurationTypes.addAll(copyFrom.configurationTypes);
                    defaultConnectionProperties.put(paramName, paramValue);
    private boolean modified;
    }
        customConnectionProperties.putAll(parameters);

    }

    public boolean isModified() {
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    }
    }
    @Override

        this.origDialectId = null;

                log.debug("SQL dialect '" + dialectId + "' not found for driver '" + getFullId() + "'. Using default dialect.");
        Path homeFolder;
        return driverCopy;
            // Driver replacements

    }

    }
        }
    public DBPDataSourceProvider getDataSourceProvider() {
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;

        String acceptedStr = prefs.getString(LICENSE_ACCEPT_KEY + getId());
        }

    public String getDefaultServer() {
    private DriverDescriptor(String id) {
    @Property(viewable = true, order = 3)
        DBPNativeClientLocationManager clientManager = getNativeClientManager();
    private Map<String, Object> getOriginalConnectionProperties() {
    @Override


            if (!ArrayUtils.isEmpty(pp)) {
    }
        if (loader != null) {
            this.supportedPageFields = Stream.of(supportedPageFields).collect(Collectors.toSet());
            // Multi-platform
        this.origDefaultHost = this.driverDefaultHost = config.getAttribute(RegistryConstants.ATTR_DEFAULT_HOST);
    Map<String, Object> getDefaultParameters() {
        this.origClassName = null;
        this.customEndpointInformation = false;
    @NotNull
        this.clientRequired = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_CLIENT_REQUIRED), false);
    }
 * You may obtain a copy of the License at

    private final List<DriverFileSource> fileSources = new ArrayList<>();
                        os.getAttribute(RegistryConstants.ATTR_ARCH)
    }
            .getWorkspace()
        {
                    driverReplacements.add(new ReplaceInfo(providerId, driverId));
        this.supportsDistributedMode = true;
    public String getOrigDefaultPort() {
    @NotNull
    public String getProviderId() {
    }
    public DBPNativeClientLocation getDefaultClientLocation() {
            }
        this.anonymousAccess = copyFrom.anonymousAccess;
        this.propagateDriverProperties = copyFrom.propagateDriverProperties;
        return origThreadSafe;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        this.libraries.addAll(libs);
        return driverClassName != null && driverClassName.contains("sun.jdbc"); //$NON-NLS-1$
            if (driver.getProviderDescriptor().getId().equals(replaceInfo.providerId) &&
            CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_PROPAGATE_DRIVER_PROPERTIES));
        }

    }
                    }
                    paramValue = param.getValue();
            this.iconBig = DBIcon.DATABASE_BIG_DEFAULT;
    public String getNonAvailabilityDescription() {
 * DriverDescriptor
import org.jkiss.dbeaver.model.runtime.OSDescriptor;

        {
        }
    private boolean clientRequired;
        Path driversHome = DriverDescriptor.getCustomDriversHome();
    }
    }
                this.libraries.add(((DriverLibraryAbstract) library).copyLibrary(this));
        List<String> pathList = CommonUtils.splitString(sourcesString, '|');
    @Nullable
        this.embedded = embedded;
            return loader;
            IConfigurationElement[] pp = config.getChildren(RegistryConstants.TAG_MAIN_PROPERTIES);

    }
        }
    public String toString() {

        getAllDriverLoaders();
    public String getPropertiesWebURL() {
    public boolean supportsDriverProperties() {
    @NotNull
    public List<? extends DBPDriverLibrary> getDriverLibraries() {

        if (platform.getApplication().isMultiuser()) {
            .resolve(DBFileController.DATA_FOLDER)

    private boolean supportsDistributedMode;
        return this.supportsDriverProperties;

    }
        if (config.getAttribute(RegistryConstants.ATTR_ICON_BIG) != null) {
    private String name;
    public String getOrigName() {
    }
            return connectionInfo.getUrl();
    }
    public void addProviderPropertyDescriptors(Collection<ProviderPropertyDescriptor> props) {
    private String driverDefaultPort;

    private boolean origPropagateDriverProperties;
    }
        }
    }
        return promoted;
import org.jkiss.utils.Pair;
        this.promoted = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_PROMOTED), 0);
        }


    public boolean isManageable() {
    }
                this.libraries.add(library);
    private final List<ReplaceInfo> driverReplacements = new ArrayList<>();
    @Override
    @NotNull
    @Override
    }
    private final Set<ProviderPropertyDescriptor> providerPropertyDescriptors = new LinkedHashSet<>();
        return DBWorkbench.getPlatform()

    }
    }
            } else {
    }
    }
     * For internal use only.
        return defaultConnectionProperties;
    private DriverDescriptor replacedBy;
    @NotNull
        customParameters.clear();
    }
    @Override
        for (DBPDriverLibrary lib : libraries) {
        for (ReplaceInfo replace : driverReplacements) {
    private String description;
            }
            }

        this.customDriverLoader = customDriverLoader;
        return origName;
    public boolean isClientRequired() {
        return ids;


            }
        }
    public String getDefaultDatabase() {

        return iconBig;


    public String getDescription() {
                    if (copyFromDriver == null) {
    @Nullable
                    for (DBPAuthModelDescriptor authModel : DataSourceProviderRegistry.getInstance().getApplicableAuthModels(this)) {
    private boolean temporary;

    }

    }
                return true;
        return defaultParameters;
        for (NativeClientDescriptor nc : getProviderDescriptor().getNativeClients()) {

    // New driver constructor
        }
        }
            .resolve(DBConstants.DEFAULT_DRIVERS_FOLDER);
                    Arrays.stream(pp[0].getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))
            .getMetadataFolder()
        return databaseDocumentationSuffixURL;
    }
    public void setDriverClassName(String driverClassName) {
        this.origDefaultDatabase = this.driverDefaultDatabase = config.getAttribute(RegistryConstants.ATTR_DEFAULT_DATABASE);
            config.getAttribute(RegistryConstants.ATTR_SUPPORTED_PAGE_FIELDS), ",");

        return configurationTypes;
        libraries.stream()
        driverCopy.setSampleURL(this.getOrigSampleURL());
                    try {
    @Override
    }
        driverCopy.setDescription(this.getOrigDescription());
        makeIconExtensions();

                if (libCopy instanceof DriverLibraryLocal libraryLocal2) {

    private volatile DriverLoaderDescriptor defaultDriverLoader;
        this.origInstantiable = this.instantiable = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_INSTANTIABLE), true);
    }
    }
            driverLoaders.put(loaderId, loader);
    void addNativeClientLocation(DBPNativeClientLocation location) {
            return true;

            }
    }
        this.instantiable = true;
        return driverDefaultPort;
    }
    private String origDialectId;
    @Override

    private String nonAvailabilityReason;
        if (supportedConfigurationTypes.length > 0) {
        // Check registry
                ids.add(new RemoteNativeClientLocation(nc, this));

    private final List<OSDescriptor> supportedSystems = new ArrayList<>();
        List<Pair<String, String>> result = new ArrayList<>();
        if (!CommonUtils.isEmpty(driversHome)) {
    public String getDefaultPort() {
    @Override
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;

    private boolean disabled;
        if (!nativeClientHomes.contains(location)) {
        {
    @NotNull

            // It can be empty in some cases (e.g. when we create connections from command line command)
                deletedLibs.add(lib);
    private final Map<String, Object> customParameters = new HashMap<>();
            }
    @NotNull
    @NotNull
                if (licenseFile != null && Files.exists(licenseFile)) {
        }
    public Map<String, Object> getDefaultConnectionProperties() {
        return originalConnectionProperties;

    private boolean anonymousAccess, origAnonymousAccess;
        this.customConnectionProperties.putAll(copyFrom.customConnectionProperties);
    public void setCategory(@Nullable String category) {
            this.categories = new ArrayList<>(copyFrom.categories);
            try {
                return true;
import org.jkiss.dbeaver.model.connection.*;
        return origClassName;
    private boolean singleConnection;
    public DBPImage getLogoImage() {
                }
            config.getAttribute(RegistryConstants.ATTR_SUPPORTED_CONFIGURATION_TYPES), ",");
                    log.warn("Can't find folder path for drivers. Use home folder");
                this.providerPropertyDescriptors.addAll(
package org.jkiss.dbeaver.registry.driver;
    private boolean allowsEmptyPassword, origAllowsEmptyPassword;
        return libraries.toArray(new String[0]);
        return defaultDriverLoader;
    public static Path getProvidedDriversStorageFolder() {

    }
 *
    @NotNull
    public int getPromotedScore() {
import java.io.IOException;
            }
    public void setTemporary(boolean temporary) {

            if (file.getType() == DBPDriverLibrary.FileType.license) {
        super(providerDescriptor.getPluginId());
    }

    }
            return clientManager.getDefaultLocalClientLocation();
        }
        this.driverDefaultPort = copyFrom.driverDefaultPort;
        this.propertiesWebURL = config.getAttribute(RegistryConstants.ATTR_PROPERTIES_WEB_URL);


    @Property(viewable = true, order = 2)
        this.disabled = disabled;
        this.driverClassName = copyFrom.driverClassName;
                String paramName = param.getAttribute(RegistryConstants.ATTR_NAME);

    public DBPDriverLibrary addDriverLibrary(String path, DBPDriverLibrary.FileType fileType) {
        DBPPlatform platform = DBWorkbench.getPlatform();
    public static String getDriversPrimarySource() {

            } catch (IOException e) {
        return null;
        addDriverLibrary(lib, true);


        }
                        List<? extends DBPDriverLibrary> driverLibraries = authModel.getDriverLibraries();
    }

        this.origDefaultPort = this.driverDefaultPort = config.getAttribute(RegistryConstants.ATTR_DEFAULT_PORT);
    public void setDriverDefaultServer(String driverDefaultServer) {
    @Nullable
        this.instantiable = instantiable;

        return origLibraries;
            this.libraries.add(descriptor);
        this.licenseRequired = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_LICENSE_REQUIRED));
            this.driverId = driverId;
    public void setInstantiable(boolean instantiable) {
    }
    private final List<DBPDriverLibrary> origLibraries = new ArrayList<>();
    private boolean custom;
                            driverLoaders.put(authModel.getId(), loader);
    }
        this.supportedPageFields.addAll(copyFrom.supportedPageFields);
            this.name = "";
        DBPAuthModelDescriptor authModel = dataSourceContainer.getConnectionConfiguration().getAuthModelDescriptor();
    @Override
        this.origClassName = this.driverClassName = config.getAttribute(RegistryConstants.ATTR_CLASS);

        String[] supportedPageFields = CommonUtils.split(
    private String propertiesWebURL;
    @Override
    public DataSourceProviderDescriptor getProviderDescriptor() {
        if (copyFrom != null) {
                        .toList());
    @Override

    public static Path getWorkspaceDriversStorageFolder() {
    public SQLDialectMetadata getScriptDialect() {
    private final List<ProviderPropertyDescriptor> mainPropertyDescriptors = new ArrayList<>();
        for (ReplaceInfo replaceInfo : driverReplacements) {
        }
    public void addMainPropertyDescriptors(Collection<ProviderPropertyDescriptor> props) {
    private String driverDefaultUser;
    private String category;
    }
    public DBXTreeNode getNavigatorRoot() {
    }
    @Nullable
                if (CommonUtils.isEmpty(paramValue)) {
        return result;
import java.util.*;
        this.customEndpointInformation = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_CUSTOM_ENDPOINT), false);
    public void setPropagateDriverProperties(boolean propagateDriverProperties) {
        driverCopy.setDriverDefaultPort(this.getDefaultPort());
                return true;
    public void setDriverLibraries(List<? extends DBPDriverLibrary> libs) {
        }
        return propertiesWebURL;
    @Override
    }
                        .map(ProviderPropertyDescriptor::extractProviderProperties)
        return loader;
        if (this.driverClassName == null || !this.driverClassName.equals(driverClassName)) {
    @Nullable
        {
    @Override
    }
            return supportsDistributedMode;
    private boolean customEndpointInformation;

    public DBPNativeClientLocationManager getNativeClientManager() {
     */
    }
        }
 * limitations under the License.
    private Set<DBPDriverConfigurationType> configurationTypes = new HashSet<>(Collections.singleton(DBPDriverConfigurationType.MANUAL));
    }
    @Nullable

                    if (driverLoaders == null) {
            resetDriverInstance();

            }

        this.dialectId = copyFrom.dialectId;
    @Nullable

        this.threadSafe = threadSafe;
    }
        }
        return mainPropertyDescriptors.toArray(new DBPPropertyDescriptor[0]);
    /**
    }
            if (library instanceof DriverLibraryAbstract) {
        return origAllowsEmptyPassword;
        }
    // Predefined driver constructor
        {
            }
 *
        if (!Files.exists(homeFolder)) {

                    setDriverParameter(paramName, paramValue, true);

        return clientRequired;
    }
        this.origDefaultPort = null;
        this.anonymousAccess = anonymousAccess;

                }

    public boolean isSampleURLForced() {

import org.jkiss.utils.StandardConstants;
            synchronized (this) {
/**
