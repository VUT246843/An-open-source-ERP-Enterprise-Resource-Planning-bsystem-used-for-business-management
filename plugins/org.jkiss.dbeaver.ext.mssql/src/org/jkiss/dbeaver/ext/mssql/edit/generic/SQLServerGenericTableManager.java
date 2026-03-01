 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.mssql.edit.generic;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;

import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
        SQLServerGenericIndex.class
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
import org.jkiss.dbeaver.ext.mssql.model.generic.SQLServerGenericTableColumn;

 * you may not use this file except in compliance with the License.
 * SQLServerGenericTableManager

import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    );
        GenericTableForeignKey.class,
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(

 *
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
import org.jkiss.dbeaver.ext.mssql.model.generic.SQLServerGenericIndex;
        SQLServerGenericTableColumn.class,
        return CHILD_TYPES;

/**
 * You may obtain a copy of the License at
    @NotNull
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
public class SQLServerGenericTableManager extends GenericTableManager {
import org.jkiss.code.NotNull;
/*
 * limitations under the License.
 */
 *
    public Class<? extends DBSObject>[] getChildTypes() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 */
        GenericUniqueKey.class,
