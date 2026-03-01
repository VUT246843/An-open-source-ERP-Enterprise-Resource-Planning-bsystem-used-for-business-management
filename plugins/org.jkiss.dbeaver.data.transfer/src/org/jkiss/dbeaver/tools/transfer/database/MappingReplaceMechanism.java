        this.name = name;
 */
     * @param store general preference store
 * Unless required by applicable law or agreed to in writing, software

    private final int selectionId;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param dbpPreferenceStore datasource preference store

    CAMELCASE(2, DTMessages.pref_data_transfer_replacing_combo_camel_case);
/*

        for (MappingReplaceMechanism value : values()) {
        @NotNull DBPPreferenceStore store
 * See the License for the specific language governing permissions and
            selectionIndex = store.getInt(DTConstants.PREF_REPLACE_MAPPING);
     */
                return value;
     * @return replace mechanism from the preferences or default one

            }
     * Get replace mechanism from the values list or ABSENT
        }
     * @param id int for search
            selectionIndex = dbpPreferenceStore.getInt(DTConstants.PREF_REPLACE_MAPPING);
    private final String name;

import org.jkiss.dbeaver.tools.transfer.DTConstants;
 *
 * limitations under the License.
 *
    ) {
     */
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
        } else {
        return ABSENT;
public enum MappingReplaceMechanism {
     * Get replace mechanism from the preferences or ABSENT
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return replace mechanism from the list or default one

        return getCaseBySelectionId(selectionIndex);
        return name;
        int selectionIndex;

    UNDERSCORES(1, DTMessages.pref_data_transfer_replacing_combo_underscores),
    MappingReplaceMechanism(int selectionId, String name) {
package org.jkiss.dbeaver.tools.transfer.database;
    }
    }
    public String getName() {
        @NotNull DBPPreferenceStore dbpPreferenceStore,
        this.selectionId = selectionId;
    public static MappingReplaceMechanism getCaseBySelectionId(int id) {
    ABSENT(0, DTMessages.pref_data_transfer_replacing_combo_do_not),
    }
    @NotNull
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
}
 *

        if (dbpPreferenceStore.contains(DTConstants.PREF_REPLACE_MAPPING)) {
     *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static MappingReplaceMechanism getCaseFromPreferences(
 * you may not use this file except in compliance with the License.
     *
        }
    }
            if (id == value.selectionId) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
import org.jkiss.code.NotNull;
