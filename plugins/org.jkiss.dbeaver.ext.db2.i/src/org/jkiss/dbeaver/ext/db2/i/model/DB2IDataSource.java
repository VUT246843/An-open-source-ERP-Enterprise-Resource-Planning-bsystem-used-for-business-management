        super(monitor, container, metaModel, new DB2ISQLDialect());
        throws DBException
package org.jkiss.dbeaver.ext.db2.i.model;
import org.jkiss.code.NotNull;
}
 * See the License for the specific language governing permissions and
public class DB2IDataSource extends GenericDataSource {
 */
        @NotNull String purpose,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

            props.put(APPLICATION_NAME_PROP, GeneralUtils.getProductName());
    protected Map<String, String> getInternalConnectionProperties(
    
    }
 *

    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
        }
    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
    public DB2IDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
        return props;
        @NotNull DBRProgressMonitor monitor,
    @Override

    }
import org.jkiss.dbeaver.utils.GeneralUtils;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
        Map<String, String> props = new HashMap<>();
    {
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.HashMap;
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
        if (!getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_CLIENT_NAME_DISABLE)) {
    private static final Log log = Log.getLog(DB2IDataSource.class);
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/*
        @NotNull DBPConnectionConfiguration connectionInfo

import org.jkiss.dbeaver.model.connection.DBPDriver;
        @NotNull DBPDriver driver,
 * Copyright (C) 2010-2024 DBeaver Corp and others

        @NotNull JDBCExecutionContext context,
    private static final String APPLICATION_NAME_PROP = "clientProgramName";
import org.jkiss.dbeaver.ModelPreferences;
import java.util.Map;

 *
