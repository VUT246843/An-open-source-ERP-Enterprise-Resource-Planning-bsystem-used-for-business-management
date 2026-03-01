    @NotNull
                @Override
            .align(GridData.FILL, GridData.FILL).grab(true, false).hint(10, 300).create();

            @Override
                    return FEATURE_STATUS_BAR | FEATURE_PANELS | FEATURE_PRESENTATIONS | FEATURE_EDIT | FEATURE_LINKS;
                tracker.setCursor(tracker.getDisplay().getSystemCursor(SWT.CURSOR_SIZENS));
    SingleTabQueryResultsContainer(
 *
    }
import org.eclipse.swt.custom.CTabItem;
    @Override
import org.eclipse.swt.events.MouseAdapter;
        control.addDisposeListener(e -> control.getDisplay().removeFilter(SWT.MouseDown, displayListener));

package org.jkiss.dbeaver.ui.editors.sql;
                }
        int resultSetNumber,

        @NotNull Pair<Section, Composite> sectionAndContents,
                if (tracker.open()) {
        }
    @Override
    @Override
import org.jkiss.dbeaver.ui.controls.VerticalButton;

        super.setTabName(tabName);
        @NotNull DBSDataContainer dataContainer,
        int resultSetNumber,
        @NotNull SingleTabQueryProcessor queryProcessor,
