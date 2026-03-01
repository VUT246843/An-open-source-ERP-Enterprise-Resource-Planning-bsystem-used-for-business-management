 * See the License for the specific language governing permissions and
public class VerticalFolder extends Canvas {
    }
        Point size = super.computeSize(wHint, hHint, changed);

 * Copyright (C) 2010-2024 DBeaver Corp and others
    private List<VerticalButton> items = new ArrayList<>();
import org.eclipse.swt.graphics.Font;
    public void removeAll() {
    }
    }
 *
    }
        this.items.remove(item);
        selectedItem =  item;
    }
 *
    }

            item.setFont(font);
    }

        event.widget = this;
/*

    public boolean isLeft() {
        super.setFont(font);
        for (VerticalButton item : items) {
    @Override

    }


    private boolean checkCommandEnablement;

    public void addSelectionListener(SelectionListener listener) {
    public VerticalFolder(Composite parent, int style) {
 * Unless required by applicable law or agreed to in writing, software
        gl.horizontalSpacing = 0;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.layout.GridLayout;
        return items.size();
    public Point computeSize(int wHint, int hHint, boolean changed) {
import org.eclipse.swt.SWT;
        return size;
import org.eclipse.swt.widgets.Event;
package org.jkiss.dbeaver.ui.controls;
    }
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * limitations under the License.
        return isLeft;
    public void setCheckCommandEnablement(boolean checkCommandEnablement) {
        return checkCommandEnablement;
            item.layout(true, true);
        }
    public void setFont(Font font) {
    }

        gl.marginWidth = 2;
        this.isLeft = (style & SWT.LEFT) == SWT.LEFT;

            b.redraw();
    @Override


    }
    private VerticalButton selectedItem;
    }

 * DBeaver - Universal Database Manager
        UIUtils.createEmptyLabel(this, 1, 1).setLayoutData(new GridData(GridData.FILL_VERTICAL));
        gl.verticalSpacing = 0;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.events.SelectionListener;
 * you may not use this file except in compliance with the License.
    public void redraw() {
        return items.toArray(new VerticalButton[0]);

    public int getItemCount() {

import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.events.SelectionEvent;
    public void addVerticalGap() {

    public void removeItem(VerticalButton item) {
        }
    }
        super(parent, style);
        gl.marginHeight = 0;
        notifyListeners(SWT.Selection, event);
    }
    public void addItem(VerticalButton item) {

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;
        this.checkCommandEnablement = checkCommandEnablement;
    public void setSelection(VerticalButton item) {


        this.setLayout(gl);

import org.eclipse.swt.widgets.Control;
import java.util.List;
import org.eclipse.swt.widgets.Composite;
}
        GridLayout gl = new GridLayout(1, true);
    }
        return selectedItem;
 *

        super.redraw();
 * You may obtain a copy of the License at
        for (VerticalButton b : items) {
import org.eclipse.swt.layout.GridData;
 */
    public boolean isCheckCommandEnablement() {
        items.add(item);
        for (Control child : getChildren()) {
    public VerticalButton getSelection() {

        UIUtils.disposeChildControls(this);
import org.eclipse.swt.graphics.Point;
            child.redraw();
        Event event = new Event();
        }
    public VerticalButton[] getItems() {
    private boolean isLeft;
        addListener(SWT.Selection, event -> listener.widgetSelected(new SelectionEvent(event)));
 * Licensed under the Apache License, Version 2.0 (the "License");

