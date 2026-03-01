                    } else if (Files.exists(libraryDir)) {

    @Override
        }
    @Override
            return null;
                log.error("Bundle file not found: " + localFilePath);
        return FileType.jar;
 *
    public boolean isSecureDownload(@NotNull DBRProgressMonitor monitor) {
import org.osgi.framework.FrameworkUtil;
    public DriverLibraryBundle(DriverDescriptor driverDescriptor, DriverLibraryBundle copyFrom) {
 */
 */
    }
import org.jkiss.dbeaver.Log;

                        return compiledClassesDir;
    }

public class DriverLibraryBundle extends DriverLibraryAbstract {

 * you may not use this file except in compliance with the License.
    @Nullable
                Path localFilePath = RuntimeUtils.getLocalPathFromURL(Platform.getInstallLocation().getURL())
    public String getId() {
    }

        }
    @Override
    @Override
        super(driverDescriptor, copyFrom);
import java.io.IOException;
    @NotNull
import org.eclipse.core.runtime.IConfigurationElement;
import org.osgi.framework.Bundle;
    }
            if (bundle.getSymbolicName().equals(bundleId)) {

 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        }
                String installPath = location.substring(divPos + 5);
            }
    public DBIcon getIcon() {
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
    public String getExternalURL(DBRProgressMonitor monitor) {
                        return libraryDir;
    @Nullable
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
                    Path compiledClassesDir = localFilePath.resolve("target").resolve("classes");
 * Unless required by applicable law or agreed to in writing, software
                } else if (Files.isDirectory(localFilePath)) {
 *
    @NotNull
    }
    public Collection<? extends DBPDriverLibrary> getDependencies(@NotNull DBRProgressMonitor monitor) throws IOException {
package org.jkiss.dbeaver.registry.driver;
        if (curBundle == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    public static final String PATH_PREFIX = "bundle:/";
        }
        Bundle curBundle = FrameworkUtil.getBundle(getClass());
                return bundle;
                if (Files.isRegularFile(localFilePath)) {
    }
    public FileType getType() {
    }
    }
        String bundleId = getPath().substring(PATH_PREFIX.length());
        } catch (Exception e) {

import org.jkiss.dbeaver.model.DBIcon;
    }
    public String getDisplayName() {
        super(driver, config);
 *
                    } else {
        return path;
    @NotNull
import org.jkiss.code.NotNull;

/**
        return null;

        if (bundle == null) {
            log.debug(e);
        super(driver, FileType.jar, path);
    @NotNull

 * You may obtain a copy of the License at
            bundle = findBundle();
    public boolean isDownloadable() {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    .resolve(installPath);
        return null;
        }
                        // Extracted bundle?
import java.nio.file.Path;
        return true;

        return false;

import org.osgi.framework.BundleContext;
            int divPos = location.indexOf("file:");

    private static final Log log = Log.getLog(DriverLibraryBundle.class);

    public Path getLocalFile() {

 * DriverLibraryBundle
                    if (Platform.inDevelopmentMode() && Files.exists(compiledClassesDir)) {
/*
import java.nio.file.Files;
 * See the License for the specific language governing permissions and
    private Bundle bundle;
                        return localFilePath;
                    Path libraryDir = localFilePath.resolve("lib");
    @Nullable
        return DBIcon.JAR;

 * limitations under the License.
            if (divPos != -1) {
                    return localFilePath;

    }
        BundleContext context = curBundle.getBundleContext();
    @Override
import java.util.Collection;
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }

    public DriverLibraryBundle(DriverDescriptor driver, IConfigurationElement config) {
    private Bundle findBundle() {
        return path;


        if (bundle == null) {
import org.jkiss.code.Nullable;
            }
        return null;
            String location = bundle.getLocation();



        return null;
    }
    @NotNull
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
        return new DriverLibraryBundle(driverDescriptor, this);
    public DriverLibraryBundle(DriverDescriptor driver, String path) {
import org.eclipse.core.runtime.Platform;
    public DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor) {
            return null;
    @Override
    }
        for (Bundle bundle : context.getBundles()) {
    @Override
