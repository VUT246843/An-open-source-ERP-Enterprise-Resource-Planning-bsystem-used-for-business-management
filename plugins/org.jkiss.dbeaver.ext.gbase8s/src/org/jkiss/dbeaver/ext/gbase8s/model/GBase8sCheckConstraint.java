 * See the License for the specific language governing permissions and
    }
            String expression) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
public class GBase8sCheckConstraint extends GBase8sUniqueKey implements DBSTableCheckConstraint {
 */

    @Property(viewable = true, order = 10)
        this.condition = expression;
    }
/**
    }
    public void setCheckConstraintDefinition(
    @Override
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
 * Unless required by applicable law or agreed to in writing, software
        this.condition = condition;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String condition;
        super(table, name, remarks, constraintType, persisted);
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * limitations under the License.

 */
            DBSEntityConstraintType constraintType, String condition, boolean persisted) {

 * DBeaver - Universal Database Manager
 *
 *
        return condition;


import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
}
/*
 * @author Chao Tian

    public GBase8sCheckConstraint(GenericTableBase table, String name, String remarks,
package org.jkiss.dbeaver.ext.gbase8s.model;
    public String getCheckConstraintDefinition() {

