
import org.eclipse.swt.events.SelectionAdapter;
    }
                targetText.setFont(UIUtils.getMonospaceFont());
        private void loadOptions() {
            }
 *
    public void updateElement(UIElement element, Map parameters) {
        }
        private Map<String, Object> options = new HashMap<>();
                    formatPanel,
                            curFormat = (SQLTargetConverterDescriptor) e.widget.getData();
import org.eclipse.ui.menus.UIElement;

        {
                    options.put(CommonUtils.toString(entry.getKey()), entry.getValue());

        protected void okPressed() {

            return null;
import org.eclipse.jface.dialogs.IDialogSettings;
        }
import java.util.Map;
            }
                Composite settingsGroup = UIUtils.createTitledComposite(
                    SQLEditorMessages.pref_page_sql_format_label_settings,
        ISelection selection = editor.getSelectionProvider().getSelection();


import org.eclipse.swt.layout.GridLayout;
import org.eclipse.core.commands.ExecutionException;
        if (dialog.open() != IDialogConstants.OK_ID) {
import org.eclipse.jface.dialogs.IDialogConstants;
                    if (propValue != null) {
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
    public Object execute(ExecutionEvent event) throws ExecutionException
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
            }


    @Override
                formatPanel.setLayoutData(gd);
            }
            if (curFormat != null) {
        }
            }
                    formatPanel,
            } catch (DBException e) {
        private void onFormatChange() {
                final SelectionAdapter formatChangeListener = new SelectionAdapter() {
                    public void widgetSelected(SelectionEvent e) {
                propertySource = new PropertySourceCustom(curFormat.getProperties(), options);
            return editor.getExecutionContext();
                    }
 * DBeaver - Universal Database Manager
            if (okButton != null) {
                for (DBPPropertyDescriptor prop : curFormat.getProperties()) {
                    GridData.FILL_HORIZONTAL
            }
        if (textSelection.getLength() < 2) {
                Composite targetGroup = UIUtils.createPlaceholder(sash, 1, 5);
                SashForm sash = new SashForm(previewPanel, SWT.VERTICAL);
            super.createButtonsForButtonBar(parent);
        protected String getSQLText() {
        private PropertySourceCustom propertySource;
            Button okButton = getButton(IDialogConstants.OK_ID);
        return null;
    }
import java.util.HashMap;

        @Override
        @Override
                    formatSettings.put(CommonUtils.toString(entry.getKey()), CommonUtils.toString(entry.getValue()));
        TargetFormatDialog dialog = new TargetFormatDialog(editor, textSelection);
        @Override
                    }
                        if (((Button)e.widget).getSelection()) {
                                return;
            {
                StyledTextUtils.fillDefaultStyledTextContextMenu(targetText);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            loadOptions();
 * See the License for the specific language governing permissions and

            Composite composite = super.createDialogArea(parent);
    private static final Log log = Log.getLog(CopySourceCodeHandler.class);
import org.eclipse.core.commands.ExecutionEvent;
        }
        private final SQLEditor editor;
                sash.setLayoutData(new GridData(GridData.FILL_BOTH));
                propsViewer.getTree().addListener(SWT.Modify, new Listener() {
        }
                previewPanel.setLayout(new GridLayout(1, false));
                        editor.getDocument(),
import org.eclipse.jface.viewers.ISelection;
                previewPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
                        formatButton.setSelection(true);
                targetText.setLayoutData(new GridData(GridData.FILL_BOTH));
            return null;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        if (editor == null) {
            this.selection = selection;
            return this.selection.getText();
                IDialogSettings formatSettings = UIUtils.getSettingsSection(getDialogBoundsSettings(), curFormat.getId());
        }
        }

                    formatButton.setToolTipText(converter.getDescription());
                    @Override

import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
                }
                createSQLPanel(sash);

        UIUtils.setClipboardContents(Display.getCurrent(), TextTransfer.getInstance(), dialog.getConvertedText());
                Composite previewPanel = new Composite(composite, SWT.NONE);

            return null;
                IDialogSettings formatSettings = UIUtils.getSettingsSection(getDialogBoundsSettings(), curFormat.getId());
import org.jkiss.utils.CommonUtils;


            } else {

                    1,
public class CopySourceCodeHandler extends AbstractHandler implements IElementUpdater {
/*
            // Use active query
        {
import org.jkiss.dbeaver.utils.RuntimeUtils;

                    formatButton.setData(converter);
        }
import org.eclipse.core.commands.AbstractHandler;
 *
        }
        }
            if (activeQuery != null && activeQuery.getLength() > 1) {
                    formatButton.addSelectionListener(formatChangeListener);
                    formatButton.setText(converter.getLabel());
        }
                ISQLTextConverter converter = curFormat.createInstance(ISQLTextConverter.class);
package org.jkiss.dbeaver.ui.editors.sql.convert;
}                targetGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
    @Override
                if (curFormat == null) {
                    }
import org.eclipse.swt.widgets.*;
        private PropertyTreeViewer propsViewer;
                Composite formatsGroup = UIUtils.createTitledComposite(
                textSelection = new TextSelection(editor.getDocument(), activeQuery.getOffset(), activeQuery.getLength());
                propsViewer = new PropertyTreeViewer(settingsGroup, SWT.BORDER);
import org.jkiss.dbeaver.Log;
        }
                    Button formatButton = new Button(formatsGroup, SWT.RADIO);
import org.jkiss.dbeaver.DBException;
                            saveOptions();
import org.eclipse.ui.handlers.HandlerUtil;


 * distributed under the License is distributed on an "AS IS" BASIS,
                    GridData.FILL_HORIZONTAL
                Composite formatPanel = UIUtils.createPlaceholder(composite, 1);
                        refreshResult();
                for (Map.Entry<String, Object> entry : propertySource.getPropertiesWithDefaults().entrySet()) {
                    1,
                settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2026 DBeaver Corp and others

                targetText = new StyledText(targetGroup, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.WRAP);
            if (curFormat != null) {
        SQLEditorFeatures.SQL_EDITOR_COPY_AS_SOURCE_CODE.use();
            }
            return composite;
        }
        element.setText(SQLEditorMessages.editors_sql_actions_copy_as_source_code);
            super.okPressed();
        }
        protected void createButtonsForButtonBar(Composite parent)
                        options.put(CommonUtils.toString(prop.getId()), propValue);
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                result = CommonUtils.notEmpty(e.getMessage());
                    Object propValue = formatSettings.get(CommonUtils.toString(prop.getId()));
import org.eclipse.jface.text.TextSelection;
            if (curFormat != null) {
                refreshResult();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorFeatures;
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLConverterRegistry;
                    }
            }
        @Override
        TextSelection textSelection = (TextSelection) selection;
                        selection.getLength(),
                gd.minimumWidth = 200;
                            loadOptions();

        private void refreshResult() {
        protected DBCExecutionContext getExecutionContext() {
                });
                    if (propValue == null) {
                    if (curFormat == converter) {
                    SQLEditorMessages.sql_editor_panel_format,

                IDialogSettings dialogSettings = getDialogBoundsSettings();
import org.eclipse.ui.commands.IElementUpdater;
 * limitations under the License.
        protected Composite createDialogArea(Composite parent) {
                result = "Choose format";
                    public void handleEvent(Event event) {

        private static final String DIALOG_ID = "DBeaver.SQLTargetFormatDialog";//$NON-NLS-1$
        TargetFormatDialog(SQLEditor editor, TextSelection selection) {
 */
        @Override
        private void saveOptions() {
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLTargetConverterDescriptor;

import org.jkiss.dbeaver.ui.UIUtils;
                curFormat = SQLConverterRegistry.getInstance().getTargetConverter(formatId);
                        saveOptions();
            ((GridLayout)composite.getLayout()).numColumns = 2;
import org.eclipse.swt.custom.StyledText;
            {
import org.eclipse.swt.custom.SashForm;
            if (formatId != null) {
    {
            targetText.setText(result);
                }

import org.eclipse.swt.SWT;
                        selection.getOffset(),
            if (propertySource != null && curFormat != null) {
        private String result;
                        options);
                GridData gd = new GridData(GridData.FILL_BOTH);
            SQLScriptElement activeQuery = editor.extractActiveQuery();
                }
                UIUtils.createControlLabel(targetGroup, ModelMessages.controls_querylog_column_result_name);
 * Unless required by applicable law or agreed to in writing, software
                    log.warn("Can't find SQL text converter '" + formatId + "'");


                        targetText.setText(result);
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                };
                            }
import org.jkiss.dbeaver.ui.editors.sql.dialogs.BaseSQLDialog;
            onFormatChange();
                        editor.getSQLDialect(),
            return result;
                        editor.getSyntaxManager(),
            options.clear();
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        protected IDialogSettings getDialogBoundsSettings()
            super(editor.getSite(), SQLEditorMessages.sql_editor_menu_choose_format, null);
        private SQLTargetConverterDescriptor curFormat;
                            onFormatChange();

                dialogSettings.put("format", curFormat.getId());
            return UIUtils.getDialogSettings(DIALOG_ID);
                for (SQLTargetConverterDescriptor converter : SQLConverterRegistry.getInstance().getTargetConverters()) {
        String getConvertedText() {
import org.eclipse.swt.events.SelectionEvent;
                propsViewer.loadProperties(propertySource);
                        }
            this.editor = editor;
        if (selection.isEmpty() || !(selection instanceof TextSelection)) {
import org.eclipse.swt.dnd.TextTransfer;
        element.setTooltip(SQLEditorMessages.editors_sql_actions_copy_as_source_code_tip);
            String formatId = getDialogBoundsSettings().get("format");
            try {
import org.eclipse.swt.layout.GridData;
                okButton.setText(SQLEditorMessages.dialog_view_sql_button_copy);
            }
                );
                    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                }
        private final TextSelection selection;
                        propValue = prop.getDefaultValue();
import org.jkiss.dbeaver.model.messages.ModelMessages;
                log.error(e);

        }
                result = converter.convertText(

                        editor.getRuleScanner(),
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                            if (curFormat == e.widget.getData()) {
 *

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
                
                );

                saveOptions();
    }
    private static class TargetFormatDialog extends BaseSQLDialog {
                    @Override

        private StyledText targetText;
