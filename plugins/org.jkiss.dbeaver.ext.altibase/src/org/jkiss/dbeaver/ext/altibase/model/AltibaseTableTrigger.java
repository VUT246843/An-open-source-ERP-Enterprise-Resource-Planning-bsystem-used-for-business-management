
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class AltibaseTableTrigger extends AltibaseTrigger<GenericTableBase> {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 *
        return (AltibaseTable) getParentObject();
/**
 * limitations under the License.
import org.jkiss.dbeaver.model.DBUtils;
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getCatalog(), getTable().getSchema(), this);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull

 * AltibaseTableTrigger
package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;


    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
    @Override
    public AltibaseTable getTable() {
    public AltibaseTableTrigger(GenericTableBase container, String name, String description, JDBCResultSet dbResult) {
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 *
    }
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    @Override
 */
    }
 * DBeaver - Universal Database Manager
        super(container, name, description, dbResult);
 *     http://www.apache.org/licenses/LICENSE-2.0
