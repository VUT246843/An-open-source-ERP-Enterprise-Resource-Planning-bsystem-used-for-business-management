    public void setValue(@NotNull String name, double value) {
            return;
        if (getDefaultString(name).equals(value)) {
        return props.get(name, null) != null ?

            defaultProps.get(name, null) != null ?
    }
    @Override

    public String getString(@NotNull String name) {
import org.jkiss.utils.CommonUtils;
        defaultProps.putFloat(name, value);
    }
 *
                FLOAT_DEFAULT_DEFAULT;
        boolean oldValue = getBoolean(name);

    }
                defaultProps.getBoolean(name, BOOLEAN_DEFAULT_DEFAULT) :
            props.getFloat(name, FLOAT_DEFAULT_DEFAULT) :
    public long getLong(@NotNull String name) {
        return props.get(name, null) != null ?
        dirty = true;
        float oldValue = getFloat(name);
    }
    @Override
    }
    public void setDefault(@NotNull String name, long value) {
import org.osgi.framework.Bundle;
    @Override
        dirty = true;
    }
        } else {
            props.getDouble(name, DOUBLE_DEFAULT_DEFAULT) :
 * See the License for the specific language governing permissions and

            firePropertyChangeEvent(name, oldValue, defaultValue);
    @Override
        long oldValue = getLong(name);
        return props.get(name, null) != null ?
    @Override
    @Override
    public BundlePreferenceStore(Bundle bundle) {
    }
    public boolean contains(@NotNull String name) {
        this(bundle.getSymbolicName());

        }
    public void setValue(@NotNull String name, float value) {
 * Unless required by applicable law or agreed to in writing, software
    private boolean dirty = false;
    @Override
                BOOLEAN_DEFAULT_DEFAULT;
    public boolean getDefaultBoolean(@NotNull String name) {
        props = InstanceScope.INSTANCE.getNode(bundleId);
    public int getDefaultInt(@NotNull String name) {
                defaultProps.getInt(name, INT_DEFAULT_DEFAULT) :

        }


        String oldValue = getString(name);
    @Override
        if (oldValue == value) {

        if (oldValue == value) {
        } else {
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
    @Override

 * DBeaver - Universal Database Manager
        return defaultProps.getDouble(name, DOUBLE_DEFAULT_DEFAULT);
    }
            props.put(name, value);
    @Override
            props.getInt(name, INT_DEFAULT_DEFAULT) :
            defaultProps.flush();

    public boolean isDefault(@NotNull String name) {
    public double getDefaultDouble(@NotNull String name) {
        }
    public float getFloat(@NotNull String name) {
    }
        return defaultProps.getInt(name, INT_DEFAULT_DEFAULT);
            defaultProps.get(name, null) != null ?
            props.remove(name);

        }
/*
            return;
            defaultProps.get(name, null) != null ?
            props.flush();
        firePropertyChangeEvent(name, oldValue, value);
            dirty = true;
                defaultProps.getFloat(name, FLOAT_DEFAULT_DEFAULT) :
    public int getInt(@NotNull String name) {
        return props.get(name, null) != null ?
            props.remove(name);
    @Override

        } catch (BackingStoreException e) {
            props.remove(name);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        if (getDefaultBoolean(name) == value) {
    }
    }
            props.putLong(name, value);
    @Override
        dirty = true;
        return props.get(name, null) == null && defaultProps.get(name, null) != null;
    @Override

import org.eclipse.core.runtime.preferences.DefaultScope;
 *
    @Override
        if (getDefaultFloat(name) == value) {
        dirty = true;
        defaultProps.putBoolean(name, value);
                defaultProps.getDouble(name, DOUBLE_DEFAULT_DEFAULT) :
                defaultProps.getLong(name, LONG_DEFAULT_DEFAULT) :
            defaultProps.get(name, null) != null ?
        defaultProps.putInt(name, value);
        String defaultValue = getDefaultString(name);
    @Override
package org.jkiss.dbeaver.model.impl.preferences;
        return props.get(name, null) != null ?
    @Override
 * you may not use this file except in compliance with the License.
            throw new IOException(e);

    public void setToDefault(@NotNull String name) {
 *
                DOUBLE_DEFAULT_DEFAULT;
    }
        try {
            props.getBoolean(name, BOOLEAN_DEFAULT_DEFAULT) :
            props.get(name, STRING_DEFAULT_DEFAULT) :
    }
    public double getDouble(@NotNull String name) {

    public void save() throws IOException {
    @Override
    @Override
        }
            props.getLong(name, LONG_DEFAULT_DEFAULT) :

        firePropertyChangeEvent(name, oldValue, value);
                STRING_DEFAULT_DEFAULT;
    @Override
    }


                defaultProps.get(name, STRING_DEFAULT_DEFAULT) :
        defaultProps.putDouble(name, value);
        return defaultProps.getBoolean(name, BOOLEAN_DEFAULT_DEFAULT);
        }
}
import java.io.IOException;
        } else {

            return;
 */
    }
        dirty = true;

    }
        }
    public boolean getBoolean(@NotNull String name) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.code.NotNull;
        }
        } else {
import org.jkiss.code.Nullable;
    }
 * limitations under the License.
        }
    public BundlePreferenceStore(String bundleId) {
    public void setDefault(@NotNull String name, boolean value) {



    public long getDefaultLong(@NotNull String name) {
    public void setValue(@NotNull String name, boolean value) {
    }

        dirty = true;
            return;
    }
    public void setDefault(@NotNull String name, @Nullable String defaultObject) {
                INT_DEFAULT_DEFAULT;
    public void setDefault(@NotNull String name, float value) {
            props.remove(name);
        }

        return defaultProps.getLong(name, LONG_DEFAULT_DEFAULT);
    public void setValue(@NotNull String name, int value) {
    }

    }
public class BundlePreferenceStore extends AbstractPreferenceStore {
            props.putBoolean(name, value);
            defaultProps.get(name, null) != null ?
            return;
        } else {
        if (!CommonUtils.equalObjects(oldValue, defaultValue)) {
    @Override
    @Override
        int oldValue = getInt(name);
            return;
        }

    @Override
    }
    }
    }
    }
