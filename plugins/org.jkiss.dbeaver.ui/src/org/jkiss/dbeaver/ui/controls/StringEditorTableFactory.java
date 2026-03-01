                    DBPImage icon = valuesManager.getIcon(value);
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
        tableEditor = createTableEditor();
                    editor.setText(item.getText());

                removeButton.setEnabled(false);
                tableItem.setImage(icon == null ? null : DBeaverIcons.getImage(icon));
            @Override
                        saveEditorValue(editor, index, item);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
        });
        final Button upButton = new Button(buttonsGroup, SWT.PUSH);
            @Override
            if (selectionIndex < 0) {
        }
                    });
        clearButton.setText(UIMessages.button_clear);
        upButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        removeButton.addSelectionListener(new SelectionAdapter() {
        @Nullable IContentProposalProvider proposalProvider,

        gd.widthHint = 300;
    protected void setLayout() {
                TableItem newItem = new TableItem(valueTable, SWT.LEFT);
                    editor.addModifyListener(e -> {
        public DBPImage getIcon(@Nullable String value) {
            }
 * See the License for the specific language governing permissions and
        }
        @NotNull
        @Override
                DBPImage icon = valuesManager.getIcon(value);
    @NotNull

        });
        setLayout();
        if (!CommonUtils.isEmpty(values)) {
                }
        tableEditor.closeEditor();
        this.withReordering = withReordering;
        downButton.addSelectionListener(new SelectionAdapter() {
    }
    }
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;

                }
public class StringEditorTableFactory<T> {
    }
            return true;
            }
        buttonsRefresher.run();
 *
            @Override
    protected Control upButton(@NotNull Composite buttonsGroup) {
                    if (proposalProvider != null) {
import org.jkiss.dbeaver.model.DBPImage;
                    buttonsRefresher.run();
                        setProposalAdapter(ContentAssistUtils.installContentProposal(
        Composite rightArea = UIUtils.createPlaceholder(valueTable.getParent(), 1, 5);
        boolean withReordering
                    T value = getCustomValue(valueTable.getItem(selectionIndex));
            }
 *
        });

        downButton.setVisible(withReordering);
                downButton.setEnabled(selectionIndex < valueTable.getItemCount() - 1);
    protected final Table valueTable;
        };
        return () -> {
                    tableEditor.closeEditor();
        @Override
            protected void saveEditorValue(Control control, int index, TableItem item) {

                removeButton.setEnabled(true);
                return editor;
    protected Composite createRightArea() {

                buttonsRefresher.run();
    }
            }
    protected final boolean withReordering;
                tableEditor.closeEditor();
                    DBPImage icon = valuesManager.getIcon(value);
                    setCustomValue(tableItem, value);
        addButton.addSelectionListener(new SelectionAdapter() {
        Button addButton = new Button(buttonsGroup, SWT.PUSH);
                Text editor;
        final Button downButton = new Button(buttonsGroup, SWT.PUSH);
                    valueTable.remove(selectionIndex);
        @Nullable List<T> values,

                    TableItem tableItem = new TableItem(valueTable, SWT.LEFT, selectionIndex - 1);
import org.jkiss.dbeaver.ui.UIIcon;
    protected Control upButton;
                    editor = new Text(table, SWT.BORDER);
        this.valuesManager = valuesManager;
        tableEditor.showEditor(newItem);
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                    valueTable.setSelection(selectionIndex - 1);
                buttonsRefresher.run();
                tableItem.setData(CUSTOM_EDITABLE_LIST_VALUE_KEY, value);

import org.eclipse.jface.fieldassist.IContentProposalProvider;
                T value = valuesManager.prepareNewValue(getCustomValue(item), text);
            public void widgetSelected(SelectionEvent e) {
                addTableItem(newItem);
                downButton.setEnabled(false);
                valueTable.removeAll();
            } else {
            protected Control createEditor(Table table, int index, TableItem item) {

    }
            int selectionIndex = valueTable.getSelectionIndex();
    @NotNull

        }
        removeButton.setEnabled(false);
                upButton.setEnabled(false);
        this.buttonsRefresher = buttonsRefresher();
            }
    }
    @NotNull
        @NotNull
                    buttonsRefresher.run();
                    setCustomValue(tableItem, value);
    protected Control clearButton(@NotNull Composite buttonsGroup) {
            {
        });
        valueTable.setLinesVisible(true);
            @Override
        clearButton.addSelectionListener(new SelectionAdapter() {

    }
    @Nullable

    private <T> T getCustomValue(TableItem tableItem) {
            for (T value : values) {
        newItem.setImage(icon == null ? null : DBeaverIcons.getImage(icon));
        @NotNull StringEditorTableUtils.TableValuesManager<T> valuesManager,
                    TableItem tableItem = new TableItem(valueTable, SWT.LEFT, selectionIndex + 1);
        Composite buttonsGroup = UIUtils.createPlaceholder(rightArea, 1, 5);
    }
import org.jkiss.utils.CommonUtils;
    @NotNull
                }
                } else {
                valueColumn.setWidth(valueTable.getClientArea().width);
        public String prepareNewValue(@Nullable String originalValue, @Nullable String string) {
        addButton.setText(UIMessages.button_add);
        DBPImage icon = valuesManager.getIcon(null);
import org.eclipse.swt.widgets.*;

                String text = ((Text) control).getText().trim();
import org.eclipse.swt.events.ControlEvent;
        createRightArea();
                            new SmartTextContentAdapter(),
        this.valueTable = new Table(parent, SWT.SINGLE | SWT.FULL_SELECTION | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        };
        upButton.setVisible(withReordering);
        public Boolean isEditable(@Nullable String value) {

                    setCustomValue(item, value);
import org.eclipse.swt.SWT;
        });
        final GridData gd = new GridData(GridData.FILL_BOTH);

        });
            }

    protected Control downButton;
                int selectionIndex = valueTable.getSelectionIndex();
        return rightArea;
                firstTraverseIndex = 0;

                    tableItem.setImage(icon == null ? null : DBeaverIcons.getImage(icon));
    }
    protected final StringEditorTableUtils.TableValuesManager<T> valuesManager;

    protected final IContentProposalProvider proposalProvider;
                }

