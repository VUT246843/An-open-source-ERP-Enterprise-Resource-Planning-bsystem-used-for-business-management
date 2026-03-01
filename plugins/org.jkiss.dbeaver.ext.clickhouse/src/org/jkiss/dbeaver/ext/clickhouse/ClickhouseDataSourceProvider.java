            @NotNull DBRProgressMonitor monitor,
    public DBPDataSource openDataSource(
        GenericMetaModel metaModel = GenericMetaModelRegistry.getInstance().getMetaModel(container);

import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    }
}
            @NotNull DBPDataSourceContainer container)
 *
    }
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.ext.generic.GenericMetaModelRegistry;
 * You may obtain a copy of the License at
    @Override
/*

        return new ClickhouseDataSource(monitor, container, metaModel);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

    @Override
        return FEATURE_CATALOGS | FEATURE_SCHEMAS;
package org.jkiss.dbeaver.ext.clickhouse;
            throws DBException {
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSource;
 *
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
    public long getFeatures() {
    public ClickhouseDataSourceProvider() {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class ClickhouseDataSourceProvider extends GenericDataSourceProvider {
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
 */
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
