    @Override
    @Override
            if (libFile.matchesCurrentPlatform() && libFile.getType() == DBPDriverLibrary.FileType.lib) {

    public void init(@NotNull DBPPlatform platform)
            libLoaded = true;
    }
                try {
import org.jkiss.code.NotNull;



            }

    @Override
        }
    }
        if (!libLoaded) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
/*
    }
        DBPConnectionConfiguration connectionInfo) throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.wmi.model.WMIDataSource;
        return FEATURE_SCHEMAS;
    public String getConnectionURL(DBPDriver driver, DBPConnectionConfiguration connectionInfo)
        DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.app.DBPPlatform;
            DBPDriver driver = container.getDriver();

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
        DBPDriver driver,
        for (DBPDriverLibrary libFile : driver.getDriverLibraries()) {
                "/" + connectionInfo.getHostName() +
    {
 * You may obtain a copy of the License at
            driver.getDriverLoader(container).loadDriver(monitor);

 *

 * you may not use this file except in compliance with the License.
                } catch (UnsatisfiedLinkError e) {
 * See the License for the specific language governing permissions and
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException
import org.jkiss.dbeaver.DBException;
                    if (localFile != null) {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.file.Path;
    private boolean libLoaded = false;

import org.jkiss.wmi.service.WMIService;
package org.jkiss.dbeaver.ext.wmi;
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
}
                        // Load dll from any accessible location
 *
    private void loadNativeLib(DBPDriver driver) throws DBException {
    {
 *
    }
                    } else {
                Path localFile = libFile.getLocalFile();
            loadNativeLib(driver);
        return
    {
                "/" + connectionInfo.getDatabaseName();
    public DBPPropertyDescriptor[] getConnectionProperties(
        return null;

    public long getFeatures()
                    }
                        WMIService.linkNative(localFile.toAbsolutePath().toString());
                    throw new DBException("Can't load native library '" + libFile.getDisplayName() + "'", e);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.connection.DBPDriver;
    {
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
public class WMIDataSourceProvider implements DBPDataSourceProvider {
        }
        return new WMIDataSource(container);
    @NotNull
 * DBeaver - Universal Database Manager
            "wmi://" + connectionInfo.getServerName() +
                        WMIService.linkNative();
 * limitations under the License.
    @Override
    }
    {

import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
