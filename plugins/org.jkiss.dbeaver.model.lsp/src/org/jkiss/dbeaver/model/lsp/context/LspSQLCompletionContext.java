        @Nullable DBPDataSource dataSource,
    ) {
        @NotNull SQLSyntaxManager syntaxManager,

}
    }
    }
    public boolean isSortAlphabetically() {
import org.jkiss.code.Nullable;
    public SQLCompletionProposalBase createProposal(
        this.dataSource = dataSource;
        return new SQLCompletionProposalBase(
        return ruleManager;
    }
        return false;
    public LspSQLCompletionContext(
    public SQLSyntaxManager getSyntaxManager() {
        return PROPOSAL_CASE_DEFAULT;
    @Override
import java.util.Map;
    public boolean isForceQualifiedColumnNames() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final SQLRuleManager ruleManager;
        return false;
    public boolean isSearchProcedures() {
 * You may obtain a copy of the License at
        @NotNull String displayString,
        @NotNull String replacementString,
        return false;
    }


import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
            cursorPosition,

    @Override
        @Nullable DBPImage image,

    @Override
        return executionContext;
    @Override
    }
 *
    @Override


    @Nullable
 *
 *
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
        this.syntaxManager = syntaxManager;
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
        return true;
    @Override
            proposalType,
import org.jkiss.dbeaver.model.DBPKeywordType;
    public boolean isShowServerHelp() {
    public DBPDataSource getDataSource() {
    public DBCExecutionContext getExecutionContext() {
        return false;

    }
    }
    public boolean isSearchInsideNames() {
import org.jkiss.dbeaver.model.DBPNamedObject;
    @Override

    @Override
            image,
            params
    }

    }
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @NotNull
 * you may not use this file except in compliance with the License.
        return false;
    private final SQLSyntaxManager syntaxManager;
    }
    @Override
 * DBeaver - Universal Database Manager
    public boolean isReplaceWords() {
            displayString,
        @Nullable String description,
    }
    @Override
import org.jkiss.dbeaver.model.DBPImage;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isHideDuplicates() {
        @NotNull Map<String, Object> params
    }
    }
        );
        return false;
        this.ruleManager = ruleManager;
        return dataSource;
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        @Nullable DBCExecutionContext executionContext,
    public boolean isShowValues() {
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;

    }
public class LspSQLCompletionContext implements SQLCompletionContext {

    @Override
    private final DBPDataSource dataSource;
    public SQLRuleManager getRuleManager() {
        return false;
    @Nullable
            description,

        @Nullable DBPNamedObject object,

    @Override

        return false;
    @Override
            object,
    @NotNull
    public boolean isSearchGlobally() {
        return syntaxManager;
    @Override

        return false;
        this.executionContext = executionContext;
    ) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
package org.jkiss.dbeaver.model.lsp.context;
        @NotNull SQLCompletionRequest request,
    public boolean isUseShortNames() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
        int cursorPosition,
        @NotNull SQLRuleManager ruleManager


 * Licensed under the Apache License, Version 2.0 (the "License");


 * See the License for the specific language governing permissions and
    @NotNull

/*
    private final DBCExecutionContext executionContext;
            request,
    }
        @NotNull DBPKeywordType proposalType,
    }
    }
    public int getInsertCase() {
    public boolean isUseFQNames() {
    }
            replacementString,
