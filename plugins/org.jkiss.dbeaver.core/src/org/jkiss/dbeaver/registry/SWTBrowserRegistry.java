        String type = preferences.getString(ModelPreferences.CLIENT_BROWSER);

        System.setProperty(INTERNAL_BROWSER_PROPERTY, getActiveBrowser().name());
 *
     */
        @NotNull
    }
    @NotNull
    };
        if (CommonUtils.isEmpty(type)) {
        "Windows Server 2012 R2", //$NON-NLS-1$
 * See the License for the specific language governing permissions and

public class SWTBrowserRegistry {
        )) {
        //prevents construction
        "Windows Server 2016", //$NON-NLS-1$

        "Windows XP", //$NON-NLS-1$

        }
     */
        BrowserSelection(@NotNull String name) {
        }
     * Returns selected via combo browser or default browser if none is selected

        }
        }
            return BrowserSelection.EDGE;
import org.jkiss.code.NotNull;
 *
 *
    private static final String INTERNAL_BROWSER_PROPERTY = "org.eclipse.swt.browser.DefaultType";
        "Windows Server 2008", //$NON-NLS-1$
            return BrowserSelection.IE;
    public enum BrowserSelection {
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        "Windows Server 2019", //$NON-NLS-1$
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

        public String getFullName() {


    /**
package org.jkiss.dbeaver.registry;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        "Windows Vista", //$NON-NLS-1$
    private SWTBrowserRegistry() {
        "Windows 7", //$NON-NLS-1$
        } else {
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void setActiveBrowser(@NotNull BrowserSelection browser) {
 * limitations under the License.
        "Windows 98", //$NON-NLS-1$
    // Windows versions which don't have Edge as an available browser, or need to install it manually

     * Overrides default browser, we want to use Edge for newer version
    /**
import org.jkiss.utils.CommonUtils;
     * @param browser selected browser

            return name;
import org.jkiss.utils.ArrayUtils;
    }
        DBPPreferenceStore preferences = ModelPreferences.getPreferences();
    }
     *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }
        preferences.setValue(ModelPreferences.CLIENT_BROWSER, browser.name());
     * if the user didn't specify otherwise
        EDGE("Microsoft Edge"),
            this.name = name;
    public static BrowserSelection getDefaultBrowser() {
     * By passing down BrowserSelection sets browser to be used by eclipse

    public static void overrideBrowser() {
            return Objects.requireNonNull(CommonUtils.valueOf(BrowserSelection.class, type));
        System.setProperty(INTERNAL_BROWSER_PROPERTY, preferences.getString(ModelPreferences.CLIENT_BROWSER));

     */
/*
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (RuntimeUtils.isWindows()
 * Unless required by applicable law or agreed to in writing, software

        "Windows 8", //$NON-NLS-1$

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ModelPreferences;
    private static final String[] LEGACY_WINDOWS_VERSIONS = {
    public static BrowserSelection getActiveBrowser() {
        "Windows Server 2012", //$NON-NLS-1$

import java.util.Objects;
    /**
    }
        private final String name;
        "Windows Server 2008 R2", //$NON-NLS-1$
 * You may obtain a copy of the License at

     */

 */
            && ArrayUtils.containsIgnoreCase(LEGACY_WINDOWS_VERSIONS, System.getProperty("os.name")
        IE("Internet Explorer");

        "Windows 8.1", //$NON-NLS-1$
        DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
     * Returns default browser depends on the OS

            return getDefaultBrowser();
