 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                return Boolean.FALSE;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.eclipse.swt.widgets.Composite;
/*
/**
    }
    public Object extractEditorValue()
    protected Combo createControl(Composite editPlaceholder)
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                return Boolean.TRUE;
        switch (control.getSelectionIndex()) {

 *
public class BooleanInlineEditor extends BaseValueEditor<Combo> {
 * See the License for the specific language governing permissions and
    {
        super(controller);

    public void primeEditorValue(@Nullable Object value) throws DBException

    }
import java.util.Locale;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

        editor.add("TRUE");
        editor.setEnabled(!valueController.isReadOnly());
    }
            default:
                return null;
package org.jkiss.dbeaver.ui.data.editors;
import org.jkiss.dbeaver.DBException;
            case 0:
import org.eclipse.swt.widgets.Combo;


        editor.add("FALSE");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        }
        return editor;
    {
 * DBeaver - Universal Database Manager
* BooleanInlineEditor
    public BooleanInlineEditor(IValueController controller) {
import org.eclipse.swt.SWT;
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 *
            case 1:
}
 * limitations under the License.
    }
        control.setText(value == null ? "FALSE" : value.toString().toUpperCase(Locale.ENGLISH));
 * Unless required by applicable law or agreed to in writing, software
*/
    @Override
        final Combo editor = new Combo(editPlaceholder, SWT.READ_ONLY);
import org.jkiss.dbeaver.ui.data.IValueController;
 */
