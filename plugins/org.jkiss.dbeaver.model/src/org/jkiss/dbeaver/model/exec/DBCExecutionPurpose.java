 */
 * See the License for the specific language governing permissions and
 * Execution purpose.
        for (DBCExecutionPurpose purpose : values()) {


        return title;
 *
 * This enum defines different query purposes.
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * distributed under the License is distributed on an "AS IS" BASIS,



        this.title = title;
    USER(0, "User", true),               // User query
}
 * Note: for sure, we can't detect ALL executed queries. Some of them are executed by drivers internally,
    }

    public static DBCExecutionPurpose getById(int id) {
    }
public enum DBCExecutionPurpose {
        return USER;
package org.jkiss.dbeaver.model.exec;
 */
 *
 * some are executed by plugins and not reported to query manager.

/**
 *
    }
    public String getTitle() {
    public int getId() {

    public boolean isUser() {

            if (purpose.getId() == id) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Some of queries are instantiated by user, some are executed internally to obtain metadata, etc.
    }           // Metadata modifications (DDL)
    META_DDL(5, "Meta DDL", false)
 * limitations under the License.
 * Each query which executed withing application have some purpose.
    META(4, "Meta", false),              // Metadata query, processed by data source providers internally
        this.user = user;
        return user;
        return id;
    private final int id;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    DBCExecutionPurpose(int id, String title, boolean user) {
 * you may not use this file except in compliance with the License.
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 *
 * DBeaver - Universal Database Manager
    @NotNull
                return purpose;
        }

    UTIL(3, "Util", false),              // Utility query (utility method initialized by user)
    USER_FILTERED(1, "User filtered", true),      // User query with additional filters
    USER_SCRIPT(2, "User script", true),        // User script query
/*
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.id = id;
    private final boolean user;
 *

    ;
    private final String title;
    }
    @NotNull
