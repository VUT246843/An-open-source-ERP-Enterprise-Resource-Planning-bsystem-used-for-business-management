import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.model.DBPDataSource;
import java.io.IOException;
        return connectionInfo;

import org.jkiss.dbeaver.model.net.DBWConfigProvider;
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


import org.jkiss.code.NotNull;
        @NotNull DBWHandlerConfiguration configuration,
 *
package org.jkiss.dbeaver.model.impl.net;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    @Override
 */
 *
 *
    public void invalidateHandler(
 * Copyright (C) 2010-2024 DBeaver Corp and others
        // nothing to do

/**
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * SSL Handler
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBPConnectionConfiguration connectionInfo
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
    @NotNull
    }
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
    ) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBPDataSource dataSource,
    public DBPConnectionConfiguration initializeHandler(
    ) throws DBException, IOException {
        @NotNull DBCInvalidatePhase phase
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
import org.jkiss.dbeaver.DBException;
}

    }
    @Override
        @NotNull DBRProgressMonitor monitor,
public class SSLHandlerImpl implements DBWNetworkHandler, DBWConfigProvider {
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0
