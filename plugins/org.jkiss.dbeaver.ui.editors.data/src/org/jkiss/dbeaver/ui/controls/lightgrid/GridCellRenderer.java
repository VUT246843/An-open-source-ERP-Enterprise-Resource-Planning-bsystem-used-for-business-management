                    if (drawCellTextSegment(gc, replacement, bounds, disabledForeground, disabledForeground, replacement.length() > 1)) {
    }
        int hintLeftPos = bounds.x + x + textSize.x + LEFT_MARGIN;
            Rectangle imageBounds;
        }
            }
        if (CommonUtils.isEmpty(cellHints)) {
            gc.setForeground(colorLineFocused);
                        if (useClipping) {
            gc.fillRectangle(bounds.x, bounds.y, bounds.width, bounds.height);
        @NotNull Color activeForeground,
        }
        @NotNull String text,
                image = null;
        if (text.isEmpty()) {
                        textTopPos,


                iconsWidth += iconSize.width + 1;

            DBPImage hintIcon = hint.getIcon();
                        gc.drawString(
        IGridController gridController = grid.getGridController();
            if (iconList != null) {
                case IGridContentProvider.ALIGN_CENTER:
        {"\u0010", "DLE"},
                    boolean useClipping = valueWidth > bounds.width;
        int textTopPos,
                        iconX,

        if (image != null && imageBounds != null && columnAlign == IGridContentProvider.ALIGN_RIGHT) {
            }
        Color background,
            bounds.width -= 2;
        IGridContentProvider.CellInformation cellInfo = grid.getContentProvider().getCellInfo(col, row, selected);

                sizingGC.dispose();
/*


        Point origin = grid.getOrigin(column, row);
                        if (selected) {
            }
            }
            x -= rowElement.getLevel() * LEVEL_INDENT;
        {"\u0012", "DC2"},
                        );
        Rectangle imageBounds = null;
    boolean isOverLink(GridColumn column, int row, int x, int y) {
            bounds.x += 2;
        Point cellOrigin = grid.getOrigin(column, row.getVisualPosition());
        }
                    x >= cellOrigin.x + column.getWidth() - 4 - iconsWidth - iconSize.width &&
        }
        {"\n", "¶"},
                        }
                        );
    }
                            //gc.setFont(ResultSetThemeSettings.instance.resultSetFont);
                        } else {

        IGridContentProvider.CellInformation cellInfo,
                    break;
                Rectangle iconSize = hintImage.getBounds();
        bounds.x += extent.x;
                case IGridContentProvider.ALIGN_RIGHT: {
            // Get shortern version of string

                        iconInfo.hintImage,
                DBPImage cellImage = cellInfo.image;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



        String text,
                    bounds.y + bounds.height
    public GridCellRenderer(LightGrid grid) {

                        bounds.x + bounds.width - (textSize.x + RIGHT_MARGIN + imageMargin),
 * You may obtain a copy of the License at
                        valueWidth += imageBounds.width + INSIDE_MARGIN;
                            foreground = grid.getLabelProvider().getHintForeground();
                        return true;
        {"\u001F", "US"},
                    gc.drawString(
                    int valueWidth = textSize.x + INSIDE_MARGIN;
            // let's make it a bit worse by precisely calculating the length
            }
            // of the cropped segment using binary search
                            bounds.x + x,
        @NotNull Rectangle bounds,
                gc.drawLine(
            for (String[] mapping : SPECIAL_CHARACTERS_MAP) {
        {"\u0011", "DC1"},
                if (x >= cellOrigin.x + column.getWidth() - 4 - iconsWidth - iconSize.width) {
    private static @NotNull Color getDisabledForeground(IGridContentProvider.CellInformation cellInfo) {
            while (low <= high) {
            }
                case IGridContentProvider.ALIGN_LEFT:
                            hintLeftPos,
                int leftDivPos = bounds.x + bounds.width - iconsPaddingWidth;
                image = ((state & IGridContentProvider.STATE_LINK) != 0) ? LINK_IMAGE : LINK2_IMAGE;
        {"\u0019", "EM"},
        }
}
        if (segment.isEmpty()) {
        gc.setTextAntialias(SWT.ON);
            int columnAlign = cellInfo.align;
            cellInfo.background = grid.getBackground();
                    }
        }

        Image image;
    ) {

                int iconRightPos = bounds.x + bounds.width - 4;
        int state) {
            (state & IGridContentProvider.STATE_HYPER_LINK) != 0;
                            gc.setClipping(bounds.x, bounds.y, bounds.width - imageMargin, bounds.height);
                        return true;
        @NotNull GC gc,
                        iconList = new ArrayList<>();
    }
                String hintText = hint.getText();
        // Check hints


                }
            switch (columnAlign) {
                    gc.drawString(

        }

        int x,
    private record IconInfo(Image hintImage, Rectangle iconSize) {
            gc.drawRoundRectangle(bounds.x, bounds.y, extent.x, extent.y - 1, 2, 2);
                    }
        int y,
        IGridRow row,
                        drawCellTextDecorated(gc, originalText, cellInfo, new Rectangle(
    private static final Log log = Log.getLog(GridCellRenderer.class);
 * limitations under the License.
                if (!CommonUtils.isEmpty(hintText)) {
            if (cellImage != null) {
            String clipped = segment;
                    break;
import org.jkiss.utils.CommonUtils;
            drawTextAndAdvance(gc, "...", disabledForeground, bounds, false);

                    x <= cellOrigin.x + column.getWidth() - 4) {
        IGridRow row,

    private boolean isOverHintAction(
                        if (hint.isError()) {
        if (extent.x > bounds.width) {
                    Rectangle iconSize = iconInfo.iconSize;

                    }
        final Color disabledForeground = getDisabledForeground(cellInfo);
                Rectangle iconSize = hintImage.getBounds();
                            bounds.width - LEFT_MARGIN - RIGHT_MARGIN,
        boolean hover
    private boolean drawCellTextSegment(
        } else {
 * Unless required by applicable law or agreed to in writing, software
                    if (x >= origin.x + leftMargin && x <= origin.x + leftMargin + imageBounds.width &&
                    image = DBeaverIcons.getImage(cellImage);
                for (IconInfo iconInfo : iconList) {
        }
    ) {
        int x,
                imageBounds = LINK_IMAGE_BOUNDS;

            return false;
                } else {
        }
            if (isToggle) {
        IGridRow row,
            gc.drawImage(image, bounds.x + bounds.width - imageBounds.width - RIGHT_MARGIN, y);
                final boolean regionMatches = text.regionMatches(index, expected, 0, expected.length());
        }
            return true;
                        isTransparent
                        }
                return false;
                            bounds.height
        {"\t", "»"},
        int x,
                if (cellImage == null) {
 *
        boolean highlight
                if (hintIcon != null) {
            int high = segment.length();
                    );
        Rectangle bounds,
 * DBeaver - Universal Database Manager
                        bounds.x + (bounds.width - textSize.x) / 2,
        {"\u001E", "RS"},
import org.jkiss.dbeaver.ui.UIUtils;
                        iconY
    }

        @NotNull Rectangle bounds,
        final Point extent = gc.textExtent(segment);
                imageBounds = image.getBounds();
        List<IGridHint> cellHints = grid.getContentProvider().getCellHints(column, row, cellInfo.value, 0);

                    if (imageBounds != null) {
            drawCellTextSegment(gc, text.substring(start), bounds, activeForeground, disabledForeground, false);
                    gc.drawImage(
        int index = 0;
        {"\u0003", "ETX"},
                    int iconY = bounds.y + (bounds.height - iconSize.height) / 2;
        Point cellOrigin,
                            isTransparent
                    Image hintImage = DBeaverIcons.getImage(hintIcon);
        }
            gc.drawRectangle(bounds.x + 1, bounds.y, bounds.width - 2, bounds.height - 1);
            DBPImage hintIcon = hint.getIcon();
                gc.drawRectangle(bounds.x + 2, bounds.y + 1, bounds.width - 4, bounds.height - 3);
                    break;
                    iconList.add(new IconInfo(hintImage, iconSize));
                    return;
        {"\u0014", "DC4"},
        }
    private static final int RIGHT_MARGIN = 6;
        {"\u0007", "BEL"},
            return false;
                    int width = column.getWidth();
                    if (x >= origin.x + leftMargin + leftIndent && x <= origin.x + leftMargin + leftIndent + imageBounds.width &&

        IGridContentProvider.CellInformation cellInfo,
            }
        IGridColumn col,



        {"\u0001", "SOH"},
                    } else {
import org.jkiss.dbeaver.ui.UITextUtils;
        }
        gc.setForeground(foreground);
        IGridContentProvider.CellInformation cellInfo = grid.getContentProvider().getCellInfo(
        }
            } else {
        for (IGridHint hint : cellHints) {
        @NotNull String segment,
            }
        if (focus || hover) {
                    matched = true;
            log.error("No grid controller");
                    bounds.y,
package org.jkiss.dbeaver.ui.controls.lightgrid;
                    iconsPaddingWidth,
        while (index < text.length()) {
                    hint.performAction(gridController, grid.toDisplay(x, y), state);
            drawTextAndAdvance(gc, clipped, activeForeground, bounds, false);
        GC gc,
 * Copyright (C) 2010-2026 DBeaver Corp and others
                final int mid = (low + high) >>> 1;
 *     http://www.apache.org/licenses/LICENSE-2.0

                int iconsPaddingWidth = iconsWidth + 7;
            text = UITextUtils.getShortString(grid.fontMetrics, text, width);
        {" ", "·"},

        final Color activeForeground = cellInfo.foreground;
                );
                gc.setBackground(oldBg);

            if (hintIcon != null) {
            return;
            x += row.getLevel() * LEVEL_INDENT;
            }
        Point textSize = gc.textExtent(text);
        // Get cell text
                        gc.setClipping((Rectangle) null);
                gc.setBackground(background);
        return UIUtils.getSharedColor(
        if (highlight) {
        boolean focus,
                    if (imageBounds != null) {
                    // Right (numbers, datetimes)
        {"\u0018", "CAN"},
        int columnAlign = cellInfo.align;
        {"\u0006", "ACK"},
 */
            List<IconInfo> iconList = null;

import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.code.NotNull;

        int y
            if (contentProvider.isElementReadOnly(column)) {
            return;
                        return true;

                    leftDivPos,

            gc.drawImage(image, bounds.x + x, y);
            (state & IGridContentProvider.STATE_LINK) != 0 ||
    public void executeHintAction(
            }
                gc.setLineStyle(SWT.LINE_SOLID);
    }
                }
            }

        {"\u007F", "DEL"}
    ) {
            return false;
            } else {
                        } else {
            int low = 0;
        int iconsWidth = 0;
        {"\u0017", "ETB"},
                    valueWidth += RIGHT_MARGIN;

                }
                            gc.setClipping(bounds);
        {"\u000E", "SO"},
            text = CommonUtils.getSingleLineString(text);
                    break;
                    leftDivPos,
    private static final String[][] SPECIAL_CHARACTERS_MAP = {
            int y = bounds.y + (bounds.height - imageBounds.height) / 2;
                gc.fillRectangle(

                    image = ((state & IGridContentProvider.STATE_LINK) != 0) ? LINK_IMAGE : LINK2_IMAGE;
        colorLineFocused = grid.getDisplay().getSystemColor(SWT.COLOR_LIST_FOREGROUND);
                Image hintImage = DBeaverIcons.getImage(hintIcon);
        if (CommonUtils.isEmpty(cellHints)) {
            // Replace linefeeds with space
            }
    private static final int TEXT_TOP_MARGIN = 1;
                    break;
        if (cellInfo.foreground == null) {
                        }


        String text = grid.getCellText(cellInfo.text);
                        y >= origin.y + verMargin && y <= origin.y + verMargin + imageBounds.height) {
                imageBounds = image.getBounds();
            return;
        }
import org.eclipse.swt.SWT;



                gc.setLineWidth(2);
                    Rectangle iconSize = hintImage.getBounds();
                    y <= cellOrigin.y + grid.getItemHeight() - 4 &&
        return isOverHintAction(rowElement, column, cellInfo, origin, x, y);
            int y = bounds.y + (bounds.height - imageBounds.height) / 2;
                case IGridContentProvider.ALIGN_CENTER: {
                            textTopPos,
                    }
                } else if (val > bounds.width) {
                    if (textSize.x < bounds.width - LEFT_MARGIN) {
            extent.x += 2;
                }
        }
        {"\u0013", "DC3"},
        {
    }
        if (isToggle) {
                    }
public class GridCellRenderer extends AbstractRenderer {
    static final Image LINK_IMAGE = DBeaverIcons.getImage(UIIcon.LINK);
        boolean highlight
        }
    private void renderHints(
                    }
                    gc.setLineStyle(SWT.LINE_DOT);
        int x = image == null ? LEFT_MARGIN : LEFT_MARGIN / 2;
        if (hover || focus) {
                    leftDivPos,
            if (!textHintRendered) {
                    } else {
                        ));
        }
        }
        gc.drawString(text, bounds.x, bounds.y, true);
                        gc.drawString(
                // No more space
                    }
        gc.setForeground(cellInfo.foreground);
                        y >= origin.y + verMargin && y <= origin.y + verMargin + imageBounds.height) {
                case IGridContentProvider.ALIGN_RIGHT:

                    high = mid - 1;
        if (isLinkState(state) || isToggle) {
import org.eclipse.swt.graphics.*;
        }
        for (IGridHint hint : cellHints) {
        {"\u0015", "NAK"},

        List<IGridHint> cellHints = grid.getContentProvider().getCellHints(column, row, cellInfo.value, 0);
                    bounds.y,
                        // Reduce bounds by link image size
        bounds.width -= extent.x;
    ) {
        } else {
import java.util.ArrayList;
                } else {
                Image image;
                    if (x >= origin.x + width - (leftMargin + imageBounds.width) && x <= origin.x + width &&

                }
            if (image == null && isLinkState(state)) {
                }
                    }
        final String originalText = text;
            int leftMargin = LEFT_MARGIN / 2;
                }
        int start = 0;
            if (grid.isFocusControl()) {
                        return;
                }
    private static final int LEFT_MARGIN = 6;
                Point textSize = sizingGC.textExtent(cellText);
                            gc.setFont(grid.getLabelProvider().getMainFontItalic());
                DBPImage hintIcon = hint.getIcon();
                            foreground = grid.getLabelProvider().getErrorForeground();
        }
                // Center
            return;
    public void paint(GC gc, Rectangle bounds, boolean selected, boolean focus, boolean hover, IGridColumn col, IGridRow row) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    }
    }
                    return true;
        {"\u0000", "NUL"},
        @NotNull GC gc,
                final int val = gc.textExtent(clipped + "...").x;
                // Render icons
                        text,
                final String replacement = mapping[1];
                index += 1;
                if (regionMatches) {
            gc.setBackground(cellInfo.background);
        if (start < text.length()) {
 * See the License for the specific language governing permissions and
                break;
        }
                    int iconX = iconRightPos - iconSize.width;
        {"\u001B", "ESC"},

            x += imageBounds.width + INSIDE_MARGIN;
            if (hintIcon != null) {
        boolean isToggle = (state & IGridContentProvider.STATE_TOGGLE) != 0;
        }
                    );
                if (!focus) {
                    iconRightPos -= iconSize.width + 1;
        return

            }

        }
                    renderHints(gc, bounds, col, row, cellInfo, selected, text, cellInfo.background, x, textTopPos, focus, hover);
                            hintText,
            final Font font = cellInfo.font;
    }
            int verMargin = (grid.getItemHeight() - imageBounds.height) / 2;
                Color oldBg = gc.getBackground(), oldFg = gc.getForeground();
            column, rowElement, false);
                gc.setForeground(oldFg);
                gc.setLineWidth(1);
        {"\u000C", "FF"},
        if (drawBackground) {
            DBPImage cellImage = cellInfo.image;
        final int state = cellInfo.state;
    static final Rectangle LINK_IMAGE_BOUNDS = new Rectangle(0, 0, 13, 13);
        final Point extent = gc.stringExtent(text);
        int width = bounds.width - x - RIGHT_MARGIN;
    }
        if (gridController == null) {
            }
        log.error("Cannot detect action hint");
