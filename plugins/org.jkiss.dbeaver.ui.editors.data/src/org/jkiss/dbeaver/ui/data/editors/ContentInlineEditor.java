 *     http://www.apache.org/licenses/LICENSE-2.0
                    new VoidProgressMonitor(),
import org.eclipse.swt.widgets.Text;
        super(controller);
}
 *
        this.isText = ContentUtils.isTextContent(((DBDContent) controller.getValue()));
    @Override
import org.jkiss.dbeaver.utils.ContentUtils;
            maxLength = MAX_STRING_LENGTH;
public class ContentInlineEditor extends BaseValueEditor<Text> {
        }
import org.jkiss.dbeaver.model.DBValueFormatting;
    }
*/
 * You may obtain a copy of the License at
                content.updateContents(
import org.jkiss.dbeaver.ui.UIUtils;
            if (isText) {
    @Override
            } else {
                byte[] bytes = (byte[]) cachedValue;
            log.error(e);
        return editor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
            }
    {
    }
    public ContentInlineEditor(IValueController controller) {

        editor.setTextLimit((int) maxLength);
* ContentInlineEditor
        }
            if (cachedValue == null) {
        editor.setEditable(!valueController.isReadOnly());
        } catch (Exception e) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            Object cachedValue = newValue.getCachedValue();
 * See the License for the specific language governing permissions and
                content.updateContents(
import java.nio.ByteBuffer;
import org.jkiss.dbeaver.ui.data.IValueController;
                stringValue = "";  //$NON-NLS-1$
                    new StringContentStorage(newValue));
 *
import org.jkiss.dbeaver.utils.GeneralUtils;
        editor.setFont(UIUtils.getMonospaceFont());
import org.eclipse.swt.widgets.Composite;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
/**
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
                stringValue = DBValueFormatting.getBinaryPresentation(valueController.getExecutionContext().getDataSource()).toString(bytes, 0, bytes.length);
                    new BytesContentStorage(newValue.getBytes(GeneralUtils.getDefaultFileEncoding()), GeneralUtils.getDefaultFileEncoding()));
            control.selectAll();
    {
        final Text editor = new Text(editPlaceholder, SWT.BORDER);
            String stringValue;
    public Object extractEditorValue()
        try {
 *
    public void primeEditorValue(@Nullable Object value) throws DBException
                byte[] bytes = ((ByteBuffer) cachedValue).array();

                    new VoidProgressMonitor(),

        if (value instanceof DBDContentCached) {
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
        }
                stringValue = cachedValue.toString();
            DBDContentCached newValue = (DBDContentCached)value;
/*
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
    protected Text createControl(Composite editPlaceholder)
            control.setText(stringValue);
        assert content != null;

    @Override
    private static final int MAX_STRING_LENGTH = 0xfffff;


import org.jkiss.dbeaver.model.data.DBDContentCached;
        final DBDContent content = (DBDContent) valueController.getValue();

 * Licensed under the Apache License, Version 2.0 (the "License");
            maxLength = Math.min(maxLength, MAX_STRING_LENGTH);
                stringValue = DBValueFormatting.getBinaryPresentation(valueController.getExecutionContext().getDataSource()).toString(bytes, 0, bytes.length);
import org.jkiss.dbeaver.model.data.DBDContent;
    }
    }
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ui.data.editors;
        long maxLength = valueController.getValueType().getMaxLength();
 * Unless required by applicable law or agreed to in writing, software
    private final boolean isText;
 * limitations under the License.
import org.eclipse.swt.SWT;
            } else if (cachedValue instanceof ByteBuffer) {
            }
 */
        String newValue = control.getText();
    private static final Log log = Log.getLog(ContentInlineEditor.class);
            } else {
        if (maxLength <= 0) {
import org.jkiss.dbeaver.model.data.storage.BytesContentStorage;
            } else if (cachedValue instanceof byte[]) {
        } else {
        return content;

