    boolean getBoolean(@NotNull String name);
    void setDefault(@NotNull String name, boolean value);
    void setToDefault(@NotNull String name);
    String getDefaultString(@NotNull String name);
    void setDefault(@NotNull String name, float value);
    float getDefaultFloat(@NotNull String name);
    long getDefaultLong(@NotNull String name);
    boolean getDefaultBoolean(@NotNull String name);
    boolean contains(@NotNull String name);
    int getDefaultInt(@NotNull String name);
    void removePropertyChangeListener(@NotNull DBPPreferenceListener listener);
 * you may not use this file except in compliance with the License.
    void setDefault(@NotNull String name, double value);
 * You may obtain a copy of the License at
    void save() throws IOException;

import org.jkiss.code.NotNull;
    void setValue(@NotNull String name, double value);
    void addPropertyChangeListener(@NotNull DBPPreferenceListener listener);
    double getDouble(@NotNull String name);

import java.io.IOException;
    void setValue(@NotNull String name, int value);
/*
    void setValue(@NotNull String name, @Nullable String value);
 */
}
    double getDefaultDouble(@NotNull String name);

 * Unless required by applicable law or agreed to in writing, software

    void setDefault(@NotNull String name, @Nullable String defaultObject);
 *     http://www.apache.org/licenses/LICENSE-2.0
    float getFloat(@NotNull String name);
 *
    void setValue(@NotNull String name, boolean value);
    long getLong(@NotNull String name);
    void setDefault(@NotNull String name, long value);
    String getString(@NotNull String name);



package org.jkiss.dbeaver.model.preferences;
 *
 *


 * limitations under the License.

public interface DBPPreferenceStore {
    boolean needsSaving();
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void setDefault(@NotNull String name, int value);
 * Licensed under the Apache License, Version 2.0 (the "License");


    void setValue(@NotNull String name, long value);

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
 * See the License for the specific language governing permissions and
    void setValue(@NotNull String name, float value);
    int getInt(@NotNull String name);
    boolean isDefault(@NotNull String name);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    @Nullable
    void firePropertyChangeEvent(@NotNull String name, @Nullable Object oldValue, @Nullable Object newValue);
