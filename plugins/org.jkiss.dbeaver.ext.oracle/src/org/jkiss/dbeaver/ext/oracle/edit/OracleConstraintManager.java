    @Override

    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/**
    {
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
import org.jkiss.code.Nullable;

    protected OracleTableConstraint createDatabaseObject(
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
 *     http://www.apache.org/licenses/LICENSE-2.0
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
    	OracleTableBase table = constraint.getTable();
                    " "  + (!isView && constraint.getStatus() == OracleObjectStatus.ENABLED ? "ENABLE" : "DISABLE" ) +
import org.jkiss.dbeaver.ext.oracle.model.OracleTableConstraint;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
 * Oracle constraint manager
public class OracleConstraintManager extends SQLConstraintManager<OracleTableConstraint, OracleTableBase> {
    }
                new SQLDatabasePersistAction(
    @Nullable
 *
import org.jkiss.dbeaver.ext.oracle.model.OracleObjectStatus;
    {
import java.util.List;
    @Override
            table,
                    "ALTER " + tableType + " " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) +

        if (command.getObject().getConstraintType() == DBSEntityConstraintType.CHECK) {
 * limitations under the License.
    	OracleTableConstraint constraint = command.getObject();
 * you may not use this file except in compliance with the License.
        } else {
    {
                    (isView ? " NOVALIDATE" : "")
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,

 */
    }
 * DBeaver - Universal Database Manager

}
            OracleObjectStatus.ENABLED);
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
        boolean isView = constraint.getTable().isView();
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        Object from, @NotNull Map<String, Object> options)
            super.appendConstraintDefinition(decl, command);

    @Override
        return "ALTER " + tableType + " " + PATTERN_ITEM_TABLE + " DROP " + clause + " " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
 */
        }
        String tableType = constraint.getTable().isView() ? "VIEW" : "TABLE";
import org.jkiss.dbeaver.model.messages.ModelMessages;
    {
                    ModelMessages.model_jdbc_create_new_constraint,
        actions.add(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected void appendConstraintDefinition(StringBuilder decl, DBECommandAbstract<OracleTableConstraint> command) {
        String clause = "CONSTRAINT"; //$NON-NLS-1$;
            DBSEntityConstraintType.UNIQUE_KEY,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected String getDropConstraintPattern(OracleTableConstraint constraint)
 * Unless required by applicable law or agreed to in writing, software
    @Override

/*
        OracleTableBase table = (OracleTableBase) container;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            null,

                        "\nADD " + getNestedDeclaration(monitor, table, command, options) +
            "",

                	));
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.oracle.edit;
            decl.append(" (").append((command.getObject()).getSearchCondition()).append(")");
        return object.getParentObject().getSchema().constraintCache;
 * You may obtain a copy of the License at

import org.jkiss.code.NotNull;
        return new OracleTableConstraint(
 * See the License for the specific language governing permissions and
import java.util.Map;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    public DBSObjectCache<? extends DBSObject, OracleTableConstraint> getObjectsCache(OracleTableConstraint object)
 *
        String tableType = isView ? "VIEW" : "TABLE";
