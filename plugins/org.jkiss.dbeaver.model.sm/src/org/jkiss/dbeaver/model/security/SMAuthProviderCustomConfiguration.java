    }
        return id;
 * you may not use this file except in compliance with the License.
    private Map<String, Object> parameters = new LinkedHashMap<>();
    private boolean disabled;

        return description;
    }
    public void setDescription(String description) {
        this.parameters = new LinkedHashMap<>(src.parameters);
        return new SMAuthConfigurationReference(getProvider(), getId());

        this.iconURL = iconURL;
/*

public class SMAuthProviderCustomConfiguration {
    @Override
        return obj instanceof SMAuthProviderCustomConfiguration &&
    }
        this.provider = provider;
    public void setProvider(String provider) {
import java.util.Map;
    public boolean equals(Object obj) {
/**
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2010-2025 DBeaver Corp and others

    public void setId(String id) {
    public <T> T getParameter(String name) {
    public boolean isDisabled() {
    }
    }

        this.iconURL = src.iconURL;
    }

    }

        return parameters;
        this.disabled = src.disabled;
    public void setIconURL(String iconURL) {

 * Auth provider custom configuration
    public void setDisplayName(String displayName) {
        return id.hashCode();

    }
    public SMAuthConfigurationReference getAuthConfigurationReference() {
    private String description;
    public String getIconURL() {
 */

 * You may obtain a copy of the License at

 *

 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.id = src.id;
        this.id = id;
    }
    public <T> T getParameterOrDefault(String name, T defaultValue) {
    private String displayName;
    public SMAuthProviderCustomConfiguration(SMAuthProviderCustomConfiguration src) {
    private String iconURL;
        this.description = src.description;

        return disabled;
    public String getId() {
    }
    public Map<String, Object> getParameters() {


    }
        return displayName;
    private String provider;
    public String getDescription() {


    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return (T) parameters.get(name);
    }

        this.disabled = disabled;
    public SMAuthProviderCustomConfiguration(String id) {
    }
        this.id = id;
        this.displayName = src.displayName;

    }
}
    }

 *
        this.description = description;


    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public String getProvider() {
            id.equals(((SMAuthProviderCustomConfiguration) obj).id);
        this.parameters = parameters;

package org.jkiss.dbeaver.model.security;
    }
        return provider;
import java.util.LinkedHashMap;
    public int hashCode() {
    private String id;
        this.provider = src.provider;
    public String getDisplayName() {
    @Override
 *

    public void setParameters(Map<String, Object> parameters) {
 * limitations under the License.
        return (T) parameters.getOrDefault(name, defaultValue);

        this.displayName = displayName;
    }
        return iconURL;
    private SMAuthProviderCustomConfiguration() {
    public void setDisabled(boolean disabled) {
import org.jkiss.dbeaver.model.auth.SMAuthConfigurationReference;
    }
    }
