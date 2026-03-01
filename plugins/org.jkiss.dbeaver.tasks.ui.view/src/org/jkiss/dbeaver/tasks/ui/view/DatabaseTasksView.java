                    }
import org.eclipse.ui.part.ViewPart;
                manager.add(ActionUtils.makeCommandContribution(getSite(), EDIT_TASK_CMD_ID));
    }
        }
        tasksTree.getViewer().addSelectionChangedListener(event -> UIUtils.asyncExec(() -> loadTaskRuns(false)));
                    monitor.done();
                    clipboardData.addTransfer(TextTransfer.getInstance(), buf.toString());
    public <T> T getAdapter(Class<T> adapter) {
                ActionUtils.runCommand(EDIT_TASK_CMD_ID, getSite().getSelectionProvider().getSelection(), getSite());
                    GROUP_TASK_CMD_ID,
        public boolean equals(Object obj) {
        }
            @Override
            log.debug("The user needs more permissions to see the Database Tasks View.");
        @Override
            {
                    getSite(),

                }
        UIUtils.asyncExec(() -> {
                isVisible = selectedTask.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
        });
public class DatabaseTasksView extends ViewPart implements DBTTaskListener {
        ISelection selection = taskRunViewer.getSelection();
            this.category = category;
            manager.add(ActionUtils.makeCommandContribution(getSite(), COPY_TASK_CMD_ID));

        }
 */
                @Override
        tasksTree.getViewer().addDoubleClickListener(event -> {
    }
                try {
        TaskFeatures.TASKS_VIEW_OPEN.use();
        }
            DBTTaskRun taskRun = (DBTTaskRun) cell.getElement();
            if (element instanceof DBTTask) {
        String projectName = Objects.requireNonNull(activeProject == null ? "" : activeProject.getName(), "");
    public void setFocus() {

                            if (prov instanceof TextFileDocumentProvider) {
            return null;
        String resultMessage = getBriefStatus(taskRun);
 * DBeaver - Universal Database Manager
                CommonUtils.equalObjects(parent, cmp.parent) &&
        }
            if (task != null && taskRun != null) {
        }
        DBTTask selectedTask = tasksTree.getSelectedTask();
import org.jkiss.dbeaver.utils.GeneralUtils;
            return;
        tasksTree = new DatabaseTasksTree(composite, false);
                }
    private void createTaskTree(Composite composite) {
            }


        public void run() {
    }
        updateViewTitle();
                        return;
            manager.add(new Action(WorkbenchMessages.Workbench_copy) {

    }
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;

                    StringBuilder buf = new StringBuilder();
                        // Set UTF8 encoding
                        if (buf.length() > 0) buf.append(GeneralUtils.getDefaultLineSeparator());
        String extraMessage = taskRun.getExtraMessage();
                        DBWorkbench.getPlatformUI().showError("Open log error", "Error while retrieving task run log", e.getCause());
            public void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue) {

        });
        updateViewTitle();
            task.cleanRunStatistics();
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                }
    public static final String GROUP_TASK_CMD_ID = "org.jkiss.dbeaver.task.group";


    public TreeViewer getTaskRunViewer() {
            });

    }
        }, null);
                    tasksTree.getViewer().setSelection(new StructuredSelection(taskFolder), true);
        public void run() {
                return wordMatches(element.toString());
        @Override
                        loadTaskRuns(true);
    }
        }
        control.setMenu(menuMgr.createContextMenu(control));
    }
    }
            }

    private void loadViewConfig() {
        ClearRunLogAction() {
                        buf.append(item.getText(0));

                }
        DBPPlatformDesktop.getInstance().getWorkspace().addProjectListener(projectListener);
        public Object[] getChildren(Object parentElement) {
                if (Files.exists(runLog)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            if (task != null && taskRun != null) {
                String resultMessage = getStatus(taskRun);
                } finally {
                    UIUtils.showMessageBox(getSite().getShell(), "Log file not found", "Can't find log file '" + runLog.toAbsolutePath() + "'", SWT.ICON_ERROR);

import org.eclipse.swt.layout.GridData;
            }
    private MenuManager createTaskContextMenu(TreeViewer viewer) {

            } else {
            });
import org.eclipse.jface.action.Action;
            }
        @Override
    public void handleTaskFolderEvent(@NotNull DBTTaskFolderEvent event) {
    }
                    tasksTree.getViewer().setSelection(new StructuredSelection(task), true);
            super(TaskUIViewMessages.db_tasks_view_run_log_view);
    private class ClearRunLogAction extends Action {
import org.jkiss.dbeaver.Log;
                        getSite(),
        return taskRunViewer;
                public void run()
import org.eclipse.ui.*;
            protected void update(ViewerCell cell, DBTTaskRun taskRun) {
 * you may not use this file except in compliance with the License.
            DBTTask task = tasksTree.getSelectedTask();
                        runLog = receiveLogFile(task, taskRun);
import java.nio.file.Path;
                public String getLabel(Object o) {
            return;

        return super.getAdapter(adapter);
            if (task != null) {
        DBPPlatformDesktop.getInstance().getWorkspace().removeProjectListener(projectListener);
                        path[0] = file;
                (parent == null ? 0 : parent.hashCode()) +
        SashForm sashForm = UIUtils.createPartDivider(this, parent, SWT.HORIZONTAL);
        public int hashCode() {
                category == cmp.category;
        }
    private void createTaskRunTable(Composite parent) {
 *
                    } catch (Exception e) {
import org.eclipse.swt.widgets.Composite;

        }
    private static final String CREATE_FOLDER_TASK_CMD_ID = "org.jkiss.dbeaver.folder.task.create";
                manager.add(ActionUtils.makeCommandContribution(
import org.eclipse.core.runtime.IStatus;
                    CommandContributionItem.STYLE_CHECK,


                Path runLog = task.getRunLog(taskRun);
import java.io.InputStream;
        DatabaseTasksTree.addDragAndDropSourceSupport(tasksTree.getViewer());
    private MenuManager createTaskRunContextMenu(TreeViewer viewer) {
        }
        Control control = viewer.getControl();
    public static final String COPY_TASK_CMD_ID = "org.jkiss.dbeaver.task.copy";
    }
import org.eclipse.ui.views.IViewDescriptor;
        menuMgr.setRemoveAllWhenShown(true);
                UIUtils.confirmAction(
                    DatabaseTasksTree tasksTree = getTasksTree();
                    (forUI ? RuntimeUtils.formatExecutionTime(taskRun.getRunDuration()) : String.valueOf(taskRun.getRunDuration()));
    }
    }
        }
        private Path receiveLogFile(@NotNull DBTTask task, @NotNull DBTTaskRun run) throws InvocationTargetException {
        taskRunViewer = DialogUtils.createFilteredTree(parent, SWT.SINGLE | SWT.FULL_SELECTION, new NamedObjectPatternFilter(), TaskUIViewMessages.db_tasks_view_filtered_tree_text_error_message);


            ? resultMessage + " (" + extraMessage + ")"
            }
            manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
                case TASK_REMOVE -> refresh();
                    monitor.done();
import org.jkiss.dbeaver.model.app.DBPProject;
import java.util.*;
    }
            }
        new AbstractJob("Refresh task runs") {
                        if (editorPart instanceof ITextEditor) {
import org.eclipse.core.runtime.IProgressMonitor;
                return;
                            IDocumentProvider prov = ((ITextEditor) editorPart).getDocumentProvider();
    }
                        TaskUIViewMessages.db_tasks_view_context_menu_command_delete_task,

import org.eclipse.ui.model.IWorkbenchAdapter;

 * See the License for the specific language governing permissions and
    public void createPartControl(Composite parent) {

            }
        taskRunColumnController = new ViewerColumnController<>("taskruns", taskRunViewer);
            update(cell, taskRun);
    @Override
    }
        @Override
    }
        });
            }
                case TASK_FOLDER_UPDATE -> tasksTree.getViewer().refresh(taskFolder);
    @Override
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {
            return project == cmp.project &&
        public final void update(ViewerCell cell) {
import org.jkiss.dbeaver.model.rm.RMConstants;

                try {
        IViewDescriptor viewDescriptor = PlatformUI.getWorkbench().getViewRegistry().find(VIEW_ID);
    private class ViewRunLogAction extends Action {
    private TreeViewer taskRunViewer;
    }
                case TASK_ACTIVATE -> tasksTree.getViewer().setSelection(new StructuredSelection(task), true);
                        .sorted(Comparator.comparing(DBTTaskRun::getStartTime).reversed())
 *
import org.jkiss.dbeaver.ui.*;
        protected abstract void update(ViewerCell cell, DBTTaskRun task);

        public Object[] getElements(Object inputElement) {
            return new Object[0];
                    TaskUIViewMessages.db_tasks_view_run_log_confirm_remove,
    }
    @Override
            return Objects.requireNonNull(path[0]);
    private static final String TASKS_VIEW_MENU_ID = VIEW_ID + ".menu";
            return ((Collection<?>) inputElement).toArray();
            : CommonUtils.notEmpty(run.getErrorMessage());


import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    }

        }
                            }
    @Override
