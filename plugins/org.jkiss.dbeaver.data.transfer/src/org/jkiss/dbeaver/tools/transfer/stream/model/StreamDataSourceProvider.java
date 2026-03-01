 * Licensed under the Apache License, Version 2.0 (the "License");
    }
public class StreamDataSourceProvider implements DBPDataSourceProvider {
/**
    @Override
        @NotNull DBRProgressMonitor monitor,
}

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    @Override
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
import org.jkiss.dbeaver.model.DBPDataSource;

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        throw new DBCFeatureNotSupportedException();
    @Override
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    public DBPPropertyDescriptor[] getConnectionProperties(

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 */
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
    public long getFeatures() {
 * Unless required by applicable law or agreed to in writing, software
    ) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBPConnectionConfiguration connectionInfo

/*
        return "";

        return FEATURE_NONE;
        @NotNull DBPDriver driver,
    @NotNull
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriver;
    public void init(@NotNull DBPPlatform platform) {
    public static final String PROVIDER_ID = "stream";
    }

    @Override
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
    }
 */


    }
package org.jkiss.dbeaver.tools.transfer.stream.model;
    }
 * DataSourceProviderLocal
import org.jkiss.dbeaver.model.app.DBPPlatform;
        return new DBPPropertyDescriptor[0];
