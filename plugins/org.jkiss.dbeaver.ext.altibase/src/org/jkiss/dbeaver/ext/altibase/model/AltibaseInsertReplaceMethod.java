    public String getOpeningClause(DBSTable table, DBRProgressMonitor monitor) {
    }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
public class AltibaseInsertReplaceMethod implements DBDInsertReplaceMethod {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDInsertReplaceMethod;
 *
    @NotNull
import org.jkiss.code.NotNull;

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.altibase.model;
/*
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    @Override
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return "UPDATE OR INSERT INTO";
    }
    public String getTrailingClause(DBSTable table, DBRProgressMonitor monitor, DBSAttributeBase[] attributes) {


 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
        return null;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * See the License for the specific language governing permissions and
 *
}
 *
