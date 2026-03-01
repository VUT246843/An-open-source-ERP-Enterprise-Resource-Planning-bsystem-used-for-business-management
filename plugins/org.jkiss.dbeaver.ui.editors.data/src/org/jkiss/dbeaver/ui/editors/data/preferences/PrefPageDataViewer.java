            UIUtils.createInfoLabel(group, ResultSetMessages.getPref_page_data_viewer_dictionary_panel_results_max_size_tip);
    }
        }
    private Text maxAmountText;
                    }
                    if (name != null) {
            final ToolItem removeButton = UIUtils.createToolItem(toolbar, ResultSetMessages.pref_page_data_viewer_reference_panel_desc_column_keywords_remove_button, UIIcon.DELETE, new SelectionAdapter() {
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer container) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
        store.setValue(ModelPreferences.RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS, buffer.toString());
                @Override
import org.jkiss.code.Nullable;
        if (name != null) {
        return null;
                    final boolean selected = refPanelDescColumnKeywords.getSelectionIndex() >= 0;
        maxAmountText.setText(store.getString(ModelPreferences.DICTIONARY_MAX_ROWS));
                    refPanelDescColumnKeywords.remove(index);
                    final int index = refPanelDescColumnKeywords.getSelectionIndex();
        for (String pattern : DBVEntity.DEFAULT_DESCRIPTION_COLUMN_PATTERNS) {
            refPanelDescColumnKeywords.add(pattern);
        for (String pattern : refPanelDescColumnKeywords.getItems()) {
        }
 *
    }
        return true;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            });
    protected String getPropertyPageID() {
    }
import org.jkiss.dbeaver.ui.UIUtils;
                    editButton.setEnabled(selected);
        return PAGE_ID;

    protected boolean supportsDataSourceSpecificOptions() {


    @Override
    @NotNull
            });
    private String promptKeywordName(@Nullable String value) {
            final ToolBar toolbar = new ToolBar(group, SWT.VERTICAL);
import java.util.StringJoiner;
                        refPanelDescColumnKeywords.setItem(index, name);
                public void widgetSelected(SelectionEvent e) {
            refPanelDescColumnKeywords.addSelectionListener(new SelectionAdapter() {

    protected void performDefaults() {
                "200"
    @Override


package org.jkiss.dbeaver.ui.editors.data.preferences;
 * Unless required by applicable law or agreed to in writing, software
                    final String name = promptKeywordName(refPanelDescColumnKeywords.getItem(index));
    @Nullable
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                2,
import java.util.Locale;
    private List refPanelDescColumnKeywords;
                        refPanelDescColumnKeywords.select(refPanelDescColumnKeywords.getItemCount() - 1);
                    final int index = refPanelDescColumnKeywords.getSelectionIndex();
                @Override
                @Override
    protected Control createPreferenceContent(@NotNull Composite parent) {
            refPanelDescColumnKeywords.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    @Override
    }
        }
import org.eclipse.swt.layout.GridData;
                        refPanelDescColumnKeywords.add(name);
                ResultSetMessages.pref_page_data_viewer_reference_panel_group,
                        refPanelDescColumnKeywords.notifyListeners(SWT.Selection, new Event());
            || store.contains(ModelPreferences.DICTIONARY_MAX_ROWS);
    @NotNull
        return store.contains(ModelPreferences.RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS)
    @Override
import org.eclipse.swt.SWT;
                    final String name = promptKeywordName(null);
 * You may obtain a copy of the License at

                ResultSetMessages.getPref_page_data_viewer_dictionary_panel_results_max_size,
 * DBeaver - Universal Database Manager
            return name;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            buffer.add(pattern);

    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.dataviewer";
        return super.isValid() && !maxAmountText.getText().isEmpty();
        return composite;

            ((GridData) refPanelDescColumnKeywords.getLayoutData()).heightHint = UIUtils.getFontHeight(refPanelDescColumnKeywords) * 15;
                group,
public class PrefPageDataViewer extends TargetPrefPage {
    protected void clearPreferences(DBPPreferenceStore store) {
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
    @Override
 */

                ResultSetMessages.pref_page_data_viewer_dictionary_panel_group, 1, GridData.FILL_HORIZONTAL);
/*
            });
                }
 * limitations under the License.
        refPanelDescColumnKeywords.removeAll();
                @Override

    public boolean isValid() {
            name = name.toLowerCase(Locale.ENGLISH).strip();
        }
                GridData.FILL_HORIZONTAL
        {
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
            maxAmountText.addModifyListener((event) -> {
    @Override
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {

        final StringJoiner buffer = new StringJoiner("|");
        final Composite composite = UIUtils.createComposite(parent, 1);
            refPanelDescColumnKeywords = new List(group, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
 *
                    refPanelDescColumnKeywords.select(CommonUtils.clamp(index, 0, refPanelDescColumnKeywords.getItemCount() - 1));
    @Override

import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
        String name = EnterNameDialog.chooseName(getShell(), ResultSetMessages.pref_page_data_viewer_reference_panel_desc_column_keywords_prompt_title, value);
            UIUtils.createControlLabel(group, ResultSetMessages.pref_page_data_viewer_reference_panel_desc_column_keywords_label, 2);
                    if (name != null) {

import org.jkiss.dbeaver.ModelPreferences;
        refPanelDescColumnKeywords.removeAll();
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
        refPanelDescColumnKeywords.notifyListeners(SWT.Selection, new Event());
 * distributed under the License is distributed on an "AS IS" BASIS,
                public void widgetSelected(SelectionEvent e) {
    }
                    }
import org.eclipse.swt.widgets.*;
    }
                }
 * you may not use this file except in compliance with the License.
    }

        store.setToDefault(ModelPreferences.RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS);
            Composite group = UIUtils.createTitledComposite(composite,
            refPanelDescColumnKeywords.add(pattern);
        store.setToDefault(ModelPreferences.DICTIONARY_MAX_ROWS);
        }
                getContainer().updateButtons();
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (String pattern : DBVEntity.getDescriptionColumnPatterns(store)) {
            );

import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
    }
 *

import org.jkiss.utils.CommonUtils;
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
                    removeButton.setEnabled(selected);
import org.jkiss.code.NotNull;
            final ToolItem editButton = UIUtils.createToolItem(toolbar, ResultSetMessages.pref_page_data_viewer_reference_panel_desc_column_keywords_edit_button, UIIcon.EDIT, new SelectionAdapter() {
 * Licensed under the Apache License, Version 2.0 (the "License");

}
                }
        maxAmountText.setText(getTargetPreferenceStore().getDefaultString(ModelPreferences.DICTIONARY_MAX_ROWS));
                }
            });

        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
        final DBPPreferenceStore store = container.getPreferenceStore();
                    refPanelDescColumnKeywords.notifyListeners(SWT.Selection, new Event());
    }
        {
import org.eclipse.swt.events.SelectionAdapter;
        store.setValue(ModelPreferences.DICTIONARY_MAX_ROWS, maxAmountText.getText());
                public void widgetSelected(SelectionEvent e) {
        if (CommonUtils.isNotEmpty(name) && refPanelDescColumnKeywords.indexOf(name) < 0) {
 * See the License for the specific language governing permissions and
            );
import org.jkiss.dbeaver.ui.UIIcon;
            maxAmountText = UIUtils.createLabelText(
                public void widgetSelected(SelectionEvent e) {
        }
            Composite group = UIUtils.createTitledComposite(
            toolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                composite,
            });
                updateApplyButton();
            UIUtils.createToolItem(toolbar, ResultSetMessages.pref_page_data_viewer_reference_panel_desc_column_keywords_add_button, UIIcon.ADD, new SelectionAdapter() {
            maxAmountText.addVerifyListener(UIUtils.getNumberVerifyListener(Locale.getDefault()));
    public PrefPageDataViewer() {
