                        DBCStatementType.QUERY,
            } else {
                final OracleSourceObject sourceObject = objects.get(0);
                    // Show compile errors
                element.setText("Compile " + objects.size() + " objects");

                            compileUnit(monitor, compileLog, unit);
import org.eclipse.swt.SWT;
                    }
 */
import org.jkiss.dbeaver.model.exec.DBCStatementType;
        final IWorkbenchPart activePart = HandlerUtil.getActiveEditor(event);
        if (!objects.isEmpty()) {
        }
                        } finally {
 * DBeaver - Universal Database Manager
                    NullProgressMonitor monitor = new NullProgressMonitor();
                dialog.open();
import java.lang.reflect.InvocationTargetException;
                    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.compile.DBCCompileLogBase;
        final ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Shell;
 * you may not use this file except in compliance with the License.
                    }
                    objects.add(sourceObject);
    public Object execute(ExecutionEvent event) throws ExecutionException


        if (ArrayUtils.isEmpty(compileActions)) {

                    if (sourceHost != null) {
                    DBWorkbench.getPlatformUI().showError("Unexpected compilation error", null, error);
                    }
                if (action instanceof OracleObjectPersistAction) {
            }
            if (objects.size() > 1) {
                            line = oce.getLine();
                } catch (DBCException e) {
import java.util.Map;
    public void updateElement(UIElement element, Map parameters)
                }
                    if (dbsObject instanceof OracleSourceObject) {
                        dbStat.executeStatement();
    }
                        sourceHost = activePart.getAdapter(DBCSourceHost.class);
                        sourceHost.positionSource(line, position);
            if (activePart instanceof EntityEditor) {
import org.jkiss.utils.ArrayUtils;
import org.jkiss.dbeaver.model.exec.compile.DBCCompileError;
        return null;
                    entityEditor.doSave(monitor);
                        }
                            monitor.done();
        if (!objects.isEmpty()) {
                final DBCCompileLog compileLog = sourceHost == null ? new DBCCompileLogBase() : sourceHost.getCompileLog();
                }
    }
                element.setText("Compile " + objectType/* + " '" + sourceObject.getName() + "'"*/);
public class CompileHandler extends OracleTaskHandler
                EntityEditor entityEditor = (EntityEditor) activePart;
