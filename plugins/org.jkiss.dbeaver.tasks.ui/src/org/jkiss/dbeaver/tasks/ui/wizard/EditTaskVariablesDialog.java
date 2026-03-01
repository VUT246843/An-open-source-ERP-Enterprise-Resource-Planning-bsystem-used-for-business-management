import org.jkiss.dbeaver.model.task.DBTTask;

            protected boolean canEdit(Object element) {
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
}
        });
                    viewer.setSelection(new StructuredSelection(variables.get(CommonUtils.clamp(index, 0, variables.size() - 1))));
        newButton.setEnabled(false);

        UIUtils.asyncExec(() -> {
            protected Object getValue(Object element) {
            @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return null;
            }
                return element instanceof TaskVariableList;
            public boolean hasChildren(Object element) {
            @Override
        final TreeViewerColumn nameColumn = new TreeViewerColumn(viewer, SWT.LEFT);
        super(shell);
        });
            }
    @Override
import java.util.stream.Collectors;
            public Object[] getChildren(Object parent) {
                    return value;
import org.eclipse.jface.viewers.*;
                final TreePath path = viewer.getStructuredSelection().getPaths()[0];
                    return list.task.getName();
    public Map<String, Object> getVariables(@NotNull DBTTask task) {
/*
    private record TaskVariableList(@NotNull DBTTask task, @NotNull List<TaskVariable> variables) {

                    return variable.name;
 * you may not use this file except in compliance with the License.
        viewer.setContentProvider(new TreeContentProvider() {

    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private TreeViewer viewer;
        });
                ((TaskVariable) element).name = SQLCommandSet.prepareVarName(BasicSQLDialect.INSTANCE, (String) value);
            }
import org.jkiss.code.NotNull;
    private final List<TaskVariableList> variables;
                return null;
            .filter(l -> l.task == task)
        });
        taskColumn.setLabelProvider(new ColumnLabelProvider() {
            }

        viewer.getTree().setHeaderVisible(true);
                if (parent instanceof TaskVariableList list) {


        paramsComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
                return new AdvancedTextCellEditor(viewer.getTree());

            .collect(Collectors.toMap(v -> v.name, v -> v.value));
import org.eclipse.jface.dialogs.IDialogSettings;
                return new Object[0];
                }
            }
                viewer.update(element, null);
            @Override
import java.util.Map;
                ((TaskVariable) element).value = (String) value;
import org.jkiss.dbeaver.ui.controls.AdvancedTextCellEditor;
                return null;
        viewer.getTree().setLayoutData(gd);
        private TaskVariable(@NotNull String name, @NotNull String value) {
                if (value.chars().anyMatch(Character::isLowerCase)) {
            @Override
        });
            }
        });
                if (element instanceof TaskVariable variable) {
        final ToolItem deleteButton = UIUtils.createToolItem(toolbar, null, UIIcon.ROW_DELETE, new SelectionAdapter() {
        nameColumn.getColumn().setText(TaskUIMessages.edit_task_variabl_dialog_column_variable);
public class EditTaskVariablesDialog extends StatusDialog {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    }
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
                }
            newButton.setEnabled(element instanceof TaskVariableList || element instanceof TaskVariable);
                    .map(variable -> new TaskVariable(variable.getKey(), CommonUtils.toString(variable.getValue())))
                final String value = ((TaskVariable) element).name;
        });
 * Licensed under the Apache License, Version 2.0 (the "License");

                viewer.setSelection(new StructuredSelection(variable), true);
                viewer.refresh(list);
                final var key = entry.getKey();
            }
import org.eclipse.swt.SWT;
            .toList();
            @Override
                final int index = variables.indexOf(variable);
                    return DBeaverIcons.getImage(list.task.getType().getIcon());
 * DBeaver - Universal Database Manager
            }
    public boolean isHelpAvailable() {

                if (element instanceof TaskVariableList list) {

                if (element instanceof TaskVariableList list && list.task.getType().getIcon() != null) {
                final TaskVariable variable = (TaskVariable) path.getLastSegment();
        final TreeViewerColumn valueColumn = new TreeViewerColumn(viewer, SWT.LEFT);
            this.name = name;
            public String getText(Object element) {
                return new TaskVariableList(key, vars);
                }
        taskColumn.getColumn().setText(TaskUIMessages.edit_task_variabl_dialog_column_task);
                    return variable.value;
            }
        nameColumn.setLabelProvider(new ColumnLabelProvider() {

import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
                }
import org.jkiss.dbeaver.ui.UIIcon;
    protected boolean isResizable() {
        setTitle(TaskUIMessages.edit_task_variabl_dialog_title_task_variables);
            @Override
    }
            @Override
            final Object element = viewer.getStructuredSelection().getFirstElement();

            @Override
        return variables.stream()

 */
    @Override
                }
            protected CellEditor getCellEditor(Object element) {
                final List<TaskVariable> variables = list.variables;
import org.jkiss.dbeaver.ui.UIStyles;
                variables.remove(index);
                } else {

        final TreeViewerColumn taskColumn = new TreeViewerColumn(viewer, SWT.LEFT);

/**

 * EditTaskVariablesDialog
        return true;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Image;

            viewer.setInput(variables);
            protected void setValue(Object element, Object value) {
                }
    }

            protected boolean canEdit(Object element) {

        valueColumn.getColumn().setText(TaskUIMessages.edit_task_variabl_dialog_column_value);
import org.eclipse.swt.widgets.*;
                final TreePath path = viewer.getStructuredSelection().getPaths()[0];
            protected CellEditor getCellEditor(Object element) {
        valueColumn.setLabelProvider(new ColumnLabelProvider() {
    protected IDialogSettings getDialogBoundsSettings() {
        });

import org.jkiss.dbeaver.model.sql.commands.SQLCommandSet;

                return ((TaskVariable) element).value;
                if (element instanceof TaskVariable variable) {
            @Override
            }
 *
        final Composite paramsComposite = UIUtils.createComposite(composite, 1);
            @Override

        gd.heightHint = 200;
                }
                viewer.refresh(list);
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIMessages;
    }
            protected void setValue(Object element, Object value) {
            public String getText(Object element) {
 *
                return element instanceof TaskVariable;
        final ToolBar toolbar = new ToolBar(composite, SWT.FLAT | SWT.HORIZONTAL);
            @Override
    }
                final TaskVariableList list = (TaskVariableList) path.getFirstSegment();
        final Composite composite = (Composite) super.createDialogArea(parent);
    private static final String DIALOG_ID = "DBeaver.SQLQueryParameterBindDialog";//$NON-NLS-1$
            @Override
 */
        private String name;
        this.variables = variables.entrySet().stream()
            }
        gd.widthHint = 400;
                    .collect(Collectors.toCollection(ArrayList::new));
        private String value;
                    return list.variables().toArray();
        nameColumn.setEditingSupport(new EditingSupport(viewer) {

 * Unless required by applicable law or agreed to in writing, software
        });
    @NotNull


        viewer.addSelectionChangedListener(event -> {
            @Override
            })
            }
                return element instanceof TaskVariable;
            viewer.expandAll(true);
