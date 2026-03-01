        }
import org.eclipse.ui.handlers.HandlerUtil;
        @Override
        private NodeValidator(DBNNode rootNode)
public class HandlerObjectValidate extends AbstractHandler {
 *
                throw new InvocationTargetException(e);
            this.rootNode = rootNode;
            final DBNNode[] children = node.getChildren(monitor);
import org.jkiss.dbeaver.ui.UIUtils;


import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            //DBWorkbench.getPlatform().showError("Validation failed", null, e.getTargetException());
package org.jkiss.dbeaver.ui.app.devtools.handlers;
        try {
            if (children != null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                validateNode(HandlerUtil.getActiveShell(event), (DBNNode)element);
/*
            }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
        {
            throws DBException
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.viewers.IStructuredSelection;
        return null;
            final Object element = ((IStructuredSelection) selection).getFirstElement();
import org.eclipse.core.commands.AbstractHandler;
            // skip
        {
 * Unless required by applicable law or agreed to in writing, software
    {
import org.eclipse.core.commands.ExecutionEvent;
    }
        }
import org.eclipse.core.commands.ExecutionException;
        }

        } catch (InterruptedException e) {
        {
        private final DBNNode rootNode;
            }
import org.eclipse.swt.widgets.Shell;
        public void run(DBRProgressMonitor monitor)

 * distributed under the License is distributed on an "AS IS" BASIS,
                processNode(monitor, rootNode);
 * See the License for the specific language governing permissions and
            try {
 *

            UIUtils.runInProgressService(new NodeValidator(element));
 * DBeaver - Universal Database Manager
    }
 *
            }
}
                return;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Object execute(ExecutionEvent event) throws ExecutionException {

import org.jkiss.dbeaver.DBException;
        if (selection instanceof IStructuredSelection) {
        } catch (InvocationTargetException e) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.DBNNode;
                }
                for (DBNNode child : children) {
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private void validateNode(Shell shell, DBNNode element)
        private void processNode(DBRProgressMonitor monitor, DBNNode node)
import org.eclipse.jface.viewers.ISelection;
            if (element instanceof DBNNode) {
    private static class NodeValidator implements DBRRunnableWithProgress {
                    processNode(monitor, child);
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!node.hasChildren(false)) {
 * You may obtain a copy of the License at

            }


            throws InvocationTargetException, InterruptedException
            } catch (DBException e) {
 */
        }
