    }

        this.required = descriptor.isRequired();
    public String getDescription() {
    public boolean isRequired() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String category;

    private String description;

    }
        this.required = required;
    public SMPropertyDescriptor(DBPPropertyDescriptor descriptor) {
    private String displayName;
 * You may obtain a copy of the License at
    }
        return description;

    }
    public String[] getFeatures() {
    private String[] features;
        this.description = descriptor.getDescription();
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public void setDisplayName(String displayName) {
        return required;

}
    }
        this.category = category;
        this.id = id;
        this.description = description;
    public void setDescription(String description) {

    }
        return id;


    private PropertyLength length;
    public PropertyLength getLength() {
        return length;
    public String getDisplayName() {

    public void setCategory(String category) {
    public SMPropertyDescriptor() {

    public void setRequired(boolean required) {

import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    }
 * you may not use this file except in compliance with the License.
        this.length = descriptor.getLength();
        return displayName;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.displayName = descriptor.getDisplayName();
    }

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model.security;
    }

 *
    }
    }
 * Unless required by applicable law or agreed to in writing, software

        return category;
    public void setId(String id) {
    public void setLength(PropertyLength length) {
 * See the License for the specific language governing permissions and
    }
    public String getId() {
    }
        this.length = length;
    }
public class SMPropertyDescriptor {
    private String id;
 *
        this.features = descriptor.getFeatures();
    }
        this.features = features;


        this.id = descriptor.getId();
/*
 */
    public void setFeatures(String[] features) {
    private boolean required;
 *
        this.displayName = displayName;
 * DBeaver - Universal Database Manager
        return features;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public String getCategory() {
