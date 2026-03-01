    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.resources"; //$NON-NLS-1$
            );

                SQLEditorMessages.pref_page_sql_editor_checkbox_bind_embedded_write,
                commentTypeEnableBlock = null;

                    @Override
    @Override
                }
/*
            tipLabel.setLayoutData(gd);
        }
    private Composite commentTypeComposite;
                2);
    @Override
                    }
        Composite composite = UIUtils.createComposite(parent, 1);
            final IEditorSite subSite = new SubEditorSite(UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite());
                scriptsGroup,
        try {
    }
 * limitations under the License.
                    @Nullable
                deleteEmptyCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                    }));
                deleteEmptyCombo.select(0);
                if (ch instanceof Button && ch.getData() == bindingType) {
    protected Control createPreferenceContent(@NotNull Composite parent) {
    public void init(IWorkbench workbench) {
            scriptTitlePattern = UIUtils.createLabelText(

    public PrefPageSQLResources() {
                expander,
        }

                SQLNewScriptTemplateVariablesResolver.ALL_VARIABLES_INFO,
        UIUtils.enableWithChildren(sqlTemplateViewerComposite, sqlTemplateEnabledCheckbox.getSelection());
                    @Override
        store.setValue(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_WRITE, bindEmbeddedWriteCheck.getSelection());
            Composite group = UIUtils.createTitledComposite(composite, SQLEditorMessages.pref_page_sql_editor_new_script_template_group, 1, GridData.FILL_BOTH);
    

import org.jkiss.dbeaver.runtime.DBWorkbench;
                    new StringContentProposalProvider(
                SQLEditorMessages.pref_page_sql_editor_checkbox_create_script_folders_tip,
                SQLEditorMessages.sql_editor_prefs_script_disable_sql_syntax_parsing_for_scripts_bigger_than



        final IDocument document = sqlTemplateViewer.getDocument();
            connectionFoldersCheck = UIUtils.createCheckbox(
                false

            for (Control ch : commentTypeComposite.getChildren()) {
                SQLPreferenceConstants.VAR_ACTIVE_DATABASE, SQLPreferenceConstants.VAR_ACTIVE_SCHEMA, SQLPreferenceConstants.VAR_ACTIVE_PROJECT);
                store.getBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_WRITE),
        connectionFoldersCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SCRIPT_CREATE_CONNECTION_FOLDERS));
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_FILE_EXT),
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        bigScriptFileSizeBoundarySpinner.setSelection(
    private Button autoFoldersCheck;
            bindEmbeddedReadCheck = UIUtils.createCheckbox(
        setSettings(store);
                    store.setValue(SQLPreferenceConstants.SCRIPT_BIND_COMMENT_TYPE, ch.getData().toString());
                    UIUtils.createRadioButton(commentTypeComposite, bt.getDescription(), bt, SelectionListener.widgetSelectedAdapter(selectionEvent -> {
            deleteEmptyCombo.setText(store.getDefaultString(SQLPreferenceConstants.SCRIPT_DELETE_EMPTY));
 * DBeaver - Universal Database Manager
        if (bindEmbeddedWriteCheck.getSelection()) {
            for (Control ch : commentTypeComposite.getChildren()) {

    private SQLScriptBindingType curScriptBindingType;
                        GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_DATABASE),
            log.error(e);

        enableCommentType();
        }
                scriptsGroup,
        PrefUtils.savePreferenceStore(store);

public class PrefPageSQLResources extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
                SQLEditorMessages.pref_page_sql_editor_new_script_template_variables,
import org.eclipse.swt.events.SelectionAdapter;

                SQLEditorMessages.pref_page_sql_editor_checkbox_bind_embedded_read,
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
    }
                SQLPreferenceConstants.VAR_ACTIVE_DATABASE, SQLPreferenceConstants.VAR_ACTIVE_SCHEMA, SQLPreferenceConstants.VAR_ACTIVE_PROJECT);
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_CONNECTION_NAME),
                sqlTemplateEnabledCheckbox.addSelectionListener(new SelectionAdapter() {
}        }
 *
 * See the License for the specific language governing permissions and
            }
        super.performDefaults();
                scriptsGroup,
    private static final Log log = Log.getLog(PrefPageSQLResources.class);

        store.setValue(SQLPreferenceConstants.SCRIPT_FILE_NAME_PATTERN, scriptFileNamePattern.getText());
        store.setValue(SQLPreferenceConstants.SCRIPT_TITLE_PATTERN, scriptTitlePattern.getText());
                @Override
import org.eclipse.swt.widgets.*;
            store.setValue(SQLPreferenceConstants.SCRIPT_DELETE_EMPTY,
            UIUtils.setComboSelection(deleteEmptyCombo, SQLPreferenceConstants.EmptyScriptCloseBehavior.getByName(
        return null;
        } catch (IllegalArgumentException e) {
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
            }
            scriptFileNamePattern = UIUtils.createLabelText(
import org.jkiss.dbeaver.ui.UIUtils;

    private Composite sqlTemplateViewerComposite;
                store.getString(SQLPreferenceConstants.SCRIPT_FILE_NAME_PATTERN));
                ((GridData) sqlTemplateViewerComposite.getLayoutData()).heightHint = 200;
            log.error(e);
                SQLEditorMessages.pref_page_sql_editor_checkbox_bind_embedded_read_tip,
import org.eclipse.swt.events.SelectionListener;
        // Resources
                new StringContentProposalProvider(
    public boolean performOk()
                2,
                });
            );
    }
 */
                SQLPreferenceConstants.VAR_CONNECTION_NAME, SQLPreferenceConstants.VAR_DRIVER_NAME,

 * distributed under the License is distributed on an "AS IS" BASIS,
                2,


                SQLEditorMessages.pref_page_sql_editor_checkbox_put_new_scripts,
                if (bt != SQLScriptBindingType.EXTERNAL) {
import org.eclipse.ui.IWorkbenchPropertyPage;
                    }
                    public DBCExecutionContext getExecutionContext() {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

                        UIUtils.enableWithChildren(sqlTemplateViewerComposite, sqlTemplateEnabledCheckbox.getSelection());
            bindEmbeddedWriteCheck = UIUtils.createCheckbox(
    private final boolean isStandaloneApp;
                        GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_DRIVER_NAME),
    }
                    new SmartTextContentAdapter(),
                2);
        bindEmbeddedWriteCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_WRITE));
            if (commentTypeEnableBlock != null) {
        }
 *
        enableCommentType();
