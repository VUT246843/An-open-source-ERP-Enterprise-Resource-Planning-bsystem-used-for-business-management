
}
    );
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.duckdb.model;
    }
 * See the License for the specific language governing permissions and
 *
public class DuckDBGenericCatalog extends GenericCatalog {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Set;
 * you may not use this file except in compliance with the License.
        "temp"
    private static final Set<String> SYSTEM_CATALOG_NAMES = Set.of(
 *
/*
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    }
 * limitations under the License.

    public DuckDBGenericCatalog(@NotNull GenericDataSource dataSource, @NotNull String catalogName) {

import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

        super(dataSource, catalogName);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        "system",
    public boolean isSystem() {
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
 * DBeaver - Universal Database Manager
    @Override
 *

 */
        return SYSTEM_CATALOG_NAMES.contains(this.getName());
 * Unless required by applicable law or agreed to in writing, software
