    public String getId() {
 * Unless required by applicable law or agreed to in writing, software
/*
        for (DBPDataSourcePermission permission : values()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return id;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model;
            if (permission.id.equals(id)) {
    @Nullable
        }
    }
    PERMISSION_EDIT_METADATA("edit.meta", ModelMessages.dbp_permission_edit_metadata_name, ModelMessages.dbp_permission_edit_metadata_description),
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

            }

}
    @NotNull
    private final String description;

    PERMISSION_EXECUTE_SCRIPTS("edit.execute", ModelMessages.dbp_permission_execute_scripts_name, ModelMessages.dbp_permission_execute_scripts_description),
    private final String id;
 * distributed under the License is distributed on an "AS IS" BASIS,
        throw new IllegalArgumentException("Wrong permission id: " + id);
    @NotNull
    public static DBPDataSourcePermission getById(@NotNull String id) {

 * limitations under the License.
    PERMISSION_IMPORT_DATA("import.data", ModelMessages.dbp_permission_import_data_name, ModelMessages.dbp_permission_import_data_description);
import org.jkiss.code.NotNull;
        this.description = description;
import org.jkiss.dbeaver.model.messages.ModelMessages;
    DBPDataSourcePermission(@NotNull String id, @NotNull String label, @Nullable String description) {
    }
/**
 *
public enum DBPDataSourcePermission {
 */
    private final String label;
    public String getLabel() {
    public String getDescription() {
 *
    PERMISSION_EDIT_DATA("edit.data", ModelMessages.dbp_permission_edit_data_name, ModelMessages.dbp_permission_edit_data_description),
        return label;
                return permission;

 */

    }
 * DBeaver - Universal Database Manager
    }
        this.id = id;

 * You may obtain a copy of the License at
 * Data-source permissions
        this.label = label;
 * you may not use this file except in compliance with the License.
    @NotNull
        return description;
    }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others

