 */

 * distributed under the License is distributed on an "AS IS" BASIS,
     */
/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
package org.jkiss.dbeaver.model.app;
 *
import org.jkiss.code.NotNull;

 */
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Removes data source from registry cache.
/*
    /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    /**

 * Provides actions without applying changes in storage.
 * See the License for the specific language governing permissions and
 * Data source registry cache.

 *
    void removeDataSourceFromList(@NotNull DBPDataSourceContainer dataSource);
}
     * Adds new data source to registry cache.
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    void addDataSourceToList(@NotNull DBPDataSourceContainer dataSource);
 *
 * You may obtain a copy of the License at
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
public interface DBPDataSourceRegistryCache {
