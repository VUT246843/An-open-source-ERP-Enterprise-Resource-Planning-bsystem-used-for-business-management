            false);
        } catch (DBCException e) {
    {
        }
                    "You could change table's engine to INNODB or some other relational engine");
    }
}
                DBWorkbench.getPlatformUI().showError("Create foreign key", "Foreign keys are not supported by MyISAM engine.\n" +
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*

        MySQLTable table = (MySQLTable) container;
        addObjectCreateActions(monitor, executionContext, actions, makeCreateCommand(command.getObject(), options), options);
    protected MySQLTableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object from, @NotNull Map<String, Object> options)
            "",
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
import java.util.Map;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
 * DBeaver - Universal Database Manager
    {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableConstraint;
        try {
 * See the License for the specific language governing permissions and
            DBSForeignKeyModifyRule.NO_ACTION,
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTable;
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
            null,
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.

public class MySQLForeignKeyManager extends SQLForeignKeyManager<MySQLTableForeignKey, MySQLTable> {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBSForeignKeyModifyRule.NO_ACTION,
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
import java.util.List;

        MySQLTableForeignKey foreignKey = new MySQLTableForeignKey(
                return null;
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return foreignKey;
    @Override
 *
 * MySQL foreign key manager
            table,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
            return null;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
 */

 * You may obtain a copy of the License at
    }
    {
        return object.getParentObject().getForeignKeyCache();
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableForeignKey;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ext.mysql.model.MySQLEngine;
    @Override
    protected String getDropForeignKeyPattern(MySQLTableForeignKey foreignKey)
        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP FOREIGN KEY " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$
    }
    }
package org.jkiss.dbeaver.ext.mysql.edit;
    public DBSObjectCache<? extends DBSObject, MySQLTableForeignKey> getObjectsCache(MySQLTableForeignKey object)
import org.jkiss.dbeaver.model.exec.DBCException;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            if (MySQLEngine.MYISAM.equalsIgnoreCase(table.getAdditionalInfo(monitor).getEngine().getName())) {
/**
            log.error(e);
            getReferencedKey(monitor, table, MySQLTableConstraint.class, options),
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Nullable

 * distributed under the License is distributed on an "AS IS" BASIS,
        addObjectDeleteActions(monitor, executionContext, actions, new ObjectDeleteCommand(command.getObject(), command.getTitle()), options);
