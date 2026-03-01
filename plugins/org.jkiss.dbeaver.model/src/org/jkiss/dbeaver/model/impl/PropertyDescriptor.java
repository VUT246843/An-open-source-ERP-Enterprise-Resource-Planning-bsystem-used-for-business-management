            final String[] values = valueList.split(VALUE_SPLITTER);
 * limitations under the License.
    }
        }
            return GeneralUtils.convertString(value, valueType);
    @Override
    private String name;
    public enum PropertyType {
    private static final String ATTR_DESKTOP = "desktop";

    {

        this.name = name;
        return props.toArray(new DBPPropertyDescriptor[0]);
    protected static String getPropertyCategory(IConfigurationElement config) {
    }
    public static final String NAME_UNDEFINED = "<undefined>"; //NON-NLS-1
        return name;


            return valueType;
        List<DBPPropertyDescriptor> props = new ArrayList<>();
    public String getDescription() {
        String featuresString = config.getAttribute(ATTR_FEATURES);
        return description;

        t_string(String.class),
                type = propertyType.getValueType();
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;
    }
        } else {

    private boolean allowCustomValues = true;
 * DBeaver - Universal Database Manager
    public static final String TAG_PROPERTY = "property"; //NON-NLS-1
        String typeString = config.getAttribute(ATTR_TYPE);

package org.jkiss.dbeaver.model.impl;
        this.allowCustomValues = CommonUtils.getBoolean(config.getAttribute(ATTR_ALLOW_CUSTOM_VALUES), true);
    }
        this.desktop = false;
        t_double(Double.class),
    private final boolean hidden;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static final String ATTR_TYPE = "type"; //NON-NLS-1
 * You may obtain a copy of the License at
    @Override
    @Override
}
        this.defaultValue = defaultValue;
        return category;
            type = String.class;
        return ArrayUtils.isEmpty(validValues) || allowCustomValues;
        this.desktop = false;
        this.editable = true;
        this.length = CommonUtils.valueOf(PropertyLength.class, config.getAttribute(ATTR_LENGTH), PropertyLength.LONG);
        this.defaultValue = defaultValue;
        String category = getPropertyCategory(config);

        return propertyType;
    }
        t_short(Short.class),
    }
    public static final String ATTR_DESCRIPTION = "description"; //NON-NLS-1
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String ATTR_ID = "id"; //NON-NLS-1
            if (CommonUtils.isEmpty(category)) {
    }
        return hidden;
        private final Class<?> valueType;
        return id;
    @Override
    private transient Class<?> type;
        this.id = config.getAttribute(ATTR_ID);
        }
        return type;

        t_integer(Integer.class),
    public Class<?> getDataType() {
        return allFeatures;
        PropertyType(Class<?> valueType) {
            validValues = new Object[values.length];
        this.type = type;
    private static final String ATTR_REQUIRED = "required"; //NON-NLS-1
    public boolean isEditable(Object object) {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        this.validValues = validValues;
                category = NAME_UNDEFINED;
            category = config.getAttribute(ATTR_LABEL);
    public boolean isDesktop() {
        for (IConfigurationElement prop : propElements) {
        }

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return hint;
        }
    public PropertyType getPropertyType() {
        t_boolean(Boolean.class),
    @NotNull
        this.description = description;
    private static final String ATTR_HIDDEN = "hidden";
    public static final String ATTR_LABEL = "label"; //NON-NLS-1
    }
        this.hint = null;
        return name;
        this.id = id;
    }
    public String getHint() {
                validValues[i] = convertString(values[i], type);
    @NotNull
        if (!CommonUtils.isEmpty(featuresString)) {
    @NotNull

        @NotNull String id,


            }
                propertyType = PropertyType.valueOf("t_" + typeString);
            this.features = featuresString.split(",");
    public PropertyLength getLength() {
    }
            this.valueType = valueType;
    public boolean isHidden() {
        }
    public String[] getFeatures() {
        return validValues;
    private static final String ATTR_LENGTH = "length";
    public boolean hasFeature(@NotNull String feature) {
    private PropertyType propertyType;


        this.editable = true;
 *
    }
        this.id = id;
        this.hint = config.getAttribute(ATTR_HINT);
    public static final String ATTR_HINT = "hint"; //NON-NLS-1
    private final boolean desktop;
/*
    private final PropertyLength length;

    private Object defaultValue;

    }
    @NotNull

    public Object getDefaultValue() {
    }
    private String[] features;
        this.required = required;
        Object defaultValue,
        public Class<?> getValueType() {
    }
    public static final String TAG_PROPERTY_GROUP = "propertyGroup"; //NON-NLS-1
    private final boolean required;

    private Object[] validValues;

import java.util.List;
    public PropertyDescriptor(
            for (int i = 0, valuesLength = values.length; i < valuesLength; i++) {
    }
        return category;
    private static final String ATTR_FEATURES = "features";
    }
    @Override
            try {
        this.defaultValue = defaultValue;
 */
    private static final String VALUE_SPLITTER = ","; //NON-NLS-1

                type = String.class;
                log.warn(ex);
    }
        t_numeric(Double.class),
        this.required = required;
        this.editable = editable;
        this.desktop = CommonUtils.getBoolean(config.getAttribute(ATTR_DESKTOP), false);
        return defaultValue;
        this.name = name;
        this.hidden = false;
        boolean required,



    }
        }
    @Override
    public static DBPPropertyDescriptor[] extractPropertyGroups(IConfigurationElement config) {

        }
 */
            properties.add(new PropertyDescriptor(category, prop));
        return editable;
                allFeatures = new String[] { "required" };
    public String getName() {
    private final String id;
    public boolean isRequired() {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        if (isRequired()) {
        this.hidden = CommonUtils.getBoolean(config.getAttribute(ATTR_HIDDEN), false);

        if (valueList != null) {
    @Nullable
        }
    public Object[] getPossibleValues(Object object) {

        List<DBPPropertyDescriptor> properties = new ArrayList<>();
        this.category = category;
    @Override
    }

import org.jkiss.dbeaver.Log;
        Class<?> type,
    }
    @Override
    }
import java.util.Date;
    }
        String name,
        String valueList = config.getAttribute(ATTR_VALID_VALUES);
import org.jkiss.code.Nullable;
        return desktop;
    @Override

        this.category = category;
            return new SimpleDateFormat(pattern).format(new Date());
 *
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    private static final String ATTR_ALLOW_CUSTOM_VALUES = "allowCustomValues";
            }
    @Override
    @Override
    private final String hint;

 *
            String pattern = value.substring(9, value.length() - 1);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    public static final String CURRENT_DATE_STRING_VAR_PREFIX = "${now as ";
    public String[] getRequiredFeatures() {

        t_file(String.class);
        return required;


 * PropertyDescriptor

    }
    public static List<DBPPropertyDescriptor> extractProperties(IConfigurationElement config) {
        } else {
        Object[] validValues)

            propertyType = PropertyType.t_string;
        this.hidden = false;
        this.defaultValue = convertString(config.getAttribute(ATTR_DEFAULT_VALUE), type);
    @Override
            }

 * See the License for the specific language governing permissions and
        return length;
