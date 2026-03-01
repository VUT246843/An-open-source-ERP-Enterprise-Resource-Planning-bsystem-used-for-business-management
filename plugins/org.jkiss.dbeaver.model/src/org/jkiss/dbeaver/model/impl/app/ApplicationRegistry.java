            if (defaultApplication == null) {
package org.jkiss.dbeaver.model.impl.app;
    }
                ApplicationDescriptor parentApp = getApplication(app.getParentId());
        }
import org.jkiss.utils.CommonUtils;
                            .map(ApplicationDescriptor::getId)
                finalApps.add(app);
                defaultApplication = finalApps.get(0);
        List<ApplicationDescriptor> finalApps = new ArrayList<>();


        return instance;
        if (defaultApplication == null) {
                if (finalApps.size() > 1) {
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.IProduct;
                    defaultApplication = getApplication(productApp);
 *

            // Include hidden
        }
    }
 */
            }

                    app.setParent(parentApp);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
                } else {
/*
                        "skip the rest (" +
                }

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        for (ApplicationDescriptor app : applications) {
}
            }

                String productApp = product.getApplication();


    public synchronized static ApplicationRegistry getInstance() {
import org.eclipse.core.runtime.IExtensionRegistry;
                }
public class ApplicationRegistry {
    private ApplicationDescriptor defaultApplication;
    private static final Log log = Log.getLog(ApplicationRegistry.class);
 *
    private ApplicationRegistry(IExtensionRegistry registry) {
        }
    private static ApplicationRegistry instance = null;
            ApplicationDescriptor app = new ApplicationDescriptor(ext);
import org.eclipse.core.runtime.IConfigurationElement;
        }
        if (finalApps.isEmpty()) {
        if (instance == null) {
        } else {
        }
                            .collect(Collectors.joining(",")) + ")");

                if (!CommonUtils.isEmpty(productApp)) {
import java.util.ArrayList;
            log.error("No applications defined.");
                if (parentApp == null) {
                }
        }
            if (app.getId().equals(id)) {
 * you may not use this file except in compliance with the License.
                    log.error("Parent application '" + app.getParentId() + "' not found");
    }
                            .filter(a -> a != defaultApplication)
        return defaultApplication;

            instance = new ApplicationRegistry(Platform.getExtensionRegistry());
            }
 *
 * See the License for the specific language governing permissions and
                    log.error("Multiple applications defined. Use the first one (" + defaultApplication.getId() + "), " +
import org.eclipse.core.runtime.Platform;
import org.jkiss.dbeaver.Log;
            }
        return null;
        for (ApplicationDescriptor app : applications) {
 * DBeaver - Universal Database Manager
                return app;
            for (ApplicationDescriptor app : applications) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (app.getParentId() != null) {
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.application"; //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    finalApps.add(app);
        if (finalApps.isEmpty()) {
    private final List<ApplicationDescriptor> applications = new ArrayList<>();
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
    public ApplicationDescriptor getApplication() {
                if (app.isFinalApplication()) {
        for (IConfigurationElement ext : extElements) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            if (app.isFinalApplication() && !app.isHidden()) {
            IProduct product = Platform.getProduct();
        }

import java.util.stream.Collectors;
                        finalApps.stream()
    }

        }
            applications.add(app);
            if (product != null) {
        for (ApplicationDescriptor app : applications) {
import java.util.List;
    private ApplicationDescriptor getApplication(String id) {
 * Unless required by applicable law or agreed to in writing, software

            }
            throw new IllegalStateException("No DBeaver application was defined");
