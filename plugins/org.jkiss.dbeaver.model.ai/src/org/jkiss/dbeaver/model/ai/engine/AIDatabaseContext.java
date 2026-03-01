 * you may not use this file except in compliance with the License.
 */
        return customEntities;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            this.executionContext = executionContext;

 * Unless required by applicable law or agreed to in writing, software
                yield null;
                }
import java.util.List;
                if (contextDefaults.getDefaultSchema() != null) {
        }
    private final DBCExecutionContext executionContext;
 * See the License for the specific language governing permissions and
        @NotNull
    @NotNull
            this.dataSource = dataSource;
        this.executionContext = executionContext;
        if (contextDefaults == null) {

        return scoped != null ? scoped : (DBSObjectContainer) executionContext.getDataSource();

                } else {
    }

                DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
 *
        private DBCExecutionContext executionContext;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            return new AIDatabaseContext(dataSource, scope, customEntities, executionContext);
            this.customEntities = customEntities;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                dataSource.setCurrentSchema(defaultSchema == null ? null : defaultSchema.getName());
            }
        public AIDatabaseContext build() throws DBException {
            if (scope == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.ai.AIDatabaseScope;
        }
        public Builder setCustomEntities(@NotNull List<DBSObject> customEntities) {
        @NotNull
                    yield contextDefaults.getDefaultCatalog();
        @NotNull AIDatabaseScope scope,


import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        this.customEntities = customEntities;
                DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
    }

        @NotNull DBCExecutionContext executionContext
        }
        return scope;
        public Builder setExecutionContext(@NotNull DBCExecutionContext executionContext) {
        @NotNull DBSLogicalDataSource dataSource,
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
            return (DBSObjectContainer) executionContext.getDataSource();
    @NotNull
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
 * DBeaver - Universal Database Manager
        }
            this.scope = scope;

    @Nullable
            return this;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public Builder(@NotNull DBSLogicalDataSource dataSource) {
            return this;
    public static class Builder {
            return this;
                throw new DBException("Execution context must be specified");



import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
}

 * You may obtain a copy of the License at
    private final DBSLogicalDataSource dataSource;
        public Builder setScope(@NotNull AIDatabaseScope scope) {
    @NotNull
            DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
package org.jkiss.dbeaver.model.ai.engine;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
    ) {
    private final List<DBSObject> customEntities;
    public AIDatabaseScope getScope() {
    public List<DBSObject> getCustomEntities() {

    }
        @NotNull
            case CURRENT_DATABASE:
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * limitations under the License.

            if (executionContext == null) {
            }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            default:
        private List<DBSObject> customEntities;
import org.jkiss.dbeaver.DBException;
        @NotNull
        return dataSource;
        };
            case CURRENT_SCHEMA:
 *
        this.dataSource = dataSource;
/*
                throw new DBException("Scope must be specified");
        private AIDatabaseScope scope;
                yield contextDefaults.getDefaultCatalog();
public class AIDatabaseContext {
    }
    private AIDatabaseContext(
        DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
import org.jkiss.code.Nullable;
    private final AIDatabaseScope scope;
                    yield contextDefaults.getDefaultSchema();
    public DBCExecutionContext getExecutionContext() {
        DBSObjectContainer scoped = switch (getScope()) {
        @Nullable List<DBSObject> customEntities,
import org.jkiss.code.NotNull;

            if (dataSource.getCurrentCatalog() == null && contextDefaults != null) {
                dataSource.setCurrentCatalog(defaultCatalog == null ? null : defaultCatalog.getName());
    public DBSLogicalDataSource getDataSource() {
        return executionContext;
            if (scope == AIDatabaseScope.CUSTOM && customEntities == null) {

    }
                throw new DBException("Custom entities must be specified when using custom scope");
        private DBSLogicalDataSource dataSource;
            }
            if (dataSource.getCurrentSchema() == null && contextDefaults != null) {

    public DBSObjectContainer getScopeObject() {
        this.scope = scope;
            }

