
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        DBCSession session,
 *

        } catch (Exception e) {
            var factory = new GeometryFactory(new PrecisionModel());
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected Geometry convertGeometryFromBinaryFormat(DBCSession session, byte[] object) throws DBCException {
            return DuckDBGeometryConverter.deserialize(buffer, factory);
    }
import java.nio.ByteBuffer;
        try {
 *
 *

}
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws DBCException, SQLException {
            return getValueFromObject(session, type, resultSet.getBytes(index), false, false);
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
package org.jkiss.dbeaver.ext.duckdb.model.data;
    @Override
 * Unless required by applicable law or agreed to in writing, software
            return getValueFromObject(session, type, resultSet.getString(index), false, false);
import java.nio.ByteOrder;
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
public class DuckDBGeometryValueHandler extends GISGeometryValueHandler {
    public static final DuckDBGeometryValueHandler INSTANCE = new DuckDBGeometryValueHandler();
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
            return super.convertGeometryFromBinaryFormat(session, object);
        }
import org.locationtech.jts.geom.PrecisionModel;
 * limitations under the License.
            var buffer = ByteBuffer.wrap(object).order(ByteOrder.LITTLE_ENDIAN);
        JDBCResultSet resultSet,
import java.sql.SQLException;

import org.jkiss.dbeaver.data.gis.handlers.GISGeometryValueHandler;
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (Exception e) {
    @Override
    }
 */
 * you may not use this file except in compliance with the License.
        DBSTypedObject type,
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected Object fetchColumnValue(
/*
        int index
import org.jkiss.dbeaver.model.exec.DBCException;
