import org.jkiss.dbeaver.DBException;

public class GenericUniqueKey extends GenericTableConstraint {
    /**
        super(constraint.getTable(), constraint.getName(), constraint.getDescription(), constraint.getConstraintType(), constraint.isPersisted());

    }

import java.util.ArrayList;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

            columns.sort(Comparator.comparingInt(GenericTableConstraintColumn::getOrdinalPosition));
    public void addAttributeReference(DBSTableColumn column) throws DBException {

    private final List<GenericTableConstraintColumn> columns = new ArrayList<>();
        }
            for (GenericTableConstraintColumn sourceColumn : constraint.columns) {
        if (!CommonUtils.isEmpty(this.columns) && this.columns.size() > 1) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at

                }
/**
     * Copy constructor
    public void setAttributeReferences(List<GenericTableConstraintColumn> columns) {
    }
    GenericUniqueKey(GenericUniqueKey constraint) {
        if (this.columns != null) {
import java.util.List;
                    return true;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
        if (constraint.columns != null) {

                this.columns.add(new GenericTableConstraintColumn(this, sourceColumn));
    }
        this.columns.add(new GenericTableConstraintColumn(this, (GenericTableColumn) column, columns.size()));
    public void addColumn(GenericTableConstraintColumn column) {
        return columns;
    @Override

            }
            }
                if (constColumn.getAttribute() == column) {
            this.columns.clear();
 * GenericTableConstraint
        this.columns.add(column);
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.columns.clear();
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    public List<GenericTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
        return false;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    public GenericUniqueKey(GenericTableBase table, String name, @Nullable String remarks, DBSEntityConstraintType constraintType, boolean persisted) {
    }
 *
package org.jkiss.dbeaver.ext.generic.model;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
import java.util.Comparator;
    }
     */
        super(table, name, remarks, constraintType, persisted);
}        this.columns.addAll(columns);
    public boolean hasColumn(GenericTableColumn column) {
 */
            for (GenericTableConstraintColumn constColumn : columns) {
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        }

    }
