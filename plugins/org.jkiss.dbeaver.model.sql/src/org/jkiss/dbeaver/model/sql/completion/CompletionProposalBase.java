    /**
    public abstract String getReplacementString();
        if (o instanceof CompletionProposalBase other) {
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

    public abstract DBPImage getObjectImage();

/*
     */
     */
    /**
    public abstract int getProposalScore();

    public abstract int getReplacementLength();

    public abstract DBPKeywordType getProposalType();

     * Returns the image associated with the object of this proposal.

     * This is used to sort the proposals in the UI.

 *
 * See the License for the specific language governing permissions and
     * The sorter score of the completion proposal for specific type.
     */
    public boolean equals(Object o) {
public abstract class CompletionProposalBase {
     *
     * The score of the completion proposal.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
     * The display string for the completion proposal.
 *
    public abstract int getProposalTypeSorterScore();
     * This is used to rank the proposal among other proposals.
    }
     */
                && this.getReplacementString().equals(other.getReplacementString());
 * Unless required by applicable law or agreed to in writing, software
    }

     * The length of the replacement string.
     * Higher scores indicate higher priority in sorting.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     */

    /**
     * This is used to determine how many characters will be replaced in the document.
    @Override
            return this.getReplacementOffset() == other.getReplacementOffset()
        } else {
     * The type of the completion proposal.
     * The offset at which completion proposal will be applied
import org.jkiss.dbeaver.model.DBPImage;
package org.jkiss.dbeaver.model.sql.completion;
 * you may not use this file except in compliance with the License.
}
        hashCode = hashCode * 31 + Integer.hashCode(this.getReplacementOffset());
import org.jkiss.dbeaver.model.DBPKeywordType;
     * This is typically used to display an icon in the UI alongside the proposal.
 * limitations under the License.
    /**
     * This is typically used in the UI to show the proposal to the user.
        int hashCode = 7;

     */
     */
     * @return the image associated with the object of this proposal
    /**
 */
    public abstract int getReplacementOffset();
            return false;
     */

     * Higher scores indicate more relevant proposals.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        hashCode = hashCode * 31 + this.getReplacementString().hashCode();
    /**
    public abstract String getDisplayString();
        return hashCode;
    public int hashCode() {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
     * The string that will be inserted to the replacement offset when completion proposal is applied
    @Override
    /**
     * This is used to categorize the proposal, such as keyword, object, etc.
 *     http://www.apache.org/licenses/LICENSE-2.0
