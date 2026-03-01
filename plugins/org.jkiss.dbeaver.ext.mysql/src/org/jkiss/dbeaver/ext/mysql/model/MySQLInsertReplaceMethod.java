        return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {

}
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
    }
    @Override
 * See the License for the specific language governing permissions and

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {
    @Override

/*
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
package org.jkiss.dbeaver.ext.mysql.model;
        return "REPLACE INTO";
 *
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    @NotNull

public class MySQLInsertReplaceMethod implements DBDInsertReplaceMethod {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 *
 * limitations under the License.
 *
