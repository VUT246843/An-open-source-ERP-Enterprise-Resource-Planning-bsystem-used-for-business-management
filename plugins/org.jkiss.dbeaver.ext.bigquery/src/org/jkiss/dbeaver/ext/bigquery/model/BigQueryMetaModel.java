
    public JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> createDataTypeCache(@NotNull GenericStructContainer container) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
    @Override
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
            if (matcher.find()) {
package org.jkiss.dbeaver.ext.bigquery.model;
    private Pattern ERROR_POSITION_PATTERN = Pattern.compile(" at \\[([0-9]+)\\:([0-9]+)\\]");
                pos.position = Integer.parseInt(matcher.group(2)) - 1;
 * DBeaver - Universal Database Manager
    }

    }

 * Licensed under the Apache License, Version 2.0 (the "License");

    }
import java.util.regex.Pattern;
    @NotNull
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {
public class BigQueryMetaModel extends GenericMetaModel implements DBCQueryTransformProvider {
            return new QueryTransformerLimit(false);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * You may obtain a copy of the License at
            }
    public BigQueryMetaModel() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPErrorAssistant;
        return null;
/*
    @Override
                pos.line = Integer.parseInt(matcher.group(1)) - 1;
 *
 * you may not use this file except in compliance with the License.
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
        return new BigQueryDataSource(monitor, container, this);
                return pos;
}
 *
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;

    @Nullable
 * limitations under the License.
        }
 */
    }
    @Nullable
import org.jkiss.dbeaver.DBException;
 * BigQuery meta model
import java.util.regex.Matcher;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
        }
 * See the License for the specific language governing permissions and
        if (!CommonUtils.isEmpty(message)) {


 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.code.Nullable;
    @Override
        return new BigQueryDataTypeCache(container);
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;

            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return null;
        String message = error.getMessage();
/**
    @Override
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
 */
