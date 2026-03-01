    public boolean hasValuableInfo() {
        return savePassword;
        secureProperties.putAll(JSONUtils.deserializeStringMap(handlerMap, "properties"));
import org.jkiss.dbeaver.DBException;

    public int getIntProperty(@NotNull String name, int defValue) {
                CommonUtils.equalObjects(this.dataSource, source.dataSource) &&
        password = JSONUtils.getString(handlerMap, "password");
    @SecureProperty
            return getHandlerDescriptor().createHandler(type);
        this.savePassword = savePassword;
    DBWHandlerConfiguration() {
        }
    }
 *
        }

            this.properties.put(name, value);
 */
        if (!isSavePassword() && ignoreSecureProperties) {
    }
    private boolean savePassword = true;
    @NotNull
    public Map<String, String> getSecureProperties() {
import org.jkiss.dbeaver.model.data.json.JSONUtils;

    private final Map<String, Object> properties;
    @NotNull
    }

        }

    public String getTitle() {
    public boolean isSecured() {
    }
    }
 * See the License for the specific language governing permissions and
    private String userName;
            return false;
 * Network handler configuration
    }

    public boolean isEnabled() {
    public void setPassword(@Nullable String password) {

    }
    }
    @Nullable


    public DBPDataSourceContainer getDataSource() {
        this.properties = new LinkedHashMap<>();
        return id;
    public void setSecureProperties(@NotNull Map<String, String> secureProperties) {
        }
        this.properties.clear();

    public String getSecureProperty(@NotNull String name) {
        userName = JSONUtils.getString(handlerMap, "user");
    public String getPassword() {
    private boolean enabled;
        return dataSource == null ? null : dataSource.getDriver();
    public Object getProperty(@NotNull String name) {
            handlerProps.put("user", userName);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
            handlerProps.put("password", password);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Map<String, Object> saveToMap() {
            return handlerProps;
    @Nullable
        this.secureProperties.putAll(secureProperties);

    @NotNull
        this.secureProperties = new LinkedHashMap<>(configuration.secureProperties);
    public <T extends DBWNetworkHandler> T createHandler(Class<T> type) throws DBException {
    public boolean getBooleanProperty(@NotNull String name, boolean defValue) {
        return dataSource;
    public void setProperty(@NotNull String name, @Nullable Object value) {
                this.savePassword == source.savePassword &&
        return CommonUtils.getBoolean(this.properties.get(name), defValue);
        try {
    public void setEnabled(boolean enabled) {
    }
        return
 * You may obtain a copy of the License at
    }
    public String getId() {

    public boolean isSavePassword() {
    public static final String PROP_HOST = "host";
        return CommonUtils.toString(this.properties.get(name), null);
    }
    }

    public boolean getBooleanProperty(@NotNull String name) {
            !CommonUtils.isEmpty(properties) ||

    @Override
        return getHandlerDescriptor().isSecured();
        this.secureProperties = new LinkedHashMap<>();
    public Map<String, Object> saveToSecret() {
 * you may not use this file except in compliance with the License.
        String value = secureProperties.get(name);
    public void setDataSource(DBPDataSourceContainer dataSource) {

        this.properties = new LinkedHashMap<>(configuration.properties);
    }
        return this.properties.get(name);
        userName = GeneralUtils.replaceVariables(userName, variableResolver);
    private String id;
        }
 *
        return this.getBooleanProperty(name, false);
            }
                CommonUtils.equalObjects(this.secureProperties, source.secureProperties);

    @Nullable
        this.properties.putAll(properties);
        return getHandlerDescriptor().getLabel();
        this.secureProperties.clear();
    }
        return CommonUtils.toInt(this.properties.get(name), defValue);

    }
        }
}
    @NotNull
    public DBWHandlerDescriptor getHandlerDescriptor() {
        return descriptor;
 * DBeaver - Universal Database Manager

    }
        return handlerProps;
 */
        return secureProperties;
    }
        if (descriptor == null) {
        return userName;
        } else {
        this.dataSource = configuration.dataSource;
    }
    }
    }
    private String password;

    @NotNull
    public void setUserName(String userName) {

    void loadFromMap(Map<String, Object> handlerMap) {

        if (!CommonUtils.isEmpty(password)) {
    }

    }
        this.id = configuration.id;

            secureProperties.put(name, value);
        }
                CommonUtils.equalObjects(this.password, source.password) &&
        this.properties = new LinkedHashMap<>();

            !CommonUtils.isEmpty(secureProperties);
    }

