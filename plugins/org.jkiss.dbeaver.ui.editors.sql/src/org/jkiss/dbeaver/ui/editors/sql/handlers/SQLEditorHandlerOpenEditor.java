        checkProjectIsOpen(project);
        try {
                activeEditor != null &&
    }
import org.eclipse.core.resources.IFolder;
     *
            DBWorkbench.getPlatformUI().showError("Open editor", null, e);
                    SelectDataSourceDialog dialog = new SelectDataSourceDialog(HandlerUtil.getActiveShell(event), project, null);
            } else {
                openEditor(workbenchWindow, editorContext);
    ) {
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param workbenchWindow the workbench window used to open the editor (must not be null)
            workbenchWindow,
import org.jkiss.dbeaver.model.rcp.RCPProject;
    ) throws CoreException {
    public static SQLEditor openNewSQLConsole(
        if (activePart instanceof DBPContextProvider) {
        @NotNull IEditorInput sqlInput
        if (activePart instanceof DBPDataSourceContainerProvider) {
            final Object element = ((IStructuredSelection) selection).getFirstElement();
    public static void openRecentScript(

    public static SQLEditor openSQLConsole(

    }
        final IFolder rootFolder = SQLEditorUtils.getScriptsFolder(project, true);
            }
            }
        SQLNavigatorContext context = getCurrentContext(event);
    }
        } catch (Throwable e) {

                        openEditor(event);
    }
            if (handler != null) {
        return null;
        return openSQLEditor(workbenchWindow, sqlInput, IWorkbenchPage.MATCH_NONE);
                } else if (!dataSourceRegistry.getDataSources().isEmpty()) {
    }


            }
import org.jkiss.utils.CommonUtils;
        SQLEditorUtils.ResourceInfo res = SQLEditorUtils.findRecentScript(project, editorContext);
        }
                return null;
import java.util.List;

