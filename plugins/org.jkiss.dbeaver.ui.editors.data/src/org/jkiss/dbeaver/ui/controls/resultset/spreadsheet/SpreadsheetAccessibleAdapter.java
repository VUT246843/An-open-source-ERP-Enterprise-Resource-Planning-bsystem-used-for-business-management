                });
            valueStr = "";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
                valueType = DataEditorsMessages.spreadsheet_accessibility_string;
            valueStr = value.toString();
 * See the License for the specific language governing permissions and
    private static GridCell lastCell;
 */
    // some accessibility tools (like JAWs) use only results from the getName() method.
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_row_col, new Object[]{
            e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_rows_selected, rowsCount);

            lastPosition.row = position.row;
                });
    }
        if (cellsCount == 1) {
            }

            valueStr = "";

        }
    }

 * you may not use this file except in compliance with the License.
            } else if (lastPosition.row != position.row && lastPosition.col == position.col) {

    private GridPos position;
    @Override
        if (contentProvider.isElementReadOnly(cell.getColumn())) {
        MimeTypes.APPLICATION_JSON, "json",
        this.contentProvider = spreadsheet.getContentProvider();
            lastPosition.col = position.col;
    private int cellsCount;
        MimeTypes.TEXT_JSON, "json",

    private void readValueStringAndType(@NotNull IGridContentProvider contentProvider, @NotNull GridCell cell, Object value) {
 * DBeaver - Universal Database Manager
    private String valueType = "";
    @Override

            } else if (value instanceof Number) {
                    valueStr,
        }
            if (cell == null) {
    private final GridPos lastPosition;

            e.result = DataEditorsMessages.spreadsheet_accessibility_freeform_range_selected;
            valueStr = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_collection_of_type, collectionType);
        }
    @Override
            } else if (lastPosition.row != position.row && lastPosition.col == position.col) {
            e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_rows_selected, rowsCount);
                return;
            valueStr = contentProvider.getCellValue(cell.getColumn(), cell.getRow(), true).toString();
            valueType = "";

        if (!valueLink.isEmpty()) {
            if (cell == null) {

 * limitations under the License.
    @Override

            }
        MimeTypes.TEXT_XML, "xml",
import org.jkiss.dbeaver.ui.controls.lightgrid.GridCell;

    }
        }
            if (lastPosition.col != position.col && lastPosition.row == position.row) {
            valueType = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_readonly, valueType);
            e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_columns_selected, colsCount);

import org.jkiss.dbeaver.model.data.DBDCollection;
        e.result = DataEditorsMessages.spreadsheet_accessibility_description;
 * You may obtain a copy of the License at

        } else if (collectionType != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        final String valueLink = contentProvider.getCellLinkText(cell.col, cell.row);

import org.jkiss.dbeaver.utils.MimeTypes;
    public void getValue(AccessibleControlEvent e) {
 *
        }
        MimeTypes.MULTIPART_ANY, "multipart",
        this.spreadsheet = spreadsheet;
    }
import org.jkiss.code.NotNull;
        }
                });
        final Accessible accessible = spreadsheet.getAccessible();
