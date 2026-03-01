/**

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.registry.driver;

    @NotNull
        return new DBPPropertyDescriptor[0];
    }

 * MissingDataSourceProvider
                + "This error may occur if the configuration was created in a different edition of DBeaver.");
 */
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

}
                + "The specified driver '" + container.getDriver().getFullName() + "' could not be found.\n"
import org.jkiss.dbeaver.model.app.DBPPlatform;
        throw new DBException("Error: invalid datasource configuration:\n"
    DBPConnectionConfiguration connectionInfo) throws DBException {
 *
    @Override
        return 0;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Unless required by applicable law or agreed to in writing, software
/*
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * DBeaver - Universal Database Manager
 *
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
    public DBPPropertyDescriptor[] getConnectionProperties(@NotNull DBRProgressMonitor monitor, @NotNull DBPDriver driver, @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
    }
 */
import org.jkiss.dbeaver.model.DBPDataSource;

public class MissingDataSourceProvider implements DBPDataSourceProvider {
    public long getFeatures() {
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
    @Override
        return connectionInfo.getUrl();
    @Override
 * See the License for the specific language governing permissions and
    public void init(@NotNull DBPPlatform platform) {

import org.jkiss.dbeaver.DBException;
    @NotNull
    @Override


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 *
    public MissingDataSourceProvider() {
    }
