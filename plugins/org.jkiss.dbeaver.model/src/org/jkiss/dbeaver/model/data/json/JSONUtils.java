            serializeMap(json, properties);
    @NotNull
                field(json, fieldName, bool);
/*
        json.value(value);
                }
            } else if (propValue instanceof String strValue) {
    public static Date parseDate(@Nullable Object value) {
    }
    public static final Gson GSON = new GsonBuilder().create();
 */

        }
 * you may not use this file except in compliance with the License.
     * @return timestamp from the given string value
    public static void serializeStringList(
        if (value == null) json.nullValue(); else json.value(value);
        if (propMap instanceof Map) {
            final TemporalAccessor accessor = DATE_TIME_FORMATTER.parse((String) value);
    public static Map<String, Object> deserializeProperties(@NotNull Map<String, Object> map, String name) {
import com.google.gson.stream.JsonWriter;
                long inst = getLong(attributes, name, 0);
        @Nullable Map<String, ?> properties, boolean allowEmptyValues) throws IOException
    @Nullable
    }
        return CommonUtils.toInt(map.get(name), defaultValue);
    public static JsonWriter field(@NotNull JsonWriter json, @NotNull String name, long value) throws IOException {
                case '"', '\\', '/' -> result.append("\\").append(c);
            for (String include : CommonUtils.safeCollection(list)) {
                case '\t' -> result.append("\\t");
        }
        @NotNull Map<String, Object> map,
import org.jkiss.dbeaver.Log;
    public static Timestamp getTimestamp(@NotNull Map<String, ?> attributes, @NotNull String name) {
        }

    public static JsonWriter field(@NotNull JsonWriter json, @NotNull String name, double value) throws IOException {
            if (localTime != null) {
    ) {
    }
            return null;
    }
    public static List<Map<String, Object>> getObjectList(@NotNull Map<String, Object> map, @NotNull String name) {
        @NotNull JsonWriter json,
        .withZone(ZoneId.of("UTC"));
                json.nullValue();
    public static long getLong(@NotNull Map<String, ?> map, String name, long defaultValue) {
/**
        return json;
        if (result == null) {
        json.name(name);
                }
    }
    @NotNull
                log.debug("Can't parse timestamp value from " + name);
        }
            return object.entrySet();
        for (Object value : CommonUtils.safeCollection(list)) {
    @NotNull
        for (Map.Entry<String, ?> entry : map.entrySet()) {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
    public static void serializeCollection(@NotNull JsonWriter json, @NotNull Collection<?> list) throws IOException {
        json.endArray();
        return new Timestamp(0);
        json.name(name);
import com.google.gson.GsonBuilder;
        return json;

import java.io.IOException;
            return new ArrayList<>();
    public static void serializeProperties(

    }
    }
        return result;
                result.add(CommonUtils.toString(pe));
    }
            json.name(tagName);
        boolean force
                }
                result.put(CommonUtils.toString(pe.getKey()), pe.getValue());
import org.jkiss.code.Nullable;
            } else if (propValue instanceof URI uri) {
            String fieldName = entry.getKey();
            if (compact) json.setIndent(DEFAULT_INDENT);
        return value == null ? defValue : value.toString();
            return json;
package org.jkiss.dbeaver.model.data.json;
        Map<String, Map<String, Object>> object = (Map<String, Map<String, Object>>) map.get(name);
            } else if (propValue instanceof Enum<?> anEnum) {
        @NotNull String name
                field(json, fieldName, uri.toString());
import com.google.gson.Gson;
        if (value == null) {
                case '\f' -> result.append("\\f");
    @NotNull
        }
        Object propMap = map.get(name);
        if (!CommonUtils.isEmpty(properties)) {
            } else if (propValue instanceof Map mapValue) {
    }
 * JSON utils
    public static JsonWriter field(@NotNull JsonWriter json, @NotNull String name, @Nullable Number value) throws IOException {
    public static final String DEFAULT_INDENT = "\t";
    public static Map<String, Object> getObject(@NotNull Map<String, Object> map, @NotNull String name) {
    public static Map<String, String> deserializeStringMapOrNull(@NotNull Map<String, Object> map, String name) {
    public static void serializeMap(
                field(json, fieldName, (Number)propValue);
        @NotNull String tagName,
        @NotNull Map<String, Object> map,
            final LocalTime localTime = accessor.query(TemporalQueries.localTime());
    ) throws IOException {
            for (Map.Entry<?,?> pe : mapVal.entrySet()) {
     * @param name Name of the attribute
                serializeProperties(json, fieldName, mapValue, allowsEmptyValue);
            for (Object pe : colValue) {
        @NotNull String tagName,


        Object propMap = map.get(name);
        if (value instanceof Integer || value instanceof Long) {
            return null;
                serializeCollection(json, colValue);
        return Objects.requireNonNullElseGet(object, LinkedHashMap::new);
        return json;
        String json = GSON.toJson(map);
            return result;
        json.name(name);
            }
                //continue;
                result.put(CommonUtils.toString(pe.getKey()), CommonUtils.toString(pe.getValue()));
        }
            }
            }

import java.net.URI;
     * @param attributes Attributes map
        return CommonUtils.toInt(map.get(name));
            } else {
                return Date.from(LocalDateTime.of(localDate, localTime).toInstant(ZoneOffset.UTC));
    public static int getInteger(@NotNull Map<String, ?> map, String name, int defaultValue) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.lang.reflect.Type;
        for (int i = 0; i < str.length(); i++) {
        Object value = map.get(name);
    }
        @NotNull Map<String, ?> map,
                case '\r' -> result.append("\\r");
    @NotNull
    }
    ) throws IOException {
        if (attributes.containsKey(name)) {
        return value == null ? null : value.toString();


import java.io.Reader;
            if (propValue == null) {
        json.beginArray();
import java.time.temporal.TemporalQueries;
    }

    }
    }
import java.util.*;
        }
            for (Map.Entry<?,?> pe : ((Map<?, ?>) propMap).entrySet()) {
    public static Iterable<Map.Entry<String, Map<String, Object>>> getNestedObjects(
                case '\n' -> result.append("\\n");
        return CommonUtils.toLong(map.get(name), defaultValue);
                json.value(boolValue);
    }
    }
 * DBeaver - Universal Database Manager
            return (T) map.get(name);
    }
    public static <T> T getObjectProperty(@NotNull Object object, String name) {
    private static final Log log = Log.getLog(JSONUtils.class);
            } else if (propValue instanceof Boolean bool) {
    ) throws IOException {
    }
        if (value instanceof List<?> list) {
    public static JsonWriter fieldNE(@NotNull JsonWriter json, @NotNull String name, @Nullable String value) throws IOException {
        log.error("Object " + object + " is not map");
                } else if (allowsEmptyValue) {

    public static List<String> getStringList(@NotNull Map<String, Object> map, @NotNull String name) {
            return  (List<String>) list;

    public static Map<String, Object> parseMap(@NotNull Gson gson, @NotNull Reader reader) {
        Object propMap = map.get(name);
            } else if (propValue instanceof Collection<?> collectionValue) {
                    }
            final LocalDate localDate = accessor.query(TemporalQueries.localDate());
                result.put(CommonUtils.toString(pe.getKey()), CommonUtils.toString(pe.getValue()));

                log.debug("Unsupported JSON property '" + fieldName + "' type: " + propValue.getClass().getName() +
    public static String escapeJsonString(String str) {
        if (CommonUtils.isEmpty(value)) {
                return DateTimeFormatter.ISO_TIME.format(Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.of("UTC")));
        .ofPattern("yyyy-MM-dd['T'HH:mm:ss['.'SSS]['Z']]")
            }
        json.name(name);
    public static Map<String, String> deserializeStringMap(@NotNull Map<String, Object> map, String name) {
                serializeObjectList(json, fieldName, collectionValue);
                        result.append(String.format("\\u%04x", (int) c));

        }
        json.value(value);
    @Nullable
                if (inst != 0) {


import java.time.*;
                default -> {
                    if ((int) c < 32) {
        if (propMap instanceof Map<?,?> pm) {
                    return Timestamp.from(Instant.ofEpochMilli(inst));
 * Licensed under the Apache License, Version 2.0 (the "License");
        return CommonUtils.getBoolean(map.get(name), defaultValue);
        }
            serializeMap(json, properties, allowEmptyValues);
        @NotNull String tagName,
     */
                field(json, fieldName, propValue.toString());
    }
            }
        @NotNull String tagName,
        StringBuilder result = new StringBuilder(str.length());
        boolean compact,
    @NotNull
        return json;
                    ". Serializing as string.");
            } catch (Exception e) {
    }
    public static List<String> deserializeStringList(@NotNull Map<String, Object> map, String name) {
    @NotNull
            return new Date(((Number) value).longValue());
        return json;
        }
    }
            char c = str.charAt(i);
                return DateTimeFormatter.ISO_DATE.format(((java.sql.Date) date).toLocalDate());
        if (!CommonUtils.isEmpty(properties)) {

                    } else {

    }
        return Collections.emptyList();

            }
            Map<String, Object> result = new LinkedHashMap<>();
        Map<String, String> result = new LinkedHashMap<>();
        json.name(name);
