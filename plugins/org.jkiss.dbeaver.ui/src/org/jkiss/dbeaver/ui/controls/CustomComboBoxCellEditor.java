            return null;
            // It is probably content assist popup - do no close editor
        init(columnViewer);
        }
    }
            // Install proposal provider for editable combos
    @Override
    protected Object doGetValue() {
            @Override
        }
        //comboBox.setEditable((getStyle() & SWT.READ_ONLY) == 0);

    }
    public CustomComboBoxCellEditor(Composite parent, String[] items) {
     * @param items the list of choices for the combo box
        if (comboBox == null || comboBox.isDisposed()) {

import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
        CCombo combo = (CCombo) this.getControl();
 *
        return false;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
            return;
            return;
    protected Control createControl(Composite parent) {
/**
 */
    private void init(ColumnViewer columnViewer) {
public class CustomComboBoxCellEditor extends ComboBoxCellEditor {
import org.eclipse.jface.viewers.ColumnViewer;
        });
import org.eclipse.swt.custom.CCombo;
        comboBox.setVisibleItemCount(15);

        if (newFocus.getShell() != getControl().getShell()) {
            } else {
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
    /**
    public CustomComboBoxCellEditor(ColumnViewer columnViewer, Composite parent, String[] items, int style) {
            } else if (value instanceof Enum) {
    public CustomComboBoxCellEditor(Composite parent, String[] items, int style) {
                columnViewer.applyEditorValue();
import org.jkiss.utils.CommonUtils;
     */
        super(parent, items, style);

    protected void doSetValue(Object value) {
import org.eclipse.swt.events.SelectionEvent;
            if (value instanceof DBPNamedObject) {

            // In fact it was a bad idea to use proposals in inline combo editors (#2409)
 * See the License for the specific language governing permissions and
        CCombo comboBox = (CCombo) getControl();
        return comboBox;
    protected void focusLost() {

    }
     * Sets the list of choices for the combo box
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setItems(String[] items) {

 * limitations under the License.
import org.eclipse.swt.widgets.Composite;
            return;
        }

    protected boolean dependsOnExternalFocusListener() {
 * You may obtain a copy of the License at
            }
        super.focusLost();
        if (comboBox == null || comboBox.isDisposed()) {
    @Override
    @Override
    }
                comboBox.setText(((Enum) value).name());
import org.eclipse.swt.SWT;
}
        if (value == null) {
        super.setItems(items);
    }

    }
 * Unless required by applicable law or agreed to in writing, software
    }
     *
 *
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.DBPNamedObject;


 * Custom combo editor
            ContentAssistUtils.installContentProposal(comboBox, new CComboContentAdapter(), proposalProvider, (getStyle() & SWT.DROP_DOWN) == 0);
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
        }
        return 0;
        CCombo comboBox = (CCombo) super.createControl(parent);
            proposalProvider.setProposals(items);
            public void widgetSelected(SelectionEvent e) {
        return comboBox.getText();
        combo.addSelectionListener(new SelectionAdapter() {
        super(parent, items);

        } else {
 *
        if ((getStyle() & SWT.READ_ONLY) == 0) {
        CCombo comboBox = (CCombo) getControl();
    }
 */
        if (newFocus == null) {
        super(parent, items, style);
    @Override
    }
            proposalProvider = new StringContentProposalProvider(true, comboBox.getItems());
    }

            comboBox.setText("");
        if (proposalProvider != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
                comboBox.setText(((DBPNamedObject) value).getName());

        comboBox.setFont(parent.getFont());
        }
        }
        }
    private StringContentProposalProvider proposalProvider;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        comboBox.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.swt.widgets.Control;
    protected int getDoubleClickTimeout() {
        Control newFocus = getControl().getDisplay().getFocusControl();

/*
                comboBox.setText(CommonUtils.toString(value));
