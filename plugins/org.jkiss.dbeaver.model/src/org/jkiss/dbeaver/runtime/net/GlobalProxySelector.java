                if (networkHandler.isEnabled() && networkHandler.getType() == DBWHandlerType.PROXY) {
    protected DBPDataSourceContainer getActiveDataSourceContainer(@NotNull URI uri) {
 * limitations under the License.
        parent.connectFailed(uri, sa, ioe);
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;

                        proxies.add(proxy);

        return null;


        if (CommonUtils.isEmpty(host)) {
    }
    public GlobalProxySelector(ProxySelector parent) {

//            return parent.select(uri);
            if (proxies != null) {
    }
            return null;
                    String proxyHost = networkHandler.getStringProperty(SocksConstants.PROP_HOST);
import java.io.IOException;
 */
        return parent;
        this.parent = parent;
import org.jkiss.dbeaver.model.net.DBWHandlerType;
    }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
//        if (ArrayUtils.contains(LOCAL_HOSTS, host)) {
        }
    protected List<Proxy> getProxiesForDataSource(@NotNull URI uri, @NotNull DBPDataSourceContainer dataSourceContainer) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int port = uri.getPort();

 * distributed under the License is distributed on an "AS IS" BASIS,

                        }
        String scheme = uri.getScheme();

            return proxies;
 * Unless required by applicable law or agreed to in writing, software
//        }
import org.jkiss.dbeaver.model.impl.net.SocksConstants;
                        Proxy proxy = new Proxy(Proxy.Type.SOCKS, proxyAddr);
public class GlobalProxySelector extends ProxySelector {
        String path = uri.getPath();

package org.jkiss.dbeaver.runtime.net;
import org.jkiss.code.Nullable;
                }
        // Skip localhosts. In fact, it is a bad idea (see #3592)
        // 2. Check for connections' proxy config
    @Nullable
        }

        return DBExecUtils.findConnectionContext(host, port, path);
            for (DBWHandlerConfiguration networkHandler : dataSourceContainer.getActualConnectionConfiguration().getHandlers()) {
import java.util.List;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            List<Proxy> proxies = getProxiesForDataSource(uri, dataSourceContainer);
        return parent.select(uri);

    public ProxySelector getParent() {
 * Global proxy selector
 * You may obtain a copy of the License at
            // 2. Check for connections' proxy config

    }
import org.jkiss.utils.CommonUtils;
    }
    @Override
 * you may not use this file except in compliance with the License.
                    int proxyPort = networkHandler.getIntProperty(SocksConstants.PROP_PORT);
    private static final Log log = Log.getLog(GlobalProxySelector.class);
                    if (!CommonUtils.isEmpty(proxyHost) && proxyPort != 0) {
            return null;
    private final ProxySelector parent;
import org.jkiss.dbeaver.Log;
            }
            List<Proxy> proxies = null;
                    }
 *
/**
        if (CommonUtils.isEmpty(scheme)) {
                return proxies;

 * DBeaver - Universal Database Manager
    @Override

    @Nullable
 *
        if (dataSourceContainer != null) {
        if (SocksConstants.SOCKET_SCHEME.equals(uri.getScheme())) {
        DBPDataSourceContainer dataSourceContainer = getActiveDataSourceContainer(uri);
        }
            }
                        InetSocketAddress proxyAddr = new InetSocketAddress(proxyHost, proxyPort);
 */
 *
import java.net.*;
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {

import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

                        log.debug("Use SOCKS proxy [" + proxyAddr + "]");
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
/*
        }
        String host = uri.getHost();
                            proxies = new ArrayList<>();
    }
                        if (proxies == null) {
    public List<Proxy> select(URI uri) {
