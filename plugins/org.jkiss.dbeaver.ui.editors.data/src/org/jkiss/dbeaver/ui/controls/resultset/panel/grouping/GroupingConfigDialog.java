        List<String> allColumnNames = new ArrayList<>();
            return addButton;
        @NotNull
    @Override
        return composite;

        @NotNull StringContentProposalProvider proposalProvider,

            addCustomFunction(rootManager);

                                        addTableItem(newItem);
    public GroupingConfigDialog(Shell parentShell, GroupingResultsContainer resultsContainer) {
                    String functionCall = functionName + "(" + columnName + ")";
        @NotNull
                                        TableItem newItem = new TableItem(valueTable, SWT.LEFT);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Nullable IContentProposalProvider proposalProvider,
        @NotNull
        @NotNull List<String> groupFunctions,
                UIUtils.createControlGroup(parent, ResultSetMessages.grouping_panel_column_panel_title, 2, GridData.FILL_BOTH, 0),
                public void run() {
                return DBIcon.TREE_ATTRIBUTE;
                public void run() {
 * Grouping configuration dialog
                    addTableItem(new TableItem(valueTable, SWT.LEFT));
        @Nullable
    }
        }
                DBSDataType type = bound.getBinding().getDataType();
        proposalProvider.setProposals(proposals.toArray(new String[0]));
    }
            return new Action(columnName) {
        if (binding instanceof DBDAttributeBindingMeta) {

                public void widgetSelected(SelectionEvent e) {
            return value == null || value instanceof SQLGroupingAttribute.CustomAttribute;
    }
        super(parentShell, "Grouping configuration", null);
            });
 * you may not use this file except in compliance with the License.
            @NotNull List<SQLGroupingAttribute> values,
        ) {
import org.eclipse.swt.events.SelectionAdapter;
                values,
 * limitations under the License.
            });
                UIUtils.createControlGroup(parent, ResultSetMessages.grouping_panel_function_panel_title, 2, GridData.FILL_BOTH, 0),
            allColumnNames.add(getAttributeBindingName(attr));
