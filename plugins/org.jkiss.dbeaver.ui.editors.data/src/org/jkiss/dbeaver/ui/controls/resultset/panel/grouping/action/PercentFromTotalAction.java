 * you may not use this file except in compliance with the License.
        dataSource.getContainer().getPreferenceStore().setValue(ResultSetPreferences.RS_GROUPING_SHOW_PERCENT_OF_TOTAL_ROWS, !isChecked());

        DBPDataSource dataSource = resultsContainer.getDataContainer().getDataSource();
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
        return dataSource != null && dataSource.getContainer().getPreferenceStore()
    @Override
        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.PERCENT));
 * Licensed under the Apache License, Version 2.0 (the "License");
}    @Override
        this.resultsContainer = resultsContainer;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
import org.jkiss.dbeaver.ui.UIIcon;
public class PercentFromTotalAction extends Action {
    }
        }

 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;

import org.eclipse.jface.action.Action;
        } catch (DBException e) {
import org.jkiss.dbeaver.model.DBPDataSource;
        DBPDataSource dataSource = resultsContainer.getDataContainer().getDataSource();
                ResultSetMessages.grouping_panel_error_title,
                ResultSetMessages.grouping_panel_error_show_percent_of_total_message,
        super(ResultSetMessages.grouping_panel_show_percent_of_total_tip, Action.AS_CHECK_BOX);
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final GroupingResultsContainer resultsContainer;
            );
        if (!isChecked()) {
            DBWorkbench.getPlatformUI().showError(
 * See the License for the specific language governing permissions and
            return;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public PercentFromTotalAction(@NotNull GroupingResultsContainer resultsContainer) {
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void run() {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
/*
    public boolean isChecked() {
                e
 * DBeaver - Universal Database Manager
 *
        try {

        }
import org.jkiss.code.NotNull;
        if (dataSource == null) {
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
 *
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            resultsContainer.rebuildGrouping();
        }
            resultsContainer.removePercentColumn();
            .getBoolean(ResultSetPreferences.RS_GROUPING_SHOW_PERCENT_OF_TOTAL_ROWS);
