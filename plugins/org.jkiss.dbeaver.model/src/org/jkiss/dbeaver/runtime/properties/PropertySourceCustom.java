    {

    public Object getEditableValue() {
    public void setDefValueResolver(@NotNull IVariableResolver defValueResolver) {
    }
 * Unless required by applicable law or agreed to in writing, software
                            } else {
                            if ((dataType == null || CharSequence.class.isAssignableFrom(dataType))

    public void addProperties(@NotNull Collection<? extends DBPPropertyDescriptor> properties) {
        return !CommonUtils.equalObjects(getDefaultValue(value), defaultValue);
        this.originalValues = new HashMap<>();
        final Object defaultValue = property.getDefaultValue();
                originalValues.put(id, null);
            return null;
            }
                originalValues.put(id, defaultValues.get(id));
            final Object defaultValue = prop.getDefaultValue();
    }
        if (id == null) {
    public DBPPropertyDescriptor[] getProperties() {
        }
    }

                prop.setValue(getDefaultValue(prop.getValue()));
        // Set only allowed properties + transform property types
        }
    }
            } else if (defaultValues.containsKey(id)) {
        if (!originalValues.containsKey(id)) {
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value) {
            if (defaultValue != null) {
                originalValues.put(id, propValues.get(id));
            }
    }
        for (DBPPropertyDescriptor prop : properties) {
    {

    @Override
        if (defaultValue != null) {
    }
        setValues(values);
        }
 */
    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id) {
    }
                    }
    public Map<String, Object> getPropertyValues() {
        }
                                // It will turn into default value
                        }
    }

        }
        addProperties(properties);
            }
                                // Do nothing let it be empty, because if we will store here null value
        this.defValueResolver = defValueResolver;


/*
        }
    @Override
        return defaultValue;

        if (values != null) {
    }
        final Object value = getPropertyValue(null, id);
        this.defaultValues = defaultValues;
        addProperties(properties);
    @NotNull
    @Override
        } else {
 *
    public PropertySourceCustom(@NotNull DBPPropertyDescriptor[] properties, @NotNull Map<String, ?> values) {
    }
        Collections.addAll(props, properties);
        if (value == null) {
    public Map<String, Object> getPropertiesWithDefaults() {
    }
            value = originalValues.get(id);
/**
        props.add(property);
package org.jkiss.dbeaver.runtime.properties;
                            Class<?> dataType = prop.getDataType();
            for (Map.Entry<String, Object> prop : allValues.entrySet()) {
        allValues.putAll(propValues);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
            if (defaultValue != null) {
    }
        propValues.clear();
import java.util.*;
import org.jkiss.code.Nullable;
 *
    }
            }
 * limitations under the License.
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
        }

            return false;
    public void removeAll() {
                for (DBPPropertyDescriptor prop : props) {
        if (value == null || value.equals(originalValues.get(id))) {
    }
        Map<String, Object> allValues = new HashMap<>(originalValues);
        Object value = propValues.get(id);
    public PropertySourceCustom() {
            return GeneralUtils.replaceVariables((String) defaultValue, defValueResolver);
        final Object defaultValue = getDefaultValue(defaultValues.get(id));
    {
import org.jkiss.dbeaver.runtime.IVariableResolver;

                        originalValues.put(value.getKey(), propValue);
        propValues.remove(id);
        }
    @NotNull
 *
    @NotNull
                                propValue = GeneralUtils.convertString((String) propValue, dataType);
    @NotNull
        return true;
        props.clear();

    public void resetPropertyValueToDefault(@NotNull String id) {
    }
        }
        }
    }

                }
    @Override
    @Nullable
    private final List<DBPPropertyDescriptor> props = new ArrayList<>();

        return this;
            propValues.remove(id);
                    if (prop.getId().equals(value.getKey())) {

                defaultValues.put(prop.getId(), defaultValue);
 * DBeaver - Universal Database Manager
        return value != null ? getDefaultValue(value) : null;

        return allValues;
        for (DBPPropertyDescriptor prop : properties) {
    public boolean isPropertyResettable(@NotNull String id)
        propValues.remove(id);
        props.addAll(properties);
                Object propValue = value.getValue();
}
import org.jkiss.code.NotNull;
    public void setDefaultValues(@NotNull Map<String, Object> defaultValues)
        setValues(values);
 *     http://www.apache.org/licenses/LICENSE-2.0


        defaultValues.clear();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        originalValues.remove(id);
            final Object defaultValue = prop.getDefaultValue();
    public void addProperties(DBPPropertyDescriptor[] properties) {
        Map<String, Object> allValues = new HashMap<>(defaultValues);
        if (value == null) {

        this.defaultValues.putAll(defaultValues);
            value = defaultValues.get(id);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    public PropertySourceCustom(@NotNull Collection<? extends DBPPropertyDescriptor> properties, @Nullable Map<String, ?> values) {
    private Map<String, Object> originalValues = new TreeMap<>();
        if (value == null) {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    @Override
    @Override
                        if (propValue instanceof String) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
                                && ((String) propValue).isEmpty()) {
            } else {
    private final Map<String, Object> propValues = new TreeMap<>();

        if (defValueResolver != null && defaultValue instanceof String) {
    @Override
            propValues.put(id, value);
    private Map<String,Object> defaultValues = new TreeMap<>();
        allValues.putAll(propValues);
            }

            for (Map.Entry<String, ?> value : values.entrySet()) {

            defaultValues.put(property.getId(), defaultValue);
                            }

        return props.toArray(new DBPPropertyDescriptor[0]);


    public void setValues(@Nullable Map<String, ?> values) {
 * Simple property source which store properties in map
    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    public boolean isPropertySet(@NotNull String id) {
    {
 */
        return allValues;
    public void addDefaultValues(@NotNull Map<String, ?> defaultValues)
        allValues.putAll(originalValues);
    public void addProperty(@NotNull DBPPropertyDescriptor property) {
        originalValues.clear();
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
        if (defValueResolver != null) {
        }
    }
                        break;
                defaultValues.put(prop.getId(), defaultValue);
    private IVariableResolver defValueResolver = null;
            if (propValues.containsKey(id)) {
    }
    }

public class PropertySourceCustom implements DBPPropertySource {
    private Object getDefaultValue(Object defaultValue) {

