public class ClickhouseViewManager extends GenericViewManager {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    protected String getViewType(GenericTableBase object) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        if (viewImpl instanceof GenericView) {
    @Override
    @Override
 * See the License for the specific language governing permissions and
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
    }
        return "TABLE";
        final ClickhouseView view = (ClickhouseView) command.getObject();
    protected void addObjectModifyActions(
            .createTableOrViewImpl(structContainer, tableName, GenericConstants.TABLE_TYPE_VIEW, null);
        @NotNull SQLObjectEditor<GenericTableBase, GenericStructContainer>.ObjectChangeCommand command,
        actionList.add(new SQLDatabasePersistAction("Create view", sql));
import org.jkiss.code.NotNull;
        return viewImpl;

    protected GenericTableBase createDatabaseObject(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseView;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        @NotNull List<DBEPersistAction> actionList,
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
            ((GenericView) viewImpl).setObjectDefinitionText(
import org.jkiss.code.Nullable;
        @NotNull Map<String, Object> options

        @NotNull DBRProgressMonitor monitor,
        }
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;

import org.jkiss.dbeaver.model.edit.DBECommandContext;
        String sql = view.getDDL();
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
}
 */
import org.jkiss.dbeaver.ext.generic.edit.GenericViewManager;
import java.util.List;
        @NotNull DBRProgressMonitor monitor,
        GenericStructContainer structContainer = (GenericStructContainer) container;
        GenericTableBase viewImpl = structContainer.getDataSource().getMetaModel()
        @NotNull Object container,
/**

 * Unless required by applicable law or agreed to in writing, software
                "CREATE OR REPLACE VIEW " + viewImpl.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS SELECT 1 as A\n");
        String tableName = getNewChildName(monitor, structContainer, SQLTableManager.BASE_VIEW_NAME);
        }
 */
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.clickhouse.edit;
        @NotNull DBECommandContext context,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (sql.contains("CREATE") && !sql.contains("CREATE OR REPLACE")) {
        @NotNull DBCExecutionContext executionContext,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericView;
            sql = sql.replaceFirst("CREATE", "CREATE OR REPLACE");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
    @Override
    
    ) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
/*
 * Clickhouse table manager
        @NotNull Map<String, Object> options
        @Nullable Object copyFrom,
    ) {
