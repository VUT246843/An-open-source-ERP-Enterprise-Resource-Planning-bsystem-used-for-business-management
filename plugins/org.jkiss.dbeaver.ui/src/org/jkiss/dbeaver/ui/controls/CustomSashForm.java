            gc.drawRoundRectangle(leftArrowPos, 0, rightArrowPos - leftArrowPos, sashDim - 1, 3, 3);


        weights[1] = sashinfo.restoreWeight;
            return;    // No arrows to handle in this case.
    public static final Color DEFAULT_BORDER_COLOR = new Color(153, 180, 209, 255);

                currentSashInfo.sashBorderRight = sashBorders != null && sashBorders[1];
 *  CustomSashForm
            height = tSize;
                boolean isTwoArrows = currentSashInfo.sashLocs.length > 1;
import org.eclipse.swt.SWTError;
                        currentSashInfo.sash.setToolTipText(null);
                    break;
        gc.setBackground(arrowColor);

    public void hideDown() {
                    int locIndex = vertical ? X_INDEX : Y_INDEX;
        }
            } else if (currentSashInfo.restoreWeight != NO_WEIGHT && sashBounds.y + sashBounds.height >= clientArea.height - DRAG_MINIMUM) {
    }
    }
                    currentSashInfo.sash.redraw();
                        currentSashInfo.sash.setCursor(null);
    public static final int
                        currentSashInfo.cursorOver = NO_ARROW;
    }
                }
        downHideClicked();
        Control[] children = getChildren();
                currentSashInfo = new SashInfo(newSash);
        //
                                case DOWN_RESTORE_ARROW:
            });
import org.eclipse.swt.events.*;
            }
                    boolean vertical = getOrientation() == SWT.VERTICAL;

                currentSashInfo.sashBorderRight = sashBorders != null && sashBorders[1];
        else
        int height;
            return;
