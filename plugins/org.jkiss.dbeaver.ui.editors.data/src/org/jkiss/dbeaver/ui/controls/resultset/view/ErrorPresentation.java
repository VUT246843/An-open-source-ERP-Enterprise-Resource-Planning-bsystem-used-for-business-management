    @Override
            TextTransfer.getInstance(),
        for (Control child : parent.getChildren()) {

import org.eclipse.swt.custom.StyledText;
                textWidget.setText(sqlText);
import org.eclipse.jface.dialogs.IDialogSettings;
        return null;
/*
    public void updateValueView() {
import org.jkiss.code.Nullable;
    ) {
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
    }


 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private StyledText textWidget;
import org.eclipse.swt.widgets.Label;
                widthSet = true;
}
    public void changeMode(boolean recordMode) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.dnd.TextTransfer;
    }
        return textWidget;
        this.resultSetContainer = resultSetContainer;

        sqlPanel.setLayout(new FillLayout());
        textWidget = new StyledText(msgComposite, SWT.READ_ONLY | SWT.BORDER | SWT.MULTI | SWT.WRAP);
    private void createErrorPanel(@NotNull IResultSetController controller, @NotNull Composite parent) {
    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
            CommonUtils.notEmpty(status.getMessage()));
            boolean widthSet = false;
        return Collections.singletonMap(
import org.eclipse.swt.widgets.Control;
    @NotNull

            }
import org.eclipse.core.runtime.IStatus;
        if (messageException != null) {
        textWidget.setMargins(5, 5, 5, 5);
                textWidget = new StyledText(sqlPanel, SWT.BORDER | SWT.READ_ONLY);
            createMessagePanel(controller, parent, messageException);
import org.jkiss.dbeaver.ui.controls.resultset.*;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Control getControl() {
        // Enable key bindings
                if (editorPanel instanceof TextViewer) {
                    textWidget = ((TextViewer) editorPanel).getTextWidget();
    }

    public void dispose() {
                partDivider.setWeights(700, 300);
    @Override
    public void formatData(boolean refreshData) {
            String errorWidth = viewSettings.get(PROP_ERROR_WIDTH);
    public void clearMetaData() {
        enableHostEditingFor(controller, parent);

    private Object editorPanel;
        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    @Override
    }
                viewSettings.put(PROP_ERROR_WIDTH, weights[0] + ":" + weights[1]);
        partDivider.setLayoutData(new GridData(GridData.FILL_BOTH));

        Label imageLabel = new Label(msgComposite, SWT.NONE);
    public void createPresentation(@NotNull IResultSetController controller, @NotNull Composite parent) {
    private static void enableHostEditingFor(@NotNull IResultSetController controller, @NotNull Composite parent) {
    }
import org.jkiss.dbeaver.model.DBIcon;


        }
            if (!widthSet) {
        Throwable exception = status.getException();
    private void createMessagePanel(
        msgComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
            });
        if (REMEBER_SASH_RATIO) {
        errorComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
            }
package org.jkiss.dbeaver.ui.controls.resultset.view;
 *
    @Override
        } else {
        textWidget.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.runtime.DBWorkbench;

 * DBeaver - Universal Database Manager
    @Override
    @Override

import org.jkiss.utils.CommonUtils;

        textWidget.setText(CommonUtils.toString(messageException.getMessage(), "N/A"));
 * limitations under the License.

import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
import org.jkiss.dbeaver.model.exec.DBCMessageException;

        @NotNull IResultSetController controller,
    @Override
                TextEditorUtils.enableHostEditorKeyBindingsSupport(controller.getSite(), child);
        super.createPresentation(controller, parent);
import org.eclipse.swt.layout.GridData;
        super.dispose();
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.swt.widgets.Composite;
            if (child instanceof Text || child instanceof StyledText) {

import org.eclipse.swt.SWT;
            if (errorWidth != null) {
    }
        new ErrorDetailsPart(errorComposite, status, resultSetContainer);
 */


                editorPanel = serviceSQL.createSQLPanel(controller.getSite(), sqlPanel, controller, "SQL", true, sqlText);
                int[] weights = partDivider.getWeights();
import org.jkiss.dbeaver.ui.DBeaverIcons;
        this.sqlText = sqlText;

        }
 * You may obtain a copy of the License at

            try {

        }
    @Nullable
        }
                    partDivider.setWeights(Integer.parseInt(widthStrs[0]), Integer.parseInt(widthStrs[1]));
                }
 * Error message presentation.
    @Override

    }
            IDialogSettings viewSettings = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_ERROR_PANEL);
    private static final String SETTINGS_SECTION_ERROR_PANEL = ErrorPresentation.class.getSimpleName();
import org.eclipse.swt.layout.FillLayout;
    private static final String PROP_ERROR_WIDTH = "errorWidth";
    }
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
                }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBCMessageException messageException

        imageLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_BEGINNING));
                String[] widthStrs = errorWidth.split(":");
            } catch (DBException e) {
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
        this.status = status;


import org.eclipse.swt.dnd.Transfer;

    private static final boolean REMEBER_SASH_RATIO = false;
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    }
import java.util.Map;
    public ErrorPresentation(String sqlText, IStatus status, @NotNull IResultSetContainer resultSetContainer) {
    }

        DBCMessageException messageException = GeneralUtils.findNestedException(exception, DBCMessageException.class);
        Composite sqlPanel = UIUtils.createComposite(partDivider, 1);

        msgComposite.setLayout(layout);

        CustomSashForm partDivider = UIUtils.createPartDivider(controller.getSite().getPart(), parent, SWT.HORIZONTAL);
        GridLayout layout = new GridLayout(2, false);
        @NotNull Composite parent,
    }

    private final IResultSetContainer resultSetContainer;
import org.eclipse.swt.widgets.Text;
    }
            partDivider.addCustomSashFormListener((firstControlWeight, secondControlWeight) -> {
        Composite msgComposite = new Composite(parent, SWT.NONE);
                if (widthStrs.length == 2) {
    }
 */
 * you may not use this file except in compliance with the License.

    @Override
    public DBDAttributeBinding getCurrentAttribute() {
        imageLabel.setImage(DBeaverIcons.getImage(DBIcon.STATUS_INFO));
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    private final IStatus status;
                enableHostEditingFor(controller, composite);

            }
        Composite errorComposite = UIUtils.createComposite(partDivider, 1);
        if (serviceSQL != null) {
import org.eclipse.swt.layout.GridLayout;
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {
public class ErrorPresentation extends AbstractPresentation {
import java.util.Collections;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String sqlText;
 * See the License for the specific language governing permissions and

import org.eclipse.jface.text.TextViewer;
/**
            createErrorPanel(controller, parent);
            } else if (child instanceof Composite composite) {
