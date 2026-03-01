 *
    }
    @Override
            getTable().getSchema(),
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return DBUtils.getFullQualifiedName(getDataSource(),
 * DBeaver - Universal Database Manager
}
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            this);
/**
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
package org.jkiss.dbeaver.ext.mssql.model.generic;

 *
import org.jkiss.code.NotNull;
        super(container, name, description);
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;

*/
 *     http://www.apache.org/licenses/LICENSE-2.0
        return (SQLServerGenericTable) super.getTable();
import org.jkiss.dbeaver.model.DBUtils;
 * you may not use this file except in compliance with the License.
    public SQLServerGenericTable getTable() {
 * Unless required by applicable law or agreed to in writing, software

    public SQLServerGenericTrigger(GenericTableBase container, String name, String description) {
 *
import org.jkiss.dbeaver.model.DBPQualifiedObject;
public class SQLServerGenericTrigger extends GenericTableTrigger implements DBPQualifiedObject {
 */
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
* SQL server trigger
 * See the License for the specific language governing permissions and
    @NotNull
/*
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
