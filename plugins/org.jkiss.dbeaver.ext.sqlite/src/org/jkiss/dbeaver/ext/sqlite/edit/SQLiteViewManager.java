import org.jkiss.dbeaver.model.DBConstants;
 */
        super.addObjectModifyActions(monitor, executionContext, actions, command, options);
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.generic.edit.GenericViewManager;
    }
 *
        if (!command.hasProperty(DBConstants.PROP_ID_DESCRIPTION) || command.getProperties().size() > 1) {
            ));
import java.util.Map;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<GenericTableBase, GenericStructContainer>.ObjectChangeCommand command, @NotNull Map<String, Object> options) {
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
}
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.NotNull;


import java.util.List;
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.sqlite.edit;
 * limitations under the License.
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 *     http://www.apache.org/licenses/LICENSE-2.0
                "DROP " + getViewType(command.getObject()) + " " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * See the License for the specific language governing permissions and
public class SQLiteViewManager extends GenericViewManager {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * You may obtain a copy of the License at
                "Drop view",
/*
