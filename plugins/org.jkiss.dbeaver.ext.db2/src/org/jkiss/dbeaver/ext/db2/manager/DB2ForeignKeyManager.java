 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    // ------
    	DB2TableForeignKey foreignKey = new DB2TableForeignKey(

import org.jkiss.code.Nullable;
    {
    }
    // ------
        // DF: Throw exception for now
 * you may not use this file except in compliance with the License.
    }
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
    // -----------------
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
    private static final String SQL_ALTER = "ALTER TABLE %s ALTER FOREIGN KEY %s";
    }
        throw new IllegalStateException("Object modification is not supported in " + getClass().getSimpleName()); //$NON-NLS-1$
public class DB2ForeignKeyManager extends SQLForeignKeyManager<DB2TableForeignKey, DB2Table> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.model.DB2TableForeignKey;
    // ------

/*
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * See the License for the specific language governing permissions and

import java.util.Map;
/**
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import java.util.List;
 */
    public String getDropForeignKeyPattern(DB2TableForeignKey foreignKey)
    @Override

    }
        return false;
    {
    // Business Contract
        // Will have to implement it for alter FK query optimisation + TRUST
        String tableName = foreignKey.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
            (DB2Table) table,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    {
    {
        return foreignKey;
    @Override
 * 
    // -----------------
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    // ------
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            DBSForeignKeyModifyRule.NO_ACTION);
 * @author Denis Forveille
    @Nullable
    @Override
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));
    // ------
 *

        return object.getParentObject().getSchema().getAssociationCache();
    private static final String SQL_DROP_FK = "ALTER TABLE %s DROP FOREIGN KEY %s";
 *     http://www.apache.org/licenses/LICENSE-2.0
    // Create

import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;

    }

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
            null,

package org.jkiss.dbeaver.ext.db2.manager;
    // Alter
    @Override
        return String.format(SQL_DROP_FK, tableName, foreignKey.getName());
}
 * Unless required by applicable law or agreed to in writing, software
            DBSForeignKeyModifyRule.NO_ACTION,
 * DB2 Foreign key Manager
    // Drop
 * limitations under the License.

    public DB2TableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object table, Object from, @NotNull Map<String, Object> options)
    private static final String CONS_FK_NAME = "%s_%s_FK";
 */

    // ------
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean canEditObject(@NotNull DB2TableForeignKey object)
 * DBeaver - Universal Database Manager

    public DBSObjectCache<? extends DBSObject, DB2TableForeignKey> getObjectsCache(DB2TableForeignKey object)
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
