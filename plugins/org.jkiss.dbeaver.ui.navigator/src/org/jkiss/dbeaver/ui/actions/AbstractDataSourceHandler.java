        if (activePart instanceof DBPContextProvider) {

    @Nullable

import org.jkiss.code.Nullable;
        if (container != null) {
        if (activePart instanceof DBPContextProvider) {

        return null;
import org.eclipse.core.commands.AbstractHandler;
            DBPDataSource dataSource = selectedObject.getDataSource();


    /**
import org.eclipse.core.commands.ExecutionEvent;
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
    public static DBPDataSourceContainer getDataSourceContainerFromPart(IWorkbenchPart activePart) {
            }
        ISelection selection = HandlerUtil.getCurrentSelection(event);
    public static DBSObject getActiveObject(ExecutionEvent event) {
        }
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        }
            DBPDataSourceContainer container = getDataSourceContainerFromPart(activeEditor);
 * distributed under the License is distributed on an "AS IS" BASIS,

        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            if (editor instanceof DBPContextProvider) {
        }
        }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (selectedObject != null) {


     */
    }
        IEditorPart activeEditor = useEditor ? HandlerUtil.getActiveEditor(event) : null;
        }
            return DBUtils.getDefaultContext(selectedObject, false);
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);

            DBCExecutionContext context = ((DBPContextProvider) activePart).getExecutionContext();
        if (activeEditor != null) {
        if (useEditor) {
            }
    public static DBCExecutionContext getActiveExecutionContext(ExecutionEvent event, boolean useEditor) {

            return null;
            return null;

     * Get execution context from active editor or active selection
}
    }
            return context == null ? null : context.getDataSource().getContainer();
        IStructuredSelection navSelection = NavigatorUtils.getSelectionFromPart(activePart);
        return null;
/*
    static protected final Log log = Log.getLog(AbstractDataSourceHandler.class);
 * DBeaver - Universal Database Manager
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.IEditorPart;
    public static DBPDataSourceContainer getActiveDataSourceContainer(IEditorPart activeEditor, IWorkbenchPart activePart, ISelection selection) {
        }
    }
        DBPDataSourceContainer container = getDataSourceContainerFromPart(activePart);
            return ((DBPDataSourceContainerProvider) activePart).getDataSourceContainer();
 */
        }
    public static DBPDataSourceContainer getActiveDataSourceContainer(ExecutionEvent event, boolean useEditor) {
                return ((DBPContextProvider) editor).getExecutionContext();
        } else if (selectedObject != null) {
 * See the License for the specific language governing permissions and

            return ((DBPContextProvider) activePart).getExecutionContext();

 * limitations under the License.
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
package org.jkiss.dbeaver.ui.actions;
    @Nullable
                return ((DBNDatabaseNode) selectedNode).getObject();

            return container;
        if (selectedObject instanceof DBPDataSourceContainer) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.IWorkbenchPart;
    }
 *
        return null;
            if (container != null) {

        }
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
    }
        if (activePart instanceof DBPContextProvider) {
 *
import org.eclipse.jface.viewers.ISelection;
        return null;
            if (selectedNode instanceof DBNDatabaseNode) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.jkiss.dbeaver.model.*;
        if (navSelection != null) {
        DBSObject selectedObject = NavigatorUtils.getSelectedObject(selection);
            return dataSource == null ? null : dataSource.getContainer();



            return ((DBPContextProvider) activePart).getExecutionContext();
    public static DBCExecutionContext getExecutionContextFromPart(IWorkbenchPart activePart) {
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                return container;
        DBSObject selectedObject = NavigatorUtils.getSelectedObject(selection);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *
        if (activePart instanceof DBPDataSourceContainerProvider) {
import org.jkiss.dbeaver.model.struct.DBSObject;
 * you may not use this file except in compliance with the License.
public abstract class AbstractDataSourceHandler extends AbstractHandler {
import org.jkiss.dbeaver.Log;
            IEditorPart editor = HandlerUtil.getActiveEditor(event);
    }
 * Unless required by applicable law or agreed to in writing, software
            DBNNode selectedNode = NavigatorUtils.getSelectedNode(navSelection);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
            return (DBPDataSourceContainer) selectedObject;
        return null;
        return getActiveDataSourceContainer(activeEditor, activePart, selection);
