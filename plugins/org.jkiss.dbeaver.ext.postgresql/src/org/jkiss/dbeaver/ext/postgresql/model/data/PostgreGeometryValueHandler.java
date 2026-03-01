 * distributed under the License is distributed on an "AS IS" BASIS,
                // May happen when geometry value was stored inside composite
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others

            return makeGeometryFromWKT(object.toString());
                    "mediumWKT",
    @Override

        if (object == null) {
            return new DBGeometry();
                    sb.append('M');
        } else if (object instanceof DBGeometry dbGeometry) {
            int valueSRID = ((DBGeometry) value).getSRID();
            return new DBGeometry();
            if (copy) {

            if (e.getCause() instanceof IllegalArgumentException) {
    @Override
import org.locationtech.jts.io.WKTWriter;
 *
                throw e;
        }
            }

        if (value instanceof DBGeometry) {
    }
            return new DBGeometry(geometry);
            statement.setObject(paramIndex, getStringFromGeometry((Geometry)value), Types.OTHER);
            return makeGeometryFromWKT(value);
 * limitations under the License.
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
import org.locationtech.jts.io.WKBReader;
    }
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            String strValue = value.toString();

        } else if (object instanceof Geometry geometry) {
            final Object geometry = BeanUtils.invokeObjectMethod(value, "getGeometry");
    }
    }
            return WKGUtils.parseWKT(pgString);
                final boolean isMeasured = (Boolean) BeanUtils.invokeObjectMethod(geometry, "isMeasured");
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
    }
