                    } catch (InterruptedException e) {
                        log.error(e.getTargetException());
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.model.access.DBAuthUtils;
        if (node instanceof DBNDataSource) {
    }

import org.eclipse.core.commands.AbstractHandler;
                            DBAuthUtils.promptAndChangePasswordForCurrentUser(monitor, dataSourceContainer, changePassword));
        }
 * DBeaver - Universal Database Manager
                DBAUserPasswordManager changePassword = ((IAdaptable) dbpDataSource).getAdapter(DBAUserPasswordManager.class);
/*
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.IAdaptable;
            DBPDataSource dbpDataSource = dataSourceContainer.getDataSource();
import org.jkiss.dbeaver.model.navigator.DBNNode;
}
                    }
                    try {
 *
public class ChangePasswordDialogHandler extends AbstractHandler {
import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(ChangePasswordDialogHandler.class);
                }
        if (!(selection instanceof IStructuredSelection)) {

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (changePassword != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.navigator.DBNDataSource;

 *
                    } catch (InvocationTargetException e) {
 *
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.model.DBPDataSource;
        }
 * limitations under the License.
import java.lang.reflect.InvocationTargetException;
        final DBNNode node = NavigatorUtils.getSelectedNode(selection);
import org.jkiss.dbeaver.model.access.DBAUserPasswordManager;
import org.eclipse.ui.handlers.HandlerUtil;
            return null;
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.commands.ExecutionException;
            if (dbpDataSource instanceof IAdaptable) {
        final ISelection selection = HandlerUtil.getCurrentSelection(executionEvent);

package org.jkiss.dbeaver.ui.actions;

            DBPDataSourceContainer dataSourceContainer = dataSource.getDataSourceContainer();
    public Object execute(ExecutionEvent executionEvent) throws ExecutionException {
                        DBWorkbench.getPlatformUI().showError("Change user password", "User password change error", e);
                        UIUtils.runInProgressService(monitor ->
    @Override
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            DBNDataSource dataSource = (DBNDataSource) node;
 * Unless required by applicable law or agreed to in writing, software
        return null;
 */