import org.eclipse.swt.events.SelectionEvent;
    protected CustomTableEditor createTableEditor() {
import org.jkiss.dbeaver.ui.UIUtils;
    protected Control removeButton(@NotNull Composite buttonsGroup) {
    @NotNull
    @NotNull
        @Nullable
        valueTable.addControlListener(new ControlAdapter() {
        removeButton = removeButton(buttonsGroup);

    protected Control removeButton;
        });
        downButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Button removeButton = new Button(buttonsGroup, SWT.PUSH);
            return value == null ? "" : value;
        clearButton = clearButton(buttonsGroup);
        @Override
                if (valuesManager.isEditable(getCustomValue(item))) {

        return valueColumn;
        final Button clearButton = new Button(buttonsGroup, SWT.PUSH);
import java.util.List;
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    item.setImage(icon == null ? null : DBeaverIcons.getImage(icon));
                if (selectionIndex >= 1 && selectionIndex < valueTable.getItemCount()) {
        addButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        upButton = upButton(bottomButtonsGroup);
        createValueColumn();

            @Nullable
    }
        return removeButton;
    protected Control downButton(@NotNull Composite buttonsGroup) {
            @Override
                if (value != null) {
    protected final List<T> values;
 * limitations under the License.
                    editor = null;
    protected Control addButton(@NotNull Composite buttonsGroup) {
    public StringEditorTableFactory(
                tableItem.setText(valuesManager.getString(value));
        return new CustomTableEditor(valueTable) {
 * DBeaver - Universal Database Manager
                int selectionIndex = valueTable.getSelectionIndex();
            }

        }

        return addButton;
    @Nullable
}
    @NotNull
    public record StringValuesManager(@Nullable DBPImage icon) implements StringEditorTableUtils.TableValuesManager<String> {
        return downButton;
        rightArea.setLayoutData(new GridData(GridData.FILL_VERTICAL));
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.code.Nullable;
        this.proposalProvider = proposalProvider;
        addButton = addButton(buttonsGroup);
                        ));
    @NotNull
                    valueTable.remove(selectionIndex);

                upButton.setEnabled(selectionIndex > 0);
            public void controlResized(ControlEvent e) {
                lastTraverseIndex = 0;
        @NotNull Composite parent,
            }
                            editor,
    }

            }
    @NotNull
        buttonsGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        removeButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        downButton.setImage(DBeaverIcons.getImage(UIIcon.ARROW_DOWN));


    }
            public void widgetSelected(SelectionEvent e) {
        valueTable.setLayoutData(gd);
                    tableItem.setImage(icon == null ? null : DBeaverIcons.getImage(icon));

        @Nullable
    private <T> void setCustomValue(TableItem tableItem, T value) {
        return clearButton;
                    item.setText(valuesManager.getString(value));
                        // Save value immediately. This solves MacOS problems with focus events.

                }
        Composite bottomButtonsGroup = UIUtils.createPlaceholder(rightArea, 1, 5);
        bottomButtonsGroup.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));
            public void widgetSelected(SelectionEvent e) {
    protected Control addButton;
    }
                    tableItem.setText(valuesManager.getString(value));
