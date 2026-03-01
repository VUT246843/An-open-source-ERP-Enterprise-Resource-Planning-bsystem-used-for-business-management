
        return dataSourceFolder;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

/**
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public ImportDriverInfo getDriver(String name)
    }
    {
        }
}
 *
        this.dataSourceFolder = dataSourceFolder;
 */
    public void setDataSourceFolder(DBPDataSourceFolder dataSourceFolder) {
import java.util.List;
    public ImportDriverInfo getDriverByID(String id)
    }
        return drivers;
        return null;
        drivers.add(driverInfo);

    public void addConnection(ImportConnectionInfo connectionInfo)

    {
 *
 *
package org.jkiss.dbeaver.ui.config.migration.wizards;
 * See the License for the specific language governing permissions and
    }
    private DBPDataSourceFolder dataSourceFolder;
 * You may obtain a copy of the License at
            if (name.equals(driver.getName())) {
    {
            if (id.equals(driver.getId())) {


    public void addDriver(ImportDriverInfo driverInfo)
 * limitations under the License.
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
 * Import data
        connections.add(connectionInfo);
        return null;
        for (ImportDriverInfo driver : drivers) {
 */
public class ImportData {

    }
    public List<ImportDriverInfo> getDrivers()
        }
    }
 * Unless required by applicable law or agreed to in writing, software
    public DBPDataSourceFolder getDataSourceFolder() {
    public List<ImportConnectionInfo> getConnections()
    {


                return driver;
    {
    private final List<ImportDriverInfo> drivers = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
        for (ImportDriverInfo driver : drivers) {
                return driver;
/*
 * DBeaver - Universal Database Manager

        return connections;

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final List<ImportConnectionInfo> connections = new ArrayList<>();
            }
    }
import java.util.ArrayList;
    {

