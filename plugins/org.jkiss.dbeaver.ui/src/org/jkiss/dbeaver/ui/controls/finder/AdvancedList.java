                            navigateByKey(e);
import org.eclipse.swt.accessibility.ACC;


        }
import org.jkiss.dbeaver.ui.BaseThemeSettings;
    }
                    case SWT.PAGE_DOWN:
                if (!items.isEmpty()) {
        showItem(selectedItem);
    private final List<AdvancedListItem> items = new ArrayList<>();
                    case SWT.ARROW_RIGHT:
        try {
import org.eclipse.jface.viewers.IToolTipProvider;
                setSelection(items.get(itemIndex));
            }
            }

    }

                // Scroll down
                break;
        int visibleRowCount = getVisibleRowCount();
        }
                    setSelection(item);
            public void mouseHover(MouseEvent e) {
import org.eclipse.swt.layout.GridLayout;
        }


    Point getTextSize() {

                    case SWT.END:
public class AdvancedList extends Canvas {
    public void setItemSize(Point itemSize) {
        }
                if (redrawItems == null || ArrayUtils.contains(redrawItems, item)) {
        Point imageSize = getImageSize();
import org.eclipse.swt.widgets.Event;
    }

                AdvancedListItem item = getSelectedItem();
        GC gc = new GC(getDisplay());
                }
                super.focusGained(e);

                break;
        });
                    toolTipHandler.updateToolTipText(toolTipText);
                if (itemRow > bottomRowIndex + 1) {

        switch (e.keyCode) {
                }
                    setSelection(items.get(itemIndex - itemsPerRow));
}
        if (parent.getLayout() instanceof GridLayout) {
                    vScroll.setSelection(vScroll.getSelection() + vScroll.getPageIncrement());
    Color getSelectionForegroundColor() {
        if (isFocusControl() && item != null) {
        }
        if (selectedItem == null) {

            case SWT.ARROW_DOWN:
        });
    private void cleanupItems() {
        for (int i = 0; i < itemRowsVisible; i++) {
        return selectionBackgroundColor;
    void notifyDefaultSelection() {
                    setSelection(items.get(itemIndex - 1));
            toolTipHandler.updateToolTipText(null);
import java.util.ArrayList;
 * limitations under the License.
            x = 0;
 */
    }
        items.clear();
            return;
        this.hoverBackgroundColor = UIUtils.getSharedTextColors().getColor(
        toolTipHandler = new CustomToolTipHandler(this);
        addListener (SWT.Selection, event -> listener.widgetSelected(new SelectionEvent(event)));
        Point size = getSize();
        int topItemIndex = topRowIndex * itemsPerRow;
        addListener (SWT.DefaultSelection, event -> listener.widgetDefaultSelected(new SelectionEvent(event)));
        topRowIndex = topRowOffset / itemSize.y;

                break;
                }
 * You may obtain a copy of the License at
            }
import org.jkiss.dbeaver.ui.UIUtils;
                    vScroll.setSelection(itemRow * getItemSize().y);
    Point getItemSize() {
                break;
        int itemLength = imageSize.x + AdvancedListItem.BORDER_MARGIN * 4 + getTextSize().y;
        int col = x / itemSize.x;
            }
        cleanupItems();
        notifyListeners(SWT.Selection, event);
                }

        addListener(SWT.Resize, event -> {
            //getAccessible().sendEvent(ACC.EVENT_SELECTION_CHANGED, new Object[]{null, item.getData()});
                    if (nextIndex >= items.size() - 1) {
            y += itemSize.y;

            }
    }
        return hoverItem;
    }

import org.eclipse.swt.graphics.*;
        GC gc = new GC(this);
    }
        } else {
    void addItem(AdvancedListItem item) {
 * you may not use this file except in compliance with the License.
    public AdvancedListItem getSelectedItem() {
import org.jkiss.utils.CommonUtils;
    private final Color backgroundColor, selectionBackgroundColor, foregroundColor, selectionForegroundColor, hoverBackgroundColor;

        super(parent, SWT.V_SCROLL | SWT.DOUBLE_BUFFERED | style);
        int totalRows = itemsPerRow == 0 ? 0 : (items.size() / itemsPerRow) + 2;
        initAccessible();
            if (itemRow < topRowIndex - 1) {
                    setSelection(items.get(items.size() - 1));
                notifyDefaultSelection();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
            public void focusGained(FocusEvent e) {
        if (this.selectedItem == item) {
import org.eclipse.swt.events.*;
    Color getHoverBackgroundColor() {
                if (itemIndex >= items.size()) {
    }

            updateMeasures();



                    case SWT.ARROW_UP:

                    // Scroll to exact row

        paintList(e.gc, null);
    }
        final Accessible accessible = getAccessible();

            ILabelProvider labelProvider = item.getLabelProvider();
                // To exact row
    }
            smallFont.dispose();
        }
        return getSize().y / getItemSize().y + 1;
        }
                notifyDefaultSelection();
            @Override
                itemIndex -= itemsPerRow * getVisibleRowCount();
        this.itemSize = itemSize;
    }
                switch (e.keyCode) {
        FontData[] fontData = normalFont.getFontData();
        topRowOffset = topRowOffset - topRowIndex * itemSize.y;
        });
import org.eclipse.swt.accessibility.Accessible;
        topRowOffset = vScroll.getSelection();
                    item.painItem(gc, x, y);
    public void removeAll() {

 *
    public void refreshFilters() {
    private void updateMeasures() {
        this.addMouseMoveListener(this::onMouseMove);
                    case SWT.PAGE_UP:
                    break;
    }
                vScroll.setSelection(Math.max(0, vScroll.getSelection() - vScroll.getPageIncrement()));
/*

        return new Point(itemLength, itemLength + AdvancedListItem.BORDER_MARGIN * 2);
            } else {
        if (x < 0 || y < 0 || x >= size.x || y >= size.y) {
    Color getForegroundColor() {
            if (itemRow >= bottomRowIndex) {
        Event event = new Event();
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        setSelection(null);

            case SWT.ARROW_LEFT:

    private void onMouseMove(MouseEvent e) {
                    setFocus();
        this.addFocusListener(new FocusAdapter() {

        Point containerSize = getSize();
            case SWT.HOME:
    }
    public AdvancedList(Composite parent, int style) {
        CSSUtils.setCSSClass(this, "List");
            }
                }
        Point itemSize = getItemSize();
            }
        items.add(item);

import org.eclipse.swt.accessibility.AccessibleAdapter;
        } else {
            }

            for (int k = 0; k < itemsPerRow; k++) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                setSelection(items.get(itemIndex));
        if (listener == null) {
            public void keyPressed(KeyEvent e) {
            case SWT.END:

            item.dispose();
        int itemsPerRow = getItemsPerRow();
    private AdvancedListItem selectedItem;
            @Override
    Color getSelectionBackgroundColor() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            return null;
import org.eclipse.swt.accessibility.AccessibleEvent;
        Font normalFont = BaseThemeSettings.instance.baseFont;
        return backgroundColor;

    }
    }
        this.backgroundColor = UIStyles.getDefaultTextBackground();
                break;
    private void paintList(@NotNull GC gc, @Nullable AdvancedListItem[] redrawItems) {
                AdvancedListItem item = getItemByPos(e.x, e.y);
                }
            case SWT.ARROW_RIGHT:
        this.setBackground(backgroundColor);
                break;
        setFont(smallFont);
    private final ScrollBar vScroll;

                break;
                }

        accessible.addAccessibleListener(new AccessibleAdapter() {
                vScroll.setSelection(itemRow * getItemSize().y);
        });
            public void mouseDoubleClick(MouseEvent e) {
            public void mouseExit(MouseEvent e) {
            @Override
    }
import org.jkiss.utils.ArrayUtils;
                }
import org.eclipse.swt.widgets.Canvas;
    }
        return items.toArray(new AdvancedListItem[0]);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final CustomToolTipHandler toolTipHandler;
                if (getSelectedItem() == null && !items.isEmpty()) {
    private int getItemsPerRow() {
    private AdvancedListItem getItemByPos(int x, int y) {
        hoverItem = item;
        int itemRowsVisible = getVisibleRowCount() + 1;
            case SWT.PAGE_DOWN:
                onVerticalScroll();
        AdvancedListItem[] redrawItems = new AdvancedListItem[] { item, hoverItem };
    public AdvancedListItem[] getItems() {

                    setSelection(items.get(nextIndex));
import org.jkiss.dbeaver.ui.css.CSSUtils;
    }
        for (AdvancedListItem item : items) {
        if (item == hoverItem) {

        });
 * DBeaver - Universal Database Manager

        updateMeasures();
            int bottomRowIndex = topRowIndex + getVisibleRowCount();
            case SWT.PAGE_UP:
                break;

                } else {
                    setSelection(items.get(0));
                // One row up
            }
        }
        int x = 0, y = -topRowOffset;
    }
                AdvancedListItem item = items.get(itemIndex);
    public Point getImageSize() {
 *
                break;
        int itemsPerRow = getItemsPerRow();
        });
    }
        fontData[0].height -= 1.3F;
    void setSelection(AdvancedListItem item) {
            return;
                }
    }
    private void initAccessible() {
import org.eclipse.swt.widgets.ScrollBar;
                int itemIndex = topItemIndex + i * itemsPerRow + k;
    }
        Point itemSize = getItemSize();
        int itemsPerRow = getItemsPerRow();
        }
        addPaintListener(this::onPaint);
                }

            }
    }
        notifyListeners(SWT.DefaultSelection, event);
    private int topRowIndex;
                if (item != null) {
                onMouseMove(e);
        } finally {
        return itemIndex < items.size() ? items.get(itemIndex) : null;
        this.selectedItem = item;
            if (labelProvider instanceof IToolTipProvider) {
    private int getVisibleRowCount() {
            }
        }
        vScroll.addSelectionListener(new SelectionAdapter() {
                    case SWT.ARROW_LEFT:
                itemIndex += itemsPerRow * getVisibleRowCount();
    }
        if (!vScroll.isVisible()) {
                if (!CommonUtils.isEmpty(toolTipText)) {
            if (topItemIndex + i * itemsPerRow >= items.size()) {

    }
        vScroll = getVerticalBar();
            // Scroll up
                if (itemIndex < items.size() - 1) {
        this.selectionBackgroundColor = UIStyles.getDefaultTextSelectionBackground();
                    // Just one row down
    private void onPaint(PaintEvent e) {
                        }
            @Override
        event.widget = this;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            setLayoutData(new GridData(GridData.FILL_BOTH));
        this.selectionForegroundColor = UIStyles.getDefaultTextSelectionForeground();
import org.eclipse.jface.viewers.ILabelProvider;
        vScroll.setValues(0, 0, totalRows * itemHeight, visibleRowCount * itemHeight, itemHeight / 2, itemHeight);

import org.eclipse.swt.SWT;
        return hoverBackgroundColor;
            redraw();
                    }
        }
    AdvancedListItem getHoverItem() {
                if (item != null) {
        selectedItem = null;

            UIUtils.blend(this.selectionBackgroundColor.getRGB(), new RGB(255, 255, 255), 70));
        });
                        nextIndex = items.size() - 1;
        this.items.remove(item);
        int row = topRowIndex + (y + topRowOffset) / itemSize.y;
    private AdvancedListItem hoverItem;
import org.jkiss.dbeaver.ui.UIStyles;
                    case SWT.HOME:
            }
        }
import org.jkiss.code.NotNull;
        Event event = new Event();
        return textSize;
                    e.result = item.getLabelProvider().getText(item.getData());

        hoverItem = null;
            public void mouseDown(MouseEvent e) {
        this.addMouseListener(new MouseAdapter() {
import org.eclipse.swt.widgets.Composite;
        return selectionForegroundColor;
import org.jkiss.dbeaver.ui.controls.CustomToolTipHandler;
            case SWT.ARROW_UP:
        int itemIndex = row * getItemsPerRow() + col;
 *
        redraw();
    }

    }


    private void navigateByKey(KeyEvent e) {
            return;

        return itemSize;
        event.widget = this;
        int itemIndex = items.indexOf(item);
                if (itemIndex > 0) {
        Point itemSize = getItemSize();
                if (itemIndex > items.size() - 1) itemIndex = items.size() - 1;

    }
    private void onVerticalScroll() {
                }
        }
        }
        if (item == null) {
            return null;
            case SWT.CR:
                }
            @Override
                }
    private int topRowOffset;
                if (!items.isEmpty()) {
        textSize = gc.stringExtent("X");

            paintList(gc, redrawItems);
        this.addKeyListener(new KeyAdapter() {
 * See the License for the specific language governing permissions and

                        break;
            }
    private Point itemSize = new Point(64, 64);
import java.util.List;
import org.eclipse.swt.layout.GridData;


        addDisposeListener(e -> {
    }
        this.foregroundColor = UIStyles.getDefaultTextForeground();
    public void addSelectionListener(SelectionListener listener) {
        vScroll.setVisible(totalRows * itemHeight > getSize().y);
 * AdvancedList


        if (itemRow < topRowIndex) {
            public void getName(AccessibleEvent e) {
                        if (getSelectedItem() != null) {
            @Override
                    case SWT.ARROW_DOWN:
    void removeItem(AdvancedListItem item) {
                    setSelection(items.get(itemIndex + 1));
    private final Point textSize;
        AdvancedListItem item = getItemByPos(e.x, e.y);
        redraw();
    }
        return selectedItem;
            @Override
    }
 */
        return foregroundColor;
            return;
        });
            gc.dispose();


                if (itemIndex >= itemsPerRow) {
        return Math.floorDiv(containerSize.x, itemSize.x);
                String toolTipText = ((IToolTipProvider) labelProvider).getToolTipText(item.getData());
                    case SWT.CR:
        Font smallFont = new Font(normalFont.getDevice(), fontData[0]);

                    setSelection(items.get(0));
package org.jkiss.dbeaver.ui.controls.finder;
                if (itemIndex < items.size() - 1) {
        checkWidget ();

        //int drawItemCount = itemRowsVisible * itemsPerRow;
        checkWidget ();
            @Override
            public void mouseEnter(MouseEvent e) {
        if (col < 0 || col >= getItemsPerRow()) {
        }
                x += itemSize.x;
        int itemRow = itemIndex / getItemsPerRow();
        gc.dispose();
                    int nextIndex = itemIndex + itemsPerRow;


        vScroll.setVisible(true);

            return;
                }
    Color getBackgroundColor() {
        this.addMouseTrackListener(new MouseTrackAdapter() {
        int itemIndex = items.indexOf(selectedItem);
            cleanupItems();
            public void widgetSelected(SelectionEvent e) {
    }
                if (itemIndex < 0) itemIndex = 0;
/**
        int itemHeight = getItemSize().y;
            getAccessible().sendEvent(ACC.EVENT_NAME_CHANGED, new Object[]{null, item.getData()});


    private void showItem(AdvancedListItem item) {
                break;
