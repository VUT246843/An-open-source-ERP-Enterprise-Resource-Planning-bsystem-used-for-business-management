
                // It is WKB when read from server
            statement.setString(paramIndex, WKBWriter.toHex(new WKBWriter(3).write((Geometry) value)));
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return makeGeometryFromWKB((String) object);
 * DBeaver - Universal Database Manager
            }
        if (object == null) {
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
import org.locationtech.jts.io.WKBWriter;
    @Nullable
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            statement.setNull(paramIndex, paramType.getTypeID());
import org.jkiss.dbeaver.model.exec.DBCSession;

    @Override
import org.jkiss.dbeaver.model.gis.DBGeometry;
            throw new DBCException("Can't bind geometry value " + value);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private RedshiftGeometryValueHandler() {}
            return null;

import org.jkiss.code.Nullable;
        if (value == null) {
                // It may be WKT when edited by user
import java.sql.SQLException;
            return new DBGeometry((Geometry) object);
        }
 * you may not use this file except in compliance with the License.

            value = ((DBGeometry) value).getRawValue();
        if (value instanceof DBGeometry) {
            }
        }
            return copy ? ((DBGeometry) object).copy() : object;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.locationtech.jts.geom.Geometry;
        }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
public class RedshiftGeometryValueHandler extends PostgreGeometryValueHandler {
        if (object instanceof byte[]) {
 * See the License for the specific language governing permissions and
        if (object instanceof Geometry) {
 *
 */
        } else if (value instanceof Geometry) {
            try {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
                ((Geometry) value).setSRID(valueSRID);
            if (((Geometry) value).getSRID() == 0) {
import org.jkiss.dbeaver.ext.postgresql.model.data.PostgreGeometryValueHandler;
                return makeGeometryFromWKT((String) object);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.DBCException;
 * limitations under the License.
    @Override
        }
    }
            valueSRID = ((DBGeometry) value).getSRID();
        int valueSRID = 0;

        }
            } catch (Exception e) {
            valueSRID = ((GisAttribute) paramType).getAttributeGeometrySRID(session.getProgressMonitor());
        return getValueFromObject(session, type, resultSet.getString(index), false, false);
/*
        }
    @Override

        if (object instanceof DBGeometry) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }

 *
    protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException {
 *
        } else {
 * Unless required by applicable law or agreed to in writing, software
    public static final RedshiftGeometryValueHandler INSTANCE = new RedshiftGeometryValueHandler();
             return makeGeometryFromWKB((byte[]) object);
        }
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        }
import org.jkiss.dbeaver.model.gis.GisAttribute;
        if (valueSRID == 0 && paramType instanceof GisAttribute) {
 * You may obtain a copy of the License at
        if (object instanceof String) {
