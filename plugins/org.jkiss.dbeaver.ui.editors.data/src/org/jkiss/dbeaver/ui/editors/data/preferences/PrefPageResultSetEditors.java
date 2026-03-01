        }
                1000, 1, Integer.MAX_VALUE
    @Override
        }
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
        {
                2
            }
 *
                binaryGroup,
            encodingCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    @NotNull
                binaryGroup,
    protected boolean supportsDataSourceSpecificOptions() {

    private Button commitOnEditApplyCheck;
    private Combo encodingCombo;
                store.contains(ModelPreferences.RESULT_SET_BINARY_PRESENTATION) ||
                binaryEditorType.select(0);

            if (editorType == IValueController.EditType.EDITOR) {
 * DBeaver - Universal Database Manager
    private Spinner maxTextContentSize;
import org.jkiss.dbeaver.model.DBValueFormatting;
            binaryStringMaxLength.setIncrement(1);
            commitOnEditApplyCheck.setSelection(store.getBoolean(ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY));
                store.contains(ModelPreferences.CONTENT_CACHE_MAX_SIZE) ||
 */
                    break;
    private Combo binaryEditorType;
            log.warn(e);
    @Override
    }
                store.contains(ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY)
                0,

    }
import org.jkiss.dbeaver.ui.data.IValueController;
 * You may obtain a copy of the License at
        contentCacheClob.setSelection(store.getDefaultBoolean(ModelPreferences.CONTENT_CACHE_CLOB));
            log.warn(e);
    private Button contentCacheBlob;
    protected Control createPreferenceContent(@NotNull Composite parent) {
 * limitations under the License.
            );

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

        }
            editLongAsLobCheck = UIUtils.createLabelCheckbox(
        contentCacheMaxSize.setSelection(store.getDefaultInt(ModelPreferences.CONTENT_CACHE_MAX_SIZE));
        }
                composite,
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
        binaryStringMaxLength.setSelection(store.getDefaultInt(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN));
            store.setValue(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR, stringUseEditorCheck.getSelection());
        store.setToDefault(ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE);
                ResultSetMessages.pref_page_database_resultsets_label_binary_editor_type,
                store.contains(ModelPreferences.MEMORY_CONTENT_MAX_SIZE) ||
            UIUtils.createControlLabel(binaryGroup, ResultSetMessages.pref_page_content_editor_hex_encoding);
        try {
import org.eclipse.swt.SWT;
                0,
                binaryPresentationCombo.add(formatter.getTitle());
import org.jkiss.dbeaver.utils.GeneralUtils;
                    binaryPresentationCombo.select(i);
            maxTextContentSize.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
            memoryContentSize.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

                store.contains(ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE) ||
/**
            DBDBinaryFormatter formatter

 * See the License for the specific language governing permissions and



            );

    }
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
            commitOnEditApplyCheck = UIUtils.createLabelCheckbox(contentGroup,
            );
import org.eclipse.swt.widgets.*;
            memoryContentSize.setSelection(store.getInt(ModelPreferences.MEMORY_CONTENT_MAX_SIZE));
        commitOnContentApplyCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY));
        store.setToDefault(ModelPreferences.CONTENT_CACHE_CLOB);
        //        setPreferenceStore(DBWorkbench.getPlatform().getPreferenceStore());
            IValueController.EditType editorType
        super();
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            store.setValue(ResultSetPreferences.RS_EDIT_LONG_AS_LOB, editLongAsLobCheck.getSelection());
            maxTextContentSize.setDigits(0);
                ResultSetMessages.pref_page_database_general_label_cache_max_size,
 *     http://www.apache.org/licenses/LICENSE-2.0
                store.contains(ModelPreferences.CONTENT_CACHE_BLOB) ||
    @Override
                store.contains(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN) ||
                ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE,
            store.setValue(ModelPreferences.CONTENT_CACHE_MAX_SIZE, contentCacheMaxSize.getSelection());
                binaryEditorType.select(1);
                true, 2

        commitOnEditApplyCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY));
                ResultSetMessages.pref_page_content_editor_group_content, 2, GridData.HORIZONTAL_ALIGN_BEGINNING

                    IValueController.EditType.PANEL.name()

            store.setValue(ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY, commitOnContentApplyCheck.getSelection());
            stringUseEditorCheck.setSelection(store.getBoolean(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR));
        {
                2
        return PAGE_ID;
        UIUtils.setComboSelection(encodingCombo, GeneralUtils.getDefaultFileEncoding());

        store.setToDefault(ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY);
    }
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
            store.setValue(ModelPreferences.CONTENT_HEX_ENCODING, UIUtils.getComboSelection(encodingCombo));
                binaryGroup,
import org.jkiss.dbeaver.Log;
        return composite;

            );
        store.setToDefault(ModelPreferences.CONTENT_HEX_ENCODING);
            editLongAsLobCheck.setSelection(store.getBoolean(ResultSetPreferences.RS_EDIT_LONG_AS_LOB));

        maxTextContentSize.setSelection(store.getDefaultInt(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE));
    protected void performDefaults() {
                binaryEditorType.getSelectionIndex() == 0 ?
 * Unless required by applicable law or agreed to in writing, software
            );
                store.contains(ModelPreferences.CONTENT_CACHE_CLOB) ||
            binaryStringMaxLength.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.code.NotNull;
                ResultSetMessages.pref_page_database_resultsets_group_string,
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
            }
            commitOnContentApplyCheck.setSelection(store.getBoolean(ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY));

        } catch (Exception e) {
                if (binaryPresentationCombo.getItem(i).equals(formatter.getTitle())) {
        store.setToDefault(ModelPreferences.RESULT_SET_BINARY_PRESENTATION);
                0,
                binaryGroup,
            contentCacheClob.setSelection(store.getBoolean(ModelPreferences.CONTENT_CACHE_CLOB));
        PrefUtils.savePreferenceStore(store);
        return
                    break;
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
    static final Log log = Log.getLog(PrefPageResultSetEditors.class);
        store.setToDefault(ResultSetPreferences.RS_COMMIT_ON_CONTENT_APPLY);
        store.setToDefault(ModelPreferences.CONTENT_CACHE_BLOB);
                0,
        Composite composite = UIUtils.createComposite(parent, 1);
                }
    @Override
            gd.horizontalSpan = 2;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                ResultSetMessages.pref_page_content_editor_checkbox_commit_on_content_apply, false
            binaryEditorType.add("Dialog");
            for (DBDBinaryFormatter formatter : DBConstants.BINARY_FORMATS) {

    private Button commitOnContentApplyCheck;
            binaryStringMaxLength = UIUtils.createLabelSpinner(
        store.setToDefault(ModelPreferences.CONTENT_CACHE_MAX_SIZE);
                }
    @Override


                = IValueController.EditType.valueOf(store.getString(ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE));
        store.setToDefault(ModelPreferences.MEMORY_CONTENT_MAX_SIZE);
                1024 * 1024 * 1024
    }
        {
                ResultSetMessages.pref_page_content_editor_checkbox_commit_on_value_apply, false
        store.setToDefault(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN);
        memoryContentSize.setSelection(store.getDefaultInt(ModelPreferences.MEMORY_CONTENT_MAX_SIZE));
        stringUseEditorCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR));
import org.eclipse.swt.layout.GridData;

 */
/*
        super.performDefaults();

    }
            Composite binaryGroup = UIUtils.createTitledComposite(
            for (DBDBinaryFormatter formatter : DBConstants.BINARY_FORMATS) {
}
import org.jkiss.dbeaver.model.DBConstants;
                ResultSetMessages.pref_page_database_general_label_max_lob_length,
    private Spinner memoryContentSize;

            );
import org.jkiss.dbeaver.ModelPreferences;
                    IValueController.EditType.EDITOR.name() :
 * Licensed under the Apache License, Version 2.0 (the "License");
            Composite stringGroup = UIUtils.createTitledComposite(
 * Copyright (C) 2010-2026 DBeaver Corp and others
        store.setToDefault(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE);
    }
            store.setValue(ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY, commitOnEditApplyCheck.getSelection());

    }
        binaryEditorType.select(IValueController.EditType.EDITOR.ordinal());

        editLongAsLobCheck.setSelection(store.getDefaultBoolean(ResultSetPreferences.RS_EDIT_LONG_AS_LOB));
                = DBValueFormatting.getBinaryPresentation(store.getString(ModelPreferences.RESULT_SET_BINARY_PRESENTATION));
        }
    @Override
            memoryContentSize = UIUtils.createLabelSpinner(
            for (int i = 0; i < binaryPresentationCombo.getItemCount(); i++) {

    private Spinner binaryStringMaxLength;
import org.jkiss.dbeaver.utils.PrefUtils;
            store.setValue(ModelPreferences.CONTENT_CACHE_CLOB, contentCacheClob.getSelection());
            );
            Composite contentGroup = UIUtils.createTitledComposite(composite,
            maxTextContentSize.setSelection(store.getInt(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE));
                0,
            } else {
                composite,
    }
                ResultSetMessages.pref_page_database_resultsets_label_binary_strings_max_length,
                SWT.DROP_DOWN | SWT.READ_ONLY

    @Override
            binaryGroup.setLayoutData(gd);
                store.contains(ResultSetPreferences.RS_EDIT_LONG_AS_LOB) ||
            );

            );
        try {
                ResultSetMessages.pref_page_database_resultsets_label_binary_presentation,
            contentCacheClob = UIUtils.createLabelCheckbox(binaryGroup, ResultSetMessages.pref_page_content_cache_clob, true);
package org.jkiss.dbeaver.ui.editors.data.preferences;
            }
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            store.setValue(ModelPreferences.MEMORY_CONTENT_MAX_SIZE, memoryContentSize.getSelection());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

import org.jkiss.dbeaver.runtime.DBWorkbench;
            store.setValue(ModelPreferences.CONTENT_CACHE_BLOB, contentCacheBlob.getSelection());
    private Button contentCacheClob;
                0,
            store.contains(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR) ||
        binaryPresentationCombo.select(store.getDefaultInt(ModelPreferences.RESULT_SET_BINARY_PRESENTATION));
            contentCacheMaxSize.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                binaryGroup,

import org.jkiss.dbeaver.ui.UIUtils;
                10000
        contentCacheBlob.setSelection(store.getDefaultBoolean(ModelPreferences.CONTENT_CACHE_BLOB));
                binaryGroup,
            binaryStringMaxLength.setSelection(store.getInt(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN));
                store.contains(ModelPreferences.CONTENT_HEX_ENCODING) ||
            maxTextContentSize.setIncrement(10);
            store.setValue(ModelPreferences.RESULT_SET_BINARY_STRING_MAX_LEN, binaryStringMaxLength.getSelection());

                ResultSetMessages.pref_page_database_resultsets_checkbox_string_use_editor_tip,
            );
        store.setToDefault(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR);
    private Combo binaryPresentationCombo;
            }
                ResultSetMessages.pref_page_database_resultsets_group_binary,
            memoryContentSize.setIncrement(1);
            );
                store.contains(ResultSetPreferences.RS_COMMIT_ON_EDIT_APPLY) ||
                SWT.DROP_DOWN | SWT.READ_ONLY
            store.setValue(
            );
            );
            ;
        return true;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                Integer.MAX_VALUE
                store.contains(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE) ||
                if (formatter.getTitle().equals(presentationTitle)) {
                ResultSetMessages.pref_page_content_editor_checkbox_edit_long_as_lobs,
            memoryContentSize.setDigits(0);
            binaryEditorType.add("Editor");

            contentCacheMaxSize.setDigits(0);
    private Button editLongAsLobCheck;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * PrefPageResultSetEditors
                ResultSetMessages.pref_page_database_resultsets_checkbox_string_use_editor,
                    store.setValue(ModelPreferences.RESULT_SET_BINARY_PRESENTATION, formatter.getId());

            store.setValue(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE, maxTextContentSize.getSelection());
    protected String getPropertyPageID() {
                false
            binaryStringMaxLength.setDigits(0);
            stringUseEditorCheck = UIUtils.createLabelCheckbox(stringGroup,
            maxTextContentSize = UIUtils.createLabelSpinner(contentGroup, ResultSetMessages.pref_page_content_editor_label_max_text_length,
    protected void clearPreferences(DBPPreferenceStore store) {
 *
            contentCacheMaxSize = UIUtils.createLabelSpinner(

public class PrefPageResultSetEditors extends TargetPrefPage {
            encodingCombo = UIUtils.createEncodingCombo(binaryGroup, GeneralUtils.getDefaultFileEncoding());

    @NotNull
        store.setToDefault(ResultSetPreferences.RS_EDIT_LONG_AS_LOB);
            contentCacheMaxSize.setIncrement(100000);
            contentCacheBlob = UIUtils.createLabelCheckbox(binaryGroup, ResultSetMessages.pref_page_content_cache_blob, true);
            String presentationTitle = binaryPresentationCombo.getItem(binaryPresentationCombo.getSelectionIndex());
            UIUtils.setComboSelection(encodingCombo, store.getString(ModelPreferences.CONTENT_HEX_ENCODING));

    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.resultset.editors"; //$NON-NLS-1$
            contentCacheMaxSize.setSelection(store.getInt(ModelPreferences.CONTENT_CACHE_MAX_SIZE));
            binaryEditorType = UIUtils.createLabelCombo(
 *
    private Button stringUseEditorCheck;
        } catch (Exception e) {
    public PrefPageResultSetEditors() {
 * you may not use this file except in compliance with the License.
        // Content
            );
            contentCacheBlob.setSelection(store.getBoolean(ModelPreferences.CONTENT_CACHE_BLOB));
    private Spinner contentCacheMaxSize;
            commitOnContentApplyCheck = UIUtils.createLabelCheckbox(contentGroup,
            binaryPresentationCombo = UIUtils.createLabelCombo(

