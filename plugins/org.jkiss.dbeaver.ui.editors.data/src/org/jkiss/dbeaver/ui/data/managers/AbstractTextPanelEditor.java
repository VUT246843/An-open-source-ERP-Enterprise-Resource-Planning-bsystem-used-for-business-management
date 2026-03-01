import org.jkiss.dbeaver.model.data.DBDContent;
import java.nio.file.Files;
        Composite cmpsInternalBase = new Composite(cmpsBase, SWT.NONE);
/**
        }
            UIUtils.setControlVisible(this, false);
    }
            wwAction.setChecked(editorControl.getWordWrap());

    }
        BaseTextEditor textEditor = getTextEditor();
        } catch (Exception e) {
import org.eclipse.swt.widgets.*;
                                    log.error("Can't refresh editor", e);
    protected abstract String getFileExtension();
                    }

        AutoFormatAction() {
            viewerSettings = UIUtils.getSettingsSection(
            });
            if (textWidget != null) {
                Files.deleteIfExists(tempFile);
            layout.marginWidth = 0;
    protected abstract String getFileFolderName();
    @Override
}
        }
        if (editorControl == null) {
        @Override
            }
            StyledText textWidget = textViewer.getTextWidget();

            if (adapter.isAssignableFrom(textEditor.getClass())) {
                button.setEnabled(false);
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        manager.add(new StyledTextUtils.StyledTextAction(IWorkbenchCommandConstants.EDIT_SELECT_ALL, true, control, ST.SELECT_ALL));
            //control.setWordWrap(wwEnabled);
            };
    private void reasignLayout(Composite cmpsInternalBase) {

import org.eclipse.ui.PartInitException;
            super(UIUtils.getActiveShell(), ResultSetMessages.panel_editor_text_encoding_title, null);
        }
        if (viewerSettings == null) {
                final Combo encodingCombo = UIUtils.createEncodingCombo(innerComposite, encoding);
    }
import org.eclipse.jface.text.TextViewer;
                editorControl.setWordWrap(false);
            }
        }
                        gc.dispose();
                    }
                    getPanelSettings().put(PREF_TEXT_EDITOR_ENCODING, dialog.getEncoding());

                    }
        protected Composite createDialogArea(@NotNull Composite parent) {
        public boolean isChecked() {
    implements IStreamValueEditorPersistent<StyledText>, DBPAdaptable {
            encoding = StandardCharsets.UTF_8.name();
        }

        cmpsBase.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
    }
                                try {
            }
    private static final Log log = Log.getLog(AbstractTextPanelEditor.class);
            return;
        initEditorSettings(editorControl);
        manager.add(new AutoFormatAction());
        }
        if (textEditor != null) {
                boolean oldEditable = textViewer.isEditable();
    protected abstract EDITOR createEditorParty(IValueController valueController);
            monitor.beginTask("Extract text", 1);
 *     http://www.apache.org/licenses/LICENSE-2.0
        messageBar = new MessageBar(cmpsBase);
                    updateCompletion();

 * DBeaver - Universal Database Manager
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;

                Files.deleteIfExists(tempFile);
    protected EDITOR getTextEditor() {

    public String minify(String value) {
                    }
            throw new DBException("Error loading text value", e);
        return editorControl;
        if (wwEnabled != control.getWordWrap()) {
        private final StyledText text;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        }
        if (editor == null) {
            );
        } finally {

        @Override
            applyEditorStyle();

                } finally {
                });
        }
        }
        } catch (IOException e) {
                                } catch (DBException e) {

                    return adapter.cast(textViewer.getUndoManager());
    }
                this,
 *
        if (editor != null) {

        IEditorSite subSite = new SubEditorSite(valueController.getValueSite());
                    if (editor != null) {
    }
import org.jkiss.dbeaver.ui.controls.StyledTextUtils;


        if (textEditor != null) {
    @Override
        if (contents == null) {
                            }
    }
            super(ResultSetMessages.panel_editor_text_auto_format_name, Action.AS_CHECK_BOX);
            this.text = text;
        @Override
        // Load contents in two steps (empty + real in async mode). Workaround for some
            TextViewer textViewer = editor.getTextViewer();
        }
        } else {
        @Override
import org.jkiss.dbeaver.ui.editors.content.ContentEditorInput;
            final int maxContentLength = store.getInt(ResultSetPreferences.RS_EDIT_MAX_TEXT_SIZE) * 1000;


        public boolean isChecked() {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (getPanelSettings().getBoolean(PREF_TEXT_EDITOR_MINIFY)) {
                final IEditorInput editorInput = editor.getEditorInput();
            }

    private static final String PREF_TEXT_EDITOR_ENCODING = "content.text.editor.encoding";

                        return;
            return;
            }
                () -> UIUtils.showPreferencesFor(getShell(), null, PrefPageResultSetEditors.PAGE_ID)
    @Override
            }
            value.updateContents(
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        return editor;
    private static class WordWrapAction extends StyledTextUtils.StyledTextActionEx {
    public boolean supportMinify() {
    private class AutoFormatAction extends Action {
            }
            try {
    private MessageBar messageBar;
        public void hideMessage() {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
            message = UIUtils.createInfoLink(
    }
        manager.add(ActionUtils.makeCommandContribution(editor.getSite(), IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE));
                button.setEnabled(true);
    public void contributeActions(@NotNull IContributionManager manager, @NotNull final StyledText control) {

 *
    private class SaveMinifyValue extends Action {
                    if (!oldEditable) {
                    encoding = encodingCombo.getText();
            manager.add(afAction);
        }
                messageBar.showMessage(NLS.bind(ResultSetMessages.panel_editor_text_content_limitation_lbl, lengthInBytes / 1000));
    private static final String PREF_TEXT_EDITOR_MINIFY = "content.text.editor.minify";
            super.createButtonsForButtonBar(parent);
            }
import org.eclipse.swt.graphics.Point;
            if (editor != null) {

import org.eclipse.jface.action.IAction;
                if (contentLength > 100000) {
        valueController.getEditPlaceholder().setLayout(lt);
                    textWidget.setWordWrap(true);
    }
                    setChecked(newWW);
    private void resetEditorInput() {
        assert editorControl != null;
                            textViewer.doOperation(ISourceViewer.FORMAT);

            //setChecked(newAF);
import org.eclipse.jface.text.IUndoManager;
            boolean newAF = !getPanelSettings().getBoolean(PREF_TEXT_EDITOR_AUTO_FORMAT);
    public void contributeSettings(@NotNull IContributionManager manager, @NotNull final StyledText editorControl) {
        }
        manager.add(new Separator());

import java.nio.file.Path;
        return viewerSettings;
        if (getPanelSettings().getBoolean(PREF_TEXT_EDITOR_AUTO_FORMAT)) {
        Composite cmpsBase = new Composite(valueController.getEditPlaceholder(), SWT.NONE);
import org.jkiss.dbeaver.ui.data.IValueController;
            message.setText(text);
    }
            super(ResultSetMessages.panel_editor_text_minify_name, Action.AS_CHECK_BOX);
    private static IDialogSettings viewerSettings;

            return null;
        if (textWidget == null || textWidget.isDisposed()) {
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
                editor.setInput(textInput);
        lt.marginHeight = 0;
public abstract class AbstractTextPanelEditor<EDITOR extends BaseTextEditor>
                        log.debug("Error formatting text: " + e.getMessage());
        try {
            throws DBException {
import org.jkiss.dbeaver.runtime.DBWorkbench;

            } catch (IOException e) {
            editorControl.setRedraw(false);
    private Path tempFile;
            log.error(e);
import org.jkiss.code.NotNull;
        String encoding = getPanelSettings().get(PREF_TEXT_EDITOR_ENCODING);
            if (tempFile != null) {
            layout.marginHeight = 0;
                try {


                }
                encodingCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
            return textEditor.getAdapter(adapter);
                editor.setInput(new StringEditorInput("Limited Content ", content, true, StandardCharsets.UTF_8.name()));
        cmpsInternalBase.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            editor.init(subSite, StringEditorInput.EMPTY_INPUT);
        }
        public ChangeEncodingDialog(@NotNull String defaultEncoding) {

            String text = control.getText();
                            if (control != null && !control.isDisposed()) {
            try {
            return composite;

import org.eclipse.ui.IEditorSite;
            final Composite composite = super.createDialogArea(parent);
import java.nio.charset.Charset;
    }
import org.jkiss.dbeaver.ui.data.IStreamValueEditorPersistent;
                                }
        try (final InputStream stream = contents.getContentStream()) {


import org.eclipse.ui.texteditor.ITextEditorActionConstants;
 */
        return value;

                monitor.done();
                editor.doSave(RuntimeUtils.getNestedMonitor(monitor));
        editor.addContextMenuContributor(manager -> contributeTextEditorActions(manager, editorControl));
            final GridLayout layout = new GridLayout();

            applyEditorStyle();
                new StringContentStorage(text));
                    getPanelSettings().put(PREF_TEXT_EDITOR_WORD_WRAP, newWW);
    private static final String PREF_TEXT_EDITOR_WORD_WRAP = "content.text.editor.word-wrap";
                editorControl.setWordWrap(false);

            return;


            if (supportMinify()) {

        }
            }
        private final Link message;
    }
            } finally {
            return getPanelSettings().getBoolean(PREF_TEXT_EDITOR_MINIFY);
    public static IDialogSettings getPanelSettings() {

            tempFile.toFile().deleteOnExit();
import org.jkiss.dbeaver.ui.UIUtils;
            updateCompletion();
            } else {
                    final EDITOR editor = getTextEditor();
    private void showRegularContent(StyledText editorControl, @NotNull DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
            Action wwAction = new Action(ResultSetMessages.panel_editor_text_word_wrap_name, Action.AS_CHECK_BOX) {
            return;
                    if (dialog.open() != IDialogConstants.OK_ID) {
    private IValueController valueController;
        public String getEncoding() {
        editor.createPartControl(cmpsInternalBase);

        StyledText editorControl = editor.getEditorControl();
import org.eclipse.ui.IWorkbenchCommandConstants;
    public StyledText createControl(IValueController valueController) {
        if (encoding == null) {
    }
            this.setShellStyle(SWT.DIALOG_TRIM);
        return null;
            }
 * you may not use this file except in compliance with the License.
        }
    }
                            final StyledText control = viewer.getTextWidget();
                }
                monitor,
            long contentLength = textInput.getContentLength();
    }
        @NotNull
        public void run() {
            afAction.setChecked(getPanelSettings().getBoolean(PREF_TEXT_EDITOR_AUTO_FORMAT));
    @Override
/*
                public void run() {

        UIUtils.syncExec(() -> {
                final Composite innerComposite = UIUtils.createComposite(composite, 1);
        }
                }
                innerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        SaveMinifyValue() {
                @Override
import org.jkiss.dbeaver.ui.ActionUtils;
        }
                        final TextViewer viewer = editor.getTextViewer();
 *
        Stream.of(children).forEach(c -> c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1)));
            UIUtils.setControlVisible(this, true);
                    GC gc = new GC(textWidget);


            }

                        textViewer.setEditable(true);

                    final ChangeEncodingDialog dialog = new ChangeEncodingDialog(getPanelSettings().get(PREF_TEXT_EDITOR_ENCODING));
import org.eclipse.jface.action.Action;
    private EDITOR editor;
        }
        StyledText textWidget = editor.getEditorControl();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        }
import org.eclipse.jface.action.Separator;
    }
        }
import org.eclipse.swt.custom.StyledText;
        }
                log.warn(e);
                                    primeEditorValue(new VoidProgressMonitor(), control, null);
    public void primeEditorValue(
        try {
    {
        DBDContentStorage contents = value.getContents(new VoidProgressMonitor());
        manager.add(new StyledTextUtils.StyledTextAction(IWorkbenchCommandConstants.EDIT_PASTE, control.getEditable(), control, ST.PASTE));
            final Action afAction = new AutoFormatAction();
            super(ITextEditorActionDefinitionIds.WORD_WRAP, Action.AS_CHECK_BOX);
        }
            UIUtils.createLabelSeparator(this, SWT.HORIZONTAL);
        manager.add(new Separator());
        } catch (PartInitException e) {
            if (textViewer != null) {
import org.eclipse.osgi.util.NLS;
        reasignLayout(cmpsInternalBase);
import org.eclipse.jface.text.source.ISourceViewer;
        @Nullable DBDContent value)
    }
                editor.setInput(StringEditorInput.EMPTY_INPUT);
import org.eclipse.swt.layout.GridLayout;
            getParent().layout(true, true);
                showRegularContent(editorControl, monitor);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            editorControl.setRedraw(true);
        if (editor == null) {
                return;
import org.jkiss.dbeaver.ui.editors.data.preferences.PrefPageResultSetEditors;
        if (valueController.getValue() instanceof DBDContent) {
        manager.removeAll();
        IAction preferencesAction = editor.getAction(ITextEditorActionConstants.CONTEXT_PREFERENCES);
                    try {
            log.error("Content value (LOB) is null");
    }
        public MessageBar(@NotNull Composite parent) {
        if (value == null) {
                ? valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore()
    @Nullable
import org.eclipse.swt.graphics.GC;
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
            getPanelSettings().put(PREF_TEXT_EDITOR_MINIFY, newMF);
        StyledText editorControl = editor.getEditorControl();
    }

    @Override
    private void showLimitedContent(StyledText editorControl, @NotNull DBDContent value, int lengthInBytes) throws DBCException, IOException {

                DataEditorsActivator.getDefault().getDialogSettings(),
                }
    protected void contributeTextEditorActions(@NotNull IContributionManager manager, @NotNull final StyledText control) {
                    }
    public <T> T getAdapter(@NotNull Class<T> adapter) {
    public void extractEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull StyledText control, @NotNull DBDContent value) throws DBException
            valueController.showMessage(e.getMessage(), DBPMessageType.ERROR);
        public boolean isChecked() {
import org.jkiss.dbeaver.model.exec.DBCException;
            resetEditorInput();
            } catch (Exception e) {

                        }
package org.jkiss.dbeaver.ui.data.managers;
import org.eclipse.swt.layout.GridData;
        manager.add(new StyledTextUtils.StyledTextAction(IWorkbenchCommandConstants.EDIT_COPY, selectionRange.y > 0, control, ST.COPY));
            super(parent, SWT.NONE);
                if (textViewer != null && textViewer.getUndoManager() != null) {
                        }
            log.error("Editor is null or undefined");
 * Unless required by applicable law or agreed to in writing, software
    
        @NotNull
        }

                text = minify(text);
            }
            manager.add(new Separator());
    @Override

            if (button == null) {
import java.io.IOException;
        editorControl.setEditable(!valueController.isReadOnly());
            this.tempFile = Files.createTempFile(DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), getFileFolderName()), "file", getFileExtension());
        @Override
        try {
            if (value.getContentLength() > maxContentLength) {
 * limitations under the License.
            manager.add(wwAction);
        }
            try {
        }

    }
                    try {
                    editorControl.setWordWrap(newWW);
        private String encoding;
            editor = null;
        WordWrapAction(StyledText text) {

                showLimitedContent(editorControl, value, maxContentLength);
    }
    public Path getExternalFilePath(@NotNull StyledText control) {
import java.nio.charset.StandardCharsets;

                    if (!oldEditable) {
                if (editorInput instanceof ContentEditorInput contentEditorInput) {
        final Point selectionRange = control.getSelectionRange();
                final Action msAction = new SaveMinifyValue();

                monitor.subTask("Extracting text from editor");

    private void applyEditorStyle() {
        cmpsInternalBase.setLayout(lt);
        manager.add(new WordWrapAction(control));
import org.jkiss.dbeaver.DBException;
    private static class ChangeEncodingDialog extends BaseDialog {
            getParent().layout(true, true);
        cmpsBase.setLayout(lt);
        }
        }
            return;
    public void disposeEditor() {
        public void run() {
            } else {
                "",
                TextViewer textViewer = textEditor.getTextViewer();
 * You may obtain a copy of the License at
        }

        messageBar.hideMessage();
        public void showMessage(@NotNull String text) {
                        if (textViewer.canDoOperation(ISourceViewer.FORMAT)) {

        }
            manager.add(preferencesAction);
        final TextViewer textViewer = editor.getTextViewer();

                messageBar.hideMessage();
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
        if (preferencesAction != null) {
        this.valueController = valueController;
            if (editor != null) {
            getPanelSettings().put(PREF_TEXT_EDITOR_AUTO_FORMAT, newAF);
import java.io.InputStream;
        final ContentEditorInput textInput = new ContentEditorInput(valueController, null, null, encoding, monitor);
        if (textEditor != null) {
        if (tempFile != null) {
            }

            });
        }
            final Button button = getButton(IDialogConstants.OK_ID);
        // strange bug in StyledText in E4.13 (#6701)
        private void updateCompletion() {


        Control[] children = cmpsInternalBase.getChildren();
            return text.getWordWrap();



    @Override
import org.jkiss.code.Nullable;
        }
                            NLS.bind(ResultSetMessages.panel_editor_text_loading_placeholder_label, contentLength), 0);

        lt.marginWidth = 0;
                        UIUtils.drawMessageOverControl(textWidget, gc,
        if (getPanelSettings().getBoolean(PREF_TEXT_EDITOR_WORD_WRAP)) {
                }
                public void run() {
    private void initEditorSettings(StyledText control) {



        @Override
        boolean wwEnabled = getPanelSettings().getBoolean(PREF_TEXT_EDITOR_WORD_WRAP);
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.custom.ST;
import org.jkiss.dbeaver.model.DBPAdaptable;
            UIUtils.asyncExec(() -> {
            manager.add(new Action(ResultSetMessages.panel_editor_text_encoding_name) {
        }
import org.eclipse.swt.SWT;
        }
        }
import java.util.stream.Stream;
                    } catch (Exception e) {

        //StyledTextUtils.fillDefaultStyledTextContextMenu(manager, control);
import org.eclipse.ui.IEditorInput;
            return getPanelSettings().getBoolean(PREF_TEXT_EDITOR_AUTO_FORMAT);
                        textViewer.setEditable(false);
                    boolean newWW = !editorControl.getWordWrap();

import org.jkiss.dbeaver.Log;
                editor.setInput(textInput);
    }
import org.eclipse.jface.action.IContributionManager;
        });
        }
            return encoding;
        @NotNull DBRProgressMonitor monitor, 
            setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                msAction.setChecked(getPanelSettings().getBoolean(PREF_TEXT_EDITOR_MINIFY));
        }
* AbstractTextPanelEditor
            return tempFile;
            final DBPPreferenceStore store = valueController.getExecutionContext() != null
                }
        BaseTextEditor textEditor = getTextEditor();
                    }
        }
        public void run() {
                : DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsActivator;
            return new StyledText(valueController.getEditPlaceholder(), SWT.NONE);
        @Override
        manager.add(new StyledTextUtils.StyledTextAction(IWorkbenchCommandConstants.EDIT_CUT, selectionRange.y > 0, control, ST.CUT));
        return false;
    }
            text.setWordWrap(!text.getWordWrap());
                @Override
            {
        }
        GridLayout lt = new GridLayout(1, false);
        }
            final String content = new String(displayingContentBytes);
            } catch (Exception ignored) {

            }
            // It must be execute in async mode. Otherwise StyledText goes mad and freezes UI
            editor.dispose();
    private static class MessageBar extends Composite {
                return adapter.cast(textEditor);
            boolean newMF = !getPanelSettings().getBoolean(PREF_TEXT_EDITOR_MINIFY);
    }
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
            applyEditorStyle();
                AbstractTextPanelEditor.class.getSimpleName());
                    contentEditorInput.updateContentFromFile(monitor, value);
 * See the License for the specific language governing permissions and
            applyEditorStyle();
            setLayout(layout);
            return;
        if (textViewer != null) {
        protected void createButtonsForButtonBar(@NotNull Composite parent) {
            if (adapter == IUndoManager.class) {
            monitor.done();

        {
                        if (viewer != null) {
        editor = createEditorParty(valueController);
            Files.writeString(tempFile, control.getText());
                }
                    } finally {
            this.encoding = defaultEncoding;
import org.jkiss.dbeaver.model.DBPMessageType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                manager.add(msAction);
        @NotNull StyledText control, 
                if (!textWidget.isDisposed()) {
        }
                Charset.forName(encoding);
            byte[] displayingContentBytes = stream.readNBytes(lengthInBytes);

        @Override
                messageBar.hideMessage();
                throw new DBException("Error extracting text from editor", e);
                encodingCombo.addModifyListener(event -> {
    private static final String PREF_TEXT_EDITOR_AUTO_FORMAT = "content.text.editor.auto-format";
    @Override
*/
