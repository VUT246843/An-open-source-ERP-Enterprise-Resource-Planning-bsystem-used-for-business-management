
    }


/**
 *
import java.util.LinkedHashMap;
            }
 * Set of user credentials required by auth provider.
        return new ArrayList<>(credentialParameters.values());
}
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.LocalizedPropertyDescriptor;
            IConfigurationElement[] propElements = propGroup.getChildren(PropertyDescriptor.TAG_PROPERTY);
    public String getDescription() {
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
 */
    private final String id;
package org.jkiss.dbeaver.model.security;
        return credentialParameters.get(id);
import java.util.Map;

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    public List<AuthPropertyDescriptor> getCredentialParameters() {

        this.description = cfg.getAttribute("description");
import org.jkiss.dbeaver.model.auth.AuthPropertyDescriptor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.label = cfg.getAttribute("label");
import org.jkiss.utils.ArrayUtils;
 * You may obtain a copy of the License at
import java.util.ArrayList;
    }
 *
    public SMAuthCredentialsProfile(IConfigurationElement cfg) {
import org.eclipse.core.runtime.IConfigurationElement;
            String category = propGroup.getAttribute(PropertyDescriptor.ATTR_LABEL);
        return id;
        }
 * Credentials profile.
                AuthPropertyDescriptor propertyDescriptor = new AuthPropertyDescriptor(category, prop);


 * Copyright (C) 2010-2024 DBeaver Corp and others
    public AuthPropertyDescriptor getCredentialParameter(String id) {
import org.jkiss.utils.CommonUtils;
            for (IConfigurationElement prop : propElements) {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (IConfigurationElement propGroup : ArrayUtils.safeArray(cfg.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))) {
    }
    private final Map<String, AuthPropertyDescriptor> credentialParameters = new LinkedHashMap<>();
    private final String description;
 */
    public String getLabel() {

 * DBeaver - Universal Database Manager
    }
 * you may not use this file except in compliance with the License.
public class SMAuthCredentialsProfile {
import java.util.List;
    public String getId() {
        return description;
    }
    private final String label;
                credentialParameters.put(CommonUtils.toString(propertyDescriptor.getId()), propertyDescriptor);
        return label;
        this.id = cfg.getAttribute("id");
 *
    }

