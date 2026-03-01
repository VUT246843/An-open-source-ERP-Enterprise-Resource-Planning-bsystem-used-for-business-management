        @NotNull ObjectChangeCommand command,
import org.jkiss.code.Nullable;
        return new CubridSequence((GenericStructContainer) container, BASE_SERIAL_NAME);
        actions.add(new SQLDatabasePersistAction(
        @NotNull DBRProgressMonitor monitor,
        }
 */
            sb.append(" COMMENT ").append(SQLUtils.quoteString(sequence, CommonUtils.notEmpty(sequence.getDescription())));
    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        }
        @NotNull Map<String, Object> options
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class CubridSequenceManager extends GenericSequenceManager {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        ));

        if (sequence.getCycle()) {
            "Drop Serial",
        }
        @NotNull Map<String, Object> options
        /* This body intentionally empty. */
        CubridUser user = (CubridUser) container;
        }
    protected GenericSequence createDatabaseObject(
package org.jkiss.dbeaver.ext.cubrid.edit;
        }
        buildOtherValue(sequence, sb, hasComment);
    public boolean canEditObject(GenericSequence object) {

        @NotNull DBRProgressMonitor monitor,
        @NotNull List<DBEPersistAction> actions,
    @Override
        actions.add(new SQLDatabasePersistAction("Create Serial", buildStatement(sequence, false, hasComment)));

    public boolean canDeleteObject(GenericSequence object) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    ) {
        return FEATURE_EDITOR_ON_CREATE;
    }
        StringBuilder sb = new StringBuilder();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
        if (sequence.getMaxValue() != null) {
    protected void addObjectCreateActions(
 * Copyright (C) 2010-2025 DBeaver Corp and others
        sb.append(sequence.getFullyQualifiedName(DBPEvaluationContext.DDL));
        @NotNull Map<String, Object> options
import org.jkiss.utils.CommonUtils;
        if (hasComment || sequence.getDescription() != null) {
        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        boolean isCurrentUser = user.getName().equalsIgnoreCase(dataSource.getCurrentUser());
import java.util.List;
        if (sequence.getMinValue() != null) {
    }
        if (sequence.getStartValue() != null) {
 * Unless required by applicable law or agreed to in writing, software
    @Override
    @Override
    ) {
        }
        @Nullable Object container,
        buildBody(sequence, sb);
        CubridDataSource dataSource = (CubridDataSource) user.getDataSource();
    public String buildStatement(@NotNull CubridSequence sequence, boolean forUpdate, boolean hasComment) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        actionList.add(new SQLDatabasePersistAction("Alter Serial", buildStatement(sequence, true, hasComment)));

    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.cubrid.model.CubridUser;
/*
        return !((CubridDataSource) object.getDataSource()).isShard();
    @Override
    protected void addObjectModifyActions(
            sb.append(" INCREMENT BY ").append(sequence.getIncrementBy());
        if (sequence.getIncrementBy() != null) {
        @NotNull ObjectCreateCommand command,
    public boolean canCreateObject(@NotNull Object container) {
    ) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
 *
    @Override
        return supportsMultiSchema || isCurrentUser || !dataSource.isShard();
    ) {
            sb.append(" NOCYCLE");
        }
        return !((CubridDataSource) object.getDataSource()).isShard();
import org.jkiss.dbeaver.ext.generic.edit.GenericSequenceManager;
    ) {
    }
        @Nullable Object copyFrom,
    protected void addObjectDeleteActions(
        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectDeleteCommand command,
            sb.append("CREATE SERIAL ");
            sb.append(" MAXVALUE ").append(sequence.getMaxValue());

        CubridSequence sequence = (CubridSequence) command.getObject();
    }
        @NotNull DBCExecutionContext executionContext,
        @NotNull List<DBEPersistAction> actions,
        @NotNull List<DBEPersistAction> actions,
    }
        @NotNull DBECommandContext context,
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        @NotNull Map<String, Object> options

        boolean hasComment = command.hasProperty(DBConstants.PROP_ID_DESCRIPTION);
        @NotNull DBRProgressMonitor monitor,
    @NotNull



        @NotNull List<DBEPersistAction> actionList,
 * DBeaver - Universal Database Manager
        @NotNull NestedObjectCommand<GenericSequence, SQLObjectEditor<GenericSequence, GenericStructContainer>.PropertyHandler> command,
import org.jkiss.dbeaver.ext.cubrid.model.CubridSequence;
    }
        CubridSequence sequence = (CubridSequence) command.getObject();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return sb.toString();
 *
 * You may obtain a copy of the License at
            sb.append(" CACHE ").append(sequence.getCachedNum());
}

import org.jkiss.code.NotNull;
    @Override
        } else {
    public void buildOtherValue(@NotNull CubridSequence sequence, @NotNull StringBuilder sb, boolean hasComment) {
    @NotNull
    public void buildBody(@NotNull CubridSequence sequence, @NotNull StringBuilder sb) {
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
    @Override
import org.jkiss.dbeaver.model.DBConstants;
        boolean hasComment = command.hasProperty(DBConstants.PROP_ID_DESCRIPTION);
        @NotNull DBCExecutionContext executionContext,
        if (sequence.getCachedNum() != 0) {
    }
            sb.append("ALTER SERIAL ");
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
    }

        if (forUpdate) {
    @Override
 *
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;
            sb.append(" START WITH ").append(sequence.getStartValue());
            sb.append(" MINVALUE ").append(sequence.getMinValue());
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        }

import java.util.Map;
    }
        @NotNull DBRProgressMonitor monitor,

    protected void addObjectExtraActions(
    public static final String BASE_SERIAL_NAME = "new_serial";
            sb.append(" CYCLE");
            "DROP SERIAL " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)
 * See the License for the specific language governing permissions and
        @NotNull Map<String, Object> options
        } else {
        @NotNull DBCExecutionContext executionContext,
        boolean supportsMultiSchema = dataSource.getSupportMultiSchema();
