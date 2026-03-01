    int getInsertCase();
        int cursorPosition,
        @NotNull String replacementString,
 * you may not use this file except in compliance with the License.

 *
    int PROPOSAL_CASE_LOWER                         = 2;

    boolean isUseShortNames();
package org.jkiss.dbeaver.model.sql.completion;

    boolean isUseFQNames();
    int PROPOSAL_CASE_UPPER                         = 1;

    DBPDataSource getDataSource();


    boolean isForceQualifiedColumnNames();
 * limitations under the License.
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
    boolean isReplaceWords();
    SQLRuleManager getRuleManager();
import org.jkiss.dbeaver.model.DBPNamedObject;
    DBCExecutionContext getExecutionContext();
/**
 * distributed under the License is distributed on an "AS IS" BASIS,


    SQLSyntaxManager getSyntaxManager();
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
    int PROPOSAL_CASE_DEFAULT                       = 0;
    @Nullable
}
        @Nullable DBPImage image,

    boolean isSortAlphabetically();
 * See the License for the specific language governing permissions and
    SQLCompletionProposalBase createProposal(
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPImage;
    boolean isSearchProcedures();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        @NotNull SQLCompletionRequest request,
 */

 * You may obtain a copy of the License at

import java.util.Map;
        @Nullable String description,
/*
public interface SQLCompletionContext {


    boolean isSearchGlobally();


    boolean isSearchInsideNames();

    boolean isShowValues();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull DBPKeywordType proposalType,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPKeywordType;
 */
import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        @Nullable DBPNamedObject object,

    boolean isHideDuplicates();
    boolean isShowServerHelp();

import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        @NotNull Map<String, Object> params);

 * SQL Completion proposal
        @NotNull String displayString,
