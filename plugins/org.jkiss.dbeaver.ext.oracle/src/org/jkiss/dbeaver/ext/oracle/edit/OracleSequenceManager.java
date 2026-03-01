    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        return FEATURE_EDITOR_ON_CREATE;

    }
        Object copyFrom, @NotNull Map<String, Object> options)
import org.jkiss.code.NotNull;
    {
    }
        actionList.add(new SQLDatabasePersistAction("Alter Sequence", sql));
 *
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        return null;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLUtils;
            return "COMMENT ON SEQUENCE " + sequence.getFullyQualifiedName(DBPEvaluationContext.DDL) + " IS " + SQLUtils.quoteString(sequence, sequence.getDescription());
/*
            actionList.add(new SQLDatabasePersistAction("Comment on Sequence", comment));
        if (!CommonUtils.isEmpty(sequence.getDescription())) {
    }
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
    @Override
 */
        }
        if (comment != null) {
    }
        String comment = buildComment(command.getObject());
 * Licensed under the Apache License, Version 2.0 (the "License");
}
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;
        OracleSchema schema = (OracleSchema) container;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        String sql = command.getObject().buildStatement(false);
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.code.Nullable;
        String sql = "DROP SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL);
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

 * limitations under the License.
        if (CommonUtils.isEmpty(command.getObject().getName())) {
            throw new DBException("Sequence name cannot be empty");
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
        String sql = command.getObject().buildStatement(true);

        String comment = buildComment(command.getObject());
import org.jkiss.dbeaver.model.struct.DBSObject;

        }
        }
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
        return object.getSchema().sequenceCache;
import java.util.Map;
    @Override

        DBEPersistAction action = new SQLDatabasePersistAction("Drop Sequence", sql);
import org.jkiss.dbeaver.DBException;
    }
        actions.add(action);
        return new OracleSequence(schema, "NEW_SEQUENCE");
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
    @Nullable
        actions.add(new SQLDatabasePersistAction("Create Sequence", sql));
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.ext.oracle.model.OracleSequence;
import java.util.List;
import org.jkiss.dbeaver.model.DBPDataSource;

 * distributed under the License is distributed on an "AS IS" BASIS,
    protected OracleSequence createDatabaseObject(
package org.jkiss.dbeaver.ext.oracle.edit;

 *
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
public class OracleSequenceManager extends SQLObjectEditor<OracleSequence, OracleSchema> {
    private String buildComment(OracleSequence sequence) {
 *

    @Override

import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
        final Object container,
    public DBSObjectCache<? extends DBSObject, OracleSequence> getObjectsCache(OracleSequence object) {
        if (comment != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            actions.add(new SQLDatabasePersistAction("Comment on Sequence", comment));


    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
