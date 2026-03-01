            if (error == null) {
        }
                    log.error("Can't connect to the new database");
    @Override
 *
package org.jkiss.dbeaver.ext.kingbase.edit;
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        }
            super("Create database", sql.toString());
            sql.append("\nOWNER = ").append(DBUtils.getQuotedIdentifier(database.getInitialOwner()));
        private final KingbaseDatabase database;
                    database.readDatabaseInfo(monitor);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionAtomic;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                try {
import org.jkiss.dbeaver.model.struct.DBSObject;
                                          @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, 
            super.afterExecute(session, error);
import org.jkiss.dbeaver.model.exec.DBCException;
public class KingbaseDatabaseManager extends PostgreDatabaseManager {
 */
                    DBRProgressMonitor monitor = session.getProgressMonitor();
import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        sql.append("CREATE DATABASE ").append(DBUtils.getQuotedIdentifier(database));
        if (!CommonUtils.isEmpty(database.getTemplateName())) {

import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    database.checkInstanceConnection(monitor);
                }
                } catch (DBException e) {
        }
        actions.add(new CreateDatabaseAction(database, sql));
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
        StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseDatabase;
            }
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.utils.CommonUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * KingbaseDatabaseManager
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            sql.append("\nTEMPLATE = ").append(DBUtils.getQuotedIdentifier(database.getDataSource(), database.getTemplateName()));
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.exec.DBCSession;
                .append(DBUtils.getQuotedIdentifier(database.getDataSource(), database.getInitialTablespace().getName()));
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (database.getInitialEncoding() != null) {

    private static class CreateDatabaseAction extends SQLDatabasePersistActionAtomic {
        }
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseDataSource;
            sql.append("\nTABLESPACE = ")
}
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreDatabaseManager;
        if (database.getInitialOwner() != null) {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        public CreateDatabaseAction(PostgreDatabase database, StringBuilder sql) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

 *
import org.jkiss.dbeaver.model.DBConstants;
    }

        }
        final KingbaseDatabase database = (KingbaseDatabase) command.getObject();
    }

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
 * limitations under the License.
                                          @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

/*

import java.util.Map;
 * See the License for the specific language governing permissions and
        }

import org.jkiss.dbeaver.model.DBUtils;
        @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

        public void afterExecute(DBCSession session, Throwable error) throws DBCException {
            sql.append("\nENCODING = '").append(database.getInitialEncoding().getName()).append("'");
/**
 */
            this.database = (KingbaseDatabase) database;
        if (database.getInitialTablespace() != null) {
import org.jkiss.dbeaver.model.DBPDataSource;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
