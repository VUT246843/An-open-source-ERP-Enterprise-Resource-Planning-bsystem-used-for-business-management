    public static final ClickhouseStructValueHandler INSTANCE = new ClickhouseStructValueHandler();
            try {
    @Override
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCSession;
/*
import org.jkiss.dbeaver.model.data.DBDValue;
}
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                return ClickhouseTypeParser.makeValue(session, typeName, object);
        }
        final String typeName = type.getTypeName();

    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
            }


            if (!ArrayUtils.isEmpty(values)) {
public class ClickhouseStructValueHandler extends JDBCStructValueHandler {
            } catch (DBException e) {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        }

        if (object instanceof DBDValue) {
import org.jkiss.utils.ArrayUtils;
    private static final Log log = Log.getLog(ClickhouseStructValueHandler.class);
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
        if (typeName.startsWith("Tuple") || typeName.startsWith("Map")) {
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;

import org.jkiss.dbeaver.Log;
    @NotNull
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                log.debug("Can't parse data type: " + typeName, e);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

import org.jkiss.dbeaver.ext.clickhouse.ClickhouseTypeParser;

        if (value instanceof JDBCComposite) {
package org.jkiss.dbeaver.ext.clickhouse.model.data;
            }
                return DBValueFormatting.getDefaultValueDisplayString(values, format);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;
            return object;
        return super.getValueDisplayString(column, value, format);
    }
            Object[] values = ((JDBCComposite) value).getValues();
    
        return super.getValueFromObject(session, type, object, copy, validateValue);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCComposite;

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBValueFormatting;
 */
