/*
 * limitations under the License.
    public Object execute(ExecutionEvent event) throws ExecutionException {
 *
 */
    public OpenDataEditorHandler() {
import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.
        return null;



                }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
    @Override
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        ISelection selection = HandlerUtil.getCurrentSelection(event);
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.commands.ExecutionEvent;
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
}
import org.eclipse.jface.viewers.ISelection;
                        DatabaseDataEditor.openNewDataEditor((DBNDatabaseNode) item, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class OpenDataEditorHandler extends AbstractHandler {
 *
    }
            }
        }
    }

        if (selection instanceof IStructuredSelection) {
import org.eclipse.core.commands.ExecutionException;

package org.jkiss.dbeaver.ui.editors.data;
                if (item instanceof DBNDatabaseNode) {
                    if (((DBNDatabaseNode) item).getObject() instanceof DBSDataContainer) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            for (Object item : ((IStructuredSelection) selection).toList()) {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
