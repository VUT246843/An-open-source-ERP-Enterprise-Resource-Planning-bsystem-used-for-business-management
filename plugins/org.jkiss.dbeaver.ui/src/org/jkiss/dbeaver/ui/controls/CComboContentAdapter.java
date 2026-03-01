    @Override

    }
    public void setControlContents(Control control, String text,
    }
        return new Rectangle(combo.getClientArea().x + extent.x, combo
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
}
    @Override
            .setSelection(new Point(cursorPosition, cursorPosition));
                                      int cursorPosition) {
 *
        Point extent = UIUtils.getTextSize(combo,


        return ((CCombo) control).getText();
 *
        int position = combo.getSelection().y;
import org.eclipse.swt.graphics.Point;

    @Override
    public void setCursorPosition(Control control, int index) {
import org.eclipse.swt.graphics.Rectangle;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

        ((CCombo) control).setSelection(range);
 * limitations under the License.
/*
import org.eclipse.jface.fieldassist.IControlContentAdapter2;
import org.eclipse.swt.widgets.Control;
    @Override
                                   int cursorPosition) {
    public Point getSelection(Control control) {
    @Override
        CCombo combo = (CCombo) control;
        // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=204599
        ((CCombo) control)

 * you may not use this file except in compliance with the License.
        String contents = combo.getText();
 * You may obtain a copy of the License at
        CCombo combo = (CCombo) control;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
 */
 * DBeaver - Universal Database Manager
    public String getControlContents(Control control) {

public class CComboContentAdapter implements IControlContentAdapter, IControlContentAdapter2 {
 * Unless required by applicable law or agreed to in writing, software
            .getClientArea().y, 1, combo.getClientArea().height);
        return ((CCombo) control).getSelection();
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.controls;
    }
    }

            contents.substring(0, Math.min(position,
        return ((CCombo) control).getSelection().x;
    public int getCursorPosition(Control control) {
        ((CCombo) control).setSelection(new Point(index, index));
import org.eclipse.swt.custom.CCombo;
    public void insertControlContents(Control control, String text,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.fieldassist.IControlContentAdapter;
        ((CCombo) control).setText(text);
        combo.setText(text);
        // This doesn't take horizontal scrolling into affect.
 * See the License for the specific language governing permissions and
                contents.length())));
        combo.setSelection(new Point(0, text.length()));
    @Override
    public Rectangle getInsertionBounds(Control control) {


import org.jkiss.dbeaver.ui.UIUtils;
    @Override
    public void setSelection(Control control, Point range) {
