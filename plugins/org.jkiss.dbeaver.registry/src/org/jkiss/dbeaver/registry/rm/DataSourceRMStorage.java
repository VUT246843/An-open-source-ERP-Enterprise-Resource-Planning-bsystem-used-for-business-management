
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.app.DBPProject;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at

package org.jkiss.dbeaver.registry.rm;

    public String getStorageId() {
 *
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
        return project.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;
    public boolean isDefault() {
        return true;


    @Override
    @Override
    @Override
    }
 * limitations under the License.
    public String getStorageSubId() {
        this.project = project;
class DataSourceRMStorage implements DBPDataSourceConfigurationStorage {
 */
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

    public DataSourceRMStorage(DBPProject project) {
    }
    @Override
    @Nullable
/**
        return true;
    public boolean isVirtual() {
    public boolean isValid() {
 * you may not use this file except in compliance with the License.
    }
 * DataSourceRemoteStorage
        return null;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

 * Unless required by applicable law or agreed to in writing, software
    }
/*
    }
 * See the License for the specific language governing permissions and
        return true;
    private DBPProject project;

