public enum DB2TableOrganizationMode implements DBPNamedObject {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    public String getName() {
 * limitations under the License.


import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.dbeaver.model.DBPNamedObject;
    R("Row-organized table"),
 *
 * DBeaver - Universal Database Manager
 *
/*
        this.name = name;
 *
package org.jkiss.dbeaver.ext.db2.model.dict;
 * you may not use this file except in compliance with the License.

    N("Not a table");
        return name;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    @NotNull
    DB2TableOrganizationMode(@NotNull String name) {
}    C("Column-organized table"),
    @Override
 * You may obtain a copy of the License at

    private final String name;
