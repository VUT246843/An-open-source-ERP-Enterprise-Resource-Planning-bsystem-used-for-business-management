	@NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
	


 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void bindGeometryParameter(@NotNull JDBCSession session, @NotNull JDBCPreparedStatement statement, int paramIndex, @NotNull Geometry value) throws SQLException {
}
	}	
	protected Object fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index)
 *
 * you may not use this file except in compliance with the License.
    }
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
		return super.getValueDisplayString(column, value, format);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Copyright (C) 2010-2024 DBeaver Corp and others
	}
package org.jkiss.dbeaver.ext.exasol.model;
	public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 *
import java.sql.SQLException;
	@Override
 *
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ExasolGeometryValueHandler extends GISGeometryValueHandler {
import org.jkiss.dbeaver.data.gis.handlers.GISGeometryValueHandler;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.locationtech.jts.geom.Geometry;
 * distributed under the License is distributed on an "AS IS" BASIS,
		}
import org.jkiss.dbeaver.model.gis.DBGeometry;
 * limitations under the License.
/*
import org.jkiss.dbeaver.model.exec.DBCException;
        statement.setString(paramIndex, value.toString()); // Just convert to string for Exasol (doesn't work with bytes)
			return value.toString();
 * See the License for the specific language governing permissions and

	@Override
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
		if (value instanceof DBGeometry && format == DBDDisplayFormat.NATIVE) {
		return resultSet.getString(index);
			throws DBCException, SQLException {

