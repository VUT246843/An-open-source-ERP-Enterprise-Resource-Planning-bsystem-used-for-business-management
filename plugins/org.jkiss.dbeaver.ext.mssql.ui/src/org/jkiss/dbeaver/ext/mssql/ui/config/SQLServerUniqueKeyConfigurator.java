            return primaryKey;
 * Licensed under the Apache License, Version 2.0 (the "License");
                primaryKey);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            int colIndex = 1;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableUniqueKeyColumn;
public class SQLServerUniqueKeyConfigurator implements DBEObjectConfigurator<SQLServerTableUniqueKey> {
 */
 * See the License for the specific language governing permissions and
                        (SQLServerTableColumn) tableColumn,
 * limitations under the License.
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
                        primaryKey,
            }
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
                "Create constraint",
            primaryKey.setConstraintType(editPage.getConstraintType());
    public SQLServerTableUniqueKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull SQLServerTableUniqueKey primaryKey, @NotNull Map<String, Object> options) {
/*
    @Override
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableUniqueKey;

package org.jkiss.dbeaver.ext.mssql.ui.config;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
            primaryKey.setName(editPage.getConstraintName());
/**
        return UITask.run(() -> {
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
                primaryKey.addColumn(
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableColumn;

}

 * SQL server unique constraint configurator
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

 *
            EditConstraintPage editPage = new EditConstraintPage(
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    new SQLServerTableUniqueKeyColumn(
                return null;
            if (!editPage.edit()) {

 * You may obtain a copy of the License at
import java.util.Map;
import org.jkiss.dbeaver.ui.UITask;
        });
                        colIndex++));
 * you may not use this file except in compliance with the License.
