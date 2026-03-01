                return new DBGeometry(g);
            throw new DBCException("Could not bind the value because the value type is not a known geometry type");
    }
        }
        if (wkb == null) {
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index)

 * See the License for the specific language governing permissions and
        if (geometry instanceof DBGeometry) {
import org.jkiss.dbeaver.model.exec.DBCException;
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return new DBGeometry((Geometry) object);
    @Override
        } else if (object instanceof byte[]) {
        Object geometry = value;
    @Override
            Geometry g = (Geometry) geometry;
        } else if (geometry instanceof Geometry) {
                throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCAbstractValueHandler;
 * limitations under the License.
            return new DBGeometry(g);
            }
        } catch (HANAWKBParserException e) {
            try {
                                     boolean copy, boolean validateValue) throws DBCException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            } catch (HANAWKBWriterException e) {
    }
            geometry = ((DBGeometry) geometry).getRawValue();
    public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        if (srid == 0 && paramType instanceof GisAttribute) {
            srid = ((DBGeometry) geometry).getSRID();
        try {
                throw new DBCException(e, session.getExecutionContext());
    @NotNull
 *
            throw new DBCException(
            throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.ext.hana.model.data.wkb.HANAWKBWriterException;
        }
            Geometry g = parser.parse(wkb);
        } else if (object instanceof Geometry) {
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value,
                    "Could not get geometry value from object because the object type is not a known geometry type");
import org.jkiss.dbeaver.ext.hana.model.data.wkb.HANAWKBParserException;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            int paramIndex, Object value) throws DBCException, SQLException {
        int srid = 0;
                g.setSRID(srid);

 *
            } catch (HANAWKBParserException e) {
            } else {

        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
import org.jkiss.dbeaver.model.gis.DBGeometry;
                Geometry g = parser.parse(wkb);
            return new DBGeometry();
        }
 * You may obtain a copy of the License at
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object,
package org.jkiss.dbeaver.ext.hana.model.data;
        } else {

            }
public class HANAGeometryValueHandler extends JDBCAbstractValueHandler {
            }
import org.jkiss.dbeaver.model.gis.GisAttribute;
import org.jkiss.code.NotNull;
    }
            return "'" + value.toString() + "'";
    }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (object == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Unless required by applicable law or agreed to in writing, software
            try {
            @NotNull DBDDisplayFormat format) {
            if (g.getSRID() == 0) {
            HANAWKBParser parser = new HANAWKBParser();
import org.locationtech.jts.geom.Geometry;
import org.jkiss.dbeaver.ext.hana.model.data.wkb.HANAWKBWriter;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
 */
 *    Stefan Uhrig - initial implementation

}
                statement.setBytes(paramIndex, HANAWKBWriter.write(g, HANAXyzmModeFinder.findXyzmMode(g)));

        } else if (object instanceof DBGeometry) {
                return ((DBGeometry) object).copy();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        if (value instanceof DBGeometry && format == DBDDisplayFormat.NATIVE) {
 * Contributors:

            srid = ((GisAttribute) paramType).getAttributeGeometrySRID(session.getProgressMonitor());
                return object;
        return DBGeometry.class;
        HANAWKBParser parser = new HANAWKBParser();
/*
        }
        }
    public static final HANAGeometryValueHandler INSTANCE = new HANAGeometryValueHandler();
    @Override
            throws DBCException, SQLException {
    @Override
 *
import org.jkiss.dbeaver.ext.hana.model.data.wkb.HANAWKBParser;
import java.sql.SQLException;
        if (geometry == null) {
    @NotNull
        byte[] wkb = resultSet.getBytes(index);
 * you may not use this file except in compliance with the License.
            return null;

 * DBeaver - Universal Database Manager
        return super.getValueDisplayString(column, value, format);
            statement.setNull(paramIndex, paramType.getTypeID());

            if (copy) {
            byte[] wkb = (byte[]) object;

