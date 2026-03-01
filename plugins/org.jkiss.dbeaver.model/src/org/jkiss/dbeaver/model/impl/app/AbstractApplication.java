import org.jkiss.code.Nullable;
    }
    @NotNull
    public String getApplicationRunId() {
    }

            return;
                throw new IllegalStateException("No DBeaver application found");
                instance = ApplicationRegistry.getInstance().getApplication().getInstance();
import java.util.Map;
    public boolean isDistributed() {
    public String getInfoDetails() {
    @Override
        }

        return false;
            try {
/**

            log.error("Cannot initialize application services in non-OSGI context");
        return INSTANCE;

    }

import org.jkiss.dbeaver.model.app.DBPPlatform;
    protected AbstractApplication() {

            DBPApplication instance = null;

        return "N/A";
            BundleContext bundleContext = br.getBundle().getBundleContext();
    public boolean isStandalone() {
 *
 * DBeaver - Universal Database Manager
 * Abstract application implementation
    public static final Integer EXIT_ERROR_UNSPECIFIED = 1;
    }
        } else {
                bundleContext = FrameworkUtil.getBundle(DBPApplication.class).getBundleContext();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean hasProductFeature(@NotNull String featureName) {
            applicationRunId = UUID.randomUUID().toString();
        return true;
    @Override
            INSTANCE = instance;
import org.jkiss.dbeaver.Log;
    @Nullable
        }
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String applicationRunId;
        // Feature set can be customized by particular implementation
            if (instance == null) {
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return switch (featureName) {
    @Override
        if (INSTANCE == null) {


            if (bundleContext == null) {
            }
 * you may not use this file except in compliance with the License.
    @Override
        return true;
        try {

            log.error("Error instantiating service '" + serviceInt.getName() + "'", e);
    public long getApplicationStartTime() {
    private static final Log log = Log.getLog(AbstractApplication.class);
import org.eclipse.equinox.app.IApplicationContext;
    @Override
            Constructor<? extends T> constructor = serviceImplClass.getDeclaredConstructor();
    }
        }

        }

            log.error("Multiple application instances created: " + INSTANCE.getClass().getName() + ", " + this.getClass().getName());
    // IApplication
            bundleContext.registerService(serviceInt, serviceImpl, null);

import org.osgi.framework.BundleReference;
import org.eclipse.equinox.app.IApplication;

    }

            }
 * Unless required by applicable law or agreed to in writing, software
    private static DBPApplication INSTANCE;
    }
            } catch (Throwable e) {
 * See the License for the specific language governing permissions and
        if (applicationRunId == null) {
    public boolean isDetachedProcess() {
    public boolean isHeadlessMode() {
            // Initialize platform
        }

        return false;
        return EXIT_OK;
        return false;
 *


    @Override
            constructor.setAccessible(true);

        return false;
import org.jkiss.dbeaver.model.fs.DBFUtils;
        } catch (Throwable e) {
            }
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
            case DBFUtils.PRODUCT_FEATURE_MULTI_FS -> false;
 */
        if (getClass().getClassLoader() instanceof BundleReference br) {

    public Map<String, String> getAdditionalApplicationProperties() {
    }
    @Override

            registerService(bundleContext, DBPPlatformUI.class, getPlatformUIClass());
    }
package org.jkiss.dbeaver.model.impl.app;
    public boolean isPrimaryInstance() {
 *
    /////////////////////////////////////////


            registerService(bundleContext, DBPPlatform.class, getPlatformClass());
    }
    }
    }
    }
            T serviceImpl = constructor.newInstance();
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected <T> void registerService(BundleContext bundleContext, Class<T> serviceInt, Class<? extends T> serviceImplClass) {
    }

import org.jkiss.code.NotNull;
    }
    public boolean isMultiuser() {
import org.osgi.framework.BundleContext;
public abstract class AbstractApplication implements IApplication, DBPApplication {
    }
        return applicationStartTime;
        return applicationRunId;

        return Map.of();

    @Override
                // Use model bundle context
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void initializeApplicationServices() {
 * You may obtain a copy of the License at
    @Override
    public Object start(IApplicationContext context) throws Exception {
        }
/*
    public String getProductProperty(@NotNull String propName) {



    @Override
    public static DBPApplication getInstance() {
import org.jkiss.dbeaver.model.app.DBPApplication;
    public boolean isExclusiveMode() {
    @Override
        return Platform.getProduct().getProperty(propName);
    }
 * limitations under the License.
    @NotNull
    @Override
 */
        // By default, product includes almost all possible features
    }
        INSTANCE = this;
import org.osgi.framework.FrameworkUtil;
    private final long applicationStartTime = System.currentTimeMillis();
import org.eclipse.core.runtime.Platform;
        if (INSTANCE != null) {
    public void stop() {
                log.error(e);
    @Override
import java.lang.reflect.Constructor;
            default -> true;
        };
        if (serviceImplClass == null) {
import java.util.UUID;
        return false;
