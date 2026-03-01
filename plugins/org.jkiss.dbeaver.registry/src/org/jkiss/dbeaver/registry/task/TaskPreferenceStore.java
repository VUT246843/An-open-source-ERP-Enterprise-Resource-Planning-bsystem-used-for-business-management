    public boolean contains(@NotNull String name) {
        return parentStore;
        return dirty;
    @Override
    public long getDefaultLong(@NotNull String name) {
public class TaskPreferenceStore extends AbstractPreferenceStore implements DBPPreferenceMap {
            firePropertyChangeEvent(name, oldValue, value);
        }
        return properties.containsKey(name);
            return false;
    }
    public Map<String, Object> getProperties() {
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return properties.containsKey(name);
    }
    }
        return CommonUtils.toDouble(getValue(name));
            dirty = true;

            firePropertyChangeEvent(name, oldValue, value);

    @Override
    public void save() throws IOException {
    public boolean getDefaultBoolean(@NotNull String name) {
    }
    public void setValue(@NotNull String name, long value) {
        return (float) CommonUtils.toDouble(getValue(name));
        this.parentStore = DBWorkbench.getPlatform().getPreferenceStore();
                : Boolean.FALSE, value ? Boolean.TRUE : Boolean.FALSE);
 * See the License for the specific language governing permissions and
    @Override
    }
    public DBPPreferenceStore getParentStore() {
    }
        if (oldValue != value || !isSet(name)) {
    public void setValue(@NotNull String name, int value) {
    }

    @Override
    @Override
    public boolean isDefault(@NotNull String name) {
        if (oldValue != value || !isSet(name)) {
        return properties;
    public Object getValue(String name) {

                CommonUtils.equalObjects(properties, copy.properties);
    public boolean equals(Object obj) {
        // no defaults
    @Override

 * you may not use this file except in compliance with the License.

    }
import org.jkiss.code.Nullable;
    @Override
        return getLong(name);
    }
    @Override
    public void setDefault(@NotNull String name, boolean value) {
        // no defaults
package org.jkiss.dbeaver.registry.task;

    @Override
    }
    }
    public Map<String, Object> getPropertyMap() {
    }
        if (oldValue != value || !isSet(name)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        this.properties = new LinkedHashMap<>(task.getProperties());
        return CommonUtils.toBoolean(getValue(name));
import java.io.IOException;
        properties.remove(name);
        return CommonUtils.toDouble(getValue(name));
    @Override
        boolean oldValue = getBoolean(name);

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        long oldValue = getLong(name);
        int oldValue = getInt(name);
            properties.put(name, value);

        if (!(obj instanceof TaskPreferenceStore)) {


        return getFloat(name);
        }
    }
    @Nullable
    private boolean dirty = false;
    }
 * Wrapper over simple properties
    @NotNull
    public void setDefault(@NotNull String name, int value) {
import java.util.LinkedHashMap;
import org.jkiss.dbeaver.model.impl.preferences.AbstractPreferenceStore;
            properties.put(name, value);
        Object value = properties.get(name);
    public TaskPreferenceStore(@NotNull Map<String, Object> properties) {
    public boolean needsSaving() {
        }
 * DBeaver - Universal Database Manager

        if (oldValue != value || !isSet(name)) {
        // no defaults
 * You may obtain a copy of the License at
    public boolean isSet(String name) {

    public double getDefaultDouble(@NotNull String name) {
            value = parentStore.getString(name);
import org.jkiss.utils.CommonUtils;
    public void setDefault(@NotNull String name, double value) {
    private final DBPPreferenceStore parentStore;
    public void setValue(@NotNull String name, @Nullable String value) {
    public float getFloat(@NotNull String name) {
    public <T> T getObject(String name) {
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
        }
    @Override
    public float getDefaultFloat(@NotNull String name) {

            properties.put(name, value);
    @Override
        return getInt(name);
        }

    }
 * limitations under the License.
    @Override
        return getString(name);

        double oldValue = getDouble(name);
    public long getLong(@NotNull String name) {
    public void setDefault(@NotNull String name, @Nullable String value) {
    }
            properties.put(name, value);
    }
            firePropertyChangeEvent(name, oldValue, value);
    }
            properties.put(name, value);
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;

    public int getDefaultInt(@NotNull String name) {
    }
    }
    public double getDouble(@NotNull String name) {
    }
    private final Map<String, Object> properties;

        if (oldValue != value || !isSet(name)) {
        float oldValue = getFloat(name);
        this.properties = properties;

    @Override
 */
        return (T) properties.get(name);
            properties.put(name, String.valueOf(value));
import java.util.Map;
    public void setValue(@NotNull String name, boolean value) {
/*

        }
    @Override


import org.jkiss.dbeaver.model.task.DBTTask;
    public int getInt(@NotNull String name) {


 *
    }
    }
/**
        return
            CommonUtils.equalObjects(parentStore, copy.parentStore) &&
    public TaskPreferenceStore(@NotNull DBTTask task) {
    }

        return false;
            firePropertyChangeEvent(name, oldValue, value);
        if (value == null) {
        String oldValue = getString(name);
            dirty = true;
            firePropertyChangeEvent(name, oldValue ? Boolean.TRUE
    private final DBTTask task;
    @Override
    @Override
        return CommonUtils.toString(getValue(name));
    public String getDefaultString(@NotNull String name) {
import org.jkiss.code.NotNull;
        return value;

    @Override
    @Override
    @Nullable
        // no defaults

        // no defaults
 * Unless required by applicable law or agreed to in writing, software
        firePropertyChangeEvent(name, oldValue, null);
    }


    @Override
    @Override
        return CommonUtils.toInt(getValue(name));

            firePropertyChangeEvent(name, oldValue, value);
        Object oldValue = properties.get(name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    public void setDefault(@NotNull String name, float value) {
    }
    @Override
}
    @Override
    public void setToDefault(@NotNull String name) {
        // no defaults
    @Override
    }
            dirty = true;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    @Override
            dirty = true;
        return properties;

        if (task != null) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

            dirty = true;
        }


    }
    @Override

            task.setProperties(properties);
        dirty = true;
    @Override
    }

    public void setValue(@NotNull String name, double value) {
        }
    public boolean getBoolean(@NotNull String name) {
    public void setDefault(@NotNull String name, long value) {
        this.task = null;

 *
        return CommonUtils.toBoolean(getValue(name));
    }
        if (oldValue == null || !oldValue.equals(value) || !isSet(name)) {
    }
    }
    }
        TaskPreferenceStore copy = (TaskPreferenceStore) obj;
        return CommonUtils.toLong(getValue(name));
    @Override

    public void setValue(@NotNull String name, float value) {
        this.task = task;

    public String getString(@NotNull String name) {
    }
        this.parentStore = DBWorkbench.getPlatform().getPreferenceStore();

            dirty = true;
    @Override
    @Override
    @Override
