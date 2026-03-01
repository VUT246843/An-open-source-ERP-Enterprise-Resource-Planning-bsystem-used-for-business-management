        }
 * limitations under the License.
                index.addColumn(
        }
            if (index == lengthColumnIndex && attributeInfo.getAttribute().getDataKind() == DBPDataKind.STRING) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableIndex;
                        false,
import org.jkiss.code.Nullable;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                Integer length = (Integer) editPage.getAttributeProperty(tableColumn, MySQLEditIndexPage.PROP_LENGTH);
                Spinner spinner = (Spinner) control;

        protected int fillAttributeColumns(DBSEntityAttribute attribute, AttributeInfo attributeInfo, TableItem columnItem) {
public class MySQLIndexConfigurator implements DBEObjectConfigurator<MySQLTableIndex> {
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
            if (index == lengthColumnIndex) {

        }
 *
 * See the License for the specific language governing permissions and
 */

 *

            }
                        !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC)),
            return super.createCellEditor(table, index, item, attributeInfo);

                } else {
                spinner.setMinimum(0);
import org.jkiss.dbeaver.ext.mysql.MySQLMessages;
            }
            columnItem.setText(lengthColumnIndex, length == null ? "" : length.toString());
        MySQLEditIndexPage(MySQLTableIndex index) {
            } else {
                return null;
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {

            return index;
 * MySQL index configurator
                int length = spinner.getSelection();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.*;
                }
        });
        private int lengthColumnIndex;
import org.jkiss.dbeaver.ui.UIUtils;
                spinner.setMaximum((int) attributeInfo.getAttribute().getMaxLength());
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
            index.setName(DBObjectNameCaseTransformer.transformObjectName(index, idxName.toString()));
                if (length <= 0) {
import java.util.Map;
                    new MySQLTableIndexColumn(
import org.jkiss.code.NotNull;
            }
        }
            index.setUnique(editPage.isUnique());
                return spinner;
import org.eclipse.swt.SWT;
 *
                }
            MySQLEditIndexPage editPage = new MySQLEditIndexPage(index);
                        colIndex++,
        @Override

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableColumn;
        protected Control createCellEditor(Table table, int index, TableItem item, AttributeInfo attributeInfo) {
        }

    @Override
    public MySQLTableIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull MySQLTableIndex index, @NotNull Map<String, Object> options) {
            StringBuilder idxName = new StringBuilder(64);

    private static class MySQLEditIndexPage extends EditIndexPage {
        protected void createAttributeColumns(Table columnsTable) {
                super.saveCellValue(control, index, item, attributeInfo);
                if (length != null) {
                        (MySQLTableColumn) tableColumn,
            index.setIndexType(editPage.getIndexType());
            lengthColumnIndex = super.fillAttributeColumns(attribute, attributeInfo, columnItem) + 1;
            index.setName(idxName.toString());
            int colIndex = 1;

            idxName.append("_IDX"); //$NON-NLS-1$
    }
                    idxName.append("_").append(CommonUtils.escapeIdentifier(tableColumn.getName())); //$NON-NLS-1$
 * Unless required by applicable law or agreed to in writing, software
                    spinner.setSelection(length);
                Integer length = (Integer) attributeInfo.getProperty(PROP_LENGTH);
            colDesc.setToolTipText(MySQLMessages.table_column_length_tooltip);
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * You may obtain a copy of the License at

                    attributeInfo.setProperty(PROP_LENGTH, length);
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
            if (!editPage.edit()) {
        @Override
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
        protected void saveCellValue(Control control, int index, TableItem item, AttributeInfo attributeInfo) {


import org.jkiss.dbeaver.ui.UITask;
                }
        public static final String PROP_LENGTH = "length";
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.mysql.ui.config;
            return lengthColumnIndex;
/*
            idxName.append(CommonUtils.escapeIdentifier(index.getParentObject().getName()));
            TableColumn colDesc = UIUtils.createTableColumn(columnsTable, SWT.NONE, MySQLMessages.table_column_length);
            Integer length = (Integer) attributeInfo.getProperty(PROP_LENGTH);


import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
                Spinner spinner = new Spinner(table, SWT.BORDER);
                    attributeInfo.setProperty(PROP_LENGTH, null);
            super.createAttributeColumns(columnsTable);

 */
import org.jkiss.dbeaver.model.DBPDataKind;
        @Override
                        length == null ? null : String.valueOf(length)));
                if (colIndex == 1) {

                item.setText(index, length <= 0 ? "" : String.valueOf(length));
                        index,
}
            super(MySQLUIMessages.edit_index_manager_title, index, index.getDataSource().supportedIndexTypes());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableIndexColumn;
            }

        return UITask.run(() -> {
