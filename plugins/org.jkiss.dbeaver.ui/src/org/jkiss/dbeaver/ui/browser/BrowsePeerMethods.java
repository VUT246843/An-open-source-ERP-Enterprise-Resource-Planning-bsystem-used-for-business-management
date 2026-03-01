            return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        UIUtils.syncExec(() -> {
        DBPPreferenceStore store = ModelPreferences.getPreferences();
     * @return was it opened successfully

/*
 * Unless required by applicable law or agreed to in writing, software

import java.util.concurrent.atomic.AtomicBoolean;
 */
        boolean useEmbeddedAuth = store.getBoolean(UIPreferences.UI_USE_EMBEDDED_AUTH);
import org.jkiss.dbeaver.ui.UIUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                log.warn("Embedded Browser is disabled or unavailable");
                    result.set(true);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**

                    log.warn("Error redirecting request to embedded browser", e);
            return false;
    public static boolean canBrowseInSWTBrowser() {
import org.jkiss.dbeaver.ModelPreferences;

        return result.get();
                }
     * Open URI via SWT browser API
            boolean internalWebBrowserAvailable = PlatformUI.getWorkbench().getBrowserSupport()
import java.net.URI;
     */
                .isInternalWebBrowserAvailable();
     *
        if (!useEmbeddedAuth) {
        } else {
import java.net.MalformedURLException;
 * You may obtain a copy of the License at
     * @param uri uri to open
}
    /**
    private static final Log log = Log.getLog(BrowsePeerMethods.class);
 * you may not use this file except in compliance with the License.
        });
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @return true if request is redirectable
            AtomicBoolean result = new AtomicBoolean();
            }
        if (store.getBoolean(UIPreferences.UI_USE_EMBEDDED_AUTH)) {
    }
 *
package org.jkiss.dbeaver.ui.browser;
        }
public class BrowsePeerMethods {
import org.eclipse.ui.PlatformUI;
     *
                    BrowserPopup.openBrowser("redirect.auth", uri.toURL());
            });
                try {
     */
 * DBeaver - Universal Database Manager
                } catch (MalformedURLException e) {
        AtomicBoolean result = new AtomicBoolean(false);
            result.set(internalWebBrowserAvailable);
        DBPPreferenceStore store = ModelPreferences.getPreferences();
import org.jkiss.dbeaver.ui.preferences.UIPreferences;
            UIUtils.syncExec(() -> {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            if (!internalWebBrowserAvailable) {
            return result.get();
    public static boolean browseInSWTBrowser(URI uri) {
import org.jkiss.dbeaver.Log;

     * Checks if request can be opened in SWT browser
 * See the License for the specific language governing permissions and
