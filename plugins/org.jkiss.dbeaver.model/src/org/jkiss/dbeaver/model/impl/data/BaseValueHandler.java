    public void releaseValueObject(Object value)
        if (value instanceof DBDValue) {
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 */
    @NotNull
import org.jkiss.dbeaver.model.DBValueFormatting;
    public Object createNewValueObject(@NotNull DBCSession session, @NotNull DBSTypedObject type) throws DBCException {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
            ((DBDValue)value).release();
    @NotNull
    }

package org.jkiss.dbeaver.model.impl.data;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
    }
} * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDValue;
 */
    }
    @Override
        return DBValueFormatting.getDefaultValueDisplayString(value, format);
    @Override
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
public abstract class BaseValueHandler implements DBDValueHandler {
        return DBUtils.getAttributeOperators(attribute);
/**
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        return MimeTypes.TEXT_PLAIN;
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
        return getValueFromObject(session, type, null, false, false);
import org.jkiss.dbeaver.model.DBUtils;
/*

 * Base value handler
    @NotNull
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.utils.MimeTypes;
        }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCSession;
    {
 * limitations under the License.
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 *
    public String getValueContentType(@NotNull DBSTypedObject attribute) {


 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

