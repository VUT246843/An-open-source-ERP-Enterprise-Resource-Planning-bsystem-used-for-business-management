    public boolean isColumnSelected(T_ATTRIBUTE attribute)
        for (AttributeInfo<T_ATTRIBUTE> attrInfo : attributes) {
        final AttributeInfo<?> col = (AttributeInfo<?>) item.getData();
import org.eclipse.swt.events.SelectionAdapter;
                return Status.OK_STATUS;
        gd.widthHint = 300;
        TableColumn colPosition = UIUtils.createTableColumn(columnsTable, SWT.CENTER, "#"); //$NON-NLS-1$
            }
        return null;
            protected void saveEditorValue(Control control, int index, TableItem item) {
        updateToggleButton();
        }

        };

    }
        return Collections.emptyMap();
    protected boolean isColumnsRequired() {

            return;

        }
        }
    }
            handleColumnsChange();
import org.jkiss.dbeaver.ui.UIUtils;
        //columnItem.setText(1, String.valueOf(attribute.getOrdinalPosition()));
                validateProperties();
                    }



        }
            }
        }
    protected void createContentsAfterColumns(Composite panel)
            for (AttributeInfo<T_ATTRIBUTE> tmp : attributes) {
        GridData gd = new GridData(GridData.FILL_BOTH);
        IWorkbenchPart part = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();
import org.jkiss.dbeaver.ui.controls.TableColumnSortListener;
        }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                        }
        final Composite tableGroup = new Composite(panel, SWT.NONE);
                            handleItemSelect(item, true);
                if (Objects.equals(dbsObject, attributeInfo.attribute)) {

        ISelectionProvider selectionProvider = part.getSite().getSelectionProvider();
                    }
    }
            return properties.get(name);

        if (notify) {
            {
            final Composite tableGroup = createTableNameInput(panel);
            ObjectEditorMessages.dialog_struct_columns_select_label_table,

                    for (TableItem item : items) {

        if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
import java.util.*;
                        if (!item.getChecked()) {
    }
        for (DBSAttributeBase attribute : attributes) {
    private void updateToggleButton()
        final Composite panel = new Composite(parent, SWT.NONE);
    public void setSelectedColumns(@NotNull Collection<? extends DBSAttributeBase> attributes) {
            return "You must select at least one column";
    {
                UIUtils.syncExec(() -> {
            .sorted(Comparator.comparingInt(AttributeInfo::getPosition))
            } else {
        } else {
        UIUtils.createControlLabel(columnsGroup, ObjectEditorMessages.dialog_struct_columns_select_group_columns);
        updateToggleButton();

    }
/*
    {
                    onAttributesLoad();
            if (attrInfo.attribute == attr) {
        } else if (!item.getChecked() && col.position >= 0) {
        });
            .map(AttributeInfo::getAttribute)
        fillAttributes(object);
        text.setText(item.getText(index));
            }
                        attributes.add(col);
                Object data = tableItem.getData();

                return attrInfo.properties;
import org.eclipse.ui.IWorkbenchPart;
                break;
                    preselectAttributes();
                } finally {
 * Unless required by applicable law or agreed to in writing, software
    protected void setObject(@Nullable T_OBJECT object) {
            DBUtils.getObjectFullName(object, DBPEvaluationContext.UI), SWT.BORDER | SWT.READ_ONLY, new GridData(GridData.FILL_HORIZONTAL));
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
    {
        TableColumn colName = UIUtils.createTableColumn(columnsTable, SWT.NONE, ObjectEditorMessages.dialog_struct_columns_select_column);

 *
    private Composite createTableNameInput(Composite panel) {
    }
        }
 * DBeaver - Universal Database Manager
            }
        boolean hasCheckedColumns = false;
        loadJob.addJobChangeListener(new JobChangeAdapter() {
            public void widgetSelected(SelectionEvent e)
    }
    protected void onAttributesLoad() {
        return 2;
            tableGroup,
        }
        public int getPosition() {
        tableGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        if ((isShowHiddenAttributes() || !DBUtils.isHiddenObject(attr)) ||
*/
    public void updateColumnSelection() {
                if (hasCheckedColumns()) {
        }
 */

            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    // Check all
import org.eclipse.core.runtime.jobs.IJobChangeEvent;

            }
package org.jkiss.dbeaver.ui.editors.object.struct;
            return attribute.getName();
        }
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        AttributeInfo<T_ATTRIBUTE> col = new AttributeInfo<>(attribute);
            if (item.getData() instanceof AttributeInfo<?> info) {
        }
    protected AttributesSelectorPage(String title, T_OBJECT object) {
    @NotNull
        for (TableItem item : columnsTable.getItems()) {
        columnsTable.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.SWT;
            item.setText(1, ""); //$NON-NLS-1$
        return false;
        // Check columns, in order

import org.jkiss.code.NotNull;

        final CustomTableEditor tableEditor = new CustomTableEditor(columnsTable) {

        return true;
    @NotNull
                        if (item.getChecked()) {
            // Unchecked
import org.eclipse.jface.viewers.ISelectionProvider;
                properties.remove(name);
        fillAttributes(object);

            toggleButton.setText(ObjectEditorMessages.selector_clear_all_text);

        toggleButton = new Button(columnsGroup, SWT.PUSH);
                T_ATTRIBUTE attribute = (T_ATTRIBUTE) info.getAttribute();
            @Override
        this.object = object;

        }
    public Object getAttributeProperty(T_ATTRIBUTE attr, String propName) {

        return null;
    {
import org.eclipse.core.runtime.IStatus;
                hasCheckedColumns = true;
        updateColumnSelection(this::isColumnSelected);
            if (attrInfo.attribute == attr) {
            handleItemSelect(item, false);
    private void preselectAttributes() {
                validateProperties();
            @NotNull
            {


    }
            public void done(IJobChangeEvent event) {
                    handleItemSelect(tableItem, true);
            this.position = -1;
        gd.heightHint = 150;
        }
            }
            createContentsBeforeColumns(tableGroup);
        for (TableItem item : columnsTable.getItems()) {
        colPosition.addListener(SWT.Selection, new TableColumnSortListener(columnsTable, 1));
        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

        }
    protected void handleColumnsChange()

        });
        colType.addListener(SWT.Selection, new TableColumnSortListener(columnsTable, 2));
            item.setText(1, String.valueOf(col.position + 1));
            }
            col.position = 0;
            .toList();
            protected Control createEditor(Table table, final int index, final TableItem item) {
            }
    }
                break;
    }
            if (value == null) {

import org.jkiss.dbeaver.DBException;
        createAttributeColumns(columnsTable);
import org.eclipse.swt.widgets.*;
        return hasCheckedColumns;
 */

    public boolean isPageComplete() {
                            item.setChecked(true);

    }

                    item.setChecked(true);
import java.util.function.Predicate;

import org.eclipse.swt.events.SelectionEvent;
                });
                if (tmp != col && tmp.position >= col.position) {
            public void widgetSelected(SelectionEvent e)

        colName.addListener(SWT.Selection, new TableColumnSortListener(columnsTable, 0));
                return true;
        TableColumn colType = UIUtils.createTableColumn(columnsTable, SWT.RIGHT, ObjectEditorMessages.dialog_struct_columns_type); //$NON-NLS-1$

            @Override
                    for (T_ATTRIBUTE attr : getAttributes(monitor, object)) {
            item.setChecked(false);
            setColumnSelected(attribute, true);
        return (IStructuredSelection) selection;
            }
        super(NLS.bind(ObjectEditorMessages.dialog_struct_columns_select_title, title, DBUtils.getObjectFullName(object, DBPEvaluationContext.UI)));
            if (tmp.position >= 0) {
        gd.widthHint = 120;

        columnItem.setText(0, attribute.getName());
        text.selectAll();
        toggleButton.setText(ObjectEditorMessages.selector_select_all_text);
 * @author Serge Rider
        tableGroup.setLayout(new GridLayout(2, false));
        if (part == null) { //fixme it's a copy from navigator utils
    public Map<String, Object> getAttributeProperties(T_ATTRIBUTE attr) {
        public String toString() {
                return attrInfo.properties.get(propName);
 * You may obtain a copy of the License at
        for (TableItem item : columnsTable.getItems()) {
                    tmp.position--;

                        fillAttributeColumns(attribute, col, columnItem);
            }
        {
        toggleButton.addSelectionListener(new SelectionAdapter() {
        public T getAttribute() {
    public List<T_ATTRIBUTE> getSelectedAttributes() {
        }
        return text;
        createColumnsGroup(panel);
        public AttributeInfo(T attribute) {
        final Text text = new Text(table, SWT.BORDER);
                }
                    for (TableItem item : items) {

 * limitations under the License.
    protected boolean isShowHiddenAttributes() {
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
        if (selection == null) {
                try {
            return null;
    }
    protected int fillAttributeColumns(T_ATTRIBUTE attribute, AttributeInfo<T_ATTRIBUTE> attributeInfo, TableItem columnItem) {
        columnsGroup = UIUtils.createComposite(panel, 1);
            TableItem[] tableColumns = columnsTable.getItems();
                    }
        }
        for (Object selItem: selection) {
            toggleButton.setText(ObjectEditorMessages.selector_select_all_text);
/*
    }
            updatePageState();
 * Licensed under the Apache License, Version 2.0 (the "License");

    protected void createContentsBeforeColumns(Composite panel)
import org.jkiss.dbeaver.model.navigator.DBNNode;
    }
                @SuppressWarnings("unchecked")
        panel.setLayout(new GridLayout(1, false));
        @Override
            DBSObject dbsObject = ((DBNDatabaseNode) selNode).getObject();
                handleItemSelect((TableItem) e.item, true);
                item.setChecked(selected);
        public Object getProperty(String name) {
    protected Control createCellEditor(Table table, int index, TableItem item, AttributeInfo<T_ATTRIBUTE> data) {
    private void fillAttributes(@Nullable T_OBJECT object) {
        for (AttributeInfo<T_ATTRIBUTE> tmp : attributes) {
        UIUtils.createLabelText(
        };
                }
    {

    protected void saveCellValue(Control control, int index, TableItem item, AttributeInfo<T_ATTRIBUTE> data) {
    protected Composite columnsGroup;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
            for (AttributeInfo<T_ATTRIBUTE> tmp : attributes) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override

    private boolean hasCheckedColumns()
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
        for (AttributeInfo<T_ATTRIBUTE> attrInfo : attributes) {
                        }
        if (isColumnsRequired() && !hasCheckedColumns()) {
                }
 * you may not use this file except in compliance with the License.
        createContentsAfterColumns(panel);
        Map<String, Object> properties = new HashMap<>();
            if (!(selNode instanceof DBNDatabaseNode)) {
        toggleButton.setLayoutData(gd);

    }
                        }
    }
    }
                            (attr instanceof DBSEntityAttribute ea && DBUtils.isRowIdAttribute(ea))
    public void setColumnSelected(@NotNull DBSAttributeBase attribute, boolean selected) {

                    }
    private static IStructuredSelection getCurrentSelection() {
            return;
                        if (ai.getData() == tmp) {
        }


                            columnItem.setImage(0, DBeaverIcons.getImage(attributeNode.getNodeIcon()));
        }
                            ai.setText(1, String.valueOf(tmp.position + 1));
                item.setChecked(false);
import org.jkiss.dbeaver.model.DBUtils;
        columnItem.setText(2, attribute.getFullTypeName());

        }
            for (TableItem tableItem: tableColumns) {
                    continue;
        super(null);
import java.util.List;
        if (hasCheckedColumns()) {
        T attribute;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    protected AttributesSelectorPage() {
        IStructuredSelection selection = getCurrentSelection();
                        }
    }
            }
            }
                }
        //columnsViewer = new TableViewer(columnsGroup, SWT.BORDER | SWT.SINGLE | SWT.CHECK);
import org.jkiss.dbeaver.utils.GeneralUtils;

import org.eclipse.swt.layout.GridData;
        }
                saveCellValue(control, index, item, (AttributeInfo)item.getData());
    }
            }
/**
                        columnItem.setData(col);
        if (item.getChecked() && col.position < 0) {

import org.eclipse.swt.layout.GridLayout;
        this.columnsTable.removeAll();
                if (tmp != col && tmp.position >= col.position) {
        for (TableItem item : columnsTable.getItems()) {


    }
        //item.setText(index, control.getText());
                handleItemSelect(item, false);
                }

    }
import org.eclipse.jface.viewers.IStructuredSelection;
                    col.position = tmp.position + 1;
        }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            @Override
    @Override
                handleItemSelect(item, false);
    protected Composite createPageContents(Composite parent) {
        return attributes.stream()
            }
    }
                            DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(monitor, attr, true);
    }
    }
    protected List<AttributeInfo<T_ATTRIBUTE>> attributes = new ArrayList<>();
    }
                TableItem[] items = columnsTable.getItems();
    protected Table columnsTable;
        this.object = null;
    protected abstract List<? extends T_ATTRIBUTE> getAttributes(@NotNull DBRProgressMonitor monitor, @NotNull T_OBJECT object) throws DBException;

    }
                    }
                monitor.beginTask("Load attributes", 1);

 *     http://www.apache.org/licenses/LICENSE-2.0
            updateToggleButton();
                } else {
        return super.getEditError();
import org.eclipse.jface.viewers.ISelection;

 *
    }
            @Override
                    return GeneralUtils.makeErrorStatus("Error loading attributes", e);
        loadJob.schedule();
public abstract class AttributesSelectorPage<T_OBJECT extends DBSObject, T_ATTRIBUTE extends DBSAttributeBase & DBSObject> extends BaseObjectEditPage {
    @Override
                    break;
            DBNNode selNode = RuntimeUtils.getObjectAdapter(selItem, DBNNode.class);
        }
                            break;

                }
        });
            if (item.getChecked()) {
                        if (attributeNode != null) {
        public void setProperty(String name, Object value) {
        int position;
                    for (TableItem ai : allItems) {
                            item.setChecked(false);
}
            return attribute;
    {
    }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                } catch (DBException e) {
            if (item.getData() instanceof AttributeInfo<?> info && attribute.equals(info.attribute)) {
 * AttributesSelectorPage
 * See the License for the specific language governing permissions and

                            // Preload node - required later to display its icon
import org.eclipse.osgi.util.NLS;
                properties.put(name, value);
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.attributes.clear();
        final List<T_ATTRIBUTE> attrList = new ArrayList<>();
    @Nullable
            @Override

    protected Button toggleButton;
                    updateColumnSelection();
            }
                        ) {
        AbstractJob loadJob = new AbstractJob("Load entity attributes") {
                        DBNDatabaseNode attributeNode = DBWorkbench.getPlatform().getNavigatorModel().findNode(attribute);
            this.attribute = attribute;
 *
    }
        ISelection selection = selectionProvider.getSelection();
    }
            if (item.getChecked()) {
            }
            return null;
                    monitor.done();
        columnsTable = new Table(columnsGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION | SWT.CHECK);
        }
                    // Clear all checked
            }
    private void updateColumnSelection(@NotNull Predicate<T_ATTRIBUTE> predicate) {
 *
        if (object == null) {
        this.object = object;
        if (selectionProvider == null) {
                if (predicate.test(attribute)) {
            col.position = -1;

            // Checked
                        TableItem columnItem = new TableItem(columnsTable, SWT.NONE);
                    tableItem.setChecked(true);
    @Override
    protected static class AttributeInfo<T extends DBSAttributeBase> {
        columnsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
            }
import org.jkiss.code.Nullable;
                return createCellEditor(table, index, item, (AttributeInfo)item.getData());
                continue;


        columnsTable.setLayoutData(gd);

            return position;
        return false;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected void createColumnsGroup(Composite panel) {
    protected T_OBJECT object;
            TableItem[] allItems = columnsTable.getItems();
        // Reset checked columns
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
                            handleItemSelect(item, true);
                    for (T_ATTRIBUTE attribute : attrList) {

                        }
    protected String getEditError() {
            return null;
        }
        }
                    UIUtils.packColumns(columnsTable);
    void handleItemSelect(TableItem item, boolean notify) {
            .filter(o -> o.position >= 0)
        return panel;
        return tableGroup;
                            attrList.add(attr);
    protected void createAttributeColumns(Table columnsTable) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (!(data instanceof AttributeInfo<?> attributeInfo)) {
                }
        columnsTable.setHeaderVisible(true);
