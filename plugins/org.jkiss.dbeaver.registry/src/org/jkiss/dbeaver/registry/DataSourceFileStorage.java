    public String getStorageName() {
    public String getStorageSubId() {
    @NotNull
    @NotNull
import java.nio.file.Path;
    @Override

    }
 * DataSourceStorage

    }

    }
    public int hashCode() {
    public boolean equals(Object obj) {
    }
        return obj instanceof DataSourceFileStorage &&

 * limitations under the License.
    }
        return false;
    }
        } else {

 *
    DataSourceFileStorage(Path sourceFile, boolean isLegacy, boolean isDefault) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isVirtual() {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        return configSuffix;
                DBPDataSourceRegistry.MODERN_CONFIG_FILE_PREFIX.length(),

 * Unless required by applicable law or agreed to in writing, software
    public boolean isDefault() {

    }
    public boolean isValid() {
        return "file://" + sourceFile.toAbsolutePath();
    private boolean isLegacy;
    public String toString() {
    }
    @Override
            String configFileName = sourceFile.getFileName().toString();

        return true;

/**
{
    }
 *
    public String getStorageId() {

    }


        this.sourceFile = project.getMetadataFolder(true).resolve(DBPDataSourceRegistry.MODERN_CONFIG_FILE_NAME);

    @Override
}
 */
 * You may obtain a copy of the License at
    private Path sourceFile;
    private boolean isDefault;
 *
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPProject;
        this.isLegacy = isLegacy;
        this.isDefault = isDefault;
        return isLegacy;
        return sourceFile.hashCode();
    @Override


            sourceFile.equals(((DataSourceFileStorage) obj).sourceFile);
    }
package org.jkiss.dbeaver.registry;
        this.isLegacy = false;
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    @Nullable
        return sourceFile.toAbsolutePath().toString();

import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        if (isDefault) {
    }
            configSuffix = "";
    private String configSuffix;
    public String getName() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        }
    @Override

    public boolean isLegacy() {
    void convertToModern(DBPProject project) {
import org.jkiss.code.Nullable;
class DataSourceFileStorage implements DBPDataSourceConfigurationStorage
    @Override
                configFileName.length() - DBPDataSourceRegistry.MODERN_CONFIG_FILE_EXT.length());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            configSuffix = configFileName.substring(
 */
        return sourceFile;
    @Override
        return sourceFile.getFileName().toString();

        return sourceFile.getFileName().toString();
        this.sourceFile = sourceFile;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return isDefault;
    public Path getSourceFile() {
/*
