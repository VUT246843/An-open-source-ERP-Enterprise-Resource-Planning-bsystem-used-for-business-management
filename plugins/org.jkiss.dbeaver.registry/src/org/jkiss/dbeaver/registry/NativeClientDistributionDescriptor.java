            return true;
        return true;
            supportedDrivers.add(element.getAttribute(RegistryConstants.ATTR_ID));
                } catch (IOException e) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        for (IConfigurationElement fileElement : config.getChildren("file")) {
            }

                filesToDownload.add(file);

            if (fileRemotePath.startsWith(DriverLibraryRepository.PATH_PREFIX)) {
    }
 */
                            try (InputStream is = new FileInputStream(localFile)) {
 * You may obtain a copy of the License at
    private String remotePath;
        return os;
                this.files.add(new NativeClientFileDescriptor(fileElement));
    public boolean downloadFiles(DBRProgressMonitor monitor, DBPNativeClientLocation location) throws DBException, InterruptedException {
    private final Set<String> supportedDrivers = new HashSet<>();
}
                    } catch (IOException ex) {
            String localResourcePath = resourcePath + "/" + file.getName();
            if (DriverUtils.matchesBundle(fileElement)) {
                                continue;
import org.jkiss.code.NotNull;
        for (int i = 0; i < filesToDownload.size(); i++) {
                            }
import org.jkiss.dbeaver.model.connection.DBPDriver;
                    primarySource += '/';
            NativeClientFileDescriptor file = filesToDownload.get(i);
import org.jkiss.dbeaver.registry.driver.DriverUtils;
import org.jkiss.dbeaver.runtime.WebUtils;
import org.jkiss.dbeaver.DBException;
 *
                }
        this.remotePath = config.getAttribute("remotePath");
        }
            if (!targetFile.exists()) {
import java.io.*;
package org.jkiss.dbeaver.registry;
                        taskName,
        }
            if (!targetPath.mkdirs()) {
import java.util.*;
                                try (OutputStream os = new FileOutputStream(targetFile)) {
        this.targetPath = config.getAttribute("targetPath");
    }
            }

        if (filesToDownload.isEmpty()) {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
    }
import org.eclipse.core.runtime.IConfigurationElement;
    public String getTargetPath() {
                throw new DBException("Can't create target folder '" + targetPath.getAbsolutePath() + "'");
    private String resourcePath;


                        targetFile.toPath(),
        }
            File targetFile = new File(targetPath, fileName);
                if (!primarySource.endsWith("/") && !fileRemotePath.startsWith("/")) {

                        null);

        this.resourcePath = config.getAttribute("resourcePath");
import org.eclipse.core.runtime.FileLocator;
                // Try to extract local resource file
    }
    }
    @Override
                        log.debug("Error locating resource file '" + localResourcePath + "'", ex);
public class NativeClientDistributionDescriptor {
        }
    public OSDescriptor getOs() {
                URL url = DataSourceProviderRegistry.getInstance().findResourceURL(localResourcePath);
        File targetPath = location.getPath();
        }
            String fileName = file.getName();
                    log.debug("Error downloading file '" + fileName + "'", e);

    public NativeClientDistributionDescriptor(IConfigurationElement config) {
 * DBeaver - Universal Database Manager
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
            // Try to download remote file
                String taskName = "Download local client file '" + fileName + "'" + " (" + (i + 1) + "/" + filesToDownload.size() + ")";
                        }
                                log.debug("IO error copying resource file '" + localResourcePath + "'", e);
        List<NativeClientFileDescriptor> filesToDownload = new ArrayList<>();

        if (!targetPath.exists()) {
                fileRemotePath = fileRemotePath.substring(DriverLibraryRepository.PATH_PREFIX.length());
        String osName = config.getAttribute(RegistryConstants.ATTR_OS);
    public String toString() {


        return resourcePath;
                String primarySource = DriverDescriptor.getDriversPrimarySource();
                        if (localFile.exists()) {
            }
                monitor.beginTask(taskName, 1);
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        for (IConfigurationElement element : config.getChildren(RegistryConstants.TAG_DRIVER)) {
        return remotePath;
            }
                                        log.debug("Error deleting client file '" + targetFile.getAbsolutePath() + "'");
import org.jkiss.dbeaver.utils.ContentUtils;
    public boolean supports(@NotNull DBPDriver driver) {
import org.jkiss.dbeaver.registry.driver.DriverLibraryRepository;
                        File localFile = new File(url.getFile());
    private static final Log log = Log.getLog(NativeClientDistributionDescriptor.class);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
                }
    }
            config.getAttribute(RegistryConstants.ATTR_ARCH));
/**
                        externalURL,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                String externalURL = primarySource + fileRemotePath;
            File targetFile = new File(targetPath, fileName);
    }
 */
            {
            }

    public String getRemotePath() {
        return os.toString();
                    try {
        for (NativeClientFileDescriptor file : files) {
                    WebUtils.downloadRemoteFile(monitor,
                }
 *
                                    ContentUtils.copyStreams(is, localFile.length(), os, monitor);
                try {
        return supportedDrivers.isEmpty() || supportedDrivers.contains(driver.getId());
                            } catch (IOException e) {
                // Repository file
    private String targetPath;
 * limitations under the License.
            }


                                if (targetFile.exists()) {

import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    private OSDescriptor os;
 * you may not use this file except in compliance with the License.

        this.os = osName == null ? null : new OSDescriptor(
 * See the License for the specific language governing permissions and
    private final List<NativeClientFileDescriptor> files = new ArrayList<>();
            if (monitor.isCanceled()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                                }
                                    if (!targetFile.delete()) {
                        url = FileLocator.toFileURL(url);
 * NativeClientDistributionDescriptor
                                    }
/*

            String fileRemotePath = remotePath + "/" + file.getName();
                if (url != null) {
        return targetPath;
            osName,
                throw new InterruptedException();
            String fileName = file.getName();
                    throw new DBException("Error downloading file '" + fileName + "': " + e.getMessage());
        }
import java.net.URL;
    }
                                }
import org.jkiss.dbeaver.Log;
    public String getResourcePath() {
