    @NotNull
    @Override
                return libraryFile;
    public DriverLibraryLocal(@NotNull DriverDescriptor driver, @NotNull FileType type, @NotNull String path) {
            if (Files.exists(resolvedCache)) {
        }
import java.util.List;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    public Collection<? extends DBPDriverLibrary> getDependencies(@NotNull DBRProgressMonitor monitor) throws IOException {
        }
    private Path resolveCacheDir() {
        if (!IOUtils.isFileFromDefaultFS(providedFolder) && isDownloadable()) {
import java.nio.file.Files;
import org.jkiss.dbeaver.runtime.DBWorkbench;

        if (url != null) {
                resolvedCache = resolveCacheDir().resolve(driverFileInfo.getFile().toString());
/*
    @Nullable
    @NotNull
            if (DBWorkbench.isDistributed()) {

                case jar -> DBIcon.JAR;
        return false;

import org.jkiss.code.Nullable;
    }
        }
            return DBIcon.TREE_FOLDER_ADMIN;
        return path;
        if (!Files.exists(file)) {
    }
import org.eclipse.core.runtime.IConfigurationElement;
        if (driver == null) {
    @Override
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
    public String getDisplayName() {
import java.io.IOException;
                // all driver files (including custom ones)
    /**
    }
    @Override
            // Find in external resources
        Path file = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return DriverDescriptor.getExternalDriversStorageFolder();
        }
                Path urlFile = RuntimeUtils.getLocalPathFromURL(url);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                default -> DBIcon.TYPE_UNKNOWN;
    }
import java.util.Collection;
    }
            return true;
                url = FileLocator.toFileURL(new URL(localFilePath));
    public boolean isDownloadable() {
            return false;
        if (isUseOriginalJar()) {
        }
            if (url != null) {
        Path platformFile = null;
        // Try to use direct path
import org.eclipse.core.runtime.FileLocator;
                log.warn(ex);
/**

                // in distributed mode we use external drivers storage folder to store
        String localPath = getLocalFilePath();
        if (file == null || !Files.exists(file)) {

        }
    public boolean isSecureDownload(@NotNull DBRProgressMonitor monitor) {
    @Override
            } else if (DBWorkbench.getPlatform().getApplication().isMultiuser()) {
                // driver file can be in workspace folder for multiuser applications
        if (DBWorkbench.isDistributed() || isCustom()) {
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                DriverFileInfo driverFileInfo = driverFileInfos.get(0);
    }

                if (Files.exists(urlFile)) {

 *     http://www.apache.org/licenses/LICENSE-2.0
            }

        // Try to use relative path from installation dir
}
        }
    }
        return null;
package org.jkiss.dbeaver.registry.driver;
        String libraryExt = IOUtils.getFileExtension(getLocalFilePath());
            } else {
            log.warn("Error getting platform location", e);
     */
        List<DriverFileInfo> fileInfos = driver.getDefaultDriverLoader().getResolvedFiles().get(this);
        return new DriverLibraryLocal(driverDescriptor, this);
    private boolean useOriginalJar;
        }
                return DriverDescriptor.getExternalDriversStorageFolder().resolve(localPath);
        if (DBWorkbench.isDistributed() && isDistributedDriverLibraryFolder()) {
 * limitations under the License.
        return DriverDescriptor.getProvidedDriversStorageFolder();
            // Use custom drivers path
public class DriverLibraryLocal extends DriverLibraryAbstract {
    @Override
            return switch (type) {
            log.warn("Driver files are empty for driver %s (%s)".formatted(driver.getId(), getId()));
    @Override
                resolvedCache = resolveCacheDir().resolve(localFilePath);
                return Path.of(url.getFile());
    protected String getLocalFilePath() {
 * DBeaver - Universal Database Manager

            Path libraryFile = Path.of(localFilePath);


import java.nio.file.InvalidPathException;
 * You may obtain a copy of the License at
            url = DataSourceProviderRegistry.getInstance().findResourceURL(localFilePath);
            }
            return DriverDescriptor.getExternalDriversStorageFolder();
        super(driver, type, path);
import java.nio.file.Path;
    public DriverLibraryLocal(@Nullable DriverDescriptor driver, @NotNull IConfigurationElement config) {
    }
            // ignore - bad local path
            platformFile = detectLocalFile();
                // need to correct driver initialization, otherwise, if at least one file was copied,
        String localFilePath = this.getLocalFilePath();

            }
        // check that there are no file extensions in library, but resolved file has extension
    protected Path detectLocalFile() {
 *
    public DBIcon getIcon() {
        } else {
        if (fileInfos == null || fileInfos.isEmpty()) {
        }
 * See the License for the specific language governing permissions and
        }
            return true;
        String resolvedFileExt = IOUtils.getFileExtension(fileInfos.getFirst().getFile());
    public DriverLibraryLocal(@NotNull DriverDescriptor driverDescriptor, @NotNull DriverLibraryLocal copyFrom) {
            if (!CommonUtils.isEmpty(driverFileInfos) && driverFileInfos.size() == 1) {


    public Path getLocalFile() {

    }
            return DriverDescriptor.getProvidedDriversStorageFolder();

import org.jkiss.dbeaver.utils.RuntimeUtils;
        var providedFolder = DriverDescriptor.getProvidedDriversStorageFolder();
        }

import java.net.URL;
            } catch (IOException ex) {
     * Use original jar files and ignore all user changes
    }
        try {
        }

            return DBIcon.TREE_FOLDER_ADMIN;
        return null;
            }
        return useOriginalJar;
            file = DriverDescriptor.getCustomDriversHome().resolve(localPath);
            file = RuntimeUtils.getLocalPathFromURL(Platform.getInstallLocation().getURL()).resolve(localPath);
            } catch (IOException ex) {
        if (url == null) {

        return path;


                case license -> DBIcon.TYPE_TEXT;
                    return urlFile;
        if (driver != null && (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser())) {
 * you may not use this file except in compliance with the License.
                case lib -> DBIcon.LIBRARY;
                return DriverDescriptor.getWorkspaceDriversStorageFolder().resolve(localPath);
            };
 */
        return true;
            Path resolvedCache;
                url = FileLocator.toFileURL(url);
    @NotNull
        Path localFile = getLocalFile();
import org.jkiss.utils.IOUtils;
 *
            }
                localFilePath = resolvedCache.toAbsolutePath().toString();
    }
    @Nullable
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
        } catch (InvalidPathException e) {
    }
    @Override
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;

    private static final Log log = Log.getLog(DriverLibraryLocal.class);
                // Relative file does not exist - use plain one
    }
        return path;
    public boolean isUseOriginalJar() {
        return file;
        return platformFile;
    public DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor) {
            }
        }
import org.jkiss.dbeaver.model.DBIcon;
            }
            if (Files.exists(libraryFile)) {
    private boolean isDistributedDriverLibraryFolder() {
import org.jkiss.dbeaver.Log;
        if (fileInfos.size() > 1) {

 * DriverLibraryLocal
            if (platformFile != null && Files.exists(platformFile)) {
        try {
        if (localFile != null && Files.isDirectory(localFile)) {
            try {
        // for distributed application driver libraries could not be located locally
        } else {
    @NotNull
 */
            try {
        URL url = driver == null ? null : driver.getProviderDescriptor().getContributorBundle().getEntry(localFilePath);
    }
        } catch (IOException e) {

            List<DriverFileInfo> driverFileInfos = driver.getDefaultDriverLoader().getResolvedFiles().get(this);
                }
                // ignore
 *
            // Try to get local file
                // the driver configuration will be incorrect and other driver files will not be copied
    public void setUseOriginalJar(boolean useOriginalJar) {
    public String getId() {
    }
        this.useOriginalJar = useOriginalJar;
    @Override
    public String getExternalURL(DBRProgressMonitor monitor) {
    }
        super(driver, config);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
                return platformFile;
        return CommonUtils.isEmpty(libraryExt) && !CommonUtils.isEmpty(resolvedFileExt);
        }
        }

        super(driverDescriptor, copyFrom);
import org.eclipse.core.runtime.Platform;
    @Nullable
