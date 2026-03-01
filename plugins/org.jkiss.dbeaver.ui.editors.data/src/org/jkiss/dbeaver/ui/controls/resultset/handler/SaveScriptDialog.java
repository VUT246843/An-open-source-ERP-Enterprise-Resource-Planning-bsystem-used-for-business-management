    }
                DBWorkbench.getPlatformUI().showError("Can't create SQL panel", "Error creating SQL panel", e);
                }
        return null;//UIUtils.getDialogSettings(DIALOG_ID);
                    viewer.getSite(),
    protected String getDetailsLabel(boolean show) {

        return report + count + " " + info;
 *
import java.text.SimpleDateFormat;
        if (!report.isEmpty()) report += ", ";
        super(viewer.getControl().getShell(), ResultSetMessages.dialog_save_script_title, DBIcon.TREE_SCRIPT);
 *
    protected Composite createDialogArea(Composite parent) {
import org.eclipse.swt.events.SelectionEvent;
                    settingsRefreshHandler.run();
            scriptText = "";
                    sqlContainer,
            deleteCascadeCheck.setEnabled(false);
                    } else {
                }
            }
                @Override
        Composite messageGroup,
                        settings.setDeepCascade(true);
            public void widgetSelected(SelectionEvent e) {
                UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    }
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetSaveReport;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
    @Override
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    protected void buttonPressed(int buttonId) {
        return messageGroup;
 */
        } else {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            deleteDeepCascadeCheck.setEnabled(false);
 * Unless required by applicable law or agreed to in writing, software
                @Override
                scriptText =
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetSaveSettings;
        if (buttonId == IDialogConstants.DETAILS_ID) {

                    SQLUtils.generateCommentLine(
                        scriptText;
    }
            gd.widthHint = 500;
                List<DBEPersistAction> script = viewer.generateChangesScript(monitor, saveSettings);
import org.eclipse.jface.layout.GridLayoutFactory;
        Group settingsComposite = new Group(messageGroup, SWT.NONE);
    private ResultSetViewer viewer;
                        settings.setDeleteCascade(true);
        gd.minimumWidth = 400;
        return saveSettings;

            UIUtils.runInProgressService(monitor -> {
import org.eclipse.swt.widgets.Group;
            ResultSetMessages.dialog_save_script_button_delete_cascade,
    }
    public static void createDeleteCascadeControls(

        createButton(parent, IDialogConstants.DETAILS_ID, ResultSetMessages.dialog_save_script_button_bar_button_copy, false);
            DBWorkbench.getPlatformUI().showError("Can't generate SQL script", "Error generating SQL script from data changes", e);
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;

 * You may obtain a copy of the License at
        populateSQL();
import org.eclipse.jface.dialogs.IDialogSettings;
        this.viewer = viewer;
            sqlContainer.setLayout(new FillLayout());
    }
        Button useFQNamesCheck = UIUtils.createCheckbox(settingsComposite,
        boolean enableControls,


                    }

 * you may not use this file except in compliance with the License.
            ResultSetMessages.dialog_save_script_button_delete_cascade_tip, settings.isDeleteCascade(), 1);
import org.eclipse.swt.widgets.Button;

    private void populateSQL() {
    private ResultSetSaveReport saveReport;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.eclipse.swt.layout.GridData;
                    UINavigatorMessages.editors_entity_dialog_preview_title,
                        settings.setDeepCascade(false);
    }
import org.jkiss.code.NotNull;
            // TODO: implement deep cascade
                    false);
            super.buttonPressed(IDialogConstants.CANCEL_ID);
            });
            ResultSetMessages.dialog_save_script_button_use_qualified_names,
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
            ResultSetMessages.dialog_save_script_button_use_qualified_names_tip, settings.isUseFullyQualifiedNames(), 1);
            final List<DBEPersistAction> sqlScript = new ArrayList<>();

            }
                    "");
                    viewer,

            if (!sqlScript.isEmpty()) {
        ResultSetSaveSettings settings,
                }
package org.jkiss.dbeaver.ui.controls.resultset.handler;
                    if (deleteCascadeCheck.getSelection()) {
                    serviceSQL.setSQLPanelText(sqlPanel, scriptText);
        super.buttonPressed(buttonId);
}
                settingsRefreshHandler.run();
                sqlPanel = serviceSQL.createSQLPanel(

    @Override
            });
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.swt.events.SelectionAdapter;
                    sqlScript.addAll(script);
    private Object sqlPanel;
    }

 *
    SaveScriptDialog(ResultSetViewer viewer, ResultSetSaveReport saveReport) {
                    true,
    }
            }
