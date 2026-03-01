import org.jkiss.code.NotNull;
 */
        groupingResultsContainer.clearGrouping();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void run() {
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            DBeaverIcons.getImageDescriptor(UIIcon.CLEAN)
    public boolean isEnabled() {
        super(
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

        );
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

 * DBeaver - Universal Database Manager
 * limitations under the License.
 *
    }
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
}
 * You may obtain a copy of the License at
    }
    @Override
    @Override
public class ClearGroupingAction extends GroupingAction {
            resultsContainer, ResultSetMessages.controls_resultset_grouping_clear,
    public ClearGroupingAction(@NotNull GroupingResultsContainer resultsContainer) {

    }
        return !groupingResultsContainer.getGroupAttributes().isEmpty();
/*
 * you may not use this file except in compliance with the License.


        groupingResultsContainer.getOwnerPresentation().getController().updatePanelActions();
 *
