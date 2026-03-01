
        return isServerVersionAtLeast(5, 1);
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
    public MySQLPrivilege getPrivilege(DBRProgressMonitor monitor, String name) throws DBException {
    }
/*
        return DBUtils.findObject(getPrivileges(monitor), name, true);
 * limitations under the License.
 */
        } else if (adapter == DBDValueHandlerProvider.class) {
    }

 * See the License for the specific language governing permissions and
        return new OceanbaseMySQLCatalog(owner, resultSet);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        super(monitor, container);
    public boolean supportsPartitions() {
    @NotNull
    public Class<? extends MySQLCatalog> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.mysql.model.MySQLPrivilege;
    public MySQLEngine getDefaultEngine() {
        }
        return this.getEngine("oceanbase");
    }
        super.initialize(monitor);

    @NotNull
    @Override
    }
 * you may not use this file except in compliance with the License.
            return super.getAdapter(adapter);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Override

    @Override
import org.jkiss.dbeaver.ext.mysql.model.MySQLEngine;
    public OceanbaseMySQLDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {

import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        } else {
        return true;
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {

    }
    }
    }

package org.jkiss.dbeaver.ext.oceanbase.model;
    public MySQLEngine getEngine(String name) {
 *
 * Unless required by applicable law or agreed to in writing, software
public class OceanbaseMySQLDataSource extends MySQLDataSource {
}
import org.jkiss.dbeaver.DBException;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    public boolean supportsInformationSchema() {
        if (name.equalsIgnoreCase("SHOW DB")) {
    }
    public MySQLCatalog createCatalogInstance(@NotNull MySQLDataSource owner, @NotNull JDBCResultSet resultSet) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStandardValueHandlerProvider;
 *
        if (adapter == DBCQueryPlanner.class) {
import org.jkiss.dbeaver.model.DBUtils;
    @Override
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
        return DBUtils.findObject(getEngines(), name, true);
    }
            return adapter.cast(new OceanbasePlanAnalyzer(this));

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String tenantType;
            return DBUtils.findObject(getPrivileges(monitor), "Show databases", true);
 * You may obtain a copy of the License at
 *

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
    @Override


    @Override
    public boolean isMySQLMode() {
        tenantType = container.getConnectionConfiguration().getProviderProperty("tenantType");
        }
        return OceanbaseMySQLCatalog.class;
        return tenantType.equals("MySQL");
    }
import org.jkiss.dbeaver.ext.oceanbase.model.plan.OceanbasePlanAnalyzer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return adapter.cast(new JDBCStandardValueHandlerProvider());
