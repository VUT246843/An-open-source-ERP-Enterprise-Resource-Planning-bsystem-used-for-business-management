            case GEOMETRY_NAME_MULTISURFACE:
                return GEOMETRY_NAME_MULTILINESTRING;
                break;

            default:
            case GEOMETRY_DIMENSION_ZM:
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
            case GEOMETRY_NAME_POLYGON:
                typmod |= GEOMETRY_TYPE_POLYGON;
    @Nullable
            case GEOMETRY_NAME_POLYHEDRALSURFACE:
                return GEOMETRY_NAME_TRIANGLE;
import org.jkiss.dbeaver.model.gis.DBGeometryDimension;
                return DBGeometryDimension.XYM;
    private static final String GEOMETRY_NAME_GEOMETRYCOLLECTION    = "geometrycollection";
            case GEOMETRY_NAME_POINT:
                break;
            case GEOMETRY_TYPE_POLYGON:
    private PostgreGeometryTypeHandler() {
        int typmod = (srid & (GEOMETRY_MASK_SRID >>> 8)) << 8;
                return GEOMETRY_NAME_POLYGON;
            case GEOMETRY_NAME_MULTICURVE:
                break;
        }
    private static final String GEOMETRY_NAME_MULTICURVE            = "multicurve";
}
    private static final int GEOMETRY_TYPE_POLYHEDRALSURFACE        = 0x0000_0034;
                return GEOMETRY_NAME_POINT;
                typmod |= GEOMETRY_TYPE_MULTISURFACE;
    private static final int GEOMETRY_DIMENSION_M                   = 0x0000_0001;
    }
    private static final int GEOMETRY_TYPE_TRIANGLE                 = 0x0000_0038;
    @Override
            case GEOMETRY_NAME_TRIANGLE:
                break;
    private static final int GEOMETRY_MASK_SRID                     = 0xffff_ff00;
            }
                break;
        switch (name) {
                typmod |= GEOMETRY_TYPE_GEOMETRYCOLLECTION;
    private static final int GEOMETRY_TYPE_CURVEPOLYGON             = 0x0000_0028;
                return GEOMETRY_NAME_CIRCULARSTRING;
                typmod |= GEOMETRY_TYPE_LINESTRING;
    private static final int GEOMETRY_TYPE_MULTIPOLYGON             = 0x0000_0018;
            case GEOMETRY_NAME_TIN:
    private static final int GEOMETRY_TYPE_GEOMETRYCOLLECTION       = 0x0000_001C;
        }
 */
        final int srid = (typmod & GEOMETRY_MASK_SRID) >>> 8;
            case GEOMETRY_TYPE_POLYHEDRALSURFACE:
                return GEOMETRY_NAME_MULTISURFACE;
            case GEOMETRY_TYPE_CURVEPOLYGON:
    private static final int GEOMETRY_DIMENSION_Z                   = 0x0000_0002;
