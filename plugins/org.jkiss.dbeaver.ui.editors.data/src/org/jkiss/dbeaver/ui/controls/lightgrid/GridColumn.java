            return this;
    /**
        parent.addChild(this);
import org.eclipse.swt.graphics.GC;
                if (hint.isReadOnly()) {

     * @return the tooltip text
    HintsInfo getHintInfo() {
            pc.width += delta;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (image != null) {
        filterBounds.y = bounds.y + GridColumnRenderer.TOP_MARGIN;
            int columnHintsWidth = grid.getContentProvider().getColumnHintsWidth(this);
        return height + childHeight;
    private void addChild(GridColumn gridColumn) {
            if (topIndex >= 0 && bottomIndex >= topIndex) {
        boolean readOnly;
 */
        return width;
 * You may obtain a copy of the License at
        Rectangle bounds = getBounds();
        grid.newColumn(this, -1);
        if (columnHints != null) {
        this.grid = grid;
    }
    }
        }
    }
            if (Boolean.TRUE.equals(labelProvider.getGridOption(IGridLabelProvider.OPTION_EXCLUDE_COLUMN_NAME_FOR_WIDTH_CALC))) {
            if (columnHintsWidth > 0) {
    @Override
        sortBounds.y = bounds.y + GridColumnRenderer.TOP_MARGIN;
/**
                childrenWidth += child.getWidth();

            int topIndex = grid.getTopIndex();

     *
    }
    }
     *
        int x = 0;
    private final int level;
    void setWidth(int width, boolean redraw) {
        Rectangle bounds = new Rectangle(0, 0, 0, 0);
        return element;

            height = -1;
        if (isFilterable()) {
    }
                }
    private int computeCellWidth(GC gc, IGridRow row) {
public class GridColumn implements IGridColumn {
            x += rightMargin + GridColumnRenderer.getSortControlBounds().width + GridColumnRenderer.IMAGE_SPACING;
                textWidth = gc.stringExtent(text).x;
        if (!CommonUtils.isEmpty(children)) {
                if (newValueWidth > newWidth) {
    private static final int rightMargin = 6;
                    int descWidth = gc.stringExtent(description).x;
        return grid.getContentProvider().getSortOrder(this) != SWT.NONE;

        for (GridColumn pc = parent; pc != null; pc = pc.parent) {
     *
            final String description = grid.getLabelProvider().getDescription(this);
        if (isSortable()) {
        if (height < 0) {

        this.element = element;
                newWidth = childrenWidth;
    /**
        bounds.width = getWidth();

 * distributed under the License is distributed on an "AS IS" BASIS,
        this.element = element;
 * Unless required by applicable law or agreed to in writing, software
            x += image.getBounds().width + imageSpacing;
                childHeight = Math.max(childHeight, child.getHeaderHeight(true, false));
        IGridContentProvider.CellInformation cellInfo = grid.getContentProvider().getCellInfo(
    /**
            if (image != null) {
    /**



    }
        String tip = grid.getLabelProvider().getToolTipText(this);
    }
    }
     * Returns the bounds of this column's header.
        for (GridColumn p = parent; p != null; p = p.parent) {
import org.eclipse.swt.graphics.Rectangle;
    public boolean isPinned() {
        }

    @Override

     */
import org.jkiss.dbeaver.ui.DBeaverIcons;
                height += topMargin + grid.fontMetrics.getHeight();
    public GridColumn(LightGrid grid, Object element) {
    }
        if (contentProvider.getSortOrder(this) <= 0 && !contentProvider.isElementSupportsSort(this)) {
        return x;
    public GridColumn getFirstLeaf() {
        List<DBPImage> icons = new ArrayList<>();
        }
            int maxValueWidth = 0;
    @Override
     */
        } else {
                        textWidth = descWidth;
    public boolean isOverIcon(int x, int y) {
        imgBounds.y += bounds.y + GridColumnRenderer.TOP_MARGIN;
                    }
        setWidth(width, true);
                GridColumn lastChild = children.get(children.size() - 1);
            return Math.max(x, childWidth);



    }
import org.eclipse.swt.SWT;
            int childWidth = 0;

        this.width = width;
                    newWidth = newValueWidth;

 * limitations under the License.
            int childrenWidth = 0;
        IGridContentProvider contentProvider = grid.getContentProvider();
    public boolean isFilterable() {
/*
    }
import java.util.ArrayList;
            }
            for (IGridHint hint : columnHints) {

                    info.icons.add(icon);
        } else {
                if (!CommonUtils.isEmpty(description)) {
            }
                for (int i = topIndex; i <= bottomIndex && i < itemCount; i++) {

    }
    }
            if (p == col) {
    private int width = DEFAULT_WIDTH;
            // Respect hints
        x += GridColumnRenderer.getFilterControlBounds().width;
    }


            }
    public GridColumn(GridColumn parent, Object element) {

        if (reflect) {
            }
        }
        }
    public int getRelativeIndex() {
        }

 *
        }
            if (!CommonUtils.isEmpty(description)) {
    public String toString() {
    private static final int leftMargin = 6;

    }
        HintsInfo info = new HintsInfo();
import java.util.List;
    public boolean isSortable() {
    public int getWidth() {
        grid.newColumn(this, -1);
    }
    }
            children = new ArrayList<>();
    @Nullable
        }
        if (children == null) {

            if (newWidth > childrenWidth) {
        Image image = labelProvider.getImage(this);
        this.parent = parent;
import org.jkiss.dbeaver.model.DBPImage;
        } else {
    public int getLevel() {
    }

 *

        }
            return false;
        }
                    maxValueWidth = Math.max(maxValueWidth, computeCellWidth(gc, grid.getRow(i)));
        return filterBounds.contains(x, y);
    @Override
        filterBounds.x = bounds.width - filterBounds.width - GridColumnRenderer.RIGHT_MARGIN;
    private static final int imageSpacing = 3;

 *
            imageBounds = GridCellRenderer.LINK_IMAGE_BOUNDS;
        Rectangle sortBounds = GridColumnRenderer.getSortControlBounds();

        sortBounds.x = bounds.width - sortBounds.width - GridColumnRenderer.RIGHT_MARGIN;
    /**
                }
        return tip;


            return children.get(0).getFirstLeaf();
     * Default width of the column.
    private int height = -1;
            }
            grid.setScrollValuesObsolete();
                if (columnHintsWidth > 16) columnHintsWidth= 16;
            } else {
    @Override
 * Holds information about column width and other UI properties

    }
        {


        }
        int newWidth = computeHeaderWidth(gc);
    }
        bounds.x = loc.x;
    public String getHeaderTooltip() {
     */
            x += imageBounds.width + insideMargin;
        }
    }
        children.add(gridColumn);
        int state = cellInfo.state;
        return parent == null ? pinIndex : parent.getPinIndex();
    public boolean isOverFilterButton(int x, int y) {
 *
        return grid.getContentProvider().isElementSupportsFilter(this);

     * @return the parent grid.
                String description = labelProvider.getDescription(this);
     */
        this.level = 0;
        }
    }
                int itemCount = grid.getItemCount();
                DBPImage icon = hint.getIcon();
        HintsInfo hint = getHintInfo();
