        };
    private static final DateTimeFormatter MILLIS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
                return SQLITE_JULIAN_FORMATTER;

            }
            Instant toInstant(Number value) {
    @Override
            DateTimeFormatter getFormatter() {
/*
            ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, getZoneId());
            @Override
        private static Instant ticksToInstant(long rawValue, long offset) {
        // https://docs.microsoft.com/en-us/dotnet/api/system.datetime.ticks?view=net-6.0#remarks

    private static final double OADATE_OFFSET = 25569.0;  // DateTime.UnixEpoch.ToOADate()

import org.jkiss.code.NotNull;

 */
            double fractionalDay = daysSinceUnixEpoch - wholeDaysSinceUnixEpoch;

    private static final double SQLITE_JULIAN_OFFSET = 2440587.5;  // select julianday(0, "unixepoch")

            }
        private final EpochUnit unit;
            DateTimeFormatter getFormatter() {
    private static final DateTimeFormatter SECONDS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        @Override
        sqliteJulian {
            return unit.toRawValue(Instant.from(dateTime));
            Instant toInstant(Number value) {
            }

import org.jkiss.dbeaver.model.exec.DBCSession;
        @Nullable
            DateTimeFormatter getFormatter() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
            @Override
        nanoseconds {
                return DOTNET_TICKS_FORMATTER;

        },
            DateTimeFormatter getFormatter() {
                return super.getValueFromObject(session, type, object, copy, validateValue);
                return Instant.ofEpochMilli(longValue);
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
            @Override
 *
            }
 * limitations under the License.
import java.util.List;
            DateTimeFormatter getFormatter() {
    private static final long W32_FILETIME_OFFSET = 116_444_736_000_000_000L;  // DateTime.UnixEpoch.ToFileTimeUtc()
    private static final DateTimeFormatter SQLITE_JULIAN_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnn", Locale.ENGLISH);
 * distributed under the License is distributed on an "AS IS" BASIS,
            Instant toInstant(Number value) {
            @Override
            try {
        try {
            Long toRawValue(Instant instant) {
import org.jkiss.utils.CommonUtils;
    private static final DateTimeFormatter DOTNET_TICKS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnnnn", Locale.ENGLISH);
        EpochUnit unit = EpochUnit.milliseconds;
 * You may obtain a copy of the License at
            }
            @Override
            Double toRawValue(Instant instant) {
            long sinceUnixEpoch = rawValue - offset;
                log.debug(e);
    private static final DateTimeFormatter NANOS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnnnnnn", Locale.ENGLISH);
                zoneId = ZoneId.systemDefault();
    private static class EpochValueHandler extends ProxyValueHandler {
                return daysToInstant(value.doubleValue(), OADATE_OFFSET);

            }
            double daysSinceUnixEpoch = (instant.getEpochSecond() + 1e-9 * instant.getNano()) / SECONDS_IN_DAY;

        private ZoneId zoneId;
            if (zoneId != null) {
                return zoneId;
        }
    }
        }
 * Transforms numeric attribute value into epoch time
            }
    private static final int NANOS_TO_MICROS = 1000;
                return ticksToInstant(value.longValue(), W32_FILETIME_OFFSET);
            Long toRawValue(Instant instant) {

            DateTimeFormatter getFormatter() {
 * Unless required by applicable law or agreed to in writing, software
        private ZoneId getZoneId() {
            @Override
            try {
            @Override

 * Licensed under the Apache License, Version 2.0 (the "License");



            }

    private static final int TEN_MEGA = 10_000_000;
    private static final int MEGA = 1_000_000;
                return instantToDays(instant, SQLITE_JULIAN_OFFSET);
}
            return zoneId;
                return instantToTicks(instant, W32_FILETIME_OFFSET);

            long fractionalDayNanos = (long)(fractionalDay * SECONDS_IN_DAY * GIGA);
            Long toRawValue(Instant instant) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        private static Instant daysToInstant(double rawValue, double offset) {
import java.util.Locale;
                zoneId = ZoneId.of(zoneName);
            @Override
import org.jkiss.dbeaver.model.data.DBDAttributeTransformer;
                return NANOS_FORMATTER;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

            this.unit = unit;
                return DOTNET_TICKS_FORMATTER;
            ZonedDateTime dateTime;
                return instant.toEpochMilli();
        seconds {

            double daysSinceUnixEpoch = rawValue - offset;
            @Override
            return unit.getFormatter().format(dateTime);
            @Override
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
                return instant.getEpochSecond() * GIGA + instant.getNano();
                return DBValueFormatting.getDefaultValueDisplayString(value, format);
        attribute.setPresentationAttribute(new TransformerPresentationAttribute(attribute, "EpochTime", -1, DBPDataKind.DATETIME));

 *
                return ZoneId.systemDefault();
            }
                return new DBCException("Incorrect zoneId");
            return Instant.ofEpochSecond(sinceUnixEpoch / TEN_MEGA, sinceUnixEpoch % TEN_MEGA * TICKS_TO_NANOS);
            return instant.getEpochSecond() * TEN_MEGA + instant.getNano() / TICKS_TO_NANOS + offset;
                long longValue = value.longValue();
 * DBeaver - Universal Database Manager
    private static final long DOTNET_TICKS_OFFSET = 621_355_968_000_000_000L;  // DateTime.UnixEpoch.Ticks
            DateTimeFormatter getFormatter() {
import org.jkiss.dbeaver.Log;
 *
            }
            @Override
    private enum EpochUnit {
        dotnet {
    private static final DateTimeFormatter MICROS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.nnnnnn", Locale.ENGLISH);
            Long toRawValue(Instant instant) {
            Instant toInstant(Number value) {
                return instant.getEpochSecond() * MEGA + instant.getNano() / NANOS_TO_MICROS;
import org.jkiss.dbeaver.model.exec.DBCException;

        } catch (IllegalArgumentException e) {
        abstract Number toRawValue(Instant instant);
            unit = EpochUnit.valueOf(CommonUtils.toString(options.get(PROP_UNIT)));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            @Override
        @NotNull
        },
            @Override
                return MILLIS_FORMATTER;
            }
                return Instant.ofEpochSecond(longValue);
            }

 *     http://www.apache.org/licenses/LICENSE-2.0
        abstract Instant toInstant(Number value);
            if (!(object instanceof String)) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    // 100 ns precision
            @Override
        },
            return Instant.ofEpochSecond(wholeDaysSinceUnixEpoch * SECONDS_IN_DAY, fractionalDayNanos);
            Long toRawValue(Instant instant) {

        },
        private final String zoneName;
        }
            }
            @Override
        },

                return ticksToInstant(value.longValue(), DOTNET_TICKS_OFFSET);
            if (!(value instanceof Number)) {
            }
            Instant toInstant(Number value) {
        public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) throws DBCException {

                return SECONDS_FORMATTER;
    static final String PROP_UNIT = "unit";
            log.error("Bad unit type");

            }
        },
        milliseconds {
            Instant instant = unit.toInstant((Number)value);
                return Instant.ofEpochSecond(longValue / GIGA, longValue % GIGA);

                dateTime = ZonedDateTime.of(LocalDateTime.parse((String) object, unit.getFormatter()), getZoneId());
import java.util.Map;
        }
        },
        // https://docs.microsoft.com/en-us/dotnet/api/system.datetime.fromfiletimeutc?view=net-6.0#system-datetime-fromfiletimeutc(system-int64)
            }

                return instant.getEpochSecond();
        abstract DateTimeFormatter getFormatter();

        w32filetime {

        private static long instantToTicks(Instant instant, long offset) {
    // 10 us precision
            @Override
            }
                return daysToInstant(value.doubleValue(), SQLITE_JULIAN_OFFSET);
            @Override
import java.time.format.DateTimeFormatter;
        private static double instantToDays(Instant instant, double offset) {
                return Instant.ofEpochSecond(longValue / MEGA, longValue % MEGA);
        // https://docs.microsoft.com/en-us/dotnet/api/system.datetime.fromoadate?view=net-6.0#system-datetime-fromoadate(system-double)
            Instant toInstant(Number value) {

            }
                long longValue = value.longValue();
        }
            } catch (Exception e) {
            if (zoneName.isEmpty()) {

            }
        @Nullable
            @Override
            }
            this.zoneName = zoneName;
            }

        }
    private static final int SECONDS_IN_DAY = 24 * 3600;

    private static final int TICKS_TO_NANOS = 100;
        }
            @Override
            }
            @Override
            @Override
        oadate {
import org.jkiss.dbeaver.model.DBPDataKind;

    }
            DateTimeFormatter getFormatter() {
            }

        @Override

                return NANOS_FORMATTER;
            } catch (DateTimeException e) {
            Double toRawValue(Instant instant) {
    private static final Log log = Log.getLog(EpochTimeAttributeTransformer.class);
            }
            }
        EpochValueHandler(DBDValueHandler target, EpochUnit unit, String zoneName) {

            long wholeDaysSinceUnixEpoch = (long)daysSinceUnixEpoch;
            }

import org.jkiss.code.Nullable;


        attribute.setTransformHandler(new EpochValueHandler(attribute.getValueHandler(), unit, CommonUtils.toString(options.get(ZONE_ID))));
            @Override
                long longValue = value.longValue();
import java.time.*;
        // https://www.sqlite.org/lang_datefunc.html
 * See the License for the specific language governing permissions and
    static final String ZONE_ID = "zoneId";
 */

        microseconds {
            @Override

            Instant toInstant(Number value) {
                long longValue = value.longValue();
    private static final int GIGA = 1_000_000_000;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            Long toRawValue(Instant instant) {
/**
        }
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
package org.jkiss.dbeaver.model.impl.data.transformers;
                return MICROS_FORMATTER;
 * you may not use this file except in compliance with the License.
        }
                return instantToTicks(instant, DOTNET_TICKS_OFFSET);
            }
            }
            super(target);
            Instant toInstant(Number value) {
            @Override
    }
                return instantToDays(instant, OADATE_OFFSET);
import org.jkiss.dbeaver.DBException;
public class EpochTimeAttributeTransformer implements DBDAttributeTransformer {
            return daysSinceUnixEpoch + offset;
import org.jkiss.dbeaver.model.DBValueFormatting;
