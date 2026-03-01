 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;

 *
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
public class MySQLInsertReplaceMethodIgnore implements DBDInsertReplaceMethod {
    }
    @NotNull
    @Override
 */
 * Unless required by applicable law or agreed to in writing, software

        return "INSERT IGNORE INTO";
 *
}
 * limitations under the License.
 * You may obtain a copy of the License at
    @Override
        return null;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.mysql.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
