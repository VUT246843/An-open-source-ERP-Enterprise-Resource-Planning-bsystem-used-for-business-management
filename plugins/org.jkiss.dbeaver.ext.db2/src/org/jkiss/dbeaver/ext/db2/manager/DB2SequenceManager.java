import org.jkiss.dbeaver.DBException;
        return new DB2Sequence(schema, "NEW_SEQUENCE");
        }
    @Override
        return FEATURE_EDITOR_ON_CREATE;
                sb.append("START WITH ").append(sequence.getStart()).append(SPACE);
            actionList.add(new SQLDatabasePersistAction("Comment on Sequence", comment));
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
        }

    }
    {

import org.jkiss.dbeaver.model.struct.DBSObject;
/**
 */
 *
    @Override
        DBEPersistAction action = new SQLDatabasePersistAction("Drop Sequence", sql);
    private static final String SQL_COMMENT = "COMMENT ON SEQUENCE %s IS '%s'";
            sb.append("CACHE ").append(sequence.getCache()).append(SPACE);
            sb.append("AS ");
            sb.append("MINVALUE ").append(sequence.getMinValue()).append(SPACE);

        }
            actions.add(new SQLDatabasePersistAction("Comment on Sequence", comment));
 *
        sb.append(sequence.getFullyQualifiedName(DBPEvaluationContext.DDL)).append(SPACE);
 * See the License for the specific language governing permissions and
    {

        return sb.toString();
        actionList.add(new SQLDatabasePersistAction("Alter Sequence", sql));
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * DB2 Sequence Manager

        actions.add(action);
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
        String sql = buildStatement(command.getObject(), true);
            } else {
package org.jkiss.dbeaver.ext.db2.manager;
    {

    }
        if (sequence.getStart() != null) {
    // -------
import java.util.List;
    {
        DB2Schema schema = (DB2Schema) container;
        if (sequence.getIncrementBy() != null) {
import org.jkiss.code.Nullable;
        }
    }
        } else {
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
 * @author Denis Forveille


            sb.append("CYCLE ").append(SPACE);

            sb.append("MAXVALUE ").append(sequence.getMaxValue()).append(SPACE);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                sb.append("RESTART WITH ").append(sequence.getStart()).append(SPACE);
        }
 *
    private static final String SPACE = "\n   ";
 * you may not use this file except in compliance with the License.
    {

        if ((sequence.getDescription() != null) && (sequence.getDescription().length() > 0)) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        } else {
        if (comment != null) {

 * DBeaver - Universal Database Manager
            sb.append("NO CYCLE ").append(SPACE);
        if (CommonUtils.isEmpty(command.getObject().getName())) {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
 *
        String sql = String.format(SQL_DROP, command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL));
        }

        if (sequence.getOrder()) {

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.db2.model.DB2Sequence;
    }
        StringBuilder sb = new StringBuilder(256);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        String comment = buildComment(command.getObject());
    }
 * limitations under the License.
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * You may obtain a copy of the License at
            return String.format(SQL_COMMENT, sequence.getFullyQualifiedName(DBPEvaluationContext.DDL), sequence.getDescription());
    }

    {
}
        if (!(forUpdate)) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    {
            sb.append("NO CACHE ").append(SPACE);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * Unless required by applicable law or agreed to in writing, software
    }
        actions.add(new SQLDatabasePersistAction("Create Sequence", sql));
        } else {
    protected DB2Sequence createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
        String comment = buildComment(command.getObject());
public class DB2SequenceManager extends SQLObjectEditor<DB2Sequence, DB2Schema> {
        }
        if (sequence.getMaxValue() != null) {
    @Override
            sb.append("INCREMENT BY ").append(sequence.getIncrementBy()).append(SPACE);
            if (forUpdate) {
    @Override
    private static final String SQL_CREATE = "CREATE SEQUENCE ";
        }
        } else {
            sb.append(SQL_ALTER);
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException
            return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // Helpers

        String sql = buildStatement(command.getObject(), false);
import org.jkiss.utils.CommonUtils;

        if (sequence.getCache() != null && sequence.getCache() > 0) {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            sb.append("NO ORDER ").append(SPACE);
            sb.append(sequence.getPrecision().getSqlKeyword()).append(SPACE);
        if (forUpdate) {
        } else {
            sb.append(SQL_CREATE);
    private String buildStatement(DB2Sequence sequence, Boolean forUpdate)
/*
    private static final String SQL_ALTER = "ALTER SEQUENCE ";
            sb.append("ORDER ").append(SPACE);
    @Override
        if (sequence.getCycle()) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            throw new DBException("Sequence name cannot be empty");
    @Override

        }
        if (comment != null) {
    // -------
    private static final String SQL_DROP = "DROP SEQUENCE %s";

                                               final Object container,
            }
    @Nullable
        return object.getSchema().getSequenceCache();
    }
        if (sequence.getMinValue() != null) {
        }
    private String buildComment(DB2Sequence sequence)

        }
    @Override
    {
        }
    public DBSObjectCache<? extends DBSObject, DB2Sequence> getObjectsCache(DB2Sequence object)
                                               Object copyFrom, @NotNull Map<String, Object> options)
import java.util.Map;
