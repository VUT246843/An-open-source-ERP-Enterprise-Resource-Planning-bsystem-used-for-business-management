    void handleStatementExecuteEnd(@NotNull DBCStatement statement, long rows, Throwable error);

    void handleScriptBegin(@NotNull DBCSession session);

 * you may not use this file except in compliance with the License.
 * Handler methods are invoked right at time of DBC operation, so they should work as fast as possible.

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
/**

 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

import java.util.Map;




    void handleFeatureUsage(@NotNull DBRFeature feature, @Nullable Map<String, Object> parameters);

 * Implementers should not invoke any DBC execution function in passed objects - otherwise execution handling may enter infinite recursion.
 */
    void handleTransactionIsolation(@NotNull DBCExecutionContext context, @NotNull DBPTransactionIsolation level);
    String getHandlerName();
 *

    void handleContextClose(@NotNull DBCExecutionContext context);
import org.jkiss.dbeaver.model.DBPDataSource;
    
import org.jkiss.code.Nullable;
 * Query manager execution handler.
    void handleStatementBind(@NotNull DBCStatement statement, Object column, @Nullable Object value);
    void handleSessionClose(@NotNull DBCSession session);

 */
    void handleTransactionCommit(@NotNull DBCExecutionContext context);
    void handleSessionOpen(@NotNull DBCSession session);
    void handleTransactionRollback(@NotNull DBCExecutionContext context, @Nullable DBCSavepoint savepoint);
public interface QMExecutionHandler {

 * See the License for the specific language governing permissions and
    void handleStatementClose(@NotNull DBCStatement statement, long rows);
    void handleContextOpen(@NotNull DBCExecutionContext context, boolean transactional);
    void handleResultSetClose(@NotNull DBCResultSet resultSet, long rowCount);

import org.jkiss.dbeaver.model.exec.*;
    void handleTransactionAutocommit(@NotNull DBCExecutionContext context, boolean autoCommit);

 *
import org.jkiss.code.NotNull;

 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.DBPTransactionIsolation;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    void handleScriptEnd(@NotNull DBCSession session);
    void handleResultSetOpen(@NotNull DBCResultSet resultSet);

/*

 * Unless required by applicable law or agreed to in writing, software
    void handleStatementExecuteBegin(@NotNull DBCStatement statement);
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;

package org.jkiss.dbeaver.model.qm;

    void handleConnectError(@NotNull DBPDataSource dataSource, @NotNull Throwable error);

    void handleStatementOpen(@NotNull DBCStatement statement);
 *

}
    void handleTransactionSavepoint(@NotNull DBCSavepoint savepoint);
    void handleContextUpdate(@NotNull DBCExecutionContext context, boolean transactional);
