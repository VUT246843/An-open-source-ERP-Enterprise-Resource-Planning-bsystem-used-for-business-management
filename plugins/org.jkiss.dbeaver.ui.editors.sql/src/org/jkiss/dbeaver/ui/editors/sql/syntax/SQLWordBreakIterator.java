            }
    }
        private static final char INIT = '\0';
        return index;
    }
        }

            last = previous;
    static final class SQLIdentifier extends Run {
        index = iterator.first();
        return last;
    @Override
    public int following(int offset) {

        protected boolean consume(char ch) {
    }
        @Override
        protected boolean consume(char ch) {
            first();
            if (isValid(ch)) {
    private int index;
    }
        @Override
        return index;
        if (newText instanceof CharSequence) {

        protected boolean isValid(char ch) {
    }
        return text;
        @Override
        @Override
        setText((CharSequence) newText);
        }
    }



        iterator = BreakIterator.getWordInstance();
        private char state;
        return iterator.next(n);
        do {
    static final class Other extends Run {
    public int first() {
    @Override
    @Override

            return DONE;
            run = OTHER;
        protected abstract boolean isValid(char ch);
    }
    }
    public SQLWordBreakIterator() {
                state = EXIT;

    }

    }
    public void setText(String newText) {
        return run;
    @Override
                length++;
                return true;
    }
            init();
            return Character.isWhitespace(ch) && ch != '\n' && ch != '\r';

        first();
        return index;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return true;
        if (offset == getText().getBeginIndex())
import java.text.CharacterIterator;


        return iterator.getText();
        else if (OTHER.isValid(ch))
        int next = iterator.following(offset);
        }

    }
    public int previous() {
            return Character.isJavaIdentifierPart(ch);
    private static final Run WHITESPACE = new Whitespace();

    private static final Run OTHER = new Other();
        }
 *
        else {
    }


        public Run() {
 *
            previous = following(previous);
            return null;
    private static final Run IDENTIFIER = new SQLIdentifier(); // new Identifier();
    private Run getRun(char ch) {
        char ch = text.charAt(offset);
    }
        return offset + run.length;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
    public int preceding(int offset) {
        if (offset == getText().getBeginIndex())

    }
            super.init();
    }
        // since BreakIterator.getWordInstance considers _ as boundaries
        else
    protected final BreakIterator iterator;
        return index;

        int last = DONE;
            return DONE;
        else if (IDENTIFIER.isValid(ch))
    @Override
 *
        if (offset == getText().getEndIndex())


        int length = text.length();
    }
        }
            run = DELIMITER;
            state = INIT;
        // work around too eager IAEs in standard implementation
        }

            text = (CharSequence) newText;

                return false;
    private static final Run DELIMITER = new LineDelimiter();
        // TODO deal with complex script word boundaries
        @Override
        while (previous < offset) {
    public int next(int n) {
            run = WHITESPACE;
            }
            run = IDENTIFIER;
    public int current() {
    }


    protected CharSequence text;
    @Override


        // seems to work fine, however
            Assert.isTrue(false);
 * You may obtain a copy of the License at
        return index;
            return DONE;

 * you may not use this file except in compliance with the License.
        int previous = offset - 1;

                return true;
            if (!isValid(ch) || state == EXIT)
        }
    private Run consumeRun(int offset) {
            throw new UnsupportedOperationException("CharacterIterator not supported"); //$NON-NLS-1$
        protected int length;
            iterator.setText(newText);
        Run run;
        protected boolean isValid(char ch) {

        }

import org.eclipse.core.runtime.Assert;
        index = following(index);
        Run run = consumeRun(offset);
            ch = text.charAt(offset);
            return false;
    static final class Whitespace extends Run {



            return following(offset - 1) == offset;
    public CharSequence getTextValue() {
        } else {
    @Override
            } else if (state != ch) {
        index = iterator.last();
        index = iterator.current();
    public int next() {
                length++;
        protected boolean isValid(char ch) {
        private static final char EXIT = '\1';
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        } while (!isBoundary(previous));
        run.init();
                length++;
        @Override
        if (next == DONE)
    static final class LineDelimiter extends Run {


    }
                return false;
public class SQLWordBreakIterator extends BreakIterator {
            offset++;
    public void setText(CharSequence newText) {


        iterator.setText(new SQLSequenceCharacterIterator(newText));

        while (run.consume(ch) && offset < length - 1) {
        if (isBoundary(offset - 1))
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            length = 0;
    }
        }
 * DBeaver - Universal Database Manager

    public CharacterIterator getText() {
    public void setText(CharacterIterator newText) {
            return !Character.isWhitespace(ch) && !Character.isJavaIdentifierPart(ch);
            return offset - 1;

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        Run run = getRun(ch);
                state = ch;
/*
        text = newText;

            } else {

        protected void init() {
        }
        else if (DELIMITER.isValid(ch))
            if (state == INIT) {
    @Override
            return true;
        if (WHITESPACE.isValid(ch))
 * Unless required by applicable law or agreed to in writing, software
            previous = iterator.preceding(previous);
 * limitations under the License.
    public boolean isBoundary(int offset) {
        }

    protected static abstract class Run {
        // Math.min(offset + run.length, next) does not work
        }
    @Override
            return ch == '\n' || ch == '\r';
        protected void init() {
import java.text.BreakIterator;
    @Override
        protected boolean isValid(char ch) {
        index = preceding(index);
    @Override
        return run;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }

 */
    }
    public int last() {

