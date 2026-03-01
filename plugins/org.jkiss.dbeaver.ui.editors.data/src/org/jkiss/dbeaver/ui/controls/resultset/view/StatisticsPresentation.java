 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    }
            ResultSetRow row = controller.getModel().getRow(0);
import org.eclipse.swt.events.SelectionEvent;
                DBDAttributeBinding attr = visibleAttributes.get(i);
    public void changeMode(boolean recordMode) {
            @Override
        UIWidgets.setControlContextMenu(table, manager -> UIWidgets.fillDefaultTableContextMenu(manager, table));
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;


                    if (curAttribute == null) {
                    line = line.replace("\t", "    ");

import org.eclipse.swt.dnd.Transfer;
        return curAttribute;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
                }

    public void clearMetaData() {
                    String line = lines[k];
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.UIUtils;
    }
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    @Nullable

 *
        if (controller.getModel().getRowCount() > 0) {
            }
import org.jkiss.dbeaver.ui.UIStyles;
    }
            for (int i = 0; i < visibleAttributes.size(); i++) {
                }
                    item.setText(0, k == 0 ? attr.getName() : "");
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

                    }
    @Override
                    item.setText(1, line);
import org.eclipse.swt.SWT;
 */
    @Override
 * Special internal presentation for execution statistics visualization.
import java.util.Map;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetCopySettings;
            java.util.List<DBDAttributeBinding> visibleAttributes = controller.getModel().getVisibleAttributes();
    @Override

                    TableItem item = new TableItem(table, SWT.LEFT);
 * limitations under the License.

import org.eclipse.swt.widgets.Table;
 *
    @Override


 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.viewers.StructuredSelection;
    public Control getControl() {

                String valueString = DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.UI);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        });
                curAttribute = null;
            public void widgetSelected(SelectionEvent e) {
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.events.SelectionAdapter;

import org.jkiss.code.NotNull;
import org.eclipse.swt.layout.GridData;
    public DBDAttributeBinding getCurrentAttribute() {
    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
        table.setLinesVisible(!UIStyles.isDarkTheme());

        table = new Table(parent, SWT.MULTI | SWT.FULL_SELECTION);

    @Override
        return Collections.emptyMap();
        return table;
                fireSelectionChanged(new StructuredSelection(elements));
    }
                    }
    @NotNull
    @Override
        super.createPresentation(controller, parent);
/**
    public void formatData(boolean refreshData) {
import org.eclipse.swt.widgets.Control;
    }
 */
    private Table table;
 * Execution statistics presentation.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        table.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.code.Nullable;
        UIUtils.createTableColumn(table, SWT.LEFT, "Name");
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and


            }

                    item.setData(attr);

                    elements[i] = selection[i].getData();
import org.jkiss.dbeaver.model.DBValueFormatting;
import org.jkiss.dbeaver.ui.controls.resultset.AbstractPresentation;
 *
    }
/*
                Object value = row.getValues()[i];
                for (int i = 0; i < selection.length; i++) {
                TableItem[] selection = table.getSelection();

        UIUtils.createTableColumn(table, SWT.LEFT, "Value");
}
    }
        }
    private DBDAttributeBinding curAttribute;
                String[] lines = valueString.split("\n");
    public void updateValueView() {
                Object[] elements = new Object[selection.length];
                        curAttribute = (DBDAttributeBinding) elements[i];
        UIUtils.packColumns(table);
    @Override
package org.jkiss.dbeaver.ui.controls.resultset.view;
    @Override
        table.removeAll();
import org.eclipse.swt.widgets.Composite;
                for (int k = 0; k < lines.length; k++) {
 * You may obtain a copy of the License at
                    if (CommonUtils.isEmptyTrimmed(line)) {
import org.jkiss.dbeaver.ui.UIWidgets;
import java.util.Collections;
public class StatisticsPresentation extends AbstractPresentation {
        table.addSelectionListener(new SelectionAdapter() {
        table.setHeaderVisible(true);
                        continue;
    public void createPresentation(@NotNull IResultSetController controller, @NotNull Composite parent) {
 * you may not use this file except in compliance with the License.
