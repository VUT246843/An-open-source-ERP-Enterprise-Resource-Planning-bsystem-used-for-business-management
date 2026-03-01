 * Copyright (C) 2010-2025 DBeaver Corp and others
        Assert.assertNotNull(mockProject);

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.runtime.DBWorkbench;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.junit.osgi.annotation.RunWithProduct;
        return dataSourceContainer;
import org.jkiss.dbeaver.model.app.DBPProject;
package org.jkiss.junit;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.connection.DBPDriver;
    protected DBPDataSourceContainer configureTestContainer(@NotNull String driverID) {
        DBPProject mockProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
 * DBeaver - Universal Database Manager
@RunWithProduct("DBeaverUnitTest.product")
 */
        DBPDriver driver = DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver(driverID);
    protected DBRProgressMonitor monitor;
        DBPDataSourceContainer dataSourceContainer = new DataSourceDescriptor(
 * See the License for the specific language governing permissions and
        DBPConnectionConfiguration connectionConfiguration = new DBPConnectionConfiguration();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/*
    @Mock

            "test-datasource",


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        dataSourceContainer.setName("Test DS");
            mockProject.getDataSourceRegistry(),

            driver,
}
 * You may obtain a copy of the License at
public abstract class DBeaverUnitTest extends ApplicationUnitTest {
import org.junit.Assert;
            connectionConfiguration);
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.mockito.Mock;
    protected final String lineBreak = System.lineSeparator();
    @NotNull
 * limitations under the License.


        Assert.assertNotNull(driver);
    }
