    private Color scopeHighlightColor;
    private Pattern searchPattern;
        final SpreadsheetPresentation spreadsheet = activeEditor.getAdapter(SpreadsheetPresentation.class);
                    cellLocation.getRowIndexes(),
    ) {
        }
            return new Point(0, 0);
        if (currentPos == null) {
    public String getSelectionText() {
        boolean searchForward,
import org.eclipse.swt.graphics.Color;
        }
            if (oldValue.equals(newValue)) {
            if (!isCellInScope(currentPos, firstRow, lastRow, minColumn, columnCount)) {
        boolean wrapped = false;
        }
                    cellLocation.getRow(),
        }
}
                if (wrapped) { // Prevent infinite loop
            return "";
    private Pattern createSearchPattern(
import org.jkiss.dbeaver.ui.UIStyles;
        int offset,
                                rows = new LinkedHashSet<>(updatedRows);
/*
            return;
            instance = new SpreadsheetFindReplaceTarget();
            return;
        if (refreshSession) {
            } else {
            return;
                }

            }
        return this;
                                owner.getController().refreshHintCache(attrs, rows, null);
        boolean regExReplace
        return searchForward ?
            }
                return Pattern.compile(pattern, caseSensitive ? 0 : Pattern.CASE_INSENSITIVE);
                new GridPos(columnCount - 1, lastRow); // Start from bottom-right
                        storeLastFoundPosition(currentPos);
    private String currentFindString = "";
        @NotNull GridPos pos,
            updatedRows.clear();
        final boolean refreshSession = this.sessionActive;
        boolean wholeWord
        if (owner == null) {
        return -1; // No matches found
import java.util.regex.PatternSyntaxException;
    public void replaceSelection(
            // Handle search wrap-around
    }
                searchPattern = null;
            }
        }
                updatedRows.add(cellLocation.getRow());
        }
        int columnCount = spreadsheet.getColumnCount();
            new GridPos(minColumn, firstRow) :  // Top-left corner
                    break;

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
    }
                spreadsheet.selectCells(this.originalSelection);
    @Override
        // Use current position for first search, next position otherwise
            storeLastFoundPosition(startPos);
        int checked = 0;
        int lastRow,
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
        if (scope == null || scope.getLength() == 0) {
        this.currentFindString = findString;
        String oldValue = CommonUtils.toString(owner.getSpreadsheet().getContentProvider().getCellValue(

        if (model.isEmpty()) {
                    : Pattern.quote(findString);
        if (owner == null) {
        Spreadsheet spreadsheet = owner.getSpreadsheet();
    }
        @NotNull Spreadsheet spreadsheet,
        }
            // Adjust column for record mode
            owner.highlightRows(scope.getOffset(), scope.getLength(), scopeHighlightColor);

                        @NotNull
            return searchForward ?
                checked++;
            instance.scopeHighlightColor = UIStyles.getDefaultTextColor("AbstractTextEditor.Color.FindScope", SWT.COLOR_LIST_SELECTION);
            lastRow = rowCount - 1;
        int minRow = rowSelection.stream().mapToInt(v -> v).min().orElse(-1);
                        @Override

            synchronized (REDRAW_SYNC) {
    }


            return null;
                if (!replaceAll || !processedCells.contains(currentPos)) {
                    newValue,
        @NotNull String text,

    }
        // Adjust position for record mode
        refreshOwner(newOwner);


    private static final Object REDRAW_SYNC = new Object();
                new GridPos(minColumn, firstRow) :  // Start from top-left
        GridPos selection = owner.getSelection().getFirstElement();
    private List<GridPos> originalSelection = new ArrayList<>();
                // Special handling for content/blob values
            return super.toString();
    private boolean currentCaseSensitive;
    ) {
 * limitations under the License.
        if (refreshSession) {
                            Set<DBDValueRow> rows;

            next.col++;
 *
        DBSDataContainer dataContainer = owner.getController().getDataContainer();
        if (!replaceAll) {
        int firstRow,
            spreadsheet.selectCells(this.originalSelection);
        int lastRow,
        }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetCellLocation;
    @Override
        }

    public int findAndSelect(
import org.eclipse.core.runtime.IStatus;
            }
        final SpreadsheetPresentation owner = getActiveSpreadsheet();

            if (originalValue instanceof DBDContent content) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        );
    }

        int columnCount,
                }
            spreadsheet.setFocusColumn(pos.col);
        if (refreshActiveSpreadsheet) {
                            Set<DBDAttributeBinding> attrs;
            spreadsheet,
        return findAndSelect(widgetOffset, findString, searchForward, caseSensitive, wholeWord, false);
    public boolean isSessionActive() {
                return Pattern.compile(findString, caseSensitive ? 0 : Pattern.CASE_INSENSITIVE);
            newValue = searchPattern.matcher(oldValue).replaceAll(text);
    public boolean canPerformFind() {
    private static final Log log = Log.getLog(SpreadsheetFindReplaceTarget.class);
        owner.setSelection(
        return next;
import org.jkiss.dbeaver.ui.data.IValueController;
        int minColumn
        try {
        boolean searchForward,
            } else {
        boolean regExSearch
        this.scopeHighlightColor = color;
                next.col = minColumn;
        @NotNull String findString,
            return;
        if (owner == null) {
    private boolean replaceAll;

                                attrs = new LinkedHashSet<>(updatedAttributes);
            return null;
    private final Set<GridPos> processedCells = new HashSet<>();
    // Selects a cell and updates UI focus
        if (cell == null) {
        int rowCount = spreadsheet.getItemCount();
    public void setScopeHighlightColor(Color color) {
        owner.getControl().redraw();

    @Override
 *


            Spreadsheet spreadsheet = owner.getSpreadsheet();
            spreadsheet.deselectAll();
        final SpreadsheetPresentation owner = getActiveSpreadsheet(false);
        return null;
        this.sessionActive = false;
            Spreadsheet spreadsheet = owner.getSpreadsheet();
        }

    private boolean firstSearchInSession = true;
    public String toString() {
            }
        int lastRow = Math.min(owner.getHighlightScopeLastLine(), rowCount - 1);
    ) {
    public Point getSelection() {



        int firstRow,
        int lastRow,
 */
    private static SpreadsheetFindReplaceTarget instance;
                Spreadsheet spreadsheet = owner.getSpreadsheet();
        if (searchForward) {
        if (owner == null) {

    public Point getLineSelection() {
        @NotNull String findString,
    }
    @Override
        processedCells.clear();
                wrapped = true;
    ) {
        } else {




            }
        Collection<Integer> rowSelection = owner.getSpreadsheet().getRowSelection();
        GridPos currentPos = new GridPos(startPos.col, startPos.row);
        int minColumn,
        String newValue = oldValue;
        int firstRow = Math.max(owner.getHighlightScopeFirstLine(), 0);
            currentPos = getNextPosition(currentPos, searchForward, columnCount, minColumn, firstRow, lastRow);
    }

    @Override
        synchronized (REDRAW_SYNC) {
        if (owner == null) {
/**
        GridPos next = new GridPos(pos.col, pos.row);
                            UIUtils.syncExec(() -> {
        int minColumn,
            Object originalValue = owner.getSpreadsheet().getContentProvider().getCellValue(
                cell.col, cell.row, false);
    private final Set<DBDAttributeBinding> updatedAttributes = new LinkedHashSet<>();
    public boolean isEditable() {
    public IRegion getScope() {
            return;
            return -1;
                currentPos = getWrapAroundPosition(searchForward, firstRow, lastRow, minColumn, columnCount);
        int widgetOffset,


            firstSearchInSession = false;
import org.eclipse.jface.text.IFindReplaceTargetExtension;
                    if (cellText != null && pattern.matcher(cellText).find()) {
    }
        }
            spreadsheet.showSelection();
            if (next.col >= columnCount) {
        if (selection == null) {
    public synchronized SpreadsheetFindReplaceTarget owned(@NotNull SpreadsheetPresentation newOwner) {
    @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;


        int minColumn,
    @Override
        String value = cell == null ? "" : CommonUtils.toString(spreadsheet.getContentProvider().getCellValue(cell.col, cell.row, false));
    @Override
    private GridPos getNextPosition(
    public void beginSession() {
    public void replaceSelection(String text) {
    private GridPos getWrapAroundPosition(
        }
        if (owner == null) {
import org.jkiss.dbeaver.DBException;
            owner.highlightRows(-1, -1, null);
        this.currentWholeWord = wholeWord;
                new ResultSetValueController(owner.getController(), cellLocation, IValueController.EditType.NONE, null)
    }
        GridPos selection = owner.getSelection().getFirstElement();
        if (owner == null) {
import org.jkiss.code.Nullable;
import org.eclipse.ui.PlatformUI;

        int firstRow,
            searchForward,
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
        final Pattern searchPattern = this.searchPattern;
                    };
        }
    private boolean sessionActive = false;
    private GridPos getStartPosition(
import org.jkiss.dbeaver.model.struct.DBSDataContainer;

        @NotNull Spreadsheet spreadsheet,
        }
            cell.col, cell.row, true));
    }
        this.currentCaseSensitive = caseSensitive;
    @Nullable
    }
            log.error("Error updating cell value", e);
    @Override
        if (owner == null) {
        @NotNull GridPos pos,
    }
    // Calculates next cell position based on search direction
        List<GridPos> selRows = new ArrayList<>();

        this.searchPattern = pattern;
import org.jkiss.dbeaver.ui.UIUtils;
        int columnCount
    public void setReplaceAllMode(boolean replaceAll) {
    // Retrieves cell text based on mode and position
            return;
import java.util.regex.Pattern;
        final SpreadsheetPresentation owner = getActiveSpreadsheet();

    }
        return pos.row >= firstRow &&
 * See the License for the specific language governing permissions and
                    cellLocation.getAttribute(),
        return sessionActive;
            spreadsheet.setCellSelection(pos);
    }
    private String getCellText(
    ) {
            if (regEx) {
        boolean searchForward,
    }

    ) {
    /**
                updatedAttributes.add(cellLocation.getAttribute());
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
            log.error("Invalid search pattern: " + findString, e);
        int columnCount,
    // Stores the last found position for subsequent operations

                spreadsheet.redraw();
        boolean searchForward,
import org.eclipse.ui.IEditorPart;
    // Returns wrap-around position when reaching boundary

    }
        if (this.ownerIdentity == newOwner.hashCode()) {
        spreadsheet.setFocusItem(pos.row);
        ResultSetCellLocation cellLocation = owner.getCellLocation(cell);


    }
 * DBeaver - Universal Database Manager
    // Helper method to determine initial search position
        return getSelection();
        return searchPattern;
        while (checked <= totalCells) {
        if (selection == null) {
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
            }
            null;
        if (firstSearchInSession) {
        int minColumn,
    }

        if (control != null && !control.isDisposed()) {
import org.eclipse.core.runtime.Status;
        this.currentRegEx = regExSearch;
            }
               pos.col < columnCount;
        GridPos startPos = getStartPosition(
    }
    }
               pos.col >= minColumn &&
        int firstRow,
        }
import org.eclipse.ui.IWorkbenchWindow;
        }
            this.endSession();
    @Override
        int lastRow
        // Update spreadsheet state
            }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        // Lazy initialization of search pattern
        }
        storeLastFoundPosition(currentPos);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                                updatedRows.clear();
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetValueController;
        for (int rowNum = 0; rowNum < length; rowNum++) {
import org.jkiss.utils.CommonUtils;
    public Pattern getSearchPattern() {
        @NotNull GridPos pos,
    ) {
    @Override
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
import org.eclipse.swt.graphics.Point;
import org.eclipse.jface.text.IFindReplaceTarget;

 * you may not use this file except in compliance with the License.

            return;
        Pattern pattern = createSearchPattern(currentFindString, currentCaseSensitive, currentWholeWord, currentRegEx);
import org.eclipse.swt.widgets.Control;
            minColumn,
        this.searchPattern = null;

        }

        // Handle record mode special column
import org.jkiss.dbeaver.model.data.DBDContent;
               pos.row <= lastRow &&
                                redrawJob = null;
        this.sessionActive = true;
        if (owner != null) {
        GridPos currentPos = spreadsheet.getCursorPosition();
                next.row = (next.row <= firstRow) ? lastRow : next.row - 1;
    private int ownerIdentity;
    private boolean currentWholeWord;

    }
    }
        @NotNull String findString,
        if (lastRow < 0) {

        return instance;
        }
        }
                            return Status.OK_STATUS;
    }
            );
        final SpreadsheetPresentation owner = getActiveSpreadsheet();
            new GridPos(columnCount - 1, lastRow); // Bottom-right corner
    ) {
        boolean caseSensitive,
        this.originalSelection = new ArrayList<>(owner.getSpreadsheet().getSelection());
    private void storeLastFoundPosition(@NotNull GridPos pos) {
        // Standard cell value retrieval
        return cell != null ?

        }
        GridPos pos,
                    }

        GridCell cell = spreadsheet.posToCell(pos);
            refreshOwner(spreadsheet);
        return "Target: " + (dataContainer == null ? null : dataContainer.getName());
package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
import org.eclipse.jface.text.IFindReplaceTargetExtension3;
    }
            firstRow,
        }
        }
import org.jkiss.dbeaver.ui.controls.lightgrid.GridCell;
                                updatedAttributes.clear();
        spreadsheet.setFocusColumn(pos.col);
    private void selectCell(
        final SpreadsheetPresentation owner = getActiveSpreadsheet();

                        selectCell(spreadsheet, currentPos, minColumn);
 * Unless required by applicable law or agreed to in writing, software
        int maxRow = rowSelection.stream().mapToInt(v -> v).max().orElse(-1);
        if (searchPattern == null && !currentFindString.isEmpty()) {
    private void refreshOwner(@NotNull SpreadsheetPresentation newOwner) {
            if (scope == null) {
    @Override
                    !replaceAll);
        }
    public int findAndSelect(
            spreadsheet.redraw();
        spreadsheet.setCellSelection(pos);
 *
        } catch (DBException e) {
        boolean caseSensitive,
    public void setScope(IRegion scope) {

            new StructuredSelection(selRows));
    public void endSession() {
                // Standard value update
    private boolean currentRegEx;
            next.col--;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
        }
    }
        return true;
            }
        boolean caseSensitive,
        }
        // Default to boundary positions when no cursor
        boolean regEx
        }
        boolean isFirstSearch
import org.jkiss.code.NotNull;
        if (recordMode && pos.col == minColumn) {
            spreadsheet.setFocusItem(pos.row);
            }
                    .updateValue(originalValue, !replaceAll);
        processedCells.clear();
                                owner.getController().updatePanelsContent(false);
        }
            owner.getController().redrawData(true, true);


    private AbstractJob redrawJob = null;

        spreadsheet.showSelection();
    @Override
                currentWholeWord,

    private boolean isCellInScope(
        GridCell cell = spreadsheet.posToCell(selection);
            CommonUtils.toString(spreadsheet.getContentProvider().getCellValue(cell.col, cell.row, false)) :
        replaceSelection(text, false);
        return new Point(minRow, maxRow);
        boolean recordMode,
        }
import org.jkiss.dbeaver.model.data.DBDValueRow;
                if (redrawJob == null) {
            lastRow,
        }

        Spreadsheet spreadsheet = owner.getSpreadsheet();
                                owner.getController().redrawData(false, true);
        if (activeEditor == null) {
        int columnCount = owner.getSpreadsheet().getColumnCount();
import org.eclipse.swt.SWT;
                        }
            return "";
        this.ownerIdentity = newOwner.hashCode();
        } finally {
    ) {
                String pattern = wholeWord
            if (next.col < minColumn) {
            // Move left, wrap to previous row
        this.firstSearchInSession = true;

    }
            searchPattern = createSearchPattern(
 * You may obtain a copy of the License at
        boolean recordMode = owner.getController().isRecordMode();
        }
                }
        @NotNull Spreadsheet spreadsheet,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.viewers.StructuredSelection;
            updatedAttributes.clear();
        if (owner == null) {

                processedCells.add(selection);
                next.row = (next.row >= lastRow) ? firstRow : next.row + 1;
            this.beginSession();
                            }
    }
        }
        int totalCells = (lastRow - firstRow + 1) * (columnCount - minColumn);
import org.eclipse.jface.text.IRegion;
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
            return;
        ResultSetModel model = owner.getController().getModel();
            return null;
        }
                return;
        final SpreadsheetPresentation owner = getActiveSpreadsheet(false);
        if (pattern == null) {
 * Find/Replace target for result set viewer
            if (replaceAll) {
        } catch (PatternSyntaxException e) {
        try {
                next.col = columnCount - 1;
                currentFindString = "";
            return null;
        } else {
            pos = new GridPos(0, pos.row);
            columnCount,
        int columnCount
                            synchronized (REDRAW_SYNC) {
        return getActiveSpreadsheet(true);
    ) {
        }
                currentCaseSensitive,
        owner.highlightRows(-1, -1, null);
            if (replaceAll) {
    }
    @Override
        GridPos currentPos = owner.getSpreadsheet().getFocusPos();
    private final Set<DBDValueRow> updatedRows = new LinkedHashSet<>();
        boolean searchForward,
        return isFirstSearch ? currentPos :
                    String cellText = getCellText(spreadsheet, currentPos, recordMode, minColumn);
        if (searchPattern != null) {
                owner.getController().updateCellValue(
        if (pos.col == minColumn) {
            return null;
    public void setSelection(int offset, int length) {
     */
            return;
import java.util.*;
        }
import org.jkiss.dbeaver.Log;
                    redrawJob.schedule(150);
        boolean wholeWord,
            firstSearchInSession
            return -1;
            this.searchPattern = searchPattern;
                        return currentPos.row;
class SpreadsheetFindReplaceTarget implements IFindReplaceTarget, IFindReplaceTargetExtension, IFindReplaceTargetExtension3 {

        return CommonUtils.toString(value);
        if (replaceAll && processedCells.contains(selection)) {
                spreadsheet.deselectAll();
        Control control = owner.getControl();
        if (instance == null) {
            // Move right, wrap to next row
                            });

    }
        }
                pos = new GridPos(0, pos.row);
                        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            // Update spreadsheet focus and selection
        }
        // Handle record mode special column (-1 indicates record selector column)
            if (owner.getController().isRecordMode() && pos.col == -1) {
                selRows.add(new GridPos(col, offset + rowNum));
        }
    @Nullable
        if (findString.isEmpty()) {


                    ? "\\b" + Pattern.quote(findString) + "\\b"
                currentRegEx
    }
    public static synchronized SpreadsheetFindReplaceTarget getInstance() {
            for (int col = 0; col < columnCount; col++) {
        if (spreadsheet == null) {
        return spreadsheet;
                currentFindString,
            return -1;
    @Override
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return spreadsheet.getLabelProvider().getText(spreadsheet.getRow(pos.row));
    }
        return owner != null && owner.getController().getReadOnlyStatus() == null;
            if (isCellInScope(currentPos, firstRow, lastRow, minColumn, columnCount)) {
import org.jkiss.dbeaver.ui.controls.lightgrid.GridPos;
        final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
                content.updateContents(new VoidProgressMonitor(), new StringContentStorage(newValue));
    }
        boolean wholeWord,
        return scopeHighlightColor;
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.replaceAll = replaceAll;
        }
            getNextPosition(currentPos, searchForward, columnCount, minColumn, firstRow, lastRow);
        GridCell cell = owner.getSpreadsheet().posToCell(selection);
                    redrawJob = new AbstractJob("Redraw grid after replace") {
        if (workbenchWindow == null) {
            }
     * Uses {@link Object#hashCode()} to identity the current owner and determine whether he was changed or not.
    @Override
    private SpreadsheetPresentation getActiveSpreadsheet(boolean refreshActiveSpreadsheet) {
    private SpreadsheetPresentation getActiveSpreadsheet() {
        int minColumn

    public Color getScopeHighlightColor() {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        int minColumn = recordMode ? -1 : 0;

        }
