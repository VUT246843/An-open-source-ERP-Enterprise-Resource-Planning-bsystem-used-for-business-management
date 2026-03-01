        }
        this.control.addSelectionListener(new SelectionAdapter() {
    @Override

                UIUtils.drawMessageOverControl(control, e, "No items found", 0);
public class AdvancedListViewer extends StructuredViewer {
        return control;
            if (control.getItems().length == 0 && filters != null && filters.length > 0) {
 */
    }
 *
    }
    public void resetFilters() {
        internalRefresh(getInput());
        Object[] elements = contentProvider.getElements(element);

        //control.showControl();
        }
    }
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.controls.finder.AdvancedListItem;

    protected void inputChanged(Object input, Object oldInput) {
    @Override
        this.control = new AdvancedList(parent, style);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (item != null) {
        List<Object> list = new ArrayList<>();

    @Override
        //IToolTipProvider toolTipProvider = labelProvider instanceof IToolTipProvider ? (IToolTipProvider) labelProvider : null;
    }
    @Override
    }
import org.eclipse.swt.widgets.Control;

        for (Object item : elements) {
/**
 *
    }
            ViewerFilter[] filters = getFilters();

import java.util.ArrayList;
        control.redraw();
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");
        control.addPaintListener(e -> {

            }
        }
        ILabelProvider labelProvider = (ILabelProvider) getLabelProvider();
        super.setFilters(filters);
        control.removeAll();


    @Override
import org.jkiss.dbeaver.ui.UIUtils;
    protected void setSelectionToWidget(List l, boolean reveal) {
    private AdvancedList control;
        return null;
 * You may obtain a copy of the License at
            new AdvancedListItem(control, item, labelProvider);

        return null;

 * limitations under the License.
            elements = filter.filter(this, (Object)null, elements);
            }
    public void reveal(Object element) {
        AdvancedListItem item = this.control.getSelectedItem();
    protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
    protected Widget doFindItem(Object element) {
    }
/*

    @Override
                fireSelectionChanged(new SelectionChangedEvent(AdvancedListViewer.this, getSelection()));
import org.eclipse.swt.widgets.Widget;
            list.add(item.getData());
    private static final Log log = Log.getLog(AdvancedListViewer.class);
package org.jkiss.dbeaver.ui.controls.finder.viewer;
}
 *
import java.util.List;
            public void widgetSelected(SelectionEvent e) {
        super.inputChanged(input, oldInput);
            @Override
    protected List<Object> getSelectionFromWidget() {
    }

    @Override
 * you may not use this file except in compliance with the License.
    protected void internalRefresh(Object element) {

    }
    public Control getControl() {
    protected Widget doFindInputItem(Object element) {
    public AdvancedListViewer(Composite parent, int style) {
import org.eclipse.jface.viewers.*;
import org.jkiss.dbeaver.Log;
            public void widgetDefaultSelected(SelectionEvent e) {
 */

    }



import org.jkiss.dbeaver.ui.controls.finder.AdvancedList;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

                fireDoubleClick(new DoubleClickEvent(AdvancedListViewer.this, getSelection()));
        });

import org.eclipse.swt.events.SelectionAdapter;
    @Override
        control.refreshFilters();
 * AdvancedListViewer

        super.resetFilters();
        });
            @Override
        control.refreshFilters();
        for (ViewerFilter filter : getFilters()) {
    @Override
        return list;
    @Override
        IStructuredContentProvider contentProvider = (IStructuredContentProvider) getContentProvider();
    }
            }
import org.eclipse.swt.events.SelectionEvent;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public void setFilters(ViewerFilter... filters) {
