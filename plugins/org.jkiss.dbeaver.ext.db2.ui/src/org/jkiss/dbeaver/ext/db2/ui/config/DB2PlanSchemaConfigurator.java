 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import java.util.List;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        return object;
                                listTablespaces);
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
public class DB2PlanSchemaConfigurator implements DBEObjectConfigurator<DB2PlanConfig> {
                        }
            log.error("Error reading EXPLAIN tables", e);
import org.jkiss.dbeaver.ext.db2.DB2Utils;
 *
        try {
                protected DB2PlanConfig runTask() {
/*
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    if (tsChooserDialog != null && tsChooserDialog.open() == IDialogConstants.OK_ID) {
                    }
import org.jkiss.dbeaver.ext.db2.model.DB2PlanConfig;
                    // No valid explain tables found, propose to create them in current authId
import org.jkiss.dbeaver.ui.UITask;
        } catch (DBCException e) {
                        return null;
                        // NO Usable Tablespace found: End of the game..
                    }
 * limitations under the License.
}
                    } else {
                        tsChooserDialog = new DB2TablespaceChooser(
            }.execute();
                        return object;
                    }
                        final List<String> listTablespaces = DB2Utils.getListOfUsableTsForExplain(monitor, session);
                        object.setTablespace(tsChooserDialog.getSelectedTablespace());
 * Unless required by applicable law or agreed to in writing, software

import java.util.Map;
 */
 * See the License for the specific language governing permissions and

import org.eclipse.jface.dialogs.IDialogConstants;
        }
import org.jkiss.code.NotNull;
                            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return null;
import org.jkiss.code.Nullable;
/**
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                @Override
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
            return new UITask<DB2PlanConfig>() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            JDBCSession session = DBUtils.openMetaSession(monitor, db2source, "Read EXPLAIN tables");
 */
package org.jkiss.dbeaver.ext.db2.ui.config;
    }
import org.jkiss.dbeaver.model.exec.DBCException;
                    String msg = String.format(DB2Messages.dialog_explain_ask_to_create, object.getSessionUserSchema());
                    // Ask the user in what tablespace to create the Explain tables and build a dialog with the list of usable tablespaces for the user to choose
                        if (listTablespaces.isEmpty()) {
                            DBWorkbench.getPlatformUI().showError(DB2Messages.dialog_explain_no_tablespace_found_title,
                    } catch (SQLException e) {

 *
                    DB2TablespaceChooser tsChooserDialog = null;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.UIUtils;
                        log.error(e);
 * you may not use this file except in compliance with the License.
                    try {
import org.jkiss.dbeaver.Log;
                    if (!UIUtils.confirmAction(DB2Messages.dialog_explain_no_tables, msg)) {
                                UIUtils.getActiveWorkbenchShell(),
                                    DB2Messages.dialog_explain_no_tablespace_found);
    public DB2PlanConfig configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object db2dataSource, @NotNull DB2PlanConfig object, @NotNull Map<String, Object> options) {
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected static final Log log = Log.getLog(DB2PlanSchemaConfigurator.class);
import java.sql.SQLException;
    @Override
        DB2DataSource db2source = (DB2DataSource) db2dataSource;
 * DB2 Explain Schema configurator
 *

import org.jkiss.dbeaver.ext.db2.ui.editors.DB2TablespaceChooser;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
