                settings.saveSettings();
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Shell;
        return false;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.ai.AIContextSettings;


 * Licensed under the Apache License, Version 2.0 (the "License");
    public static void showPreferences(@NotNull Shell shell) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * DBeaver - Universal Database Manager

    private static final Log log = Log.getLog(AIUIUtils.class);

            settings.setMetaTransferConfirmed(true);
 *
        }
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
 *
 * Unless required by applicable law or agreed to in writing, software
 *
        if (UIUtils.confirmAction(UIUtils.getActiveWorkbenchShell(),
                DBWorkbench.getPlatformUI().showError(AIUIMessages.confirm_meta_transfer_usage_title, null, e);
 * distributed under the License is distributed on an "AS IS" BASIS,
        UIUtils.showPreferencesFor(
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.ai.AIIcons;
        if (settings.isMetaTransferConfirmed()) {
    public static boolean confirmMetaTransfer(@NotNull AIContextSettings settings) {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            NLS.bind(AIUIMessages.confirm_meta_transfer_usage_message, settings.getDataSourceContainer().getName()),
 * limitations under the License.
            return true;
}
import org.jkiss.dbeaver.Log;
            AISettingsManager.getInstance().getSettings(),
        // prevents instantiation
            }
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;

            AIIcons.AI
package org.jkiss.dbeaver.ui.ai;
import org.jkiss.code.NotNull;
 */

            AIUIMessages.confirm_meta_transfer_usage_title,
            return true;
        );
    }
            } catch (DBException e) {
            shell,

            try {
        )) {
            AIPreferencePageMain.PAGE_ID
        }
public class AIUIUtils {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
/*
    }
import org.eclipse.osgi.util.NLS;
    private AIUIUtils() {
import org.jkiss.dbeaver.ui.ai.preferences.AIPreferencePageMain;
