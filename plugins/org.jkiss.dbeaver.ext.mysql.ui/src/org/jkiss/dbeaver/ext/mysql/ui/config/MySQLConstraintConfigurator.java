 */
                constraint.setCheckClause(editPage.getConstraintExpression());
            } else {
import java.util.Map;
                constraint.addColumn(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
            }
                                colIndex++));
    public MySQLTableConstraint configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull MySQLTableConstraint constraint, @NotNull Map<String, Object> options) {
        });

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableConstraintColumn;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
}
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * MySQL constraint configurator
 * See the License for the specific language governing permissions and
            constraint.setConstraintType(editPage.getConstraintType());

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableConstraint;

                                constraint,
                        new MySQLTableConstraintColumn(
import org.jkiss.code.Nullable;
 */

import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 * Licensed under the Apache License, Version 2.0 (the "License");
                                (MySQLTableColumn) tableColumn,
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
            constraint.setName(editPage.getConstraintName());
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
            return constraint;
package org.jkiss.dbeaver.ext.mysql.ui.config;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
                constraint);
import org.jkiss.dbeaver.ui.UITask;
 * you may not use this file except in compliance with the License.
            EditConstraintPage editPage = new EditConstraintPage(
 *
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
            if (editPage.getConstraintType() == DBSEntityConstraintType.CHECK && dataSource.supportsCheckConstraints()) {
    }
                return null;
                MySQLUIMessages.edit_constraint_manager_title,
/*
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            int colIndex = 1;

import org.jkiss.dbeaver.ext.mysql.model.MySQLTableColumn;
        MySQLDataSource dataSource = constraint.getDataSource();

        return UITask.run(() -> {

public class MySQLConstraintConfigurator implements DBEObjectConfigurator<MySQLTableConstraint> {
            if (!editPage.edit()) {
                }
 *
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 *
