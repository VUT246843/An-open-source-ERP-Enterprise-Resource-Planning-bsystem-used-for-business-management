
/*
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
}
 */

package org.jkiss.dbeaver.ext.db2.model;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * Abstract DB2 schema object

/**

 *
 * You may obtain a copy of the License at
 *
    @NotNull
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public abstract class DB2SchemaObject extends DB2Object<DB2Schema> implements DBPQualifiedObject {
    {
    {
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
    public DB2Schema getSchema()
        return DBUtils.getFullQualifiedName(getDataSource(), getParentObject(), this);
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(schema, name, persisted);
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    protected DB2SchemaObject(DB2Schema schema, String name, boolean persisted)
        return getParentObject();
    @Override
 * DBeaver - Universal Database Manager
    {
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
