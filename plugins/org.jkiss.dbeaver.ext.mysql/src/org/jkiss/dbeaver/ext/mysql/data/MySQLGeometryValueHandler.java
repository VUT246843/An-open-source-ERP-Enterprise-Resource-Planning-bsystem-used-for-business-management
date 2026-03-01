            } else {
    @Override
                if (column instanceof MySQLTableColumn c && c.getSrid() != null) {
                if (column instanceof DBDAttributeBinding binding) {
                }
            int srid = 0;

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        if (geometry.getSRID() == 0) {
    static final MySQLGeometryValueHandler INSTANCE = new MySQLGeometryValueHandler();
public class MySQLGeometryValueHandler extends GISGeometryValueHandler {
import org.jkiss.dbeaver.model.gis.DBGeometry;
 * Unless required by applicable law or agreed to in writing, software
/**
            if (type instanceof DBDAttributeBinding binding) {
}
            if (srid != 0) {
        if (format == DBDDisplayFormat.NATIVE) {
        }
 * DBeaver - Universal Database Manager
            }
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBGeometry getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

        return super.getValueDisplayString(column, value, format);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            }
 */
 * you may not use this file except in compliance with the License.
                srid = geometry.getSRID();

    }
/*
                type = binding.getEntityAttribute();

package org.jkiss.dbeaver.ext.mysql.data;
 *
                }
 *
        setInvertCoordinates(true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (type instanceof MySQLTableColumn c && c.getSrid() != null) {
 *
    @NotNull
            if (value instanceof DBGeometry geometry) {
                    srid = c.getSrid();
import org.jkiss.code.NotNull;
    @NotNull
    }
        return geometry;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.data.gis.handlers.GISGeometryValueHandler;
            if (srid == 0) {
                return "ST_GeomFromText('" + value.toString() + "')";
    public MySQLGeometryValueHandler() {
        final DBGeometry geometry = super.getValueFromObject(session, type, object, copy, validateValue);
            }
                    column = binding.getEntityAttribute();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableColumn;
 * MySQLGeometryValueHandler
 */
        }
    }

import org.jkiss.dbeaver.model.exec.DBCException;

                return "ST_GeomFromText('" + value.toString() + "', " + srid + ")";
                geometry.setSRID(c.getSrid());
        setLeadingSRID(true);
 * limitations under the License.
