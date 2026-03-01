 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    EXTENDED("my_table AS mt");
    }
    public String getText() {
    PLAIN("my_table mt"),
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * SQLTableAliasInsertMode
 * DBeaver - Universal Database Manager
}
    SQLTableAliasInsertMode(String text) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Backward compatibility
import org.jkiss.code.NotNull;
 *

    @NotNull
 * See the License for the specific language governing permissions and
        } else {
        }
 * you may not use this file except in compliance with the License.
 *
package org.jkiss.dbeaver.model.sql;


    NONE("N/A"),
 */
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

            return CommonUtils.valueOf(SQLTableAliasInsertMode.class, prop, SQLTableAliasInsertMode.PLAIN);
public enum SQLTableAliasInsertMode {
 * Controls how the table alias should be formatted during code completion.
        final String prop = preferenceStore.getString(SQLModelPreferences.SQL_PROPOSAL_INSERT_TABLE_ALIAS);
    @NotNull

        this.text = text;
            return NONE;
        return text;
    private final String text;
 * limitations under the License.
    }
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
 */
            return PLAIN;
/**
        if ("true".equals(prop)) {

        } else if ("false".equals(prop)) {
/*
 * <p>
    }

    public static SQLTableAliasInsertMode fromPreferences(@NotNull DBPPreferenceStore preferenceStore) {
 *     http://www.apache.org/licenses/LICENSE-2.0