import java.util.Date;
import java.util.ArrayList;

                    sqlScript.toArray(new DBEPersistAction[0]),
 * limitations under the License.
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CLOSE_LABEL, true);

        Runnable settingsRefreshHandler)
        }
                        settings.setDeepCascade(false);
        boolean useDeleteCascade = saveReport.isHasReferences() && saveReport.getDeletes() > 0;
        if (!enableControls) {
        Button deleteDeepCascadeCheck = UIUtils.createCheckbox(settingsComposite,

        messageGroup.setLayoutData(gd);
        Composite messageGroup = super.createDialogArea(parent);
        createDeleteCascadeControls(messageGroup, saveSettings, useDeleteCascade, this::populateSQL);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBIcon;
import org.eclipse.jface.dialogs.IDialogConstants;
                }
        useFQNamesCheck.addSelectionListener(new SelectionAdapter() {
        });


import org.eclipse.jface.layout.GridDataFactory;
                    } else {
    private static final String DIALOG_ID = "DBeaver.RSV.SaveScriptDialog";//$NON-NLS-1$
                    viewer.getDataSource(),
            Composite sqlContainer = new Composite(messageGroup, SWT.BORDER);
        this.saveReport = saveReport;
        try {
            ResultSetMessages.dialog_save_script_button_delete_deep_cascade_tip, settings.isDeepCascade(), 1);
                    settingsRefreshHandler.run();
        if (serviceSQL != null) {
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.swt.widgets.Composite;
        this.saveSettings = new ResultSetSaveSettings();
                        settings.setDeleteCascade(true);
    protected IDialogSettings getDialogBoundsSettings() {
        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
import java.util.List;
            ResultSetMessages.dialog_save_script_button_delete_deep_cascade,
                        "Auto-generated SQL script #" + new SimpleDateFormat(GeneralUtils.DEFAULT_TIMESTAMP_PATTERN).format(new Date())) +
            deleteDeepCascadeCheck.setEnabled(false);
        return show ? "SQL >>" : "SQL <<";
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.eclipse.swt.SWT;
        } catch (Exception e) {
                    if (deleteDeepCascadeCheck.getSelection()) {
            @Override

    @Override
    }
            } catch (Exception e) {
class SaveScriptDialog extends BaseDialog {
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
            try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            sqlContainer.setLayoutData(gd);
 * Licensed under the Apache License, Version 2.0 (the "License");
                public void widgetSelected(SelectionEvent e) {
 * See the License for the specific language governing permissions and
    @Override
        createButton(parent, IDialogConstants.OK_ID, ResultSetMessages.dialog_save_script_button_bar_button_execute, false);
                scriptText = SQLUtils.generateScript(
        }
                if (serviceSQL != null) {
import org.eclipse.swt.layout.FillLayout;
        Button deleteCascadeCheck = UIUtils.createCheckbox(settingsComposite,
import org.jkiss.dbeaver.ui.UIUtils;

            deleteDeepCascadeCheck.addSelectionListener(new SelectionAdapter() {
        }
        settingsComposite.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());
                        settings.setDeleteCascade(false);
            ResultSetUtils.copyToClipboard(scriptText);
                    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
    private static String appendReportLine(String report, int count, String info) {
                        deleteCascadeCheck.setSelection(true);
        settingsComposite.setText(ResultSetMessages.dialog_save_script_settings_title);
            gd.heightHint = 400;
        GridData gd = new GridData(GridData.FILL_BOTH);

                settings.setUseFullyQualifiedNames(useFQNamesCheck.getSelection());
            });
            deleteCascadeCheck.addSelectionListener(new SelectionAdapter() {
                        viewer.getDataSource(),
        settingsComposite.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
    private String scriptText;
        }

    private ResultSetSaveSettings saveSettings;

            gd = new GridData(GridData.FILL_BOTH);
    public ResultSetSaveSettings getSaveSettings() {
                public void widgetSelected(SelectionEvent e) {
                        deleteDeepCascadeCheck.setSelection(false);
                if (script != null) {
