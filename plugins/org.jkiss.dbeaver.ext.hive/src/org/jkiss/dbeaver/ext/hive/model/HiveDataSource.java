 *

        String sqlState = SQLState.getStateFromException(error);

    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
import org.jkiss.dbeaver.DBException;
        return adapter == DBDValueHandlerProvider.class
        throws DBException
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        }

package org.jkiss.dbeaver.ext.hive.model;
 * You may obtain a copy of the License at
    private static final String CONNECTION_CLOSED_MESSAGE = "Connection is closed";
import org.jkiss.dbeaver.model.sql.SQLState;
        return super.discoverErrorType(error);
    protected JDBCFactory createJdbcFactory() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            return ErrorType.CONNECTION_LOST;
        return new HiveDataSourceInfo(monitor, this, metaData);
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
            : super.getAdapter(adapter);
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
    @NotNull
            ? adapter.cast(new HiveValueHandlerProvider())
import org.jkiss.code.Nullable;
    protected HiveDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
 */
    public HiveDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
    }
        }

import org.jkiss.dbeaver.ext.hive.model.jdbc.HiveJdbcFactory;
 *
    }
import org.jkiss.dbeaver.Log;
            // By some reason many Hive errors have this SQL state
import org.jkiss.code.NotNull;
    @Override
    {
    private static final Log log = Log.getLog(HiveDataSource.class);
        return new HiveJdbcFactory();
    @Nullable

    public ErrorType discoverErrorType(@NotNull Throwable error) {
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
 * Unless required by applicable law or agreed to in writing, software
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        if (SQLState.SQL_08S01.getCode().equals(sqlState)) {
        if (error instanceof SQLException && CONNECTION_CLOSED_MESSAGE.equals(error.getMessage())) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
            return ErrorType.NORMAL;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class HiveDataSource extends GenericDataSource {
    }
            return new QueryTransformerLimit(true, false);
}
    @NotNull
    @Override
import java.sql.SQLException;
/*
    @Override
        super(monitor, container, metaModel, new HiveSQLDialect());
    }

import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCFactory;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        return null;

 * DBeaver - Universal Database Manager