import org.jkiss.dbeaver.DBException;
                break;
    private static final int GEOMETRY_TYPE_MULTICURVE               = 0x0000_002C;
            }
    private static final int GEOMETRY_TYPE_POLYGON                  = 0x0000_000C;
    public static int getGeometrySRID(int typmod) {
            case GEOMETRY_NAME_GEOMETRY:
    private static final int GEOMETRY_TYPE_POINT                    = 0x0000_0004;
        } else if (name.endsWith("m")) {
                return GEOMETRY_NAME_MULTIPOINT;
            }
                throw new IllegalArgumentException("Error obtaining geometry type from typmod: " + Integer.toHexString(typmod));
                return GEOMETRY_NAME_GEOMETRYCOLLECTION;
            sb.append('(').append(getGeometryType(typmod));
    private static final String GEOMETRY_NAME_CURVEPOLYGON          = "curvepolygon";
            case GEOMETRY_DIMENSION_M:
            default:
    public static DBGeometryDimension getGeometryDimension(int typmod) {
        if (name.endsWith("zm")) {
                typmod |= GEOMETRY_TYPE_CURVEPOLYGON;
            case GEOMETRY_NAME_MULTIPOINT:
        if (typmod == EMPTY_GEOMETRY) {
    private static final String GEOMETRY_NAME_MULTISURFACE          = "multisurface";

    public int getTypeModifiers(@NotNull PostgreDataType type, @NotNull String typeName, @NotNull String[] typmod) throws DBException {
            case GEOMETRY_NAME_GEOMETRYCOLLECTION:
                break;
                typmod |= GEOMETRY_TYPE_POINT;
                return DBGeometryDimension.XYZM;
            case GEOMETRY_TYPE_GEOMETRY:
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class PostgreGeometryTypeHandler extends PostgreTypeHandler {
    private static final int GEOMETRY_TYPE_MULTILINESTRING          = 0x0000_0014;
import org.jkiss.code.NotNull;
        switch (typmod & GEOMETRY_MASK_DIMENSION) {
                return GEOMETRY_NAME_MULTICURVE;
                sb.append('z');

                return DBGeometryDimension.XY;

    private static final String GEOMETRY_NAME_GEOMETRY              = "geometry";
            case GEOMETRY_NAME_LINESTRING:
                return GEOMETRY_NAME_LINESTRING;
 * Licensed under the Apache License, Version 2.0 (the "License");
                typmod |= GEOMETRY_TYPE_CIRCULARSTRING;
    }
                break;
    private static final int EMPTY_SRID                             = 0x00ff_ffff;
        switch ((typmod & GEOMETRY_MASK_TYPE)) {
    public static String getGeometryType(int typmod) {
 * See the License for the specific language governing permissions and
            return null;
                typmod |= GEOMETRY_TYPE_MULTIPOLYGON;
        return sb.toString();
                typmod |= GEOMETRY_TYPE_MULTICURVE;
    private static final int EMPTY_GEOMETRY                         = 0xffff_ffff;

        final StringBuilder sb = new StringBuilder();
            case GEOMETRY_TYPE_MULTICURVE:
            final DBGeometryDimension dimension = getGeometryDimension(typmod);
package org.jkiss.dbeaver.ext.postgresql.model.data.type;
    private static final String GEOMETRY_NAME_POLYHEDRALSURFACE     = "polyhedralsurface";
            typmod |= GEOMETRY_DIMENSION_Z;
 * DBeaver - Universal Database Manager
            final int srid = getGeometrySRID(typmod);
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
                break;
                break;
            case 0:
    private static final int GEOMETRY_MASK_TYPE                     = 0x0000_00fc;
            case GEOMETRY_TYPE_TIN:
                return GEOMETRY_NAME_POLYHEDRALSURFACE;
                return getGeometryModifiers(typmod[0].toLowerCase(), 0);
    private static final String GEOMETRY_NAME_TIN                   = "tin";
        return typmod;

            case GEOMETRY_TYPE_MULTISURFACE:
            case GEOMETRY_DIMENSION_Z:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    private static final int GEOMETRY_TYPE_MULTISURFACE             = 0x0000_0030;
    private static int getGeometryModifiers(@NotNull String name, int srid) throws DBException {
    @NotNull
                break;
    }
/*
            case GEOMETRY_TYPE_LINESTRING:
                break;
        }
            case GEOMETRY_NAME_CURVEPOLYGON:
            if (dimension.hasM()) {
    private static final String GEOMETRY_NAME_MULTIPOINT            = "multipoint";
    private static final String GEOMETRY_NAME_POINT                 = "point";
                typmod |= GEOMETRY_TYPE_GEOMETRY;
                throw new DBException("Unsupported geometry type: '" + name + "'");
            case GEOMETRY_NAME_MULTILINESTRING:
            case GEOMETRY_NAME_CIRCULARSTRING:
                return GEOMETRY_NAME_MULTIPOLYGON;
    private static final String GEOMETRY_NAME_TRIANGLE              = "triangle";
    private static final int GEOMETRY_MASK_DIMENSION                = 0x0000_0003;
                break;


                typmod |= GEOMETRY_TYPE_TIN;
                return EMPTY_MODIFIERS;
                return DBGeometryDimension.XYZ;
            case GEOMETRY_NAME_MULTIPOLYGON:
            name = name.substring(0, name.length() - 1);
 *
    public String getTypeModifiersString(@NotNull PostgreDataType type, int typmod) {
        return srid == EMPTY_SRID ? 0 : srid;
            case GEOMETRY_TYPE_POINT:
            name = name.substring(0, name.length() - 2);
                return super.getTypeModifiers(type, typeName, typmod);
                typmod |= GEOMETRY_TYPE_MULTIPOINT;
    }
            name = name.substring(0, name.length() - 1);
    }

            case 2:
    private static final String GEOMETRY_NAME_CIRCULARSTRING        = "circularstring";


    private static final int GEOMETRY_TYPE_COMPOUNDCURVE            = 0x0000_0024;
                break;
            default:
 *
        }
    @NotNull
        }
                typmod |= GEOMETRY_TYPE_MULTILINESTRING;
 * You may obtain a copy of the License at
                return GEOMETRY_NAME_CURVEPOLYGON;
            case GEOMETRY_TYPE_TRIANGLE:
        }
                typmod |= GEOMETRY_TYPE_TRIANGLE;
                sb.append(", ").append(srid);
            sb.append(')');
    private static final int GEOMETRY_TYPE_MULTIPOINT               = 0x0000_0010;
                sb.append('m');
import org.jkiss.utils.CommonUtils;

 *
    private static final String GEOMETRY_NAME_COMPOUNDCURVE         = "compoundcurve";
            typmod |= GEOMETRY_DIMENSION_M;
            typmod |= GEOMETRY_DIMENSION_ZM;
            case GEOMETRY_TYPE_MULTIPOINT:
    private static final int GEOMETRY_TYPE_GEOMETRY                 = 0x0000_0000;
        switch (typmod.length) {
    private static final int GEOMETRY_DIMENSION_ZM                  = 0x0000_0003;
    private static final int GEOMETRY_TYPE_CIRCULARSTRING           = 0x0000_0020;
    }
    private static final String GEOMETRY_NAME_MULTILINESTRING       = "multilinestring";
            case GEOMETRY_TYPE_COMPOUNDCURVE:
    @Override
            case GEOMETRY_NAME_COMPOUNDCURVE:
    private static final String GEOMETRY_NAME_LINESTRING            = "linestring";
        } else if (name.endsWith("z")) {
 * you may not use this file except in compliance with the License.
            if (dimension.hasZ()) {
                return GEOMETRY_NAME_TIN;
                return GEOMETRY_NAME_GEOMETRY;
    private static final String GEOMETRY_NAME_MULTIPOLYGON          = "multipolygon";
            case GEOMETRY_TYPE_CIRCULARSTRING:
            case GEOMETRY_TYPE_MULTILINESTRING:
                typmod |= GEOMETRY_TYPE_COMPOUNDCURVE;
                break;
                return GEOMETRY_NAME_COMPOUNDCURVE;
            case GEOMETRY_TYPE_GEOMETRYCOLLECTION:
        if (typmod != EMPTY_GEOMETRY) {
                break;
                typmod |= GEOMETRY_TYPE_POLYHEDRALSURFACE;
                return getGeometryModifiers(typmod[0].toLowerCase(), CommonUtils.toInt(typmod[1]));
    }
        }

    private static final int GEOMETRY_TYPE_LINESTRING               = 0x0000_0008;
 * distributed under the License is distributed on an "AS IS" BASIS,
            case GEOMETRY_TYPE_MULTIPOLYGON:
    private static final String GEOMETRY_NAME_POLYGON               = "polygon";
            case 1:
        // disallow constructing singleton class
            default:
    public static final PostgreGeometryTypeHandler INSTANCE = new PostgreGeometryTypeHandler();
import org.jkiss.code.Nullable;
            if (srid > 0) {
    private static final int GEOMETRY_TYPE_TIN                      = 0x0000_003C;
