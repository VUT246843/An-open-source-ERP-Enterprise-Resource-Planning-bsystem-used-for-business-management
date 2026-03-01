        return new LineString(coordinates, Dimension.Two, value.getSrid());
    }
            final int index = wkt.indexOf(';');
     *
    @NotNull
        } catch (Exception e) {
        }
    @NotNull
    /**
 */
            return convertCompoundCurve((CompoundCurve) value, tolerance);
            );
    private static LineString convertCompoundCurve(@NotNull CompoundCurve value, double tolerance) {
import org.jkiss.dbeaver.model.exec.DBCException;
        }
import org.jkiss.dbeaver.model.gis.DBGeometry;

        final List<Coordinate> output = new ArrayList<>();

import org.jkiss.code.Nullable;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

            output.addAll(arc.linearize(tolerance));
        return value instanceof CircularString
            .map(x -> new LinearRing(x.getCoordinates(), x.getDimension(), x.getSrid()))
            .map(x -> linearize(x, tolerance))
import org.jkiss.utils.CommonUtils;
    public static Geometry linearize(@NotNull Geometry value, double tolerance) {

            return convertMultiCurve((MultiCurve) value, tolerance);


            final CircularArc arc = new CircularArc(
public class WKGUtils {

     * @return parsed geometry
        } else if (value instanceof MultiCurve) {
            // Nullify geometry's SRID so it's not included in its toString representation
 * See the License for the specific language governing permissions and


        return new MultiPolygon(polygons, Dimension.Two, value.getSrid());
        // This value results in 32 segments per quadrant, the default tolerance for ST_CurveToLine


import org.jkiss.dbeaver.model.gis.CircularArc;
        final List<Coordinate> coordinates = value.getCurves().stream()
    }
 * limitations under the License.
        for (int i = 2; i < input.size(); i += 2) {

    private static MultiLineString convertMultiCurve(@NotNull MultiCurve value, double tolerance) {
            geometry.setSRID(srid);


        throw new DBCException("Invalid geometry object");
        final List<Coordinate> input = value.getCoordinates();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *

    public static DBGeometry parseWKB(String hexString) throws DBCException {
    }
        return linearize(value, 0.001);
        final List<LinearRing> innerLinearRings = value.getInnerCurves().stream()
            .collect(Collectors.toList());
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
}
        } else {
            .collect(Collectors.toList());
            .collect(Collectors.toList());
        return geometry;
        }
    }
                input.get(i - 1),
        final DBGeometry geometry;
                input.get(i)
        } else if (value instanceof MultiSurface) {
            return new DBGeometry(wkgGeometry, srid);
                input.get(i - 2),
            final int srid = CommonUtils.toInt(wkgGeometry.getSrid());
            wkgGeometry.setSrid(null);
        } else if (value instanceof CurvePolygon) {
        final LinearRing outerLinearRing = Stream.of(value.getOuterCurve())

            .map(x -> (LineString) linearize(x, tolerance))
    @NotNull

            .map(x -> linearize(x, tolerance))
    }
        if (wkgGeometry != null) {
            || value instanceof CompoundCurve
    }
            return convertCurvePolygon((CurvePolygon) value, tolerance);
import org.cugos.wkg.*;
        if (wkt.startsWith("SRID=") && wkt.indexOf(';') > 5) {
        org.cugos.wkg.Geometry wkgGeometry = new WKBReader().read(hexString);
            .map(x -> new LinearRing(x.getCoordinates(), x.getDimension(), x.getSrid()))
            .map(x -> (Polygon) linearize(x, tolerance))
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
            srid = CommonUtils.toInt(wkt.substring(5, index));
import java.util.List;
    private static LineString convertCircularString(@NotNull CircularString value, double tolerance) {
import java.util.ArrayList;
            throw new DBCException("Error parsing geometry value from string", e);
            .flatMap(x -> x.getCoordinates().stream())
    @NotNull
        if (value instanceof CircularString) {
    @NotNull
    public static boolean isCurve(@Nullable Object value) {
        final List<LineString> strings = value.getCurves().stream()

            geometry = new DBGeometry(new WKTReader().read(wkt));
    public static DBGeometry parseWKT(@NotNull String wkt) throws DBCException {
        return new LineString(output, Dimension.Two, value.getSrid());

        }
    @NotNull
    public static Object linearize(@NotNull Geometry value) {

import java.util.stream.Collectors;
    @NotNull
        try {
     * @throws DBCException on parse error
 *     http://www.apache.org/licenses/LICENSE-2.0

        return new MultiLineString(strings, Dimension.Two, value.getSrid());
            return convertCircularString((CircularString) value, tolerance);
 * WKG geometry utils
        return new Polygon(outerLinearRing, innerLinearRings, Dimension.Two, value.getSrid());
            || value instanceof CurvePolygon
    }
package org.jkiss.dbeaver.data.gis.handlers;
    private static MultiPolygon convertMultiSurface(@NotNull MultiSurface value, double tolerance) {
/*
        final List<Polygon> polygons = value.getSurfaces().stream()
    private static Polygon convertCurvePolygon(@NotNull CurvePolygon value, double tolerance) {
/**
            return value;
            .collect(Collectors.toList());
    }
    }
 */
import org.locationtech.jts.io.WKTReader;
     * Parses WKT (Well-known text) or its extension EWKT (Extended well-known text)
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
            .map(x -> linearize(x, tolerance))
 * DBeaver - Universal Database Manager
        }

            || value instanceof MultiSurface;
        }

            wkt = wkt.substring(index + 1);

        if (srid != 0) {
     */
    }
 *
 *
            return convertMultiSurface((MultiSurface) value, tolerance);
            .findAny().get();
        int srid = 0;
            || value instanceof MultiCurve
import java.util.stream.Stream;
        } else if (value instanceof CompoundCurve) {
