            try {
                finalListener.preferenceChange(pe);
    @Override
    public static final double DOUBLE_DEFAULT_DEFAULT = 0.0;
    }
        }
        addListenerObject(listener);

/*
        final DBPPreferenceListener[] finalListeners = getListeners();
        if (!CommonUtils.isEmpty(value)) {
            } catch (NumberFormatException e) {
    protected double toDouble(String value) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

        return ival;
        if (!CommonUtils.isEmpty(value)) {
            listeners[i] = (DBPPreferenceListener) ol[i];
        if (listenerList != null) {
        if (finalListeners.length > 0 && !CommonUtils.equalObjects(oldValue, newValue)) {
        }
            }
                listenerList = null;
import org.jkiss.utils.CommonUtils;
            return new DBPPreferenceListener[0];
            } catch (NumberFormatException e) {
    public static final String TRUE = "true"; //$NON-NLS-1$
        if (listener == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,

            for (DBPPreferenceListener finalListener : finalListeners) {

        return ival;

                ival = Long.parseLong(value);
        removeListenerObject(listener);

 */
            try {
    public void addPropertyChangeListener(@NotNull DBPPreferenceListener listener) {
            }
                // do nothing

 * limitations under the License.

 * Copyright (C) 2010-2025 DBeaver Corp and others

 * DBeaver - Universal Database Manager
 *
import org.jkiss.code.NotNull;
    @Override
    public void firePropertyChangeEvent(Object source, String name, Object oldValue, Object newValue) {
                // do nothing
        final ListenerList<DBPPreferenceListener> list = listenerList;
            }
 * you may not use this file except in compliance with the License.
            listenerList = new ListenerList<>(ListenerList.IDENTITY);

            if (listenerList.isEmpty()) {
    }
        }
    public static final String FALSE = "false"; //$NON-NLS-1$
            } catch (NumberFormatException e) {
        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }
        Object[] ol = list.getListeners();
        float ival = FLOAT_DEFAULT_DEFAULT;
    }
    }
        double ival = DOUBLE_DEFAULT_DEFAULT;
            try {
        return listeners;
            final DBPPreferenceListener.PreferenceChangeEvent pe = new DBPPreferenceListener.PreferenceChangeEvent(source, name, oldValue, newValue);
    public static final float FLOAT_DEFAULT_DEFAULT = 0.0f;
            }
    }
        if (!CommonUtils.isEmpty(value)) {
        }
                ival = Integer.parseInt(value);
    protected int toInt(String value) {
 *
    public void firePropertyChangeEvent(@NotNull String name, @Nullable Object oldValue, @Nullable Object newValue) {
    @Override
    public static final long LONG_DEFAULT_DEFAULT = 0L;
                ival = Double.parseDouble(value);
        for (int i = 0; i < list.size(); i++) {
    protected final DBPPreferenceListener[] getListeners() {
        if (!CommonUtils.isEmpty(value)) {
        if (list == null) {

        this.firePropertyChangeEvent(this, name, oldValue, newValue);
                // do nothing
import org.eclipse.core.runtime.ListenerList;

            }
        return ival;
    public void removePropertyChangeListener(@NotNull DBPPreferenceListener listener) {
import org.jkiss.code.Nullable;


 *
    }
}
package org.jkiss.dbeaver.model.impl.preferences;
    public static final boolean BOOLEAN_DEFAULT_DEFAULT = false;

            try {
 * Unless required by applicable law or agreed to in writing, software
        }
        }
        // Do we need to fire an event
        DBPPreferenceListener[] listeners = new DBPPreferenceListener[ol.length];
        if (listener == null) {
    protected long toLong(String value) {
    public static final String STRING_DEFAULT_DEFAULT = ""; //$NON-NLS-1$
    private volatile transient ListenerList<DBPPreferenceListener> listenerList = null;
        if (listenerList == null) {
        listenerList.add(listener);

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

        return value != null && value.equals(AbstractPreferenceStore.TRUE);
public abstract class AbstractPreferenceStore implements DBPPreferenceStore {
    public static final int INT_DEFAULT_DEFAULT = 0;

            } catch (NumberFormatException e) {
    protected boolean toBoolean(String value) {
            throw new IllegalArgumentException();

        int ival = INT_DEFAULT_DEFAULT;

        }
        return ival;

 * You may obtain a copy of the License at
            listenerList.remove(listener);
    protected synchronized final void addListenerObject(final DBPPreferenceListener listener) {
        }
        }
 * See the License for the specific language governing permissions and
    }
    }
                ival = Float.parseFloat(value);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        long ival = LONG_DEFAULT_DEFAULT;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;

    }
                // do nothing
            throw new IllegalArgumentException();
    protected synchronized final void removeListenerObject(final DBPPreferenceListener listener) {
    protected float toFloat(String value) {