import org.jkiss.dbeaver.model.struct.DBSDataType;
        this.resultsContainer = resultsContainer;
                }
                MenuManager functionMenu = new MenuManager(function);

        for (DBDAttributeBinding attr : resultsContainer.getOwnerPresentation().getController().getModel().getAttributes()) {
        @NotNull List<SQLGroupingAttribute> groupAttributes,
    private Table columnsTable;
 */

            addMenu.add(new Action(ResultSetMessages.grouping_panel_function_panel_custom_label) {
            super(
            } else {
    @NotNull
/**
        private final List<String> columns;
            return value == null ? "" : value.getDisplayName();
                true
    @NotNull
                                    public void run() {
    }
import org.jkiss.dbeaver.model.*;

 *
import org.eclipse.jface.action.Action;
            super(
            this.columns = new ArrayList<>(columns);
            Menu addMenu = rootManager.createContextMenu(addButton);
    protected void okPressed() {


        @Override

            MenuManager rootManager = new MenuManager();
                new StringEditorTableFactory.StringValuesManager(DBIcon.TREE_FUNCTION),
            for (String function : defaultFunctions) {
            addButton.addSelectionListener(new SelectionAdapter() {
    private Table createColumnsTable(
        private Action createSubmenuAction(@NotNull String functionName, @NotNull String columnName) {
    @Override
            if (value instanceof SQLGroupingAttribute.BoundAttribute bound) {
        private void addCustomFunction(@NotNull MenuManager addMenu) {
        }
    private class FunctionsTableFactory extends StringEditorTableFactory<String> {
                @Override
            addButton.addDisposeListener(e -> rootManager.dispose());
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping;
    private Table createFunctionsTable(
                    addTableItem(new TableItem(valueTable, SWT.LEFT));
        List<String> functions = StringEditorTableUtils.collectStringValues(functionsTable);
            @NotNull List<String> allColumnNames
        private Menu createAddMenu(@NotNull Button addButton) {
            addMenu.add(new Action(ResultSetMessages.grouping_panel_column_panel_custom_label) {
        private final List<String> columnNames;
        return tableFactory.createTable();
        @Override
        StringContentProposalProvider proposalProvider = new StringContentProposalProvider(new String[0]);
                }
    }
                proposalProvider,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionEvent;
/*
        private void addCustomColumn(@NotNull MenuManager addMenu) {
            this.defaultFunctions = defaultFunctions;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                true
    }
        super.okPressed();
            Button addButton = new Button(buttonsGroup, SWT.PUSH | SWT.ARROW | SWT.DOWN);
                rootManager.add(functionMenu);
    }
        @NotNull List<String> defaultFunctions,
    }

        @NotNull
import org.jkiss.code.Nullable;
        @Override
    private static final String DIALOG_ID = "DBeaver.GroupingConfigDialog"; //$NON-NLS-1$
    }
            }
            Button addButton = new Button(buttonsGroup, SWT.PUSH | SWT.ARROW | SWT.DOWN);
        }
            addButton.addDisposeListener(e -> rootManager.dispose());
            return DBUtils.getQuotedIdentifier(binding.getDataSource(), binding.getMetaAttribute().getLabel());
 * Copyright (C) 2010-2025 DBeaver Corp and others
                                    @Override
        Composite composite = super.createDialogArea(parent);
    }
            );
        List<SQLGroupingAttribute> attributes = StringEditorTableUtils.collectCustomValues(columnsTable);
        List<String> defaultFunctions = List.of("COUNT", "SUM", "AVG", "MAX", "MIN");
        @Override
    private class ColumnsTableFactory extends StringEditorTableFactory<SQLGroupingAttribute> {
            addButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            @NotNull List<String> defaultFunctions,
 * You may obtain a copy of the License at
        @NotNull
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        return tableFactory.createTable();
        FunctionsTableFactory(
            addButton.addSelectionListener(new SelectionAdapter() {
        @Override
import org.jkiss.dbeaver.ui.controls.StringEditorTableUtils;
    protected Composite createDialogArea(Composite parent) {
                return type == null ? DBIcon.TYPE_UNKNOWN : DBValueFormatting.getTypeImage(type);
                @Override
        }
            }
        return UIUtils.getDialogSettings(DIALOG_ID);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

            @Nullable IContentProposalProvider proposalProvider,

            for (String columnName : columnNames) {
import java.util.ArrayList;
                }
            MenuManager rootManager = new MenuManager();
        functionsTable = createFunctionsTable(
                                }
 *     http://www.apache.org/licenses/LICENSE-2.0
            );
        ) {
import org.jkiss.code.NotNull;
import org.eclipse.jface.action.MenuManager;

                rootManager.add(new Action(columnName) {
        List<String> proposals = new ArrayList<>(allColumnNames);
import org.eclipse.jface.fieldassist.IContentProposalProvider;
                @Override

                new GroupingAttributeValueManager(),
        @NotNull List<String> allColumnNames
        }
        }
                }
        }
 *

            return addButton;
        public SQLGroupingAttribute prepareNewValue(@Nullable SQLGroupingAttribute originalValue, @Nullable String string) {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull
            @NotNull Composite parent,
                    addTableItem(newItem);
        }
            addButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            addButton.setText(UIMessages.button_add);
        resultsContainer.setGrouping(attributes, functions);

import org.jkiss.utils.CommonUtils;
                    items.setVisible(true);
                public void run() {
        protected Control addButton(@NotNull Composite buttonsGroup) {
        columnsTable = createColumnsTable(parent, proposalProvider, resultsContainer.getGroupAttributes(), allColumnNames);
}

                @Override
            addButton.setText(UIMessages.button_add);
            this.columnNames = allColumnNames;
    private class GroupingAttributeValueManager implements StringEditorTableUtils.TableValuesManager<SQLGroupingAttribute> {
            Menu items = createAddMenu(addButton);
            @NotNull List<String> columns
            addCustomColumn(rootManager);
        );
 * distributed under the License is distributed on an "AS IS" BASIS,
            }



            return addMenu;
                    newItem.setText(functionCall);

            Menu items = createAddMenu(addButton);
            } else {

        private final List<String> defaultFunctions;
                return null;
        @NotNull
        }
        }
        }
                @Override
import org.jkiss.dbeaver.ui.UIUtils;
        private Menu createAddMenu(@NotNull Button addButton) {

            this.columns.addFirst("*");
            }
                for (String column : columns) {
    @NotNull
            if (CommonUtils.isNotEmpty(string)) {
        @NotNull StringContentProposalProvider proposalProvider,

    ) {
    ) {

        protected Control addButton(@NotNull Composite buttonsGroup) {
        ColumnsTableFactory(
    @Override

        proposalProvider.setProposals(proposals.toArray(new String[0]));

import org.jkiss.dbeaver.ui.internal.UIMessages;
        var tableFactory = new FunctionsTableFactory(parent, proposalProvider, groupFunctions, defaultFunctions, columnNames);
 *

        var tableFactory = new ColumnsTableFactory(parent, proposalProvider, groupAttributes, allColumnNames);
import org.eclipse.swt.SWT;

import org.eclipse.jface.dialogs.IDialogSettings;
                    items.setVisible(true);
 * DBeaver - Universal Database Manager
                                        newItem.setText(columnName);
public class GroupingConfigDialog extends BaseDialog {
            parent,
        proposals.addAll(defaultFunctions);
                                    }
                values,
        public DBPImage getIcon(@Nullable SQLGroupingAttribute value) {
import org.eclipse.swt.widgets.*;
            });
        } else {
import org.jkiss.dbeaver.model.sql.SQLGroupingAttribute;
            @NotNull List<String> values,
    private Table functionsTable;
                proposalProvider,
 */
        @NotNull Composite parent,
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
            };

            proposalProvider, resultsContainer.getGroupFunctions(), defaultFunctions, allColumnNames
        }
        }
            return binding.getFullyQualifiedName(DBPEvaluationContext.DML);
        }
import java.util.List;
import org.jkiss.dbeaver.ui.controls.StringEditorTableFactory;
    private String getAttributeBindingName(@NotNull DBDAttributeBinding binding) {
    private final GroupingResultsContainer resultsContainer;
                    functionMenu.add(createSubmenuAction(function, column));
        public String getString(@Nullable SQLGroupingAttribute value) {

    protected IDialogSettings getDialogBoundsSettings() {
        @NotNull List<String> columnNames
        public Boolean isEditable(@Nullable SQLGroupingAttribute value) {
                }
            return rootManager.createContextMenu(addButton);
                    TableItem newItem = new TableItem(valueTable, SWT.LEFT);
import org.eclipse.swt.layout.GridData;
                return SQLGroupingAttribute.makeCustom(resultsContainer.getDataContainer().getDataSource(), string);
        @Override
        @NotNull Composite parent,
        @NotNull
 * See the License for the specific language governing permissions and
            @NotNull Composite parent,
                }
        }
                );
import org.jkiss.dbeaver.model.data.DBDAttributeBindingMeta;
            });
