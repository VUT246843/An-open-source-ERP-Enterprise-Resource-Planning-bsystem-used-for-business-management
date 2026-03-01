    {
 *
        return DBUtils.getFullQualifiedName(getDataSource(),


package org.jkiss.dbeaver.ext.oracle.model;
import org.jkiss.dbeaver.model.DBPQualifiedObject;
        String name,
            this);
    protected OracleSchemaObject(
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
}
    @NotNull
        super(schema, name, persisted);
{
    public OracleSchema getSchema()
 */

public abstract class OracleSchemaObject extends OracleObject<OracleSchema> implements DBPQualifiedObject
    {
            getParentObject(),
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {

 * See the License for the specific language governing permissions and
        boolean persisted)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBUtils;
 *
 * Unless required by applicable law or agreed to in writing, software
        OracleSchema schema,
 * Abstract oracle schema object
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        return getParentObject();
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
/*
 *
 * DBeaver - Universal Database Manager
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)

    }
