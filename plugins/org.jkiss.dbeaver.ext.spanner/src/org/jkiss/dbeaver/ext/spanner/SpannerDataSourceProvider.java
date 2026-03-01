import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
 * you may not use this file except in compliance with the License.
    {
 *
    @Override


import org.jkiss.dbeaver.DBException;
    public static final String OFFICIAL_DRIVER_ID = "spanner_jdbc_official";
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String COMMUNITY_DRIVER_ID = "spanner_jdbc";
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
 */

 *
    }
        } else {
        @NotNull DBRProgressMonitor monitor,
package org.jkiss.dbeaver.ext.spanner;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return "jdbc:cloudspanner://localhost;";
    public void init(@NotNull DBPPlatform platform) {
    public SpannerDataSourceProvider()
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
        if ( COMMUNITY_DRIVER_ID.equals(driver.getId())) {
    @NotNull
 *
import org.jkiss.dbeaver.model.app.DBPPlatform;
import org.jkiss.dbeaver.ext.spanner.model.SpannerDataSource;
    public DBPDataSource openDataSource(

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
    {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        throws DBException
            return "jdbc:cloudspanner:/projects/%s/instances/%s/databases/%s";
        @NotNull DBPDataSourceContainer container)
 * DBeaver - Universal Database Manager
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.

 * You may obtain a copy of the License at
public class SpannerDataSourceProvider extends GenericDataSourceProvider {
import org.jkiss.dbeaver.model.DBPDataSource;
        return new SpannerDataSource(monitor, container, new SpannerMetaModel());
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    @Override
}
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.spanner.model.SpannerMetaModel;
