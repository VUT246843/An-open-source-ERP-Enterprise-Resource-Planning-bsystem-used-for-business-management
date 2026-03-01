    @NotNull
 * DBeaver - Universal Database Manager
    @Nullable
     * The implementation may choose to ignore some of the phases if they are not applicable.
    /**
     * This function is also used for keep-alive function.
    @NotNull
    void invalidateContext(@NotNull DBRProgressMonitor monitor, @NotNull DBCInvalidatePhase phase) throws DBException;
    DBCSession openSession(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionPurpose purpose, @NotNull String task);
    DBCExecutionContextDefaults getContextDefaults();
 *

     * Usually DBPDataSourceContainer.getDataSource() returns datasource only if datasource is connected.
     * Each phase represents a different stage of the invalidation process:
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Defaults reader/writer.
        invalidateContext(monitor, DBCInvalidatePhase.AFTER_INVALIDATE);
     * Owner datasource
     *     <li>{@code INVALIDATE} is called after network handlers are invalidated.
     */
public interface DBCExecutionContext extends DBPObject, DBPCloseableObject, DBPContextWithAttributes {
 *
 * Unless required by applicable law or agreed to in writing, software
 * Execution context.
     * Invalidates the context in a span of several phases.
     * Implementation should perform server round-trip.
 *

 * Provides access to execution sessions.
import org.jkiss.dbeaver.model.DBPObject;
     *     In most cases, it will <b>terminate</b> the underlying connection</li>
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
     * @param task task description
 * You may obtain a copy of the License at
    /**
     * invalidation involving network handlers invalidation, see {@link org.jkiss.dbeaver.runtime.jobs.InvalidateJob}.
     */
        throws DBException;
     *     <li>{@code AFTER_INVALIDATE} is called after the context is invalidated.</li>
    DBPDataSource getDataSource();
     */
import org.jkiss.dbeaver.model.struct.DBSInstance;
     */
    /**
     *

     * But in some cases (e.g. connection invalidation) datasource remains disconnected for some period of time.
     * @param monitor progress monitor
     * Invalidates the context by processing all phases. This method will invalidate just the context. For a "complete"

     * @param purpose context purpose
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
     *     <li>{@code BEFORE_INVALIDATE} is called before network handlers are invalidated.
    default void invalidateContext(@NotNull DBRProgressMonitor monitor) throws DBException {

    /**
     * @return execution context
     * @see #invalidateContext(DBRProgressMonitor, DBCInvalidatePhase)
     * </ul>
    /**


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

import org.jkiss.dbeaver.model.DBPCloseableObject;
 * you may not use this file except in compliance with the License.
     * @throws DBException on any error to signal the invalidation was not successful
    /**
     * Checks this context is really connected to remote database.
     * @return null if defaults are not supported
     * <p>
    @NotNull
 * Usually contains some kind of physical database connection inside
     */
     *
     */
import org.jkiss.code.NotNull;
     *     In most cases, it will <b>establish</b> the underlying connection</li>
import org.jkiss.dbeaver.model.DBPContextWithAttributes;
     * Context name. Like MAin, Metadata, Script X, etc.
    void checkContextAlive(DBRProgressMonitor monitor)
     */
/*

import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.model.exec;
 * limitations under the License.
    /**

    boolean isConnected();
        invalidateContext(monitor, DBCInvalidatePhase.INVALIDATE);
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 * See the License for the specific language governing permissions and

    /**
 */
import org.jkiss.dbeaver.DBException;
    DBSInstance getOwnerInstance();
     * @param monitor    monitor
     * Opens new session
    String getContextName();
}

        invalidateContext(monitor, DBCInvalidatePhase.BEFORE_INVALIDATE);
     * @param phase   invalidation phase
     * Unique context ID. Generated in the moment of context creation and never changes during context lifetime.
     * Checks whether this context is alive and underlying network connection isn't broken.
    long getContextId();
     * <ul>
    /**
     * @throws DBException on any network errors
import org.jkiss.code.Nullable;
     * <p>
     * @param monitor progress monitor
