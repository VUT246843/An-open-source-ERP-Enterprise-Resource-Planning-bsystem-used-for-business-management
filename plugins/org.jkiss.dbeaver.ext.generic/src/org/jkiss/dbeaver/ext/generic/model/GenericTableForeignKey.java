

import java.util.List;

    }
import org.jkiss.dbeaver.model.DBUtils;
        GenericTableBase table,
        boolean persisted) {
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(GenericTableForeignKey.class);
        return columns;
 * See the License for the specific language governing permissions and
import java.util.ArrayList;
    public GenericTableForeignKey(
/*
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
                }
            getTable().getCatalog(),
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String name,
        DBSForeignKeyDeferability deferability,
            // [JDBC: Progress bug. All FK columns are duplicated]
    @NotNull
}
                if (!duplicate) {
                        this.columns.remove(k);
 */
        @Nullable String remarks,
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

    @Override

    public void setDeferability(DBSForeignKeyDeferability deferability) {
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        this.deferability = deferability;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return getTable().getDataSource();
    @NotNull
import org.jkiss.utils.CommonUtils;

        DBSForeignKeyModifyRule updateRule,
 *
 */
/**
    @Override
        this.columns.add(column);
        if (refColumns != null && this.columns.size() > refColumns.size()) {
    private DBSForeignKeyDeferability deferability;
        this.deferability = deferability;
        DBSEntityReferrer referencedKey,
 * Licensed under the Apache License, Version 2.0 (the "License");
                    i++;
public class GenericTableForeignKey extends JDBCTableForeignKey<GenericTableBase, GenericTableForeignKeyColumnTable, DBSEntityReferrer> {
package org.jkiss.dbeaver.ext.generic.model;

    public void addColumn(GenericTableForeignKeyColumnTable column) {
        } catch (DBException e) {

    }
 *
        return deferability;
        if (columns == null) {
    @Property(viewable = true, order = 7)
    }
                for (int k = i + 1; k < this.columns.size(); k++) {
 * You may obtain a copy of the License at

            this);
                boolean duplicate = false;
            for (int i = 0; i < this.columns.size(); ) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return;

        this.columns = columns;
    }
                        break;
    private List<GenericTableForeignKeyColumnTable> columns;
 * limitations under the License.
    }
                }
        DBSForeignKeyModifyRule deleteRule,
            refColumns = referencedConstraint.getAttributeReferences(monitor);
    }
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public List<GenericTableForeignKeyColumnTable> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableForeignKey;

                    String colName2 = this.columns.get(k).getName();
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
 * GenericTableForeignKey
import org.jkiss.dbeaver.DBException;
        }
import org.jkiss.dbeaver.model.meta.Property;
 *
        super(table, name, remarks, referencedKey, deleteRule, updateRule, persisted);
    void setColumns(DBRProgressMonitor monitor, List<GenericTableForeignKeyColumnTable> columns) {
        this.columns = columns;
                        duplicate = true;
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            }

    public void setAttributeReferences(List<GenericTableForeignKeyColumnTable> columns) throws DBException {
            getTable(),
                String colName = this.columns.get(i).getName();
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            columns = new ArrayList<>();
        try {
        return DBUtils.getFullQualifiedName(getDataSource(),
            getTable().getSchema(),
import org.jkiss.code.NotNull;
        final List<? extends DBSEntityAttributeRef> refColumns;

    public GenericDataSource getDataSource() {
                    }
    @Override
        }
                    if (CommonUtils.equalObjects(colName, colName2)) {
    }
    }
    public DBSForeignKeyDeferability getDeferability() {
            log.error("Error getting referenced key columns", e);
