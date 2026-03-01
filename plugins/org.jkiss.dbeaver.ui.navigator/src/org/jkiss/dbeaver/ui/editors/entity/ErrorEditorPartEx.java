 */
    }

            detailsArea.layout(true);
        buttonParent.setLayout(buttonsLayout);
        throwable.printStackTrace(pwriter);
            case IStatus.WARNING:
        layout.marginBottom = margins;
        setSite(site);
    public void doSave(IProgressMonitor monitor) {
 * ErrorEditorPartEx

        });
    }
    }
        int spacing = 8;
        if (error.getException() != null) {
        Label imageLabel = new Label(parent, SWT.NONE);
        buttonsLayout.marginHeight = 0;
            public void widgetSelected(SelectionEvent e) {
        buttonsLayout.numColumns = 2;
    }

                updateDetailsText();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                image = DBeaverIcons.getImage(DBIcon.STATUS_INFO);

 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isSaveAsAllowed() {
                break;

/**
        return false;
import org.eclipse.swt.widgets.*;
        }
        StringWriter swriter = new StringWriter();

    private void updateDetailsText() {
    public ErrorEditorPartEx(IStatus error) {

            details.dispose();
                SWT.COLOR_LIST_BACKGROUND));

import org.eclipse.core.runtime.IStatus;
        pwriter.close();
            }
import org.eclipse.core.runtime.IProgressMonitor;
        switch (error.getSeverity()) {
        imageLabel.setBackground(bgColor);
    }
        detailsArea.setLayoutData(data);
        layout.marginTop = margins;
        parent.layout(true);
import org.eclipse.swt.events.SelectionEvent;

        detailsArea.setForeground(fgColor);
                image = DBeaverIcons.getImage(DBIcon.STATUS_WARNING);

        this.parentControl = parent;
        layout.marginRight = margins;
    private void createErrorPane(final Composite parent) {

        setInput(input);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (error != null) {
import org.eclipse.swt.layout.FillLayout;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * distributed under the License is distributed on an "AS IS" BASIS,
        updateDetailsText();

    boolean showingDetails = false;
        Color bgColor = parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
    }
            details = null;
 * limitations under the License.

import org.eclipse.jface.dialogs.IDialogConstants;
        Text text = new Text(parent, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP);
    }
        layout.verticalSpacing = spacing;
            details = detailsText;
    }
 * you may not use this file except in compliance with the License.
    public void setPartName(String newName) {
        text.setBackground(bgColor);
            detailsText.setBackground(detailsText.getDisplay().getSystemColor(
        data.horizontalSpan = 3;
        detailsButton = new Button(buttonParent, SWT.PUSH);

    private IStatus error;

    public void init(IEditorSite site, IEditorInput input) {
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
/*
    private Button detailsButton;
    }
        Composite buttonParent = new Composite(parent, SWT.NONE);
    public void doSaveAs() {
            createErrorPane(parent);



import org.eclipse.swt.events.SelectionAdapter;
                break;
        GridData data = new GridData(GridData.FILL_BOTH);
        data.verticalSpan = 1;
        int margins = 8;
        if (details != null) {
        pwriter.flush();
    public boolean isDirty() {
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.dispose();
        GridLayout layout = new GridLayout();

                image = DBeaverIcons.getImage(DBIcon.STATUS_ERROR);

 *
        return GeneralUtils.getStatusText(error);

 * See the License for the specific language governing permissions and
        text.setForeground(fgColor);
        super.setPartName(newName);
    private Control details = null;
    private String getStackTrace(Throwable throwable) {
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IEditorInput;
    public void createPartControl(Composite parent) {


    private String getDetails() {
import org.jkiss.dbeaver.model.DBIcon;
            return getStackTrace(error.getException());
        } else {
package org.jkiss.dbeaver.ui.editors.entity;
        layout.horizontalSpacing = spacing;
public class ErrorEditorPartEx extends EditorPart {
            detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);

import org.eclipse.ui.part.EditorPart;
 *
            case IStatus.ERROR:
        setPartName(input.getName());
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridData;

        image.setBackground(bgColor);
    private Composite parentControl;
                showingDetails = !showingDetails;
        parentControl = null;
        parentControl.setFocus();
        text.setText(error.getMessage());
        return false;
 * DBeaver - Universal Database Manager

import org.eclipse.swt.layout.GridLayout;
    }
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

    }
        detailsButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, false, false));
        buttonsLayout.horizontalSpacing = 0;
        if (showingDetails) {
import org.eclipse.swt.SWT;

                break;
 */
        parent.setLayout(layout);


        }
    private Composite detailsArea;
            default:


            detailsText.setText(getDetails());
import java.io.StringWriter;
            detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
        layout.numColumns = 3;
}
        detailsButton.addSelectionListener(new SelectionAdapter() {
        return swriter.toString();
        buttonParent.setBackground(parent.getBackground());
import java.io.PrintWriter;
        parent.setForeground(fgColor);

        }
import org.eclipse.swt.graphics.Color;
        detailsArea = new Composite(parent, SWT.NONE);
    }
 * Unless required by applicable law or agreed to in writing, software
        }
        layout.marginLeft = margins;
        parent.setBackground(bgColor);
        PrintWriter pwriter = new PrintWriter(swriter);
            Text detailsText = new Text(detailsArea, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI | SWT.READ_ONLY | SWT.LEFT_TO_RIGHT);
    private static final String LOG_VIEW_ID = "org.eclipse.pde.runtime.LogView"; //$NON-NLS-1$
        imageLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_BEGINNING));
        this.error = error;
        detailsArea.setLayout(new FillLayout());
import org.eclipse.swt.graphics.Image;
    public void dispose() {
        GridLayout buttonsLayout = new GridLayout();
        imageLabel.setImage(image);

        detailsArea.setBackground(bgColor);
    }
        Display d = Display.getCurrent();
        Image image;
        buttonsLayout.marginWidth = 0;

    public void setFocus() {
        Color fgColor = parent.getDisplay().getSystemColor(SWT.COLOR_LIST_FOREGROUND);
