    private ClickhouseDataSource dataSource;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isPersisted() {
        return dataSource;
    }
    }
 * The table engine (type of table) in ClickHouse helps to understand how and where data is stored in table
    private String name;
 *
/*
package org.jkiss.dbeaver.ext.clickhouse.model;
}
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull
    @Override

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

/**
    }
    }
        return name;
        return name;
    public String getName() {
        return true;
 *

 */
    @Nullable
    public String getDescription() {
        return dataSource;

 * You may obtain a copy of the License at

    public String toString() {
    public void setName(String name) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        this.name = name;
 * and other useful table parameters.
 *
    @Nullable
    public DBPDataSource getDataSource() {
    }

    }
    @Override
        this.dataSource = dataSource;
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
    public DBSObject getParentObject() {
    @Nullable
    public ClickhouseTableEngine(String name, @NotNull ClickhouseDataSource dataSource) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;

public class ClickhouseTableEngine implements DBSObject {
        this.name = name;
    }
 */


 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
    }