public class JSONUtils {
        Object value = map.get(name);
                    field(json, fieldName, strValue);

        json.name(name);
    public static boolean getBoolean(@NotNull Map<String, ?> map, String name) {
            if (date instanceof java.sql.Time) {
        }
        json.beginObject();
        }
        }
            if (compact) json.setIndent(EMPTY_INDENT);
            return null;
     *
import java.time.temporal.TemporalAccessor;
                        result.append(c);
                return Date.from(localDate.atStartOfDay().toInstant(ZoneOffset.UTC));
        return json;
    }
        if (object instanceof Map<?,?> map) {

        return result;
    }

        @Nullable Map<String, ?> properties
        return GSON.fromJson(json, type);
    @NotNull
import java.sql.Timestamp;


                json.value(numberValue);
    @NotNull
    public static <OBJECT_TYPE> OBJECT_TYPE deserializeObject(
            return result;
    }
        @NotNull JsonWriter json,
    {

 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
    }
                json.value(include);
    }
            } else {
                    field(json, fieldName, strValue);
        if (object == null) {
        return null;
     * Returns timestamp value from the attributes map, if map contains key
        return CommonUtils.toDouble(map.get(name));
    ) throws IOException {
            }
    public static final String EMPTY_INDENT = "";
    }
    public static JsonWriter field(@NotNull JsonWriter json, @NotNull String name, boolean value) throws IOException {
            }



    public static void serializeProperties(
        @NotNull Class<OBJECT_TYPE> type

    @Nullable
        Object propMap = map.get(name);
        serializeStringList(json, tagName, list, true, false);
 * See the License for the specific language governing permissions and
    public static String getString(@NotNull Map<String, ?> map, String name) {
            } else if (propValue instanceof Number) {

    public static final Type MAP_TYPE_TOKEN = new TypeToken<Map<String, Object>>() {}.getType();
        return CommonUtils.toBoolean(map.get(name));
    public static boolean getBoolean(@NotNull Map<String, ?> map, String name, boolean defaultValue) {
    @NotNull
            Map<String, String> result = new LinkedHashMap<>();
        @NotNull JsonWriter json,
                if (!strValue.isEmpty()) {
 */
        @NotNull JsonWriter json,
            return new LinkedHashMap<>();
        @NotNull JsonWriter json,
                //field(json, fieldName, (String)null);
            } else if (date instanceof java.sql.Date) {
                field(json, fieldName, anEnum.name());
        Map<String, Object> object = (Map<String, Object>) map.get(name);
        if (str == null) {
    }
        json.value(value);
            } else if (value instanceof Number numberValue) {
        json.value(value);
            }

        return null;
    }
        }
 *

        return (Map<String, Object>) map.get(name);
        } else {
            json.name(tagName);
            switch (c) {
            } else if (value instanceof String strValue) {
import org.jkiss.dbeaver.model.exec.DBCException;
import com.google.gson.reflect.TypeToken;
        }
        return result;
    public static void serializeStringList(
        return result.toString();

    @NotNull
            try {
        if (propMap instanceof Collection<?> colValue) {
        serializeMap(json, map, false);
        if (value == null) json.nullValue(); else json.value(value);
        }
    @NotNull
        }
        List<String> result = new ArrayList<>();


            } else {
        }
            }
    }
        return Collections.emptyList();
                return LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")).format(DATE_TIME_FORMATTER);

    }
 *
                case '\b' -> result.append("\\b");
        boolean allowsEmptyValue
    public static JsonWriter field(@NotNull JsonWriter json, @NotNull String name, @Nullable String value) throws IOException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            for (Map.Entry<?,?> pe : pm.entrySet()) {
            return date.toString();
import org.jkiss.code.NotNull;
        try {

    public static String getString(@NotNull Map<String, ?> map, String name, String defValue) {
    }
            return  (List<Map<String, Object>>) list;

        @Nullable Collection<String> list
    }
            log.warn("Error formatting date to ISO-8601. Falling back to default string representation of " + date.getClass().getName(), ex);
        } catch (Exception ex) {
    @NotNull
    public static void serializeMap(@NotNull JsonWriter json, @NotNull Map<String, ?> map) throws IOException {

            } else if (value instanceof Collection<?> colValue) {
        if (force || !CommonUtils.isEmpty(list)) {
        }
    }
            json.name(tagName);
            serializeCollection(json, list);
        json.endObject();
    public static String formatDate(Date date) {
        Object value = map.get(name);
    public static void serializeObjectList(@NotNull JsonWriter json, @NotNull String tagName, @Nullable Collection<?> list) throws IOException {
 * limitations under the License.
            } else if (value instanceof Map mapValue) {
        }
 * You may obtain a copy of the License at
        } else {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) throws DBCException {
import org.jkiss.utils.CommonUtils;
    }
    /**

        }
    public static int getInteger(@NotNull Map<String, ?> map, String name) {
                json.value(strValue);

        if (propMap instanceof Map<?,?> mapVal && !mapVal.isEmpty()) {
    @Nullable
    public static String formatISODate(Date date) {
            json.beginArray();
        return "ISODate('" + formatDate(date) + "')";  //$NON-NLS-1$//$NON-NLS-2$



                serializeMap(json, mapValue);
        if (!CommonUtils.isEmpty(list)) {
    }
        if (value instanceof String) {
                json.value(value.toString());
        throw new IllegalArgumentException("Cannot parse date from value '" + value + "'");
        @Nullable Collection<String> list,
            Object propValue = entry.getValue();
 *
        }
    public static Double getDouble(@NotNull Map<String, ?> map, String name) {
            }
        }
 * Unless required by applicable law or agreed to in writing, software
            } else if (value instanceof Boolean boolValue) {
import java.time.format.DateTimeFormatter;
    @NotNull
}
            if (value == null) {
            json.name(tagName);

        Object value = map.get(name);
        Map<String, Object> result = gson.fromJson(reader, MAP_TYPE_TOKEN);
    public static Map<String, Object> getObjectOrNull(@NotNull Map<String, Object> map, @NotNull String name) {
            json.endArray();
        if (value instanceof List<?> list) {
