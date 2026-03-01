    private boolean hasZone;
            sdfPattern,
            buffer.setLength(0);
import java.time.OffsetDateTime;
        buffer = new StringBuffer();
                } catch (DateTimeParseException e) {
                return LocalDateTime.parse(value, dateTimeFormatter);
        return zone;
                    return LocalDateTime.parse(value, dateTimeFormatter);
import java.time.ZonedDateTime;
        try {
import java.text.ParseException;
        }
    }
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.time.LocalDateTime;
            }
                try {
                }
                }
            }
 *
import java.time.ZoneId;
    @Override
        } catch (Exception e) {

        pattern = CommonUtils.toString(properties.get(PROP_PATTERN));
    }
import java.time.format.DateTimeFormatter;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private FieldPosition position;
import org.jkiss.utils.CommonUtils;
 *
                return OffsetDateTime.parse(value, dateTimeFormatter);


    public static final String PROP_PATTERN = "pattern";
public class DateTimeDataFormatter implements DBDDataFormatter {
    public static final String PROP_TIMEZONE = "timezone";
                    return dateTimeFormatter.format(((LocalDateTime) value).atZone(zone));
            return dateTimeFormatter.format((TemporalAccessor) value);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Object parseValue(String value, Class<?> typeHint) throws ParseException
    public DateFormat getDateFormat() {
import java.util.Map;
        }
import org.jkiss.dbeaver.model.data.DBDDataFormatter;
                    return OffsetDateTime.parse(value, dateTimeFormatter);
        if (value instanceof Date && zone != null) {
        zone = CommonUtils.isEmptyTrimmed(timezone) ? null : ZoneId.of(timezone);
                    throw new ParseException(e.getParsedString(), e.getErrorIndex());
 * You may obtain a copy of the License at
        final String timezone = CommonUtils.toString(properties.get(PROP_TIMEZONE));
            if (hasZone) {
            return value == null ? null : dateFormat.format(value, buffer, position).toString();
 * DBeaver - Universal Database Manager
                }
                if (value instanceof ZonedDateTime) {

        hasZone = java8DatePattern.contains("Z");
}
        String sdfPattern = pattern.replace("n", "f");
    private DateTimeFormatter dateTimeFormatter;
        // DateTimeFormatter pattern for nanoseconds is "n" but old "f" (ExtendedDateFormat)
        return pattern;
    {
    }
import org.jkiss.utils.time.ExtendedDateFormat;

        }
    private ZoneId zone;
        synchronized (dateFormat) {
            if (OffsetDateTime.class.isAssignableFrom(typeHint)) {
                }
    {
 * Unless required by applicable law or agreed to in writing, software
        dateFormat.setLenient(false);

    public void init(DBSTypedObject type, Locale locale, Map<String, Object> properties)
 * See the License for the specific language governing permissions and
 */
            } else {
import java.util.Date;
package org.jkiss.dbeaver.model.impl.data.formatters;
    }
    @Nullable
import java.util.Locale;
import java.time.temporal.TemporalAccessor;
            }
            }
    private StringBuffer buffer;
                    return dateTimeFormatter.format(((ZonedDateTime) value).withZoneSameInstant(zone));
    public String getPattern()
 * distributed under the License is distributed on an "AS IS" BASIS,

        dateTimeFormatter = DateTimeFormatter.ofPattern(java8DatePattern);
                }
    }
import java.time.format.DateTimeParseException;
    @Override
import java.text.FieldPosition;
        if (typeHint != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String pattern;
    {

        position = new FieldPosition(0);
        // We shouldn't use lenient formatter (#7244)
                } catch (DateTimeParseException e) {
            if (zone != null) {
/*
    {
                try {
            return dateFormat.parse(value);
                if (value instanceof OffsetDateTime) {
                    throw new ParseException(e.getParsedString(), e.getErrorIndex());
    private DateFormat dateFormat;



    @Override
                if (value instanceof LocalDateTime) {
    @NotNull
 * you may not use this file except in compliance with the License.
 *
import java.text.DateFormat;
    }
                    return dateTimeFormatter.format(((OffsetDateTime) value).atZoneSameInstant(zone));
 * limitations under the License.
    public String formatValue(Object value)
        if (value instanceof TemporalAccessor) {
        dateFormat = new ExtendedDateFormat(
    public ZoneId getZone() {

        }
            if (LocalDateTime.class.isAssignableFrom(typeHint)) {
        String java8DatePattern = pattern.replaceAll("f+", "n");
    @Override
        }
            locale);
            return dateTimeFormatter.format(ZonedDateTime.ofInstant(((Date) value).toInstant(), zone));
        return dateFormat;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
