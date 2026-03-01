        super(container, procedureName, valid, procedureType, functionResultType);
 * DBeaver - Universal Database Manager
    public AltibaseProcedureStandAlone(GenericStructContainer container, String procedureName, 
 * you may not use this file except in compliance with the License.
            String procedureName, 
    }
}
        return getContainer() instanceof GenericPackage ? (GenericPackage) getContainer() : null;
import org.jkiss.dbeaver.model.meta.Property;
 * You may obtain a copy of the License at
            GenericStructContainer container,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

    }
 *
            GenericFunctionResultType functionResultType) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            DBSProcedureType procedureType) {
 *
package org.jkiss.dbeaver.ext.altibase.model;
            
    }
/*
            DBSProcedureType procedureType, 
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    // Create a new procedure
 */
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = false, hidden = true, order = 5)
 * Unless required by applicable law or agreed to in writing, software
        super(container, procedureName, true, procedureType, GenericFunctionResultType.UNKNOWN);
public class AltibaseProcedureStandAlone extends AltibaseProcedureBase {
import org.jkiss.dbeaver.ext.generic.model.GenericFunctionResultType;
            boolean valid,

    public AltibaseProcedureStandAlone(
import org.jkiss.dbeaver.ext.generic.model.GenericPackage;
 * See the License for the specific language governing permissions and
 * limitations under the License.

    public GenericPackage getPackage() {
