
import org.eclipse.core.runtime.IConfigurationElement;
    ) {
        return instance;
    private synchronized void loadExtensions(IExtensionRegistry registry) {
    public static final String SETTINGS_EXTENSION_ID = "org.jkiss.dbeaver.settings"; //$NON-NLS-1$
 * DBeaver - Universal Database Manager

            instance.loadExtensions(Platform.getExtensionRegistry());

                parseSettingsGroup(ext, null);
        IConfigurationElement ext,
        }
            }
 *
 * you may not use this file except in compliance with the License.
        return new ArrayList<>(settings.values());
        if (settings.containsKey(settingsGroup.getId())) {
    private ProductSettingsRegistry() {
public class ProductSettingsRegistry {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final Map<String, PropertyGroupDescriptor<ProductSettingDescriptor>> settings = new LinkedHashMap<>();
        }

import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
 *
        }
        if (instance == null) {
import org.jkiss.code.Nullable;
    }
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SETTINGS_EXTENSION_ID);
 * See the License for the specific language governing permissions and
                ProductSettingDescriptor productSettingDescriptor = new ProductSettingDescriptor(settingsGroup.getFullId(),
 * distributed under the License is distributed on an "AS IS" BASIS,
            }

import java.util.ArrayList;
            instance = new ProductSettingsRegistry();
 */
            if (PropertyDescriptor.TAG_PROPERTY_GROUP.equals(childExt.getName())) {
import org.eclipse.core.runtime.IExtensionRegistry;
            settingsGroup = settings.get(settingsGroup.getId());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                parseSettingsGroup(childExt, settingsGroup);
import java.util.List;
    }
 * limitations under the License.
        for (IConfigurationElement ext : extConfigs) {
        }
/*
import java.util.Map;
        if (parentGroup != null) {
        @Nullable PropertyGroupDescriptor<ProductSettingDescriptor> parentGroup
            // Load webServices
        PropertyGroupDescriptor<ProductSettingDescriptor> settingsGroup = new PropertyGroupDescriptor<>(ext);
                    childExt);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.PropertyGroupDescriptor;
        }
 * Unless required by applicable law or agreed to in writing, software
import java.util.LinkedHashMap;


        } else {
            } else if (PropertyDescriptor.TAG_PROPERTY.equals(childExt.getName())) {
package org.jkiss.dbeaver.registry.settings;
            if (PropertyDescriptor.TAG_PROPERTY_GROUP.equals(ext.getName())) {
            settingsGroup.setParentGroup(parentGroup);
 * You may obtain a copy of the License at
    private void parseSettingsGroup(
                settingsGroup.addProperty(productSettingDescriptor);
    public List<PropertyGroupDescriptor<ProductSettingDescriptor>> getSettings() {
            settings.put(settingsGroup.getId(), settingsGroup);
        for (IConfigurationElement childExt : ext.getChildren()) {
    }
}

    public synchronized static ProductSettingsRegistry getInstance() {

    private static ProductSettingsRegistry instance = null;
            parentGroup.addSubGroup(settingsGroup);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.eclipse.core.runtime.Platform;


