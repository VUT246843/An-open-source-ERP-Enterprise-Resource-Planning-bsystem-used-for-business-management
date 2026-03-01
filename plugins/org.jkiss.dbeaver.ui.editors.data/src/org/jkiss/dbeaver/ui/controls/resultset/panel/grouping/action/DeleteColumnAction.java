import org.jkiss.dbeaver.ui.DBeaverIcons;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            }
                    try {
import org.jkiss.utils.ArrayUtils;

        return !groupingResultsContainer.getResultSetController().getSelection().isEmpty();
                } else {
public class DeleteColumnAction extends GroupingAction {

import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
    public void run() {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;

    @Override
                            ResultSetMessages.grouping_panel_error_change_grouping_query_message, e
 *
            if (attrBindingIndex >= 0 && currentBinding.getDataContainer() instanceof GroupingDataContainer dataContainer) {
                            ResultSetMessages.grouping_panel_error_title,
    @Override
        }
                        );
        DBDAttributeBinding currentBinding = resultSetController.getActivePresentation().getCurrentAttribute();
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * You may obtain a copy of the License at
                        DBWorkbench.getPlatformUI().showError(
                    }
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingDataContainer;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
/*
        IResultSetController resultSetController = groupingResultsContainer.getResultSetController();
                SQLGroupingAttribute[] currAttrs = dataContainer.getGroupingAttributes();
import org.jkiss.dbeaver.model.sql.SQLGroupingAttribute;
    }
 *
                    removed = groupingResultsContainer.removeGroupingAttribute(List.of(currAttrs[attrBindingIndex]));
        super(resultsContainer, ResultSetMessages.controls_resultset_grouping_remove_column, DBeaverIcons.getImageDescriptor(UIIcon.CLOSE));
                        groupingResultsContainer.rebuildGrouping();
                        List.of(currentBinding.getFullyQualifiedName(DBPEvaluationContext.UI))
                    );
    public DeleteColumnAction(@NotNull GroupingResultsContainer resultsContainer) {


                if (removed) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIIcon;
                }
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * limitations under the License.
                    removed = groupingResultsContainer.removeGroupingFunction(
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
        if (currentBinding != null) {
    }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
            int attrBindingIndex = ArrayUtils.indexOf(resultSetController.getModel().getAttributes(), currentBinding);
                if (currAttrs != null && attrBindingIndex < currAttrs.length) {
 * See the License for the specific language governing permissions and

    public boolean isEnabled() {
    }
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
                boolean removed;
}import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
                    } catch (DBException e) {
