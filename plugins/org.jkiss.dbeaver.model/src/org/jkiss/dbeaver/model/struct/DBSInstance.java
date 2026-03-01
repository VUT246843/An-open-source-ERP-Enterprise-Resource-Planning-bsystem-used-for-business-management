     * @return collection of contexts
import org.jkiss.dbeaver.model.DBPExclusiveResource;
    DBCExecutionContext openIsolatedContext(
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public interface DBSInstance extends DBSObject
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param purpose context purpose (just a descriptive string)
    DBPExclusiveResource getExclusiveLock();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model.struct;
    ) throws DBException;
 * Instance wraps physical connection to database server.
    /**
/*

     */
 * Data Source instance.
     *
     * @param meta request for metadata operations context

 *
     * @return execution context


    /**
{
 * You may obtain a copy of the License at
     * All opened execution contexts
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 *

        @NotNull DBRProgressMonitor monitor,
     * Default execution context

     *
 */
 * Single datasource may implement DBSInstance or DBSInstanceContainer
     * @return default data source execution context.
import org.jkiss.code.NotNull;
    @NotNull
    @NotNull
    DBCExecutionContext[] getAllContexts();
        @NotNull String purpose,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
     */
     * @param initFrom initialize new context parameters from specified context
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
import org.jkiss.code.Nullable;
        @Nullable DBCExecutionContext initFrom
     * @param monitor progress monitor
    @NotNull
 * See the License for the specific language governing permissions and
    DBCExecutionContext getDefaultContext(@NotNull DBRProgressMonitor monitor, boolean meta);
 * Instance manages execution contexts.
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
 * DBeaver - Universal Database Manager
    void shutdown(DBRProgressMonitor monitor);
import org.jkiss.dbeaver.DBException;
     * @param monitor progress monitor
     * Opens new isolated execution context.
 *

 * you may not use this file except in compliance with the License.
 *
