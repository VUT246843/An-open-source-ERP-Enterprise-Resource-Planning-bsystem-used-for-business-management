        } else {
        Point imageSize = list.getImageSize();

    public ILabelProvider getLabelProvider() {
    static final int BORDER_MARGIN = 5;
        textLayout.dispose();
        return CommonUtils.toString(data);
/**
            gc.drawImage(icon, x + imgPosX, y + imgPosY);
        boolean isSelected = list.getSelectedItem() == this;
    private final ILabelProvider labelProvider;
                gc.setForeground(list.getForegroundColor());
            }

import org.jkiss.dbeaver.utils.RuntimeUtils;
    public String toString() {
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
            return;
    public AdvancedListItem(AdvancedList list, Object item, ILabelProvider labelProvider) {
            gc.fillRectangle(x, y, itemSize.x, itemSize.y);

    }
            } else {


        if (iconBounds.width == imageSize.x && iconBounds.height == imageSize.y) {
            ImageData imageData = icon.getImageData();
        gc.setAntialias(SWT.ON);
        this.textLayout.draw(gc, x + BORDER_MARGIN, y + imageSize.y + BORDER_MARGIN);
 */
        this.list = list;
        if (isSelected || isHover) {
        return labelProvider;

package org.jkiss.dbeaver.ui.controls.finder;
    private final AdvancedList list;
        Point itemSize = list.getItemSize();
 * limitations under the License.
        Image icon = labelProvider.getImage(data);
 * you may not use this file except in compliance with the License.
            gc.setForeground(list.getSelectionForegroundColor());
    void dispose() {
                x + imgPosX, y + imgPosY, imageSize.x, imageSize.y);

 *

        }

    private final Object data;
        // Same SWT APIs yield different results across different platforms. How cool is that?
 * See the License for the specific language governing permissions and
        }
                gc.setBackground(list.getHoverBackgroundColor());
        if (RuntimeUtils.isLinux()) {
        int imgPosY = BORDER_MARGIN;//(itemBounds.height - iconBounds.height) / 2 ;
        int imgPosX = (itemSize.x - imageSize.x) / 2;
            if (isHover) {
        gc.setInterpolation(SWT.HIGH);
            gc.setBackground(list.getSelectionBackgroundColor());
        this.textLayout.setAlignment(SWT.CENTER);
        }
        } else {

    public Object getData() {
        } else {
        this.textLayout.setText(labelProvider.getText(item));
import org.eclipse.swt.graphics.*;

        this.textLayout = new TextLayout(list.getDisplay());
        this.list.addItem(this);

        boolean isHover = this == list.getHoverItem();

                gc.setForeground(list.getForegroundColor());
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.eclipse.jface.viewers.ILabelProvider;
    @Override
                gc.setBackground(list.getBackground());
            gc.fillRoundRectangle(x + 2, y + 2, itemSize.x - 4, itemSize.y - 4, 10, 10);
        this.textLayout.setFont(list.getFont());
 *
 * DBeaver - Universal Database Manager
    }

        if (isSelected) {
        this.labelProvider = labelProvider;
            iconBounds = icon.getBounds();
        } else {
import org.eclipse.swt.SWT;
 *
    void painItem(GC gc, int x, int y) {
        this.data = item;
        this.textLayout.setWidth(itemSize.x - BORDER_MARGIN * 2);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
        }
    private final TextLayout textLayout;
        Rectangle iconBounds;
        if (itemSize.x <= 0 || itemSize.y <= 0) {
            iconBounds = new Rectangle(0, 0, imageData.width, imageData.height);

    }
    }
 */
}            gc.drawImage(icon, 0, 0, iconBounds.width, iconBounds.height,
 * You may obtain a copy of the License at
public class AdvancedListItem {
    }
    }
 * AdvancedListItem
        return data;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.utils.CommonUtils;
