                2,
                });
/*
import org.jkiss.code.NotNull;
                typeCombo.setText(dashboardConfig.getViewType().getTitle());

            Text widthRatioText = UIUtils.createLabelText(viewGroup, "Width ratio", String.valueOf(dashboardConfig.getWidthRatio()), SWT.BORDER, new GridData(GridData.FILL_HORIZONTAL));

            Text maxItemsText = UIUtils.createLabelText(
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;

                        dashboardConfig.setDomainTicksVisible(((Button)e.widget).getSelection());
                    }
                SWT.BORDER,
                    CommonUtils.toLong(updatePeriodText.getText(), dashboardConfig.getUpdatePeriod())));
            });
                    public void widgetSelected(SelectionEvent e) {
 * You may obtain a copy of the License at
            }

 * limitations under the License.
                });
    public void loadSettings(@NotNull DashboardItemViewSettings viewSettings) {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void createControl(@NotNull Composite composite, DashboardItemViewSettings dashboardConfig, @NotNull Runnable propertyChangeListener) {
                    }
                });
                    @Override
            UIUtils.createCheckbox(viewGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_rangeaxis, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_rangeaxis_tooltip, dashboardConfig.isRangeTicksVisible(), 2)
                composite,
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
            UIUtils.createCheckbox(viewGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_domainaxis, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_domainaxis_tooltip, dashboardConfig.isDomainTicksVisible(), 2)

                dashboardConfig.setMaxAge(DashboardUtils.parseDuration(maxAgeText.getText(), dashboardConfig.getMaxAge()));
                2,
                String.valueOf(dashboardConfig.getUpdatePeriod()),

                dashboardConfig.setWidthRatio((float) CommonUtils.toDouble(widthRatioText.getText(), dashboardConfig.getWidthRatio()));
            );
    public void saveSettings(@NotNull DashboardItemViewSettings viewSettings) {
    }
import org.eclipse.swt.events.SelectionEvent;
    @Override
}
                    public void widgetSelected(SelectionEvent e) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dashboardConfig.setUpdatePeriod(
    }
                for (DashboardRendererType viewType : viewTypes) {
                    @Override
 * Unless required by applicable law or agreed to in writing, software

    @Override
                .addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.events.SelectionAdapter;
    public void resetSettings(@NotNull DashboardItemViewSettings viewSettings) {
            maxAgeText.addModifyListener(e -> {
                        dashboardConfig.setGridVisible(((Button)e.widget).getSelection());
                composite,
            typeCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
package org.jkiss.dbeaver.ui.dashboard.control;
                new GridData(GridData.FILL_HORIZONTAL));
 *
    @Override
import java.util.List;
            UIUtils.createCheckbox(viewGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_grid, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_grid_tooltip, dashboardConfig.isGridVisible(), 2)
            UIUtils.createCheckbox(viewGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_legend, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_checkboxes_legend_tooltip, dashboardConfig.isLegendVisible(), 2)
                .addSelectionListener(new SelectionAdapter() {
                    @Override
                        dashboardConfig.setLegendVisible(((Button)e.widget).getSelection());
 *
            widthRatioText.addModifyListener(e -> {
    @Override
                        dashboardConfig.setRangeTicksVisible(((Button)e.widget).getSelection());
    public boolean isComplete() {
            Composite updateGroup = UIUtils.createTitledComposite(
                List<DashboardRendererType> viewTypes = DashboardUIRegistry.getInstance().getSupportedViewTypes(dashboardConfig.getItemConfiguration().getDataType());
                dashboardConfig.setMaxItems(CommonUtils.toInt(maxItemsText.getText(), dashboardConfig.getMaxItems())));
            Text updatePeriodText = UIUtils.createLabelText(
                    public void widgetSelected(SelectionEvent e) {
            Composite viewGroup = UIUtils.createTitledComposite(
                    @Override
                new GridData(GridData.FILL_HORIZONTAL));
*/
                    }
    }

                    public void widgetSelected(SelectionEvent e) {
                typeCombo.addSelectionListener(new SelectionAdapter() {
            );
        {
                GridData.FILL_HORIZONTAL
 * DBeaver - Universal Database Manager
            {
 * Licensed under the Apache License, Version 2.0 (the "License");
                SWT.BORDER,
                GridData.FILL_HORIZONTAL
                        dashboardConfig.setViewType(viewTypes.get(typeCombo.getSelectionIndex()));
            updatePeriodText.addModifyListener(e ->
/*


*/
                UIDashboardMessages.dialog_dashboard_item_config_dashboardupdate_labels_updateperiod,
                });
        }


                .addSelectionListener(new SelectionAdapter() {
/*
    }
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Button;
                    typeCombo.add(viewType.getTitle());
                UIDashboardMessages.dialog_dashboard_item_config_dashboardupdate_labels_maxitems,
import org.jkiss.dbeaver.ui.dashboard.model.DashboardRendererType;
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
                updateGroup,
        {
import org.eclipse.swt.widgets.Combo;
 *
                });
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;
import org.eclipse.swt.widgets.Composite;
                    }
            Text maxAgeText = UIUtils.createLabelText(updateGroup, "Maximum age (ISO-8601)", DashboardUtils.formatDuration(dashboardConfig.getMaxAge()), SWT.BORDER, new GridData(GridData.FILL_HORIZONTAL));
        return true;
            });
                    @Override
 * See the License for the specific language governing permissions and
                }
                .addSelectionListener(new SelectionAdapter() {
            maxItemsText.addModifyListener(e ->
                    }
import org.jkiss.utils.CommonUtils;

import org.eclipse.swt.SWT;
                    public void widgetSelected(SelectionEvent e) {
public class DatabaseChartViewSettingsEditor implements IObjectPropertyConfigurator<DashboardItemViewSettings, DashboardItemViewSettings> {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            Combo typeCombo = UIUtils.createLabelCombo(viewGroup, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_combos_view, UIDashboardMessages.dialog_dashboard_item_config_dashboardview_combos_view_tooltip, SWT.BORDER | SWT.READ_ONLY);
                updateGroup,
    @Override
import org.eclipse.swt.widgets.Text;
                UIDashboardMessages.dialog_dashboard_item_config_dashboardupdate,
    }
                String.valueOf(dashboardConfig.getMaxItems()),
                UIDashboardMessages.dialog_dashboard_item_config_dashboardview,
