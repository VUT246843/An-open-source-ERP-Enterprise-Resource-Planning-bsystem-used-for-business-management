
    public void unselected(ITextViewer viewer) {
    }

 * You may obtain a copy of the License at
    public Point getSelection(IDocument document) {
}
        @Nullable String decorationString,
            } catch (BadLocationException ex) {
            ? null
                ? this.cachedSwtImage
public class SQLEditorQueryCompletionProposal extends SQLQueryCompletionProposal


import org.jkiss.dbeaver.ui.editors.sql.dialogs.SuggestionInformationControlCreator;
            : this.cachedSwtImage != null
import org.eclipse.swt.graphics.Point;
        // do nothing
        return this.image == null
 *     http://www.apache.org/licenses/LICENSE-2.0

            object,
    }
    public SQLEditorQueryCompletionProposalContext getProposalContext() {
        int proposalScore

    ) {
import org.eclipse.jface.text.contentassist.*;
 *
        @Nullable DBSObject object,
import org.jkiss.code.NotNull;
import org.eclipse.jface.text.BadLocationException;
        super(
        return result;
        @Nullable String displayString,
    @Override

            : SuggestionInformationControlCreator.INSTANCE;
    @Override
        return this.object == null || !this.getProposalContext().getActivityTracker().isAdditionalInfoExpected()

    }

 *

    public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
    @Override
    public StyledString getStyledDisplayString() {
                document.replace(this.replacementOffset, offset - this.replacementOffset, this.replacementString);

    ICompletionProposalExtension3, ICompletionProposalExtension4, ICompletionProposalExtension5, ICompletionProposalExtension6 {
        return true;
import org.jkiss.dbeaver.model.DBPImage;
            }
        return this.proposalContext;
            decorationString,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public boolean isAutoInsertable() {
            proposalContext,
    }
    public IInformationControlCreator getInformationControlCreator() {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionProposal;
        int replacementLength,
    @Override
            image,

    private final SQLEditorQueryCompletionProposalContext proposalContext;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
    @Override
        );
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
        if (this.validate(document, offset, null)) {
            replacementString,
        @NotNull SQLQueryCompletionItemKind itemKind,
        @NotNull String replacementString,
        return null;
        @NotNull String description,
import org.eclipse.jface.text.IInformationControlCreator;

    @Override
        }
import org.jkiss.utils.CommonUtils;
    @Override
import org.jkiss.code.Nullable;
    private Image cachedSwtImage = null;
        // do nothing
        StyledString result = new StyledString(this.getDisplayString(), this.proposalContext.getStyler(this.itemKind));

    implements ICompletionProposal, ICompletionProposalExtension2,
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public IContextInformation getContextInformation() {
    @Override
    }
 *
            replacementLength,
            filterString,
/*
    }
import org.eclipse.jface.text.IDocument;
            itemKind,
        IDocument document = viewer.getDocument();
    public SQLEditorQueryCompletionProposal(
    public Image getImage() {

    private static final Log log = Log.getLog(SQLEditorQueryCompletionProposal.class);
        @NotNull SQLEditorQueryCompletionProposalContext proposalContext,
            result.append(this.decorationString, StyledString.DECORATIONS_STYLER);
    public void selected(ITextViewer viewer, boolean smartToggle) {
 */
 * See the License for the specific language governing permissions and
import org.eclipse.swt.graphics.Image;
    @Override
            replacementOffset,
    }
                log.error("Error applying completion proposal", ex);
 * limitations under the License.
    @Override
        return new Point(Math.min(this.replacementOffset + this.replacementString.length(), document.getLength()), 0);
        @Nullable DBPImage image,

    }
            proposalScore
                : (this.cachedSwtImage = DBeaverIcons.getImage(this.image));
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryWordEntry;
 * you may not use this file except in compliance with the License.
        int replacementOffset,
        this.proposalContext = proposalContext;
    @NotNull
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItemKind;
            displayString,
            try {
            ? null

        if (CommonUtils.isNotEmpty(this.decorationString)) {
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        @Nullable SQLQueryWordEntry filterString,
package org.jkiss.dbeaver.ui.editors.sql.semantics;
 * Licensed under the Apache License, Version 2.0 (the "License");
            description,
 * DBeaver - Universal Database Manager
    }


