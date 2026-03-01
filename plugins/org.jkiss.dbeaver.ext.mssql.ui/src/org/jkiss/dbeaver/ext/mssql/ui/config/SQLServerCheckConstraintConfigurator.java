 * You may obtain a copy of the License at
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
 *
    }
 *
    public SQLServerTableCheckConstraint configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerTableCheckConstraint constraint, @NotNull Map<String, Object> options) {
            editPage.setConstraintTypes(new DBSEntityConstraintType[]{DBSEntityConstraintType.CHECK});
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            if (!editPage.edit()) {
public class SQLServerCheckConstraintConfigurator implements DBEObjectConfigurator<SQLServerTableCheckConstraint> {

 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 */
import org.jkiss.dbeaver.ext.mssql.ui.SQLServerUIMessages;

 * Copyright (C) 2010-2024 DBeaver Corp and others
                return null;
package org.jkiss.dbeaver.ext.mssql.ui.config;

            return constraint;
                SQLServerUIMessages.dialog_create_check_constraint_title,
            constraint.setCheckConstraintDefinition(editPage.getConstraintExpression());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                constraint);
import org.jkiss.dbeaver.ui.UITask;

 */
            EditConstraintPage editPage = new EditConstraintPage(
 * DBeaver - Universal Database Manager
        return UITask.run(() -> {
}
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 * SQL server check constraint manager
    @Override
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableCheckConstraint;
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
        });
 * See the License for the specific language governing permissions and

            }
/*
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
 *
