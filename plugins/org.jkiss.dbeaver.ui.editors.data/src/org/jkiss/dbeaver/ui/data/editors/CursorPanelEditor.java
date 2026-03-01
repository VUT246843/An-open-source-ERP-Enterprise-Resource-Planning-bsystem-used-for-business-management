 *
import org.jkiss.dbeaver.DBException;
    }
        if (control != null) {
            }
/**
import org.jkiss.dbeaver.ui.data.IValueController;
 * limitations under the License.
        super(controller);
 */
import org.jkiss.dbeaver.model.data.DBDCursor;
    {

            if (value instanceof DBDCursor) {
    @Override
/*
    @Override
    public void primeEditorValue(@Nullable Object value) throws DBException
 * Unless required by applicable law or agreed to in writing, software
    protected CursorViewComposite createControl(Composite editPlaceholder)
            control.refresh();
    public CursorPanelEditor(IValueController controller) {

}
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        CursorViewComposite viewComposite = new CursorViewComposite(editPlaceholder, getValueController());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*/
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return viewComposite;
* CursorPanelEditor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

    }
public class CursorPanelEditor extends BaseValueEditor<CursorViewComposite> {

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;

    {
        return null;

    @Override
 *


                control.setValue((DBDCursor) value);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
        // Set browser settings
    }
        }
package org.jkiss.dbeaver.ui.data.editors;
 * You may obtain a copy of the License at
    public Object extractEditorValue() throws DBCException {
import org.eclipse.swt.widgets.Composite;