import org.jkiss.dbeaver.model.exec.DBCException;
                    new Class[]{StringBuffer.class},
        if (value == null) {
    private String getStringFromGeometry(Geometry geometry) throws DBCException {
                result.setSRID(srid);
        }


            return new DBGeometry(new WKBReader().read(binary));
                String wkbValue = resultSet.getString(index);
        }
    @Override
                //
                log.error("Error reading geometry from PGGeometry", e);
            }
    }
                return WKGUtils.parseWKB(wkbValue);
    @Override
                strValue = "SRID=" + valueSRID + ";" + strValue;
        }
    public static final PostgreGeometryValueHandler INSTANCE = new PostgreGeometryValueHandler();

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                return new DBGeometry(result);
        return super.getValueDisplayString(column, value, format);
            valueSRID = ((DBGeometry) value).getSRID();
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
        if (CommonUtils.isEmpty(pgString)) {
            Object object = resultSet.getObject(index);
 * You may obtain a copy of the License at
        } else if (object instanceof String value) {
import org.locationtech.jts.io.WKTReader;
package org.jkiss.dbeaver.ext.postgresql.model.data;
            } catch (Throwable ignored) {
    @Override
                    sb.append('Z');

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        PostgreDataSource dataSource = (PostgreDataSource) session.getDataSource();
            try {
    }
                final int srid = (Integer) BeanUtils.invokeObjectMethod(geometry, "getSrid");
            try {
        try {
        }
 * See the License for the specific language governing permissions and
                if (is3D) {
        } catch (Exception e) {


        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return dbGeometry.copy();
            } else {
        return makeGeometryFromWKB(WKBReader.hexToBytes(hexString));
    }
                final boolean is3D = (Integer) BeanUtils.invokeObjectMethod(geometry, "getDimension") > 2;
    private DBGeometry makeGeometryFromPGGeometry(DBCSession session, Object value) throws DBCException {
import org.jkiss.dbeaver.Log;
}
                    geometry,
            throw new DBCException("Error parsing WKB value", e);
            } else {
                throw new DBCException(e.getMessage(), e);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        } else if (value instanceof Geometry) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                // The string representation of geometry values returned from PostGIS
import java.sql.Types;
 */
            if (valueSRID != 0 && !strValue.startsWith("SRID=")) {
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
            return getValueFromObject(session, type, object,false, false);
                strValue = "SRID=" + valueSRID + ";" + strValue;
public class PostgreGeometryValueHandler extends JDBCAbstractValueHandler {
            return makeGeometryFromWKT(CommonUtils.toString(PostgreUtils.extractPGObjectValue(object, dataSource)));
                throw e;
import org.jkiss.code.NotNull;
            } catch (Throwable e) {
import java.sql.SQLException;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            return "SRID=" + geometry.getSRID() + ";" + strGeom;

                ((Geometry) value).setSRID(valueSRID);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                }
            }
        } else {

            }
        } else {
            return strGeom;
            }
        } else if (value.getClass().getName().equals(PostgreConstants.PG_GEOMETRY_CLASS)) {
        } catch (Throwable e) {
 *
            valueSRID = ((GisAttribute) paramType).getAttributeGeometrySRID(session.getProgressMonitor());
        } catch (Throwable e) {
                }
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(PostgreGeometryValueHandler.class);
                @SuppressWarnings("StringBufferMayBeStringBuilder")
                // Use explicit cast because we want to fail if something went wrong
                // lacks 'Z' and 'M' modifiers for 3D and 4D geometries (which is not
                // specification-friendly), thus making it impossible to parse later.
            statement.setObject(paramIndex, value, Types.OTHER);
                    new Object[]{sb}
        } else {
                // Throw the original exception instead
        } else if (object.getClass().getName().equals(PostgreConstants.PG_GEOMETRY_CLASS)) {
                // PostGIS JDBC uses StringBuffer instead of StringBuilder, yup
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                if (isMeasured) {
    @NotNull
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
import org.jkiss.utils.CommonUtils;
        }
                return object;
            } else {
        }
 * you may not use this file except in compliance with the License.
        if (paramType instanceof DBDAttributeBinding) {
            return strValue;

                final StringBuffer sb = new StringBuffer(type);
import org.jkiss.dbeaver.model.gis.GisAttribute;
import org.jkiss.dbeaver.model.exec.DBCSession;

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            if (((Geometry) value).getSRID() == 0) {
        final String strGeom = new WKTWriter(4).write(geometry);
        if (value instanceof DBGeometry && format == DBDDisplayFormat.NATIVE) {
 * Unless required by applicable law or agreed to in writing, software
                // Try to parse as WKG
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        return DBGeometry.class;

 * Postgre geometry handler
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {

    protected DBGeometry makeGeometryFromWKT(String pgString) throws DBCException {

                // Code below is trying to build a valid WKT from available data
        // Use all possible dimensions (4 stands for XYZM) for the most verbose output (see DBGeometry#getString)
                final String type = (String) BeanUtils.invokeObjectMethod(geometry, "getTypeString");
                final Geometry result = new WKTReader().read(sb.toString());
            value = ((DBGeometry) value).getRawValue();
        }
/**
    protected DBGeometry makeGeometryFromWKB(byte[] binary) throws DBCException {

        if (geometry.getSRID() > 0) {
            }
                return makeGeometryFromWKT(geometry.toString());
 */
            return makeGeometryFromPGGeometry(session, object);
/*
            if (e instanceof RuntimeException || e instanceof DBCException) {
import org.locationtech.jts.geom.Geometry;
        }
    }
            }
        try {
        if (valueSRID == 0 && paramType instanceof GisAttribute) {
            paramType = ((DBDAttributeBinding) paramType).getAttribute();
                return makeGeometryFromWKB(pgString);
            if (valueSRID != 0 && !strValue.startsWith("SRID=")) {

import org.jkiss.dbeaver.model.gis.DBGeometry;
                );
        }
        try {
            String strValue = value.toString();
import org.jkiss.utils.BeanUtils;
            statement.setNull(paramIndex, paramType.getTypeID());
import org.jkiss.dbeaver.data.gis.handlers.WKGUtils;
                BeanUtils.invokeObjectDeclaredMethod(
        }

            throw new DBCException(e, session.getExecutionContext());
            }
        int valueSRID = 0;
            statement.setObject(paramIndex, strValue, Types.OTHER);
    protected DBGeometry makeGeometryFromWKB(String hexString) throws DBCException {
        } else if (PostgreUtils.isPgObject(dataSource, object)) {
