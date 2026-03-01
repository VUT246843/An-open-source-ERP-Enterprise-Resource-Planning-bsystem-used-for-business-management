            constraint.getTable(),
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        String name,
/*
import org.jkiss.code.NotNull;

    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
     * Copy constructor
            constraint.getConstraintType(),
import org.jkiss.dbeaver.model.DBUtils;
}
     * @param constraint source
 * GenericTableConstraint
 *
        super(table, name, remarks, constraintType, persisted);
        return getTable().getDataSource();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            constraint.getDescription(),
    }
        @NotNull GenericTableBase table,

    @NotNull
    /**
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        DBSEntityConstraintType constraintType,
    public GenericDataSource getDataSource() {
 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
 * Unless required by applicable law or agreed to in writing, software
            constraint.getName(),
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            getTable().getCatalog(),
        );
 *
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.generic.model;

            getDataSource(),
public abstract class GenericTableConstraint extends JDBCTableConstraint<GenericTableBase, GenericTableConstraintColumn> {
 * DBeaver - Universal Database Manager
/**
        return DBUtils.getFullQualifiedName(
 * See the License for the specific language governing permissions and
        );
 * limitations under the License.
    }
            constraint.isPersisted()
        super(
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @Override
        String remarks,
 *

    protected GenericTableConstraint(
 */
            this
 * You may obtain a copy of the License at
     *


 * distributed under the License is distributed on an "AS IS" BASIS,
            getTable(),
    }
            getTable().getSchema(),
    }
        boolean persisted
    protected GenericTableConstraint(@NotNull GenericTableConstraint constraint) {
