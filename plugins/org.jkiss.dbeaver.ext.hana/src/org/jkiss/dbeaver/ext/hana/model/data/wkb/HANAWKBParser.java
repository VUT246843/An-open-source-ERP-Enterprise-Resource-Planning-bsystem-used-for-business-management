            }

            return factory.createPolygon(shell);
 * 1000 (as described in the relevant OGC and SQL/MM standard) while JTS expects
        switch (xyzmFlag) {
            for (int i = 0; i < numPoints; ++i) {
            return factory.createPoint(cs);

        return factory.createMultiLineString(lineStrings);
                typeCode -= EWKB_FLAG;
        case POLYGON:
            return cs;
        return factory.createLinearRing(cs);
    private LineString parseLineString() {
            }
        default:
        return factory.createPolygon(shell, holes);

 *
                cs.getCoordinate(i).setM(data.getDouble());
        for (int i = 0; i < numPoints; ++i) {
            throw new HANAWKBParserException(MessageFormat.format("Unknown WKB type {0}", wkbType));
 *

    private static final int XYZM_MODE_XYM = 2;
    private static final byte NDR = 1;
        for (int i = 1; i < numRings; ++i) {
            break;
    }
        }
            return geometry;
                cs.getCoordinate(i).setZ(data.getDouble());
        int numPoints = data.getInt();

        int xyzmFlag = wkbType / XYZM_MODE_DIV;
    }
    }
        int numPolygons = data.getInt();
        }
    private static final int XYZM_MODE_XYZ = 1;
    public Geometry parse(byte[] wkb) throws HANAWKBParserException {
        try {
    private XyzmMode xyzmMode;
        if ((cs.size() >= 4) || (cs.size() == 0)) {

 * Unless required by applicable law or agreed to in writing, software
import java.text.MessageFormat;
            return parsePoint();
    }
            throw new AssertionError();
    private GeometryCollection parseGeometryCollection() throws HANAWKBParserException {
            if (isEwkb) {
            return XyzmMode.XYZM;
    }
    private Geometry parseGeometryOfType(GeometryType type) throws HANAWKBParserException {

        }
        case GEOMETRYCOLLECTION:
        CoordinateSequenceFactory csf = factory.getCoordinateSequenceFactory();
        }
        if (type == null) {
            cs.getCoordinate(0).setM(m);
        data = ByteBuffer.wrap(wkb);
            break;
        Polygon[] polygons = new Polygon[numPolygons];

        }
        LineString[] lineStrings = new LineString[numLineStrings];
        return factory.createMultiPoint(points);
            throw new AssertionError();
        }
        return csf.create(coords);
        int numRings = data.getInt();
            throw new HANAWKBParserException(MessageFormat.format("Invalid BOM value {0}", order));
import java.nio.BufferUnderflowException;
            throw new HANAWKBParserException(MessageFormat.format("Invalid XYZM-mode {0}", xyzmFlag));
                cs.getCoordinate(i).setY(data.getDouble());
    private void readAndSetByteOrder() throws HANAWKBParserException {
    private static final byte XDR = 0;
                cs.getCoordinate(i).setX(data.getDouble());
            }
            lineStrings[i] = (LineString) parseSubGeometry();
 * specific bits to be set.
 * Contributors:
        case XYM:
        switch (order) {
        case XYZM_MODE_XYZM:
                cs.getCoordinate(i).setX(data.getDouble());
        default:
        case XY:
        int wkbType = typeCode & TYPE_MASK;
 *

            GeometryType type = getGeometryType(typeCode);
        readAndSetByteOrder();
        case XYZM_MODE_XYM:
        byte order = data.get();
 * of different type code conventions. HANA offsets type codes by multiples of
public class HANAWKBParser {
        }
            boolean isEwkb = (typeCode & EWKB_FLAG) != 0;
        case MULTIPOINT:
package org.jkiss.dbeaver.ext.hana.model.data.wkb;
        }
        if (Double.isNaN(x)) {
            for (int i = 0; i < numPoints; ++i) {
            return factory.createPolygon((LinearRing) null);

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        cs.getCoordinate(0).setX(x);
            int typeCode = data.getInt();
            return XyzmMode.XYM;
import java.nio.ByteBuffer;
                cs.getCoordinate(i).setZ(data.getDouble());
        return factory.createMultiPolygon(polygons);
import org.locationtech.jts.geom.*;
        if (xyzmMode.hasZ()) {
            break;
            return parseMultiPolygon();
        double z = Double.NaN;
        CoordinateSequence cs = csf.create(1, dimension, xyzmMode.hasM() ? 1 : 0);
        return factory.createLineString(cs);
            for (int i = 0; i < numPoints; ++i) {
            dimension = xyzmMode.getCoordinatesPerPoint();
            break;
        if (xyzmMode.hasM()) {
 * A parser for the well-known-binary created by HANA.

        case CIRCULARSTRING:
        CoordinateSequenceFactory csf = factory.getCoordinateSequenceFactory();
        case XYZM_MODE_XYZ:
            readAndSetByteOrder();
        switch (xyzmMode) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    private static final int XYZM_MODE_DIV = 1000;
}
                cs.getCoordinate(i).setY(data.getDouble());
    }
    private XyzmMode getXyzmMode(int typeCode) throws HANAWKBParserException {
        int numPoints = data.getInt();
            z = data.getDouble();
            }
            coords[i] = cs.getCoordinate(0);
    }
    }
        return type;

        }
        case XYZ:
        }
        case NDR:
        if (numRings == 0) {
        }

        double x = data.getDouble();
            CoordinateSequence cs = csf.create(0, dimension, xyzmMode.hasM() ? 1 : 0);

    }

        case XYZM:
            xyzmMode = getXyzmMode(typeCode);
                throw new HANAWKBParserException("There is unparsed WKB data left");
        return parseGeometryOfType(type);
 * See the License for the specific language governing permissions and
        CoordinateSequenceFactory csf = factory.getCoordinateSequenceFactory();
            data.order(ByteOrder.BIG_ENDIAN);
            return parseMultiLineString();

    }
        for (int i = cs.size(); i < 4; ++i) {
 *    Stefan Uhrig - initial implementation
    private static final int XYZM_MODE_XY = 0;
                cs.getCoordinate(i).setX(data.getDouble());
        Point[] points = new Point[numPoints];
                cs.getCoordinate(i).setM(data.getDouble());
            m = data.getDouble();
        int typeCode = data.getInt();
        }
    }
        LinearRing shell = parseLinearRing();
            for (int i = 0; i < numPoints; ++i) {
    }
    }
        case XYZM_MODE_XY:
        int numGeometries = data.getInt();
        }
        }
            holes[i - 1] = parseLinearRing();
        for (int i = 0; i < numLineStrings; ++i) {
            throw new HANAWKBParserException("Circular strings are not supported by JTS");
 * DBeaver - Universal Database Manager
        if (numRings == 1) {
        CoordinateSequence cs = patchRing(readCoordinateSequence());
 *
        Coordinate[] coords = new Coordinate[4];
                cs.getCoordinate(i).setY(data.getDouble());
    private GeometryFactory factory;

        Geometry[] geometries = new Geometry[numGeometries];
        }
        GeometryType type = getGeometryType(typeCode);
 * The JTS parser cannot be used to parse 3- or 4-dimensional geometries because
    private GeometryType getGeometryType(int typeCode) throws HANAWKBParserException {
 */
            int srid = isEwkb ? data.getInt() : 0;
            break;
            break;
            return parsePolygon();
        case POINT:
        } catch (BufferUnderflowException e) {
        if (xyzmMode.hasM()) {
        case LINESTRING:
import java.nio.ByteOrder;


        if (xyzmMode.hasZ()) {
    private CoordinateSequence readCoordinateSequence() {

 *


    }
                cs.getCoordinate(i).setY(data.getDouble());
 * You may obtain a copy of the License at

            geometries[i] = parseSubGeometry();

    }
        default:
            Geometry geometry = parseGeometryOfType(type);
            data.order(ByteOrder.LITTLE_ENDIAN);


    private static final int TYPE_MASK = 0xFFFFF;
        }
    private static final int EWKB_FLAG = 0x20000000;
        wkbType = wkbType % XYZM_MODE_DIV;
 */
        }

        double m = Double.NaN;
    private Point parsePoint() {
    private MultiPolygon parseMultiPolygon() throws HANAWKBParserException {
        for (int i = 0; i < numGeometries; ++i) {
        double y = data.getDouble();
 * limitations under the License.

        int numLineStrings = data.getInt();
        int wkbType = typeCode & TYPE_MASK;
    private static final int XYZM_MODE_XYZM = 3;
            return XyzmMode.XYZ;
        GeometryType type = GeometryType.getFromCode(wkbType);
    private MultiLineString parseMultiLineString() throws HANAWKBParserException {
            throw new HANAWKBParserException("WKB is too short", e);
        default:
        for (int i = 0; i < cs.size(); ++i) {
    }
    private CoordinateSequence patchRing(CoordinateSequence cs) {
            return parseMultiPoint();

    private LinearRing parseLinearRing() {
        for (int i = 0; i < numPolygons; ++i) {

            cs.getCoordinate(0).setZ(z);
        cs.getCoordinate(0).setY(y);
        }
    private ByteBuffer data;
        CoordinateSequence cs = readCoordinateSequence();
    private int dimension;
                cs.getCoordinate(i).setX(data.getDouble());
            return parseGeometryCollection();
    private MultiPoint parseMultiPoint() throws HANAWKBParserException {
            }
        LinearRing[] holes = new LinearRing[numRings - 1];
            if (data.hasRemaining()) {
        return factory.createPoint(cs);
        }
    private Polygon parsePolygon() {
        case XDR:
        switch (type) {
            polygons[i] = (Polygon) parseSubGeometry();
        return factory.createGeometryCollection(geometries);


    private Geometry parseSubGeometry() throws HANAWKBParserException {

            coords[i] = cs.getCoordinate(i);
 * you may not use this file except in compliance with the License.
        return cs;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        case MULTILINESTRING:
            points[i] = (Point) parseSubGeometry();
        CoordinateSequence cs = csf.create(numPoints, dimension, xyzmMode.hasM() ? 1 : 0);
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
            return XyzmMode.XY;
            factory = new GeometryFactory(new PrecisionModel(), srid);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return parseLineString();
        case MULTIPOLYGON:
/*

