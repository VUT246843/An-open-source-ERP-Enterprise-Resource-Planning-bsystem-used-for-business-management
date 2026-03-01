    @Override
 *
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
            if (CommonUtils.isNotEmpty(message) && message.contains("Error [22]:")) {
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
                // io.trino.spi.StandardErrorCode.NOT_SUPPORTED(13, USER_ERROR)
public class TrinoDataSource extends GenericDataSource {
            }

}
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
        @NotNull TrinoMetaModel metaModel
 * Unless required by applicable law or agreed to in writing, software
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        @NotNull DBRProgressMonitor monitor,
                // io.trino.spi.StandardErrorCode.TRANSACTION_ALREADY_ABORTED(22, USER_ERROR)
            if (message.contains("Connection is closed") || message.contains("Connection is already closed")) {
 * DBeaver - Universal Database Manager
    @NotNull
 *
package org.jkiss.dbeaver.ext.trino.model;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return ErrorType.TRANSACTION_ABORTED;
 */
    TrinoDataSource(
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
            return new QueryTransformerLimit(false, false);
 *
 * you may not use this file except in compliance with the License.

    }
        @NotNull DBPDataSourceContainer container,
        if (CommonUtils.isNotEmpty(message)) {
                return ErrorType.CONNECTION_LOST;
            if (CommonUtils.isNotEmpty(message) && message.contains("SQL Error [13]:")) {
        return null;
import org.jkiss.utils.CommonUtils;
                return ErrorType.FEATURE_UNSUPPORTED;
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;


/*
        return super.discoverErrorType(error);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        String message = error.getMessage();
    @Nullable
        }
            }
    ) throws DBException {
    }
            }
    @Override
    public ErrorType discoverErrorType(@NotNull Throwable error) {
        super(monitor, container, metaModel, new GenericSQLDialect());
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
