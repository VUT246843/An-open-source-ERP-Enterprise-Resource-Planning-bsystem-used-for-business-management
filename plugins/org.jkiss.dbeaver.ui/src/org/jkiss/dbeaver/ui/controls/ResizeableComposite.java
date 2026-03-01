
        if (minSize != null) {
                }
    public void setPrefSize(@NotNull Point prefSize) {
            dragger.addMouseListener(MouseListener.mouseDownAdapter(e -> update(e, false)));
            layout(true, true);


        super(parent, SWT.NONE);
 * limitations under the License.
        this.minSize = new Point(minSize.x, minSize.y);
        this.content.moveAbove(null);
                adjustment = data.heightHint != SWT.DEFAULT ? size.y - data.heightHint : 0;
 *
            dragger.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            .numColumns(horizontal ? 2 : 1)
            rectangle.width = size.x;

import org.eclipse.swt.widgets.*;
 * <dt><b>Styles:</b><dd>HORIZONTAL, VERTICAL
        if (horizontal) {
            SWT.FILL,
 *
    private Point prefSize = new Point(SWT.DEFAULT, SWT.DEFAULT);
    public void setMinSize(@NotNull Point minSize) {

                }
        Tracker tracker = new Tracker(getParent(), SWT.RESIZE | (horizontal ? SWT.RIGHT : SWT.DOWN));
            notifyListeners(SWT.Resize, new Event());
            content.setLayoutData(createLayoutData());
        if (prefSize != null) {
        boolean horizontal = (style & SWT.HORIZONTAL) != 0;
            Label dragger = new Label(this, SWT.NONE);
    }
     * Sets the content of this composite.
        this.content = content;
        checkWidget();
            tracker.dispose();
        this.prefSize = new Point(prefSize.x, prefSize.y);
        if (horizontal) {
        Rectangle rectangle = new Rectangle(offset.x, offset.y, 0, 0);
import org.jkiss.dbeaver.ui.DBeaverIcons;
    /**
    private Control content;
     * @param prefSize the preferred size of the content
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Adjustment for the difference between the actual size and the hint
                extra = rectangle.height - size.y;
/*

            if (horizontal) {
            dragger.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_SIZEWE));
    private final int style;
        }
            // Extra width/height between the content and the expander
public final class ResizeableComposite extends Composite {
import org.jkiss.dbeaver.ui.UIIcon;
    }
    @NotNull
import org.eclipse.jface.layout.GridLayoutFactory;
        updateLayoutData();
        updateLayoutData();
     *
    }
        Point offset = getLocation(); // relative to the parent
            data.minimumWidth = minSize.x;
        GridLayoutFactory.fillDefaults()

    private void update(@NotNull MouseEvent e, boolean horizontal) {
    }

    private GridData createLayoutData() {
     */
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
 * </dl>
            } else {
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.controls;
}
            } else {
                data.heightHint = Math.max(height, data.minimumHeight);
            dragger.setImage(DBeaverIcons.getImage(UIIcon.SEPARATOR_H));
            layout(true, true);
            }
import org.eclipse.swt.events.MouseEvent;
    public ResizeableComposite(@NotNull Composite parent, int style) {
     * @param minSize the minimum size of the content
        checkWidget();

            data.minimumHeight = minSize.y;
     */
        Point size = content.getSize();
        this.style = style;
     */
        tracker.setRectangles(new Rectangle[]{rectangle});
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;

            dragger.addMouseListener(MouseListener.mouseDownAdapter(e -> update(e, true)));
        }
            data.heightHint = prefSize.y;
            if (horizontal) {
            (style & SWT.HORIZONTAL) == 0,
        Control control = (Control) e.widget;


            int extra;
 */
import org.eclipse.swt.events.MouseListener;
 *
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (vertical) {
        checkWidget();
 * Unless required by applicable law or agreed to in writing, software
            int adjustment;

            if (horizontal) {
            Label dragger = new Label(this, SWT.NONE);

            dragger.setImage(DBeaverIcons.getImage(UIIcon.SEPARATOR_V));
            rectangle.height = size.y;
            throw new IllegalArgumentException("Must specify at least one of HORIZONTAL or VERTICAL styles");
            Rectangle result = tracker.getRectangles()[0];
import org.jkiss.code.NotNull;
        }
    private Point minSize = new Point(0, 0);
            dragger.setLayoutData(new GridData(SWT.CENTER, SWT.BEGINNING, false, false));
        if (content != null) {
        boolean vertical = (style & SWT.VERTICAL) != 0;
        );
        }
        tracker.setStippled(true);
import org.eclipse.swt.layout.GridData;
        GridData data = new GridData(
        }
        if (tracker.open()) {
            GridData data = (GridData) content.getLayoutData();
    }

            .spacing(0, 0)
            data.widthHint = prefSize.x;
        }
            SWT.FILL,
     * @param content the control to be added as content
                int width = result.width - adjustment - extra;
     *
        }
        if (!horizontal && !vertical) {
                data.widthHint = Math.max(width, data.minimumWidth);

 * <dl>
            }
        }
    public void setContent(@NotNull Control content) {
            .applyTo(this);

 * you may not use this file except in compliance with the License.
                if (height == size.y) {
     * Specifies the minimum size of the content.
                    return;
            if (horizontal) {

/**
 */
                extra = rectangle.width - size.x;
            rectangle.width = control.getLocation().x + e.x;
        return data;
                adjustment = data.widthHint != SWT.DEFAULT ? size.x - data.widthHint : 0;
                if (width == size.x) {
            }
     * Specifies the preferred size of the content.
            return;
 * A composite that can be resized by dragging its borders.
 * Copyright (C) 2010-2025 DBeaver Corp and others
            dragger.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_SIZENS));
    /**
        if (content == null) {
import org.eclipse.swt.graphics.Rectangle;
                ((GridData) dragger.getLayoutData()).horizontalSpan = 2;
        } else {

                    return;
 *
            rectangle.height = control.getLocation().y + e.y;

    /**
            (style & SWT.VERTICAL) == 0
import org.eclipse.swt.graphics.Point;
            } else {


            }
 * See the License for the specific language governing permissions and
    private void updateLayoutData() {

     *
                int height = result.height - adjustment - extra;
        updateLayoutData();
