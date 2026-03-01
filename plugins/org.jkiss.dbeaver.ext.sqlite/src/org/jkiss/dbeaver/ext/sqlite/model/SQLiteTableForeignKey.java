        GenericTableBase referencedTable = getReferencedTable();
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.sqlite.model;
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
public class SQLiteTableForeignKey extends GenericTableForeignKey {
        return Objects.nonNull(referencedTable) && referencedTable.equals(table);

    }
    }
 *

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
 * you may not use this file except in compliance with the License.
}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLiteTableForeignKey(GenericTableBase table, String name, @Nullable String remarks, DBSEntityReferrer referencedKey, DBSForeignKeyModifyRule deleteRule, DBSForeignKeyModifyRule updateRule, DBSForeignKeyDeferability deferability, boolean persisted) {

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(table, name, remarks, referencedKey, deleteRule, updateRule, deferability, persisted);
import java.util.Objects;
/*
 * limitations under the License.
 * See the License for the specific language governing permissions and
    public boolean refersToTable(SQLiteTable table) {
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericTableForeignKey;
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
 *
