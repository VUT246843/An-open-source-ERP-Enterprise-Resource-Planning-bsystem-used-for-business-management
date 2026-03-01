    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
            srid = ((DBGeometry) value).getSRID();
    @Override
    @Override
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            false, false);
/**
    }
        int srid = 0;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCSession;
        return "geometry::STGeomFromText(?," + srid + ")";
 * You may obtain a copy of the License at



        throw new DBCException("Saving in SQL Server binary format not supported yet");
 * Unless required by applicable law or agreed to in writing, software
        }
        return getValueFromObject(session, type,
    public static final H2GISGeometryValueHandler INSTANCE = new H2GISGeometryValueHandler();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * H2GIS Server geometry handler
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
    protected void bindGeometryParameter(@NotNull JDBCSession session, @NotNull JDBCPreparedStatement statement, int paramIndex, @NotNull Geometry value) throws SQLException, DBCException {
import org.jkiss.dbeaver.data.gis.handlers.GISGeometryValueHandler;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        if (value instanceof DBGeometry) {
        } else if (value instanceof Geometry) {

/*

        statement.setString(paramIndex, value.toString());
*/
public class H2GISGeometryValueHandler extends GISGeometryValueHandler {
 */

    }
 * limitations under the License.
 *
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String makeQueryBind(DBSAttributeBase attribute, Object value) throws DBCException {
 */
    }
 *
}
            srid = ((Geometry) value).getSRID();
    /*
package org.jkiss.dbeaver.ext.h2gis.data;
    protected byte[] convertGeometryToBinaryFormat(DBCSession session, Geometry geometry) throws DBCException {
            resultSet.getObject(index),

