
        return DBeaverTestActivator.getInstance().getPreferences();
 *
/**
        if (RuntimeUtils.isWindows()
    }
    }
    @Override
        return DBeaverTestPlatformUI.class;
        initializeApplicationServices();
        DBPPlatform platform = DBWorkbench.getPlatform();
            System.setProperty(GeneralUtils.PROP_TRUST_STORE_TYPE, GeneralUtils.VALUE_TRUST_STORE_TYPE_WINDOWS);
    }
package org.jkiss.dbeaver.headless;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        DBPApplication application = platform.getApplication();


 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    }
 * limitations under the License.
import org.jkiss.dbeaver.Log;
    @NotNull
    public DBeaverHeadlessApplication() {
 * Headless application
    @Override
    public Class<? extends DBPPlatform> getPlatformClass() {
    @Override
        return DBeaverTestPlatform.class;
        // Initialize platform
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
    @NotNull
public class DBeaverHeadlessApplication extends DesktopApplicationImpl {
        return EXIT_OK;

    @Override
import java.nio.file.Path;
    }
        ) {
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public @Nullable Path getDefaultWorkingFolder() {
 *
import org.jkiss.dbeaver.ModelPreferences;
    @Override


    @Override
    @Nullable
    private static final Log log = Log.getLog(DBeaverHeadlessApplication.class);
    public Class<? extends DBPPlatformUI> getPlatformUIClass() {
    }
 */
        log.debug("Starting headless test application " + application.getClass().getName());
import org.jkiss.dbeaver.model.app.DBPPlatform;
import org.eclipse.equinox.app.IApplicationContext;
}
/*
import org.jkiss.dbeaver.model.app.DBPApplication;
 * You may obtain a copy of the License at
    public boolean isHeadlessMode() {

 * See the License for the specific language governing permissions and

    }

    }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
    @Override
        super.stop();
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        return true;
    }
 *
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void stop() {
import org.jkiss.dbeaver.model.rcp.DesktopApplicationImpl;
 * you may not use this file except in compliance with the License.

    public String getDefaultProjectName() {
        log.debug("Starting headless test application");
        return "DBeaverTests";
    public DBPPreferenceStore getPreferenceStore() {

            && platform.getPreferenceStore().getBoolean(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE)
    public Object start(IApplicationContext context) {

import org.jkiss.dbeaver.utils.GeneralUtils;
