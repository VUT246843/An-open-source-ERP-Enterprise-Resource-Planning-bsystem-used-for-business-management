    private CTabItem resultsTab;
                (event.stateMask & SWT.CTRL) == SWT.CTRL)) {
import org.eclipse.swt.SWT;
        );
    private ScrolledComposite tabContentScroller;
    }
        tabContentScroller.setMinSize(sectionsContainer.computeSize(tabContentScroller.getBorderWidth(), SWT.DEFAULT));
        sectionsContainer.layout();
        tabContentScroller.addDisposeListener(e -> tabContentScroller.getDisplay()
import org.eclipse.ui.forms.events.ExpansionEvent;
        boolean singleQuery
        int tabIndex = owner.obtainDesiredTabIndex(makeDefault);
    protected QueryResultsContainer createQueryResultsContainer(
        super(owner, false, makeDefault);
            singleQuery
            resultSetNumber,
                if (tabContentScroller.getClientArea().contains(tabContentScroller.toControl(clickedPoint))) {
            .removeFilter(SWT.MouseVerticalWheel, scrollListener));


                            Point offset = tabContentScroller.getOrigin();

    @NotNull
        tabContentScroller.setExpandVertical(true);
import org.jkiss.code.NotNull;
        return sectionsContainer;
        section.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        int queryIndex = owner.queryProcessors.indexOf(this);
 *
            tabCreated = true;
            this,
            resultSetNumber,
 */
import org.eclipse.ui.forms.widgets.Section;
    protected QueryResultsContainer createQueryResultsContainer(
 * distributed under the License is distributed on an "AS IS" BASIS,
        tabContentScroller.getDisplay().addFilter(SWT.MouseVerticalWheel, scrollListener);
        @NotNull DBSDataContainer dataContainer,
            @Override
        resultsTab.setShowClose(true);

import org.eclipse.swt.layout.GridData;
        resultsTab.setImage(SQLEditor.IMG_DATA_GRID);
            if (underScroll.getShell() == tabContentScroller.getShell() && tabContentScroller.isVisible() && (
            public void expansionStateChanged(ExpansionEvent e) {
    }
        Composite contents = UIUtils.createComposite(section, 1);
    }
        return new SingleTabQueryResultsContainer(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Listener;
        resultsTab = new CTabItem(owner.getResultTabsContainer(), SWT.NONE, tabIndex);
            Control underScroll = (Control) event.widget;
                            if (offset.y < 0) {
import org.eclipse.swt.custom.CTabItem;
                            event.doit = false;
                    }
 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.ui.editors.sql;
    }
        sectionsContainer.setLayout(new GridLayout(1, false));

    }


    private void prepareResultSetContainerHost(boolean makeDefault) {
        sectionsContainer = new Composite(tabContentScroller, SWT.NONE);
        section.setClient(contents);
                Point clickedPoint = underScroll.toDisplay(event.x, event.y);
    @NotNull
        return new Pair<>(section, contents);
 * See the License for the specific language governing permissions and
                        if (c == tabContentScroller) {
        int resultSetNumber,

    }
import org.jkiss.utils.Pair;
import org.eclipse.swt.widgets.Composite;
        );

                            }
        section.addExpansionListener(new ExpansionAdapter() {
            createSection(makeDefault),
    SingleTabQueryProcessor(@NotNull SQLEditor owner, boolean makeDefault) {
    }
import org.jkiss.dbeaver.ui.css.CSSUtils;
 *
    @NotNull
    Composite getSectionsContainer() {
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    ) {
    ) {
        Section section = new Section(sectionsContainer, Section.TWISTIE | Section.EXPANDED);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            offset.y -= event.count * SCROLL_SPEED;
    private Pair<Section, Composite> createSection(boolean makeDefault) {
    }
        tabContentScroller.setExpandHorizontal(true);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        sectionsContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
import org.eclipse.swt.layout.GridLayout;
        SQLEditor owner = getOwner();
        this.resultsTab = resultsTab;
import org.eclipse.swt.custom.ScrolledComposite;

            }
        if (!tabCreated) {
            prepareResultSetContainerHost(makeDefault);
                }
    CTabItem getResultsTab() {
        Listener scrollListener = event -> {
    public void setResultsTab(CTabItem resultsTab) {
 *
import org.jkiss.dbeaver.ui.UIUtils;

        return new SingleTabQueryResultsContainer(
                                offset.y = 0;
        });
import org.eclipse.ui.forms.events.ExpansionAdapter;
    private static final int SCROLL_SPEED = 10;
}
        UIUtils.disposeControlOnItemDispose(resultsTab);
    private boolean tabCreated;
        resultsTab.setData(this);
    @Override
        };

                    for (Control c = underScroll; c != null; c = c.getParent()) {
                relayoutContents();
 * You may obtain a copy of the License at
        tabContentScroller.setContent(sectionsContainer);
                        }
            singleQuery,
            createSection(false),
    private Composite sectionsContainer;
/*
        CSSUtils.markConnectionTypeColor(resultsTab);
        return resultsTab;
        }

import org.eclipse.swt.widgets.Control;

            dataContainer,
import org.eclipse.swt.graphics.Point;
        int resultSetIndex,
 * Unless required by applicable law or agreed to in writing, software
        int resultSetNumber,
        boolean makeDefault
            this,
            makeDefault
class SingleTabQueryProcessor extends QueryProcessor {
        resultsTab.setControl(tabContentScroller);
        tabContentScroller.setBackgroundMode(SWT.INHERIT_DEFAULT);
                            tabContentScroller.setOrigin(offset);
            resultSetIndex,
 * DBeaver - Universal Database Manager
            resultSetIndex,
    public void relayoutContents() {
    }
    @Override

        int resultSetIndex,
        resultsTab.setText(owner.getResultsTabName(0, queryIndex, null));
        tabContentScroller = new ScrolledComposite(owner.getResultTabsContainer(), SWT.V_SCROLL | SWT.BORDER);
        resultsTab.addDisposeListener(owner.resultTabDisposeListener);
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean singleQuery,
