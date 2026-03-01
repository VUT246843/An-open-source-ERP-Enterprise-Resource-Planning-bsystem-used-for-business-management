
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
public interface DataSourceSerializer<T extends DataSourceDescriptor> {
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import java.io.IOException;
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBPDataSourceConfigurationStorage configurationStorage,
    ) throws DBException, IOException;

        @NotNull DBRProgressMonitor monitor,
        @NotNull List<T> localDataSources)
 * Datasource serializer interface
 *
 *
        @NotNull DataSourceConfigurationManager configurationManager,
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DataSourceParseResults parseResults,
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
    void saveDataSources(
 * limitations under the License.
import java.util.Collection;
package org.jkiss.dbeaver.registry;
 * Unless required by applicable law or agreed to in writing, software
        throws DBException, IOException;
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
/**
 * See the License for the specific language governing permissions and
        @NotNull DataSourceConfigurationManager configurationManager,
}
        @Nullable Collection<String> dataSourceIds
 *
    boolean parseDataSources(
import org.jkiss.dbeaver.DBException;

import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
