                constraint.setAttributeReferences(constColumns);
 *
import org.jkiss.dbeaver.DBException;
        return new UITask<ExasolTableUniqueKey>() {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 */
                constraint.setEnabled(editPage.isEnableConstraint());
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    protected static final Log log = Log.getLog(ExasolPrimaryKeyConfigurator.class);

                }
    public ExasolTableUniqueKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolTableUniqueKey constraint, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            }
            {
                int ordinalPosition = 0;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableUniqueKey;
                        ExasolMessages.edit_exasol_constraint_manager_dialog_title,

 * Copyright (C) 2010-2024 DBeaver Corp and others
                        col = new ExasolTableKeyColumn(constraint, constraint.getTable().getAttribute(monitor, tableColumn.getName()), ++ordinalPosition);
 * You may obtain a copy of the License at

            @Override
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.exasol.ui.config;
}
    @Override
 * See the License for the specific language governing permissions and
                        constraint);
import java.util.Map;
                List<ExasolTableKeyColumn> constColumns = new ArrayList<ExasolTableKeyColumn>();
                    return null;
                for(DBSEntityAttribute tableColumn  : editPage.getSelectedAttributes())
                EditConstraintPage editPage = new EditConstraintPage(
import org.jkiss.dbeaver.Log;
import java.util.List;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableKeyColumn;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }.execute();
                    try {
                constraint.setConstraintType(editPage.getConstraintType());
                    constColumns.add(col);
                        log.error("Could not find column " + tableColumn.getName() + " in table " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL));
                }
import java.util.ArrayList;
            protected ExasolTableUniqueKey runTask()
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 *
                    ExasolTableKeyColumn col;
                constraint.setName(editPage.getConstraintName());
 * limitations under the License.
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                if (!editPage.edit()) {
                return constraint;
                        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
                {
    }


import org.jkiss.dbeaver.ui.UITask;
                    } catch (DBException e) {
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
import org.jkiss.code.Nullable;
public class ExasolPrimaryKeyConfigurator implements DBEObjectConfigurator<ExasolTableUniqueKey> {
