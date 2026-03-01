    }
 * Unless required by applicable law or agreed to in writing, software
    public OWNER getParentObject()
    @Override
    }
    }
import org.jkiss.dbeaver.model.meta.Property;
        this.name = name;

    }
    @NotNull
        return container;


    }
 * distributed under the License is distributed on an "AS IS" BASIS,

        return container;
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
        this.description = description;
import java.util.Map;
    {
        return true;
    }
        source = sourceText;
/**
        return (GenericDataSource) container.getDataSource();

    private final OWNER container;
public abstract class GenericTrigger<OWNER extends DBSObject> implements
    @Override
    }
    public String getDescription()
 */
import org.jkiss.code.Nullable;
    public void setName(@NotNull String name) {
    {


    public boolean isPersisted()
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    DBPNamedObject2,
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.DBException;
    @NotNull
    @Nullable
    @Override
        return description;
}
    @NotNull
    }
    @Override

    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;

 */


    @Override
        }
    public GenericDataSource getDataSource()
        return source;

    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    DBSTrigger,
package org.jkiss.dbeaver.ext.generic.model;
    }
 * You may obtain a copy of the License at
    {
    {
/*
    @NotNull
 *
    {
            source = getDataSource().getMetaModel().getTriggerDDL(monitor, this);
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    protected void setDescription(String description)
 *
    GenericScriptObject,
    private String description;
import org.jkiss.code.NotNull;

    public String getName() {

    @Property(viewable = true, editable = true, order = 1)
    private String name;
        if (source == null) {
    public GenericTrigger(@NotNull OWNER container, String name, String description) {
{
    DBPQualifiedObject
 * Licensed under the Apache License, Version 2.0 (the "License");
 * GenericTrigger
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    public void setSource(String sourceText) {
import org.jkiss.dbeaver.model.DBPNamedObject2;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.description = description;
        this.name = name;
    }
        this.container = container;
 *
    protected String source;
 * DBeaver - Universal Database Manager
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        return name;
    public OWNER getContainer() {
 * limitations under the License.
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.DBPQualifiedObject;
