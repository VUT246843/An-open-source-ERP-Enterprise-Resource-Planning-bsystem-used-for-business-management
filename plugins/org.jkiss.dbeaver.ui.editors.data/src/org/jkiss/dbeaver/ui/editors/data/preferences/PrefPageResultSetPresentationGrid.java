    private Button colorizeDataTypes;
            );

                UIUtils.createPreferenceLink(
                DBDDisplayFormat.UI
                DataEditorsMessages.pref_page_result_selector_none,
        gridShowAttrIcons.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS));
    protected void performDefaults() {
        store.setToDefault(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN);
        try {
                DataEditorsMessages.pref_page_result_selector_paste_cell_value,
    private Text maxDefColumnWidth;
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX);
 * PrefPageResultSetGrid

import java.util.Locale;
            );
                    appearanceGroup,
 * Licensed under the Apache License, Version 2.0 (the "License");
            gridDoubleClickBehavior.add(
        showWhitespaceCharacters.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS));
    public PrefPageResultSetPresentationGrid() {
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
            showWhitespaceCharacters.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS));
    protected void clearPreferences(DBPPreferenceStore store) {
/**
        return
                    null
            );

package org.jkiss.dbeaver.ui.editors.data.preferences;
            );
import org.jkiss.dbeaver.Log;
            showWhitespaceCharacters = UIUtils.createCheckbox(appearanceGroup,
    @NotNull
import org.jkiss.dbeaver.ui.controls.ValueFormatSelector;
 * you may not use this file except in compliance with the License.
        PrefUtils.savePreferenceStore(store);
            showColumnPosition.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS));
    }
public class PrefPageResultSetPresentationGrid extends TargetPrefPage {
            );
 * distributed under the License is distributed on an "AS IS" BASIS,
            gridDoubleClickBehavior.add(
                DataEditorsMessages.pref_page_database_resultsets_label_use_smooth_scrolling_tip, false, 2

        store.setToDefault(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE);
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.Spreadsheet;
        {
        gridShowAttrOrder.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING));
            maxDefColumnWidth = UIUtils.createLabelText(appearanceGroup,
    }
            gridShowAttrOrder = UIUtils.createCheckbox(appearanceGroup,
                store.contains(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS) ||

            );
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
            );

        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING);
            gridShowAttrFilters = UIUtils.createCheckbox(appearanceGroup,
        store.setToDefault(ResultSetPreferences.RESULT_GRID_VALUE_FORMAT);
        maxDefColumnWidth.setText(String.valueOf(store.getDefaultInt(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH)));
                DataEditorsMessages.pref_page_database_resultsets_label_show_column_position,
            Composite appearanceGroup = UIUtils.createTitledComposite(
            gridDoubleClickBehavior.add(
    private static final Log log = Log.getLog(PrefPageResultSetPresentationGrid.class);
                DataEditorsMessages.pref_page_database_resultsets_label_max_def_column_width_tip);
            gridRowBatchSize.setText(store.getString(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE));
import org.eclipse.swt.SWT;
                store.contains(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES) ||
            useSmoothScrolling = UIUtils.createCheckbox(behaviorGroup,
            gridShowOddRows = UIUtils.createCheckbox(appearanceGroup,
    private Button toggleBooleanOnClick;
    }
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            //gridShowCellIcons = UIUtils.createCheckbox(uiGroup, DataEditorsMessages.pref_page_database_resultsets_label_show_cell_icons, null, false, 2);
                    "<a>" + DataEditorsMessages.pref_page_database_resultsets_label_show_boolean_config_link + "  - ''{0}''</a>",
            );
    @Override
                store.getString(ResultSetPreferences.RESULT_GRID_VALUE_FORMAT),
/*
                DataEditorsMessages.pref_page_result_selector_copy_cell,
            toggleBooleanOnClick = UIUtils.createCheckbox(behaviorGroup,
            );
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS, gridShowAttrIcons.getSelection());
    @NotNull
    private Button showColumnPosition;

 */
    }
                        store.getString(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK),
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * DBeaver - Universal Database Manager
                DataEditorsMessages.pref_page_database_resultsets_label_colorize_data_types, null, false, 2
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS, gridShowOddRows.getSelection());

                composite,
    private Button gridShowAttrIcons;
                Spreadsheet.DoubleClickBehavior.EDITOR.ordinal()
            toggleBooleanOnClick.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN));
 *
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
                store.contains(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS) ||
            gridShowAttrOrder.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING));
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_ordering,
    protected boolean supportsDataSourceSpecificOptions() {
                DataEditorsMessages.pref_page_database_resultsets_label_double_click_behavior, SWT.READ_ONLY
 *     http://www.apache.org/licenses/LICENSE-2.0
                    .ordinal());


            //store.setValue(ResultSetPreferences.RESULT_SET_SHOW_CELL_ICONS, gridShowCellIcons.getSelection());
                DataEditorsMessages.pref_page_database_resultsets_label_highlight_rows_with_selected_cells, null, false,
        colorizeDataTypes.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES));
            );
            gridShowAttrIcons = UIUtils.createCheckbox(appearanceGroup,
    @Override
                DataEditorsMessages.pref_page_database_resultsets_label_show_whitespace_characters,
 * See the License for the specific language governing permissions and
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS);
                CommonUtils.valueOf(
            );
            store.setValue(ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS, gridHighlightRowsWithSelectedCells.getSelection());
            );
            maxDefColumnWidth.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    @Override
                DataEditorsMessages.pref_page_database_resultsets_label_show_boolean_as_checkbox_tip, false, 2
    private Button gridHighlightRowsWithSelectedCells;
    private Text gridRowBatchSize;
            colorizeDataTypes = UIUtils.createCheckbox(appearanceGroup,
            Composite behaviorGroup = UIUtils.createTitledComposite(
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS);

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

            );
            store.setValue(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES, colorizeDataTypes.getSelection());
    @Override
            if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {
                DataEditorsMessages.pref_page_database_resultsets_label_show_whitespace_characters_tip, false, 2
                store.contains(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING) ||
                DataEditorsMessages.pref_page_database_resultsets_group_appearance,
        showBooleanAsCheckbox.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX));
    protected String getPropertyPageID() {
            textValueFormat.select(CommonUtils.valueOf(
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                        Spreadsheet.DoubleClickBehavior.class,
    private Combo gridDoubleClickBehavior;
            moveAfterInlineEnter.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_INLINE_ENTER));
                DataEditorsMessages.pref_page_database_resultsets_label_show_column_position_tip, false, 2
                store.contains(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH);
            gridDoubleClickBehavior.select(
    private ValueFormatSelector textValueFormat;
        try {
                    behaviorGroup,
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
        return true;
        return PAGE_ID;
            gridRowBatchSize = UIUtils.createLabelText(behaviorGroup,
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING, gridShowAttrOrder.getSelection());

import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
 *
            maxColumnWidth = maxColumnWidth < 0 ? 0 : maxColumnWidth > 100 ? 100 : maxColumnWidth;
                DataEditorsMessages.pref_page_database_resultsets_label_toggle_boolean_on_click,
    @Override
        store.setToDefault(ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS);
            gridHighlightRowsWithSelectedCells = UIUtils.createCheckbox(behaviorGroup,
            useSmoothScrolling.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING));
        store.setToDefault(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH);
    private Button useSmoothScrolling;
                Spreadsheet.DoubleClickBehavior.INLINE_EDITOR.ordinal()
            );
        } catch (Exception e) {
    protected Control createPreferenceContent(@NotNull Composite parent) {
            );
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_icons_tip, false, 2
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            gridRowBatchSize.setToolTipText(DataEditorsMessages.pref_page_database_resultsets_label_row_batch_size_tip);
                        Spreadsheet.DoubleClickBehavior.NONE
                store.contains(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE) ||
 * Copyright (C) 2010-2026 DBeaver Corp and others
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_filters_tip, false, 2
        }
                store.contains(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK) ||
        store.setToDefault(ResultSetPreferences.RESULT_SET_INLINE_ENTER);
            maxDefColumnWidth.setText(store.getString(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH));
                2,
        return composite;
    }
            showColumnPosition = UIUtils.createCheckbox(appearanceGroup,
 * You may obtain a copy of the License at
            colorizeDataTypes.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES));
                Spreadsheet.DoubleClickBehavior.COPY_VALUE.ordinal()
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_ordering_tip, false, 2
import org.eclipse.swt.layout.GridData;
import org.eclipse.jface.layout.GridDataFactory;
        toggleBooleanOnClick.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN));
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING

        moveAfterInlineEnter.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_INLINE_ENTER));
                ).setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
                Spreadsheet.DoubleClickBehavior.NONE.ordinal()
        } catch (Exception e) {
                    )
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX, showBooleanAsCheckbox.getSelection());

                store.contains(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS) ||
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.resultset.grid"; //$NON-NLS-1$
            store.setValue(ResultSetPreferences.RESULT_SET_MAX_COLUMN_DEF_WIDTH, maxColumnWidth);
            );
                DataEditorsMessages.pref_page_database_resultsets_label_use_smooth_scrolling,
            store.setValue(ResultSetPreferences.RESULT_GRID_VALUE_FORMAT, textValueFormat.getSelection().name());
            showBooleanAsCheckbox.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX));

    @Override
            log.warn(e);
            store.setValue(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING, useSmoothScrolling.getSelection());
            gridHighlightRowsWithSelectedCells.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS));
            ));
                DataEditorsMessages.pref_page_database_resultsets_label_enter_for_inline_behavior,
        gridHighlightRowsWithSelectedCells.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_HIGHLIGHT_SELECTED_ROWS));
                store.contains(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN) ||
    }
            );
            gridDoubleClickBehavior.add(
                    "org.jkiss.dbeaver.preferences.main.misc",
 */
    }
    private Button gridShowAttrFilters;
            );
                //store.contains(ResultSetPreferences.RESULT_SET_SHOW_CELL_ICONS) ||
            if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {
                2
                DBDDisplayFormat.class,
 * Unless required by applicable law or agreed to in writing, software
                store.contains(ResultSetPreferences.RESULT_SET_SHOW_BOOLEAN_AS_CHECKBOX) ||
        gridShowAttrFilters.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS));
