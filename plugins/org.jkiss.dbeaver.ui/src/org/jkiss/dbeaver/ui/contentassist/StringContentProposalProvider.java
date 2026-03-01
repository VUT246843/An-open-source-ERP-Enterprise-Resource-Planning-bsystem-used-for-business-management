        int startPos = 0;
 *
    public StringContentProposalProvider() {
        }
        }

package org.jkiss.dbeaver.ui.contentassist;
            stopPropose = false;
                break;
        if (contents.length() > 0) {
/*
    public StringContentProposalProvider(boolean constrainProposalList, String... proposals) {
}
    private boolean constrainProposalList;
        this.proposals = items;
 * You may obtain a copy of the License at
        List<ContentProposal> list = new ArrayList<>();
import java.util.List;

 */
 * See the License for the specific language governing permissions and
import org.eclipse.jface.fieldassist.IContentProposal;
            char ch = Character.toUpperCase(contents.charAt(i));
    private String[] proposals;
        this.constrainProposalList = constrainProposalList;

        }
        String word = contents.substring(startPos, position);
 * Licensed under the Apache License, Version 2.0 (the "License");
public class StringContentProposalProvider implements IContentProposalProvider {
    }
        }
            stopPropose = true; //stop proposing after parentheses or other characters
import java.util.ArrayList;
    }
 *

            if (proposal.length() >= word.length() && proposal.substring(0, word.length()).equalsIgnoreCase(word)) {
        }
                list.add(new ContentProposal(proposal));
            return new IContentProposal[0];
            return new IContentProposal[0];
 * DBeaver - Universal Database Manager
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (stopPropose && position < 2) {
        for (String prop : proposals) {
    }

        setProposals(proposals);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
 *     http://www.apache.org/licenses/LICENSE-2.0

            && constrainProposalList
        Character lastChar = null;
    }
 * Unless required by applicable law or agreed to in writing, software

        this.possibleChars = allChars.toString();
        for (int i = position - 1; i >= 0; i--) {
                    allChars.append(c);
    private boolean stopPropose;
    public StringContentProposalProvider(String... proposals) {
        return list.toArray(new IContentProposal[0]);
        if (lastChar != null && !Character.isLetterOrDigit(lastChar) && lastChar != '_' && lastChar != '.' && lastChar != ' '
    private String possibleChars;
            for (char c : prop.toCharArray()) {

 * limitations under the License.
import org.eclipse.jface.fieldassist.IContentProposalProvider;
                startPos = i + 1;
            }
    public IContentProposal[] getProposals(String contents, int position) {
        setProposals(proposals);
                if (allChars.indexOf(String.valueOf(c)) == -1) {
            lastChar = contents.charAt(contents.length() - 1);
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (!Character.isLetterOrDigit(ch) && possibleChars.indexOf(ch) == -1) {
            }

        for (String proposal : proposals) {
 *
        ) {
 * you may not use this file except in compliance with the License.
    public void setProposals(String[] items) {
import org.eclipse.jface.fieldassist.ContentProposal;
        if (stopPropose && position > 1) {
        }
        StringBuilder allChars = new StringBuilder();
    }
                c = Character.toUpperCase(c);
