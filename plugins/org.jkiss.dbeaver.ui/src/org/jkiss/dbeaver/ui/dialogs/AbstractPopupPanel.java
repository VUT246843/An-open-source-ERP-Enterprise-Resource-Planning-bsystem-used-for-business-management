    protected Point getInitialSize() {

        if (modeless) {

/**
            cancelPressed();


     */

        }
                }
                public void focusLost(FocusEvent e) {
public abstract class AbstractPopupPanel extends BaseDialog {
        } else {

            for (Control ctrl : controls) {
    }
 * DBeaver - Universal Database Manager
        return !modeless;
    @Override

            setShellStyle(SWT.RESIZE | (isShowTitle() ? (SWT.CLOSE | SWT.TITLE | SWT.MAX) : SWT.NONE));

    protected boolean isModeless() {
                    dialogData instanceof ErrorDialog
import org.eclipse.swt.graphics.Point;
                if (dialogData instanceof MessageBox ||
                    dialogData instanceof MessageBoxModern ||
    protected void configureShell(Shell newShell) {
    }
    {

    }
 * limitations under the License.
        }
    public void setModeless(boolean modeless) {
    }
    }
    }
        if (modeless) {
 * See the License for the specific language governing permissions and
        } else {
 *
        this.modeless = modeless;
    public int open() {
    @Override
        return popupOpen;
        shell.addShellListener(ShellListener.shellDeactivatedAdapter(e -> UIUtils.asyncExec(this::handleFocusLost)));
    private void handleFocusLost() {
import org.jkiss.code.NotNull;
        Point initialSize = super.getInitialSize();
 * Unless required by applicable law or agreed to in writing, software
                    ctrl.addFocusListener(focusListener);
        Shell shell = getShell();
            }
    @Override
                    dialogData instanceof BlockingPopupDialog ||
import org.eclipse.swt.SWT;
    /**
package org.jkiss.dbeaver.ui.dialogs;
    protected Control createContents(Composite parent) {
    protected boolean isShowTitle() {
        return true;
        return initialSize;
        }
        } finally {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                ) {

    }
        Rectangle maxBounds = Display.getCurrent().getBounds();
                    UIUtils.asyncExec(AbstractPopupPanel.this::handleFocusLost);
    }
    protected Control createButtonBar(@NotNull Composite parent) {

     *
 * SelectObjectDialog
            Control focusControl = shell.getDisplay().getFocusControl();
    @Override
import org.eclipse.jface.dialogs.ErrorDialog;
        }
    @Override
        return modeless;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        popupOpen = true;
 *
import org.eclipse.jface.dialogs.Dialog;
        }
/*
    protected boolean isResizable()
        super(parentShell, title, null);
 * @author Serge Rider
import org.eclipse.swt.widgets.*;
                }

        if (needsButtonBar()) {
    public static boolean isPopupOpen() {
        } else {
    protected void closeOnFocusLost(Control ... controls) {
 * You may obtain a copy of the License at
    @Override
        initialSize.x = Math.min(initialSize.x, maxBounds.width - maxBounds.width / 50);

        if (shell != null && !shell.isDisposed()) {
                cancelPressed();
                Object dialogData = focusControl.getShell().getData();
            return super.createButtonBar(parent);
 * you may not use this file except in compliance with the License.
        try {
        Dialog.applyDialogFont(contents);
import org.eclipse.swt.events.ShellListener;
            setShellStyle(SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL | SWT.MAX | SWT.RESIZE);
        Control contents = super.createContents(parent);
     * Installs a listener that will close the dialog if it loses focus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
            }
        super.configureShell(newShell);
            if (focusControl != null && !UIUtils.isParent(shell, focusControl)) {

    }

import org.eclipse.swt.graphics.Rectangle;
    protected void closeOnFocusLost(@NotNull Shell shell) {
    }
    }
    }
                if (ctrl != null) {
    protected AbstractPopupPanel(Shell parentShell, String title)
        return true;
    private static boolean popupOpen;
        return contents;
 *     http://www.apache.org/licenses/LICENSE-2.0

                    return;

import org.eclipse.swt.events.FocusEvent;
     * @param shell the shell to monitor
import org.jkiss.dbeaver.ui.UIUtils;
            popupOpen = false;
    }
    private boolean modeless;
 *
 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            FocusAdapter focusListener = new FocusAdapter() {

        newShell.setText(getTitle());
import org.eclipse.swt.events.FocusAdapter;
    protected boolean needsButtonBar() {
            return super.open();


            };
    }
                @Override
            return UIUtils.createPlaceholder(parent, 1);
    {
}
 */
