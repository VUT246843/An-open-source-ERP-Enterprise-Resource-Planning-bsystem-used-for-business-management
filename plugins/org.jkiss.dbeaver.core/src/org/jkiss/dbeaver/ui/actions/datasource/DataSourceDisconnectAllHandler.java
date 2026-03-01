            if (dataSourceContainer.isConnected()) {
import org.eclipse.core.commands.ExecutionException;
 * You may obtain a copy of the License at
{
        return null;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                DataSourceHandler.disconnectDataSource(dataSourceContainer, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 * you may not use this file except in compliance with the License.
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            }
    public Object execute(ExecutionEvent event) throws ExecutionException
 */
        for (final DBPDataSourceContainer dataSourceContainer : DataSourceRegistry.getAllDataSources()) {
/*
public class DataSourceDisconnectAllHandler extends AbstractDataSourceHandler
    @Override
 * DBeaver - Universal Database Manager
 *

 *

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.actions.datasource;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
 *
}import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.registry.DataSourceRegistry;
 * limitations under the License.
