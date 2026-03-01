        }.execute();

                    public void widgetSelected(SelectionEvent e) {
                }
                    public void widgetSelected(SelectionEvent e) {
            if (isServerAtLeast9) {
                    if (walCheckbox != null) {
                            buffers = false;
                    }
                walCheckbox = UIUtils.createCheckbox(
                        if (!analyseCheckboxSelection) {
                    settings,
                settingsGroup,

                    }
public class PostgreExplainPlanConfigurator implements DBEObjectConfigurator<DBCQueryPlannerConfiguration> {
            if (isVersionSupports(9, 2)) {
                        costs = costsCheckbox.getSelection();
                    if (timingCheckbox != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
                    settingsGroup,
                    PostgreMessages.dialog_query_planner_settings_buffers,
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
            }

        return new UITask<DBCQueryPlannerConfiguration>() {
                PostgreMessages.dialog_query_planner_settings_verbose,

                });
                settingsCheckbox.addSelectionListener(new SelectionAdapter() {
        @NotNull
                    /*if (summaryCheckbox != null && analyseCheckboxSelection) {
                });
import org.eclipse.swt.widgets.Composite;
                2);
                        if (buffersCheckbox.getSelection() && !analyseCheckboxSelection) {
                timingCheckbox.addSelectionListener(new SelectionAdapter() {


                    }*/
            boolean isServerAtLeast9 = dataSource != null && dataSource.isServerVersionAtLeast(9, 0);
/*
                });
            }
    }
                    }
                    if (isVersionSupports(13, 0)) {
    public DBCQueryPlannerConfiguration configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull DBCQueryPlannerConfiguration configuration, @NotNull Map<String, Object> options) {
                        parameters.put(PostgreQueryPlaner.PARAM_BUFFERS, buffers);
                    /*if (isVersionSupports(10, 0)) {
                        parameters.put(PostgreQueryPlaner.PARAM_WAL, wal);
                        }
                    settingsGroup,
                    }
                costsCheckbox.addSelectionListener(new SelectionAdapter() {
        }
                        if (walCheckbox.getSelection() && !analyseCheckboxSelection) {


                }
                return null;
            Button verboseCheckbox = UIUtils.createCheckbox(
import org.eclipse.swt.widgets.Button;
                        timing = timingCheckbox.getSelection();
                });
                        parameters.put(PostgreQueryPlaner.PARAM_COSTS, costs);
                    2);
                settingsGroup,
                    2);
 *
                            timing = true;
                PlanConfigDialog dialog = new PlanConfigDialog();
            }
                PostgreMessages.dialog_query_planner_settings_analyze,

            /*if (isVersionSupports(10, 0)) {
        if (container instanceof DBCQueryPlanner) {
import org.eclipse.swt.layout.GridData;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.postgresql.model.plan.PostgreQueryPlaner;
                if (!isServerAtLeast13) {
 * limitations under the License.
            protected DBCQueryPlannerConfiguration runTask() {
                            walCheckbox.setSelection(false);
                GridData.FILL_BOTH);
 *
            verboseCheckbox.addSelectionListener(new SelectionAdapter() {
                    }*/
        }
                    }
                }
                        }
                    2);
                    @Override
    private static boolean analyse;
                    settingsGroup,

                verbose,
                    PostgreMessages.dialog_query_planner_settings,
}
                    parameters.put(PostgreQueryPlaner.PARAM_ANALYSE, analyse);
                    PostgreMessages.dialog_query_planner_settings_costs_tip,
                    PostgreMessages.dialog_query_planner_settings_wal_tip,
                    Map<String, Object> parameters = configuration.getParameters();
                @Override
                    PostgreMessages.dialog_query_planner_settings_tip,
                Button settingsCheckbox = UIUtils.createCheckbox(
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                PostgreMessages.dialog_query_planner_settings_analyze_tip,
        private Button buffersCheckbox;
                });
            @Override
                }
                    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                        timingCheckbox.setEnabled(analyseCheckboxSelection);
import org.jkiss.dbeaver.ui.UIUtils;
            }
 * See the License for the specific language governing permissions and
