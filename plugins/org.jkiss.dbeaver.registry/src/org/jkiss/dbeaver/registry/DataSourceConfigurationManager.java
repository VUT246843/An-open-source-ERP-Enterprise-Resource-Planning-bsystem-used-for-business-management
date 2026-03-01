        @Nullable Collection<String> dataSourceIds) throws DBException, IOException;
    default boolean isTrusted() {

 * You may obtain a copy of the License at

/*

        @NotNull String name,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import java.io.IOException;

import org.jkiss.code.NotNull;
    void writeConfiguration(@NotNull String name, @Nullable byte[] data) throws DBException, IOException;

/**
import org.jkiss.dbeaver.DBException;
    InputStream readConfiguration(
     */
    }
 * Configuration files manager
 * See the License for the specific language governing permissions and
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.io.InputStream;


     */
    /**
 *
 *

     * Reads datasource configuration.
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
 * you may not use this file except in compliance with the License.
    boolean isSecure();

 * DBeaver - Universal Database Manager
public interface DataSourceConfigurationManager {
import java.util.List;
    /**

import org.jkiss.code.Nullable;
 */
package org.jkiss.dbeaver.registry;
        return true;
     * Indicates that configuration manager is trusted and can store sensitive data
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
}
     * If dataSourceIds is specified then reads only configuration linked with specified datasources.
    List<DBPDataSourceConfigurationStorage> getConfigurationStorages();
    boolean isReadOnly();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
