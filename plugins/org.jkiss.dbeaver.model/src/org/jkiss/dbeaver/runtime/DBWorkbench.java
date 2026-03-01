    }

    public static <T extends DBPPlatform> T getPlatform(Class<T> pc) {

    }
    /**
            try {
public class DBWorkbench {
 * Licensed under the Apache License, Version 2.0 (the "License");
            return applicationWorkbench.getPlatform() != null;


        if (applicationWorkbench != null) {
            }
        T service = ServiceRegistry.getInstance().getService(serviceType);
import java.util.List;
 * DBeaver - Universal Database Manager

            DBPPlatform platform = applicationWorkbench.getPlatform();
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
     * Distributed platform.
                throw new IllegalStateException("Internal error: application workbench is not instantiated");
    private static DBPApplicationWorkbench applicationWorkbench;
            log.debug("Service '" + serviceType.getName() + "' not found");
        return applicationWorkbench;
 *

                }
        return service;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
            }
 * Workbench
                try {
        return getApplicationWorkbench().getPlatform();
    }
import java.util.ArrayList;
                log.debug("Error checking application instance", e);
import org.jkiss.dbeaver.model.app.DBPPlatform;
     * Service management
        }

                } catch (Throwable e) {
        return getPlatform().getApplication().hasProductFeature(feature);
        }
 * limitations under the License.
        if (isPlatformStarted()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
                    throw new IllegalStateException("Error running platform init hook", e);
 */

    }
        }
            return;
        return false;
    @Nullable
import org.jkiss.dbeaver.model.app.DBPApplicationWorkbench;
            // Run init hooks
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }

        return pc.cast(getPlatform());
            if (applicationWorkbench == null) {
        }
    public static boolean isPlatformStarted() {
import org.jkiss.dbeaver.model.impl.app.AbstractApplication;
package org.jkiss.dbeaver.runtime;

                AbstractApplication.getInstance();
        return getApplicationWorkbench().getPlatformUI();
    }

    public static void addInitializeHook(@NotNull DBRRunnableWithParam<DBPPlatform> hook) throws DBException {
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithParam;

     */
            initHooks.clear();
    private static final Log log = Log.getLog(DBWorkbench.class);
        return getPlatform().getApplication().isDistributed();
        if (applicationWorkbench == null) {
    private static DBPApplicationWorkbench getApplicationWorkbench() {
    private static final List<DBRRunnableWithParam<DBPPlatform>> initHooks = new ArrayList<>();
        initHooks.add(hook);
import org.jkiss.dbeaver.Log;
/**
    public static boolean isDistributed() {
    /**
            applicationWorkbench = RuntimeUtils.getBundleService(DBPApplicationWorkbench.class, true);
            } catch (Exception e) {
import org.jkiss.dbeaver.DBException;



    public static boolean hasFeature(@NotNull String feature) {
    public static <T> T getService(@NotNull Class<T> serviceType) {
    public static DBPPlatform getPlatform() {
     */
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    hook.run(platform);
 *

    public static DBPPlatformUI getPlatformUI() {
            hook.run(getPlatform());
            }
 *
            for (DBRRunnableWithParam<DBPPlatform> hook : initHooks) {
import org.jkiss.code.NotNull;
    }
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
     * All configurations and resources are stored on remote servers.
    }
        if (service == null) {
 * Unless required by applicable law or agreed to in writing, software
 */
/*

