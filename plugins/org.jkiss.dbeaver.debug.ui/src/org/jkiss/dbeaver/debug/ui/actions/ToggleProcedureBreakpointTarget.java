        int lineNumber = textSelection.getStartLine();
    @Override
    }
    }
    public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
 * You may obtain a copy of the License at
/*
 *     http://www.apache.org/licenses/LICENSE-2.0


        IResource resource = extractResource(editorPart, selection);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
        return true;
        return resolveWorkspaceResource(databaseObject);

 * Licensed under the Apache License, Version 2.0 (the "License");
        return false;
import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
    }
        if (node == null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        toggleLineBreakpoints(part, selection);
                if (nodeItemPath.equals(databaseBreakpoint.getNodePath())) {
            databaseObject, node, resource, breakpointDescriptor,
    public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
    @Override
            throws CoreException {
    public boolean canToggleBreakpoints(IWorkbenchPart part, ISelection selection) {
        // nothing by default
            return;

        for (IBreakpoint breakpoint : breakpoints) {
        IEditorPart editorPart = (IEditorPart) part;
    public static IResource resolveWorkspaceResource(DBSObject dbsObject) {
                        return;
        DBSObject databaseObject = DebugUI.extractDatabaseObject(editorPart);

import org.jkiss.dbeaver.debug.core.breakpoints.IDatabaseBreakpoint;
            return;
    }
    }
                IDatabaseBreakpoint databaseBreakpoint = (IDatabaseBreakpoint) breakpoint;
        String nodeItemPath = node.getNodeUri();
    @Override
        // nothing by default
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.text.ITextSelection;
            lineNumber + 1, charstart, charend, true);
        // create line breakpoint (doc line numbers start at 0)
    public void toggleBreakpointsWithEvent(IWorkbenchPart part, ISelection selection, Event event)
    @Override

import org.jkiss.dbeaver.debug.DBGConstants;

}
                        DebugUITools.deleteBreakpoints(new IBreakpoint[]{breakpoint}, part.getSite().getShell(), null);
    public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
    protected IResource extractResource(IEditorPart part, ISelection selection) {
                }
            throw new CoreException(GeneralUtils.makeErrorStatus(
        ITextSelection textSelection = (ITextSelection) selection;
        if (databaseObject == null) {
    public void toggleBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
        return false;
    public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {

 *
import org.eclipse.debug.core.DebugPlugin;

        DBGBreakpointDescriptor breakpointDescriptor = GeneralUtils.adapt(databaseObject, DBGBreakpointDescriptor.class);
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTargetExtension2;
    public boolean canToggleBreakpointsWithEvent(IWorkbenchPart part, ISelection selection, Event event) {
    }
        }
                    }
 * limitations under the License.
import org.eclipse.debug.core.model.ILineBreakpoint;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Override
        return canToggleLineBreakpoints(part, selection);
public class ToggleProcedureBreakpointTarget implements IToggleBreakpointsTargetExtension2 {
        DBSObject databaseObject = DebugUI.extractDatabaseObject(part);
    @Override
import org.jkiss.dbeaver.model.rcp.RCPProject;
 * DBeaver - Universal Database Manager
    }
            }
        return node == null || !(node.getOwnerProject() instanceof RCPProject rcpProject) ? null : rcpProject.getEclipseProject();
import org.eclipse.jface.viewers.ISelection;
                .getBreakpoints(DBGConstants.MODEL_IDENTIFIER_DATABASE);


    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
import org.jkiss.dbeaver.model.DBUtils;
        DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(dbsObject);
    }
            if (breakpoint instanceof IDatabaseBreakpoint) {
import org.jkiss.dbeaver.debug.core.breakpoints.DatabaseLineBreakpoint;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
        if (resource == null) {
import org.eclipse.core.runtime.CoreException;
        }
                "Object '" + DBUtils.getObjectFullName(databaseObject, DBPEvaluationContext.UI) + "' doesn't support breakpoints"));
import org.eclipse.swt.widgets.Event;
        new DatabaseLineBreakpoint(
        return false;
        }
import org.eclipse.ui.IEditorPart;
                    if (((ILineBreakpoint) breakpoint).getLineNumber() == (lineNumber + 1)) {
        int charstart = -1, charend = -1;
    public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
        IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
    }
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
        }

            return;
    }


        if (breakpointDescriptor == null) {
 * See the License for the specific language governing permissions and
        // nothing by default
import org.jkiss.dbeaver.model.DBPEvaluationContext;
package org.jkiss.dbeaver.debug.ui.actions;
    }

import org.jkiss.dbeaver.debug.ui.DebugUI;

    public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {

import org.eclipse.debug.core.model.IBreakpoint;
        }
        DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(new VoidProgressMonitor(), databaseObject, false);
 * you may not use this file except in compliance with the License.
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.resources.IResource;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

