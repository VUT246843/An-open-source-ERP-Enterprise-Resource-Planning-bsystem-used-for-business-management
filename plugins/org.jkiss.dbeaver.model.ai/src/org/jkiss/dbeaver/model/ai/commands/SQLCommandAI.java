                throw new DBException("AI services restricted for '" + dataSourceContainer.getName() + "'");


                completionSettings.setMetaTransferConfirmed(true);
            dbContext,

            return SQLControlResult.transform(scriptElements.getFirst());

            monitor,
                    dataSource,
 *
        AIDatabaseScope scope = completionSettings.getScope();
            } else {
        @NotNull
import org.jkiss.utils.CommonUtils;
        AIBaseFeatures.SQL_AI_COMMAND.use();
        }
        if (!script.contains("\n") && SQLUtils.isCommentLine(dialect, script)) {
 * DBeaver - Universal Database Manager
        public boolean isForced() {
        if (dataSource == null) {
            throw new DBCMessageException(script);
        StringBuilder messages = new StringBuilder();
        );
import org.jkiss.dbeaver.model.exec.DBCMessageException;
            if (DBWorkbench.getPlatformUI().confirmAction("Do you confirm AI usage",
            return true;

        SQLDialect dialect = SQLUtils.getDialectFromObject(dataSource);
            }
        if (!result.isText()) {
 *
                script = code.text();
        AICompletionSettings completionSettings = new AICompletionSettings(dataSourceContainer);
        }
                AITextUtils.loadCustomEntities(
            List.of(AIMessage.userMessage(prompt))
        AIUtils.disableAutoCommitIfNeeded(
            .createAssistant(dataSourceContainer.getProject().getWorkspace());

import org.jkiss.dbeaver.model.ai.impl.MessageChunk;
 * See the License for the specific language governing permissions and
        DBPDataSourceContainer dataSourceContainer = lDataSource.getDataSourceContainer();
 * Control command handler
/*
            } else if (chunk instanceof MessageChunk.Text textChunk) {

            return SQLControlResult.failure();
            sqlFormatter,
public class SQLCommandAI implements SQLControlCommandHandler {

import org.jkiss.dbeaver.model.ai.prompt.AIPromptAbstract;
        MessageChunk[] messageChunks = AITextUtils.processAndSplitCompletion(

            }
        }
import org.jkiss.code.NotNull;
        public String getName() {

 * You may obtain a copy of the License at
        DBPDataSource dataSource = command.getDataSource();
            throw new DBException("Empty AI prompt");
import org.jkiss.dbeaver.model.exec.output.DBCOutputSeverity;
        monitor.subTask("Generate SQL from prompt");
        @Override
        AIDatabaseContext.Builder contextBuilder = new AIDatabaseContext.Builder(lDataSource);
    @Override
    private static final DBCOutputSeverity AI_OUTPUT_SEVERITY = new DBCOutputSeverity() {
        monitor.subTask("Process generated SQL");
 * you may not use this file except in compliance with the License.
            result.getText()
        }
        }
            }

            contextBuilder.setScope(scope);
        }
                completionSettings.saveSettings();
import org.jkiss.dbeaver.model.ai.registry.AIAssistantRegistry;
                throw new DBCMessageException(messages.toString());
/**

        DBCExecutionContext executionContext = scriptContext.getExecutionContext();
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2026 DBeaver Corp and others
        String script = null;
        List<SQLScriptElement> scriptElements = SQLScriptParser.parseScript(dataSource, script);
import org.jkiss.dbeaver.model.ai.utils.AIUtils;
        }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

        } else {
 * Unless required by applicable law or agreed to in writing, software
        final DBSLogicalDataSource lDataSource = new DBSLogicalDataSource(

            );
        }
        AIUtils.updateScopeSettingsIfNeeded(completionSettings, dataSourceContainer, executionContext);

        if (executionContext != null) {
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
        AIDatabaseContext dbContext = contextBuilder.build();
    @NotNull
                messages.append(textChunk.text());
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.DBPDataSource;
    };
        if (scope == AIDatabaseScope.CUSTOM && completionSettings.getCustomObjectIds() != null) {
    }
        String prompt = command.getParameter();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            contextBuilder.setCustomEntities(
import java.util.Set;

package org.jkiss.dbeaver.model.ai.commands;
        }
        if (script == null) {
        AIAssistant assistant = AIAssistantRegistry.getInstance()
import org.jkiss.dbeaver.model.sql.*;
        AIPromptAbstract sysPromptBuilder = new AIPromptGenerateSql();
            scriptContext.getExecutionContext()
            )) {
 *
            dbContext,

import org.jkiss.dbeaver.model.ai.*;
        }

        }
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;

import java.util.List;
            if (!messages.isEmpty()) {
        AISqlFormatter sqlFormatter = AIAssistantRegistry.getInstance().getDescriptor().createSqlFormatter();
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!AIUtils.confirmExecutionIfNeeded(dataSource, scriptElements, true)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    Set.of(completionSettings.getCustomObjectIds()))
            sysPromptBuilder,
        if (scriptElements.size() == 1) {
import org.jkiss.dbeaver.model.ai.prompt.AIPromptGenerateSql;

        );

import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
 */
        if (!completionSettings.isMetaTransferConfirmed()) {
            if (chunk instanceof MessageChunk.Code code) {
            return SQLControlResult.transform(new SQLScript(dataSource, script, scriptElements));

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            monitor,
    public SQLControlResult handleCommand(@NotNull DBRProgressMonitor monitor, @NotNull SQLControlCommand command, @NotNull SQLScriptContext scriptContext) throws DBException {
        @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            throw new DBCMessageException("Empty AI response for '" + prompt + "'");
            throw new DBException("Not connected to database");
            return SQLControlResult.success();
        }
        if (CommonUtils.isEmptyTrimmed(prompt)) {
        for (MessageChunk chunk : messageChunks) {
            return "AI";
            contextBuilder.setExecutionContext(executionContext);
        );

            monitor,
        scriptContext.getOutputWriter().println(AI_OUTPUT_SEVERITY, prompt + " ==> " + script + "\n");
        }
import org.jkiss.dbeaver.DBException;
                    monitor,
                "Do you confirm AI usage for '" + dataSourceContainer.getName() + "'?"
            command.getDataSourceContainer(), "AI logical wrapper", null);
            scriptElements,
        AIAssistantResponse result = assistant.generateText(
 * limitations under the License.
        if (scope != null) {