import org.eclipse.swt.widgets.*;

 * Licensed under the Apache License, Version 2.0 (the "License");
                        int loc = vertical ? x : y;
            newSash.addMouseMoveListener(e -> {
        }
        int[][] sashLocs = sashInfo.sashLocs;
                currentSashInfo.restoreWeight = NO_WEIGHT;    // Since we are in the middle, there is no restoreWeight. We've could of been dragged here.
        gc.drawPolygon(triangle);
                    break;
            // Want to handle mouse down as a selection.
    private final static int NOT_SLAMMED = 1;
        noHideUp = bHide;
            Control child = children[i];
        int[] addArrows;
                int x = e.x;

        int[] triangle = new int[] {
        weights[1] = 0;
        Point s = sashInfo.sash.getSize();

     */

            if (slammed == SLAMMED_TO_BOTTOM) {

                addArrows = new int[2];
 */
     */
                x += tSize;
            // This is a kludge because we can't override the set cursor hit test.
                                case UP_RESTORE_ARROW:
                    //currentSashInfo.sash.redraw();
                for (int i = 0; i < currentSashInfo.sashLocs.length; i++) {
    private boolean[] sashBorders;    // Whether corresponding control needs a sash border
        for (int i = 0; i < children.length && iChildToSave < 2; i++) {
        Rectangle clientArea = getClientArea();
    }
            x + ARROW_MARGIN, y + ARROW_HEIGHT - 1,
     * one arrow. When not hidden, it will point down (and will do a hide down),
            x + ARROW_HEIGHT - 1, y + ARROW_MARGIN,
        weights[0] = 1000 - sashinfo.restoreWeight;    // Assume weights are always in units of 1000.

        }

                // See if within one of the arrows.
                    }
        } else {
                        int[] locs = currentSashInfo.sashLocs[i];
    }
                addArrows = new int[1];

            NO_HIDE_DOWN = NO_HIDE_RIGHT;    // Custom style bit for not allow hide down
            ARROW_DRAWN_INDEX = 1,



                drawArrows[0] = UP_RESTORE_ARROW;

        int aSize = ARROW_WIDTH;    // Width of arrow
                    break;
        weights[1] = sashinfo.restoreWeight;
    /**
 * limitations under the License.
            y = start;

        // Save control sizes
            });
                //Not slammed
            ARROW_HEIGHT = 5,
                    int y = e.y;
                drawArrows[0] = DOWN_RESTORE_ARROW;
     * Set the need sash borders for the controls.
    // Draw at the given x/y (upper left corner of arrow area).
        if (weights.length != 2 || (sashBorders != null && sashBorders.length != 2)) {
        int[][] thisSash = sashInfo.sashLocs;
                public void controlMoved(ControlEvent e) {
                final Color oldBg = gc.getBackground();
                }

        if (weight >= 0 && currentSashInfo != null) {
        } else {
        if (currentSashInfo == null)
                if (isTwoArrows) {
        int start;
        Control[] children = getChildren();
        if (currentSashInfo == null || currentSashInfo.sash == null) {
        public int[][] sashLocs;    // There is one entry for each arrow, It is arrowType/arrowDrawn/x/y/height/width of the arrow area.
            gc.drawLine(sashDim / 2, 0, sashDim / 2, topArrowPos);
import org.eclipse.swt.custom.SashForm;
     * @since 1.2.0
    /**

     */
        super(parent, style);
     * @see org.eclipse.swt.widgets.Composite#layout(boolean)
        if (currentSashInfo == null || currentSashInfo.restoreWeight <= 0) {
                int y = e.y;
        }


                            currentSashInfo.sash.redraw();
        if (getOrientation() == SWT.VERTICAL) {
        int iChildToSave = 0;
        boolean lowerFocus = isFocusAncestorA(children[1]);
        if (weights.length != 2) {
            return currentSashInfo.savedSizes;
            x = (s.x - ARROW_HEIGHT) / 2;    // Center horizontally, no margin required.
        gc.fillPolygon(triangle);

                drawArrows = new int[2];
    protected boolean isFocusAncestorA(Control control) {
                public void controlResized(ControlEvent e) {
    public CustomSashForm(Composite parent, int style) {

    protected boolean noHideUp, noHideDown;
            }
                    //if (currentSashInfo.sashBorderLeft)
                            }
    }
        if (customSashFormListeners != null && customSashFormListeners.size() > 0) {
        } else {
                    return;    // Don't go on.
        if (noHideUp && noHideDown)
            y = (s.y - ARROW_HEIGHT) / 2;    // Center vertically, no margin required.
        // This means restore just the sash below restoreWeight and reduce the above restoreWeight by the right amount.
                        int loc = vertical ? x : y;
        if (getMaximizedControl() != null)
    // Draw at the given x/y (upper left corner of arrow area).
        try {
        };
            }
package org.jkiss.dbeaver.ui.controls;
            UP_HIDE_ARROW = 1,
                currentSashInfo.sashBorderLeft = false;
                                    currentSashInfo.sash.setToolTipText(UIMessages.tooltip_hide);
    protected void downHideClicked() {
                }
import org.jkiss.dbeaver.ui.internal.UIMessages;
        sashBorders = new boolean[]{true, true};
                                case DOWN_HIDE_ARROW:

                drawArrows[0] = UP_RESTORE_ARROW;
        setWeights(weights);
        // We need to refigure size for the sash arrows.
        weights[1] = 1000;
        } else if (vertical) {
            log.debug(e);
                addArrows[0] = UP_HIDE_ARROW;
    private boolean showBorders = false;
        fireDividerMoved();
            int bottomArrowPos = sashLocs[lastLocIndex][3] + sashLocs[lastLocIndex][4] + ARROW_MARGIN * 3;
                addArrows[0] = UP_HIDE_ARROW;
import org.eclipse.swt.SWT;
                                    upHideClicked(currentSashInfo);
                    for (int i = 0; i < currentSashInfo.sashLocs.length; i++) {
    }
                // Reuse the array
                        int locIndex = vertical ? X_INDEX : Y_INDEX;
        // Now we need to see if this is a new sash.
    }

            return false;
    }
        gc.setForeground(arrowColor);
                int firstControlWeight = weights[0];
        weights[0] = 1000;
        // has a single arrow type showing.
    }
                addArrows[0] = DOWN_HIDE_ARROW;
            if (currentSashInfo.restoreWeight != NO_WEIGHT && sashBounds.x <= DRAG_MINIMUM) {
     * has the focus. Control.isFocusAncestor is hidden by SWT, but it is really useful.
    public boolean isUpHidden() {
                case UP_RESTORE_ARROW:
    }
        // Up hide, so save the current restoreWeight of 1 into the sash info, and move to the top.
                                    break;
            return false;

     * Helper method for upHideClicked / downHideClicked
            setWeights(weights);
        gc.fillPolygon(triangle);


    }

                currentSashInfo.sashBorderRight = sashBorders != null && sashBorders[1];
            int[] weights = getWeights();
