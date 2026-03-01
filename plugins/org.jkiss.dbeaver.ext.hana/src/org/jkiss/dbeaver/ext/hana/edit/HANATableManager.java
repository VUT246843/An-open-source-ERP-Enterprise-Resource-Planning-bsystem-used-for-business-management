import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
 * limitations under the License.
/*
import org.jkiss.dbeaver.model.struct.DBSObject;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

public class HANATableManager extends GenericTableManager {
    @NotNull
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;

 * you may not use this file except in compliance with the License.
        GenericUniqueKey.class,
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
        return CHILD_TYPES;
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
 *
 *
        GenericTableForeignKey.class,
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    public Class<? extends DBSObject>[] getChildTypes() {
 * Unless required by applicable law or agreed to in writing, software
    );
    @Override
import org.jkiss.code.NotNull;
 *
    }
 */
import org.jkiss.dbeaver.ext.hana.model.HANATableColumn;
        HANATableColumn.class,
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.ext.hana.edit;
        GenericTableIndex.class
