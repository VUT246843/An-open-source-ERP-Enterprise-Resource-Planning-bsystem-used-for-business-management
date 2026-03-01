                    monitor,


        @Nullable SQLQueryWordEntry filterString,

import org.jkiss.dbeaver.model.navigator.DBNModel;
    protected final String decorationString;

                );

    @Override
                    new String[]{ this.getDisplayString() },
            this.cachedProposalInfoComputed = true;
    @Override
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            try {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    protected final DBSObject object;
        @NotNull String replacementString,
 * Licensed under the Apache License, Version 2.0 (the "License");


        return proposalScore;
        return this.itemKind.sortOrder;
            if (this.object != null) {
        }
        this.filterString = filterString;
    public int getReplacementOffset() {
        this.replacementOffset = replacementOffset;
                // preload object info, like at SQLCompletionAnalyzer.makeProposalsFromObject(..)

    public String getDisplayString() {
    }
            log.debug("validate @" + offset);
import org.eclipse.jface.text.DocumentEvent;
                DBNModel navModel = this.object.getDataSource().getContainer().getProject().getNavigatorModel();
 *
        this.object = object;
    public int getProposalScore() {
    protected Object cachedProposalInfo = null;
                    int filterKeyLength = offset - filterKeyStart;
    public SQLQueryCompletionProposal(
                Object info = SQLCompletionHelper.readAdditionalProposalInfo(
    }

                    return false;
    @Override
        this.itemKind = itemKind;
                this.cachedProposalInfo = info == null || info.equals(this.getDisplayString()) ? this.description : info;

import org.jkiss.code.NotNull;
        this.replacementLength = replacementLength;
        return this.proposalContext;
                    DBPKeywordType.KEYWORD
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

import org.eclipse.jface.text.BadLocationException;
        this.replacementString = replacementString;
    protected boolean cachedProposalInfoComputed = false;
                        String filterKey = document.get(filterKeyStart, filterKeyLength);
        int replacementLength,
        return this.cachedProposalInfo;
                log.error("Error validating completion proposal", ex);
    public int getPrefixCompletionStart(IDocument document, int completionOffset) {
                    navModel.getNodeByObject(monitor, this.object, true);
        return image;
}
                        return true;
    }
                    this.object,

    }
        this.description = description;
    public String getReplacementString() {
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
                this.cachedProposalInfo = this.description;
        }
    }
 *
    public Object getAdditionalProposalInfo(IProgressMonitor progressMonitor) {
    protected final SQLQueryWordEntry filterString;
        return CommonUtils.isNotEmpty(this.displayString) ? this.displayString : this.replacementString.replaceAll("[\r\n]", "");

        return true;
            log.error("Error applying completion proposal", ex);
        if (!this.cachedProposalInfoComputed) {
        this.image = image;
    }
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    protected final int replacementOffset;

    @NotNull
        return this.replacementOffset;
            }
        return this.replacementString;
    protected static final boolean DEBUG = false;

                // but maybe instead put it to SuggestionInformationControl.createTreeControl(..),
package org.jkiss.dbeaver.model.sql.semantics.completion;
import org.eclipse.core.runtime.IProgressMonitor;
                this.cachedProposalInfo = this.object;
        @Nullable String decorationString,
import org.jkiss.dbeaver.model.struct.DBSObject;
        int proposalScore
                    }
public class SQLQueryCompletionProposal extends CompletionProposalBase {
                } else {
        return this.displayString; // because actual replacement string includes extra whitespaces
        if (!this.getProposalContext().getActivityTracker().isAdditionalInfoExpected()) {
 * See the License for the specific language governing permissions and
    @Override
        return this.description;
            }
                        return this.proposalScore > 0;
    public void apply(IDocument document) {
        }
    protected final DBPImage image;
    @Override
        @NotNull SQLQueryCompletionItemKind itemKind,
    }
    public boolean isAutoInsertable() {
    private static final Log log = Log.getLog(SQLQueryCompletionProposal.class);
                        }



        this.getProposalContext().getActivityTracker().implicitlyTriggered();
    }
        return this.replacementLength;
                if (navModel != null) {
 * limitations under the License.
    public SQLQueryCompletionProposalContext getProposalContext() {
    ) {
        return this.replacementOffset;

    public DBPKeywordType getProposalType() {
 *
        return true;
        return this.itemKind;
        this.decorationString = decorationString;
        if (DEBUG) {
    public DBPImage getObjectImage() {
    protected final SQLQueryCompletionItemKind itemKind;

import org.jkiss.utils.CommonUtils;


/*
    public int getReplacementLength() {
    private final SQLQueryCompletionProposalContext proposalContext;
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.sql.completion.CompletionProposalBase;
                    this.proposalContext.getCompletionContext(),
        this.proposalContext = proposalContext;
        return null;

import org.jkiss.dbeaver.model.sql.completion.SQLCompletionHelper;
        this.displayString = displayString;
import org.eclipse.jface.text.IDocument;
                }
        @NotNull String description,
 */
        @Nullable String displayString,
    }
 * You may obtain a copy of the License at
    public CharSequence getPrefixCompletionText(IDocument document, int completionOffset) {
            document.replace(this.replacementOffset, this.replacementLength, this.replacementString);
    public String getAdditionalProposalInfo() {
    }
                        this.proposalScore = Integer.MAX_VALUE;
import org.jkiss.dbeaver.Log;
            return this.description;
            } else if (this.itemKind == SQLQueryCompletionItemKind.RESERVED) {
                        if (DEBUG) {
    protected int proposalScore;
    }
        int replacementOffset,
    protected final int replacementLength;

    }
            int filterKeyStart = this.filterString.offset >= 0 ? this.filterString.offset : this.proposalContext.getRequestOffset();
    protected final String description;

    public SQLQueryCompletionItemKind getItemKind() {
    protected final String displayString;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                //                where the DBNDatabaseNode is required but missing if not cached
        @Nullable DBPImage image,
    public boolean validate(IDocument document, int offset, DocumentEvent event) {
    }
        if (this.filterString != null && CommonUtils.isNotEmpty(this.filterString.filterString)) {

        }
import org.jkiss.dbeaver.model.DBPKeywordType;
            DBRProgressMonitor monitor = new DefaultProgressMonitor(progressMonitor);
            } else {

 * DBeaver - Universal Database Manager
    protected final String replacementString;

                if (offset > document.getLength()) {
        @NotNull SQLQueryCompletionProposalContext proposalContext,
                            log.debug("validate: " + filterString.string + " vs " + filterKey);

        try {
                    if (filterKeyLength > 0) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
import org.jkiss.dbeaver.model.DBPImage;
        this.proposalScore = proposalScore;
    public int getProposalTypeSorterScore() {
        } catch (BadLocationException ex) {

                }
            } catch (BadLocationException ex) {
        @Nullable DBSObject object,
        }
                        this.proposalScore = this.filterString.matches(filterKey, this.proposalContext.getCompletionContext().isSearchInsideNames());
                    } else {
