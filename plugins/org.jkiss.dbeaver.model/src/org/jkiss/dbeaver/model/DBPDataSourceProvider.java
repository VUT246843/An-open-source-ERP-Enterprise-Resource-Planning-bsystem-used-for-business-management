 * Unless required by applicable law or agreed to in writing, software
     * @param connectionInfo connection information   @return property group which contains all supported properties
        return am;

     * @param container data source container
    default DBPAuthModelDescriptor detectConnectionAuthModel(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
    /**

    DBPDataSource openDataSource(
        @NotNull DBRProgressMonitor monitor,
package org.jkiss.dbeaver.model;
     * @param monitor progress monitor
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBPDataSourceContainer container)
 */
public interface DBPDataSourceProvider extends DBPDataSourceURLProvider, DBPObject
     * @throws DBException on any error
    /**
    DBPPropertyDescriptor[] getConnectionProperties(
 *
     *
     * Initializes data source provider
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and

    
{
        @NotNull DBPConnectionConfiguration connectionInfo)

    @NotNull
    long FEATURE_NONE        = 0;
     * @param driver driver

        throws DBException;
        throws DBException;
    }
     * @return features
 * limitations under the License.
    long FEATURE_SCHEMAS     = 2;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    @NotNull
import org.jkiss.dbeaver.model.app.DBPPlatform;
        return true;
 * Data source provider
     * @return new data source object

     * @param platform application
import org.jkiss.dbeaver.DBException;
    void init(@NotNull DBPPlatform platform);
     * Supported connection properties.
import org.jkiss.dbeaver.model.connection.DBPDriver;
        }
            return ram;
     */
    /**
        @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
    long getFeatures();
    }
     * @throws DBException on any error
        DBPAuthModelDescriptor am = connectionInfo.getAuthModelDescriptor();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBPAuthModelDescriptor ram = am.getReplacedBy(driver);
     */
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
        if (ram != null) {
    long FEATURE_CATALOGS_ONLY = 4;
    default boolean providesDriverClasses() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * you may not use this file except in compliance with the License.
     * Opens new data source
}
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull DBPDriver driver,
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *
     * Supported features
     * @param monitor progress monitor
/*
    long FEATURE_CATALOGS    = 1;
     */

    /**

/**
    @NotNull