import java.util.List;
        if (cellInfo.background != null) {
    };

            gc.setFont(font != null ? font : grid.normalFont);
                imageBounds = new Rectangle(0, 0, textSize.x, textSize.y);
    static final Image LINK2_IMAGE = DBeaverIcons.getImage(UIIcon.LINK2);
                x += (bounds.width - imageBounds.width - RIGHT_MARGIN - LEFT_MARGIN) / 2;
        int state = cellInfo.state;
                            textTopPos,
                        imageMargin = imageBounds.width + INSIDE_MARGIN;
                    if (iconList == null) {
                            textTopPos,
                );
        {"\u0008", "BS"},
    public static boolean isLinkState(int state) {

                String cellText = grid.getCellText(cellInfo.text);
                    break;

        if (CommonUtils.isEmpty(cellHints)) {
                            text,
                }
        boolean drawBackground = true;
                    if (drawCellTextSegment(gc, text.substring(start, index), bounds, activeForeground, disabledForeground, false)) {
                }
                    int imageMargin = 0;
                        final Color foreground;
 *
                Image hintImage = DBeaverIcons.getImage(hintIcon);


                        text,
                            isTransparent
        if (!text.isEmpty()) {
            if (columnAlign == IGridContentProvider.ALIGN_CENTER) {
        IGridContentProvider.CellInformation cellInfo,
        // Render text
            }
        {"\u0004", "EOT"},

                    if (useClipping) {

        if (rowElement == null) {
                        bounds.y + TEXT_TOP_MARGIN + TOP_MARGIN,
                image = DBeaverIcons.getImage(cellImage);
            switch (columnAlign) {
            if (!matched) {
        for (IGridHint hint : cellHints) {
                default: {
/**
                            bounds.x + x,
                    start = index;

    private void drawTextAndAdvance(
        {"\u000B", "VT"},
    }
        return false;
                if (val < bounds.width) {
    // Mapping table for special characters. The replacement string is painted with a tinted color.
                gc.setForeground(colorLineFocused);
        IGridRow rowElement = grid.getRow(row);
                    Point textSize = gc.textExtent(text);
            if (x > bounds.x + bounds.width) {

            int iconsWidth = 0;
                    }
                if (y >= cellOrigin.y + 4 &&
 * you may not use this file except in compliance with the License.
                    }
    // Render hints

                    );
        GridColumn column,
                    break;
            return false;

        {"\u0005", "ENQ"},

                    index += expected.length();
            drawTextAndAdvance(gc, segment, activeForeground, bounds, highlight);
        super(grid);
                        isTransparent
    private void drawCellTextDecorated(@NotNull GC gc, @NotNull String text, @NotNull IGridContentProvider.CellInformation cellInfo, @NotNull Rectangle bounds) {

                        gc.setForeground(foreground);
        @NotNull Color disabledForeground,
        IGridColumn column,
            for (IGridHint hint : cellHints) {


                    bounds.height

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
        }
                        }
            }
            }

                    textHintRendered = true;
        boolean textHintRendered = false;
        {"\u3000", "°"}, // ideographic whitespace

        {"\u200b", "█"}, // zero-width whitespace
 * Grid cell renderer
import org.jkiss.dbeaver.model.DBPImage;


        if (cellInfo.background == null) {

        {"\u001D", "GS"},
        boolean selected,
        {"\u0002", "STX"},
                final String expected = mapping[0];
        {"\u001C", "FS"},
    private static final int LEVEL_INDENT = 5;
                    iconsWidth += iconSize.width + 1;
            UIUtils.blend(cellInfo.foreground.getRGB(), cellInfo.background.getRGB(), 50));
                    low = mid + 1;
            cellInfo.foreground = grid.getForeground();
                clipped = segment.substring(0, mid);
            // Since we are already performing quite expensive paint operations,
                }


    private static final int TOP_MARGIN = 0;
        }
                        y >= origin.y + verMargin && y <= origin.y + verMargin + imageBounds.height) {
                    int leftIndent = (column.getWidth() - imageBounds.width - RIGHT_MARGIN - leftMargin) / 2;
 * distributed under the License is distributed on an "AS IS" BASIS,
        {"\r\n", "¶"},
                    }
            int textTopPos = bounds.y + TEXT_TOP_MARGIN + TOP_MARGIN;
    }
                    Point textSize = gc.textExtent(text);
        {"\u000F", "SI"},
                }
            boolean matched = false;
                        if (useClipping) {
        if (columnAlign == IGridContentProvider.ALIGN_LEFT) {
        @NotNull Color foreground,
            drawBackground = false;
    private static final int INSIDE_MARGIN = 3;
        {"\u001A", "SUB"},
        IGridContentProvider contentProvider = grid.getContentProvider();
        int iconsWidth = 0;
 *


        {"\u0016", "SYN"},

                    x += RIGHT_MARGIN;
                GC sizingGC = new GC(grid);
                    if (CommonUtils.isBitSet(state, IGridContentProvider.STATE_DECORATED)) {

        List<IGridHint> cellHints = grid.getContentProvider().getCellHints(col, row, cellInfo.value, 0);
    protected Color colorLineFocused;
        {"\r", "¶"},
        if (image != null && columnAlign != IGridContentProvider.ALIGN_RIGHT) {
        }
 */
                        return;
