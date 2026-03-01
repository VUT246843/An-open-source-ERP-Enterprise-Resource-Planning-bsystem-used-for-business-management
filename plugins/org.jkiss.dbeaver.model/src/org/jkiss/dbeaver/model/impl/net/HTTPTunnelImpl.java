 *
        @NotNull DBCInvalidatePhase phase
 *
 * you may not use this file except in compliance with the License.
        return null;
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
    public boolean matchesParameters(@NotNull String host, int port) {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
        return false;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
    public void addCloseListener(@NotNull Runnable listener) {
    @Nullable


    @NotNull

 *
    }
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.net.DBWTunnel;
    public void closeTunnel(@NotNull DBRProgressMonitor monitor) throws DBException, IOException
    public DBPConnectionConfiguration initializeHandler(@NotNull DBRProgressMonitor monitor, @NotNull DBWHandlerConfiguration configuration, @NotNull DBPConnectionConfiguration connectionInfo)
    public void invalidateHandler(
    @Override
 * DBeaver - Universal Database Manager
public class HTTPTunnelImpl implements DBWTunnel {
    public Object getImplementation() {
import java.io.IOException;
    {
        return AuthCredentials.NONE;
    @Override
        @NotNull DBPDataSource dataSource,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
    @Override
    }
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        // nothing to do
    @Override
 * HTTP(S) tunnel
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.code.NotNull;

/**
    @NotNull
    }

    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    @Override
    @Override
    }
        throws DBException, IOException

    ) throws DBException {
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

    }
        return connectionInfo;
        // do nothing

 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
    public AuthCredentials getRequiredCredentials(@NotNull DBWHandlerConfiguration configuration) {
package org.jkiss.dbeaver.model.impl.net;
import org.jkiss.dbeaver.model.DBPDataSource;
 */
    }
}
