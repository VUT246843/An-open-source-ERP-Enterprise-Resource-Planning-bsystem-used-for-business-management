 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.ocient.model.plan.OcientQueryPlaner;
 * See the License for the specific language governing permissions and

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @Override
    @Override
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    }
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 */

}
        if (adapter == DBCQueryPlanner.class) {
package org.jkiss.dbeaver.ext.ocient.model;
    }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.DBException;

 * Copyright (C) 2010-2025 DBeaver Corp and others
public class OcientDataSource extends GenericDataSource {
    }
 * limitations under the License.
    public OcientDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
        return super.getAdapter(adapter);
        super(monitor, container, new OcientMetaModel(), new OcientSQLDialect());
import org.jkiss.code.NotNull;
    protected boolean isPopulateClientAppName() {
 *
/*
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            return adapter.cast(new OcientQueryPlaner(this));
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
