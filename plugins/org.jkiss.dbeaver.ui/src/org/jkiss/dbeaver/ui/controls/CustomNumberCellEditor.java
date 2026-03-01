 * Copyright (C) 2010-2024 DBeaver Corp and others
        return GeneralUtils.convertString((String) super.doGetValue(), valueType);
 * limitations under the License.
    @Override
import java.util.Locale;

 *
import org.eclipse.swt.widgets.Composite;

        super.doSetValue(CommonUtils.toString(value));
        if (valueType == Float.class ||

/*
            text.addVerifyListener(UIUtils.getNumberVerifyListener(Locale.getDefault()));
import java.math.BigDecimal;
        super.createControl(parent);
        }
    }

    {
    {
 * you may not use this file except in compliance with the License.

    {

    }
 *
            valueType == Double.TYPE ||
        super();
            valueType == BigDecimal.class)
 * Unless required by applicable law or agreed to in writing, software
        this.valueType = valueType;
        return text;
        {
 */

    protected Object doGetValue()
            valueType == Double.class ||
            valueType == Float.TYPE ||
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.widgets.Control;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
 * See the License for the specific language governing permissions and
 */

package org.jkiss.dbeaver.ui.controls;
 * You may obtain a copy of the License at
}
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
    {
        } else {
        create(parent);
/**
 * Number cell editor
    private final Class<?> valueType;

 * Licensed under the Apache License, Version 2.0 (the "License");
            text.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
import org.jkiss.dbeaver.ui.UIUtils;
    public CustomNumberCellEditor(Composite parent, Class<?> valueType)
    protected Control createControl(Composite parent)
public class CustomNumberCellEditor extends TextCellEditor {
import org.eclipse.jface.viewers.TextCellEditor;
    protected int getDoubleClickTimeout() {
    protected void doSetValue(Object value)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
 *
        return 0;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
