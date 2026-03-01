        } else {
        detailsIcon.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.events.SelectionEvent;
        };
            if (errorList.isEmpty()) {
    public StatusLabel(@NotNull Composite parent, int style, @Nullable final IResultSetController viewer) {
            @Override


        if (statusIcon != null) {


/*
    }
        layout.horizontalSpacing = 3;
        super(parent);
            case WARNING -> DBIcon.SMALL_WARNING;
    public String getMessage() {
            }
            return;
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;

import org.eclipse.swt.events.SelectionAdapter;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return statusText.getText();
        }
    }
import org.eclipse.swt.widgets.ToolBar;

 * you may not use this file except in compliance with the License.
 *
        final ToolBar tb = new ToolBar(this, SWT.FLAT | SWT.HORIZONTAL);
            }
        statusText.addMouseListener(new MouseAdapter() {
import org.eclipse.swt.widgets.Label;

            default -> null;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                viewer.getSite().getShell(),
        if (statusText.isDisposed()) {
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        final GridLayout layout = new GridLayout(3, false);
        }
        });

            message = "???"; //$NON-NLS-1$
import org.eclipse.swt.events.MouseAdapter;
            detailsIcon.setImage(DBeaverIcons.getImage(UIIcon.DOTS_BUTTON));
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.viewer = viewer;
        setLayout(layout);
        this.statusText.setToolTipText(message);
        }
    protected void showDetails() {
import java.util.Collections;

import org.jkiss.dbeaver.model.DBIcon;

 * limitations under the License.
        DBDDataReceiver dataReceiver = viewer.getDataReceiver();
        }
        } else {
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

    }
    }
        layout.marginWidth = 2;
            dialog.open();
 * Status label
import org.eclipse.swt.layout.GridData;
                errorList

    private final IResultSetController viewer;
    }
import org.jkiss.dbeaver.ui.UIUtils;

 */
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.events.MouseEvent;

import org.jkiss.dbeaver.model.data.DBDDataReceiver;
    public void setStatus(String message) {
                if (viewer.getModel().getStatistics() != null && viewer.getModel().getStatistics().getError() != null) {
            );
/**
 * See the License for the specific language governing permissions and
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
import org.jkiss.code.Nullable;
import org.eclipse.swt.widgets.Composite;
    public DBPMessageType getMessageType() {
            statusText.setToolTipText(null);
                }
    private final Label statusText;
import org.eclipse.swt.layout.GridLayout;
                    errorList = Collections.singletonList(viewer.getModel().getStatistics().getError());
                showDetails();
        tb.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
}
        if (message == null) {
                getMessage(),
    }

        statusText.setText(CommonUtils.getSingleLineString(message));
    public void setUpdateListener(Runnable runnable) {
        DBIcon statusIcon = switch (messageType) {
 * DBeaver - Universal Database Manager
 */
    private DBPMessageType messageType;
        statusText.setLayoutData(gd);
        CSSUtils.markConnectionTypeColor(statusText);

            List<Throwable> errorList = rsdr.getErrorList();
        });
        if (viewer != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (dataReceiver instanceof ResultSetDataReceiver rsdr) {
import org.eclipse.swt.widgets.ToolItem;
            public void widgetSelected(SelectionEvent e) {
class StatusLabel extends ConComposite {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.SWT;
        return messageType;
        statusText = new Label(this, SWT.NONE);
            @Override
        this.messageType = messageType;
    private final ToolItem detailsIcon;
            TextEditorUtils.enableHostEditorKeyBindingsSupport(viewer.getSite(), this.statusText);
        if (messageType != DBPMessageType.INFORMATION) {
import org.jkiss.dbeaver.ui.ConComposite;
        }
            statusText.setToolTipText(message);
import org.jkiss.dbeaver.ui.css.CSSUtils;
    public void setStatusTooltip(String message) {
            }
import org.jkiss.utils.CommonUtils;
    }
            StatusDetailsDialog dialog = new StatusDetailsDialog(
            UIUtils.addDefaultEditActionsSupport(viewer.getSite(), this.statusText);
import org.jkiss.dbeaver.ui.UIIcon;

        detailsIcon.setImage(DBeaverIcons.getImage(UIIcon.DOTS_BUTTON));
    public void setStatus(String message, DBPMessageType messageType) {
import org.jkiss.dbeaver.model.DBPMessageType;
        this.setStatus(message, DBPMessageType.INFORMATION);
            detailsIcon.setImage(DBeaverIcons.getImage(statusIcon));

            case ERROR -> DBIcon.SMALL_ERROR;
 *
                showDetails();
        detailsIcon = new ToolItem(tb, SWT.NONE);

            public void mouseDoubleClick(MouseEvent e) {

        layout.marginHeight = 0;
package org.jkiss.dbeaver.ui.controls.resultset;
        }
