 *
 */

import org.jkiss.dbeaver.model.DBUtils;
 *
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @Override
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.exasol.model;
    public ExasolSchemaObject(ExasolSchema schema, String name, boolean persisted) {

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * you may not use this file except in compliance with the License.
}
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
public class ExasolSchemaObject extends ExasolObject<ExasolSchema> implements DBPQualifiedObject {
        super(schema, name, persisted);
 * DBeaver - Universal Database Manager
        return DBUtils.getFullQualifiedName(getDataSource(), getParentObject(), this);
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
/*
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

