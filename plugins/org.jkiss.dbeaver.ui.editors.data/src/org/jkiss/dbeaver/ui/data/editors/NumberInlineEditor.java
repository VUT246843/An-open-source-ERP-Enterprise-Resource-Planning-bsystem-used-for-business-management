import org.eclipse.swt.widgets.Composite;
            curValue.getClass() :
        Class<?> hintType = curValue instanceof Number ?
        super(controller);
    @Override
import org.jkiss.dbeaver.registry.formatter.DataFormatterRegistry;
            valueController.getValueHandler().getValueObjectType(valueController.getValueType());
 * See the License for the specific language governing permissions and
            } else {

            return null;
        }
/**
        }
            this.formatterProfile = DataFormatterRegistry.getInstance().getGlobalProfile();
    private static final int MAX_NUMBER_LENGTH = 100;
import org.jkiss.dbeaver.ui.UIUtils;
 *

                text,
public class NumberInlineEditor extends BaseValueEditor<Text> {
            this.formatterProfile = valueController.getExecutionContext().getDataSource().getContainer().getDataFormatterProfile();
import java.math.BigDecimal;

        }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    public NumberInlineEditor(IValueController controller) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                valueController.getValueHandler().getValueObjectType(valueController.getValueType());
    // Disable numbers verification. Life is complicated, sometimes numbers aren't actually "classic" numbers
 * you may not use this file except in compliance with the License.
        try {
        String text = control.getText();
        return editor;

import org.jkiss.dbeaver.model.DBValueFormatting;
}
package org.jkiss.dbeaver.ui.data.editors;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.swt.SWT;
            Class<?> type = curValue instanceof Number ?
    }
        }

    protected Text createControl(Composite editPlaceholder)
        }
import java.util.Locale;
    }
    }
                true);
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
    private static final boolean VALIDATE_NUMBER_INPUT = false;
import org.jkiss.dbeaver.DBException;
                editor.addVerifyListener(UIUtils.getNumberVerifyListener(locale));
                editor.addVerifyListener(UIUtils.getIntegerVerifyListener(locale));
        if (value != null) {
 *
import org.jkiss.dbeaver.ui.data.IValueController;
            control.setText(strValue);
            return text;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(NumberInlineEditor.class);
    public void primeEditorValue(@Nullable Object value) throws DBException
    @Override
import org.eclipse.swt.widgets.Text;
/*
        editor.setTextLimit(MAX_NUMBER_LENGTH);
        if (curValue instanceof String || curValue instanceof Boolean) {
    @Nullable
        Object curValue = valueController.getValue();
        } catch (Exception e) {
        } else {
            Locale locale = formatterProfile.getLocale();
            log.debug("Error parsing numeric: " + e.getMessage());
        if (CommonUtils.isEmpty(text)) {
            String strValue = valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.EDIT);
import org.jkiss.utils.CommonUtils;
    {
                hintType,
 */
*/
    private DBDDataFormatterProfile formatterProfile;
        final boolean inline = valueController.getEditType() == IValueController.EditType.INLINE;
    {
            control.setText("");
        if (valueController.getExecutionContext() != null) {
    @Override
 *
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
        }
            if (type == Float.class || type == Double.class || type == BigDecimal.class) {
* NumberInlineEditor
    {
            }
            return DBValueFormatting.convertStringToNumber(


 *     http://www.apache.org/licenses/LICENSE-2.0
                formatterProfile.createFormatter(DBDDataFormatter.TYPE_NAME_NUMBER, valueController.getValueType()),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (valueController.getEditType() == IValueController.EditType.INLINE) {

        editor.setEditable(!valueController.isReadOnly());
                curValue.getClass() :
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        if (VALIDATE_NUMBER_INPUT) {
import org.jkiss.dbeaver.Log;
    public Object extractEditorValue()
import org.jkiss.code.Nullable;

            control.selectAll();
    }

            Object curValue = valueController.getValue();
        } else {
            return null;
        final Text editor = new Text(valueController.getEditPlaceholder(), inline ? SWT.BORDER : SWT.MULTI);
