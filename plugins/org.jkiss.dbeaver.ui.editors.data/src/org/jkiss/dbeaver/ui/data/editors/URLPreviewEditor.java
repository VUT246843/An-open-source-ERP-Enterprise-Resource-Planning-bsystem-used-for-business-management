    public URLPreviewEditor(IValueController controller) {
import org.jkiss.utils.CommonUtils;
 *
 * DBeaver - Universal Database Manager
        return browser;
import org.eclipse.swt.browser.Browser;
package org.jkiss.dbeaver.ui.data.editors;
import org.jkiss.dbeaver.model.exec.DBCException;

            lastURL = strValue;
        Browser browser = new Browser(editPlaceholder, SWT.NONE);
        return control == null? null : control.getUrl();
    }
import org.eclipse.swt.widgets.Composite;
    {
    }
 * you may not use this file except in compliance with the License.
    public Object extractEditorValue() throws DBCException {
        super(controller);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void primeEditorValue(@Nullable Object value) throws DBException
            final String strValue = valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.UI);
            if (CommonUtils.equalObjects(lastURL, strValue)) {
    private String lastURL;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
                return;
        if (control != null) {
}
    }

 * limitations under the License.
 *
import org.jkiss.code.Nullable;
        }
public class URLPreviewEditor extends BaseValueEditor<Browser> {
 */
* URLPreviewEditor
        // Set browser settings
 *
    {
*/
    @Override
/**

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * You may obtain a copy of the License at
/*
import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.eclipse.swt.SWT;

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
            control.setUrl(strValue);
            }

    @Override

    protected Browser createControl(Composite editPlaceholder)
