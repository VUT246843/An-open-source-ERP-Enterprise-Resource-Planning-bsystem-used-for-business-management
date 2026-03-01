            @Override

        setImage(AIIcons.AI);
        super.okPressed();
import org.eclipse.swt.events.SelectionAdapter;
    }
    protected void okPressed() {
            inputField,
    @NotNull
            @NotNull
        return scopeSelectorControl.getScope();
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
    }
            scopeSelectorControl.getToolBar(),
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        @NotNull AICompletionSettings settings
 * DBeaver - Universal Database Manager

        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    @Override
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
import org.jkiss.dbeaver.ui.UIUtils;
                        inputField.selectAll();
 * You may obtain a copy of the License at
        scopeSelectorControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            UIIcon.CONFIGURATION,
import org.eclipse.swt.SWT;


        });

        Button applyButton = UIUtils.createDialogButton(placeholder, "&Translate",
        );
import org.eclipse.swt.events.SelectionListener;
 *
        setModeless(true);
        parent.getShell().setDefaultButton(applyButton);
        inputField.addListener(SWT.KeyDown, event -> {
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
import org.jkiss.dbeaver.ui.ai.AIUIUtils;
        @NotNull Shell parentShell,
            }
    protected Composite createDialogArea(Composite parent) {

import org.jkiss.dbeaver.ui.ai.controls.ScopeSelectorControl;
            SelectionListener.widgetSelectedAdapter(selectionEvent -> okPressed()));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (event.keyCode == SWT.CR && event.stateMask == 0) {
                        inputField.setText(queries.get(0).getNaturalText());
    }
                    } else {
                    if (!CommonUtils.isEmpty(queries)) {
        this.dataSource = dataSource;
        });
        inputField = new Text(placeholder, SWT.BORDER | SWT.MULTI);
        historyCombo.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {



package org.jkiss.dbeaver.ui.ai.legacy;
                        }
        // No buttons
    }
                }
 * you may not use this file except in compliance with the License.
    @Override
            public void widgetSelected(SelectionEvent e) {
        historyCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private final AICompletionSettings settings;
                String text = historyCombo.getText();
import org.jkiss.code.NotNull;
        inputText = inputField.getText().trim();
import org.jkiss.dbeaver.model.qm.QMTranslationHistoryItem;
        gd = new GridData(GridData.FILL_BOTH);
        miscPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
}
        inputField.setTextLimit(10000);
    private ScopeSelectorControl scopeSelectorControl;
        settings.setScope(scopeSelectorControl.getScope());
                    inputField.setText(text);
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.ui.UIIcon;
        inputField.setFocus();
import java.util.List;
                List<QMTranslationHistoryItem> queries = InMemoryHistoryManager.readTranslationHistory(dataSource);
        scopeSelectorControl = new ScopeSelectorControl(placeholder, dataSource, executionContext, settings);
        @NotNull DBSLogicalDataSource dataSource,
import org.jkiss.dbeaver.model.ai.AIDatabaseScope;
        hintLabel.addSelectionListener(new SelectionAdapter() {
            applyButton
        settings.saveSettings();
        return inputText;
        historyCombo.setEnabled(false);
        Composite miscPanel = UIUtils.createComposite(placeholder, 2);
        @NotNull String title,
import org.jkiss.dbeaver.model.struct.DBSObject;
        };

import org.jkiss.dbeaver.model.runtime.AbstractJob;
    protected void createButtonsForButtonBar(Composite parent) {
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    }

        inputField.addModifyListener(e -> inputText = inputField.getText());
        Combo historyCombo = new Combo(miscPanel, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.utils.CommonUtils;
        gd.widthHint = UIUtils.getFontHeight(placeholder.getFont()) * 40;
                });
    private final DBCExecutionContext executionContext;
        hintLabel.setLayoutData(gd);

import org.eclipse.core.runtime.Status;
        this.settings = settings;
        UIUtils.createToolItem(
    }
 * limitations under the License.
    protected boolean isModeless() {
import org.jkiss.dbeaver.model.ai.AIIcons;
 *
import org.eclipse.swt.layout.GridData;

        ((GridData)applyButton.getLayoutData()).grabExcessHorizontalSpace = false;
 * Unless required by applicable law or agreed to in writing, software
        return placeholder;
    public List<DBSObject> getCustomEntities(@NotNull DBRProgressMonitor monitor) {
    private String inputText;
    }
        @NotNull DBCExecutionContext executionContext,
        hintPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        UIUtils.createControlLabel(miscPanel, "&History");
    ) {
        //inputField.setLayoutData(new GridData(GridData.FILL_BOTH));
public class AISuggestionPopup extends AbstractPopupPanel {
                        historyCombo.setEnabled(true);
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
        Composite hintPanel = UIUtils.createComposite(placeholder, 2);
            @Override
        Composite placeholder = super.createDialogArea(parent);
        hintLabel.setText(AIUIMessages.ai_suggestion_popup_message);

        completionJob.schedule();
            scopeSelectorControl.getScopeCombo(),


                UIUtils.openWebBrowser(HelpUtils.getHelpGitHubReference("AI-Smart-Assistance-in-DBeaver-Community"));
        return true;
/*
                        historyCombo.setEnabled(false);
    private Text inputField;
        super(parentShell, title);


        gd.heightHint = UIUtils.getFontHeight(placeholder.getFont()) * 10;
    @NotNull
                okPressed();
            "Settings",
                UIUtils.syncExec(() -> {

        AbstractJob completionJob = new AbstractJob("Read completion history") {

        return scopeSelectorControl.getCustomEntities(monitor);
    }
                    }
    public String getInputText() {
        ((GridData)applyButton.getLayoutData()).horizontalAlignment = GridData.END;


    private final DBSLogicalDataSource dataSource;
    public AIDatabaseScope getScope() {
            }
                if (!CommonUtils.isEmpty(text)) {
            historyCombo,
            scopeSelectorControl.getScopeText(),
        Link hintLabel = new Link(hintPanel, SWT.NONE);
import org.eclipse.core.runtime.IStatus;
            @Override
                return Status.OK_STATUS;
import org.eclipse.swt.widgets.*;
 * See the License for the specific language governing permissions and
 */
                event.doit = false;
                        for (QMTranslationHistoryItem query : queries) {
import org.jkiss.dbeaver.utils.HelpUtils;
        inputField.setLayoutData(gd);
                        historyCombo.select(0);
 *
import org.jkiss.dbeaver.model.ai.AICompletionSettings;
        closeOnFocusLost(
        );
    public AISuggestionPopup(

        this.executionContext = executionContext;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionEvent;
            SelectionListener.widgetSelectedAdapter(e -> AIUIUtils.showPreferences(getShell()))
        settings.setCustomObjectIds(scopeSelectorControl.getCheckedObjectIds().toArray(new String[0]));
        gd.horizontalSpan = 2;

                            historyCombo.add(query.getNaturalText());
    @Override
