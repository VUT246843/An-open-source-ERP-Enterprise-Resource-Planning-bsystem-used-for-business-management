        if (resultsContainer == null) {

    private void updateControls() {
import org.eclipse.swt.widgets.Composite;
            } catch (DBException e) {
                this.presentation.getController().removeListener(ownerListener));
            setImageDescriptor(DBeaverIcons.getImageDescriptor(presentationDescriptor.getIcon()));
                }
public class GroupingPanel extends ResultSetPanelBase {
import org.eclipse.jface.dialogs.IDialogSettings;

        };
    public GroupingPanel() {
    private GroupingResultsContainer getGroupingResultsContainer() {
        }
    private IDialogSettings panelSettings;
            ((ResultSetViewer)getGroupingResultsContainer().getResultSetController()).switchPresentation(presentationDescriptor);
        this.groupingPlaceholder.setLayout(new FillLayout());
    @Override
 */
    }
import org.eclipse.jface.action.ActionContributionItem;
        }
        return resultsContainer;


 * Unless required by applicable law or agreed to in writing, software
            groupingViewer.addListener(groupingResultsListener);
                    updateControls();
                refresh(true);
        //resultsContainer.getResultSetController().getControl().setFocus();
import org.jkiss.dbeaver.ui.DBeaverIcons;

        contributionManager.add(sortAction);
        @Override
                @Override
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and

/*
        this.presentation = presentation;
    private void saveSettings() {
                DBWorkbench.getPlatformUI().showError("Grouping error", "Can't refresh grouping query", e);

    }
            return presentationDescriptor.matches(
        this.ownerListener = new ResultSetListenerAdapter() {
    private GroupingResultsContainer resultsContainer;
                public void handleResultSetLoad() {
        return !getGroupingResultsContainer().getGroupAttributes().isEmpty();

    public void activatePanel() {
import org.eclipse.jface.viewers.SelectionChangedEvent;
            };

            public void handleResultSetLoad() {
        GroupingResultsContainer groupingResultsContainer = getGroupingResultsContainer();


import org.jkiss.dbeaver.runtime.DBWorkbench;
            @Override
        // Or just clear it (if brand new query was executed)


        contributionManager.add(new ToolbarSeparatorContribution(true));
        groupingPlaceholder.layout(true, true);
        contributionManager.add(new DeleteColumnAction(getGroupingResultsContainer()));

            super(presentationDescriptor.getLabel(), Action.AS_RADIO_BUTTON);
        public void run() {
        return groupingPlaceholder;
import org.jkiss.dbeaver.ui.controls.resultset.*;
import org.eclipse.swt.layout.FillLayout;
            // Icons turns menu into mess - checkboxes are much better
            setToolTipText(presentationDescriptor.getDescription());
 * RSV grouping panel
        fillToolBar(manager);
                @Override
 *
 * DBeaver - Universal Database Manager
    }
        }
        // Here we can refresh grouping (makes sense if source query was modified with some conditions)
        loadSettings();
    public boolean isDirty() {
        refresh(false);

/**
            //setImageDescriptor(DBeaverIcons.getImageDescriptor(panel.getIcon()));
        //this.presentation.getController().addListener(ownerListener);
 * You may obtain a copy of the License at
 */
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.action.Action;
    @Override
        contributionManager.add(new PercentFromTotalAction(getGroupingResultsContainer()));

    @Override
        sortAction.setMode(ActionContributionItem.MODE_FORCE_TEXT);
    }

    @Override
    @Override
    private IResultSetPresentation presentation;
        this.panelSettings = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_GROUPING);
    }

                    //updateControls();
    @Override
}
        contributionManager.add(new ToolbarSeparatorContribution(true));
        this.groupingPlaceholder = new Composite(parent, SWT.NONE);

            this.resultsContainer = new GroupingResultsContainer(groupingPlaceholder, presentation);
        }
    }
        ActionContributionItem sortAction = new ActionContributionItem(new DefaultSortingAction(getGroupingResultsContainer()));

    public void refresh(boolean force) {
        if (presentation.getController().getModel().isMetadataChanged()) {
            groupingResultsContainer.clearGrouping();


    private static final String SETTINGS_SECTION_GROUPING = "panel-" + PANEL_ID;
    private void loadSettings() {
 * limitations under the License.
            this.presentationDescriptor = presentationDescriptor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        IDialogSettings functionsSection = panelSettings.getSection("groups");
import org.eclipse.swt.widgets.Control;

    public void setFocus() {
import org.jkiss.dbeaver.ui.UIUtils;

 *     http://www.apache.org/licenses/LICENSE-2.0
        private final ResultSetPresentationDescriptor presentationDescriptor;
    }
                getGroupingResultsContainer().getResultSetController().getActivePresentation().getClass());
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.ui.controls.ToolbarSeparatorContribution;
    public void contributeActions(IContributionManager manager) {
        public PresentationToggleAction(ResultSetPresentationDescriptor presentationDescriptor) {
            IResultSetController groupingViewer = this.resultsContainer.getResultSetController();

        this.presentation.getController().updatePanelActions();
    private IResultSetListener ownerListener;
                }

        // Update panel toolbar
        }
        IDialogSettings functionsSection = UIUtils.getSettingsSection(panelSettings, "groups");
            try {
import org.eclipse.jface.action.IContributionManager;

        contributionManager.add(new EditColumnsAction(getGroupingResultsContainer()));
            groupingViewer.getControl().addDisposeListener(e ->
    private class PresentationToggleAction extends Action {
    public void deactivatePanel() {
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.controls.resultset.panel.grouping.action.*;
 *
            }
        @Override
        contributionManager.add(new DuplicatesOnlyAction(getGroupingResultsContainer()));
 * Licensed under the Apache License, Version 2.0 (the "License");
                groupingResultsContainer.rebuildGrouping();
            return;
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;
    }
            IResultSetListener groupingResultsListener = new ResultSetListenerAdapter() {

    }
        contributionManager.add(new ClearGroupingAction(getGroupingResultsContainer()));
        public boolean isChecked() {

    private static final String PANEL_ID = "results-grouping";
        getGroupingResultsContainer();
 *
    }
    }

    private Composite groupingPlaceholder;
    @Override
    }
        } else {
        }
        if (!force) {
                public void handleResultSetSelectionChange(SelectionChangedEvent event) {
            }

        groupingPlaceholder.layout(true, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public Control createContents(final IResultSetPresentation presentation, Composite parent) {

    private void fillToolBar(IContributionManager contributionManager) {
