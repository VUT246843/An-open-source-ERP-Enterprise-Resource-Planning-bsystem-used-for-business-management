    public static final String SHOW_STATISTICS_ON_EXECUTION             = "SQLEditor.showStatisticsForQueriesWithResults";
            };
        }

        }
                if (statisticsTabOnExecution.getTitle().equals(title)) {
        public final boolean useNewAnalyzer;
    public static final String VAR_FILE_NAME = "fileName";
    public static final String SCRIPT_BIND_COMMENT_TYPE                 = "SQLEditor.script.bind.commentType"; //$NON-NLS-1$
            }
            preferenceStore.setValue(SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME, this.unqualified);
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
                preferenceStore.getDefaultBoolean(SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME),
    }

            };
 *
        DEFAULT(true, false, SQLEditorMessages.pref_page_sql_completion_label_completion_mode_default),
                return DEFAULT;
import org.jkiss.utils.CommonUtils;
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        DELETE_NEW(SQLEditorMessages.script_close_behavior_delete_only_new_scripts),
    public static final String VAR_ACTIVE_PROJECT = "projectName";
            }
 *

    public static final String EXTRA_PANEL_RATIO                        = "SQLEditor.extraPanels.ratio";

            return this.toString();

    // Matching brackets
    public static final String NEW_SCRIPT_TEMPLATE_ENABLED              = "new.script.template.enabled"; //$NON-NLS-1$

        
 * limitations under the License.
            this.title = title;
    public static final String AUTO_SAVE_ON_EXECUTE                    = "SQLEditor.autoSaveOnExecute";
        private final String title;

        }

    public final static String RESULT_SET_ORIENTATION                   = "SQLEditor.resultSet.orientation";

    public static final String SCRIPT_BIG_FILE_LENGTH_BOUNDARY          = "SQLEditor.script.bigFileLengthBoundary"; //$NON-NLS-1$
        SQLAutocompletionMode(boolean useOldAnalyzer, boolean useNewAnalyzer, String title) {
    public static final String SHOW_SERVER_HELP_TOPICS                 = "SQLEditor.ContentAssistant.show.helpTopics";
    public final static String CLEAR_OUTPUT_BEFORE_EXECUTE              = "SQLEditor.clearOutputBeforeExecute";
        }
        public static SQLAutocompletionMode valueByName(String name) {
    

    public static final String VAR_DRIVER_NAME = "driverName";
    public static final String AUTO_SAVE_ON_CLOSE                      = "SQLEditor.autoSaveOnClose";
    public static final String VAR_CONNECTION_NAME = "connectionName";

        }
        public static StatisticsTabOnExecutionBehavior getByName(String name) {
        public String getTitle() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String QUALIFIED_COLUMN_NAMES                  = "SQLEditor.ContentAssistant.qualified.column.names";
            );

 * you may not use this file except in compliance with the License.
    public final static String REFRESH_DEFAULTS_AFTER_EXECUTE           = "SQLEditor.refreshDefaultsAfterExecute";
            return title;
    public static final String EDITOR_SEPARATE_CONNECTION               = "database.editor.separate.connection"; //$NON-NLS-1$
        NEW(false, true, SQLEditorMessages.pref_page_sql_completion_label_completion_mode_new_engine),
    public static final String EDITOR_CONNECT_ON_EXECUTE                = "database.editor.connect.on.execute"; //$NON-NLS-1$

            this.unqualified = unqualified;
    public static final String TAB_AUTOCOMPLETION                      = "SQLEditor.ContentAssistant.autocompletion.tab";

        }
            return title;
    public static final String AUTO_SAVE_ACTIVE_SCHEMA                 = "SQLEditor.autoSaveActiveSchema";

    public static final String PROPOSALS_MATCH_CONTAINS                = "SQLEditor.ContentAssistant.matching.fuzzy";
            return fromBooleanFlags(
        public final String title;

    public static final String INSERT_SINGLE_PROPOSALS_AUTO            = "SQLEditor.ContentAssistant.insert.single.proposal";
        @NotNull
        }

        public static EmptyScriptCloseBehavior getByTitle(String title) {
    public static final String SQLEDITOR_CLOSE_BLOCKS                  = "SQLEditor.closeBlocks";
    public static final String PROBLEM_MARKERS_ENABLED                 = "SQLEditor.problemMarkers.enabled";
    public static final String READ_METADATA_FOR_SEMANTIC_ANALYSIS     = SQLModelPreferences.READ_METADATA_FOR_SEMANTIC_ANALYSIS;
    public static final String MULTIPLE_RESULTS_PER_TAB                 = "SQLEditor.resultSet.multipleResultsPerTab";
        DELETE_ALWAYS(SQLEditorMessages.script_close_behavior_delete_always);
                case "false" -> StatisticsTabOnExecutionBehavior.NEVER;
        public final boolean qualified;

    }
        FOR_MULTIPLE_QUERIES("For multiple queries with results"),
    public enum SQLCompletionObjectNameFormKind {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            if (useShortName) {
    public static final String SMART_WORD_ITERATOR                     = "SQLEditor.smartWordIterator";
                case "true" -> EmptyScriptCloseBehavior.DELETE_NEW;
    public static final String LOCATION_BOTTOM      = "bottom";

    public static final String SCRIPT_COMMIT_LINES                      = "script.commit.lines"; //$NON-NLS-1$
        @NotNull
 */
    public static final String NEW_SCRIPT_TEMPLATE                      = "new.script.template"; //$NON-NLS-1$

        }
    public static final String SCRIPT_COMMIT_TYPE                       = "script.commit.type"; //$NON-NLS-1$
        }
            this.title = title;
    public static final String VAR_ACTIVE_DATABASE = "database";
 * See the License for the specific language governing permissions and
        DEFAULT(false, false, SQLEditorMessages.pref_page_sql_default),
            preferenceStore.setValue(SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ, this.qualified);
    public static final String CLOSE_INCLUDED_SCRIPT_AFTER_EXECUTION    = "SQLEditor.closeIncludedScriptAfterExecution";
    public static final String EDITOR_CONNECT_ON_ACTIVATE               = "database.editor.connect.on.activate"; //$NON-NLS-1$
    public static final String SQLEDITOR_CLOSE_BRACKETS                = "SQLEditor.closeBrackets";
            return CommonUtils.valueOf(SQLAutocompletionMode.class, name, DEFAULT);
        COMBINED(true, true, SQLEditorMessages.pref_page_sql_completion_label_completion_mode_combined);

    public final static String MATCHING_BRACKETS_HIGHLIGHT              = "SQLEditor.matchingBracketsHighlight";
    }
        }

