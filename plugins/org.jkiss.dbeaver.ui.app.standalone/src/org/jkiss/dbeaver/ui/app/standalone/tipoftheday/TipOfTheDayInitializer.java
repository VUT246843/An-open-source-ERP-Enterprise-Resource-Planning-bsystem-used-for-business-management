
    private static final String PROP_NOT_FIRST_RUN = "tipOfTheDayInitializer.notFirstRun";
 *

    }
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
public class TipOfTheDayInitializer implements IWorkbenchWindowInitializer {
 * You may obtain a copy of the License at
        }
}
    }
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PROP_NOT_FIRST_RUN)) {
    private static boolean isTipsEnabled() {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.runtime.DBWorkbench;
package org.jkiss.dbeaver.ui.app.standalone.tipoftheday;
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;
            return;
 *     http://www.apache.org/licenses/LICENSE-2.0
        IWorkbenchWindow window = configurer.getWindow();
        if (!isTipsEnabled() || window.getWorkbench().getWorkbenchWindowCount() > 1) {
        }
import org.eclipse.ui.IWorkbenchWindow;
    @Override
        ShowTipOfTheDayHandler.showTipOfTheDay(window);
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
            DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_NOT_FIRST_RUN, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            return false;
        return ShowTipOfTheDayDialog.isShowOnStartup();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *

    public void initializeWorkbenchWindow(@NotNull IWorkbenchWindowConfigurer configurer) {
 * limitations under the License.
