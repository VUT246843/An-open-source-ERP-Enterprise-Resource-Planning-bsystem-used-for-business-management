import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 *
import org.jkiss.code.NotNull;


 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * @param connectionInfo connection info
package org.jkiss.dbeaver.model;
/*
 * you may not use this file except in compliance with the License.
    @NotNull
 * See the License for the specific language governing permissions and
     * Constructs connection URL
/**
 * Data source URL provider
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo);
 * limitations under the License.
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface DBPDataSourceURLProvider {
     * @param driver driver descriptor
 * DBeaver - Universal Database Manager
     */
    /**
 *
 * You may obtain a copy of the License at
     * @return valid connection URL or null (if URLs not supported by driver)
 */
 *
 */
