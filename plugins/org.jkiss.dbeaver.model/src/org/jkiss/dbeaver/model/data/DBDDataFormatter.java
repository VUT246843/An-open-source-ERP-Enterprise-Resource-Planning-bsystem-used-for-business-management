 *
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
import java.util.Locale;
package org.jkiss.dbeaver.model.data;
    String TYPE_NAME_TIME = "time"; //$NON-NLS-1$

    @Nullable
 * You may obtain a copy of the License at
    String TYPE_NAME_TIMESTAMP_TZ = "timestamptz"; //$NON-NLS-1$

    String TYPE_NAME_DATE = "date"; //$NON-NLS-1$
    String getPattern();

    String formatValue(Object value);
 *
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    @Nullable

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Data formatter
}
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    void init(@Nullable DBSTypedObject type, Locale locale, Map<String, Object> properties);
public interface DBDDataFormatter {
    String TYPE_NAME_TIMESTAMP = "timestamp"; //$NON-NLS-1$

 *
 */
/**

    
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    String TYPE_NAME_NUMBER = "number"; //$NON-NLS-1$
    Object parseValue(String value, @Nullable Class<?> typeHint) throws ParseException;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
    String TYPE_NAME_TIME_TZ = "timetz"; //$NON-NLS-1$
import java.text.ParseException;
/*
 * limitations under the License.


