            IStructuredSelection treeSelection = (IStructuredSelection) selection;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
import java.util.Iterator;
    }

            @SuppressWarnings("rawtypes")
                        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

}
 * See the License for the specific language governing permissions and
        if (selection instanceof IStructuredSelection) {
import org.eclipse.core.commands.ExecutionException;
        ISelection selection = HandlerUtil.getCurrentSelection(event);


            }
import org.eclipse.core.commands.AbstractHandler;
                    localFolder.getNestedDataSources().forEach(ds -> {
                        if (ds != null && ds.getObject().isConnected()) {
                if (el instanceof DBNLocalFolder) {
 *
import org.eclipse.jface.viewers.IStructuredSelection;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        final DBPDataSourceContainer dataSourceContainer = ds.getObject();
                Object el = it.next();
 * limitations under the License.
 *
package org.jkiss.dbeaver.ui.actions.datasource;
/*
                }
                            DataSourceHandler.disconnectDataSource(dataSourceContainer, null);
 *
            Iterator it = treeSelection.iterator();

            while (it.hasNext()) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
                    });
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.handlers.HandlerUtil;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionEvent;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.ISelection;
        return null;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class FolderDisconnectHandler extends AbstractHandler {
 */
                    DBNLocalFolder localFolder = (DBNLocalFolder) el;
