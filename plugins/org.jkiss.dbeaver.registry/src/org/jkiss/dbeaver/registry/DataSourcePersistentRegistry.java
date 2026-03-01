import org.jkiss.code.Nullable;

 *
        @Nullable Collection<String> dataSourceIds,
     * Saves data sources.
    );
        @NotNull List<DBPDataSourceConfigurationStorage> storages,
     */
        @NotNull DataSourceConfigurationManager configurationManager,
/**
     * Returns data source configuration manager.
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.registry;
        @Nullable Predicate<DBPDataSourceContainer> filter

 */
    /**
 */
    );
 * You may obtain a copy of the License at
    /**
 * See the License for the specific language governing permissions and
        @NotNull DataSourceConfigurationManager manager,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    DataSourceParseResults loadDataSources(
     */
 * limitations under the License.
    void saveDataSources();
 * DBeaver - Universal Database Manager
        boolean refresh,
    DataSourceConfigurationManager getConfigurationManager();
import java.util.List;
import java.util.Collection;
 *
    /**
        boolean purgeUntouched
 * Data source persistent registry.
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
 * Licensed under the Apache License, Version 2.0 (the "License");



 * Unless required by applicable law or agreed to in writing, software
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
/*
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
    /**
    void saveConfigurationToManager(
}
 *
        @NotNull DBRProgressMonitor monitor,
     * Saves data source configuration to the configuration manager.
import org.jkiss.code.NotNull;
import java.util.function.Predicate;

public interface DataSourcePersistentRegistry extends DBPDataSourceRegistry {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
     * Loads data sources from storages.

