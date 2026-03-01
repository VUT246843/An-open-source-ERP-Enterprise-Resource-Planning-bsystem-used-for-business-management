 * DBeaver - Universal Database Manager
        DBSObject container = null;
                    if (object != null) {
        dialog.open();

import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
import org.jkiss.dbeaver.model.struct.DBSWrapper;
            }
public class NavigatorHandlerObjectGoto extends NavigatorHandlerObjectBase {
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
                "You must select a connected datasource");
                Object element = ((IStructuredSelection) selection).getFirstElement();
import org.eclipse.core.commands.ExecutionException;
 * you may not use this file except in compliance with the License.
            for (DBNDatabaseNode node : nodes) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *
 */
 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.model.struct.DBSFolder;
import org.eclipse.ui.IWorkbenchPart;
import java.util.Arrays;
            Collection<DBNDatabaseNode> nodes = NavigatorHandlerObjectBase.getNodesByObjects(Arrays.asList(objectsToOpen));
    {
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.DBPContextProvider;
import org.jkiss.utils.ArrayUtils;
        Object[] objectsToOpen = dialog.getResult();
                }
import java.util.Collection;

            if (selection instanceof IStructuredSelection) {
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
 *
 * You may obtain a copy of the License at
                        
    }
}
        }
import org.eclipse.core.commands.ExecutionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Object execute(ExecutionEvent event) throws ExecutionException
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
        }
                        context = DBUtils.getDefaultContext(object, true);

                NavigatorUtils.openNavigatorNode(node, workbenchWindow);
                        }
            DBWorkbench.getPlatformUI().showError(
            return null;
import org.jkiss.dbeaver.ui.navigator.dialogs.GotoObjectDialog;

                if (element instanceof DBSWrapper) {
            final ISelection selection = HandlerUtil.getCurrentSelection(event);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    DBSObject object = ((DBSWrapper) element).getObject();
 * Unless required by applicable law or agreed to in writing, software
    @Override

                "Go to object",
 * Licensed under the Apache License, Version 2.0 (the "License");

                        while (container instanceof DBSFolder) {
        return null;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
        } else if (GeneralUtils.adapt(activePart, INavigatorModelView.class) != null) {
import org.jkiss.dbeaver.model.DBUtils;
                    }
        DBCExecutionContext context = null;
        if (activePart instanceof DBPContextProvider) {
        if (!ArrayUtils.isEmpty(objectsToOpen)) {
            context = ((DBPContextProvider) activePart).getExecutionContext();
/*
                        container = object;
        GotoObjectDialog dialog = new GotoObjectDialog(HandlerUtil.getActiveShell(event), context, container);
                            container = container.getParentObject();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.navigator.actions;
 *
        if (context == null) {
