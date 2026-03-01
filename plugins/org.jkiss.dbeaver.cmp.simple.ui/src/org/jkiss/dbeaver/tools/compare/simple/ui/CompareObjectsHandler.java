
                if (firstType != itemType || firstMeta != meta) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
                return null;
import org.eclipse.ui.handlers.HandlerUtil;
        }
/*
                CompareUIMessages.compare_objects_error_just_one_object_selected_title,
            workbenchWindow,
    private static final Log log = Log.getLog(CompareObjectsHandler.class);
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
            DBXTreeNode meta = null;
            return null;
 * you may not use this file except in compliance with the License.
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
                CompareUIMessages.compare_objects_error_just_one_object_selected_message);
                firstType = itemType;
import org.eclipse.ui.IWorkbenchWindow;
                meta = node.getMeta();
            if (firstType == null) {
            return null;
            }
                        CompareUIMessages.compare_objects_error_different_object_types_message);
 *
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        Class<?> firstType = null;
 * DBeaver - Universal Database Manager
        for (Iterator<?> iter = ss.iterator(); iter.hasNext(); ) {
            DBWorkbench.getPlatformUI().showError(
            DBNDatabaseNode node = (DBNDatabaseNode) iter.next();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (ss.size() < 2) {

                        CompareUIMessages.compare_objects_error_different_object_types_title,
        DBXTreeNode firstMeta = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
import org.eclipse.core.commands.ExecutionException;
            Class<?> itemType = node.getObject().getClass();
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
import org.eclipse.core.commands.ExecutionEvent;
        }
        dialog.open();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
        List<DBNDatabaseNode> nodes = new ArrayList<>();
import java.util.ArrayList;
import java.util.Iterator;
            if (node instanceof DBNDatabaseFolder) {
                if (firstMeta == null) {
        CompareWizardDialog dialog = new CompareWizardDialog(
                    DBWorkbench.getPlatformUI().showError(


        return null;
package org.jkiss.dbeaver.tools.compare.simple.ui;
public class CompareObjectsHandler extends AbstractHandler {
                    return null;
            if (node.getObject() == null) {
            } else {
                log.error("Bad node with null object");
 */
    }
            }
import java.util.List;
 * You may obtain a copy of the License at
            }

        if (!(selection instanceof IStructuredSelection)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
}            new CompareObjectsWizard(nodes));
import org.jkiss.dbeaver.tools.compare.simple.ui.internal.CompareUIMessages;
                    firstMeta = meta;
    @Override
 *
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
            nodes.add(node);
 * limitations under the License.
        IStructuredSelection ss = (IStructuredSelection)selection;
import org.eclipse.jface.viewers.IStructuredSelection;
                }
