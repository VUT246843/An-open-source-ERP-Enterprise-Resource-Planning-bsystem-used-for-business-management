/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        editor.setModel(controller.getExecutionContext(), value);
    {
    @Override
import org.jkiss.dbeaver.ui.data.IValueController;
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
import org.eclipse.jface.action.IContributionManager;
 */
        this.controller = controller;
        editor.setModel(controller.getExecutionContext(), controller.getValue());
* ComplexValueInlineEditor
import org.jkiss.dbeaver.model.exec.DBCException;


import org.eclipse.swt.widgets.Composite;
    }
        return editor.getTree();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    {

    @Override
    protected Tree createControl(Composite editPlaceholder)
import org.jkiss.code.Nullable;
 *
    {
 * limitations under the License.
    public Object extractEditorValue()
import org.jkiss.dbeaver.ui.data.dialogs.ComplexObjectEditor;

    }
 * DBeaver - Universal Database Manager
    @Override
/*
    }


    protected ComplexObjectEditor editor;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.data.editors;
public class ComplexValueInlineEditor extends BaseValueEditor<Tree> {
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
        final boolean isDialog = valueController.getEditType() == IValueController.EditType.EDITOR;
        editor.contributeActions(manager);
}
*/
    public void primeEditorValue(@Nullable Object value) throws DBException
        editor = new ComplexObjectEditor(controller, this, isDialog ? SWT.BORDER : SWT.NONE);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public ComplexValueInlineEditor(IValueController controller) {
 * See the License for the specific language governing permissions and
 *
        super(controller);
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;

    private final IValueController controller;
        return editor.extractValue();
    @Override
    }

 * you may not use this file except in compliance with the License.
