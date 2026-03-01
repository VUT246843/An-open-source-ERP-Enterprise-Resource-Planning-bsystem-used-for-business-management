 */
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.db2.i.model;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        return checkClause;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

 *
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    DB2IConstraint(GenericTableBase table, String name, @Nullable String remarks, DBSEntityConstraintType constraintType, boolean persisted, @Nullable String checkClause) {
/*
 * DBeaver - Universal Database Manager
        this.checkClause = checkClause;

    public void setCheckConstraintDefinition(String expression) {
    @Override

    private String checkClause;
    @Override
        this.checkClause = expression;
        super(table, name, remarks, constraintType, persisted);
    public String getCheckConstraintDefinition() {


    }
    @Property(viewable = true, order = 4)
 * You may obtain a copy of the License at
 *

import org.jkiss.dbeaver.model.meta.Property;
public class DB2IConstraint extends GenericUniqueKey implements DBSTableCheckConstraint {
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
    }
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
}
