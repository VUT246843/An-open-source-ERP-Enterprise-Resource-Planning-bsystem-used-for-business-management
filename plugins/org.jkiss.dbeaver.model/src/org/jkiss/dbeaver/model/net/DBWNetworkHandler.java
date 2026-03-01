    ) throws DBException;
     * @throws DBException on any error to signal the invalidation was not successful
    @NotNull
 */
import org.jkiss.dbeaver.DBException;
     * @param dataSource data source
     * @param monitor progress monitor
import java.io.IOException;
        @NotNull DBRProgressMonitor monitor,
        return new DBPDataSourceContainer[0];
import org.jkiss.dbeaver.model.DBPDataSource;
        throws DBException, IOException;
    /**
 * DBeaver - Universal Database Manager
public interface DBWNetworkHandler {


        @NotNull DBPConnectionConfiguration connectionInfo)
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBWHandlerConfiguration configuration,
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * you may not use this file except in compliance with the License.
    DBPConnectionConfiguration initializeHandler(
    default DBPDataSourceContainer[] getDependentDataSources() {
    /**

     * Returns an array of data sources that depend on this handler. The returned array may be empty.
/**
        @NotNull DBCInvalidatePhase phase
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
     */
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        @NotNull DBRProgressMonitor monitor,
    void invalidateHandler(

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.net;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * limitations under the License.
    @NotNull
        @NotNull DBPDataSource dataSource,
 *
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 *
     * Invalidates the network handler in a span of several phases.
}
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param phase invalidation phase
     *
 *
 * Unless required by applicable law or agreed to in writing, software
 * Network handler
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
