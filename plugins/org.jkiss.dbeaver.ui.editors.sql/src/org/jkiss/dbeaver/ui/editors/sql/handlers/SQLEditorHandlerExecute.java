                    if (editor.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE)) {
                break;
                            .setReplies(Reply.YES, Reply.NO, Reply.CANCEL).setPrimaryImage(DBIcon.STATUS_INFO)
                break;
                SQLNativeExecutorDescriptor executorDescriptor = SQLNativeExecutorRegistry.getInstance()
                }
        String actionId = event.getCommand().getId();
 * you may not use this file except in compliance with the License.
                editor.processSQL(false, false);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                editor.loadQueryPlan();
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
    private static final Log log = Log.getLog(SQLEditorHandlerExecute.class);
            case SQLEditorCommands.CMD_EXECUTE_SCRIPT_NEW:
                break;
                        if (object == null) {
import org.jkiss.dbeaver.DBException;
                try {
import org.jkiss.dbeaver.ui.actions.exec.SQLScriptExecutor;
                } catch (DBException e) {
                editor.processSQL(false, false, new SQLQueryTransformerExpression(), null);
                        if (editor.getGlobalScriptContext().getSourceFile() != null) {
                editor.processSQL(false, false, new SQLQueryTransformerCount(), null);
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
                    }
            default:
        switch (actionId) {

                    log.error(e);
public class SQLEditorHandlerExecute extends AbstractHandler {
                            if (reply.equals(Reply.YES)) {
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ui.dialogs.Reply;
 *
                break;
import org.jkiss.dbeaver.model.sql.transformers.SQLQueryTransformerExpression;
                break;
                    throw new ExecutionException("Valid native executor is not found");
                    .getExecutorDescriptor(editor.getDataSourceContainer());
            }
                        } else {
                            .showMessageBox();
                            nativeExecutor.execute(object, editor.getGlobalScriptContext().getSourceFile());
                editor.processSQL(false, true);
                        // Cancel the execution
                break;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
                    break;
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException
                        editor.doSave(new NullProgressMonitor());
                            = (SQLScriptExecutor<DBSObject>) executorDescriptor.getNativeExecutor();
                editor.explainQueryPlan();
import org.eclipse.core.runtime.NullProgressMonitor;
                        if (reply != null) {
                editor.processSQL(false, true, true);
import org.eclipse.core.commands.ExecutionEvent;
                        }
    }
                        DBCExecutionContextDefaults<?, ?> executionContext
                if (editor.getDataSourceContainer() == null) {
                break;
                break;
import org.eclipse.core.commands.AbstractHandler;
            case SQLEditorCommands.CMD_EXPLAIN_PLAN:
 * limitations under the License.
import org.eclipse.ui.handlers.HandlerUtil;
                            .setMessage(SQLEditorMessages.dialog_save_script_message)
        if (editor == null) {
                break;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Unless required by applicable law or agreed to in writing, software
                break;
                            .setTitle(SQLEditorMessages.dialog_save_script_title)
                        DBSObject object = executionContext.getDefaultCatalog();
            case SQLEditorCommands.CMD_EXECUTE_SCRIPT_NATIVE: {
                break;
            case SQLEditorCommands.CMD_EXECUTE_SCRIPT:
            case SQLEditorCommands.CMD_EXECUTE_ROW_COUNT:
                            throw new ExecutionException("Valid native executor is not found");
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorDescriptor;
            log.error("No active SQL editor found");
                    } else {
                            }
        editor.refreshActions();
                        SQLScriptExecutor<DBSObject> nativeExecutor
                editor.processSQL(false, false, new SQLQueryTransformerAllRows(), null);
                    } else {
                            }
                            object = editor.getDataSource();
                break;
import org.eclipse.core.commands.ExecutionException;
 * DBeaver - Universal Database Manager
                        throw new DBException("Disconnected from database");
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            case SQLEditorCommands.CMD_LOAD_PLAN:
                }
                        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                }
import org.jkiss.dbeaver.Log;
/*
 *
import org.jkiss.dbeaver.model.sql.transformers.SQLQueryTransformerAllRows;
import org.jkiss.dbeaver.model.DBIcon;
                editor.processSQL(true, true);
                    }
        }
            return null;
    @Override
                            nativeExecutor.execute(object, null);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

    {
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorRegistry;
                                editor.doSave(new NullProgressMonitor());
 *     http://www.apache.org/licenses/LICENSE-2.0

                editor.processSQL(true, false);
                if (editor.isDirty()) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.model.sql.transformers.SQLQueryTransformerCount;
 */
                            if (reply.equals(Reply.CANCEL)) {
 *
                    if (editor.getExecutionContext() instanceof DBCExecutionContextDefaults) {
                        Reply reply = MessageBoxBuilder.builder()
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        }
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                                return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (nativeExecutor == null) {
            case SQLEditorCommands.CMD_EXECUTE_EXPRESSION:
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
}
            case SQLEditorCommands.CMD_EXECUTE_STATEMENT_NEW:
            case SQLEditorCommands.CMD_EXECUTE_ALL_ROWS:
                            = (DBCExecutionContextDefaults<?, ?>) editor.getExecutionContext();
                }
                log.error("Unsupported SQL editor command: " + actionId);
 * See the License for the specific language governing permissions and
            case SQLEditorCommands.CMD_EXECUTE_SCRIPT_FROM_POSITION:
                if (executorDescriptor == null) {
                        }
            case SQLEditorCommands.CMD_EXECUTE_STATEMENT:
