 * limitations under the License.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = false, hidden = true, order = 6)
import org.jkiss.dbeaver.ext.generic.model.GenericFunctionResultType;

/*
 */
import org.jkiss.dbeaver.model.meta.Property;
        return super.getProcedureType();
    }
    @Override
 * You may obtain a copy of the License at
        return super.getFunctionResultType();
    public DBSProcedureType getProcedureType() {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.altibase.model;
    @Override
public class AltibaseTypeset extends AltibaseProcedureStandAlone {
    public AltibaseTypeset(GenericStructContainer container, String procedureName, boolean valid) {
 * you may not use this file except in compliance with the License.
}
        super(container, procedureName, valid, DBSProcedureType.UNKNOWN, GenericFunctionResultType.NO_TABLE);
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public GenericFunctionResultType getFunctionResultType() {
    
 * See the License for the specific language governing permissions and
    
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    @Property(viewable = false, hidden = true, order = 7)
    }
 *
