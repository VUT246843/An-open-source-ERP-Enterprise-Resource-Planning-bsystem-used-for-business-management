                            libraryFiles.add(fileInfo);
    public boolean resolveDriverFiles(@NotNull Path targetFileLocation) {
            loadDriver(monitor);
                    }
        try {

        for (DBPDriverLibrary library : getAllLibraries()) {
    }
            DBFileController fileController = DBWorkbench.getPlatform().getFileController();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    Path customFile = targetFileLocation
                                          ? targetFileLocation.resolve(fileInfo.getFile())
import java.io.File;
        files.add(fileInfo);
 * You may obtain a copy of the License at
            }
                    if (file.getFile() == null || !Files.exists(getDriverFilePath(file))) {
                            if (file.getFile() == null || !Files.exists(getDriverFilePath(file))) {
                String fileName = dirFile.getFileName().toString();
    public boolean downloadDriverLibraries(@NotNull DBRProgressMonitor monitor, boolean resetVersions, boolean isShowExpanded) {
import org.jkiss.dbeaver.model.DBPDataSource;
                }
                    } catch (IOException e) {
            if (library.isDownloadable()) {
import org.jkiss.dbeaver.Log;

                    break;
            return;
                List<DriverFileInfo> libFiles = libEntry.getValue();
import java.util.*;
                .filter(p -> {
            Path.of(library.getPath()).getParent();
        return downloadDriverLibraries(monitor, resetVersions, false);
import java.nio.file.Path;
                        .isBefore(Files.getLastModifiedTime(externalLibraryFilePath).toInstant())) {
                } catch (Throwable ex) {
                                result.add(file.getFile());
        return file.getFile();
                continue;
            } else {
            return DriverDescriptor.getExternalDriversStorageFolder().resolve(file.getFile());
            baseClassLoader);
                    }
            relPath, trgLocalFile.toString());
                continue;

    private boolean isResolvedLibraryPresent(@NotNull DBPDriverLibrary library) {


            } else {
                monitor.done();
                        monitor.subTask("Load driver file '" + fileInfo.getId() + "'");
                }
    }
    private void copyLibsFromExternalStorage(DBPDriverLibrary library, Path localFile, List<Path> result) {
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
                    resolveDirectories(targetFileLocation, library, dirFile, trgDirFile, libraryFiles);
            }

                        result.add(localFile);
            if (!driver.isCustomDriverLoader()) {
                        StandardCopyOption.REPLACE_EXISTING

                baseClassLoader = dataSourceProvider.getClass().getClassLoader();
import org.jkiss.code.NotNull;
 * DriverLoaderDescriptor
        this.driver = driver;
            return Collections.emptyList();
        for (DBPDriverDependencies.DependencyNode node : dependencies.getLibraryMap()) {
    @Override
                        localFilePaths.add(localDriverFile);
        @NotNull Path targetFileLocation,
    }
                } else {
            if (library.isDisabled()) {
            final List<URL> libraries = new ArrayList<>();
                if (localFile == null) {
    }

            if ((library instanceof DriverLibraryLocal localLib && localLib.isUseOriginalJar()) || library instanceof DriverLibraryBundle) {
            rootClassLoader = new URLClassLoader(libraries.toArray(new URL[0]), DriverDescriptor.class.getClassLoader());
                    throw new DBException("Error creating driver '" + driver.getFullName()
            resolvedFiles.putAll(tempResolvedFiles);
                if (Files.isDirectory(localFile)) {
    @Override
    @Override
        resolvedFiles.put(library, new ArrayList<>());

            if (library.isDisabled() || !library.matchesCurrentPlatform()) {
                    }
            URL url;
            for (Path dirFile : srcDirFiles) {
        try {
        }
                    String fileName = p.getFileName().toString();
                List<DriverFileInfo> files = resolvedFiles.get(library);
                }
import org.jkiss.code.Nullable;
    @Override
                        );
            }
                        resolveDirectories(targetFileLocation, library, srcLocalFile, targetFolder, libraryFiles);
    }
    public Collection<DriverFileInfo> getLibraryFiles(@NotNull DBPDriverLibrary library) {
                        }
        return true;

                List<DriverFileInfo> libraryFiles = new ArrayList<>();
            return true;

    }
                // Wrong OS or architecture
                    allExists = false;
                        if (!Files.exists(localDriverFile.getParent())) {
    }
        // Load libraries
                }
    }

        boolean localLibsExists = false;
            }
        }
    }

    /**
        Path driverFolder = DriverDescriptor.getExternalDriversStorageFolder();
    }
        }
        return isFailed;
                        }
    private transient boolean isFailed = false;
    private Class<?> driverClass;
            } else {
                continue;
                    }
                        }
                        DriverFileInfo fileInfo = new DriverFileInfo(
                // Do not validate driver presence if not a license is absent
        if (rootClassLoader == null) {
                        break;
        return (T) createDriverInstance();
            } else {
                    // Resolve custom libraries directly from file
    @NotNull
    public DriverDescriptor getDriver() {
            // - Local folders are linked to folder's contents
        }
        if (DBWorkbench.isDistributed()) {
import java.net.URL;
     * Parent classloader of every driver classloader that loads global libraries.
            }

    @Nullable
                            library.getVersion(),
                            DriverUtils.getDistributedLibraryPath(fileInfo.getFile())
                if (!libraryFiles.isEmpty()) {
    private void loadLibraries(@NotNull DBRProgressMonitor monitor) throws DBException {
 */
            return list


    public boolean needsExternalDependencies() {
        @NotNull List<DriverFileInfo> libraryFiles
                            copyLibsFromExternalStorage(library, file.getFile(), result);

                            .computeIfAbsent(library, key -> new ArrayList<>())
                    }
            Path localFile = library.getLocalFile();
        }
                }
            for (var libEntry : downloadCandidates.entrySet()) {

        } catch (Exception e) {
            return false;
                monitor.beginTask("Load driver library '" + library.getDisplayName() + "'", libFiles.size());
                Path realLibraryPath = realDriverLibsFolder.resolve(jarName);
                    for (DriverFileInfo file : files) {

        return !Files.exists(localDriverFile) || depFile.getFileCRC() == 0 ||

import java.nio.file.StandardCopyOption;
                if (divPos != -1) {
            externalLibraryFiles.add(localFile);
                for (DriverFileInfo depFile : files) {
    }
        UIServiceDrivers serviceDrivers = DBWorkbench.getService(UIServiceDrivers.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
        @NotNull Path srcLocalFile,
        for (DBPDriverLibrary library : libraries) {
    }
                        break;
import java.net.MalformedURLException;

        return driver;
    }
                    resolvedFiles.put(library, libraryFiles);
                }
                if (library.isCustom()) {
    @NotNull
        final Map<DBPDriverLibrary, List<DriverFileInfo>> downloadCandidates = new LinkedHashMap<>();
                    result.add(realLibraryPath);
    /**
        return rootClassLoader;
                    downloadCandidates.add(library);
    public static final String DEFAULT_LOADER_ID = "default";
            throw new DBException("Error during driver instantiation", ex);
     * Add resolved files to all libraries
        final DriverDependencies dependencies = getDriverDependencies(resetVersions, false);
    }
                            library.getType(),
        if (!downloadCandidates.isEmpty()) {
        resolvedFiles.clear();
                continue;
                }

            return null;
                            if (file.getFile() != null && !result.contains(file.getFile())) {
                            library.getId(),
    private void resolveDirectories(
                    DriverFileInfo fileInfo = resolveFile(targetFileLocation, library, srcLocalFile, trgLocalFile);
        List<Path> result = new ArrayList<>();
import java.util.stream.Stream;
            resolvedFiles.put(node.library, info);
                    log.info("Copy driver library from from external file system " + externalLibraryFilePath + " to " +
            for (DBPDriverLibraryProvider dlp : libraryProviders) {
            }
     * This effectively resets the library's file list to an empty state.
                        resolvedFiles.put(library, libraryFiles);
        this.isLoaded = false;
            driver.getProviderDescriptor().getRegistry().saveDrivers();
                        log.warn("\t-Driver '" + driver.getFullId() + "' library file '" + library.getPath() + "' is missing");
        @NotNull DBPDriverLibrary library,
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
        loadLibraries(monitor);
            if (files == null) {
    public boolean downloadDriverLibraries(@NotNull DBRProgressMonitor monitor, boolean resetVersions) {
                        log.debug("Driver library path '" + library.getPath() + "' cannot be resolved at '" + customFile + "'. Skipping.");
    }
    }
                }
        for (DBPDriverLibrary library : getAllLibraries()) {
                        result.addAll(readJarsFromDir(localFile));
    }
                        Path localDriverFile = driverFolder.resolve(fileInfo.getFile().toString());
            }
                }
                    }
    @Override
        if (!libraryProviders.isEmpty()) {
                    } else {
            // - Local files are linked directly
                    }
/*
    private static synchronized void loadGlobalLibraries() {
    ) throws IOException {
                List<DriverFileInfo> libraryFiles = new ArrayList<>();
                throw new DBException("You have to accept driver '" + driver.getFullName() + "' license to be able to connect");

                    libraries.add(new File(library).toURI().toURL());
    ) {
        if (DBWorkbench.isDistributed()) {

                }
import org.jkiss.dbeaver.DBException;
        }
                        "the temporary location " + realLibraryPath);
                // toString to avoid conflict between fs
                }
            DBPDataSourceProvider dataSourceProvider = driver.getDataSourceProvider();
                    }
                continue;
        libraryProviders.add(libraryProvider);
                // Use model classloader
                    continue;
                if (files != null) {
                    resolvedFiles.put(library, libraryFiles);
                    }
                continue;
    @NotNull
                }
    }

        this.classLoader = new DriverClassLoader(
    private boolean isLoaded;
        driver.setModified(true);
    public static ClassLoader getRootClassLoader() {
        }
            return localFile != null && Files.exists(localFile);
        if (isLoaded && !forceReload) {

    }
    public void resetDriverInstance() {
                if (localFile == null) {
    private void collectLibraryFiles(@NotNull DBPDriverDependencies.DependencyNode node, @NotNull List<DriverFileInfo> files) {
        for (DBPDriverLibrary library : getAllLibraries()) {
                        log.error("Error downloading driver file '" + fileInfo.getFile() + "'", e);
    }
            libraryURLs.toArray(new URL[0]),

        }
import org.jkiss.dbeaver.model.app.DBPApplication;
                    log.debug("Update driver " + driver.getName() + " " + curVersion + "->" + latestVersion);
                        return false;

     * Returns driver dependencies if some driver files are not found and can be downloaded.
        try (Stream<Path> list = Files.list(localFile)) {
        List<Path> allLibraryFiles = validateFilesPresence(monitor);
                String jarName = externalLibraryFilePath.getFileName().toString();
import java.io.IOException;
                    }
        if (!libraryProviders.isEmpty()) {
import org.jkiss.utils.IOUtils;
            }
        return localFilePaths;
                             DriverUtils.downloadDriverFiles(monitor, driver, dependencies);
        this.resolvedFiles.clear();
            if (files != null) {

        } catch (ClassCastException ex) {
import org.jkiss.utils.CommonUtils;
     */
    private List<Path> syncDistributedDependencies(@NotNull DBRProgressMonitor monitor) {
                        }
                        + "Reason: can't load driver class '" + driver.getDriverClassName() + "'",
            List<DriverFileInfo> files = resolvedFiles.get(library);
            }
                var localFile = library.getLocalFile();
            log.error("Error reading driver directory '" + localFile + "'", e);
            if (!isResolvedLibraryPresent(library)) {
    }

                if (monitor.isCanceled()) {
            externalLibraryFiles.addAll(readJarsFromDir(localFile));
    private final DriverDescriptor driver;
        for (DBPDriverLibrary library : getAllLibraries()) {
                boolean allExists = true;
        } catch (InstantiationException ex) {
    private static boolean crcNotMatch(@NotNull DriverFileInfo depFile, @NotNull Path localDriverFile) {
            if (!library.matchesCurrentPlatform()) {
                    }
                final String curVersion = library.getVersion();
    @NotNull
                        downloadCandidates
                })
            final Collection<String> availableVersions = library.getAvailableVersions(monitor);
                    }
        }

    @Override
            throw new DBException("Can't instantiate driver class", ex);
        validateFilesPresence(new LoggingProgressMonitor(log), true, isExpanded);
     * <p>
        }
        List<? extends DBPDriverLibrary> libraries = getAllLibraries();
        }
    }
}
            if (!CommonUtils.isEmpty(availableVersions)) {
                // Skip non-libraries
                try {
            for (String library : DriverDescriptor.getGlobalLibraries()) {
                        + "' instance.\nMost likely required jar files are missing.\nYou should configure jars in driver settings.\n\n"
                if (library.getType() == DBPDriverLibrary.FileType.license) {
        List<Path> localFilePaths = new ArrayList<>();
        return !library.isDownloadable() || !CommonUtils.isEmpty(resolvedFiles.get(library));
                    driverClass = Class.forName(driver.getDriverClassName(), true, classLoader);
                        fileInfo.setFileCRC(DriverUtils.calculateFileCRC(localDriverFile));
                // we don't want to resolve maven artifact from maven registry (it takes a long time)

        for (Path file : allLibraryFiles) {
                    copyLibsFromExternalStorage(library, localFile, result);
    }
 * limitations under the License.
        }
    }
            return true;
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
        return validateFilesPresence(monitor, false, false);
    @Nullable
                        .resolve(library.getPath());
                    } else {
    public boolean isFailed() {
                        log.error(e.getMessage(), e);
                    Path targetFolder = targetFileLocation.resolve(targetPath);
                Path trgDirFile = trgLocalFile.resolve(dirFile.getFileName().toString());
            }
                }
    /**
        if (driverClass == null) {
                    Path localDriverFile = driverFolder.resolve(depFile.getFile().toString());
                    localFilePaths.addAll(readJarsFromDir(localFile));
    @NotNull
        } catch (Throwable ex) {
    @NotNull
        this.classLoader = null;

                }
                continue;
                            customFile,
            List<Path> srcDirFiles = list.toList();

                    try {
                int divPos = targetPath.indexOf(":");
    private Object createDriverInstance() throws DBException {

            // some drivers need to have embedded driver files so we cannot remove it from resolved files
                    }
        files.add(new DriverFileInfo(node.library));
package org.jkiss.dbeaver.registry.driver;
            }
    public List<DBPDriverLibraryProvider> getLibraryProviders() {
                if (!result.contains(realLibraryPath)) {
    public List<Path> validateFilesPresence(@NotNull DBRProgressMonitor monitor) {
        // Make class loader
    }
    private static final Log log = Log.getLog(DriverLoaderDescriptor.class);
            resolvedFiles.putAll(driver.getDefaultDriverLoader().resolvedFiles);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
    public void loadDriver(@NotNull DBRProgressMonitor monitor, boolean forceReload) throws DBException {
            }
                baseClassLoader = DBPDataSource.class.getClassLoader();
    private final List<DBPDriverLibraryProvider> libraryProviders = new ArrayList<>();
        return info;
 * Unless required by applicable law or agreed to in writing, software
        return DriverUtils.extractZipArchives(result);

        } catch (DBException e) {

            return false;
            String licenseText = driver.getLicense();


        if (libraries.isEmpty()) {
            return false;

                    if (files == null) {
 * you may not use this file except in compliance with the License.
                                break;
            // Add resolved files from default loader
    @Override
    private final String loaderId;
            for (Path externalLibraryFilePath : externalLibraryFiles) {

                localLibsExists = true;
            try {
    }
                }
                        realLibraryPath,
                log.error(e);
        } else {
import java.net.URLClassLoader;

                    if (library.getType() != DBPDriverLibrary.FileType.license) {
        } else {
                for (DriverFileInfo file : files) {

        }
        for (DBPDriverLibrary library : getAllLibraries()) {
        if (!downloadOk) {
                    return fileName.endsWith(".jar") || fileName.endsWith(".zip");
                    if (Files.isDirectory(localFile)) {
                if (!Files.exists(realLibraryPath.getParent())) {
import org.jkiss.dbeaver.model.connection.DBPDriverLoader;
                url = file.toUri().toURL();

        }
        }
                continue;
            // We need to sync resolved files with real files of library
     */
                            }


            List<DriverFileInfo> info = new ArrayList<>();
