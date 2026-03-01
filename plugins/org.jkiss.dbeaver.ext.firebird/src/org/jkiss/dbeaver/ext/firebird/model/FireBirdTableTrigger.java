    }
package org.jkiss.dbeaver.ext.firebird.model;
    @Property(viewable = true, order = 4)
import org.jkiss.dbeaver.model.DBUtils;
public class FireBirdTableTrigger extends FireBirdTrigger<GenericTableBase> implements DBPSystemObject {

 * you may not use this file except in compliance with the License.


    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPSystemObject;
    @Override
 * limitations under the License.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others

        super(container, name, description, type, sequence, isSystem);
    }
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        return DBUtils.getFullQualifiedName(getDataSource(), this);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    public FireBirdTableTrigger(GenericTableBase container, String name, String description, FireBirdTriggerType type, int sequence, boolean isSystem) {

    @Override
import org.jkiss.dbeaver.model.meta.Property;
/*
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
    public DBSTable getTable() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return (DBSTable) getParentObject();
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 */
import org.jkiss.code.NotNull;
