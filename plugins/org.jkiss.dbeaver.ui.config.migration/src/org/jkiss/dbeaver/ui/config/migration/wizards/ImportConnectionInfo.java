 * you may not use this file except in compliance with the License.
        return port;

        StringBuilder sb = new StringBuilder();
    public void setChecked(boolean checked)
        return id;

    }
    }
        } else {
/*
    private String url;

    public void setUrl(String url) {
public class ImportConnectionInfo {

        }

            sb.append(" host:").append(host);
import java.util.Map;
    private boolean checked = false;
        this.port = port;
    private final Map<String, String> properties = new HashMap<>();
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    public String getDatabase()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DriverDescriptor getDriver()


 * Import connection info
        this.authModelId = authModelId;
    }
        return host;
    public void setDriver(DriverDescriptor driver)
    {
        this.id = id;
    }
        return password;
import java.util.ArrayList;
    }


    }
    public void setUser(String user) {
            sb.append(" port:").append(port);
    {
    {

    public Map<String, String> getAuthProperties() {
    }
 * limitations under the License.
 *

    public ImportDriverInfo getDriverInfo()
        return checked;
        return user;

            sb.append(" url:").append(url);
        this.user = user;
    {
        this.password = password;
    }
    private final List<DBWHandlerConfiguration> networkHandlers = new ArrayList<>();
    }
    }
    public void setDriverInfo(ImportDriverInfo driverInfo) {
    private final String password;

    public void setDatabase(String database)
        this.driver = driver;
        return driverInfo;
    {

    public void setPort(String port)
 *
        this.host = host;
    private String database;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }
    }

    }
    }
    }
 */
    public String getId()
    private DriverDescriptor driver;
    {
    public void setHost(String host)
        return authProperties;
        this.database = database;
    {
    {
    {
    }


    {
        return authModelId;
    private final Map<String, String> authProperties = new HashMap<>();
        this.database = database;
    {
    }
    public String getAlias()
    public ImportConnectionInfo(ImportDriverInfo driverInfo, String id, String alias, String url, String host, String port, String database, String user, String password)
    public void setProperty(String name, String value)
        this.driverInfo = driverInfo;
    public String getUser()
import java.util.List;


    private final String alias;
    }
        if (url != null) {
 * You may obtain a copy of the License at
    public boolean isChecked()
        properties.put(name, value);

    public void addNetworkHandler(DBWHandlerConfiguration handler) {
        return networkHandlers;
 * DBeaver - Universal Database Manager
    }
    public void setAuthModelId(String authModelId) {

    }
}
    {
    private String authModelId;
package org.jkiss.dbeaver.ui.config.migration.wizards;
import java.util.HashMap;


    {
    public String toString() {
    public String getUrl()
        providerProperties.put(name, value);
    @Override
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
    }
    public String getHost()
    }
    public Map<String, String> getProperties()
        sb.append("alias:").append(alias);

    public void setAuthProperty(String name, String value) {
    }
    public String getPassword()
 * See the License for the specific language governing permissions and
    private String port;

    {
    {
 * Unless required by applicable law or agreed to in writing, software

        this.port = port;
    {
        return url;
        authProperties.put(name, value);
            sb.append(" database:").append(database);
        this.checked = checked;
    }




    private String user;

        this.user = user;
/**
    }
    }
    private final Map<String, String> providerProperties = new HashMap<>();
    private final String id;
    {
    private String host;
        return sb.toString();
    public void setProviderProperty(String name, String value)
        return providerProperties;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.host = host;
        this.url = url;
        networkHandlers.add(handler);
        return alias;
        this.driverInfo = driverInfo;


        return driver;
    }
    {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Map<String, String> getProviderProperties() {
        return database;
    
    public String getPort()
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
        this.url = url;
    {
    public List<DBWHandlerConfiguration> getNetworkHandlers() {
    {
    }
        return properties;

    private ImportDriverInfo driverInfo;
        this.alias = alias;
 *
    public String getAuthModelId() {