import org.jkiss.dbeaver.model.exec.DBCStatement;
        if (objects.isEmpty()) {

                try {
                if (monitor.isCanceled()) {
                } catch (InvocationTargetException e) {
                        monitor.beginTask("Compile", 1);
import org.jkiss.dbeaver.model.struct.DBSObject;
            final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
    public static boolean compileUnit(DBRProgressMonitor monitor, DBCCompileLog compileLog, OracleSourceObject unit) throws DBException {
import org.jkiss.dbeaver.model.exec.compile.DBCSourceHost;
import org.eclipse.ui.IEditorPart;
                } else if (!CommonUtils.isEmpty(compileLog.getErrorStack())) {
 *
        List<OracleSourceObject> objects = getOracleSourceObjects(element);
                if (((IEditorPart) activePart).getEditorInput() instanceof IDatabaseEditorInput) {
                        fullMessage.append(oce.toString()).append(GeneralUtils.getDefaultLineSeparator());
import org.jkiss.dbeaver.model.DBUtils;


                    for (DBCCompileError oce : compileLog.getErrorStack()) {
            return success;
 * Unless required by applicable law or agreed to in writing, software
                        error = compileLog.getError();
import org.eclipse.core.commands.ExecutionException;
                if (error != null) {
                        }
                OracleCompilerDialog dialog = new OracleCompilerDialog(activeShell, objects);
                DBCSourceHost sourceHost = null;
import java.util.List;
 * limitations under the License.
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    sourceHost = RuntimeUtils.getObjectAdapter(activePart, DBCSourceHost.class);
                if (sourceObject != null) {
            }
                    {
                    if (compileLog.getError() != null) {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
import org.jkiss.dbeaver.ui.UIUtils;
            unit.refreshObjectState(monitor);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        success = false;

                }
                        activePart.getSite().getPage().activate(activePart);
            throw new DBCException("No compile actions associated with " + unit.getSourceType().name());
                    }
                // Save editor before compile
                if (sourceHost != null && sourceHost.getSourceObject() != unit) {

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.eclipse.ui.IWorkbenchPart;

                    if (sourceHost == null) {
                        sourceHost.setCompileInfo(errorTitle, true);
                compileLog.clearLog();

                    UIUtils.showMessageBox(activeShell, "Done", message, SWT.ICON_INFORMATION);
                    DBSObject dbsObject = ((IDatabaseEditorInput) ((IEditorPart) activePart).getEditorInput()).getDatabaseObject();
                    });
 * distributed under the License is distributed on an "AS IS" BASIS,

                        objects.add((OracleSourceObject)dbsObject);
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.oracle.model.OracleObjectPersistAction;
                    throw e;
        }
        final DBEPersistAction[] compileActions = unit.getCompileActions(monitor);
                    error = e.getTargetException();
                final OracleSourceObject unit = objects.get(0);
                final String script = action.getScript();
            if (activePart instanceof IEditorPart) {
                Throwable error = null;
                        } catch (DBException e) {
import org.eclipse.core.commands.ExecutionEvent;
    @Override
    private List<OracleSourceObject> getSelectedObjects(ExecutionEvent event)
import org.eclipse.ui.handlers.HandlerUtil;
 *
                    }
            }
        if (currentSelection instanceof IStructuredSelection && !currentSelection.isEmpty()) {
                final Object element = iter.next();
import org.jkiss.utils.CommonUtils;
                    String message = unit.getName() + " compiled successfully";
                    action.afterExecute(session, e);
        return objects;
        List<OracleSourceObject> objects = new ArrayList<>();
                // Sequence can not be compiled
                return false;
                    if (sourceHost != null && sourceHost.getSourceObject() == unit && line > 0 && position >= 0) {
                    UIUtils.runInProgressService(monitor -> {
        final List<OracleSourceObject> objects = getSelectedObjects(event);
                        try {
                    if (monitor.isCanceled()) {
        }
*/
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.struct.DBSObjectState;
                if (entityEditor.isDirty()) {
                }
                    action.afterExecute(session, null);
import org.jkiss.dbeaver.DBException;
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    {
import java.util.ArrayList;
/*
                try {

        }
                } catch (InterruptedException e) {
import org.jkiss.dbeaver.model.exec.DBCException;
}                    if (sourceHost != null) {
            final Shell activeShell = HandlerUtil.getActiveShell(event);
import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
                    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.oracle.ui.actions;
                } else {
                        action.beforeExecute(session);
import org.eclipse.ui.menus.UIElement;
                    String errorTitle = unit.getName() + " compilation failed";
                        if (line < 0) {
import org.jkiss.dbeaver.ext.oracle.model.OracleSequence;
                    return null;
{
import org.eclipse.jface.viewers.ISelection;
/*
            }
                final OracleSourceObject sourceObject = RuntimeUtils.getObjectAdapter(element, OracleSourceObject.class);
                String objectType = OracleUtils.formatWord(sourceObject.getSourceType().name());
import org.jkiss.dbeaver.model.DBPEvent;
                        script,
            if (unit instanceof OracleSequence) {
                    }
    {
            }
import org.jkiss.dbeaver.utils.RuntimeUtils;
import java.util.Iterator;
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
                    int line = -1, position = -1;
                    break;
                }
                    DBWorkbench.getPlatformUI().showError(errorTitle, fullMessage.toString());

                }
            for (Iterator<?> iter = ((IStructuredSelection) currentSelection).iterator(); iter.hasNext(); ) {
        try (JDBCSession session = DBUtils.openUtilSession(monitor, unit, "Compile '" + unit.getName() + "'")) {
            }
                        false, false, false))
            final DBSObjectState oldState = unit.getObjectState();
                }
    {
                    try (DBCStatement dbStat = session.prepareStatement(
                compileLog.trace(script);
                if (activePart != null) {
            }
        }
                }
                            position = oce.getPosition();
                }
            boolean success = true;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        // Save failed - doesn't make sense to compile
                    sourceHost = null;
 *
                        sourceHost.setCompileInfo(message, true);
            for (DBEPersistAction action : compileActions) {
            if (objects.size() == 1) {
                        return null;

import org.jkiss.dbeaver.model.exec.compile.DBCCompileLog;
    }
                // USe null monitor as entity editor has its own detached job for save
            if (unit.getObjectState() != oldState) {
                    if (!logObjectErrors(session, compileLog, unit, ((OracleObjectPersistAction) action).getObjectType())) {
import org.eclipse.jface.viewers.IStructuredSelection;
        }
                        sourceHost.showCompileLog();
                            throw new InvocationTargetException(e);
                    // If compiled object is currently open in editor - try to position on error line
                unit.getDataSource().getContainer().fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, unit));
                    StringBuilder fullMessage = new StringBuilder();
            }
            } else {
