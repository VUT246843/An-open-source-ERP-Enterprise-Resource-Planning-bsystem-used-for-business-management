    protected abstract String getFormatterId(DBSTypedObject column);
    protected DBDDataFormatter getFormatter(DBSTypedObject column)
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    {
    protected static final Log log = Log.getLog(TemporalAccessorValueHandler.class);

        this.formatSettings = formatSettings;

            try {
        try {
            return String.valueOf(value);
            return null;
 *

            return getFormatter(column).formatValue(value);
        if (value == null || value instanceof String) {
package org.jkiss.dbeaver.model.impl.data;
        }
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
 * See the License for the specific language governing permissions and
        return Date.class;

import org.jkiss.dbeaver.model.impl.data.formatters.DefaultDataFormatter;
                    return object;
 * limitations under the License.
                }

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * you may not use this file except in compliance with the License.
                formatter = DefaultDataFormatter.INSTANCE;
                formatter = formatSettings.getDataFormatterProfile().createFormatter(getFormatterId(column), column);

import java.util.Date;
    }
    private final DBDFormatSettings formatSettings;
    protected DBDDataFormatter formatter;
    {
import org.jkiss.code.NotNull;
            throw new DBCException("Bad temporal accessor value: " + object);
            try {
    }
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
        return formatter;
    }
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
    @NotNull
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
    @NotNull
    public void refreshValueHandlerConfiguration(DBSTypedObject type) {
    @NotNull
import java.time.LocalDateTime;


                    log.debug("Can't parse string value [" + strValue + "] to date/time value", e);
        } else if (object instanceof String) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    }
                    return ZonedDateTime.parse((CharSequence) object);
            String strValue = (String)object;
                } catch (Exception e1) {
    @Override
    @Override

    public TemporalAccessorValueHandler(DBDFormatSettings formatSettings) {
                log.error("Can't create formatter for zoned datetime value handler", e); //$NON-NLS-1$
}        if (object == null) {
        }
    @Override
        if (formatter == null) {
        } else {
            } catch (Exception e) {
 * DBeaver - Universal Database Manager
/*
 */

            return super.getValueDisplayString(column, value, format);
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (ParseException e) {

 * Unless required by applicable law or agreed to in writing, software
                // Try to parse with standard date/time formats
import java.text.ParseException;

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Class<Date> getValueObjectType(@NotNull DBSTypedObject attribute)
            return object;
import java.time.temporal.TemporalAccessor;
        } else if (object instanceof TemporalAccessor) {

        this.formatter = null;
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.data.DBDValueHandlerConfigurable;
/**
                return getFormatter(type).parseValue(strValue, isZonedType(type) ? ZonedDateTime.class : LocalDateTime.class);
        }
        } catch (Exception e) {
            }
                try {
 * You may obtain a copy of the License at
    {
    @Override
    protected abstract boolean isZonedType(DBSTypedObject type);
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
 * Date/time value handler

        }
public abstract class TemporalAccessorValueHandler extends BaseValueHandler implements DBDValueHandlerConfigurable {
import java.time.ZonedDateTime;
