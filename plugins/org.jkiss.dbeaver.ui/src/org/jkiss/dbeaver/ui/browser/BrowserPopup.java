            gd.widthHint = 600;
    }
        composite.setLayoutData(gd);
        BrowserPopup browser = browserRegistry.get(id);
            browser = new Browser(composite, SWT.NONE);
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
            gd.heightHint = 500;
    public static BrowserPopup openBrowser(@NotNull String id, @NotNull URL url) {
    private Browser browser;
    private final String id;
    @Override
        } catch (SWTError e) {
import org.eclipse.swt.SWT;
 * distributed under the License is distributed on an "AS IS" BASIS,

        Composite composite = UIUtils.createComposite(parent, 1);
            browserPopup.open();
import org.eclipse.swt.SWTError;
        gd.heightHint = 500;
            gd = new GridData(GridData.FILL_BOTH);
    }
        createButton(parent, IDialogConstants.DETAILS_ID, UIMessages.popup_open_browser_open_external_browser, false);
import java.net.URL;
 *     http://www.apache.org/licenses/LICENSE-2.0
            BrowserPopup browserPopup = new BrowserPopup(UIUtils.getActiveShell(), id, url);

    protected void buttonPressed(int buttonId) {

        this.url = url;

        return super.close();
import org.jkiss.dbeaver.ui.internal.UIMessages;
        } else {
        browserRegistry.remove(id);
        super(parentShell, "Browser");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setModeless(false);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
        return composite;
 *
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
            close();

            return browser;
            return browserPopup;
        super.buttonPressed(buttonId);
    }
        if (browser != null && !browser.getContents().isDisposed()) {
 *
            browser.browser.setUrl(url.toString());
import org.eclipse.jface.dialogs.IDialogConstants;
 * limitations under the License.
        gd.widthHint = 800;
        setShellStyle(SWT.CLOSE | SWT.MAX | SWT.TITLE | SWT.BORDER | SWT.RESIZE);
import java.util.Map;
    }
    }
/*
    private BrowserPopup(@NotNull Shell parentShell, @NotNull String id, @NotNull URL url) {
 */
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridData;
import org.jkiss.code.NotNull;
        this.id = id;
    public boolean close() {
        GridData gd = new GridData(GridData.FILL_BOTH);

    @Override
import org.eclipse.swt.browser.Browser;
    @Override
    private static final Map<String, BrowserPopup> browserRegistry = new HashMap<>();
import org.eclipse.swt.widgets.Composite;
 *
    @Override
public class BrowserPopup extends AbstractPopupPanel {
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;

 * See the License for the specific language governing permissions and
    private final URL url;
            log.error("Could not instantiate Browser", e);
    private static final Log log = Log.getLog(BrowserPopup.class);
 * you may not use this file except in compliance with the License.
        }
    protected Composite createDialogArea(Composite parent) {
            browserRegistry.put(id, this);
import java.util.HashMap;
        try {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.ShellUtils;
package org.jkiss.dbeaver.ui.browser;
        }
            ShellUtils.launchProgram(url.toString());
            browser.setUrl(url.toString());
        }
}
            browser.setLayoutData(gd);
 * Unless required by applicable law or agreed to in writing, software

        if (buttonId == IDialogConstants.DETAILS_ID) {
