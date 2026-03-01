
    @Override
    @Override
        @NotNull DBCExecutionContext executionContext,
        return false;
    }
        }
                "Drop sequence",
/*
import org.jkiss.dbeaver.model.edit.DBECommandContext;

 * limitations under the License.
    ) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0


}
 * See the License for the specific language governing permissions and
        return FEATURE_SAVE_IMMEDIATELY;
        @NotNull DBECommandContext context,
 * Licensed under the Apache License, Version 2.0 (the "License");
                "COMMENT ON SEQUENCE " + sequence.getFullyQualifiedName(DBPEvaluationContext.DDL) +
        Object container,
    ) throws DBException {
 *
    }
            new SQLDatabasePersistAction(
    ) throws DBException {
    public boolean canCreateObject(@NotNull Object container) {
        Object copyFrom,
    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
                "Comment sequence",
    }

        @NotNull DBRProgressMonitor monitor,
        }
 */
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    protected String getBaseObjectName() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
        @NotNull DBRProgressMonitor monitor,
    @Override
 *
        if (parentObject instanceof GenericObjectContainer container) {
                    " IS " + SQLUtils.quoteString(sequence, CommonUtils.notEmpty(sequence.getDescription()))));
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        actions.add(
    }
        return "NEW_SEQUENCE";
import org.jkiss.dbeaver.model.sql.SQLUtils;
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.DBConstants;
    protected void addObjectDeleteActions(
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull Map<String, Object> options
        GenericSequence sequence = command.getObject();
        @NotNull List<DBEPersistAction> actions,

        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectDeleteCommand command,
    }
public class GenericSequenceManager extends SQLObjectEditor<GenericSequence, GenericStructContainer> {
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
        @NotNull DBRProgressMonitor monitor,
    protected void addObjectCreateActions(
        @NotNull DBCExecutionContext executionContext,
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {

import java.util.Map;
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    protected void addObjectExtraActions(
import org.jkiss.code.NotNull;
            return container.getSequenceCache();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
    }
import org.jkiss.code.Nullable;
        return null;
    @Override
        throw new DBCFeatureNotSupportedException();
    }
import org.jkiss.dbeaver.DBException;
    @Override
    protected GenericSequence createDatabaseObject(
        @NotNull List<DBEPersistAction> actions,
    ) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBSObjectCache<? extends DBSObject, GenericSequence> getObjectsCache(GenericSequence object) {

import org.jkiss.dbeaver.model.struct.DBSObject;
        throw new DBCFeatureNotSupportedException();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        @NotNull DBCExecutionContext executionContext,
        @NotNull NestedObjectCommand<GenericSequence, SQLObjectEditor<GenericSequence, GenericStructContainer>.PropertyHandler> command,

    @Override
        DBSObject parentObject = object.getParentObject();
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
    }
        @NotNull List<DBEPersistAction> actions,
        );
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.GenericObjectContainer;
package org.jkiss.dbeaver.ext.generic.edit;
                "DROP SEQUENCE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-1$
        @NotNull SQLObjectEditor<GenericSequence, GenericStructContainer>.ObjectCreateCommand command,

            actions.add(new SQLDatabasePersistAction(
        @NotNull Map<String, Object> options
        @NotNull Map<String, Object> options
