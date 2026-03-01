 */
package org.jkiss.dbeaver.ext.hsqldb.model;
        throws DBException
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected boolean isPopulateClientAppName() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 *
public class HSQLDataSource extends GenericDataSource {
    }
        super(monitor, container, metaModel, new HSQLDialect());
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.dbeaver.DBException;
/*
 * Unless required by applicable law or agreed to in writing, software
    {
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
}
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
 *

        return false;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Override
    public HSQLDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
