                    DataSourceHandler.disconnectDataSource(dataSourceContainer, null);
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *
        DBNNode selectedNode = NavigatorUtils.getSelectedNode(HandlerUtil.getCurrentSelection(event));
        }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.actions.datasource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                if (dataSourceContainer.isConnected() && dataSourceContainer != ((DBNDataSource) selectedNode).getDataSourceContainer()) {

 * distributed under the License is distributed on an "AS IS" BASIS,

    public Object execute(ExecutionEvent event) throws ExecutionException
import org.eclipse.ui.handlers.HandlerUtil;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * you may not use this file except in compliance with the License.
        if (selectedNode instanceof DBNDataSource) {
}
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
 */
 * See the License for the specific language governing permissions and
    }
public class DataSourceDisconnectOtherHandler extends AbstractDataSourceHandler
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
{
import org.eclipse.core.commands.ExecutionException;
            for (final DBPDataSourceContainer dataSourceContainer : DataSourceRegistry.getAllDataSources()) {
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.registry.DataSourceRegistry;
import org.eclipse.core.commands.ExecutionEvent;
        return null;
    {
 * DBeaver - Universal Database Manager
