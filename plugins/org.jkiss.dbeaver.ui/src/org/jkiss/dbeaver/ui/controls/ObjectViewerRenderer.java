    }
        Object cellValue = getCellValue(lastClickItem.getData(), selectedColumn);
                                break;
    }
                    Image image = DBeaverIcons.getImage(booleanStyle.getIcon());
    public boolean isTree()
                } else if (cellValue instanceof Boolean) {
                    if (disabled) {
    private TableItem detectTableItem(int x, int y)
                case LEFT:
        ColumnViewer viewer,

        selectedItem = null;
        @Override

                        case RIGHT:
        }
                        Point textExtent = gc.textExtent(strValue);
        gc.setForeground(item.getDisplay().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW));
    private TreeItem detectTreeItem(int x, int y)
        return false;
                    //tip = getCellString(cellValue);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        UIUtils.dispose(linkLayout);
        }

        @Override
        Point pt = new Point(x, y);

import org.jkiss.code.Nullable;
        linkLayout.setIndent(0);
    {
                    final Rectangle imageBounds = image.getBounds();
        if (value == null) {
 * DBeaver - Universal Database Manager
        }
        if (trackInput) {
                value = ((DBPNamedObject) value).getName();

            linkBounds.height -= 2;
import org.jkiss.dbeaver.ui.UIElementAlignment;
    @NotNull
                Boolean value;
    }
            linkLayout.dispose();
                } else {
                    textBounds = ((TreeItem) event.item).getTextBounds(event.index);

                        case CENTER:
                        image.dispose();
                linkLayout.draw(gc, textBounds.x, textBounds.y);
        @Override
                    navigateHyperlink(cellValue);
        final int w = bounds.width / 2;
 *
    public ObjectViewerRenderer(

        }

                }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.selectionBackgroundColor = display.getSystemColor(SWT.COLOR_LIST_SELECTION);
        private void resetCursor()
    }
        public void mouseDown(MouseEvent e)
                    }
                @Override
    private final Color selectionBackgroundColor;
                Object element = hoverItem.getData();

                                gc.drawString(strValue, event.x + columnBounds.width - textExtent.x - 4, event.y + (columnBounds.height - textExtent.y) / 2, true);
    private Rectangle getCellLinkBounds(Item item, int column, Object cellValue) {

        @Override
    @NotNull
            itemsViewer.getControl().addMouseMoveListener(actionsListener);
                resetCursor();
                case CENTER:
                    switch (getBooleanAlignment(value)) {
import org.eclipse.jface.viewers.AbstractTreeViewer;
    {
                        switch (getBooleanAlignment(value)) {
import org.eclipse.swt.widgets.*;
            if (hoverItem != null && selectedColumn >= 0 && e.button == 1) {
                }
            };
                mousePoint = itemsViewer.getControl().getDisplay().map(null, itemsViewer.getControl(), mousePoint);
    public void paintCell(Event event, Object element, Object cellValue, Widget item, Class<?> propDataType, int columnIndex, boolean editable, boolean selected) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            switch (getBooleanAlignment((Boolean) cellValue)) {


        selectedColumn = -1;
        if (RuntimeUtils.isLinux()) {
            updateCursor(e.x, e.y, e.stateMask);
                }

                        String strValue = booleanStyle.getText();
        //this.linkColor = display.getSystemColor(SWT.COLOR_BLUE);
                            break;
    private class MouseListener extends MouseAdapter {
        itemsViewer = viewer;

        return (TableItem) selectedItem;
                                gc.drawString(strValue, event.x + (columnBounds.width - textExtent.x) / 2, event.y + (columnBounds.height - textExtent.y) / 2, true);
    {

import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleSet;
                    boolean isHyperlink = cellValue instanceof Boolean || (ctrlPressed && isHyperlink(element, cellValue));
        public void mouseExit(MouseEvent e)
        }

    }
                                gc.drawString(strValue, event.x + 4, event.y + (columnBounds.height - textExtent.y) / 2, true);
import org.eclipse.swt.events.*;
        selectedItem = getTree().getItem(pt);
                itemBounds = ((TableItem) item).getBounds(column);
                if (event.item instanceof TreeItem) {
public abstract class ObjectViewerRenderer {
                    }
    private Tree getTree()
 * Unless required by applicable law or agreed to in writing, software
        selectedColumn = -1;
                selectedColumn = 0;
import org.jkiss.code.NotNull;
                    selectedItem = lastClickItem = (Item) e.item;
                itemBounds = ((TreeItem)item).getBounds(column);
                int checkColumn = selectedColumn;
    {
        return isTree ? ((TreeItem) item).getBounds(columnIndex) : ((TableItem) item).getBounds(columnIndex);
    }
            return "";
            getControl().getFont(),
        }
    public void dispose()
        }
        };
                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ui.UIUtils;
                            case LEFT:
    class CellTrackListener implements MouseTrackListener, MouseMoveListener, KeyListener {
    }
package org.jkiss.dbeaver.ui.controls;
            return linkBounds;
                    itemBounds.x += itemBounds.width - booleanValueWith - 4;
            } else {

    private final TextLayout linkLayout;
        }

    protected UIElementAlignment getBooleanAlignment(@Nullable Boolean value) {
                        Rectangle columnBounds = getColumnBounds((Item) item, columnIndex);
        prepareLinkStyle(cellValue, null);
                    }
import org.eclipse.jface.util.IPropertyChangeListener;
            } else {
        Display display = itemsViewer.getControl().getDisplay();
    public String getSelectedText()
/*
            }
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyle;
    {
            } else if (cellValue != null && isHyperlink(element, cellValue)) {
    }
        }
import org.jkiss.dbeaver.ui.controls.bool.BooleanMode;
                if (cellValue == null) {

 *
        public void mouseHover(MouseEvent e)
        } else {
    }
        return getCellString(cellValue, false);
                    value = CommonUtils.toBoolean(cellValue);
        return (Composite) itemsViewer.getControl();
        if (selectedItem == null) return null;
    }


        gc.drawLine(e.x + w - 5, e.y + h / 2, e.x + w + 5, e.y + h / 2);
        linkLayout.setText(text);
    }
                itemBounds = ((TableItem)item).getTextBounds(column);
            }
        itemsViewer.getControl().setCursor(arrowCursor);
                } else {
}
                }
        {
            }
    }
            }
        });
            if (e.keyCode == SWT.CTRL || e.keyCode == SWT.ALT) {
    {
        if (lastClickItem == null || selectedColumn == -1) {
    public void navigateHyperlink(Object cellValue)
    {
                hoverItem = detectTableItem(x, y);
                hoverItem = detectTreeItem(x, y);
                value = ((DBPNamedValueObject) value).getObjectValue();
                    }
                // Print link


        {
    {
    protected ColumnViewer getItemsViewer()


                        image = new Image(image.getDevice(), image, SWT.IMAGE_GRAY);

        this.arrowCursor = display.getSystemCursor(SWT.CURSOR_ARROW);
    private transient Item selectedItem, lastClickItem;
                        case LEFT:
    }
                    value = (Boolean)cellValue;
                Object cellValue = getCellValue(element, checkColumn);
        ColumnViewer viewer)
                updateCursor(mousePoint.x, mousePoint.y, e.keyCode);
            } else if (value instanceof DBPNamedObject) {
    // List sorter
        selectedItem = getTable().getItem(pt);
//                        (boolValue ? ImageUtils.getImageCheckboxEnabledOn() : ImageUtils.getImageCheckboxEnabledOff()) :
                        gc.setForeground(UIUtils.getSharedColor(booleanStyle.getColor()));
                event.doit = false;
            }
            itemsViewer.getControl().addKeyListener(actionsListener);
import org.jkiss.dbeaver.utils.GeneralUtils;
            }

import org.jkiss.utils.CommonUtils;

/**
            }
        BooleanStyleSet.installStyleChangeListener(viewer.getControl(), styleChangeListener);
                    break;
//                    Image image = editable ?
    private BooleanStyleSet booleanStyles;
    protected ObjectViewerRenderer(
 * See the License for the specific language governing permissions and
        // Print link
                }
    public boolean isHyperlink(Object element, @Nullable Object cellValue)
                    gc.setBackground(getControl().getBackground());
                if (booleanStyles.getMode() == BooleanMode.TEXT) {
            resetCursor();
            itemBounds.width = booleanValueWith;
            GC gc = event.gc;

import org.jkiss.dbeaver.utils.RuntimeUtils;
        String displayString = GeneralUtils.makeDisplayString(value).toString();

        selectedItem = null;
                    String cellText = item instanceof TreeItem ? ((TreeItem) item).getText(columnIndex) : "";
                            gc.drawImage(image, event.x + 4, event.y + (columnBounds.height - imageBounds.height) / 2);
        if (cellValue instanceof Boolean && booleanValueWith > 0) {
            }
                }
                    break;
        final GC gc = e.gc;



        public void keyReleased(KeyEvent e) {
                            case CENTER:
            if (!nameColumn && value instanceof DBPNamedValueObject) {
        }

        linkLayout.setStyle(linkStyle, 0, text.length());
            if (isTree) {
        styleChangeListener.propertyChange(null);
            } else {
                if (isHyperlink(element, cellValue) && getCellLinkBounds(hoverItem, checkColumn, cellValue).contains(e.x, e.y)) {
import org.eclipse.jface.viewers.ColumnViewer;
                        getItemsViewer().getControl().setCursor(linkCursor);
            itemsViewer.getControl().addMouseListener(new MouseListener());
        return displayString;
        }
        itemsViewer.getControl().addDisposeListener(e -> {
    }
 * you may not use this file except in compliance with the License.
    }
                getTable().addSelectionListener(selectionAdapter);
                Object cellValue = getCellValue(element, checkColumn);
    }

    // Current selection coordinates
    {
        return itemsViewer;
                itemBounds = ((TreeItem)item).getTextBounds(column);
            return null;

        final int h = bounds.height;
        @Override
    private final Cursor linkCursor;
    }

            if (Boolean.class == propDataType || Boolean.TYPE == propDataType) {
        {
    public BooleanStyleSet getBooleanStyles() {
            Rectangle itemBounds;

        @Override

import org.eclipse.jface.viewers.TreeViewer;
            Rectangle itemBounds;
    @NotNull
    {
    {
                    boolean ctrlPressed = (stateMask & SWT.CTRL) != 0 || (stateMask & SWT.ALT) != 0;
            SelectionAdapter selectionAdapter = new SelectionAdapter() {
                        }
    //////////////////////////////////////////////////////
                getTree().addSelectionListener(selectionAdapter);
        return ((TreeViewer)itemsViewer).getTree();
            }
            if (isTree) {
import org.eclipse.swt.graphics.*;
        }
    private boolean isTree;
            null);
        return booleanStyles;
        {
            // If we don't do that, cells might be stretched to enormous dimensions.

    public Composite getControl()
//                        (boolValue ? ImageUtils.getImageCheckboxDisabledOn() : ImageUtils.getImageCheckboxDisabledOff());
        linkStyle.underline = true;
            }
            if (isTree) {

                            gc.drawImage(image, event.x + columnBounds.width - imageBounds.width - 4, event.y + (columnBounds.height - imageBounds.height) / 2);
        if (selectedItem == null) {
                } else {
                } else {
        linkStyle.underlineStyle = SWT.UNDERLINE_LINK;
                if (cellValue == null) {

                                break;
                public void widgetSelected(SelectionEvent e) {
            if ((e.stateMask & SWT.CTRL) == 0 && (e.stateMask & SWT.ALT) == 0) {
                    textBounds = ((TableItem) event.item).getTextBounds(event.index);
        {
            }
                            case RIGHT:
                            break;
                booleanValueWith = -1;
 *
            Item hoverItem;
            } else {

                // Reset selected column to the first one (seems to be cursor navigation)
                                break;
            final CellTrackListener actionsListener = new CellTrackListener();
 * limitations under the License.
    }
                    itemBounds.x += 4;
    }
        {
            if (isTree) {
        // Both table and tree are composites so its ok
        }
    public static String getCellString(@Nullable Object value, boolean nameColumn)
            if (isTree) {

 */

        String text = getCellString(cellValue, false);
        final Rectangle bounds = getColumnBounds((Item) item, columnIndex);
import org.jkiss.dbeaver.ui.DBeaverIcons;
        selectedColumn = UIUtils.getColumnAtPos((TableItem) selectedItem, x, y);
                Point mousePoint = itemsViewer.getControl().getDisplay().getCursorLocation();
                    if (disabled) {
        } else {
            }
            lastClickItem = hoverItem;
    private transient int selectedColumn = -1;
            return null;
                    resetCursor();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            linkBounds.x += itemBounds.x;
        public void keyPressed(KeyEvent e) {
        return isTree;
    //private final Color linkColor;
    {
import org.jkiss.dbeaver.model.DBPNamedObject;
                        booleanValueWith = textExtent.x;

                // Navigate only if CTRL pressed
                    if (cellText.isEmpty()) {

import org.jkiss.dbeaver.runtime.DBWorkbench;
                hoverItem = detectTableItem(e.x, e.y);
        }
            itemsViewer.getControl().addMouseTrackListener(actionsListener);
    public abstract Object getCellValue(Object element, int columnIndex);
        @Override
 */
    {
                            gc.drawImage(image, event.x + (columnBounds.width - imageBounds.width) / 2, event.y);
                    if (isHyperlink && getCellLinkBounds(hoverItem, checkColumn, cellValue).contains(x, y)) {
                return;
                        resetCursor();

        }
                    final boolean disabled = event.widget instanceof Control && !((Control) event.widget).isEnabled();
                prepareLinkStyle(cellValue, selected ? gc.getForeground() : JFaceColors.getHyperlinkText(event.item.getDisplay()));

import org.jkiss.dbeaver.model.DBPNamedValueObject;

                        // Paint only if item text is empty
                    value = null;
            if (e.keyCode == SWT.CTRL || e.keyCode == SWT.ALT) {
                final BooleanStyle booleanStyle = booleanStyles.getStyle(value);
                    }
                int checkColumn = selectedColumn;
        public void mouseMove(MouseEvent e)
import org.eclipse.jface.resource.JFaceColors;
        this.linkCursor = display.getSystemCursor(SWT.CURSOR_HAND);
        return (TreeItem) selectedItem;
        selectedColumn = UIUtils.getColumnAtPos((TreeItem) selectedItem, x, y);
            Item hoverItem;


 * ObjectListControl

            return itemBounds;
        this.isTree = (itemsViewer instanceof AbstractTreeViewer);
            foreground,
    {

        this.linkLayout = new TextLayout(display);
        this(viewer, true);

                updateCursor(mousePoint.x, mousePoint.y, SWT.NONE);
    @Nullable
        return ((TableViewer)itemsViewer).getTable();
                    itemBounds.x += (itemBounds.width - booleanValueWith) / 2;
        {
import org.eclipse.swt.SWT;
    }
        // do nothing. by default all cells are not navigable

            getItemsViewer().getControl().setCursor(arrowCursor);
        Point pt = new Point(x, y);
            linkBounds.y += itemBounds.y + 1;
    // Cache
            } else {

    private void prepareLinkStyle(Object cellValue, Color foreground)
            if (hoverItem == null || selectedColumn < 0) {
            booleanStyles = BooleanStyleSet.getDefaultStyles(DBWorkbench.getPlatform().getPreferenceStore());
    private ColumnViewer itemsViewer;
            displayString = CommonUtils.getSingleLineString(displayString);

                hoverItem = detectTreeItem(e.x, e.y);
 * You may obtain a copy of the License at
                Object element = hoverItem.getData();
                case RIGHT:
            } else {
        public void mouseEnter(MouseEvent e)
            }
        final IPropertyChangeListener styleChangeListener = event -> {
        }
        return booleanStyles.getStyle(value).getAlignment();
import org.eclipse.jface.viewers.TableViewer;
            } else {

    }
        TextStyle linkStyle = new TextStyle(
                    booleanValueWith = imageBounds.width;
    {
                    } else {
        private void updateCursor(int x, int y, int stateMask) {
                    Rectangle columnBounds = getColumnBounds((Item) item, columnIndex);
    }

                        //gc.setBackground(getControl().getBackground());
    private final Cursor arrowCursor;
    public void paintInvalidCell(@NotNull Event e, @NotNull Widget item, int columnIndex) {
                Rectangle textBounds;
                            break;
                mousePoint = itemsViewer.getControl().getDisplay().map(null, itemsViewer.getControl(), mousePoint);
        boolean trackInput)
            Rectangle linkBounds = linkLayout.getBounds();
    private transient int booleanValueWith;
    private Table getTable()
                Point mousePoint = itemsViewer.getControl().getDisplay().getCursorLocation();
    private Rectangle getColumnBounds(@NotNull Item item, int columnIndex) {
