        addPaintListener(new PaintListener() {
    /**
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
     * Creates a new instance.

import org.eclipse.swt.widgets.Composite;
     * @param stroke  the stroke.
        });
            public void paintControl(PaintEvent e) {
                    swtTransform.dispose();
     * Creates a new instance.
                    e.gc.setBackground(getDisplay().getSystemColor(
     * 

    /**
                            SWT.COLOR_BLACK));
                if (stroke != null) {
     * @param parent  the parent.
     * 
                "Can only handle 'Basic Stroke' at present.");
    /**
     */
                    swtTransform.translate(x, y);
                    e.gc.setTransform(swtTransform);
 * you may not use this file except in compliance with the License.

    
                    e.gc.drawLine(10, 8, 90, 8);
 */
import org.eclipse.swt.graphics.Image;
    }
}
 *
    /**
    }

     * 
import org.eclipse.swt.graphics.Transform;
/**
     * @param parent  the parent.
            throw new RuntimeException(
    
                    e.gc.getTransform(swtTransform);
    public BasicStroke getStroke() {
        }
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
        this(parent, style);
package org.jfree.chart.swt.editor;
     */
        else { 
import org.eclipse.swt.SWT;
     * @param style  the style.
 * distributed under the License is distributed on an "AS IS" BASIS,
                    e.gc.setLineWidth((int) stroke.getLineWidth());
     * @param image  the image.
import org.eclipse.swt.graphics.Rectangle;
                    int x, y;
 * A control for displaying a {@code Stroke} sample.

        }
import org.eclipse.swt.events.PaintListener;
     * @return The stroke.
                }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    public SWTStrokeCanvas(Composite parent, int style) {
import org.eclipse.swt.events.PaintEvent;
            setData(stroke);
            }
        if (stroke instanceof BasicStroke) {

                    Transform swtTransform = new Transform(e.gc.getDevice()); 
    public SWTStrokeCanvas(Composite parent, int style, Image image) {
 *
        return (BasicStroke) this.getData();
import org.eclipse.swt.widgets.Canvas;
/*
 *
 * DBeaver - Universal Database Manager
     * Returns the stroke.
class SWTStrokeCanvas extends Canvas {
     * @param style  the style.
                    y = (rect.height - 16) / 2;
                BasicStroke stroke = (BasicStroke) getStroke();
import java.awt.*;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * 
                    Rectangle rect = getClientArea();
                    x = (rect.width - 100) / 2;
 * Unless required by applicable law or agreed to in writing, software
    }
    public void setStroke(Stroke stroke) {
 * You may obtain a copy of the License at
     * Sets the stroke.
        super(parent, style);
 * See the License for the specific language governing permissions and
