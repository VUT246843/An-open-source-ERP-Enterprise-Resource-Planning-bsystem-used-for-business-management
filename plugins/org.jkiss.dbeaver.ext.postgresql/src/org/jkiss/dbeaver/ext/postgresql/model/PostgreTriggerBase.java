
    public PostgreDataSource getDataSource() {
package org.jkiss.dbeaver.ext.postgresql.model;
    }
    public abstract String getEnabledState();
        return database.getDataSource();
/*
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        return persisted;
    @Override
        this.database = database;
    @Override
    public void setPersisted(boolean persisted) {
    }

    @Override
 *
 *
        this.name = name;
    public abstract String getBody();
        this.persisted = persisted;

    @Property(viewable = true, order = 1)
        return name;

    @Override
import org.jkiss.dbeaver.model.*;
 * limitations under the License.
    @NotNull
    public abstract PostgreProcedure getFunction(DBRProgressMonitor monitor) throws DBException;
    }
    public boolean isPersisted() {
        return database;
public abstract class PostgreTriggerBase implements DBSTrigger, DBPQualifiedObject, PostgreObject, PostgreScriptObject, DBPStatefulObject, DBPScriptObjectExt2, DBPNamedObject2, DBPRefreshableObject, DBPSaveableObject {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.persisted = persisted;
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
    }

 * You may obtain a copy of the License at
    public void setName(@NotNull String name) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
 * you may not use this file except in compliance with the License.

    private boolean persisted;
import org.jkiss.dbeaver.model.meta.Property;
 *
    private final PostgreDatabase database;
    public String getName() {

 * distributed under the License is distributed on an "AS IS" BASIS,
        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option);

    @Override

    }

    }
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;

    @Override
 */
 * See the License for the specific language governing permissions and
    public PostgreDatabase getDatabase() {
import org.jkiss.dbeaver.DBException;
    PostgreTriggerBase(@NotNull PostgreDatabase database, String name, boolean persisted) {

        this.name = name;
 * DBeaver - Universal Database Manager
    protected String name;
    }
    }
