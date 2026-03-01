/*
        return false;
        String typeClause = column.getFullTypeName();
    @Override
    {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        return null;//object.getParentObject().getParentObject().getProjectionCache();
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableColumnManager;
        // According to SQL92 DEFAULT comes before constraints
import org.jkiss.dbeaver.DBException;
        return new ColumnModifier[] {};
    /**
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
    @Override
 */

    }
        if (command.getProperty(DBConstants.PROP_ID_REQUIRED) != null) {
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected VerticaProjectionColumn createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 *
 *

    @Override
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    public boolean canDeleteObject(@NotNull VerticaProjectionColumn object) {
            actionList.add(new SQLDatabasePersistAction("Set column type", prefix + "SET DATA TYPE " + typeClause));
import org.jkiss.dbeaver.ext.vertica.model.VerticaProjection;
public class VerticaProjectionColumnManager extends SQLTableColumnManager<VerticaProjectionColumn, VerticaProjection> {

import org.jkiss.utils.CommonUtils;
    }
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.edit.DBECommandContext;
        if (command.getProperty(DBConstants.PROP_ID_DEFAULT_VALUE) != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.sql.SQLUtils;
 * Vertica table column manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
            actionList.add(new SQLDatabasePersistAction("Set column comment", "COMMENT ON COLUMN " +
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        String prefix = "ALTER TABLE " + DBUtils.getObjectFullName(column.getTable(), DBPEvaluationContext.DDL) + " ALTER COLUMN " + DBUtils.getQuotedIdentifier(column) + " ";
 * See the License for the specific language governing permissions and
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
     * Copy-pasted from PostgreSQL implementation.
        return null;
    public DBSObjectCache<VerticaProjection, VerticaProjectionColumn> getObjectsCache(VerticaProjectionColumn object) {
        return false;
 *
import org.jkiss.dbeaver.model.DBConstants;
 * limitations under the License.
 */
        }

    }
    @Override
        }
                actionList.add(new SQLDatabasePersistAction("Drop column default", prefix + "DROP DEFAULT"));
    @Override
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.vertica.model.VerticaProjectionColumn;
        if (command.getProperty(DBConstants.PROP_ID_TYPE_NAME) != null || command.getProperty("maxLength") != null || command.getProperty("precision") != null || command.getProperty("scale") != null) {

        }
            actionList.add(new SQLDatabasePersistAction("Set column nullability", prefix + (column.isRequired() ? "SET" : "DROP") + " NOT NULL"));

    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
}
            } else {
                " IS " + SQLUtils.quoteString(column, CommonUtils.notEmpty(column.getDescription()))));
            if (CommonUtils.isEmpty(column.getDefaultValue())) {
     * TODO: Vertica is originally based on PG. Maybe we should refactor this stuff somehow.
package org.jkiss.dbeaver.ext.vertica.edit;
            }
        final VerticaProjectionColumn column = command.getObject();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

     */
    protected ColumnModifier[] getSupportedModifiers(VerticaProjectionColumn column, Map<String, Object> options) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                DBUtils.getObjectFullName(column.getTable(), DBPEvaluationContext.DDL) + "." + DBUtils.getQuotedIdentifier(column) +
    }
import java.util.List;
    public boolean canCreateObject(@NotNull Object container) {
                actionList.add(new SQLDatabasePersistAction("Set column default", prefix + "SET DEFAULT " + column.getDefaultValue()));
