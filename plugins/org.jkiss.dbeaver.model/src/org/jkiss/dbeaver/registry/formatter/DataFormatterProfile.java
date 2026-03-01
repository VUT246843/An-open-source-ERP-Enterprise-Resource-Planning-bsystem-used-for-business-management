            store.setToDefault(PROP_COUNTRY);
import org.jkiss.utils.CommonUtils;
import java.util.HashMap;
import java.io.IOException;
            loadProfile(store);
    private String name;
    @Override
    @NotNull
    @Override

        formatter.init(type, locale, formatterProps);
    public void setFormatterProperties(@NotNull DBPPreferenceStore store, @NotNull String typeId, @NotNull Map<String, Object> formatterProps)

    private static final String PROP_COUNTRY = "dataformat.profile.country"; //$NON-NLS-1$
                        return true;
    }
            }
        if (store instanceof SimplePreferenceStore) {
import org.jkiss.code.NotNull;
        this.name = name;
    {
        if (DBDDataFormatter.TYPE_NAME_NUMBER.equalsIgnoreCase(typeId)) {
import java.util.Locale;
    public DataFormatterProfile(String profileName, DBPPreferenceStore store)
                this.locale = new Locale(language);
        store.setValue(PROP_COUNTRY, locale.getCountry());
        store.setValue(PROP_VARIANT, locale.getVariant());
 *     http://www.apache.org/licenses/LICENSE-2.0
                for (DBPPropertyDescriptor prop : formatter.getProperties()) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    	loadProfile(store);
                DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId(), prop.getDataType());
                    if (prefStore.isSet(DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId())) {
                formatterProps.getOrDefault(NumberFormatSample.PROP_EXCLUDE_ID_COLUMNS, false)
            Object defaultValue = defaultProperties.get(prop.getId());
                this.locale = new Locale(language, country);

        }
            String country = store.getString(PROP_COUNTRY);
        Map<String, Object> defProps = descriptor.getSample().getDefaultProperties(locale);
                if (defaultValue != null) {
 * limitations under the License.
            }
            formatterProps.putAll(props);
import org.jkiss.dbeaver.model.impl.data.formatters.NumberFormatSample;
    }
        DataFormatterDescriptor formatter = DataFormatterRegistry.getInstance().getDataFormatter(typeId);
        return formatter;
        loadProfile(store);
    public void setProfileName(@NotNull String name)
                    PrefUtils.setPreferenceDefaultValue(store, DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId(), defaultValue);
    }
        if (!props.isEmpty()) {

/**
public class DataFormatterProfile implements DBDDataFormatterProfile, DBPPreferenceListener {
    {
            return false;

        return true;
            store.setToDefault(PROP_VARIANT);

 */
                formatterProps.put(NumberFormatSample.PROP_USE_GROUPING, false);
            for (DataFormatterDescriptor formatter : DataFormatterRegistry.getInstance().getDataFormatters()) {
                return true;
            store.setToDefault(PROP_LANGUAGE);
    @Override

                }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    public void preferenceChange(PreferenceChangeEvent event) {
    private static final String PROP_VARIANT = "dataformat.profile.variant"; //$NON-NLS-1$
    public static void initDefaultPreferences(DBPPreferenceStore store, Locale locale)
                }
    }
    }
        DataFormatterDescriptor descriptor = DataFormatterRegistry.getInstance().getDataFormatter(typeId);
                Object defaultValue = defaultProperties.get(prop.getId());

 * See the License for the specific language governing permissions and
        }
        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        if (defProps != null && !defProps.isEmpty()) {
            for (DataFormatterDescriptor formatter : DataFormatterRegistry.getInstance().getDataFormatters()) {
    }

 */
            } else if (CommonUtils.isEmpty(country)) {
    }
        DBDDataFormatter formatter = descriptor.createFormatter();
        return store;
 * DataFormatterProfile
                    }
            Map<String, Object> defaultProperties = formatter.getSample().getDefaultProperties(locale);

        Map<String, Object> formatterProps = new HashMap<>();
 * DBeaver - Universal Database Manager
        Map<String, Object> props = getFormatterProperties(store, typeId);
        return name;
    @Override
    {
 * distributed under the License is distributed on an "AS IS" BASIS,

            Object propValue = PrefUtils.getPreferenceValue(
    {
        }
/*
        for (DBPPropertyDescriptor prop : formatter.getProperties()) {
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
    public static final String DATAFORMAT_TYPE_PREFIX = DATAFORMAT_PREFIX + "type."; //$NON-NLS-1$
                this.locale = Locale.getDefault();
            SimplePreferenceStore prefStore = (SimplePreferenceStore) store;
                    store.setToDefault(DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId());
    {
            );

        if (store instanceof SimplePreferenceStore) {
            if (propValue != null && !CommonUtils.equalObjects(defaultValue, propValue)) {
            } else {

    }
                }
        for (DataFormatterDescriptor formatter : DataFormatterRegistry.getInstance().getDataFormatters()) {


    @Override
    public DBPPreferenceStore getPreferenceStore()
        loadProfile(store);
    {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            boolean excludeIds = CommonUtils.toBoolean(
        }
                formatterProps.put(prop.getId(), propValue);
        this.store = store;
        Map<String, Object> defaultProperties = formatter.getSample().getDefaultProperties(locale);

package org.jkiss.dbeaver.registry.formatter;
 * You may obtain a copy of the License at

        Map<String, Object> formatterProps = new HashMap<>();
        this.name = profileName;
    public Map<String, Object> getFormatterProperties(@NotNull DBPPreferenceStore store, @NotNull String typeId)
 *
    {
                PrefUtils.setPreferenceValue(store, DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId(), propValue);
    @NotNull
            }
            }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                this.locale = new Locale(language, country, variant);
    {
            }

    private DBPPreferenceStore store;
    {
    public void saveProfile(@NotNull DBPPreferenceStore store) throws IOException
    @Override
            formatterProps.putAll(defProps);
    @Override
            }
        for (DBPPropertyDescriptor prop : formatter.getProperties()) {
                store,
    private static final String PROP_LANGUAGE = "dataformat.profile.language"; //$NON-NLS-1$
        }
        DataFormatterDescriptor formatter = DataFormatterRegistry.getInstance().getDataFormatter(typeId);
        return formatterProps;
    @Override
            if (CommonUtils.isEmpty(language)) {
        if (descriptor == null) {

        }
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
            // Reload this profile
            Object propValue = formatterProps == null ? null : formatterProps.get(prop.getId());
 *
    }
    {
    public String getProfileName()
        if (event.getProperty() != null && event.getProperty().startsWith(DATAFORMAT_PREFIX)) {
        store.setValue(PROP_LANGUAGE, locale.getLanguage());
        }

 *

    public void reset(@NotNull DBPPreferenceStore store)
    private void loadProfile(DBPPreferenceStore store)
    public DBDDataFormatter createFormatter(@NotNull String typeId, DBSTypedObject type)
        }
                for (DBPPropertyDescriptor prop : formatter.getProperties()) {
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
    @Override
            // Set all formatter properties to default
            String language = store.getString(PROP_LANGUAGE);

    public Locale getLocale()
    	
            if (propValue != null) {

    public void setLocale(@NotNull Locale locale)
    @Override
                && (DBStructUtils.isPrimaryKey(column) || DBStructUtils.isForeignKey(column))) {

    public boolean isOverridesParent()



    }
import java.util.Map;
            if (prefStore.isSet(PROP_LANGUAGE) || prefStore.isSet(PROP_COUNTRY) || prefStore.isSet(PROP_VARIANT)) {
    @NotNull
    }
        PrefUtils.savePreferenceStore(store);
    {
    @NotNull
        throws ReflectiveOperationException
}

    {
            } else if (CommonUtils.isEmpty(variant)) {
        this.locale = locale;
    {
        }
            if (excludeIds && type instanceof DBSTableColumn column
    }

            String variant = store.getString(PROP_VARIANT);
    }
    @Override
    @Override
            }
                store.setToDefault(DATAFORMAT_TYPE_PREFIX + formatter.getId() + "." + prop.getId());
import org.jkiss.dbeaver.model.struct.DBStructUtils;
        return locale;
    public static final String DATAFORMAT_PREFIX = "dataformat."; //$NON-NLS-1$

        }
            } else {
            throw new IllegalArgumentException("Formatter '" + typeId + "' not found");
            }
            for (DBPPropertyDescriptor prop : formatter.getProperties()) {
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
    private Locale locale;
 * Unless required by applicable law or agreed to in writing, software
    }
            //Map<String, Object> formatterProps = new HashMap<>();
        {
import org.jkiss.dbeaver.utils.PrefUtils;
