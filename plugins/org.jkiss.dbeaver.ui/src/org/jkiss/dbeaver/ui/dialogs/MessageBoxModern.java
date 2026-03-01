            }
        GridData gd = new GridData();
        super.handleShellCloseEvent();
            gd.grabExcessHorizontalSpace = true;
import org.eclipse.swt.layout.GridLayout;
        this.customButton = customButton;
import org.jkiss.dbeaver.ui.ShellUtils;
 * you may not use this file except in compliance with the License.

    private List<Button> buttons;
        GridLayout gl = new GridLayout(0, true);
        if (labels == null) {
                messageLink.addSelectionListener(new SelectionAdapter() {

        gl.marginWidth = 0;
                Label messageLabel = new Label(content, SWT.WRAP);


        }
import org.eclipse.swt.graphics.Point;
        GridData data = new GridData(GridData.FILL_BOTH);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.swt.SWT;
import java.util.function.Consumer;
                Link messageLink = new Link(content, SWT.WRAP);
 *
        gl.marginWidth = 0;
    }
    
        composite.setFont(parent.getFont());
            gd.minimumWidth = 1;
                });
        GridData gd = new GridData();
    @Override
import java.util.List;

    @Nullable
        gl.verticalSpacing = defaultSpacing.y;

            button.setFocus();
    protected void createButtonsForButtonBar(Composite parent) {
        }
        }
        gl.numColumns = 2;
        if (primaryImage != null) {
            gd.verticalAlignment = SWT.BEGINNING;
import org.eclipse.jface.layout.LayoutConstants;
 * Unless required by applicable law or agreed to in writing, software
        for (int i = 0; i < labels.size(); i++) {
        }

        dialogArea = createDialogArea(parent);
 * limitations under the License.
                    @Override
    // ----- jface.Dialog methods
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        parent.setLayoutData(gd);
                    public void widgetSelected(SelectionEvent e) {
 */
import org.eclipse.swt.widgets.*;
    protected Control createContents(Composite parent) {
                    }
        setReturnCode(SWT.DEFAULT);
        content.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.model.DBPImage;
 *
            buttons.add(createButton(parent, i, labels.get(i), defaultAnswerIdx == i));


        Point defaultSpacing = LayoutConstants.getSpacing();
            gd.minimumHeight = 1;
    private int defaultAnswerIdx;
        this.defaultAnswerIdx = defaultAnswerIdx;

    void setMessage(@Nullable String message) {
    protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
        return composite;
        this.message = message;
        return composite;
        close();
                messageLabel.setLayoutData(gd);
    private Consumer<? super Composite> customButton;
    MessageBoxModern(@Nullable Shell parentShell) {
    private String message;
        if (defaultButton) {
        buttonBar = createButtonBar(parent);

        this.primaryImage = primaryImage;
    protected Control createButtonBar(@NotNull Composite parent) {
        return button;
    }
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
            gd.minimumWidth = 1;
    protected Composite createDialogArea(Composite parent) {

 * distributed under the License is distributed on an "AS IS" BASIS,
        composite.setLayoutData(gd);
        gl.marginWidth = defaultMargins.x;
        gl.marginHeight = defaultMargins.y;
    }
        if (customButton != null) {
        gl.marginHeight = 0;
        parent.setLayout(gl);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.eclipse.swt.layout.GridData;
    }
            } else {
            return;
            gd.horizontalAlignment = SWT.FILL;
        gd.horizontalAlignment = SWT.END;
                messageLabel.setText(message);
    @Override
        }
 *
                        ShellUtils.launchProgram(e.text);
        gd.grabExcessVerticalSpace = true;
        initializeDialogUnits(parent);
 * You may obtain a copy of the License at
    private List<String> labels;
        setReturnCode(buttonId);
    }
    }
        if (message != null) {
            GridData gd = new GridData();
import org.eclipse.swt.events.SelectionAdapter;
    @Override
            customButton.accept(composite);
        Button button = super.createButton(parent, id, label, defaultButton);
        }
            gd.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        gl.marginHeight = 0;
    private DBPImage primaryImage;
    void setCustomButton(@NotNull Consumer<? super Composite> customButton) {
    @Nullable
        gd.grabExcessHorizontalSpace = true;
    void setPrimaryImage(@NotNull DBPImage primaryImage) {
    }
        this.customArea = customArea;

    @Override
    }
    }
/*
        super(parentShell, null, null);
import org.jkiss.dbeaver.ui.UIUtils;

    @Nullable
            Control imageLabel = UIUtils.createLabel(parent, primaryImage);

            UIUtils.createEmptyLabel(content, 1, 1);
        if (buttons != null && CommonUtils.isValidIndex(index, buttons.size())) {
            return buttons.get(index);
            customArea.accept(content);
import org.jkiss.utils.CommonUtils;
        }
    @Nullable

    @Nullable
import org.eclipse.jface.dialogs.IDialogConstants;
    protected Button getButton(int index) {
package org.jkiss.dbeaver.ui.dialogs;
    }
        Point defaultMargins = LayoutConstants.getMargins();
                messageLink.setLayoutData(gd);
            imageLabel.setLayoutData(gd);
    void setCustomArea(Consumer<? super Composite> customArea) {
import java.util.ArrayList;

 * DBeaver - Universal Database Manager

                messageLink.setText(message);
        gd.horizontalSpan = 2;
            if (message.contains("</a>")) {
        buttons = new ArrayList<>(labels.size());
    }
}
        Composite composite = UIUtils.createComposite(parent, 1);
        applyDialogFont(parent);

import org.eclipse.swt.events.SelectionEvent;
    @Override
        this.labels = labels;
            gd.minimumHeight = 1;

final class MessageBoxModern extends BaseDialog {
    @Override
            gd.horizontalAlignment = SWT.CENTER;
        Composite composite = new Composite(parent, SWT.NONE);
        return null;
        Composite content = UIUtils.createComposite(parent, 1);
        GridLayout gl = new GridLayout();
        // create the top level composite for the dialog area
        }
    @Nullable

    void setDefaultAnswerIdx(int defaultAnswerIdx) {
            gd.verticalAlignment = SWT.BEGINNING;
        createButtonsForButtonBar(composite);

    }

    @Nullable
        composite.setLayoutData(data);
    private Consumer<? super Composite> customArea;
            GridData gd = new GridData();
        if (customArea != null) {
    }
        data.horizontalSpan = 2;
        gl.horizontalSpacing = defaultSpacing.x * 2;
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
    protected void handleShellCloseEvent() {
    protected void buttonPressed(int buttonId) {
    }
        composite.setLayout(gl);
        return parent;
    void setLabels(@NotNull List<String> labels) {
