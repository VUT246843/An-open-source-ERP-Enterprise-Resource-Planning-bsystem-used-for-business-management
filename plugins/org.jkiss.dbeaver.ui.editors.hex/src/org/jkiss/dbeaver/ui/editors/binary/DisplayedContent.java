        numberOfColumns = columns <= 0 ? 1 : columns;
        int dataLength = data.length();
        else
        textListeners = new HashSet<>();
    }

        for (TextChangeListener myTextListener : textListeners) myTextListener.textChanged(changedEvent);
        return data.substring(start, Math.min(dataLength, start + length));

    public void addTextChangeListener(TextChangeListener listener)
    }
            return getLineCount() - 1;
 * StyledTextContent customised for content that fills up to one page of the StyledText widget. No line

        TextChangedEvent changedEvent = new TextChangedEvent(this);
        if (start > dataLength || start < 0)
    public void removeTextChangeListener(TextChangeListener listener)
    public String getLine(int lineIndex)
        event.replaceLineCount = linesInText;
        return result;
        int linesInText = (text.length() - 1) / numberOfColumns + 1;


    @Override
    }

        changedEvent = new TextChangedEvent(this);

    }
        for (TextChangeListener textListener : textListeners) {
                log.debug("Internal error while notifying display content listeners: " + e.getClass().getName() + ": " + e.getMessage());
     * @param forward shifts lines either forward or backward
    DisplayedContent(int numberOfColumns, int numberOfLines)

        int length = text.length();
        event = new TextChangingEvent(this);
        event.replaceLineCount = 0;
 *

        for (TextChangeListener myTextListener : textListeners) myTextListener.textChanged(changedEvent);
     * @param text    to replace new empty lines. Its size determines the number of lines to shift
        return getTextRange(lineIndex * numberOfColumns, numberOfColumns);
        setText(data.toString());

    @Override
import org.jkiss.dbeaver.Log;
    {
    }
    /**
    @Override
        data.append(text, 0, Math.min(text.length(), Math.max(0, linesTimesColumns)));
}
        }
        event.newText = text;

    /**



    public String getTextRange(int start, int length)
        event.replaceCharCount = linesInText * numberOfColumns - linesTimesColumns + currentLimit;

//	event.start = forward ? linesTimesColumns : 0;
    @Override
     */
    }
package org.jkiss.dbeaver.ui.editors.binary;
 * you may not use this file except in compliance with the License.
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        event.newCharCount = 0;
        TextChangingEvent event = new TextChangingEvent(this);
        if (text.length() == 0) return;
     *
        return data.length();

import org.eclipse.swt.custom.TextChangeListener;
    @Override
    private int linesTimesColumns = -1;
    {
        setDimensions(numberOfColumns, numberOfLines);
    public int getLineCount()
 *     http://www.apache.org/licenses/LICENSE-2.0
    {

    private StringBuilder data = null;
        textListeners.remove(listener);
            try {
    {
     * Create empty content for a StyledText of the specified size
    private Set<TextChangeListener> textListeners = null;
import org.eclipse.swt.custom.TextChangingEvent;
/**
    @Override
     */

        event.replaceCharCount = 0;
            }

            return;

    @Override
    //private int numberOfLines = -1;
    {

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    @Override
        TextChangedEvent changedEvent = new TextChangedEvent(this);
/*
        for (TextChangeListener myTextListener : textListeners) myTextListener.textChanging(event);
    private int numberOfColumns = -1;
import org.eclipse.swt.custom.TextChangedEvent;
     */

    }
    public int getLineAtOffset(int offset)
        linesTimesColumns = lines * columns;
     */
        //numberOfLines = lines;
        event.start = forward ? 0 : currentLimit;
    @Override
    /**
        return (data.length() - 1) / numberOfColumns + 1;
     * @see org.eclipse.swt.custom.StyledTextContent#replaceTextRange(int, int, java.lang.String)
        event.newLineCount = 0;
    {
        event.newCharCount = text.length();
     *
 *
        event.newText = "";
        return "";
    {
    }
    public int getCharCount()
    public int getOffsetAtLine(int lineIndex)
    {
    }
    /**
        data.replace(start, start + length, text);
            data.delete(0, event.replaceCharCount);
        for (TextChangeListener myTextListener : textListeners) myTextListener.textChanging(event);
                textListener.textSet(changedEvent);
    }
     *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (forward)


        if (listener == null) throw new IllegalArgumentException("Cannot add a null listener");
        event.newLineCount = linesInText;
 *

     * @see org.eclipse.swt.custom.StyledTextContent#setText(java.lang.String)

    private static final Log log = Log.getLog(DisplayedContent.class);

        event.start = forward ? linesTimesColumns - 1 : 0;

import java.util.HashSet;
    public void replaceTextRange(int start, int replaceLength, String text)
 * Licensed under the Apache License, Version 2.0 (the "License");
        int result = offset / numberOfColumns;

 * DBeaver - Universal Database Manager

 * @author Jordi
    {

    }

    @Override
        data.setLength(0);
    public void shiftLines(String text, boolean forward)


            } catch (Exception e) {
        if (length != replaceLength || start + length > data.length())
    {

 */
            data.delete(linesTimesColumns, linesTimesColumns + event.replaceCharCount);
    {
        return lineIndex * numberOfColumns;
     * <code>shiftLines()</code> instead.
    public String getLineDelimiter()
//	data.delete(event.start, event.start + event.replaceCharCount);
 * distributed under the License is distributed on an "AS IS" BASIS,

        if (result >= getLineCount())
        textListeners.add(listener);
     * @param numberOfColumns
        data = new StringBuilder(numberOfColumns * numberOfLines * 2);  // account for replacements
        if (listener == null) throw new IllegalArgumentException("Cannot remove a null listener");
    }
    void setDimensions(int columns, int lines)
 *

 * delimiters, content wraps lines.
    }
    {

 * You may obtain a copy of the License at
    public void setText(String text)

     * Shifts full lines of text and fills the new empty space with text

import java.util.Set;

     * @param numberOfLines
     * replaceLength (when the content's size won't change). For other cases use <code>setText()</code> or
 * limitations under the License.
 */
        data.insert(event.start, text);
    @Override
        int currentLimit = Math.min(data.length(), linesTimesColumns);
     * Replaces part of the content with new text. Works only when the new text length is the same as
import org.eclipse.swt.custom.StyledTextContent;
public class DisplayedContent implements StyledTextContent {

    {
            return "";
