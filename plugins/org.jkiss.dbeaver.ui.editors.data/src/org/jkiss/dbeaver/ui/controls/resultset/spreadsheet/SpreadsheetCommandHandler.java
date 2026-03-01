 * DBeaver - Universal Database Manager
                    for (DBDAttributeBinding attribute : attributes) {
                }
                    }
                        s.setFocusColumn(s.getColumnByElement(focusColumnElement).getIndex());
 * You may obtain a copy of the License at
                    List<GridPos> cellsToSelect = selectedCells.stream().map(s::cellToPos)
                break;
                Spreadsheet s = spreadsheet.getSpreadsheet();
 *
                s.resetFocus();
            case CMD_SHOW_COLUMN_CONTEXT_MENU: {
                    selectedColumns = Collections.singletonList(column);
}
                GridPos focusPos = spreadsheet.getSpreadsheet().getFocusPos();
            case CMD_MOVE_COLUMNS_LEFT: {
                Spreadsheet s = spreadsheet.getSpreadsheet();

                    if (spreadsheet.shiftColumns(columnsToMove, 1)) {
            }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
import org.jkiss.dbeaver.ui.controls.lightgrid.GridPos;
 */
                    s.getMenu().setLocation(s.toDisplay(new Point(r.x + r.width, r.y)));
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
                        s.selectCells(cellsToSelect);
                s.selectCells(cellsToSelect);
/*
                    model.setAttributeVisibility(attr, true);
                    }
import org.eclipse.swt.SWT;
                }
                final var attributes = new HashSet<>(model.getVisibleAttributes());
                        s.setFocusItem(focusPos.row);
                } else if (focusColumnElement != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
                Collection<Integer> rowsSelection = s.getRowSelection();
            }
            IResultSetPresentation presentation = resultSet.getActivePresentation();
    public static final String CMD_SELECT_COLUMNS = "org.jkiss.dbeaver.core.resultset.grid.selectColumn";
                    c -> IntStream.range(0, rowsCount).mapToObj(r -> new GridPos(c.getIndex(), r))
import java.util.stream.IntStream;

                        s.selectCells(cellsToSelect);
                Object focusColumnElement = s.getFocusColumnElement();
                s.setFocusItem(focusPos.row);
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    public static final String CMD_COLUMNS_FIT_VALUE = "org.jkiss.dbeaver.core.resultset.grid.columnsFitValue";
                Collection<GridPos> cellsToSelect = rowsSelection.stream().flatMap(
                int leftmostColumnIndex = selectedColumns.stream().mapToInt(IGridColumn::getIndex).min().getAsInt();
            return null;
        IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));
import org.eclipse.ui.handlers.HandlerUtil;
            if (presentation instanceof SpreadsheetPresentation) {
                    attributes.removeIf(attribute -> !DBUtils.isNullValue(model.getCellValue(attribute, row)));
                spreadsheet.getSpreadsheet().packColumns(false);
                        s.resetFocus();
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridItem;
                }
                    spreadsheet.refreshData(true, false, true);

                } else {
                        .map(p -> new GridPos(p.col + 1, p.row)).collect(Collectors.toList());
                if (!attributes.isEmpty()) {
            }
    public static final String CMD_MOVE_COLUMNS_LEFT = "org.jkiss.dbeaver.core.resultset.grid.moveColumnLeft";
                for (DBDAttributeConstraint ac : constraints) {
import org.eclipse.core.commands.ExecutionException;

                break;

        return null;
                }
                s.selectCells(cellsToSelect);
    public static final String CMD_COLUMNS_HIDE_EMPTY = "org.jkiss.dbeaver.core.resultset.grid.columnsHideEmpty";
                ).collect(Collectors.toList());
                    Rectangle r = s.getColumnBounds(focusColumn.getIndex());
                    r -> IntStream.range(0, columnsCount).mapToObj(c -> new GridPos(c, r))
 * limitations under the License.
                break;
                GridPos focusPos = s.getFocusPos();
        if (resultSet != null) {
                break;
                for (ResultSetRow row : model.getAllRows()) {
import java.util.*;
                }
                Spreadsheet s = spreadsheet.getSpreadsheet();
    }
                if (focusCell != null) {
/**
    public Object execute(ExecutionEvent event) throws ExecutionException {
                List<IGridColumn> selectedColumns = s.getColumnSelection();
            case CMD_COLUMNS_FIT_SCREEN:
                        ResultSetMessages.controls_resultset_viewer_hide_columnss_error_text, SWT.ERROR);
    {
    public static final String CMD_SHOW_COLUMN_CONTEXT_MENU = "org.jkiss.dbeaver.core.resultset.grid.showColumnContextMenu";
                Object focusColumnElement = s.getFocusColumnElement();
            }
                List<IGridColumn> columnsSelection = s.getColumnSelection();
                        model.setAttributeVisibility(attribute, false);
                    ) {
                if (selectedColumns.size() == 1 && focusPos.col >= 0) {
            }
                        .map(p -> new GridPos(p.col - 1, p.row)).collect(Collectors.toList());
                        model.setAttributeVisibility((DBDAttributeBinding) selectedColumn.getElement(), false);
                    IGridColumn focusColumn = s.getColumnByElement(focusColumnElement);
                int rowsCount = s.getItemCount();
    public static final String CMD_COLUMNS_FIT_SCREEN = "org.jkiss.dbeaver.core.resultset.grid.columnsFitScreen";
                Collection<GridCell> selectedCells = s.getCellSelection();
        }
            case CMD_COLUMNS_HIDE_EMPTY: {
                List<IGridColumn> selectedColumns = s.getColumnSelection();
                ResultSetModel model = spreadsheet.getController().getModel();
                List<IGridColumn> selectedColumns = spreadsheet.getSpreadsheet().getColumnSelection();
            }
                        s.deselectAll();

            case CMD_MOVE_COLUMNS_RIGHT: {
                GridPos focusPos = s.getFocusPos();
                if (rightmostColumnIndex < s.getColumnCount() - 1) {
        }
        SpreadsheetPresentation spreadsheet = getActiveSpreadsheet(event);
            case CMD_COLUMNS_FIT_VALUE:
                int columnsCount = s.getColumnCount();
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                spreadsheet.getSpreadsheet().packColumns(true);
 * Unless required by applicable law or agreed to in writing, software
                if (leftmostColumnIndex > 0) {
                    List<Object> columnsToMove = selectedColumns.stream().map(IGridItem::getElement).collect(Collectors.toList());
    public static final String CMD_SELECT_ROWS = "org.jkiss.dbeaver.core.resultset.grid.selectRow";
            case CMD_SHOW_COLUMNS: {
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridColumn;
                    }
                        s.deselectAll();
    public static SpreadsheetPresentation getActiveSpreadsheet(ExecutionEvent event)
                for (DBDAttributeBinding attr : hiddenAttributes) {
                        && DBDAttributeConstraint.isVisibleByDefault((DBDAttributeBinding) attribute)
 * Copyright (C) 2010-2024 DBeaver Corp and others
                break;
            }
                s.setColumnContextMenuShouldBeShown(true);
                break;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    List<GridPos> cellsToSelect = selectedCells.stream().map(s::cellToPos)
                    DBSAttributeBase attribute = ac.getAttribute();

                s.setFocusColumn(focusPos.col);
                if (selectedColumns.size() >= model.getVisibleAttributeCount()) {
                        hiddenAttributes.add((DBDAttributeBinding) attribute);
                        ResultSetMessages.controls_resultset_viewer_hide_columns_error_title,
                    for (IGridColumn selectedColumn : selectedColumns) {
                    s.getMenu().setLocation(s.toDisplay(new Point(r.x + r.width, r.y)));
                }
                List<DBDAttributeBinding> hiddenAttributes = new ArrayList<>();
                ).collect(Collectors.toList());
import org.jkiss.dbeaver.ui.UIUtils;
                Collection<GridCell> selectedCells = s.getCellSelection();
                    if (!ac.isVisible() && attribute instanceof DBDAttributeBinding
            }
 *
                    List<Object> columnsToMove = selectedColumns.stream().map(IGridItem::getElement).collect(Collectors.toList());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
        String actionId = event.getCommand().getId();
                GridCell focusCell = s.getFocusCell();
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                break;
                spreadsheet.refreshData(true, false, true);
import org.jkiss.dbeaver.ui.controls.resultset.handler.ResultSetHandlerMain;
                final var model = spreadsheet.getController().getModel();
 * Spreadsheet command handler.
import org.eclipse.swt.graphics.Rectangle;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
                        spreadsheet.getControl().getShell(),

                    if (spreadsheet.shiftColumns(columnsToMove, -1)) {
            case CMD_HIDE_COLUMNS: {
import org.eclipse.core.commands.AbstractHandler;
                s.resetFocus();
            case CMD_SELECT_ROWS: {
                Object focusColumnElement = s.getFocusColumnElement();
                    GridPos focusPos = s.cellToPos(focusCell);
    public static final String CMD_HIDE_COLUMNS = "org.jkiss.dbeaver.core.resultset.grid.hideColumns";
        if (spreadsheet == null) {
                List<DBDAttributeConstraint> constraints = model.getDataFilter().getConstraints();
package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
    public static final String CMD_MOVE_COLUMNS_RIGHT = "org.jkiss.dbeaver.core.resultset.grid.moveColumnRight";
                }
                break;
    @Override
            }
                return (SpreadsheetPresentation) presentation;
                    spreadsheet.refreshData(true, false, true);
                }
                Collection<GridPos> cellsToSelect = columnsSelection.stream().flatMap(
                Spreadsheet s = spreadsheet.getSpreadsheet();
                GridPos focusPos = s.getFocusPos();
                break;
import org.jkiss.dbeaver.ui.controls.lightgrid.GridCell;
            case CMD_SELECT_COLUMNS: {
public class SpreadsheetCommandHandler extends AbstractHandler {

        return null;
                    }
                Spreadsheet s = spreadsheet.getSpreadsheet();
                    IGridColumn column = spreadsheet.getSpreadsheet().getColumn(focusPos.col);
 *

                break;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                        s.resetFocus();
                GridPos focusPos = s.getFocusPos();
                ResultSetModel model = spreadsheet.getController().getModel();
    }
        switch (actionId) {
 */
                        s.setFocusColumn(s.getColumnByElement(focusColumnElement).getIndex());
    public static final String CMD_SHOW_COLUMNS = "org.jkiss.dbeaver.core.resultset.grid.showColumns";
 * See the License for the specific language governing permissions and
                    UIUtils.showMessageBox(
                    Rectangle r = s.getCellBounds(focusPos.col, focusPos.row);
import org.eclipse.swt.graphics.Point;
                        s.setFocusItem(focusPos.row);
                }
 * Active when focus is in spreadsheet control
                int rightmostColumnIndex = selectedColumns.stream().mapToInt(IGridColumn::getIndex).max().getAsInt();
                s.getMenu().setVisible(true);
