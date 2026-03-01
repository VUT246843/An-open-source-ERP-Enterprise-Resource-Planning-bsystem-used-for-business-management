    ) {
            }
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.PlatformUI;
        PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;


        @NotNull String[] pageIds,
        for (String pageId : pageIds)  {
    }

 * You may obtain a copy of the License at
 */
                pm.addTo(toPage, uiPage);
        @NotNull String toPage
            if (uiPage != null) {

    public static void movePreferencePages(
}
        return PlatformUI.getWorkbench().getPreferenceManager().find(pageId) != null;
    }
package org.jkiss.dbeaver.ui.workbench;
public class WorkbenchUtils {
        }
        for (String epp : pageIds) {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
import org.eclipse.jface.preference.IPreferenceNode;
 * Unless required by applicable law or agreed to in writing, software
        PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
 * limitations under the License.
        // Remove unneeded pref pages and override font preferences page


 *
            pm.remove(epp);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

    public static boolean isPreferencePageExists(@NotNull String pageId) {
            IPreferenceNode uiPage = pm.remove(pageId);
import org.eclipse.jface.preference.PreferenceManager;
    public static void removePreferencePages(@NotNull String ... pageIds) {
        }
