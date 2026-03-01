    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
public class DB2IConstraintManager extends GenericPrimaryKeyManager {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        " ADD CONSTRAINT " + DBUtils.getFullyQualifiedName(constraint.getDataSource(), container.getName(), constraint.getName()) +
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBUtils;

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.db2.i.model.DB2IConstraint;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        GenericUniqueKey key = command.getObject();
import java.util.Map;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.db2.i.edit;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.List;
                new SQLDatabasePersistAction("Create check constraint",
 *

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
import org.jkiss.code.NotNull;

 *
            DB2IConstraint constraint = (DB2IConstraint) key;

 * DBeaver - Universal Database Manager
                    "ALTER TABLE " + constraint.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
        GenericStructContainer container = key.getParentObject().getParentObject();
 *
            actions.add(
        } else {
 * you may not use this file except in compliance with the License.
/*
 */
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        }
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
}
 * You may obtain a copy of the License at
                ));
        if (key.getConstraintType() == DBSEntityConstraintType.CHECK && key instanceof DB2IConstraint && container != null) {
                        " CHECK (" + constraint.getCheckConstraintDefinition() + ")"
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.ext.generic.edit.GenericPrimaryKeyManager;
