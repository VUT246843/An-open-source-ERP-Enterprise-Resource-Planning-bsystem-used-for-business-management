public class EditBootstrapQueriesDialog extends HelpEnabledDialog {
 *
                removeButton.setEnabled(selectionIndex >= 0);
 * Unless required by applicable law or agreed to in writing, software
            @Override
    public boolean isIgnoreErrors() {
            2,
                    removeButton.setEnabled(queriesTable.getSelectionIndex() >= 0);
            public void controlResized(ControlEvent e) {
import org.jkiss.dbeaver.core.CoreMessages;


            CoreMessages.dialog_connection_edit_wizard_shell_cmd_variables_hint_label,
import org.jkiss.dbeaver.ui.internal.UIMessages;
                dataSourceDescriptor.getConnectionConfiguration()));

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        removeButton.setText(UIMessages.button_remove);
 */
        return values;

    }
    @NotNull
        queriesTable.addControlListener(new ControlAdapter() {
            protected Control createEditor(Table table, int index, TableItem item) {
    protected Composite createDialogArea(@NotNull Composite parent) {
                Text editor = new Text(table, SWT.BORDER);
        );
                    queriesTable.remove(selectionIndex);
        };

    public EditBootstrapQueriesDialog(Shell shell, DataSourceDescriptor dataSourceDescriptor, Collection<String> queries, boolean ignoreErrors) {
                }
            composite,
        final Button addButton = new Button(buttonsGroup, SWT.PUSH);
    private static final String DIALOG_ID = "DBeaver.EditBootstrapQueriesDialog";
        queriesTable.setLayoutData(gd);
        });
            public void widgetSelected(SelectionEvent e) {
        queriesTable = new Table(group, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        Composite composite = super.createDialogArea(parent);
        ignoreErrors = ignoreErrorButton.getSelection();
        buttonsGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    public List<String> getQueries() {
            }
import org.eclipse.swt.widgets.*;
    @Override
            GridData.FILL_BOTH
/**
 * Object filter edit dialog
        return UIUtils.getSettingsSection(DBeaverActivator.getInstance().getDialogSettings(), DIALOG_ID);

        addButton.addSelectionListener(new SelectionAdapter() {

 *
    }
    private boolean ignoreErrors;
 */
import org.eclipse.swt.SWT;
                    newItem.setText(sql);
                    UIUtils.packColumns(queriesTable, true);
        getShell().setText(CoreMessages.dialog_connection_edit_wizard_general_bootstrap_query_title);
    }
                int sbWidth = 0;

    private Button ignoreErrorButton;
                    TableItem newItem = new TableItem(queriesTable, SWT.LEFT);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.ui.UIUtils;
                String sql = EditTextDialog.editText(getShell(), CoreMessages.dialog_connection_edit_wizard_general_bootstrap_query_sql_title, "");

    protected void okPressed() {
        final TableColumn valueColumn = UIUtils.createTableColumn(queriesTable, SWT.LEFT, "SQL");
            values.add(value);

        valueColumn.setWidth(300);
                queriesTable.getColumn(0).setWidth(queriesTable.getSize().x - queriesTable.getBorderWidth() * 2 - sbWidth);
        List<String> values = new ArrayList<>();
    @Override
        return ignoreErrors;
        queriesTable.setLinesVisible(true);
                }

                if (selectionIndex >= 0) {
        queries = collectValues(queriesTable);
        for (String value : queries) {
            variablesHintLabel.setResolver(new DataSourceVariableResolver(dataSourceDescriptor,
package org.jkiss.dbeaver.ui.dialogs.connection;
    }
 * you may not use this file except in compliance with the License.
            }
            }
            }
        super.okPressed();

                editor.setText(item.getText());
        this.dataSourceDescriptor = dataSourceDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
            composite,
import java.util.Collection;
        gd.widthHint = 300;
            String value = item.getText().trim();
        this.ignoreErrors = ignoreErrors;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
import org.jkiss.dbeaver.ui.IHelpContextIds;
        return composite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;
        final GridData gd = new GridData(GridData.FILL_BOTH);
import java.util.ArrayList;
    protected IDialogSettings getDialogBoundsSettings() {
        });
                item.setText(((Text) control).getText());

            @Override
        }
        }
 *
        });
        });
import org.eclipse.swt.events.ControlAdapter;
            @Override
            @Override
    private List<String> collectValues(Table table) {
import org.eclipse.jface.dialogs.IDialogSettings;
            CoreMessages.dialog_connection_edit_wizard_general_bootstrap_query_sql_label,
        ignoreErrorButton = UIUtils.createCheckbox(composite, CoreMessages.dialog_connection_edit_wizard_general_bootstrap_query_ignore_error_lable, ignoreErrors);
    }
        removeButton.addSelectionListener(new SelectionAdapter() {
/*
 * See the License for the specific language governing permissions and
                    tableEditor.closeEditor();
            public void widgetSelected(SelectionEvent e) {

    private List<String> queries;
        queriesTable.addSelectionListener(new SelectionAdapter() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (dataSourceDescriptor != null) {
        addButton.setText(UIMessages.button_add);
    }
        removeButton.setEnabled(false);
                continue;
            @Override
            new TableItem(queriesTable, SWT.LEFT).setText(value);
}
        gd.heightHint = 100;
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
        final Button removeButton = new Button(buttonsGroup, SWT.PUSH);
                return editor;
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
                tableEditor.closeEditor();
            if (value.isEmpty() || value.equals("%")) { //$NON-NLS-1$
        addButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite buttonsGroup = UIUtils.createPlaceholder(group, 1, 5);
        UIUtils.asyncExec(() -> UIUtils.packColumns(queriesTable, true));

        return queries;

import org.jkiss.dbeaver.core.DBeaverActivator;
        super.cancelPressed();
        Composite group = UIUtils.createTitledComposite(
    protected void cancelPressed() {
                if (queriesTable.getVerticalBar() != null) {
                int selectionIndex = queriesTable.getSelectionIndex();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
            DBPConnectionConfiguration.INTERNAL_CONNECT_VARIABLES);


    @Override
        for (TableItem item : table.getItems()) {
import org.eclipse.swt.layout.GridData;

import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
    }
 * You may obtain a copy of the License at
                    sbWidth = queriesTable.getVerticalBar().getSize().x;
    private Table queriesTable;
import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;
        final CustomTableEditor tableEditor = new CustomTableEditor(queriesTable) {
 * limitations under the License.
        super(shell, IHelpContextIds.CTX_EDIT_OBJECT_FILTERS);
    }
                int selectionIndex = queriesTable.getSelectionIndex();
        VariablesHintLabel variablesHintLabel = new VariablesHintLabel(
                    queriesTable.setSelection(newItem);
    @Override
            }
            }
            @Override

            CoreMessages.dialog_connection_edit_wizard_shell_cmd_variables_hint_title,
        removeButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

                if (sql != null) {
        this.queries = new ArrayList<>(queries);
    private final DataSourceDescriptor dataSourceDescriptor;
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;


            protected void saveEditorValue(Control control, int index, TableItem item) {
        }
                }
