        DBPPropertyDescriptor[] connectionProperties = super.getConnectionProperties(monitor, driver, connectionInfo);
                        ModelMessages.model_jdbc_driver_properties,
import org.jkiss.dbeaver.model.messages.ModelMessages;
    public long getFeatures() {
        @NotNull DBPDataSourceContainer container)
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
import org.jkiss.utils.CommonUtils;
            String driverParametersString = CommonUtils.toString(driver.getDriverParameter(GenericConstants.PARAM_DRIVER_PROPERTIES));
        GenericMetaModel metaModelInstance = GenericMetaModelRegistry.getInstance().getMetaModel(container);


 * distributed under the License is distributed on an "AS IS" BASIS,
                connectionProperties = new DBPPropertyDescriptor[propList.length];
            if (!driverParametersString.isEmpty()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModelDescriptor;
    @Override
}
                String[] propList = driverParametersString.split(",");

import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
 * limitations under the License.
    @NotNull
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    DBPConnectionConfiguration connectionInfo) throws DBException {
                        propName,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;

 *
 * See the License for the specific language governing permissions and
                        null,
                        String.class,
public class GenericDataSourceProvider extends JDBCDataSourceProvider {
 */
    @Override
            // Try to get list of supported properties from custom driver config
                    String propName = propList[i].trim();
                        null,

        throws DBException {
    @NotNull
/*
package org.jkiss.dbeaver.ext.generic;
        if (connectionProperties == null || connectionProperties.length == 0) {
    public GenericDataSourceProvider() {
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
        return connectionProperties;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.jkiss.dbeaver.DBException;
        return GenericMetaModelRegistry.getInstance().getStandardMetaModel();
    protected GenericMetaModelDescriptor getStandardMetaModel() {
 *

    public DBPPropertyDescriptor[] getConnectionProperties(@NotNull DBRProgressMonitor monitor, @NotNull DBPDriver driver, @NotNull

        }
    @Override
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return DatabaseURL.generateUrlByTemplate(driver, connectionInfo);
    }
                    connectionProperties[i] = new PropertyDescriptor(
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
                        true);
    @Override
        @NotNull DBRProgressMonitor monitor,
                        null,
import org.jkiss.dbeaver.model.DatabaseURL;
                        propName,
    public DBPDataSource openDataSource(
                        false,
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    }
                for (int i = 0; i < propList.length; i++) {
            }
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
import org.jkiss.dbeaver.model.DBPDataSource;
    }
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 *
        return metaModelInstance.createDataSourceImpl(monitor, container);
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
