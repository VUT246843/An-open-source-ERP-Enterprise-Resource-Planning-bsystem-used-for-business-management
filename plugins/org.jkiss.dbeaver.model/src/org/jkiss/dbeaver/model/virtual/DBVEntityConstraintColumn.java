        return constraint.getEntity().getAttribute(new VoidProgressMonitor(), attributeName);
        // In real life entity columns SHOULD be already read so it doesn't matter
        // But I'm afraid that in some very special cases it does. Thant's too bad.
        this.attributeName = attributeName;
 * See the License for the specific language governing permissions and
        return attributeName;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Constraint column
 *

    public DBVEntityConstraintColumn(DBVEntityConstraint constraint, DBVEntityConstraintColumn copy) {
 * DBeaver - Universal Database Manager

    {
    private final DBVEntityConstraint constraint;
 * limitations under the License.
    {
}
 */
    }
        this.constraint = constraint;
 * You may obtain a copy of the License at


import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
    }
 *

import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        this.attributeName = copy.attributeName;
    public DBVEntityConstraintColumn(DBVEntityConstraint constraint, String attributeName)
 *
public class DBVEntityConstraintColumn implements DBSEntityAttributeRef {
    public DBSEntityAttribute getAttribute()
 */
        // Here we use void monitor.

/**
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String attributeName;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.virtual;
        this.constraint = constraint;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
    public String getAttributeName()

