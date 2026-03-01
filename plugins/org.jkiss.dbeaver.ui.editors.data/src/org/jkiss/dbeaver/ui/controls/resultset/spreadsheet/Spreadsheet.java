 * distributed under the License is distributed on an "AS IS" BASIS,

                                    }
//            case SWT.KeyUp:
        GridPos newPos = new GridPos(curPos.col, curPos.row);
                                if (currentCellLocation.getAttribute() != null && currentCellLocation.getRow() != null) {
import org.eclipse.swt.graphics.GC;
                if (pos.row == 0) {
                            editorControl.getDisplay().post(kdEvent);
import org.eclipse.swt.dnd.Clipboard;
        minHeight = editorSize.y;
                                }
                    tableEditor.verticalAlignment = SWT.CENTER;
        @NotNull final IGridLabelProvider labelProvider,
    public boolean isRowVisible(int rowNum) {
    public void cancelInlineEditor() {
import org.jkiss.dbeaver.ui.controls.resultset.*;
                                    if (textValue != null) {
    //static final Log log = Log.getLog(Spreadsheet.class);
    @Override
        Rectangle bounds = super.getBounds();
                    final SpreadsheetPresentation presentation = getPresentation();
                            break;
                        presentation.getPreferenceStore().getString(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK),
                        GridPos focusPos = cellToPos(focusCell);

        this.gridController = gridController;
                    if (editorControl == null || editorControl.isDisposed()) {
        super.redraw(bounds.x, bounds.y, bounds.width, bounds.height, true);
    public Clipboard getClipboard() {
                        (event.keyCode >= SWT.KEYPAD_0 && event.keyCode <= SWT.KEYPAD_9) ||
        return contentProvider;

        return site;
import java.util.Map;

        if (oldEditor != null) {
    /**
                        setFocus();
                            if (editorControl instanceof Text) {
                    isHoveringOnHeader() ? null : getRowByPosition(focusPos),
        @Nullable final IGridController gridController) {
import org.eclipse.swt.custom.StyledText;
                newCol = getColumnCount() - 1;
        hookAccessibility();
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MenuDetectEvent;
                        (event.keyCode == '-' || event.keyCode == '+' || event.keyCode == SWT.KEYPAD_ADD || event.keyCode == SWT.KEYPAD_SUBTRACT) ||

                                    Object textValue = selFormats.get(TextTransfer.getInstance());
        this.setLayout(layout);
        layout.makeColumnsEqualWidth = false;
                }
    }
                Point p = toDisplay(new Point(r.x + r.width, r.y));
        tableEditor.minimumHeight = minHeight;// + placeholder.getBorderWidth() * 2;//placeholder.getBounds().height;
                            presentation.openValueEditor(true);
            // Exclude editor input contributions from context menu

            newPos.row = newRow;
    public IGridController getGridController() {
        if (xOffset != 0) {

        super.addListener(SWT.MouseDoubleClick, this);
                        presentation.getController().getAttributeReadOnlyStatus(attribute, true, true) == null &&
            return null;
                        case INLINE_EDITOR:
                forceFocus();
    @Override

                                        valueReflector.insertCurrentCellValue(currentCellLocation.getAttribute(), cellValue, CommonUtils.toString(textValue));
        super.addListener(SWT.KeyDown, this);
            if (newCol >= getColumnCount()) {
    @Override

/**

            }
     * @return cursor position.
                        patchEventWithLocalRect(e, getCellBounds(focusPos.col, focusPos.row));

    private final IWorkbenchPartSite site;
import org.jkiss.dbeaver.ui.UIIcon;
    }
            int newRow = curPos.row + yOffset;
        accessibilityEnabled = false;
                    (GridCell) event.data,
                    GridCell focusCell = getFocusCell();
                        // #5949
            }

            return new GridPos(-1, -1);
import org.eclipse.swt.graphics.Point;
                    isRecordMode ? null : getColumnByPosition(focusPos),
import org.eclipse.swt.dnd.TextTransfer;
        if (curPos == null) {
    public enum DoubleClickBehavior {
                            editorControl.setFocus();
            site.registerContextMenu(menuMgr, presentation);
 *
        super.addListener(SWT.MouseDown, this);
/*

        return presentation;
       {
                presentation.fillContextMenu(
    private Clipboard clipboard;
    }
            }

                    return;
        return gridController;
    }
    }
    @NotNull
                    switch (doubleClickBehavior) {
                                presentation.openValueEditor(true);
        refreshData(true, false, fitValue);
                }
        }
                            // Set editor value
        menuMgr.addMenuListener(manager -> {

        if (presentation.getController().isRecordMode() && getColumnCount() > 1) {
        super.selectCell(pos);
        GridPos pos = getFocusPos();
 */
        super.addListener(SWT.Selection, listener);
                boolean ctrlPressed = ((event.stateMask & SWT.CTRL) != 0);
                    if (focusCell != null) {
 *
        }
        });

                        event.keyCode != SWT.CR) {
            }
    }
                    isRecordMode ? getRowByPosition(focusPos) : null,
    }
                                ResultSetCellLocation currentCellLocation = presentation.getCurrentCellLocation();
                            break;
                } else {
    /**
    }
    public GridCell getCursorCell() {
*/
                if (pos != null && focusPos != null && pos.equals(super.getFocusPos())) {

        return super.getFocusCell();
    boolean isAccessibilityEnabled() {

        @NotNull final Composite parent,

        // It will automatically turn on once we detect ACC events
    }
        }
    @NotNull
        selectionEvent.data = cell;
    }
                e.y = p.y;
        // Move row
    private final IGridLabelProvider labelProvider;

    
    @NotNull
        this.presentation = presentation;
    public static final int MAX_INLINE_EDIT_WITH = 300;
                        case COPY_PASTE_VALUE: {
                        }
        this.contentProvider = contentProvider;
        GridPos curPos = getCursorPosition();
    @Override
    public void addCursorChangeListener(Listener listener) {
            ((IEditorSite) site).registerContextMenu("spreadsheet_menu", menuMgr, presentation, false);
                    redraw();
                        // Set focus to spreadsheet only i
                    event.x,
    public Spreadsheet(
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return clipboard;
        GridCell newCell = posToCell(newPos);
    private final IGridContentProvider contentProvider;
                    if (UIUtils.getDisplay().getFocusControl() == null) {
        }
    public void refreshData(boolean refreshColumns, boolean keepState, boolean fitValue) {
                }
        return accessibilityEnabled;
    }
                    isHoveringOnHeader(),
                newRow = getItemCount() - 1;
        GridPos pos = cellToPos(cell);
                );
    }
    public void redrawGrid() {


            });
                            presentation.openValueEditor(false);
            super.showItem(pos.row);

                    clipboard.dispose();
    }
                                    ResultSetCopySettings copySettings = new ResultSetCopySettings();
        Control oldEditor = tableEditor.getEditor();
    }
    @NotNull
