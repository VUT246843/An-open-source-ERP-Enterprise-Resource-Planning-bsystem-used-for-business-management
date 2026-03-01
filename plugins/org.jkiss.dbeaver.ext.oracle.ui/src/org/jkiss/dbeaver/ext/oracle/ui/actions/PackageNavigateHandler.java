            }
            OraclePackage procPackage = procedure.getParentObject();
            } catch (DBException e) {
                final Collection<OracleProcedureArgument> parameters = procedure.getParameters(monitor);
        if (partSite != null) {
 *
        DBCCompileLog compileLog,
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                        if (error.isError()) {
                        DBCStatementType.QUERY,
        OracleObjectType objectType)
                        dbStat.executeStatement();
            final ISelectionProvider selectionProvider = partSite.getSelectionProvider();
                }
                            @Override
                    }
            }
                        script,
    }
                        });
                        }
        @Override
 *
                    }
        public NavigateJob(OracleProcedurePackaged procedure, SQLEditorBase sqlEditor) {
            unit.refreshObjectState(monitor);
                        final Object item = iter.next();
                if (action instanceof OracleObjectPersistAction) {
            }
import org.eclipse.core.commands.ExecutionEvent;
        }

}import org.eclipse.ui.handlers.HandlerUtil;
                        }
                dbStat.setString(1, unit.getSchema().getName());
                }
                        procRegex += "\\s*\\([^\\)]+\\)";
import java.util.ArrayList;
                    if (procRegion != null) {
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
                compileLog.trace(script);
                "SELECT * FROM ALL_ERRORS WHERE OWNER=? AND NAME=? AND TYPE=? ORDER BY SEQUENCE")) {
import org.eclipse.core.runtime.IStatus;
        JDBCSession session,
                    throw e;
import org.jkiss.code.NotNull;
            }
            final IDocument document = sqlEditor.getDocument();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public void updateElement(UIElement element, Map parameters)
public class PackageNavigateHandler extends AbstractHandler //implements IElementUpdater
                    return !hasErrors;
                    try (DBCStatement dbStat = session.prepareStatement(
                        if (arg.getParameterKind() != DBSProcedureParameterKind.OUT && !arg.isResultArgument()) {
 * you may not use this file except in compliance with the License.
            } catch (InterruptedException e) {
        private final SQLEditorBase sqlEditor;
 * distributed under the License is distributed on an "AS IS" BASIS,
            return RuntimeUtils.getObjectAdapter(firstElement, OracleProcedurePackaged.class);
                try (ResultSet dbResult = dbStat.executeQuery()) {
                }
                element.setText("Compile " + objectType*/
                String procRegex = procedure.getProcedureType().name() + "\\s+" + procedure.getName();
                int checkAttempts = 0;
        return null;
    }
                String objectType = UITextUtils.formatWord(sourceObject.getSourceType().name());
    }
            if (selectionProvider != null) {
        @NotNull
                            "ERROR".equals(dbResult.getString("ATTRIBUTE")),
                return Status.CANCEL_STATUS;
        }

    }
                    break;
 */
                }
    {
 *
                        } else {
        }
import org.eclipse.jface.text.FindReplaceDocumentAdapter;
                navigate(monitor);
                final IWorkbenchPart activePart = partSite.getPart();
                while (!((SQLEditorNested) sqlEditor).isDocumentLoaded() && checkAttempts < 10) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        IWorkbenchPartSite partSite = UIUtils.getWorkbenchPartSite(element.getServiceLocator());

                        if (sourceObject != null) {
            return Status.OK_STATUS;
 * DBeaver - Universal Database Manager
        private final OracleProcedurePackaged procedure;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.utils.GeneralUtils;
                            }
import org.eclipse.jface.text.BadLocationException;
                    new NavigateJob(procedure, sqlEditor).schedule();
