 * Copyright (C) 2010-2024 DBeaver Corp and others



 *
        this.checkConstraintDefinition = expression;
public class VerticaConstraint extends GenericUniqueKey implements DBSTableCheckConstraint {

    @Override
}
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
    }
 * DBeaver - Universal Database Manager
    public boolean isEnabled() {

    public void setCheckConstraintDefinition(String expression) {
import org.jkiss.code.Nullable;
        this.checkConstraintDefinition = checkExpression;
    @Property(viewable = true, order = 4)
        return isEnabled;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    }
 *
        this.isEnabled = isEnabled;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        isEnabled = enabled;
 * You may obtain a copy of the License at
 */
    }
    private boolean isEnabled;
        return checkConstraintDefinition;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public VerticaConstraint(GenericTableBase table, String name, @Nullable String remarks, DBSEntityConstraintType constraintType, boolean persisted, @Nullable String checkExpression, boolean isEnabled) {
    public void setEnabled(boolean enabled) {
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;

/*
 * limitations under the License.
    private String checkConstraintDefinition;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;

    @Property(viewable = true, editable = true, updatable = true, order = 6)
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
    public String getCheckConstraintDefinition() {
        super(table, name, remarks, constraintType, persisted);
package org.jkiss.dbeaver.ext.vertica.model;

