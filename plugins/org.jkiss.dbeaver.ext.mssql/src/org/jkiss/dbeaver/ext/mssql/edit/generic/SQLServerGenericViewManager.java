import org.jkiss.dbeaver.ext.generic.edit.GenericViewManager;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

    protected void addObjectModifyActions(

        @NotNull Map<String, Object> options
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    @Override
        @NotNull List<DBEPersistAction> actionList,
    ) {
import org.jkiss.code.NotNull;
        @NotNull SQLObjectEditor<GenericTableBase, GenericStructContainer>.ObjectChangeCommand command,
 *
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

        @NotNull DBCExecutionContext executionContext,
 * DBeaver - Universal Database Manager
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

 * limitations under the License.
            SQLServerUtils.changeCreateToCreateOrReplace(command.getObject().getDDL())));
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
        actionList.add(new SQLDatabasePersistAction(
}
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import java.util.Map;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
            "Create view",
package org.jkiss.dbeaver.ext.mssql.edit.generic;
public class SQLServerGenericViewManager extends GenericViewManager {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
