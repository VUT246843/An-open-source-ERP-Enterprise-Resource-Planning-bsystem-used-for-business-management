    @Override
 *


import org.jkiss.code.NotNull;
    private PostgreServerExtension serverExtension;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreCharset;
    @NotNull
    }
        super.initialize(monitor);
    // True if we need multiple databases
            serverExtension = new PostgreServerKingbase(this);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        if (serverExtension == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others


    
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
 * DBeaver - Universal Database Manager


    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
 * See the License for the specific language governing permissions and
}
 */

        return configuration.getConfigurationType() != DBPDriverConfigurationType.URL
        return new KingbaseDatabase(monitor, this, name);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
    public KingbaseDatabase createDatabaseImpl(DBRProgressMonitor monitor, String name, PostgreRole owner, String templateName,
        // It is configurable by default
        return new KingbaseDatabase(monitor, this, dbResult);

 * limitations under the License.
    }
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public PostgreServerExtension getServerType() {

import org.jkiss.dbeaver.DBException;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected boolean isReadDatabaseList(DBPConnectionConfiguration configuration) {
    }
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class KingbaseDataSource extends PostgreDataSource {
    }
    public KingbaseDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
        PostgreTablespace tablespace, PostgreCharset encoding) throws DBException {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
    @Override
package org.jkiss.dbeaver.ext.kingbase.model;
        super(monitor, container, new KingbaseDialect());
    
        }
    public KingbaseDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, String name) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new KingbaseDatabase(monitor, this, name, owner, templateName, tablespace, encoding);
    @Override
    @NotNull
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
/*
    }
import java.sql.ResultSet;
    public KingbaseDatabase createDatabaseImpl(@NotNull DBRProgressMonitor monitor, ResultSet dbResult) throws DBException {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

            && CommonUtils.getBoolean(configuration.getProviderProperty(PostgreConstants.PROP_SHOW_NON_DEFAULT_DB), true);
        return serverExtension;
