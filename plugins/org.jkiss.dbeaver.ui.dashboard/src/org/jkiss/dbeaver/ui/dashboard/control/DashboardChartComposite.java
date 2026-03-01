 */
    }
        DashboardItemContainer dashboardContainer,
package org.jkiss.dbeaver.ui.dashboard.control;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
/**
import org.eclipse.jface.action.IMenuManager;
                viewContainer.getConfiguration(),
import org.eclipse.swt.widgets.Control;

        this.dashboardContainer = dashboardContainer;
            dashboardContainer,
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.fillContextMenu(manager);
 *
public class DashboardChartComposite extends BaseChartComposite implements DashboardViewCompositeControl {
        if (viewContainer.isSingleChartMode()) {
    public DashboardChartComposite(

import org.eclipse.swt.graphics.Point;
            dashboardContainer.updateDashboardView();
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemViewSettingsDialog;
    }
    }
        Point preferredSize

 * You may obtain a copy of the License at
 */
            viewContainer.getViewConfiguration());
    public void setChart(JFreeChart chart) {
        DashboardContainer viewContainer,
 * you may not use this file except in compliance with the License.
/*
    private final DashboardContainer viewContainer;


        this.viewContainer = viewContainer;
            restoreAutoBounds();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        } else {
import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;

                (DashboardViewItem) dashboardContainer);
    // Let's give caller a chance to use them in overloaded member

 * See the License for the specific language governing permissions and
        dashboardContainer.fillDashboardContextMenu(manager, isSingleChartMode());
        return viewContainer;
    @Override
        return changed;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return viewContainer.isSingleChartMode();
    public DashboardContainer getViewContainer() {
        Composite parent,
            DashboardItemViewDialog viewDialog = new DashboardItemViewDialog(
 * DBeaver - Universal Database Manager

            this.setRangeZoomable(false);
            viewContainer.saveChanges();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    ) {
    protected void fillContextMenu(IMenuManager manager) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(parent, style, preferredSize);
    }
 * limitations under the License.
        }
            this.getShell(),
        DashboardItemViewSettingsDialog dialog = new DashboardItemViewSettingsDialog(
import org.jfree.chart.JFreeChart;
    public Control getDashboardControl() {
    }
            this.setDomainZoomable(false);
    @Override

        boolean changed = dialog.open() == IDialogConstants.OK_ID;
    private final DashboardItemContainer dashboardContainer;
    @Override
            viewDialog.open();
        }
        if (chart != null && !isSingleChartMode()) {
    // It is a hack. As context menu create is called from base class constructor we can't use any constructor parameters in fillContextMenu.

import org.eclipse.swt.events.MouseEvent;
                viewContainer,
        }
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemViewDialog;
        if (changed) {
    public void mouseDoubleClick(MouseEvent event) {

 *

    protected boolean showChartConfigDialog() {
 *
import org.eclipse.jface.dialogs.IDialogConstants;
        return getChartCanvas();
    }
    protected boolean isSingleChartMode() {
 * Dashboard chart composite
import org.eclipse.swt.widgets.Composite;
        super.setChart(chart);
import org.jkiss.dbeaver.ui.charts.BaseChartComposite;
        int style,
