            int lineY = bounds.y + (textHeight / 2); // - descent + 1;


        public void mouseHover(MouseEvent e) {
import org.eclipse.ui.forms.widgets.ImageHyperlink;
    public void setStrikeThrough(boolean strikethrough) {
 *******************************************************************************/

            gc.drawLine(bounds.x, lineY, bounds.x + textWidth, lineY);
        String returnText = t;
import org.eclipse.swt.SWT;
 */
    @Override
            Point totalSize = computeTextSize(SWT.DEFAULT, SWT.DEFAULT);
        super.dispose();
 *     Tasktop Technologies - initial API and implementation

        addMouseTrackListener(MOUSE_TRACK_LISTENER);
                }
    protected void paintText(GC gc, Rectangle bounds) {

        public void mouseExit(MouseEvent e) {
/**

                    returnText = test;
 * which accompanies this distribution, and is available at
import org.eclipse.swt.graphics.GC;
    }
            return null;
    }
    }


        this.strikeThrough = strikethrough;
        }
            return t;
    private boolean strikeThrough;
    protected final MouseTrackListener MOUSE_TRACK_LISTENER = new MouseTrackListener() {
        }
    @Override

    }
            setUnderlined(true);
                if (gc.textExtent(test).x < width) {
            }
    };
 * @author Mik Kersten
 * are made available under the terms of the Eclipse Public License v1.0
        removeMouseTrackListener(MOUSE_TRACK_LISTENER);
        }
                    break;
    }
 *
 * Contributors:
import org.eclipse.swt.events.MouseTrackListener;
        }
        if (strikeThrough) {
            int textWidth = Math.min(bounds.width, totalSize.x);
                test = test + "..."; //$NON-NLS-1$
            int textHeight = totalSize.y;
    @Override
package org.jkiss.dbeaver.ui.notifications;
        }
    protected String shortenText(GC gc, String t, int width) {
}            //			int descent = gc.getFontMetrics().getDescent();
    public ScalingHyperlink(Composite parent, int style) {
 * @since 3.7
 * Enhanced {@link ImageHyperlink} that truncates the link text at the end rather than the middle if it is wider than
public class ScalingHyperlink extends ImageHyperlink {
        if (t == null) {
        return returnText;
        return strikeThrough;

import org.eclipse.swt.events.MouseEvent;
        if ((getStyle() & SWT.SHORT) != 0) {
            setUnderlined(false);
 * All rights reserved. This program and the accompanying materials
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Point;

 * Copyright (c) 2004, 2011 Tasktop Technologies and others.
        public void mouseEnter(MouseEvent e) {
    public void dispose() {

 * @author Leo Dos Santos

    }
        super(parent, style);
 * the available space. Also provides default color and underline on hover.


import org.eclipse.swt.graphics.Rectangle;
        super.paintText(gc, bounds);
        }
    public void registerMouseTrackListener() {
        if (gc.textExtent(t).x > width) {

            for (int i = t.length(); i > 0; i--) {
 * http://www.eclipse.org/legal/epl-v10.html


    public boolean isStrikeThrough() {
                String test = t.substring(0, i);
 *
        }
    }
/*******************************************************************************
