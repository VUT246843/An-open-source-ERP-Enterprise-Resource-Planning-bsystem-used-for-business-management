                return dialogGroup;
 * Default value view dialog.

 * See the License for the specific language governing permissions and
}import org.eclipse.swt.layout.FillLayout;
public class DefaultValueViewDialog extends ValueViewDialog {
        return panelEditor == null ? null : panelEditor.getControl();
    public Object extractEditorValue()
    {
        }
 * Unless required by applicable law or agreed to in writing, software
    public Control getControl()
 * You may obtain a copy of the License at
    }
        if (referenceValueEditor.isReferenceValue()) {
 *

        super(valueController);
import org.eclipse.swt.layout.GridData;
            return dialogGroup;
    protected Composite createDialogArea(Composite parent)
    public void primeEditorValue(@Nullable Object value) throws DBException
        }

import org.jkiss.dbeaver.Log;
        ReferenceValueEditor referenceValueEditor = new ReferenceValueEditor(null, getValueController(), this);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 * limitations under the License.
import org.eclipse.swt.widgets.Control;
 *
import org.jkiss.dbeaver.ui.data.editors.ReferenceValueEditor;
    }
    {
        editorPlaceholder.setLayout(new FillLayout());
import org.jkiss.dbeaver.DBException;
    @Override
import org.eclipse.swt.widgets.Label;
            }
        panelEditor.primeEditorValue(value);
        Label label = new Label(dialogGroup, SWT.NONE);
 *     http://www.apache.org/licenses/LICENSE-2.0

        Composite dialogGroup = super.createDialogArea(parent);
 *
        GridData gd = new GridData(GridData.FILL_BOTH);

        label.setText(ResultSetMessages.dialog_data_label_value);
        try {

    }

    private IValueEditor panelEditor;


        return dialogGroup;
        Composite editorPlaceholder = UIUtils.createPlaceholder(dialogGroup, 1);
    }
import org.eclipse.swt.widgets.Composite;
            panelEditor.primeEditorValue(getValueController().getValue());
    @Override
import org.jkiss.dbeaver.ui.data.IValueEditor;
    private static final Log log = Log.getLog(DefaultValueViewDialog.class);
 * you may not use this file except in compliance with the License.
    {
    @Override
 */
    public DefaultValueViewDialog(IValueController valueController) {

    public boolean isDirty() {
        return panelEditor.isDirty();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (DBException e) {
    }
import org.jkiss.code.Nullable;
    @Override
        gd.minimumHeight = label.computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 4;
            if (panelEditor == null) {
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Uses panel editor inside of value viewer.

    }
    public void setDirty(boolean dirty) {
import org.jkiss.dbeaver.ui.data.IValueController;
package org.jkiss.dbeaver.ui.data.dialogs;
            referenceValueEditor.createEditorSelector(dialogGroup);

        editorPlaceholder.setLayoutData(gd);
    @Override

            log.error(e);
        panelEditor.setDirty(dirty);
/**
            panelEditor = createPanelEditor(editorPlaceholder);
/*
    {
        return panelEditor.extractEditorValue();
 */
import org.jkiss.dbeaver.ui.UIUtils;

    @Override
        throws DBException
