
    private DBeaverBrowserHelper() {
 * you may not use this file except in compliance with the License.

        for (int i = 0; i < count; i++) {
 *
        Objects.requireNonNull(browser, "browser cannot be null");
    public static void clearCookies(Browser browser) {
    }
        int count = (int) cookies.count();
 */
        NSArray cookies = storage.cookies();

 * Licensed under the Apache License, Version 2.0 (the "License");
public class DBeaverBrowserHelper {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        NSHTTPCookieStorage storage = NSHTTPCookieStorage.sharedHTTPCookieStorage();
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.internal.cocoa.NSHTTPCookieStorage;
    }
            storage.deleteCookie(cookie);
 *
 * You may obtain a copy of the License at
package org.eclipse.swt.browser;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.internal.cocoa.NSHTTPCookie;
import java.util.Objects;
 * limitations under the License.

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        }
}
/*
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.swt.internal.cocoa.NSArray;
            NSHTTPCookie cookie = new NSHTTPCookie(cookies.objectAtIndex(i));
