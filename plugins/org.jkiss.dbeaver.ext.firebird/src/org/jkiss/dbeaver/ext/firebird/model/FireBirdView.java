
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            columns.add((FireBirdTableColumn) gtc);
package org.jkiss.dbeaver.ext.firebird.model;
 *     http://www.apache.org/licenses/LICENSE-2.0


        List<FireBirdTableColumn> columns = new ArrayList<>();
import java.util.*;

        }
        }
        return ownerName;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, order = 20)
        }
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
 * DBeaver - Universal Database Manager
        return columnDomainTypes.get(column.getName());
    @Override
        if (columnDomainTypes == null) {

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

        if (dbResult != null) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
}
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
    public synchronized List<FireBirdTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
    public boolean isView() {
    private Map<String, String> columnDomainTypes;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        return true;
    }
    public String getOwnerName() {
    private String ownerName;

            columnDomainTypes = FireBirdUtils.readColumnDomainTypes(monitor, this);
    public String getColumnDomainType(DBRProgressMonitor monitor, FireBirdTableColumn column) throws DBException {
    @Override
        Collection<? extends GenericTableColumn> childColumns = super.getAttributes(monitor);
        for (GenericTableColumn gtc : childColumns) {
 */

import org.jkiss.dbeaver.model.meta.Property;
 *
import org.jkiss.dbeaver.ext.generic.model.GenericView;

    }
    }
    }
/*
public class FireBirdView extends GenericView implements FireBirdTableBase, DBSObjectWithScript, DBSView {
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        columns.sort(DBUtils.orderComparator());

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (childColumns == null) {
        }
            ownerName = JDBCUtils.safeGetStringTrimmed(dbResult, "RDB$OWNER_NAME");
        super(container, tableName, tableType, dbResult);
import org.jkiss.dbeaver.model.DBUtils;
        return columns;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
    public FireBirdView(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
import org.jkiss.dbeaver.ext.firebird.FireBirdUtils;
 * you may not use this file except in compliance with the License.
 *

            return Collections.emptyList();
