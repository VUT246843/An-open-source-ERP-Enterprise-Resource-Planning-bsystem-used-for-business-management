}
import org.jkiss.code.NotNull;
    @Override
 * you may not use this file except in compliance with the License.
    public DBSTable getTable() {
public class FireBirdDatabaseTrigger extends FireBirdTrigger<GenericStructContainer> {
    public FireBirdDatabaseTrigger(GenericStructContainer container, String name, String description, FireBirdTriggerType type, int sequence, boolean isSystem) {
package org.jkiss.dbeaver.ext.firebird.model;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        super(container, name, description, type, sequence, isSystem);
 *
 * DBeaver - Universal Database Manager

 *
    }
 * Unless required by applicable law or agreed to in writing, software
        return null;
 */
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    @NotNull
 *
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
import org.jkiss.dbeaver.model.DBUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others

        return DBUtils.getFullQualifiedName(getDataSource(), this);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

/*
    }
