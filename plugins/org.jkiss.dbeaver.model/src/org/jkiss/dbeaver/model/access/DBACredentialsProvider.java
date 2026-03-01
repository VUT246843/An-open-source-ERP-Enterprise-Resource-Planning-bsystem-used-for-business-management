 * See the License for the specific language governing permissions and
        throws DBException;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * you may not use this file except in compliance with the License.
 */
/**
 * Auth credentials provider.
import org.jkiss.code.NotNull;
 *
    boolean provideAuthParameters(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer dataSourceContainer, @NotNull DBPConnectionConfiguration configuration)
 * Licensed under the Apache License, Version 2.0 (the "License");

 *

 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Fill credential parameters in the specified container and configuration.
 * You may obtain a copy of the License at
    String getAuthContextType();
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.access;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
     * Returns false on auth cancel. True otherwise.
 * DBeaver - Universal Database Manager
     */
}
    /**
    @NotNull
public interface DBACredentialsProvider {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*

