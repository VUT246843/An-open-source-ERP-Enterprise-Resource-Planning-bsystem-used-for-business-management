     * Returns the color.
    
            public void paintControl(PaintEvent e) {
     * @param color  the color.
    /**
import org.eclipse.swt.graphics.Color;
 */
     * Sets the color.
    }
    }
    public SWTPaintCanvas(Composite parent, int style) {
    }
/*
    }
    /**
     * @param c  the color.
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
    /**
     */
     * Frees resources.
     * 
import org.eclipse.swt.events.PaintListener;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
     * 
}
    
    /**
        if (this.myColor != null) {
 *
     */
                e.gc.setBackground(SWTPaintCanvas.this.myColor);
 * See the License for the specific language governing permissions and
        return this.myColor;
    public void setBackground(Color c) {
     * 
            this.myColor.dispose();

                e.gc.drawRectangle(getClientArea().x, getClientArea().y, 
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Overridden to do nothing.
    }

     * @param parent  the parent.

import org.eclipse.swt.widgets.Canvas;
        this.myColor = color;
     * @param style  the style.
 *
     * @param parent  the parent.
     * @param color  the color.
    /**
 */
    public void setForeground(Color c) {

        this(parent, style);
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param style  the style.
     * 
package org.jfree.chart.swt.editor;

        addPaintListener(new PaintListener() {
                e.gc.fillRectangle(getClientArea());
    
     */
    
    private Color myColor;
        }
        this.myColor.dispose();
    /**
                        SWT.COLOR_BLACK));
    
     */
        return;
     * @return The color.
    }
 *
        setColor(color);
                e.gc.setForeground(e.gc.getDevice().getSystemColor(
     * Overridden to do nothing.
    public Color getColor() {
import org.eclipse.swt.events.PaintEvent;
 * A paint canvas.
     * Creates a new instance.
     */
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
     * @param c  the color.
        //this.myColor = new Color(getDisplay(), color.getRGB());
        return;
     * 
        });
    public SWTPaintCanvas(Composite parent, int style, Color color) {
 * DBeaver - Universal Database Manager
                        getClientArea().width - 1, getClientArea().height - 1);
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
    }
     * Creates a new instance.
    public void setColor(Color color) {
    public void dispose() {
     */
import org.eclipse.swt.widgets.Composite;
        super(parent, style);
     * 
public class SWTPaintCanvas extends Canvas {
 * limitations under the License.
