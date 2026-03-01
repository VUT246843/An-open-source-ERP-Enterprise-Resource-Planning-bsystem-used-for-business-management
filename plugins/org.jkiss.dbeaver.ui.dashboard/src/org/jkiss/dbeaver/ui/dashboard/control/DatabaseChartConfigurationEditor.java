import org.jkiss.utils.CommonUtils;

            (viewTypeCombo == null || viewTypeCombo.getSelectionIndex() >= 0) &&
                    fetchTypeCombo.add(dft.name());

        int baseStyle = !readOnly ? SWT.NONE : SWT.READ_ONLY;
            queryText.setText(sql.toString().trim());
    public void loadSettings(@NotNull DashboardItemConfiguration itemConfiguration) {
                        propertyChangeListener.run();
        itemDescriptor.setDataType(DBDashboardDataType.values()[dataTypeCombo.getSelectionIndex()]);
            }
                    dataTypeCombo.add(ddt.name());
            for (DashboardItemConfiguration.QueryMapping query : itemDescriptor.getQueries()) {
                fetchTypeCombo = UIUtils.createLabelCombo(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_fetchtype, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_fetchtype_tooltip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                }
        itemDescriptor.setUpdatePeriod(CommonUtils.toLong(updatePeriodText.getText(), itemDescriptor.getUpdatePeriod()));
            queryText.addModifyListener(e -> propertyChangeListener.run());
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ui.dashboard.control;
                calcTypeCombo = UIUtils.createLabelCombo(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_calctype, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_calctype_tooltip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
import java.util.Arrays;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
    private Combo calcTypeCombo;
                fetchTypeCombo.setEnabled(!readOnly);
            }

            UIUtils.createControlLabel(composite, UIDashboardMessages.dialog_edit_dashboard_rendering, 2);
    }

                valueTypeCombo.setEnabled(!readOnly);
                    @Override
                    viewTypeCombo.add(viewType.getTitle());
                UIUtils.createPushButton(dbSelectorPanel, UIDashboardMessages.dialog_edit_dashboard_maininfo_buttons_select, null, new SelectionAdapter() {
            if (itemDescriptor.getMapQuery() != null) {
        if (!dataSourceMappings.isEmpty()) {
                dataTypeCombo = UIUtils.createLabelCombo(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_datatype, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_datatype_tooltip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
import java.util.List;
                for (DBDashboardCalcType dct : DBDashboardCalcType.values()) {

            targetDatabase != null;
                        }

                valueTypeCombo.setText(itemDescriptor.getValueType().name());
                    viewTypeCombo.select(0);
    private List<DashboardRendererType> viewTypes;
 *
    private Combo valueTypeCombo;


import org.eclipse.swt.events.SelectionEvent;
                            targetDatabase = selectDialog.getTarget();
        itemDescriptor.setMaxItems(CommonUtils.toInt(maxItemsText.getText(), itemDescriptor.getMaxItems()));
                if (!ArrayUtils.isEmpty(itemDescriptor.getMapKeys())) {
    }
            sqlGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.DBPNamedObject;
                            dbSelectorText.setText(targetDatabase.getName());
import org.jkiss.dbeaver.ui.dashboard.model.DashboardRendererType;
import org.eclipse.swt.layout.GridData;
import java.util.Collections;

/*
                sql.append(query.getQueryText().trim()).append(lineSeparator).append(lineSeparator);
            viewTypeCombo = UIUtils.createLabelCombo(updateGroup, UIDashboardMessages.dialog_edit_dashboard_rendering_combos_defaultview, UIDashboardMessages.dialog_edit_dashboard_rendering_combos_defaultview_tooltip, SWT.BORDER | SWT.READ_ONLY);
import org.eclipse.swt.widgets.Composite;
    }
            queryText.setLayoutData(gd);
                }
        }

 * limitations under the License.
            gd.widthHint = 400;
            UIUtils.createControlLabel(composite, UIDashboardMessages.dialog_edit_dashboard_queries, 2);

                for (DBDashboardFetchType dft : DBDashboardFetchType.values()) {
    private Combo dataTypeCombo;
                for (DBDashboardInterval dvt : DBDashboardInterval.values()) {

    }
            Composite mainGroup = UIUtils.createComposite(composite, 2);
                if (targetDatabase != null) {
                });
import org.eclipse.swt.events.SelectionAdapter;
    public void saveSettings(@NotNull DashboardItemConfiguration itemDescriptor) {

            maxItemsText = UIUtils.createLabelText(updateGroup, UIDashboardMessages.dialog_edit_dashboard_rendering_labels_maxitems, String.valueOf(itemDescriptor.getMaxItems()), SWT.BORDER | baseStyle, new GridData(GridData.FILL_HORIZONTAL));

            GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
            updateGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private Text queryText;
import org.jkiss.utils.ArrayUtils;
            mainGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                }
            Composite sqlGroup = UIUtils.createComposite(composite, 1);

        }
    public void resetSettings(@NotNull DashboardItemConfiguration itemConfiguration) {

 * See the License for the specific language governing permissions and
            viewTypeCombo.setEnabled(!readOnly);
                    sql.append(UIDashboardMessages.dialog_edit_dashboard_queries_keys).append(" ").append(Arrays.toString(itemDescriptor.getMapKeys())).append(lineSeparator);
                fetchTypeCombo.setText(itemDescriptor.getFetchType().name());
            Composite updateGroup = UIUtils.createComposite(composite, 2);
import org.eclipse.swt.widgets.Text;
                }
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Combo;
    @Override

    }
                    sql.append(UIDashboardMessages.dialog_edit_dashboard_queries_labels).append(" ").append(Arrays.toString(itemDescriptor.getMapLabels())).append(lineSeparator);
    private Combo intervalCombo;
 *
                        DashboardDatabaseSelectDialog selectDialog = new DashboardDatabaseSelectDialog(composite.getShell());
                Composite dbSelectorPanel = UIUtils.createComposite(mainGroup, 2);
        {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dataTypeCombo.setText(itemDescriptor.getDataType().name());
                for (DashboardRendererType viewType : viewTypes) {
    @Override

                        if (selectDialog.open() == IDialogConstants.OK_ID) {
            queryText = new Text(sqlGroup, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP | baseStyle);
                intervalCombo.setText(itemDescriptor.getInterval().name());
            //maxAgeText = UIUtils.createLabelText(updateGroup, "Maximum age (ISO-8601)", DashboardUtils.formatDuration(dashboardDescriptor.getMaxAge()), SWT.BORDER | baseStyle, new GridData(GridData.FILL_HORIZONTAL));
        itemDescriptor.setQueries(queryText.getText().split("\\n\\s*\\n"));
        itemDescriptor.setFetchType(DBDashboardFetchType.values()[fetchTypeCombo.getSelectionIndex()]);
                for (DBDashboardValueType dvt : DBDashboardValueType.values()) {
import org.jkiss.dbeaver.ui.UIUtils;
            updatePeriodText = UIUtils.createLabelText(updateGroup, UIDashboardMessages.dialog_edit_dashboard_rendering_labels_updateperiod, String.valueOf(itemDescriptor.getUpdatePeriod()), SWT.BORDER | baseStyle, new GridData(GridData.FILL_HORIZONTAL));
    private Combo fetchTypeCombo;
        itemDescriptor.setDataSourceMappings(Collections.singletonList(targetDatabase));
            }
        itemDescriptor.setRenderer(viewTypes.get(viewTypeCombo.getSelectionIndex()).getId());
    @Override
 * Unless required by applicable law or agreed to in writing, software
                valueTypeCombo = UIUtils.createLabelCombo(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_valuetype, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_valuetype_tooltip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            targetDatabase = dataSourceMappings.get(0);
public class DatabaseChartConfigurationEditor implements IObjectPropertyConfigurator<DashboardItemConfiguration, DashboardItemConfiguration> {
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
                    }
    private DBPNamedObject targetDatabase;
        boolean readOnly = !itemDescriptor.isCustom();
        }
                    intervalCombo.add(dvt.name());
                    public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.ui.dashboard.view.DashboardDatabaseSelectDialog;
                }
                    dbSelectorText.setText(targetDatabase.getName());
            UIUtils.createInfoLabel(sqlGroup, UIDashboardMessages.dialog_edit_dashboard_queries_infolabels_separator);
                viewTypes = DashboardUIRegistry.getInstance().getAllViewTypes();
    @Override
                intervalCombo = UIUtils.createLabelCombo(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_interval, UIDashboardMessages.dialog_edit_dashboard_maininfo_combos_interval_tooltip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);

                dbSelectorText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        {
import org.jkiss.dbeaver.model.dashboard.*;
    private Text maxItemsText;
                if (!ArrayUtils.isEmpty(itemDescriptor.getMapLabels())) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    //private Text maxAgeText;
                for (DBDashboardDataType ddt : DBDashboardDataType.values()) {
        itemDescriptor.setValueType(DBDashboardValueType.values()[valueTypeCombo.getSelectionIndex()]);
 *
    @Override
                }
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;
    private Text updatePeriodText;
            viewTypeCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                DashboardRendererDescriptor viewType = DashboardUIRegistry.getInstance().getViewType(itemDescriptor.getDashboardRenderer());
    public boolean isComplete() {
            StringBuilder sql = new StringBuilder();
            {


import org.jkiss.dbeaver.utils.GeneralUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
                sql.append(itemDescriptor.getMapQuery().getQueryText()).append(lineSeparator).append(lineSeparator);
                }
import org.eclipse.swt.SWT;

        List<DBPNamedObject> dataSourceMappings = itemDescriptor.getDataSourceMappings();
                }
                calcTypeCombo.setEnabled(!readOnly);
            gd.heightHint = 100;
        return  (queryText == null || !queryText.getText().isEmpty()) &&
    public void createControl(@NotNull Composite composite, DashboardItemConfiguration itemDescriptor, @NotNull Runnable propertyChangeListener) {


 * DBeaver - Universal Database Manager
            }
                viewTypeCombo.setText(viewType.getTitle());
    private Combo viewTypeCombo;
import org.eclipse.jface.dialogs.IDialogConstants;
        itemDescriptor.setCalcType(DBDashboardCalcType.values()[calcTypeCombo.getSelectionIndex()]);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
                dbSelectorPanel.setLayoutData(gd);
 * You may obtain a copy of the License at
                    valueTypeCombo.add(dvt.name());
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
                calcTypeCombo.setText(itemDescriptor.getCalcType().name());
                }
                Text dbSelectorText = new Text(dbSelectorPanel, SWT.READ_ONLY | SWT.BORDER);
                    calcTypeCombo.add(dct.name());
                UIUtils.createControlLabel(mainGroup, UIDashboardMessages.dialog_edit_dashboard_maininfo_labels_db);
        {
                }
}
 */
        }
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                intervalCombo.setEnabled(!readOnly);

        itemDescriptor.setInterval(DBDashboardInterval.values()[intervalCombo.getSelectionIndex()]);
                if (viewTypeCombo.getSelectionIndex() < 0) {
            String lineSeparator = GeneralUtils.getDefaultLineSeparator();
        //dashboardDescriptor.setMaxAge(DashboardUtils.parseDuration(maxAgeText.getText(), dashboardDescriptor.getMaxAge()));
            {
                dataTypeCombo.setEnabled(!readOnly);
