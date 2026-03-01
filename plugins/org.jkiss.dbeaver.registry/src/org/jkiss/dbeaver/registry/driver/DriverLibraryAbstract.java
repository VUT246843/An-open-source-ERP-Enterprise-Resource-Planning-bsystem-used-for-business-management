    }
        return custom;

    @Override
                Files.delete(tempFile);

    }
                    DBFileController.TYPE_DATABASE_DRIVER,
        @NotNull FileType type,
    }
    }

 * Licensed under the Apache License, Version 2.0 (the "License");


        this.embedded = copyFrom.embedded;
    @Override
    }
        this.custom = custom;
        }
            } finally {
import org.jkiss.dbeaver.model.DBFileController;

import org.jkiss.dbeaver.model.fs.DBFUtils;
        }
 * DBeaver - Universal Database Manager
/*
        return disabled;
        this.system = null;
import org.jkiss.dbeaver.DBException;
    public void downloadLibraryFile(@NotNull DBRProgressMonitor monitor, boolean forceUpdate, String taskName) throws IOException, InterruptedException {

        return fileCRC;
    @Nullable
            DBFUtils.move(tempFile, localFile);
    public int hashCode() {

        if (externalURL == null) {
        } else if (path.startsWith(DriverLibraryBundle.PATH_PREFIX)) {
    private boolean optional;
    protected final DriverDescriptor driver;
import org.jkiss.utils.SecurityUtils;
        this.path = path;
        return Collections.emptyList();
    public void setCustom(boolean custom) {
        this.fileCRC = DriverUtils.calculateFileCRC(tempFile);
        if (localFile == null) {
            typeStr = FileType.jar.name();
            }

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    @NotNull
        if (!DriverUtils.matchesBundle(config)) {
    }
        }
            // save driver library file using file controller
    @Nullable
            Files.createDirectories(localDir);
        if (path.startsWith(DriverLibraryRepository.PATH_PREFIX)) {
        this.custom = false;
    public static DriverLibraryAbstract createFromPath(
    public DriverDescriptor getDriver() {
        this.custom = true;
                    fileData
    ) {

        return getId().hashCode();
    }

import java.util.Collections;

    public String getPreferredVersion() {
    @Override
        return null;
    }
    protected String path;
import java.io.IOException;
    protected long fileCRC;


    }
    public void setDisabled(boolean disabled) {
        } else {
            if (DriverLibraryRemote.supportsURL(path)) {
    protected boolean disabled;
        final Path localDir = localFile.getParent();
            config.getAttribute(RegistryConstants.ATTR_ARCH));
    protected final OSDescriptor system;
    }
        if ("zip".equalsIgnoreCase(typeStr)) {
    }
            }
        }
    @NotNull
        }
        } else if (path.startsWith(DriverLibraryMavenArtifact.PATH_PREFIX)) {
            return;
    @Override
        final Path tempFolder = DBWorkbench.getPlatform().getTempFolder(monitor, "driver-files");
        }
        String osName = config.getAttribute(RegistryConstants.ATTR_OS);
                DBWorkbench.getPlatform().getFileController().saveFileData(
    }
            return null;
        return optional;
    @NotNull
        WebUtils.downloadRemoteFile(monitor, taskName, externalURL, tempFile, getAuthInfo(monitor));
            if (DriverLibraryRemote.supportsURL(path)) {
 * limitations under the License.
        } else if (path.startsWith(DriverLibraryMavenArtifact.PATH_PREFIX)) {
import org.jkiss.code.NotNull;
        @NotNull String path,
    }
        // Download to a temporary file first so in case the process was terminated we won't have
        }
    @Override
    public Collection<String> getAvailableVersions(@NotNull DBRProgressMonitor monitor) throws IOException {

        return false;
    public boolean isCustom() {
    }
        if (DBWorkbench.isDistributed()) {
            log.error("Bad file path");


import org.jkiss.dbeaver.runtime.DBWorkbench;
    }

        this.driver = driverDescriptor;
    @Override
    @Override
        return driver;
import java.nio.file.Files;
    }
    @Override
    @NotNull
    }
        @Nullable DriverDescriptor driver,
    public FileType getType() {
    public boolean matchesCurrentPlatform() {
import org.jkiss.dbeaver.runtime.WebUtils;
        String typeStr = config.getAttribute(RegistryConstants.ATTR_TYPE);

    public boolean isOptional() {
    }

                return new DriverLibraryRemote(driver, type, path);
    private static final Log log = Log.getLog(DriverLibraryAbstract.class);
        this.driver = driver;
        } else if (path.startsWith(DriverLibraryBundle.PATH_PREFIX)) {


        this.disabled = disabled;
                throw new IOException(e.getMessage());
        @Nullable String preferredVersion

        this.driver = driver;
            throw new IOException("No target file for '" + getPath() + "'");
import org.jkiss.dbeaver.registry.RegistryConstants;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
    }
        String externalURL = getExternalURL(monitor);
            return new DriverLibraryBundle(driver, path);
        }
                return new DriverLibraryLocal(driver, config);
                return new DriverLibraryRemote(driver, config);
    public String getVersion() {
        this.type = type;
            } catch (DBException e) {
        return null;
        this.path = copyFrom.path;

    public boolean isEmbedded() {
            return new DriverLibraryBundle(driver, config);
        return type;

        return getDisplayName();
    public boolean isInvalidLibrary() {
        return null;

        this.path = config.getAttribute(RegistryConstants.ATTR_PATH);
        this.system = copyFrom.system;
    public String toString() {
    public boolean equals(Object obj) {
    protected final FileType type;
                    DriverUtils.getDistributedLibraryPath(localFile),
        @NotNull IConfigurationElement config
        return path;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
                return new DriverLibraryLocal(driver, type, path);
            return new DriverLibraryMavenArtifact(driver, config);

 */
    ) {
            try {
        return null;
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
            throw new IOException("Unresolved file reference: " + getPath());
    public static DriverLibraryAbstract createFromConfig(
                );
        if (CommonUtils.isEmpty(path)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.custom = copyFrom.custom;
            return new DriverLibraryRepository(driver, type, path);

import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
    public String getPath() {
        }
            } else {

        } else {

    @NotNull
        return embedded;
import java.nio.file.Path;
import org.eclipse.core.runtime.IConfigurationElement;
    public boolean isDisabled() {
            } else {

    }
 * See the License for the specific language governing permissions and
            return null;
    }
    }
    @Override
        if (path.startsWith(DriverLibraryRepository.PATH_PREFIX)) {

            return new DriverLibraryMavenArtifact(driver, type, path, preferredVersion);
        if (!Files.exists(localDir)) {

        this.optional = copyFrom.optional;
    }
import java.util.Collection;
public abstract class DriverLibraryAbstract implements DBPDriverLibrary {

import org.jkiss.code.Nullable;
        this.type = copyFrom.type;
    @Override
    @Override
    @Nullable
    protected DriverLibraryAbstract(@NotNull  DriverDescriptor driver, @NotNull FileType type, @NotNull String path) {
        final Path tempFile = tempFolder.resolve(SecurityUtils.makeDigest(localFile.toString()));
        this.disabled = copyFrom.disabled;
        this.embedded = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_EMBEDDED), false);
        String path = config.getAttribute(RegistryConstants.ATTR_PATH);
    protected boolean embedded;
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
    @Override
/**
 *
    public void setPath(String path) {

package org.jkiss.dbeaver.registry.driver;
 */
        return obj instanceof DriverLibraryAbstract && ((DriverLibraryAbstract) obj).getId().equals(getId());

    public String getDescription() {
        return system == null || system.matches(DBWorkbench.getPlatform().getLocalSystem());
    }
        this.type = FileType.valueOf(typeStr);
        this.path = path;
            osName,
    @Nullable
            }
    @Nullable
    protected DriverLibraryAbstract(@Nullable DriverDescriptor driver, @NotNull IConfigurationElement config) {
    protected DriverLibraryAbstract(@NotNull  DriverDescriptor driverDescriptor, @NotNull DriverLibraryAbstract copyFrom) {
    @Override

import org.jkiss.dbeaver.Log;
        // a malformed file in the target directory and therefore will be able to download it again
    protected boolean custom;
 * Unless required by applicable law or agreed to in writing, software
    }
 * you may not use this file except in compliance with the License.
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public long getFileCRC() {
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
        this.optional = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_OPTIONAL), false);

}
            return new DriverLibraryRepository(driver, config);
                byte[] fileData = Files.readAllBytes(tempFile);
        this.system = osName == null ? null : new OSDescriptor(
    public abstract DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor);
 * DriverLibraryAbstract
    protected DBPAuthInfo getAuthInfo(DBRProgressMonitor monitor) {
        @NotNull  DriverDescriptor driver,
 *

    @Override
    @Override
        final Path localFile = getLocalFile();
        if (!forceUpdate && Files.exists(localFile) && Files.size(localFile) > 0) {
