import org.jkiss.code.NotNull;
        this.selectedFromNavigator = selectedFromNavigator;
            supportsDeleteContents,
            }

    }
                            IResource resource = node.getAdapter(IResource.class);
                script.append(
                    }
        try {
            TasksJob.runTasks(tasksToExecute.size() > 1 ? "Delete " + tasksToExecute.size() + " objects" : "Delete object", tasksToExecute);
            }
        boolean result = false;
        }
                    node.getParentNode(),
    }
                result = serviceSQL.openSQLViewer(
                            dbrMonitor.subTask("Delete database object '" + ((DBNDatabaseNode) obj).getNodeDisplayName() + "'");
            resource.delete(IResource.FORCE | IResource.KEEP_HISTORY, monitor);
        private final String label;
                                dbrMonitor.subTask("Delete resource '" + resource.getName() + "'");
                // No direct editor host found for this object -
import org.jkiss.dbeaver.model.edit.*;
        final StringBuilder sql = new StringBuilder();
    private void deleteLocalFolder(final DBNLocalFolder folder) {
                        false
     * A list containing objects to delete.
                    throw new InvocationTargetException(e);
        this.supportsShowViewScript = supportsShowViewScript;
import org.jkiss.dbeaver.ui.UIUtils;
 *
            supportsShowViewScript,

                null, object.getClass(),
        DBNModel.updateConfigAndRefreshDatabases(folder);
        sql.append(script);
            DBEObjectManager.OPTION_DELETE_CASCADE,
        for (final IEditorReference editorRef : window.getActivePage().getEditorReferences()) {

            this.featureValue = featureValue;
                // Not a real object delete because it's not persisted
                throw new DBException("Node '" + node + "' doesn't have a container");

        }
            commandContext = commandTarget.getContext();
                        }
    public void enableOption(@NotNull Option option) {
            );
        } catch (InvocationTargetException e) {
            });
                NLS.bind(UINavigatorMessages.actions_navigator_error_dialog_delete_object_message,
                        if (dbrMonitor.isCanceled()) {
        final DBECommandContext commandContext = commandTarget.getContext();
                throw new DBException("Can't delete node with null object (" + node.getClass()
        Collection<? extends DBECommand> commands = commandContext.getFinalCommands();

            if (objectMaker == null) {
            );
    private void deleteResource(DBRProgressMonitor dbrMonitor, final IResource resource) throws CoreException, DBException {
 */
    }
            }
import org.eclipse.ui.IEditorInput;

                    false
    static NavigatorObjectsDeleter of(List<?> selection, IWorkbenchWindow window) {
            }
        if (sql.length() != 0) {

                            SQLUtils.generateComments(commandContext.getExecutionContext().getDataSource(),
                        UINavigatorMessages.actions_navigator_delete_script,
import org.eclipse.jface.dialogs.IDialogConstants;
            commandTarget = NavigatorHandlerObjectBase.getCommandTarget(

    }
 *
            final NavigatorHandlerObjectBase.CommandTarget commandTarget;
                            log.warn("Don't know how to delete element '" + obj + "'"); //$NON-NLS-1$ //$NON-NLS-2$
            if (project == null) {
                    NavigatorHandlerObjectBase.getCommandTarget(
 * Unless required by applicable law or agreed to in writing, software
            }
                DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass(), DBEObjectMaker.class);
    private final boolean supportsDeleteContents;
                    UINavigatorMessages.actions_navigator_persist_delete_in_the_editor_title,
                    e
                throw new DBException("Project '" + resource.getName() + "' is not recognized as database project");
                    UINavigatorMessages.question_no_sql_available
        }
package org.jkiss.dbeaver.ui.navigator.actions;
                        true,
                            dbrMonitor.subTask("Delete folder '" + ((DBNLocalFolder) obj).getNodeDisplayName() + "'");
    public boolean supportsDeleteContents() {
     * Active window.
import org.eclipse.ui.IEditorReference;
                if (deleteNewObject(node)) {
            // Delete project
            if (object == null) {
        }
 * You may obtain a copy of the License at
        return false;
        }
        );
                            UIUtils.asyncExec(() -> deleteDatabaseNode((DBNDatabaseNode)obj));
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
            selectedFromNavigator,

                    .getSimpleName() + ":" + node.getNodeDisplayName() + ")");
            if (!object.isPersisted() || commandTarget.getEditor() != null) {
    }
    }

        this.supportsDeleteContents = supportsDeleteContents;

            final DBEObjectMaker objectMaker = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass(), DBEObjectMaker.class);
        } else if (resource instanceof IProject) {
        }
            final DBNDatabaseNode node = (DBNDatabaseNode) obj;
            DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.model.sql.SQLUtils;
    /**

                continue;
        return supportsShowViewScript;
import org.eclipse.core.resources.IProject;

            );
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
            DBEObjectMaker.FEATURE_DELETE_CASCADE,
            );

            if (obj instanceof DBNProject) {
                                    false));
                        //command context is not null because sql is not empty, see appendSQL()
            return;
            UINavigatorMessages.confirm_deleting_delete_cascade_checkbox_label,
                supportsDeleteContents = true;
    }
                                deleteResource(dbrMonitor, resource);
            result = UIUtils.confirmAction(
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                    for (Object obj: selection) {
            DBWorkbench.getPlatformUI().showError(
        try {
            final IEditorPart editor = editorRef.getEditor(false);
            final NavigatorHandlerObjectBase.CommandTarget commandTarget =
                UIUtils.getActiveWorkbenchWindow().getActivePage().activate(commandTarget.getEditor());
        for (Object obj: selection) {
        }
        }
            if (!(node.getParentNode() instanceof DBNContainer)) {
                }
            } catch (DBException e) {
                dbrMonitor.beginTask("Delete objects", selection.size());
            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);

                try {
                if (script.length() == 0) {
        } catch (InvocationTargetException e) {
        boolean supportsDeleteContents = false;
                        } else if (obj instanceof DBNNode node) {
        final NavigatorHandlerObjectBase.CommandTarget commandTarget;
import org.jkiss.dbeaver.model.rcp.RCPProject;
            }
    private final boolean selectedFromNavigator;
        } else {
import org.eclipse.ui.IEditorPart;
            window,
        if (objectMaker == null) {

        }
        }
        } catch (InterruptedException ignored) {

            }
 * DBeaver - Universal Database Manager
            }
            if (object == null) {
            log.warn(e);
    }
            try {
                                    persistActions,
            return tip;
                        } else {

                        UIIcon.SQL_PREVIEW,
            dbrMonitor.subTask("Delete project");
                                false));
    }
                // There should be command context somewhere
                        object.getClass(),
            DBPProject project = workspace.getProject((IProject) resource);
        }
    public IProject getProjectToDelete() {
        try {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;
                }
            UIUtils.runInProgressService(monitor -> {
                );
        } catch (Throwable e) {
                    window.getActivePage().closeEditor(editor, false);
            if (editor instanceof IDatabaseEditor) {
    /**
import org.jkiss.code.Nullable;
        }
            }
                        node.getParentNode(),
                    return;

        for (Object obj: selection) {
        public String getTip() {
                    UINavigatorMessages.actions_navigator_delete_script,
 * limitations under the License.
        } else {
            for(DBECommand command : commands) {
                continue;
                        }
        }
                continue;
            if (supportsFeature(objectMaker, dataSource, option.featureValue)) {
                return rcpProject.getEclipseProject();
                    script.append(
                for (Object obj: selection) {
            }
        return result;
                // Persist object deletion - only if there is no host editor and we have a command context
                            if (resource != null) {
        } catch (DBException e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                continue;
                            }
    void delete() {
                ) == IDialogConstants.PROCEED_ID;
 * Licensed under the Apache License, Version 2.0 (the "License");

    private static boolean supportsFeature(@NotNull DBEObjectMaker<?, ?> objectMaker, DBPDataSource dataSource, long feature) {
                        node.getParentNode(),
import org.jkiss.dbeaver.model.navigator.*;
            }
            );
                    UINavigatorMessages.actions_navigator_error_dialog_delete_object_title,
}

                    node.getNodeDisplayName()),
                continue;
 *
        this.deleteContent = deleteContents;
    }
            DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
                final DBEPersistAction[] persistActions = command.getPersistActions(monitor, commandContext.getExecutionContext(), deleteOptions);
        if (!(node.getParentNode() instanceof DBNContainer)) {
import java.lang.reflect.InvocationTargetException;
    private boolean deleteNewObject(final DBNDatabaseNode node) {
            return label;
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
            return;
            }
            final DBSObject object = node.getObject();
                    return true;
import org.eclipse.core.runtime.IProgressMonitor;
            Map<String, Object> deleteOptions = collectObjectMakerOptionsMap(object, objectMaker);
            UINavigatorMessages.confirm_deleting_delete_cascade_checkbox_tooltip
        if (resource instanceof IFolder) {
    private static final Log log = Log.getLog(NavigatorObjectsDeleter.class);
     */
    private NavigatorObjectsDeleter(IWorkbenchWindow window, List<?> selection, boolean selectedFromNavigator, boolean supportsShowViewScript,
            if (object.isPersisted() && commandTarget.getEditor() == null && commandTarget.getContext() != null) {
            if (serviceSQL != null) {
        this.supportedOptions = supportedOptions;
        for (Option option: enabledOptions) {
        boolean selectedFromNavigator = window.getPartService().getActivePart() instanceof NavigatorViewBase;
                        if (obj instanceof DBNDatabaseNode) {
        );
                        window,
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            }
        }
                DBEObjectMaker.FEATURE_CLOSE_EXISTING_CONNECTIONS,
                DBTTaskRegistry.EVENT_BEFORE_PROJECT_DELETE,
    private final Set<Option> enabledOptions = new HashSet<>();
                final NavigatorHandlerObjectBase.ObjectSaver deleter = new NavigatorHandlerObjectBase.ObjectSaver(commandTarget.getContext(), deleteOptions);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (sql.length() > 0) {
            for (Option option: Option.values()) {
                    e.getTargetException()
        try {
            }
                if (editorInput instanceof IDatabaseEditorInput && ((IDatabaseEditorInput) editorInput).getDatabaseObject() == node.getObject()) {
        return new NavigatorObjectsDeleter(
            }

                );
        enabledOptions.add(option);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            this.label = label;
        return supportsDeleteContents;
import org.jkiss.dbeaver.ui.UIIcon;
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
 * you may not use this file except in compliance with the License.
        commandTarget.getContext().resetChanges(true);
        try {
            if (!(obj instanceof DBNDatabaseNode)) {
                }
import java.util.*;
        return objectMakerOptionsMap;

                dbrMonitor.done();
        private final String optionValue;
        DBPDataSource dataSource = object.getDataSource();
                    false
    private void deleteDatabaseNode(@NotNull final DBNDatabaseNode node) {
        Option(long featureValue, @NotNull String optionValue, @NotNull String label, @NotNull String tip) {
        }
                // and execute command within it
        }
                    }
                throw new DBException("Object maker not found for type '" + object.getClass().getName() + "'"); //$NON-NLS-2$
                    if (obj instanceof DBNDatabaseNode) {
    private final boolean supportsShowViewScript;
    }
                        SQLUtils.generateScript(commandContext.getExecutionContext().getDataSource(),
            selection,
                UINavigatorMessages.confirm_deleting_close_existing_connections_checkbox_tooltip
                    NLS.bind(UINavigatorMessages.actions_navigator_persist_delete_in_the_editor_message, commandTarget.getEditor().getTitle()),
import org.eclipse.core.runtime.CoreException;
            return;
            dbrMonitor.subTask("Delete file");
import org.jkiss.dbeaver.model.app.DBPProject;
                final IEditorInput editorInput = editor.getEditorInput();
                                    boolean supportsDeleteContents, Set<Option> supportedOptions) {
import org.jkiss.dbeaver.model.task.DBTTaskRegistry;
                UINavigatorMessages.confirm_deleting_close_existing_connections_checkbox_label,
            objectMaker.deleteObject(commandTarget.getContext(), node.getObject(), deleteOptions);
            return;
            final DBSObject object = node.getObject();
        this.window = window;
                deleteWarningShowed = true;
            this.tip = tip;
        ),
                // try to find corresponding command context
                    window,
import org.eclipse.core.resources.IFolder;
            UIUtils.runInProgressService(dbrMonitor -> {
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
                        sql,

import org.jkiss.dbeaver.model.DBPDataSource;
        try {
                tasksToExecute.add(deleter);
    }
                        } else if (obj instanceof DBNLocalFolder) {
    public void disableOption(@NotNull Option option) {
        boolean supportsShowViewScript = false;
                    UINavigatorMessages.error_sql_generation_message,
    private void appendScript(final DBRProgressMonitor monitor, final StringBuilder sql, final DBNDatabaseNode node) throws InvocationTargetException {
                    window.getShell(),
    private DBECommandContext commandContext;
            if (!(node.getParentNode() instanceof DBNContainer)) {
    private final List<?> selection;
                }
        }
import org.eclipse.core.resources.IResource;
    private Map<String, Object> collectObjectMakerOptionsMap(@NotNull DBSObject object, @NotNull DBEObjectMaker<?, ?> objectMaker) {
        return (objectMaker.getMakerOptions(dataSource) & feature) != 0;
            });
                objectMakerOptionsMap.put(option.optionValue, Boolean.TRUE);
        }
    @Nullable

            supportedOptions
        return Collections.unmodifiableSet(supportedOptions);
            DBWorkbench.getPlatformUI().showError("Delete error", e.getTargetException().getMessage(), e.getTargetException());

        public String getLabel() {
    }
            throw new InvocationTargetException(e);
            if (obj instanceof DBNProject project && project.getProject() instanceof RCPProject rcpProject) {
public class NavigatorObjectsDeleter {
                DBWorkbench.getPlatformUI().showMessageBox(

        }

 * Copyright (C) 2010-2024 DBeaver Corp and others
                        false
    }
                        false
            }
    private boolean deleteContent;
        if (commandContext == null) {
     */
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
                            break;

 * See the License for the specific language governing permissions and
            // ignore
            sql.append("\n");
 *     http://www.apache.org/licenses/LICENSE-2.0

                            deleteLocalFolder((DBNLocalFolder) obj);
        private final String tip;
        commandContext.resetChanges(!result);
        this.selection = selection;
        final StringBuilder script = new StringBuilder();
        final DBEObjectMaker objectMaker =
                } catch (Exception e) {
                commandTarget = NavigatorHandlerObjectBase.getCommandTarget(
import org.jkiss.dbeaver.runtime.TasksJob;
            }
            }
    }
                continue;


            );
                Map.of(DBTTaskRegistry.EVENT_PARAM_PROJECT, resource.getName())
            return;
            dbrMonitor.subTask("Delete folder");
            this.optionValue = optionValue;
        CLOSE_EXISTING_CONNECTIONS(
        private final long featureValue;
        return sql.toString();
    private String collectSQL() {
                        commandContext.getExecutionContext(),
                                persistActions,
    }
    public boolean supportsShowViewScript() {

 * distributed under the License is distributed on an "AS IS" BASIS,
            DBPPlatformDesktop.getInstance().getGlobalEventManager().fireGlobalEvent(
        }
                        dbrMonitor.worked(1);
    }
    private final IWorkbenchWindow window;
            DBEObjectMaker<?, ?> objectMaker = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass(), DBEObjectMaker.class);
        enabledOptions.remove(option);
import org.eclipse.osgi.util.NLS;
                    supportedOptions.add(option);
        if (!object.isPersisted() || commandTarget.getEditor() != null) {
    public void setDeleteContents(boolean deleteContents) {

            if (objectMaker == null) {
        Map<String, Object> objectMakerOptionsMap = new HashMap<>();
    private final Set<Option> supportedOptions;
            return;
        if (!tasksToExecute.isEmpty()) {
    }
                DBEObjectManager.OPTION_CLOSE_EXISTING_CONNECTIONS,
        DELETE_CASCADE(
        } catch (DBException e) {
            objectMaker.deleteObject(commandTarget.getContext(), node.getObject(), deleteOptions);
    private boolean deleteWarningShowed;
            if (commandTarget.getEditor() == null && commandTarget.getContext() != null) {
            if (commandTarget.getEditor() != null && selectedFromNavigator && !deleteWarningShowed) {
import org.eclipse.ui.IWorkbenchWindow;
    boolean showScriptWindow() {

        folder.getDataSourceRegistry().removeFolder(folder.getFolder(), false);
                    null, object.getClass(),

    public Set<Option> getSupportedOptions() {
                        appendScript(monitor, sql, (DBNDatabaseNode) obj);
        Map<String, Object> deleteOptions = collectObjectMakerOptionsMap(object, objectMaker);

    public enum Option {
        } catch (DBException e) {

    }
        if (object == null) {
                    UINavigatorMessages.error_sql_generation_title,
        final DBSObject object = node.getObject();
            log.warn(e);
/*
import org.jkiss.dbeaver.DBException;
        final String sql = collectSQL();
        return null;
                if (supportsFeature(objectMaker, object.getDataSource(), option.featureValue)) {
                        null,
        } catch (InterruptedException e) {
            ((IFolder)resource).delete(true, true, monitor);
    private final List<DBRRunnableWithProgress> tasksToExecute = new ArrayList<>();
                        window,
        Set<Option> supportedOptions = new HashSet<>();
        }
    }
        IProgressMonitor monitor = dbrMonitor.getNestedMonitor();
                supportsShowViewScript = true;
            workspace.deleteProject(project, deleteContent);
                }
