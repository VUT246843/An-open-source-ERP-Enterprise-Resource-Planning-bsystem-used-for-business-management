                replaceOn += extraString;
 *
            } else {
                            || nextChar == '\'' || nextChar == '"';
                StyledString.createColorRegistryStyler(ThemeConstants.SQL_EDITOR_COLOR_FUNCTION, null));


import org.jkiss.dbeaver.Log;
                // For keywords use strict matching
 * Licensed under the Apache License, Version 2.0 (the "License");
        int divPos = this.replacementFull.lastIndexOf(request.getContext().getSyntaxManager().getStructSeparator());
                    boolean hasClosingParenthesis = false;

            boolean matched;
        }
import org.jkiss.dbeaver.ui.editors.sql.dialogs.SuggestionInformationControlCreator;
 * See the License for the specific language governing permissions and
    public void selected(ITextViewer viewer, boolean smartToggle) {
                                if (textViewer != null) {
        SQLSyntaxManager syntaxManager = this.getRequest().getContext().getSyntaxManager();
                    }
        if (paramAlias != null && ((boolean) paramAlias)) {
        return true;
        }
                            if (activeEditor != null) {
                            insertTrailingSpace = !Character.isWhitespace(ch) || ch == '\r' || ch == '\n';
 *

                        // Do not append trailing space before closing parenthesis.
import org.eclipse.jface.text.contentassist.*;
        int divPos = wordPart.lastIndexOf(syntaxManager.getStructSeparator());
import org.eclipse.core.runtime.NullProgressMonitor;
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;

import java.util.Map;
        } catch (BadLocationException e) {
        }
    @Override
            }
            this.replacementLast = this.replacementFull.substring(divPos + 1);
                if (matched) {
 * you may not use this file except in compliance with the License.
                        }
                            insertTrailingSpace = true;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            if (extraString != null) {
    }
            return SuggestionInformationControlCreator.INSTANCE;
