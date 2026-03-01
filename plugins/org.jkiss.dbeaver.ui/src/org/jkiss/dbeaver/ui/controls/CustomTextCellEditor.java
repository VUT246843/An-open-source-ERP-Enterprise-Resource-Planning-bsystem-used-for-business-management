    }
        super.fireApplyEditorValue();
    public CustomTextCellEditor(Composite parent)
            wasNull = true;
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.utils.CommonUtils;
        super(parent);
        return 0;
        if (value == null) {
 * you may not use this file except in compliance with the License.
 * Allows null values.



        super.deactivate();
        } else {

 *
        }
 * You may obtain a copy of the License at
        // Applying the editor value will cause the layout view to refresh,
    {
 */
    public CustomTextCellEditor(Composite parent, int style) {
import org.eclipse.swt.widgets.Composite;
    private boolean wasNull;
}
    @Override
            return value;
    {
        // This can be avoided by deactivating the cell editor, so focusLost
 * limitations under the License.

 * DBeaver - Universal Database Manager
public class CustomTextCellEditor extends TextCellEditor {

        super(parent, style);
    protected Object doGetValue()
    protected int getDoubleClickTimeout() {
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.jface.viewers.TextCellEditor;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Common text cell editor.
 */

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 *
    }
        // which will in turn cause the active cell editor to apply its value again.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    {
 * Unless required by applicable law or agreed to in writing, software
        if (wasNull && "".equals(value)) {
    }
    protected void fireApplyEditorValue() {

    @Override

        // which is causing the issue will not be called.

    protected void doSetValue(Object value)
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.doSetValue(CommonUtils.toString(value));
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        final Object value = super.doGetValue();
            return null;
    }
