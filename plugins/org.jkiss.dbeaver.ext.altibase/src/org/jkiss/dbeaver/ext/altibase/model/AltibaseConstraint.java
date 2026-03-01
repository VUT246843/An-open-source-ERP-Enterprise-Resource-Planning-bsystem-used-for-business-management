    public AltibaseConstraint(
    public String getCheckConstraintDefinition() {
        boolean persisted,
    private boolean validated;

        @Nullable String remarks,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * Unless required by applicable law or agreed to in writing, software
    @Override

        return condition;
package org.jkiss.dbeaver.ext.altibase.model;
    }
            "localunique", "LOCAL UNIQUE", "LOCAL UNIQUE", false, true, true, false);

import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 10)
    ) {
    }
        return validated;
    public boolean isValidated() {
import org.jkiss.dbeaver.model.meta.Property;
 * 
 * Refer to SQL: AltibaseMetaModel.prepareUniqueConstraintsLoadStatement
/*

        @NotNull String name,
        @Nullable String condition,
 * 1: NOT NULL, 2: UNIQUE, 3: PRIMARY KEY, 5: TIMESTAMP, 6: LOCAL UNIQUE, 7: CHECK
public class AltibaseConstraint extends GenericUniqueKey implements DBSTableCheckConstraint {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.condition = expression;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
import org.jkiss.code.Nullable;
        @NotNull GenericTableBase table,

    private String condition;
 * DBeaver - Universal Database Manager
    public static final DBSEntityConstraintType LOCAL_UNIQUE_KEY = new DBSEntityConstraintType(
    public static final DBSEntityConstraintType TIMESTAMP = new DBSEntityConstraintType(
 * limitations under the License.
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 10)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

        @NotNull DBSEntityConstraintType constraintType,
        this.validated = validated;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
 *
 *
 * See the License for the specific language governing permissions and
/*
        boolean validated
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(table, name, remarks, constraintType, persisted);
 * AltibaseConstraint types except "0: FOREIGN KEY".
}
    @Override
    public void setCheckConstraintDefinition(String expression) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            "timestamp", "TIMESTAMP", "TIMESTAMP", false, false, true, false);
 * you may not use this file except in compliance with the License.
        this.condition = condition;
 */

 */
