
    }

    @Override
    @Override
 * return {@link CharacterIterator#DONE}.
import org.eclipse.jface.text.BadLocationException;
        try {
 *
    }
     * <code>last</code> (exclusive).
}
        Assert.isTrue(index <= last);
     */
            }

            return setIndex(getEndIndex() - 1);
     * @param document the document backing this iterator
    }
        return DONE;
    private int index;
    public char next() {
            try {
        return setIndex(getBeginIndex());
        return last;
     */
    private final int last;
 * See the License for the specific language governing permissions and
     * @param last     the last character index to consider
        }
        if (index >= 0 && index < length())
        if (position >= getBeginIndex() && position <= getEndIndex())
    }

        Assert.isTrue(index >= first);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
     *
    public int getIndex() {

    public int getEndIndex() {

            }

    /*
 */
            throw new IndexOutOfBoundsException();
    public char setIndex(int position) {
    @Override
    }

        if (index >= first && index < last)

            throw new InternalError();
     *
                // ignore and return DONE
     *
        try {
    }
                // ignore
    private void invariant() {
        if (first == last)
import org.eclipse.jface.text.IDocument;
        if (document == null)
            return DONE;
    public char current() {
    private final IDocument document;

     */
            throw new BadLocationException();
 *
        if (start < 0)

    @Override

    public char last() {
        else

        return setIndex(Math.min(index + 1, getEndIndex()));
    }
    public String toString() {
        } catch (BadLocationException ex) {
    @Override
    @Override
        }
/**
            throw new IndexOutOfBoundsException();
     * @param document the document backing this iterator
            return setIndex(getEndIndex());
    public SQLDocumentCharacterIterator(IDocument document, int first) throws BadLocationException {
            throw new IndexOutOfBoundsException();
    public int length() {
    /**
    }
    public Object clone() {
/*
    public char charAt(int index) {

        } else {

            index = position;
                return DONE;
            throw new NullPointerException();

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
                return document.getChar(index);
            throw new IndexOutOfBoundsException();
    @Override
    @Override
 * the supplied document is not copied; if the document is modified during the
     * @see CharSequence#toString
    public SQLDocumentCharacterIterator(IDocument document, int first, int last) throws BadLocationException {
    }
     * Creates an iterator for the document contents from <code>first</code> (inclusive) to

import java.text.CharacterIterator;
    }
 * returning document content may not always return the same values. Also, if
    }
            } catch (BadLocationException e) {
        if (first < 0 || first > last)
        invariant();
    @Override
public class SQLDocumentCharacterIterator implements CharacterIterator, CharSequence {
        if (end > length())
    /**
    @Override
import org.eclipse.core.runtime.Assert;
            return setIndex(index - 1);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return super.clone();
    public CharSequence subSequence(int start, int end) {
            throw new IndexOutOfBoundsException();
    @Override


    @Override
    }
        this.document = document;
    }
 * you may not use this file except in compliance with the License.
    }

        else

     */
        }
 * @since 3.0
 * DBeaver - Universal Database Manager
        return document.get().substring(getBeginIndex(), getEndIndex());
     * @throws BadLocationException if the indices are out of bounds
            } catch (BadLocationException e) {
     * @param first    the first character to consider
        return current();
 * An <code>IDocument</code> based implementation of
 *
    }
 * lifetime of a <code>DocumentCharacterIterator</code>, the methods

 * Licensed under the Apache License, Version 2.0 (the "License");
     * @see java.lang.CharSequence#length()
        if (end < start)

    public char first() {
    }
package org.jkiss.dbeaver.ui.editors.sql.syntax;
    public int getBeginIndex() {
     * @throws BadLocationException if the indices are out of bounds
    private final int first;
     * @param first    the first character to consider
        this.index = first;
     * Creates an iterator for the entire document.
     * @throws BadLocationException if the indices are out of bounds
        return first;
        this(document, first, document.getLength());
                return document.getChar(getBeginIndex() + index);
        return getEndIndex() - getBeginIndex();
        } catch (CloneNotSupportedException e) {
        return index;
 * accessing the document fails with a {@link BadLocationException}, any of
    public SQLDocumentCharacterIterator(IDocument document) throws BadLocationException {
        this.last = last;
    }
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (index > getBeginIndex()) {
            return new SQLDocumentCharacterIterator(document, getBeginIndex() + start, getBeginIndex() + end);
            throw new BadLocationException();
 * Unless required by applicable law or agreed to in writing, software
     * @param document the document backing this iterator
    public char previous() {
            throw new IllegalArgumentException();
    }
            try {
        this(document, 0);
        if (last > document.getLength()) {
 *
 * <code>CharacterIterator</code> methods as well as <code>charAt</code>may
        this.invariant();
 * You may obtain a copy of the License at
     **/
 * limitations under the License.
        else

    @Override
     * Creates an iterator, starting at offset <code>first</code>.
 */
 * <code>CharacterIterator</code> and <code>CharSequence</code>. Note that
        this.first = first;
