            GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.model.DBIcon;
    private final Composite progressPane;
                    buttonBounds.y - imageBounds.height - 5);
            if (finished) {

            progressOverlay.minimumHeight = buttonSize.y;
                        )
            }
                Rectangle imageBounds = image.getBounds();
                    buttonBounds.x + buttonBounds.width / 2,
                    cancelButton.setEnabled(false);
                    cancelButton.setText("Canceled");

    public ProgressLoaderVisualizer(ILoadService<RESULT> loadService, Composite progressPane) {
                gc.setFont(cancelButton.getFont());
            progressPane.redraw();
                } catch (Exception e) {
        }
                }
 *
        UIIcon.PROGRESS4, UIIcon.PROGRESS5, UIIcon.PROGRESS6, UIIcon.PROGRESS7,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    }
            });
    }
import org.jkiss.dbeaver.Log;
                shadowColor = progressPane.getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);
            cancelButton = new Button(progressPane, SWT.PUSH);
        this.loadService = loadService;

public class ProgressLoaderVisualizer<RESULT> implements ILoadVisualizer<RESULT>
    protected static final int PROGRESS_VISUALIZE_PERIOD = 100;
                GC gc = e.gc;
/*
                finishProgress();
    public void resetStartTime() {
    private long loadStartTime;

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (progressOverlay != null) {
            progressOverlay.layout();
import org.eclipse.osgi.util.NLS;
    private String progressMessage;
                    gc,
                );
            if (shadowColor == null) {
            cancelButton.setLayoutData(gd);
        UIIcon.PROGRESS0, UIIcon.PROGRESS1, UIIcon.PROGRESS2, UIIcon.PROGRESS3,

            return;

                Image image = DBeaverIcons.getImage(PROGRESS_IMAGES[drawCount % PROGRESS_IMAGES.length]);
        }
import org.eclipse.swt.widgets.Button;
 * you may not use this file except in compliance with the License.
{
                if (loadStartTime == 0) {
 * DBeaver - Universal Database Manager
                    showProgress();
                progressPane.removePaintListener(painListener);
            gd.verticalIndent = DBeaverIcons.getImage(UIIcon.PROGRESS0).getBounds().height * 2;
        drawCount++;
                    buttonBounds.y - imageBounds.height - 10

    }
import java.lang.reflect.InvocationTargetException;
                    }
    private volatile boolean finished = false;

    private static final Log log = Log.getLog(ProgressLoaderVisualizer.class);
                        "{0} - {1}",
import org.eclipse.swt.custom.ControlEditor;

 * Unless required by applicable law or agreed to in writing, software
    }
            progressOverlay = null;
    private ControlEditor progressOverlay;
    @Override
                }
            Point buttonSize = cancelButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                        log.error(e1.getTargetException());
        DBRProgressMonitor progressMonitor = new ProxyProgressMonitor(monitor) {
import org.eclipse.swt.layout.GridData;
            progressPane.addPaintListener(painListener);
            // Start progress visualization
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
 * You may obtain a copy of the License at
                    // We shouldn't be here ever. In any case we must finish the job
                public void widgetSelected(SelectionEvent e) {
            };
        if (progressOverlay != null) {
            if (!cancelButton.isDisposed()) {
            progressOverlay = new ControlEditor(progressPane);
            if (!progressPane.isDisposed()) {
    }
                gc.drawImage(
        };
                    // Something went terribly wrong
            cancelButton.setText("Cancel");
    public ILoadService<RESULT> getLoadService() {
            }
            }
package org.jkiss.dbeaver.ui.controls;
                            Duration.ofMillis(System.currentTimeMillis() - loadStartTime),
            cancelButton.addSelectionListener(new SelectionAdapter() {
    private final ILoadService<RESULT> loadService;
        UIIcon.PROGRESS8, UIIcon.PROGRESS9
        this.progressPane = progressPane;
            if (!finished) {
        }
                        loadService.cancel();

                    image,
    public static final DBIcon[] PROGRESS_IMAGES = {
import org.jkiss.dbeaver.utils.DurationFormatter;
        return finished;
                    (buttonBounds.x + buttonBounds.width / 2) - imageBounds.width / 2,
import org.eclipse.swt.graphics.*;
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
                progressOverlay.dispose();
                    log.error("Internal error during progress visualization", e);
    private void showProgress() {
import org.eclipse.swt.events.SelectionAdapter;
/**
 */

    private PaintListener painListener;
                    NLS.bind(
        this.progressMessage = "Initializing";
                progressMessage = name;
import org.jkiss.dbeaver.utils.DurationFormat;
                    ),
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                    progressOverlay.minimumHeight = buttonSize.y;

            progressOverlay.setEditor(cancelButton);
 * limitations under the License.
        }
    @Override
                    progressOverlay.minimumWidth = buttonSize.x;
                            DurationFormat.SHORT
    }
            public void subTask(@NotNull String name) {
                UIUtils.drawTextWithBackground(
        if (loadStartTime == 0) {
            }
    @Override
                }
import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
            }
        return progressMonitor;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.time.Duration;
        // Last update - remove progress visualization
    private void finishProgress() {
    private Button cancelButton;
            progressOverlay.minimumWidth = buttonSize.x;
 *
                if (cancelButton.isDisposed()) {
    public DBRProgressMonitor overwriteMonitor(DBRProgressMonitor monitor) {
        if (progressOverlay == null) {
                Rectangle buttonBounds = cancelButton.getBounds();
                cancelButton.dispose();

    public boolean isCompleted() {
                    finishProgress();

    }
            painListener = e -> {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            progressPane.redraw();
import org.jkiss.code.NotNull;
        this.finished = true;

import org.jkiss.dbeaver.ui.UIUtils;
                    Point buttonSize = cancelButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                        CommonUtils.truncateString(progressMessage.replaceAll("\\s", " "), 64),
                    } catch (InvocationTargetException e1) {
                    try {
    public void completeLoading(RESULT result) {
        this.loadStartTime = System.currentTimeMillis();
} *

    }
import org.eclipse.swt.SWT;
                    return;
 * PairListControl
import org.eclipse.swt.widgets.Composite;

    public void visualizeLoading() {
    private Color shadowColor;
    @Override
                @Override
        if (!progressPane.isDisposed()) {
                }
        return loadService;
 */

import org.eclipse.swt.events.PaintListener;

 *     http://www.apache.org/licenses/LICENSE-2.0
                    progressOverlay.layout();
                super.subTask(name);
import org.jkiss.dbeaver.ui.UIIcon;
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.utils.CommonUtils;
    };
                try {
                    resetStartTime();
            @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private volatile int drawCount = 0;
                        DurationFormatter.format(
    }
