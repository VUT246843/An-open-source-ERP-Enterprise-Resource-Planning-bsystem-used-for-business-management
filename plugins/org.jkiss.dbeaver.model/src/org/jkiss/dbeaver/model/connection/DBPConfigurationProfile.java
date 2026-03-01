    }

 * you may not use this file except in compliance with the License.

    public void setProperties(Map<String, String> properties) {
    }
        this.profileId = profileId;
    // Properties. Basically JSON
        return profileId;
        if (!CommonUtils.isEmpty(source.properties)) {

import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.utils.CommonUtils;
import java.util.LinkedHashMap;
        if (CommonUtils.isEmpty(profileId)) {
        }
import org.jkiss.dbeaver.model.secret.DBPSecretHolder;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return profileName;

    private Map<String, String> properties = new LinkedHashMap<>();
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.connection;
    }
/*
    }
    private String profileId;
        this.profileDescription = profileDescription;

    }
    }
public abstract class DBPConfigurationProfile implements DBPSecretHolder {

 */
    }
        return profileDescription;
    public String getProfileId() {
    public String toString() {
        this.profileName = profileName;

import org.jkiss.code.Nullable;



 * Unless required by applicable law or agreed to in writing, software


    public DBPConfigurationProfile(DBPConfigurationProfile source) {
 * DBeaver - Universal Database Manager

    @Nullable
    }
    private String profileDescription;
        this.project = null;
 *
            return profileName;
        return null;
 *
        return profileName;
    public DBPProject getProject() {

        this.profileId = source.profileId;
    private String profileName;
    }
    public String getProfileName() {
 * limitations under the License.
    public boolean isExternallyProvided() {
    public void setProfileId(String profileId) {
/**
    }
    public void setProfileDescription(String profileDescription) {
 * You may obtain a copy of the License at
        this.project = project;
        this.profileName = source.profileName;
 *
        }
    public Map<String, String> getProperties() {
        return properties;
    public void setProfileName(String profileName) {
}
        return project == null;
    private final transient DBPProject project;
        return project;
 * Licensed under the Apache License, Version 2.0 (the "License");

    public String getProfileDescription() {
import java.util.Map;
    }
    public DBPConfigurationProfile(@Nullable DBPProject project) {
    }
 */
    public DBPConfigurationProfile() {
        this.profileDescription = source.profileDescription;


    }
 * See the License for the specific language governing permissions and
        this.properties = properties;
    public String getProfileSource() {

    @Override
        this.project = source.project;

    @Nullable
            this.properties = new LinkedHashMap<>(source.properties);
    }


    }
 * Configuration profile.
 * Copyright (C) 2010-2024 DBeaver Corp and others

