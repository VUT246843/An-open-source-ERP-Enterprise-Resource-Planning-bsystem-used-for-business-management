        });
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Postgre constraint configurator
 * See the License for the specific language governing permissions and

                            (PostgreAttribute) tableColumn,
                            colIndex++));
/**
                return null;

 * Licensed under the Apache License, Version 2.0 (the "License");
            constraint.setConstraintType(editPage.getConstraintType());
                    constraint.addColumn(
import org.jkiss.code.Nullable;
/*
            if (constraint.getConstraintType().isCustom()) {
import org.jkiss.dbeaver.ui.UITask;
package org.jkiss.dbeaver.ext.postgresql.ui.config;
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableConstraintColumn;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreAttribute;
            } else {
 *
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
 * You may obtain a copy of the License at
 *
    @Override
import java.util.Map;

 * DBeaver - Universal Database Manager
    public PostgreTableConstraint configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreTableConstraint constraint, @NotNull Map<String, Object> options) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

 */
            }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                            constraint,
 */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
                int colIndex = 1;
}

                }
import org.jkiss.code.NotNull;
            EditConstraintPage editPage = new EditConstraintPage(
public class PostgreConstraintConfigurator implements DBEObjectConfigurator<PostgreTableConstraint> {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableConstraint;
                PostgreMessages.edit_constraint_page_add_constraint,
            }
                constraint.setSource(editPage.getConstraintExpression());
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                        new PostgreTableConstraintColumn(
                constraint);
            return constraint;
        return UITask.run(() -> {
 * limitations under the License.
            constraint.setName(editPage.getConstraintName());
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;


            if (!editPage.edit()) {
 *