import org.jkiss.dbeaver.ui.controls.ScriptSelectorPanel;

                handler.openResource(resource);
        return folder;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (element instanceof IFolder) {

    }
                EditorUtils.setFileDataSource(resourceInfo.getLocalFile(), context);
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
    static SQLNavigatorContext getCurrentContext(ExecutionEvent event) throws InterruptedException {
/*
    }
    private static void openRecentEditor(ExecutionEvent event) throws CoreException, InterruptedException {
    @Nullable
import org.jkiss.code.NotNull;
                }
        @NotNull IWorkbenchWindow workbenchWindow,
                IFile scriptFile = SQLEditorUtils.createNewScript(project, scriptFolder, editorContext);
            DBPResourceHandler handler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resource);
        SQLNavigatorContext context = new SQLNavigatorContext(event);
        }
            isConsole ? IWorkbenchPage.MATCH_NONE : IWorkbenchPage.MATCH_INPUT
     * Open a new SQL console editor.
                true,
    /**
                openResource(scriptFile, editorContext);
        @NotNull SQLNavigatorContext context,
            DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
            return (SQLEditor) workbenchWindow.getActivePage().openEditor(
        return openSQLEditor(workbenchWindow, sqlInput);
            if (project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
        }

        String actionId = event.getCommand().getId();
import org.eclipse.core.resources.IFile;
        IFile scriptFile = SQLEditorUtils.createNewScript(project, folder, editorContext);
        }
                case SQLEditorCommands.CMD_SQL_EDITOR_OPEN:
 * limitations under the License.
        @NotNull IWorkbenchWindow workbenchWindow,
                ActionUtils.runCommand(SQLEditorCommands.CMD_SQL_EDITOR_CONSOLE, HandlerUtil.getActiveWorkbenchWindow(event));
    public static IFile openNewEditor(@NotNull SQLNavigatorContext editorContext, ISelection selection) throws CoreException {

                    }
            } else {
    }
        @NotNull SQLNavigatorContext context,
            } else {
        return openSQLEditor(
            sqlInput,
                    }
     *                 {@link INonPersistentEditorInput} for transient consoles.
        try {
        @Nullable IFolder scriptFolder
                        openNewEditor(event);
import org.eclipse.core.commands.ExecutionEvent;
            if (CommonUtils.isEmpty(defCommand)) {
            final IFile newScript = SQLEditorUtils.createNewScript(project, rootFolder, editorContext);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    }
        if (res != null) {
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
                CommonUtils.equalObjects(res.getResource(), EditorUtils.getFileFromInput(activeEditor.getEditorInput())))
 *
import org.jkiss.dbeaver.model.DBPContextProvider;
        }
        @NotNull IEditorInput sqlInput
                    break;
import org.jkiss.dbeaver.ui.ActionUtils;
     * is already opened. The provided {@code sqlInput} will be associated with the
    public static void openResourceEditor(IWorkbenchWindow workbenchWindow, SQLEditorUtils.ResourceInfo resourceInfo, SQLNavigatorContext context) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static IFolder getCurrentScriptFolder(ISelection selection) {
                SQLEditor.class.getName(),
        return null;
        openResource(resource, new SQLNavigatorContext());
            }
        @NotNull IWorkbenchWindow workbenchWindow,
        return context;
        }
     * This method always opens a new editor instance even if an editor with the same input
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
        }
            if (project != null) {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static void openResource(IResource resource, @Nullable SQLNavigatorContext navigatorContext) {
        SQLNavigatorContext context = getCurrentContext(event);
    }
        openRecentScript(HandlerUtil.getActiveWorkbenchWindow(event), context, null);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        SQLNavigatorContext context,
        @NotNull IEditorInput sqlInput
        final List<SQLEditorUtils.ResourceInfo> scriptTree = SQLEditorUtils.findScriptTree(project, rootFolder, editorContext.getDataSourceContainer());
        final RCPProject project = editorContext.getProject();
 * distributed under the License is distributed on an "AS IS" BASIS,
                return null;

    ) {
        }
     * @param sqlInput the editor input to open (must not be null). May be an instance of
        }
                actionId = defCommand;

        );
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
                UINavigatorMessages.actions_navigator_error_dialog_open_resource_title,
        return openSQLConsole(workbenchWindow, context, sqlInput);
    }
    public static SQLEditor openSQLConsole(
                if (dataSourceRegistry.getDataSources().size() == 1) {
            DBWorkbench.getPlatformUI().showError("Can't open editor", null, e);

        IFolder folder = getCurrentScriptFolder(selection);

                sqlInput,
    static void checkProjectIsOpen(final DBPProject project) throws CoreException {
        int matchFlags
     */
                matchFlags
    }
                    }


