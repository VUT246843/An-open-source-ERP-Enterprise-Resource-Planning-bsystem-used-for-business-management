import org.jkiss.code.NotNull;
        return new String(data, StandardCharsets.UTF_8);


    public boolean isSecure() {
    public void setData(byte[] data) {
        if (data == null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return false;
    }
 * DBeaver - Universal Database Manager
    public byte[] getData() {
import java.io.InputStream;
    }

    public List<DBPDataSourceConfigurationStorage> getConfigurationStorages() {

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        }
    private byte[] data;
 *
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
    @Override
import org.jkiss.code.Nullable;
}
    }
    public void writeConfiguration(@NotNull String name, @Nullable byte[] data) throws DBException, IOException {
    public String getStringData() {
 *
 * You may obtain a copy of the License at
        return null;
        return new ByteArrayInputStream(data);
        this.data = data;

    public boolean isReadOnly() {

    public InputStream readConfiguration(@NotNull String name, Collection<String> dataSourceIds) throws DBException, IOException {

package org.jkiss.dbeaver.registry;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.ByteArrayInputStream;
        this.data = data;
            return null;
import java.nio.charset.StandardCharsets;

    @Override
    }
import org.jkiss.dbeaver.DBException;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return true;
    }
    }
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import java.io.IOException;


        return data;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Collection;
 */
import java.util.List;
/*
    @Override
 *
public class DataSourceConfigurationManagerBuffer implements DataSourceConfigurationManager {
    }
    @Override
 * limitations under the License.

