    public List<ERDConnectionRouterDescriptor> getDescriptors() {
            }
     * Registry instance
    private final static Log log = Log.getLog(ERDNotationRegistry.class);
    public ERDConnectionRouterDescriptor getDefaultDescriptor() {
    }
            activeRouterDescriptor = getDefaultDescriptor();
     * descriptor by name
 *
     * @return - descriptor
            descriptors.add(descriptor);
 *     http://www.apache.org/licenses/LICENSE-2.0
                activeRouterDescriptor = router;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IConfigurationElement;
        return connectionRouterDescriptors.get(id);
            try {
    }
        }
 */
    
     *
        return ERDUIActivator.getDefault().getPreferences();
     *
        List<ERDConnectionRouterDescriptor> descriptors = new ArrayList<>();
     * Get connector router by identifier, as compatibility next attempt retrieve
     *
    public ERDConnectionRouterDescriptor getActiveRouter() {
}

                addDescriptor(new ERDConnectionRouterDescriptor(cfe));
            } catch (CoreException e) {

 * You may obtain a copy of the License at
public class ERDConnectionRouterRegistry {
        for (ERDConnectionRouterDescriptor router : connectionRouterDescriptors.values()) {
    /**
import org.eclipse.core.runtime.IExtensionRegistry;
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }

/*
        for (ERDConnectionRouterDescriptor descriptor : connectionRouterDescriptors.values()) {
    }
        if (instance == null) {
        if (connectionRouterDescriptors.containsKey(descriptor.getId())) {
    public ERDConnectionRouterDescriptor getDescriptorById(String id) {
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.ui.editors.erd.routing"; //$NON-NLS-1$
    private final Map<String, ERDConnectionRouterDescriptor> connectionRouterDescriptors = new LinkedHashMap<>();
        activeRouterDescriptor = connectionRouter;
        }
     */
    }
    public void setActiveRouter(ERDConnectionRouterDescriptor connectionRouter) {
 * limitations under the License.

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    /**
            }
        return activeRouterDescriptor;
    }
import org.eclipse.core.runtime.CoreException;
 * See the License for the specific language governing permissions and
import java.util.*;
        }
     * Set default router
            if (router.isDefaultRouter()) {
     */
        }
 * DBeaver - Universal Database Manager
        return instance;
     *
        return Objects.requireNonNull(getDescriptorById(ERDUIConstants.PREF_DEFAULT_ATTR_ERD_ROUTER_ID));

            return;
        if (activeRouterDescriptor == null) {
     *
    /**
     * Get default descriptor
                log.error(e.getStatus());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                    return descriptor;
            }
     */
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationRegistry;
    public static synchronized ERDConnectionRouterRegistry getInstance() {
package org.jkiss.dbeaver.ui.editors.erd.router;
            return activeRouterDescriptor;
        if (activeRouterDescriptor != null) {
    private DBPPreferenceStore getPreferenceStore() {
     * @param id - identifier or name
        if (activeRouterDescriptor == null) {
        }
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
    @Nullable
     */
        IConfigurationElement[] cfgElements = registry.getConfigurationElementsFor(EXTENSION_ID);
    }


     * @return - registry instance
        getPreferenceStore().setValue(ERDUIConstants.PREF_ROUTING_TYPE, activeRouterDescriptor.getId());
    private void addDescriptor(@NotNull ERDConnectionRouterDescriptor descriptor) {
    /**
     */
        return descriptors;
            activeRouterDescriptor = getDescriptorById(getPreferenceStore().getString(ERDUIConstants.PREF_ROUTING_TYPE));
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
    private static ERDConnectionRouterRegistry instance;
            for (ERDConnectionRouterDescriptor descriptor : connectionRouterDescriptors.values()) {
import org.jkiss.code.Nullable;
    @NotNull

import org.jkiss.dbeaver.Log;
 *
     * The method designed to retrieve default router
     * @return - descriptor
                if (descriptor.getName().equals(id)) {
    /**
    private ERDConnectionRouterDescriptor activeRouterDescriptor;

import org.eclipse.core.runtime.Platform;
 * Unless required by applicable law or agreed to in writing, software

        if (!connectionRouterDescriptors.containsKey(id)) {
            log.error("ER Diagram Connection router is already defined for id:" + descriptor.getId());

        }
            instance = new ERDConnectionRouterRegistry(Platform.getExtensionRegistry());
    @NotNull
        for (IConfigurationElement cfe : cfgElements) {
                break;
     * @return - default descriptor

    }
        connectionRouterDescriptors.put(descriptor.getId(), descriptor);
            // attempt to get by name
    private ERDConnectionRouterRegistry(IExtensionRegistry registry) {

        }
 *
