            }
    protected void addObjectRenameActions(
        GenericStructContainer structContainer = (GenericStructContainer) container;
    protected void addObjectModifyActions(
    ) {
            } else {
        @NotNull DBRProgressMonitor monitor,
            new SQLDatabasePersistAction(
        Object copyFrom,
        if (options.containsKey("cacheCount")) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        return sequence;
        if (options.containsKey("minValue")) {
    protected void addObjectCreateActions(
        VerticaSequence sequence = new VerticaSequence(structContainer, getBaseObjectName().toLowerCase(Locale.ROOT));
        @NotNull Map<String, Object> options
        processObjectRename(commandContext, object, options, newName);
public class VerticaSequenceManager extends GenericSequenceManager implements DBEObjectRenamer<GenericSequence> {
            if (!CommonUtils.toBoolean(options.get("cycle"))) {
            ));
                "ALTER SEQUENCE " + sequence.getFullyQualifiedName(DBPEvaluationContext.DDL) + sequenceOptions
        @NotNull Map<String, Object> options
    @Override
        @NotNull List<DBEPersistAction> actionList,
import org.jkiss.dbeaver.model.rm.RMConstants;
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
        }
        actions.add(
import org.jkiss.dbeaver.ext.vertica.model.VerticaSchema;
            ddl.append("\n\tMINVALUE ").append(options.get("minValue"));
        VerticaSchema schema = (VerticaSchema) structContainer.getSchema();
 *
                    " RENAME TO " + DBUtils.getQuotedIdentifier(sequence.getDataSource(), command.getNewName())) //$NON-NLS-1$
        @NotNull DBRProgressMonitor monitor,
        final StringBuilder sequenceOptions = new StringBuilder();
                ddl.append("NO ");
        if (options.containsKey("incrementBy")) {
 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean canCreateObject(@NotNull Object container) {

            actionList.add(new SQLDatabasePersistAction(
        }
        @NotNull DBRProgressMonitor monitor,
        if (options.containsKey("maxValue")) {
    }
    ) {
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override

            }
                "Rename sequence",
    protected GenericSequence createDatabaseObject(
    @Override
        @NotNull DBRProgressMonitor monitor,
        GenericSequence sequence = command.getObject();
        setNewObjectName(monitor, schema, sequence);
package org.jkiss.dbeaver.ext.vertica.edit;
import org.jkiss.code.NotNull;
        addSequenceOptions(sequence, sequenceOptions, command.getProperties());
        @NotNull List<DBEPersistAction> actions,
                "ALTER SEQUENCE " + sequence.getFullyQualifiedName(DBPEvaluationContext.DDL) + //$NON-NLS-1$
            if (!sequence.isPersisted()) {
import org.jkiss.dbeaver.ext.generic.edit.GenericSequenceManager;
        }
    ) {
 * You may obtain a copy of the License at
        GenericSequence sequence = command.getObject();
        ));

 * Unless required by applicable law or agreed to in writing, software
    }
                ddl.append("\n\tSTART WITH ").append(options.get("lastValue"));
                "Alter sequence",
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        if (options.containsKey("cycle")) {
        GenericSequence sequence = command.getObject();
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
            ddl.append("\n\tCACHE ").append(options.get("cacheCount"));
        );
        @NotNull DBCExecutionContext executionContext,
        sequenceOptions.append("CREATE SEQUENCE ").append(sequence.getFullyQualifiedName(DBPEvaluationContext.DDL));
        }
}
import java.util.List;
 *
                ddl.append("\n\tRESTART WITH ").append(options.get("lastValue"));
            ddl.append("CYCLE");
        Object container,
import java.util.Locale;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull DBECommandContext context,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
            ddl.append("\n\tINCREMENT BY ").append(options.get("incrementBy"));

    @Override
        }
        }
import org.jkiss.dbeaver.model.DBUtils;
/*
            sequenceOptions.toString()
import java.util.Map;
        @NotNull ObjectRenameCommand command,
        addSequenceOptions(sequence, sequenceOptions, command.getProperties());
            ddl.append("\n\tMAXVALUE ").append(options.get("maxValue"));
        @NotNull DBCExecutionContext executionContext,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
 */
        @NotNull Map<String, Object> options
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull GenericSequence object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    private void addSequenceOptions(GenericSequence sequence, StringBuilder ddl, Map<Object, Object> options) {
 * you may not use this file except in compliance with the License.
    }
        @NotNull Map<String, Object> options
        @NotNull ObjectCreateCommand command,
            "Create sequence",
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.vertica.model.VerticaSequence;
        @NotNull ObjectChangeCommand command,
    }


        return FEATURE_EDITOR_ON_CREATE;

    @Override
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.DBException;
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        final StringBuilder sequenceOptions = new StringBuilder();
        @NotNull DBCExecutionContext executionContext,
            ddl.append("\n\t");
 * DBeaver - Universal Database Manager
 *
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        if (options.containsKey("lastValue")) {

    @Override

        if (!sequenceOptions.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
