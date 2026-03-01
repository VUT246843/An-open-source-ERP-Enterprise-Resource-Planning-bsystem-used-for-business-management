    }
    {

    public void init(DBSTypedObject type, Locale locale, Map<String, Object> properties)
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * you may not use this file except in compliance with the License.
public class DefaultDataFormatter implements DBDDataFormatter {
    public String formatValue(Object value)
import java.util.Map;
 * See the License for the specific language governing permissions and
import java.util.Locale;
package org.jkiss.dbeaver.model.impl.data.formatters;
    @Override

    }
    public String getPattern()
    @Override

        return value == null ? null : value.toString();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.DBDDataFormatter;

 * Unless required by applicable law or agreed to in writing, software
 */
/*
 *
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    private  DefaultDataFormatter()

 * You may obtain a copy of the License at
    {
        return null;
    public Object parseValue(String value, Class<?> typeHint)
 *
    {

    {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
    {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final DBDDataFormatter INSTANCE = new DefaultDataFormatter();

 * Licensed under the Apache License, Version 2.0 (the "License");

        return value;
