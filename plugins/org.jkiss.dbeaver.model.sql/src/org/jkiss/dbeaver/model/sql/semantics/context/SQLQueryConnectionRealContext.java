            throw new UnsupportedOperationException(
        @NotNull DBCExecutionContext executionContext,
                                false,
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
    @Override
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.identifierDetector = identifierDetector;
    @Override
                    DBUtils.getSelectedObject(this.executionContext) instanceof DBSVisibilityScopeProvider currentScope
        this.executionContext = executionContext;
    }
    public boolean isDummy() {
                    }
    private static final Log log = Log.getLog(SQLQueryConnectionRealContext.class);
        boolean validateFunctions,
        } else {
            return objs;
import org.jkiss.dbeaver.DBException;
                        String name = String.join(Character.toString(this.executionContext.getDataSource().getSQLDialect()
        if (this.executionContext.getDataSource() instanceof DBSObjectContainer container) {
 * Unless required by applicable law or agreed to in writing, software
                this.validateFunctions
 * limitations under the License.
                container,
    @NotNull
    private final SQLIdentifierDetector identifierDetector;
    @NotNull

        @NotNull Function<SQLQueryRowsSourceModel, List<SQLQueryResultPseudoColumn>> rowsetPseudoColumnsProvider
        @NotNull Map<String, SQLQueryResultPseudoColumn> globalPseudoColumns,
    }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    private final Map<String, SQLQueryResultPseudoColumn> globalPseudoColumnsByCanonicalName;
        this.validateFunctions = validateFunctions;
    }
                    } catch (DBException e) {
        @NotNull SQLDialect dialect,
 * See the License for the specific language governing permissions and
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(dialect);
        }
                DBSVisibilityScopeProvider scopeProvider =
import org.jkiss.dbeaver.model.sql.SQLDialect;
        this.globalPseudoColumnsByCanonicalName = globalPseudoColumns;
 *
                        : (this.executionContext.getDataSource() instanceof DBSVisibilityScopeProvider contextScope
    public SQLQueryResultPseudoColumn resolveGlobalPseudoColumn(@NotNull String name) {
    ) {
package org.jkiss.dbeaver.model.sql.semantics.context;
 * Copyright (C) 2010-2025 DBeaver Corp and others

                                this.identifierDetector,
                        ? currentScope

 * you may not use this file except in compliance with the License.
    @NotNull
            // It's managed by LSMDialectRegistry (see org.jkiss.dbeaver.lsm.dialectSyntax extension point)
                if (scopeProvider != null) {
                            }
                                this.executionContext,
                                monitor,
        return this.rowsetPseudoColumnsProvider.apply(rowsSource);
                            ? contextScope : null);
    private final boolean validateFunctions;
                this.executionContext,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            if (!objs.isEmpty()) {
    public SQLQueryConnectionRealContext(


import org.jkiss.dbeaver.Log;
            // Semantic analyser should never be used for databases, which doesn't support table lookup
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
                            objs = SQLSearchUtils.findObjectsByFQN(
        return false;
                objectName,
    @Override
 * You may obtain a copy of the License at
    private final Function<SQLQueryRowsSourceModel, List<SQLQueryResultPseudoColumn>> rowsetPseudoColumnsProvider;
            if (objs.isEmpty()) {
        return this.globalPseudoColumnsByCanonicalName.get(name);
public class SQLQueryConnectionRealContext extends SQLQueryConnectionContext {

    public List<SQLQueryResultPseudoColumn> obtainRowsetPseudoColumns(@Nullable SQLQueryRowsSourceModel rowsSource) {
    }
            );
 */
import org.jkiss.dbeaver.model.DBUtils;
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                        for (DBSObjectContainer scope : scopeProvider.getPublicScopes(monitor)) {
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
import java.util.function.Function;
        this.rowsetPseudoColumnsProvider = rowsetPseudoColumnsProvider;
                this.identifierDetector,
                        log.error("Failed to resolve real database object " + name, e);
            List<? extends DBSObject> objs = SQLSearchUtils.findObjectsByFQN(
                }
                        }


                    try {
                                this.validateFunctions

                monitor,
                            .getStructSeparator()), objectName);
}
 *
import java.util.List;
    @Nullable
                                scope,
import org.jkiss.code.NotNull;
                            );
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final DBCExecutionContext executionContext;
        @NotNull SQLIdentifierDetector identifierDetector,
                                break;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
                false,
import org.jkiss.dbeaver.model.sql.SQLSearchUtils;
    @NotNull

import org.jkiss.dbeaver.model.struct.DBSVisibilityScopeProvider;
 *
                "Semantic analyser should never be used for databases, which doesn't support table lookup");
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected List<? extends DBSObject> findRealObjectsImpl(@NotNull DBRProgressMonitor monitor, @NotNull List<String> objectName) {
                                objectName,
import java.util.Map;
            // so that analysers could be created only for supported dialects.
