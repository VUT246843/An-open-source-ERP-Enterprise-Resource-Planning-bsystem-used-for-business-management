 * @since 3.2
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
     * @param prefix   the prefix to search for
        ArrayList<String> completions = new ArrayList<>();
     * editors
    }
     * @param offset   the offset

    private List<String> getSuggestions(IDocument document, int offset, String prefix) throws BadLocationException {
    public HippieProposalProcessor() {
    private String getPrefix(IDocument document, int offset) throws BadLocationException {
 *
 * See the License for the specific language governing permissions and
        int localOffset = offset;
        while (Character.isJavaIdentifierPart(nextChar) || (wordDetector != null && wordDetector.isWordPart(nextChar))) {
     */
        }
     * @param offset   the offset
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.text.parser.TPWordDetector;
        return null; // no custom error message

package org.jkiss.dbeaver.model.sql.completion.hippie;
     */


            return null;
    public String getErrorMessage() {
 *     http://www.apache.org/licenses/LICENSE-2.0
     * and prefers suggestions from the currently open editor. It also adds the
    }
    private TPWordDetector wordDetector;
import java.util.ArrayList;
    public HippieProposalProcessor(@NotNull TPWordDetector wordDetector) {
     * backwards from the caret position and then forwards.
            if (localOffset < 0) {
 */
 * limitations under the License.
        if (document != null) {
}
            nextChar = document.getChar(localOffset);
        return fEngine.makeUnique(suggestions);
 * Copyright (C) 2010-2024 DBeaver Corp and others


     */
public final class HippieProposalProcessor {
    private ArrayList<String> createSuggestionsFromOpenDocument(IDocument document, int offset, String prefix) {
/**
 * <p>
     * @return all possible completions that were found in the current document
import java.util.List;

        suggestions.add(""); //$NON-NLS-1$
import org.jkiss.code.NotNull;
                break;
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
        completions.addAll(fEngine.getCompletionsForward(document, prefix, offset - prefix.length(), true));
            // ignore and return no proposals
 * you may not use this file except in compliance with the License.
     * @return proposals
 */
        this.wordDetector = wordDetector;
import org.eclipse.jface.text.IDocument;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
     * @param document the viewer
    }
    /**
            String prefix = getPrefix(document, offset);


    public String[] computeCompletionStrings(IDocument document, int offset) {
     */
 * Clients may instantiate.
 * Unless required by applicable law or agreed to in writing, software
            for (String string : getSuggestions(document, offset, prefix)) {

     * Return the list of suggestions from the current document. First the document is searched
            }
            List<String> result = new ArrayList<>();
     * @return the list of all possible suggestions in the currently open
     * Create the array of suggestions. It scans for other documents or editors,

     * Get completion proposals for the specified offset in the given document
     * @param document

            }
        char nextChar = document.getChar(localOffset);
            localOffset--;
 *
        if (document == null || offset > document.getLength()) {
     *
        }
            suggestions.addAll(fEngine.getCompletionsForward(document, prefix, 0, false));
 * </p>
    }
     * @param document document to check
            return NO_PROPOSALS;
                    result.add(prefix + string);
 *
        completions.addAll(fEngine.getCompletionsBackwards(document, prefix, offset));
        return completions;
            length++;

    private final HippieCompletionEngine fEngine = new HippieCompletionEngine();


        int length = 0;
     * empty suggestion at the end.
     * @throws BadLocationException if accessing the current document fails


                if (!string.isEmpty()) {
        return document.get(localOffset + 1, length);
        ArrayList<String> suggestions = createSuggestionsFromOpenDocument(document, offset, prefix);
        } catch (BadLocationException x) {
            return result.toArray(new String[0]);
    }
     * @param prefix   the completion prefix

            if (prefix == null || prefix.isEmpty() || prefix.charAt(prefix.length() - 1) == '.') {
    /**
 * A completion proposal computer for hippie word completions.
                }
            }
    private static final String[] NO_PROPOSALS = new String[0];
     * Creates a new hippie completion proposal computer.
     *
        }

        // add the empty suggestion
     * @param offset of the symbol to the left of the cursor
        }
    }
    /**
 *
/*
import org.eclipse.jface.text.BadLocationException;
                return NO_PROPOSALS;
    }