import org.jkiss.dbeaver.utils.GeneralUtils;
                };
                sqlTemplateViewerComposite = UIUtils.createPlaceholder(group, 1);
                SQLEditorMessages.pref_page_sql_editor_checkbox_create_script_folders,
    {
                        GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_PROJECT)));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    private void enableCommentType() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            gd.horizontalSpan = 2;

                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_DATABASE),
        setSQLTemplateText(SQLEditorUtils.getNewScriptTemplate(store), false);
package org.jkiss.dbeaver.ui.editors.sql.preferences;
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_DRIVER_NAME),
import org.jkiss.code.NotNull;
        {
            bigScriptFileSizeBoundarySpinner = new Spinner(scriptsGroup, SWT.BORDER);
            }
        if (this.isStandaloneApp) {
        // Connection association
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            store.setValue(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE, document.get());
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPreferencePage;
            if (commentTypeEnableBlock == null) {
            expander.setText(SQLEditorMessages.sql_editor_prefs_script_advanced_settings);
                if (ch instanceof Button && ((Button) ch).getSelection()) {
    @Override
            UIUtils.setContentProposalToolTip(scriptFileNamePattern, SQLEditorMessages.pref_page_sql_editor_file_name_pattern_tip,
        store.setValue(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ, bindEmbeddedReadCheck.getSelection());
    }
            {
        }
        } catch (Exception e) {
                new SmartTextContentAdapter(),
        } catch (IllegalArgumentException e) {
                GridData.FILL_HORIZONTAL
                SQLEditorMessages.pref_page_sql_editor_group_connection_association,
                }
    }
            Composite connGroup = UIUtils.createTitledComposite(
    private Button sqlTemplateEnabledCheckbox;
    private void setSettings(@NotNull DBPPreferenceStore store) {
            bigScriptFileSizeBoundarySpinner.setDigits(0);
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_PROJECT),
    public void setElement(IAdaptable element) {
            commentTypeComposite = UIUtils.createComposite(connGroup, 1);
    }
            ContentAssistUtils.installContentProposal(
            if (this.isStandaloneApp) {
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
            );
        store.setValue(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE_ENABLED, sqlTemplateEnabledCheckbox.getSelection());
                store.getBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ),
                        return null;
        UIUtils.enableWithChildren(sqlTemplateViewerComposite, sqlTemplateEnabledCheckbox.getSelection());
    @NotNull
                    public void widgetSelected(SelectionEvent e) {
        }
    private Text scriptTitlePattern;
                connGroup,
        setScriptBindingTypes(SQLScriptBindingType.valueOf(store.getString(SQLPreferenceConstants.SCRIPT_BIND_COMMENT_TYPE)));
    private void setSQLTemplateText(@NotNull String text, boolean readOnly) {

    public IAdaptable getElement() {
                SQLEditorMessages.pref_page_sql_editor_file_name_pattern,
        }
                SQLEditorMessages.pref_page_sql_editor_checkbox_put_new_scripts_tip,
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
            UIUtils.createControlLabel(
    @Override
                2);

            sqlTemplateViewer.init(subSite, sqlInput);
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.swt.events.SelectionEvent;
            bigScriptFileSizeBoundarySpinner.setIncrement(50);
                SQLPreferenceConstants.EmptyScriptCloseBehavior.getByTitle(deleteEmptyCombo.getText()).name());
            });
            for (SQLScriptBindingType bt : SQLScriptBindingType.values()) {
                public void widgetSelected(SelectionEvent e) {
                scriptsGroup,
                scriptFileNamePattern,
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_FILE_NAME),
 * Unless required by applicable law or agreed to in writing, software

            sqlTemplateEnabledCheckbox = UIUtils.createCheckbox(
            bigScriptFileSizeBoundarySpinner.setMaximum(Integer.MAX_VALUE);
            expander.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false, 1, 1));
    }
                composite,

                connGroup,
                store.getBoolean(SQLPreferenceConstants.SCRIPT_AUTO_FOLDERS),
    private Button bindEmbeddedReadCheck;
                        GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_CONNECTION_NAME),
    @Override
            sqlTemplateViewer.reloadSyntaxRules();
        } else {
 * You may obtain a copy of the License at
            );
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                sqlTemplateViewerComposite.addDisposeListener(e -> sqlTemplateViewer.dispose());
                }
        }
                commentTypeEnableBlock = ControlEnableState.disable(commentTypeComposite);

            final StringEditorInput sqlInput = new StringEditorInput("SQL preview", text, readOnly, GeneralUtils.getDefaultFileEncoding());
        }
                }
