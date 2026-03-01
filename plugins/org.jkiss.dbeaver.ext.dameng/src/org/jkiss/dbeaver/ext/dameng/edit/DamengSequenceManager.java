 */
import java.util.List;
        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectChangeCommand command,
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectCreateCommand command,
        @NotNull DBRProgressMonitor monitor,
    ) {
 */
        @NotNull DBRProgressMonitor monitor,
        Object copyFrom,
import java.util.Map;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
}
        GenericStructContainer structContainer = (GenericStructContainer) container;
        setNewObjectName(monitor, schema, sequence);
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected void addObjectModifyActions(
        @NotNull List<DBEPersistAction> actionList,
    @Override
        @NotNull DBRProgressMonitor monitor,
        Object container,
        DamengSchema schema = (DamengSchema) structContainer.getSchema();
 * Unless required by applicable law or agreed to in writing, software
    }
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        actionList.add(new SQLDatabasePersistAction("Alter Sequence", sequence.buildStatement(true)));
 * limitations under the License.
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        @NotNull DBECommandContext context,
    @Override

 * You may obtain a copy of the License at
        DamengSequence sequence = (DamengSequence) command.getObject();
package org.jkiss.dbeaver.ext.dameng.edit;

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull Map<String, Object> options
public class DamengSequenceManager extends GenericSequenceManager {
        DamengSequence sequence = (DamengSequence) command.getObject();
        DamengSequence sequence = new DamengSequence((GenericStructContainer) container, getBaseObjectName());

import org.jkiss.dbeaver.ext.dameng.model.DamengSchema;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    }


        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * you may not use this file except in compliance with the License.
        @NotNull DBCExecutionContext executionContext,
 * @author Shengkai Bai
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull Map<String, Object> options
        return FEATURE_EDITOR_ON_CREATE;
    protected void addObjectCreateActions(
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.model.rm.RMConstants;
    @Override
    @Override
import org.jkiss.dbeaver.ext.dameng.model.DamengSequence;

        @NotNull DBCExecutionContext executionContext,
/*

import org.jkiss.dbeaver.ext.generic.edit.GenericSequenceManager;
/**
    ) {
        actions.add(new SQLDatabasePersistAction("Create sequence", sequence.buildStatement(false)));

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public boolean canCreateObject(@NotNull Object container) {
    ) {
 *
        return sequence;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    protected DamengSequence createDatabaseObject(