/*
                // Need to find the index of the sash we're interested in.
            }
            if (slammed == SLAMMED_TO_TOP) {
            gc.drawLine(rightArrowPos,  sashDim / 2, s.x - 1, sashDim / 2);
        int lastLocIndex = sashLocs.length - 1;
                    // See if within one of the arrows.
        if (newSash == null)
                    // If we're within a button, then redraw to wipe out stipple and get button push effect.
    protected void upHideClicked(SashInfo sashinfo) {
                    }
                            currentSashInfo.sash.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_HAND));

    public void setNoHideLeft(boolean bHide) {
                currentSashInfo.restoreWeight = NO_WEIGHT;    // Since we are in the middle, there is no restoreWeight. We've could of been dragged here.
        gc.setBackground(arrowColor);

        gc.drawPolygon(triangle);
            Y_INDEX = 3,
        } else {
    private void saveChildControlSizes() {
    protected void fireDividerMoved() {
    /*
        public int restoreWeight = NO_WEIGHT;    // If slammed to an edge this is the restore weight. -1 means not slammed. This is the restoreWeight in the 2nd section form, i.e. weights[1].
        if (currentSashInfo == null)


        weights[0] = 1000 - sashinfo.restoreWeight;    // Assume weights are always in units of 1000.
        if (upperFocus)
                slammed = SLAMMED_TO_TOP;
                // If we got here, the mouse position does not lie within the bounds of an arrow
     */
        upRestoreClicked(currentSashInfo);
 *
                drawArrows[0] = DOWN_RESTORE_ARROW;
            } else {
    public void setNoHideUp(boolean bHide) {
 * A SashForm that allows hide/restore controls on sash.
        }
 * <p>
     */
        }
                            //currentSashInfo.sash.redraw();
                slammed = SLAMMED_TO_TOP;
    }
                                    downHideClicked();
            HEIGHT_INDEX = 5;
                currentSashInfo.sashBorderRight = sashBorders != null && sashBorders[1];
     * This determines if the control or one of its children
        Rectangle sashBounds = currentSashInfo.sash.getBounds();
        int[] weights = getWeights();

                currentSashInfo.sashBorderRight = false;
        // addArrows are the types of the arrows - hide/restore/up/down and
            }
                case DOWN_HIDE_ARROW:

                addArrows = new int[1];
                    fireDividerMoved();
 * You may obtain a copy of the License at
            start = (s.x - neededSize) / 2;
            // Need to know when we leave so that we can clear the cursor feedback if set.
        public Sash sash;


                y += tSize;
 *
    }
 * Unless required by applicable law or agreed to in writing, software
                addArrows[0] = UP_RESTORE_ARROW;
                currentSashInfo.sashBorderLeft = sashBorders != null && sashBorders[0];