import org.osgi.service.prefs.BackingStoreException;
    @Override
    private final IEclipsePreferences props;

    public void setValue(@NotNull String name, @Nullable String value) {
        double oldValue = getDouble(name);
        return dirty;
        if (oldValue == value) {
        }
            props.remove(name);
    @Override
            defaultProps.get(name, null) != null ?
        defaultProps.putLong(name, value);
    public boolean needsSaving() {
        if (oldValue == value) {
    @Override

 * You may obtain a copy of the License at
        } else {
        if (CommonUtils.equalObjects(oldValue, value)) {
    private final IEclipsePreferences defaultProps;
        }

        defaultProps.put(name, defaultObject);
    public void setValue(@NotNull String name, long value) {
            props.putInt(name, value);
            props.putDouble(name, value);
        if (getDefaultLong(name) == value) {
    }
    @Override
        firePropertyChangeEvent(name, oldValue, value);
        }
        defaultProps = DefaultScope.INSTANCE.getNode(bundleId);
        return props.get(name, null) != null ?
        if (oldValue == value) {
    public String getDefaultString(@NotNull String name) {
        return defaultProps.get(name, STRING_DEFAULT_DEFAULT);
        return props.get(name, null) != null || defaultProps.get(name, null) != null;
    }
                LONG_DEFAULT_DEFAULT;
            props.putFloat(name, value);
        firePropertyChangeEvent(name, oldValue, value);
        if (getDefaultDouble(name) == value) {
    }
        String oldValue = getString(name);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setDefault(@NotNull String name, int value) {

import org.eclipse.core.runtime.preferences.InstanceScope;
    @Override
    public void setDefault(@NotNull String name, double value) {
            props.remove(name);
        firePropertyChangeEvent(name, oldValue, value);
    }


 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return defaultProps.getFloat(name, FLOAT_DEFAULT_DEFAULT);

        firePropertyChangeEvent(name, oldValue ? Boolean.TRUE : Boolean.FALSE, value ? Boolean.TRUE : Boolean.FALSE);
        props.remove(name);
    @Override
        if (getDefaultInt(name) == value) {
    public float getDefaultFloat(@NotNull String name) {
