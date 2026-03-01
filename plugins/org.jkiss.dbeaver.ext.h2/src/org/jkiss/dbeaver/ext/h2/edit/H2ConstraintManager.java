            if (!CommonUtils.isEmpty(decl)) {

 *     http://www.apache.org/licenses/LICENSE-2.0
                        SQLUtils.quoteString(constraint, CommonUtils.notEmpty(constraint.getDescription()))
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
            }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.h2.model.H2Constraint;
/*
                new SQLDatabasePersistAction("Create check constraint",
import java.util.List;
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        GenericUniqueKey constraint = command.getObject();
                    "COMMENT ON CONSTRAINT " + DBUtils.getFullyQualifiedName(constraint.getDataSource(), container.getName(), constraint.getName()) + " IS " +
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    }
        GenericStructContainer container = constraint.getParentObject().getParentObject();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
        return super.getNestedDeclaration(monitor, owner, command, options);

        GenericUniqueKey constraint = command.getObject();
        }
import org.jkiss.dbeaver.ext.generic.edit.GenericPrimaryKeyManager;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
            );
    }

import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
        GenericUniqueKey key = command.getObject();
    @Override
            appendConstraintDefinition(decl, command);
                ));
        if (container != null && command.getProperties().containsKey(DBConstants.PROP_ID_DESCRIPTION)) {
            actions.add(
 * Unless required by applicable law or agreed to in writing, software
    public StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, GenericTableBase owner, DBECommandAbstract<GenericUniqueKey> command, Map<String, Object> options) {
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

import org.jkiss.dbeaver.model.DBUtils;
}
            actions.add(
                )
            H2Constraint constraint = (H2Constraint) key;
 *
        } else {
import org.jkiss.dbeaver.DBException;
                        " ADD CONSTRAINT " + DBUtils.getFullyQualifiedName(constraint.getDataSource(), container.getName(), constraint.getName()) + " CHECK (" + constraint.getCheckConstraintDefinition() + ") NOCHECK"
        if (!constraint.isPersisted() && constraint.getConstraintType() == DBSEntityConstraintType.CHECK) {
import org.jkiss.dbeaver.model.sql.SQLUtils;

    }
 * DBeaver - Universal Database Manager
 *
public class H2ConstraintManager extends GenericPrimaryKeyManager {
        if (key.getConstraintType() == DBSEntityConstraintType.CHECK && key instanceof H2Constraint && container != null) {
 * limitations under the License.
            decl.append(getAddConstraintTypeClause(constraint));
        GenericStructContainer container = key.getParentObject().getParentObject();
 * See the License for the specific language governing permissions and
                return decl;
import java.util.Map;
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<GenericUniqueKey, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
                    "ALTER TABLE " + constraint.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.h2.edit;
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
 * Licensed under the Apache License, Version 2.0 (the "License");
            StringBuilder decl = new StringBuilder(40);
                new SQLDatabasePersistAction("Alter constraint description",
