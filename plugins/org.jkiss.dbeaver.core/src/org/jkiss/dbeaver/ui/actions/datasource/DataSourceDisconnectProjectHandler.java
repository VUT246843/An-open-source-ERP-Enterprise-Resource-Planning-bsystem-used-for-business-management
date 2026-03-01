 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
    @Override
import org.eclipse.core.commands.ExecutionException;
    }
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        DBPProject activeProject = NavigatorUtils.getSelectedProject(HandlerUtil.getCurrentSelection(event), HandlerUtil.getActivePart(event));
package org.jkiss.dbeaver.ui.actions.datasource;
/*

 */
 * Unless required by applicable law or agreed to in writing, software
}                    DataSourceHandler.disconnectDataSource(dataSourceContainer, null);
 *
            for (final DBPDataSourceContainer dataSourceContainer : activeProject.getDataSourceRegistry().getDataSources()) {
import org.eclipse.core.commands.ExecutionEvent;

 * limitations under the License.

        if (activeProject != null) {
 * See the License for the specific language governing permissions and
                if (dataSourceContainer.isConnected()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.handlers.HandlerUtil;
 * DBeaver - Universal Database Manager
        return null;
 * You may obtain a copy of the License at
{
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                }
    {
    public Object execute(ExecutionEvent event) throws ExecutionException
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class DataSourceDisconnectProjectHandler extends AbstractDataSourceHandler
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.app.DBPProject;
 *
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
