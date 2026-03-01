 *
                    .setScope(popup.getScope())
import java.util.concurrent.atomic.AtomicReference;
                    .setCustomEntities(popup.getCustomEntities(monitor))
        }
                } else {
import java.util.List;
            if (!AIUIUtils.confirmMetaTransfer(settings)) {
                    }
                lDataSource,

import org.jkiss.dbeaver.ui.UIUtils;

            if (aiCompletionPopup.open() == IDialogConstants.OK_ID) {
                return;
    private static final Log log = Log.getLog(AILegacyTranslator.class);
            return;
            String sql = translateUserInputIntoSql(
        return sql.get();
            InMemoryHistoryManager.saveTranslationHistory(dataSource, new QMTranslationHistoryItem(userInput, sql));
        @NotNull SQLEditor editor,
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
            "scope", popup.getScope().name()
                editor.getSelectionProvider().setSelection(new TextSelection(offset + text.length(), 0));
                    sysPromptBuilder,
            return;


                    dbContext,
    private String translateUserInputIntoSql(
                throw new InvocationTargetException(e);
import org.eclipse.jface.text.BadLocationException;
                AIPromptAbstract sysPromptBuilder = new AIPromptGenerateSql();
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
}
            DBSLogicalDataSource lDataSource = DBSLogicalDataSource.createLogicalDataSource(dataSourceContainer, executionContext);
        IDocument document = editor.getDocument();
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        });
import org.jkiss.dbeaver.ui.ai.internal.AIUIFeatures;
        @NotNull DBSLogicalDataSource dataSource,
            DBWorkbench.getPlatformUI().showError("AI error", "Cannot determine AI engine", e);
                        if (text.charAt(text.length() - 1) == ';') {
        String userInput = popup.getInputText();
        AIUIFeatures.SQL_AI_POPUP.use();
    ) throws InvocationTargetException {

import org.jkiss.dbeaver.model.sql.SQLScriptElement;
        try {
            return;
import org.jkiss.dbeaver.model.ai.prompt.AIPromptAbstract;
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
                    length = query.getLength();
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.dialogs.IDialogConstants;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (dataSourceContainer == null) {
                    if (length > 0 && !query.getText().endsWith(";") && !text.isEmpty()) {
        }

import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.ui.ai.AIUIUtils;
                    .setExecutionContext(executionContext)
                executionContext,
        SQLEditor editor,
        DBPDataSourceContainer dataSourceContainer = editor.getDataSourceContainer();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        }
import org.eclipse.ui.handlers.HandlerUtil;
            );
                            text = text.substring(0, text.length() - 1);
        if (!(HandlerUtil.getActiveEditor(event) instanceof SQLEditor editor)) {
            } catch (BadLocationException e) {
    private void doAutoCompletion(
            }
package org.jkiss.dbeaver.ui.ai.legacy;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            } catch (Exception e) {


import java.util.Map;
 *
        if (CommonUtils.isEmptyTrimmed(userInput)) {
                DBWorkbench.getPlatformUI().showError("AI error", "No smart completions returned");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @NotNull String userInput,
import org.jkiss.code.Nullable;
                    monitor,
    ) {
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                int length = ((TextSelection) selection).getLength();
                }
            AICompletionSettings settings = new AICompletionSettings(dataSourceContainer);
        if (executionContext == null) {
                if (result.isText()) {
        @NotNull AISuggestionPopup popup
        } catch (InvocationTargetException e) {
    ) {
                userInput,
            );

                AIAssistant aiAssistant = AIAssistantRegistry.getInstance().createAssistant(workspace);
                    sql.set(finalText);
                return;
            DBWorkbench.getPlatformUI().showError("No connection", "You must connect to the database before performing completion");
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.model.app.DBPWorkspace;
        AIUIFeatures.SQL_AI_GENERATE_PROPOSALS.use(Map.of(
 * limitations under the License.
                DBWorkbench.getPlatformUI().showError("Insert SQL", "Error inserting SQL completion in text editor", e);
            }
                popup
        if (document != null && selection instanceof TextSelection) {
import org.jkiss.dbeaver.model.ai.*;
        ISelection selection = editor.getSelectionProvider().getSelection();
            return;

                doAutoCompletion(executionContext, lDataSource, editor, aiCompletionPopup);
 * DBeaver - Universal Database Manager
                executionContext,
                }
            DBWorkbench.getPlatformUI().showError("Auto completion error", null, e.getTargetException());
            try {
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(AIConstants.AI_COMPLETION_EXECUTE_IMMEDIATELY)) {
    }
                    String finalText = AITextUtils.extractGeneratedSqlQuery(monitor, dbContext, userMessage, result.getText());
        ));
                int offset = ((TextSelection) selection).getOffset();
                if (query != null) {
            if (sql == null || sql.isEmpty()) {
                AIMessage userMessage = AIMessage.userMessage(userInput);
import org.eclipse.jface.viewers.ISelection;
                AIUIMessages.ai_suggestion_popup_title,
                    // Trim trailing semicolon if needed


        }
            editor.processSQL(false, false);
                AIAssistantResponse result = aiAssistant.generateText(
        String completion
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
public class AILegacyTranslator {
        @NotNull DBCExecutionContext executionContext,

        @NotNull DBSLogicalDataSource dataSource,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.text.IDocument;
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
                HandlerUtil.getActiveShell(event),
                AIUIUtils.showPreferences(editor.getSite().getShell());
            if (!AIUtils.hasValidConfiguration()) {


 *
                DBPWorkspace workspace = executionContext.getDataSource().getContainer().getProject().getWorkspace();
                );
import org.jkiss.dbeaver.model.qm.QMTranslationHistoryItem;
                String text = completion;
                    log.debug("Error generating SQL: " + result);
        }
/*


    private void insertSqlCompletion(
    }

                SQLScriptElement query = editor.extractQueryAtPos(offset);
        AtomicReference<String> sql = new AtomicReference<>();
    }
    }
            "driver", dataSource.getDataSourceContainer().getDriver().getPreconfiguredId(),
import org.eclipse.jface.text.TextSelection;
        } catch (Exception e) {
        }
            DBWorkbench.getPlatformUI().showError("No datasource", "Connection must be associated with the SQL script");
                    offset = query.getOffset();
        if (AISettingsManager.getInstance().getSettings().isAiDisabled()) {
import org.jkiss.dbeaver.model.ai.prompt.AIPromptGenerateSql;
        @NotNull DBCExecutionContext executionContext,
 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    .build();
                        }
            }
        }
import org.eclipse.core.commands.ExecutionEvent;
            AISuggestionPopup aiCompletionPopup = new AISuggestionPopup(
import org.jkiss.dbeaver.model.ai.registry.AIAssistantRegistry;
            }
        DBCExecutionContext executionContext = editor.getExecutionContext();
        // CE legacy popup
            insertSqlCompletion(editor, sql);
                    List.of(userMessage)
                document.replace(offset, length, text);
                settings

            try {
    public void performAiTranslation(ExecutionEvent event) {
            }
                return;

            return;
    @Nullable


                dataSource,
 * See the License for the specific language governing permissions and
            return null;
import org.jkiss.code.NotNull;
        UIUtils.runInProgressDialog(monitor -> {
                AIDatabaseContext dbContext = new AIDatabaseContext.Builder(dataSource)
        @NotNull AISuggestionPopup popup
            // Show info transfer warning
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
        try {
