    }
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    @Override
 * DBeaver - Universal Database Manager
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
 *
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.sqlite.model;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
    @NotNull
 * limitations under the License.
    }
    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {
        return "INSERT OR IGNORE INTO";
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

 *
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Unless required by applicable law or agreed to in writing, software
public class SQLiteInsertReplaceMethodIgnore implements DBDInsertReplaceMethod {
 */
/*

import org.jkiss.code.NotNull;
