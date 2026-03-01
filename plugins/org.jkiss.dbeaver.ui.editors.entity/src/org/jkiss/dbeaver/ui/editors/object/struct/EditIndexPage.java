import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.UIUtils;
    private int descColumnIndex;
        super(title, index.getTable());
        });

        this.indexTypes = new ArrayList<>(indexTypes);
        final Combo typeCombo = new Combo(panel, SWT.DROP_DOWN | SWT.READ_ONLY);
        super(title, index.getTable());

    private List<DBSIndexType> indexTypes;
            attributeInfo.setProperty(PROP_DESC, isDesc);
                @Override
import org.eclipse.swt.widgets.*;

import java.util.List;
            ObjectEditorMessages.dialog_struct_create_column_order);
            DBSTableIndex index,
import org.eclipse.swt.custom.CCombo;
    }
 * See the License for the specific language governing permissions and
            final Button uniqueButton = UIUtils.createLabelCheckbox(panel, ObjectEditorMessages.dialog_struct_unique, false);

            }
        if (index == descColumnIndex) {

    protected List<? extends DBSEntityAttribute> getAttributes(
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
        if (supportUniqueIndexes) {
        return indexName;
    }
                selectedIndexType = indexType;

        Assert.isTrue(!CommonUtils.isEmpty(this.indexTypes));
    protected void saveCellValue(Control control, int index, TableItem item, AttributeInfo<DBSEntityAttribute> attributeInfo) {
 *
    public static final String PROP_DESC = "desc";

import org.jkiss.code.NotNull;
    }
import org.eclipse.swt.layout.GridData;
            {
    protected void createAttributeColumns(Table columnsTable) {
        final Text nameText = entity != null ? UIUtils.createLabelText(panel, ObjectEditorMessages.dialog_struct_edit_constrain_label_name, indexName) : null;
        if (index == descColumnIndex) {
    protected Control createCellEditor(Table table, int index, TableItem item, AttributeInfo<DBSEntityAttribute> attributeInfo) {
 *
        return descColumnIndex;
            CCombo combo = new CCombo(table, SWT.DROP_DOWN | SWT.READ_ONLY);
*/
        } else {
    @Override
            }
            public void widgetSelected(SelectionEvent e)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
        @NotNull DBRProgressMonitor monitor,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
import java.util.Collection;
}
            item.setText(index, isDesc ? "DESC" : "ASC");

 * @author Serge Rider
        }
    public boolean isUnique() {

 *     http://www.apache.org/licenses/LICENSE-2.0



        }
        Collection<DBSIndexType> indexTypes)
                public void widgetSelected(SelectionEvent e) {
        }

    }
        @NotNull DBSEntity object
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
        String title,
    public DBSIndexType getIndexType()
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                selectedIndexType = indexTypes.get(typeCombo.getSelectionIndex());
 * DBeaver - Universal Database Manager

    private DBSIndexType selectedIndexType;
        if (nameText != null) {
    private final DBSTableIndex index;
    protected void createContentsBeforeColumns(Composite panel)
    protected int fillAttributeColumns(DBSEntityAttribute attribute, AttributeInfo<DBSEntityAttribute> attributeInfo, TableItem columnItem) {
    private String indexName;
import org.eclipse.swt.events.SelectionEvent;

        descColumnIndex = super.fillAttributeColumns(attribute, attributeInfo, columnItem) + 1;
    private boolean unique;
                    unique = uniqueButton.getSelection();
        return index;
 * Licensed under the Apache License, Version 2.0 (the "License");
        typeCombo.setEnabled(indexTypes.size() > 1);
import org.jkiss.utils.CommonUtils;
    }
            CCombo combo = (CCombo) control;
 * You may obtain a copy of the License at
            boolean isDesc = Boolean.TRUE.equals(attributeInfo.getProperty(PROP_DESC));
    private boolean supportUniqueIndexes = true;
import java.util.ArrayList;
                }
    }
 *
    }
            super.saveCellValue(control, index, item, attributeInfo);
        this.supportUniqueIndexes = supportUniqueIndexes;
    {
        typeCombo.select(0);

 * EditIndexPage
        UIUtils.createControlLabel(panel, ObjectEditorMessages.dialog_struct_edit_index_label_type);
    {
    public String getIndexName() {
            typeCombo.add(indexType.getName());
        return unique;
            combo.select(isDesc ? 1 : 0);
    }
        columnItem.setText(descColumnIndex, isDesc ? "DESC" : "ASC");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return selectedIndexType;
            return combo;
    ) throws DBException {
 * limitations under the License.
    @Override

        TableColumn colDesc = UIUtils.createTableColumn(columnsTable, SWT.NONE,
        }
            });
        this.indexTypes = new ArrayList<>(indexTypes);
    }
        Assert.isTrue(!CommonUtils.isEmpty(this.indexTypes));

 *
            nameText.addModifyListener(e -> indexName = nameText.getText().trim());
        }
    }

public class EditIndexPage extends AttributesSelectorPage<DBSEntity, DBSEntityAttribute> {
    @Override
        super.createAttributeColumns(columnsTable);
/*
/*
        this.index = index;
 * you may not use this file except in compliance with the License.
            Collection<DBSIndexType> indexTypes, boolean supportUniqueIndexes)

        return super.createCellEditor(table, index, item, attributeInfo);
            String title,
import org.eclipse.core.runtime.Assert;
            uniqueButton.addSelectionListener(new SelectionAdapter() {
        for (DBSIndexType indexType : indexTypes) {
            combo.add("DESC");
        return CommonUtils.safeList(object.getAttributes(monitor));
    }
    }
            boolean isDesc = combo.getSelectionIndex() == 1;
/**
    public EditIndexPage(
import org.jkiss.dbeaver.DBException;
import org.eclipse.swt.SWT;
    {
        typeCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    @Override
            combo.add("ASC");
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        typeCombo.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.struct.DBSEntity;
            @Override
            if (selectedIndexType == null) {

    public EditIndexPage(

        // Usually index name is auto-generated from column names
package org.jkiss.dbeaver.ui.editors.object.struct;

    @Override
 */
        colDesc.setToolTipText(ObjectEditorMessages.dialog_struct_create_column_order_tooltip);
        boolean isDesc = Boolean.TRUE.equals(attributeInfo.getProperty(PROP_DESC));
    public DBSObject getObject() {


        this.index = index;
        this.indexName = this.index.getName();
        DBSTableIndex index,
