        } else {
        }
    @NotNull
                continue;
        for (DriverPropertyInfo desc : propDescs) {
import org.jkiss.code.NotNull;
        if (props == null) {
            return null;
import org.jkiss.dbeaver.Log;
            log.debug("Cannot obtain driver's properties", e); //$NON-NLS-1$
                desc.name,
import java.util.ArrayList;

    ) throws DBException {
            }
            }
    static final protected Log log = Log.getLog(JDBCDataSourceProvider.class);
    private Collection<DBPPropertyDescriptor> readDriverProperties(
    public void init(@NotNull DBPPlatform platform) {
        }
 * DBeaver - Universal Database Manager
        DriverPropertyInfo[] propDescs;
        @NotNull DBRProgressMonitor monitor,
        }
 *
            // then all subsequent calls to openConnection will fail until another props reading will succeed.
import org.jkiss.dbeaver.model.DBConstants;
 * See the License for the specific language governing permissions and
            // Do not load properties from internal (ODBC) driver.
 * Unless required by applicable law or agreed to in writing, software
import java.util.Collection;
    @Override
                ModelMessages.model_jdbc_driver_properties,
        Collection<DBPPropertyDescriptor> props = null;
            return null;

        List<DBPPropertyDescriptor> properties = new ArrayList<>();
import java.util.Properties;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
 */
            propDescs = driver.getPropertyInfo(connectionInfo.getUrl(), driverProps);
        return value;
    ) throws DBException {
 * JDBCDataSourceProvider
import org.jkiss.dbeaver.model.app.DBPPlatform;
        @NotNull DBPDriver driver,
            if (driverInstance instanceof Driver jdbcDriver) {
    protected String getConnectionPropertyDefaultValue(String name, String value) {

        if (propDescs == null) {
    }
 *

 * limitations under the License.
package org.jkiss.dbeaver.model.impl.jdbc;

    }
import org.jkiss.dbeaver.DBException;
import java.util.List;
import java.sql.DriverPropertyInfo;
                desc.choices,
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    }

                props = readDriverProperties(connectionInfo, jdbcDriver, driver.isPropagateDriverProperties());
        Properties driverProps = new Properties();
            if (desc == null || DBConstants.DATA_SOURCE_PROPERTY_USER.equals(desc.name) || DBConstants.DATA_SOURCE_PROPERTY_PASSWORD.equals(desc.name)) {
 * you may not use this file except in compliance with the License.
        DBPConnectionConfiguration connectionInfo,
            properties.add(new PropertyDescriptor(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean propagateDriverProperties
import org.jkiss.dbeaver.model.connection.DBPDriver;
                // Skip user/password properties
                desc.value,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        } catch (Throwable e) {
            // There is a bug in sun's JdbcOdbc bridge driver (#830): if connection fails during props reading

    @Override
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
            Object driverInstance = driver.getDefaultDriverLoader().getDriverInstance(monitor);
/*
        if (driver.isInternalDriver()) {
            driverProps.putAll(connectionInfo.getProperties());

        try {
        return props.toArray(new DBPPropertyDescriptor[0]);
import org.jkiss.dbeaver.model.DBPDataSourceProvider;
public abstract class JDBCDataSourceProvider implements DBPDataSourceProvider {
            props = null;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                desc.required,
 */
}
/**
                desc.name,
                desc.description,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return properties;
    }
 *
            return null;
        if (propagateDriverProperties) {
        @NotNull DBPConnectionConfiguration connectionInfo
            desc.value = getConnectionPropertyDefaultValue(desc.name, desc.value);
        Driver driver,
import java.sql.Driver;
 * You may obtain a copy of the License at
                true));
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBPPropertyDescriptor[] getConnectionProperties(
import org.jkiss.dbeaver.model.messages.ModelMessages;
        }
                String.class,
