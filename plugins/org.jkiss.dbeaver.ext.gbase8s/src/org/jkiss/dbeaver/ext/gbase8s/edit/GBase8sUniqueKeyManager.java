    @Override
    }
 */
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;

            String createSql = "ALTER TABLE %s ADD CONSTRAINT CHECK (%s) CONSTRAINT %s".formatted(
        // Legacy Syntax for CHECK Constraints
        } else {
 * you may not use this file except in compliance with the License.
 *

import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
 * limitations under the License.
            @NotNull DBCExecutionContext executionContext,
 *     http://www.apache.org/licenses/LICENSE-2.0
        GenericUniqueKey key = command.getObject();
            @NotNull DBRProgressMonitor monitor,
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
/*
/**

import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
import org.jkiss.dbeaver.ext.generic.edit.GenericPrimaryKeyManager;
        if (key.getConstraintType() == DBSEntityConstraintType.CHECK && (key instanceof DBSTableCheckConstraint check)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
            actions.add(new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_constraint, createSql));
 * @author Chao Tian
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

                    check.getCheckConstraintDefinition(), DBUtils.getQuotedIdentifier(key));
    protected boolean isShortNotation(GenericTableBase owner) {
    @Override
        }
import java.util.Map;

import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }
            @NotNull ObjectCreateCommand command,
package org.jkiss.dbeaver.ext.gbase8s.edit;
import org.jkiss.dbeaver.ext.gbase8s.GBase8sUtils;
}
public class GBase8sUniqueKeyManager extends GenericPrimaryKeyManager {
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
 *
 *
    protected void addObjectCreateActions(
                    key.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL),
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Unless required by applicable law or agreed to in writing, software
        return false;
            @NotNull Map<String, Object> options) {
        return GBase8sUtils.isOracleSqlMode(owner.getContainer().getDataSource().getContainer()) ? false : true;
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.util.List;
            @NotNull List<DBEPersistAction> actions,
                && !GBase8sUtils.isOracleSqlMode(executionContext.getDataSource().getContainer())) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected boolean isLegacyConstraintsSyntax(GenericTableBase owner) {
