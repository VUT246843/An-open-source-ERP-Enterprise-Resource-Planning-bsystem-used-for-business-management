 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
    public Rectangle getInsertionBounds(Control control) {
/*
 * you may not use this file except in compliance with the License.
        Point caretOrigin = styledText.getLocationAtOffset(styledText.getCaretOffset());
    public void setCursorPosition(Control control, int position) {
 * See the License for the specific language governing permissions and
 * StyledTextContentAdapter
package org.jkiss.dbeaver.ui.contentassist;
        // Insert will leave the cursor at the end of the inserted text. If this
    }
public class StyledTextContentAdapter implements IControlContentAdapter, IControlContentAdapter2 {
import org.eclipse.swt.custom.StyledText;

        return ((StyledText)control).getCaretOffset();
        return ((StyledText)control).getSelection();
 *
        StyledText styledText = ((StyledText)control);
    @Override
    @Override
 * DBeaver - Universal Database Manager
    @Override
        styledText.insert(text);
        // See https://bugs.eclipse.org/bugs/show_bug.cgi?id=52520
        if (cursorPosition <= text.length()) {
    @Override
    public void insertControlContents(Control control, String text, int cursorPosition) {
        return ((StyledText)control).getText();

 * You may obtain a copy of the License at
 */
        StyledText styledText = ((StyledText)control);
    }
    public Point getSelection(Control control) {
    }
    public int getCursorPosition(Control control) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.graphics.Point;


        }
        // We fudge the y pixels due to problems with getCaretLocation

    }
        ((StyledText)control).setSelection(new Point(position, position));
 */
        return new Rectangle(
    public void setControlContents(Control control, String text, int cursorPosition) {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.fieldassist.IControlContentAdapter;
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            styledText.setSelection(selection.x + cursorPosition, selection.x + cursorPosition);
            caretOrigin.x + styledText.getClientArea().x,

/**
        Point selection = styledText.getSelection();
import org.eclipse.jface.fieldassist.IControlContentAdapter2;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            caretOrigin.y + styledText.getClientArea().y + 3, 1, styledText.getLineHeight());
 * limitations under the License.
    public String getControlContents(Control control) {
    @Override
}
    }
 *
    @Override
        // is not what we wanted, reset the selection.
    public void setSelection(Control control, Point range) {
import org.eclipse.swt.graphics.Rectangle;
        ((StyledText)control).setText(text);

    }
        ((StyledText)control).setSelection(cursorPosition, cursorPosition);
        ((StyledText)control).setSelection(range);


