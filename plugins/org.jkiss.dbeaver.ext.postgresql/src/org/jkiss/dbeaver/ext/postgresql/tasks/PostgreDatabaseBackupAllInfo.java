
    }
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public PostgreDataSource getDataSource() {
        this.dataSource = dataSource;
    public void setDataSource(@NotNull PostgreDataSource dataSource) {
 *
import org.jkiss.code.NotNull;
        this.databases = databases;

import java.util.List;
    @NotNull
    private List<PostgreDatabase> databases;
        this.dataSource = dataSource;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

 */
    }
    public PostgreDatabaseBackupAllInfo(@NotNull PostgreDataSource dataSource, List<PostgreDatabase> databases) {


    }
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 *
        this.databases = databases;
/*
    private PostgreDataSource dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    @NotNull
    }
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;

    public void setDatabases(List<PostgreDatabase> databases) {
 * limitations under the License.
 * You may obtain a copy of the License at
    public List<PostgreDatabase> getDatabases() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return dataSource;
 * Unless required by applicable law or agreed to in writing, software

public class PostgreDatabaseBackupAllInfo {
        return databases;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.ext.postgresql.tasks;
