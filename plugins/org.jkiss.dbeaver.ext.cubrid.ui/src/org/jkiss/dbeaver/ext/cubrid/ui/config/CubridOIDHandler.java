            try {
            CubridDataSource cubrid = (CubridDataSource) dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
                e.printStackTrace();
public class CubridOIDHandler extends AbstractHandler {
 * DBeaver - Universal Database Manager
        if (node instanceof DBNDataSource dataSourceNode) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Shell;
package org.jkiss.dbeaver.ext.cubrid.ui.config;
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
}
                JDBCSession session = DBUtils.openMetaSession(new VoidProgressMonitor(), cubrid, "GetSession");
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        }
 * Unless required by applicable law or agreed to in writing, software
            } catch (Exception e) {
import org.eclipse.core.commands.ExecutionEvent;
                CubridOIDSearchDialog dialog = new CubridOIDSearchDialog(activeShell, session);
        final DBNNode node = NavigatorUtils.getSelectedNode(selection);
import org.eclipse.core.commands.AbstractHandler;
 * You may obtain a copy of the License at
 *
            DBPDataSource dataSource = descriptor.getDataSource();
        final Shell activeShell = HandlerUtil.getActiveShell(event);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;
                dialog.open();
 *
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.ext.cubrid.ui.views.CubridOIDSearchDialog;

import org.jkiss.dbeaver.model.navigator.DBNDataSource;

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            }
import org.jkiss.dbeaver.model.DBPDataSource;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
/*
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
import org.jkiss.dbeaver.model.DBUtils;
    @Override
import org.eclipse.core.commands.ExecutionException;
            DataSourceDescriptor descriptor = (DataSourceDescriptor) dataSourceNode.getDataSourceContainer();
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
