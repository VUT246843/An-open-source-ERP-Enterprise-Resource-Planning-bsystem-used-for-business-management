 *
    }
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
*/
 * See the License for the specific language governing permissions and
public class BooleanPanelEditor extends BaseValueEditor<List> {
 * You may obtain a copy of the License at

    }
        super(controller);
/**
    }

    public BooleanPanelEditor(IValueController controller) {
 */
        editor.add("FALSE");
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.SWT;
}
 * you may not use this file except in compliance with the License.
        editor.add("TRUE");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.data.IValueController;
        control.setSelection(Boolean.TRUE.equals(value) ? 1 : 0);
        final List editor = new List(valueController.getEditPlaceholder(), SWT.SINGLE | SWT.READ_ONLY);
 * limitations under the License.

/*
* BooleanPanelEditor
    public void primeEditorValue(@Nullable Object value) throws DBException
package org.jkiss.dbeaver.ui.data.editors;
import org.eclipse.swt.widgets.Composite;
 * Unless required by applicable law or agreed to in writing, software
        return control.getSelectionIndex() == 1;
    {
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.jkiss.code.Nullable;
    @Override

        return editor;
    {

    protected List createControl(Composite editPlaceholder)
    public Object extractEditorValue()
import org.eclipse.swt.widgets.List;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
