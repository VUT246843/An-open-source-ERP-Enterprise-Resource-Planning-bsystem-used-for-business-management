                        DBCStatementType.SCRIPT,
                if (action instanceof OracleObjectPersistAction) {
            } else {
import java.util.List;
                EntityEditor entityEditor = (EntityEditor) activePart;
import org.jkiss.dbeaver.model.exec.compile.DBCCompileLog;
                String objectType = OracleUtils.formatWord(sourceObject.getSourceType().name());
                        // Save failed - doesn't make sense to compile
import org.jkiss.dbeaver.ext.oracle.model.OracleObjectPersistAction;
    {
                            runJob(monitor, compileLog, job);
                    objects.add(sourceJob);
                    DBWorkbench.getPlatformUI().showError("Unexpected run schedule error", null, error);
    public void updateElement(UIElement element, Map parameters)
 * This handler provides the capability to run scheduled jobs.
            return true;
import org.eclipse.core.runtime.NullProgressMonitor;
                compileLog.trace(script);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

    {
                    }
/*
            final OracleSchedulerJob sourceJob = RuntimeUtils.getObjectAdapter(activePart, OracleSchedulerJob.class);
            }
                    int line = -1, position = -1;
        }
import org.jkiss.dbeaver.Log;
            final Shell activeShell = HandlerUtil.getActiveShell(event);
            }
                    }
                } else if (!CommonUtils.isEmpty(compileLog.getErrorStack())) {

                        script,
                        } catch (DBException e) {
import org.jkiss.dbeaver.model.DBUtils;
        final ISelection currentSelection = HandlerUtil.getCurrentSelection(event);

                    String errorTitle = job.getName() + " run schedule failed";
                        if (line < 0) {

import org.eclipse.ui.handlers.HandlerUtil;
                    entityEditor.doSave(monitor);
                    if (!logObjectErrors(session, compileLog, job, ((OracleObjectPersistAction) action).getObjectType())) {
            if (objects.size() == 1) {
 *
                }
        if (!objects.isEmpty()) {
                    try (DBCStatement dbStat = session.prepareStatement(
                } catch (InvocationTargetException e) {
                    return null;
                        }
    {
import org.jkiss.dbeaver.ui.UIUtils;
        final DBEPersistAction[] compileActions = job.getRunActions();
            }
import org.eclipse.jface.viewers.ISelection;
                        }
import org.eclipse.core.commands.ExecutionEvent;

        }
import org.eclipse.ui.IWorkbenchPart;
                final String script = action.getScript();
import org.jkiss.dbeaver.model.exec.DBCStatementType;
            job.refreshObjectState(monitor);
 */
import java.lang.reflect.InvocationTargetException;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    if (monitor.isCanceled()) {
        }
                }
        final List<OracleSchedulerJob> objects = getSelectedJobs(event);
                }
import org.jkiss.dbeaver.model.exec.compile.DBCCompileError;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    for (DBCCompileError oce : compileLog.getErrorStack()) {
                job.getDataSource().getContainer().fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, job));
    @Override
            }
                    throw e;
        }
 *
                final OracleSchedulerJob job = objects.get(0);
 * Unless required by applicable law or agreed to in writing, software
                Throwable error = null;
                    UIUtils.showMessageBox(activeShell, "Done", message, SWT.ICON_INFORMATION);
                try {
                if (entityEditor.isDirty()) {
import org.jkiss.dbeaver.model.exec.DBCException;
            }
                        success = false;
    public static boolean runJob(DBRProgressMonitor monitor, DBCCompileLog compileLog, OracleSchedulerJob job) throws DBException
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.core.commands.ExecutionException;
                try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Log log = Log.getLog(JobRunHandler.class);
    private List<OracleSchedulerJob> getSelectedJobs(ExecutionEvent event)
import org.jkiss.utils.ArrayUtils;
import org.eclipse.jface.viewers.IStructuredSelection;

        List<OracleSourceObject> objects = getOracleSourceObjects(element);

    }
                // Use null monitor as entity editor has its own detached job for save

import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
                final DBCCompileLog compileLog = new DBCCompileLogBase();
                // Save editor before run
            boolean success = true;
                            position = oce.getPosition();
                    UIUtils.runInProgressService(monitor -> {
    }

                }
                    }
                    action.afterExecute(session, e);
    {
                } catch (DBCException e) {
                if (monitor.isCanceled()) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                element.setText("Run " + objects.size() + " jobs");
                    // Show compile errors
                } else {
                        error = compileLog.getError();
 * distributed under the License is distributed on an "AS IS" BASIS,
                        fullMessage.append(oce.toString()).append(GeneralUtils.getDefaultLineSeparator());
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.DBCStatement;
                compileLog.clearLog();
                        false, false, false))
    @Override
                    }
 */
            if (objects.size() > 1) {
                element.setText("Run " + objectType/* + " '" + sourceObject.getName() + "'"*/);
                    {
                        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.SWT;
                    break;
public class JobRunHandler extends OracleTaskHandler
                    error = e.getTargetException();
import org.jkiss.dbeaver.model.exec.compile.DBCCompileLogBase;
                    }
            for (Iterator<?> iter = ((IStructuredSelection) currentSelection).iterator(); iter.hasNext(); ) {
        }
                            line = oce.getLine();
            if (activePart instanceof EntityEditor) {
 * You may obtain a copy of the License at
                    String message = job.getName() + " successfully scheduled to run";
package org.jkiss.dbeaver.ext.oracle.ui.actions;
            }
                    });
import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
import java.util.ArrayList;
            }
import org.eclipse.ui.menus.UIElement;
            return success;

        List<OracleSchedulerJob> objects = new ArrayList<>();
                objects.add(sourceJob);
                    StringBuilder fullMessage = new StringBuilder();
import org.jkiss.dbeaver.utils.GeneralUtils;
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * @author crowne
                }
                            throw new InvocationTargetException(e);

                    action.afterExecute(session, null);
            final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
        if (!objects.isEmpty()) {
 * you may not use this file except in compliance with the License.
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
 * The structure is copied from CompileHandler
import org.jkiss.dbeaver.model.DBPEvent;
/**
                if (error != null) {
                final Object element = iter.next();
}                        dbStat.executeStatement();
{
        if (ArrayUtils.isEmpty(compileActions)) {
        try (JDBCSession session = DBUtils.openUtilSession(monitor, job, "Run '" + job.getName() + "'")) {
import org.jkiss.dbeaver.ext.oracle.model.OracleSchedulerJob;
                final OracleSchedulerJob sourceJob = RuntimeUtils.getObjectAdapter(element, OracleSchedulerJob.class);
                }
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.widgets.Shell;
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
                    DBWorkbench.getPlatformUI().showError(errorTitle, fullMessage.toString());
    public Object execute(ExecutionEvent event) throws ExecutionException
                        return null;
            if (job.getObjectState() != oldState) {
import org.jkiss.dbeaver.model.struct.DBSObjectState;
            final DBSObjectState oldState = job.getObjectState();
            if (sourceJob != null) {
import java.util.Iterator;
                } catch (InterruptedException e) {
                    NullProgressMonitor monitor = new NullProgressMonitor();
                    if (compileLog.getError() != null) {

        final IWorkbenchPart activePart = HandlerUtil.getActiveEditor(event);
    }
                if (sourceJob != null) {
            for (DBEPersistAction action : compileActions) {
        return null;
        return objects;
                        action.beforeExecute(session);
        if (objects.isEmpty()) {
        if (currentSelection instanceof IStructuredSelection && !currentSelection.isEmpty()) {

                final OracleSourceObject sourceObject = objects.get(0);
