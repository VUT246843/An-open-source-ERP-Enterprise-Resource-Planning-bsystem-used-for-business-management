import org.jkiss.dbeaver.model.DatabaseURL;
                newComponent = newComponent.replace(makePropPattern("sqlDialect"), connectionInfo.getServerName());
import org.jkiss.dbeaver.model.DBPDataSource;

        return url;
 */
            if (newComponent.startsWith("[")) {
import org.jkiss.dbeaver.ext.iotdb.model.meta.IoTDBMetaModel;
        }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBDataSource;
 * See the License for the specific language governing permissions and
 *
    private String processUrl(@NotNull String url) {
    @NotNull
import org.jkiss.dbeaver.DBException;
    }
 *
                CommonUtils.isEmpty(connectionInfo.getHostName()) &&
            }
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            log.error(e);
        return new IoTDBDataSource(monitor, container, new IoTDBMetaModel(), true);
        try {
            return connectionInfo.getUrl();
 * DBeaver - Universal Database Manager
        }
    @NotNull
            if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
import org.jkiss.code.NotNull;
        return "{" + prop + "}";
    }
                url.append(newComponent);

    }

import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
        }
            return null;
        }
        if (useRawUrl(connectionInfo)) {
        @NotNull DBPDriver driver,
    }
                                        @NotNull DBPDataSourceContainer container) throws DBException {

    @Override
 * You may obtain a copy of the License at

        } catch (DBException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.utils.CommonUtils;

 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBPConnectionConfiguration connectionInfo) {
        }
            return processUrl(connectionInfo.getUrl());
                CommonUtils.isEmpty(connectionInfo.getServerName());
            newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_USER), CommonUtils.notEmpty(connectionInfo.getUserName()));
        String urlTemplate = driver.getSampleURL();
            return url.substring(0, index - 1).concat(url.substring(index));
                }
        int index = url.indexOf("?");
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            } else {
            }
    public String getConnectionURL(
    private boolean useRawUrl(DBPConnectionConfiguration connectionInfo) {
            return processUrl(buildUrlFromTemplate(connectionInfo, urlTemplate));
        return url.toString();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.connection.DBPDriver;
                newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_PORT), connectionInfo.getHostPort());
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

    private static String makePropPattern(String prop) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                newComponent = newComponent.replace(makePropPattern(DBConstants.PROP_HOST), connectionInfo.getHostName());
            }
package org.jkiss.dbeaver.ext.iotdb;
 *
 * limitations under the License.
                CommonUtils.isEmpty(connectionInfo.getHostPort()) &&

                    url.append(newComponent.substring(1, newComponent.length() - 1));
public class IoTDBDataSourceProvider extends GenericDataSourceProvider {
        if (url.endsWith("?sql_dialect=table")) {
            }
 * Unless required by applicable law or agreed to in writing, software
            if (!CommonUtils.isEmpty(connectionInfo.getServerName())) {
        StringBuilder url = new StringBuilder();
                if (!newComponent.equals(component)) {
        DatabaseURL.MetaURL metaURL = DatabaseURL.parseSampleURL(urlTemplate);
            String newComponent = component;
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor,

            return new IoTDBDataSource(monitor, container, new IoTDBTableMetaModel(), false);
        if (index > 0 && url.charAt(index - 1) == '/') {
        String url = container.getConnectionConfiguration().getUrl();
        for (String component : metaURL.getUrlComponents()) {
        return !CommonUtils.isEmpty(connectionInfo.getUrl()) &&
        }
        if (CommonUtils.isEmptyTrimmed(urlTemplate)) {
    @Override
    @NotNull
    }

import org.jkiss.dbeaver.ext.iotdb.model.meta.IoTDBTableMetaModel;
    private String buildUrlFromTemplate(DBPConnectionConfiguration connectionInfo, String urlTemplate) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (!CommonUtils.isEmpty(connectionInfo.getHostName())) {
