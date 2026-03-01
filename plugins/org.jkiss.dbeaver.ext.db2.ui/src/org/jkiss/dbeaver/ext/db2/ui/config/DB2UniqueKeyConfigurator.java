 * limitations under the License.
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
                }
 * you may not use this file except in compliance with the License.
 *
                DB2TableKeyColumn column;
    public DB2TableUniqueKey configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull DB2TableUniqueKey constraint, @NotNull Map<String, Object> options) {
 * DBeaver - Universal Database Manager
import java.util.ArrayList;
                }
import java.util.Map;

    @Override

                    column = new DB2TableKeyColumn(constraint, (DB2TableColumn) tableColumn, colIndex++);
            @Override
                return constraint;
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;

import org.jkiss.dbeaver.ui.UITask;
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!editPage.edit()) {
 */
            {
                EditConstraintPage editPage = new EditConstraintPage(DB2Messages.edit_db2_constraint_manager_dialog_title, constraint);

import java.util.List;
            }
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * Licensed under the Apache License, Version 2.0 (the "License");

                constraint.setConstraintType(editPage.getConstraintType());
                constraint.setAttributeReferences(columns);
import org.jkiss.code.NotNull;

                constraint.setName(editPage.getConstraintName());
 * DB2 unique constraint configurator
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
public class DB2UniqueKeyConfigurator implements DBEObjectConfigurator<DB2TableUniqueKey> {
 * You may obtain a copy of the License at
            protected DB2TableUniqueKey runTask()
import org.jkiss.dbeaver.ext.db2.model.DB2TableKeyColumn;
import org.jkiss.dbeaver.ui.editors.object.struct.EditConstraintPage;
 */
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
}
/*
 *
package org.jkiss.dbeaver.ext.db2.ui.config;
                int colIndex = 1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    return null;

 *
        }.execute();
 * Unless required by applicable law or agreed to in writing, software
	
/**
                    columns.add(column);
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }

import org.jkiss.dbeaver.ext.db2.model.DB2TableUniqueKey;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                List<DB2TableKeyColumn> columns = new ArrayList<>(editPage.getSelectedAttributes().size());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    	return new UITask<DB2TableUniqueKey>() {
