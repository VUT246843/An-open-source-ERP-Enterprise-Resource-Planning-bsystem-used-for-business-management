                        if ((ch == cLastNLChar) || (' ' == cLastNLChar)) {
            if (cNextPos < fRangeEnd) {
    }
        } catch (BadLocationException e) {

     * @return Returns the editor.
                cNextPos++; // must be '-' but we don't care if not
    /**
    private IDocument document;


            // end tag?
                        // classifyTag()

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    private int recursiveTokens(int depth) throws BadLocationException {

     */
     * &lt;/...&gt;: {@link #END_TAG} <br />
                                    emitPosition(startOffset, cNextPos - startOffset);
    private int cNewLines = 0;
                return EOR_TAG;
                    }
import org.eclipse.jface.text.reconciler.DirtyRegion;
    private int cNextPos = 0;
                    }
import org.eclipse.swt.widgets.Display;
                    ch = document.getChar(cNextPos++);
                                if (newLines > startNewLines + 1) {
                    if ('"' == ch) {
                    case '\n':
     * &lt;.../&gt;: {@link #LEAF_TAG} <br />
                        }
        if ('\n' == ch) {
                            ch = document.getChar(cNextPos++);

    public void reconcile(IRegion partition) {
                    piFlag = ('?' == ch);
    /**
                ch = document.getChar(cNextPos++);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                char ch = document.getChar(cNextPos++);
                        return PI_TAG;
                while (cNextPos < fRangeEnd) {
        }
            return 1;
                if (cNextPos > fRangeEnd)
                        int startNewLines = newLines;
            // comment?
                    case '\'':

                int commEnd = 0;
        initialReconcile();
            } else {
        cNextPos = fOffset;
                            cLastNLChar = ch;
                        if ((ch == cLastNLChar) || (' ' == cLastNLChar)) {
import org.eclipse.jface.text.BadLocationException;

                            case LEAF_TAG:

                    case '>':
     * calculate {@link #positions}. About syntax errors: this method is not a
                    case '/':

                            ch = document.getChar(cNextPos++);
    /**

    }
                        while ((cNextPos < fRangeEnd) && ('"' != ch)) {
     * after &lt;, when it returns, it points to the character after &gt; or
                        return EOR_TAG;
    private void emitPosition(int startOffset, int length) {
    }
                cNextPos--;
    }
                        return END_TAG;
     * {@link #cNewLines}.
                switch (ch) {
                        newLines += cNewLines; // cNewLines is written by

    private void calculatePositions() {


public class XMLReconcilingStrategy implements IReconcilingStrategy, IReconcilingStrategyExtension {
                        return EOR_TAG;
        }
     * The offset of the next character to be read
                            if ('\'' == ch)
        }
                    if (('>' == ch) && (commEnd >= 2))
                            case START_TAG:

                        break;
            ch = document.getChar(cNextPos++);
            }
    private char cLastNLChar = ' ';


        // now ch is a new line or a non-whitespace
                    if (('>' == ch) && piFlag)
                    }
    private int eatToEndOfLine() throws BadLocationException {
                                newLines += recursiveTokens(depth + 1);
                }
    /**
    private static final int EOR_TAG = 4;
        if (cNextPos >= fRangeEnd) {
                            cLastNLChar = ch;
        }

    private int fRangeEnd;
        if ('\r' == ch) {
                    case '<':
        return 0;


            return 0;
     * is useful. Side effect: writes number of found newLines to
                cNextPos--;
    public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {


            return EOR_TAG;
                }
        this.document = document;
        fOffset = 0;

                switch (ch) {
                if ('\r' != ch) {
            cNewLines = 0;
                        commEnd++;
                            if ('>' == ch) {
                    return EOR_TAG;
                    default:
        char ch = document.getChar(cNextPos++);
    private int classifyTag() {
     */
import java.util.List;
        positions.clear();
                        }
    /**
            return 1;
import java.util.ArrayList;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;

            // start tag or leaf tag?
        while ((cNextPos < fRangeEnd) && ((' ' == ch) || ('\t' == ch))) {
                            case EOR_TAG:
                                break;
                        while (cNextPos < fRangeEnd) {
    /**
                return EOR_TAG;
                        cNewLines += eatToEndOfLine();
    private static final int LEAF_TAG = 2;
    public void setEditor(XMLEditor editor) {
 * limitations under the License.
     * &lt;...: {@link #EOR_TAG} (end of range reached before closing &gt; is
/*
                while (cNextPos < fRangeEnd) {
                // end tag?
                if ('\n' != ch) {
    public XMLEditor getEditor() {
        return editor;
import org.eclipse.jface.text.IDocument;

                ch = document.getChar(cNextPos++);
                                break;
                            case END_TAG:
                                if (newLines > startNewLines + 1) {
                        ch = document.getChar(cNextPos++);

            if ('?' == ch) {
                                break;
     * {@link #calculatePositions()} is in progress.
                            ch = document.getChar(cNextPos++);


import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
                        }
    }

import org.eclipse.jface.text.Position;
        try {
            }
        while (cNextPos < fRangeEnd) {
 * See the License for the specific language governing permissions and
        } catch (BadLocationException e) {
                }
            if (cNextPos < fRangeEnd) {
        fRangeEnd = document.getLength();
                                break s;

 *
            while (cNextPos < fRangeEnd) {
                                break s;

        // 1. eat all spaces and tabs
                }
                return EOR_TAG;
                    if ('>' == ch) {
                                cNewLines += eatToEndOfLine();
        positions.add(new Position(startOffset, length));
                        ch = document.getChar(cNextPos++);
                }
                }
 * Unless required by applicable law or agreed to in writing, software
                        }
    private static final int END_TAG = 3;
            if ('/' == ch) {
            }
            }
                            newLines++;
package org.jkiss.dbeaver.ui.editors.xml;
    /**
     *
                            if ('"' == ch)
                        while (cNextPos < fRangeEnd) {
            return 0;
     * emits tokens to {@link #positions}.
                                    emitPosition(startOffset, cNextPos - startOffset);
                        int startOffset = cNextPos - 1;
                }
                    cNextPos--;
                        //String tagString = fDocument.get(startOffset, Math.min(cNextPos - startOffset, fRangeEnd - startOffset)); // this is to see where we are in the debugger
            }
    }
            // should not happen, but we treat it as end of range
        Display.getDefault().asyncExec(new Runnable() {
    }
                        }
                editor.updateFoldingStructure(positions);
                    if (('\n' == ch) || ('\r' == ch)) {
     * @return the tag classification

    }
            // consume whitespaces
            while (cNextPos < fRangeEnd) {
                s:
                    case '\r':
                    cNextPos--;
            cNextPos--;

        }
                ch = document.getChar(cNextPos++);

    }
                                return newLines;
        if (cNextPos >= fRangeEnd) {
                    ch = document.getChar(cNextPos++);
     * found). <br />
                    if ('-' == ch) {
            while ((' ' == ch) || ('\t' == ch) || ('\n' == ch) || ('\r' == ch)) {

 * distributed under the License is distributed on an "AS IS" BASIS,

                    }
    private int fOffset;
    private static final int PI_TAG = 6;
            }
                                break;
                                }
     */
                                return LEAF_TAG;
                            cNewLines++;
     * validator, it is useful.
                    } else if ('\'' == ch) {
                    } else {
            return EOR_TAG;
        calculatePositions();
                        return EOR_TAG;
     *
     */
    }
                        break;
}
 *
                            ch = document.getChar(cNextPos++);
    }
    }
     * number of newLines found by {@link #classifyTag()}
                        }
        return newLines;
                        cNewLines += eatToEndOfLine();
                                    emitPosition(startOffset, cNextPos - startOffset);
            recursiveTokens(0);
 */
                        break;
     * uses {@link #document}, {@link #fOffset} and {@link #fRangeEnd} to
    public void setProgressMonitor(IProgressMonitor monitor) {
        initialReconcile();
                        while (cNextPos < fRangeEnd) {
                cNextPos++; // must be '-' but we don't care if not
     * after the range. About syntax errors: this method is not a validator, it
                    default:
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }

            char ch = document.getChar(cNextPos++);
    /**
            if ('!' == ch) {
                        int classification = classifyTag();
        int newLines = 0;
import org.eclipse.core.runtime.IProgressMonitor;
        });
     * &lt;!...--&gt;: {@link #COMMENT_TAG} <br />
                            }

                        return START_TAG;
            }
            }
import org.eclipse.jface.text.IRegion;
            } else {
     */
     * @return number of newLines
                        while ((cNextPos < fRangeEnd) && ('\'' != ch)) {
                        switch (classification) {
     */
                            default:

        }
                ch = document.getChar(cNextPos++);
        this.editor = editor;
 * You may obtain a copy of the License at
        // Collections.sort(positions, new RangeTokenComparator());
     * when this method is called, {@link #cNextPos} must point to the character
    private static final int START_TAG = 1;
    private XMLEditor editor;
                            case PI_TAG:
                    case '"':
                            case COMMENT_TAG:
    public void setDocument(IDocument document) {
        }
                while (cNextPos < fRangeEnd) {
                                }

     * &lt;?...?&gt;: {@link #PI_TAG} <br />
                boolean piFlag = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initialReconcile() {
            public void run() {
            // processing instruction?
     * next character position - used locally and only valid while
                                if (newLines > startNewLines + 1) {
     */
                                }
            e.printStackTrace();
                                break;

            }
 * you may not use this file except in compliance with the License.
    private static final int COMMENT_TAG = 5;
                        return COMMENT_TAG;
                        }
     * The end offset of the range to be scanned

     * &lt;...&gt;: {@link #START_TAG} <br />
                            ch = document.getChar(cNextPos++);

                        break;

        try {
     */
                        }
    private final List<Position> positions = new ArrayList<>();
                        commEnd = 0;

     * classsifies a tag: <br />
                    ch = document.getChar(cNextPos++);
