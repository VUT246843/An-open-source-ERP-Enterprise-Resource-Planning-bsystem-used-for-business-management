        return toFloat(getDefaultString(name));
    }
    }
    public String getString(@NotNull String name) {
 */

    public void setValue(@NotNull String name, @Nullable String value) {
    public void setDefault(@NotNull String name, boolean value) {

    }
    @Override
    @Override
/*
    @Override
    public void setValue(@NotNull String name, int value) {
}
    private static final Log log = Log.getLog(AbstractUserPreferenceStore.class);
        setDefault(name, String.valueOf(value));
    public int getInt(@NotNull String name) {
    }
    public void setDefault(@NotNull String name, long value) {
        return value == null ? getDefaultString(name) : value.toString();
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
    public void setDefault(@NotNull String name, int value) {
        setDefault(name, String.valueOf(value));
    public double getDouble(@NotNull String name) {
    }
    protected abstract void setUserPreference(String name, Object value);
        return toDouble(getString(name));

package org.jkiss.dbeaver.model.impl.preferences;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;


    }
    public boolean contains(@NotNull String name) {
    public void setValue(@NotNull String name, boolean value) {
    @Override

    }

    public int getDefaultInt(@NotNull String name) {
    @Override
    @Override
    public float getFloat(@NotNull String name) {
        return toDouble(getDefaultString(name));
    @Override
        Object value = userPreferences.get(name);

    public boolean getDefaultBoolean(@NotNull String name) {
        return toInt(getString(name));
 * You may obtain a copy of the License at
        return toBoolean(getDefaultString(name));
    }
    }
        setDefault(name, String.valueOf(value));
        setDefault(name, String.valueOf(value));
    @Override

public abstract class AbstractUserPreferenceStore extends AbstractPreferenceStore {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        return toFloat(getString(name));
import org.jkiss.code.Nullable;
    @Override

    public void setValue(@NotNull String name, long value) {


    }

import java.util.Map;
    }
        return userPreferences.containsKey(name) || parentStore.contains(name);
        setUserPreference(name, value);
        return toBoolean(getString(name));
 * you may not use this file except in compliance with the License.
    public boolean getBoolean(@NotNull String name) {
    @Override
        return toInt(getDefaultString(name));
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        setUserPreference(name, value);
    }
    public long getDefaultLong(@NotNull String name) {
        return toLong(getDefaultString(name));
    @Override
        setUserPreference(name, value);
    @Override
    }
 * limitations under the License.
    }
import java.util.HashMap;

    }
    }
        this.userPreferences.putAll(newUserPreferences);

 *
    @Override

    @Override
    }

    @Override

        this.parentStore.setDefault(name, defaultObject);
    }
    @Override
    public float getDefaultFloat(@NotNull String name) {
    public long getLong(@NotNull String name) {
    }
    @Override
        this.parentStore = parentStore;

    }
    @Override
 * DBeaver - Universal Database Manager

    public void setDefault(@NotNull String name, float value) {
    }

    }
 * See the License for the specific language governing permissions and
    public void setDefault(@NotNull String name, @Nullable String defaultObject) {




import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setValue(@NotNull String name, double value) {
    }
    @Override
    protected final DBPPreferenceStore parentStore;
    }

    public AbstractUserPreferenceStore(@NotNull DBPPreferenceStore parentStore) {
        setUserPreference(name, value);
    protected final Map<String, Object> userPreferences = new HashMap<>();

    public void updateAllUserPreferences(@NotNull Map<String, Object> newUserPreferences) {
        return toLong(getString(name));
        setDefault(name, String.valueOf(value));
    public void setValue(@NotNull String name, float value) {

        this.userPreferences.clear();

    @Override
 *
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public void setDefault(@NotNull String name, double value) {
    public double getDefaultDouble(@NotNull String name) {
    @Override
 *
    @Override
        setUserPreference(name, value);
import org.jkiss.dbeaver.Log;

        setUserPreference(name, value);
    @Override
    }
