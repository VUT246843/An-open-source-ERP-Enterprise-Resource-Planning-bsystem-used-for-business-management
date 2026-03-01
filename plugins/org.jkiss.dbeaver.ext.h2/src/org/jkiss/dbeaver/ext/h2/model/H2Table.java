    public void setTableDiskSize(long tableDiskSize) {
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean hasStatistics() {
import org.jkiss.dbeaver.model.DBPObjectStatistics;

 * Licensed under the Apache License, Version 2.0 (the "License");

        return tableDiskSize != null;
    public long getTableDiskSize() {
    private Long tableDiskSize;
    H2Table(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }

        super(container, tableName, tableType, dbResult);
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return tableDiskSize;
 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
package org.jkiss.dbeaver.ext.h2.model;
 *
    public long getStatObjectSize() {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
/*
public class H2Table extends GenericTable implements DBPObjectStatistics {
    @Override
 * Unless required by applicable law or agreed to in writing, software
}
    @Override
        return tableDiskSize == null ? 0 : tableDiskSize;

 *
    }
 * DBeaver - Universal Database Manager
        this.tableDiskSize = tableDiskSize;

    }
 * You may obtain a copy of the License at
