 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
public class SQLCompletionSorterUI implements ICompletionProposalSorter {
        if (!(p1 instanceof CompletionProposalBase completionProposalBase1)
 * You may obtain a copy of the License at
}
    }
            prefStore.getBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS));
 *

            || !(p2 instanceof CompletionProposalBase completionProposalBase2)) {

        return sqlCompletionProposalComparator.compare(completionProposalBase1, completionProposalBase2);
    public int compare(ICompletionProposal p1, ICompletionProposal p2) {
        this.editor = editor;
    }
package org.jkiss.dbeaver.ui.editors.sql.syntax;
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLCompletionProposalComparator;
 * Unless required by applicable law or agreed to in writing, software
        DBPPreferenceStore prefStore = this.editor.getActivePreferenceStore();
    }
    private final SQLEditorBase editor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
    public void refreshSettings() {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
            prefStore.getBoolean(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY),
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*

            prefStore.getBoolean(SQLPreferenceConstants.PROPOSALS_MATCH_CONTAINS));

 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        sqlCompletionProposalComparator = new SQLCompletionProposalComparator(
        }
 * limitations under the License.

 *
import org.jkiss.dbeaver.model.sql.completion.CompletionProposalBase;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.text.contentassist.ICompletionProposalSorter;
            return 0;
 * Completion sorter
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
    @Override
    public SQLCompletionSorterUI(SQLEditorBase editor) {
        sqlCompletionProposalComparator = new SQLCompletionProposalComparator(
 */
    private SQLCompletionProposalComparator sqlCompletionProposalComparator;
/**
        DBPPreferenceStore prefStore = this.editor.getActivePreferenceStore();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            prefStore.getBoolean(SQLPreferenceConstants.PROPOSAL_SORT_ALPHABETICALLY),
 */
