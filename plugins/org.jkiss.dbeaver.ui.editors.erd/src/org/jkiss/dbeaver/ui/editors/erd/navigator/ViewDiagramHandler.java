                            node,
    {
                }
                            ERDEditorEmbedded.class.getName(),
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.handlers.HandlerUtil;
                if (object == null) {
        if (selection instanceof IStructuredSelection) {
                            null,
 * limitations under the License.
 *
            for (Object item : ((IStructuredSelection) selection).toList()) {
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ViewDiagramHandler extends AbstractDataSourceHandler {
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
/*
                            null,
import org.eclipse.core.commands.ExecutionEvent;

 *

import org.jkiss.dbeaver.ui.UIUtils;
                            true);
package org.jkiss.dbeaver.ui.editors.erd.navigator;
                DBSObject object = GeneralUtils.adapt(item, DBSEntity.class);
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
            }
        return null;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    @Override
} * Licensed under the Apache License, Version 2.0 (the "License");
                if (object != null) {
 *
import org.eclipse.jface.viewers.IStructuredSelection;

        }
                            UIUtils.getActiveWorkbenchWindow(),
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.GeneralUtils;
                    DBNDatabaseNode node = NavigatorHandlerObjectOpen.getNodeByObject(object);
 * Unless required by applicable law or agreed to in writing, software
                        NavigatorHandlerObjectOpen.openEntityEditor(
import org.eclipse.core.commands.ExecutionException;
                    }
 */
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorEmbedded;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    public Object execute(ExecutionEvent event) throws ExecutionException
                    if (node != null) {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
import org.eclipse.jface.viewers.ISelection;
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    object = GeneralUtils.adapt(item, DBSObjectContainer.class);