import org.jkiss.code.Nullable;

        secureProperties.clear();
    }
    }


import org.jkiss.dbeaver.runtime.IVariableResolver;
    @SecureProperty

            if (CommonUtils.isNotEmpty(prop.getValue())) {
        }
    public DBWHandlerType getType() {
    public String toString() {

    @Nullable

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        this.descriptor = descriptor;
/**
public class DBWHandlerConfiguration {
    }
        }
    }

import java.util.Map;
        this.id = descriptor.getId();
        this.descriptor = configuration.descriptor;
            throw new DBException("Cannot create tunnel '" + getHandlerDescriptor().getLabel() + "'", e);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            descriptor = DBWorkbench.getPlatform().getNetworkHandlerRegistry().getDescriptor(this.id);
 * limitations under the License.
    public DBPDriver getDriver() {
        return password;
    }
    public String getUserName() {
    public Map<String, Object> getProperties() {
            !CommonUtils.isEmpty(password) ||
        this.savePassword = configuration.savePassword;
            if (descriptor == null) {
                throw new IllegalStateException("Network handler '" + id + "' not found");
    @Override
    @Nullable
    }
        this.enabled = configuration.enabled;

        if (value == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        password = GeneralUtils.replaceVariables(password, variableResolver);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public boolean equals(Object obj) {

            CommonUtils.equalObjects(this.id, source.id) &&
        this.secureProperties = new LinkedHashMap<>();
    }
    }
        } else {
    private transient DBPDataSourceContainer dataSource;
        return saveToMap(true);
    private Map<String, Object> saveToMap(boolean ignoreSecureProperties) {
            this.properties.remove(name);
            handlerProps.put("properties", secureProperties);
        return !CommonUtils.isEmpty(userName) ||
        }
import org.jkiss.dbeaver.model.connection.DBPDriver;
        Map<String, Object> handlerProps = new LinkedHashMap<>();

        }



            secureProperties.remove(name);
        if (!CommonUtils.isEmpty(userName)) {
        return value;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;

        this.userName = configuration.userName;
        return getHandlerDescriptor().getType();
    public DBWHandlerConfiguration(@NotNull DBWHandlerConfiguration configuration) {
import org.jkiss.code.NotNull;
    }
        this.dataSource = dataSource;
    private transient DBWHandlerDescriptor descriptor;

        this.dataSource = dataSource;

    public void setProperties(@NotNull Map<String, Object> properties) {
    }
/*
        return CommonUtils.toInt(this.properties.get(name));

                CommonUtils.equalObjects(this.properties, source.properties) &&

    }
                prop.setValue(GeneralUtils.replaceVariables((String) prop.getValue(), variableResolver));
    public void resolveDynamicVariables(IVariableResolver variableResolver) {
        return saveToMap(false);
            if (prop.getValue() instanceof String && CommonUtils.isNotEmpty((String) prop.getValue())) {
        } catch (Exception e) {
    }
        return this.id;
        return properties;
            value = CommonUtils.toString(properties.get(name), null);
    public static final String PROP_PORT = "port";
    }
    public int getIntProperty(@NotNull String name) {
    private final Map<String, String> secureProperties;
        for (Map.Entry<String, String> prop : secureProperties.entrySet()) {
    public void setSecureProperty(@NotNull String name, @Nullable String value) {
    }
    public void setSavePassword(boolean savePassword) {
        this.password = configuration.password;
        if (value == null) {

        for (Map.Entry<String, Object> prop : properties.entrySet()) {
        return enabled;
        if (!CommonUtils.isEmpty(secureProperties)) {
                prop.setValue(GeneralUtils.replaceVariables(prop.getValue(), variableResolver));
    public DBWHandlerConfiguration(@NotNull DBWHandlerDescriptor descriptor, DBPDataSourceContainer dataSource) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
import org.jkiss.dbeaver.model.meta.SecureProperty;
        this.password = password;
            }
        this.userName = userName;
        this.enabled = enabled;
import java.util.LinkedHashMap;
    @SecureProperty
                CommonUtils.equalObjects(this.userName, source.userName) &&
        if (value == null) {

                this.enabled == source.enabled &&

        DBWHandlerConfiguration source = (DBWHandlerConfiguration) obj;
    }
        if (!(obj instanceof DBWHandlerConfiguration)) {

    public String getStringProperty(@NotNull String name) {
package org.jkiss.dbeaver.model.net;
