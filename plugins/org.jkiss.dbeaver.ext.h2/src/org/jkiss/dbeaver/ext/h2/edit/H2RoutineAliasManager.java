        super.addObjectModifyActions(monitor, executionContext, actionList, command, options);
import org.jkiss.code.NotNull;
        GenericProcedure object = command.getObject();
    }
}
 * limitations under the License.
        );
import org.jkiss.dbeaver.DBException;
        actions.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * DBeaver - Universal Database Manager
            );
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
import org.jkiss.dbeaver.model.sql.SQLUtils;

 *
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.

    }
            actionList.add(
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    "COMMENT ON ALIAS " + object.getFullyQualifiedName(DBPEvaluationContext.DDL) +
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            new SQLDatabasePersistAction("Drop alias", "DROP ALIAS " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
import java.util.List;
 *
import org.jkiss.dbeaver.model.DBConstants;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
                        " IS " + SQLUtils.quoteString(object, CommonUtils.notEmpty(object.getDescription()))
public class H2RoutineAliasManager extends GenericProcedureManager {
package org.jkiss.dbeaver.ext.h2.edit;

 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                new SQLDatabasePersistAction("Alter routine alias description",
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;
        if (command.getProperties().containsKey(DBConstants.PROP_ID_DESCRIPTION)) {
                )
 *
import org.jkiss.utils.CommonUtils;
    @Override
 * You may obtain a copy of the License at

    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
/*
