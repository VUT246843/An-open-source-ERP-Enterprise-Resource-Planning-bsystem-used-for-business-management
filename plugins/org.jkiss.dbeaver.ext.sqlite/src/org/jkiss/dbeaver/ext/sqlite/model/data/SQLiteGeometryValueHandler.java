            return new DBGeometry();
import org.locationtech.jts.geom.GeometryFactory;
                return object;
public class SQLiteGeometryValueHandler extends JDBCAbstractValueHandler {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        "MULTILINESTRING",
import org.jkiss.code.NotNull;
            }
    public static final SQLiteGeometryValueHandler INSTANCE = new SQLiteGeometryValueHandler();
    }
        return DBGeometry.class;
                    break;
                    buffer.position(buffer.position() + 48);
}

            }

 */
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws SQLException {
            if (buffer.get() != 'G' || buffer.get() != 'P') {
            if (CommonUtils.isBitSet(flags, 1)) {
import org.jkiss.dbeaver.model.gis.GisConstants;
            byte[] wkb = new byte[bytes.length - buffer.position()];
    public static final String[] GEOMETRY_TYPES = new String[]{
            final byte[] bytes = (byte[]) object;

            System.arraycopy(bytes, buffer.position(), wkb, 0, wkb.length);
import org.locationtech.jts.geom.Geometry;
        }
            }
import org.locationtech.jts.geom.PrecisionModel;
            if (value instanceof DBGeometry geom) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (version != 0) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), srsId);
                return new DBGeometry(geometry, srsId);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (object == null) {
            statement.setNull(paramIndex, Types.VARCHAR);
import org.jkiss.utils.CommonUtils;
 *

import java.sql.SQLException;
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
                    break;
        "POINT",
        "GEOMETRYCOLLECTION"
import java.nio.ByteBuffer;
        //return object;
import org.jkiss.dbeaver.model.DBUtils;
 * Unless required by applicable law or agreed to in writing, software
        "MULTIPOLYGON",
            }
                case 3:
        if (object instanceof byte[]) {
                log.debug("Error reading GeoPackage WKB", e);

import java.nio.ByteOrder;
import org.jkiss.dbeaver.Log;

    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        "LINESTRING",
/*
    @Override
            final byte flags = buffer.get();
 * limitations under the License.
    @Nullable

            } catch (Exception e) {


    private static final Log log = Log.getLog(SQLiteGeometryValueHandler.class);
    @Nullable
                return object;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                log.debug("Invalid GeoPackage version: " + version);
            switch ((byte) ((flags >> 1) & 0b111)) {
                case 1:
import org.jkiss.dbeaver.model.gis.DBGeometry;
 * you may not use this file except in compliance with the License.
        "POLYGON",
                log.debug("Invalid GeoPackage data");

                    break;
                WKBReader wkbReader = new WKBReader(geometryFactory);
    @NotNull
 * DBeaver - Universal Database Manager
                    buffer.position(buffer.position() + 64);

import org.jkiss.code.Nullable;
    }
            return new DBGeometry(object, GisConstants.SRID_SIMPLE);
            }
                Geometry geometry = wkbReader.read(new ByteArrayInStream(wkb));
            }
        "MULTIPOINT",


 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * See the License for the specific language governing permissions and
        } else {
 *
        } else {
                buffer.order(ByteOrder.LITTLE_ENDIAN);
    };
                default:
package org.jkiss.dbeaver.ext.sqlite.model.data;

import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
        if (DBUtils.isNullValue(value)) {
 * You may obtain a copy of the License at
    }
        Object object = resultSet.getObject(index);
        return getValueFromObject(session, type, object, false, false);
    @Override
                return object;
        "GEOMETRY",
import org.locationtech.jts.io.ByteArrayInStream;
                    break;
                value = geom.getString();
    }
 *
            // http://www.geopackage.org/spec121/index.html#gpb_format



            final byte version = buffer.get();
            statement.setObject(paramIndex, value);
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws SQLException {
                    buffer.position(buffer.position() + 32);
            final int srsId = buffer.getInt();
            try {
            final ByteBuffer buffer = ByteBuffer.wrap(bytes);
                case 2:
                case 4:
import org.locationtech.jts.io.WKBReader;
import java.sql.Types;
    @Override

