import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 *
import org.jkiss.code.Nullable;
    @Override
 */

 *
    @Override
        return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.dbeaver.model.exec.DBCException;
            new SQLDatabasePersistAction(
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.generic.model.GenericObjectContainer;
package org.jkiss.dbeaver.ext.generic.edit;
 * Unless required by applicable law or agreed to in writing, software
public class GenericProcedureManager extends SQLObjectEditor<GenericProcedure, GenericStructContainer> {
        if (metaModel.supportsOverloadedProcedureNames()) {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    @Override
    @Nullable


    @Override
 * you may not use this file except in compliance with the License.
        }
        GenericMetaModel metaModel = object.getDataSource().getMetaModel();
        Object from, @NotNull Map<String, Object> options
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return false;
                procedureName = object.getProcedureSignature(monitor, metaModel.showProcedureParamNames());

 * Generic procedure manager
        return new ListCache<>(((GenericObjectContainer) container).getProcedureCache());
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
                    " " + procedureName)
import org.jkiss.dbeaver.model.DBPDataSource;
                ModelMessages.model_jdbc_drop_table,
 * You may obtain a copy of the License at
    @Override
    }
    ) throws DBException {

import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
        return true;


    @Override
import java.util.Map;
import org.jkiss.code.NotNull;
        } else {
    public DBSObjectCache<? extends DBSObject, GenericProcedure> getObjectsCache(GenericProcedure object) {
import org.jkiss.dbeaver.model.struct.cache.ListCache;
        String procedureName;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBCException {
    }
                "DROP " + object.getProcedureType().name() +  //$NON-NLS-2$
 * See the License for the specific language governing permissions and


import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            procedureName = object.getFullyQualifiedName(DBPEvaluationContext.DDL);
    }
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
}
    protected GenericProcedure createDatabaseObject(
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        );
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.messages.ModelMessages;
        throw new DBCFeatureNotSupportedException();
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            } catch (DBException e) {
        GenericStructContainer container = object.getContainer();
            try {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * limitations under the License.
                log.debug("Can't read procedure/function parameters", e);
        GenericProcedure object = command.getObject();
import org.jkiss.dbeaver.DBException;
    }
/*
    public boolean canDeleteObject(@NotNull GenericProcedure object) {
        throw new DBCFeatureNotSupportedException();
import java.util.List;
import org.jkiss.dbeaver.model.DBPEvaluationContext;

/**
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
 */

 * DBeaver - Universal Database Manager
                procedureName = object.getFullyQualifiedName(DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        actions.add(
    }
