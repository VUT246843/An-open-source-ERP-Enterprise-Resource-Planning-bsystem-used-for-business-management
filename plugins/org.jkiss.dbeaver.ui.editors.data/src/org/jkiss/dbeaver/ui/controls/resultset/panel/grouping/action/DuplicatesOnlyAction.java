/*
    public boolean isChecked() {
        DBPDataSource dataSource = resultsContainer.getDataContainer().getDataSource();
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and

            .getBoolean(ResultSetPreferences.RS_GROUPING_SHOW_DUPLICATES_ONLY);
        }
        DBPDataSource dataSource = resultsContainer.getDataContainer().getDataSource();
            DBWorkbench.getPlatformUI().showError(
 * limitations under the License.

                ResultSetMessages.grouping_panel_error_title,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.action.Action;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        if (dataSource == null) {

package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
    }
                ResultSetMessages.grouping_panel_error_change_duplicate_presentation_message,
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        dataSource.getContainer().getPreferenceStore().setValue(ResultSetPreferences.RS_GROUPING_SHOW_DUPLICATES_ONLY, !isChecked());
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.resultsContainer = resultsContainer;
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return dataSource != null && dataSource.getContainer().getPreferenceStore()
        super(ResultSetMessages.controls_resultset_grouping_show_duplicates_only, Action.AS_CHECK_BOX);
            return;

    @Override
    private final GroupingResultsContainer resultsContainer;
            );
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 */
        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.DUPS_RESTRICTED));
    public void run() {
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
        }
                e
 * distributed under the License is distributed on an "AS IS" BASIS,
            resultsContainer.rebuildGrouping();
        try {

    public DuplicatesOnlyAction(@NotNull GroupingResultsContainer resultsContainer) {
import org.jkiss.dbeaver.model.DBPDataSource;
}
 *
public class DuplicatesOnlyAction extends Action {
    }
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
        } catch (DBException e) {