import org.eclipse.swt.graphics.Rectangle;
    @Nullable
        });
                        patchEventWithLocalRect(e, getColumnBounds(focusColumn.getIndex()));
import org.eclipse.swt.SWT;
            }
        addMenuDetectListener(new MenuDetectListener() {
            super.setFocusColumn(pos.col);
                    if (editorControl != null && attribute != null &&
        COPY_PASTE_VALUE
                            IResultSetValueReflector valueReflector = GeneralUtils.adapt(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.eclipse.ui.IWorkbenchPartSite;
                    (event.keyCode == SWT.CR ||

                            );
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                        case NONE:
        if (site instanceof IEditorSite) {
                    Character.isLetterOrDigit(event.character)) {
     */
import org.eclipse.swt.layout.GridLayout;
    @Override
        tableEditor.minimumWidth = 50;
                            } else if (editorControl instanceof StyledText) {
        tableEditor.layout();
 * Licensed under the Apache License, Version 2.0 (the "License");
            notifyListeners(SWT.Selection, selectionEvent);
        SpreadsheetAccessibleAdapter.install(this);
            super.addDisposeListener(e -> {

                boolean isRecordMode = presentation.getController().isRecordMode();
                                    Map<Transfer, Object> selFormats = presentation.copySelection(copySettings);
 * You may obtain a copy of the License at
            }
                    isHoveringOnRowHeader()
                    } else if (focusColumnElement != null) {
                            kdEvent.type = event.type;
        @NotNull final IWorkbenchPartSite site,
        super.addListener(SWT.MouseUp, this);
    private void hookAccessibility() {
            super.deselectAll();
        super.setMenu(menu);
        if (minWidth > MAX_INLINE_EDIT_WITH) {
            case SWT.MouseUp:
     *
                            break;
        }
        Event selectionEvent = new Event();
                        }

        } else {
                newCol = 0;
        cancelInlineEditor();
     */
                    isHoveringOnRowHeader() ? null : getColumnByPosition(focusPos),

import org.jkiss.dbeaver.utils.GeneralUtils;
        return focusPos.row >= 0 && focusPos.row < gridRows.length ? gridRows[focusPos.row] : null;
        layout.numColumns = 1;

        if (pos.row >= 0) {
            if (newRow < 0) {
                break;
                    isHoveringOnRowHeader()
        Point editorSize = editor.computeSize(SWT.DEFAULT, SWT.DEFAULT);

        super.setLinesVisible(true);
        return labelProvider;
                oldEditor.dispose();
    public GridPos getCursorPosition() {
        tableEditor.grabVertical = true;
                if (e.detail == SWT.MENU_KEYBOARD) {
                GridPos pos = super.getCell(new Point(event.x, event.y));
        @NotNull final SpreadsheetPresentation presentation,
                        IGridColumn focusColumn = getColumnByElement(focusColumnElement);
        }
    }
    @Nullable
                UIUtils.asyncExec(() -> presentation.navigateLink(
        this.labelProvider = labelProvider;
*/
                        case COPY_VALUE: {
                    manager,
        }


            } else {
        }
                            } else {
                if (event.button != 1 || isHoveringOnLink()) {
    @NotNull
                    isHoveringOnHeader(),
    public IGridContentProvider getContentProvider() {
                                ((Text) editorControl).insert(strValue);
        EDITOR,
                break;
                );
                presentation.changeSorting(event.data, event.stateMask);
        int minHeight, minWidth;
                }
                    DoubleClickBehavior doubleClickBehavior = CommonUtils.valueOf(DoubleClickBehavior.class,
                            ResultSetCopySettings copySettings = new ResultSetCopySettings();
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        }
     * Returns grid row by grid position
                            final Event kdEvent = new Event();
                        (event.keyCode >= 'a' && event.keyCode <= 'z') ||
        tableEditor.minimumWidth = minWidth;

                presentation.handleColumnIconClick(event.data);

    @Override
        super.showItem(item, topOffset);
        tableEditor.horizontalAlignment = SWT.LEFT;
    }
    private IGridRow getRowByPosition(GridPos focusPos) {
                }
import org.jkiss.dbeaver.ui.DBeaverIcons;
                super.showColumn(pos.col);
                            break;
                if (tableEditor.getEditor() != null) {
        // Move row
        tableEditor.grabHorizontal = true;
        menuMgr.setRemoveAllWhenShown(true);
        }

    @Nullable
                    final DBDAttributeBinding attribute = presentation.getCurrentAttribute();
    void setCursor(@NotNull GridCell cell, boolean keepSelection, boolean showColumn, boolean notify) {
        super.refreshData(refreshColumns, keepState, fitValue);

                presentation.fillContextMenu(
import org.eclipse.swt.graphics.Image;
    private final SpreadsheetCellEditor tableEditor;
    }
            gc.drawImage(searchIcon, 3, y + 3);
                    }
                UIUtils.asyncExec(() -> {
                            // So let's just insert first letter (it will remove old value which must be selected for inline controls)
    public void handleEvent(final Event event) {
            case LightGrid.Event_FilterColumn:
        tableEditor.setEditor(editor, pos.col, pos.row);
    @NotNull
        super.setMaxColumnDefWidth(DBWorkbench.getPlatform().getPreferenceStore().getInt(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH));
                GridPos focusPos = super.getFocusPos();
            if (newRow >= getItemCount()) {
                        (event.keyCode >= '0' && event.keyCode <= '9')) ||
    private final IGridController gridController;
            if (showColumn) {
                            // Forward the same key event to just created control
    }
    }
                    Control editorControl = tableEditor.getEditor();
        presentation.toggleCellValue(column, row);
                }
            if (isColumnContextMenuShouldBeShown()) {
        this.clipboard = new Clipboard(getDisplay());
                if (!ctrlPressed &&
import org.jkiss.code.NotNull;
        // Cancel all editors
                        }
    public IWorkbenchPartSite getSite() {
            }
                            kdEvent.keyCode = event.keyCode;

        COPY_VALUE,
                            copySettings.setFormat(DBDDisplayFormat.EDIT);

                    Object focusColumnElement = getFocusColumnElement();
        return super.getFocusPos();
import org.eclipse.swt.widgets.*;
                break;
                            return;
            if (newCol < 0) {
    protected void paintTopLeftCellCustom(GC gc, int y) {
        // Move column
        if (xOffset == 0 && yOffset == 0) {
                if (clipboard != null && !clipboard.isDisposed()) {
            // Let controller to provide it's own menu items
                                IResultSetValueReflector.class);


            private void patchEventWithLocalRect(MenuDetectEvent e, Rectangle r) {
        }
 * ResultSetControl
            @Override
                    }
import org.jkiss.code.Nullable;
        super.setRowHeaderVisible(true);
                break;

                e.x = p.x;
        this.accessibilityEnabled = enabled;
                }
        Menu menu = menuMgr.createContextMenu(this);
            setCursor(newCell, keepSelection, true, true);

        super.addListener(SWT.KeyUp, this);
                        case EDITOR:

        if (!keepSelection) {
 * Unless required by applicable law or agreed to in writing, software

    private final SpreadsheetPresentation presentation;
        super.addListener(LightGrid.Event_ChangeSort, this);
public class Spreadsheet extends LightGrid implements Listener {
        super.addListener(LightGrid.Event_NavigateLink, this);
    @NotNull
        super.setHeaderVisible(true);
                }
                break;
        }
import org.jkiss.dbeaver.ui.controls.lightgrid.*;
import org.eclipse.ui.IEditorSite;
            newPos.col = newCol;

            if (!oldEditor.isDisposed()) {
    }
import org.eclipse.swt.events.MenuDetectListener;
        final int style,
        }
        }
    public SpreadsheetPresentation getPresentation() {
        if (notify) {
        if (newCell != null) {
                    event.y,
    }
    }
    }
        
                            if (valueReflector != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void packColumns(boolean fitValue) {
                                presentation.getController().getContainer(),
     */
        NONE,
            int newCol = curPos.col + xOffset;
            // Change selection event
                });
                // Perform navigation async because it may change grid content and
    @Override
    public void showCellEditor(Composite editor) {
    void setAccessibilityEnabled(boolean enabled) {
                    }
            case LightGrid.Event_NavigateLink:
    }
        layout.marginHeight = 0;
        layout.marginWidth = 0;
                                // No value reflector - open inline editor then
                        DoubleClickBehavior.NONE);
/*
 *

            tableEditor.setEditor(null);
        GridLayout layout = new GridLayout(1, true);
                            // We used to forward key even to control but it worked poorly.

        }

        return focusPos.col >= 0 && focusPos.col < getColumnCount() ? getColumn(focusPos.col) : null;
                    event.stateMask));
/*
    }
            }

            }
}
        MenuManager menuMgr = new MenuManager(null, AbstractPresentation.RESULT_SET_PRESENTATION_CONTEXT_MENU);
     * Note: returned object is not immutable and will be changed if user will change focus cell
    @Override
import org.jkiss.utils.CommonUtils;
        // Move column
        return rowNum >= super.getTopIndex() && rowNum <= super.getBottomIndex();
                                    Object cellValue = presentation.getController().getModel().getCellValue(currentCellLocation);
            super.setFocusItem(pos.row);
                            }
        super.addListener(LightGrid.Event_FilterColumn, this);
        tableEditor.verticalAlignment = SWT.TOP;
                    }
                    setFocusColumn(columnByElement.getIndex());
    @Nullable
    /**
                    tableEditor.getEditor().forceFocus();
                            String strValue = String.valueOf(event.character);
import org.eclipse.jface.action.MenuManager;
                                presentation.copySelection(copySettings)
        // Disable accessibility support.
    protected void toggleCellValue(IGridColumn column, IGridRow row) {
 * limitations under the License.
            case SWT.KeyDown:
            return false;
        @NotNull final IGridContentProvider contentProvider,
            Image searchIcon = DBeaverIcons.getImage(UIIcon.SEARCH);
                newRow = 0;
        super.redraw();
        tableEditor = new SpreadsheetCellEditor(this);
                break;
                    tableEditor.verticalAlignment = SWT.TOP;
        return true;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
    @NotNull
            GridPos focusPos = getFocusPos();
                if (columnByElement != null) {

            public void menuDetected(MenuDetectEvent e) {
        if (yOffset != 0) {
    }
 * DBeaver - Universal Database Manager
                            }
        }
        if (pos.col >= 0) {
                    manager,
    public boolean shiftCursor(int xOffset, int yOffset, boolean keepSelection) {
        if (super.isDisposed()) {

        this.site = site;
    private GridColumn getColumnByPosition(GridPos focusPos) {
    private void hookContextMenu() {
    @NotNull
                            kdEvent.character = event.character;
                IGridColumn columnByElement = getColumnByElement(event.data);
    }
            case LightGrid.Event_ChangeSort:
                        if (!editorControl.isDisposed()) {
        INLINE_EDITOR,

 * you may not use this file except in compliance with the License.
            case SWT.MouseDown:
            selectionEvent.data = cell;
        if (super.isDisposed()) {
                            ResultSetUtils.copyToClipboard(
            return false;
            
                                ((StyledText) editorControl).insert(strValue);
    private boolean accessibilityEnabled;
                    }
     * Returns grid column by grid position
            case SWT.MouseDoubleClick:
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
                break;
    public IGridLabelProvider getLabelProvider() {
                        editorControl = presentation.openValueEditor(true);
        minWidth = editorSize.x;
        hookContextMenu();
 */
    public void showItem(int item, int topOffset) {
        super(parent, style);
            minWidth = MAX_INLINE_EDIT_WITH;
     * Returns current cursor position
        switch (event.type) {
package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
    }
                // we don't want to mess current grid state
