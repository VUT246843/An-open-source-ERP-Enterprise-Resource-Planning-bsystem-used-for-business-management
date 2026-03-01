                this.sequence = sequence;

    }
            throw new IllegalArgumentException();
package org.jkiss.dbeaver.ui.editors.sql.syntax;
                throw new IllegalArgumentException();
                this.index = first;

    public char current() {

            throw new IllegalArgumentException();
        return this.index;

        }
        } catch (CloneNotSupportedException var1) {
/*

        Assert.isTrue(this.index <= this.last);
        if (position >= this.getBeginIndex() && position <= this.getEndIndex()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
    private final int last;
    private int index;
    public int getBeginIndex() {
            this.invariant();
 * You may obtain a copy of the License at
    }
    }

 * Unless required by applicable law or agreed to in writing, software


        try {
    public char setIndex(int position) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return this.setIndex(Math.min(this.index + 1, this.getEndIndex()));
        this(sequence, first, sequence.length());

public class SQLSequenceCharacterIterator implements CharacterIterator {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this(sequence, 0);
    public int getEndIndex() {
    public char first() {
    }
        return this.index >= this.first && this.index < this.last ? this.sequence.charAt(this.index) : '\uffff';
        return this.last;
        if (sequence == null) {
            return super.clone();
    public int getIndex() {
 */
    }
    }
    private void invariant() {

    }
    }
        } else {
 *
    }
        }
            throw new NullPointerException();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return this.index > this.getBeginIndex() ? this.setIndex(this.index - 1) : '\uffff';
            throw new InternalError();
    public char previous() {
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    public Object clone() {
            if (last > sequence.length()) {
                this.invariant();
    }

 * you may not use this file except in compliance with the License.

    private final CharSequence sequence;
            return this.current();
    }
    public SQLSequenceCharacterIterator(CharSequence sequence, int first, int last) throws IllegalArgumentException {
    private final int first;

    public char next() {

        return this.first;
    }
 *
 * DBeaver - Universal Database Manager
        } else if (first >= 0 && first <= last) {

import org.eclipse.core.runtime.Assert;
            this.index = position;
                this.first = first;
        this.index = -1;
    public SQLSequenceCharacterIterator(CharSequence sequence) {
    public char last() {
        return this.first == this.last ? this.setIndex(this.getEndIndex()) : this.setIndex(this.getEndIndex() - 1);
            } else {
                this.last = last;
 * limitations under the License.
    }
import java.text.CharacterIterator;
        Assert.isTrue(this.index >= this.first);
            }

}
 *
        } else {
        }
    public SQLSequenceCharacterIterator(CharSequence sequence, int first) throws IllegalArgumentException {
        return this.setIndex(this.getBeginIndex());
