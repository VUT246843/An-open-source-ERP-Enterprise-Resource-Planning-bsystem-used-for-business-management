                                            if (resultSet.next()) {
    @Override
        SashForm planPanel = new CustomSashForm(control, SWT.VERTICAL);
                                        try (JDBCResultSet resultSet = stm.executeQuery(wrapShardQuery("show trace"))) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public boolean isDirty() {
import org.jkiss.code.NotNull;
    public void setFocus() {
import org.jkiss.dbeaver.ui.UIStyles;
 *
        this.presentation = presentation;
            statisticInfo.setText(String.format(CubridMessages.statistic_instruction_message, CubridMessages.statistic_info + "|" + CubridMessages.statistic_all_info));
                                log.error("could not read statistic", e);
            this.control.dispose();

        } else if (store.getString(CubridConstants.STATISTIC).equals(CubridConstants.STATISTIC_ALL_INFO)) {
    public void deactivatePanel() {
        return control;
        this.control.setFocus();
import java.sql.SQLException;
        if (!CommonUtils.isEmpty(store.getString(CubridConstants.STATISTIC))) {
        plainText = new Text(planPanel, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
        stm.execute(wrapShardQuery(this.presentation.getController().getContainer().toString()));

        gl.marginHeight = 0;
    private String getStatisticQuery() {
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;
                            try (JDBCSession session = DBUtils.openMetaSession(monitor, presentation.getController().getDataContainer().getDataSource(), "Read Statistic")) {
            table.setLinesVisible(!UIStyles.isDarkTheme());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private void refreshResult() {
                                try (JDBCStatement stm = session.createStatement()) {
import org.eclipse.swt.layout.GridLayout;
        control = UIUtils.createPlaceholder(parent, 1);
                UIUtils.syncExec(

import org.eclipse.swt.SWT;
    @Override
    @Override
            table.setHeaderVisible(true);


 * limitations under the License.
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
    private static final Log log = Log.getLog(CubridInfoPanel.class);
            table.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.runtime.DBWorkbench;
}
        final GridLayout gl = new GridLayout(1, false);
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
            while (resultSet.next()) {

    }
    }

    @Override
                                }
        UIUtils.packColumns(table);
                                    }
    private Composite control;
        return null;
                                                String st = resultSet.getString("trace");
    }
 */

import org.eclipse.jface.action.IContributionManager;
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;
    }
import org.eclipse.swt.widgets.*;
    }
    }
        }
package org.jkiss.dbeaver.ext.cubrid.ui.controls;
 * See the License for the specific language governing permissions and
            statisticInfo = new Text(planPanel, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
                item.setText(1, resultSet.getString("value"));
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
                            } catch (SQLException | DBCException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
    public void refresh(boolean force) {
import org.jkiss.dbeaver.model.exec.DBCException;
        if (this.control != null && !this.control.isDisposed()) {
                        });
    @Override
        return false;
        try (JDBCResultSet resultSet = stm.executeQuery(queryInfo)) {
import org.jkiss.dbeaver.ui.UIUtils;
 * Unless required by applicable law or agreed to in writing, software
    }
        refreshResult();
 *

            return "show exec statistics;";
    public void contributeActions(IContributionManager manager) {
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
                                        showStatistic(stm, statisticQuery);
        refreshResult();
        {
                                        }
        }
    public void activatePanel() {
        gl.marginWidth = 0;
        }.schedule();

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private Text statisticInfo;
/*
    }
                TableItem item = new TableItem(table, SWT.LEFT);
        CubridDataSource dataSource = (CubridDataSource) presentation.getController().getDataContainer().getDataSource();
 * You may obtain a copy of the License at
                                    String statisticQuery = wrapShardQuery(getStatisticQuery());
        planPanel.setLayout(gl);
    }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                                    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    public String wrapShardQuery(String sql) {
                                            }
            UIUtils.createTableColumn(table, SWT.LEFT, "Name");

            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        planPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        new AbstractJob("Read Statistic")
    }
 *

    public Control createContents(IResultSetPresentation presentation, Composite parent) {

                                        stm.execute(wrapShardQuery(presentation.getController().getContainer().toString()));
            return "show exec statistics all;";
import org.jkiss.utils.CommonUtils;

public class CubridInfoPanel extends ResultSetPanelBase {
import org.eclipse.swt.custom.SashForm;
        plainText.setText(String.format(CubridMessages.statistic_instruction_message, CubridMessages.statistic_trace_info));
            @NotNull
import org.jkiss.code.Nullable;
                return Status.OK_STATUS;
    private void showStatistic(JDBCStatement stm, String queryInfo) throws SQLException {
        control.setLayoutData(new GridData(GridData.FILL_BOTH));
                                                plainText.setText(st);

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.eclipse.swt.layout.GridData;

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.model.DBUtils;

import org.eclipse.core.runtime.IStatus;
        table.removeAll();
    private Text plainText;
    @Nullable
        }
        return dataSource.wrapShardQuery(sql);
        if (store.getString(CubridConstants.STATISTIC).equals(CubridConstants.STATISTIC_INFO)) {
                item.setText(0, resultSet.getString("variable"));
        // not implemented
                                    if (CommonUtils.isNotEmpty(statisticQuery)) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                                    if (store.getBoolean(CubridConstants.STATISTIC_TRACE)) {
            UIUtils.createTableColumn(table, SWT.LEFT, "Value");
                            }
                        () -> {
import org.eclipse.core.runtime.Status;
    private Table table;
    private IResultSetPresentation presentation;
        } else {
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            table = new Table(planPanel, SWT.MULTI | SWT.FULL_SELECTION);
            @Override
