
    public static final int RIGHT_MARGIN = 6;
    protected Font getColumnFont(IGridColumn element) {

            bounds.width -= width;
        { // Sort icon
                bounds.width -= getSortControlBounds().width;
            int hy = bounds.y;
            gc.drawImage(columnImage, bounds.x, bounds.y);
 *
    {
        return grid.getLabelProvider().getText(item);
    public static final Image IMAGE_ASC = DBeaverIcons.getImage(UIIcon.SORT_DECREASE);
                }
    private static final boolean PAINT_COLUMN_FOCUS_BORDER = true;


/*
import org.jkiss.utils.CommonUtils;
            if (showSortIconAlways || sortOrder > 0) {
                maxWidth = Math.max(maxWidth, imageBounds.width);
            if (maxWidth > 0) maxWidth += IMAGE_SPACING;
                gc.drawImage(hintImage, bounds.x, hy);
            }
    private static final boolean SHIFT_PAINT_ON_SELECTION = false;
    protected Image getColumnImage(IGridItem element) {
        }
        gc.fillRectangle(bounds.x, bounds.y, bounds.width, bounds.height);

                bounds.width -= getFilterControlBounds().width;
        if (PAINT_COLUMN_FOCUS_BORDER && isFocused) {
    }
        }
            gc.setForeground(grid.getLabelProvider().getHeaderReadOnlyColor());
    public static final int ARROW_MARGIN = 6;
            gc.setLineWidth(1);
 */

            }
            gc.drawLine(bounds.x, bounds.y, bounds.x, bounds.y + bounds.height - 1);
                break;
                bounds.y += TOP_MARGIN + fontHeight;
    protected String getColumnText(IGridItem item)
    public static final Image IMAGE_DESC = DBeaverIcons.getImage(UIIcon.SORT_INCREASE);

                bounds.width -= IMAGE_SPACING;
    public static final int TOP_MARGIN = 4;
    public static final Image IMAGE_ASTERISK = DBeaverIcons.getImage(UIIcon.SORT_UNKNOWN);
            gc.drawLine(bounds.x + 1, bounds.y + 1, bounds.x + 5, bounds.y + 1);
    public static final int BOTTOM_MARGIN = 6;
        bounds.x += LEFT_MARGIN;
        return IMAGE_DESC.getBounds();
                bounds.width -= IMAGE_SPACING;
                gc.setFont(grid.commentFont);
            bounds.width -= maxWidth;
            int maxWidth = 0;
                break;
                gc.drawImage(IMAGE_ASC, bounds.x, bounds.y);
    {

    public static Rectangle getFilterControlBounds() {
 * You may obtain a copy of the License at
        { // Draw column name
 * distributed under the License is distributed on an "AS IS" BASIS,
            gc.drawLine(bounds.x + 2, bounds.y + 2, bounds.x + 4, bounds.y + 2);
        }
            bounds.x += width;
        return font != null ? font : grid.normalFont;


        if (columnImage != null) {
            Rectangle imageBounds = columnImage.getBounds();
            final int sortOrder = contentProvider.getSortOrder(element);
            gc.drawLine(bounds.x + bounds.width - 1, bounds.y, bounds.x + bounds.width - 1, bounds.y + bounds.height - 1);
    public static final int LEFT_MARGIN = 6;
class GridColumnRenderer extends AbstractRenderer {
                gc.setForeground(grid.getLabelProvider().getHeaderForeground(element, selected || hovering));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        int fontHeight = grid.fontMetrics.getHeight();
import org.eclipse.swt.graphics.GC;

        if (SHIFT_PAINT_ON_SELECTION && (hovering || selected)) {
                gc.drawImage(IMAGE_FILTER, bounds.x + bounds.width, bounds.y);
    
            gc.drawLine(bounds.x, bounds.y, bounds.x + 6, bounds.y);
    // Shifts everything to the right by 1 pixel if the column is selected or hovered. Doesn't work well the hover detection
    }

            for (DBPImage hi : hintInfo.icons) {
            gc.drawLine(bounds.x + 1, bounds.y + 2, bounds.x + 5, bounds.y + 2);
        }
        GridColumn.HintsInfo hintInfo = element.getHintInfo();
            gc.setLineWidth(1);
        return grid.getLabelProvider().getDescription(item);
        }
/*


import org.eclipse.swt.graphics.Rectangle;
    }


            gc.drawLine(bounds.x + bounds.width - 1, bounds.y, bounds.x + bounds.width - 1, bounds.y + bounds.height - 1);
    public static void paintSort(GC gc, Rectangle bounds, int sort, boolean forcePaintDefault)
                if (hintInfo.icons.size() == 1) {
    protected String getColumnDescription(IGridColumn item)
            gc.setForeground(grid.getLabelProvider().getHeaderBorder(element));
    {
                if (forcePaintDefault) {

            final int width = imageBounds.width + IMAGE_SPACING;
                paintSort(gc, new Rectangle(bounds.x + bounds.width, bounds.y, 0, 0), sortOrder, showSortIconAlways);

    public static final Image IMAGE_FILTER = DBeaverIcons.getImage(UIIcon.DROP_DOWN);
    }

 * DBeaver - Universal Database Manager

 *
                gc.drawImage(IMAGE_DESC, bounds.x, bounds.y);


        } else {

    }
import org.jkiss.dbeaver.model.DBPImage;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.code.Nullable;
    public static final int FILTER_WIDTH = IMAGE_FILTER.getBounds().width;
        if (isSelected()) {
 * See the License for the specific language governing permissions and
        boolean isFocused = element == grid.getFocusColumn();
        }
package org.jkiss.dbeaver.ui.controls.lightgrid;
    	return IMAGE_FILTER.getBounds();
                Rectangle imageBounds = hintImage.getBounds();
            gc.setFont(getColumnFont(element));
            gc.drawLine(bounds.x, bounds.y, bounds.x + bounds.width - 1, bounds.y);
 * Grid column renderer
 * you may not use this file except in compliance with the License.
            String text = getColumnDescription(element);
import org.jkiss.dbeaver.ui.UIIcon;
            gc.setClipping((Rectangle) null);
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others

            gc.drawLine(bounds.x + 2, bounds.y + 1, bounds.x + 4, bounds.y + 1);
 * limitations under the License.
        super(grid);
            gc.drawPoint(bounds.x + 3, bounds.y);
    public static Rectangle getSortControlBounds() {
        bounds.height -= TOP_MARGIN + BOTTOM_MARGIN;
        }

 */
        switch (sort) {
import org.eclipse.swt.graphics.Image;
        }

    public  GridColumnRenderer(LightGrid grid) {
            gc.drawLine(bounds.x, bounds.y + bounds.height - 1, bounds.x + bounds.width - 1, bounds.y + bounds.height - 1);
            gc.drawPoint(bounds.x + 3, bounds.y + 3);
    public static final int IMAGE_SPACING = 3;

        final IGridContentProvider contentProvider = grid.getContentProvider();

        { // Drop-down icon
            gc.drawLine(isFocused ? bounds.x + 1 : bounds.x, bounds.y + bounds.height - 2, bounds.x + bounds.width - 2, bounds.y + bounds.height - 2);


        if (!CommonUtils.isEmpty(hintInfo.icons)) {
        gc.setFont(grid.normalFont);
                hy -= TOP_MARGIN;
                Image hintImage = DBeaverIcons.getImage(hi);
                    hy = (bounds.height - imageBounds.height) / 2;
    }
            case SWT.DOWN:
}
            bounds.y += 1;
                break;
        if (hintInfo.readOnly) {



    }
                gc.setClipping(bounds.x, bounds.y, bounds.width, fontHeight);
/**
import org.eclipse.swt.SWT;
        gc.setForeground(grid.getLabelProvider().getHeaderForeground(element, selected || hovering));
            bounds.x += maxWidth;
        return grid.getLabelProvider().getImage(element);
            final boolean showSortIconAlways = contentProvider.isElementSupportsSort(element);
            gc.setForeground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
            final boolean hasFilters = contentProvider.isElementSupportsFilter(element);
            }
import org.eclipse.swt.graphics.Font;
        bounds.width -= LEFT_MARGIN + RIGHT_MARGIN;
 *
            }
            gc.drawString(text, bounds.x, bounds.y, true);
        }


            case SWT.DEFAULT:
        { // Draw column description
            if (hasFilters) {
            if (hintInfo.icons.size() > 1) {
        gc.setBackground(grid.getLabelProvider().getHeaderBackground(element, selected || hovering));
            final String text = UITextUtils.getShortString(grid.fontMetrics, getColumnText(element), bounds.width);

            if (!CommonUtils.isEmpty(text)) {
            }
    @Nullable
    public static final int SORT_WIDTH = IMAGE_DESC.getBounds().width;
import org.jkiss.dbeaver.ui.UITextUtils;
                gc.setClipping((Rectangle) null);
            bounds.x += 1;
 * Unless required by applicable law or agreed to in writing, software
                }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        Font font = grid.getLabelProvider().getFont(element);
        bounds.y += TOP_MARGIN;
            gc.drawLine(bounds.x, bounds.y + 3, bounds.x + 6, bounds.y + 3);
    }
        // Draw border
            gc.setClipping(bounds.x, bounds.y, bounds.width, fontHeight);
                hy += imageBounds.height + 1;
    public void paint(GC gc, Rectangle bounds, boolean selected, boolean hovering, GridColumn element) {
        final Image columnImage = getColumnImage(element);
                gc.drawString(text, bounds.x, bounds.y, true);
                    gc.drawImage(IMAGE_ASTERISK, bounds.x, bounds.y);

            case SWT.UP:
*/
    public static final int SORT_HEIGHT = IMAGE_DESC.getBounds().height;
        }
    // The border was disabled because it looked goofy
                text = UITextUtils.getShortString(grid.fontMetrics, text, bounds.width);
    }
            gc.drawLine(bounds.x, bounds.y + bounds.height - 1, bounds.x + bounds.width - 1, bounds.y + bounds.height - 1);
