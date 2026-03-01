    }
    public List<T> getSettings() {
    private final List<PropertyGroupDescriptor<T>> subGroups = new ArrayList<>();
    @NotNull
    @NotNull
    public String getId() {
import java.util.ArrayList;

        this.label = cfg.getAttribute("label");
    @NotNull
        return (getParentGroup() != null ? (parentGroup.getFullId() + "/") : "") + getId();
import java.util.List;
    private final String id;
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;
 *
        this.subGroups.add(subGroup);

        return id;
/*
    public PropertyGroupDescriptor<T> getParentGroup() {
    @NotNull
    }
    }
        return List.copyOf(properties);
    }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    public PropertyGroupDescriptor(IConfigurationElement cfg) {
 *
package org.jkiss.dbeaver.model.impl;
        super(cfg);
    }
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public void addProperty(@NotNull T setting) {

public class PropertyGroupDescriptor<T extends PropertyDescriptor> extends AbstractDescriptor {
    public void setParentGroup(@NotNull PropertyGroupDescriptor<T> parentGroup) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void addSubGroup(@NotNull PropertyGroupDescriptor<T> subGroup) {
    }
    @Nullable
import org.jkiss.code.Nullable;

 * distributed under the License is distributed on an "AS IS" BASIS,
        return parentGroup;

 * Unless required by applicable law or agreed to in writing, software
        this.parentGroup = parentGroup;


 *
    @NotNull

    public String getDisplayName() {
    private PropertyGroupDescriptor<T> parentGroup;

        this.id = cfg.getAttribute("id");

    }
    public String getFullId() {
        this.properties.add(setting);
    }
    public List<PropertyGroupDescriptor<T>> getSubGroups() {

        return CommonUtils.isEmpty(label) ? getId() : label;
import org.eclipse.core.runtime.IConfigurationElement;
    private final String label;
    }
    private final List<T> properties = new ArrayList<>();
 * you may not use this file except in compliance with the License.
        return subGroups;

 */
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
