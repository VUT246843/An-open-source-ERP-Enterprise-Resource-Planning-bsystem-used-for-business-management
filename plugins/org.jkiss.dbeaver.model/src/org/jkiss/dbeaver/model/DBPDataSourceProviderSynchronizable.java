 */
     * @return {@code true} if the remote data source is synchronized, {@code false} otherwise
 * DBeaver - Universal Database Manager
    void syncLocalDataSource(
    /**
     * Checks whether the synchronization is enabled for the local data source.
     * @param container local data source container

     * Synchronizes the remote data source with the local data source.
     *


        @NotNull DBRProgressMonitor monitor,
        @NotNull DBRProgressMonitor monitor,

        @NotNull DBPDataSourceContainer container
    ) throws DBException;
     * Checks whether the local data source is synchronized with the remote one.

     */
 *
import org.jkiss.dbeaver.DBException;
     */
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Checks whether the remote database was changed in some way since last synchronization request.
public interface DBPDataSourceProviderSynchronizable extends DBPDataSourceProvider {
    /**
     * @param monitor   progress monitor which is used for tracking synchronization progress
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void syncRemoteDataSource(
     * @param monitor   progress monitor which is used for tracking synchronization progress
 * You may obtain a copy of the License at
     *
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @throws DBException on any database error
     * @throws DBException on any database error
        @NotNull DBRProgressMonitor monitor,
/*
    ) throws DBException;
    /**
        @NotNull DBPDataSourceContainer container

 * limitations under the License.
     *
     * @param monitor   progress monitor which is used for tracking synchronization progress
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBRProgressMonitor monitor,
 *
     * @param container data source container that needs synchronization
     */
 * Provider for a synchronizable data source.
        @NotNull DBPDataSourceContainer container
     * @throws DBException on any database error
     * @throws DBException on any database error
    ) throws DBException;
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     */
    boolean isRemoteDataSourceSynchronized(
     * @param container data source container that needs synchronization
package org.jkiss.dbeaver.model;
     *
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @return {@code true} if the local data source is synchronized, {@code false} otherwise
 * you may not use this file except in compliance with the License.

        @NotNull DBPDataSourceContainer container
     * Synchronizes the local data source with the remote data source.
     *
    ) throws DBException;
    boolean isLocalDataSourceSynchronized(
     * @return {@code true} if the local data source is synchronizable, {@code false} otherwise
     * @param monitor   progress monitor which is used for tracking progress
     */
/**
    /**
 *
    boolean isSynchronizationEnabled(@NotNull DBPDataSourceContainer container);
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param container data source container that needs synchronization
