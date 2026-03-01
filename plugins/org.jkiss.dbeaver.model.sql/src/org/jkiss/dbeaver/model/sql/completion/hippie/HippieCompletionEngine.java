                fCurrentState = 2;
        protected void calculateNext() throws BadLocationException {
     * @param firstPosition the caret position

                String completion = fDocument.get(wordTail.getOffset(), wordTail.getLength());
        return res;
        /**
         * which element it is (set fHasNext and fNext).

         * This is the prefix that should be searched
                    return;
                fNext = null;
     *                        and <code>false</code> is good for searching in other documents.
            throw new UnsupportedOperationException("Not supported"); //$NON-NLS-1$
                        break;
                        fHasNext = true;
        protected String fSearchPattern;
            } catch (BadLocationException e) {
         */
                // search only at word boundaries
         * @return <code>true</code> if the next token to be returned is not null (we always
            }
 * @author Genady Beryozkin, me@genady.org
                fCurrLocation++;
    }
     * later going forward through each of the "otherDocuments".
     */
     */
                    this.fHasNext = false;
            } else {

            this.fOpenDocument = openDocument;
                if (fFirstPosition > 0) {
 * you may not use this file except in compliance with the License.
                }
        protected int fNextPos;
        private HippieCompletionForwardIterator(IDocument document, CharSequence prefix, int firstPosition, boolean currentWordLast) {
                fCompletionsBackwardIterator = getBackwardIterator(
         * The initial position in the document that the search will start from. In order to search
        /**
                    this.fHasNext = false;
     * Returns the text between the provided position and the preceding word boundary.
                    return;
            throw new UnsupportedOperationException();
     *
                fAddedEmpty = true;
    /**
        /**
         */
     * Regular expression that is used to find words.
        return new HippieCompletionForwardIterator(document, prefix, firstPosition, currentWordLast);

                if (quoting) {
            }

         * The list of IDocuments that we should search
                if (fNextPos <= 0) {
                    this.fNext = null;
                // since the boundary may be of nonzero length
            String ret = fNext;

                calculateNext();
            checkNext();
        }
     * @param pos the caret position.
        /**

 *     Genady Beryozkin, me@genady.org - initial API and implementation
package org.jkiss.dbeaver.model.sql.completion.hippie;
     *
        }
 *

     *
        boolean quoting = false;
            if (ch == '\\') {
                if (wordTail.getLength() > 0) { // empty suggestion will be added later
                    fSuggestions.add(fCompletionsBackwardIterator.next());
     * from the caret position to the beginning of the document.
            super(document, prefix, firstPosition);
        private final List<String> fSuggestions;
        }
            }
         * An empty completion is always added at the end.
            calculateNext();

     */
         * The 'current' backward iterator.
import org.eclipse.jface.text.IDocument;
                if (completion.length() > 0) { // empty suggestion will be added later
            IRegion wordTail = fSearcher.find(wordSearchPos, COMPLETION_WORD_REGEX, true, true, false, true);
                fLastSearchPos = fNextPos;
                }
                } else {
         */
         * pre-calculate things)
    /**
                }
            out.append(ch);
         * -1 means that we still haven't checked the current do completions Any other number means
         */

     * @param suggestions a list of suggestions ({@link String}).
        public void remove() {
        return new HippieCompletionBackwardIterator(document, prefix, firstPosition);
         */
        return uniqueSuggestions;
        ArrayList<String> res = new ArrayList<>();
            return false;
    // unicode identifier part
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

                    fFirstPosition--;

            calculateFirst();
        StringBuilder out = new StringBuilder(string.length());
    /**

        public boolean hasNext() {
    public Iterator<String> getMultipleDocumentsIterator(IDocument document, List<IDocument> otherDocuments, CharSequence prefix, int firstPosition) {
        }
    /**
        private final IDocument fOpenDocument;
            try {
        }

            ) {
import org.eclipse.jface.text.FindReplaceDocumentAdapter;


         */
        /**
        }
                } else {
                return wordSearchPos;
         * The current offset in the opened document
     * @since 3.6
                                          CharSequence prefix, int selectionOffset) {
     *
            this.fOtherDocuments = otherDocuments;
     * @since 3.2
                        if (fHasNext) {

            res.add(it.next());
         */
            if (fCurrentState == 1) {
 *     Fabio Zadrozny <fabiofz at gmail dot com> - [typing] HippieCompleteAction is slow  ( Alt+/ ) - https://bugs.eclipse.org/bugs/show_bug.cgi?id=270385
     */
                fCompletionsForwardIterator = getForwardIterator(
                    fCompletionsBackwardIterator = null;
     * @param doc the document that will be scanned.
        for (Iterator<String> it = getBackwardIterator(document, prefix, firstPosition); it.hasNext(); ) {
 *
     * one (lazily gotten).
     * @param firstPosition  the initial position in the document that the search will start from.
                Assert.isTrue(fLastSearchPos != fNextPos, "Position did not change in loop (this would lead to recursion -- and should never happen)."); //$NON-NLS-1$
 * Copyright (c) 2000, 2015 IBM Corporation and others.
            }
}
                // unless we are at the beginning of the document, the completion boundary
                IRegion reg = fSearcher.find(fNextPos, fSearchPattern, true, CASE_SENSITIVE, false, true);
                if (fNextPos >= length) {
     * @since 3.6

 * You may obtain a copy of the License at
                    return;

            return ret;
         */
                    this.fNext = null;
    }

        /**

    /**
        protected void calculateNext() throws BadLocationException {
                // FindReplaceDocumentAdapter expects the start offset to be before the
                IRegion wordTail = fSearcher.find(wordSearchPos, COMPLETION_WORD_REGEX, true, true, false, true);
         * @throws UnsupportedOperationException always.
        }
        /**

            this.fSuggestions = new ArrayList<>();
     *                        for searching in the currently open document and <code>false</code>
    public Iterator<String> getForwardIterator(IDocument document, CharSequence prefix, int firstPosition, boolean currentWordLast) {
         */
        if (quoting)
            this.fSelectionOffset = selectionOffset;
         */
 *
 * compute the possible completions.

    private static final String NON_EMPTY_COMPLETION_BOUNDARY = "[\\s\\p{Z}[\\p{P}&&[\\P{Pc}]][\\p{S}&&[\\P{Sc}]]]+"; //$NON-NLS-1$
                    if (fNextPos >= fDocument.getLength()) {
        private String fCurrentWordCompletion = null;
         */
            if (fCurrentState == 2) {

        private final CharSequence fPrefix;
         * Determines if we have a next element to be returned.
         * The current state for the iterator
         * the next is set to null.

        }
         *
            //Note: unreachable section
        }
         * @param wordHead the region to check
     * at the "document" passed (first going backward and then forward from the position passed) and
                break;
         * The document to be scanned
            }
                    (this.fOtherDocuments.get(fCurrLocation)), fPrefix, 0, false);
            fNext = null;
//	private static final String COMPLETION_WORD_REGEX= "\\p{javaUnicodeIdentifierPart}+"; //$NON-NLS-1$
         *                      <code>firstPosition=0</code>.
import org.eclipse.core.runtime.Assert;
     * the passed position (backwards until the start of the document).

         * The prefix to search for
            } catch (BadLocationException e) {
    /**
        private String fNext;
 * TODO: Provide history option
 *******************************************************************************/
    /**
 * TODO: Sort by editor type

         * properly initialized).
        }
         */

            }
     * Is completion case sensitive? Even if set to <code>false</code>, the
        protected abstract void calculateNext() throws BadLocationException;
         */
     * gotten) from the current position.
         * <p>
            }
        protected void calculateFirst() {
    public List<String> getCompletionsForward(IDocument document, CharSequence prefix,
        /**
                    fHasNext = true;
                        }
            //only get if backward completions are consumed
        if (prevNonAlpha != pos) {
     * excluding the common prefix
        /**
     * position.
        @Override
                fSearchPattern = COMPLETION_BOUNDARY + asRegPattern(fPrefix);
         * We always calculate the next to see if it's available.
     *
            this.fFirstPosition = firstPosition;
                }
                    // empty spacing is not permitted now.
         * Constructor
                fHasNext = false;

            String ret = fNext;
            if (fCurrentState == 0) {
            if (!seenAlready.contains(suggestion)) {
        int prevNonAlpha = pos;
                fNext = null;
     * @param prefix         the prefix to search for
        /**
     *                        the search will start from. In order to search from the
                // because the boundary pattern has the (....)+ form.
     */
 * DBeaver - Universal Database Manager
         * @param prefix        the prefix to search for
                return;
     */
     * @param document        the document to be scanned
     * @return Iterator that will get the completions backward from the passed position.
    /**
         * Not supported!
         * Last position searched
        /**
                fNextPos = wordHead.getOffset() - 1;

         */
         */
    private static final boolean CASE_SENSITIVE = true;
     * @return Iterator (for Strings) that will get the completions forward from the passed
                    }
        protected int fFirstPosition;
    public List<String> getCompletionsBackwards(IDocument document, CharSequence prefix, int firstPosition) {
    /**
         */
            }

        HashSet<String> seenAlready = new HashSet<>();

            super(document, prefix, firstPosition);

        }
         * After the empty completion, the next is set to null.
        /**
         * <p>
        }
                fSuggestions.add(fCompletionsForwardIterator.next());
         */
     * to list head.

            }
                int wordSearchPos = wordHead.getOffset() + wordHead.getLength();
 * <p>
 *
            if (fCompletionsBackwardIterator != null) {

         * It'll check which document should be used and will get the completions on that document
     * @return the string converted to a regex pattern
     * @param prefix          the prefix to search for
                calculateNext();
        return out.toString();
     * is a possible completion that begins before <code>firstPosition</code>
        private int fCurrSuggestion = 0;
        protected CharSequence fPrefix;
    // java identifier part (unicode id part + currency symbols)

    /**
                    fSearchPattern = COMPLETION_BOUNDARY + asRegPattern(fPrefix);
    public List<String> makeUnique(List<String> suggestions) {
        /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * but ends after that position, it will not be included in the results.
            }
            }
    /**
     * Search for possible completions in the backward direction. If there
         * This marks the current suggestion to be returned
            if (!quoting) {
        private int fLastSearchPos = -1;
        for (String suggestion : suggestions) {
    }
         * <p>

            this.fCurrentWordLast = currentWordLast;
        @Override
                out.append("\\\\"); //$NON-NLS-1$
                    if (fCurrentWordLast && wordHead.getOffset() == fFirstPosition) { // we got the word at caret as completion
     *                        completion. <code>true</code> is good for searching in the currently open document
         * after calling next(), this function must be called).
            if (!fAddedEmpty) {
                            return;

        @Override
                    return;
    /**
     * the other documents (in the same sequence the documents are available).
     */
         * Subclasses must override to calculates whether we have a next element to be returned and

 * This class contains the hippie completion engine methods that actually
     * @param prefix          the prefix to search for

            while (true) {

        /**
     */
     * forward in that same document and when that is finished it will get it forward for
                // actual caret position, probably for compatibility with forward search.
                fHasNext = false;
     */
        private MultipleDocumentsIterator(IDocument openDocument, List<IDocument> otherDocuments,
    }
    /**
     *                        order to search from the beginning of the document use
    /**
                    }


     *
            if (fCurrLocation == -1) {
         * @throws BadLocationException if we're at an invalid position in the document.
            return fHasNext;
                    this.fHasNext = false;
         **/
     * Class that keeps the state while iterating the suggestions
        private boolean checkNext() {
            }

    public Iterator<String> getBackwardIterator(IDocument document, CharSequence prefix, int firstPosition) {

            if (fSuggestions.size() > fCurrSuggestion) {
        @Override
        }
     * @return the text if found, or null.
     * @param document        the document to be scanned

import org.eclipse.jface.text.IRegion;
    }

         */
         *
    private abstract static class HippieCompletionIterator implements Iterator<String> {
    private String asRegPattern(CharSequence string) {
                while (reg != null) {
                    } else {
                        }
         * @return the word region.
        /**
                    this.fHasNext = true;

     * Copied from {@link FindReplaceDocumentAdapter#asRegPattern(java.lang.String)}.
     * The empty suggestion is not included in the results.
    }
     *                      <code>firstPosition=document.getLength()</code>.
        private boolean fAddedEmpty = false;
    /**
     * Word boundary pattern that does not allow searching at the beginning of the document.
            fNext = null;

     * Converts a non-regex string to a pattern that can be used with the regex
/**
         * from the beginning of the document use <code>firstPosition=0</code>.

         * that we'll get the completions for some other editor.
                    } else {
                }
                return true;

     */

     * @param prefix        the prefix to search for
     * @param document      the document to be scanned
     * @param currentWordLast if <code>true</code> the word at caret position should be that last
        private final int fSelectionOffset;
                    this.fHasNext = false;
    /**

            if (fCompletionsBackwardIterator == null && fCompletionsForwardIterator != null && fCompletionsForwardIterator.hasNext()) {
 * are made available under the terms of the Eclipse Public License 2.0
            }


        private final boolean fCurrentWordLast;
                    this.fNext = null;
                // the word at caret position goes last (bug 132533).
         */
     */
        }
     * @since 3.6
        private HippieCompletionBackwardIterator(IDocument document, CharSequence prefix, int firstPosition) {
     * @throws BadLocationException if an error occurs.
    private static final String COMPLETION_WORD_REGEX = "[\\p{L}\\p{Mn}\\p{Pc}\\p{Nd}\\p{Nl}\\p{Sc}]+"; //$NON-NLS-1$
            if (fCurrentState == 0) {
            if (checkNext()) {
         * until some completion is found.
                }
            if (fNext == null) {
    private static final Pattern COMPLETION_WORD_PATTERN = Pattern.compile(COMPLETION_WORD_REGEX);
            res.add(it.next());
     *                        beginning of the document use <code>firstPosition=0</code>.
    private final class MultipleDocumentsIterator implements Iterator<String> {
        }
        /**
import org.jkiss.code.NotNull;
        }
     * @return a {@link List} of possible completions ({@link String}s)
         * Indicates whether we already added the empty completion.
     * @param document       the document to be scanned
            int wordSearchPos = wordHead.getOffset() + wordHead.getLength();

     *                        is good for searching in other documents.

 * This engine is used by the <code>org.eclipse.ui.texteditor.HippieCompleteAction</code>.
import java.util.*;
    /*
     * @since 3.2
        }
        @Override
            return ret;
                    fNextPos = length - 1;
                    fOpenDocument, fPrefix, fSelectionOffset);


         */
 * which accompanies this distribution, and is available at
     * @param firstPosition the initial position in the document that the search will start from. In
 * Contributors:
            if (!m.matches()) {


                        reg = fSearcher.find(fNextPos, fSearchPattern, true, CASE_SENSITIVE, false, true);
     * @return Iterator that will first get the completions backward from the document passed, then
        protected boolean fHasNext;
                if (checkNext()) {


                fCompletionsForwardIterator = getForwardIterator(
                }
                    return;
     */
         * <code>true</code> is good for searching in the currently open document and

            return doc.get(prevNonAlpha, pos - prevNonAlpha);
     *
    public HippieCompletionEngine() {
     */
        while (prevNonAlpha > 0) {
                }
     *

    private class HippieCompletionBackwardIterator extends HippieCompletionIterator {
                if (fFirstPosition <= 1) {
         * @return true if a completion was found and false if it couldn't be found -- in which case
                fCurrentState = 1;
     * case of the prefix won't be changed.
         * search backwards from the current offset and later forwards)
        /**
         */
     * Provides an iterator that will get the completions that start with the passed prefix before
                        if (fHasNext) {
        private int consumeWordAt(@NotNull IRegion wordHead) throws BadLocationException {
                // see HippieCompletionTest#testForwardSearch().
                    quoting = false;
         */
                // matches one character. It is enough to move just one character backwards
                    fSearchPattern = NON_EMPTY_COMPLETION_BOUNDARY + asRegPattern(fPrefix);
     * @param prefix        the completion prefix
        /**
    }
     */
                            return;

    /**
                int length = fDocument.getLength();
                    || wordTail.getOffset() != wordSearchPos 
         * These are the suggestions which we already loaded.
                    String found = fDocument.get(wordTail.getOffset(), wordTail.getLength());
                fNextPos = fFirstPosition;
                    return;
         * <code>false</code> is good for searching in other documents.
 * <p>
 */
 * SPDX-License-Identifier: EPL-2.0
                if (fCompletionsBackwardIterator.hasNext()) {
                fCurrentState = 1;
 *
 *
     * Creates a new engine.
         * The document that's currently opened (that's the 1st we should look and we should 1st
        public void remove() {
                if (fFirstPosition == fDocument.getLength()) {
                return wordTail.getOffset() + wordTail.getLength();
     * @param document      the document to be scanned

     *
        /**
        private Iterator<String> fCompletionsBackwardIterator;
        public HippieCompletionIterator(IDocument document, CharSequence prefix, int firstPosition) {

                out.append("\\Q"); //$NON-NLS-1$
     *                      order to search from the end of the document use
        private void calculateNext() {
         * If <code>true</code> the word at caret position should be that last completion.
 */
     *
     * Base class for Iterator that gets the word completions in a document, and returns them one by
                fHasNext = false;
            this.fDocument = document;
     * @param currentWordLast if <code>true</code> the word at caret position
         * The 'current' forward iterator.
                        }
import java.util.regex.Matcher;
        @Override
         */
                IRegion wordHead = fSearcher.find(fNextPos, fSearchPattern, false, CASE_SENSITIVE, false, true);
        @Override
        /**
                    this.fNext = found;

                    continue;
                if (fCurrentWordCompletion != null) {
     */
            out.append("\\E"); //$NON-NLS-1$
                        fCurrentState = 2;
     * Provides an iterator that will get the completions that start with the passed prefix after
     * @since 3.2
     * @param firstPosition   the initial position in the document that

        return null;
                fCurrSuggestion++;
         */
            calculateNext();
                            fCurrentWordCompletion = completion; // add it as the last word.
                fSearcher = new FindReplaceDocumentAdapter(fDocument);

                    fOpenDocument, fPrefix, (fSelectionOffset - fPrefix.length()), true);
                    || wordTail.getOffset() + wordTail.getLength() > fFirstPosition
     * @since 3.6
     *                        should be that last completion. <code>true</code> is good
                    fNextPos = consumeWordAt(reg);

     * provided prefix.
            m.reset(doc.get(prevNonAlpha - 1, pos - prevNonAlpha + 1));
        }
            // add the empty suggestion (last one)
            }
public final class HippieCompletionEngine {
         */
        }
         * This is the next token to be returned (when null, no more tokens should be returned)

        public String next() {
                fNext = fSuggestions.get(fCurrSuggestion);
         */
        /**
                throw new NoSuchElementException();
        protected IDocument fDocument;
     *
            }
        /**

         */
                fCurrentState = 3;
                }

 *
                }

        private final List<IDocument> fOtherDocuments;
                                              int firstPosition, boolean currentWordLast) {
        for (Iterator<String> it = getForwardIterator(document, prefix, firstPosition, currentWordLast); it.hasNext(); ) {
            }
            calculateFirst();
            char ch = string.charAt(i);
     * the passed position (forward until the end of the document).
                }

         */
 * https://www.eclipse.org/legal/epl-2.0/

                if (wordTail == null 
                uniqueSuggestions.add(suggestion);
        protected int fCurrentState = 0;
            this.fPrefix = prefix;
    }
        protected FindReplaceDocumentAdapter fSearcher;
/*******************************************************************************
    /**

 * Licensed under the Apache License, Version 2.0 (the "License");
            while (fCurrLocation < this.fOtherDocuments.size()) {
                }
 * </p>
         * The next place to search for
        return res;
     *
     * @param string the non-regex pattern
        /**
import java.util.regex.Pattern;
         * This method calculates the next token to be returned (so, after creating the class or
                seenAlready.add(suggestion);

     * search engine.
         * The completion for the current word -- fix bug 132533

        protected String fNext;
 * limitations under the License.
            }
     *

                if (wordHead == null) {
        ArrayList<String> res = new ArrayList<>();
         * @param document      the document to be scanned

     * @since 3.2
     * Iterator that gets the word completions in a document, and returns them one by one (lazily
        /**

     * The word boundary pattern string.
         * Must be called to calculate the first completion (subclasses must explicitly call it when
     * @param otherDocuments the additional documents to be scanned
        for (int i = 0, length = string.length(); i < length; i++) {
         * Pattern to be used -- search only at word boundaries
            }
//	private static final String COMPLETION_WORD_REGEX= "[\\p{L}[\\p{Mn}[\\p{Pc}[\\p{Nd}[\\p{Nl}]]]]]+"; //$NON-NLS-1$
                        if (fCurrentWordCompletion == null) {
    private static final String COMPLETION_BOUNDARY = "(^|" + NON_EMPTY_COMPLETION_BOUNDARY + ")";  //$NON-NLS-1$ //$NON-NLS-2$
     * @return a list of unique completion suggestions.
                fSearcher = new FindReplaceDocumentAdapter(fDocument);
    }
         * Checks the given region for a word to be returned in this iterator.


     * @return a {@link List} of possible completions (as {@link String}s),
     */
                        fNext = completion;
            if (wordTail != null && wordTail.getOffset() == wordSearchPos 
    }
            this.fPrefix = prefix;
        /**
                // try to complete to a word. case is of no matter here
                continue;
     * The pre-compiled word pattern.
        }
 * @since 3.1
        /**
        /**
                quoting = true;
        }

         * The class that'll do the search
                    out.append("\\E"); //$NON-NLS-1$
            try {
        public boolean hasNext() {
            }
        /**
     * Return the list of completion suggestions that correspond to the

         * @throws BadLocationException if we're at an invalid position in the document.
        @Override
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Matcher m = COMPLETION_WORD_PATTERN.matcher(""); //$NON-NLS-1$
    }
    public String getPrefixString(IDocument doc, int pos) throws BadLocationException {
 * Unless required by applicable law or agreed to in writing, software

            }
import org.eclipse.jface.text.BadLocationException;
                    return;
        /**
        ArrayList<String> uniqueSuggestions = new ArrayList<>();
     */
                throw new NoSuchElementException("No more elements to iterate"); //$NON-NLS-1$
            fHasNext = false;
     * @since 3.6
     *
                }
        private int fCurrLocation = -1;

        public String next() {
        return new MultipleDocumentsIterator(document, otherDocuments, prefix, firstPosition);
     * @param firstPosition   the initial position in the document that the search will start from. In
            // try to complete to a word. case is irrelevant here.
         *
 * distributed under the License is distributed on an "AS IS" BASIS,
                fNextPos = fFirstPosition;
         */
//	private static final String COMPLETION_WORD_REGEX= "\\p{javaJavaIdentifierPart}+"; //$NON-NLS-1$
         * @param firstPosition the initial position in the document that the search will start
     * gotten) backward from the current position.

     * Iterator that gets the word completions in a document, and returns them one by one (lazily

                    fNext = fCurrentWordCompletion;
     * @since 3.6
        }
         *
/*
    // with a 1.5 JRE, you can do this:
         */
     * Remove duplicate suggestions (excluding the prefix), leaving the closest
         *                      from. In order to search from the beginning of the document use
         * The next element to be returned
        private Iterator<String> fCompletionsForwardIterator;
                }
                fCurrLocation++;
            }
    private class HippieCompletionForwardIterator extends HippieCompletionIterator {
         */
     */
        /**
         *
            if (!fHasNext) {
         * @return the next suggestion
        /**

     *                        <code>firstPosition=0</code>.
    }
                && wordTail.getLength() > 0 // empty suggestion will be added later
     * Provides an iterator that will get the completions for all the documents received, starting
 * This program and the accompanying materials
                fSuggestions.add(""); //$NON-NLS-1$
                ) {
        /**
    }
     * @since 3.6
            return fNext != null;
            // since the boundary may be of nonzero length
     *
            prevNonAlpha--;
