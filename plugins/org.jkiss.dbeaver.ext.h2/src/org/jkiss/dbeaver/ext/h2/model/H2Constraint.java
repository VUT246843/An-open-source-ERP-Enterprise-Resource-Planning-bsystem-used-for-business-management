        this.description = remarks;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
    private String description;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.meta.Property;
    public void setDescription(String description) {
    private String checkConstraintDefinition;


        super(table, name, remarks, constraintType, persisted);
        this.checkConstraintDefinition = expression;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        this.description = description;
        return checkConstraintDefinition;
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.h2.model;
/*
    @Property(viewable = true, order = 4)
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    @Override
    public void setCheckConstraintDefinition(String expression) {
        this.checkConstraintDefinition = checkExpression;
 *
 *

    public String getDescription() {
 * DBeaver - Universal Database Manager
    public String getCheckConstraintDefinition() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        return description;
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

 */

    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    @Nullable

    @Override
    H2Constraint(GenericTableBase table, String name, @Nullable String remarks, DBSEntityConstraintType constraintType, boolean persisted, @Nullable String checkExpression) {
    @Nullable


    @Override
 * you may not use this file except in compliance with the License.
public class H2Constraint extends GenericUniqueKey implements DBSTableCheckConstraint {
    @Property(viewable = true, editable = true, updatable = true, order = 5)
}
