import java.io.InputStream;

 * You may obtain a copy of the License at
        this.data = data;

    @NotNull

        return "memory";
package org.jkiss.dbeaver.registry;
    }
    @Nullable
/**
        return false;
    public String getStorageId() {
    }

/*
 * See the License for the specific language governing permissions and
    public boolean isVirtual() {

 * DataSourceStorage
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return null;
 */
public class DataSourceMemoryStorage implements DBPDataSourceConfigurationStorage {
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        return true;

    @Override
        return new ByteArrayInputStream(data);

    public String getStorageSubId() {
    }
    @Override
 */
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

        return true;
 * Unless required by applicable law or agreed to in writing, software
import java.io.ByteArrayInputStream;
    public InputStream getInputStream() {
    @Override
    private final byte[] data;
 *
    public boolean isValid() {
 *
    @NotNull

    @Override
    public boolean isDefault() {
    }
 * you may not use this file except in compliance with the License.
    public DataSourceMemoryStorage(@NotNull byte[] data) {
