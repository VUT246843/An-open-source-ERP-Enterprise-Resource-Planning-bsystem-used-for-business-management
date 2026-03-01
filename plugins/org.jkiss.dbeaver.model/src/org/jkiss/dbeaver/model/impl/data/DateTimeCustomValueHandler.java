                // Do not use formatter for native format
            log.error("Can't create formatter for datetime value handler", e); //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Exception e) {
    }
        } else if (object instanceof String) {
        }
    {
            if (strValue.isEmpty()) {
                } catch (Exception e1) {
            return String.valueOf(value);
            return getFormatter(column).formatValue(value);
        this.formatSettings = formatSettings;
        if (value == null || value instanceof String || value instanceof Number) {
        if (formatter == null) {
 * limitations under the License.
    }
                    Date result = new Date(strValue);
        }
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

public abstract class DateTimeCustomValueHandler extends DateTimeValueHandler implements DBDValueHandlerConfigurable {
            //log.warn("Unrecognized type '" + object.getClass().getName() + "' - can't convert to date/time value");
                }
            return super.getValueFromObject(session, type, object, copy, validateValue);
            }


 * Customizable date/time value handler
import org.jkiss.dbeaver.model.data.DBDValueHandlerConfigurable;
        }
    @NotNull
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
            if (session != null && session.isUseNativeDateTimeFormat()) {
import org.jkiss.code.NotNull;
        try {
 * Unless required by applicable law or agreed to in writing, software
                try {
package org.jkiss.dbeaver.model.impl.data;
 *

        }
            }
            try {
 *
        } else if (object instanceof Date) {
    private DBDDataFormatter getFormatter(DBSTypedObject typedObject, String typeId)
                return object;
 */
/*
    }
import org.jkiss.dbeaver.Log;
 *
    {

import java.util.Date;
    @NotNull
            return copy ? ((Date)object).clone() : object;
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
 * See the License for the specific language governing permissions and
                    return object;

}            formatter = getFormatter(column, getFormatterId(column));
                // NULL date
            return DefaultDataFormatter.INSTANCE;
            return super.getValueDisplayString(column, value, format);
import org.jkiss.dbeaver.model.impl.data.formatters.DefaultDataFormatter;
        this.formatter = null;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCException;
import java.text.ParseException;


                    // Try to parse as java date
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
            String strValue = (String)object;

    protected final DBDFormatSettings formatSettings;
    @Override
        } catch (Exception e) {

    @Override
 * You may obtain a copy of the License at
        if (object == null) {
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
        return formatter;
        }
    public DateTimeCustomValueHandler(DBDFormatSettings formatSettings)
            return formatSettings.getDataFormatterProfile().createFormatter(typeId, typedObject);

            } catch (ParseException e) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                //DateFormat.get
 * distributed under the License is distributed on an "AS IS" BASIS,

    {
    protected abstract String getFormatterId(DBSTypedObject column);
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected DBDDataFormatter getFormatter(DBSTypedObject column)
 */
                // Try to parse with standard date/time formats
    }
        } else {
    public void refreshValueHandlerConfiguration(DBSTypedObject type) {
    }
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
import org.jkiss.dbeaver.model.exec.DBCSession;
/**
    }
        try {


                    //log.debug("Can't parse string value [" + strValue + "] to date/time value", e);
            }
    @Override
                return getFormatter(type).parseValue(strValue, null);
    {
                    @SuppressWarnings("deprecation")
                return null;
    protected DBDDataFormatter formatter;
    protected static final Log log = Log.getLog(DateTimeCustomValueHandler.class);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                    return result;
