 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
        super(monitor, container, metaModel, new DerbySQLDialect());

 *
/*
    DerbyDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container,
        if (DBPDataSource.FEATURE_LOB_REQUIRE_TRANSACTIONS.equals(featureId)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    @NotNull GenericMetaModel metaModel) throws DBException {
 * limitations under the License.
import org.jkiss.code.NotNull;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return super.getDataSourceFeature(featureId);
    }
 * You may obtain a copy of the License at
            return Boolean.TRUE;

    protected boolean isPopulateClientAppName() {
}
 * See the License for the specific language governing permissions and
    @Override
    }
    @Override
        return false;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

final class DerbyDataSource extends GenericDataSource {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * DBeaver - Universal Database Manager
    public Object getDataSourceFeature(String featureId) {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 *
import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Nullable
package org.jkiss.dbeaver.ext.derby.model;
 */
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
