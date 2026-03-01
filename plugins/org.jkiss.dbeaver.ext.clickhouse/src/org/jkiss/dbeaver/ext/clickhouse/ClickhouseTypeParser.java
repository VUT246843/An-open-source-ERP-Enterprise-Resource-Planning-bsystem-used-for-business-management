            return Collections.emptyMap();
            return simpleType.decimalType().Decimal().getText();

            log.debug("Can't resolve type from '" + type + "'");
    @NotNull
        var tree = parser.enumType();
        }
 * You may obtain a copy of the License at
        } else if (type.arrayType() != null) {
    }
            return null;
            } else {

        if (componentType == null) {
 * Unless required by applicable law or agreed to in writing, software
import java.io.StringReader;
                    return null;
    public static Object makeValue(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object) throws DBException {
 * you may not use this file except in compliance with the License.
    private static DBSDataType getTupleType(@NotNull DBRProgressMonitor monitor, @NotNull ClickhouseDataSource dataSource, @NotNull TupleTypeContext context) throws DBException {
        return new ClickhouseArrayType(dataSource, componentType);
    }
        return name.startsWith("enum8(") || name.startsWith("enum16(");
        } else {
            return fullTypeName.substring(0, div);

        final var parser = new ClickhouseDataTypesParser(new CommonTokenStream(lexer));
                    final var val = CommonUtils.toInt(node.Number().getText());

    }
        } else if (simpleType.fixedStringType() != null) {
                    final var key = stringValue.substring(1, stringValue.length() - 1);


    public static DBSDataType getType(
    // E.g. Decimal(10,2) -> Decimal
/*
    @Nullable
}
import org.jkiss.dbeaver.model.exec.DBCSession;
        } else {

        }
import org.jkiss.dbeaver.Log;
        if (!isEnum(type)) {
import org.jkiss.utils.CommonUtils;
        } else if (type.tupleType() != null) {
    public static String getTypeNameWithoutModifiers(@NotNull String fullTypeName) {
            for (ClickhouseDataTypesParser.TupleElementContext element : context.tupleElementList().tupleElement()) {
        final DBSDataType componentType = getType(monitor, dataSource, type.anyType());
            log.debug("Rejecting invalid or unsupported type: " + typeName);

    @Nullable
        if (type instanceof ClickhouseMapType map && ENABLE_COMPLEX_TYPE_PARSING) {
    ) throws DBException {
        }
        if (parser.getNumberOfSyntaxErrors() > 0) {
        // prevents instantiation
        } else {
                }
        return new ClickhouseTupleType(dataSource, elements);
            return simpleType.getText();
    private static DBSDataType getArrayType(@NotNull DBRProgressMonitor monitor, @NotNull ClickhouseDataSource dataSource, ArrayTypeContext type) throws DBException {
            for (int i = 0; i < values.length; i++) {
            }
    }
        final var lexer = new ClickhouseDataTypesLexer(CharStreams.fromString(typeName));

        }
        } else if (simpleType.decimalType() != null) {
        if (context.tupleElementList() != null && context.tupleElementList().tupleElement() != null) {
                    .flatMap(e -> Stream.of(e.getKey(), e.getValue())).toArray();
        }
        return getType(monitor, dataSource, type);
        } else if (type.markerType() != null) {
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseDataTypesParser.MapTypeContext;
                String key;
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseDataTypesParser.TupleTypeContext;
    @Nullable
            if (object instanceof Map) {
            resolved = getArrayType(monitor, dataSource, type.arrayType());
    }
            return null;
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseDataSource;
                values = array;
            return new ClickhouseMapValue((ClickhouseDataSource) session.getDataSource(), map, ((Map<?, ?>) object));
    public static Object makeValue(@NotNull DBCSession session, @NotNull String typeName, @Nullable Object object) throws DBException {
        if (keyType == null || valueType == null) {
        final DBSDataType type = getType(session.getProgressMonitor(), (ClickhouseDataSource) session.getDataSource(), typeName);
import org.antlr.v4.runtime.CharStreams;
 * Copyright (C) 2010-2024 DBeaver Corp and others


        } else if (type instanceof ClickhouseTupleType tuple && ENABLE_COMPLEX_TYPE_PARSING) {
        }
    private static final Log log = Log.getLog(ClickhouseTypeParser.class);
    }
                if (type == null) {

            resolved = DBUtils.resolveDataType(monitor, dataSource, type.enumType().Enum().getText());
                typeName.startsWith(ClickhouseConstants.DATA_TYPE_TUPLE) ||
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.clickhouse.model.data.ClickhouseMapValue;
    private static final Gson gson = new Gson();
                values = JSONUtils.parseMap(gson, new StringReader((String) object)).entrySet().stream()
    }
public class ClickhouseTypeParser {

        final DBSDataType keyType = getType(monitor, dataSource, context.key);
            } else if (object instanceof String) { 
    @Nullable
import org.jkiss.dbeaver.model.data.json.JSONUtils;

import org.jkiss.dbeaver.ext.clickhouse.ClickhouseDataTypesParser.ArrayTypeContext;
        if (simpleType.dateTimeType() != null) {
import org.antlr.v4.runtime.CommonTokenStream;
        final List<Pair<String, DBSDataType>> elements = new ArrayList<>();
            typeName.startsWith(ClickhouseConstants.DATA_TYPE_MAP) ||
        } else if (simpleType.dateType() != null) {
        if (type.simpleType() != null) {

                values[i] = makeValue(session, tuple.getAttributes().get(i).getDataType(), values[i]);
    }
            );
    public static boolean isComplexType(@NotNull String typeName) {
                    .flatMap(e -> Stream.of(e.getKey(), e.getValue())).toArray();
import java.util.stream.Collectors;

            }
    @Nullable
                })
import java.util.stream.Stream;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


        }
        @NotNull ClickhouseDataTypesParser.AnyTypeContext type
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }


        return Collections.emptyMap();
    }
        } else {
    private static final boolean ENABLE_COMPLEX_TYPE_PARSING = true;
        } else if (type.enumType() != null) {

import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseTupleType;
import org.jkiss.code.NotNull;
import com.google.gson.Gson;
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseArrayType;
            return tree.enumEntryList().enumEntry().stream()
 *
                values = ((Collection<?>) object).toArray();
    public static Map<String, Integer> tryParseEnumEntries(@NotNull String type) {
        if (resolved == null) {
        @NotNull ClickhouseDataSource dataSource,
            resolved = null;
    @Nullable
                values = ((Map<?, ?>) object).entrySet().stream()
            return simpleType.dateType().Date().getText();
 * DBeaver - Universal Database Manager
        @NotNull String typeName

    ) throws DBException {
            resolved = DBUtils.resolveDataType(monitor, dataSource, getSimpleTypeText(type.simpleType()));

        }
        final var type = parser.type().anyType();
        @NotNull ClickhouseDataSource dataSource,
        if (div < 0) {
            return object;
            resolved = getTupleType(monitor, dataSource, type.tupleType());
                } else {

            return null;
                final DBSDataType type = getType(monitor, dataSource, element.value.getText());
        return ENABLE_COMPLEX_TYPE_PARSING && (
        return new ClickhouseMapType(dataSource, keyType, valueType);

        if (tree.enumEntryList() != null && tree.enumEntryList().enumEntry() != null) {
            resolved = getMapType(monitor, dataSource, type.mapType());


import org.jkiss.dbeaver.model.struct.DBSDataType;
        if (object == null) {
 * limitations under the License.
        }
            return simpleType.fixedStringType().FixedString().getText();
        final DBSDataType resolved;
import org.jkiss.utils.Pair;
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.clickhouse;
            return null;
            } else if (object instanceof Object[] array) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else if (type.mapType() != null) {
import org.jkiss.dbeaver.ext.clickhouse.model.data.ClickhouseTupleValue;
    public static DBSDataType getType(
        }
                typeName.startsWith(ClickhouseConstants.DATA_TYPE_ARRAY)
 * Licensed under the Apache License, Version 2.0 (the "License");

                .filter(node -> node != null && node.String() != null && node.Number() != null)
    private static String getSimpleTypeText(ClickhouseDataTypesParser.SimpleTypeContext simpleType) {
                }
                    key = String.valueOf(elements.size() + 1);
        @NotNull DBRProgressMonitor monitor,
            return object;
                    final var stringValue = node.String().getText();
                .map(node -> {
                if (element.key != null) {


            final Object[] values;
    }
            return makeValue(session, type, object);
            return fullTypeName;
    }

import java.util.*;
import org.jkiss.dbeaver.model.DBUtils;
        }
    // We need to cut out complex type's parameters received from parser

    @Nullable
        if (type != null) {
        }
                elements.add(new Pair<>(key, type));
            return new ClickhouseTupleValue(session.getProgressMonitor(), tuple, values);
                    return new Pair<>(key, val);
 *
            return simpleType.dateTimeType().DateTime().getText();
        final int div = fullTypeName.indexOf('(');
    @NotNull
    private static boolean isEnum(@NotNull String type) {
import org.jkiss.code.Nullable;


import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseMapType;
 *
                .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
        return resolved;
                    key = element.key.getText();
        } else {

    private ClickhouseTypeParser() {
 */
            resolved = DBUtils.resolveDataType(monitor, dataSource, type.markerType().anyType().getText());
    private static DBSDataType getMapType(@NotNull DBRProgressMonitor monitor, @NotNull ClickhouseDataSource dataSource, @NotNull MapTypeContext context) throws DBException {
        @NotNull DBRProgressMonitor monitor,
        final String name = type.toLowerCase();
        var parser = new ClickhouseDataTypesParser(new CommonTokenStream(lexer));
    // Otherwise types can't be established from the data source
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        var lexer = new ClickhouseDataTypesLexer(CharStreams.fromString(type));
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        final DBSDataType valueType = getType(monitor, dataSource, context.value);

        }
