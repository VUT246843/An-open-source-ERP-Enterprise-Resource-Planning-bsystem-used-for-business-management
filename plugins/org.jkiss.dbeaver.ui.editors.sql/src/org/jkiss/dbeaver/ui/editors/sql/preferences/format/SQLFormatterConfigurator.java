/*
 * DBeaver - Universal Database Manager
    void loadSettings(@NotNull DBPPreferenceStore preferenceStore, boolean useDefaults);
import org.jkiss.dbeaver.model.sql.registry.SQLFormatterDescriptor;
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

public interface SQLFormatterConfigurator {

 * distributed under the License is distributed on an "AS IS" BASIS,
    void saveSettings(@NotNull DBPPreferenceStore preferenceStore);
 * SQL Formatter configurator
 * limitations under the License.

    void configure(@NotNull SQLFormatterDescriptor formatterDescriptor, Runnable changeListener);
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
     */

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * Sets configuration parameters
 * you may not use this file except in compliance with the License.
    /**
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.editors.sql.preferences.format;
/**
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    void resetSettings(@NotNull DBPPreferenceStore preferenceStore);
 * Unless required by applicable law or agreed to in writing, software
}
 */