import java.util.Map;
        if (cellsCount == 1) {
    // This is a duplicate of the getValue() method. Because for some reason,
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_col, new Object[]{

        } else if (value instanceof Boolean) {
                    valueStr,
    private IGridLabelProvider labelProvider;

            } else {

        accessible.addAccessibleControlListener(adapter);

 * Unless required by applicable law or agreed to in writing, software
            return;
        // not implemented
    public static void install(@NotNull Spreadsheet spreadsheet) {
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_row, new Object[]{
    }
        final String contentType = value instanceof DBDContent ? ((DBDContent) value).getContentType() : null;
    private GridCell cell;
}
                    labelProvider.getText(cell.getColumn()),
                    labelProvider.getText(cell.getColumn()),
        this.lastPosition = new GridPos(-1, -1);
        } else {
                    labelProvider.getText(cell.getRow()),
        MimeTypes.OCTET_STREAM, "blob",
import org.eclipse.osgi.util.NLS;

    private static final boolean READ_VALUE = false;

import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
            spreadsheet.setAccessibilityEnabled(true);

import org.eclipse.swt.accessibility.*;
 *
                });

    private int rowsCount;
    }
                    valueStr,
            readValueStringAndType(contentProvider, cell, value);
        value = contentProvider.getCellValue(cell.getColumn(), cell.getRow(), false);
        rowsCount = spreadsheet.getRowSelectionSize();
        spreadsheet.addCursorChangeListener(event -> {
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridLabelProvider;
        this.cell = cell;
                });


            }
                    valueStr,
                    valueStr,
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_row_col, new Object[]{
                    labelProvider.getText(cell.getColumn()),
        } else {
        this.labelProvider = spreadsheet.getLabelProvider();

import org.jkiss.dbeaver.model.data.DBDContent;
        // not implemented
    }

    private void setNewCell(GridCell cell) {
            valueStr = DataEditorsMessages.spreadsheet_accessibility_empty_string;
            valueType = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_foreign_key, valueType, valueLink);
        }
        if (contentType != null && lobMimeTypeNames.get(contentType) != null) {
            if (value instanceof String) {
                adapter.setNewCell(cell);
    public void getHelp(AccessibleEvent e) {
        if (!READ_VALUE) {
            valueType = "";
        } else {
                    valueType
 *     http://www.apache.org/licenses/LICENSE-2.0
    private int colsCount;
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridContentProvider;
                    valueType
            valueStr = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_object_of_type, lobMimeTypeNames.get(contentType));

        if (position != null) {
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_col, new Object[]{
                    labelProvider.getText(cell.getRow()),
    private static final Map<String, String> lobMimeTypeNames = Map.of(
            final GridCell cell = spreadsheet.getFocusCell();
 * distributed under the License is distributed on an "AS IS" BASIS,
            valueType = DataEditorsMessages.spreadsheet_accessibility_boolean;
        }
        MimeTypes.TEXT_HTML, "html",
            e.result = DataEditorsMessages.spreadsheet_accessibility_freeform_range_selected;
        accessible.addAccessibleListener(adapter);
public class SpreadsheetAccessibleAdapter extends AccessibleControlAdapter implements AccessibleListener {

    private Object value;
        } else if (rowsCount == 1) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    labelProvider.getText(cell.getColumn()),

        lastCell = cell;
            } else {
    }
        if (valueStr.isEmpty()) {
        });
            }
        } else if (colsCount == 1) {
/*
            if (cell != null && cell != lastCell) {
            }

            readValueStringAndType(contentProvider, cell, value);
    public void getDescription(AccessibleEvent e) {
        position = new GridPos(spreadsheet.getCursorPosition());
 *
                accessible.sendEvent(ACC.EVENT_NAME_CHANGED, new Object[]{null, cell.getRow().getElement()});
        final String collectionType = value instanceof DBDCollection ? ((DBDCollection) value).getComponentType().getName() : null;
                e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_grid_value_row, new Object[]{
            if (lastPosition.col != position.col && lastPosition.row == position.row) {
        MimeTypes.TEXT_CSS, "css",
                return;
        final SpreadsheetAccessibleAdapter adapter = new SpreadsheetAccessibleAdapter(spreadsheet);
        colsCount = spreadsheet.getColumnSelectionSize();
    }
                    valueStr,
    private final Spreadsheet spreadsheet;
            e.result = NLS.bind(DataEditorsMessages.spreadsheet_accessibility_columns_selected, colsCount);
                    labelProvider.getText(cell.getRow()),

        cellsCount = spreadsheet.getCellSelectionSize();
    private IGridContentProvider contentProvider;
    public void getName(AccessibleEvent e) {

                });
                    labelProvider.getText(cell.getRow()),
import org.jkiss.dbeaver.ui.controls.lightgrid.GridPos;
    );
        } else if (colsCount == 1) {
    private SpreadsheetAccessibleAdapter(@NotNull Spreadsheet spreadsheet) {
            } else if (!lastPosition.equals(position)) {
    public void getKeyboardShortcut(AccessibleEvent e) {
    private String valueStr;
                e.result = valueStr;
        MimeTypes.MULTIPART_RELATED, "multipart"
            }
                valueType = DataEditorsMessages.spreadsheet_accessibility_numeric;
    @Override
