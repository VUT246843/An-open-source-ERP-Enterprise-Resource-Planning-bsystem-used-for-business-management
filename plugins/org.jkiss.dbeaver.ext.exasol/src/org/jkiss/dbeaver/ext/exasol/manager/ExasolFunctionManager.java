    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.code.NotNull;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
 */
 *
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        newScript.setName("function_name");
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager

                new SQLDatabasePersistAction("Create Script", "OPEN SCHEMA " + script.getSchema().getName()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        if (command.getProperty("description") != null) {
            createOrReplaceScriptQuery(actionList, command.getObject(),true);
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        actions.add(
    }
        }
 * You may obtain a copy of the License at
    }
    }
    protected ExasolFunction createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
        return newScript;
                            SQLUtils.quoteString(command.getObject(), ExasolUtils.quoteString(command.getObject().getDescription()))));
            actions.add(
                            command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL) + " IS " +
    @Override
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
    
    public DBSObjectCache<ExasolSchema, ExasolFunction> getObjectsCache(ExasolFunction object) {

import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *
    {
 * Unless required by applicable law or agreed to in writing, software
        }
    {
        {


    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
        newScript.setObjectDefinitionText("FUNCTION function_name() RETURNS INTEGER");
            actions.add(new SQLDatabasePersistAction("Comment on Script","COMMENT ON FUNCTION " + 
 *     http://www.apache.org/licenses/LICENSE-2.0

                new SQLDatabasePersistAction("Create Script", "CREATE " + script.getSql()));
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
    }
/*
import java.util.Map;
        if (replace) { 
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    @Override
    @Override
        if (CommonUtils.isEmpty(command.getObject().getName()))
    }
    {
    
        ExasolFunction newScript =  new ExasolFunction((ExasolSchema) container);
        actions.add(
        } else {

                                                  Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                                         @NotNull NestedObjectCommand<ExasolFunction, PropertyHandler> command, @NotNull Map<String, Object> options)
    private void createOrReplaceScriptQuery(List<DBEPersistAction> actions, ExasolFunction script, Boolean replace)
                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    @Override
import org.jkiss.dbeaver.ext.exasol.model.ExasolFunction;
    @Override
        }

                new SQLDatabasePersistAction("Create Script", "CREATE OR REPLACE " + script.getSql()));
import java.util.List;
    @Override
 * you may not use this file except in compliance with the License.
} * limitations under the License.
        return FEATURE_EDITOR_ON_CREATE;
    @Override
    

    @Override
        }
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
    
    }
        actions.add(
import org.jkiss.dbeaver.model.DBPDataSource;
        if (command.getProperties().size() > 1 || command.getProperty("description") == null )
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    }
        createOrReplaceScriptQuery(actions, command.getObject(), false);
public class ExasolFunctionManager extends SQLObjectEditor<ExasolFunction, ExasolSchema> {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                new SQLDatabasePersistAction("Create Script", "DROP FUNCTION " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)));
    }
            throw new DBException("Function name cannot be empty");
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *
        {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.exasol.manager;
        return object.getContainer().functionCache;
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
            throws DBException {
