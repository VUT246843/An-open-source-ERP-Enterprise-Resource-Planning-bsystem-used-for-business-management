
/**

    private Map<String, String[]> getArrayItemsInternal() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return o instanceof DialogSettingsMap && settings.equals(((DialogSettingsMap) o).settings);
 * See the License for the specific language governing permissions and
    @Override
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.Log;
    public Object getOrDefault(Object key, Object defaultValue) {
            settings.put(key, dst);

        return entries;
        } catch (Throwable e) {
        }
import org.jkiss.code.NotNull;
    }
    private final IDialogSettings settings;
        } else {
        return putIfAbsent(key, value);
        for (IDialogSettings section : ArrayUtils.safeArray(settings.getSections())) {
    }
    @Override
        String keyValue = settings.get((String) key);
            return Collections.emptyMap();
        }
        return settings.hashCode();
            entries.add(new SimpleEntry<>(entry.getKey(), entry.getValue()));
import org.jkiss.utils.ArrayUtils;
import java.util.*;
        this.settings = settings;
    private Map<String, String> getItemsInternal() {

            map.putAll((Map<String, String>) value);
 * limitations under the License.
            return Collections.emptyMap();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (section != null) {

            entries.add(new SimpleEntry<>(entry.getKey(), entry.getValue()));
        } catch (Throwable e) {
 *
            log.error("Can't read items from settings", e);
        if (value instanceof Map) {
    @NotNull
        }
        return getOrDefault(key, null);
        }
            return keyValue;

    }
        return defaultValue;
}            return new DialogSettingsMap(section);
    @Override
        return value;

    public Object putIfAbsent(String key, Object value) {

    private static final Log log = Log.getLog(DialogSettingsMap.class);
public class DialogSettingsMap extends AbstractMap<String, Object> {
            final DialogSettingsMap map = new DialogSettingsMap(settings.addNewSection(key));
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
            for (int i = 0; i < src.length; i++) {
            return BeanUtils.getFieldValue(settings, "items");
 * DialogSettingsMap

 */
        }
    }

    @NotNull
            final Object[] src = (Object[]) value;
            final String[] dst = new String[src.length];

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
            settings.put(key, CommonUtils.toString(value));
        return false;
        }
    public boolean equals(Object o) {
    @Override
    public Object get(Object key) {
import org.eclipse.jface.dialogs.IDialogSettings;
            return map;


        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        if (keyValue != null) {

        for (Entry<String, String[]> entry : getArrayItemsInternal().entrySet()) {
    }
    public boolean remove(Object key, Object value) {
        final Set<Entry<String, Object>> entries = new LinkedHashSet<>();
    }
 * DBeaver - Universal Database Manager
    @Override
                dst[i] = CommonUtils.toString(src[i]);
    public Set<Entry<String, Object>> entrySet() {
        for (Entry<String, String> entry : getItemsInternal().entrySet()) {
    public DialogSettingsMap(IDialogSettings settings) {
    public Object put(String key, Object value) {

    }
    @Override
            log.error("Can't read array items from settings", e);
        IDialogSettings section = settings.getSection((String) key);
/*
        try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return BeanUtils.getFieldValue(settings, "arrayItems");
    @Override
            }
    }
import org.jkiss.utils.BeanUtils;
        }
    public int hashCode() {
    @Override
    }
            entries.add(new SimpleEntry<>(section.getName(), new DialogSettingsMap(section)));
package org.jkiss.dbeaver.ui;
        try {
 *
        } else if (ArrayUtils.isArray(value)) {
    @SuppressWarnings("unchecked")

import org.jkiss.utils.CommonUtils;