import org.jkiss.dbeaver.model.DBPNamedObject;
                matched = (score > 0 &&
    // ICompletionProposalExtension2
        Map<String, Object> params)
    public IContextInformation getContextInformation() {
            return false;
            this.replacementLast = null;
        return null;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import java.util.Locale;
            String replaceOn = replacementString;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    @Override
            isNeverAddSpaceAfter = true;
                            replaceOn += ' ';
import org.eclipse.ui.IEditorPart;

        return getReplacementOffset();

            if (!isNeverAddSpaceAfter && getDataSource() != null) {
 * DBeaver - Universal Database Manager
                int score = TextUtils.fuzzyScore(replacementFull, wordLower);
        if (!CommonUtils.isEmpty(wordPart)) {
    public boolean isAutoInsertable() {
                        // Call completion popup again
            return new StyledString(getDisplayString());
        }
    /*

        if (divPos == -1) {
import org.jkiss.dbeaver.model.text.TextUtils;
                        } else {
            if (divPos == wordPart.length() - 1) {
    }
                                    textViewer.getTextOperationTarget().doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
            log.debug(e);
    public String getAdditionalProposalInfo() {
                    }
    {
    }
            // ignore
                // It is valid only if full word matches (it should be the only proposal)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
                StyledString.createColorRegistryStyler(ThemeConstants.SQL_EDITOR_COLOR_KEYWORD, null));
            boolean matchContains = dataSource != null && dataSource.getContainer().getPreferenceStore().getBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS);
    @Override
                    }
                if (replacementString.equals(wordPart.substring(0, divPos))) {
        if (getProposalType() == DBPKeywordType.LITERAL) {
     */
                                }
    public CharSequence getPrefixCompletionText(IDocument document, int completionOffset) {
    @Override
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
                    } else if (hasClosingParenthesis) {
        String wordPart = wordDetector.getWordPart();
        return CommonUtils.toString(getAdditionalProposalInfo(new NullProgressMonitor()));
 */
        DBPImage objectImage = getObjectImage();
    }
        @Nullable DBPImage image,
            return styledString;
            styledString.append(getDisplayString(),


    }
 * SQL Completion proposal
    }
    @Override
        String replacementString,
                setPosition(wordDetector);
    public void unselected(ITextViewer viewer) {
            }

                matched = (matchContains ? replacementFull.contains(wordLower) : replacementFull.startsWith(wordLower)) &&
                                ITextViewer textViewer = activeEditor.getAdapter(ITextViewer.class);
 * Unless required by applicable law or agreed to in writing, software
        DBPDataSource dataSource = this.getRequest().getContext().getDataSource();

            }
        } else if (getProposalType() == DBPKeywordType.KEYWORD) {
                return true;
            if (matched) {
        int cursorPosition,

    public void apply(IDocument document) {
                        if (insertTrailingSpace) {
                        hasClosingParenthesis = nextChar == ')' || nextChar == '}' || nextChar == ']'
                return false;
            if (getObject() == null || !matchContains) {
            }
                    {
    }
    @Override
                            final char ch = document.getChar(replacementSum);
     * @see ICompletionProposal#getSelection(IDocument)
    @Override
                        });
    }
            // Beginning of the last part of composite id.
        String wordLower = wordPart.toLowerCase(Locale.ENGLISH);
        } else {
}
        }
            }
    @Override
            newOffset = document.getLength();
        if (event == null) {
            if (getObject() != null) {
                    setProposalScore(score);
    public Object getAdditionalProposalInfo(IProgressMonitor monitor) {
        return new Point(newOffset, 0);

import org.jkiss.dbeaver.model.DBPKeywordType;
    public IInformationControlCreator getInformationControlCreator() {
    @Override
import org.jkiss.utils.CommonUtils;
        }
import org.eclipse.swt.graphics.Image;
                    (this.replacementLast != null && TextUtils.fuzzyScore(this.replacementLast, wordLower) > 0);
    public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
        apply(viewer.getDocument());
 * limitations under the License.
                    boolean insertTrailingSpace;
        int newOffset = replacementOffset + cursorPosition + (replacementAfter == null ? 0 : replacementAfter.length());
                }
            StyledString styledString = new StyledString();
            return new StyledString(getDisplayString(),
        SQLCompletionRequest request,
            }
        return getAdditionalInfo(new DefaultProgressMonitor(monitor));

        return getReplacementString();
    public Point getSelection(IDocument document) {
        } else {
                StyledString.createColorRegistryStyler(ThemeConstants.SQL_EDITOR_COLOR_STRING, null));
import org.eclipse.swt.graphics.Point;
                    if (replacementSum < docLen) {


                }
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.core.runtime.IProgressMonitor;

            return null;
    @Override
        }
        if (newOffset > document.getLength()) {

        final SQLWordPartDetector wordDetector = new SQLWordPartDetector(document, syntaxManager, offset);
import org.jkiss.dbeaver.model.DBPDataSource;
                replaceOn += replacementAfter;
                    (CommonUtils.isEmpty(event.getText()) || replacementFull.contains(event.getText().toLowerCase(Locale.ENGLISH))) ||
    private final String replacementLast;
                    (this.replacementLast != null && this.replacementLast.startsWith(wordLower));
                    int replacementSum = replacementOffset + replacementLength;
            document.replace(replacementOffset, replacementLength, replaceOn);
    @Override
    //////////////////////////////////////////////////////////////////
    }
                    if (getObject() instanceof DBSObjectContainer) {
    }
    }
    @Override
        DBPKeywordType proposalType,
            if (replacementAfter != null) {
    @Override
    ICompletionProposalExtension2, ICompletionProposalExtension3, ICompletionProposalExtension4, ICompletionProposalExtension5,
    public SQLCompletionProposal(
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPImage;
import org.eclipse.jface.text.*;
/*
    }

            wordPart = wordPart.substring(divPos + 1);
package org.jkiss.dbeaver.ui.editors.sql.syntax;
    }
                            }
    public boolean validate(IDocument document, int offset, DocumentEvent event) {

                // For objects use fuzzy matching
        String description,
        } else if (divPos != -1) {
                            IEditorPart activeEditor = UIUtils.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            // Most likely it is a column name after an alias - all columns are valid
import org.eclipse.jface.text.source.ISourceViewer;
    private static final Log log = Log.getLog(SQLCompletionProposal.class);
        return objectImage == null ? null : DBeaverIcons.getImage(objectImage);
    public int getPrefixCompletionStart(IDocument document, int completionOffset) {
    ICompletionProposalExtension6 {
        super(request, displayString, replacementString, cursorPosition, image, proposalType, description, object, params);
                    (CommonUtils.isEmpty(event.getText()) || TextUtils.fuzzyScore(replacementFull, event.getText()) > 0)) ||
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                            cursorPosition++;
        } else {

                        char nextChar = document.getChar(replacementSum);
                        UIUtils.asyncExec(() -> {
 *
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
                }
    @Override
        } else if (getProposalType() == DBPKeywordType.FUNCTION) {
        String displayString,
import org.jkiss.code.Nullable;
        Object paramAlias = params.get(SQLCompletionProposalBase.PARAM_NO_SPACE);
                if (getDataSource().getContainer().getPreferenceStore().getBoolean(SQLPreferenceConstants.INSERT_SPACE_AFTER_PROPOSALS)) {
                return true;
            }
        try {
    @Override
        DBPNamedObject object,
            String extraString = getExtraString();
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
    
                        if (docLen <= replacementSum + 2) {
 */

import org.jkiss.dbeaver.ui.UIUtils;
                    int docLen = document.getLength();
        if (divPos != -1) {
    }
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
                    } else {
        this.getRequest().getActivityTracker().implicitlyTriggered();
                        }
        return false;
                        // Do not append trailing space after schemas/catalogs/etc.

    public StyledString getStyledDisplayString() {
    private boolean isNeverAddSpaceAfter = false;
public class SQLCompletionProposal extends SQLCompletionProposalBase implements ICompletionProposal,
    }
    public Image getImage() {
/**
            return new StyledString(getDisplayString(),
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;
        }
        }
        if (hasStructObject() && this.getRequest().getActivityTracker().isAdditionalInfoExpected()) {

