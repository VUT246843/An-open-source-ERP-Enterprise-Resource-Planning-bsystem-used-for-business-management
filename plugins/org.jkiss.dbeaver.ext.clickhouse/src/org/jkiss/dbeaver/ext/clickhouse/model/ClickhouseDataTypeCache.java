            new Entry("Enum8", 0, false, 0, 0, 0),
        }
                    sqlDataType
            ) as attrs ON (dt.name = attrs.c1 or dt.alias_to = attrs.c1)
        }
import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache;
            new Entry("IntervalHour", 19, true, 0, 0, 0),
            new Entry("DateTime32", 19, false, 0, 0, Types.TIMESTAMP),
        }
            SELECT
            new Entry("UInt8", 3, false, 0, 0, Types.NUMERIC),
            new Entry("String", 0, false, 0, 0, Types.VARCHAR),
            int maximumScale,
 * DBeaver - Universal Database Manager
            int precision,
            new Entry("Float64", 22, true, 0, 308, Types.NUMERIC),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            new Entry("Int256", 77, true, 0, 0, Types.NUMERIC),
        @NotNull GenericStructContainer genericStructContainer
            new Entry("IntervalSecond", 19, true, 0, 0, 0),
                NULL AS LITERAL_SUFFIX,
            LEFT JOIN (""" +
            new Entry("IntervalWeek", 19, true, 0, 0, 0),
            new Entry("Date32", 10, false, 0, 0, Types.DATE),
            new Entry("UUID", 69, false, 0, 0, 0),
                            .mapToObj(i -> values.get(i).toString() + " as c" + (i + 1))
 * you may not use this file except in compliance with the License.
                not(attrs.c3)::Boolean AS UNSIGNED_ATTRIBUTE,
     * Also, we added data kinds for data types - attrs.c6, otherwise we can't know the data kind by the type name
            new Entry("IPv6", 39, false, 0, 0, 0),
            new Entry("Dynamic", 0, false, 0, 0, 0)
            genericDataTypes.add(new GenericDataType(this.owner, Types.NUMERIC, "Int256", "Int256", false, false, 0, 0, 0));
            new Entry("AggregateFunction", 0, false, 0, 0, 0),
                dt.name AS TYPE_NAME,
 * Unless required by applicable law or agreed to in writing, software
            new Entry("UInt64", 20, false, 0, 0, Types.NUMERIC),
                dt.alias_to AS TYPE_ALIAS, -- in driver, it was if(empty(alias_to), name, alias_to) AS DATA_TYPE
        if (DBUtils.findObject(genericDataTypes, "Bool") == null) {
        List<Entry> knownTypeEntries = List.of(
                NULL AS CREATE_PARAMS,
    public ClickhouseDataTypeCache(GenericStructContainer container) {
            """
 * limitations under the License.
        }
            new Entry("IPv4", 10, false, 0, 0, 0),
                List<Object> values = List.of(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            new Entry("Map", 0, false, 0, 0, 0),
                    "'" + name + "'",
    protected void addCustomObjects(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer owner, @NotNull List<GenericDataType> genericDataTypes) {
        if (DBUtils.findObject(genericDataTypes, "Int256") == null) {
        }
            genericDataTypes.add(new GenericDataTypeArray(dt.getParentObject(), Types.ARRAY, "Array(" + dt.getName() + ")", "Array of " + dt.getName(), dt));

            knownTypeEntries.get(0).toSelectStatement(true) + " UNION ALL " +
        if (DBUtils.findObject(genericDataTypes, "UInt128") == null) {
            new Entry("Decimal256", 76, true, 0, 76, Types.NUMERIC),
                    );
            int minimumScale,
            new Entry("BFloat16", 3, true, 0, 16, Types.NUMERIC),
        String sql = """
                0 AS NUM_PREC_RADIX
        }
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;

            FROM system.data_type_families dt
            new Entry("JSON", 0, false, 0, 0, 0),
            new Entry("Ring", 0, true, 0, 0, 0),
            genericDataTypes.add(new GenericDataType(this.owner, Types.NUMERIC, "UInt256", "UInt256", false, false, 0, 0, 0));
/*
            new Entry("DateTime64", 29, false, 0, 9, Types.TIMESTAMP),
        }
                    minimumScale,

            int sqlDataType
 *
                    isUnsigned,
    }
                false AS FIXED_PREC_SCALE,
    ) throws SQLException {
            new Entry("Enum16", 0, false, 0, 0, 0),
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                        : values.stream().map(Object::toString).collect(Collectors.joining(","))
                dt.name AS LOCAL_TYPE_NAME,
                3 AS SEARCHABLE,
 */
            }
                0 AS SQL_DATETIME_SUB,
            genericDataTypes.add(new GenericDataType(this.owner, Types.DECIMAL, "Decimal", "Decimal", false, false, 0, 0, 0));
            new Entry("LineString", 0, true, 0, 0, 0),
 * You may obtain a copy of the License at
            new Entry("Nullable", 0, false, 0, 0, 0),
            genericDataTypes.add(new GenericDataType(this.owner, Types.NUMERIC, "UInt128", "UInt128", false, false, 0, 0, 0));
        // Add array data types
                attrs.c6 AS DATA_TYPE, -- it's our attribute with data kind information
                attrs.c2 AS PRECISION,
    }
            new Entry("DateTime", 29, false, 0, 9, Types.TIMESTAMP),
 * Copyright (C) 2010-2025 DBeaver Corp and others
            new Entry("UInt32", 10, false, 0, 0, Types.NUMERIC),
            new Entry("Decimal128", 38, true, 0, 38, Types.NUMERIC),
class ClickhouseDataTypeCache extends GenericDataTypeCache {
        @NotNull JDBCSession session,

            new Entry("FixedString", 0, false, 0, 0, Types.VARCHAR),
                false AS AUTO_INCREMENT,
            genericDataTypes.add(new GenericDataType(this.owner, Types.BOOLEAN, "Bool", "Bool", false, false, 0, 0, 0));
        // Driver error - missing data types
 *
                        ? IntStream.range(0, values.size())
        return session.prepareStatement(sql);
import java.sql.SQLException;
            new Entry("Int16", 5, true, 0, 0, Types.NUMERIC),
            new Entry("IntervalMonth", 19, true, 0, 0, 0),
 *
            new Entry("Float32", 12, true, 0, 38, Types.NUMERIC),
            new Entry("IntervalMinute", 19, true, 0, 0, 0),
        super(container);
            new Entry("UInt128", 39, false, 0, 0, Types.NUMERIC),
            new Entry("Object", 0, false, 0, 0, 0),
                attrs.c5 AS MAXIMUM_SCALE,
            new Entry("MultiLineString", 0, true, 0, 0, 0),
            new Entry("SimpleAggregateFunction", 0, false, 0, 0, 0),
            """;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            new Entry("Point", 0, true, 0, 0, 0),
        record Entry(
            genericDataTypes.add(new GenericDataType(this.owner, Types.TIMESTAMP, "DateTime64", "DateTime64", false, false, 0, 0, 0));
            new Entry("IntervalMillisecond", 19, true, 0, 0, 0),
package org.jkiss.dbeaver.ext.clickhouse.model;
            new Entry("Date", 10, false, 0, 0, Types.DATE),
import java.util.List;
            new Entry("Int8", 3, true, 0, 0, Types.NUMERIC),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                attrs.c4 AS MINIMUM_SCALE,
            new Entry("IntervalMicrosecond", 19, true, 0, 0, 0),
    @Override
        

        if (DBUtils.findObject(genericDataTypes, "DateTime64") == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        );
            new Entry("UInt16", 5, false, 0, 0, Types.NUMERIC),
        }
            knownTypeEntries.stream().skip(1).map(e -> e.toSelectStatement(false)).collect(Collectors.joining(" UNION ALL ")) +
            new Entry("Polygon", 0, true, 0, 0, 0),
    @NotNull
            genericDataTypes.add(new GenericDataType(this.owner, Types.NUMERIC, "Int128", "Int128", false, false, 0, 0, 0));
        if (DBUtils.findObject(genericDataTypes, "UInt256") == null) {
                NULL AS LITERAL_PREFIX,
import java.util.ArrayList;
            boolean isUnsigned,
        if (DBUtils.findObject(genericDataTypes, "Int128") == null) {
        // Also WHERE dt.alias_to = '' was in the driver's query, but we decided we want aliased types with aliases
            new Entry("MultiPolygon", 0, true, 0, 0, 0),
                return "select " + (
    @Override
            new Entry("Nothing", 0, false, 0, 0, 0),
            new Entry("Decimal", 76, true, 0, 76, Types.NUMERIC),
            new Entry("Array", 0, false, 0, 0, Types.ARRAY),
import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeArray;
                dt.name AS NULLABLE,

                );
            public String toSelectStatement(boolean withColumnNames) {
     * We took the query and rewrote it without using this new ClickHouse syntax.
            new Entry("Decimal64", 18, true, 0, 18, Types.NUMERIC),
    /**
        ) {
        }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
            new Entry("Tuple", 0, false, 0, 0, 0),
import java.util.stream.IntStream;
                    withColumnNames
            new Entry("IntervalYear", 19, true, 0, 0, 0),
                not(dt.case_insensitive)::Boolean AS CASE_SENSITIVE,
     * The query the clickhouse-0.8.5 driver sends to the database is written with syntax unsupported for old server versions.
            new Entry("IntervalQuarter", 19, true, 0, 0, 0),
            new Entry("Int64", 19, true, 0, 0, Types.NUMERIC),
            new Entry("Int128", 39, true, 0, 0, Types.NUMERIC),
 * distributed under the License is distributed on an "AS IS" BASIS,

    protected JDBCStatement prepareObjectsStatement(
                    precision,
            new Entry("Enum", 0, false, 0, 0, 0),
            new Entry("Bool", 1, true, 0, 0, Types.BOOLEAN),
}
import java.util.stream.Collectors;
        for (GenericDataType dt : new ArrayList<>(genericDataTypes)) {
     */
    }
import org.jkiss.code.NotNull;
            String name,
 * Licensed under the Apache License, Version 2.0 (the "License");
            new Entry("UInt256", 78, false, 0, 0, Types.NUMERIC),
            new Entry("IntervalDay", 19, true, 0, 0, 0),
                            .collect(Collectors.joining(","))
        if (DBUtils.findObject(genericDataTypes, "Decimal") == null) {
            new Entry("LowCardinality", 0, false, 0, 0, 0),
            new Entry("Nested", 0, false, 0, 0, 0),
            new Entry("IntervalNanosecond", 19, true, 0, 0, 0),
            new Entry("Int32", 10, true, 0, 0, Types.NUMERIC),
            new Entry("Decimal32", 9, true, 0, 9, Types.NUMERIC),
import java.sql.Types;
                    maximumScale,
            new Entry("Variant", 0, false, 0, 0, 0),
