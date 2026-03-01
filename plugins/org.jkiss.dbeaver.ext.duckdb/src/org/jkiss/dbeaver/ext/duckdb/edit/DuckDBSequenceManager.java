
    }
        return sequence;
public class DuckDBSequenceManager extends GenericSequenceManager {
        DuckDBSequence sequence = new DuckDBSequence(structContainer, getBaseObjectName().toLowerCase(Locale.ROOT));
    }
import org.jkiss.dbeaver.ext.duckdb.model.DuckDBSequence;
        // TODO: We need to add treeInjection in the plugin.xml to work with this
    public boolean canCreateObject(@NotNull Object container) {
import java.util.Locale;
        GenericStructContainer structContainer = (GenericStructContainer) container;
 *
        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectCreateCommand command,
        actions.add(new SQLDatabasePersistAction("Create sequence", sequence.getObjectDefinitionText(monitor, options)));
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.generic.edit.GenericSequenceManager;
        //return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
package org.jkiss.dbeaver.ext.duckdb.edit;

import java.util.List;
}
 * You may obtain a copy of the License at
 *
 *
        @NotNull DBECommandContext context,
 * distributed under the License is distributed on an "AS IS" BASIS,
        DuckDBSequence sequence = (DuckDBSequence) command.getObject();
 * limitations under the License.

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        return false;

    @Override
    @Override
 * See the License for the specific language governing permissions and
        @NotNull DBCExecutionContext executionContext,
        @NotNull List<DBEPersistAction> actions,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * DBeaver - Universal Database Manager
/*
        Object container,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
        @NotNull Map<String, Object> options
import java.util.Map;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        Object copyFrom,
 * Unless required by applicable law or agreed to in writing, software
    protected GenericSequence createDatabaseObject(
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectCreateActions(
        setNewObjectName(monitor, structContainer, sequence);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    ) {
        @NotNull DBRProgressMonitor monitor,
    ) {

        @NotNull Map<String, Object> options
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        @NotNull DBRProgressMonitor monitor,
