 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
 * limitations under the License.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
        FireBirdTableColumn.class,
 */
 *
 * You may obtain a copy of the License at
    }
        GenericTableIndex.class
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
        GenericTableForeignKey.class,
    );
 * you may not use this file except in compliance with the License.
public class FireBirdTableManager extends GenericTableManager {
    @Override
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
        return CHILD_TYPES;
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    public Class<? extends DBSObject>[] getChildTypes() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.firebird.edit;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
        GenericUniqueKey.class,
import org.jkiss.dbeaver.ext.firebird.model.FireBirdTableColumn;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
}
/*

import org.jkiss.code.NotNull;
