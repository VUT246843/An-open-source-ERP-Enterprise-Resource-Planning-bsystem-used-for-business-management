import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
 *
 *
        super(table, nonUnique, qualifier, cardinality, indexName, indexType, persisted);
    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
/*
 */

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
* SEL Server index
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * limitations under the License.
package org.jkiss.dbeaver.ext.mssql.model.generic;
    }
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

}
            getTable(),
 * you may not use this file except in compliance with the License.
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
public class SQLServerGenericIndex extends GenericTableIndex {

            getTable().getSchema(),
 *

 * DBeaver - Universal Database Manager
        return DBUtils.getFullQualifiedName(getDataSource(),
*/
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public SQLServerGenericIndex(GenericTableBase table, boolean nonUnique, String qualifier, long cardinality, String indexName, DBSIndexType indexType, boolean persisted) {
            this);
