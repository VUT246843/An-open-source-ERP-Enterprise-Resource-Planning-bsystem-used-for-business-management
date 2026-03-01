import org.eclipse.jface.dialogs.IDialogConstants;
        future.cancel(false);
public class CodeAuthDialog extends Dialog implements BlockingPopupDialog {
            ShellUtils.launchProgram(browserUrl.toString());
        this.browserUrl = browserUrl;
            .layoutData(GridDataFactory.fillDefaults().grab(true, false).create())

            .create(composite);
 * A simple dialog showing the browser url of the authorization page and the code the user is supposed to enter there.
            .onSelect(e -> ShellUtils.launchProgram(browserUrl.toString()))
import java.util.concurrent.Future;
 * You may obtain a copy of the License at
        @NotNull String userCode,
        @NotNull Shell shell,
 * distributed under the License is distributed on an "AS IS" BASIS,
            .font(JFaceResources.getFont(JFaceResources.HEADER_FONT))
 * limitations under the License.

    protected Control createDialogArea(Composite parent) {
    private final String userCode;
package org.jkiss.dbeaver.ui.dialogs;

        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);

            .create(composite);
 * Licensed under the Apache License, Version 2.0 (the "License");
        Text userCodeText = TextFactory.newText(SWT.READ_ONLY | SWT.CENTER)
 *
        userCodeText.addFocusListener(FocusListener.focusGainedAdapter(e -> userCodeText.selectAll()));
import org.eclipse.swt.widgets.Control;
        @NotNull URI browserUrl,
import org.eclipse.jface.widgets.LinkFactory;
import org.eclipse.jface.widgets.TextFactory;
        userCodeText.setFocus();
 * you may not use this file except in compliance with the License.
        @NotNull Future<Void> future
            UIUtils.setClipboardContents(getShell().getDisplay(), TextTransfer.getInstance(), userCode);
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.future = future;
import org.eclipse.swt.widgets.Composite;

    private final Future<Void> future;

            .create(composite);
    protected void cancelPressed() {

 *
        Composite composite = (Composite) super.createDialogArea(parent);
import org.eclipse.swt.events.FocusListener;

/*
            .layoutData(GridDataFactory.fillDefaults().grab(true, false).create())
import org.eclipse.jface.resource.JFaceResources;
import java.net.URI;
import org.eclipse.jface.widgets.LabelFactory;

 *
import org.eclipse.swt.widgets.Shell;
 */
            .create(composite);
        super(shell);
            .layoutData(GridDataFactory.fillDefaults().grab(true, false).create())
            .text(UIMessages.dialog_auth_code_code_label)
/**
        LabelFactory.newLabel(SWT.WRAP)
 * DBeaver - Universal Database Manager
            .text(userCode)
    ) {
        LinkFactory.newLink(SWT.NONE)
        this.userCode = userCode;
        createButton(parent, IDialogConstants.OPEN_ID, UIMessages.dialog_auth_code_copy_and_open_label, true);
    public CodeAuthDialog(
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        super.cancelPressed();
import org.jkiss.code.NotNull;
    @Override
import org.eclipse.swt.dnd.TextTransfer;
    }
        } else {
import org.eclipse.jface.dialogs.Dialog;
            .text(UIMessages.dialog_auth_code_browser_label)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



        }
        LabelFactory.newLabel(SWT.WRAP)
 */
import org.eclipse.swt.events.MouseListener;


}
    private final URI browserUrl;
            .text("<a>" + browserUrl + "</a>")
    @Override
        setShellStyle(SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
import org.eclipse.swt.widgets.Text;
            super.buttonPressed(buttonId);
import org.eclipse.jface.layout.GridDataFactory;
        UIUtils.asyncExec(() -> composite.layout(true, true));
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return composite;

    }
    protected void buttonPressed(int buttonId) {
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
import org.eclipse.swt.SWT;
        userCodeText.addMouseListener(MouseListener.mouseUpAdapter(e -> userCodeText.selectAll()));
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.internal.UIMessages;


        if (buttonId == IDialogConstants.OPEN_ID) {
        getShell().setText(UIMessages.dialog_auth_code_title);
import org.jkiss.dbeaver.ui.ShellUtils;
 * Unless required by applicable law or agreed to in writing, software
