
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    public String getReferenceTypeName() throws DebugException {
import org.eclipse.debug.core.model.IVariable;
    public void setValue(IValue value) throws DebugException {


    @Override


 *
    }
    }
 *
    }
        // TODO Auto-generated method stub
    public boolean verifyValue(String expression) throws DebugException {
        this.dbgVariable = variable;
 *
        // TODO Auto-generated method stub
 * You may obtain a copy of the License at
    @Override

        // TODO Auto-generated method stub
        return dbgVariable.getType().toString();
 * limitations under the License.
import org.eclipse.debug.core.model.IValue;
    }

        return false;
import org.jkiss.dbeaver.debug.DBGVariable;
        super(target);
    @Override
    public boolean hasValueChanged() throws DebugException {
    private final DBGVariable<?> dbgVariable;
    public IValue getValue() throws DebugException {
        return false;

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setValue(String expression) throws DebugException {
    public DatabaseVariable(IDatabaseDebugTarget target, DBGVariable<?> variable) {
    @Override
    }
 * See the License for the specific language governing permissions and



    @Override
import org.eclipse.debug.core.DebugException;
        return new DatabaseValue(getDatabaseDebugTarget(), dbgVariable);
        // TODO Auto-generated method stub
    @Override
    @Override

        return false;
    public boolean verifyValue(IValue value) throws DebugException {

    }
    }
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
public class DatabaseVariable extends DatabaseDebugElement implements IVariable {
        // TODO Auto-generated method stub
    @Override
 * you may not use this file except in compliance with the License.
/*
 * Unless required by applicable law or agreed to in writing, software
    public boolean supportsValueModification() {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    public String getName() throws DebugException {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    }
        // TODO Auto-generated method stub
        return dbgVariable.getName();
 */
        return false;
package org.jkiss.dbeaver.debug.core.model;
