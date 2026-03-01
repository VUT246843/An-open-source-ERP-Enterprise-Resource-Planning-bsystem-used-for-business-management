 *
        return null;
 * Stream producer result set
    @Override
import org.jkiss.dbeaver.model.data.DBDValueMeta;
        return attributeMappings;
        }

                    } else {
    public String getResultSetName() throws DBCException {
            // FIXME: https://stackoverflow.com/questions/23975205/why-does-converting-java-dates-before-1582-to-localdate-with-instant-give-a-diff
                        localDT = LocalDate.from(ta).atStartOfDay();
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean moveTo(int position) throws DBCException {
            try {
            } catch (Exception e) {
    private Object[] streamRow;
    }

    public DBCStatement getSourceStatement() {
                        // https://stackoverflow.com/questions/42280454/changing-localdatetime-based-on-time-difference-in-current-time-zone-vs-eastern

        this.dateTimeZoneId = dateTimeZoneId;
                    }
                String strValue = CommonUtils.toString(value);

import java.util.stream.Collectors;
    }
        if (this.dateTimeFormat != null && this.dateTimeZoneId != null) {
    public List<StreamDataImporterColumnInfo> getAttributeMappings() {

    @Override

        this.dateTimeFormat = dateTimeFormat;
        }
        return false;
import org.jkiss.utils.CommonUtils;

            // Convert string to timestamp
    }
    @Override
        return session;
import org.jkiss.dbeaver.model.DBPDataKind;
            .map(c -> new LocalResultSetColumn(this, c.getOrdinalPosition(), c.getName(), c))
                            .toLocalDateTime();
                    LocalDateTime localDT;
import org.jkiss.dbeaver.model.impl.local.LocalResultSetMeta;
                    return null;
    @Override
 */
    public StreamTransferResultSet(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull StreamEntityMapping entityMapping) {
import org.jkiss.code.NotNull;
    }
            }
            // FIXME: proper SQL timestamp for pre-historic (pre-Gregorian) dates.

    @Override
                    ZonedDateTime zdt = ZonedDateTime.from(ta);
 *
    private final DBCSession session;
    @Override
    public DBDValueMeta getAttributeValueMeta(int index) throws DBCException {
    }
        return null;
 * DBeaver - Universal Database Manager
        return value;
                        localDT = localDT

import java.time.temporal.TemporalAccessor;
    private static final Log log = Log.getLog(StreamTransferResultSet.class);
    }
        this.session = session;
 * you may not use this file except in compliance with the License.
}
                        localDT = LocalDateTime.from(ta);
        Object value = streamRow[index];
                        log.debug("No time present in datetime string, defaulting to the start of the day");
            // Set zone to the format.
                    if (dateTimeZoneId != null) {
    // Stream row: values in source attributes order
 */
                } catch (Exception e) {
import org.jkiss.dbeaver.model.exec.*;

    public boolean nextRow() throws DBCException {
        this.statement = statement;
                log.debug("Error parsing datetime string: " + e.getMessage());
    public Object getFeature(String name) {
    }
    @Override
import java.util.Date;

        return null;
        return false;
    private final List<StreamDataImporterColumnInfo> attributeMappings;
        return null;
/**
            //this.dateTimeFormat = this.dateTimeFormat.withZone(dateTimeZoneId);
    @Override
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public Object getAttributeValue(String name) throws DBCException {
    @Override
import java.time.temporal.ChronoField;
                if (CommonUtils.isEmptyTrimmed(strValue)) {
    @Override
    public void setStreamRow(Object[] streamRow) {


import org.jkiss.dbeaver.model.impl.local.LocalResultSetColumn;
 * See the License for the specific language governing permissions and
import java.time.format.DateTimeFormatter;
                            .withZoneSameInstant(dateTimeZoneId)
                    // dates into incorrect SQL timestamps (in Julian calendar). E.g. 0001-01-01->0001-01-03
    public DBDValueMeta getRowMeta() throws DBCException {
    public void close() {
import org.jkiss.dbeaver.Log;
                    if (ta.isSupported(ChronoField.NANO_OF_SECOND)) {

    }
import java.util.List;
            // FIXME: it looks like a good idea but in fact iti s not. We can't convert ZonedDateTime into
    public DateTimeFormatter getDateTimeFormat() {
        return dateTimeFormat;

    @Override
import java.time.ZonedDateTime;
            .collect(Collectors.toList());
        if (value != null && dateTimeFormat != null && attr.getDataKind() == DBPDataKind.DATETIME && !(value instanceof Date)) {
import java.time.LocalDate;
                    value = Timestamp.valueOf(localDT);

    public DBCResultSetMetaData getMeta() throws DBCException {
import java.time.LocalDateTime;


    public void setDateTimeFormat(DateTimeFormatter dateTimeFormat, ZoneId dateTimeZoneId) {
    private DateTimeFormatter dateTimeFormat;
 * limitations under the License.
public class StreamTransferResultSet implements DBCResultSet {
                    }
        return new LocalResultSetMeta(metaAttrs);
    private final StreamEntityMapping entityMapping;


        this.metaAttrs = attributeMappings.stream()
package org.jkiss.dbeaver.tools.transfer.stream;
        return statement;
        this.entityMapping = entityMapping;
    }
                // Can't parse. Ignore format then
    }
                    // We use java.sql.Timestamp.valueOf because classic date/time conversion turns "pre-historic" Gregorian
    }
import java.sql.Timestamp;
            // FIXME: so we will shift LocalDateTime in getAttributeValue instead
    @Override
                }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,


        this.streamRow = streamRow;
                }
    private ZoneId dateTimeZoneId;


    }
                    value = java.util.Date.from(zdt.toInstant());
    }
    private final DBCStatement statement;
import java.time.ZoneId;
                            .atZone(ZoneId.systemDefault())
    }
                TemporalAccessor ta = dateTimeFormat.parse(strValue);
        return null;
        StreamDataImporterColumnInfo attr = this.attributeMappings.get(index);
    }
    @NotNull
    private final List<DBCAttributeMetaData> metaAttrs;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

    public Object getAttributeValue(int index) throws DBCException {
    @NotNull
/*
 * You may obtain a copy of the License at
    public DBCSession getSession() {
                try {

 *
        this.attributeMappings = this.entityMapping.getStreamColumns();
                        // Shift LocalDateTime to specified zone
