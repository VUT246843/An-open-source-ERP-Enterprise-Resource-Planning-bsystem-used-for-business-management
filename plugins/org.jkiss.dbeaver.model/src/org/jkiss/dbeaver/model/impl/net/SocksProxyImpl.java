            int socksPort = configuration.getIntProperty(SocksConstants.PROP_PORT);
            return socksPort == port;
            defProxySelector = new GlobalProxySelector(ProxySelector.getDefault());
        return false;
public class SocksProxyImpl implements DBWNetworkHandler, DBWForwarder {
    public boolean matchesParameters(@NotNull String host, int port) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
import java.io.IOException;
}
            return;
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
    private static final Log log = Log.getLog(SocksProxyImpl.class);
        if (ProxySelector.getDefault() instanceof GlobalProxySelector) {
 * Unless required by applicable law or agreed to in writing, software

    private static void setupProxyHandler() {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.net.GlobalProxySelector;
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.net.ProxySelector;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

        this.configuration = configuration;
        return connectionInfo;
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.model.impl.net;
        @NotNull DBCInvalidatePhase phase
        // nothing to do
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBPDataSource dataSource,
    public DBPConnectionConfiguration initializeHandler(
 */

import org.jkiss.dbeaver.runtime.DBWorkbench;

/**
    public void invalidateHandler(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.net.DBWForwarder;
        @NotNull DBWHandlerConfiguration configuration,
        if (host.equals(configuration.getStringProperty(SocksConstants.PROP_HOST))) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.Log;
        @NotNull DBPConnectionConfiguration connectionInfo
import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
 * Licensed under the Apache License, Version 2.0 (the "License");


        }
        if (defProxySelector == null) {
import org.jkiss.dbeaver.DBException;
 *

 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
    }
/*
    }
        }
    private DBWHandlerConfiguration configuration;
import org.jkiss.code.NotNull;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * SOCKS proxy
        // Init default network settings
    }
        setupProxyHandler();
        ProxySelector.setDefault(defProxySelector);
        ProxySelector defProxySelector = GeneralUtils.adapt(DBWorkbench.getPlatform(), ProxySelector.class);
    @Override
    }
    @NotNull
        @NotNull DBRProgressMonitor monitor,
    ) throws DBException, IOException {
    @Override


 *
    @Override

    ) throws DBException {
 *
 * limitations under the License.
