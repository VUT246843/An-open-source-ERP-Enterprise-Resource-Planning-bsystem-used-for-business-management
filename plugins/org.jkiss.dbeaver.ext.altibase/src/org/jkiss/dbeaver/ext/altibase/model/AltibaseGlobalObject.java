
    }
 */
    }
    public String getDescription() {
}
        this.persisted = persisted;
    public boolean isPersisted() {
package org.jkiss.dbeaver.ext.altibase.model;
 *
 * DBeaver - Universal Database Manager
    protected AltibaseGlobalObject(
/*
 * limitations under the License.
 * See the License for the specific language governing permissions and
    @Nullable

    }
    @Override
    public DBSObject getParentObject() {
        this.dataSource = dataSource;


 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
        return dataSource.getContainer();
import org.jkiss.code.NotNull;
    public AltibaseDataSource getDataSource() {
        return persisted;
 *
public abstract class AltibaseGlobalObject implements DBSObject, DBPSaveableObject {
    @Override
        AltibaseDataSource dataSource,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
 * you may not use this file except in compliance with the License.

        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final AltibaseDataSource dataSource;
    @Override
    private boolean persisted;
 *


    public void setPersisted(boolean persisted) {
import org.jkiss.dbeaver.model.DBPSaveableObject;
    @Override
    }
        return dataSource;
        boolean persisted) {
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.persisted = persisted;
    }
