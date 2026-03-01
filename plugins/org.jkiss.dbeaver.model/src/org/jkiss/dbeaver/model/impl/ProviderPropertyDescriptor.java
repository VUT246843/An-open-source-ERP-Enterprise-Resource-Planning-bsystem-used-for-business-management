            properties.add(new ProviderPropertyDescriptor(category, prop));
                .map(DBPDriverConfigurationType::valueOf)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Set;
        String category = getPropertyCategory(config);
import java.util.stream.Stream;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
 * Unless required by applicable law or agreed to in writing, software
            this.configurationTypes = Set.of(DBPDriverConfigurationType.MANUAL, DBPDriverConfigurationType.URL); // by default
 * You may obtain a copy of the License at
                .collect(Collectors.toSet());
package org.jkiss.dbeaver.model.impl;
/*
 * you may not use this file except in compliance with the License.
    public ProviderPropertyDescriptor(String category, IConfigurationElement config) {

    private final Set<DBPDriverConfigurationType> configurationTypes;

 * limitations under the License.
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IConfigurationElement;
    public static List<ProviderPropertyDescriptor> extractProviderProperties(IConfigurationElement config) {

import java.util.stream.Collectors;
    }
import java.util.ArrayList;
        for (IConfigurationElement prop : propElements) {
            this.configurationTypes = Stream.of(supportedConfigurationTypes)
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Set<DBPDriverConfigurationType> getConfigurationTypes() {
    private static final String ATTR_SUPPORTED_CONFIGURATION_TYPES = "supportedConfigurationTypes";
import java.util.List;
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<ProviderPropertyDescriptor> properties = new ArrayList<>();
        }


        var configurationTypes = config.getAttribute(ATTR_SUPPORTED_CONFIGURATION_TYPES);
 *
    private static final Log log = Log.getLog(ProviderPropertyDescriptor.class);
        }
        return properties;
 *
import org.jkiss.utils.CommonUtils;
            String[] supportedConfigurationTypes = CommonUtils.split(configurationTypes, ",");
import org.jkiss.dbeaver.Log;
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        IConfigurationElement[] propElements = config.getChildren(PropertyDescriptor.TAG_PROPERTY);
        return configurationTypes;
public class ProviderPropertyDescriptor extends PropertyDescriptor {
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
 */
        if (CommonUtils.isEmpty(configurationTypes)) {
        super(category, config);

