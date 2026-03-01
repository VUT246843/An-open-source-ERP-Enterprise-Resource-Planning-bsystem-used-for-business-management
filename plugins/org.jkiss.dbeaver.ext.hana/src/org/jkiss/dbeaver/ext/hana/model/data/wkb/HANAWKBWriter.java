        return size;
            buffer.putDouble(cs.getY(0));
            return computePolygonSize((Polygon) geometry, xyzmMode);
        writeHeader(GeometryType.MULTILINESTRING, xyzmMode, buffer);
        writeHeader(GeometryType.MULTIPOLYGON, xyzmMode, buffer);
        } else if (geometry instanceof MultiPolygon) {
        } else if (geometry instanceof GeometryCollection) {
            return computeGeometryCollectionSize((GeometryCollection) geometry, xyzmMode);
        }
 * A well-known binary writer.
            if (xyzmMode.hasZ()) {
            buffer.putDouble(cs.getX(i));
        buffer.putInt(typeCode);
        int numPoints = multiPoint.getNumPoints();
                    MessageFormat.format("Unsupported geometry type {0}", geometry.getGeometryType()));
            writePolygon((Polygon) geometry, xyzmMode, buffer);
 * Contributors:
        }
        if (xyzmMode.hasZ()) {
        buffer.order(ByteOrder.LITTLE_ENDIAN);

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static int computeGeometryCollectionSize(GeometryCollection geometryCollection, XyzmMode xyzmMode)
    }
        } else if (geometry instanceof MultiPoint) {
    private static final int COORD_SIZE = 8;
        ByteBuffer buffer = ByteBuffer.allocate(size);
        if ((shell == null) || (shell.getNumPoints() == 0)) {
        for (int i = 0; i < numPolygons; ++i) {
        buffer.putInt(numLineStrings);
        int numHoles = polygon.getNumInteriorRing();
        int numPoints = cs.size();
        }
 *
        int typeCode = geometryType.getTypeCode();
        if (cs.size() == 0) {
    }


            return computeMultiPolygonSize((MultiPolygon) geometry, xyzmMode);
        buffer.put(NDR);
    }
        buffer.putInt(numPoints);
            writePoint((Point) geometry, xyzmMode, buffer);
        }
        for (int i = 0; i < numPoints; ++i) {
                buffer.putDouble(Double.NaN);
 *
            throw new HANAWKBWriterException(
        } else {
        writeHeader(GeometryType.POINT, xyzmMode, buffer);
        int size = computeGeometrySize(geometry, xyzmMode);

        }
 * You may obtain a copy of the License at
            writeLineString((LineString) geometry, xyzmMode, buffer);
        } else if (geometry instanceof GeometryCollection) {
        } else {
    private static void writeGeometryCollection(GeometryCollection geometryCollection, XyzmMode xyzmMode,
        LineString shell = polygon.getExteriorRing();
        return HEADER_SIZE + COUNT_SIZE + lineString.getNumPoints() * xyzmMode.getCoordinatesPerPoint() * COORD_SIZE;
 *
        buffer.putInt(numGeometries);
            writeCoordinateSequence(hole.getCoordinateSequence(), xyzmMode, buffer);
import java.text.MessageFormat;
        writeHeader(GeometryType.GEOMETRYCOLLECTION, xyzmMode, buffer);
        }

    private static void writeMultiPolygon(MultiPolygon multiPolygon, XyzmMode xyzmMode, ByteBuffer buffer) {
 *
        for (int i = 0; i < numLineStrings; ++i) {
                buffer.putDouble(cs.getZ(i));

            if (xyzmMode.hasZ()) {
            size += computePolygonSize((Polygon) multiPolygon.getGeometryN(i), xyzmMode);


    private static void writeGeometry(Geometry geometry, XyzmMode xyzmMode, ByteBuffer buffer)
        for (int i = 0; i < multiLineString.getNumGeometries(); ++i) {
        return HEADER_SIZE + COUNT_SIZE + multiPoint.getNumPoints() * (HEADER_SIZE + pointSize);
            throw new HANAWKBWriterException(
            for (int i = 0; i < xyzmMode.getCoordinatesPerPoint(); ++i) {
            return;
 * limitations under the License.
        }
        }
    private static int computeMultiPointSize(MultiPoint multiPoint, XyzmMode xyzmMode) {
        LineString shell = polygon.getExteriorRing();
import java.nio.ByteBuffer;
 */
                buffer.putDouble(cs.getM(i));
            buffer.putDouble(cs.getX(0));
        }
            return computeMultiLineStringSize((MultiLineString) geometry, xyzmMode);
    private static void writePolygon(Polygon polygon, XyzmMode xyzmMode, ByteBuffer buffer) {
            size += computeGeometrySize(geometryCollection.getGeometryN(i), xyzmMode);
 */
            writeLineString((LineString) multiLineString.getGeometryN(i), xyzmMode, buffer);
        }
        return size;
                buffer.putDouble(cs.getZ(0));

    }
            LineString hole = polygon.getInteriorRingN(i);
 *     http://www.apache.org/licenses/LICENSE-2.0
            return computePointSize(xyzmMode);

    private static int computePolygonSize(Polygon polygon, XyzmMode xyzmMode) {
        return buffer.array();
    }
    }
        size += COUNT_SIZE + shell.getNumPoints() * pointSize;
        } else if (geometry instanceof LineString) {
import org.locationtech.jts.geom.*;
        } else if (geometry instanceof MultiLineString) {
 *
        int size = HEADER_SIZE + COUNT_SIZE;

 * DBeaver - Universal Database Manager
        int numHoles = polygon.getNumInteriorRing();
            writeGeometryCollection((GeometryCollection) geometry, xyzmMode, buffer);
            throws HANAWKBWriterException {
        if ((shell == null) || (shell.getNumPoints() == 0)) {
        writeHeader(GeometryType.LINESTRING, xyzmMode, buffer);
    private static final int HEADER_SIZE = 5;
        }
        if (geometry instanceof Point) {



    }
    private static void writeCoordinateSequence(CoordinateSequence cs, XyzmMode xyzmMode, ByteBuffer buffer) {
        buffer.putInt(numPoints);

 * See the License for the specific language governing permissions and
        writeGeometry(geometry, xyzmMode, buffer);
        for (int i = 0; i < numPoints; ++i) {
        } else if (geometry instanceof MultiPolygon) {
        return size;
        } else if (geometry instanceof MultiPoint) {
    }
                    MessageFormat.format("Unsupported geometry type {0}", geometry.getGeometryType()));
            writePolygon((Polygon) multiPolygon.getGeometryN(i), xyzmMode, buffer);
        int numGeometries = geometryCollection.getNumGeometries();
    private static int computePointSize(XyzmMode xyzmMode) {
        for (int i = 0; i < numGeometries; ++i) {
    private static int computeMultiLineStringSize(MultiLineString multiLineString, XyzmMode xyzmMode) {
            }
        return HEADER_SIZE + xyzmMode.getCoordinatesPerPoint() * COORD_SIZE;
            if (xyzmMode.hasM()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else if (geometry instanceof LineString) {
        int pointSize = xyzmMode.getCoordinatesPerPoint() * COORD_SIZE;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            buffer.putDouble(cs.getY(i));

        }
import java.nio.ByteOrder;
    }
}
        }
            buffer.putInt(0);
        return size;

            return computeMultiPointSize((MultiPoint) geometry, xyzmMode);
    private static final int M_OFFSET = 2000;

            return null;
            if (xyzmMode.hasM()) {
            writeMultiPolygon((MultiPolygon) geometry, xyzmMode, buffer);
        for (int i = 0; i < geometryCollection.getNumGeometries(); ++i) {
            }
        int numLineStrings = multiLineString.getNumGeometries();
    }

    private static final int COUNT_SIZE = 4;
    private static int computeGeometrySize(Geometry geometry, XyzmMode xyzmMode) throws HANAWKBWriterException {
            ByteBuffer buffer) throws HANAWKBWriterException {

    private static void writeMultiLineString(MultiLineString multiLineString, XyzmMode xyzmMode, ByteBuffer buffer) {
        writeCoordinateSequence(shell.getCoordinateSequence(), xyzmMode, buffer);
    }
    }
                buffer.putDouble(cs.getM(0));
        writeHeader(GeometryType.MULTIPOINT, xyzmMode, buffer);
public class HANAWKBWriter {
            return computeLineStringSize((LineString) geometry, xyzmMode);
    private static void writeHeader(GeometryType geometryType, XyzmMode xyzmMode, ByteBuffer buffer) {
        } else if (geometry instanceof Polygon) {
        }
        for (int i = 0; i < multiPolygon.getNumGeometries(); ++i) {
 * Unless required by applicable law or agreed to in writing, software
        writeHeader(GeometryType.POLYGON, xyzmMode, buffer);
        int size = HEADER_SIZE + COUNT_SIZE;
            }
    private static final byte NDR = 1;
            typeCode += M_OFFSET;
    private static void writeLineString(LineString lineString, XyzmMode xyzmMode, ByteBuffer buffer) {
        if (geometry == null) {
            throws HANAWKBWriterException {
            size += computeLineStringSize((LineString) multiLineString.getGeometryN(i), xyzmMode);
 *    Stefan Uhrig - initial implementation


 * The JTS WKB writer cannot be used as it rejects empty points.

    }
    }
package org.jkiss.dbeaver.ext.hana.model.data.wkb;
            size += COUNT_SIZE + polygon.getInteriorRingN(i).getNumPoints() * pointSize;
        int pointSize = xyzmMode.getCoordinatesPerPoint() * COORD_SIZE;
    private static void writePoint(Point point, XyzmMode xyzmMode, ByteBuffer buffer) {
            typeCode += Z_OFFSET;
            }
        writeCoordinateSequence(lineString.getCoordinateSequence(), xyzmMode, buffer);

/**
        int numPolygons = multiPolygon.getNumGeometries();

        if (xyzmMode.hasM()) {
    }
        buffer.putInt(1 + numHoles);
        } else {
        int size = HEADER_SIZE + COUNT_SIZE;
    private static int computeLineStringSize(LineString lineString, XyzmMode xyzmMode) {
        CoordinateSequence cs = point.getCoordinateSequence();
        } else if (geometry instanceof MultiLineString) {
            }
    private static final int Z_OFFSET = 1000;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int size = HEADER_SIZE + COUNT_SIZE;
/*
            return size;
            writeMultiPoint((MultiPoint) geometry, xyzmMode, buffer);
        if (geometry instanceof Point) {
        } else if (geometry instanceof Polygon) {


    public static byte[] write(Geometry geometry, XyzmMode xyzmMode) throws HANAWKBWriterException {
 * you may not use this file except in compliance with the License.
            writeMultiLineString((MultiLineString) geometry, xyzmMode, buffer);
            writeGeometry(geometryCollection.getGeometryN(i), xyzmMode, buffer);
    private static int computeMultiPolygonSize(MultiPolygon multiPolygon, XyzmMode xyzmMode) {
    }
            writePoint((Point) multiPoint.getGeometryN(i), xyzmMode, buffer);
        }
        }
    }
        }
        buffer.putInt(numPolygons);


    private static void writeMultiPoint(MultiPoint multiPoint, XyzmMode xyzmMode, ByteBuffer buffer) {
        for (int i = 0; i < numHoles; ++i) {
    }
        for (int i = 0; i < numHoles; ++i) {
