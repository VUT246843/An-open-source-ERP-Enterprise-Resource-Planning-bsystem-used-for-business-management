    @NotNull

        int index
        throw new DBCException("Editing of geo data is not yet supported", null, session.getExecutionContext());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @NotNull

    }

    ) throws DBCException {
    private static final String TYPE_MULTIPOLYGON = "multipolygon";
            return null;
    private static Point createPoint(@NotNull GeometryFactory factory, @NotNull double[] object) {
        return factory.createPoint(new Coordinate(object[0], object[1]));
    @Override
 * See the License for the specific language governing permissions and
    @NotNull
        var shell = rings.get(0);
    private static MultiPolygon createMultiPolygon(@NotNull GeometryFactory factory, @NotNull double[][][][] object) {
        return factory.createPolygon(shell, holes);

        @NotNull DBSTypedObject type,
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
import org.jkiss.dbeaver.model.exec.DBCException;
        return new DBGeometry(geometry);
            .map(ring -> createRing(factory, ring))
 * You may obtain a copy of the License at
            case TYPE_RING -> createRing(factory, (double[][]) object);
            .toArray(Coordinate[]::new);
    }
/*
    protected Object fetchColumnValue(
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        var lineStrings = Arrays.stream(object)
    @Nullable
    }
    }
}
        }
    ) throws DBCException {
 */
    }
    private static final String TYPE_LINESTRING = "linestring";
 *
import org.jkiss.dbeaver.model.gis.DBGeometry;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            .toList();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            case TYPE_LINESTRING -> createLineString(factory, (double[][]) object);
            case TYPE_POINT, TYPE_RING, TYPE_LINESTRING, TYPE_MULTILINESTRING, TYPE_POLYGON, TYPE_MULTIPOLYGON -> true;
            case TYPE_POLYGON -> createPolygon(factory, (double[][][]) object);
    @Override
        var holes = rings.subList(1, rings.size()).toArray(LinearRing[]::new);
        return factory.createLineString(coordinates);
import org.jkiss.code.Nullable;
        @Nullable Object object,
import java.util.Arrays;
    private static final String TYPE_POINT = "point";
            .map(polygon -> createPolygon(factory, polygon))
package org.jkiss.dbeaver.ext.clickhouse.model.data;
    }

import java.util.Locale;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    // https://clickhouse.com/docs/sql-reference/data-types/geo
            .toArray(Coordinate[]::new);
        var polygons = Arrays.stream(object)
    private static final String TYPE_RING = "ring";
            .map(point -> new Coordinate(point[0], point[1]))
import java.util.stream.Stream;
    public Object getValueFromObject(
import org.jkiss.code.NotNull;
 *
        return getValueFromObject(session, type, resultSet.getObject(index), false, false);
 * DBeaver - Universal Database Manager
        var coordinates = Stream.concat(Arrays.stream(object), Arrays.stream(object).limit(1))
import org.jkiss.dbeaver.model.exec.DBCSession;
        return switch (typeName.toLowerCase(Locale.ROOT)) {
        @NotNull DBCSession session,
        };
            .map(point -> new Coordinate(point[0], point[1]))
    public static boolean isGeometryType(@NotNull String typeName) {
        var geometry = switch (type.getTypeName().toLowerCase(Locale.ROOT)) {
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.locationtech.jts.geom.*;
    @NotNull
        var rings = Arrays.stream(object)
        };
 * distributed under the License is distributed on an "AS IS" BASIS,
            .toArray(Polygon[]::new);
    private static MultiLineString createMultiLineString(@NotNull GeometryFactory factory, @NotNull double[][][] object) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        return factory.createLinearRing(coordinates);

    }
    private static Polygon createPolygon(@NotNull GeometryFactory factory, @NotNull double[][][] object) {
            .map(lineString -> createLineString(factory, lineString))
 * you may not use this file except in compliance with the License.
    private static final String TYPE_MULTILINESTRING = "multilinestring";
            case TYPE_POINT -> createPoint(factory, (double[]) object);
        return factory.createMultiLineString(lineStrings);
    @NotNull
        JDBCResultSet resultSet,
    private static LineString createLineString(@NotNull GeometryFactory factory, @NotNull double[][] object) {
            default -> false;
        int paramIndex,
    @Nullable



    private static final String TYPE_POLYGON = "polygon";
            default -> throw new DBCException("Unexpected geo type: " + type.getTypeName(), null, session.getExecutionContext());
    private static LinearRing createRing(@NotNull GeometryFactory factory, @NotNull double[][] object) {
            .toArray(LineString[]::new);


    private ClickhouseGeometryValueHandler() {
        return DBGeometry.class;
    @NotNull
    }
        boolean copy,
public class ClickhouseGeometryValueHandler extends JDBCAbstractValueHandler {
import java.sql.SQLException;
    }

    protected void bindParameter(
 * Unless required by applicable law or agreed to in writing, software
    }
        DBSTypedObject type,
 * limitations under the License.
    public static final ClickhouseGeometryValueHandler INSTANCE = new ClickhouseGeometryValueHandler();
        var factory = new GeometryFactory(new PrecisionModel());
        if (object == null) {
    @Override
        JDBCSession session,
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
    ) throws DBCException, SQLException {

        return factory.createMultiPolygon(polygons);
            case TYPE_MULTIPOLYGON -> createMultiPolygon(factory, (double[][][][]) object);
 *
        var coordinates = Arrays.stream(object)
        Object value
        DBCSession session,
        DBSTypedObject paramType,
        boolean validateValue


        JDBCPreparedStatement statement,
            case TYPE_MULTILINESTRING -> createMultiLineString(factory, (double[][][]) object);
