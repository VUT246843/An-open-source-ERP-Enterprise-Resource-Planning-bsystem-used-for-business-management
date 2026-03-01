import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

package org.jkiss.dbeaver.ext.firebird.model;
public class FireBirdTable extends GenericTable implements FireBirdTableBase, DBPNamedObject2 {
    private String ownerName;
import java.util.*;
        return false;
    @Override
    private Map<String, String> columnDomainTypes;
    }
    }
import org.jkiss.dbeaver.model.DBUtils;
    public String getOwnerName() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            columnDomainTypes = FireBirdUtils.readColumnDomainTypes(monitor, this);
    @Property(viewable = true, order = 21)
        columns.sort(DBUtils.orderComparator());
        Collection<? extends GenericTableColumn> childColumns = super.getAttributes(monitor);
            keyLength = JDBCUtils.safeGetInt(dbResult, "RDB$DBKEY_LENGTH");
    public int getKeyLength() {
        }
    public String getColumnDomainType(DBRProgressMonitor monitor, FireBirdTableColumn column) throws DBException {
import org.jkiss.dbeaver.model.DBPNamedObject2;
    }
        return columnDomainTypes.get(column.getName());
 * You may obtain a copy of the License at
    private int keyLength;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getExternalFile() {
 * limitations under the License.

/*
        super(container, tableName, tableType, dbResult);


        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return keyLength;

import org.jkiss.dbeaver.ext.firebird.FireBirdUtils;
            return Collections.emptyList();
 * Licensed under the Apache License, Version 2.0 (the "License");


            ownerName = JDBCUtils.safeGetStringTrimmed(dbResult, "RDB$OWNER_NAME");
        return ownerName;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
            columns.add((FireBirdTableColumn) gtc);
        List<FireBirdTableColumn> columns = new ArrayList<>();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        }
import org.jkiss.dbeaver.model.meta.Property;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
        return columns;

    @Override


    }
 *

import org.jkiss.code.Nullable;
            externalFile = JDBCUtils.safeGetStringTrimmed(dbResult, "RDB$EXTERNAL_FILE");
        return externalFile;
    protected boolean isTruncateSupported() {
        }
}
    }
    @Property(viewable = true, order = 20)
    public FireBirdTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * you may not use this file except in compliance with the License.
        if (childColumns == null) {
    private String externalFile;
        if (columnDomainTypes == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (dbResult != null) {
    public synchronized List<FireBirdTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
import org.jkiss.code.NotNull;
        for (GenericTableColumn gtc : childColumns) {
    @Property(viewable = true, order = 22)
