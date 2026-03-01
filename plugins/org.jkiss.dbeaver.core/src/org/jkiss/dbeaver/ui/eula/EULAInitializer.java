 */
    public static final String DBEAVER_EULA = "DBeaver.eula";

 * limitations under the License.
import java.util.prefs.Preferences;
 * You may obtain a copy of the License at
        }
        EULAUtils.showEula(window.getShell(), true);
        return false;
        if (!DBWorkbench.getPlatform().getApplication().isStandalone() || !isEulaDialogNeeded() || window.getWorkbench().getWorkbenchWindowCount() > 1) {
            return true;
    private boolean isEulaDialogNeeded() {

/*

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
 * DBeaver - Universal Database Manager
    @Override
 * you may not use this file except in compliance with the License.
            //Used didn't accept EULA before or dialog was shown on different eula version
    }

package org.jkiss.dbeaver.ui.eula;
        IWorkbenchWindow window = configurer.getWindow();
 *
        Preferences preferences = Preferences.userNodeForPackage(DBWorkbench.getPlatform().getApplication().getClass());
import org.jkiss.dbeaver.runtime.DBWorkbench;
}
            return;
        }
 *
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
            preferences.remove(DBEAVER_EULA);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initializeWorkbenchWindow(@NotNull IWorkbenchWindowConfigurer configurer) {

public class EULAInitializer implements IWorkbenchWindowInitializer {
import org.jkiss.code.NotNull;
import org.eclipse.ui.IWorkbenchWindow;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (preferences.get(DBEAVER_EULA, null) == null || !preferences.get(DBEAVER_EULA, null).equals(EULAUtils.getEulaVersion())) {
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
