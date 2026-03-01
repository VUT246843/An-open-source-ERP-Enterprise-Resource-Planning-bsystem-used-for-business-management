
        return "INSERT INTO";
 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {

 *
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
public class BaseInsertMethod implements DBDInsertReplaceMethod {
    }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * DBeaver - Universal Database Manager
 * limitations under the License.
}
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.impl.sql;
    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {
    public BaseInsertMethod() {
    @Override

        return null;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
/*
    }
    @NotNull
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;

 * Unless required by applicable law or agreed to in writing, software
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
