import org.jkiss.utils.BeanUtils;
                browser.dispose();
            shell.dispose();
import org.eclipse.swt.widgets.Shell;
    public void run(DBRProgressMonitor monitor) {
    }
                new Object[]{browser}
    // BUG: Fragment can't be resolved correctly by our Intellij IDEA workspace generator
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } finally {
 * Unless required by applicable law or agreed to in writing, software

        Browser browser = null;
                Class.forName(BROWSER_HELPER_CLASS_NAME),

    private static final String BROWSER_HELPER_CLASS_NAME = "org.eclipse.swt.browser.DBeaverBrowserHelper";
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.browser.handlers;
            if (browser != null) {
    private static final Log log = Log.getLog(BrowserClearCookiesHandler.class);
 *
        Shell shell = new Shell(SWT.MODELESS);
            log.error("Error clearing cookies", e);
 * limitations under the License.
    private static final String BROWSER_HELPER_CLASS_CLEAR_COOKIES_NAME = "clearCookies";

 *     http://www.apache.org/licenses/LICENSE-2.0
                BROWSER_HELPER_CLASS_CLEAR_COOKIES_NAME,
 * See the License for the specific language governing permissions and
import org.eclipse.swt.browser.Browser;
/*

    }
        try {
        }
        } catch (Throwable e) {
                new Class[]{Browser.class},
            browser = new Browser(shell, SWT.NONE);
            BeanUtils.invokeStaticMethod(
        UIUtils.syncExec(BrowserClearCookiesHandler::clearCookies);
 */

}
    private static void clearCookies() {
public class BrowserClearCookiesHandler implements DBRRunnableWithProgress {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            }
            );
import org.jkiss.dbeaver.ui.UIUtils;
 *
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