import org.eclipse.swt.events.SelectionEvent;
            Composite dialogArea = super.createDialogArea(parent);
                            buffersCheckbox.setSelection(false);
                public void widgetSelected(SelectionEvent e) {
                    }
                    }
            // Summary needs special support. Maybe we will add it some day.
                    boolean analyseCheckboxSelection = analyseCheckbox.getSelection();
                    public void widgetSelected(SelectionEvent e) {
                analyse,
                    PostgreMessages.dialog_query_planner_settings_timing,
 * Licensed under the Apache License, Version 2.0 (the "License");

        return dataSource != null && dataSource.isServerVersionAtLeast(major, minor);

import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
                    timing,
import org.jkiss.dbeaver.model.DBPDataSource;
                if (dialog.open() == IDialogConstants.OK_ID) {
                    public void widgetSelected(SelectionEvent e) {
    private static boolean verbose;
                    PostgreMessages.dialog_query_planner_settings_wal,
                            timing = false;
                    PostgreMessages.dialog_query_planner_settings_costs,
                    settingsGroup,
                    @Override
                        summary = true;
                    verbose = verboseCheckbox.getSelection();
                    }
                public void widgetSelected(SelectionEvent e) {
                buffersCheckbox.addSelectionListener(new SelectionAdapter() {
                dialogArea,
import org.eclipse.swt.events.SelectionAdapter;
                        buffers = buffersCheckbox.getSelection();
                        summary = summaryCheckbox.getSelection();

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                    summary,
                    @Override
                    wal,
                    settingsGroup,
                        parameters.put(PostgreQueryPlaner.PARAM_SETTINGS, settings);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                walCheckbox.setEnabled(analyseCheckbox.getSelection());
                });
        }
            }
                    costs,
 *
                        walCheckbox.setEnabled(analyseCheckboxSelection);
                    public void widgetSelected(SelectionEvent e) {
                buffersCheckbox = UIUtils.createCheckbox(
            Composite settingsGroup = UIUtils.createTitledComposite(
    private static boolean buffers;
                            wal = false;
            }*/
                    }
                    @Override
                    2);
    // It is static as we want to save it between plan explains
                    buffers,
                        settings = settingsCheckbox.getSelection();
                PostgreMessages.dialog_query_planner_settings_control_label,
            if (isServerAtLeast13) {
 * DBeaver - Universal Database Manager
            return dialogArea;
                        parameters.put(PostgreQueryPlaner.PARAM_TIMING, timing);
                    settingsGroup,
 * Unless required by applicable law or agreed to in writing, software
            }
                    public void widgetSelected(SelectionEvent e) {
    private static boolean wal;
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        private Button walCheckbox;
                dataSource = (PostgreDataSource) dbpDataSource;
                    parameters.put(PostgreQueryPlaner.PARAM_VERBOSE, verbose);

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        protected Composite createDialogArea(@NotNull Composite parent) {
                    PostgreMessages.dialog_query_planner_settings_summary,
            if (dbpDataSource instanceof PostgreDataSource) {
                        // SUMMARY has default value for ANALYZE parameter as true
            });
                Button costsCheckbox = UIUtils.createCheckbox(
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;

                    if (isVersionSupports(9, 2)) {
                        buffersCheckbox.setEnabled(analyseCheckboxSelection);
    private static PostgreDataSource dataSource;
                PostgreMessages.dialog_query_planner_settings_verbose_tip,
            Button analyseCheckbox = UIUtils.createCheckbox(
                        summaryCheckbox.setSelection(true);
                        parameters.put(PostgreQueryPlaner.PARAM_SUMMARY, summary);
                    }
 */
                    if (isVersionSupports(12, 0)) {
    private static boolean isVersionSupports(int major, int minor) {
                    PostgreMessages.dialog_query_planner_settings_buffers_tip,
import org.jkiss.code.NotNull;
                    2);
                summaryCheckbox = UIUtils.createCheckbox(
                    2);
                        } else if (timingCheckbox.getSelection() && !timing) {
                timingCheckbox = UIUtils.createCheckbox(
                2);
    @Override
                        wal = walCheckbox.getSelection();
            if (isServerAtLeast9) {
                @Override
    }
import org.jkiss.code.Nullable;
import java.util.Map;
    private static class PlanConfigDialog extends BaseDialog {
                    analyse = analyseCheckbox.getSelection();
            boolean isServerAtLeast13 = dataSource != null && dataSource.isServerVersionAtLeast(13, 0);
                walCheckbox.addSelectionListener(new SelectionAdapter() {
    private static boolean costs = true;
                        }

import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerConfiguration;
            }

                    }

            DBPDataSource dbpDataSource = ((DBCQueryPlanner) container).getDataSource();
                2,
                    if (isVersionSupports(9, 0)) {
                    if (buffersCheckbox != null && !isServerAtLeast13) {
                summaryCheckbox.addSelectionListener(new SelectionAdapter() {
        private Button timingCheckbox;
                    @Override
import org.jkiss.dbeaver.ui.UITask;
                    PostgreMessages.dialog_query_planner_settings_summary_tip,
import org.eclipse.jface.dialogs.IDialogConstants;
            if (isVersionSupports(12, 0)) {
                    PostgreMessages.dialog_query_planner_settings_timing_tip,
        public PlanConfigDialog() {
            super(UIUtils.getActiveWorkbenchShell(), PostgreMessages.dialog_query_planner_settings_title, null);
            analyseCheckbox.addSelectionListener(new SelectionAdapter() {
                    buffersCheckbox.setEnabled(analyseCheckbox.getSelection());

                    return configuration;
                timingCheckbox.setEnabled(analyseCheckbox.getSelection());



    private static boolean timing = true;
            });
    private static boolean settings;
