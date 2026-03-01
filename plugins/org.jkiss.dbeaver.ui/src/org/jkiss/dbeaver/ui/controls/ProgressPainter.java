                    return;
 *
            @Override

            public void paintControl(PaintEvent e) {

import org.eclipse.core.runtime.Status;
                Rectangle bounds = control.getBounds();
        this.control = control;
                Rectangle imageBounds = image.getBounds();
                e.gc.drawImage(
        }
 * ProgressPainter
    private final Control control;
                        return Status.OK_STATUS;
            loadingListener = null;
            }
import org.eclipse.core.runtime.IProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        if (!control.isDisposed()) {
            int drawCount = 0;
    public ProgressPainter(Control control) {
        control.addPaintListener(loadingListener);
import org.eclipse.swt.events.PaintEvent;
                drawCount++;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.ui.progress.UIJob;
                    (bounds.x + bounds.width / 2) - imageBounds.width / 2,
import org.eclipse.swt.events.PaintListener;
                new UIJob("Repaint") {
 * DBeaver - Universal Database Manager
 */
        loadingListener = new PaintListener() {
                    }
import org.jkiss.dbeaver.ui.DBeaverIcons;

                            control.redraw();
        if (loadingListener != null) {
                        setSystem(true);
 *
 * See the License for the specific language governing permissions and
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                control.removePaintListener(loadingListener);
                    }
                        }
                    {
                    image,
 * Unless required by applicable law or agreed to in writing, software
                Image image = DBeaverIcons.getImage(ProgressLoaderVisualizer.PROGRESS_IMAGES[drawCount % ProgressLoaderVisualizer.PROGRESS_IMAGES.length]);
                }.schedule(200);
        };
import org.eclipse.swt.widgets.Control;
package org.jkiss.dbeaver.ui.controls;
    }
 * you may not use this file except in compliance with the License.
                    public IStatus runInUIThread(IProgressMonitor monitor) {
}    }
    public void close() {

                    (bounds.y + bounds.height / 2) - imageBounds.height - 5);
import org.eclipse.swt.graphics.Image;

                }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    @Override

                if (loadingListener == null) {
    private PaintListener loadingListener;
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.IStatus;
public class ProgressPainter {

            if (!control.isDisposed()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
