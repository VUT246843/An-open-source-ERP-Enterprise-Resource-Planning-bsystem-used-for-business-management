    }
import org.jkiss.code.Nullable;
    }
            resultSetIndex,

 * limitations under the License.
                tabItem.setToolTipText(toolTip);
        super.setTabName(tabName);
import org.jkiss.dbeaver.ui.css.CSSUtils;
        int resultSetIndex,
    }

    @Override
 * Unless required by applicable law or agreed to in writing, software
        }
        @NotNull DBSDataContainer dataContainer,
package org.jkiss.dbeaver.ui.editors.sql;
    }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public CTabItem getResultsTab() {
        resultsTab.setText(tabName);
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 *

            }
            singleQuery,
        boolean makeDefault
        boolean singleQuery
 *

        CTabItem resultsTab = new CTabItem(owner.getResultTabsContainer(), SWT.NONE, tabIndex);

        int resultSetNumber,
            queryProcessor.getOwner().getResultTabsContainer(),

            resultSetIndex,
import org.eclipse.swt.SWT;
 * you may not use this file except in compliance with the License.
    @Override
    @Override
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
        if (tabItem != null && !tabItem.isDisposed()) {
class MultiTabsQueryResultsContainer extends QueryResultsContainer {
 */
        resultsTab.setControl(viewer.getControl());
            queryProcessor,
            resultsTab = null;
            queryProcessor,
            }

    @NotNull
        super.detach();
            if (toolTip != null) {
        super(
    }
        resultsTab = createResultTab(false);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        @NotNull QueryProcessor queryProcessor,
import org.jkiss.utils.CommonUtils;

            resultSetNumber,
            queryProcessor.getOwner().getResultTabsContainer(),

        );

        int resultSetIndex,
        boolean singleQuery,
        @NotNull QueryProcessor queryProcessor,
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.custom.CTabItem;

        return isTabPinned(resultsTab);


    public void updateResultsName(@NotNull String resultSetName, @Nullable String toolTip) {
    MultiTabsQueryResultsContainer(
        int tabIndex = owner.obtainDesiredTabIndex(makeDefault);
    @Override
    public void setTabName(@NotNull String tabName) {
    private CTabItem resultsTab;
            makeDefault
        return resultsTab;
    public void detach() {
        int resultSetNumber,
    }
            if (!CommonUtils.isEmpty(resultSetName)) {
    public boolean isPinned() {
    ) {
        UIUtils.disposeControlOnItemDispose(resultsTab);
        if (detached) {
    @Override
        setTabPinned(resultsTab, pinned);
        resultsTab.setText(owner.getResultsTabName(resultSetNumber, getQueryIndex(), null));
            singleQuery
    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return resultsTab;
    public void setPinned(boolean pinned) {
        CSSUtils.markConnectionTypeColor(resultsTab);
    public void setResultsTab(CTabItem resultsTab) {
 *     http://www.apache.org/licenses/LICENSE-2.0

                tabItem.setText(resultSetName);
        resultsTab.addDisposeListener(owner.resultTabDisposeListener);
        UIUtils.syncExec(resultsTab::dispose);
}
        );
import org.jkiss.dbeaver.ui.UIUtils;
/*
    protected void dispose() {
            resultSetNumber,
    }
    MultiTabsQueryResultsContainer(
        this.resultsTab = resultsTab;
            resultsTab.dispose();
            dataContainer,

        }
        resultsTab = createResultTab(makeDefault);
        resultsTab.setShowClose(true);
        CTabItem tabItem = resultsTab;
    @Override
        resultsTab.setData(this);
        resultsTab.setImage(SQLEditor.IMG_DATA_GRID);
    private CTabItem createResultTab(boolean makeDefault) {
        super(
    }
    }
 *
        SQLEditor owner = getOwner();

