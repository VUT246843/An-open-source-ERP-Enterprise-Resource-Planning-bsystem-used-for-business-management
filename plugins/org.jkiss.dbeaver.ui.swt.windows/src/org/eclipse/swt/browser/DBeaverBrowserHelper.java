 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DBeaverBrowserHelper {
    public static void clearCookies(Browser browser) {
        Objects.requireNonNull(browser, "browser cannot be null");
/*
    private static void clearCookiesIEImpl() {
            }
                if (hr != COM.S_OK) {
            manager.Release();
    private DBeaverBrowserHelper() {
import org.eclipse.swt.internal.ole.win32.ICoreWebView2CookieList;
        }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } else {
            cookieList.get_Count(count);
                hr = cookieList.GetValueAtIndex(i, ppv);
                cookie.Release();
        } finally {
            for (int i = 0; i < count[0]; i++) {
import java.util.Objects;
            clearCookiesEdgeImpl();
 * See the License for the specific language governing permissions and
        ICoreWebView2CookieList cookieList = new ICoreWebView2CookieList(ppv[0]);
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (hr != COM.S_OK) {
 * you may not use this file except in compliance with the License.

            return;

    }

        } catch (InterruptedException e) {
                    Edge.error(SWT.ERROR_NO_HANDLES, hr);
                }
import org.eclipse.swt.SWT;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
                ICoreWebView2Cookie cookie = new ICoreWebView2Cookie(ppv[0]);
 * DBeaver - Universal Database Manager
}
            cookieList.Release();
    private static void clearCookiesEdgeImpl() {


    }
        ICoreWebView2CookieManager manager = Edge.getCookieManager();
 *

 *
        }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at


        OS.InternetSetOption(0, OS.INTERNET_OPTION_END_BROWSER_SESSION, 0, 0);
            clearCookiesIEImpl();

            Thread.sleep(5);
            Thread.currentThread().interrupt();
import org.eclipse.swt.internal.ole.win32.ICoreWebView2Cookie;
        int hr = Edge.callAndWait(ppv, completion -> manager.GetCookies(null, completion));
                manager.DeleteCookie(cookie);

        try {
import org.eclipse.swt.internal.ole.win32.COM;
import org.eclipse.swt.internal.ole.win32.ICoreWebView2CookieManager;
        }
 */
        long[] ppv = new long[1];

    }
        if (browser.webBrowser instanceof Edge) {
            int[] count = new int[1];
            Edge.error(SWT.ERROR_NO_HANDLES, hr);
        }
import org.eclipse.swt.internal.win32.OS;
        // Bug in WebView2. DeleteCookie is asynchronous. Wait a short while for it to take effect.
        if (manager == null) {
package org.eclipse.swt.browser;
        }
        try {

