        return new PostgreJdbcFactory();
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.ext.postgresql.model.generic.PostgreMetaModel;
 * you may not use this file except in compliance with the License.
//    }
public class PostgreGenericDataSource extends GenericDataSource
    @Override
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCFactory;
    protected JDBCFactory createJdbcFactory() {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.postgresql.model.jdbc.PostgreJdbcFactory;
/**
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
//    public PostgreDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
{
 * Unless required by applicable law or agreed to in writing, software
    public PostgreGenericDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, PostgreMetaModel metaModel) throws DBException {
        super(monitor, container, metaModel, new PostgreDialect());
    }

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
package org.jkiss.dbeaver.ext.postgresql.model;
}

//        super(monitor, container, new PostgreMetaModel());
@Deprecated
 * See the License for the specific language governing permissions and
 *
    @NotNull
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 */
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
 * PostgreGenericDataSource

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

