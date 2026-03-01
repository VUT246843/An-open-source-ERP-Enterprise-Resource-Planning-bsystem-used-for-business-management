
        @NotNull String createScriptPath,
 * limitations under the License.
    }

    private final String updateScriptPrefix;
    public @Nullable SQLInitialSchemaFiller getInitialSchemaFiller() {
    public SQLSchemaConfig(
        return schemaId;

        @NotNull String schemaId,
    @Nullable

        return schemaVersionObsolete;
        @NotNull ClassLoader classLoader,

        return createScriptPath;
        this.versionManager = versionManager;
    public @NotNull String getUpdateScriptPrefix() {
    private final String schemaId;
        @NotNull ClassLoader classLoader
 * Licensed under the Apache License, Version 2.0 (the "License");
    public @NotNull SQLSchemaVersionManager getVersionManager() {
 * You may obtain a copy of the License at
 *

        this.schemaId = schemaId;


        return schemaVersionActual;
 * DBeaver - Universal Database Manager
        @NotNull String updateScriptPrefix,
        int schemaVersionObsolete,
        this.updateScriptPrefix = updateScriptPrefix;
    }
        @NotNull SQLSchemaVersionManager versionManager,
        this.createScriptPath = createScriptPath;
        this.initialSchemaFiller = initialSchemaFiller;
        this.schemaVersionObsolete = schemaVersionObsolete;
        return initialSchemaFiller;
        @NotNull String createScriptPath,

        return updateScriptPrefix;
    private final int schemaVersionObsolete;
    public @NotNull ClassLoader getClassLoader() {
        return versionManager;
 * you may not use this file except in compliance with the License.
    ) {

    }
public class SQLSchemaConfig {
    private final ClassLoader classLoader;

 */

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        this.schemaVersionActual = schemaVersionActual;
    private SQLInitialSchemaFiller initialSchemaFiller;
 * See the License for the specific language governing permissions and

    private final SQLSchemaVersionManager versionManager;
    private final int schemaVersionActual;

        this.initialSchemaFiller = initialSchemaFiller;
    public int getSchemaVersionActual() {
        int schemaVersionActual,
    }

    public @NotNull String getSchemaId() {
    }
    }
    public int getSchemaVersionObsolete() {
    public @NotNull String getCreateScriptPath() {
        @NotNull SQLSchemaVersionManager versionManager,
    ) {
    @NotNull
}    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable SQLInitialSchemaFiller initialSchemaFiller
    @NotNull

    }
 * Unless required by applicable law or agreed to in writing, software
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        int schemaVersionObsolete,
        int schemaVersionActual,
 *
    }

package org.jkiss.dbeaver.model.sql.schema;
    private final String createScriptPath;
/*
        return classLoader;
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
    public SQLSchemaConfig(

 *

import org.jkiss.code.NotNull;
    }
        @NotNull String schemaId,
        @NotNull String updateScriptPrefix,
        this.classLoader = classLoader;
    }
        this(schemaId, createScriptPath, updateScriptPrefix, schemaVersionActual, schemaVersionObsolete, versionManager, classLoader, null);
    public void setInitialSchemaFiller(@NotNull SQLInitialSchemaFiller initialSchemaFiller) {
