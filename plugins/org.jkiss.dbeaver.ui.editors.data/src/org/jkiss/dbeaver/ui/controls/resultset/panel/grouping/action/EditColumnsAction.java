
 *
                    e
 */
import org.jkiss.code.NotNull;
 *
    public void run() {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
        GroupingConfigDialog dialog = new GroupingConfigDialog(
            groupingResultsContainer.getResultSetController().getControl().getShell(),
    }

public class EditColumnsAction extends GroupingAction {
    }
 * Unless required by applicable law or agreed to in writing, software
        if (dialog.open() == IDialogConstants.OK_ID) {
                DBWorkbench.getPlatformUI().showError(
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    ResultSetMessages.grouping_panel_error_title,
            try {
 * DBeaver - Universal Database Manager

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        }
    public EditColumnsAction(@NotNull GroupingResultsContainer resultsContainer) {
import org.jkiss.dbeaver.ui.UIIcon;
            } catch (DBException e) {
 * you may not use this file except in compliance with the License.
            groupingResultsContainer
                groupingResultsContainer.rebuildGrouping();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.DBException;
        );
import org.jkiss.dbeaver.ui.DBeaverIcons;
                );
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingConfigDialog;
/*
        super(resultsContainer, ResultSetMessages.controls_resultset_grouping_edit, DBeaverIcons.getImageDescriptor(UIIcon.EDIT_COLUMN));
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
                    ResultSetMessages.grouping_panel_error_change_grouping_settings_message,
} * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