import org.eclipse.swt.graphics.Point;
import org.jkiss.code.Nullable;
    public void handleExecuteResult(DBCExecutionResult result) {
        int resultSetIndex,

        this.setupSection(sectionAndContents.getSecond());
        section.setText(tabName);
}
        int resultSetIndex,
        @NotNull SingleTabQueryProcessor queryProcessor,
        return queryProcessor.getResultsTab();
        this.setupSection(sectionAndContents.getSecond());
                        queryProcessor.relayoutContents();
        line.addMouseMoveListener(e -> {
    @Override
    private void setupSection(@NotNull Composite sectionContents) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                section.setToolTipText(toolTip);
    public IResultSetDecorator createResultSetDecorator() {
    private final Section section;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;

                control.setLayoutData(control.getLayoutData() == rsvConstrainedLayout ? freeLayout : rsvConstrainedLayout);
        UIUtils.syncExec(section::dispose);
    public void updateResultsName(@NotNull String resultSetName, @Nullable String toolTip) {
    ) {
import org.jkiss.dbeaver.ui.UIUtils;
        super(sectionAndContents.getSecond(), queryProcessor, resultSetNumber, resultSetIndex, singleQuery, makeDefault);
                Point size = control.getSize();
        boolean singleQuery,
import org.eclipse.jface.layout.GridDataFactory;
                Point clickedPoint = clickedWidget.toDisplay(event.x, event.y);
        queryProcessor.relayoutContents();
    @Override
                    if (desiredViewerHeight < MIN_VIEWER_HEIGHT) {
import org.eclipse.swt.graphics.Rectangle;
        sectionContents.setData(ResultSetViewer.CONTROL_ID, this.viewer);

                }
                    queryProcessor.relayoutContents();
import org.eclipse.ui.forms.widgets.Section;

import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.Spreadsheet;
                tracker.dispose();

    }
        Composite control = this.viewer.getControl();
    ) {
                    }
                        if (c == sectionContents) {
    public void setTabName(@NotNull String tabName) {
 * You may obtain a copy of the License at
            }
                Point origin = queryProcessor.getSectionsContainer().toControl(control.toDisplay(control.getLocation()));
                Point spreadsheetSize = s.getSize();
    protected void dispose() {
        if (this.viewer.getActivePresentation().getControl() instanceof Spreadsheet s) {
import org.eclipse.swt.layout.GridData;
                if (control.getClientArea().contains(control.toControl(clickedPoint)) && !this.viewer.isPresentationInFocus()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    Rectangle after = tracker.getRectangles()[0];
        rsvConstrainedLayout = GridDataFactory.swtDefaults()
 * Copyright (C) 2010-2026 DBeaver Corp and others
        setTabPinned(queryProcessor.getResultsTab(), pinned);

                    rsvConstrainedLayout.heightHint = desiredViewerHeight;
                Point spreadsheetPreferredSize = s.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);

            .align(GridData.FILL, GridData.FILL).grab(true, false).create();
                section.setText(resultSetName);
    }
import org.eclipse.swt.widgets.*;
                    }
            return new QueryResultsDecorator() {
            UIUtils.syncExec(() -> {
        if (getOwner().getActivePreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE)) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
        };
        Listener displayListener = event -> { // for the contextual tool buttons it's critical for one result set to be focused
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override


                Tracker tracker = new Tracker(queryProcessor.getSectionsContainer(), SWT.RESIZE | SWT.DOWN);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
            public void mouseDoubleClick(MouseEvent e) {
    public void setPinned(boolean pinned) {
 */
        control.getDisplay().addFilter(SWT.MouseDown, displayListener);
    private static final Integer MIN_VIEWER_HEIGHT = 150;
import org.eclipse.swt.events.MouseEvent;
            }
                            break;
    }
            });
        Label line = new Label(sectionContents, SWT.SEPARATOR | SWT.HORIZONTAL); // resultset resizing thumb
                tracker.setRectangles(new Rectangle[] {new Rectangle(origin.x, origin.y, size.x, size.y + line.getSize().y / 2)});
class SingleTabQueryResultsContainer extends QueryResultsContainer {
    }
            if (clickedWidget instanceof VerticalButton && clickedWidget.getShell() == control.getShell() && control.isVisible()) {
        });
    public boolean isPinned() {
        } else {
        super.handleExecuteResult(result);
                    int newHeight = after.height - line.getSize().y / 2;
            }
        super(sectionAndContents.getSecond(), queryProcessor, resultSetNumber, resultSetIndex, dataContainer, singleQuery);
            if (!CommonUtils.isEmpty(resultSetName)) {
            };
    private GridData rsvConstrainedLayout;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetDecorator;
        this.queryProcessor = queryProcessor;
        boolean makeDefault
import org.jkiss.dbeaver.model.exec.DBCExecutionResult;
                        }
                        control.setLayoutData(rsvConstrainedLayout);
                queryProcessor.relayoutContents();
import org.jkiss.utils.Pair;
    }
            }
                int desiredViewerHeight = rsvConstrainedLayout.heightHint - spreadsheetSize.y + spreadsheetPreferredSize.y;
    @Override
                        rsvConstrainedLayout.heightHint = newHeight;
                    for (Control c = control; c != null && !c.isFocusControl(); c = c.getParent()) {
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        line.setCursor(line.getDisplay().getSystemCursor(SWT.CURSOR_SIZENS));
                        desiredViewerHeight = MIN_VIEWER_HEIGHT;
        });
            return super.createResultSetDecorator();
    public CTabItem getResultsTab() {

        line.setLayoutData(GridDataFactory.swtDefaults().align(GridData.FILL, GridData.FILL).grab(true, false).hint(10, 10).create());
                            control.setFocus();
        boolean singleQuery
            Control clickedWidget = (Control) event.widget;
import org.jkiss.dbeaver.ui.controls.resultset.QueryResultsDecorator;
        if (!section.isDisposed()) {
        return isTabPinned(queryProcessor.getResultsTab());
    @Override
 *
    }
        this.section = sectionAndContents.getFirst();
 * you may not use this file except in compliance with the License.
 *
        GridData freeLayout = GridDataFactory.swtDefaults()
        this.section = sectionAndContents.getFirst();
        }
        this.queryProcessor = queryProcessor;
            if (toolTip != null) {
/*
    }
    }
                tracker.setStippled(true);
 * limitations under the License.
                }
import org.eclipse.swt.SWT;
        line.addMouseListener(new MouseAdapter() {

    }
    }

        @NotNull Pair<Section, Composite> sectionAndContents,
    private final SingleTabQueryProcessor queryProcessor;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (newHeight != rsvConstrainedLayout.heightHint) {
                if (desiredViewerHeight < rsvConstrainedLayout.heightHint) {
            }
        control.setLayoutData(rsvConstrainedLayout);
                }
    SingleTabQueryResultsContainer(
                public long getDecoratorFeatures() {
        }

                    }
            if ((e.stateMask & SWT.BUTTON1) != 0) {

