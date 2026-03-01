    public PostgreServerExtension getServerType() {
    @NotNull

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        super.initialize(monitor);
    @Override

    private PostgreServerExtension serverExtension;
 *

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean isServerVersionAtLeast(int major, int minor) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
 * limitations under the License.
    @Override
 * DBeaver - Universal Database Manager

        return serverExtension;
        if (serverExtension == null) {
    public GaussDBDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, ResultSet dbResult) throws DBException {
package org.jkiss.dbeaver.ext.gaussdb.model;
 * you may not use this file except in compliance with the License.
    @NotNull
    public GaussDBDatabase createDatabaseImpl(DBRProgressMonitor monitor, String name, PostgreRole owner, String templateName,
    @Override
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.DBException;
        return new GaussDBDatabase(monitor, this, dbResult);
import org.jkiss.dbeaver.ext.postgresql.model.*;
        return super.isServerVersionAtLeast(major, minor);
public class GaussDBDataSource extends PostgreDataSource {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
    @Override
    }

        return CommonUtils.getBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB), true);
        // Reserved: Modify the logic for determining the PG version.
    }
import java.sql.ResultSet;
    protected boolean isReadDatabaseList(DBPConnectionConfiguration configuration) {
    @Override

    }
 *
        super(monitor, container, new GaussDBDialect());
    }
import org.jkiss.utils.CommonUtils;
    }

    
    @Override

 *
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
        return new GaussDBDatabase(monitor, this, name);
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            serverExtension = new PostgreServerGaussDB(this);
        PostgreTablespace tablespace, PostgreCharset encoding) throws DBException {
}
    
    }
 * You may obtain a copy of the License at
    // True if we need multiple databases
 * See the License for the specific language governing permissions and
    @NotNull
        }
    public GaussDBDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, String name) throws DBException {
        return new GaussDBDatabase(monitor, this, name, owner, templateName, tablespace, encoding);
    public GaussDBDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
import org.jkiss.code.NotNull;
        // It is configurable by default
