import org.jkiss.dbeaver.model.gis.GisAttribute;
                strValue = AltibaseConstants.SRID_EQ + srid + ";" + strValue;
            String strValue = value.toString();
 *
                    return ((DBGeometry) object).copy();
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
            rawValue = value;
            if (srid != 0 && !strValue.startsWith(AltibaseConstants.SRID_EQ)) {
import org.jkiss.dbeaver.model.data.DBDValueBinder;
        

        int srid = 0;

        Object rawValue = null;
            if (object == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            statement.setNull(paramIndex, attribute.getTypeID());
                    }
                    content[0] = content[0].replaceAll(AltibaseConstants.SRID_EQ, "");
 */
            statement.setString(paramIndex, new WKTWriter(4).write((Geometry) rawValue));
                ((Geometry) rawValue).setSRID(srid);

import org.locationtech.jts.io.WKTReader;
        if (paramType instanceof DBDAttributeBinding) {
 * You may obtain a copy of the License at
                    try {
                    geom = new WKTReader().read(content[1]);
                    geom = new WKTReader().read(content[0]);

    public static final AltibaseGeometryValueHandler INSTANCE = new AltibaseGeometryValueHandler();
                }
 * Unless required by applicable law or agreed to in writing, software
        }
}        DBSTypedObject attribute = null;
        }
                return new DBGeometry((Geometry) object);
                return new DBGeometry();
        } else if (rawValue instanceof Geometry) {

                    + e.getLocalizedMessage());
        if (value instanceof DBGeometry) {
                dbGeometry.setSRID(srid);
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            DBSTypedObject type, int index) throws DBCException, SQLException {
                 */
                        srid = Integer.parseInt(content[0]);
import org.jkiss.code.NotNull;
                } else {
                    // No SRID, just in case.
        return dbGeometry;
    private static final Log log = Log.getLog(AltibaseGeometryValueHandler.class);
        }
        return getValueFromObject(session, type, object, false, false);
        }
 *
import org.jkiss.dbeaver.model.exec.DBCSession;
        }
    }
            } else {
 */


        }
                Geometry geom = null;
        return "GEOMFROMTEXT(?, " + ((DBGeometry) value).getSRID() + ")";
import org.jkiss.dbeaver.data.gis.handlers.GISGeometryValueHandler;
            }  else if (object instanceof Geometry) {

    @Override
        if (value instanceof DBGeometry) {             
            }
            log.warn("Failed to parse object: " 

            String strValue = rawValue.toString();
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, 
        } else {
    @NotNull
import org.locationtech.jts.geom.Geometry;
                    + AltibaseConstants.NEW_LINE 
 * DBeaver - Universal Database Manager
        
import org.jkiss.dbeaver.Log;
        try {
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ext.altibase.data;
                dbGeometry = new DBGeometry(geom);
                }
                 * SRID=xxxx;MULTIPOLYGON (((199....
                } else if (content.length == 1) {
        } else {
        if (rawValue == null) {

import java.sql.SQLException;
    @Override
                    return ((DBGeometry) object);
import org.locationtech.jts.io.ParseException;

 * See the License for the specific language governing permissions and
    }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, 
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        } else {
            DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
    }
            rawValue = ((DBGeometry) value).getRawValue();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.gis.DBGeometry;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

import org.locationtech.jts.io.WKTWriter;

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            attribute = ((DBDAttributeBinding) paramType).getAttribute();
        Object object = resultSet.getObject(index);

        } catch (ParseException e) {
        
            statement.setObject(paramIndex, strValue, AltibaseConstants.TYPE_GEOMETRY);
            } else if (object instanceof DBGeometry) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            if (((Geometry) rawValue).getSRID() == 0) {
    }
            int valueSRID = ((DBGeometry) value).getSRID();
        DBGeometry dbGeometry = null;
            // format: GEOMFROMTEXT(?, SRID)
                /*

            }

 * AltibaseGeometryValueHandler

            attribute = paramType;
                String[] content = ((String) object).split(";", 2);
        int srid = 0;
            }
            Object object, boolean copy, boolean validateValue) throws DBCException {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    + ((object != null) ? object.toString() : "NULL") 
public class AltibaseGeometryValueHandler extends GISGeometryValueHandler implements DBDValueBinder {
                strValue = AltibaseConstants.SRID_EQ + valueSRID + ";" + strValue;
    @Override
            srid = ((GisAttribute) attribute).getAttributeGeometrySRID(session.getProgressMonitor());
                    // geom from WKT
    @Override
        
        if (srid == 0 && attribute instanceof GisAttribute) {
                if (copy) {
            }
                if (content.length == 2) {
                // start with SRID=xxxx;
    public DBGeometry getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, 
 * limitations under the License.

            srid = ((DBGeometry) value).getSRID();
    public String makeQueryBind(@NotNull DBSAttributeBase attribute, @NotNull Object value) throws DBCException {
    @Override
 * you may not use this file except in compliance with the License.
                 * EWKT: 32,000 is maximum length of return value.


/*

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        log.warn("Failed to parse SRID: " + e);
 *
            if (valueSRID != 0 && !strValue.startsWith(AltibaseConstants.SRID_EQ)) {
/*
        return super.getValueDisplayString(column, value, format);
                    } catch (NumberFormatException e) {
            return strValue;
                    // get srid
