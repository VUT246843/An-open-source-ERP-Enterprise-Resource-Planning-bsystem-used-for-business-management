    protected Composite createDialogArea(Composite parent) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.


    }

import org.eclipse.jface.dialogs.IDialogSettings;
    protected Control createButtonBar(@NotNull Composite parent) {

 * Dashboard view dialog
 */
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardActivator;
    }

 *
        Composite chartGroup = UIUtils.createPlaceholder(parent, 1);
        DashboardListViewer dashboardListViewer = new DashboardListViewer(
            null,
        this.configuration = configuration;
    @Override
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
 * Unless required by applicable law or agreed to in writing, software

/**
        closeOnFocusLost(
import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewItem;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Button;
        dashboardListViewer.setSingleChartMode(true);
        this.parentPart = parentPart;

    }
            sourceItem.getItemDescriptor());
    private final DashboardConfigurationList configuration;
 * See the License for the specific language governing permissions and
    @Override
        DashboardViewItem targetItem  = new DashboardViewItem(
 * Licensed under the Apache License, Version 2.0 (the "License");

        gd.heightHint = 300;
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
        this.sourceItem = sourceItem;
            dashboardListViewer.getControl(),
            parentPart.getWorkbenchSite(),
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.dashboard.control.DashboardListControl;
    @Override
        dashboardListViewer.createControl(chartGroup);
import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
        return chartGroup;
            (DashboardListControl) dashboardListViewer.getDefaultGroup(),
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
        chartGroup.setLayout(new FillLayout());
 *
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;
            chartGroup);
    private final DashboardContainer parentPart;
package org.jkiss.dbeaver.ui.dashboard.view;
            configuration,
        chartGroup.setLayoutData(gd);

import org.eclipse.swt.widgets.Control;
        return UIUtils.getSettingsSection(UIDashboardActivator.getDefault().getDialogSettings(), DIALOG_ID);
        targetItem.moveViewFrom(sourceItem, false);
    private final DashboardViewItem sourceItem;

            parentPart.getViewConfiguration());
        UIUtils.asyncExec(okButton::setFocus);
}    protected IDialogSettings getDialogBoundsSettings() {
    public DashboardItemViewDialog(DashboardContainer parentPart, DashboardConfigurationList configuration, DashboardViewItem sourceItem) {
 */
    }

        GridData gd = new GridData(GridData.FILL_BOTH);

import org.eclipse.swt.layout.GridData;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(parentPart.getWorkbenchSite().getShell(), UIDashboardMessages.dialog_dashboard_item_view_title);
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.FillLayout;
        return parent;
import org.eclipse.jface.dialogs.IDialogConstants;
public class DashboardItemViewDialog extends AbstractPopupPanel {
        gd.widthHint = 450;
import org.jkiss.code.NotNull;

/*
 *
    protected void createButtonsForButtonBar(Composite parent) {
    private static final String DIALOG_ID = "DBeaver.DashboardItemViewDialog";//$NON-NLS-1$

import org.eclipse.swt.widgets.Composite;

 * you may not use this file except in compliance with the License.
        Button okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);

