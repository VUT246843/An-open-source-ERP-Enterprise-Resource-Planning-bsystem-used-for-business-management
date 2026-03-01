        Objects.requireNonNull(browser, "browser cannot be null");
        if (WebKitGTK.webkit_get_minor_version() < 16) {
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.swt.internal.webkit.WebKitGTK;
import java.util.Objects;
 *
        }
 *
        }
import org.jkiss.dbeaver.Log;

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
    public static void clearCookies(Browser browser) {
package org.eclipse.swt.browser;
            return;
    }
/*
        long manager = WebKitGTK.webkit_web_context_get_website_data_manager(context);
 * limitations under the License.
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        WebKitGTK.webkit_website_data_manager_clear(manager, WebKitGTK.WEBKIT_WEBSITE_DATA_COOKIES, 0, 0, 0, 0);
public class DBeaverBrowserHelper {
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    private DBeaverBrowserHelper() {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

        long context = WebKitGTK.webkit_web_context_get_default();

        if (!WebKitGTK.LibraryLoaded) {

            log.warn("SWT WebKit: clear sessions only supported on WebKitGtk version 2.16 and above.");
 * DBeaver - Universal Database Manager
            return;
    private static final Log log = Log.getLog(DBeaverBrowserHelper.class);
