        // Update panel toolbar
    }
            ISelectionChangedListener selectionListener = new ISelectionChangedListener() {
    }
        this.presentation.getController().updatePanelActions();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.


    public Control createContents(final IResultSetPresentation presentation, Composite parent) {
                private List<ResultSetRow> prevSelection;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
/*
        return this.resultsContainer;
 *
    @Override
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
                    getResultsContainer().refreshReferences(false);

import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelRefresher;
                    List<ResultSetRow> selectedItems = rss.getSelectedRows();
    public void contributeActions(IContributionManager manager) {


    }
                    this.prevSelection = selectedItems;
 * RSV references panel
        return referencesPlaceholder;


    }
    }

    private IResultSetPresentation presentation;
    private static final String SETTINGS_SECTION_GROUPING = "panel-" + PANEL_ID;
                    }
 *
    }
                    if (CommonUtils.equalObjects(prevSelection, selectedItems)) {
    private IDialogSettings panelSettings;
import org.eclipse.swt.widgets.Composite;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                @Override
        if (presentation instanceof ISelectionProvider sp) {



/**
        ResultSetPanelRefresher.installOn(this, presentation);
        loadSettings();

    private Composite referencesPlaceholder;
    private ReferencesResultsContainer getResultsContainer() {
                    }

    @Override
    public ReferencesPanel() {
        this.panelSettings = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_GROUPING);
    public void activatePanel() {
    public void refresh(boolean force) {
 *
        IDialogSettings functionsSection = panelSettings.getSection("references");
    }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            sp.addSelectionChangedListener(selectionListener);
    @Override
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.jkiss.utils.CommonUtils;
    private static final String PANEL_ID = "results-references";
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.viewers.SelectionChangedEvent;
        DataEditorFeatures.RESULT_SET_PANEL_REFS.use();

    }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
    private void loadSettings() {
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;
 * See the License for the specific language governing permissions and
        }
            referencesPlaceholder.layout(true, true);
                public void selectionChanged(SelectionChangedEvent event) {

    public boolean isDirty() {
        this.referencesPlaceholder.setLayout(new FillLayout());
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetSelection;

import org.eclipse.swt.widgets.Control;

    private ReferencesResultsContainer resultsContainer;
    }




            };
public class ReferencesPanel extends ResultSetPanelBase {
    @Override
                        return;
 * limitations under the License.
    }
                        return;
                        return;
                }
        this.referencesPlaceholder = new Composite(parent, SWT.NONE);

        refresh(false);
    }
        if (presentation.getController().getVisiblePanel() == this) {
package org.jkiss.dbeaver.ui.controls.resultset.panel.references;
                    if (presentation.getController().getVisiblePanel() != ReferencesPanel.this) {
    public void setFocus() {

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
        if (this.resultsContainer == null) {

            presentation.getControl().addDisposeListener(e -> sp.removeSelectionChangedListener(selectionListener));

    private void updateControls() {
    private void saveSettings() {

import org.jkiss.dbeaver.ui.DataEditorFeatures;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            this.resultsContainer = new ReferencesResultsContainer(referencesPlaceholder, presentation.getController());
    //private static final Log log = Log.getLog(ReferencesPanel.class);
 */
    @Override
}
 * You may obtain a copy of the License at
        this.presentation = presentation;
    @Override
 * DBeaver - Universal Database Manager
        return false;
            getResultsContainer().refreshReferences(force);
                    }

 */
    public void deactivatePanel() {
                    if (!(event.getSelection() instanceof IResultSetSelection rss)) {
        }
import org.eclipse.jface.dialogs.IDialogSettings;

import org.jkiss.dbeaver.ui.UIUtils;

        IDialogSettings functionsSection = UIUtils.getSettingsSection(panelSettings, "references");

