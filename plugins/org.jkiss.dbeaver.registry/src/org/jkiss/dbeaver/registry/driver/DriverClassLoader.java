
                    List<DriverFileInfo> cachedFiles = driverLoader.getCachedFiles(driverFile);
 */
            if (driverFile.getType() == DBPDriverLibrary.FileType.lib && driverFile.matchesCurrentPlatform()) {

package org.jkiss.dbeaver.registry.driver;
                }
 *
                        localFile = localFile.resolve(nativeName);

            Path localFile = driverFile.getLocalFile();
                        return localFile.toAbsolutePath().toString();
 *
}

    public DriverClassLoader(DriverLoaderDescriptor driverLoader, URL[] urls, ClassLoader parent)
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
                        }
        super(urls, parent);
import java.net.URLClassLoader;
            }
                    return libFile.toAbsolutePath().toString();
                if (localFile != null && Files.exists(localFile)) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * limitations under the License.
                    // Check library files cache
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    {
import java.util.List;
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
                    if (localFile.getFileName().toString().equalsIgnoreCase(nativeName)) {
                    if (Files.isDirectory(localFile)) {
import java.nio.file.Files;
            if (localFile != null && Files.isDirectory(localFile)) {
                }
        return super.findLibrary(libname);
import org.jkiss.utils.CommonUtils;
        for (DBPDriverLibrary driverFile : driverLoader.getDriver().getDriverLibraries()) {
{
                    }
    {
 *
                }
    private final DriverLoaderDescriptor driverLoader;
                        for (DriverFileInfo fileInfo : cachedFiles) {
        }
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            if (fileInfo.getFile() != null && fileInfo.getFile().getFileName().toString().equalsIgnoreCase(nativeName)) {
    protected String findLibrary(String libname)
                                return fileInfo.getFile().toAbsolutePath().toString();
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.driverLoader = driverLoader;
                if (Files.exists(libFile) && !Files.isDirectory(libFile)) {
import java.net.URL;
                    }
 * DriverClassLoader
import java.nio.file.Path;
                continue;
/**
                if (localFile == null) {
        String nativeName = System.mapLibraryName(libname);

                            }
                Path libFile = localFile.resolve(nativeName);
                    if (!CommonUtils.isEmpty(cachedFiles)) {
public class DriverClassLoader extends URLClassLoader
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

            }
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
