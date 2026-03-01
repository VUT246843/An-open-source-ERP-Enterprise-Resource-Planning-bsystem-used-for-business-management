    }
    public String getDefaultCatalogName() {
    }
    public void setDefaultTransactionIsolation(@Nullable Integer defaultTransactionIsolation) {

    private Integer defaultTransactionIsolation;
    private boolean ignoreErrors;



    public boolean equals(Object obj) {
        }
package org.jkiss.dbeaver.model.connection;

}
    public void setDefaultCatalogName(@Nullable String defaultCatalogName) {
        return defaultCatalogName;
 * DBeaver - Universal Database Manager
        return
    public DBPConnectionBootstrap() {
        }
    public boolean isIgnoreErrors() {
            !CommonUtils.isEmpty(defaultSchemaName) ||
        this.initQueries = new ArrayList<>();
import org.jkiss.code.Nullable;
        this.defaultTransactionIsolation = defaultTransactionIsolation;
        this.defaultCatalogName = info.defaultCatalogName;
 * Connection bootstrap info.
        this.ignoreErrors = ignoreErrors;
                CommonUtils.equalObjects(this.defaultSchemaName, source.defaultSchemaName) &&
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.defaultSchemaName = defaultSchemaName;
        this.defaultSchemaName = GeneralUtils.replaceVariables(this.defaultSchemaName, variableResolver);
 * Unless required by applicable law or agreed to in writing, software

public class DBPConnectionBootstrap {
    public Boolean getDefaultAutoCommit() {
                CommonUtils.equalObjects(this.defaultTransactionIsolation, source.defaultTransactionIsolation) &&
 *
        return ignoreErrors;
    public void setDefaultSchemaName(@Nullable String defaultSchemaName) {
        this.defaultTransactionIsolation = info.defaultTransactionIsolation;
            defaultAutoCommit != null ||
        for (int i = 0; i < initQueries.size(); i++) {
import java.util.List;
    public void setIgnoreErrors(boolean ignoreErrors) {
        initQueries.clear();
        return defaultSchemaName;
        this.defaultAutoCommit = defaultAutoCommit;
 *
    public void setDefaultAutoCommit(@Nullable Boolean defaultAutoCommit) {
 * You may obtain a copy of the License at

 */
 *
 * Bootstrap properties are applied to each opened connection after data-source initialization.
    public DBPConnectionBootstrap(@NotNull DBPConnectionBootstrap info) {
import org.jkiss.utils.CommonUtils;
    }
    private final List<String> initQueries;
        return defaultAutoCommit;
/*

 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.defaultAutoCommit = info.defaultAutoCommit;

            ignoreErrors ||
        this.defaultSchemaName = info.defaultSchemaName;
        this.initQueries = new ArrayList<>(info.initQueries);
    }
        this.defaultCatalogName = GeneralUtils.replaceVariables(this.defaultCatalogName, variableResolver);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.IVariableResolver;

 * limitations under the License.
    @Override
            return false;
    @Nullable
    public boolean hasData() {
import org.jkiss.code.NotNull;
            !CommonUtils.isEmpty(defaultCatalogName) ||

        this.ignoreErrors = info.ignoreErrors;
import java.util.Collection;
        this.ignoreErrors = false;
                CommonUtils.equalObjects(this.initQueries, source.initQueries) &&
    @NotNull
    private Boolean defaultAutoCommit;
 * distributed under the License is distributed on an "AS IS" BASIS,

            defaultTransactionIsolation != null ||
        return defaultTransactionIsolation;
        this.defaultCatalogName = defaultCatalogName;

            initQueries.set(i, GeneralUtils.replaceVariables(initQueries.get(i), variableResolver));
    @Nullable
    }
            !CommonUtils.isEmpty(initQueries);
/**
    private String defaultSchemaName;
        return initQueries;
    private String defaultCatalogName;
        initQueries.addAll(queries);



    }
                CommonUtils.equalObjects(this.defaultCatalogName, source.defaultCatalogName) &&
                this.ignoreErrors == source.ignoreErrors;
        if (!(obj instanceof DBPConnectionBootstrap source)) {

    public List<String> getInitQueries() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    void resolveDynamicVariables(IVariableResolver variableResolver) {
    @Nullable
import java.util.ArrayList;
    @Nullable
    }
                CommonUtils.equalObjects(this.defaultAutoCommit, source.defaultAutoCommit) &&
    }
    public void setInitQueries(Collection<String> queries) {
 */

    }
    public Integer getDefaultTransactionIsolation() {
        return
 * you may not use this file except in compliance with the License.
    public String getDefaultSchemaName() {
import org.jkiss.dbeaver.utils.GeneralUtils;


    }

 * See the License for the specific language governing permissions and
    }
    }
    }
    }
    }