import org.eclipse.jface.text.IDocument;
 *
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
import org.eclipse.jface.dialogs.ControlEnableState;
        try {
                SQLEditorMessages.pref_page_sql_editor_new_script_template_variables_tip,
        }
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
        bindEmbeddedReadCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ));
            
                setSQLTemplateText("", true);

                SQLEditorMessages.pref_page_sql_editor_new_script_template_enable_checkbox,
    @Override
import org.jkiss.code.Nullable;
        sqlTemplateEnabledCheckbox.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE_ENABLED));
import org.eclipse.ui.IWorkbench;
import org.jkiss.dbeaver.utils.PrefUtils;
                SQLPreferenceConstants.VAR_CONNECTION_NAME, SQLPreferenceConstants.VAR_DRIVER_NAME, SQLPreferenceConstants.VAR_FILE_NAME, SQLPreferenceConstants.VAR_FILE_EXT,
        autoFoldersCheck.setSelection(store.getDefaultBoolean(SQLPreferenceConstants.SCRIPT_AUTO_FOLDERS));
    private Spinner bigScriptFileSizeBoundarySpinner;
        // New Script template
            }
            UIUtils.setContentProposalToolTip(scriptTitlePattern, SQLEditorMessages.pref_page_sql_editor_file_name_pattern_tip,
            log.error(e);
        if (this.isStandaloneApp) {
        store.setValue(SQLPreferenceConstants.SCRIPT_AUTO_FOLDERS, autoFoldersCheck.getSelection());
                group,
                SQLEditorMessages.pref_page_sql_editor_title_pattern,
            autoFoldersCheck = UIUtils.createCheckbox(

                store.getString(SQLPreferenceConstants.SCRIPT_TITLE_PATTERN));
    }
        try {
 * you may not use this file except in compliance with the License.
                    ((Button) ch).setSelection(true);
                    enableCommentType();
            bigScriptFileSizeBoundarySpinner.setMinimum(0);
                sqlTemplateViewerComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

                SQLEditorMessages.pref_page_sql_editor_group_resources,
    private SQLEditorBase sqlTemplateViewer;
import org.eclipse.core.runtime.IAdaptable;
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
        store.setValue(SQLPreferenceConstants.SCRIPT_CREATE_CONNECTION_FOLDERS, connectionFoldersCheck.getSelection());
        scriptFileNamePattern.setText(store.getDefaultString(SQLPreferenceConstants.SCRIPT_FILE_NAME_PATTERN));
                }
    }
        return composite;
        scriptTitlePattern.setText(store.getDefaultString(SQLPreferenceConstants.SCRIPT_TITLE_PATTERN));
    private void setScriptBindingTypes(SQLScriptBindingType bindingType) {

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            }
import org.jkiss.dbeaver.ui.editors.sql.*;
            bindEmbeddedWriteCheck.addSelectionListener(new SelectionAdapter() {
            SQLUtils.generateCommentLine(null, SQLEditorMessages.pref_page_sql_editor_new_script_template_template), false);
        store.setValue(SQLPreferenceConstants.SCRIPT_BIG_FILE_LENGTH_BOUNDARY, bigScriptFileSizeBoundarySpinner.getSelection() * 1024L);
    private Button bindEmbeddedWriteCheck;
                sqlTemplateViewer.createPartControl(sqlTemplateViewerComposite);
                    GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA)));
            Label tipLabel = new Label(connGroup, SWT.WRAP);
            new VariablesHintLabel(

    private ControlEnableState commentTypeEnableBlock;


import org.eclipse.swt.layout.FillLayout;
                        GeneralUtils.variablePattern(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA),
 *     http://www.apache.org/licenses/LICENSE-2.0
            bigScriptFileSizeBoundarySpinner.setSelection((int) (bigScriptSize / 1024));
            tipLabel.setText(SQLEditorMessages.pref_page_sql_editor_checkbox_bind_connection_hint);

            Composite scriptsGroup = UIUtils.createTitledComposite(

import org.eclipse.ui.IEditorSite;
        if (this.isStandaloneApp) {
import org.jkiss.dbeaver.Log;
        setSQLTemplateText(
                    deleteEmptyCombo.add(escb.getTitle());
                store.getBoolean(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE_ENABLED));
                deleteEmptyCombo = UIUtils.createLabelCombo(scriptsGroup, SQLEditorMessages.pref_page_sql_editor_checkbox_delete_empty_scripts, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
            ContentAssistUtils.installContentProposal(
        return super.performOk();
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;

        if (document != null) {
    }
                sqlTemplateViewerComposite.setLayout(new FillLayout());
import org.jkiss.dbeaver.model.sql.SQLUtils;
                2);
        isStandaloneApp = !DBWorkbench.isDistributed();
        {
        setScriptBindingTypes(SQLScriptBindingType.NAME);
    private Button connectionFoldersCheck;
                for (SQLPreferenceConstants.EmptyScriptCloseBehavior escb : SQLPreferenceConstants.EmptyScriptCloseBehavior.values()) {
            }
            (int) (store.getDefaultLong(SQLPreferenceConstants.SCRIPT_BIG_FILE_LENGTH_BOUNDARY) / 1024));
        super();
                        curScriptBindingType = (SQLScriptBindingType)selectionEvent.widget.getData();
    protected void performDefaults() {
    private Combo deleteEmptyCombo;
 * PrefPageSQLResources
                scriptsGroup,
 */
            final ExpandableComposite expander = new ExpandableComposite(composite, SWT.NONE);
/**

                commentTypeEnableBlock.restore();
            long bigScriptSize = store.getLong(SQLPreferenceConstants.SCRIPT_BIG_FILE_LENGTH_BOUNDARY);


                SQLEditorMessages.pref_page_sql_editor_checkbox_bind_embedded_write_tip,
                group,
        {
                sqlTemplateViewer = new SQLEditorBase() {
                scriptTitlePattern,
                    store.getString(SQLPreferenceConstants.SCRIPT_DELETE_EMPTY)).getTitle());
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                store.getBoolean(SQLPreferenceConstants.SCRIPT_CREATE_CONNECTION_FOLDERS),
    private Text scriptFileNamePattern;

                GridData.FILL_HORIZONTAL
            expander.setClient(connGroup.getParent());
