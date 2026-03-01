            }
        }

        } catch (DBException e) {
import java.io.IOException;
    {
                return ub2 - ub1;
            }
                        } finally {
                log.debug("Error processing zip archive '" + inputFile.getFileName() + "': " + e.getMessage());
            } catch (InterruptedException e) {
    public static String getDistributedLibraryPath(@NotNull Path path) {
import java.util.Locale;
    static List<Path> extractZipArchives(List<Path> files) {
                bundle = bundle.substring(1);
            } catch (final IOException e) {
            crc.update(buffer, 0, bytesRead);
import java.nio.file.Path;
import org.jkiss.dbeaver.DBException;
        for (Path inputFile : files) {
        try {
                    monitor,
            dependencies.resolveDependencies(monitor);
        public DriverScoreComparator(List<DBPDataSourceContainer> dataSources) {
                not = true;
        }
                Files.createDirectories(localDir);
            // Seems to be a zip. Let's try it.
import java.util.zip.CRC32;
            int ub1 = getUsedBy(o1, dataSources).size() + o1.getPromotedScore();
        if (DBWorkbench.isDistributed() && path.isAbsolute()) {
        if (!localFile.normalize().startsWith(localCacheDir.normalize())) {
 * See the License for the specific language governing permissions and
        sortDriversByRating(allDataSources, recentDrivers);
 * DBeaver - Universal Database Manager
    }
    }
        List<DBPDataSourceContainer> allDataSources = DataSourceRegistry.getAllDataSources();
            int ub2 = getUsedBy(o2, dataSources).size() + o2.getPromotedScore();
        return (Class<T>) Class.forName(className, true, dataSource.getContainer().getDriver().getDefaultDriverLoader().getClassLoader());
            }
    }
    }
        int bytesRead;
                            zipStream.closeEntry();
        }
        return path.toString();
            if (monitor.isCanceled()) {
            boolean not = false;
            if (!inputFile.getFileName().toString().toLowerCase(Locale.ENGLISH).endsWith(".zip")) {

            if ((!hasBundle && !not) || (hasBundle && not)) {
            drivers.sort(new DriverScoreComparator(allDataSources));
            return 0;
            .flatMap(pr -> pr.getDrivers().stream())
    public static List<DBPDriver> getAllDrivers() {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
            }

        }
/*

                    }

        }
        outputStream.flush();

                                if (zipEntryName.endsWith(".class")) {
        return usedBy;
                return super.compare(o1, o2);
    @NotNull
        }
    public static class DriverNameComparator implements Comparator<DBPDriver> {
import java.util.zip.ZipEntry;
                                String zipEntryName = zipEntry.getName();
        }
                                }
                                if (zipEntryName.endsWith(".jar") || zipEntryName.endsWith(".zip")) {
                return false;

import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            sourceName = sourceName.substring(0, sourceName.length() - 4);
                    false,
            return;
        // Check bundle
        try (OutputStream os = Files.newOutputStream(localFile)) {
        byte[] writeBuffer = new byte[IOUtils.DEFAULT_BUFFER_SIZE];
        }
import java.util.zip.ZipInputStream;
                        if (zipEntry == null) {

                        try {

        String sourceName = sourceFile.getFileName().toString();
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * DriverUtils
 * You may obtain a copy of the License at
        List<DBPDriver> allDrivers = new ArrayList<>();
        if (!Files.exists(localCacheDir)) {

    }
            return false;
    /**
import org.jkiss.dbeaver.Log;

            copyZipStream(zipStream, os);

            }
 * you may not use this file except in compliance with the License.
import java.io.OutputStream;
    public static String collectSingleConnectionDrivers() {
     */
import org.jkiss.code.NotNull;
                throw new IOException("Can't create local cache folder '" + localCacheDir.toAbsolutePath() + "'", e);
        @Override
            try (InputStream is = Files.newInputStream(inputFile)) {
        if (files.isEmpty()) {
import java.util.List;
    public static long calculateBytesCRC(byte[] bytes) {
        if (!Files.exists(localDir)) { // in case of localFile located in subdirectory inside zip archive
        allDrivers.sort(Comparator.comparing(DBPNamedObject::getName));
            return 0;
    public static List<DBPDriver> getRecentDrivers(List<DBPDriver> allDrivers, int total) {
            return calculateCRC(is);
            } catch (IOException e) {
    private static final Log log = Log.getLog(DriverUtils.class);
 * limitations under the License.
    }
import org.eclipse.core.runtime.IConfigurationElement;
        @Override
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
                // Or it is marked as exclusive and bundle exists.
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (int br = inputStream.read(writeBuffer); br != -1; br = inputStream.read(writeBuffer)) {
import java.nio.file.Files;
            log.error("Error reading file '" + localDriverFile + "', CRC calculation failed", e);
            // Already extracted
        List<DBPDataSourceContainer> usedBy = new ArrayList<>();
    public static class DriverScoreComparator extends DriverNameComparator {
        public int compare(DBPDriver o1, DBPDriver o2) {
                    for (; ; ) {
        }
 */
        }
import java.io.InputStream;
        }
            return recentDrivers.subList(0, total);
        }
        @NotNull DriverDescriptor driverDescriptor,
                    "Download driver '" + driverDescriptor.getFullName() + "' library '" + lib.getDisplayName() + "'");
        Path localCacheDir = DriverDescriptor.getCustomDriversHome().resolve(ZIP_EXTRACT_DIR).resolve(sourceName);
                        ZipEntry zipEntry = zipStream.getNextEntry();
            try {
    ) {
    }
        return recentDrivers;
            return DriverDescriptor.getExternalDriversStorageFolder().relativize(path).toString();

import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    static void copyZipStream(InputStream inputStream, OutputStream outputStream)
    private static long calculateCRC(InputStream is) throws IOException {
        }
            .map(d -> " - " + d.getName())
 * Copyright (C) 2010-2025 DBeaver Corp and others
        try {
     * Builds string of drivers with single connection option

import java.util.Comparator;
    }
            if (ub1 == ub2) {
        @NotNull DBPDriverDependencies dependencies
        return DBWorkbench.getPlatform().getDataSourceProviderRegistry().getDataSourceProviders().stream()
            try {
                try (ZipInputStream zipStream = new ZipInputStream(is)) {
import org.jkiss.utils.IOUtils;
        } catch (IOException e) {
    public static long calculateFileCRC(Path localDriverFile) {
                // Skip it in both cases.
                // No a zip
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        List<? extends DBPDataSourceProviderDescriptor> providers = DBWorkbench.getPlatform().getDataSourceProviderRegistry().getEnabledDataSourceProviders();
                continue;
        }
    public static void sortDriversByRating(List<DBPDataSourceContainer> allDataSources, List<DBPDriver> drivers) {
        return crc.getValue();
import org.jkiss.utils.CommonUtils;
                                }
        while ((bytesRead = is.read(buffer)) != -1) {
            .filter(d -> (d.isSingleConnection() || d.isEmbedded()))
import org.jkiss.dbeaver.model.DBPNamedObject;


                Files.createDirectories(localCacheDir);
    private static void checkAndExtractEntry(Path sourceFile, InputStream zipStream, ZipEntry zipEntry, List<Path> jarFiles) throws IOException {

//        Map<DBPDriver, Integer> connCountMap = new HashMap<>();
    @SuppressWarnings("unchecked")
        }
            try {



//            connCountMap.put(driver, getUsedBy(driver, allDataSources).size());
                return false;

        if (!CommonUtils.isEmpty(bundle)) {

    }
                lib.downloadLibraryFile(
        throws IOException
        List<Path> jarFiles = new ArrayList<>();
import java.io.ByteArrayInputStream;
                break;
        String bundle = config.getAttribute(RegistryConstants.ATTR_BUNDLE);
                        }
        Path localFile = localCacheDir.resolve(zipEntry.getName());
    }
//        for (DBPDriver driver : allDrivers) {

        try (InputStream is = Files.newInputStream(localDriverFile)) {
            // ignore
        }
        if (sourceName.endsWith(".zip")) {
                                    break;
        return jarFiles;
 *
        List<DBPDriver> recentDrivers = new ArrayList<>(allDrivers);

 *
        }
            if (bundle.startsWith("!")) {
            throw new IOException("Zip entry is outside of the target directory");
                                    checkAndExtractEntry(inputFile, zipStream, zipEntry, jarFiles);
    public static List<DBPDataSourceContainer> getUsedBy(DBPDriver driver, List<DBPDataSourceContainer> containers) {
                            if (!zipEntry.isDirectory()) {
        if (recentDrivers.size() > total) {
            .collect(Collectors.joining("\n"));
            jarFiles.add(inputFile);
                            break;
            if (ds.getDriver() == driver) {
    }
        }
        } catch (Throwable e) {
            }
            .sorted(Comparator.comparing(DBPNamedObject::getName))
    @NotNull
            log.error("CRC calculation failed from bytes", e);
import org.jkiss.dbeaver.model.DBPDataSource;
        return true;
            outputStream.write(writeBuffer, 0, br);

            } else {
/**
        }
                                    // This is a jar with classes. Stop processing.
        } catch (IOException e) {
            return o1.getName().compareToIgnoreCase(o2.getName());
     */
            } catch (Exception e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                usedBy.add(ds);
            }
 *
        List<DBPDriverDependencies.DependencyNode> nodes = dependencies.getLibraryList();
import org.jkiss.dbeaver.registry.DataSourceRegistry;
    public static boolean downloadDriverFiles(

                            }
            this.dataSources = dataSources;
package org.jkiss.dbeaver.registry.driver;
        return allDrivers;
    }
            } catch (IOException e) {
        jarFiles.add(localFile);
            log.error("Error resolving dependencies", e);
            allDrivers.addAll(dpd.getEnabledDrivers());

        return true;
    @NotNull
            }
                // This file is in bundle which is not included in the product.
        }
        try (InputStream is = new ByteArrayInputStream(bytes)) {
            }
            }
        for (DBPDataSourceProviderDescriptor dpd : providers) {
        }
public class DriverUtils {

 *     http://www.apache.org/licenses/LICENSE-2.0
            final DBPDriverLibrary lib = node.library;
//        }
    }
}
                throw new IOException("Can't create local file directory in the cache '" + localDir.toAbsolutePath() + "'", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Returns relative driver library path if application is distributed.
import java.util.ArrayList;
                        }
import org.jkiss.dbeaver.registry.RegistryConstants;
                log.error(e);
        byte[] buffer = new byte[65536];
            .distinct()
    }
    public static final String ZIP_EXTRACT_DIR = "zip-cache";
        driverDescriptor.setModified(true);
        @NotNull DBRProgressMonitor monitor,
    public static boolean matchesBundle(IConfigurationElement config) {
    /**
        for (DBPDataSourceContainer ds : containers) {
        Path localDir = localFile.getParent();
        }
 * Unless required by applicable law or agreed to in writing, software
        public int compare(DBPDriver o1, DBPDriver o2) {

    public static <T> Class<T> getDriverClass(@NotNull DBPDataSource dataSource, @NotNull String className) throws ClassNotFoundException {
    }
    }
                }
            boolean hasBundle = ProductBundleRegistry.getInstance().hasBundle(bundle);
        private final List<DBPDataSourceContainer> dataSources;
    }
            return calculateCRC(is);
import org.jkiss.dbeaver.registry.ProductBundleRegistry;
        for (DBPDriverDependencies.DependencyNode node : nodes) {
        CRC32 crc = new CRC32();
            return files;
        if (Files.exists(localFile)) {


 * Licensed under the Apache License, Version 2.0 (the "License");
