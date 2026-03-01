            document.getUri(),
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        @NotNull final String uri,
    }
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) {
 *
 *
 *
    @Override
        syntaxManager = new SQLSyntaxManager();
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;

            return null;

 * you may not use this file except in compliance with the License.
 * limitations under the License.
    @Nullable
    }


        initBasicSyntax();
    private DBCExecutionContext executionContext;
    }
        } else {
 * Unless required by applicable law or agreed to in writing, software
    private void initBasicSyntax() {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @NotNull
 * You may obtain a copy of the License at

    @NotNull

            document.getVersion(),
    public String toString() {
package org.jkiss.dbeaver.model.lsp.context;
    public void setExecutionContext(@Nullable DBCExecutionContext executionContext) {

public class ContextAwareDocument extends TextDocumentItem {
        return syntaxManager;

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return "ContextAwareDocument{" +

}
    @Nullable
 * DBeaver - Universal Database Manager
        final int version,
    }
            document.getLanguageId(),
            ", syntaxManager=" + syntaxManager +
        @NotNull final String text
        this.ruleManager = ruleManager;
 * See the License for the specific language governing permissions and
    }
        return executionContext;
        return ruleManager;
            ", textDocument=" + super.toString() +
    public ContextAwareDocument(
    public void setSyntaxManager(@NotNull SQLSyntaxManager syntaxManager) {
import org.jkiss.code.Nullable;
        syntaxManager.init(BasicSQLDialect.INSTANCE, DBWorkbench.getPlatform().getPreferenceStore());
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        ruleManager.loadRules(getDataSource(), false);
    }
    }
        final String languageId,

            ", ruleManager=" + ruleManager +
            return executionContext.getDataSource();
        super(uri, languageId, version, text);
    public SQLRuleManager getRuleManager() {
        if (executionContext == null) {
    private SQLSyntaxManager syntaxManager;
    public DBPDataSource getDataSource() {
    }
            "executionContext=" + executionContext +
        );
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.runtime.DBWorkbench;

        return new ContextAwareDocument(
        this.executionContext = executionContext;
/*
    @NotNull
    public void setRuleManager(@NotNull LspSQLRuleManager ruleManager) {
    @NotNull
        ruleManager = new LspSQLRuleManager(syntaxManager);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public static ContextAwareDocument from(@NotNull TextDocumentItem document) {
            '}';

        this.syntaxManager = syntaxManager;
    @NotNull
import org.eclipse.lsp4j.TextDocumentItem;
            document.getText()
    public SQLSyntaxManager getSyntaxManager() {

        }
    private LspSQLRuleManager ruleManager;
    @Nullable
 */
    public DBCExecutionContext getExecutionContext() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
