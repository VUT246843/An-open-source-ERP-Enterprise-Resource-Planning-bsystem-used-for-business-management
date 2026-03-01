    ),
        this.description = description;
    public boolean isDatabaseObjects() {
 * limitations under the License.
    );

    connection(
    ;

import org.jkiss.dbeaver.ui.UIIcon;

    }
 * DBeaver - Universal Database Manager
    public String getDescription() {
 * Unless required by applicable law or agreed to in writing, software
    }
 */
    @NotNull
    private final boolean databaseObjects;
    DatabaseNavigatorTreeFilterObjectType(@NotNull String name, @NotNull String description, @NotNull DBIcon icon, boolean databaseObjects) {
 *
        true
        UIIcon.FILTER_CONNECTIONS,
        UINavigatorMessages.actions_navigator_search_filter_file_description,
    ),
        UIIcon.FILTER_OBJECTS,
public enum DatabaseNavigatorTreeFilterObjectType {
 * See the License for the specific language governing permissions and
}

 * You may obtain a copy of the License at
/*

    public DBIcon getIcon() {
        UINavigatorMessages.actions_navigator_search_filter_container_name,
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        return name;
 *
    public String getName() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.name = name;

    @NotNull
        UIIcon.FILTER_OBJECTS,
    private final String name;
 * distributed under the License is distributed on an "AS IS" BASIS,
        false
    }
        UINavigatorMessages.actions_navigator_search_filter_container_description,
    table(
        UINavigatorMessages.actions_navigator_search_filter_connection_description,
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.code.NotNull;
        return icon;
    private final String description;
    }
        return databaseObjects;
        this.databaseObjects = databaseObjects;
        false
        UINavigatorMessages.actions_navigator_search_filter_connection_name,
    @NotNull
 *
        UINavigatorMessages.actions_navigator_search_filter_file_name,
    private final DBIcon icon;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    ),
        UIIcon.FILTER_CONTAINERS,
        this.icon = icon;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return description;
    container(
package org.jkiss.dbeaver.ui.navigator.database;
        true
    file(
        UINavigatorMessages.actions_navigator_search_filter_object_name,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBIcon;
    }
        UINavigatorMessages.actions_navigator_search_filter_object_description,
