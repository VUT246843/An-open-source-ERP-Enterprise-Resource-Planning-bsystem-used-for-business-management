import org.jkiss.utils.csv.CSVReaderBuilder;
        }
    }
    private static Object transformListOfValuesIntoArray(
            boolean wasInsideString = false; // needed for checking if NULL
import org.jkiss.dbeaver.model.exec.DBCException;
                } else if (ch == delimiter) {
            if (componentType == null && arrayType instanceof PostgreDataType && ((PostgreDataType) arrayType).getTypeType() == PostgreTypeType.d) {
            final char ch = value.charAt(offset++);
    }
            list = (List<?>) list.get(0);
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCompositeStatic;

            switch (arrayType.getTypeID()) {
import org.jkiss.dbeaver.model.DBUtils;
        if (value.equals("{}")) {
        char delimiter
import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
                        if (!dims.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (state == State.EXPECT_START) {
                Object parsedValue;
    }

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                        buffer.append(ch);
                } else {
                }
import java.util.function.Function;
import org.jkiss.dbeaver.model.data.DBDCollection;
            // Fast path for empty arrays
                } else if (chars[i] == '"') {
            return string;
                        if (!wasQuoted && element.equalsIgnoreCase(SQLConstants.NULL_VALUE)) {
        }
            }
    }
                } else {
                        } else {
                } else if (!insideString && chars[i] == '{') {
        }

        MAYBE_VALUE,
        } catch (IOException e) {

    @NotNull
                }
            } else if (value != null) {
                        } else {
public class PostgreValueParser {
        StringWriter out = new StringWriter();
                    final String element = buffer.toString();
    ) {
        char delim = delimiter.charAt(0);//connection.getTypeInfo().getArrayDelimiter(oid);
            return string;
                    buffer.setLength(0);
                            throw new DBCException("Redundant trailing bracket in " + fieldString);
                            if (Character.isWhitespace(chars[t])) {
        DBSDataType arrayDataType = arrayType instanceof DBSDataType ? (DBSDataType) arrayType : ((DBSTypedObjectEx) arrayType).getDataType();
                return string;
                    return string;
                .readNext();
        return transformListOfValuesIntoArray(session, itemType, list, true);
                        itemValues);
                case Types.INTEGER:
            //
                    buffer.setLength(0);

            // Structs are represented as an array with one element
        Struct contents = new JDBCStructImpl(itemType.getTypeName(), itemValues, list.toString());
            if (e instanceof DBCException) {
            boolean insideString = false;
            List<Object> curArray = arrayList; // currently processed array
        Object[] itemValues = new Object[attributes.size()];
                    state = State.INSIDE_QUOTES;
        PostgreDataType itemType,
                case Types.BOOLEAN:
                        p.add(a);
            return new CSVReaderBuilder(new StringReader(string))
                    buffer.append(value.charAt(offset++));
                if (buffer != null) {
            return valueHandler.getValueFromObject(session, itemType, string, false, false);
import org.jkiss.dbeaver.model.exec.DBCSession;
        } catch (NumberFormatException e) {

    }
                if (chars[0] == '[') {
        int offset = 0;
                            } else {
                    state = State.EXPECT_VALUE;
            } else {
        PostgreDataType itemType,
            throw new IllegalArgumentException("Junk after closing right brace");
        List<Object> arrayList = new ArrayList<>();
                    buffer = new StringBuilder();
                } catch (Exception e) {
                if (ch == '\\') {
            char[] chars = fieldString.toCharArray();
                .build()
                    return Long.parseLong(string);
        throws DBException
        if (CommonUtils.isEmpty(fieldString)) {
                //log.error("Unsupported array string: '" + string + "'");
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
                    if (subItem instanceof String) {
            } else {
        INSIDE_QUOTES,
            throw new DBCException("Error parsing array '" + arrayType.getFullTypeName() + "' items", e);
                line[i] = generateObjectString(((JDBCComposite) value).getValues());
                    parsedValue = transformListOfValuesIntoArray(session, itemType, (List<?>) item, false);
                        throw new IllegalArgumentException("Unexpected \",\" character");
                }
    }
            // even though the JDBC spec says 1 is the first
                }
                .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
        @NotNull String value,
        throws DBException
                    buffer = new StringBuilder();
                    itemValues[i] = convertStringToValue(session, itemType, (String) list.get(i));
                    if (!element.isEmpty()) {
        //If array is one dimensional, we will return array of that type. If array is multidimensional we will return array of JDBCCollections.
                }
            throw new DBCException("Error parsing PGObject", e);
import org.jkiss.utils.csv.CSVWriter;
        EXPECT_START,
                    throw new IllegalArgumentException("Array value must start with \"{\"");
}
    {
                value = ((DBDCollection) value).getRawValue();
                        bracePairsCount--;
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCComposite;
        try {
            }
                if (ch == '"') {
                if (itemType.getDataKind() == DBPDataKind.STRUCT) {

import java.util.List;
                    || i == chars.length - 1) {

        boolean firstAttempt)
            } else {
                    buffer.append(ch);
            }
                        DBUtils.findValueHandler(session, itemType),

        boolean wasQuoted = false;
    { //transform into array
                try {

                case Types.FLOAT:
            // Empty separators are NULLs, empty quotes are empty strings.
import java.sql.Struct;
                    // add element to current array
                    log.error("Array parsing failed " + e.getMessage());
                    } else {
        if (valueHandler != null) {
    private static Object convertStringToSimpleValue(DBCSession session, DBSTypedObject itemType, String string) throws DBCException {
                    insideString = !insideString;
            if (value instanceof Object[]) {
        for (int i = 0; i < values.length; i++) {
                case Types.DOUBLE:
                // escape character that we need to skip

 * DBeaver - Universal Database Manager
                if (((List<?>) item).size() == 1) {
                    continue;
            writer.flush();
        if (CommonUtils.isEmpty(string)) {
        @NotNull String value,
    public static List<Object> parseArrayString(String fieldString, String delimiter) throws DBCException {
                        if (!wasQuoted && element.equalsIgnoreCase(SQLConstants.NULL_VALUE)) {

        }
                    return convertStringToSimpleValue(session, arrayType, string);
    public static <T> T[] parsePrimitiveArray(
                        log.debug("Invalid sub item type: " + subItem.getClass().getName());
                    if (state == State.EXPECT_VALUE) {
            // data formatted like so "[0:3]={0,1,2,3,4}".
                    wasInsideString = true;
            StringBuilder buffer = null;
            if (bracePairsCount != 0) {
            Object item = list.get(i);
        AFTER_END
        }
        DBDValueHandler valueHandler = DBUtils.findValueHandler(session, itemType);

                    continue;
 * Unless required by applicable law or agreed to in writing, software
                    log.debug("Invalid struct list size: " + ((List<?>) item).size());
                    continue;

                        }
                // https://www.postgresql.org/docs/current/rowtypes.html#id-1.5.7.24.6
                    if (dims.isEmpty()) {

            // https://www.postgresql.org/docs/current/rowtypes.html#id-1.5.7.24.6
            if (item instanceof String) {
            } else if (value instanceof JDBCComposite) {
                    } else {
                            curArray = dims.get(dims.size() - 1);
        }
     * @throws IllegalArgumentException if the {@code value} can't be parsed

        } else {
                                continue;
        int dimensionsCount = 1;
                    state = State.MAYBE_VALUE;
        EXPECT_VALUE,
                    return prepareToParseArray(session, arrayType, string);

 *     http://www.apache.org/licenses/LICENSE-2.0
        List<?> list,
        DBCSession session,
                        curArray.add(!wasInsideString && b.equals("NULL") ? null : b);
                    // when end of an array
     */
            }
     * A simple implementation of a parser for primitive arrays.
    // Copied from pgjdbc array parser class
import org.jkiss.dbeaver.model.sql.SQLConstants;
                Object[] itemValues = new Object[list.size()];
                        // when multi-dimension
import org.jkiss.dbeaver.model.struct.DBSDataType;
                        startOffset++;
                                break;
                    {
                }
            }
            } else if (item instanceof List) {
import java.sql.Types;
                    return Short.parseShort(string);
 */
                        .replace(" ", "");
                // Values are simply skipped if they're NULL.
    private enum State {

        DBCSession session,
        writer.writeNext(line);
                    }
                case Types.REAL:

                }
        }
     * @param value     an input array, e.g. <code>{abc,def,NULL}</code>
                    }
                    state = State.AFTER_END;
                        buffer = null;

                    state = State.MAYBE_VALUE;
            return new String[0];
            }
     * @param converter a function that takes string representation of an element and returns {@code T}
                    bracePairsCount++;
                        List<Object> a = new ArrayList<>();
                    }
            Object item = list.get(index);
 *
            // Starting with 8.0 non-standard (beginning index
                        for (int t = i + 1; t < chars.length; t++) {
            log.warn(e);
        }
                                dimensionsCount++;
                if (ch != '{') {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull IntFunction<T[]> generator,
    }
                log.error("Can't get component type from array '" + arrayType.getFullTypeName() + "'");
        }
            return new JDBCCollection(session.getProgressMonitor(), itemType, DBUtils.findValueHandler(session, itemType), values);
                    // quoted element
                } else if ((!insideString && (chars[i] == delim || chars[i] == '}'))
            List<List<Object>> dims = new ArrayList<>(); // array dimension arrays

        Object[] values = new Object[list.size()];
                } else if (ch == '}') {
import java.io.StringWriter;
                    String b = buffer == null ? null : buffer.toString();
     * @param delimiter a delimiter that separates elements
                componentType = ((PostgreDataType) arrayType).getBaseType(session.getProgressMonitor());
                        .replace("]", "}")
            DBSDataType componentType = arrayDataType.getComponentType(session.getProgressMonitor());
                        buffer.append(chars[i]);
    private static Object startTransformListOfValuesIntoArray(
                } else if (!insideString && Character.isWhitespace(chars[i])) {
                    buffer.append(value.charAt(offset++));
        return new JDBCCompositeStatic(session, itemType, contents);
        if (list.size() == 1 && list.get(0) instanceof List) {

                        .replace("[", "{")
                        if (dims.isEmpty()) {
        }
            }
                throw (DBCException) e;
                            result.add(null);
            {
            if (value instanceof DBDCollection) {
            }
    public static String generateObjectString(Object[] values) {
        try {
                        throw new IllegalArgumentException("Unexpected \"}\" character");
        }
                        }

        if (firstAttempt) {

                    if (chars[i] != '"' && chars[i] != '}' && chars[i] != delim && buffer != null) {
                }
                    return new JDBCCollection(
                    }
        List<?> list) throws DBException
                    }
                } else {
            return arrayList;

                        dims.remove(dims.size() - 1);
        List<?> list)
                    while (chars[startOffset] != '=') {
        while (offset < length) {
            }
                log.debug("Invalid struct item type: " + item);
                    wasQuoted = true;
                    return itemValues;
            if (item instanceof List) {
                    state = State.MAYBE_VALUE;
 * You may obtain a copy of the License at
        @NotNull Function<String, T> converter,
        return "(" + out.toString().trim() + ")";
                    log.error("Incorrect type '" + arrayType.getFullTypeName() + "'");
        DBCSession session,
        }
        final StringBuilder buffer = new StringBuilder();
                    return Double.parseDouble(string);
                String arrayPostgreStyle = Arrays.deepToString((Object[]) value)

            return values;
        }
                for (int i = 0; i < list.size(); i++) {
                    }

                log.error("Can't get array type '" + arrayType.getFullTypeName() + "'");
                    i++;
                    return string;
        }
                if (firstAttempt){
 * limitations under the License.
                        }

import java.util.function.IntFunction;
        } catch (Exception e) {
 *

                        itemType,
                    if (!element.isEmpty()) {
        if (arrayType.getDataKind() == DBPDataKind.ARRAY) {
                    continue;
            } else {
                    return startTransformListOfValuesIntoArray(session, (PostgreDataType) componentType, itemStrings);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        dims.add(a);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTypeType;
 *
                        }
                    }
                } else if (ch == '"') {
import org.jkiss.utils.csv.CSVReaderNullFieldIndicator;
        @NotNull Function<String, T> converter,
                    } else {
                    return Integer.parseInt(string);
        }
                    curArray = dims.get(dims.size() - 1);
                    Object subItem = ((List<?>) item).get(0);
                return string;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
/*
     *
            }
    }
                } else {
                    wasInsideString = false;
                }
        }
            int startOffset = 0;
        final List<T> result = new ArrayList<>();

        }
        State state = State.EXPECT_START;
                    parsedValue = transformListOfValuesIntoStruct(session, itemType, (List<?>) item);
                // It can be already a string object as an element of parsed array
package org.jkiss.dbeaver.ext.postgresql;
        try {
                if (componentType instanceof PostgreDataType) {
import java.util.Arrays;
                case Types.NUMERIC:
                    // subarray start
            return generator.apply(0);
                    if (chars[i] == '}') {
                    break;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructImpl;
        PostgreDataType itemType,
            if (componentType == null) {
                case Types.TINYINT:
                // Structs are represented as an array with one element
            // isn't 1) bounds the dimensions are returned in the
import org.jkiss.dbeaver.model.data.DBDValueHandler;

        } else {
    }
import org.jkiss.code.NotNull;
                            result.add(null);
    }
        @NotNull IntFunction<T[]> generator
                itemValues[i] = convertStringToValue(session, itemType, (String) item);
            // Older versions simply do not return the bounds.
                    List<Object> itemStrings = parseArrayString(string, PostgreUtils.getArrayDelimiter(arrayDataType));

     * @param generator a function that takes a length and creates array of {@code T}
        if (string.isEmpty()) {
                line[i] = value.toString();
            Object value = values[i];
        try {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataTypeAttribute;
                    buffer.append(chars[i]);
    private static Object prepareToParseArray(DBCSession session, DBSTypedObject arrayType, String string) throws DBCException {
                } else if (ch == '\\') {
                if (chars[i] == '\\') {
        final CSVWriter writer = new CSVWriter(out);
    public static String[] parseSingleObject(String string) throws DBCException { //only for objects(structures), not for arrays
        } catch (IOException e) {
        return result.toArray(generator);
import java.util.ArrayList;
            int bracePairsCount = 0;
        final int length = value.length();
                    }
            }
                case Types.SMALLINT:
                        }
                    }
                        List<Object> p = dims.get(dims.size() - 1);
    /**
            // Right now we ignore these bounds, but we could
        for (int i = 0; i < list.size(); i++) {
    }
                    // number of dimensions
        }

import org.jkiss.dbeaver.DBException;
                // Domains store component type information in another field
                        session.getProgressMonitor(),
    // https://github.com/pgjdbc/pgjdbc/blob/master/pgjdbc/src/main/java/org/postgresql/jdbc/PgArray.java
            // value occurred
import org.jkiss.dbeaver.model.DBPDataKind;
                default: {
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
            }
import org.jkiss.utils.CommonUtils;
                            }
                return string;
 * See the License for the specific language governing permissions and
                }
        String[] line = new String[values.length];
            }
                            result.add(converter.apply(element));
     * @return array elements
        if (offset < length) {
        if (fieldString != null) {
        }
                        dims.add(arrayList);
                    if (b != null && (!b.isEmpty() || wasInsideString)) {
                            result.add(converter.apply(element));
                } else {
            return convertStringToSimpleValue(session, arrayType, string);
    }
 * you may not use this file except in compliance with the License.
            } else if (state == State.MAYBE_VALUE || state == State.EXPECT_VALUE) {
                            } else if (chars[t] == '{') {
    public static <T> T[] parsePrimitiveArray(

                    return string.length() > 0 && Character.toLowerCase(string.charAt(0)) == 't'; //todo: add support of alternatives to "true/false"
            throw new IllegalArgumentException("Unexpected end of input");
    ) {
        return arrayList;
        return parsePrimitiveArray(value, converter, generator, ',');
                    final String element = buffer.toString();
            if (arrayDataType == null) {

                values[index] = parsedValue;
            // to see, so we just retain the old behavior.
                    return Float.parseFloat(string);
                }
            // index. I'm not sure what a client would like
    { //transform into struct
            }
    private static final Log log = Log.getLog(PostgreValueParser.class);
                    if (!Character.isWhitespace(ch)) {
                    // array end or element end
            if (string != null && string.startsWith("{") && string.endsWith("}")) {
                }
    public static Object convertStringToValue(DBCSession session, DBSTypedObject arrayType, String string) throws DBCException {
        for (int index = 0; index < list.size(); index++) {
            // consider allowing these index values to be used
import java.io.IOException;
import org.jkiss.dbeaver.Log;

                } else {
        List<PostgreDataTypeAttribute> attributes = CommonUtils.safeList(itemType.getAttributes(session.getProgressMonitor()));

import java.io.StringReader;
                line[i] = arrayPostgreStyle; //Strings are not quoted
            } else {
        if (state != State.AFTER_END) {
                        itemValues[i] = convertStringToValue(session, itemType, (String) subItem);
                    // white space
                    wasQuoted = false;
                throw new DBCException("Amount of array's braces is not equal");
                case Types.BIGINT:

                    // when character that is a part of array element
                    }
                    }
    private static Object transformListOfValuesIntoStruct(
            for (int i = startOffset; i < chars.length; i++) {
                    return Byte.parseByte(string);
                    startOffset++; // skip =
                } else {

