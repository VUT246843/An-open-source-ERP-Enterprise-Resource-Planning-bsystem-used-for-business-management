    }
    Collection<? extends DBSProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor) throws DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
    default DBSTypedObject getReturnType(@NotNull DBRProgressMonitor monitor) throws DBException {

 * Unless required by applicable law or agreed to in writing, software


 * DBSProcedure
    DBSObject getContainer();
 * limitations under the License.
    @Nullable
 *
        return null;
import java.util.Collection;
/*
import org.jkiss.dbeaver.DBException;
}    DBSProcedureType getProcedureType();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
 */
{

import org.jkiss.dbeaver.model.struct.DBSParametrizedObject;
 *
package org.jkiss.dbeaver.model.struct.rdb;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;
 * you may not use this file except in compliance with the License.
/**
    @Nullable

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
public interface DBSProcedure extends DBSParametrizedObject, DBPQualifiedObject
 *
import org.jkiss.dbeaver.model.DBPQualifiedObject;

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
