    public PostgreDatabaseBackupInfo(@NotNull PostgreDatabase database, @Nullable List<PostgreSchema> schemas, @Nullable List<PostgreTableBase> tables) {
import java.util.List;
 * limitations under the License.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 *
    @Nullable

        return schemas;
 *

public class PostgreDatabaseBackupInfo extends PostgreDatabaseBackupRestoreInfo {
package org.jkiss.dbeaver.ext.postgresql.tasks;

    @Nullable
    private List<PostgreSchema> schemas;
 * Unless required by applicable law or agreed to in writing, software

    private List<PostgreTableBase> tables;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    @Nullable
 * DBeaver - Universal Database Manager

    public void setTables(@Nullable List<PostgreTableBase> tables) {
 *
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    }
import org.jkiss.code.Nullable;
    public void setSchemas(@Nullable List<PostgreSchema> schemas) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;

        this.schemas = schemas;
        super(database);
}
*/
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.schemas = schemas;
    }
        return tables;
    public List<PostgreSchema> getSchemas() {
 * you may not use this file except in compliance with the License.

        this.tables = tables;
    @Nullable
 */
        this.tables = tables;
* PostgreDatabaseBackupInfo
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<PostgreTableBase> getTables() {
