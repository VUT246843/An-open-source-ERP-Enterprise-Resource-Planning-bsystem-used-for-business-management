
 * Unless required by applicable law or agreed to in writing, software
public class MySQLDatabaseExportInfo {
 *
    private MySQLCatalog database;
    }
 *

        return false;
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean equals(Object obj) {
        return database.getName() + " " + tables;
 * limitations under the License.
 * See the License for the specific language governing permissions and
*/
        return tables;
import java.util.Collection;
    public String toString() {
package org.jkiss.dbeaver.ext.mysql.tasks;

    }
* MySQLDatabaseExportInfo

    private Collection<MySQLTableBase> tables;
import org.jkiss.code.NotNull;
    @Nullable
        if (obj instanceof MySQLDatabaseExportInfo ei) {
        this.database = database;
    public MySQLDatabaseExportInfo(@NotNull MySQLCatalog database, @Nullable Collection<MySQLTableBase> tables) {
    }

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
            return Objects.equals(database, ei.database) && Objects.equals(tables, ei.tables);
    @NotNull
}
    }
 *
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
import org.jkiss.code.Nullable;
 */

        return database;
import java.util.Objects;
    @Override

    }
        this.tables = tables;

    @Override
    public Collection<MySQLTableBase> getTables() {
    public MySQLCatalog getDatabase() {
 *     http://www.apache.org/licenses/LICENSE-2.0