import org.eclipse.core.runtime.Status;
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
/*
                    objects.add(sourceObject);
            this.procedure = procedure;
            log.error("Can't read user errors", e);
            return success;
import org.eclipse.jface.viewers.IStructuredSelection;
            }
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
            }
        }
                final OracleSourceObject sourceObject = objects.get(0);
);
        return null;

import org.eclipse.jface.text.IDocument;
import org.jkiss.dbeaver.ext.oracle.model.OraclePackage;
            IEditorPart entityEditor = NavigatorHandlerObjectOpen.openEntityEditor(procPackage);
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
                }
                }
                    if (!inParams.isEmpty()) {

            return true;
        final DBEPersistAction[] compileActions = unit.getCompileActions();
                    boolean hasErrors = false;
    public static boolean logObjectErrors(
 * limitations under the License.
                        false, false, false))

/*
    public static boolean compileUnit(DBRProgressMonitor monitor, DBCCompileLog compileLog, OracleSourceObject unit) throws DBCException
                    List<OracleProcedureArgument> inParams = new ArrayList<>();

        if (ArrayUtils.isEmpty(compileActions)) {
                }

                    action.afterExecute(session, null);

                element.setText("Compile " + objects.size() + " objects");
        final ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
        }

 * Copyright (C) 2010-2025 DBeaver Corp and others

    {
                    for (OracleProcedureArgument arg : parameters) {
        final OracleProcedurePackaged procedure = getSelectedProcedure(event);
                    while (dbResult.next()) {
            final DBSObjectState oldState = unit.getObjectState();
        try (JDBCSession session = DBUtils.openUtilSession(monitor, unit.getDataSource(), "Compile '" + unit.getName() + "'")) {
                    log.error("Error finding procedure source", e);
                    }
                if (sqlEditor != null) {

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
            if (document != null) {
            if (objects.size() > 1) {
            return false;
                                sqlEditor.selectAndReveal(procRegion.getOffset(), procRegion.getLength());
                dbStat.setString(3, objectType.getTypeName());
                        DBCCompileError error = new DBCCompileError(
    private OracleProcedurePackaged getSelectedProcedure(ExecutionEvent event)

    @Override
 * See the License for the specific language governing permissions and
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        hasErrors = true;
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                final String script = action.getScript();
                unit.getDataSource().getContainer().fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, unit));
                            objects.add(sourceObject);

                SQLEditorBase sqlEditor = entityEditor.getAdapter(SQLEditorBase.class);
                    }
        if (procedure != null) {
                    }
            boolean success = true;
            try {
*/
            if (objects.isEmpty()) {
                } catch (DBCException e) {
    static class NavigateJob extends AbstractJob {
                    {

import org.eclipse.jface.text.IRegion;
        if (!objects.isEmpty()) {

import java.util.List;
import org.jkiss.dbeaver.ui.UIUtils;
                    final IRegion procRegion = findAdapter.find(0, procRegex, true, false, false, true);
        private void navigate(DBRProgressMonitor monitor) throws InterruptedException, DBException {
    }
import org.jkiss.dbeaver.Log;
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
    {
    }
    {
        }
 * Unless required by applicable law or agreed to in writing, software
                    Thread.sleep(500);
                    checkAttempts++;
            for (DBEPersistAction action : compileActions) {
import org.eclipse.jface.viewers.ISelection;
        OracleSourceObject unit,
                dbStat.setString(2, unit.getName());
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorNested;
            super("Navigate procedure '" + procedure.getFullyQualifiedName(DBPEvaluationContext.UI));
        try {
            }
            if (entityEditor instanceof EntityEditor) {
        List<OracleSourceObject> objects = new ArrayList<>();
                            dbResult.getInt("POSITION"));
                }
                    if (!logObjectErrors(session, compileLog, unit, ((OracleObjectPersistAction) action).getObjectType())) {
    private static final Log log = Log.getLog(PackageNavigateHandler.class);
                } catch (BadLocationException e) {
                            dbResult.getInt("LINE"),
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.ext.oracle.model.OracleProcedurePackaged;

                try {
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (parameters != null) {
                }
                        UIUtils.asyncExec(new Runnable() {
            }
import org.eclipse.core.commands.AbstractHandler;
                try {
    {
                            compileLog.error(error);
                            public void run() {
                    }
            this.sqlEditor = sqlEditor;
/* + " '" + sourceObject.getName() + "'"*//*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Collection;
                        final OracleSourceObject sourceObject = RuntimeUtils.getObjectAdapter(item, OracleSourceObject.class);
            } else {
        } catch (Exception e) {
    public Object execute(ExecutionEvent event) throws ExecutionException
    public PackageNavigateHandler() {
            }
                    action.afterExecute(session, e);
                final FindReplaceDocumentAdapter findAdapter = new FindReplaceDocumentAdapter(document);
        }
            Object firstElement = ((IStructuredSelection) currentSelection).getFirstElement();
                        success = false;
                ISelection selection = selectionProvider.getSelection();
                            dbResult.getString("TEXT"),
            }
                }
                            compileLog.warn(error);
            if (unit.getObjectState() != oldState) {

    @Override
        if (currentSelection instanceof IStructuredSelection && !currentSelection.isEmpty()) {
package org.jkiss.dbeaver.ext.oracle.ui.actions;
                final OracleSourceObject sourceObject = RuntimeUtils.getObjectAdapter(activePart, OracleSourceObject.class);
                    for (Iterator<?> iter = ((IStructuredSelection) selection).iterator(); iter.hasNext(); ) {
                if (sourceObject != null) {
        }
                    }
 * You may obtain a copy of the License at
                            inParams.add(arg);
                return GeneralUtils.makeExceptionStatus(e);
            if (sqlEditor instanceof SQLEditorNested) {
        }
import org.jkiss.dbeaver.ext.oracle.model.OracleProcedureArgument;
                if (monitor.isCanceled()) {
                        }
{

                ((EntityEditor) entityEditor).switchFolder("source.definition");