import java.nio.file.StandardOpenOption;
            libraryURLs.add(url);
            }
                    } finally {
                        libraryFiles.add(fileInfo);
                        externalLibraryFilePath,
                }

    }
        return resolvedFiles.get(library);
            collectLibraryFiles(node, info);
        try {

        }
                        customFile = targetFileLocation.relativize(customFile);
                for (DriverFileInfo fileInfo : libFiles) {
        // we need to check resolved files from config for remove or maven libraries
    public boolean isDriverInstalled() {
            if (library.isDownloadable()) {
            if (library.getType() == DBPDriverLibrary.FileType.license) {
            log.error("Error saving drivers config", e);
        return true;

            resolvedFiles.forEach((key, value) -> {
        } catch (DBException e) {
                }
        if (resetVersions) {
     */
        Path realDriverLibsFolder = tempDriversDir.resolve(driverLibsFolder);
    /**
        if (Files.isDirectory(localFile)) {
                }
                    if (library.getType() != DBPDriverLibrary.FileType.license) {
                            DBFileController.TYPE_DATABASE_DRIVER,
                // No point in creating redundant classloader
 *
            Map<DBPDriverLibrary, List<DriverFileInfo>> tempResolvedFiles = new HashMap<>();
    protected DriverLoaderDescriptor(@NotNull String loaderId, @NotNull DriverDescriptor driver) {
        if (downloadCandidates.isEmpty() && (localLibsExists || driver.getDriverFileSources().isEmpty())) {
     */
        }
        Map<DBPDriverLibrary, List<DriverFileInfo>> tempResolvedFiles = new HashMap<>(resolvedFiles);
                } else {
                }
        }
                }
 * DBeaver - Universal Database Manager
            return Collections.emptyList();

                    if (fileInfo != null) {
                    }
                        monitor.worked(1);
    private void checkDriverVersion(@NotNull DBRProgressMonitor monitor) throws IOException {
                Path localFile = library.getLocalFile();
                            Files.createDirectories(localDriverFile.getParent());
                        if (Files.exists(targetFile)) {
    public DriverClassLoader getClassLoader() {
                for (DriverFileInfo fileInfo : libraryResolvedFiles) {

        return isLoaded;
                    );
        isLoaded = false;
    @Override
    }

                    DriverFileInfo fileInfo = resolveFile(targetFileLocation, library, dirFile, trgDirFile);

                    // Load driver classes into core module using plugin class loader

                if (resetVersions) {
                        log.warn("\tDriver '" + driver.getFullId() + "' library file '" + srcLocalFile.toAbsolutePath() + "' doesn't exist");
            }
                } catch (Exception e) {
                Path srcLocalFile = library.getLocalFile();
                String targetPath = library.getPath();
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
                // Nothing we can do about it
            if (monitor.isCanceled()) {
                        for (DriverFileInfo file : files) {
                }
    }
                return;
            }
    @Nullable
                String latestVersion = VersionUtils.findLatestVersion(availableVersions);
        return loaderId;
    public String getLoaderId() {

                if (key.isEmbedded()) {
                    continue;
        } catch (IllegalAccessException ex) {

                break;
                    try {
                        if (DBWorkbench.isDistributed()) {
                }
            throw new DBException("Bad driver class name specified", ex);
                        if (!IOUtils.isFileFromDefaultFS(file.getFile())) {
    }
                                allExists = false;
        try {
        List<DriverFileInfo> files = resolvedFiles.computeIfAbsent(library, k -> new ArrayList<>());
    @NotNull
                    continue;
    }
                    if (monitor.isCanceled()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                .collect(Collectors.toList());
                    } catch (Exception e) {
     * Initializes upon the initialization of the very first driver.
    List<DriverFileInfo> getCachedFiles(@NotNull DBPDriverLibrary library) {
        if (dependencies == null) {
    private static ClassLoader rootClassLoader;

                    Files.copy(
                                          : targetFileLocation.resolve(fileInfo.getFileLocation());

     * @param library the driver library whose associated files should be removed

                // Wrong OS or architecture
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
                }
        if (!application.isMultiuser() && !downloadDriverLibraries(monitor, resetVersions, isShowExpanded)) {

            throw e;
        if (driver.isLicenseRequired()) {
            resetDriverInstance();
        this.loaderId = loaderId;
                try {
import org.jkiss.dbeaver.runtime.ui.UIServiceDrivers;
        }
    @NotNull
    /**
            if (libraries.isEmpty()) {
                    List<DriverFileInfo> files = resolvedFiles.get(library);
                    Path trgLocalFile = targetFileLocation.resolve(targetPath);
            }
                        Files.write(localDriverFile, fileData, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
                libraries.addAll(dlp.getDriverLibraries());
        // don't download driver libraries in web application
                    tempResolvedFiles.put(key, value);
                        libraryFiles.add(fileInfo);
        }
        return resolvedFiles.get(library);
                        continue;
    }
                }
            return syncDistributedDependencies(monitor);
    public void loadDriver(@NotNull DBRProgressMonitor monitor) throws DBException {
            if (library.isDisabled() || library.isOptional() || !library.matchesCurrentPlatform()) {
     * Removes all resolved files associated with the given driver library.
        return libraries;
            collectLibraryFiles(sub, files);

                            }

                localFilePaths.add(localFile);
            depFile.getFileCRC() != DriverUtils.calculateFileCRC(localDriverFile);
                }
                    }
                    continue;
                    continue;

                return false;
            if (library.isDisabled() || !library.matchesCurrentPlatform()) {
        return new DriverDependencies(downloadCandidates);
        @NotNull Path trgLocalFile,
        @NotNull Path trgLocalFile
                    if (crcNotMatch(depFile, localDriverFile))
                    }
                if (libraryResolvedFiles == null || libraryResolvedFiles.isEmpty()) {
            if (skipLicense && library.getType() == DBPDriverLibrary.FileType.license) {
    private final Map<DBPDriverLibrary, List<DriverFileInfo>> resolvedFiles = new HashMap<>();
    public boolean isLoaded() {
            log.error("Error during copy of library file '" + library + "'", e);
                return true;
        }
            }
 */
 *
        if (baseClassLoader == null) {
            }
        List<Path> externalLibraryFiles = new ArrayList<>();
        }
                            .add(depFile);
    public boolean isLibraryResolved(@NotNull DBPDriverLibrary library) {
     */
        info.setFileCRC(DriverUtils.calculateFileCRC(srcLocalFile));
                        byte[] fileData = fileController.loadFileData(
                        localFilePaths.add(localDriverFile);
 *
     *
    }
                    log.error("Can't load global library '" + library + "'", e);

    public void addLibraryProvider(DBPDriverLibraryProvider libraryProvider) {
    public <T> T getDriverInstance(@NotNull DBRProgressMonitor monitor) throws DBException {
                        Path targetFile = IOUtils.isFileFromDefaultFS(targetFileLocation)
        }
            } else {
                        libraryFiles.add(fileInfo);
        return validateFilesPresence(monitor);
        return libraryProviders;


                if (Files.isDirectory(srcLocalFile)) {
                    if (!result.contains(localFile)) {
/**
                } else {
                if (!libraryFiles.isEmpty()) {
        }
    public void updateFiles(boolean isExpanded) {
                    targetPath = targetPath.substring(divPos + 1);
        List<DBPDriverLibrary> libraries = new ArrayList<>(driver.getDriverLibraries());
                        );
    @Override
                    Files.createDirectories(realLibraryPath.getParent());
    }
    private DriverFileInfo resolveFile(
        DriverFileInfo info = new DriverFileInfo(trgLocalFile.getFileName().toString(), null, library.getType(),
        Path driverLibsFolder = Files.isDirectory(localFile) ? Path.of(library.getPath()) :
            }
                isFailed = false;



        }
        loadGlobalLibraries();

        @NotNull Path srcLocalFile,
            }
    private Path getDriverFilePath(@NotNull DriverFileInfo file) {
        @NotNull Path targetFileLocation,
                        allExists = false;
                // Use driver provider class loader
        try (Stream<Path> list = Files.list(srcLocalFile)) {
                    if (monitor.isCanceled()) {

    }
        Path tempDriversDir = DriverDescriptor.getExternalDriversStorageFolder();
import org.jkiss.dbeaver.model.connection.DBPDriverLibraryProvider;
        @NotNull DBPDriverLibrary library,

        if (library.isDownloadable()) {
    public List<Path> getAllLibraryFiles(@NotNull DBRProgressMonitor monitor) {
    }
                    try {
                    continue;
            return driverClass.getConstructor().newInstance();
            } catch (MalformedURLException e) {
            if (!CommonUtils.isEmpty(licenseText) && !driver.acceptLicense(licenseText)) {
import java.nio.file.Files;
                    if (Files.exists(customFile)) {
        }
            throw new DBException("Illegal access", ex);
    }
                        ex);
            if (library instanceof DriverLibraryLocal && !library.isDownloadable()) {
    public DriverDependencies getDriverDependencies(boolean resetVersions, boolean skipLicense) {
                if (Files.isDirectory(dirFile)) {
                            library.getPath()
        } catch (IOException e) {
    private DriverClassLoader classLoader;
                if (!Files.exists(realLibraryPath) ||
                    } catch (Exception e) {
                DBPDriverLibrary library = libEntry.getKey();
        return classLoader;

                        } else {
                if (srcLocalFile == null) {
    @NotNull
import org.jkiss.dbeaver.model.DBFileController;
            return;
        }
                if (latestVersion != null && !latestVersion.equals(curVersion)) {
    private List<Path> validateFilesPresence(@NotNull DBRProgressMonitor monitor, boolean resetVersions, boolean isShowExpanded) {
                        log.error("Error resolving directory files at '" + srcLocalFile + "'", e);
                }
            }
                    {
 * See the License for the specific language governing permissions and
    }
        return false;
                // we need to check that resolved files from drivers.xml are exist
                    if (fileInfo != null) {
        DBPApplication application = DBWorkbench.getPlatform().getApplication();
    public Map<DBPDriverLibrary, List<DriverFileInfo>> getResolvedFiles() {
        if (node.duplicate) {
            this,
        boolean downloadOk = serviceDrivers != null ?

        this.driverClass = null;
        ClassLoader baseClassLoader = rootClassLoader;
public class DriverLoaderDescriptor implements DBPDriverLoader {

     * Sync driver libs with remote server

                isLoaded = true;
import java.util.stream.Collectors;

    public void removeLibraryFiles(@NotNull DBPDriverLibrary library) {
            }
                if (fileName.endsWith(".txt")) {
                } else {

    private List<DBPDriverLibrary> getAllLibraries() {
        }
    }



            });
                }
                            break;
            }
    public void addLibraryFile(@NotNull DBPDriverLibrary library, @NotNull DriverFileInfo fileInfo) {
            isFailed = true;
        Path relPath = targetFileLocation.relativize(trgLocalFile);
        }
        this.loadDriver(monitor, false);
        }
        return getDriverDependencies(false, true) == null;

        }
            }
        Set<URL> libraryURLs = new LinkedHashSet<>();
                if (!allExists) {
        // Resolve directory contents
    }
            List<DriverFileInfo> files = resolvedFiles.get(library);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    } else {
                    while (targetPath.startsWith("/")) targetPath = targetPath.substring(1);
    }
        final List<DBPDriverLibrary> downloadCandidates = new ArrayList<>();

    private Collection<? extends Path> readJarsFromDir(@NotNull Path localFile) {
                if (IOUtils.isFileFromDefaultFS(localFile)) {
                if (!Files.exists(srcLocalFile)) {
                }
                }
            }
                        log.error("Error resolve: " + targetFileLocation + " with " + fileInfo.getFile());
                        }

            // We are in distributed mode
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.utils.VersionUtils;
        }
        if (resolvedFiles.isEmpty()) {
            if (dataSourceProvider.providesDriverClasses()) {
                    continue;
        }
                List<DriverFileInfo> libraryResolvedFiles = tempResolvedFiles.get(library);
    @NotNull
                    Files.getLastModifiedTime(realLibraryPath).toInstant()
        }
        // Check if local files are zip archives with jars inside
                             serviceDrivers.downloadDriverFiles(monitor, driver, dependencies, isShowExpanded) :
        for (DBPDriverDependencies.DependencyNode sub : node.dependencies) {
        return resolvedFiles;
            }

    }
