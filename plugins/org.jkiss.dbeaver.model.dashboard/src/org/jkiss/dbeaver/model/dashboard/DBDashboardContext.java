        this.dataSource = dataSource;
    }

        this.project = dataSource == null ? null : dataSource.getProject();

import org.jkiss.dbeaver.model.app.DBPProject;
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Dashboard context

    @Nullable
    public void setDataSource(@Nullable DBPDataSourceContainer dataSource) {
 *
 *
        this.project = project;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBDashboardContext(@Nullable DBPProject project) {
    @Nullable

    private DBPDataSourceContainer dataSource;
    public DBDashboardContext() {
        return dataSource;
    public DBPDataSourceContainer getDataSource() {
public class DBDashboardContext {
    @Nullable
 */

}
    @Nullable
 * DBeaver - Universal Database Manager

    }
    }

    }
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.project = project;
    private DBPProject project;

 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.dashboard;
/*
 * See the License for the specific language governing permissions and
    public DBDashboardContext(@Nullable DBPDataSourceContainer dataSource) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public void setProject(@Nullable DBPProject project) {
    public DBPProject getProject() {
    }
 * You may obtain a copy of the License at

        return project;
    }
        this.dataSource = dataSource;
/**
