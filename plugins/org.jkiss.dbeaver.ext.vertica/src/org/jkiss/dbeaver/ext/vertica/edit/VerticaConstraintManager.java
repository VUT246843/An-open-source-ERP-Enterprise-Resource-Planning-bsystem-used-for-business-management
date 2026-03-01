import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                        " ALTER CONSTRAINT " + DBUtils.getQuotedIdentifier(constraint.getDataSource(), constraint.getName()) + " " +
 */
import org.jkiss.dbeaver.model.DBConstants;
/*
 * See the License for the specific language governing permissions and
                new SQLDatabasePersistAction("Alter constraint description",
import java.util.List;
import org.jkiss.dbeaver.DBException;
                    )
 *

 *
package org.jkiss.dbeaver.ext.vertica.edit;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    }
                        (constraint.isEnabled() ? "ENABLED" : "DISABLED")
                        " ON " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " IS " +
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (command.getProperties().containsKey(DBConstants.PROP_ID_ENABLED)) {
import org.jkiss.dbeaver.model.DBUtils;
            );
    @Override
            actionList.add(
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

                    )

import org.jkiss.dbeaver.ext.vertica.model.VerticaConstraint;
            );
public class VerticaConstraintManager extends GenericPrimaryKeyManager {
}
                new SQLDatabasePersistAction("Alter constraint",
        }*/

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
            actionList.add(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        SQLUtils.quoteString(constraint, CommonUtils.notEmpty(constraint.getDescription()))
        /*if (command.getProperties().containsKey(DBConstants.PROP_ID_DESCRIPTION)) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.Map;
                    "ALTER TABLE " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) +
        }

        VerticaConstraint constraint = (VerticaConstraint) command.getObject();
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.generic.edit.GenericPrimaryKeyManager;
 * DBeaver - Universal Database Manager
 *
 * You may obtain a copy of the License at
        super.addObjectModifyActions(monitor, executionContext, actionList, command, options);
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    "COMMENT ON CONSTRAINT " + DBUtils.getQuotedIdentifier(constraint.getDataSource(), constraint.getName()) +
