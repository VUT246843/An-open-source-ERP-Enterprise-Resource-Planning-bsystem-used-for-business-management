
 * DBeaver - Universal Database Manager
    private int compareWhenPrefixSearch(CompletionProposalBase p1, CompletionProposalBase p2) {
            }

                return rc;
        int score2 = p2.getProposalScore();
            return this.compareWhenPrefixSearch(p1, p2);
    private int compareWhenFuzzySearch(CompletionProposalBase p1, CompletionProposalBase p2) {


        }
import org.jkiss.dbeaver.model.sql.completion.CompletionProposalBase;
        int krc = Integer.compare(p1.getProposalTypeSorterScore(), p2.getProposalTypeSorterScore());
 * Unless required by applicable law or agreed to in writing, software

            if (rc != 0) {
        // by match score, by text, by kind
    }
        }
        // all the unmatched completely filtered out already, so
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (score1 == Integer.MAX_VALUE && score2 == Integer.MAX_VALUE) {
        }
        return 0;
 * You may obtain a copy of the License at
        if (this.isSearchInsideNames) {
        if (score1 > 0 || score2 > 0) {
            int rc = p1.getDisplayString().compareToIgnoreCase(p2.getDisplayString());
        this.isSearchInsideNames = isSearchInsideNames;
            int rc = p1.getDisplayString().compareToIgnoreCase(p2.getDisplayString());
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                return rc;
        } else {
            }
            if (rc != 0) {
        if (krc != 0) {
 * you may not use this file except in compliance with the License.
}
    private final boolean sortAlphabetically;
        }

        return Integer.compare(p1.getProposalTypeSorterScore(), p2.getProposalTypeSorterScore());
    }
 *
        }
import java.util.Comparator;
    public SQLCompletionProposalComparator(boolean sortAlphabetically, boolean isSearchInsideNames) {
            return this.compareWhenPrefixSearch(p1, p2);


        this.sortAlphabetically = sortAlphabetically;

        int score1 = p1.getProposalScore();
                return rc;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (rc != 0) {

            int rc = -Integer.compare(score1, score2);
    }
 *
 *


    public int compare(CompletionProposalBase p1, CompletionProposalBase p2) {
            return this.compareWhenFuzzySearch(p1, p2);
public class SQLCompletionProposalComparator implements Comparator<CompletionProposalBase> {
        if (sortAlphabetically) {
/*


 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql.semantics.completion;
            }
        } else {
    private final boolean isSearchInsideNames;
 */
            return 0;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (sortAlphabetically) {
    }
            return krc;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        // by kind, by text

    @Override
