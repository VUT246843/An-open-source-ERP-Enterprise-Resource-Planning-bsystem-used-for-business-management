import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * DBeaver - Universal Database Manager
    
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 */
    	if (policy.getEnabled())
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    public boolean canCreateObject(@NotNull Object container) {
        );
        extends SQLObjectEditor<ExasolSecurityPolicy, ExasolDataSource>  {
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
    }
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
        return source.getSecurityPolicyCache();
    	
    public DBSObjectCache<ExasolDataSource, ExasolSecurityPolicy> getObjectsCache(
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean canDeleteObject(@NotNull ExasolSecurityPolicy object) {
    		String script = String.format("ALTER SYSTEM SET PASSWORD_SECURITY_POLICY='%s'", policy.getSecurityString());
    
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    {
        ExasolDataSource source = (ExasolDataSource) object.getDataSource();
        ExasolSecurityPolicy obj = command.getObject();

                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    }
    {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
    
    @Override
public class ExasolSecurityPolicyManager
 *
        final ExasolSecurityPolicy con = command.getObject();
    protected ExasolSecurityPolicy createDatabaseObject(
    {


import org.jkiss.dbeaver.model.edit.DBECommandContext;

                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
/*
    
    }
        throws DBException
    	}
        @NotNull DBRProgressMonitor monitor,
    
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        actions.add(
            ExasolSecurityPolicy object)
    
                                          @NotNull ObjectCreateCommand command,
                );
    		actionList.add(new SQLDatabasePersistAction(script));
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
    

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
    
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolSecurityPolicy;
    @Override
            new SQLDatabasePersistAction(
	}
        @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
                                          @NotNull Map<String, Object> options) {
    	return false;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        throw new DBCFeatureNotSupportedException();
    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;
    	{
                new SQLDatabasePersistAction("Drop Connection","DROP CONNECTION " + DBUtils.getQuotedIdentifier(con))
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    }
    	ExasolSecurityPolicy policy = command.getObject();
    }
    }

 * Copyright (C) 2017 Karl Griesser (fullref@gmail.com)
        actions.add(

import java.util.List;
    		String script = String.format("ALTER SYSTEM SET PASSWORD_SECURITY_POLICY='OFF'", policy.getSecurityString());
 * limitations under the License.
    @Override
    
 *

    	return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    	} else {
	protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        return FEATURE_SAVE_IMMEDIATELY;
    @Override
import java.util.Map;

import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
    }
 *
 * you may not use this file except in compliance with the License.
    {
    
                "Rename Connection",
    		actionList.add(new SQLDatabasePersistAction(script));
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))
    {
	@Override
package org.jkiss.dbeaver.ext.exasol.manager;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
}
    
 * Unless required by applicable law or agreed to in writing, software
    	
import org.jkiss.dbeaver.model.DBPDataSource;
                "RENAME CONNECTION " +  DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
    {
