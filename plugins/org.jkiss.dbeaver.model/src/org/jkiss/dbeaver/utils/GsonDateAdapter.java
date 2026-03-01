 * DBeaver - Universal Database Manager
import java.time.format.DateTimeFormatter;
    private GsonDateAdapter() {
import java.util.Date;
    public static final GsonDateAdapter INSTANCE = new GsonDateAdapter();
 * You may obtain a copy of the License at


        return new JsonPrimitive(FORMATTER.format(date.toInstant().atZone(ZoneId.systemDefault())));
 */
 * An adapter that support serialization and deserialization of {@link Date} objects that also
import java.time.LocalDateTime;
 * limitations under the License.
    @Override
 */
public class GsonDateAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

    public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * specifies system time zone for reliability
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmm[Z]");
 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import com.google.gson.*;
 * Licensed under the Apache License, Version 2.0 (the "License");
        final TemporalAccessor accessor = FORMATTER.parseBest(element.getAsString(), ZonedDateTime::from, LocalDateTime::from);

 * Unless required by applicable law or agreed to in writing, software
import java.time.temporal.TemporalAccessor;
        if (accessor instanceof ZonedDateTime) {
        } else {


        // prevents instantiation
package org.jkiss.dbeaver.utils;
    }
/*
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * See the License for the specific language governing permissions and
    public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
import java.lang.reflect.Type;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.time.ZoneId;
/**
            return Date.from(((ZonedDateTime) accessor).toInstant());
import java.time.ZonedDateTime;
        }
            return Date.from(((LocalDateTime) accessor).atZone(ZoneId.systemDefault()).toInstant());
    @Override
