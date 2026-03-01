 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        return level;
    public abstract void saveConfiguration();
        this.configurationMap.clear();

import java.util.LinkedHashMap;
        if (configuration == null) {
            }
    @NotNull
    public ValueHintContextConfiguration(
            } else {

            configurationMap.put(descriptor.getId(), configuration);
        return getProviderConfiguration(descriptor).isEnabled();

    public void setConfigurationMap(Map<String, ValueHintProviderConfiguration> configurationMap) {
 */
 *
 * ValueHintProviderConfiguration
        @Nullable ValueHintProviderConfiguration configuration
/*


                configuration.setParameters(pConfig.getParameters());
            configurationMap.remove(descriptor.getId());

        @NotNull DBDValueHintContext.HintConfigurationLevel level
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

}    public ValueHintProviderConfiguration getProviderConfiguration(@NotNull ValueHintProviderDescriptor descriptor) {
package org.jkiss.dbeaver.registry.data.hints;
    public abstract void deleteConfiguration();
    ) {
 * limitations under the License.
 */
/**
                configuration.setEnabled(pConfig.isEnabled());
    public boolean isHintEnabled(ValueHintProviderDescriptor descriptor) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        this.configurationMap.putAll(configurationMap);
            ValueHintContextConfiguration parent = getParent();

import org.jkiss.code.Nullable;
        } else {
            configurationMap.put(descriptor.getId(), configuration);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
    }
    }
 * DBeaver - Universal Database Manager
        return configuration;
    public DBDValueHintContext.HintConfigurationLevel getLevel() {
public abstract class ValueHintContextConfiguration {
    public abstract ValueHintContextConfiguration getParent();
        this.level = level;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected final Map<String, ValueHintProviderConfiguration> configurationMap = new LinkedHashMap<>();

    public Map<String, ValueHintProviderConfiguration> getConfigurationMap() {
 * See the License for the specific language governing permissions and
    }
            configuration = new ValueHintProviderConfiguration(descriptor.getId());
        }
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull ValueHintProviderDescriptor descriptor,

    }
        return configurationMap;
    private final transient DBDValueHintContext.HintConfigurationLevel level;

                ValueHintProviderConfiguration pConfig = parent.getProviderConfiguration(descriptor);
        if (configuration == null) {
 * you may not use this file except in compliance with the License.

            if (parent == null) {
    public void setConfiguration(
                configuration.setEnabled(descriptor.isVisibleByDefault());
        ValueHintProviderConfiguration configuration = configurationMap.get(descriptor.getId());
import java.util.Map;
    }

 *
    ) {