import org.jkiss.utils.CommonUtils;
            return false;
                        .toList();
                    selectedTask.refreshRunStatistics();

            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        }
import org.eclipse.jface.action.GroupMarker;

            return "In progress";
        loadTasks();
/*
    private static final String TASK_RUNS_MENU_ID = VIEW_ID + ".runs.menu";
        return menuMgr;
    @Nullable
        if (tasksTree == null) {
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.eclipse.osgi.util.NLS;
    private static final ArrayList<Object> EMPTY_TASK_RUN_LIST = new ArrayList<>();

        createTaskRunTable(sashForm);
            }

        }
        });
                    }
        UIUtils.asyncExec(() -> {
            }
        taskRunColumnController.addColumn(TaskUIViewMessages.db_tasks_view_column_controller_add_name_result, TaskUIViewMessages.db_tasks_view_column_controller_add_descr_task_result, SWT.LEFT, true, false, new TaskRunLabelProvider() {
            return;
        final TaskCategoryNode parent;
            if (isVisible) {
        tasksTree.loadViewConfig();
        return element instanceof DBTTaskRun ? (DBTTaskRun) element : null;
        taskRunColumnController.createColumns(true);

                }
            return (project == null ? 0 : project.hashCode()) +
            return true;
            return;
            UIUtils.runInProgressDialog(monitor -> {
                        IWorkbenchCommandConstants.EDIT_DELETE,
        ViewRunLogAction() {
                    } catch (InvocationTargetException e) {
        taskrunTree.setHeaderVisible(true);
                task.removeRun(taskRun);
        super.dispose();
        });
            taskRunColumnController.fillConfigMenu(manager);
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    try (InputStream is = task.getRunLogInputStream(run)) {

            manager.add(ActionUtils.makeCommandContribution(getSite(), RUN_TASK_CMD_ID));
            DBTTaskRun taskRun = getSelectedTaskRun();

            manager.add(new Separator());
                DBTTaskRun taskRun = (DBTTaskRun) element;
                @Override
    }
                    }
    public static class NamedObjectPatternFilter extends PatternFilter {
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
                }
                if (runLog == null) {
    public DatabaseTasksView() {
            @Override

        getSite().setSelectionProvider(tasksTree.getViewer());
        Control control = viewer.getControl();
    }
            return adapter.cast(new WorkbenchAdapter() {
                DBWorkbench.getPlatformUI().executeShellProgram(path.toAbsolutePath().toString());
    }
                manager.add(ActionUtils.makeCommandContribution(getSite(), CREATE_FOLDER_TASK_CMD_ID));
    private static class TreeRunContentProvider implements ITreeContentProvider {
                cell.setText(!taskRun.isFinished() ? "N/A" : RuntimeUtils.formatExecutionTime(taskRun.getRunDuration()));
        }
                    monitor.beginTask("Retrieve task run log contents", 1);
import org.eclipse.swt.dnd.TextTransfer;
            manager.add(new Separator());
    private class DeleteRunLogAction extends Action {
    @Override
            DBTTaskFolder taskFolder = event.getTaskFolder();
            }
        tasksTree.loadTasks();
    public static String getStatus(@NotNull DBTTaskRun taskRun) {

        loadViewConfig();


import org.jkiss.dbeaver.registry.task.TaskRegistry;
        final MenuManager menuMgr = new MenuManager(null, TASK_RUNS_MENU_ID);
        return menuMgr;
        public String toString() {
        }.schedule();
import org.eclipse.swt.custom.SashForm;
                }
        }
                        DBWorkbench.getPlatformUI().showError("Open log error", "Error while opening task execution log", e);
            DBTTask task = tasksTree.getSelectedTask();
    @Override
        menuMgr.addMenuListener(manager -> {
            }


        if (adapter == IWorkbenchAdapter.class) {
        super.init(site);

    @Nullable
            DBTTask task = tasksTree.getSelectedTask();
                manager.add(
        return CommonUtils.isNotEmpty(extraMessage)
    public DatabaseTasksTree getTasksTree() {
            tasksTree.refresh();
            return category.getName();
import java.nio.file.Files;
        }
        taskRunColumnController.setForceAutoSize(true);
        }

                    }
            manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

        final DBPProject project;
            } else if (element instanceof DBTTaskRun) {
        @Override
            return null;
    private DatabaseTasksTree tasksTree;
    private class OpenRunLogFolderAction extends Action {
                        return;

            return;
import org.eclipse.jface.action.Separator;
        }
                return !taskRun.isFinished() ? "N/A" :

        }
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();

                cell.setBackground(null);
        taskRunViewer.setContentProvider(new TreeRunContentProvider());
import java.lang.reflect.InvocationTargetException;
    private static final String CREATE_FOLDER_RENAME_CMD_ID = "org.jkiss.dbeaver.folder.rename";
            }
import org.eclipse.ui.menus.CommandContributionItem;
            if (isVisible) {
        getSite().setSelectionProvider(tasksTree.getViewer());
                case TASK_FOLDER_ADD -> {
            return;
                manager.add(new ClearRunLogAction());
        public void run() {
        });
    public void dispose() {
        @Override
        taskRunColumnController.addColumn(TaskUIViewMessages.db_tasks_view_column_controller_add_name_duration, TaskUIViewMessages.db_tasks_view_column_controller_add_descr_task_duration, SWT.LEFT, true, false, true, null, new TaskRunLabelProviderEx() {
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        NamedObjectPatternFilter() {

import java.nio.file.StandardCopyOption;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            });
            ? TaskUIViewMessages.db_tasks_view_cell_text_success
        tasksTree.getViewer().getControl().setFocus();
                    return TaskUIViewMessages.db_tasks_view_adapter_label_database_tasks;
                    refresh();
                    ActionUtils.makeCommandContribution(
    }
    private void loadTasks() {

                    null, null, null, true, Collections.singletonMap("group", gb.name())));
        }
            tasksTree.getColumnController().fillConfigMenu(manager);
                    tasksTree.getViewer().refresh(task);
            }
    }
        public boolean hasChildren(Object element) {
                return wordMatches(((DBTTask) element).getName());
                        throw new InvocationTargetException(e);
                monitor.beginTask("Refresh task runs", IProgressMonitor.UNKNOWN);
import org.eclipse.swt.widgets.TreeItem;
            @NotNull
package org.jkiss.dbeaver.tasks.ui.view;
                                prov.resetDocument(editorPart.getEditorInput());
                    }
                {
    private static class TaskCategoryNode {
    public static final String EDIT_TASK_CMD_ID = "org.jkiss.dbeaver.task.edit";
            protected void update(ViewerCell cell, DBTTaskRun taskRun) {
            manager.add(new Separator());
    void refresh() {
            super(TaskUIViewMessages.db_tasks_view_clear_run_log_clear, DBeaverIcons.getImageDescriptor(UIIcon.ERASE));
            manager.add(new Separator());
        protected boolean isLeafMatch(Viewer viewer, Object element) {
            if (selectedTask != null) {

    private void loadTaskRuns(boolean force) {
        @NotNull
import org.jkiss.dbeaver.tasks.ui.TaskFeatures;
        OpenRunLogFolderAction() {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static String getBriefStatus(@NotNull DBTTaskRun run) {
            }
            }
        Tree taskrunTree = taskRunViewer.getTree();
        @Override
import org.eclipse.ui.texteditor.IDocumentProvider;
        }
        @Override


                manager.add(new DeleteRunLogAction());
            taskRunViewer.setInput(EMPTY_TASK_RUN_LIST);
    }

    private DBTTaskRun getSelectedTaskRun() {
 *
            DBTTask task = event.getTask();
        }
        TaskRegistry.getInstance().removeTaskListener(this);
    private DBPProjectListener projectListener;

    private transient DBTTask currentTask;
        taskRunViewer.addDoubleClickListener(event -> new ViewRunLogAction().run());
                } else {
            DBTTask task = tasksTree.getSelectedTask();
 * Copyright (C) 2010-2026 DBeaver Corp and others
                return Status.OK_STATUS;
        final MenuManager menuMgr = new MenuManager(null, TASKS_VIEW_MENU_ID);
    }
        return tasksTree;
            super(TaskUIViewMessages.db_tasks_view_run_log_delete, DBeaverIcons.getImageDescriptor(UIIcon.DELETE));

        projectListener = new DBPProjectListener() {
            public String getText(Object element, boolean forUI) {

            TaskCategoryNode cmp = (TaskCategoryNode)obj;

 * You may obtain a copy of the License at

import org.eclipse.ui.model.WorkbenchAdapter;
        @Override

            if (task == null || !UIUtils.confirmAction(TaskUIViewMessages.db_tasks_view_clear_run_log_confirm_clear, NLS.bind(TaskUIViewMessages.db_tasks_view_clear_run_log_confirm_delete_log, task.getName()))) {
        setTitleToolTip(NLS.bind(TaskUIViewMessages.db_tasks_view_adapter_label_database_tasks_tooltip, projectName));
    private abstract class TaskRunLabelProviderEx extends TaskRunLabelProvider implements ILabelProviderEx {
            setIncludeLeadingWildcard(true);
                case TASK_FOLDER_REMOVE -> refresh();
    }
                } finally {
        if (!taskRun.isFinished()) {
        taskRunColumnController.addColumn(TaskUIViewMessages.db_tasks_view_column_controller_add_name_time, TaskUIViewMessages.db_tasks_view_column_controller_add_descr_start_time, SWT.LEFT, true, true, new TaskRunLabelProvider() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.project = project;
    public void handleTaskEvent(@NotNull DBTTaskEvent event) {

            @Override
                (category == null ? 0 : category.hashCode());
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        DeleteRunLogAction() {
        }
                    refresh();
            boolean isVisible = true;
                cell.setText(tasksTree.getDateFormat().format(taskRun.getStartTime()));
        Object element = ((IStructuredSelection) selection).getFirstElement();
                }
                manager.add(ActionUtils.makeCommandContribution(getSite(), CREATE_TASK_CMD_ID));
                case TASK_UPDATE -> {
        menuMgr.addMenuListener(manager -> {
                    UIUtils.asyncExec(() -> taskRunViewer.setInput(runs));
            if (task != null && taskRun != null &&
    public static final String CREATE_TASK_CMD_ID = "org.jkiss.dbeaver.task.create";
    private void updateViewTitle() {
import org.jkiss.code.NotNull;

        control.setMenu(menuMgr.createContextMenu(control));
        menuMgr.setRemoveAllWhenShown(true);
            this.parent = parent;
        });

            : resultMessage;
            manager.add(new GroupMarker("start"));
import org.eclipse.swt.SWT;
                    try {
                    if (tasksTree == null) {
        public Object getParent(Object element) {
import org.eclipse.swt.widgets.Control;
    }
            DBTTask selectedTask = tasksTree.getSelectedTask();
                cell.setText(resultMessage);

        @Override

                    clipboardData.pushToClipboard(tasksTree.getViewer().getTree().getDisplay());
                UIExecutionQueue.queueExec(() -> UIUtils.syncExec(() -> refresh()));

import org.eclipse.jface.action.MenuManager;
            @Override

                    ClipboardData clipboardData = new ClipboardData();
                return false;
                    for (TreeItem item : tasksTree.getViewer().getTree().getSelection()) {
        }
            if (taskRun != null && !taskRun.isRunSuccess()) {


import org.jkiss.code.Nullable;
        }

            if (ActionUtils.isCommandEnabled(EDIT_TASK_CMD_ID, getSite())) {
import org.eclipse.ui.texteditor.ITextEditor;

            }
import org.eclipse.swt.widgets.Tree;
                        null));

        if (tasksTree == null) {
        return run.isRunSuccess()
                    } catch (Exception e) {
    @Override
        };
                        final Path file = folder.resolve(run.getId() + ".txt");
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String VIEW_ID = "org.jkiss.dbeaver.tasks";

    private abstract class TaskRunLabelProvider extends ColumnLabelProvider {
            switch (event.getAction()) {

            DBTTaskRun taskRun = getSelectedTaskRun();
        public void run() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
                manager.add(new OpenRunLogFolderAction());
            super(TaskUIViewMessages.db_tasks_view_open_run_log_folder_open);
        @Override
        MenuManager menuMgr = createTaskContextMenu(tasksTree.getViewer());
        if (tasksTree == null) {
            @Override
        loadTaskRuns(true);
            final Path[] path = {null};
                    if (task == tasksTree.getSelectedTask()) {
            @Override

        createTaskTree(sashForm);
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;

    }
    public void init(IViewSite site) throws PartInitException {
            protected void update(ViewerCell cell, DBTTaskRun taskRun) {
}



        }
import org.eclipse.ui.internal.WorkbenchMessages;
                manager.add(new ViewRunLogAction());
        sashForm.setWeights(700, 300);
                final Path path = task.getProject().getTaskManager().getStatisticsFolder(task);
                case TASK_EXECUTE -> refresh();
                        Files.copy(is, file, StandardCopyOption.REPLACE_EXISTING);
                cell.setBackground(tasksTree.getColorError());

        if (selectedTask == null) {
                    NLS.bind(TaskUIViewMessages.db_tasks_view_run_log_confirm_delete_task, task.getName(), tasksTree.getDateFormat().format(taskRun.getStartTime()))))
import org.eclipse.jface.viewers.*;
        getSite().registerContextMenu(DatabaseTasksView.TASK_RUNS_MENU_ID, menuMgr, taskRunViewer);
            for (TaskHandlerGroupBy.GroupBy gb : TaskHandlerGroupBy.GroupBy.values()) {
                case TASK_ADD -> {

            switch (event.getAction()) {
                    List<DBTTaskRun> runs = Arrays.stream(selectedTask.getAllRuns())
            manager.add(new Separator());
 * Unless required by applicable law or agreed to in writing, software
            }
        currentTask = selectedTask;
        }
        final DBTTaskCategory category;
                        }
                    }
            return;
        TaskCategoryNode(DBPProject project, TaskCategoryNode parent, DBTTaskCategory category) {

        @Override
 * limitations under the License.
            }
import org.jkiss.dbeaver.model.app.DBPProjectListener;
            if (task != null && task.getLastRun() != null) {
        if (!force && selectedTask == currentTask) {
    public static final String RUN_TASK_CMD_ID = "org.jkiss.dbeaver.task.run";
            if (!(obj instanceof TaskCategoryNode)) {
    private ViewerColumnController<?,?> taskRunColumnController;
        if (tasksTree == null) {
        getSite().registerContextMenu(TASKS_VIEW_MENU_ID, menuMgr, tasksTree.getViewer());
        if (tasksTree != null) {
import org.eclipse.core.runtime.Status;
        setPartName(Objects.requireNonNull(viewDescriptor == null ? null : viewDescriptor.getLabel(), "") + " - " + projectName);
                manager.add(ActionUtils.makeCommandContribution(getSite(), CREATE_FOLDER_RENAME_CMD_ID));
        MenuManager menuMgr = createTaskRunContextMenu(taskRunViewer);
import java.nio.charset.StandardCharsets;
                }
        }

    private static final Log log = Log.getLog(DatabaseTasksView.class);

            }
            }
        taskrunTree.setLayoutData(new GridData(GridData.FILL_BOTH));
                    try {
            DBTTaskRun taskRun = getSelectedTaskRun();

                                ((TextFileDocumentProvider) prov).setEncoding(editorPart.getEditorInput(), StandardCharsets.UTF_8.name());
                        IEditorPart editorPart = EditorUtils.openExternalFileEditor(runLog.toFile(), getSite().getWorkbenchWindow());
        }
            DBTTask task = tasksTree.getSelectedTask();
import org.jkiss.dbeaver.model.task.*;
    }
                        final Path folder = DBWorkbench.getPlatform().getTempFolder(monitor, "task-runs");
        TaskRegistry.getInstance().addTaskListener(this);
