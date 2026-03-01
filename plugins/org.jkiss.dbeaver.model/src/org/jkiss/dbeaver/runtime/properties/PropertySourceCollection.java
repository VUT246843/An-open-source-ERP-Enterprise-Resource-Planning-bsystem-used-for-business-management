            this.item = item;
    public String toString() {

/**

    }
        public PropertyLength getLength() {
 * Simple property source which store properties in map
        @Override

        }
 *
    @NotNull
            return DBUtils.getObjectShortName(item);
 * Copyright (C) 2010-2026 DBeaver Corp and others

        @Nullable

            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
            return false;
            return false;
    @Override
        }
        }
        public boolean isDesktop() {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        }
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    @Override

        @NotNull
    public DBPPropertyDescriptor[] getProperties() {

    public Object getEditableValue()

    @Override
        }
    }

    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
            return null;
import org.jkiss.code.NotNull;
            props.add(new ItemPropertyDescriptor(String.valueOf(i), items.get(i)));
import java.util.Collection;
        }
        public String getDescription() {

    public boolean isPropertyResettable(@NotNull String id) {
    }
        return false;

        }
    private final List<DBPPropertyDescriptor> props = new ArrayList<>();
        }
    }

            return false;
    }
        items = new ArrayList<>(collection);
        }
        public Object getDefaultValue() {
        }

        @NotNull
    {
    public PropertySourceCollection(@NotNull Collection<?> collection) {

        return props.toArray(new DBPPropertyDescriptor[0]);
    }
        @Override
    private static class ItemPropertyDescriptor implements DBPPropertyDescriptor {
/*
        for (int i = 0; i < items.size(); i++) {

            this.id = id;
        public Class<?> getDataType() {

        return false;
        }
            return PropertyLength.LONG;
 * DBeaver - Universal Database Manager


    private final List<Object> items;
        @Override
 * limitations under the License.
    @Override
        @Nullable
    @Override
import org.jkiss.utils.CommonUtils;
        }
        @Override
        @Override



 *
    }
import java.util.List;
            return null;
        @Override
        }
 * You may obtain a copy of the License at
    }
    }
        public String getCategory() {

            return null;
import org.jkiss.dbeaver.model.DBUtils;
        public String getHint() {
        public String[] getRequiredFeatures() {
import org.jkiss.dbeaver.model.meta.PropertyLength;

    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
        public boolean isEditable(Object object) {
        return items.get(CommonUtils.toInt(id));
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
        return this;
    @Override

        @NotNull
        public boolean isRequired() {
        public String getDisplayName() {
package org.jkiss.dbeaver.runtime.properties;

    public boolean isPropertySet(@NotNull String id)
        @Override

    @Nullable
            return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
 */
        @Override
        private ItemPropertyDescriptor(@NotNull String  id, Object item) {
        }
    {
 *
        @Override
        @Override
 * See the License for the specific language governing permissions and
        private final Object item;
        @Override

        public String getId() {
        @Override
 * you may not use this file except in compliance with the License.
        @Override
}
public class PropertySourceCollection implements DBPPropertySource {
        private final String id;
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        return "[...]";
        }

            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {

import java.util.ArrayList;

        public boolean hasFeature(@NotNull String feature) {
    @Override
            return Object.class;
            //props.addAll(ObjectPropertyDescriptor.extractAnnotations(this, item.getClass(), null));
 */
import org.jkiss.code.Nullable;
            return false;
            return id;
    }
    public void resetPropertyValueToDefault(@NotNull String id) {
    }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        public String[] getFeatures() {
        @Override

