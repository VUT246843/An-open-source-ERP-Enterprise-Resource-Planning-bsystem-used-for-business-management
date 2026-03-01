
}
    }
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException {
 * GenericDataType
/*
        this.componentType = componentType;

 * Unless required by applicable law or agreed to in writing, software
    }
    }
import org.jkiss.code.Nullable;
        super(owner, typed);
    public GenericDataTypeArray(GenericStructContainer owner, DBSTypedObject typed) {

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
 */
    @Override
        super(owner, valueType, name, remarks, false, false, 0, 0, 0);
    public void setComponentType(DBSDataType componentType) {
 * You may obtain a copy of the License at
public class GenericDataTypeArray extends GenericDataType {
    @Nullable
package org.jkiss.dbeaver.ext.generic.model;
 *

 * limitations under the License.
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSDataType;

 * See the License for the specific language governing permissions and
    public GenericDataTypeArray(GenericStructContainer owner, int valueType, String name, @Nullable String remarks, DBSDataType componentDataType) {

        this.componentType = componentDataType;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return componentType;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    private DBSDataType componentType;
    }