import org.eclipse.swt.events.ControlAdapter;
        valueTable.setSelection(newItem);
        }
        clearButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    buttonsRefresher.run();

    }
        removeButton.setText(UIMessages.button_remove);
import org.eclipse.swt.layout.GridData;
                            proposalProvider
            public void widgetSelected(SelectionEvent e) {
                    }
                    valueTable.remove(selectionIndex);
        tableItem.setData(CUSTOM_EDITABLE_LIST_VALUE_KEY, value);
    public static final String CUSTOM_EDITABLE_LIST_VALUE_KEY = "CUSTOM_EDITABLE_LIST_VALUE";
        return (T) tableItem.getData(CUSTOM_EDITABLE_LIST_VALUE_KEY);
            @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
            return string;

    }
        upButton.setImage(DBeaverIcons.getImage(UIIcon.ARROW_UP));
 */
            return icon;
                    T value = getCustomValue(valueTable.getItem(selectionIndex));
            @Override
            @Override
        upButton.addSelectionListener(new SelectionAdapter() {


        gd.heightHint = 100;
        @Override
            public void widgetSelected(SelectionEvent e) {
        public String getString(@Nullable String value) {
        return valueTable;
package org.jkiss.dbeaver.ui.controls;
                int selectionIndex = valueTable.getSelectionIndex();
    protected final Runnable buttonsRefresher;
    protected Runnable buttonsRefresher() {
 *
    }
                if (selectionIndex >= 0) {
    public Table createTable() {
    }
        valueTable.removeAll();
import org.jkiss.dbeaver.ui.DBeaverIcons;

    protected void addTableItem(@NotNull TableItem newItem) {
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
        this.values = values;

            }
        downButton = downButton(bottomButtonsGroup);
    protected Control clearButton;
                    DBPImage icon = valuesManager.getIcon(value);
        valueTable.addSelectionListener(new SelectionAdapter() {
 * you may not use this file except in compliance with the License.
    protected void fillItems() {
        fillItems();
                    tableItem.setText(valuesManager.getString(value));
import org.eclipse.swt.events.SelectionAdapter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    protected TableColumn createValueColumn() {
                    valueTable.setSelection(selectionIndex + 1);
                if (selectionIndex >= 0 && selectionIndex < valueTable.getItemCount() - 1) {
        return upButton;
        TableColumn valueColumn = UIUtils.createTableColumn(valueTable, SWT.LEFT, UIMessages.properties_value);
            }
            @Override
    protected CustomTableEditor tableEditor;
                TableItem tableItem = new TableItem(valueTable, SWT.LEFT);
    ) {
