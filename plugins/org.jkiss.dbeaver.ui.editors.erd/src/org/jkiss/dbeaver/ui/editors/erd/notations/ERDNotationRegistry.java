        return getDescriptor(ERDUIConstants.PREF_DEFAULT_ATTR_ERD_NOTATION_ID);
        return instance;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public ERDNotationDescriptor getDefaultDescriptor() {
        }
        IConfigurationElement[] cfgElements = registry.getConfigurationElementsFor(EXTENSION_ID);
/*
import org.jkiss.code.NotNull;
    public List<ERDNotationDescriptor> getNotations() {
    }
    public ERDNotationDescriptor getDescriptor(@NotNull String id) {
    private static final Log log = Log.getLog(ERDNotationRegistry.class);
            return activeDescriptor;


    private ERDNotationDescriptor activeDescriptor;
     * The method designed to set and store current descriptor 
     *
     * @return - descriptor
                log.error(e.getStatus());
        return new ArrayList<>(notations.values());
     * @param name - notation name
package org.jkiss.dbeaver.ui.editors.erd.notations;
        getPreferenceStore().setValue(ERDUIConstants.PREF_NOTATION_TYPE, activeDescriptor.getId());
        if (!notations.containsKey(id)) {
        if (activeDescriptor != null) {
     */
     * Return notation from registry by name
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (activeDescriptor != null) {
     *

            if (descriptor.getName().equals(name)) {
     * Get notation by identifier
     * Gets default 
    private void addNotation(@NotNull ERDNotationDescriptor descriptor) {
    public ERDNotationDescriptor getDescriptorByName(String name) {
    private final Map<String, ERDNotationDescriptor> notations = new LinkedHashMap<>();

    }
import java.util.List;
     * @param id - notation descriptor identifier
    }
     *
    /**
    }
 * See the License for the specific language governing permissions and
     *
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
     * @return - registry instance
        for (IConfigurationElement cfe : cfgElements) {
 * Unless required by applicable law or agreed to in writing, software
import java.util.LinkedHashMap;
            return;
    public static synchronized ERDNotationRegistry getInstance() {

     */
     */
            return null;
            }
    /**
     * @return - default descriptor
    private ERDNotationRegistry(IExtensionRegistry registry) {
    }
    @Nullable
    private static ERDNotationRegistry instance;
                addNotation(new ERDNotationDescriptor(cfe));
        return notations.get(id);
     *
        notations.put(descriptor.getId(), descriptor);
     * The method designed to retrieve stored value of notation from configuration
     */
    /**
            log.error("ERD Notation not defined for key:" + id);
     * @return - ERDNotationDescriptor
import org.eclipse.core.runtime.Platform;
    }
            } catch (CoreException e) {
import org.eclipse.core.runtime.CoreException;
        activeDescriptor = erdNotation;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     * @return - ERDNotationDescriptor
 */
        for (ERDNotationDescriptor descriptor : notations.values()) {
     * scope
import org.jkiss.code.Nullable;
    /**
        activeDescriptor = getDescriptor(getPreferenceStore().getString(ERDUIConstants.PREF_NOTATION_TYPE));
    @NotNull

     */
        }
            try {
            return activeDescriptor;

import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
     * Add new notation
import org.jkiss.dbeaver.Log;

     *
        }
    
import java.util.Map;
        return ERDUIActivator.getDefault().getPreferences();
     * Registry instance
            instance = new ERDNotationRegistry(Platform.getExtensionRegistry());
    }
    }
        if (notations.containsKey(descriptor.getId())) {
            log.error("ER Diagram Notation already defined for id:" + descriptor.getId());
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
     * @param descriptor - notation descriptor


 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IConfigurationElement;

 *
    /**
     */
            }
        activeDescriptor = getDefaultDescriptor();
public class ERDNotationRegistry {
    }
 *
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.ArrayList;
    }
 *

 * DBeaver - Universal Database Manager
    /**
}
        return null;
    private DBPPreferenceStore getPreferenceStore() {

        return activeDescriptor;
    public void setActiveDescriptor(ERDNotationDescriptor erdNotation) {
    @Nullable
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.ui.editors.erd.notation.style";
     */
                return descriptor;
        }
        }
 * You may obtain a copy of the License at
        if (instance == null) {
 * you may not use this file except in compliance with the License.

    public ERDNotationDescriptor getActiveDescriptor() {
