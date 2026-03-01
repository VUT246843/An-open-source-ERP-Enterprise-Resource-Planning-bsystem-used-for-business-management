

            currentSelection,
                    // So let's give it a chance and wait for 10 seconds
        }
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.ISelection;
                if (parentObject instanceof DBSEntity) {
 */

                @NotNull
    }
                    return Status.OK_STATUS;
        } catch (Exception e) {
    {
            doRun,
 *
        if (entities.size() == 1) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
                DBSObject parentObject = object.getParentObject(); // It can be table properties window or database navigator table folder (columns, keys etc.)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.code.NotNull;

        String title,
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.CoreException;
            log.debug("No active datasource");
            IFile scriptFile = SQLEditorUtils.createNewScript(project, folder, navigatorContext);
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.eclipse.core.commands.ExecutionException;
        String title = "Query";

                        if (doRun) {
            workbenchWindow,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
    {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionEvent;
                @Override
        DBPProject project = navigatorContext.getProject();
            DBWorkbench.getPlatformUI().showError("Open console", "Can open SQL editor", e);
        String title,
                        }

                                false,
import org.eclipse.ui.IWorkbenchWindow;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (object instanceof DBSEntity) {
            };
        openAndExecuteSQLScript(

     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (OPEN_FILE_EDITOR && project != null && project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
    }
    public SQLEditorHandlerOpenObjectConsole()
import java.util.List;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        boolean forceProcessAsScript
import org.jkiss.dbeaver.ui.editors.sql.generator.SQLGeneratorContributor;

            }
        UIUtils.runInUI(workbenchWindow, generator);
            if (navContext == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (editor != null && editor.getDocument() != null) {
            }
}
    private static final Log log = Log.getLog(SQLEditorHandlerOpenObjectConsole.class);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } else {
    public Object execute(ExecutionEvent event) throws ExecutionException
        }
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSObject;
        if (navContext == null || navContext.getDataSourceContainer() == null) {
        SQLNavigatorContext navigatorContext,
                navContext = new SQLNavigatorContext(object);
        return null;
    /**
                        return Status.OK_STATUS;
        SQLNavigatorContext navContext = null;
    public static void openAndExecuteSQLScript(

import org.jkiss.dbeaver.model.DBUtils;
    ) throws CoreException {
    
    void openConsole(IWorkbenchWindow workbenchWindow, DBRRunnableWithResult<String> generator,
/*
    }
            false);
                    }
        boolean doRun,
import org.eclipse.core.runtime.Status;
        SQLNavigatorContext navigatorContext,
            return null;
     * openAndExecuteSQLScript in a SQL window
            execJob.schedule();
import org.eclipse.core.commands.AbstractHandler;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        ISelection currentSelection,
        String sql
    public static void openAndExecuteSQLScript(
        DBRRunnableWithResult<String> generator = SQLGeneratorContributor.SELECT_GENERATOR(entities, true);
        try {
 * See the License for the specific language governing permissions and
     * openAndExecuteSQLScript with force sqlScript executing
        }
        List<DBSObject> selectedObjects = NavigatorUtils.getSelectedObjects(currentSelection);
 *
import org.eclipse.ui.handlers.HandlerUtil;
            AbstractJob execJob = new AbstractJob("Execute SQL in console") {
                    schedule(100);
            }
     */
package org.jkiss.dbeaver.ui.editors.sql.handlers;
    @Override
                                forceProcessAsScript || NavigatorUtils.getSelectedObjects(currentSelection).size() > 1
                    entities.add((DBSEntity) parentObject);
            sql, 
            if (object instanceof DBNDatabaseFolder) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        String sql = CommonUtils.notEmpty(generator.getResult());
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
                            UIUtils.syncExec(() -> editor.processSQL(
            FileEditorInput sqlInput = new FileEditorInput(scriptFile);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            IFolder folder = SQLEditorHandlerOpenEditor.getCurrentScriptFolder(currentSelection);
import org.eclipse.core.resources.IFile;
import org.jkiss.dbeaver.model.app.DBPProject;
                     SQLNavigatorContext navigatorContext, String title, boolean doRun, ISelection currentSelection) throws Exception {
        }
    /**
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
            SQLEditorHandlerOpenEditor.checkProjectIsOpen(project);
        IWorkbenchWindow workbenchWindow,
    private static final boolean OPEN_FILE_EDITOR = false;
        boolean doRun,
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;

            title = DBUtils.getObjectFullName(entities.get(0), DBPEvaluationContext.DML);
                }

            navigatorContext,
            editor.getDocument().set(sql);
 * limitations under the License.
import java.util.ArrayList;
            title,
        String sql,
    }
 * DBeaver - Universal Database Manager

        IWorkbenchWindow workbenchWindow,
        for (DBSObject object : selectedObjects) {
    ) throws CoreException {
import org.jkiss.dbeaver.model.rm.RMConstants;
        openAndExecuteSQLScript(workbenchWindow, navigatorContext, title, doRun, currentSelection, sql);
                }
    }
                entities.add((DBSEntity) object);

                    if (editor.getExecutionContext() != null) {
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        ISelection currentSelection,
import org.eclipse.ui.part.FileEditorInput;
            editor = (SQLEditor) workbenchWindow.getActivePage().openEditor(sqlInput, SQLEditor.class.getName());
import org.jkiss.utils.CommonUtils;
            openConsole(workbenchWindow, generator, navContext, title, !entities.isEmpty(), currentSelection);
                            ));
 *
        List<DBSEntity> entities = new ArrayList<>();
                    // If we open new connection for each editor it may take some time
        SQLEditor editor;
            editor = SQLEditorHandlerOpenEditor.openSQLConsole(workbenchWindow, navigatorContext, title, sql);
public class SQLEditorHandlerOpenObjectConsole extends AbstractHandler {
