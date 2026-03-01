    }
    }
    {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isReadOnly() {
}
 *
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.layout.GridData;
    @Override

    {
        super(valueController);
import org.eclipse.swt.widgets.Composite;
    @Override
    protected Composite createDialogArea(Composite parent)
import org.jkiss.dbeaver.ui.data.editors.CursorViewComposite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class CursorViewDialog extends ValueViewDialog {
import org.jkiss.dbeaver.DBException;

    @Override
    public void primeEditorValue(@Nullable Object value) throws DBException
        cursorViewComposite.refresh();
        cursorViewComposite.refresh();
        return true;
    public boolean isDirty() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
    }
        return cursorViewComposite.isDirty();
        return cursorViewComposite == null ? null : cursorViewComposite.getControl();
 * CursorViewDialog
        cursorViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
/**
    @Override
    }
import org.jkiss.code.Nullable;
 * limitations under the License.

    @Override
 *
    }

    @Override
        cursorViewComposite = new CursorViewComposite(dialogGroup, getValueController());
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        Composite dialogGroup = super.createDialogArea(parent);
import org.jkiss.dbeaver.ui.data.IValueController;
        return null;
    public Control getControl()
 * Unless required by applicable law or agreed to in writing, software
    @Override

 * You may obtain a copy of the License at
    {


 */

package org.jkiss.dbeaver.ui.data.dialogs;
 * See the License for the specific language governing permissions and
    private CursorViewComposite cursorViewComposite;
        return dialogGroup;
 * DBeaver - Universal Database Manager

    }

 */
    public void setDirty(boolean dirty) {
    public CursorViewDialog(IValueController valueController) {
    public Object extractEditorValue()
    }
