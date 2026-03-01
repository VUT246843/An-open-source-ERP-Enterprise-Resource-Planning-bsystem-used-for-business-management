 *
/*
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class SQLServerGenericTableColumnManager extends GenericTableColumnManager
}
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.mssql.edit.generic;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * SQLServerGenericTableColumnManager
{
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
 */
    protected ColumnModifier[] getSupportedModifiers(GenericTableColumn column, Map<String, Object> options) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return new ColumnModifier[]{DataTypeModifier, DefaultModifier, NullNotNullModifier};

/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
    @Override
import java.util.Map;
 */
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
