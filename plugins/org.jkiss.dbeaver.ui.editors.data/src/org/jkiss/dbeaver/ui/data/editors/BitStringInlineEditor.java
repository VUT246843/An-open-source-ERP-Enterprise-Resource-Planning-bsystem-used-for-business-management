
                }
        super(controller);
import org.jkiss.dbeaver.DBException;
    public Object extractEditorValue()
public class BitStringInlineEditor extends BaseValueEditor<Text> {
import org.eclipse.swt.SWT;
 * DBeaver - Universal Database Manager
 * limitations under the License.
        editor.setEditable(!valueController.isReadOnly());
        } else {
                    char ch = e.text.charAt(i);
* BitStringInlineEditor
                    if (ch != '0' && ch != '1') {
import org.jkiss.code.Nullable;
/*
    public BitStringInlineEditor(IValueController controller) {
 */
    protected Text createControl(Composite editPlaceholder)
                        return;
 * Unless required by applicable law or agreed to in writing, software
 *
 * You may obtain a copy of the License at
        }
    private int getValueLength(@NotNull DBSTypedObject object) {
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
                        e.doit = false;
    @Override
    @Override
    }
    }
*/
                    }
        editor.setTextLimit(getValueLength(valueController.getValueType()));
    {
    public void primeEditorValue(@Nullable Object value) throws DBException
            public void verifyText(VerifyEvent e)
    @Override

 *

    }
    }

            {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                for (int i = 0; i < e.text.length(); i++) {
        if (object.getPrecision() != null) {
import org.jkiss.dbeaver.ui.data.IValueController;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        });
                e.doit = true;
            return Math.max(1, object.getPrecision());
        editor.addVerifyListener(new VerifyListener() {
            return Math.max(1, (int) Math.min(object.getMaxLength(), Integer.MAX_VALUE));
import org.eclipse.swt.events.VerifyEvent;
    {
            }
        final boolean inline = valueController.getEditType() == IValueController.EditType.INLINE;
    {
package org.jkiss.dbeaver.ui.data.editors;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.VerifyListener;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return editor;
/**
        final Text editor = new Text(valueController.getEditPlaceholder(), inline ? SWT.BORDER : SWT.NONE);

            @Override
        control.setText(value == null ? "" : value.toString()); //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
        return control.getText();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Text;
