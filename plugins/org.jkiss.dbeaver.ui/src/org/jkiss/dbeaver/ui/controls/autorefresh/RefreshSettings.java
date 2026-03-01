    private final String settingsId;
        IDialogSettings viewerSettings = getViewerSettings(settingsId);



    }
    private int refreshInterval = 0;
    RefreshSettings(RefreshSettings src) {
 *
    }
 *
        IDialogSettings viewerSettings = getViewerSettings(settingsId);
public class RefreshSettings {
        this.refreshInterval = refreshInterval;
import org.eclipse.jface.dialogs.IDialogSettings;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (viewerSettings == null) {


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        }
 */
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    }
    public void loadSettings() {
            viewerSettings = UIUtils.getDialogSettings("DBeaver.AutoRefresh");

    public void saveSettings() {
        if (viewerSettings.get("interval") != null) refreshInterval = viewerSettings.getInt("interval");

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }

package org.jkiss.dbeaver.ui.controls.autorefresh;
        this.stopOnError = stopOnError;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return refreshInterval;
    boolean isStopOnError() {

    }
        return stopOnError;
        this.settingsId = settingsId;
}
/*
    void setRefreshInterval(int refreshInterval) {
        return UIUtils.getSettingsSection(viewerSettings, section);
    int getRefreshInterval() {
    private static IDialogSettings viewerSettings;
    private boolean stopOnError = true;
        this.refreshInterval = src.refreshInterval;

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
        viewerSettings.put("interval", refreshInterval);
        this.settingsId = src.settingsId;
    void setStopOnError(boolean stopOnError) {
import org.jkiss.dbeaver.ui.UIUtils;
        if (viewerSettings.get("stopOnError") != null) stopOnError = viewerSettings.getBoolean("stopOnError");
    }
    private static IDialogSettings getViewerSettings(String section) {
    }
        this.stopOnError = src.stopOnError;

 * DBeaver - Universal Database Manager
 *
        viewerSettings.put("stopOnError", stopOnError);

    RefreshSettings(String settingsId) {
