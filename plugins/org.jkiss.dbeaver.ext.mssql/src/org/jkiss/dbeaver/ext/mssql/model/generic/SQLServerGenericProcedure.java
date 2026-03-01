import org.jkiss.code.NotNull;
    ) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
import org.jkiss.dbeaver.ext.generic.model.GenericPackage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public GenericPackage getPackage() {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(container, procedureName, specificName, description, procedureType, functionResultType);
 * limitations under the License.
        GenericStructContainer container,
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
        return super.getPackage();
    public GenericFunctionResultType getFunctionResultType() {
 * DBeaver - Universal Database Manager
 */
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
    }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

}
    }
        super(container, name, null, DBSProcedureType.PROCEDURE, "", false);
 *

        return super.getFullyQualifiedName(context);
import org.jkiss.dbeaver.ext.generic.model.GenericFunctionResultType;
    @Property(hidden = true)
 *
        return super.getFunctionResultType();

    public SQLServerGenericProcedure(GenericStructContainer container, String procedureName, String specificName, String description, DBSProcedureType procedureType, GenericFunctionResultType functionResultType) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *
*/

    @Override
    public SQLServerGenericProcedure(
* SQL Server procedure

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        String name
public class SQLServerGenericProcedure extends GenericProcedure {
 * See the License for the specific language governing permissions and
    // Create new object
import org.jkiss.dbeaver.model.meta.Property;

    }
package org.jkiss.dbeaver.ext.mssql.model.generic;
    @Property(hidden = true)
 * You may obtain a copy of the License at
    @Override
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
