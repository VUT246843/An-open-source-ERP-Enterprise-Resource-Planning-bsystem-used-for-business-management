import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.postgresql.tasks;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            else
 * Unless required by applicable law or agreed to in writing, software
    }

    }
        if (settings.isOnly() && CommonUtils.isBitSet(serverType.getTruncateToolModes(), PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_ONLY_ONE_TABLE)) sql += " ONLY";
 * You may obtain a copy of the License at
    public PostgreToolTableTruncateSettings createToolSettings() {

    @Override
                sql += " CASCADE";

        }
        }
        if (settings.isRunning()) {
        if (CommonUtils.isBitSet(serverType.getTruncateToolModes(), PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_IDENTITIES)) {
}
        PostgreServerExtension serverType = table.getDataSource().getServerType();
 * DBeaver - Universal Database Manager
        }
    }
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
public class PostgreToolTableTruncate extends PostgreToolWithStatus<PostgreTableBase, PostgreToolTableTruncateSettings> {
        queries.add(new SQLDatabasePersistAction(sql));
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;

        if (CommonUtils.isBitSet(serverType.getTruncateToolModes(), PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_CASCADE)) {
        sql += " " + table.getFullyQualifiedName(DBPEvaluationContext.DDL);
            log.error("Error committing transactions", e);

            if (txnManager != null && !txnManager.isAutoCommit()) {
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
                sql += " CONTINUE IDENTITY";

 * you may not use this file except in compliance with the License.
        } catch (Throwable e) {
    private static final Log log = Log.getLog(PostgreToolTableTruncate.class);
    @NotNull
        }
    @Override
 */
        String sql = "TRUNCATE TABLE";
                txnManager.commit(session);
                sql += " RESTART IDENTITY";
import org.jkiss.code.NotNull;

    public boolean needsRefreshOnFinish() {
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (settings.isCascading())
        return true;
            }
import org.jkiss.dbeaver.Log;
        try {
    }
import java.util.List;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
        return new PostgreToolTableTruncateSettings();
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

            commitChanges(session);
    public void generateObjectQueries(DBCSession session, PostgreToolTableTruncateSettings settings, List<DBEPersistAction> queries, PostgreTableBase table) throws DBCException {
            if (settings.isRestarting())
            else
/*
 *
                sql += " RESTRICT";
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void commitChanges(DBCSession session) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
import org.jkiss.dbeaver.model.exec.DBCSession;
