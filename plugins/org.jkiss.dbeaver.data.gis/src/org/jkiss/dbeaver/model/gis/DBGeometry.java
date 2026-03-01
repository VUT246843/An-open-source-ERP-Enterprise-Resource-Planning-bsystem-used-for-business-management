        if (jtsGeometry == null) {
    }
        }
        return rawValue.toString();
        if (jtsGeometry == null) {
import org.jkiss.code.Nullable;


    }
        @Override
        }
    public void release() {
        this(source.rawValue, source.srid, source.properties);
import org.locationtech.jts.io.WKTWriter;
 * limitations under the License.
    private int srid;
        this(rawValue, srid, null);
            ((Geometry) rawValue).setSRID(srid);
        }
            coord.y = oldX;
        if (rawValue instanceof Geometry) {
        Geometry geometry = getGeometry();
 *
    /**
            return null;
        }
        Geometry jtsGeometry = getGeometry();
    private static class Force2DCoordinateFilter implements CoordinateFilter {
                return false;

        }
            try {
 * Geometry value (LOB).
            return this;
    }
import java.util.LinkedHashMap;
        return false;
        }
            return false;
package org.jkiss.dbeaver.model.gis;
            } catch (Exception e) {
    }
 *
        Geometry jtsGeometry = getGeometry();
        if (rawValue instanceof Geometry) {
        final String string = getString();
    }
            }
        }
        public void filter(Coordinate coord) {
        this.properties.putAll(properties);
    public boolean isModified() {
    }
                jtsGeometry = jtsGeometry.copy();
    }

    public void putProperties(@NotNull Map<String, Object> properties) {
        this.srid = srid;

            } catch (Exception e) {
    @Override

            }
import org.jkiss.code.NotNull;
    }

            if (coord.getX() != 0 || coord.getY() != 0 || coord.getZ() != 0) {

import org.locationtech.jts.io.WKTReader;
            // Use all possible dimensions (4 stands for XYZM) for the most verbose output
 * You may obtain a copy of the License at
    @NotNull
                jtsGeometry.apply(Force2DCoordinateFilter.INSTANCE);
        this.srid = srid;

import org.jkiss.dbeaver.DBException;
    public DBGeometry(@Nullable Geometry rawValue) {
                break;
    public boolean isNull() {
 */
        this.properties = properties == null ? null : new LinkedHashMap<>(properties);
            double oldX = coord.x;
            if (!Double.isNaN(coordinate.getZ())) {
    public boolean isEmpty() {
                throw new DBException("Error parsing geometry WKT", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return rawValue instanceof Geometry ? (Geometry) rawValue : null;
        }
        }
    }
                throw new DBException("Error parsing geometry WKT", e);
    }
 * DBeaver - Universal Database Manager
            try {

 * Unless required by applicable law or agreed to in writing, software

}

import org.jkiss.dbeaver.model.data.DBDValue;
        }
        }
                jtsGeometry = new WKTReader().read(getString());
        return new DBGeometry(jtsGeometry, srid, properties);
    }
            return new WKTWriter(4).write((Geometry) rawValue);

    public int getSRID() {
        public static final InvertCoordinateFilter INSTANCE = new InvertCoordinateFilter();
    }

        this.rawValue = rawValue;
        for (Coordinate coord : geometry.getCoordinates()) {
        @Override
    public void setSRID(int srid) {
        public void filter(Coordinate coord) {

    private Map<String, Object> properties;
        return new DBGeometry(this);
 *
        if (rawValue == null) {

    }
        jtsGeometry.apply(InvertCoordinateFilter.INSTANCE);
        return rawValue == null;
        public static final Force2DCoordinateFilter INSTANCE = new Force2DCoordinateFilter();
    public DBGeometry(@Nullable Object rawValue, int srid) {
    private static class InvertCoordinateFilter implements CoordinateFilter {
                jtsGeometry = new WKTReader().read(getString());
        if (geometry == null) {
    @Override

    public String toString() {
    public DBGeometry() {

            coord.setZ(Double.NaN);
    public DBGeometry flipCoordinates() throws DBException {


    }
        for (Coordinate coordinate : jtsGeometry.getCoordinates()) {
    @Override
            this.properties = new LinkedHashMap<>();
    public Map<String, Object> getProperties() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
        return string != null ? string : super.toString();
import java.util.Map;
     */
        return properties;
            coord.x = coord.y;
 */
    public DBGeometry(@NotNull DBGeometry source) {
    }
        } else {
    @Nullable


    public DBGeometry(@Nullable Object rawValue, int srid, @Nullable Map<String, Object> properties) {
        }
    }
/**
/*
    public Object getRawValue() {
    public String getString() {
        return new DBGeometry(jtsGeometry, srid, properties);
import org.locationtech.jts.geom.CoordinateFilter;
        return true;
    public Geometry getGeometry() {

        if (jtsGeometry == getGeometry()) {
        return srid;
import org.locationtech.jts.geom.Coordinate;
        this.properties = properties;

            jtsGeometry = jtsGeometry.copy();
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBGeometry force2D() throws DBException {
public class DBGeometry implements DBDValue {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void setProperties(Map<String, Object> properties) {
    @Override
        this(null, 0);
    }
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        this(rawValue, rawValue == null ? 0 : rawValue.getSRID());

    }
    private final Object rawValue;
    public DBGeometry copy() {

    }
    }
import org.locationtech.jts.geom.Geometry;

        @SuppressWarnings("SuspiciousNameCombination")
            }

    }
 * you may not use this file except in compliance with the License.

        if (this.properties == null) {
 * See the License for the specific language governing permissions and

     * @return true if all geometry points set to zero
        return rawValue;
            }

    @Override