import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                e); //$NON-NLS-3$
import org.eclipse.jface.dialogs.IDialogConstants;

            // Show script chooser
    }
    public static void openResource(IResource resource) {
            );
        SQLNavigatorContext editorContext = getCurrentContext(event);
        if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
                    break;
            return ((DBPDataSourceContainerProvider) activePart).getDataSourceContainer();

    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.ui.editors.INonPersistentEditorInput;
    private static void openEditor(IWorkbenchWindow workbenchWindow, SQLNavigatorContext editorContext) throws CoreException {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                    }
                case SQLEditorCommands.CMD_SQL_EDITOR_NEW:
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
import org.eclipse.core.resources.IResource;
    }
        RCPProject project = editorContext.getProject();

    }
            }
                    if (activeProject == null || activeProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW)) {
        @NotNull SQLNavigatorContext editorContext,
    private static DBPDataSourceContainer getDataSourceContainers(IWorkbenchPart activePart) {
            if (defCommand.equals(SQLEditorCommands.CMD_SQL_EDITOR_CONSOLE)) {
                if (navigatorContext != null && resource instanceof IFile && navigatorContext.getDataSourceContainer() != null) {
        } catch (InterruptedException e) {
            EditorUtils.openExternalFileEditor(resourceInfo.getLocalFile(), workbenchWindow);
import org.eclipse.core.commands.ExecutionException;
            return context == null ? null : context.getDataSource().getContainer();
                    context.setDataSourceContainer(dialog.getDataSource());
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.dbeaver.model.rm.RMConstants;
     * @return the opened {@link SQLEditor} instance or {@code null} if the editor could not be opened
        try {
import org.eclipse.ui.*;
        } else if (resourceInfo.getLocalFile() != null) {
    }
            if (res.getResource() != null &&
    }
                folder = (IFolder) ((DBNResource) element).getResource();
                    if (activeProject == null || activeProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        } catch (Exception e) {
     * </p>
     * @param context the navigator context that provides project and datasource information (must not be null)

        }
        IFolder folder = null;
        } else {


 *
        if (scriptTree.isEmpty()) {
        String sqlText) {
package org.jkiss.dbeaver.ui.editors.sql.handlers;
            // Create new script
        if (context.getDataSourceContainer() == null) {
        EditorUtils.setInputDataSource(sqlInput, context);

            switch (actionId) {
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
            {
            }
        checkProjectIsOpen(project);
import org.jkiss.code.Nullable;
                // It is already open and active. Let's open script selector panel
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
                    EditorUtils.setFileDataSource((IFile) resource, navigatorContext);
        if (project == null) {
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.model.navigator.DBNResource;
            }
        @NotNull IWorkbenchWindow workbenchWindow,
            } else if (element instanceof DBNResource && ((DBNResource) element).getResource() instanceof IFolder) {
                folder = (IFolder) element;
    }
        return null;
            openResource(newScript, editorContext);
            DBPProject project = NavigatorUtils.getSelectedProject();
                    break;

            return null;
                    dialog.setModeless(true);
                "Can't open resource '" + resource.getName() + "'",
            throw new CoreException(GeneralUtils.makeExceptionStatus(new IllegalStateException("No active project.")));
        }
 * DBeaver - Universal Database Manager

                case SQLEditorCommands.CMD_SQL_EDITOR_RECENT:
    private static void openNewEditor(ExecutionEvent event) throws CoreException, InterruptedException {
        @NotNull IEditorInput sqlInput,
     * <p>
        if (resourceInfo.getResource() != null) {
        StringEditorInput sqlInput = new StringEditorInput(name, sqlText, false, GeneralUtils.DEFAULT_ENCODING);
        checkProjectIsOpen(project);
        openNewEditor(context, HandlerUtil.getCurrentSelection(event));

        } catch (PartInitException e) {
            openResource(resourceInfo.getResource(), context);
import org.jkiss.dbeaver.model.app.DBPResourceHandler;


        } else {
     * supplied {@code context}.
import org.jkiss.dbeaver.ui.editors.EditorUtils;
public class SQLEditorHandlerOpenEditor extends AbstractDataSourceHandler {
                    if (activeProject == null || activeProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW)) {
        EditorUtils.setInputDataSource(sqlInput, context);
        boolean isConsole = sqlInput instanceof INonPersistentEditorInput;
                final DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
    @Override
    @NotNull
        IWorkbenchWindow workbenchWindow,
        openEditor(workbenchWindow, editorContext);
    ) {
import org.eclipse.core.runtime.CoreException;
            if (context != null) {
 * you may not use this file except in compliance with the License.
                openResourceEditor(workbenchWindow, res, editorContext);
            IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
                openSQLConsole(workbenchWindow, editorContext, editorContext.getDataSourceContainer().getName(), "");
    private static SQLEditor openSQLEditor(
 */
                        openRecentEditor(event);
    ) {
            }
        }
    private static void openEditor(ExecutionEvent event) throws CoreException, InterruptedException {
            DBCExecutionContext context = ((DBPContextProvider) activePart).getExecutionContext();
}        @NotNull IWorkbenchWindow workbenchWindow,
                    context.setDataSourceContainer(dataSourceRegistry.getDataSources().get(0));
        DBPProject project = editorContext.getProject();
        String name,
                        throw new InterruptedException();
        return scriptFile;
        openResource(scriptFile, editorContext);
            DBWorkbench.getPlatformUI().showError(
 *
            ScriptSelectorPanel.showTree(workbenchWindow, editorContext, rootFolder, scriptTree);
                }
        project.ensureOpen();

                    if (dialog.open() == IDialogConstants.CANCEL_ID) {
    private static SQLEditor openSQLEditor(
            String defCommand = DBWorkbench.getPlatform().getPreferenceStore().getString(SQLPreferenceConstants.DEFAULT_SQL_EDITOR_OPEN_COMMAND);
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
        if (SQLEditorCommands.CMD_SQL_EDITOR_DEF_COMMAND.equals(actionId)) {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
