public final class DuckDBGeometryConverter {
                    .mapToObj(i -> (Point) deserializeRecursive(buffer, hasZ, hasM, factory))
                var points = IntStream.range(0, count)
            }
        double m = hasM ? buffer.getDouble() : 0;
    }
 * DBeaver - Universal Database Manager
    private static CoordinateSequence readCoordinates(
            return values()[value];
                var shell = rings.get(0);
    }
        int count = buffer.getInt();
                    .toArray(Point[]::new);

                yield factory.createMultiLineString(lineStrings);
                var lineStrings = IntStream.range(0, count)
 * Copyright (C) 2010-2025 DBeaver Corp and others
        POLYGON,

                var geometries = IntStream.range(0, count)
            buffer.position(buffer.position() + dimensions * Float.BYTES * 2);
    }
// https://github.com/duckdb/duckdb-spatial/blob/450094cfa48b0485b55c096d280dbb0fe9185e82/src/spatial/geometry/geometry_serialization.cpp
                    .mapToObj(i -> deserializeRecursive(buffer, hasZ, hasM, factory))
    }
                    .mapToObj(i -> factory.createLinearRing(readCoordinates(buffer, ringSizes[i], hasZ, hasM, factory)))
    ) {
            }
                var polygons = IntStream.range(0, count)
        var hasZ = (flags & 0x01) != 0;
 * See the License for the specific language governing permissions and
            .toArray(Coordinate[]::new);
        } else {

        double z = hasZ ? buffer.getDouble() : 0;
        boolean hasM,
        boolean hasZ,
            }
/*
                    .toArray(Geometry[]::new);
                    .mapToObj(i -> (LineString) deserializeRecursive(buffer, hasZ, hasM, factory))
import java.util.stream.IntStream;
        }
        buffer.getInt();   // padding
            case MULTI_POINT -> {
        @NotNull GeometryFactory factory
package org.jkiss.dbeaver.ext.duckdb.model.data;
                var ringSizes = IntStream.range(0, ringCount)
        @NotNull GeometryFactory factory
                yield factory.createPolygon(shell, holes);
    @NotNull

        @NotNull ByteBuffer buffer,
    private enum GeometryType {
            return new Coordinate(x, y);
                var coordinates = readCoordinates(buffer, count, hasZ, hasM, factory);
                var coordinates = readCoordinates(buffer, count, hasZ, hasM, factory);
            case POLYGON -> {

                    .toArray();
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    .toArray(LineString[]::new);
        buffer.getShort(); // unused
 */
import java.nio.ByteBuffer;
    private static Coordinate readCoordinate(@NotNull ByteBuffer buffer, boolean hasZ, boolean hasM) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    private static Geometry deserializeRecursive(
            case POINT -> {
            }
    public static Geometry deserialize(@NotNull ByteBuffer buffer, @NotNull GeometryFactory factory) {
                throw new IllegalArgumentException("Invalid geometry type: " + value);
        } else if (hasM) {
        return factory.getCoordinateSequenceFactory().create(coordinates);
        double x = buffer.getDouble();
            }

        LINESTRING,
 *
        var flags = buffer.get();
        if (hasBBox) {
            return new CoordinateXYM(x, y, m);
    private DuckDBGeometryConverter() {
        MULTI_POINT,
                var rings = IntStream.range(0, count)
        return deserializeRecursive(buffer, hasZ, hasM, factory);


 *
                yield factory.createPoint(coordinates);
        double y = buffer.getDouble();
                yield factory.createMultiPolygon(polygons);
        MULTI_GEOMETRY;
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean hasM,
        @NotNull ByteBuffer buffer,
            if (value < 0 || value > values().length) {

        var hasBBox = (flags & 0x04) != 0;
}
        static GeometryType valueOf(int value) {
        };
 * Unless required by applicable law or agreed to in writing, software
 *

        GeometryType.valueOf(buffer.get()); // type
                var ringCount = count + (count % 2 == 1 ? 1 : 0);

import org.locationtech.jts.geom.*;
        var coordinates = IntStream.range(0, count)
        int count,

            .mapToObj(i -> readCoordinate(buffer, hasZ, hasM))
                    .map(i -> buffer.getInt())

        POINT,
    ) {
                yield factory.createLineString(coordinates);
 * limitations under the License.
        MULTI_POLYGON,
    }
    @NotNull
                yield factory.createGeometryCollection(geometries);
import org.jkiss.code.NotNull;
            case MULTI_LINESTRING -> {
            return new CoordinateXYZM(x, y, z, m);
        }
        }
            return new Coordinate(x, y, z);
            }
    }
            case MULTI_GEOMETRY -> {
        var dimensions = 2 + (hasZ ? 1 : 0) + (hasM ? 1 : 0);
 * you may not use this file except in compliance with the License.
    @NotNull
        var hasM = (flags & 0x02) != 0;
                    .toArray(Polygon[]::new);
        boolean hasZ,
        var type = GeometryType.valueOf(buffer.getInt());

                    .toList();
                yield factory.createMultiPoint(points);
        } else if (hasZ) {
        return switch (type) {
                    .mapToObj(i -> (Polygon) deserializeRecursive(buffer, hasZ, hasM, factory))
        MULTI_LINESTRING,
        if (hasZ && hasM) {
            case LINESTRING -> {
            case MULTI_POLYGON -> {
 *     http://www.apache.org/licenses/LICENSE-2.0
                var holes = rings.subList(1, rings.size()).toArray(LinearRing[]::new);
            }
 * You may obtain a copy of the License at
