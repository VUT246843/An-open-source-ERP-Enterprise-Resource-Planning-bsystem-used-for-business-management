import org.eclipse.swt.events.PaintListener;
        this.control = control;
    private final Control control;
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui;
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
 */
public class CompositeBorderPainter implements PaintListener {
        e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
        Rectangle bounds = control.getBounds();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        e.gc.drawRectangle(0, 0, bounds.width - 1, bounds.height - 1);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.graphics.Rectangle;
 *
 * You may obtain a copy of the License at
 * limitations under the License.


 *
    public CompositeBorderPainter(Control control) {
    @Override
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.control.addPaintListener(this);
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Control;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


    public void paintControl(PaintEvent e) {
