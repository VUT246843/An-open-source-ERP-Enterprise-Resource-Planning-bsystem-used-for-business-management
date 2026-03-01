    @Override
        @Override
    @Override

import java.util.List;

        public String getDisplayName() {
    }

        @Override
        }
        @Nullable
        private final String name;
 */
            return false;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        @Override

 * Unless required by applicable law or agreed to in writing, software
        }

 *
            return PropertyLength.LONG;
        return "<...>";
    }
        }


 * DBeaver - Universal Database Manager
        @Override

        public boolean isEditable(Object object) {
        }
 * you may not use this file except in compliance with the License.
        @Override
        public boolean isRequired() {
    private static class ItemPropertyDescriptor implements DBPPropertyDescriptor {
    public DBPPropertyDescriptor[] getProperties() {


    @Override
/*
        @Override
        }

            return null;
        public String getCategory() {
        items = new LinkedHashMap<>(map);
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {
        }
        public boolean isDesktop() {
        public boolean hasFeature(@NotNull String feature) {
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
    public String toString() {
        @Nullable
        public Object getDefaultValue() {
            return null;

        return false;
    public boolean isPropertySet(@NotNull String id)

    {
 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others


    }
    @Override

import java.util.LinkedHashMap;
        }
        public String getId() {
    private List<DBPPropertyDescriptor> props = new ArrayList<>();
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    {

public class PropertySourceMap implements DBPPropertySource {
            return false;
    }
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
        }
            return null;
    @NotNull
    }
        private final Object value;
    public boolean isPropertyResettable(@NotNull String id) {


package org.jkiss.dbeaver.runtime.properties;
        }
        }

        }

    public void resetPropertyValueToDefault(@NotNull String id) {
        public String getDescription() {

        }
    }
 * You may obtain a copy of the License at
        }
            this.name = name;
    private Map<?, ?> items;

    @Nullable
    }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
        @Override
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value)
            return name;
import org.jkiss.code.Nullable;

            return false;
        return props.toArray(new DBPPropertyDescriptor[props.size()]);
        return false;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
import org.jkiss.code.NotNull;
        ItemPropertyDescriptor(String name, Object value) {
            return Object.class;
    @Override
            return DBUtils.getObjectShortName(name);
    {
        }
        @Override
        @Override

        public String getHint() {
        @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
            props.add(new ItemPropertyDescriptor(entry.getKey(), entry.getValue()));
    @Override
        return items.get(id);
 *
        @Override

    @Override
        @Override
    }

        }
            return null;
import org.jkiss.dbeaver.model.DBUtils;
    }

    }
            return false;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
        return this;
    {
        @NotNull
            this.value = value;
    }
    public PropertySourceMap(Map<String, ?> map)
            return null;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    @Override
        @Override
        @NotNull
        public PropertyLength getLength() {
        public String[] getRequiredFeatures() {

    @Override
    public Object getEditableValue()
 */
/**
}
        }
    @NotNull
            return null;
        @Override
 * Map-based property source
    {
        @Override
        public String[] getFeatures() {
        public Class<?> getDataType() {
import java.util.ArrayList;
