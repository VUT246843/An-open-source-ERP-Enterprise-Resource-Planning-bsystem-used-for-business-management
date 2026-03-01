public class DenodoDataSource extends GenericDataSource {
    @Override
package org.jkiss.dbeaver.ext.denodo.model;

 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        return false;
 */
 * DBeaver - Universal Database Manager
        throws DBException
    }

import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    {
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;

    public DenodoDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, DenodoMetaModel metaModel)
 * limitations under the License.
}
/*
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected boolean isPopulateClientAppName() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(monitor, container, metaModel, new DenodoSQLDialect());
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
