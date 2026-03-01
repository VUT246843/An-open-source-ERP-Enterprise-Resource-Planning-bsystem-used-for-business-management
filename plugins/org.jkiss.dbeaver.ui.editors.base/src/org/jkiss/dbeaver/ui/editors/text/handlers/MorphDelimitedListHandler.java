                ((GridData) leadingText.getLayoutData()).verticalAlignment = GridData.FILL;
        private String targetDelimiter;
                );
                boolean inIdentifier = false;
        static final String PARAM_TARGET_DELIMITER = "targetDelimiter";
import org.eclipse.jface.dialogs.IDialogSettings;
 */
                    morphSettings.getTrailingText(),
                if (settings.wrapLine > 0) {
            morphSettings.setTrailingText(trailingText.getText());
                    }

                    morphSettings.getWrapLine(),
                }
        protected Control createDialogArea(Composite parent)
        return buf.toString();
                        try {
        public MorphDelimitedListSettings() {
        @Override
    public static class ConfigDialog extends Dialog {
        }
            super.okPressed();
        @Override
            super(shell);
                lastLineFeed += settings.getQuoteString().length() * 2 + token.length();
            morphSettings = new MorphDelimitedListSettings();
            int textWidthHint = UIUtils.getFontHeight(parent) * 10;
            return group;
            morphSettings.setQuoteString("\"");
 * See the License for the specific language governing permissions and
                    targetGroup,
                    targetGroup,

        // Fix line feed
        private Combo quoteStringCombo;
 *
        BaseTextEditor textEditor = BaseTextEditor.getTextEditor(HandlerUtil.getActiveEditor(executionEvent));
import org.eclipse.swt.layout.GridLayout;
import java.util.StringTokenizer;
        return null;
                    morphSettings.setWrapLine(Integer.parseInt(settings.get(PARAM_WRAP_LINE)));
            super.configureShell(newShell);
        }

                    GridData.FILL_HORIZONTAL
        protected MorphDelimitedListSettings morphSettings;
                morphSettings.setSourceDelimiter(settings.get(PARAM_SOURCE_DELIMITER));
                ((GridData) leadingText.getLayoutData()).widthHint = textWidthHint;
                    char ch = token.charAt(k);
                    targetGroup,
            }
import org.eclipse.jface.text.IDocument;
            buf.append(settings.getTrailingText());
                }
            if (leadingSpaces > 0 || trailingSpaces > 0) {
            morphSettings.setTargetDelimiter(",");
            this.targetDelimiter = targetDelimiter;
import org.eclipse.core.commands.ExecutionEvent;
                        }
            return wrapLine;
            this.leadingText = leadingText;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return null;
            morphSettings.setLeadingText(leadingText.getText());
                    group,


