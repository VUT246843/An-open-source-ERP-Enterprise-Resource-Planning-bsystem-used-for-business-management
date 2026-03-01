                while (prevOffset >= topIndex) {
 * limitations under the License.
 *
        return startOffset;

    {
    {
                        inQuote = !inQuote;
    public SQLWordPartDetector(IDocument document, SQLSyntaxManager syntaxManager, int documentOffset, int prevWordsParse)
                    if (isWordPart(ch)) {
    private String fullWord;
                    if (isQuote(c)) {
                } else if (isQuote(c)) {
                if (nextOffset > wordPos) {
import java.util.Locale;
            while (prevOffset >= topIndex) {
    {
                    } else {
        super(syntaxManager.getDialect(), syntaxManager.getStructSeparator(), syntaxManager.getIdentifierQuoteStrings());
import org.eclipse.jface.text.IDocument;
    {
    }
                        if (startOffset > 1 && syntaxManager.getStructSeparator() == document.getChar(startOffset - 1)) {
                }
                    break;
public class SQLWordPartDetector extends SQLIdentifierDetector
    {
        return super.splitIdentifier(wordPart);
        return wordPart;

                        } else {
    }
                        break;
                } else if (isWordPart(c)) {

     * Method SQLWordPartDetector.
    }
                    inQuote = true;
                        }
                    }
    {


     * @param document text document
                int nextOffset = documentOffset;
                    }


                        }
            // do nothing
                    char ch = document.getChar(prevOffset);
    }
                    } else if (inQuote || isWordPart(ch)) {

    }
     */
    }
    private int prevKeyWordOffset = -1;
        endOffset = documentOffset;
                if (dialect.isEntityQueryWord(prevWord) || dialect.isAttributeQueryWord(prevWord) || SQLUtils.isExecKeyword(dialect, prevWord)) {
                            inQuote = false;
        return prevWords;
    public int getLength()

                }
                    }
                    } else {
    }
    public void shiftOffset(int offset) {
 * DBeaver - Universal Database Manager
                }
                while (nextOffset < documentLength) {
            fullWord = document.get(startOffset, endOffset - startOffset);

     * @param documentOffset into the SQL document
    public int getEndOffset()
                }
                    startOffset--;
     */
    public String getPrevDelimiter()
                if (prevOffset < topIndex) {
                prevOffset--;
        int shift = startOffset - delimiterOffset;
        startOffset -= shift;
                    // Opening quote
                    // Add only second word (first is in prevKeyword)
 *
        return endOffset;
                }
            String contentType = TextUtilities.getContentType(document, SQLParserPartitions.SQL_PARTITIONING, documentOffset, true);
                    prevOffset--;
    public int getCursorOffset()
package org.jkiss.dbeaver.model.sql.parser;
    
                            startOffset--;
                while (nextOffset < documentLength) {
 * You may obtain a copy of the License at
     *
            {
 *
 */
                        this.prevKeyWordOffset = prevOffset;
                    prevPiece.insert(0, ch);
 * See the License for the specific language governing permissions and
import java.util.List;
    public int getStartOffset()
            }
                } else {

                            startOffset--;
    }
            int prevOffset = startOffset;
                            // Previous char is a separator. Keep going. This is a part of a long name #13004
            // Get next keyword
    public String[] splitWordPart()
     * @return String
                    startOffset--;
                        break;
import java.util.ArrayList;
            //we've been one step too far : increase the offset
     * Method getWordPart.
                        break;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    nextOffset++;


        return nextWord;
    public String getNextWord() {
    }
                while (prevOffset >= topIndex) {
import org.jkiss.utils.CommonUtils;
                        this.prevKeyWord = prevWord.toUpperCase(Locale.ENGLISH);
    public int getPrevKeyWordOffset() {
    private String wordPart;
                for (String delim : syntaxManager.getStatementDelimiters()) {
        return prevKeyWordOffset;
                    } else if (!Character.isWhitespace(ch)) {
    }
    /**
    {
     *

                }
                            break;
                int wordPos = nextOffset;
                    if (!isWordPart(ch)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    } else {

                    prevOffset = topIndex;
                }
                        delimiterOffset = prevOffset;
    {
                if (inQuote || inString) {
                    char ch = document.getChar(prevOffset);
                        if (prevWordsParse <= 1) {
            startOffset++;
                            break;
            boolean inString = SQLParserPartitions.CONTENT_TYPE_SQL_STRING.equals(contentType);
    private List<String> prevWords = null;
                    if (isQuote(ch)) {
                        // Statement delimiter found - do not process to previous keyword
import org.eclipse.jface.text.TextUtilities;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {
        this(document, syntaxManager, documentOffset, 1);
    private int cursorOffset;

            }
 */
    public List<String> getPrevWords()
     * Previous valuable entity or attribute manipulation keyword.
        }
        startOffset = documentOffset - 1;

                    prevWords = new ArrayList<>();
                        prevOffset--;
        return cursorOffset;
                        break;
    {
    public void moveToDelimiter() {
    {
    public SQLWordPartDetector(IDocument document, SQLSyntaxManager syntaxManager, int documentOffset)
    }
    /**
            }
                        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private int startOffset;
    private int endOffset;
                    }
 * Used to scan and detect for SQL keywords.
                        nextOffset++;
                if (prevWords == null) {
import org.jkiss.dbeaver.model.sql.SQLUtils;

                    }
                char c = document.getChar(startOffset);
    private String nextWord;

                }
                inQuote = false;
            // Get previous keyword
                    startOffset--;
import org.eclipse.jface.text.BadLocationException;
                    if (CommonUtils.isEmpty(prevKeyWord)) {
            while (startOffset >= topIndex && startOffset < documentLength) {
        } catch (BadLocationException e) {
/**
                    startOffset--;
    private String prevDelimiter = null;

                    inString = true;
    public String getWordPart()
                endOffset++;
 * you may not use this file except in compliance with the License.
                // Skip whitespaces
                        prevOffset--;
                    char ch = document.getChar(nextOffset);
    }
    }
    private String prevKeyWord = "";
                    char ch = document.getChar(nextOffset);
                    nextWord = document.get(wordPos, nextOffset - wordPos);
                    prevDelimiter = prevPiece.toString().trim();
            boolean inQuote = SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED.equals(contentType);
                if (!prevWord.equals(prevKeyWord)) {
                        prevOffset++;
                String prevWord = document.get(prevOffset, prevStartOffset - prevOffset);
                    if (!isWordPart(ch)) {
    }
                            break;
                    } else if (isStringQuote(c)) {
                    //startOffset - prevPiece.length();
                        return;
                        break;
    private int delimiterOffset;
    {
        cursorOffset = documentOffset;
                if (prevDelimiter == null) {
                int prevStartOffset = prevOffset + 1;
                }
     */
                    prevWords.add(prevWord);
        startOffset += offset;
                } else if (isStringQuote(c)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        return endOffset - startOffset;
                }

    public String getFullWord()
                    }

    }
/*
            }
        int topIndex = 0, documentLength = document.getLength();
                }
            wordPart = document.get(startOffset, documentOffset - startOffset);
                    if (prevPiece.indexOf(delim) != -1) {
    public String getPrevKeyWord() {
}                }

     * @param syntaxManager syntax manager
    /**
    }
                    }
            while (endOffset < documentLength && isWordPart(document.getChar(endOffset))) {
{
                StringBuilder prevPiece = new StringBuilder();
        return prevDelimiter;
     * All functions, aggregate operators and other keywords are ignored.
                        if (prevWords != null && prevWords.size() >= prevWordsParse) {
        return fullWord;
        return prevKeyWord;
