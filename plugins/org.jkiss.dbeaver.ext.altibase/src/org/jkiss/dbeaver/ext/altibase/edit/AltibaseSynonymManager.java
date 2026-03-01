
                                                  Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 *
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        DBSObject parentObject = object.getParentObject();
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseSynonym;


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * you may not use this file except in compliance with the License.
import java.util.List;
 * limitations under the License.
    }
} * Unless required by applicable law or agreed to in writing, software
        );
    public boolean canCreateObject(@NotNull Object container) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                "DROP " + object.getSynonymBody())
                "Drop synonym",
    
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSource;
        throw new DBCFeatureNotSupportedException();

    @Override
                                          @NotNull List<DBEPersistAction> actions,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            new SQLDatabasePersistAction(

        return false;
    public boolean canDeleteObject(@NotNull GenericSynonym object) {
        if (parentObject instanceof GenericStructContainer) {
import org.jkiss.code.NotNull;
    }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }
        

        AltibaseSynonym object = (AltibaseSynonym) command.getObject();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
    @Override
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
            return ((GenericStructContainer) parentObject).getSynonymCache();
    public DBSObjectCache<? extends DBSObject, GenericSynonym> getObjectsCache(GenericSynonym object) {
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.altibase.edit;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
    @Override
        actions.add(
public class AltibaseSynonymManager extends SQLObjectEditor<GenericSynonym, GenericStructContainer> {
 *
/*
import java.util.Map;
    @Override
        return null;


import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    protected GenericSynonym createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
        }
        return 0;
                                          @NotNull SQLObjectEditor<GenericSynonym, GenericStructContainer>.ObjectCreateCommand command,
        return true;
 * See the License for the specific language governing permissions and
                                          @NotNull Map<String, Object> options) throws DBException {
 */
 *
