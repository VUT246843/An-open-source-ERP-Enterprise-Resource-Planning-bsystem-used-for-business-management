        return point;
			 * Add INDENT_RIGHT pixels to the right of the longest tab as a margin.
     * Removes all elements from this list.
                e.gc.fillRectangle(0, 2, bounds.width, bounds.height - 1);
                if (getSelectionIndex() != NONE) {
            topNavigationElement.setLayoutData(formData);
					/*
                }
            public void getChildCount(AccessibleControlEvent e) {
        return null;
        select(index, true);
            if (isUpScrollRequired()) {
                FontMetrics fm = e.gc.getFontMetrics();
                - 1;
        /**
        }
            formData.height = getTabHeight();
                int i = getSelectionIndex();
                    textIndent = textIndent - 3;
        super.setFont(font);
                e.gc.fillGradientRectangle(0, 2, bounds.width - 1, bounds.height - 1, true);
        addDisposeListener(e -> {
            });
        private boolean hover;
                    formData.top = new FormAttachment(nextElement, 0);
            formData.top = new FormAttachment(0, 0);
			/*
                    layoutTabs();
            disabledImage = new Image(image.getDevice(), image, SWT.IMAGE_GRAY);
            }
    public ListElement getElementAt(int index) {
            }
    int getTabHeight() {
 *
                    bounds.height - 1);
                e.gc.setBackground(bgColor);
     * Sets the new list elements.
    private final boolean section;
    @Override
            e.gc.drawText(tab.getText(), textIndent, textMiddle, true);
    /**
                if (tooltip != null) {
        } else {

    }
            .round((float) (getSize().y - 22) / getTabHeight());
     */
            formData.height = 10;
			/*
     * Calculate the number of tabs that will fit in the tab list composite.
        if (index >= 0 && index < elements.length) {
            topVisibleIndex = selectedElementIndex;
     */
    /**
            Canvas nextElement = topNavigationElement;
            }
                    layoutTabs();
            // By some reason E4 sets white background in dark theme.
        int width = getTextDimension(folderInfo.getText()).x;
import org.eclipse.swt.accessibility.*;
    /**
        }
            setFont(TabbedFolderList.this.getFont());
import org.eclipse.swt.layout.FormData;
import org.jkiss.dbeaver.ui.*;
            }
        if (index >= 0 && index < elements.length) {
import org.eclipse.swt.layout.FormAttachment;
    }
                    if (width > getTabWidth(elements[widestLabelIndex].tab)) {
                    formData.left = new FormAttachment(0, 0);
        public BottomNavigationElement(Composite parent) {
            this.selected = selected;
        computeTopAndBottomTab();


    /**
            selectedElementIndex = NONE;
            }
            for (int i = 0; i < elements.length; i++) {
     */
                    }
                e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
    private Color hoverGradientStart;
        } else if (getSelectionIndex() == NONE) {
				/* draw the icon for the selected tab */
    }
        defaultGradientStart = sharedColors.getColor(
    }
                e.gc.drawLine(0, bottom - 7, bounds.width - 2, bottom - 7);

                    SharedTextColors sharedColors = UIUtils.getSharedTextColors();
                    elements[i].redraw();
        }
        /**

        accessible.addAccessibleListener(new AccessibleAdapter() {
            elements[index].setSelected(true);
            }
                    hover = true;
import org.eclipse.swt.layout.GridData;
        Point point = gc.textExtent(text);
        if (getSelectionIndex() != NONE) {
                    elements[getSelectionIndex() + 1].setSelected(false);
            widestLabelIndex = NONE;
			 */
                    bounds.height - 1);
        navigationElementShadowStroke = sharedColors.getColor(UIUtils.blend(white, widgetNormalShadow.getRGB(), 55));
     * @return the dimensions of the provided string.
         */
            topNavigationElement.setBackground(widgetBackground);

    /**
                    e.gc.drawImage(image, textIndent, imageMiddle - 1);
            selected = false;
import org.jkiss.dbeaver.ui.css.CSSUtils;

        Color widgetBackground;
                }
     * Initialize the accessibility adapter.
                }
     * Determine if an upward scrolling is required.
        if (elements.length == 0) {
        } else {
     *
            return (ret > tabHeight) ? tabHeight : Math.max(ret, 5);
            bottomNavigationElement.setLayoutData(formData);
            } else {
import org.eclipse.swt.widgets.Composite;
                e.gc.drawLine(middle - 1, 5, middle + 2, 5);
        }
     * @param index the index of the element to select.
            int nCurrent = getSelectionIndex();
        if (widestLabelIndex != NONE) {
        grandparent.layout(true);
        public TopNavigationElement(Composite parent) {
    /**

        if (e.detail == SWT.TRAVERSE_PAGE_PREVIOUS || e.detail == SWT.TRAVERSE_PAGE_NEXT) {
     * Get the dimensions of the provided string.
                e.gc.setForeground(widgetNormalShadow);
                e.gc.setBackground(bgColor);
        /**
            Color bgColor = getWidgetBackground(true);
        /**
    public void select(int index, boolean setFocus) {
     * @return number of elements

            if (tab.getImage() != null) {
                e.gc.setForeground(widgetForeground);
        int tabHeight = getTextDimension("").y + INDENT_LEFT; //$NON-NLS-1$

        private boolean selected;
                element.dispose();
            e.doit = false;
    private Color indentedHoverBackground;
            widgetBackground = getBackground();
 *
                e.gc.setForeground(widgetNormalShadow);
     */
    private int topVisibleIndex = NONE;
 * DBeaver - Universal Database Manager
			 * be selected for now.
            bottomVisibleIndex = selectedElementIndex + tabsThatFitInComposite
        }
        /**

     * scrolling is required.
    }
            if (selectedElementIndex < topVisibleIndex || selectedElementIndex > bottomVisibleIndex) {
        }
        removeAll();
        checkWidget();
            formData.left = new FormAttachment(0, 0);
    }
            int textIndent = INDENT_LEFT;
        super(parent, SWT.NO_FOCUS);
                     * We set focus to the tabbed property composite so that

    }
        }
    public void removeAll() {
    /**
            int nMax = elements.length - 1;
		/*
					 */
                if (adapt) {
                }
                    e.y = pt.y;
        }
                    elements[i].setLayoutData(null);
 * limitations under the License.

                    topNavigationElement.redraw();
    }
    private void layoutTabs() {
            public void getLocation(AccessibleControlEvent e) {
    /**
                    select(getIndex(ListElement.this));
            result.x = width + INDENT_RIGHT;
			 * Add INDENT_LEFT pixels to the left as a margin.
			/*
		/*
			/*
			/*
                redraw();
                // Only in case of CTRL+ALT+PG
    public void setFont(Font font) {

         * @param e the paint event.
        private void paint(PaintEvent e) {

    /**
                    elements[i].setLayoutData(formData);

        topNavigationElement = new TopNavigationElement(this);
import org.eclipse.swt.widgets.Canvas;
        if (elements.length == 0) {
        // layout so that we have enough space for the new labels
     */
            addMouseMoveListener(e -> {
            result.x = ((GridData) layoutData).widthHint;
         * Constructor for TopNavigationElement.
            }
    /**
        topVisibleIndex = NONE;
        }
		 * space available after the label. So when the active tab includes

                if (nCurrent > nMax) {
     * <code>null</code> if the index is out of range.
        tabsThatFitInComposite = Math
        Object layoutData = getLayoutData();
					 * this tab is visible.
    private int widestLabelIndex = NONE;
            }
            }
        bottomNavigationElement = new BottomNavigationElement(this);
     */
         * @param e the paint event.
            select(nCurrent);
                }

         *
                    e.result = elements[getSelectionIndex()].getInfo().getText();
			 */
        hoverGradientEnd = sharedColors.getColor(UIUtils.blend(widgetNormalShadow.getRGB(), widgetBackground.getRGB(), 10));
                e.gc.setForeground(bottomNavigationElementShadowStroke1);

			/* draw the fill in the tab */
        if (UIUtils.isInDialog(this) && UIStyles.isDarkTheme()) {
			 */
                    redraw();
            formData.right = new FormAttachment(100, 0);
            this.index = index;
            if (!selected) {
        return disabledImage;
            if (lastSelected != NONE) {
     * plus buffer.

                e.gc.drawLine(0, 0, bounds.width - 1, 0);
     *
    private void computeTopAndBottomTab() {
         * @return the tab item.

         * @param selected the selected value.
     * Returns the number of elements in this list viewer.
            }
            if (!hover) {
			 * the selected tab is near the bottom.
                    formData.right = new FormAttachment(100, 0);

                    Rectangle location = elements[getSelectionIndex()].getBounds();

                if (!section || isDownScrollRequired()) {
    public void addSelectionListener(SelectionListener listener) {
                accessible.setFocus(ACC.CHILDID_SELF);
 * Copyright (C) 2010-2026 DBeaver Corp and others

                    return;
                e.gc.setBackground(hoverGradientEnd);
     *
        }
        this.section = section;
            formData = new FormData();
    Color widgetDarkShadow;
            bottomNavigationElement.setBackground(widgetBackground);
        initColours();
            return tab;
package org.jkiss.dbeaver.ui.controls.folders;
            }
                    if (bottomVisibleIndex != elements.length - 1) {
                    setToolTipText(tooltip);
                e.gc.drawLine(0, bounds.height - 1, bounds.width - 2, bounds.height - 1);
         * @param index  the index in the list.
            } else {

import org.eclipse.swt.graphics.*;
                return;
            e.gc.drawLine(0, 1, bounds.width - 1, 1);
					 * setSelected()
    public int getSelectionIndex() {
            super(parent, SWT.NO_FOCUS);
         * Constructor for ListElement.
                e.gc.drawLine(middle + 1, bottom, middle + 5, bottom - 4);
        } else {
            int maxTabWidth = getTabWidth(elements[widestLabelIndex].tab);
                } else {
            Rectangle bounds = getBounds();
        widgetDarkShadow = display.getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW);
                e.gc.drawLine(middle - 1, bottom - 2, middle + 2, bottom - 2);
        indentedHoverBackground = sharedColors.getColor(UIUtils.blend(white, widgetBackground.getRGB(), 75));

                    e.width = location.width;
        if (folderInfo.isIndented()) {
     *
    /**
     */
        return elements.length;
            FontMetrics fm = e.gc.getFontMetrics();
                e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
            }
    }
    }
    private Color bottomNavigationElementShadowStroke2;
                }

                e.detail = ACC.ROLE_TABITEM;
        } else {
                if (nCurrent < 0) {
    }
            } else {
    private Image getGrayedImage(Image image) {
     * Returns the element with the given index from this list viewer. Returns
            elements[i].setLayoutData(null);
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return true if downward scrolling is required.
                    elements[i].setVisible(false);
                e.gc.drawLine(bounds.width - 1, 0, bounds.width - 1,
                final int imageMiddle = (bounds.height - imageBounds.height) / 2;
                e.gc.drawLine(middle - 2, bottom - 3, middle + 3, bottom - 3);
                e.gc.drawLine(middle, 3, middle - 4, 7);
                e.gc.drawLine(0, 1, bounds.width - 2, 1);
					/*
     */
     * Initialize the colours used in the list.
			 * the selected tab is near the top.
        if (disabledImage == null) {
                        // Make element background lighter
    private void computeTabsWidth() {
     */
                Point point = e.gc.textExtent(tab.getText());
        }
                    /*
        }
    /**
            if (index == lastSelected) {
            return getParent().getBackground();
        }
    private final BottomNavigationElement bottomNavigationElement;
		 * INFO_BACKGROUND 40%
        if (tabsThatFitInComposite <= 0) {
        addListener(SWT.FocusIn, event -> accessible.setFocus(ACC.CHILDID_SELF));
            addMouseListener(MouseListener.mouseUpAdapter(mouseEvent -> {
                    tabbedPropertyComposite.setFocus();
                } else {

                    if (topVisibleIndex != 0) {
                e.gc.setBackground(bgColor);
            }
            this.tab = tab;
					 * this tab is not visible
    private final Map<Image, Image> grayedImages = new IdentityHashMap<>();
        }));
                int textIndent = INDENT_LEFT;
     */
         *
                textIndent = textIndent + imageBounds.width + 4;
        if (setFocus) {
     * Selects one of the elements in the list.
            if (elements.length != 0) {
                }
         * Paint the element.
     */
    /**
            grayedImages.put(image, disabledImage);
    /**
         */
    public void setFolders(TabbedFolderInfo[] children) {
    private Color navigationElementShadowStroke;
            Image image = DBeaverIcons.getImage(folderInfo.getImage());
        });
                }

            int ret = getBounds().height - 20;
    private ListElement[] elements;

        return tabs;

            tabsThatFitInComposite = 1;
                if (getSelectionIndex() != NONE) {
         * @param e the paint event.
        }
                }
                e.gc.drawLine(0, 0, bounds.width - 2, 0);
        }
            setFont(TabbedFolderList.this.getFont());
    private Color indentedDefaultBackground;
    Color widgetNormalShadow;
     */

import org.eclipse.swt.layout.FormLayout;
            bottomVisibleIndex = 0;
            computeTopAndBottomTab();
            }
                } else {
                    }
                if (i < topVisibleIndex || i > bottomVisibleIndex) {
                e.gc.setForeground(widgetNormalShadow);
		 */
        } else {
            formData.left = new FormAttachment(0, 0);
     * Layout the tabs.
        if (layoutData instanceof GridData && ((GridData) layoutData).widthHint != -1) {
        notifyListeners(SWT.Selection, new Event());
     * scroll button when scrolling is needed or is just a spacer when no
import org.eclipse.swt.events.*;


                UIUtils.blend(white, widgetNormalShadow.getRGB(), 20), 60)
                textIndent = textIndent + INDENT_LEFT;
         *
            public void getChildAtPoint(AccessibleControlEvent e) {
            int textMiddle = (bounds.height - height) / 2;
        return selectedElementIndex;
                e.gc.drawLine(0, 1, bounds.width - 2, 1);
    }
            // Make element background lighter
		 */
        public void setSelected(boolean selected) {
                Image image = DBeaverIcons.getImage(tab.getImage());
        return result;
                e.gc.setForeground(widgetNormalShadow);
                e.detail = ACC.STATE_SELECTABLE | ACC.STATE_SELECTED | ACC.STATE_FOCUSED | ACC.STATE_FOCUSABLE;
					/*
        }

					 */
                    nextElement = elements[i];
                e.detail = 0;
     */
                int i = getSelectionIndex();
                e.gc.setForeground(navigationElementShadowStroke);
            }));
                        topVisibleIndex--;
        Composite grandparent = getParent().getParent();
        point.x++;
                nCurrent += 1;
     * @return the element at the given index, or <code>null</code> if the
        }
                e.gc.drawLine(middle - 3, bottom - 4, middle + 4, bottom - 4);
            if (layoutData instanceof GridData) {
            public void getName(AccessibleEvent e) {
    /**
                }
 */
                e.gc.drawLine(middle, bottom, middle - 4, bottom - 4);
         */
                    e.gc.drawPoint(bounds.width - 1, bounds.height - 1);
                } else {
        bottomNavigationElementShadowStroke1 = sharedColors.getColor(UIUtils.blend(black, widgetBackground.getRGB(), 10));
            topVisibleIndex = bottomVisibleIndex - tabsThatFitInComposite + 1;
                return connectionColor;
     * One of the tabs in the tabbed property list.
            /*
                    e.result = elements[getSelectionIndex()].getInfo().getText();
            public void getHelp(AccessibleEvent e) {
            }
        computeTabsWidth();
        GC gc = new GC(this);
    }
                e.gc.setBackground(indentedHoverBackground);
        private void paint(PaintEvent e) {
     * @return true if upward scrolling is required.
            if (selected) {
                     */
                    e.gc.drawLine(bounds.width - 1, 0, bounds.width - 1, bounds.height - SECTION_DIV_HEIGHT);
                computeTopAndBottomTab();
        final Accessible accessible = getAccessible();
         * Set selected value for this element.
            // Foreground darker than background - make element background darker

                e.gc.drawLine(bounds.width - 1, 1, bounds.width - 1,
                    Composite tabbedPropertyComposite = getParent();

     */
        Image disabledImage = grayedImages.get(image);

            Object layoutData = getLayoutData();
                ((GridData) layoutData).widthHint = maxTabWidth + INDENT_LEFT + INDENT_RIGHT;
    }
     * Based on available space, figure out the top and bottom tabs in the list.
		/*
            formData.left = new FormAttachment(0, 0);
 * You may obtain a copy of the License at
		 * white 20% end colour WIDGET_BACKGROUND 100% + WIDGET_NORMAL_SHADOW
			 */
        }
            }
                //e.gc.fillGradientRectangle(0, 2, bounds.width - 1, bounds.height - 1, true);
            Color bgColor = getWidgetBackground(false);
    }
    private static final ListElement[] ELEMENTS_EMPTY = new ListElement[0];
                if (!selected) {
            e.gc.setForeground(widgetNormalShadow);
            Color connectionColor = CSSUtils.getCurrentEditorConnectionColor(this);
			 */
    private boolean focus = false;
            addMouseTrackListener(MouseTrackListener.mouseExitAdapter(e -> {
			 */
                }

                    } else {
                e.gc.drawLine(0, bottom - 6, bounds.width - 2, bottom - 6);
     * index is out of range
                    Point pt = toDisplay(new Point(location.x, location.y));

                e.gc.fillRectangle(0, 2, bounds.width - 1, bounds.height - 1);

        addListener(SWT.Selection, event -> {
            if (elements.length != 0) {

                e.gc.drawLine(textIndent, bounds.height - 4, textIndent + point.x, bounds.height - 4);
                e.gc.setBackground(bgColor);
            elements[i] = new ListElement(this, children[i], i);
                e.gc.setForeground(bottomNavigationElementShadowStroke2);
        if (widgetNormalShadow.hashCode() < widgetBackground.hashCode()) {
    public TabbedFolderList(Composite parent, boolean section) {
            } else if (hover && tab.isIndented()) {
        accessible.addAccessibleControlListener(new AccessibleControlAdapter() {
            if (selected) {
                    topVisibleIndex++;
            topNavigationElement.redraw();
			 * if only one tab will fix, reduce the size of the tab height so
     */
        }
            if (connectionColor != null) {
        private void paint(PaintEvent e) {
                elements[lastSelected].setSelected(false);
            bottomVisibleIndex = elements.length - 1;
    public class BottomNavigationElement extends Canvas {
        if (elements != ELEMENTS_EMPTY) {


            topVisibleIndex = 0;

            e.gc.drawLine(0, 0, bounds.width - 1, 0);
         * Constructor for BottomNavigationElement.

            formData.top = new FormAttachment(0, 0);
            Color listBackground = UIStyles.getDefaultTextBackground();
        /*
    private boolean isDownScrollRequired() {
        if (tabsThatFitInComposite == 1) {
				/* selected tab is bold font */
            if ((e.stateMask & SWT.CTRL) != SWT.CTRL && (e.stateMask & SWT.ALT) != SWT.ALT) {
                e.gc.drawLine(middle, bottom - 1, middle + 1, bottom - 1);
        }
            Color bgColor = getWidgetBackground(true);
			 * draw the top two lines of the tab, same for selected, hover and
            }
    private final TopNavigationElement topNavigationElement;
                if (!hover) {
			 */
        setLayout(new FormLayout());
    private Point getTextDimension(String text) {
    private int getTabWidth(TabbedFolderInfo folderInfo) {
            e.gc.setForeground(widgetForeground);
            e.gc.setForeground(bgColor);
/*
    /**
			/*

         *
        if (tabsThatFitInComposite == NONE || elements.length == 0) {
			 * that the navigation elements fit.
			/*
        /**
                return;
            topVisibleIndex = 0;
        elements = ELEMENTS_EMPTY;
            formData.bottom = new FormAttachment(100, 0);
			 */
            int width = getTabWidth(elements[widestLabelIndex].getInfo()) + INDENT_LEFT;

     */
            addPaintListener(this::paint);
            e.gc.setForeground(widgetForeground);
                e.gc.fillRectangle(0, 2, bounds.width - 1, bounds.height - 1);
            }));
    public Point computeSize(int wHint, int hHint, boolean changed) {
    public int getNumberOfElements() {
        layout(true);
            formData.right = new FormAttachment(100, 0);

            }

            public void focusLost(FocusEvent e) {
     * scroll button when scrolling is needed or is just a spacer when no
                e.gc.setForeground(bgColor);
        gc.dispose();

        });
        widgetNormalShadow = display.getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);
        TabbedFolderInfo[] tabs = new TabbedFolderInfo[elements.length];
        bottomNavigationElementShadowStroke2 = sharedColors.getColor(UIUtils.blend(black, widgetBackground.getRGB(), 5));
			 * Add INDENT_LEFT pixels to the left of the longest tab as a margin.
                }
         * Paint the element.
         */
            && bottomVisibleIndex != elements.length - 1;
        } else {
				/* draw a line if the tab has focus */
                    formData = new FormData();
    }
 * @author Anthony Hunter
    /**
        UIUtils.installAndUpdateMainFont(this);
    protected void computeTabsThatFitInComposite() {
                }

 */
            selectedElementIndex = index;
            return listBackground;
                e.gc.setFont(BaseThemeSettings.instance.partTitleFont);
            formData = new FormData();
            } else {
		 * white 20% + INFO_BACKGROUND 60% end colour WIDGET_NORMAL_SHADOW 100% +
            super.setBackground(widgetBackground);
            } else if (hover) {


            }
 * @author Serge Rider
            width = width + image.getBounds().width + 4;
            }
                e.gc.setForeground(widgetDarkShadow);
         */
					 */
        widestLabelIndex = NONE;

        } else {
                final Rectangle imageBounds = image.getBounds();
                hover = false;
            if (isDownScrollRequired()) {
import java.util.IdentityHashMap;
			/*
    public void handleTraverse(TraverseEvent e) {
            super(parent, SWT.NO_FOCUS);
            UIUtils.blend(infoBackground,
        this.addFocusListener(new FocusListener() {


     */
}
			 * use nextElement to attach the layout to the previous canvas
                focus = true;
                }
		 * gradient in the hover tab: start colour WIDGET_BACKGROUND 100% +
    private Color elementBackground;
        for (int i = 0; i < children.length; i++) {
 * Shows the list of tabs in the tabbed property sheet page.
         * @param parent the parent Composite.
                    return;
        }
        addListener(SWT.DefaultSelection, event -> listener.widgetDefaultSelected(new SelectionEvent(event)));
                    formData.height = getTabHeight();
        hoverGradientStart = sharedColors.getColor(UIUtils.blend(white, widgetBackground.getRGB(), 20));

            for (ListElement element : elements) {
                focus = false;

                if (tab.isIndented()) {
                if (selected || hover) {
                    topNavigationElement.redraw();

            addMouseListener(MouseListener.mouseUpAdapter(mouseEvent -> {
                e.gc.drawLine(0, bounds.height - 1, bounds.width - 2,
    private int tabsThatFitInComposite = NONE;
			 * no tabs to display.
     * Deselects all the elements in the list.
    public TabbedFolderInfo[] getElements() {
    private int getIndex(ListElement element) {
			/*

    private static final RGB white = new RGB(255, 255, 255);
    }
            redraw();

        //CSSUtils.setCSSClass(this, "MPartStack");
        addListener(SWT.Selection, event -> listener.widgetSelected(new SelectionEvent(event)));
    private static final RGB black = new RGB(0, 0, 0);
			/* draw the text */
            formData.top = new FormAttachment(nextElement, 0);

    /**
        }

    public static final String LABEL_NA = "N/A";
 * See the License for the specific language governing permissions and
            addMouseListener(MouseListener.mouseUpAdapter(mouseEvent -> {
                    bottomNavigationElement.redraw();
    }
        layoutTabs();
        computeTabsThatFitInComposite();

            widestLabelIndex = 0;
            topNavigationElement.setLayoutData(formData);
            FormData formData = new FormData();

			 * all the tabs fit.

                    e.gc.drawLine(bounds.width - 1, 0, bounds.width - 1, bounds.height - 1);
                e.gc.setBackground(bgColor);
        defaultGradientEnd = sharedColors.getColor(UIUtils.blend(infoBackground, widgetNormalShadow.getRGB(), 40));
                String tooltip = tab.getTooltip();
    private void initColours() {
                    textIndent = textIndent + INDENT_LEFT;
                }
            super(parent, SWT.NO_FOCUS);
            public void getRole(AccessibleControlEvent e) {
        public TabbedFolderInfo getInfo() {
                    }
    public class ListElement extends Canvas {
     * Determine if a downward scrolling is required.
                e.gc.setForeground(widgetNormalShadow);
    public class TopNavigationElement extends Canvas {
        /**

    Color widgetForeground;
        for (int i = 0; i < elements.length; i++) {
    private Color getWidgetBackground(boolean adapt) {
			 * default
                    e.height = location.height;
        indentedDefaultBackground = sharedColors.getColor(UIUtils.blend(white, widgetBackground.getRGB(), 10));
import java.util.Map;
			 */
    private boolean isUpScrollRequired() {
			 */
            redraw();

            addPaintListener(this::paint);

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

        } else if (getSelectionIndex() + tabsThatFitInComposite > elements.length) {
                if (isDownScrollRequired()) {
            hover = false;
            }));
        return elements.length > tabsThatFitInComposite && topVisibleIndex != 0;
            bottomVisibleIndex = elements.length - 1;
        }
        );
 *
            }
 * Unless required by applicable law or agreed to in writing, software
     */
            elementBackground = sharedColors.getColor(UIUtils.blend(black, widgetBackground.getRGB(), 15));
            formData.right = new FormAttachment(100, 0);
                if (i != widestLabelIndex) {
                    bottomNavigationElement.redraw();
     *
     */
    }
			 */
         *
        elements = new ListElement[children.length];

         *
    }

    }
                e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
                e.gc.drawLine(middle + 1, 3, middle + 5, 7);
        });
                int height = fm.getHeight();
         */
        } else {
                int bottom = bounds.height - 3;
    private Color hoverGradientEnd;
     *


        }
    public void deselectAll() {
        */
        return width;

                //e.gc.setBackground(defaultGradientEnd);
            }

        if (UIStyles.isDarkTheme()) {
            Rectangle bounds = getBounds();
                e.gc.drawText(LABEL_NA, textIndent, textMiddle);
    }
            addPaintListener(this::paint);
                nCurrent -= 1;
     * Get the height of a tab. The height of the tab is the height of the text
        private final int index;
                    elements[i].redraw();
     *
            e.doit = true;

                        widestLabelIndex = i;
            width = width + INDENT_LEFT;
            }

        }
                e.gc.setBackground(elementBackground);
            }
			/* draw the bottom line on the tab for selected and default */

                    int width = getTabWidth(elements[i].tab);
        }

        return tabHeight;
        if (elements != null) {
        Display display = getDisplay();
		 * gradient in the default tab: start colour WIDGET_NORMAL_SHADOW 100% +
            formData.bottom = new FormAttachment(100, 0);
            removeAll();
    protected static final int INDENT_LEFT = 7;
                    e.gc.drawImage(getGrayedImage(image), textIndent, imageMiddle - 1);
        return element.index;
        Point result = super.computeSize(wHint, hHint, changed);
            e.gc.setForeground(widgetForeground);


    }
         * Paint the element.
                int middle = bounds.width / 2;
import org.eclipse.swt.SWT;
            widgetBackground = UIStyles.getDefaultWidgetBackground();
        selectedElementIndex = NONE;
     * @return the height of a tab.
        private final TabbedFolderInfo tab;
        });
                e.gc.setBackground(indentedDefaultBackground);


            formData.left = new FormAttachment(0, 0);
         * @param parent the parent Composite.
        initAccessible();
     * @param text the string.
                Point pt = toControl(new Point(e.x, e.y));
        public ListElement(@NotNull Composite parent, @NotNull TabbedFolderInfo tab, int index) {
        }
		 * 10%
                        connectionColor = sharedColors.getColor(UIUtils.blend(black, connectionColor.getRGB(), 15));
     * scrolling is required.
            int height = fm.getHeight();
     *
            if (((TabbedFolderList) getParent()).focus && selected) {
import org.eclipse.swt.widgets.Event;
                e.gc.drawLine(0, bottom + 2, bounds.width - 2, bottom + 2);
		 */
            for (Image di : grayedImages.values()) {
                if (getSelectionIndex() != NONE) {
                    }

        widgetForeground = UIStyles.getDefaultTextForeground();
        if (folderInfo.getImage() != null) {
import org.eclipse.jface.text.source.ISharedTextColors;

					 * redraw the next tab to fix the border by calling
    }
                e.gc.drawLine(middle - 3, 7, middle + 4, 7);
            }
                    elements[i].setVisible(true);
        bottomVisibleIndex = NONE;
    private void initAccessible() {
            topVisibleIndex = 0;
    }
                     * focus is moved to the appropriate widget in the
                if (i >= 0) {
        } else if (widestLabelIndex == -1) {
			 * there is no selected tab yet, assume that tab one would
		 * To anticipate for the icon placement we should always keep the
        }
    public static final int SECTION_DIV_HEIGHT = 7;

            return elements[index];
        public String toString() {

			/*
            elements[getSelectionIndex()].setSelected(false);

            UIUtils.asyncExec(() -> { if (!isDisposed()) redraw(); });
                int middle = bounds.width / 2;
     * @return the index of the selected item
                e.gc.drawLine(middle, 4, middle + 1, 4);
    }
            tabs[i] = elements[i].getInfo();
    /**
                if (isUpScrollRequired()) {
            grayedImages.clear();
            public void getState(AccessibleControlEvent e) {
            public void focusGained(FocusEvent e) {
         */
    }
     * The top navigation element in the tabbed property list. It looks like a
                e.gc.setForeground(navigationElementShadowStroke);
        this.addTraverseListener(this::handleTraverse);
        ISharedTextColors sharedColors = UIUtils.getSharedTextColors();
        }
    protected static final int INDENT_RIGHT = 10;


        } else if (tabsThatFitInComposite >= elements.length) {
            FormData formData = new FormData();
                int textMiddle = (bounds.height - height) / 2;
    protected static final int NONE = -1;
            int lastSelected = getSelectionIndex();
            } else if (tab.isIndented()) {
    private int selectedElementIndex = NONE;
            formData.top = new FormAttachment(topNavigationElement, 0);
                if (i >= 0) {
     * Returns the zero-relative index of the item which is currently selected
            formData.height = 10;
                e.gc.drawLine(0, 2, bounds.width - 2, 2);
public class TabbedFolderList extends ConComposite {

    public void select(int index) {
                }
        this.addControlListener(ControlListener.controlResizedAdapter(e -> {

                    bounds.height + 1);

            return tab.getText();
                e.gc.fillRectangle(0, 2, bounds.width - 1, bounds.height - 1);
            elementBackground = sharedColors.getColor(UIUtils.blend(white, widgetBackground.getRGB(), 15));
                        // Foreground darker than background - make element background darker
        }
                        connectionColor = sharedColors.getColor(UIUtils.blend(white, connectionColor.getRGB(), 15));
                }

         * @param tab    the tab item for the element.
    }
                e.gc.setForeground(bgColor);

        gc.setFont(BaseThemeSettings.instance.partTitleBoldFont);

                    e.x = pt.x;
                e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
     * @param index the zero-based index
        computeTabsWidth();
        return elements.length > tabsThatFitInComposite
     * The top navigation element in the tabbed property list. It looks like a
        /**

                UIUtils.dispose(di);
			 * widget in the list.

import org.eclipse.swt.widgets.Display;
                    if (listBackground.hashCode() < connectionColor.hashCode()) {
    private Color bottomNavigationElementShadowStroke1;
            }
            setFont(TabbedFolderList.this.getFont());
            Rectangle bounds = getBounds();
            bottomVisibleIndex = tabsThatFitInComposite - 1;
            }));
            }
            formData.right = new FormAttachment(100, 0);
         * Get the tab item.

        }
            for (int i = 0; i < elements.length; i++) {
            if (e.detail == SWT.TRAVERSE_PAGE_PREVIOUS) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                e.gc.setForeground(hoverGradientStart);
            elements[i].setVisible(false);
                if (getSelectionIndex() != elements.length - 1) {
 * you may not use this file except in compliance with the License.
/**
import org.jkiss.code.NotNull;
 *
		 * an icon the width of the tab doesn't change.

         *
         */
            if (isFocusControl()) {
         *
                }
            } else {

                e.gc.setFont(BaseThemeSettings.instance.partTitleBoldFont);

                e.childID = (getBounds().contains(pt)) ? ACC.CHILDID_SELF : ACC.CHILDID_NONE;
                e.gc.setForeground(widgetDarkShadow);
            } else if (tab.isIndented()) {

    private int bottomVisibleIndex = NONE;
     * in the receiver, or -1 if no item is selected.
            }
                     * section.
            }
            bottomNavigationElement.redraw();
                        bottomVisibleIndex++;
            result.x = getTextDimension(LABEL_NA).x + INDENT_LEFT;

            bottomNavigationElement.setLayoutData(formData);
    }
                e.gc.drawLine(middle - 2, 6, middle + 3, 6);

            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    bottomVisibleIndex--;

            elements[index].getInfo().getContents().setFocus();
        });
    }

                e.gc.setForeground(bgColor);
                }
         * @param parent the parent Composite.
