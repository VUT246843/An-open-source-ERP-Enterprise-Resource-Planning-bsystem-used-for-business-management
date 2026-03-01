
/*
            });
                @Override
            @Override
import org.eclipse.swt.events.MouseEvent;
        }
            zoomable.zoomRangeAxes(factor, info, anchor, true);
        Control[] children = getChildren();
    public Canvas getChartCanvas() {
                    }


import org.jkiss.code.NotNull;

                @Override
                    doZoom(zoomable, getChartCanvas().toControl(getDisplay().getCursorLocation()), getZoomOutFactor());
                @Override
    @Override

 *
        if (zoomable != null) {
                    doZoom(zoomable, getChartCanvas().toControl(getDisplay().getCursorLocation()), getZoomInFactor());
            30, 20,
import org.jfree.chart.plot.Zoomable;
        return children.length == 0 ? null : (Canvas) children[0];
    }
    public void mouseDoubleClick(MouseEvent event) {
                    //showChartConfigDialog();
        }
                public void run() {
    }
    }
                doCopyToClipboard();
    protected Menu createPopupMenu(boolean properties, boolean save, boolean print, boolean zoom) {
        }

        Image image = new Image(Display.getDefault(), this.getBounds());
        if (hasConfigurationDialog()) {
                createChartPrintJob();
import org.eclipse.swt.dnd.Clipboard;
        if (zoomable.isRangeZoomable()) {
    public BaseChartComposite(Composite parent, int style, Point preferredSize) {
                public void runWithEvent(Event e) {
        });

 * Unless required by applicable law or agreed to in writing, software
        try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    DBWorkbench.getPlatformUI().showError(UIChartsMessages.base_chart_composite_error_title_save_image,
    protected void fillContextMenu(IMenuManager manager) {
            }
        final Zoomable zoomable = GeneralUtils.adapt(getChart().getPlot(), Zoomable.class);
    }
        MenuManager manager = new MenuManager();
        manager.add(new Action(UIChartsMessages.base_chart_composite_action_save_as) {
            manager.add(new Separator());
    }
            manager.add(new Action(UIChartsMessages.base_chart_composite_action_zoom_reset, DBeaverIcons.getImageDescriptor(UIIcon.ZOOM)) {
                }
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.*;
                            UIChartsMessages.base_chart_composite_error_message_error_saving_chart_image, e);
        if (showChartConfigDialog()) {
        manager.addMenuListener(this::fillContextMenu);
import org.eclipse.jface.action.MenuManager;

        addDisposeListener(e -> manager.dispose());
        }

            GC gc = new GC(image);
            10000, 10000,
                    PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(getShell(), ExtensionFactory.COLORS_AND_FONTS_PREFERENCE_PAGE, null, null);
    }
    protected boolean hasColorsConfiguration() {
                    doSaveAs();
            public void run() {
            forceRedraw();
            public void runWithEvent(Event event) {
            }
                }
import org.jfree.chart.swt.ChartComposite;
 * limitations under the License.
            Clipboard clipboard = new Clipboard(Display.getCurrent());
import java.io.IOException;
    }
                try {
    protected void doCopyToClipboard() {
import org.eclipse.ui.dialogs.PreferencesUtil;
            }
        return contextMenu;
 */
 */
            manager.add(new Action(UIChartsMessages.base_chart_composite_action_zoom_out, DBeaverIcons.getImageDescriptor(UIIcon.ZOOM_OUT)) {

import org.jkiss.dbeaver.utils.GeneralUtils;
    }
            @Override
        if (hasColorsConfiguration()) {
        return false;
                }
                @Override

import org.eclipse.jface.action.Action;
                public void runWithEvent(Event e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            });
            try {
    }
            });
                gc.dispose();
    }
 *
        manager.add(new Action(UIChartsMessages.base_chart_composite_action_copy_to_clipboard) {

    private void doZoom(@NotNull Zoomable zoomable, @NotNull Point origin, double factor) {
    protected boolean hasConfigurationDialog() {
        manager.add(new Action(UIChartsMessages.base_chart_composite_action_print) {
import org.eclipse.jface.preference.PreferenceDialog;
                }
            ImageTransfer imageTransfer = ImageTransfer.getInstance();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    showChartConfigDialog();
            manager.add(new Action(UIChartsMessages.base_chart_composite_action_colors, DBeaverIcons.getImageDescriptor(UIIcon.PALETTE)) {
            zoomable.zoomDomainAxes(factor, info, anchor, true);
            });
import org.eclipse.jface.action.IMenuManager;

 * Base chart composite
 * DBeaver - Universal Database Manager
        }
        Menu contextMenu = manager.createContextMenu(this);
            preferredSize.x, preferredSize.y,
            public void run() {
        } finally {
                this.print(gc);
 * See the License for the specific language governing permissions and
    @Override
            } finally {
            @Override
                } catch (IOException e) {
}
import org.eclipse.swt.graphics.Point;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (preferenceDialog != null) {
import org.jfree.chart.plot.PlotRenderingInfo;
        }
    protected boolean showChartConfigDialog() {

                public void run() {
            manager.add(new Action(UIChartsMessages.base_chart_composite_action_settings, DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION)) {
            manager.add(new Separator());
            true, false, true, true, true, true);
        return false;
                        preferenceDialog.open();
                }
        return true;
                @Override


/**
        });
        if (zoomable.isDomainZoomable()) {
import java.awt.geom.Point2D;
                public void runWithEvent(Event e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.action.Separator;
        final Point2D anchor = translateScreenToJava2D(new java.awt.Point(origin.x, origin.y));

import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        super(parent, style, null,
            clipboard.setContents(new Object[] {image.getImageData()}, new Transfer[]{imageTransfer});

 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.charts;
            image.dispose();
import org.eclipse.swt.dnd.Transfer;
            }
public class BaseChartComposite extends ChartComposite {
                    restoreAutoBounds();
        final PlotRenderingInfo info = getChartRenderingInfo().getPlotInfo();
            });
 *
        }
import org.eclipse.ui.ExtensionFactory;
        manager.setRemoveAllWhenShown(true);
import org.eclipse.swt.dnd.ImageTransfer;
            manager.add(new Action(UIChartsMessages.base_chart_composite_action_zoom_in, DBeaverIcons.getImageDescriptor(UIIcon.ZOOM_IN)) {
import org.eclipse.swt.graphics.Image;

import org.eclipse.swt.graphics.GC;
                }
import org.jkiss.dbeaver.ui.charts.internal.UIChartsMessages;

