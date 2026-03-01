 * DBeaver - Universal Database Manager
    public boolean matchesOS(OSDescriptor os) {
 */

                os.getAttribute(RegistryConstants.ATTR_NAME),

    }
    }
        }
                os.getAttribute(RegistryConstants.ATTR_ARCH),
                CommonUtils.toBoolean(os.getAttribute("exclude"))));
 * distributed under the License is distributed on an "AS IS" BASIS,
        return label;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

    {
        return id;
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);
    }
 */
 *
    public String getId() {
import java.util.List;
 *

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private final List<OSDescriptorMatch> osMatches = new ArrayList<>();
/**
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    private final String label;
        return id + " (" + label + ")";
        for (OSDescriptorMatch match : osMatches) {
    }
 * you may not use this file except in compliance with the License.
            }
    public String getLabel() {
 *
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
                return false;

import org.jkiss.dbeaver.model.runtime.OSDescriptorMatch;
import java.util.ArrayList;
 * limitations under the License.
    private final String description;
package org.jkiss.dbeaver.registry;
        }
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
        return true;
    }

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            this.osMatches.add(new OSDescriptorMatch(
    private final String id;

    public String getDescription() {

    public ProductBundleDescriptor(IConfigurationElement config)
 * ProductBundleDescriptor
 *     http://www.apache.org/licenses/LICENSE-2.0
        return description;
}


 * See the License for the specific language governing permissions and
public class ProductBundleDescriptor extends AbstractDescriptor {
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(config);
    @Override
        for (IConfigurationElement os : config.getChildren(RegistryConstants.TAG_OS)) {
            if (!match.matches(os)) {
import org.eclipse.core.runtime.IConfigurationElement;
    public String toString() {
