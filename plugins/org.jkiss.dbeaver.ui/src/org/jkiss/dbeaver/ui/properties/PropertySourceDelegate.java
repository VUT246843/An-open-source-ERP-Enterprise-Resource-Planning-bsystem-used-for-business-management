    }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

    public Object getEditableValue() {
    }
    }
 */
    public boolean isPropertyResettable(Object id) {
 * DBeaver - Universal Database Manager
            dst[i] = new PropertyDescriptorDelegate(source, src[i]);

    @Override
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
/**
public class PropertySourceDelegate implements IPropertySource2
import org.jkiss.dbeaver.model.DBPNamedObject;
        return dst;
 */

 * you may not use this file except in compliance with the License.
 *
    public IPropertyDescriptor[] getPropertyDescriptors() {
 * limitations under the License.
        Object value = source.getPropertyValue(null, CommonUtils.toString(id));

        DBPPropertyDescriptor[] src = source.getProperties();
            return null;
        return source.getEditableValue();
{
 * See the License for the specific language governing permissions and
import org.eclipse.ui.views.properties.IPropertyDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * PropertySourceDelegate
 * Unless required by applicable law or agreed to in writing, software
        source.setPropertyValue(null, CommonUtils.toString(id), value);

    }

    @Override
        if (src == null) {
        source.resetPropertyValue(null, CommonUtils.toString(id));
    @Override
        for (int i = 0; i < src.length; i++) {
    @Override
    @Override
    public void setPropertyValue(Object id, Object value) {
        }
    public Object getPropertyValue(Object id) {
    }
        }


    public boolean isPropertySet(Object id) {
            return ((DBPNamedObject) value).getName();
    }

        if (value instanceof DBPNamedObject) {
 *
        }
package org.jkiss.dbeaver.ui.properties;
    private final DBPPropertySource source;
    @Override
 *

    public void resetPropertyValue(Object id) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.source = source;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        IPropertyDescriptor[] dst = new IPropertyDescriptor[src.length];
}    public PropertySourceDelegate(DBPPropertySource source) {
    @Override
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
        return CommonUtils.toString(value);
import org.eclipse.ui.views.properties.IPropertySource2;
        return source.isPropertySet(CommonUtils.toString(id));
    }
    }
        return source.isPropertyResettable(CommonUtils.toString(id));
