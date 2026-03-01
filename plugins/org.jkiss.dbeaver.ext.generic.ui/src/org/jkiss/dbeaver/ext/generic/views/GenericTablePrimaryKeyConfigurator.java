 * See the License for the specific language governing permissions and
 *
                }
        }.execute();
        return new UITask<GenericUniqueKey>() {
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
                primaryKey.setConstraintType(editPage.getConstraintType());
    @Override
import org.jkiss.code.Nullable;
                    "Create unique constraint",
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericTableConstraintColumn;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.edit.DBECommandContext;
package org.jkiss.dbeaver.ext.generic.views;
                    primaryKey.addColumn(
                            colIndex++));
            protected GenericUniqueKey runTask() {
 * Generic table primary key configurator
 * you may not use this file except in compliance with the License.
                EditConstraintPage editPage = new EditConstraintPage(


import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
    }
                int colIndex = 1;
 */

                }
}
                primaryKey.setName(editPage.getConstraintName());
                    ((DBSTableCheckConstraint)primaryKey).setCheckConstraintDefinition(editPage.getConstraintExpression());
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
 * limitations under the License.
                            primaryKey,
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
                    primaryKey);
 *
            @Override

                return primaryKey;
import java.util.Map;
/*
import org.jkiss.dbeaver.ui.UITask;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
                            (GenericTableColumn) tableColumn,
                        new GenericTableConstraintColumn(
            }
 */
    public GenericUniqueKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull GenericUniqueKey primaryKey, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    return null;
public class GenericTablePrimaryKeyConfigurator implements DBEObjectConfigurator<GenericUniqueKey> {
                if (!editPage.edit()) {
 * You may obtain a copy of the License at
                if (primaryKey instanceof DBSTableCheckConstraint) {
import org.jkiss.code.NotNull;
/**
