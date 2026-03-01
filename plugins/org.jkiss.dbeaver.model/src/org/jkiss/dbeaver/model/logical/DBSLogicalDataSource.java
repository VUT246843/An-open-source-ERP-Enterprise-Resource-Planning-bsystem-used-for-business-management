        return currentCatalog;
    public static DBSLogicalDataSource createLogicalDataSource(

import java.util.List;
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
        this.currentCatalog = currentCatalog;
    }
 *
    private String currentSchema;
        }
    ) {
                if (contextDefaults.getDefaultSchema() != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (contextDefaults != null) {
    public String getCurrentSchema() {
    private final DBPDataSourceContainer dataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.description = description;
 * Logical datasource
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 */
    private String description;
    public DBPDataSourceContainer getDataSourceContainer() {
    }



        this(dataSourceContainer, "DS Wrapper", null);
    }
    public String getCurrentCatalog() {
    public void setCurrentCatalog(String currentCatalog) {
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
        if (executionContext != null) {

    private String name;
 * You may obtain a copy of the License at
        return catalogs;
        DBSLogicalDataSource lDataSource = new DBSLogicalDataSource(dataSourceContainer, "AI logical wrapper", null);
                    lDataSource.setCurrentSchema(contextDefaults.getDefaultSchema().getName());
        this.description = description;

    @NotNull

    }
    }
 *
    @Nullable
                }

import org.jkiss.dbeaver.model.DBPNamedObject;

    public void setCatalogs(List<DBSLogicalCatalog> catalogs) {

 * DBeaver - Universal Database Manager
            }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
    }
 *
    @Override

    }
                if (contextDefaults.getDefaultCatalog() != null) {

    public void setDescription(String description) {
/*
 * you may not use this file except in compliance with the License.
    public String getDescription() {
                    lDataSource.setCurrentCatalog(contextDefaults.getDefaultCatalog().getName());
        return currentSchema;
    public void setName(String name) {
    public void setCurrentSchema(String currentSchema) {
    @Override
        return dataSourceContainer;

        this.name = name;
        @Nullable DBCExecutionContext executionContext

    @NotNull
    }

    private String currentCatalog;
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
    private List<DBSLogicalCatalog> catalogs;
    @NotNull
    }
        return lDataSource;
    public String getName() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.currentSchema = currentSchema;
    }
/**


 * limitations under the License.
}
    public DBSLogicalDataSource(@NotNull DBPDataSourceContainer dataSourceContainer, String name, String description) {
        this.name = name;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public List<DBSLogicalCatalog> getCatalogs() {
    }
        this.dataSourceContainer = dataSourceContainer;
    @Override
        return name;
    }
        this.catalogs = catalogs;
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
    public DBSLogicalDataSource(@NotNull DBPDataSourceContainer dataSourceContainer) {
                }
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others


        @NotNull DBPDataSourceContainer dataSourceContainer,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.model.logical;
public class DBSLogicalDataSource implements DBPDataSourceContainerProvider, DBPNamedObject, DBPObjectWithDescription {
        return description;
            DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
