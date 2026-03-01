 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
    
 */
        return null;
        return "SYSTEM".equals(schema.getName());
            return new QueryTransformerLimit(false);
    @Override
 * PhoenixMetaModel
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
/*
    public PhoenixMetaModel() {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
 *

    }
    }

import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.model.GenericView;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsUpsertStatement() {
    public boolean supportsNullSchemas() {
 * limitations under the License.
    @Override
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
 * You may obtain a copy of the License at

        return true;
    @Nullable

package org.jkiss.dbeaver.ext.phoenix.model;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
 * See the License for the specific language governing permissions and

        super();

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
    @NotNull
    @Override
        return getTableDDL(monitor, sourceObject, options);
    }

    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {

}
 */
        return new PhoenixDataSource(monitor, container, this);
        return true;

import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
    }

{
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
    }
    @Override
public class PhoenixMetaModel extends GenericMetaModel implements DBCQueryTransformProvider
    
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
        }
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
    private static final Log log = Log.getLog(PhoenixMetaModel.class);
    }
import org.jkiss.code.Nullable;
    public boolean isSystemSchema(GenericSchema schema) {
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
