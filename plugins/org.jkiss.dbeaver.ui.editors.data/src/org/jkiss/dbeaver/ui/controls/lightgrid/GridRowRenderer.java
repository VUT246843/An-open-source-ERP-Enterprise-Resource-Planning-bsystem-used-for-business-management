
 * Unless required by applicable law or agreed to in writing, software
        if (CommonUtils.isNotEmpty(desc)) {
        }
            width += GridRowRenderer.IMAGE_SPACING;
        gc.setForeground(grid.getLabelProvider().getHeaderForeground(element, false));
import org.eclipse.swt.graphics.GC;
                bounds.x + bounds.width - 1,

        if (state != IGridContentProvider.ElementState.NONE) {
        return width;
        GC gc,
        final String rowText = grid.getLabelProvider().getText(element);
 * limitations under the License.
            x += gc.stringExtent(shortText).x;
        width += gc.stringExtent(CommonUtils.isNotEmpty(rowDesc) ? rowText + " - " + rowDesc : rowText).x;

        Rectangle bounds,
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public static final int IMAGE_SPACING = 5;
        int width = GridRowRenderer.LEFT_MARGIN + GridRowRenderer.RIGHT_MARGIN;
        return x >= expandBegin && x <= expandEnd;
        boolean selected,
        width += level * GridRowRenderer.LEVEL_SPACING;
            width += rowImage.getBounds().width;
        int level,
            font = (element == grid.getFocusRowElement() ? grid.boldFont : grid.normalFont);
        int expandBegin = LEFT_MARGIN + level * LEVEL_SPACING;
                bounds.x + bounds.width - 1,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            gc.drawImage(image, x, bounds.y + (bounds.height - image.getBounds().height) / 2);
            Image expandImage = state == IGridContentProvider.ElementState.EXPANDED ? IMG_COLLAPSE : IMG_EXPAND;
        Image rowImage = grid.getLabelProvider().getImage(element);
        final String rowDesc = grid.getLabelProvider().getDescription(element);
            gc.drawString(shortDesc, bounds.x + x, bounds.y + (bounds.height - gc.stringExtent(text).y) / 2, isTransparent);
            width += GridRowRenderer.EXPANDED_BOUNDS.width + EXPANDER_SPACING;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

        gc.fillRectangle(bounds.x, bounds.y, bounds.width, bounds.height + 1);
        Image image = grid.getLabelProvider().getImage(element);
    {
    public static boolean isOverExpander(int x, int level)
import org.jkiss.dbeaver.ui.UIIcon;
                bounds.y,
 * distributed under the License is distributed on an "AS IS" BASIS,
/*


/**
 * you may not use this file except in compliance with the License.
        gc.drawString(shortText, bounds.x + x, bounds.y + (bounds.height - gc.stringExtent(text).y) / 2, isTransparent);
    public int computeHeaderWidth(GC gc, IGridRow element, int level) {
        }
            x += level * LEVEL_SPACING;

        if (font == null) {

            x += EXPANDED_BOUNDS.width + EXPANDER_SPACING;
 *     http://www.apache.org/licenses/LICENSE-2.0
            gc.drawLine(
    }
 *
        if (image != null) {
                bounds.y + bounds.height - 1);
    }
                bounds.x + bounds.width - 1,
import org.eclipse.swt.graphics.Font;
    }
                bounds.x,

        }
}
        }
 * See the License for the specific language governing permissions and
        final String desc = grid.getLabelProvider().getDescription(element);

    public static final int EXPANDER_SPACING = 2;
        final String text = grid.getLabelProvider().getText(element);

        if (rowImage != null) {
 *
        }
 * You may obtain a copy of the License at
class GridRowRenderer extends AbstractRenderer {
            gc.drawImage(expandImage, x, bounds.y + (bounds.height - EXPANDED_BOUNDS.height) / 2);
    static final Rectangle EXPANDED_BOUNDS = IMG_EXPAND.getBounds();
    public static final int LEFT_MARGIN = 4;
        Font font = grid.getLabelProvider().getFont(element);
    static final Image IMG_EXPAND = DBeaverIcons.getImage(UIIcon.TREE_EXPAND);
        int x = LEFT_MARGIN;

        IGridContentProvider.ElementState state,
    public static final int RIGHT_MARGIN = 4;
import org.jkiss.dbeaver.ui.UITextUtils;
        final String shortText = UITextUtils.getShortString(grid.fontMetrics, text, bounds.width - x - RIGHT_MARGIN);
    public static final int LEVEL_SPACING = EXPANDED_BOUNDS.width;
 * Grid row header renderer.
        IGridRow element)
                bounds.y + bounds.height - 1,

    {
        gc.setFont(font);

            gc.drawLine(
        }
 */
    public void paint(
        } else if (grid.getContentProvider().isElementExpandable(element) && level == 0) {
            gc.setFont(grid.italicFont);
    public GridRowRenderer(LightGrid grid) {
package org.jkiss.dbeaver.ui.controls.lightgrid;
        gc.setBackground(grid.getLabelProvider().getHeaderBackground(element, selected));
import org.eclipse.swt.graphics.Rectangle;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.graphics.Image;
 * DBeaver - Universal Database Manager
    }
            gc.setForeground(grid.getLabelProvider().getHeaderBorder(element));
        {
        if (grid.getContentProvider().isElementExpandable(element)) {
        if (level > 0) {
            final String shortDesc = UITextUtils.getShortString(grid.fontMetrics, " - " + desc, bounds.width - x - RIGHT_MARGIN);
        super(grid);
        }
 */
        int expandEnd = expandBegin + EXPANDED_BOUNDS.width;
                bounds.y + bounds.height - 1);
            x += EXPANDED_BOUNDS.width + EXPANDER_SPACING;
            x += image.getBounds().width + IMAGE_SPACING;
    static final Image IMG_COLLAPSE = DBeaverIcons.getImage(UIIcon.TREE_COLLAPSE);

