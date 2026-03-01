            nsUserDefaults.setInteger(tooltipDelay, NSString.stringWith("NSInitialToolTipDelay"));

    }
        DBPPreferenceStore store = ModelPreferences.getPreferences();
        NSUserDefaults nsUserDefaults = NSUserDefaults.standardUserDefaults();
 *
        boolean isDelaySetEnabled = store.getBoolean(CocoaUIService.PREF_TOOLTIP_DELAY_ENABLED);
    public static final String PREF_TOOLTIP_DELAY = "macos.tooltip.delay";
    public static void updateTooltipDefaults() {
        }
            if (tooltipDelay <= 0) {
 *
import org.eclipse.swt.internal.cocoa.NSString;
 * limitations under the License.
            nsUserDefaults.setValue(null, NSString.stringWith("NSInitialToolTipDelay"));

        } else {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.macos;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
/*
        DBPPreferenceStore store = ModelPreferences.getPreferences();
        // Init default preferences
        if (isDelaySetEnabled) {
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    public void activateService() {
        PrefUtils.setDefaultPreferenceValue(store, CocoaUIService.PREF_TOOLTIP_DELAY, CocoaUIService.DEFAULT_TOOLTIP_DELAY);
import org.jkiss.dbeaver.utils.PrefUtils;
 * DBeaver - Universal Database Manager
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others


        PrefUtils.setDefaultPreferenceValue(store, CocoaUIService.PREF_TOOLTIP_DELAY_ENABLED, true);
 * Unless required by applicable law or agreed to in writing, software

            int tooltipDelay = store.getInt(CocoaUIService.PREF_TOOLTIP_DELAY);
                tooltipDelay = 0;

 * See the License for the specific language governing permissions and

    public static final int DEFAULT_TOOLTIP_DELAY = 300;
            }
}
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    public void deactivateService() {
    @Override
public class CocoaUIService implements IPluginService {
        updateTooltipDefaults();
import org.jkiss.dbeaver.runtime.IPluginService;
    public static final String PREF_TOOLTIP_DELAY_ENABLED = "macos.tooltip.delay.enabled";
import org.eclipse.swt.internal.cocoa.NSUserDefaults;
 *
import org.jkiss.dbeaver.ModelPreferences;
 * You may obtain a copy of the License at