import org.eclipse.swt.widgets.*;
                store.contains(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS) ||
        textValueFormat.select(DBDDisplayFormat.UI);
            );
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS);
        store.setToDefault(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS);
                DataEditorsMessages.pref_page_database_resultsets_label_enter_for_inline_behavior_tip, false, 2
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS, gridShowAttrFilters.getSelection());
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.NotNull;
            gridShowAttrIcons.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ICONS));
        gridRowBatchSize.setText(String.valueOf(store.getDefaultInt(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE)));
                2,
        super.performDefaults();
                DataEditorsMessages.pref_page_result_selector_editor,
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_icons,
            );
                    EditorUtils.COLORS_AND_FONTS_PAGE_ID,
            log.warn(e);
        UIUtils.setComboSelection(gridDoubleClickBehavior, store.getDefaultString(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK));
                DataEditorsMessages.pref_page_database_resultsets_label_toggle_boolean_on_click_tip, false, 2
                store.contains(ResultSetPreferences.RESULT_SET_SHOW_ATTR_ORDERING) ||
            gridDoubleClickBehavior = UIUtils.createLabelCombo(behaviorGroup,

                DataEditorsMessages.pref_page_database_resultsets_label_row_batch_size, "", SWT.BORDER
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                Spreadsheet.DoubleClickBehavior.COPY_PASTE_VALUE.ordinal()
    private Button gridShowAttrOrder;
 * limitations under the License.

                composite,
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS, showColumnPosition.getSelection());
}            }
        gridShowOddRows.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS));
        store.setToDefault(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING);
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
    @Override
                DataEditorsMessages.pref_page_database_resultsets_label_show_boolean_as_checkbox,
            store.setValue(ResultSetPreferences.RESULT_SET_ROW_BATCH_SIZE, CommonUtils.toInt(gridRowBatchSize.getText()));
                DataEditorsMessages.pref_page_database_resultsets_label_max_def_column_width, "", SWT.BORDER
            store.setValue(ResultSetPreferences.RESULT_SET_SHOW_WHITESPACE_CHARACTERS, showWhitespaceCharacters.getSelection());
            gridShowAttrFilters.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ATTR_FILTERS));

