import java.util.List;
                    "CREATE MATERIALIZED VIEW " 
        GenericStructContainer structContainer = (GenericStructContainer) container;
        String tableName = getNewChildName(monitor, structContainer, SQLTableManager.BASE_MATERIALIZED_VIEW_NAME);
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        actions.add(
package org.jkiss.dbeaver.ext.altibase.edit;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return SQLTableManager.BASE_MATERIALIZED_VIEW_NAME;
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        return viewImpl;
import org.jkiss.code.NotNull;
import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseMaterializedView;
    }
        }
                            + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL))

                                                    Object container, Object copyFrom, @NotNull Map<String, Object> options) {
        actions.add(new SQLDatabasePersistAction(
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
 * you may not use this file except in compliance with the License.
    }
        );
            new SQLDatabasePersistAction("Drop view", 
 * You may obtain a copy of the License at
 *
                structContainer, tableName,
import org.jkiss.dbeaver.model.DBPDataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                            + viewImpl.getFullyQualifiedName(DBPEvaluationContext.DDL) 
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
                    "DROP " + AltibaseConstants.OBJ_TYPE_MATERIALIZED_VIEW + " " 
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    public boolean canCreateObject(@NotNull Object container) {
        if (viewImpl instanceof AltibaseMaterializedView) {
 *
    protected String getBaseObjectName() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                            + " AS SELECT 1 as A\n");
    }
    
                "Create " + AltibaseConstants.OBJ_TYPE_MATERIALIZED_VIEW.toLowerCase(), view.getDDL()));
 *
    protected String getDropViewType(GenericTableBase table) {

public class AltibaseMaterializedViewManager extends GenericViewManager {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    
                null);
    @Override
    
        return true;
                AltibaseConstants.OBJ_TYPE_MATERIALIZED_VIEW,
    @Override
        return FEATURE_EDITOR_ON_CREATE;
    }
    protected GenericTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
}
 * DBeaver - Universal Database Manager
    

import org.jkiss.dbeaver.ext.generic.edit.GenericViewManager;
 * See the License for the specific language governing permissions and
        GenericTableBase viewImpl = structContainer.getDataSource().getMetaModel().createTableOrViewImpl(
 */
            ((AltibaseMaterializedView) viewImpl).setObjectDefinitionText(
        return AltibaseConstants.OBJ_TYPE_MATERIALIZED_VIEW;
        final AltibaseMaterializedView view = (AltibaseMaterializedView) command.getObject();
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
