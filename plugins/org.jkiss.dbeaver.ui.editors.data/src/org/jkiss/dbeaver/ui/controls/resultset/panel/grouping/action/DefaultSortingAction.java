}
            menuManager.add(new ChangeSortingAction(Boolean.TRUE, resultsContainer));
            menuManager.add(new ChangeSortingAction(null, resultsContainer));
import org.eclipse.jface.action.MenuManager;
    public IMenuCreator getMenuCreator() {
 *     http://www.apache.org/licenses/LICENSE-2.0

        this.resultsContainer = resultsContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
            return menuManager;
 * limitations under the License.
        return new MenuCreator(control -> {
import org.jkiss.dbeaver.ui.MenuCreator;
    @Override
 * See the License for the specific language governing permissions and
    private final GroupingResultsContainer resultsContainer;

        });
 * you may not use this file except in compliance with the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
        super(ResultSetMessages.dialog_toolbar_sort, Action.AS_DROP_DOWN_MENU);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action;
    }
import org.eclipse.jface.action.IMenuCreator;
 *
import org.jkiss.dbeaver.ui.DBeaverIcons;
 */
import org.jkiss.dbeaver.ui.UIIcon;
            menuManager.add(new ChangeSortingAction(Boolean.FALSE, resultsContainer));
import org.jkiss.code.NotNull;
    public DefaultSortingAction(@NotNull GroupingResultsContainer resultsContainer) {

            MenuManager menuManager = new MenuManager();

        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.SORT_CONFIG));
 * Unless required by applicable law or agreed to in writing, software
        setToolTipText(ResultSetMessages.controls_resultset_grouping_default_sorting);
import org.eclipse.jface.action.Action;
 *
public class DefaultSortingAction extends Action {
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.GroupingResultsContainer;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
