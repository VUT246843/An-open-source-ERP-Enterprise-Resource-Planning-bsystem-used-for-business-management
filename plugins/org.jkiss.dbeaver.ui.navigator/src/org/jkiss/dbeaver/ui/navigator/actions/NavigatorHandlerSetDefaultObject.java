
 * You may obtain a copy of the License at
                    }
            Object element = structSelection.getFirstElement();
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.navigator.actions;

            } catch (Exception e) {
import org.eclipse.ui.handlers.HandlerUtil;
                                contextDefaults.setDefaultCatalog(monitor, catalog, null);

                        DBCExecutionContextDefaults contextDefaults = executionContext.getContextDefaults();

 * limitations under the License.
                DBExecUtils.tryExecuteRecover(monitor, dataSource, param -> {
        DBPDataSource dataSource = object.getDataSource();
                        contextsToChange = new DBCExecutionContext[] { defaultContext, editorContext };

        if (selection instanceof IStructuredSelection) {
 * you may not use this file except in compliance with the License.
                    for (DBCExecutionContext executionContext : contextsToChange) {
        DBSObject object = databaseNode.getObject();
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                        if (contextDefaults != null) {
        final DBCExecutionContext editorContext;
        if (parentNode instanceof DBNDatabaseItem) {
    }
            }
import java.lang.reflect.InvocationTargetException;
    public void updateElement(UIElement element, Map parameters)
                    } else {
                });
import org.eclipse.core.commands.ExecutionException;
        final IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            editorContext = ((DBPContextProvider) activeEditor).getExecutionContext();
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.model.DBPDataSource;
    private void markObjectAsActive(final DBNDatabaseNode databaseNode, IEditorPart activeEditor) {
                markObjectAsActive((DBNDatabaseNode) element, activeEditor);
                    DBCExecutionContext[] contextsToChange;
/*
import org.jkiss.dbeaver.runtime.TasksJob;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
            try {

        if (!updateUI) {
                                contextDefaults.setDefaultSchema(monitor, schema);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
    @SuppressWarnings("unchecked")
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        TasksJob.runTask("Change default object", monitor -> {
        }
        }
import java.util.Map;

                    if (editorContext != null && editorContext != defaultContext && editorContext.getDataSource() == defaultContext.getDataSource()) {
        }

                    DBCExecutionContext defaultContext = dataSource.getDefaultInstance().getDefaultContext(monitor, false);
            if (element instanceof DBNDatabaseNode) {
            markObjectAsActive((DBNDatabaseItem) parentNode, activeEditor);

                            }
    }

public class NavigatorHandlerSetDefaultObject extends NavigatorHandlerObjectBase implements IElementUpdater {
 * Licensed under the Apache License, Version 2.0 (the "License");
            IStructuredSelection structSelection = (IStructuredSelection) selection;
        DBNNode parentNode = databaseNode.getParentNode();
            return;

import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.model.DBPContextProvider;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
                    }
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                        contextsToChange = new DBCExecutionContext[] { defaultContext };
 *
    @Override
    @Override
        } else {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                throw new InvocationTargetException(e);
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        });
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            if (object instanceof DBSCatalog catalog && contextDefaults.supportsCatalogChange()) {
            }

 *     http://www.apache.org/licenses/LICENSE-2.0
                        }
        //element.setText("Set as default" + NavigatorHandlerObjectCreateNew.getObjectTypeName(element));

 */
import org.eclipse.jface.viewers.IStructuredSelection;
                            } else {
        if (activeEditor instanceof DBPContextProvider) {
    }
 * Unless required by applicable law or agreed to in writing, software
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * See the License for the specific language governing permissions and
 *
import org.eclipse.ui.commands.IElementUpdater;
        return null;
import org.eclipse.ui.menus.UIElement;
    {
            editorContext = null;
                                throw new DBCException("Internal error: active object change not supported");
import org.eclipse.core.commands.ExecutionEvent;

 *
}
                            } else if (object instanceof DBSSchema schema && contextDefaults.supportsSchemaChange()) {
import org.jkiss.dbeaver.model.exec.DBCException;
