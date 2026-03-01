    @Override
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
                    ExasolUtils.quoteString(con.getUserName()), 
        final ExasolConnection con = command.getObject();
    }
    }
    
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    @Override
                script.append(String.format(" USER '%s' IDENTIFIED BY '%s'",
        }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    {
                	String.format("COMMENT ON CONNECTION %s is '%s'",
import java.util.Map;
                "Rename Connection",
            StringBuilder script = new StringBuilder(String.format("ALTER CONNECTION %s TO",DBUtils.getQuotedIdentifier(con)));
    
                );
    
    }
        Map<Object, Object> com = command.getProperties();
       
        processObjectRename(commandContext, object, options, newName);
       
            // possible loss of information - warn
                    );
                new SQLDatabasePersistAction("Create Connection", script.toString())
        {
 * you may not use this file except in compliance with the License.
    
        
 * You may obtain a copy of the License at
                    getCommentCommand(con)
 *
/*
 * DBeaver - Universal Database Manager
    {
        extends SQLObjectEditor<ExasolConnection, ExasolDataSource> implements DBEObjectRenamer<ExasolConnection> {
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
    public DBSObjectCache<ExasolDataSource, ExasolConnection> getObjectsCache(
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    
        script.append(" '" + ExasolUtils.quoteString(con.getConnectionString()) + "' ");
import org.jkiss.dbeaver.ext.exasol.model.ExasolConnection;
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
        return new ExasolConnection((ExasolDataSource) container, null, null, null, null, null);
    public void renameObject(@NotNull DBECommandContext commandContext,
        actions.add(
import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
    
import org.jkiss.dbeaver.DBException;
    }
    	                DBUtils.getQuotedIdentifier(con),
        ExasolConnection obj = command.getObject();
    private SQLDatabasePersistAction getCommentCommand(ExasolConnection con)
        }
    }
        
                                                    @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {
    protected ExasolConnection createDatabaseObject(@NotNull DBRProgressMonitor monitor,
        return FEATURE_SAVE_IMMEDIATELY;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    	return new SQLDatabasePersistAction(
 * Copyright (C) 2017 Karl Griesser (fullref@gmail.com)

package org.jkiss.dbeaver.ext.exasol.manager;
                    ExasolUtils.quoteString(con.getPassword())
                new SQLDatabasePersistAction("Drop Connection","DROP CONNECTION " + DBUtils.getQuotedIdentifier(con))
    }
        ExasolConnection con = command.getObject();
}
        
        StringBuilder script = new StringBuilder(String.format("CREATE CONNECTION %s TO ",DBUtils.getQuotedIdentifier(con)));
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.DBUtils;

    	            )                
                    new SQLDatabasePersistAction("alter Connection", script.toString())
        final ExasolConnection con = command.getObject();
                                          @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
        }
                    );
 * distributed under the License is distributed on an "AS IS" BASIS,
    {

                                )
                        ExasolUtils.quoteString(con.getPassword())

    
        actions.add(
    }
        actions.add(
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
 */
    }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        
 * See the License for the specific language governing permissions and
                        ExasolUtils.quoteString(con.getUserName()), 
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            if (! (con.getUserName().isEmpty() | con.getPassword().isEmpty()))

    {
        );
            new SQLDatabasePersistAction(
    

            actions.add(getCommentCommand(con));
public class ExasolConnectionManager
        if (! con.getDescription().isEmpty())
    
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    
 *
                );
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
            }
        // url, username or password have changed
        
        {
 * limitations under the License.
    @Override
        {
 *     http://www.apache.org/licenses/LICENSE-2.0
        
        
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        ExasolDataSource source = object.getDataSource();
    
        if (com.containsKey("description"))
    
        return source.getConnectionCache();
    }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
        if (! (con.getUserName().isEmpty() | con.getPassword().isEmpty()))
            {
                    );
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
                "RENAME CONNECTION " +  DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getOldName()) + " to " +
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
                	"Comment on Connection",
            ExasolConnection object)
    {
            actionList.add(
                            )
    	                ExasolUtils.quoteString(con.getDescription())
            script.append(String.format("USER '%s' IDENTIFIED BY '%s'",
                    DBUtils.getQuotedIdentifier(obj.getDataSource(), command.getNewName()))

        }
            actionList.add(
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                             @NotNull ExasolConnection object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException
            script.append(" '" + ExasolUtils.quoteString(con.getConnectionString()) + "' ");
    {
    @Override
        {
import java.util.List;
        if (com.containsKey("url") | com.containsKey("userName") | com.containsKey("password") )

                );
                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
            
                        );