import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
        public final String title;
        }
    public static final String RESULTS_PANEL_RATIO                      = "SQLEditor.resultSet.ratio";
            } else if (useFqNames) {
    public static final String SCRIPT_DELETE_EMPTY                      = "script.delete.empty"; //$NON-NLS-1$
            return this.toString();
        NEVER("Only when no data"),
    public static final String CONFIRM_RUNNING_QUERY_CLOSE              = "close_running_query"; //$NON-NLS-1$
    public final static String RESET_CURSOR_ON_EXECUTE                  = "SQLEditor.resetCursorOnExecute";
    public static final String SQLEDITOR_CLOSE_SINGLE_QUOTES           = "SQLEditor.closeSingleQuotes";
        }
public class SQLPreferenceConstants {
            this.title = title;
        }
    public static final String VAR_FILE_EXT = "fileExt";
    public static final String SHOW_VALUES                             = "SQLEditor.ContentAssistant.show.values";
        @NotNull
    public static final String SCRIPT_FETCH_RESULT_SETS                 = "script.fetch.resultset"; //$NON-NLS-1$
                return UNQUALIFIED;

    public static final String STATEMENT_TIMEOUT                        = "statement.timeout"; //$NON-NLS-1$
    public final static String RESULT_SET_CLOSE_ON_ERROR                = "SQLEditor.resultSet.closeOnError";
    public final static String MAXIMIZE_EDITOR_ON_SCRIPT_EXECUTE        = "SQLEditor.maxEditorOnScriptExecute";
 *



    public static final String SCRIPT_AUTO_FOLDERS                      = "script.auto.folders"; //$NON-NLS-1$
    public static final String SCRIPT_BIND_EMBEDDED_READ                = "SQLEditor.script.bind.embedded.read"; //$NON-NLS-1$
    public static final String FOLDING_ENABLED                         = "SQLEditor.Folding.enabled";
                    return escb;
    public static final String SCRIPT_CREATE_CONNECTION_FOLDERS         = "script.auto.connection.folders"; //$NON-NLS-1$
    public static final String SQLEDITOR_CLOSE_COMMENTS                = "SQLEditor.closeComments";
        @NotNull
