import org.eclipse.ui.texteditor.AbstractTextEditor;
    }

            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION, true);
 * you may not use this file except in compliance with the License.
 *
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.PROPOSAL_REPLACE_WORD, false);

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
            SQLPreferenceConstants.RESULT_SET_ORIENTATION, SQLEditor.ResultSetOrientation.HORIZONTAL.name());
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR, false);
 * See the License for the specific language governing permissions and
        );
    public SQLEditorPreferencesInitializer() {
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.BEEP_ON_QUERY_END, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTOCOMPLETION_MODE, SQLAutocompletionMode.NEW.getName());
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.USE_GLOBAL_ASSISTANT, false);
 */
            SQLPreferenceConstants.SHOW_STATISTICS_ON_EXECUTION,

        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_FETCH_RESULT_SETS, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_BIND_COMMENT_TYPE, SQLScriptBindingType.NAME.name());
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA, true);
            SQLPreferenceConstants.StatisticsTabOnExecutionBehavior.FOR_MULTIPLE_QUERIES
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_TITLE_PATTERN, SQLEditor.DEFAULT_TITLE_PATTERN);
 * You may obtain a copy of the License at
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.FOLDING_ENABLED, true);

import org.jkiss.dbeaver.ui.editors.sql.SQLScriptBindingType;
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.REFRESH_DEFAULTS_AFTER_EXECUTE, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE_ENABLED, false);
 * Unless required by applicable law or agreed to in writing, software

            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE, true);
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE, false);
/*
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SMART_WORD_ITERATOR, true);
    }
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SHOW_SERVER_HELP_TOPICS, false);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY, 20);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.STATEMENT_TIMEOUT, 0);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS, true);
            );
        // Init default preferences
import org.jkiss.dbeaver.utils.PrefUtils;
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.VALIDATE_FUNCTIONS, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO, true);
                store, SQLPreferenceConstants.SCRIPT_BIG_FILE_LENGTH_BOUNDARY, SQLEditor.MAX_FILE_LENGTH_FOR_RULES

        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQLEDITOR_CLOSE_COMMENTS, true);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_WRITE, false);
        // SQL execution
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.HIDE_DUPLICATE_PROPOSALS, false);
package org.jkiss.dbeaver.ui.editors.sql.internal;
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS, true);

        PrefUtils.setDefaultPreferenceValue(
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTO_ACTIVATION_DELAY, 0);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.TAB_AUTOCOMPLETION, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.QUALIFIED_COLUMN_NAMES, false);
    public void initializeDefaultPreferences() {
 * limitations under the License.
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.PROPOSAL_INSERT_CASE, SQLCompletionContext.PROPOSAL_CASE_DEFAULT);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.CLEAR_OUTPUT_BEFORE_EXECUTE, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES, true);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS, true);

}
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SHOW_COLUMN_PROCEDURES, false);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_DELETE_EMPTY, SQLPreferenceConstants.EmptyScriptCloseBehavior.DELETE_NEW.name());
 * Licensed under the Apache License, Version 2.0 (the "License");
        PrefUtils.setDefaultPreferenceValue(
 *
        // Disable separate connection by default. Otherwise many people don't understand what happens (data editor and SQL editor have different contexts)
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQLEDITOR_CLOSE_BLOCKS, true);
import org.jkiss.dbeaver.model.sql.SQLScriptErrorHandling;
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ, true);
 * DBeaver - Universal Database Manager
        PrefUtils.setDefaultPreferenceValue(store, AbstractTextEditor.PREFERENCE_TEXT_DRAG_AND_DROP_ENABLED, true);
            PrefUtils.setDefaultPreferenceValue(
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY, true);

        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE, true);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;

import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.SQLAutocompletionMode;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
        PrefUtils.setDefaultPreferenceValue(

            // SQL prefs
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;

        // Text editor default preferences
import org.jkiss.dbeaver.model.sql.SQLUtils;
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_COMMIT_LINES, 1000);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_FILE_NAME_PATTERN, SQLEditor.DEFAULT_SCRIPT_FILE_NAME);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.DEFAULT_SQL_EDITOR_OPEN_COMMAND, SQLEditorCommands.CMD_SQL_EDITOR_RECENT);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY, true);
    @Override
            store,

            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_CREATE_CONNECTION_FOLDERS, false);
public class SQLEditorPreferencesInitializer extends AbstractPreferenceInitializer {
        );
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_ERROR_HANDLING, SQLScriptErrorHandling.STOP_ROLLBACK.name());

            store,
import org.jkiss.dbeaver.model.sql.SQLScriptCommitType;

            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED, true);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE, true);
import org.jkiss.dbeaver.runtime.DBWorkbench;

            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.ENABLE_HIPPIE, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_AUTO_FOLDERS, false);
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO, true);
            store, SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION, SeparateConnectionBehavior.DEFAULT.name()
        }
        {
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE, SQLUtils.generateCommentLine(null, SQLEditorMessages.pref_page_sql_editor_new_script_template_template));
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SHOW_VALUES, false);
        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.SCRIPT_COMMIT_TYPE, SQLScriptCommitType.NO_COMMIT.name());
            PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE, false);


        PrefUtils.setDefaultPreferenceValue(store, SQLPreferenceConstants.STATEMENT_INVALIDATE_BEFORE_EXECUTE, false);
