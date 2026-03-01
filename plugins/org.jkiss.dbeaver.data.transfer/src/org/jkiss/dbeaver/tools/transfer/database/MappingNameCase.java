    private final String name;
public enum MappingNameCase {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
    ) {
    }
    /**
        if (dbpPreferenceStore.contains(DTConstants.PREF_NAME_CASE_MAPPING)) {
import org.jkiss.dbeaver.tools.transfer.DTConstants;

        this.selectionId = selectionId;
        return getCaseBySelectionId(selectionIndex);
    public static MappingNameCase getCaseBySelectionId(int id) {
}
     *
        return DEFAULT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * See the License for the specific language governing permissions and
    private final int selectionId;
     * Get name case the values list or DEFAULT
    }
    @NotNull
     * @return name case from the list or default one
 */

 *
    UPPER(1, DTMessages.pref_data_transfer_name_case_upper, DBPIdentifierCase.UPPER),
    public static MappingNameCase getCaseFromPreferences(
import org.jkiss.dbeaver.model.DBPIdentifierCase;
    LOWER(2, DTMessages.pref_data_transfer_name_case_lower, DBPIdentifierCase.LOWER);
                return value;
    }
        this.name = name;
    public String getName() {
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Get name case from the preferences or DEFAULT
 * you may not use this file except in compliance with the License.
        @NotNull DBPPreferenceStore dbpPreferenceStore,
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (id == value.selectionId) {
package org.jkiss.dbeaver.tools.transfer.database;
    /**
            selectionIndex = dbpPreferenceStore.getInt(DTConstants.PREF_NAME_CASE_MAPPING);
        } else {
     * @param id int for search
    @NotNull
        }
        return name;

        for (MappingNameCase value : values()) {
/*
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
            selectionIndex = store.getInt(DTConstants.PREF_NAME_CASE_MAPPING);
            }
        }
     */
 *
        this.identifierCase = identifierCase;
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
     *

     * @param store general preference store
        @NotNull DBPPreferenceStore store


        return identifierCase;
 * Unless required by applicable law or agreed to in writing, software
 *
    public DBPIdentifierCase getIdentifierCase() {
     * @return name case from the preferences or default one
    DEFAULT(0, DTMessages.pref_data_transfer_name_case_default, null),

    private final DBPIdentifierCase identifierCase;
 * limitations under the License.
    MappingNameCase(int selectionId, String name, DBPIdentifierCase identifierCase) {
     * @param dbpPreferenceStore datasource preference store

        int selectionIndex;
     */

