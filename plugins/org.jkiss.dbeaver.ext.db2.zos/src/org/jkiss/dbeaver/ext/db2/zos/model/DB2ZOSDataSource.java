
 *

    @Override

public class DB2ZOSDataSource extends GenericDataSource {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
            props.put(APPLICATION_NAME_PROP, GeneralUtils.getProductName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull DBPConnectionConfiguration connectionInfo
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.connection.DBPDriver;
    private static final Log log = Log.getLog(DB2ZOSDataSource.class);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        throws DBException
 *
 * Unless required by applicable law or agreed to in writing, software
    
    }
import java.util.Map;


        return props;
    private static final String APPLICATION_NAME_PROP = "clientProgramName";
import org.jkiss.code.NotNull;
        @NotNull JDBCExecutionContext context,

    ) {
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
import org.jkiss.dbeaver.ModelPreferences;
import org.jkiss.code.Nullable;
        @NotNull DBRProgressMonitor monitor,
        super(monitor, container, metaModel, new DB2ZOSSQLDialect());
    
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.utils.GeneralUtils;
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
        }
    }
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        Map<String, String> props = new HashMap<>();
    public DB2ZOSDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * See the License for the specific language governing permissions and
        @NotNull DBPDriver driver,
import java.util.HashMap;
    protected Map<String, String> getInternalConnectionProperties(
 */
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String purpose,
package org.jkiss.dbeaver.ext.db2.zos.model;
