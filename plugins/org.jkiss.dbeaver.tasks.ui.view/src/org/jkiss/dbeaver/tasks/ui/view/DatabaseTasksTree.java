                    return ((DBTTask) element).getType().getCategory().getName();
        @Override
            this.parent = parent;
    private void refreshTasks() {
                            for (DBTTask task : tasksToDrop) {
                    curObject = event.item.getData();
            @Override
    private static List<DBTTaskType> getNotEmptyTaskTypes(DBPProject project, DBTTaskCategory category, List<DBTTask> tasks, DBTTaskFolder taskFolder) {
                    for (DBTTaskType type : getTaskTypes(folderProject, null, thisFolderTasks)) {
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                case EXPAND_ALL:

            if (lr2 == null) return o1.getName().compareToIgnoreCase(o2.getName());
            return !(parentElement instanceof DBTTask);
            } else if (element instanceof TaskCategoryNode) {
                }
    private class TreeListContentProvider implements ITreeContentProvider {
        this.groupByType = groupByType;

        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();

                    .filter(taskFolder -> taskFolder.getProject() == parentElement && taskFolder.getParentFolder() == null)

        @Override
        });
        for (TreeItem item : taskViewer.getTree().getItems()) {
                if (!CommonUtils.isEmpty(nestedTaskFolders)) {
                    return null;
                    children.addAll(new ArrayList<>(nestedTaskFolders));

            return category.getName();
            return null;
            }
            protected String getCellText(Object element) {
                    } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
            if (project == null || project == task.getProject()) {
            } else if (parentElement instanceof TaskTypeNode) {

    }
        }
    }
            DBPImage cellImage = getCellImage(element);
        });
            }
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    DateFormat getDateFormat() {
                    .sorted(DBUtils.nameComparatorIgnoreCase())
        });
                    }
        }
                if (element instanceof DBTTask) {
    public List<DBTTask> getCheckedTasks() {
        source.setTransfer(types);
        Set<DBTTaskCategory> categories = new LinkedHashSet<>();
        
                Objects.equals(taskFolder, that.taskFolder);
                }
                if (element instanceof DBTTask) {


                }
                                    } catch (DBException e) {
        DBTScheduler scheduler = TaskRegistry.getInstance().getActiveSchedulerInstance();
    private static List<DBTTaskType> getTaskTypes(DBPProject project, DBTTaskCategory category, List<DBTTask> tasks) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            }
                    for (Object nextSelected : selection.toArray()) {
                handleDragEvent(event);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            addCheckedItem(item, tasks);

    }
            }
            new NamedObjectPatternFilter(), TaskUIViewMessages.db_tasks_tree_text_tasks_type);
        regroupTasks(ExpansionOptions.EXPAND_ALL);
                    return ((DBTTask) element).getName();
                                        task.getProject().getTaskManager().updateTaskConfiguration(task);
                Objects.equals(project, that.project) &&
                        event.data = "";
            }

                    } else if (curObject instanceof TaskCategoryNode) {
        final DBPProject project;
    private TreeViewer taskViewer;

        protected abstract String getCellText(Object element);

            private IStructuredSelection selection;
            this.parent = parent;
                for (DBTTaskCategory childCat : getTaskCategories(parentCat.project, parentCat.category, allTasks)) {
                    if (lastRun == null) {
        return resultTaskTypes;
    private final List<DBTTaskFolder> allTasksFolders = new ArrayList<>();
                handleDragEvent(event);
                return null;
                            continue;
        final TaskCategoryNode parent;
                    return null;
            }
            public void dragOperationChanged(DropTargetEvent event) {
                        log.debug(e);
import java.text.Collator;
                            task  = (DBTTask) nextSelected;
                    }
                    String description = ((DBTTask) element).getDescription();

        try {
                return null;
                        return "N/A";
    }
                    } else if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
    private int compareTasksTime(DBTTask o1, DBTTask o2) {
    public boolean isGroupByCategory() {
        });
                if (element instanceof DBPProject) {

        return groupByCategory;
                    }
                                    taskFolder.addTaskToFolder(task);
                }
    }
                    return CommonUtils.notEmpty(((DBTTask) element).getDescription());
        TaskTypeNode(DBPProject project, TaskCategoryNode parent, DBTTaskType type, @Nullable DBTTaskFolder taskFolder) {

        }
        if (taskViewer.isBusy()) {
            // Add task folders as parent elements, task from these folders will be added in children list

        taskColumnController = new ViewerColumnController<>(TaskUIViewMessages.db_tasks_tree_column_controller_tasks, taskViewer);
        taskTree.setHeaderVisible(true);
 */
            }.schedule();
                return null;
            }
                        if (draggableChecker != null && !draggableChecker.select(nextSelected)) {
                for (DBTTask task : allTasks) {

            this.taskFolder = taskFolder;
            }

                return null;

                        event.data = new DatabaseTaskTransfer.Data(viewer.getControl(), Collections.emptyList());
            this.project = project;
        colorErrorForeground = UIStyles.getContrastColor(colorError);
    ViewerColumnController getColumnController() {
            public void dragStart(DragSourceEvent event) {
            return true;
import org.jkiss.dbeaver.model.task.*;


    public DBTTask getSelectedTask() {
                    taskViewer.expandAll();
        }
            if (!CommonUtils.isEmpty(allTasksWithoutFolders)) {
    private boolean groupByCategory = false;

                    if (isSuitableType(parentType, task) &&
            public void dropAccept(DropTargetEvent event) {
                        event.data = buf.toString();
                }
            switch (options) {
                .collect(Collectors.toList());
            @Override
        });
        } else {
                        for (DBTTaskType type : getTaskTypes(project, null, thisProjectTasksWithoutFolder)) {

/*

            return;
                        return ((TaskTypeNode) curObject).taskFolder != null;
                }

        DBTScheduler scheduler = TaskRegistry.getInstance().getActiveSchedulerInstance();
        saveViewConfig();
        saveViewConfig();

                        children.add(new TaskTypeNode(parentCat.project, parentCat, type, parentCat.taskFolder));
                }
            SWT.MULTI | SWT.FULL_SELECTION | (selector ? SWT.BORDER | SWT.CHECK : SWT.NONE),
                        if (task == null) {
                return null;
        if (project == null) {
            if (project == null || project == task.getProject()) {
        }
import org.eclipse.swt.widgets.TreeItem;
        regroupTasks(ExpansionOptions.RETAIN);
 * Licensed under the Apache License, Version 2.0 (the "License");
                @Override
            @Override
            @Override
        }
                // First add all tasks folders belonging to this project without parent folders
                case RETAIN:
            }
    }
            }
            return null;
        EXPAND_ALL,
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_type, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_task_type, SWT.LEFT, true, false, new TaskLabelProvider() {

                if (element instanceof DBTTask) {
        preferenceStore.setValue("dbeaver.tasks.view.groupByType", groupByType);
                    }
                        if (!taskViewer.isBusy()) {
import org.jkiss.dbeaver.DBException;
            public void dragSetData (DragSourceEvent event) {
            if (element instanceof DBTTask) {
        Object element = ((IStructuredSelection) selection).getFirstElement();
    private boolean groupByType = false;
        }
        Tree taskTree = taskViewer.getTree();
            }
    private List<DBPProject> getTaskProjects(List<DBTTask> tasks) {
    }
                    } else if (curObject instanceof TaskTypeNode) {
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_name, SWT.LEFT, true, true, new TaskLabelProvider() {
        // We need to find all types with tasks for current folder or if no folder at all. We do not need empty types without tasks.
                        }
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            cell.setText(CommonUtils.notEmpty(getCellText(element)));
    Color getColorError() {
            }
                        if (nextSelected instanceof DBTTask) {
                } else if (groupByType) {
                // Child tasks
        dateFormat.setTimeZone(TimeZone.getTimeZone(TimezoneRegistry.getUserDefaultTimezone()));
            }
    }
            }
                .sorted(DBUtils.nameComparatorIgnoreCase())
                }
        dropTarget.setTransfer(DatabaseTaskTransfer.getInstance());
        });
                List<DBTTaskFolder> nestedTaskFolders = taskFolder.getNestedTaskFolders();
                    } else {
                List<DBTTask> thisFolderTasks = allTasks.stream()
            return children.toArray();
        List<DBTTaskType> sortedTypes = new ArrayList<>(types);
                }
                    return ((TaskCategoryNode) element).project;

    }
        new DefaultViewerToolTipSupport(taskViewer);
                    children.addAll(thisFolderTasks);
        @Override
            protected DBPImage getCellImage(Object element) {
                    .collect(Collectors.toList());
                } else {
                DBTTaskRun lastRun = ((DBTTask) element).getLastRun();
                            children.add(new TaskTypeNode(project, null, type, null));
                    Object[] expandedElements = taskViewer.getExpandedElements();
            } else if (parentElement instanceof DBTTaskFolder) {
        @Override
            @Override

            protected String getCellText(Object element) {
    }
                @NotNull
        allTasksFolders.clear();

                        curObject = event.item.getData();
                return null;
    }
                }
            return Objects.hash(project, parent, category, taskFolder);
    private static class TaskCategoryNode {
        }
            if (cellImage != null) {
                    } else {
                }

    }
                }
                List<DBTTaskFolder> sortedFoldersWithoutParents = allTasksFolders.stream()
        this.groupByCategory = groupByCategory;
import java.text.DateFormat;
            Collections.addAll(allTasksFolders, tasksFolders);
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_category, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_category, SWT.LEFT, false, false, new TaskLabelProvider() {
            @Override
                } else if (element instanceof DBTTaskFolder) {
        @Override
import org.eclipse.swt.dnd.*;


                    break;
                        description = ((DBTTask) element).getName();
        NamedObjectPatternFilter() {
                        scheduler.refreshScheduledTasks(monitor);
                        children.add(new TaskTypeNode(folderProject, null, type, taskFolder));
                Objects.equals(taskFolder, that.taskFolder);
            // Collect all tasks without folders
        final TaskCategoryNode parent;
                children.addAll(allTasksFolders.stream()
 * DBeaver - Universal Database Manager
        }
                }
                TaskTypeNode parentType = (TaskTypeNode) parentElement;
            }
        refreshScheduledTasks();
                        String taskName = task.getName();

                        }

    public void setGroupByCategory(boolean groupByCategory) {
                    }
                    if (event.data instanceof DatabaseTaskTransfer.Data) {
                if (((TaskTypeNode) element).parent != null) {
                        curObject = null;
                    allTasksThisCategory.sort(DBUtils.nameComparatorIgnoreCase());
            this.type = type;
                Objects.equals(parent, that.parent) &&
                    // Task types
                    DBTTaskFolder taskFolder;

    public DatabaseTasksTree(Composite composite, boolean selector) {
                return element instanceof DBTTaskFolder ? 0 : 1;
                handleDragEvent(event);

import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.utils.GeneralUtils;
        DropTarget dropTarget = new DropTarget(viewer.getControl(), DND.DROP_MOVE);
        refreshTasks();

        DBTTaskFolder[] tasksFolders = taskManager.getTasksFolders();
            if (this == o) return true;
        }
                        DBTTask task = null;
                }
                    cell.setForeground(null);
        taskViewer.getTree().setRedraw(false);
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_last_result, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_last_result, SWT.LEFT, true, false, new TaskLabelProvider() {
                // First add nested task folders to elements list
        dropTarget.addDropListener(new DropTargetListener() {
        public Object[] getElements(Object inputElement) {
    }
                            return "";

    private final List<DBTTask> allTasks = new ArrayList<>();
        return dateFormat;

                            return scheduledTask.getNextRunInfo();
                    }
                if (element instanceof DBTTask) {
                        return GeneralUtils.makeExceptionStatus("Error reading scheduled tasks", e);
        tasks.forEach(task -> projects.add(task.getProject()));
                } else {
    public boolean isGroupByType() {
                    cell.setBackground(null);
                    if (CommonUtils.isEmpty(description)) {
        allTasksFolders.sort(Comparator.comparing(DBTTaskFolder::getName));
                    } else {
                    if (event.item instanceof Item) {
                }

           return task.getType() == parentType.type && (parentType.project == null || task.getProject() == parentType.project);
        DBTTask[] tasks = taskManager.getAllTasks();
                        taskFolder = ((DBTTask) curObject).getTaskFolder();

        colorError = BaseThemeSettings.instance.colorError;
        } else if (lr2 == null) {
            return ((Collection<?>) inputElement).toArray();
    }
        if (lr1 == null) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                            continue;
            // Now we need to distribute all tasks without folders
        }
                if (((TaskCategoryNode) element).parent != null) {
            if (!CommonUtils.isEmpty(allTasksFolders)) {
            } else if (parentElement instanceof TaskCategoryNode) {


import org.jkiss.dbeaver.model.app.DBPProject;

                if (event.item instanceof Item) {
            return Objects.equals(project, that.project) &&
        return tasks;
            public void drop(DropTargetEvent event) {

            }
                event.detail = isDropSupported(event) ? DND.DROP_MOVE : DND.DROP_NONE;
                    for (DBTTaskType type : getNotEmptyTaskTypes(parentCat.project, parentCat.category, allTasks, parentCat.taskFolder)) {

    public void setGroupByType(boolean groupByType) {
        public Object getParent(Object element) {
                        return true;
                rootObjects.addAll(sortedFoldersWithoutParents);
                    UIUtils.asyncExec(() -> {
                } else {
                    sortedByDescriptorList.add(task);
        if (!(selection instanceof IStructuredSelection) || selection.isEmpty()) {
                for (DBTTaskCategory category = task.getType().getCategory(); category != null; category = category.getParent()) {
                        tasks.add(task);

        sortedTypes.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
 *
                        children.add(task);
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewMessages;
        DBTTaskManager taskManager = project.getTaskManager();
            this.taskFolder = taskFolder;
                    .filter(task -> task.getTaskFolder() == null && task.getProject() == parentElement)
                    return ((TaskCategoryNode) element).category.getIcon();
                            TaskRegistry.getInstance().notifyTaskFoldersListeners(new DBTTaskFolderEvent(taskFolder, DBTTaskFolderEvent.Action.TASK_FOLDER_REMOVE)); // Refresh all
            return Objects.hash(project, parent, type, taskFolder);
        });
                    cell.setBackground(colorError);
    private static final Log log = Log.getLog(DatabaseTasksTree.class);

                    }
                DBTTaskFolder taskFolder = (DBTTaskFolder) parentElement;
                        if (scheduledTask == null) {

                if (event.detail == DND.DROP_MOVE) {
        }
            taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_next_run, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_next_run, SWT.LEFT, true, false, new TaskLabelProvider() {
        }
                    return ((DBTTask) element).getProject().getName();
                    }
        }
        DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        taskViewer = DialogUtils.createFilteredTree(composite,
                        }
            taskColumnController.repackColumns();
import org.jkiss.code.NotNull;
                    }
        final DBPProject project;
    static void addDragAndDropSourceSupport(Viewer viewer) {
        public final void update(ViewerCell cell) {
    void regroupTasks(ExpansionOptions options) {
        TaskCategoryNode(DBPProject project, TaskCategoryNode parent, DBTTaskCategory category, @Nullable DBTTaskFolder taskFolder) {
        return element instanceof DBTTask ? (DBTTask) element : null;
            Object element = cell.getElement();
                .filter(task -> task.getTaskFolder() == null)
        groupByType = preferenceStore.getBoolean("dbeaver.tasks.view.groupByType");

        }



        if (scheduler != null) {

    }
                    break;
                        }
                } else if (element instanceof DBTTaskFolder) {
                }

import org.jkiss.dbeaver.model.DBIcon;
            }
import org.jkiss.utils.CommonUtils;
            }
                    if (lastRun == null || lastRun.getStartTime() == null) {
        taskColumnController.setComparator(new ViewerColumnController.DefaultComparator(Collator.getInstance()) {
                    if (curObject instanceof DBTTask || curObject instanceof DBTTaskFolder) {
                } else {
        private boolean isSuitableType(TaskTypeNode parentType, DBTTask task) {
                return null;
            }
    }
                }
                DBPProject project = (DBPProject) parentElement;
                    StringBuilder buf = new StringBuilder();
        return taskViewer;
                    if (parentCat.taskFolder != null) {
                    if (element instanceof DBTTask) {
            Collections.addAll(allTasks, tasks);
                // Child categories
                    }
        final DBTTaskType type;
                } else if (element instanceof TaskCategoryNode) {
                if (groupByCategory) {
                }
        }
            log.debug(e);
                    } else {
                    } else if (curObject instanceof TaskTypeNode) {
            @Override
        public int hashCode() {
                } else if (element instanceof TaskTypeNode) {
                    DBTTaskRun lastRun = ((DBTTask) element).getLastRun();
            private void handleDragEvent(DropTargetEvent event) {
                } else if (element instanceof DBTTask) {
                    types.add(task.getType());
                resultTaskTypes.add(taskType);
        preferenceStore.setValue("dbeaver.tasks.view.groupByCategory", groupByCategory);
                } else if (element instanceof DBTTask) {
                    .sorted(DBUtils.nameComparatorIgnoreCase())
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_description, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_task_description, SWT.LEFT, false, false, new TaskLabelProvider() {
                }
                    return Status.OK_STATUS;
            return true;
                return false;
            protected String getCellText(Object element) {
import java.text.SimpleDateFormat;
                    return description;


            if (!(o instanceof TaskCategoryNode)) return false;
        List<DBTTaskType> taskTypes = getTaskTypes(project, category, tasks);
                selection = (IStructuredSelection) viewer.getSelection();
        refreshScheduledTasks();
    public void saveViewConfig() {
                    }
            @Override
            }
import org.jkiss.dbeaver.ui.*;
                DBPProject folderProject = null;
import org.jkiss.dbeaver.Log;
            @Override
            protected String getCellText(Object element) {
                    }

        }
        });
            List<Object> children = new ArrayList<>();
                    for (DBTTaskCategory category : getTaskCategories(folderProject, null, thisFolderTasks)) {
            }
                        DBTTaskScheduleInfo scheduledTask = scheduler.getScheduledTaskInfo((DBTTask) element);
            }
                    return ((DBPProject) element).getName();
        }
                        children.addAll(thisProjectTasksWithoutFolder);
}
        @Override
                if (element instanceof DBTTask) {
                        categories.add(category);
        allTasks.sort(Comparator.comparing(DBTTask::getName));
                    if (taskFolder == null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
                    return ((DBTTask) element).getType().getIcon();
        });

    }
            if (element instanceof TaskTypeNode) {
        });
                        rootObjects.add(new TaskCategoryNode(null, null, category, null));
import org.jkiss.dbeaver.utils.RuntimeUtils;

                    .collect(Collectors.toList());
        final DragSource source = new DragSource(viewer.getControl(), operations);
        }
                    return ((TaskTypeNode) element).project;
        });
                    .collect(Collectors.toList());
        });
            addCheckedItem(child, tasks);
                    return element.toString();
            } else if (element instanceof DBTTaskRun) {
            if (tasks.stream().anyMatch(task -> task.getType() == taskType && task.getTaskFolder() == taskFolder)) {
    public TreeViewer getViewer() {

            return getCellText(element);
                    children.add(new TaskCategoryNode(parentCat.project, parentCat, childCat, parentCat.taskFolder));
                if (category == null || category == task.getType().getCategory()) {
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_last_run, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_start_time, SWT.LEFT, true, false, new TaskLabelProvider() {
            List<DBTTask> allTasksWithoutFolders = allTasks.stream()
import org.eclipse.swt.layout.GridData;
                TaskCategoryNode parentCat = (TaskCategoryNode) parentElement;
import org.jkiss.dbeaver.model.DBPImage;
        private List<DBTTask> getSortedByCategoryTasks(TaskCategoryNode taskCategory) {
 *
            }
                                        DBWorkbench.getPlatformUI().showError("Task save error", "Error saving task configuration", e);
import org.eclipse.jface.viewers.*;
            return type.getName();
    }
                        taskFolder = ((TaskTypeNode) curObject).taskFolder;
            if (!(o instanceof TaskTypeNode)) return false;
            new AbstractJob("Refresh scheduled tasks") {
        }
                if (element instanceof DBTTask) {
    @Nullable
 * you may not use this file except in compliance with the License.
                        }
        @Override
    private ViewerColumnController<?, ?> taskColumnController;
                handleDragEvent(event);
        return sortedTypes;
        });
                        List<DBTTask> tasksToDrop = ((DatabaseTaskTransfer.Data) event.data).getTasks();
        RETAIN,
                    return ((DBTTaskFolder) element).getName();
                    if (DatabaseTaskTransfer.getInstance().isSupportedType(event.dataType)) {
        final DBTTaskCategory category;
                if ((taskCategory.project == null || task.getProject() == taskCategory.project) && (task.getType().getCategory() == taskCategory.category)) {
                                }
    }
    private static List<DBTTaskCategory> getTaskCategories(DBPProject project, DBTTaskCategory parentCategory, List<DBTTask> tasks) {
 * You may obtain a copy of the License at
                    }
                    } else if (groupByType) {
        }
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
        protected boolean isLeafMatch(Viewer viewer, Object element) {
                handleDragEvent(event);
        }
                    } catch (Exception e) {
                Objects.equals(category, that.category) &&
        } catch (IOException e) {
            @Override
import java.io.IOException;
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_project, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_project, SWT.LEFT, false, false, new TaskLabelProvider() {
                }
        source.addDragListener (new DragSourceAdapter() {
            @Override
                    return ((TaskCategoryNode) element).parent;
            return sortedByDescriptorList;
                    }
                    DBTTaskRun lastRun = ((DBTTask) element).getLastRun();
                        } else {
        return false;
        if (!ArrayUtils.isEmpty(tasksFolders)) {
        int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
                    if (parentCategory == category.getParent()) {
    }
 * Unless required by applicable law or agreed to in writing, software
        @Nullable final DBTTaskFolder taskFolder;
        } finally {
 * See the License for the specific language governing permissions and
            }
            this.category = category;
                    return ((TaskTypeNode) element).parent;
    public void loadViewConfig() {
            preferenceStore.save();
                                    ((TaskImpl)task).setTaskFolder(taskFolder);
                if (element instanceof DBTTask) {
package org.jkiss.dbeaver.tasks.ui.view;
            return -1;
        @Override
                }
                        if (!CommonUtils.isEmpty(tasksToDrop)) {
                    .collect(Collectors.toList()));
 * limitations under the License.
                    return ((TaskTypeNode) element).type.getIcon();
                } else {
                        return RuntimeUtils.formatExecutionTime(lastRun.getRunDuration());
                        children.addAll(allTasksThisCategory.stream().filter(task -> task.getTaskFolder() == parentCat.taskFolder).collect(Collectors.toList()));
    }

        refreshTasks();
        @Override
                        }
            for (DBTTask task : allTasks) {
        addDragSourceSupport(viewer, null);
                    for (DBTTaskCategory category : getTaskCategories(null, null, allTasksWithoutFolders)) {
        // Sort all tasks into list by task category

    public static void addDragSourceSupport(Viewer viewer, IFilter draggableChecker) {
    }
                    return DBIcon.TREE_FOLDER;
                    } else if (curObject instanceof TaskCategoryNode) {
                    break;
                }
    private boolean refreshScheduledTasks() {
    void refresh() {
        }
        @Nullable final DBTTaskFolder taskFolder;
            @Override
import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
                Object curObject;
                } else {
                }
        @Override
                                    }
                        return DatabaseTasksView.getBriefStatus(lastRun);
        DBTTaskRun lr2 = o2.getLastRun();
        }
            private boolean isDropSupported(DropTargetEvent event) {
        public String getText(Object element) {
                    .filter(task -> task.getTaskFolder() == taskFolder)
            }
                } else {
                    Object curObject;
        tasks.forEach(task -> {
    }
            public void dragEnter(DropTargetEvent event) {
import org.jkiss.dbeaver.model.DBUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return "N/A";
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
                if (element instanceof DBTTask) {
        public boolean equals(Object o) {
            protected String getCellText(Object element) {
                    .sorted(DBUtils.nameComparatorIgnoreCase())
                    DBTTaskFolder taskFolder = task.getTaskFolder();
                                    try {
import org.eclipse.core.runtime.IStatus;
        }
            }

                    // Tasks
                    return DBIcon.PROJECT;
import org.jkiss.utils.ArrayUtils;
            protected String getCellText(Object element) {
                List<DBTTask> thisProjectTasksWithoutFolder = allTasks.stream()
                if (!CommonUtils.isEmpty(thisProjectTasksWithoutFolder)) {
                    for (DBTTaskType type : getTaskTypes(null, null, allTasksWithoutFolders)) {
            return Objects.equals(type, that.type) &&
        for (TreeItem child : item.getItems()) {

        return colorError;

        return groupByType;
                    return dateFormat.format(((DBTTask) element).getCreateTime());
            protected String getCellText(Object element) {
                    try {
        }

                    cell.setForeground(colorErrorForeground);
                    }
                    } else {
                    } else {

                if (!selection.isEmpty()) {
                    return ((DBTTask) element).getType().getName();
            public void dragLeave(DropTargetEvent event) {
            if (this == o) return true;
        return taskColumnController;
            private void moveNodes(DropTargetEvent event) {
                    }
                    log.warn("Unknown expansion option reached!");
        }
            }
                        }

        taskTree.setLayoutData(new GridData(GridData.FILL_BOTH));
        tasks.forEach(task -> {
        Transfer[] types = new Transfer[] {TextTransfer.getInstance(), DatabaseTaskTransfer.getInstance()};

    }
            }
                    }
            @Override
        for (DBTTaskType taskType : taskTypes) {
                protected String getCellText(Object element) {
import org.eclipse.core.runtime.Status;
        groupByCategory = preferenceStore.getBoolean("dbeaver.tasks.view.groupByCategory");
            }
            }


                }
                return wordMatches(((DBTTask) element).getName());
            List<Object> rootObjects = new ArrayList<>();
                        children.addAll(allTasksThisCategory.stream().filter(task -> task.getTaskFolder() == null).collect(Collectors.toList()));
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()); //$NON-NLS-1$
                        // We do not want unFolder this task/tasks
                        for (DBTTaskCategory category : getTaskCategories(project, null, thisProjectTasksWithoutFolder)) {
                } else if (groupByType) {

                        if (buf.length() > 0) {
        }
            this.project = project;
            List<DBTTask> sortedByDescriptorList = new ArrayList<>();
        if (item.getChecked()) {
        if (scheduler != null) {
                    taskViewer.setInput(rootObjects);
                        return;
                if (curObject instanceof DBTTask || curObject instanceof DBTTaskFolder || curObject instanceof TaskCategoryNode || curObject instanceof TaskTypeNode) {
import org.eclipse.swt.graphics.Color;
    private static class TaskTypeNode {
        taskColumnController.createColumns(true);
                            buf.append(", ");
        taskViewer.setContentProvider(new TreeListContentProvider());
                if (lastRun != null && !lastRun.isRunSuccess()) {
            if (element instanceof DBTTask) {
        public boolean equals(Object o) {
                } else {
import org.eclipse.swt.widgets.Tree;
            return 1;

    }
                    .sorted(DBUtils.nameComparatorIgnoreCase())
        List<DBTTaskType> resultTaskTypes = new ArrayList<>();
                Objects.equals(parent, that.parent) &&
                return wordMatches(element.toString());
            taskViewer.getTree().setRedraw(true);
                }
                            taskViewer.refresh(true);
                if (groupByType) {
        Set<DBTTaskType> types = new LinkedHashSet<>();
            TaskCategoryNode that = (TaskCategoryNode) o;
                    if (DatabaseTaskTransfer.getInstance().isSupportedType(event.dataType)) {


        }
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_created, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_create_time, SWT.LEFT, false, false, new TaskLabelProvider() {
                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            @Override
            }
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    private final Color colorError, colorErrorForeground;
import org.eclipse.swt.widgets.Composite;
            }
                    List<DBTTask> tasks = new ArrayList<>();
        });
                    taskViewer.setExpandedElements(expandedElements);
                    }
                if (groupByCategory) {

    private abstract class TaskLabelProvider extends ColumnLabelProvider {
        try {
                    if (lastRun == null || !lastRun.isFinished()) {
import java.util.*;
            @Override
import org.jkiss.code.Nullable;
        }
            }
                        return "N/A";
public class DatabaseTasksTree {
        taskColumnController.addColumn(TaskUIViewMessages.db_tasks_tree_column_controller_add_name_last_duration, TaskUIViewMessages.db_tasks_tree_column_controller_add_descr_run_duration, SWT.LEFT, false, false, new TaskLabelProvider() {
        }
                        return dateFormat.format(lastRun.getStartTime());

    private void addCheckedItem(TreeItem item, List<DBTTask> tasks) {
import org.eclipse.swt.widgets.Item;
                        taskFolder = ((TaskCategoryNode) curObject).taskFolder;


        return new ArrayList<>(categories);
        public boolean hasChildren(Object parentElement) {
                    }
        Set<DBPProject> projects = new LinkedHashSet<>();
                return null;
        }
        public int hashCode() {
        public Object[] getChildren(Object parentElement) {
                    .filter(e -> e.getParentFolder() == null)
    }
                    if (groupByCategory) {
        }
            @Override

                        return ((TaskCategoryNode) curObject).taskFolder != null;
                        taskFolder = (DBTTaskFolder) curObject;
                                    (parentType.taskFolder != null && parentType.taskFolder.equals(taskFolder)))) {
    enum ExpansionOptions {
            public String getToolTipText(Object element) {
            }
            @Override
        List<DBTTask> tasks = new ArrayList<>();
                            }
            public int category(Object element) {
        allTasks.clear();
        public String toString() {
                } else {
                }
                    DBTTaskRun lastRun = ((DBTTask) element).getLastRun();
                    if (curObject instanceof DBTTask) {
                            task = ((DBTTaskReference) nextSelected).getTask();
                                if (task instanceof TaskImpl && task.getProject() == taskFolder.getProject()) { // Do not move tasks into another project
                        }

            }
                } else {
                        children.add(new TaskCategoryNode(folderProject, null, category, taskFolder));
                tasks.add((DBTTask) item.getData());
    }
                        rootObjects.add(new TaskTypeNode(null, null, type, null));
 *
            if (parentElement instanceof DBPProject) {
import org.jkiss.dbeaver.registry.task.TaskImpl;

            @Override
            return lr2.getStartTime().compareTo(lr1.getStartTime());

                    rootObjects.addAll(allTasksWithoutFolders);
                            children.add(new TaskCategoryNode(project, null, category, null));
import org.jkiss.dbeaver.registry.task.TaskRegistry;
            public void dragOver(DropTargetEvent event) {
        DBTTaskRun lr1 = o1.getLastRun();

import org.eclipse.ui.dialogs.PatternFilter;
            protected String getCellText(Object element) {
            }
    public static class NamedObjectPatternFilter extends PatternFilter {
                    taskViewer.setInput(rootObjects);
    void loadTasks() {
                cell.setImage(DBeaverIcons.getImage(cellImage));
            return null;
                    }
            if (item.getData() instanceof DBTTask) {
            @Override
                    List<DBTTask> allTasksThisCategory = getSortedByCategoryTasks(parentCat);
        ISelection selection = taskViewer.getSelection();
    }
        protected DBPImage getCellImage(Object element) {

        if (tasks.length != 0) {
                default:
                    // Do not drop tasks to empty spaces
                if (element instanceof DBTTask) {
                    moveNodes(event);
                handleDragEvent(event);
            TaskTypeNode that = (TaskTypeNode) o;
            return;
                @Override

                    } else {
                        buf.append(taskName);
                        event.data = new DatabaseTaskTransfer.Data(viewer.getControl(), tasks);
                        }
        public String toString() {
                if (element instanceof DBPProject) {
                    return;


                        } else if (nextSelected instanceof DBTTaskReference) {
            setIncludeLeadingWildcard(true);
                            ((parentType.taskFolder == null && taskFolder == null) ||
                    }
        @Override
                // Then check all tasks belonging to this project without folder


            @Override
            protected String getCellText(Object element) {
    }
        return new ArrayList<>(projects);
                }
                }

                    }
    private final DateFormat dateFormat;
    }
import java.util.stream.Collectors;
                }
    }
                    });
                if (DatabaseTaskTransfer.getInstance().isSupportedType(event.currentDataType)) {

        @Override

            });
