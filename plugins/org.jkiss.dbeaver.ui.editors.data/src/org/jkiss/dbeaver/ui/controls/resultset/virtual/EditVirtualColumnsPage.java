
    public EditVirtualColumnsPage(ResultSetViewer viewer, DBVEntity vEntity) {
    }
 */
        {


import org.eclipse.swt.widgets.Composite;
        }
import org.jkiss.dbeaver.model.DBIcon;
        }
                public void mouseDoubleClick(MouseEvent e) {
                    vEntity.removeVirtualAttribute(virtualAttr);
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
        DBVEntityAttribute vAttr = (DBVEntityAttribute) tableItem.getData();
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.virtual.DBVEntity;
        TableItem item = new TableItem(attrTable, SWT.NONE);
    }
                public void widgetSelected(SelectionEvent e) {
            btnRemove.setEnabled(false);
        attrTable = new Table(panel, SWT.FULL_SELECTION | SWT.BORDER);
    @Override
                    if (!UIUtils.confirmAction(parent.getShell(),
    private boolean structChanged;
import org.eclipse.swt.events.SelectionEvent;

import org.jkiss.dbeaver.model.struct.DBSObject;
                    editSelectedAttribute(attrTable);
        }
import org.eclipse.swt.layout.GridData;
        TableItem tableItem = selection[0];
            return;
        UIUtils.executeOnResize(attrTable, () -> UIUtils.packColumns(attrTable, true));
        refreshAttributes();
                    }
            });
import org.jkiss.dbeaver.ui.IHelpContextIdProvider;
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
                }
            tableItem.setText(1, vAttr.getTypeName());
                @Override
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.events.SelectionAdapter;
                    EditVirtualAttributePage editAttrPage = new EditVirtualAttributePage(viewer, vAttr);
        if (editAttrPage.edit(attrTable.getShell())) {
import org.jkiss.dbeaver.model.DBValueFormatting;
    }
        item.setText(1, attribute.getTypeName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            attrTable.addSelectionListener(new SelectionAdapter() {
                }
        ConComposite panel = new ConComposite(parent);
                        vAttr.setCustom(true);
/**
        for (DBVEntityAttribute attr : vEntity.getCustomAttributes()) {

            item.setText(2, attribute.getExpression());

                public void widgetSelected(SelectionEvent e) {
            attrTable.addMouseListener(new MouseAdapter() {

                    btnRemove.setEnabled(attrSelected);
import org.eclipse.osgi.util.NLS;
            btnEdit.setEnabled(false);
            createAttributeItem(attrTable, attr);

 */
    }
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
    private Table attrTable;

        UIUtils.createTableColumn(attrTable, SWT.LEFT, ResultSetMessages.virtual_edit_columns_page_table_column_expression);

 * distributed under the License is distributed on an "AS IS" BASIS,
                    DBVEntityAttribute virtualAttr = (DBVEntityAttribute) attrTable.getSelection()[0].getData();
        EditVirtualAttributePage editAttrPage = new EditVirtualAttributePage(viewer, vAttr);
                }
 *
    public DBSObject getObject() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected Composite createPageContents(Composite parent) {
                        createAttributeItem(attrTable, vAttr);
                    if (editAttrPage.edit(parent.getShell())) {
        return panel;
        this.vEntity = vEntity;
import org.jkiss.dbeaver.ui.css.CSSUtils;
                }
/*
            });
 *
                    structChanged = true;
import org.eclipse.swt.widgets.TableItem;
public class EditVirtualColumnsPage extends BaseObjectEditPage implements IHelpContextIdProvider {
    private ResultSetViewer viewer;
        return "Virtual-column-expressions";
        item.setData(attribute);
            Composite buttonsPanel = UIUtils.createComposite(panel, 3);
 * You may obtain a copy of the License at

        TableItem[] selection = attrTable.getSelection();
 * you may not use this file except in compliance with the License.
                        vEntity.addVirtualAttribute(vAttr);
            });
import org.eclipse.swt.events.MouseAdapter;
        UIUtils.createTableColumn(attrTable, SWT.LEFT, ResultSetMessages.virtual_edit_columns_page_table_column_data_type);
 *
    private void editSelectedAttribute(Table attrTable) {
        this.viewer = viewer;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.ConComposite;
 * Unless required by applicable law or agreed to in writing, software
                @Override
        super(ResultSetMessages.virtual_edit_columns_page_add, DBIcon.TREE_COLUMN);
 * Licensed under the Apache License, Version 2.0 (the "License");
        item.setImage(0, DBeaverIcons.getImage(DBValueFormatting.getObjectImage(attribute)));
            buttonsPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                @Override
        if (selection.length <= 0) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        return vEntity;
            tableItem.setText(2, CommonUtils.notEmpty(vAttr.getExpression()));
import org.eclipse.swt.widgets.Table;
                    }
        attrTable.removeAll();
                public void widgetSelected(SelectionEvent e) {
        attrTable.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    }
import org.jkiss.dbeaver.ui.UIUtils;
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
    }


    @Override
}
        UIUtils.createTableColumn(attrTable, SWT.LEFT, ResultSetMessages.virtual_edit_columns_page_table_column_name);
import org.eclipse.swt.widgets.Button;
                @Override

        panel.setLayout(new GridLayout(1, false));
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    public String getHelpContextId() {
        }

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
            });
                    	ResultSetMessages.virtual_edit_columns_page_confirm_action_delete,
                    attrTable.remove(attrTable.getSelectionIndices());
                        NLS.bind(ResultSetMessages.virtual_edit_columns_page_confirm_action_question_delete_column, virtualAttr.getName()))) {
                    btnEdit.setEnabled(attrSelected);
                }
                        return;
                @Override
            Button btnRemove = UIUtils.createDialogButton(buttonsPanel, ResultSetMessages.virtual_edit_columns_page_dialog_button_remove, new SelectionAdapter() {
        return structChanged;
    public void refreshAttributes() {

    private void createAttributeItem(Table attrTable, DBVEntityAttribute attribute) {

                        structChanged = true;
 * See the License for the specific language governing permissions and
 * limitations under the License.
        attrTable.setHeaderVisible(true);

                    boolean attrSelected = attrTable.getSelectionIndex() >= 0;
            Button btnAdd = UIUtils.createDialogButton(buttonsPanel, ResultSetMessages.virtual_edit_columns_page_dialog_button_add, new SelectionAdapter() {
            tableItem.setText(0, vAttr.getName());
 * Custom virtual attributes edit dialog
                    DBVEntityAttribute vAttr = new DBVEntityAttribute(vEntity, null, "vcolumn");
 * DBeaver - Universal Database Manager
import org.eclipse.swt.events.MouseEvent;
            Button btnEdit = UIUtils.createDialogButton(buttonsPanel, ResultSetMessages.virtual_edit_columns_page_dialog_button_edit, new SelectionAdapter() {
    private DBVEntity vEntity;
            CSSUtils.markConnectionTypeColor(buttonsPanel);
        if (attribute.getExpression() != null) {
import org.eclipse.swt.layout.GridLayout;
                    editSelectedAttribute(attrTable);
        item.setText(0, attribute.getName());
    @Override
            });


    }
        }
    public boolean isStructChanged() {
