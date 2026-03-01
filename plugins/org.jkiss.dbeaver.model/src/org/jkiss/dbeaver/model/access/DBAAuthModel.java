 *
     * @return auth token. In most cases it is the same credentials object
        @NotNull DBPConnectionConfiguration configuration,
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
    Object initAuthentication(
 */
     * @param connProperties auth model specific options.
        @NotNull DBPConnectionConfiguration configuration,
     * @param monitor progress monitor
    CREDENTIALS createCredentials();
    void saveCredentials(
    default DBAAuthCredentialsForm createCredentialsForm(
        @NotNull CREDENTIALS credentials
     * @throws DBException on error
    ) {
     * Refresh credentials in current session
}
     * Create credentials from datasource configuration
     */
 * limitations under the License.
    /**
 * Auth model.
 * Unless required by applicable law or agreed to in writing, software
 */


    /**
    /**


     */
    @NotNull
    /**
        @NotNull DBPDataSource dataSource,

import java.util.Properties;
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBPDataSourceContainer dataSource,
        @NotNull DBPDataSourceContainer dataSource,
     * @param credentials auth credentials
 * DBeaver - Universal Database Manager
    void endAuthentication(
     * Provide credentials into connection configuration, always includes secured properties
     * Save credentials into connection configuration
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     *
import org.jkiss.code.NotNull;
        @Nullable DBPDataSourceContainer dataSource,
     */
import org.jkiss.dbeaver.model.DBPDataSource;
public interface DBAAuthModel<CREDENTIALS extends DBAAuthCredentials> {
        @NotNull DBRProgressMonitor monitor,


 *
    ) {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return dataSource == null || configuration == null ?
    }
        @NotNull DBPConnectionConfiguration configuration,
 * You may obtain a copy of the License at
     * @param dataSource  data source
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBPDataSourceContainer dataSource,
        saveCredentials(dataSource, configuration, credentials);
 *

    void refreshCredentials(
 * See the License for the specific language governing permissions and
            loadCredentials(dataSource, configuration);
    default void provideCredentials(
package org.jkiss.dbeaver.model.access;

        @NotNull CREDENTIALS credentials
        @NotNull CREDENTIALS credentials

        @NotNull DBPDataSourceContainer dataSource,
        @NotNull Properties connProperties);
/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    );
        @NotNull DBPConnectionConfiguration configuration,
     */
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    ) throws DBException;
     * @param configuration connection configuration
    /**
    CREDENTIALS loadCredentials(@NotNull DBPDataSourceContainer dataSource, @NotNull DBPConnectionConfiguration configuration);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
     * Called before connection opening. May modify any connection configuration properties
        @NotNull Properties connProperties) throws DBException;
        // backward compatibility
            createCredentials() :

        @NotNull DBPConnectionConfiguration configuration,
     * Finishes authentication
import org.jkiss.code.Nullable;
        @NotNull CREDENTIALS credentials,
        @Nullable DBPConnectionConfiguration configuration
    /**
    @NotNull
 * you may not use this file except in compliance with the License.
     */
