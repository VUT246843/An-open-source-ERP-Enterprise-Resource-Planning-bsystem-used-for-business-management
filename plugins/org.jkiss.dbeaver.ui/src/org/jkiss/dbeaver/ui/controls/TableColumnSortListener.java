                if (num1 != null) {

                    for (int k = 0; k < columnCount; k++) {
        Color[] backgrounds = new Color[columnCount];
        private static Double getNumberFromString(String str) {
    public void handleEvent(Event e) {
import org.eclipse.swt.graphics.Image;
                // Ignore
 *
    public TableColumnSortListener(Table table, int columnIndex) {
    }

                case SWT.UP -> SWT.NONE;
import java.text.Collator;
import org.jkiss.code.NotNull;
                TableItem item = items[i];
/*
                    item = new TableItem(table, SWT.NONE, j);
                    item.setText(values);

            }
                        if (backgrounds[k] != null) item.setBackground(k, backgrounds[k]);

    private static class DefaultComparator implements Comparator<TableItem> {
        }
        public DefaultComparator(int columnIndex) {
 * You may obtain a copy of the License at
                        foregrounds[k] = item.getForeground(k);
        this.comparator = comparator;
        TableItem[] items = table.getItems();
    public TableColumnSortListener(@NotNull Table table, @NotNull Comparator<TableItem> comparator) {
        }
                if (comparator.compare(item, items[j]) < 0) {
import org.eclipse.swt.graphics.Color;
                    break;
    }
 * Unless required by applicable law or agreed to in writing, software
            for (int j = 0; j < i; j++) {
                if (Character.isWhitespace(str.charAt(numLength))) {
            if (numLength == str.length()) {
 * TableColumnSortListener
    }
                    item.setChecked(checked);
            } catch (NumberFormatException e3) {
            } else {
            }
        this.comparator = new DefaultComparator(columnIndex);
            return collator.compare(text1, text2);
            if (str.isEmpty()) return null;
                    }
            try {
import org.eclipse.swt.widgets.*;
    private final Table table;
import org.eclipse.swt.SWT;

        String[] values = new String[columnCount];
        this.table.setSortColumn(column);
    private TableColumn prevColumn = null;
import java.util.Comparator;
        private final Collator collator = Collator.getInstance(Locale.getDefault());
 * distributed under the License is distributed on an "AS IS" BASIS,


                    item.setImage(image);
        if (prevColumn == column && e.doit) {
                    items = table.getItems();
                return Double.parseDouble(str);
                    }
/**
package org.jkiss.dbeaver.ui.controls;
        public int compare(TableItem o1, TableItem o2) {
        Color[] foregrounds = new Color[columnCount];
                }
 * limitations under the License.
                    if (num2 != null) {
                return Double.parseDouble(str.substring(0, numLength));
                case SWT.DOWN -> SWT.UP;
                    }
public class TableColumnSortListener implements Listener {
    private static void sortTable(Table table, Comparator<TableItem> comparator)
                        return (int) (num1 - num2);
        this.table = table;
 *
            String text1 = o1.getText(columnIndex);
        for (int i = 1; i < items.length; i++) {

 *
                Double num1 = getNumberFromString(text1);
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
                    Image image = item.getImage();
            sortDirection = switch (sortDirection) {
            }
        }
 */
                    item.dispose();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        backgrounds[k] = item.getBackground(k);
 */
    private final Comparator<TableItem> comparator;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

                }

                        if (foregrounds[k] != null) item.setForeground(k, foregrounds[k]);
        sortTable(this.table, sortDirection == SWT.UP ? comparator : comparator.reversed());
        @Override
        this.table.setSortDirection(sortDirection);
                default -> SWT.DOWN;
        prevColumn = column;
import java.util.Locale;
    }
            if (!Character.isDigit(str.charAt(0))) return null;
                    boolean checked = item.getChecked();
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (; numLength < str.length(); numLength++) {
        private final int columnIndex;
                    Object data = item.getData();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int columnCount = table.getColumnCount();

            }
        TableColumn column = (TableColumn) e.widget;
    {
                    item.setData(data);
    }
                    break;
                    for (int k = 0; k < columnCount; k++) {
            };
        this.table = table;
                        values[k] = item.getText(k);
}
    private int sortDirection = SWT.DOWN;
            int numLength = 1;
                }
        }

        }
            String text2 = o2.getText(columnIndex);
                    Double num2 = getNumberFromString(text2);
            this.columnIndex = columnIndex;
