    @Override
    @Override
            firePropertyChangeEvent(name, oldValue, value);
            firePropertyChangeEvent(name, oldValue, value);

    }
    @Override
    @Override
    }
            dirty = true;
        }
        SimplePreferenceStore copy = (SimplePreferenceStore)obj;
    public String getString(@NotNull String name)
    public boolean contains(@NotNull String name)

    {
    {
            // FIXME: In any case we have to remove listener at dispose to avoid leaks and dead links.
            //parentStore.addPropertyChangeListener(this);
    public long getLong(@NotNull String name)
    {
    @Override
    public double getDefaultDouble(@NotNull String name)
        if (oldValue != value || !isSet(name)) {
    public void setDefault(@NotNull String name, int value)
            // FIXME: but i'm not 100% sure.
    }
        removeListenerObject(listener);
    {
            dirty = true;
    private Map<String, String> properties;
        }
import org.jkiss.code.NotNull;
        }
        long oldValue = getLong(name);
        }
    }
        }
        String value = properties.get(name);
        this.properties = new HashMap<>(properties);
    }

    }

        if (oldValue != value || !isSet(name)) {

    public void setDefault(@NotNull String name, @Nullable String value)
        defaultProperties.put(name, String.valueOf(value));
    }
    {
 * limitations under the License.
    public Map<String, String> getDefaultProperties()
    public boolean equals(Object obj) {
    public SimplePreferenceStore()
            properties.put(name, value);
    protected SimplePreferenceStore(DBPPreferenceStore parentStore)
    }
    {
    public void setToDefault(@NotNull String name)
 * You may obtain a copy of the License at
    public void addPropertyChangeListener(@NotNull DBPPreferenceListener listener)
    }
    }
            firePropertyChangeEvent(name, oldValue, value);

            dirty = true;
    }
    {
    }

import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
        if (oldValue != value || !isSet(name)) {
 */
            }
    }
        return toLong(getDefaultString(name));
    public Map<String, String> getProperties()
    {
    public boolean isSet(String name)

        return properties.containsKey(name);
    }
    }
        Object newValue = null;

    @Override
        this.parentStore = parentStore;
public abstract class SimplePreferenceStore extends AbstractPreferenceStore {

        return toInt(getString(name));
        if (value == null && parentStore != null) {
import java.util.Map;
    }
    @Override


        float oldValue = getFloat(name);
    public void setValue(@NotNull String name, int value)