import org.eclipse.swt.graphics.Image;
        Rectangle bounds = getBounds();
        if (redraw) {
                String text = labelProvider.getText(this);
    }
        return imgBounds.contains(x, y);
        return CommonUtils.toString(element);
        }
        return info;
        }
     *
            }
            } else {
            for (DBPImage hi : hint.icons) {
import org.eclipse.swt.graphics.Point;

    private static final int DEFAULT_WIDTH = 10;
                    info.readOnly = true;
    public Object getElement() {
        }
        if (tip == null) {
     * Causes the receiver to be resized to its preferred size.
            }
        if (CommonUtils.isEmpty(children)) {
        Rectangle imageBounds;
        }
                maxIconWidth = Math.max(maxIconWidth, DBeaverIcons.getImage(hi).getBounds().width);
        return x;
        return pinIndex >= 0 || parent != null && parent.isPinned();
            height = topMargin + grid.fontMetrics.getHeight() + bottomMargin;
            imageBounds = image == null ? null : DBeaverIcons.getImage(image).getBounds();
    static final int bottomMargin = 6;
     * Sets the width of the column.

                height = Math.max(height, topMargin + image.getBounds().height + bottomMargin);
            return false;
            for (GridColumn child : children) {
    int getHeaderHeight(boolean includeChildren, boolean forceRefresh) {


    }
    @Nullable
        if (forceRefresh) {
    int computeHeaderWidth(GC gc) {
        imgBounds.x += bounds.x + GridColumnRenderer.LEFT_MARGIN;
    private final LightGrid grid;
        Rectangle imgBounds = image.getBounds();
    Rectangle getBounds() {
        x += leftMargin;
        Point loc = grid.getOrigin(this, -1);
        this.level = parent.level + 1;
        if (children == null) {
    public void setWidth(int width) {
    public int getPinIndex() {
            return false;
package org.jkiss.dbeaver.ui.controls.lightgrid;
    public int getIndex() {

     */
    @Override
    }
    }
        Rectangle filterBounds = GridColumnRenderer.getFilterControlBounds();


        return grid;
        return level;
            x += maxIconWidth;
    @Override
    }
    private final Object element;
        return children;

        return parent == null ? -1 : parent.getChildren().indexOf(this);
        return bounds;
            this, row, false);
    @Override
                }
        this.pinIndex = pinIndex;
        }
        int x = leftMargin;
    }
                if (icon != null) {
 */
        int delta = width - this.width;
            }
     * Returns the tooltip of the column header.
        if (imageBounds != null) {
    private int pinIndex = -1;
        Rectangle bounds = getBounds();

import org.jkiss.code.Nullable;

            Image image = grid.getLabelProvider().getImage(this);
            // Calculate width of visible cells
     * Returns the parent grid.

        if (!isFilterable()) {

 * See the License for the specific language governing permissions and
     */
        return grid.getContentProvider().getColumnHints(this, 0);
                return true;
    public void setPinIndex(int pinIndex) {
            for (GridColumn child : children) {
    public GridColumn getParent() {
    protected List<IGridHint> getColumnHints() {
            int maxIconWidth = GridColumnRenderer.IMAGE_SPACING;
                // Header width bigger than children width
    public boolean isOverSortArrow(int x, int y) {

        int childHeight = 0;

            }

            sortBounds.x -= GridColumnRenderer.getFilterControlBounds().width + GridColumnRenderer.IMAGE_SPACING;
        }
    }
        final IGridLabelProvider labelProvider = grid.getLabelProvider();
     *
                }
            setWidth(newWidth, false);
        this.grid = parent.grid;
    public List<GridColumn> getChildren() {
            grid.redraw();
        return grid.indexOf(this);
        children.remove(column);

                }
    /**
}        if (!hint.icons.isEmpty()) {


        String cellText = grid.getCellText(cellInfo.text);
    public LightGrid getGrid() {
        x += gc.textExtent(cellText).x + rightMargin;
     * Returns the width of the column.

    private void removeChild(GridColumn column) {
        List<IGridHint> columnHints = getColumnHints();
    }
    @Override
 * Grid column info.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    void pack(GC gc, boolean reflect) {
            DBPImage image = cellInfo.image;
            x += textWidth + rightMargin;
        return false;
     * @param width new width
    }
        }
    public boolean isParent(GridColumn col) {
     */
        }
            }
    }
                int newValueWidth = maxValueWidth + columnHintsWidth * gc.stringExtent("x").x;
            this.width = newWidth;
        bounds.y = loc.y;
import org.jkiss.utils.CommonUtils;
                    newWidth = Math.max(newWidth, maxValueWidth);
    private final GridColumn parent;
                child.pack(gc, reflect);
    static final int topMargin = 6;

        return parent;
                textWidth = gc.stringExtent("X").x;
            int bottomIndex = grid.getBottomIndex();
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            int textWidth;
 * @author serge@dbeaver.com
            }


     * @return width of column

            tip = grid.getLabelProvider().getText(this);
    private static final int insideMargin = 3;
 * you may not use this file except in compliance with the License.
        if (image == null) {
        return sortBounds.contains(x, y);
        } else {
            for (GridColumn child : children) {
            }

    public static class HintsInfo {
    private List<GridColumn> children;
 * DBeaver - Universal Database Manager

        this.parent = null;
        if (GridCellRenderer.isLinkState(state)) {
        bounds.height = grid.getHeaderHeight();


        if (includeChildren && !CommonUtils.isEmpty(children)) {
                childWidth += child.computeHeaderWidth(gc);
        }
                    if (descWidth > textWidth) {

        Image image = grid.getLabelProvider().getImage(this);
                lastChild.setWidth(lastChild.getWidth() + newWidth - childrenWidth);
     * @return bounds of the column header
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