import java.util.List;
            .map(entry -> {
    @Override
        valueColumn.setEditingSupport(new EditingSupport(viewer) {
        viewer.getTree().setLinesVisible(!UIStyles.isDarkTheme());
package org.jkiss.dbeaver.tasks.ui.wizard;
 *
            @Override
import org.jkiss.utils.CommonUtils;
    @Override
    private static class TaskVariable {
                return new TextCellEditor(viewer.getTree());
import org.eclipse.jface.dialogs.StatusDialog;

        final GridData gd = new GridData(GridData.FILL_BOTH);
            public void widgetSelected(SelectionEvent e) {

            }

                viewer.editElement(variable, 1);
        return composite;


                    return BasicSQLDialect.INSTANCE.getQuotedIdentifier(value, true, false);
                if (!variables.isEmpty()) {
                viewer.update(element, null);
            .flatMap(l -> l.variables.stream())
import org.eclipse.swt.events.SelectionAdapter;
            public void widgetSelected(SelectionEvent e) {
            }
import java.util.ArrayList;
        return false;
            UIUtils.packColumns(viewer.getTree(), true, new float[]{0.1f, 0.2f, 0.7f});
 * distributed under the License is distributed on an "AS IS" BASIS,
                final var vars = entry.getValue().entrySet().stream()
            public String getText(Object element) {
        });
            }
                return null;
        viewer = new TreeViewer(paramsComposite, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
            }
 * See the License for the specific language governing permissions and

            deleteButton.setEnabled(element instanceof TaskVariable);
    protected Control createDialogArea(Composite parent) {
            protected Object getValue(Object element) {

        final ToolItem newButton = UIUtils.createToolItem(toolbar, null, UIIcon.ROW_ADD, new SelectionAdapter() {
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.events.SelectionEvent;
        return UIUtils.getDialogSettings(DIALOG_ID);
                final TaskVariable variable = new TaskVariable("var", "value");
    }
            this.value = value;
                list.variables.add(variable);



                final TaskVariableList list = (TaskVariableList) path.getFirstSegment();
    public EditTaskVariablesDialog(@NotNull Shell shell, @NotNull Map<DBTTask, Map<String, Object>> variables) {
            public Image getImage(Object element) {
        deleteButton.setEnabled(false);