        return toDouble(getDefaultString(name));
    @Override
import org.jkiss.utils.CommonUtils;
    private boolean dirty = false;
    private DBPPreferenceStore parentStore;
    }
        Object oldValue = properties.get(name);
    }
            firePropertyChangeEvent(name, oldValue, value);
    }
        defaultProperties.put(name, String.valueOf(value));
 *
    }
    {
            properties.put(name, String.valueOf(value));
        String oldValue = getString(name);
    @Override
        properties.remove(name);
        return properties;
    public float getFloat(@NotNull String name)
    public int getDefaultInt(@NotNull String name)
    {
        int oldValue = getInt(name);
    }
        return value;
        return dirty;
        if (!(obj instanceof SimplePreferenceStore)) {
        defaultProperties.put(name, String.valueOf(value));
            newValue = defaultProperties.get(name);
    @Override
            // FIXME: ? adding self as parent change listener produces too many events. And this seems to be senseless.
        return toFloat(getDefaultString(name));

        }
    @Override
    public void setValue(@NotNull String name, boolean value)
            CommonUtils.equalObjects(properties, copy.properties) &&

        properties = new HashMap<>();
    {

    public DBPPreferenceStore getParentStore()
    {



    @Override
    }

    public boolean getDefaultBoolean(@NotNull String name)
    @Override
    {
 * Unless required by applicable law or agreed to in writing, software
                value = defaultProperties.get(name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    }
    @Override
            CommonUtils.equalObjects(parentStore, copy.parentStore) &&
        return toInt(getDefaultString(name));
    {
                return "";
            dirty = true;
    {
    @Override
    {

    {
        return toBoolean(getDefaultString(name));
        return properties.keySet().toArray(new String[0]);
    }

        }
    }
        boolean oldValue = getBoolean(name);
        return properties.containsKey(name);
        return toLong(getString(name));
    }
 *
    public void setProperties(Map<String, String> properties)

    }

        return defaultProperties;
            if (parentStore.isDefault(name)) {
                return parentStore.getDefaultString(name);
        if (oldValue == null || !oldValue.equals(value) || !isSet(name)) {
    {
    }
    }
            }

 */
    {
    @Override

    @Override
    public long getDefaultLong(@NotNull String name)
    {

    public boolean needsSaving()
        return value;
    @Override
 * Originally copied from standard PreferenceStore class
    @Override
            properties.put(name, String.valueOf(value));
    {
                : Boolean.FALSE, value ? Boolean.TRUE : Boolean.FALSE);
/*
            properties.put(name, String.valueOf(value));
                value = parentStore.getString(name);
    public boolean getBoolean(@NotNull String name)
        addListenerObject(listener);
    public void removePropertyChangeListener(@NotNull DBPPreferenceListener listener)
            dirty = true;
    {
    }
        this.defaultProperties = new HashMap<>(defaultProperties);
    {
            dirty = true;
        defaultProperties.put(name, String.valueOf(value));
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        firePropertyChangeEvent(name, oldValue, newValue);

    @Override
        defaultProperties = new HashMap<>();
    {
    public int getInt(@NotNull String name)
    }
            }
    public void setValue(@NotNull String name, long value)
            if (value == null) {
    @Override

    @Override
/**
        dirty = true;
            } else {


        if (value == null && parentStore != null) {
import org.jkiss.code.Nullable;
    public void clear()
    {
        return toFloat(getString(name));
    {
    public void setValue(@NotNull String name, float value)

    public void setDefault(@NotNull String name, long value)
        defaultProperties.put(name, String.valueOf(value));
    }
    {
        if (defaultProperties != null) {
    {
 * you may not use this file except in compliance with the License.
        return toDouble(getString(name));
 * However, save will always use THIS store, not parent.
    {
    }

    {
    }
    {
    }
    public void setValue(@NotNull String name, double value)

 * Also it can use parent store to obtain values from it if this store do not contain the key.
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    {
        this();
    public void setDefault(@NotNull String name, double value)
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
 *
    public void setDefaultProperties(Map<String, String> defaultProperties)
        double oldValue = getDouble(name);
    @Override
 * DBeaver - Universal Database Manager
    public float getDefaultFloat(@NotNull String name)
        if (parentStore != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return parentStore;
    @Override
            firePropertyChangeEvent(name, oldValue, value);

            CommonUtils.equalObjects(defaultProperties, copy.defaultProperties);


    }
            if (parentStore.isDefault(name)) {
        defaultProperties.put(name, String.valueOf(value));
    }
    public String getDefaultString(@NotNull String name)


 * Preference store which can be stored/loaded in any way.

    public void setDefault(@NotNull String name, boolean value)
        }
package org.jkiss.dbeaver.model.impl.preferences;
    public void setValue(@NotNull String name, @Nullable String value)
        }
            properties.put(name, String.valueOf(value));
    public void setDefault(@NotNull String name, float value)
            return false;
        properties.clear();
        String value = defaultProperties.get(name);
    {
            firePropertyChangeEvent(name, oldValue ? Boolean.TRUE
    {
            properties.put(name, String.valueOf(value));
        if (oldValue != value || !isSet(name)) {

        return
        return (!properties.containsKey(name) && (defaultProperties.containsKey(name) || (parentStore != null && parentStore.isDefault(name))));
    private Map<String, String> defaultProperties;

    {
    }

    public String[] preferenceNames()
    public boolean isDefault(@NotNull String name)
        return toBoolean(getString(name));
    }
}
    {
    {
    @Override
    @Override


    public double getDouble(@NotNull String name)
    }
import java.util.HashMap;
 * See the License for the specific language governing permissions and
    @Override
        if (oldValue != value || !isSet(name)) {
    {
    @Override


        }
    {
    @Override
