 *
 */
        } catch (DBException e) {
                ResultSetMessages.grouping_panel_sorting_action_unsorted :

        );
    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return;
    @Override


package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
import org.jkiss.code.NotNull;
    public void run() {
        dataSource.getContainer().persistConfiguration();
        }
    public static final String DESC = "DESC";
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;

            getResultsContainer().rebuildGrouping();
import org.jkiss.code.Nullable;
        super(
    }
 * Unless required by applicable law or agreed to in writing, software
                .showError(ResultSetMessages.grouping_panel_error_title, ResultSetMessages.grouping_panel_error_change_sort_message, e);
}        } else {
                    ResultSetMessages.grouping_panel_sorting_action_ascending),
    public ChangeSortingAction(@Nullable Boolean descending, @NotNull GroupingResultsContainer resultsContainer) {
    private final GroupingResultsContainer resultsContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBWorkbench.getPlatformUI()
        try {
    public static final String ASC = "ASC";

        }
        String newValue = descending == null ? NONE : (descending ? DESC : ASC);
    @Override
public class ChangeSortingAction extends Action {
 * limitations under the License.
        DBPDataSource dataSource = getResultsContainer().getDataContainer().getDataSource();
        }
        }
    @NotNull
            return Boolean.FALSE.equals(descending);
        String defSorting = dataSource.getContainer().getPreferenceStore().getString(ResultSetPreferences.RS_GROUPING_DEFAULT_SORTING);

        if (CommonUtils.isEmpty(defSorting)) {
    public static final String NONE = "";
    public GroupingResultsContainer getResultsContainer() {
        this.descending = descending;
            Action.AS_RADIO_BUTTON
    }
        return resultsContainer;

import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
            return descending == null;

import org.jkiss.dbeaver.DBException;
        if (dataSource == null) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final Boolean descending;
 * You may obtain a copy of the License at
                (descending ?
            descending == null ?
    public boolean isChecked() {
/*
                    ResultSetMessages.grouping_panel_sorting_action_descending :
import org.eclipse.jface.action.Action;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
    }
        this.resultsContainer = resultsContainer;
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and
            return Boolean.TRUE.equals(descending);
        dataSource.getContainer().getPreferenceStore().setValue(ResultSetPreferences.RS_GROUPING_DEFAULT_SORTING, newValue);
        } else if (defSorting.equals(ASC)) {
            return false;
        DBPDataSource dataSource = getResultsContainer().getDataContainer().getDataSource();
        if (dataSource == null) {