import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;
            return leadingText;
                    false

        }
                            document.replace(textSelection.getOffset(), textSelection.getLength(), formattedText);
            } else {
                    SWT.BORDER | SWT.MULTI | SWT.V_SCROLL

        if (sourceDelimiter.contains("\n") && !sourceDelimiter.contains("\r")) {
            this.wrapLine = wrapLine;
        {
/*
                );
                    EditorsMessages.dialog_morph_delimited_target_group_label,
        private Combo targetDelimCombo;
                    targetGroup,
                leadingText = UIUtils.createLabelText(
                    2,
                        if (trailingSpaces > 0) {
            settings.put(PARAM_WRAP_LINE, morphSettings.getWrapLine());

                    Integer.MAX_VALUE
 * you may not use this file except in compliance with the License.

        private Text leadingText;
                }
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.*;
import java.util.List;
        public String getQuoteString() {

 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            buf.append(ch);
        if (!CommonUtils.isEmpty(settings.getTrailingText())) {
            }
            {
                Composite sourceGroup = UIUtils.createTitledComposite(
                    String formattedText = morphText(activeShell, textSelection.getText());
        @Override
            }
            if (settings.get(PARAM_WRAP_LINE) != null) {
        static final String PARAM_SOURCE_DELIMITER = "sourceDelimiter";
        @Override
        }
                );
import org.jkiss.dbeaver.ui.UIUtils;
                try {
                );
        private Text trailingText;
            if (!CommonUtils.isEmpty(settings.getQuoteString())) {
                ((GridData) trailingText.getLayoutData()).grabExcessVerticalSpace = true;
                    if (textSelection.getLength() <= 0) {
            }
                    EditorsMessages.dialog_morph_delimited_target_group_spinner_wrap_line,
    private String morphText(Shell activeShell, String text) {
        public void setQuoteString(String quoteString) {
            }
        for (int i = 0; i < tokens.size(); i++) {

import org.eclipse.jface.text.BadLocationException;
            if (settings.get(PARAM_TARGET_DELIMITER) != null) {

        @Override
    public Object execute(ExecutionEvent executionEvent) throws ExecutionException {
        {
    }
        }
package org.jkiss.dbeaver.ui.editors.text.handlers;
        protected final IDialogSettings settings;

            }
            return trailingText;
                    if (Character.isWhitespace(ch)) {
            morphSettings.setWrapLine(wrapLineAtColumn.getSelection());
                            trailingSpaces++;
        }
                if (selection instanceof ITextSelection textSelection) {
        public String getSourceDelimiter() {
 *
        }
 * DBeaver - Universal Database Manager
        }
}                    morphSettings.getTargetDelimiter(),
                for (int k = 0; k < token.length(); k++) {
 * Unless required by applicable law or agreed to in writing, software
                    }
        Shell activeShell = HandlerUtil.getActiveShell(executionEvent);
            return quoteString;

    }
            return true;
                    new String[] {"\"", "'"},

            this.trailingText = trailingText;
            return settings;
import org.jkiss.dbeaver.ui.UIWidgets;
            morphSettings.setQuoteString(CommonUtils.unescapeDisplayString(quoteStringCombo.getText()));
        List<String> tokens = new ArrayList<>();
        if (configDialog.open() != IDialogConstants.OK_ID) {
                trailingText = UIUtils.createLabelText(
            }

                token = token.substring(leadingSpaces, token.length() - trailingSpaces);
        }
                        lastLineFeed = 0;

                    EditorsMessages.dialog_morph_delimited_target_group_trailing_text,
                buf.append(settings.getQuoteString()).append(token).append(settings.getQuoteString());
        }
                buf.append(token);
                ((GridData) trailingText.getLayoutData()).verticalAlignment = GridData.FILL;
                    }
    @Override
                        inIdentifier = true;
        }
        public void setWrapLine(int wrapLine) {
                            DBWorkbench.getPlatformUI().showError("Morph text", "Error replacing text", e);
        static final String PARAM_QUOTE_STRING = "quoteString";
                        UIUtils.showMessageBox(activeShell, "Morph text", "Text selection is empty. You need to select some text to morph", SWT.ICON_INFORMATION);
                    if (formattedText != null) {
        private String trailingText;
import org.eclipse.swt.layout.GridData;
                            leadingSpaces++;
        public String getLeadingText() {
                sourceDelimCombo = UIWidgets.createDelimiterCombo(
                    GridData.FILL_BOTH
        int lastLineFeed = 0;
        private String leadingText;

        }
        }
        protected void configureShell(Shell newShell) {
import org.eclipse.jface.viewers.ISelection;
                Composite targetGroup = UIUtils.createTitledComposite(
        public int getWrapLine() {
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
                lastLineFeed += settings.getTargetDelimiter().length();
                        }
                    group,
            settings.put(PARAM_QUOTE_STRING, morphSettings.getQuoteString());
            {
            settings = UIUtils.getDialogSettings("MorphDelimitedListConfigDialog");
                        if (inIdentifier) {
            return sourceDelimiter;
 *
        StringTokenizer st = new StringTokenizer(text, sourceDelimiter);
                );
            settings.put(PARAM_LEADING_TEXT, morphSettings.getLeadingText());
            settings.put(PARAM_SOURCE_DELIMITER, morphSettings.getSourceDelimiter());
        while (st.hasMoreTokens()) {
import org.eclipse.core.commands.ExecutionException;
            if (settings.get(PARAM_QUOTE_STRING) != null) {
import org.eclipse.ui.handlers.HandlerUtil;
                    new String[] {"\n", "\t", ";", ","},
                ISelection selection = provider.getSelection();
import org.eclipse.jface.viewers.ISelectionProvider;

        static final String PARAM_TRAILING_TEXT = "trailingText";
                ((GridData) leadingText.getLayoutData()).grabExcessVerticalSpace = true;
        }

    }
import org.jkiss.utils.CommonUtils;
                ((GridData) sourceDelimCombo.getLayoutData()).widthHint = textWidthHint;
import org.eclipse.jface.text.ITextSelection;
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;

                    new String[] {"\n", "\t", ";", ","},
        private Spinner wrapLineAtColumn;
        StringBuilder buf = new StringBuilder();

                            trailingSpaces = 0;
        protected IDialogSettings getDialogBoundsSettings() {
        }
            IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
                quoteStringCombo = UIWidgets.createDelimiterCombo(
            Composite group = (Composite)super.createDialogArea(parent);


        }
                morphSettings.setTargetDelimiter(settings.get(PARAM_TARGET_DELIMITER));
                    EditorsMessages.dialog_morph_delimited_target_group_spinner_wrap_line_tip,
        }
            {

                    true
                );

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        static final String PARAM_LEADING_TEXT = "leadingText";
        private int wrapLine;

        }
                    sourceGroup,
        public void setSourceDelimiter(String sourceDelimiter) {
            return targetDelimiter;

                    EditorsMessages.dialog_morph_delimited_target_group_delim_quote,


            }
        public String getTrailingText() {
            if (settings.get(PARAM_SOURCE_DELIMITER) != null) {
        public String getTargetDelimiter() {
            }
                    SWT.BORDER | SWT.MULTI | SWT.V_SCROLL
        ConfigDialog configDialog = new ConfigDialog(activeShell);
                    if (!CommonUtils.isEmpty(settings.getQuoteString())) {
        if (!CommonUtils.isEmpty(settings.getLeadingText())) {
            }
        }
            int leadingSpaces = 0, trailingSpaces = 0;
        }
                morphSettings.setTrailingText(settings.get(PARAM_TRAILING_TEXT));
import java.util.ArrayList;
                    targetGroup,

        protected void okPressed() {
        private Combo sourceDelimCombo;
            morphSettings.setSourceDelimiter(CommonUtils.unescapeDisplayString(sourceDelimCombo.getText()));
        static final String PARAM_WRAP_LINE = "wrapLine";
        if (textEditor != null) {
                        nextTokenLength += settings.getQuoteString().length() * 2;
                morphSettings.setLeadingText(settings.get(PARAM_LEADING_TEXT));
        }
import org.eclipse.jface.dialogs.IDialogConstants;
            settings.put(PARAM_TARGET_DELIMITER, morphSettings.getTargetDelimiter());
            buf.append(settings.getLeadingText());
                ((GridData) trailingText.getLayoutData()).widthHint = textWidthHint;

        MorphDelimitedListSettings settings = configDialog.morphSettings;
                );
                        } else {
                );


            String token = tokens.get(i);
                    if (lastLineFeed + nextTokenLength > settings.wrapLine) {
            }
        String sourceDelimiter = settings.getSourceDelimiter();
            if (settings.get(PARAM_LEADING_TEXT) != null) {
                        }
            ((GridLayout)group.getLayout()).numColumns = 1;
                    // ignore
import org.eclipse.swt.SWT;
                lastLineFeed += token.length();
            return null;
                    }
        public void setTrailingText(String trailingText) {
            sourceDelimiter += "\r";
            tokens.add(st.nextToken());

        }
                } catch (NumberFormatException e) {
                    0,
                    morphSettings.getSourceDelimiter(),

                    }
            morphSettings.setWrapLine(80);
        }
            if (settings.get(PARAM_TRAILING_TEXT) != null) {
            }
        public void setTargetDelimiter(String targetDelimiter) {
                }
                    EditorsMessages.dialog_morph_delimited_target_group_delim_result,
                    int nextTokenLength = tokens.get(i + 1).length();
                targetDelimCombo = UIWidgets.createDelimiterCombo(
                    morphSettings.getLeadingText(),
            newShell.setText(EditorsMessages.dialog_morph_delimited_shell_text);
            morphSettings.setSourceDelimiter("\t\n,");
                wrapLineAtColumn = UIUtils.createLabelSpinner(

public final class MorphDelimitedListHandler extends AbstractTextHandler {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        protected ConfigDialog(Shell shell)
            this.quoteString = quoteString;
 * limitations under the License.

                    2,
    public static class MorphDelimitedListSettings {
        }
                    EditorsMessages.dialog_morph_delimited_target_group_leading_text,


        private String quoteString;
                    } else {
            if (provider != null) {
        }

            if (i < tokens.size() - 1) {
            this.sourceDelimiter = sourceDelimiter;

                    EditorsMessages.dialog_morph_delimited_source_group_delimiter,
                    EditorsMessages.dialog_morph_delimited_source_group,
                        } catch (BadLocationException e) {
                        buf.append("\n");
                    morphSettings.getQuoteString(),
                buf.append(settings.getTargetDelimiter());
        public void setLeadingText(String leadingText) {
            ISelectionProvider provider = textEditor.getSelectionProvider();
                    false
            morphSettings.setTargetDelimiter(CommonUtils.unescapeDisplayString(targetDelimCombo.getText()));
                morphSettings.setQuoteString(settings.get(PARAM_QUOTE_STRING));

        protected boolean isResizable() {

            settings.put(PARAM_TRAILING_TEXT, morphSettings.getTrailingText());
        private String sourceDelimiter;
