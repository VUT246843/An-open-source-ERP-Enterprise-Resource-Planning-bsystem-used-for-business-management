        this.credentialProfiles = credentialProfiles;


 *
 * Unless required by applicable law or agreed to in writing, software

    public List<SMAuthProviderCustomConfiguration> getCustomConfigurations() {
import org.jkiss.dbeaver.model.auth.AuthPropertyDescriptor;
    }

 * DBeaver - Universal Database Manager

    public void setIcon(String icon) {

    }


    }
 */
        this.customConfigurations = customConfigurations;

 * distributed under the License is distributed on an "AS IS" BASIS,
        this.id = id;
        return label;
    }
    public void setDescription(String description) {
    }
    public void setCredentialProfiles(List<SMAuthCredentialsProfile> credentialProfiles) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }
    public String getIcon() {
 * Auth provider descriptor
            for (AuthPropertyDescriptor prop : profile.getCredentialParameters()) {
    }
        return customConfigurations;

    }
                }
        return id + " (" + label + ")";
    public void setId(String id) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
    public void addCustomConfiguration(SMAuthProviderCustomConfiguration customConfiguration) {
 *
        return icon;
    private String label;

        return description;
    public String getId() {
package org.jkiss.dbeaver.model.security;
 * you may not use this file except in compliance with the License.
    }
    public String getDescription() {
 * See the License for the specific language governing permissions and
/*
    public String toString() {
    }
        return id;
        return credentialProfiles;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private List<SMAuthProviderCustomConfiguration> customConfigurations;

                    return true;
    private List<SMAuthCredentialsProfile> credentialProfiles;



    }
    }
 * limitations under the License.
    private String description;
/**

        this.description = description;
    private String icon;
        if (this.customConfigurations == null) {
    }
    }
        this.icon = icon;
            this.customConfigurations = new ArrayList<>();
    public boolean hasUserParameters() {
    }
    }
 */
        return false;

 *     http://www.apache.org/licenses/LICENSE-2.0
        }

        }
 *
        this.customConfigurations.add(customConfiguration);
}

    public void setCustomConfigurations(List<SMAuthProviderCustomConfiguration> customConfigurations) {
    public String getLabel() {
                if (prop.isUser()) {
public class SMAuthProviderDescriptor {
    private String id;
import java.util.List;
import java.util.ArrayList;
        for (SMAuthCredentialsProfile profile : credentialProfiles) {
    public List<SMAuthCredentialsProfile> getCredentialProfiles() {
    public SMAuthProviderDescriptor() {
    public void setLabel(String label) {

 * You may obtain a copy of the License at
        this.label = label;