import org.jkiss.dbeaver.Log;
    }
            X_INDEX = 2,
                layout(true);
            currentSashInfo.restoreWeight = weight;
    }
            int leftArrowPos = sashLocs[0][2] - ARROW_MARGIN;
                    }
            return -1;
     */
            return;    // We have a maximized control, so we don't need to worry about the sash.
    protected void drawDownArrow(GC gc, int x, int y) {

     */
        downRestoreClicked(currentSashInfo);
        }
    public void addCustomSashFormListener(ICustomSashFormListener listener) {
        gc.setForeground(arrowColor);
    
                addArrows = new int[1];
                thisSash[j] = new int[]{addArrowTypes[j], drawArrowTypes[j], x, y, width, height};
        }
                        return;
                            switch (locs[ARROW_TYPE_INDEX]) {
                currentSashInfo = null;
    public Point[] getSavedSizes() {

        }
        sashinfo.restoreWeight = NO_WEIGHT;
        int tSize = aSize + 2 * ARROW_MARGIN;        // Total Width (arrow + margin)

    /**
     */
                                case DOWN_RESTORE_ARROW:

                drawArrow(gc, currentSashInfo.sashLocs[0]);    // Draw first arrow
            currentSashInfo.restoreWeight = weights[1];    // Not currently maxed, save current restoreWeight.
            return currentSashInfo.restoreWeight;
                }
    /*
                                    break;
                    for (int i = 0; i < currentSashInfo.sashLocs.length; i++) {
            switch (sashLoc[ARROW_DRAWN_INDEX]) {
    /**
                drawArrows[0] = UP_RESTORE_ARROW;
                                case UP_HIDE_ARROW:
        } else if (weights[0] == 0) {
        for (int j = 0; j < addArrowTypes.length; j++) {

                //Not slammed
        } else {
/*
public class CustomSashForm extends SashForm {
    protected static final int
            width = tSize;
            else {
            x + ARROW_MARGIN + ARROW_WIDTH/2 - 1, y + ARROW_HEIGHT - 1
            if (thisSash[j] == null)
                 */
    }
    }

    }
            // Just ignore
            x + ARROW_MARGIN + ARROW_WIDTH/2, y + 1
            DOWN_RESTORE_ARROW = 2,
        weights[0] = 0;
    private static final int NO_ARROW = -1;
            // Sometimes it happens if sash controls aren't yet created
            currentSashInfo = new SashInfo(null);
     * Sets the <code>noHideUp</code> setting for vertical CustomSashForm.
        int oldAntialias = gc.getAntialias();
            }
     */
                addArrows = new int[1];
                addArrows[1] = DOWN_HIDE_ARROW;
        int[] weights = getWeights();
        int[] drawArrows;
                case DOWN_RESTORE_ARROW:
        int neededSize = tSize * addArrowTypes.length;
    protected List<ICustomSashFormListener> customSashFormListeners = null;
    public boolean isShowBorders() {
                    currentSashInfo.sash.setToolTipText(null);
        gc.fillPolygon(triangle);
                            // We found it.
                drawArrows = new int[1];
        int y;
            }
        int indent = 0;
                public void mouseDown(MouseEvent e) {
     */
                        if (currentSashInfo.cursorOver == NO_ARROW) {
        int[] weights = getWeights();
            slammed = SLAMMED_TO_BOTTOM;

    private final static int SLAMMED_TO_BOTTOM = 2;
                for (ICustomSashFormListener listener : customSashFormListeners) {

                        if (locs[locIndex] <= loc && loc <= locs[locIndex] + locs[sizeIndex]) {
//		int[][] thisSash = sashInfo.sashLocs;
                            break;
     */
    public void setSashBorders(boolean[] sashBorders) {
                                    break;

    }
                    currentSashInfo.sash.setCursor(null);

        Point s = sashInfo.sash.getSize();
            }
            return null;
        //
 *
        };
                        boolean vertical = getOrientation() == SWT.VERTICAL;
     * Sets the <code>noHideRight</code> setting for horizontal CustomSashForm.
import java.util.ArrayList;
                }

        while (focusControl != null && focusControl != control) {
            WIDTH_INDEX = 4,

                    recomputeSashInfo();
        gc.setLineStyle(SWT.LINE_SOLID);

            }

    protected void drawArrow(GC gc, int[] sashLoc) {
            gc.drawRoundRectangle(0, topArrowPos, sashDim - 1, bottomArrowPos - topArrowPos, 3, 3);
                                    upRestoreClicked(currentSashInfo);
     * Sets the <code>noHideDown</code> setting for vertical CustomSashForm.
            slammed = SLAMMED_TO_TOP;


                    currentSashInfo.cursorOver = NO_ARROW;
    protected void drawRightArrow(GC gc, int x, int y) {

        setWeights(weights);
    protected static class SashInfo {
    /*
            gc.drawLine(0,  sashDim / 2, leftArrowPos, sashDim / 2);
    protected void downRestoreClicked(SashInfo sashinfo) {
//        gc.setLineStyle(SWT.LINE_CUSTOM);
            x + ARROW_HEIGHT - 1, y + ARROW_MARGIN + ARROW_WIDTH,
                }
        // Need to schedule a redraw (?) because it has already drawn the old ones during the set bounds in super layout.
                    drawArrow(gc, currentSashInfo.sashLocs[1]);    // Draw second arrow
     * Call to set to hide up
                // Need to clear out the widget from current.
    /**
        }
                public void mouseExit(MouseEvent e) {
            x + 1, y + ARROW_MARGIN,
 * It only works with one sash (two children). It doesn't make sense
        upHideClicked(currentSashInfo);
                                case DOWN_HIDE_ARROW:
        // drawArrows are always RESTORE arrow types, so that the UI only
        return weights.length == 2 && weights[1] == 0;
        if (noHideUp) {
    public void setShowBorders(boolean showBorders) {
                slammed = SLAMMED_TO_BOTTOM;
        int sashDim = getSashWidth();
                }
                    if (currentSashInfo != null) {
        this.sashBorders = sashBorders;
                int secondControlWeight = weights[1];
        // If the upper panel has focus, flip focus to the lower panel because the upper panel is now hidden.
        int[] triangle = new int[] {

                currentSashInfo.sashBorderRight = false;


                GC gc = e.gc;
 * you may not use this file except in compliance with the License.
    public void showDown() {
    }
            start = (s.y - neededSize) / 2;
/**
            saveChildControlSizes();
                    recomputeSashInfo();
    public interface ICustomSashFormListener {
                drawArrows[0] = UP_RESTORE_ARROW;
        Display display = getDisplay();

            NO_HIDE_UP = NO_HIDE_LEFT,    // Custom style bit for not allow hide up
            if (slammed == SLAMMED_TO_TOP) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                                case UP_HIDE_ARROW:
            else
                    break;

            if (!(child instanceof Sash)) {

            newSash.addMouseListener(new MouseAdapter() {

        int[] weights = getWeights();

        // Let's get the list of all sashes the sash form now has. If there is more than one then just disable the sashinfo.
    }

        sashinfo.restoreWeight = NO_WEIGHT;
     * Call to set to hide down

    public void showUp() {
                drawArrows = new int[1];
        return control == focusControl;
        }

        //currentSashInfo.sash.redraw();
                                    break;
                    listener.dividerMoved(firstControlWeight, secondControlWeight);

            children[1].setFocus();

        gc.setAntialias(SWT.ON);
                /**
     * is not permitted. For example, if NO_HIDE_UP, then there will be only
        if (currentSashInfo.restoreWeight == NO_WEIGHT) {
        int[] triangle = new int[] {
                currentSashInfo.sash = newSash;
                            currentSashInfo.cursorOver = i;
            } else {
                drawArrows = new int[1];
    }
        fireDividerMoved();
            switch (sashLoc[ARROW_DRAWN_INDEX]) {
    protected Color arrowColor;
    }
 * DBeaver - Universal Database Manager
                        int[] locs = currentSashInfo.sashLocs[i];
    /**

    public boolean isDownHidden() {
                        boolean vertical = getOrientation() == SWT.VERTICAL;
                        int sizeIndex = vertical ? WIDTH_INDEX : HEIGHT_INDEX;
                    int[] locs = currentSashInfo.sashLocs[i];
                    drawLeftArrow(gc, sashLoc[X_INDEX] + indent, sashLoc[Y_INDEX] + indent);
        } else if (noHideDown) {
                    if (locs[locIndex] <= loc && loc <= locs[locIndex] + locs[sizeIndex]) {
        if (getOrientation() == SWT.VERTICAL) {
        //
            if (weights != null && weights.length == 2) {
    protected void drawUpArrow(GC gc, int x, int y) {
        } catch (SWTError e) {
    public void setRestoreWeight(int weight) {
            UP_RESTORE_ARROW = 0,
        // TODO: Use of DRAG_MINIMUM is a kludge, required because SashForm only allows you to close each part so far
                case DOWN_RESTORE_ARROW:
     * previous weight). There won't be a hide to the top arrow.
    /**
    public int getRestoreWeight() {

            height = aSize;

        setNoHideDown(bHide);
 * for the arrows when there is more than one sash. Things get confusing for

        }
 * See the License for the specific language governing permissions and
    protected void drawLeftArrow(GC gc, int x, int y) {
            if (child instanceof Sash) {

                    //if (currentSashInfo.sashBorderRight)
                        //currentSashInfo.sash.redraw();
        int[] weights = getWeights();
        if (currentSashInfo.restoreWeight == NO_WEIGHT) {
    /**
                        }
            //recomputeSashInfo();

            if (currentSashInfo.restoreWeight != NO_WEIGHT && sashBounds.y <= DRAG_MINIMUM) {
                iChildToSave++;
                drawArrows = new int[1];
                currentSashInfo.sashBorderLeft = sashBorders != null && sashBorders[0];
        } else {
            newSash.addPaintListener(e -> {


            int topArrowPos = sashLocs[0][3] - ARROW_MARGIN;
                    int y = e.y;

                 * @see org.eclipse.swt.events.MouseTrackAdapter#mouseExit(MouseEvent)

        public boolean sashBorderLeft;    // Draw sash border left/top
    protected static final int
                case DOWN_HIDE_ARROW:
                        }

            hideUp();
        gc.setBackground(arrowColor);
     */

        // If there is no current sash, and there is only one sash, then create the sashinfo for it.

            });
     * Sets the <code>noHideLeft</code> setting for horizontal CustomSashForm.
            gc.drawLine(sashDim / 2, bottomArrowPos, sashDim / 2, s.y - 1);
     * and when hidden down, it will point up (and will do a restore to the
        if (currentSashInfo == null || currentSashInfo.restoreWeight <= 0) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected SashInfo currentSashInfo = null;    // When the sash goes away, its entry is made null.
                    drawSashBorder(gc, currentSashInfo);
        final int DRAG_MINIMUM = 20; // TODO: kludge see SashForm.DRAG_MINIMUM
                        currentSashInfo.enabled = false;
                                    downRestoreClicked(currentSashInfo);
     * Constants for recording whether the sash is slammed to the top/bottom or not slammed
                final Color oldFg = gc.getForeground();
        };
        gc.setForeground(arrowColor);
        fireDividerMoved();
        setWeights(weights);
            return;
        customSashFormListeners.add(listener);

        noHideDown = bHide;
        try {
    private static final Log log = Log.getLog(CustomSashForm.class);
                                    break;
                if (currentSashInfo.cursorOver != NO_ARROW) {
        }
        if (currentSashInfo != null) {
    }
    protected void drawSashBorder(GC gc, SashInfo sashInfo) {
            currentSashInfo.restoreWeight = weights[1];    // Not currently maxed, save position.
        Control focusControl = display.getFocusControl();
        int[] weights = getWeights();    // This should be two entries only. We shouldn't have got here if there were more than two.
            if (vertical)
                    currentSashInfo.sash.redraw();    // Make sure stipple goes away from the mouse up if not over an arrow button.
                        int locIndex = vertical ? X_INDEX : Y_INDEX;
                        // Undo the cursor.
        // If the lower panel has focus, flip focus to the upper panel because the lower panel is now hidden.
import org.eclipse.swt.graphics.Point;
    /**
        if (lowerFocus)

                                    break;
                }
        gc.setForeground(arrowColor);
        Sash newSash = null;
    }
        }

        // There may not be a second entry, in which case we have only one arrow.
        arrowColor = DEFAULT_BORDER_COLOR;
        hideUp();
                }
        return showBorders;
    }
            ARROW_TYPE_INDEX = 0,

    }
                currentSashInfo.sashBorderRight = sashBorders != null && sashBorders[1];
     * this control is disposed.

import java.util.List;
        if (currentSashInfo == null || currentSashInfo.restoreWeight <= 0) {
        return weights.length == 2 && weights[0] == 0;
        if (currentSashInfo != null)
        }
     * Call to set to hide left
        setNoHideUp(bHide);
            NO_HIDE_RIGHT = 0x2,            // Custom style bit for not allow hide right
        // drawArrows are the types of the arrows actually drawn. Here
                {
            NO_HIDE_LEFT = 0x1,            // Custom style bit for not allow hide left
//        gc.setLineDash(new int[] { 2, 5 });
        super.layout(changed);
        void dividerMoved(int firstControlWeight, int secondControlWeight);
    private final static int SLAMMED_TO_TOP = 3;
        gc.setBackground(arrowColor);
import org.eclipse.swt.graphics.GC;
            customSashFormListeners = new ArrayList<>();

                            switch (locs[ARROW_TYPE_INDEX]) {
                drawArrows = new int[1];

        boolean vertical = getOrientation() == SWT.VERTICAL;
    }

    // These are for the up/down arrow. Just swap them for left/right arrow.
    }
    // and we want the correct arrow handled correctly.
                        }
        gc.drawPolygon(triangle);
    protected static final int
            DOWN_HIDE_ARROW = 3,
        // Now decide which arrows to add, according to whether noHideUp, noHideDown and the slammed status.
            ARROW_MARGIN = 5;    // Margin on each side of arrow
    }
        }

        getNewSashArray(currentSashInfo, addArrows, drawArrows);
    /**
            newSash.addMouseTrackListener(new MouseTrackAdapter() {
            if (currentSashInfo == null)
            }
                thisSash[j][Y_INDEX] = y;

            recomputeSashInfo();    // Get initial setting
        // Down hide, so save the current restoreWeight of 1 into the sash info, and move to the bottom.
            } else if (slammed == SLAMMED_TO_BOTTOM) {
    public void hideLeft() {


                drawArrows = new int[1];
        }
    }
                drawArrows[0] = DOWN_RESTORE_ARROW;

import org.eclipse.swt.graphics.Rectangle;
        this.showBorders = showBorders;
                gc.setBackground(oldBg);
                    int x = e.x;
            });
            public void handleEvent(Event e) {
     * Custom style bits. They set whether hide to one side of the other

        int[] weights = getWeights();

    // Draw at the given x/y (upper left corner of arrow area).

            SWT.error(SWT.ERROR_INVALID_ARGUMENT);
//		if (thisSash == null) 
                    }
            ARROW_WIDTH = 12,
            x + ARROW_MARGIN + ARROW_WIDTH - 1, y + 1,

            });
                        int sizeIndex = vertical ? WIDTH_INDEX : HEIGHT_INDEX;
                            }
            children[0].setFocus();
        gc.drawPolygon(triangle);
                addArrows[0] = UP_RESTORE_ARROW;
                    if (currentSashInfo != null)
    // know not to recompute our position because a mouse up is about to happen
 */
        SASH_WIDTH = ARROW_HEIGHT + ARROW_MARGIN;
    protected void getNewSashArray(SashInfo sashInfo, int[] addArrowTypes, int[] drawArrowTypes) {
                    // Does the mouse position lie within the bounds of the arrow?
                addArrows[0] = DOWN_RESTORE_ARROW;
            x + ARROW_MARGIN + ARROW_WIDTH, y + ARROW_HEIGHT - 1,
            int rightArrowPos = sashLocs[lastLocIndex][2] + sashLocs[lastLocIndex][5] + ARROW_MARGIN * 3;
            return;    // We have no sashes at all.
                addArrows[0] = DOWN_RESTORE_ARROW;
            x + 1, y + ARROW_MARGIN + ARROW_WIDTH,


        sashInfo.sashLocs = new int[addArrowTypes.length][];
            x + ARROW_HEIGHT - 1, y + ARROW_MARGIN + ARROW_WIDTH/2
        if (weights[1] == 0) {
    }
                addArrows = new int[1];


    private static final int NO_WEIGHT = -1;
        public boolean enabled;    // Whether this sashinfo is enabled (i.e. if there is more than one, this will be disabled).
    protected void upRestoreClicked(SashInfo sashinfo) {

        if (currentSashInfo == null || currentSashInfo.restoreWeight <= 0) {

                        }
            saveChildControlSizes();
                slammed = SLAMMED_TO_BOTTOM;
            }
            }
        if (customSashFormListeners == null)
}
                    // We have more than one sash, so need to disable current sash, if we have one.
        boolean upperFocus = isFocusAncestorA(children[0]);
                thisSash[j][X_INDEX] = x;
        // Work out whether the sash is slammed to the top / bottom or not slammed
    }
        public boolean sashBorderRight;    // Draw sash border right/bottom
        //
        if (oldAntialias != SWT.ON) {
 */
                    int sizeIndex = vertical ? WIDTH_INDEX : HEIGHT_INDEX;
    public void setNoHideDown(boolean bHide) {
                    drawDownArrow(gc, sashLoc[X_INDEX] + indent, sashLoc[Y_INDEX] + indent);
        }

                }
        for (Control child : children) {
    // Draw at the given x/y (upper left corner of arrow area).
                    //    drawSashBorder(gc, currentSashInfo.sash, false);
                gc.setForeground(oldFg);
            width = aSize;
        // This means restore just the sash below restoreWeight and increase the above restoreWeight by that amount.
                    drawRightArrow(gc, sashLoc[X_INDEX] + indent, sashLoc[Y_INDEX] + indent);
                thisSash[j][HEIGHT_INDEX] = height;
    public void setNoHideRight(boolean bHide) {
                currentSashInfo.sashBorderLeft = false;
                    int loc = vertical ? x : y;

            return;
                    int x = e.x;
        }
        }
                currentSashInfo.sashBorderLeft = sashBorders != null && sashBorders[0];
        fireDividerMoved();
    public void hideRight() {
        }
        } catch (SWTError e) {
            HIDE_ARROWS = 4;
    }
            newSash.addDisposeListener(e -> {
     * Adds a custom sashform listener. This listener will be removed when
    protected void recomputeSashInfo() {
                currentSashInfo.savedSizes[iChildToSave] = child.getSize();
                case UP_RESTORE_ARROW:
     * Call to set to hide right
            newSash.addControlListener(new ControlListener() {
            hideDown();
        if (vertical) {
                removeListener(SWT.Resize, this);
            } else if (currentSashInfo.restoreWeight != NO_WEIGHT && sashBounds.x + sashBounds.width >= clientArea.width - DRAG_MINIMUM) {
        Control[] children = getChildren();
        this.addListener(SWT.Resize, new Listener() {
                }
     */
     *
                addArrows = new int[1];
        int[] triangle = new int[] {
                currentSashInfo.sashBorderLeft = sashBorders != null && sashBorders[0];
                } else {


        int x;
            } else {

            gc.setAntialias(oldAntialias);


    /**
    }
                                case UP_RESTORE_ARROW:
        public Point[] savedSizes = new Point[2];  // Saved sizes of controls - saved whenever a control is hidden or restored
                        // Does the mouse position lie within the bounds of the arrow?
                    }
                                default:
                thisSash[j][ARROW_TYPE_INDEX] = addArrowTypes[j];
                    newSash = (Sash) child;
    }
            currentSashInfo = new SashInfo(null);
        Control[] children = getChildren();
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (noHideDown)
 * Copyright (C) 2010-2025 DBeaver Corp and others
        gc.setForeground(arrowColor);
                case UP_HIDE_ARROW:
        }
        });

                if (newSash == null) {
                                    currentSashInfo.sash.setToolTipText(UIMessages.tooltip_restore);

                thisSash[j][WIDTH_INDEX] = width;
                drawArrows[1] = DOWN_RESTORE_ARROW;
                    drawUpArrow(gc, sashLoc[X_INDEX] + indent, sashLoc[Y_INDEX] + indent);
                public void mouseUp(MouseEvent e) {
        int[] weights = getWeights();    // KLUDGE This is a kludge just to see how many controls we have.
                //Not slammed
        }
    }
            setWeights(weights);
                        if (locs[locIndex] <= loc && loc <= locs[locIndex] + locs[sizeIndex]) {
    public void layout(boolean changed) {
                            break;
                case UP_HIDE_ARROW:
                currentSashInfo.sashBorderLeft = sashBorders != null && sashBorders[0];
                thisSash[j][ARROW_DRAWN_INDEX] = drawArrowTypes[j];
        gc.fillPolygon(triangle);
        public SashInfo(Sash sash) {

        if (noHideUp)
        int width;
     */
                    if (currentSashInfo.cursorOver != NO_ARROW) {
        int slammed = NOT_SLAMMED;

        public int cursorOver = NO_ARROW;    // Which arrow is cursor over,
                                    break;
        };
                        if (currentSashInfo.cursorOver != i) {
                        currentSashInfo.sash.redraw();
    /**
            });
            x + ARROW_MARGIN - 1, y + 1,
import org.eclipse.swt.graphics.Color;
    public void hideUp() {
            x + 1, y + ARROW_MARGIN + ARROW_WIDTH/2
        boolean vertical = getOrientation() == SWT.VERTICAL;
        }

    // to know that mouse down is in process so that when drag is completed, we

            else

            this.sash = sash;
                currentSashInfo.restoreWeight = NO_WEIGHT;    // Since we are in the middle, there is no restoreWeight. We've could of been dragged here.
            focusControl = focusControl.getParent();

     */
            x = start;
        hideDown();
 * a restore position.
