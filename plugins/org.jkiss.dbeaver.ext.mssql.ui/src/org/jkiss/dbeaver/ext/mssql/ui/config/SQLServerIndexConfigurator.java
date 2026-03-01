 */
            }
import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
            SQLServerConstants.INDEX_TYPE_DEFAULT,
    private static class SQLServerEditIndexPage extends EditIndexPage {
        private int includedColumnIndex;
            DBSIndexType.CLUSTERED

        }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                super.saveCellValue(control, index, item, attributeInfo);
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @Override
 * you may not use this file except in compliance with the License.
            idxName.append(CommonUtils.escapeIdentifier(index.getTable().getName()));
 */
    }
                        0,
                        Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, SQLServerEditIndexPage.PROP_INCLUDED))));
    };
            }
            super.createAttributeColumns(columnsTable);
        return UITask.run(() -> {
                item.setText(index, isIncluded ? "YES" : "NO");
package org.jkiss.dbeaver.ext.mssql.ui.config;
                        !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC)),
import org.jkiss.dbeaver.ui.UIUtils;
            index.setUnique(editPage.isUnique());
    @Override
import org.eclipse.swt.widgets.Control;
        protected void createAttributeColumns(Table columnsTable) {
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
                return combo;

            index.setName(DBObjectNameCaseTransformer.transformObjectName(index, idxName.toString()));
            SQLServerConstants.INDEX_TYPE_NON_CLUSTERED,
        }
 * You may obtain a copy of the License at
        });
            columnItem.setText(includedColumnIndex, Boolean.TRUE.equals(attributeInfo.getProperty(PROP_INCLUDED)) ? "YES" : "NO");
            StringBuilder idxName = new StringBuilder(64);
            EditIndexPage editPage = new SQLServerEditIndexPage(index);

 * SQL Server index configurator
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

        }
                combo.select(isIncluded ? 0 : 1);
                if (colIndex == 1) {
 *
    public SQLServerTableIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerTableIndex index, @NotNull Map<String, Object> options) {
import org.jkiss.utils.CommonUtils;
            if (index == includedColumnIndex) {
            idxName.append("_IDX");

                combo.add("NO");

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.custom.CCombo;

            int colIndex = 1;
public class SQLServerIndexConfigurator implements DBEObjectConfigurator<SQLServerTableIndex> {



import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableIndex;
        }
            return includedColumnIndex;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableColumn;
            if (index == includedColumnIndex) {
                        (SQLServerTableColumn) tableColumn,
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableIndexColumn;
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
            includedColumnIndex = super.fillAttributeColumns(attribute, attributeInfo, columnItem) + 1;
            UIUtils.createTableColumn(columnsTable, SWT.NONE, "Included");
            return super.createCellEditor(table, index, item, attributeInfo);
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {

        @Override
            index.setDescription(editPage.getDescription());
            super("Create index", index, Arrays.asList(SQLSERVER_INDEX_TYPES));
    private static final DBSIndexType[] SQLSERVER_INDEX_TYPES = {
                final boolean isIncluded = Boolean.TRUE.equals(attributeInfo.getProperty(PROP_INCLUDED));
            if (!editPage.edit()) {
import org.jkiss.code.Nullable;
        }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                attributeInfo.setProperty(PROP_INCLUDED, isIncluded);
import org.jkiss.code.NotNull;
 * limitations under the License.
                        colIndex++,
                final CCombo combo = new CCombo(table, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

            }
import org.eclipse.swt.widgets.TableItem;
                    idxName.append("_").append(CommonUtils.escapeIdentifier(tableColumn.getName()));
        @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
/*
                        index,
                index.addColumn(
                }
}
                final boolean isIncluded = ((CCombo) control).getSelectionIndex() == 0;
        public SQLServerEditIndexPage(@NotNull DBSTableIndex index) {
/**
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Arrays;
        @Override
            return index;
            index.setIndexType(editPage.getIndexType());
        protected Control createCellEditor(Table table, int index, TableItem item, AttributeInfo attributeInfo) {
            } else {
                    new SQLServerTableIndexColumn(
 * DBeaver - Universal Database Manager
        protected void saveCellValue(Control control, int index, TableItem item, AttributeInfo attributeInfo) {
import java.util.Map;
                combo.add("YES");
        protected int fillAttributeColumns(DBSEntityAttribute attribute, AttributeInfo attributeInfo, TableItem columnItem) {
                return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
        public static final String PROP_INCLUDED = "included";
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