/*
        EmptyScriptCloseBehavior(String title) {
                case "true" -> StatisticsTabOnExecutionBehavior.FOR_MULTIPLE_QUERIES;
        public static SQLCompletionObjectNameFormKind getDefaultFromPreferences(@NotNull DBPPreferenceStore preferenceStore) {

            this.qualified = qualified;

    public final static String SQL_FORMAT_KEYWORD_CASE_AUTO             = "SQLEditor.format.keywordCaseAuto";
    public static final String PROPOSAL_SORT_ALPHABETICALLY            = "SQLEditor.ContentAssistant.proposals.sort.alphabetically";
        SQLCompletionObjectNameFormKind(boolean unqualified, boolean qualified, @NotNull String title) {
            return switch (name) {

    public static final String SCRIPT_TITLE_PATTERN                     = "script.title.pattern"; //$NON-NLS-1$
    // Auto-save
    

            return fromBooleanFlags(

}
        public static StatisticsTabOnExecutionBehavior getByTitle(String title) {
    public static final String SQLEDITOR_CLOSE_DOUBLE_QUOTES           = "SQLEditor.closeDoubleQuotes";

        public void setToPreferences(@NotNull DBPPreferenceStore preferenceStore) {
                    return statisticsTabOnExecution;
    public final static String RESULT_SET_REPLACE_CURRENT_TAB           = "SQLEditor.resultSet.replaceCurrentTab"; //$NON-NLS-1$
    public static final String MARK_OCCURRENCES_UNDER_CURSOR           = "SQLEditor.markOccurrences";
        }
                if (escb.getTitle().equals(title)) {
            return StatisticsTabOnExecutionBehavior.NEVER;
            for (EmptyScriptCloseBehavior escb : values()) {
    // Typing constants
        QUALIFIED(false, true, SQLEditorMessages.pref_page_sql_completion_label_use_long_names);
        public static EmptyScriptCloseBehavior getByName(String name) {
    public static final String VAR_ACTIVE_SCHEMA = "schema";
    public static final String MARK_OCCURRENCES_FOR_SELECTION          = "SQLEditor.markOccurrences.forSelection";
        public static SQLCompletionObjectNameFormKind getFromPreferences(@NotNull DBPPreferenceStore preferenceStore) {

    public static final String SCRIPT_ERROR_HANDLING                    = "script.error.handling"; //$NON-NLS-1$
    
    public static final String LOCATION_RESULTS     = "results";
 * You may obtain a copy of the License at
            return switch (name) {
                preferenceStore.getBoolean(SQLModelPreferences.SQL_EDITOR_PROPOSAL_SHORT_NAME),
        }
        public String getName() {
            );
    public enum StatisticsTabOnExecutionBehavior {
    public final static String MATCHING_BRACKETS_COLOR                  = "AbstractTextEditor.Color.Foreground";
        public final boolean useOldAnalyzer;
    public static final String EXTRA_PANEL_LOCATION                     = "SQLEditor.extraPanels.location";
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String getName() {
                default -> CommonUtils.valueOf(StatisticsTabOnExecutionBehavior.class, name, NEVER);
    public static final String SHOW_COLUMN_PROCEDURES                  = "SQLEditor.ContentAssistant.show.column.procedures";

            for (StatisticsTabOnExecutionBehavior statisticsTabOnExecution : values()) {
    public static final String VALIDATE_FUNCTIONS                      = SQLModelPreferences.VALIDATE_FUNCTIONS;
        }

    public final static String SQL_FORMAT_ACTIVE_QUERY                  = "SQLEditor.format.activeQuery";
            this.title = title;

    public static final String ADVANCED_HIGHLIGHTING_ENABLE            = SQLModelPreferences.ADVANCED_HIGHLIGHTING_ENABLE;
package org.jkiss.dbeaver.ui.editors.sql;
    public static final String CONFIRM_RESULT_TABS_CLOSE                = "close_result_tabs"; //$NON-NLS-1$
        public String getTitle() {
    public static final String INSERT_SPACE_AFTER_PROPOSALS            = "SQLEditor.ContentAssistant.insert.space.after.proposal";
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.useNewAnalyzer = useNewAnalyzer;

        StatisticsTabOnExecutionBehavior(String title) {
    public static final String AUTOCOMPLETION_MODE                     = SQLModelPreferences.AUTOCOMPLETION_MODE;
                case "false" -> EmptyScriptCloseBehavior.NOTHING;
    public static final String CONFIRM_SAVE_SQL_CONSOLE                 = "save_sql_console"; //$NON-NLS-1$
    public static final String PROPOSAL_REPLACE_WORD                   = "SQLEditor.ContentAssistant.replace.word";
    public static final String HIDE_DUPLICATE_PROPOSALS                = "SQLEditor.ContentAssistant.hide.duplicates";
                default -> CommonUtils.valueOf(EmptyScriptCloseBehavior.class, name, NOTHING);

        @NotNull
            this.useOldAnalyzer = useOldAnalyzer;
        NOTHING(SQLEditorMessages.script_close_behavior_do_not_delete),
    public static final String SCRIPT_BIND_EMBEDDED_WRITE               = "SQLEditor.script.bind.embedded.write"; //$NON-NLS-1$
                preferenceStore.getDefaultBoolean(SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ)
    public static final String ENABLE_HIPPIE                           = "SQLEditor.ContentAssistant.activate.hippie";
        private static SQLCompletionObjectNameFormKind fromBooleanFlags(boolean useShortName, boolean useFqNames) {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
    public static final String SET_SELECTION_TO_STATISTICS_TAB          = "SQLEditor.setSelectionToStatisticsTab";
    public final static String SQL_FORMAT_BOLD_KEYWORDS                 = "SQLEditor.format.boldKeywords";
    public static final String AUTO_SAVE_ON_CHANGE                     = "SQLEditor.autoSaveOnChange";

    // Reuse "AbstractTextEditor.Color.Foreground" color
    public enum SQLAutocompletionMode {
    public static final String LOCATION_RIGHT       = "right";
    public static final String USE_GLOBAL_ASSISTANT                    = "SQLEditor.ContentAssistant.use.global.search";
        public final boolean unqualified;
        public static SQLAutocompletionMode fromPreferences(@NotNull DBPPreferenceStore preferenceStore) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public final static String BEEP_ON_QUERY_END                        = "SQLEditor.beepOnQueryEnd";
    public static final String ENABLE_KEYSTROKE_ACTIVATION             = "SQLEditor.ContentAssistant.auto.keystrokes.activation";
        UNQUALIFIED(true, false, SQLEditorMessages.pref_page_sql_completion_label_use_short_names),
            return NOTHING;
    public static final String RESULT_SET_MAX_TABS_PER_QUERY            = "SQLEditor.resultSet.queryTabLimit";
        @NotNull
                return QUALIFIED;
    public static final String AUTO_ACTIVATION_DELAY                   = "SQLEditor.ContentAssistant.auto.activation.delay";
                }
    public static final String DEFAULT_SQL_EDITOR_OPEN_COMMAND          = "SQLEditor.defaultOpenCommand";
    public final static String SQL_FORMAT_EXTRACT_FROM_SOURCE           = "SQLEditor.format.extractFromSource";
    public static final String PROPOSAL_INSERT_CASE                    = "SQLEditor.ContentAssistant.insert.case";

    public static final String OUTPUT_PANEL_AUTO_SHOW                   = "SQLEditor.outputPanel.autoShow";
                preferenceStore.getBoolean(SQLModelPreferences.SQL_EDITOR_PROPOSAL_ALWAYS_FQ)
    public final static String MATCHING_BRACKETS                        = "SQLEditor.matchingBrackets";
    public enum EmptyScriptCloseBehavior {
    }
                }

    public static final String STATEMENT_INVALIDATE_BEFORE_EXECUTE      = "statement.invalidate.before.execute"; //$NON-NLS-1$
        ALWAYS("Always");
            return valueByName(preferenceStore.getString(SQLModelPreferences.AUTOCOMPLETION_MODE));
    public static final String ENABLE_AUTO_ACTIVATION                  = "SQLEditor.ContentAssistant.auto.activation.enable";

        }
            } else {
 * Unless required by applicable law or agreed to in writing, software
        private final String title;

        }
    public static final String SCRIPT_FILE_NAME_PATTERN                 = "script.file.name.pattern";