/**
        t_float(Float.class),
            this.name = CommonUtils.toString(this.id);
            } else {
import org.jkiss.utils.ArrayUtils;
        }
    @Override
    private final boolean editable;
    }
        t_long(Long.class),
    public void setName(@NotNull String name) {
    @NotNull
    @Override
        this.description = config.getAttribute(ATTR_DESCRIPTION);



        this.length = PropertyLength.LONG;


        this.length = PropertyLength.LONG;
        return properties;
    @Override
        return id + " (" + name + ")";
    }
                allFeatures = ArrayUtils.add(String.class, allFeatures, "required");
    private static final Log log = Log.getLog(PropertyDescriptor.class);

        }
    @Override
    @NotNull
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public PropertyDescriptor(String category, @NotNull String id, String name, String description, Class<?> type, boolean required, Object defaultValue, String[] validValues, boolean editable) {
        if (TAG_PROPERTY_GROUP.equals(config.getName())) {
    public String getId() {

 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.hint = null;
    }
        for (IConfigurationElement prop : ArrayUtils.safeArray(config.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))) {
    public String getDisplayName() {
        if (typeString == null) {
    public static Object convertString(String value, Class<?> valueType) {
    @Nullable
        this.name = config.getAttribute(ATTR_LABEL);
        return features != null && ArrayUtils.contains(features, feature);
        this.type = type;
        if (!CommonUtils.isEmpty(value) && valueType == String.class && value.startsWith(CURRENT_DATE_STRING_VAR_PREFIX)) {
    }
    public void setDefaultValue(Object defaultValue) {
    @Override
        return null;
            if (allFeatures == null) {
    public boolean allowCustomValue() {
    }
    private static final String ATTR_DEFAULT_VALUE = "defaultValue"; //NON-NLS-1
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.description = description;
        this.name = name;
    @NotNull
        String category,
        this.validValues = validValues;
    }
public class PropertyDescriptor implements DBPPropertyDescriptor, IPropertyValueListProvider<Object>, DBPNamedObject2 {
    @Override
    public PropertyDescriptor(String category, IConfigurationElement config) {
        String description,
    @Override
        String[] allFeatures = features;
import java.util.ArrayList;
import org.jkiss.dbeaver.utils.GeneralUtils;
import java.text.SimpleDateFormat;
    private final String category;
        this.category = category;
        String category = NAME_UNDEFINED;
            } catch (IllegalArgumentException ex) {
            props.addAll(PropertyDescriptor.extractProperties(prop));
            }
import org.eclipse.core.runtime.IConfigurationElement;
    private static final String ATTR_VALID_VALUES = "validValues"; //NON-NLS-1
    private final String description;
        IConfigurationElement[] propElements = config.getChildren(PropertyDescriptor.TAG_PROPERTY);
        this.required = CommonUtils.getBoolean(config.getAttribute(ATTR_REQUIRED));
    public String toString() {
    public String getCategory() {
        if (CommonUtils.isEmpty(this.name)) {
