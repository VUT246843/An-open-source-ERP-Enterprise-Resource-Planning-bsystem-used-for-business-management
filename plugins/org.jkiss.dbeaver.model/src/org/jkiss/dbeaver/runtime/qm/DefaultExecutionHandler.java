

/**
    public void handleResultSetClose(@NotNull DBCResultSet resultSet, long rowCount) {
    @Override
    @Override
    }
    public void handleStatementExecuteBegin(@NotNull DBCStatement statement) {
    }

    @Override


    public void handleScriptEnd(@NotNull DBCSession session) {


    public void handleContextClose(@NotNull DBCExecutionContext context) {


    public void handleFeatureUsage(@NotNull DBRFeature feature, @Nullable Map<String, Object> parameters) {
    @Override
import org.jkiss.dbeaver.model.exec.*;
 * You may obtain a copy of the License at
    }
    }




    public void handleScriptBegin(@NotNull DBCSession session) {


    }
    public void handleTransactionRollback(@NotNull DBCExecutionContext context, DBCSavepoint savepoint) {
import org.jkiss.code.Nullable;

    @Override
 */
    }
package org.jkiss.dbeaver.runtime.qm;
    }

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 *
    @Override
    @Override

}
    public void handleContextOpen(@NotNull DBCExecutionContext context, boolean transactional) {
    public void handleStatementBind(@NotNull DBCStatement statement, Object column, Object value) {

    }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    @Override
    }
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
    public void handleTransactionIsolation(@NotNull DBCExecutionContext context, @NotNull DBPTransactionIsolation level) {

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.util.Map;

    public void handleTransactionAutocommit(@NotNull DBCExecutionContext context, boolean autoCommit) {

    @Override
    }
    @Override
 *
    public void handleStatementClose(@NotNull DBCStatement statement, long rows) {
/*

        
    public void handleResultSetOpen(@NotNull DBCResultSet resultSet) {
 *
    public void handleSessionOpen(@NotNull DBCSession session) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.

    }

    public void handleTransactionSavepoint(@NotNull DBCSavepoint savepoint) {
import org.jkiss.dbeaver.model.qm.QMExecutionHandler;
    }

    public void handleStatementExecuteEnd(@NotNull DBCStatement statement, long rows, Throwable error) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
    @Override
    @Override

    @Override
    }

 * Handle methods are no-ops.
 * you may not use this file except in compliance with the License.
    @Override



import org.jkiss.code.NotNull;


    }
 * Unless required by applicable law or agreed to in writing, software
    public void handleTransactionCommit(@NotNull DBCExecutionContext context) {
    public void handleContextUpdate(@NotNull DBCExecutionContext context, boolean transactional) {
    }

    public void handleConnectError(@NotNull DBPDataSource dataSource, @NotNull Throwable error) {

    public void handleSessionClose(@NotNull DBCSession session) {
    @Override
 * Default execution handler.

    @Override



 * See the License for the specific language governing permissions and

    public void handleStatementOpen(@NotNull DBCStatement statement) {
    @Override
 */
public abstract class DefaultExecutionHandler implements QMExecutionHandler {

    @Override
    }
    }


    @Override
    @Override
