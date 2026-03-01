    /**
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.Nullable;

 * Settings are always user-specific, not global.
 * Provides possibility to overwrite preferences for datasources in multi-user applications.
    ) throws DBException;
    );

/*
        @NotNull String objectId,
        @NotNull SMObjectType objectType,
     * Set user settings for the specified object.
     * IF there are no settings overwritten on user level - returns null.
    /**
 */
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Set;
        @NotNull Map<String, String> settings

    void clearObjectSettings(
        @NotNull String objectId
import org.jkiss.code.NotNull;
}
    Map<String, String> getObjectSettings(
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Implementation is provided thru adapters of {@link org.jkiss.dbeaver.model.app.DBPProject}.
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
    ) throws DBException;
    @Nullable
 *
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull Set<String> settings
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.security.SMObjectType;
     */

 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
        @NotNull SMObjectType objectType,
package org.jkiss.dbeaver.model;
        @NotNull SMObjectType objectType,


 */
public interface DBPObjectSettingsProvider {
 * DBeaver - Universal Database Manager
     */
    void setObjectSettings(

        @NotNull String objectId,
 * limitations under the License.
     * Returns all settings for the specified object.
