            imgLabel.setImage(DBeaverIcons.getImage(DBIcon.STATUS_WARNING));
import org.eclipse.swt.layout.FillLayout;
    protected IDialogSettings getDialogBoundsSettings() {
                scriptText =
                Button hideDialogButton = UIUtils.createCheckbox(settingsComposite, "Do not show again",

public class SavePreviewDialog extends DetailsViewDialog {
            Button deleteCascadeCheck = UIUtils.createCheckbox(settingsComposite, "Delete cascade",

        createDetailsButton(parent);
import org.jkiss.utils.CommonUtils;
    }
                        scriptText;
        {
                    "");
import org.jkiss.dbeaver.ui.dialogs.DetailsViewDialog;
        if (saveReport.getDeletes() > 0)
        ((GridData) detailsButton.getLayoutData()).horizontalAlignment = GridData.BEGINNING;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetSaveReport;

            msgText.setText("You are about to save your changes into the database (" + viewer.getDataSource().getContainer().getName() + ").\n" +
        return previewFrame;
            settingsComposite.setLayoutData(gd);

import org.eclipse.swt.widgets.Control;
                    viewer.getDataSource(),


            Label msgText = new Label(msgComposite, SWT.NONE);
                if (script != null) {
    @Override
                    false);
                "Delete rows from all tables referencing this table by foreign keys", false, 1);

        return report + count + " " + info;


            String scriptText = "";
                "Delete cascade recursively (deep references)", false, 1);
        }
    }

        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
                List<DBEPersistAction> script = viewer.generateChangesScript(monitor, saveSettings);
        if (showCascadeSettings) {
import java.util.List;
        if (saveReport.getDeletes() > 0) {
import org.eclipse.swt.layout.GridData;
            changesReport = appendReportLine(changesReport, saveReport.getInserts(), "rows(s) added");
        previewFrame.setLayout(new FillLayout());
package org.jkiss.dbeaver.ui.controls.resultset.handler;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        previewFrame.setLayoutData(gd);
                DBWorkbench.getPlatformUI().showError("Can't create SQL panel", "Error creating SQL panel", e);


import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
                gd.grabExcessHorizontalSpace = true;
            UIUtils.runInProgressService(monitor -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {
 * you may not use this file except in compliance with the License.

                    serviceSQL.setSQLPanelText(sqlPanel, scriptText);
                    UINavigatorMessages.editors_entity_dialog_preview_title,
    }
        group.setLayout(new GridLayout(1, true));
    @Override
    }
        String changesReport = "";
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
import org.eclipse.jface.dialogs.IDialogSettings;

 * See the License for the specific language governing permissions and

        this.saveReport = saveReport;

            } catch (Exception e) {
        return null;//UIUtils.getDialogSettings(DIALOG_ID);
            SaveScriptDialog.createDeleteCascadeControls(messageGroup, saveSettings, useDeleteCascade, this::populateSQL);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
/*
                hideDialogButton.setLayoutData(gd);
            }
    @Override
                    previewFrame,
    @Override
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
    }
        }*/
        if (saveReport.getUpdates() > 0)
                UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);

                }
            }
        GridData gd = new GridData(GridData.FILL_BOTH);
        }
        //UIUtils.createHorizontalLine(messageGroup);

    }
                    SQLUtils.generateCommentLine(
 * limitations under the License.
                    sqlScript.addAll(script);
                scriptText = SQLUtils.generateScript(
    }
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
import org.jkiss.dbeaver.ui.UIUtils;
        }
            final List<DBEPersistAction> sqlScript = new ArrayList<>();
                }
            /*
 *
        this.showCascadeSettings = showCascadeSettings;
 *
                    viewer,
            try {
        }
        createButton(parent, IDialogConstants.OK_ID, UINavigatorMessages.dialog_filter_save_button, false);

            changesReport = appendReportLine(changesReport, saveReport.getUpdates(), "rows(s) changed");
    private static final String DIALOG_ID = "DBeaver.RSV.SavePreviewDialog";//$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");


                    "Do not show this dialog next time (you can re-enable this option in preferences/confirmations)", false, 1);
import org.eclipse.swt.SWT;
        messageGroup.setLayoutData(gd);
                    sqlScript.toArray(new DBEPersistAction[0]),
        Composite messageGroup = UIUtils.createComposite(composite, 1);
            if (!sqlScript.isEmpty()) {

            });
    private final ResultSetViewer viewer;
        Composite previewFrame = new Composite(group, SWT.BORDER);
            Button deleteDeepCascadeCheck = UIUtils.createCheckbox(settingsComposite, "Deep cascade",
        populateSQL();
        if (!report.isEmpty()) report += ", ";
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
}

    @Override
import org.eclipse.jface.dialogs.IDialogConstants;
                (CommonUtils.isEmpty(changesReport) ? "" : "\t" + changesReport + ".") + "\nAre you sure you want to proceed?");
        if (saveReport.getInserts() > 0)
    private static String appendReportLine(String report, int count, String info) {
    }
    private final ResultSetSaveReport saveReport;
            if (showCascadeSettings) UIUtils.createEmptyLabel(settingsComposite, 1, 1);
 * Unless required by applicable law or agreed to in writing, software
    public SavePreviewDialog(@NotNull ResultSetViewer viewer, boolean showCascadeSettings, @NotNull ResultSetSaveReport saveReport) {

            gd = new GridData(GridData.FILL_HORIZONTAL);
import org.eclipse.swt.layout.GridLayout;
                    true,
            Composite settingsComposite = UIUtils.createComposite(messageGroup, showCascadeSettings ? 2 : 1);
                        viewer.getDataSource(),
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBIcon;
                sqlPanel = serviceSQL.createSQLPanel(
        this.viewer = viewer;

        gd.minimumWidth = 400;
            boolean useDeleteCascade = saveReport.isHasReferences() && saveReport.getDeletes() > 0;
import java.util.ArrayList;
        super(viewer.getControl().getShell(), "Preview changes", DBIcon.STATUS_WARNING);
    private final boolean showCascadeSettings;
        return show ? "SQL >>" : "SQL <<";
                        "Auto-generated SQL script. Actual values for binary/complex data types may differ - what you see is the default string representation of values.") +
        this.saveSettings = new ResultSetSaveSettings();
    private Object sqlPanel;
        Composite group = new Composite(composite, SWT.NONE);
    }
import org.jkiss.code.NotNull;
import org.eclipse.swt.widgets.Composite;
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (serviceSQL != null) {

        } catch (Exception e) {
    private final ResultSetSaveSettings saveSettings;

import org.jkiss.dbeaver.model.sql.SQLUtils;
            gd.grabExcessHorizontalSpace = true;
import org.eclipse.swt.widgets.Label;
        gd.heightHint = 250;
    protected void createMessageArea(Composite composite) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
            Label imgLabel = new Label(msgComposite, SWT.NONE);
    private void populateSQL() {
            if (showCascadeSettings) {
    protected Control createDetailsContents(Composite composite) {
    public ResultSetSaveSettings getSaveSettings() {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetSaveSettings;
            DBWorkbench.getPlatformUI().showError("Can't generate SQL script", "Error generating SQL script from changes", e);
            changesReport = appendReportLine(changesReport, saveReport.getDeletes(), "rows(s) deleted");
            Composite msgComposite = UIUtils.createComposite(messageGroup, 2);
            }
        return saveSettings;


        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
                    viewer.getSite(),
    protected String getDetailsLabel(boolean show) {
 *

        if (serviceSQL != null) {
