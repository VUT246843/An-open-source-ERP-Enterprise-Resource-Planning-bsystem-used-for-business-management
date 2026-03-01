    }
    @Override
        createOrReplaceScriptQuery(actions, command.getObject(), false);
            actions.add(
            new SQLDatabasePersistAction("Create Script: ", script.getSql() , true));
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    	}
    private String dropScript(ExasolScript script)

    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.utils.CommonUtils;
 *
            actions.add(new SQLDatabasePersistAction("Comment on Script","COMMENT ON SCRIPT " + 
        actions.add(
    public DBSObjectCache<ExasolSchema, ExasolScript> getObjectsCache(ExasolScript object) {
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    {
    @Override
 * limitations under the License.
    
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    		return "DROP ADAPTER SCRIPT "  + script.getFullyQualifiedName(DBPEvaluationContext.DDL);
    {
    protected ExasolScript createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
    @Override
}
        return newScript;
            throws DBException {
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    }
    private void createOrReplaceScriptQuery(List<DBEPersistAction> actions, ExasolScript script, Boolean replace)
                new SQLDatabasePersistAction("Create Script", dropScript(command.getObject())));
                            SQLUtils.quoteString(command.getObject(), ExasolUtils.quoteString(command.getObject().getDescription()))));

    }

    	{
        return object.getContainer().scriptCache;
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {

        if (CommonUtils.isEmpty(command.getObject().getName()))
 */
        if (replace) { 
    }
    @Override
    }
 
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        if (command.getProperties().size() > 1 || command.getProperty("description") == null )
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
public class ExasolScriptManager extends SQLObjectEditor<ExasolScript, ExasolSchema> {
 *
    	} else {
    @Override
    @Override
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    	if (script.getType().equals("ADAPTER"))
    
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    
        }
        return FEATURE_EDITOR_ON_CREATE;

 *     http://www.apache.org/licenses/LICENSE-2.0
        actions.add(
    

import java.util.List;
    @Override
        {
        newScript.setObjectDefinitionText("CREATE OR REPLACE LUA SCRIPT new_script () RETURNS TABLE AS");
 * See the License for the specific language governing permissions and
    }
package org.jkiss.dbeaver.ext.exasol.manager;
    		return "DROP  SCRIPT "  + script.getFullyQualifiedName(DBPEvaluationContext.DDL);

        actions.add(
 * DBeaver - Universal Database Manager
                                         @NotNull NestedObjectCommand<ExasolScript, PropertyHandler> command, @NotNull Map<String, Object> options)
        ExasolScript newScript =  new ExasolScript((ExasolSchema) container);

    
        {
import java.util.Map;
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
import org.jkiss.dbeaver.ext.exasol.model.ExasolScript;
        if (command.getProperty("description") != null) {
    }
 * You may obtain a copy of the License at
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    
                                                Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
        newScript.setName("new_script");
 *

 * Unless required by applicable law or agreed to in writing, software
                new SQLDatabasePersistAction("Create Script", dropScript(script)));
                            command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL) + " IS " +
    
            throw new DBException("Procedure name cannot be empty");
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * you may not use this file except in compliance with the License.
                new SQLDatabasePersistAction("Create Script", "OPEN SCHEMA " + script.getSchema().getName()));
    }
            createOrReplaceScriptQuery(actionList, command.getObject(),true);
/*
import org.jkiss.dbeaver.model.edit.DBECommandContext;