import org.jkiss.dbeaver.ui.UIUtils;
        }
        }
    protected void savePreferences(@NotNull DBPPreferenceStore store) {


    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {

                DataEditorsMessages.pref_page_database_resultsets_label_mark_odd_rows, null, false, 2
            );
                UIUtils.createPreferenceLink(
            gridDoubleClickBehavior.add(
            showBooleanAsCheckbox = UIUtils.createCheckbox(appearanceGroup,
import org.jkiss.dbeaver.utils.PrefUtils;
                DataEditorsMessages.pref_page_database_resultsets_group_behavior,
 *
    }
        store.setToDefault(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES);
            store.contains(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS) ||
                DataEditorsMessages.pref_page_database_resultsets_label_show_attr_filters,
    private Button showWhitespaceCharacters;
                ).setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());

            gridShowOddRows.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_SHOW_ODD_ROWS));
            textValueFormat = new ValueFormatSelector(appearanceGroup);
            store.setValue(ResultSetPreferences.RESULT_SET_INLINE_ENTER, moveAfterInlineEnter.getSelection());
            maxDefColumnWidth.setToolTipText(
            moveAfterInlineEnter = UIUtils.createCheckbox(behaviorGroup,
        super();
            int maxColumnWidth = CommonUtils.toInt(maxDefColumnWidth.getText());
    private Button gridShowOddRows;
        Composite composite = UIUtils.createPlaceholder(parent, 2, 5);
        store.setToDefault(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK);
    @Override
            store.setValue(ResultSetPreferences.RESULT_SET_CLICK_TOGGLE_BOOLEAN, toggleBooleanOnClick.getSelection());
                DataEditorsMessages.pref_page_result_selector_inline_editor,
        useSmoothScrolling.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_USE_SMOOTH_SCROLLING));
        showColumnPosition.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_SHOW_COLUMN_POS));
import org.jkiss.utils.CommonUtils;
    private Button moveAfterInlineEnter;
                    wpc, null
            store.setValue(ResultSetPreferences.RESULT_SET_DOUBLE_CLICK, CommonUtils.fromOrdinal(
    }
            );
                    DataEditorsMessages.pref_page_database_resultsets_link_colors_and_fonts,
    private Button showBooleanAsCheckbox;
                Spreadsheet.DoubleClickBehavior.class, gridDoubleClickBehavior.getSelectionIndex()).name());
                    wpc,
            }
