    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return editor;
 *
*/
        editor.addSelectionListener(new SelectionAdapter() {
        });
 * See the License for the specific language governing permissions and
    {
            case 1:
                return Boolean.TRUE;
                return Boolean.FALSE;
/**
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionAdapter;

import org.jkiss.code.Nullable;
        DBSTypedObject attr = valueController.getValueType();
    {
import org.eclipse.swt.events.SelectionEvent;
* BitInlineEditor
        }
    @Override
    protected Combo createControl(Composite editPlaceholder)
        }
public class BitInlineEditor extends BaseValueEditor<Combo> {
 * you may not use this file except in compliance with the License.
 *

import org.eclipse.swt.widgets.Composite;
        switch (control.getSelectionIndex()) {
    {
    public BitInlineEditor(IValueController controller) {
    }
package org.jkiss.dbeaver.ui.data.editors;
/*
import org.jkiss.dbeaver.model.DBConstants;
    public void primeEditorValue(@Nullable Object value) throws DBException
        editor.add(Boolean.TRUE.toString());
            value = ((Number) value).byteValue() != 0;
        if (value instanceof Number) {
        editor.setEnabled(!valueController.isReadOnly());
    }
        control.setText(value == null ? DBConstants.NULL_VALUE_LABEL : value.toString()); //$NON-NLS-1$
    @Override
            case 0:
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * limitations under the License.
        final Combo editor = new Combo(valueController.getEditPlaceholder(), SWT.READ_ONLY);
        }
            }
    }
            public void widgetSelected(SelectionEvent e) {
    @Override
    public Object extractEditorValue()
        editor.add(Boolean.FALSE.toString());
 *

import org.eclipse.swt.SWT;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        super(controller);
            editor.add(DBConstants.NULL_VALUE_LABEL);
 * You may obtain a copy of the License at
            @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                saveValue();


 * distributed under the License is distributed on an "AS IS" BASIS,
        if (attr instanceof DBSAttributeBase && !((DBSAttributeBase) attr).isRequired()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            default:
import org.jkiss.dbeaver.ui.data.IValueController;
 */
import org.jkiss.dbeaver.DBException;
                return null;
import org.eclipse.swt.widgets.Combo;
