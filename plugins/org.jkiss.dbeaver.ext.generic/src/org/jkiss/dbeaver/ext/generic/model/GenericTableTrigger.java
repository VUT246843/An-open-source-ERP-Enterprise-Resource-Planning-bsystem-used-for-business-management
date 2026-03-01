    @Property(viewable = true, order = 4)


}
import org.jkiss.dbeaver.model.meta.Property;
 *
package org.jkiss.dbeaver.ext.generic.model;
 * DBeaver - Universal Database Manager
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    public GenericTableBase getTable() {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 * you may not use this file except in compliance with the License.
    public GenericTableTrigger(@NotNull GenericTableBase container, String name, String description) {
 * Unless required by applicable law or agreed to in writing, software
    @Override

    @Override
 *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class GenericTableTrigger extends GenericTrigger<GenericTableBase> {
import org.jkiss.dbeaver.model.DBUtils;
 * You may obtain a copy of the License at
    }
        super(container, name, description);

 * See the License for the specific language governing permissions and
 * limitations under the License.
import org.jkiss.code.NotNull;
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getCatalog(), getTable().getSchema(), this);

        return getParentObject();
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
