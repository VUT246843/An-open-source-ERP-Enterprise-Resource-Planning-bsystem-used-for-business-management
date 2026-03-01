 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        int bias = calculateBaselineOffset(gc, textWidget, line);
        Point origin = textWidget.getLocationAtOffset(offset);
    ) {


 *     http://www.apache.org/licenses/LICENSE-2.0
        int offset
        int widgetBaseline = textWidget.getBaseline(offset);

import org.eclipse.jface.text.ITextViewer;
    private static String getLineRemainder(int offset, StyledText widget) {
        FontMetrics fm = gc.getFontMetrics();
            if (endOfOriginal.length() >= length) {
        int verticalPosition = origin.y + (lineHeight - fontHeight) + bias;
     * Renders first line of hint text
                ev.y = verticalPosition;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            origin.y += textWidget.getLineHeight();
            Transform t = null;
                    return cleanSuggestion.substring(length).trim();
                ev.width = textSize.x;
}     */

        } catch (IllegalArgumentException e) {
            }
        String text,
     *
        ITextViewer viewer,
        int line = widget.getLineAtOffset(offset);
                Rectangle clip2 = gc.getClipping();
import org.eclipse.swt.graphics.*;
            origin = textWidget.getLocationAtOffset(textWidget.getCharCount() - 1);
                }
        int start = widget.getOffsetAtLine(line);
                clip2.x = origin.x;
 *
     * Calculates the baseline offset for a specified line in a StyledText widget.
        Color textBackground
                }
 *
                ev.height = textSize.y;
        return contents.substring(offset - start);
            try {
        try {
    ) {
        String endOfOriginal = originalText.length() <= 20 ?
            return 0;
            origin = textWidget.getLocationAtOffset(widgetOffset);
                if (t != null && !t.isDisposed()) {
 */
     */
    public static void drawFirstLine(
            Point textSize = gc.stringExtent(text);
        GC gc,
        int lineHeight = textWidget.getLineHeight();
        if (text != null && !gc.isDisposed()) {
    public static int calculateBaselineOffset(
        FontMetrics fm = gc.getFontMetrics();
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                Rectangle clip = gc.getClipping();
    public static void drawNextLines(
        }

                t2 = new Transform(gc.getDevice());
            gc.fillRectangle(origin.x, verticalPosition, textSize.x, textSize.y);
    ) {
            gc.drawString(text, origin.x, verticalPosition, true);
        gc.drawText(text, x, y, true);
import org.eclipse.swt.widgets.Event;
            } finally {
    }
            line = textWidget.getLineAtOffset(widgetOffset);
     * Converts a widget offset to a corresponding model offset in the text viewer.
import org.eclipse.swt.SWT;
            Transform t2 = null;
import org.eclipse.jface.text.ITextViewerExtension5;

 *
    /**
        int y = origin.y + lineHeight + (lineHeight - fontHeight);

        int fontHeight = fm.getHeight();
        String text,
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.ui.editors.sql.suggestion;

        String contents = widget.getLine(line);
                gc.setClipping(clip2);
    }
            String remaining = getLineRemainder(widgetOffset, textWidget);
            gc.setBackground(bgColor);
                t = new Transform(gc.getDevice());
        try {
 * See the License for the specific language governing permissions and
        }
    public static String removeOverlap(String originalText, String suggestion) {
                text = text.substring(0, text.length() - remaining.length());
        StyledText textWidget,
        return Math.max(0, widgetBaseline - fontBaseline);
 * Licensed under the Apache License, Version 2.0 (the "License");
                gc.setClipping(clip);
                ev.x = origin.x + textSize.x;
        endOfOriginal = endOfOriginal.replaceAll("\\s+", " ").toLowerCase();
    }
     * @param viewer       the text viewer from which the widget offset is taken
                ev.gc = gc;
        widgetOffset = Math.max(0, Math.min(widgetOffset, textWidget.getCharCount()));

                    t2.dispose();
                if (t2 != null && !t2.isDisposed()) {
            if (!remaining.isEmpty() && text.endsWith(remaining)) {
            origin.x = textWidget.getLeftMargin();
                gc.setTransform(t);
    private TextRenderingUtils() {
        int widgetOffset
     * @return the corresponding model offset in the viewer
    }
 * Unless required by applicable law or agreed to in writing, software
        int widgetLine
        int fontHeight = gc.getFontMetrics().getHeight();
/*
        StyledText textWidget,


        }
                Event ev = new Event();
        int line;

        } catch (IllegalArgumentException e) {
    /**
                gc.getTransform(t);
import org.jkiss.utils.CommonUtils;

        GC gc,
                textWidget.notifyListeners(SWT.Paint, ev);
                    t.dispose();
public class TextRenderingUtils {
        }
        }
            }
            return suggestion;
            return;
        if (gc == null) {
     * Renders continuation lines
            : widgetOffset;
                ev.widget = textWidget;
        int widgetOffset,
        int fontBaseline = fm.getAscent() + fm.getLeading();
            Color bgColor = gc.getBackground();
        GC gc,
        Point origin;
                t2.translate(textSize.x, 0);
    }
import org.eclipse.swt.custom.StyledText;
        StyledText textWidget,
        int offset = textWidget.getOffsetAtLine(widgetLine);
                if (cleanSuggestion.toLowerCase().startsWith(endSubstring)) {
                String endSubstring = endOfOriginal.substring(endOfOriginal.length() - length);
    /**
        String cleanSuggestion = suggestion.replaceAll("\\s+", " ");
    }
        if (gc == null) {

    public static int widgetOffset2ModelOffset(
     * @param widgetOffset the offset in the widget
        if (CommonUtils.isEmpty(suggestion) || CommonUtils.isEmpty(originalText)) {
 * DBeaver - Universal Database Manager
    ) {
        int x = textWidget.getLeftMargin();
 * You may obtain a copy of the License at
        }
                }
            return;


        }

    /**
     */
        return suggestion;
            originalText : originalText.substring(originalText.length() - 20);
                gc.getTransform(t2);

        for (int length = Math.min(endOfOriginal.length(), cleanSuggestion.length()); length > 0; length--) {
                gc.setTransform(t2);
        return viewer instanceof ITextViewerExtension5 ext5
            gc.setBackground(textBackground);
            ? ext5.widgetOffset2ModelOffset(widgetOffset)
            }
        int lineHeight = textWidget.getLineHeight();
    }

     */
