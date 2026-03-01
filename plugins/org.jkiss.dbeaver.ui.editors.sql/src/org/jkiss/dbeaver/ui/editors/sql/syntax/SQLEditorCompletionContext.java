
        @NotNull Map<String, Object> params) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            params);
 *
public class SQLEditorCompletionContext implements SQLCompletionContext {

        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES);
        @NotNull String replacementString,
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS);
import org.jkiss.dbeaver.model.DBPKeywordType;
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROPOSAL_REPLACE_WORD);
        return getActivePreferenceStore().getInt(SQLPreferenceConstants.PROPOSAL_INSERT_CASE);
    }
    @Override

        this.objectNameFormKind = SQLCompletionObjectNameFormKind.getFromPreferences(editor.getActivePreferenceStore());

    public boolean isShowServerHelp() {
    }
 * You may obtain a copy of the License at
    @Override
    }
 *
    public SQLSyntaxManager getSyntaxManager() {
        return editor.getDataSource();
    @Override
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES);
    @NotNull
    }
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;

    private DBPPreferenceStore getActivePreferenceStore() {
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
 */
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
        return editor.getActivePreferenceStore();
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
import org.jkiss.dbeaver.model.DBPImage;

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
}

            image,
    public int getInsertCase() {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;


 * DBeaver - Universal Database Manager
    }


    public SQLEditorCompletionContext(SQLEditorBase editor) {
    public boolean isHideDuplicates() {
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS);
    public SQLRuleManager getRuleManager() {
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.SHOW_VALUES);
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY);
    }
    @Override
    @Override
    }
        return this.objectNameFormKind;
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.USE_GLOBAL_ASSISTANT);
            request,
    @Override
 *
            description,
    @Override
        @Nullable DBPNamedObject object,
    private final SQLEditorBase editor;
    @Override
    }

    @Override
    public boolean isShowValues() {

    public boolean isSearchGlobally() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
    @Override
    public boolean isForceQualifiedColumnNames() {
    }

    public SQLCompletionProposalBase createProposal(

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;


        @Nullable DBPImage image,
    public boolean isSearchProcedures() {
import org.jkiss.code.Nullable;
            proposalType,
            replacementString,
        @NotNull String displayString,
import org.jkiss.code.NotNull;
    public DBCExecutionContext getExecutionContext() {
    @Override
    public SQLCompletionObjectNameFormKind getObjectNameForm() {
        return objectNameFormKind.unqualified;
import java.util.Map;
    }
        return editor.getSyntaxManager();
    }
        @NotNull SQLCompletionRequest request,
    public boolean isUseShortNames() {
    public DBPDataSource getDataSource() {

        return editor.getRuleManager();
        return editor.getExecutionContext();


import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
            displayString,

    @Override
    @Nullable
    @Override
    }
        this.editor = editor;
    }
    @Override
        return new SQLCompletionProposal(
    }
 * See the License for the specific language governing permissions and
    }
    }
 * you may not use this file except in compliance with the License.
            cursorPosition,
    public boolean isUseFQNames() {

    public boolean isReplaceWords() {
        @NotNull DBPKeywordType proposalType,
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.*;
    }
    @Override
    }

        int cursorPosition,
    public boolean isSearchInsideNames() {
    @Override

    public boolean isSortAlphabetically() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable String description,
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS);
            object,
/*
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;
        return objectNameFormKind.qualified;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final SQLCompletionObjectNameFormKind objectNameFormKind;
