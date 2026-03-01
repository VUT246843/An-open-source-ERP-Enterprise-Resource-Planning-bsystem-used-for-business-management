        return new DriverLibraryRepository(driver, this);
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
        String primarySource = DriverDescriptor.getDriversPrimarySource();
    protected String getLocalFilePath() {
    }
    public DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor) {

/*
        super(driver, config);
import org.jkiss.code.NotNull;

        return primarySource + localPath;
        super(driver, type, path);
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

    private DriverLibraryRepository(DriverDescriptor driver, DriverLibraryRepository copyFrom) {
import org.eclipse.core.runtime.IConfigurationElement;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getExternalURL(DBRProgressMonitor monitor) {
/**
 *

    }
        super(driver, copyFrom);
    @Override
    }
    public DriverLibraryRepository(DriverDescriptor driver, IConfigurationElement config) {

    public boolean isDownloadable()
 * Unless required by applicable law or agreed to in writing, software


    @NotNull
    public DriverLibraryRepository(DriverDescriptor driver, FileType type, String path) {
        return true;

 * you may not use this file except in compliance with the License.
 */
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String PATH_PREFIX = "repo:/";

}

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        return path.substring(PATH_PREFIX.length());
            primarySource += '/';
package org.jkiss.dbeaver.registry.driver;
    }
    {
        if (!primarySource.endsWith("/") && !localPath.startsWith("/")) {
    @Override
 *
public class DriverLibraryRepository extends DriverLibraryLocal
 */
    }
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String localPath = getLocalFilePath();
{
    @Override

        }
    }
 * DBeaver - Universal Database Manager
    @Nullable
    }
 * DriverLibraryDescriptor
 * Licensed under the Apache License, Version 2.0 (the "License");
