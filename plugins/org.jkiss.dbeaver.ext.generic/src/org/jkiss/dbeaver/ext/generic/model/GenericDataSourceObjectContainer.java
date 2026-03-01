 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    }
    @Override
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");


 *
    }
package org.jkiss.dbeaver.ext.generic.model;
 * you may not use this file except in compliance with the License.

 * You may obtain a copy of the License at
    @Override
        return null;
    @Override

 * See the License for the specific language governing permissions and
    @Override
    @Override

    public GenericStructContainer getObject() {

import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
        return dataSource;
 *

    }
        return dataSource.getParentObject();
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
        return dataSource.getDescription();
    public String getName() {


    @Nullable
    public GenericDataSourceObjectContainer(@NotNull GenericDataSource dataSource) {
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public GenericCatalog getCatalog() {

    @Override
    @Override
        this.dataSource = dataSource;
/*
 *
 * Unless required by applicable law or agreed to in writing, software
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
    }
    }
        return dataSource.getName();
        return GenericTable.class;
    private final GenericDataSource dataSource;
    @NotNull
 */
}
    public String getDescription() {
 *     http://www.apache.org/licenses/LICENSE-2.0
public class GenericDataSourceObjectContainer extends GenericObjectContainer {
    }
    }
        super(dataSource);
        return null;
    public GenericSchema getSchema() {
    }
    public DBSObject getParentObject() {
