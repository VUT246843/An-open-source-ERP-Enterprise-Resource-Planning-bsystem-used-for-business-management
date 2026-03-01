                    Geometry geometry = convertGeometryFromBinaryFormat(null, bytes);
                    log.debug("Error parsing string geometry value from binary");
            if (leadingSRID && srid > 0) {
            try {

            fetchBytes(resultSet, index),
    public void setInvertCoordinates(boolean invertCoordinates) {
    }
     * http://www.dev-garden.org/2011/11/27/loading-mysql-spatial-data-with-jdbc-and-jts-wkbreader/
     * This is mostly MySQL-specific thing because it has a special spatial data format [SRID] [WKB]

                !leadingSRID ? ByteOrderValues.BIG_ENDIAN : ByteOrderValues.LITTLE_ENDIAN,
        } catch (Exception e) {
            byte[] bytes;
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentBytes;
            false, invertCoordinates);
    protected void bindBytes(@NotNull JDBCPreparedStatement dbStat, int index, @NotNull byte[] bytes) throws SQLException {
            } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        return super.getValueDisplayString(column, value, format);
        this.defaultSRID = defaultSRID;
        return invertCoordinates;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                    return geometry.toString();
    public boolean isLeadingSRID() {
        }
        return resultSet.getBytes(index);
            }
            bindBytes(statement, paramIndex, (byte[]) value);
            final int srid = geometry.getSRID();
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

            if (bytes.length == 0) {
    public int getDefaultSRID() {
                geometry = ((DBGeometry) object).copy();
    @NotNull
import org.jkiss.dbeaver.model.gis.DBGeometry;
     */
            if (leadingSRID) {
            if (object instanceof JDBCContentBytes) {

            return "'" + value.toString() + "'";
 * DBeaver - Universal Database Manager
                }
        return leadingSRID;
    @Override
        } else if (object instanceof byte[] || (object instanceof JDBCContentBytes && !DBUtils.isNullValue(object))) {
import org.locationtech.jts.io.*;
import org.locationtech.jts.geom.Geometry;
/**
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
import java.sql.SQLException;
 * See the License for the specific language governing permissions and
 */
    @Override
    }
        return DBGeometry.class;
    protected void bindGeometryParameter(@NotNull JDBCSession session, @NotNull JDBCPreparedStatement statement, int paramIndex, @NotNull Geometry value) throws SQLException, DBCException {
    }
            bindGeometryParameter(session, statement, paramIndex, (Geometry) value);
                os.write((byte) (srid >> 24));
        } else if (object instanceof Geometry) {
import java.io.ByteArrayInputStream;
    public boolean isFlipCoordinates() {
 */
            geometry = new DBGeometry((Geometry)object);
            );
                }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        bindBytes(statement, paramIndex, convertGeometryToBinaryFormat(session, value));
                geometry.setSRID(srid);
                // Read SRID with little endian order (the least significant bytes come first)
    public void setDefaultSRID(int defaultSRID) {

        }
                geometry = (DBGeometry) object;

    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
            return geometry;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (value instanceof DBGeometry && format == DBDDisplayFormat.NATIVE) {

                !leadingSRID && srid > 0
    protected byte[] fetchBytes(@NotNull JDBCResultSet resultSet, int index) throws SQLException {
        } else if (value instanceof JDBCContentBytes && !DBUtils.isNullValue(value)) {
import org.jkiss.dbeaver.model.exec.DBCException;

                // Write SRID with little endian order (the least significant bytes come first)
                os.write((byte) (srid));
            writer.write(geometry, new OutputStreamOutStream(os));
            }
                srid |= is.read() << 8;
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        } else if (object instanceof DBGeometry) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/*
    }
            return os.toByteArray();

 * GIS geometry handler
                srid |= is.read();
            }
            geometry = new DBGeometry();
                os.write((byte) (srid >> 8));
        return getValueFromObject(session, type,
            } else {
            byte[] bytes = ((JDBCContentBytes) value).getRawValue();
    private boolean invertCoordinates;
    @Override
    @NotNull
                try {


    public void setLeadingSRID(boolean leadingSRID) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
            return WKGUtils.parseWKT((String) object);
    }
        this.invertCoordinates = invertCoordinates;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (bytes.length != 0) {
package org.jkiss.dbeaver.data.gis.handlers;

                    throw new DBCException("Error parsing geometry value from binary", e);
import org.jkiss.dbeaver.model.DBUtils;
    protected byte[] convertGeometryToBinaryFormat(DBCSession session, Geometry geometry) throws DBCException {
            final Geometry geometry = new WKBReader().read(new InputStreamInStream(is));
        }
        } else if (value instanceof byte[]) {
 * You may obtain a copy of the License at

        } else if (value instanceof Geometry) {
    }
    }
            statement.setNull(paramIndex, paramType.getTypeID());
    }
    @Override
 *
                geometry = new DBGeometry(convertGeometryFromBinaryFormat(session, bytes));
            throw new DBCException("Unsupported geometry value: " + object);
        if (geometry.getSRID() == 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
        } catch (IOException e) {
import java.io.ByteArrayOutputStream;
                    // Might be a WKT
    private static final Log log = Log.getLog(GISGeometryValueHandler.class);
    }

            } catch (DBCException e) {
        }
    protected Geometry convertGeometryFromBinaryFormat(DBCSession session, byte[] object) throws DBCException {
                bytes = (byte[]) object;

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
public class GISGeometryValueHandler extends JDBCAbstractValueHandler {
            if (leadingSRID) {


            if (copy) {
        dbStat.setBytes(index, bytes);

        return defaultSRID;
                return new DBGeometry();
            }
 *

        if (object == null) {
        DBGeometry geometry;
            }
}
                2 /* default */,
        } else if (object instanceof String) {
            int srid = 0;
                srid |= is.read() << 24;
                bytes = ((JDBCContentBytes) object).getRawValue();
    private int defaultSRID;
 * limitations under the License.
    private boolean leadingSRID;
    public DBGeometry getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {

                srid |= is.read() << 16;

                } catch (Exception ignored) {
    }
 *
            throw new DBCException("Error reading geometry from binary data", e);
            geometry.setSRID(defaultSRID);
    }
                os.write((byte) (srid >> 16));
import java.io.IOException;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
        this.leadingSRID = leadingSRID;
    }
                } catch (DBCException e) {
 * Unless required by applicable law or agreed to in writing, software
            }
        } else {

            throw new DBCException("Error writing geometry to binary data", e);


        }
        }
        try (ByteArrayInputStream is = new ByteArrayInputStream(object)) {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {

import org.jkiss.code.NotNull;
        if (value instanceof DBGeometry) {
    @NotNull

                try {

        if (value == null) {
    }
            final WKBWriter writer = new WKBWriter(
        }

import org.jkiss.dbeaver.Log;

            }
            value = ((DBGeometry) value).getRawValue();
 * you may not use this file except in compliance with the License.
                    geometry = new DBGeometry(new WKTReader().read(new String(bytes)));
    /**
        return geometry;
