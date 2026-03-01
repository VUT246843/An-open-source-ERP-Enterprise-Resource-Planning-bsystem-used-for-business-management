        }
                false);
        DBCExecutionContext executionContext = valueController.getExecutionContext();
import org.eclipse.swt.widgets.Text;

            editor.setFont(UIUtils.getMonospaceFont());
            if (control instanceof Text text) {
import org.eclipse.swt.custom.StyledText;
import org.jkiss.dbeaver.ui.data.IValueController;
    @Override
                strValue,
            if (valueController.getEditType() == IValueController.EditType.INLINE) {
        } else if (control instanceof StyledText styledText) {
import org.jkiss.code.Nullable;
        if (inline) {
    public StringInlineEditor(IValueController controller) {
/*
            String strValue;
            }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            return valueController.getValueHandler().getValueFromObject(
            } else {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            value,
    public void primeEditorValue(@Nullable Object value) throws DBException
import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
            final StyledText editor = new StyledText(editPlaceholder, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
            DBCExecutionPurpose.UTIL,
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.data.editors;
 * Relies on StyledText. After all it is better.
import org.eclipse.swt.widgets.Composite;
            }
}
 * You may obtain a copy of the License at
        } else {
    @Override
* StringInlineEditor.
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else if (control instanceof StyledText styledText){
        final String strValue = valueController.getValueHandler().getValueDisplayString(
            text.setText(strValue);
            editor.setEditable(!valueController.isReadOnly());
                return null;
import org.jkiss.dbeaver.model.exec.DBCException;
*/
public class StringInlineEditor extends BaseValueEditor<Control> {
            new VoidProgressMonitor(),
            "Make string value from editor"
            return editor;
 * Unless required by applicable law or agreed to in writing, software
            //editor.setFont(UIUtils.getMonospaceFont());
/**
        }
        }
    @Override
    }
        try (DBCSession session = executionContext.openSession(
        )) {

            valueController.getValueType(),
 *
    public Object extractEditorValue() throws DBCException {
 *
import org.jkiss.dbeaver.model.exec.DBCSession;
    {

                text.selectAll();
    }
 * limitations under the License.
            final Text editor = new Text(editPlaceholder, SWT.BORDER);
            StyledTextUtils.fillDefaultStyledTextContextMenu(editor);

            DBDDisplayFormat.EDIT
            return null;
        );

                styledText.selectAll();
 */
                strValue = text.getText();
    }
        }
                valueController.getValueType(),
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    protected Control createControl(Composite editPlaceholder) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (control instanceof Text text) {
            if (valueController.getEditType() == IValueController.EditType.INLINE) {
    private static final int MAX_STRING_LENGTH = 0xffff;
 *
import org.jkiss.dbeaver.ui.UIUtils;
            editor.setEditable(!valueController.isReadOnly());
 * See the License for the specific language governing permissions and
        final boolean inline = valueController.getEditType() == IValueController.EditType.INLINE;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        super(controller);
            //editor.setTextLimit(MAX_STRING_LENGTH);
            }
                false,
import org.eclipse.swt.widgets.Control;

                session,
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
    }
import org.eclipse.swt.SWT;
            return editor;
                strValue = styledText.getText();
        if (executionContext == null) {
            //editor.setTextLimit(MAX_STRING_LENGTH);
 * distributed under the License is distributed on an "AS IS" BASIS,
            styledText.setText(strValue);
