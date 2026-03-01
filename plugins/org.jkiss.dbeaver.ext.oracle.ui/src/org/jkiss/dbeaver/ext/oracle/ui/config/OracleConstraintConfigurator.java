 * OracleConstraintConfigurator
    }

            }
/*
import org.jkiss.code.NotNull;
                return null;
 * Unless required by applicable law or agreed to in writing, software
                        constraint,
            constraint.setSearchCondition(editPage.getConstraintExpression());
                        colIndex++));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
                OracleUIMessages.edit_oracle_constraint_manager_dialog_title,
        });
}
    public OracleTableConstraint configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull OracleTableConstraint constraint, @NotNull Map<String, Object> options) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
 * You may obtain a copy of the License at
 * limitations under the License.

import org.jkiss.dbeaver.ext.oracle.model.OracleTableConstraintColumn;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

            EditConstraintPage editPage = new EditConstraintPage(
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
        return UITask.run(() -> {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.oracle.model.OracleTableColumn;
public class OracleConstraintConfigurator implements DBEObjectConfigurator<OracleTableConstraint> {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *
import org.jkiss.code.Nullable;
                        (OracleTableColumn) tableColumn,
 */

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
 * you may not use this file except in compliance with the License.
            if (!editPage.edit()) {
            constraint.setConstraintType(editPage.getConstraintType());
            return constraint;


 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.oracle.model.OracleTableConstraint;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
            }
                    new OracleTableConstraintColumn(
                constraint);

            constraint.setName(editPage.getConstraintName());
import org.jkiss.dbeaver.ui.UITask;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            int colIndex = 1;
                constraint.addColumn(
/**
 */
 *
package org.jkiss.dbeaver.ext.oracle.ui.config;
