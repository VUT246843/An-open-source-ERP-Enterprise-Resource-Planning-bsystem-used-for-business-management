        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_LINE_NUMBER, false);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_CONNECTION_NAME, false);
 */
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT, DBDDisplayFormat.EDIT.name());
        // ResultSet
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_GROUPING_SHOW_PERCENT_OF_TOTAL_ROWS, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_REFRESH_AFTER_UPDATE, true);
    public DataEditorsPreferencesInitializer() {
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_SHOW_NULLS, false);
 * You may obtain a copy of the License at
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_AUTO_FETCH_NEXT_SEGMENT, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME, true);

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE, IValueController.EditType.EDITOR);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_INLINE_ENTER, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_NEW_ROWS_AFTER, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_USE_ALL_COLUMNS, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_GROUPING_DEFAULT_SORTING, "");
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_CANCEL_TIMEOUT, 5000);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_DOUBLE_CLICK, Spreadsheet.DoubleClickBehavior.INLINE_EDITOR.name());
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS, false);

public class DataEditorsPreferencesInitializer extends AbstractPreferenceInitializer {
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_LONG_AS_LOB, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM, false);
 * Unless required by applicable law or agreed to in writing, software
 *

 * See the License for the specific language governing permissions and
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE, 255);
 *     http://www.apache.org/licenses/LICENSE-2.0

        
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR, false);

 *
import org.jkiss.dbeaver.utils.PrefUtils;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_DESCRIPTION, false);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_CALC_COLUMN_WIDTH_BY_VALUES, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Common
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_DISABLE_IF_KEY_MISSING, false);

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_TAB_SIZE, 4);
 *
    @Override
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_ERRORS_IN_DIALOG, false);
        //PrefUtils.setDefaultPreferenceValue(store, NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE, DatabaseDataEditor.class.getName());

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.KEEP_STATEMENT_OPEN, false);
import org.jkiss.dbeaver.ui.data.IValueController;
 * distributed under the License is distributed on an "AS IS" BASIS,

    public void initializeDefaultPreferences() {
    }
    }
}
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_FILTER_AUTO_COMPLETE_PROPOSIAL, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_SEL_ROWS, false);

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_AUTO_SWITCH_MODE, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_SEL_CELLS, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER, true);
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.Spreadsheet;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS, true);
package org.jkiss.dbeaver.ui.editors.data.internal;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_USE_NAVIGATOR_FILTERS, true);
        // Override default editor page
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_CELL_ICONS, true);

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_AUTO_UPDATE_VALUE, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_MARK_CELL_VALUE_OCCURRENCES, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS, true);

        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE, 100);
 * limitations under the License.
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE, 1);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH, 30);
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_FILTERS_IN_SINGLE_TAB_MODE, true);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RS_GROUPING_SHOW_DUPLICATES_ONLY, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES, false);
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_SET_SHOW_SEL_COLUMNS, false);
        // Init default preferences
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        PrefUtils.setDefaultPreferenceValue(store, ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING, true);
