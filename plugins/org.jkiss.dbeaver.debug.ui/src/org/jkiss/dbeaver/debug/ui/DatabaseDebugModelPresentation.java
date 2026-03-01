    public void setAttribute(String attribute, Object value) {
import org.eclipse.debug.core.DebugException;
            
    }

import org.jkiss.dbeaver.debug.core.model.*;
            }

            }
    public Object getAttribute(String attribute) {
                Object[] bindings = new Object[] { breakpoint.getObjectName(), lineNumber };
import org.eclipse.osgi.util.NLS;

    private static Log log = Log.getLog(DatabaseDebugModelPresentation.class);
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
            IStatus status = DebugUtils.newErrorStatus(message, e);
import org.eclipse.ui.model.WorkbenchLabelProvider;
            }
        if (element instanceof DBNDatabaseNode) {
import org.eclipse.ui.IEditorInput;
    }
package org.jkiss.dbeaver.debug.ui;
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
    public void dispose() {
import org.eclipse.swt.graphics.Image;
            String valueString = value.getValueString();
    public IEditorInput getEditorInput(Object element) {
    @Override
    public String getEditorId(IEditorInput input, Object element) {
            if (element instanceof DatabaseProcess) {
        this.labelProvider = labelProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (element instanceof DatabaseThread) {

 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
                log.error(message, e);
    private final ILabelProvider labelProvider;
            if (element instanceof IDatabaseDebugTarget) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                return databaseDebugTarget.getName();

            }
import org.eclipse.debug.core.model.IValue;


        DBGEditorAdvisor editorAdvisor = DebugUI.findEditorAdvisor(dbnNode.getDataSourceContainer());
    public String getText(Object element) {
        this(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());

public class DatabaseDebugModelPresentation extends LabelProvider implements IDebugModelPresentationExtension {
 */
                return variable.getName();
 * See the License for the specific language governing permissions and
        }.execute();
import org.eclipse.core.runtime.IStatus;
        attributes.put(attribute, value);
import org.jkiss.dbeaver.model.navigator.DBNModel;
import org.jkiss.dbeaver.Log;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.debug.core.breakpoints.IDatabaseBreakpoint;
                DBNNode node = navigatorModel.getNodeByPath(new VoidProgressMonitor(), nodePath);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    @Override
        IEditorPart editorPart = new UITask<IEditorPart>() {
import org.eclipse.debug.ui.IValueDetailListener;
                String message = NLS.bind("Unable to resolve editor input for breakpoint {0}", breakpoint);
        editorAttrs.put(DBPScriptObject.OPTION_DEBUGGER_SOURCE, true);
                }
            protected IEditorPart runTask() {
            } catch (Exception e) {
            }
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
                int lineNumber = breakpoint.getLineNumber();
    }
    public DatabaseDebugModelPresentation(ILabelProvider labelProvider) {
import org.eclipse.debug.ui.IDebugModelPresentationExtension;
        try {
                return NLS.bind("{0} - [line:{1}]", bindings);
            log.log(status);
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        } catch (CoreException e) {


    }
        attributes.clear();
            try {
            String message = NLS.bind("Unable to compute valie for {0}", value);
            return createEditorInput(databaseNode);
 * Unless required by applicable law or agreed to in writing, software
    public Image getImage(Object element) {
                DatabaseProcess process = (DatabaseProcess) element;
            }

        return null;
    private final Map<String, Object> attributes = new HashMap<>();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    @Override
    }
            IDatabaseBreakpoint breakpoint = (IDatabaseBreakpoint) element;

                DatabaseThread thread = (DatabaseThread) element;
        try {
    public void computeDetail(IValue value, IValueDetailListener listener) {
 *
/*
    }
import java.util.HashMap;
        Map<String, Object> editorAttrs = new HashMap<>();
        if (element instanceof IDatabaseBreakpoint) {
            return "<not responding>";
import org.jkiss.dbeaver.runtime.DBWorkbench;
            listener.detailComputed(value, valueString);
            }
    @Override
            if (element instanceof DatabaseStackFrame) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return stackFrame.getName();

import java.util.Map;
                return thread.getName();

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
                DatabaseStackFrame stackFrame = (DatabaseStackFrame) element;
            if (element instanceof DatabaseVariable) {
import org.jkiss.dbeaver.ui.UITask;
        }
                if (node instanceof DBNDatabaseNode) {
import org.eclipse.ui.IEditorPart;

                    return createEditorInput(databaseNode);
        return attributes.get(attribute);
}
        return labelProvider.getText(element);
import org.eclipse.jface.viewers.ILabelProvider;
        return false;
                IDatabaseDebugTarget databaseDebugTarget = (IDatabaseDebugTarget) element;
                return process.getLabel();
    @Override
import org.jkiss.dbeaver.model.DBPScriptObject;


        } catch (DebugException e) {
        }
import org.jkiss.dbeaver.debug.core.breakpoints.DatabaseLineBreakpoint;
 *
                DatabaseLineBreakpoint breakpoint = (DatabaseLineBreakpoint) element;
            if (element instanceof DatabaseLineBreakpoint) {
                return NavigatorHandlerObjectOpen.openEntityEditor(dbnNode, null, sourceFolderId, editorAttrs, UIUtils.getActiveWorkbenchWindow(), false);
        return editorPart == null ? null : editorPart.getEditorInput();
                DatabaseVariable variable = (DatabaseVariable) element;
        String sourceFolderId = editorAdvisor == null ? null : editorAdvisor.getSourceFolderId();
                DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();

    public boolean requiresUIThread(Object element) {
    }

            }
            listener.detailComputed(value, e.getMessage());

            @Override
        super.dispose();
        // FIXME:AF: register adapters
        }
    @Override
    public DatabaseDebugModelPresentation() {
            DBNDatabaseNode databaseNode = (DBNDatabaseNode) element;
    @Override
                    DBNDatabaseNode databaseNode = (DBNDatabaseNode) node;
import org.jkiss.dbeaver.debug.core.DebugUtils;
        return labelProvider.getImage(element);
    }
import org.eclipse.jface.viewers.LabelProvider;
    }
        return EntityEditor.ID;
 *
        
import org.eclipse.core.runtime.CoreException;
    }
    }
                String nodePath = breakpoint.getNodePath();
 * DBeaver - Universal Database Manager

    protected IEditorInput createEditorInput(DBNDatabaseNode dbnNode) {
