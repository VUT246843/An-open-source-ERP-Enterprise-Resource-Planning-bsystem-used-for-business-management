        return this.insertSpaceAfterProposal;

package org.jkiss.dbeaver.ui.editors.sql.semantics;
/*
    private final EnumMap<SQLQueryCompletionItemKind, StyledString.Styler> stylerByItemKind = new EnumMap<>(SQLQueryCompletionItemKind.class) {{
 *
    public boolean isInsertSpaceAfterProposal() {
        super(completionRequest, requestOffset);
 * See the License for the specific language governing permissions and
 */

}

 *
        put(SQLQueryCompletionItemKind.PROCEDURE, ThemeConstants.SQL_EDITOR_COLOR_FUNCTION);

            this.insertSpaceAfterProposal = true;
        put(SQLQueryCompletionItemKind.RELATED_TABLE_NAME, ThemeConstants.SQL_EDITOR_COLOR_TABLE);
        put(SQLQueryCompletionItemKind.TABLE_COLUMN_NAME, ThemeConstants.SQL_EDITOR_COLOR_COLUMN);
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }};
        put(SQLQueryCompletionItemKind.DERIVED_COLUMN_NAME, ThemeConstants.SQL_EDITOR_COLOR_COLUMN_DERIVED);
 * limitations under the License.

    }
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
        registryStyleByItemKind.forEach((k, v) -> put(k, StyledString.createColorRegistryStyler(v, null)));
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (executionContext != null) {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItemKind;

        put(SQLQueryCompletionItemKind.COMPOSITE_FIELD_NAME, ThemeConstants.SQL_EDITOR_COLOR_COMPOSITE_FIELD);

 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.EnumMap;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        DBCExecutionContext executionContext = completionRequest.getContext().getExecutionContext();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
        }

    private final boolean insertSpaceAfterProposal;
    // per completion request initialized to be in sync with actual preferences, consider listening for preference event
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    public StyledString.Styler getStyler(@NotNull SQLQueryCompletionItemKind itemKind) {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionProposalContext;
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
        put(SQLQueryCompletionItemKind.RELATED_SUBQUERY_ALIAS, ThemeConstants.SQL_EDITOR_COLOR_TABLE_ALIAS);
import org.eclipse.jface.viewers.StyledString;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Nullable
    }
        put(SQLQueryCompletionItemKind.SUBQUERY_ALIAS, ThemeConstants.SQL_EDITOR_COLOR_TABLE_ALIAS);
    public SQLEditorQueryCompletionProposalContext(@NotNull SQLCompletionRequest completionRequest, int requestOffset) {
 * Unless required by applicable law or agreed to in writing, software
        return this.stylerByItemKind.get(itemKind);
            DBPPreferenceStore prefStore = executionContext.getDataSource().getContainer().getPreferenceStore();
        put(SQLQueryCompletionItemKind.NEW_TABLE_NAME, ThemeConstants.SQL_EDITOR_COLOR_TABLE);
        } else {
    private static final EnumMap<SQLQueryCompletionItemKind, String> registryStyleByItemKind = new EnumMap<>(SQLQueryCompletionItemKind.class) {{
        put(SQLQueryCompletionItemKind.USED_TABLE_NAME, ThemeConstants.SQL_EDITOR_COLOR_TABLE);
        put(SQLQueryCompletionItemKind.RESERVED, ThemeConstants.SQL_EDITOR_COLOR_KEYWORD);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
    }};
    @Override
public class SQLEditorQueryCompletionProposalContext extends SQLQueryCompletionProposalContext {
            this.insertSpaceAfterProposal = prefStore.getBoolean(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS);
    // static one-time initialized

