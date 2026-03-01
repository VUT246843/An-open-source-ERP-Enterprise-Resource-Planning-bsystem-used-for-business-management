 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

 *
 * Unless required by applicable law or agreed to in writing, software
    boolean migrationRequired(@NotNull DBPConnectionConfiguration oldConfiguration);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.connection;
public interface DBPConnectionConfigurationMigrator {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    void migrateConfiguration(
 * Migrates data source's connection configuration after its driver was replaced.
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * limitations under the License.
        @NotNull DBPConnectionConfiguration newConfiguration) throws DBException;

}

/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBPConnectionConfiguration oldConfiguration,
