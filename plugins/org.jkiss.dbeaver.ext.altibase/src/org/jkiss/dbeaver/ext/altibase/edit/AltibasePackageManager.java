    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return null;
public class AltibasePackageManager extends SQLObjectEditor<GenericPackage, GenericStructContainer> {
                "Drop package",

    
 */


import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 * See the License for the specific language governing permissions and
        
    
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import java.util.Map;
import java.util.List;
    }
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public boolean canDeleteObject(@NotNull GenericPackage object) {
        throw new DBCFeatureNotSupportedException();
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.ext.generic.model.GenericPackage;
    public boolean canCreateObject(@NotNull Object container) {
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
    }
                "DROP PACKAGE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL))
    protected GenericPackage createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
    @Override
                                          @NotNull Map<String, Object> options) throws DBException {

import org.jkiss.dbeaver.DBException;

import org.jkiss.code.NotNull;
    public DBSObjectCache<? extends DBSObject, GenericPackage> getObjectsCache(GenericPackage object) {
        return true;
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.altibase.edit;
        return 0;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *     http://www.apache.org/licenses/LICENSE-2.0
                                          @NotNull SQLObjectEditor<GenericPackage, GenericStructContainer>.ObjectCreateCommand command,

    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

    }
    @Override
 * Unless required by applicable law or agreed to in writing, software

                                          @NotNull List<DBEPersistAction> actions,
        return false;
        );
    }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
    @Override
        actions.add(
 *
                                                  Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
/*
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
