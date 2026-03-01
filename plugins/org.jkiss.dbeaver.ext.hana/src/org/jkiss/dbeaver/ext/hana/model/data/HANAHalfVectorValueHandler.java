 *

                    throw new DBCException("Error resolving data type", e);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        float[] nvals = new float[collection.size()];
                for (int i = 0; i < arrLength; i++) {
import org.jkiss.dbeaver.ext.hana.model.HANADataSource;
                }
        }
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCollection;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        statement.setObject(paramIndex, nvals);
                JDBCSession jdbcSession = (JDBCSession) session;
                    if (item == null) {
                    contents[i] = elementValueHandler.getValueFromObject(jdbcSession, elementType, item, false, true);
import org.jkiss.dbeaver.model.struct.DBSDataType;
                && type.getTypeName().equals(HANAConstants.DATA_TYPE_NAME_HALF_VECTOR)) {

            Float val = (Float) collection.get(i);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final Log log = Log.getLog(HANAVectorValueHandler.class);
            }
import org.jkiss.dbeaver.model.exec.DBCSession;
 * See the License for the specific language governing permissions and
            try {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
public class HANAHalfVectorValueHandler extends HANAVectorValueHandler {
import org.jkiss.dbeaver.Log;
}

 * you may not use this file except in compliance with the License.
                throw new DBCException("NULL elements are not allowed in HALF_VECTOR");
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                int arrLength = java.lang.reflect.Array.getLength(arrObject);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            nvals[i] = val;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

        if (collection.getComponentType().getTypeID() != Types.REAL) {
    protected void bindVectorParameter(@NotNull JDBCPreparedStatement statement, int paramIndex,
                Object arrObject = array.getArray();
                String baseTypeName = "REAL";

package org.jkiss.dbeaver.ext.hana.model.data;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        if (object != null && object instanceof Array array
                Object[] contents = new Object[arrLength];
    @Override
import org.jkiss.code.NotNull;
                final DBDValueHandler elementValueHandler = DBUtils.findValueHandler(session, elementType);
                try {
            throw new DBCException("Only REAL numbers are allowed in HALF_VECTOR as ARRAY");
                    elementType = dataSource.resolveDataType(monitor, baseTypeName);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                log.warn("Cannot display HALF_VECTOR, using default handling", e);
 *    Frederick Arand - initial implementation
import org.jkiss.dbeaver.model.exec.DBCException;
                JDBCDataSource dataSource = jdbcSession.getDataSource();
    }
            if (val == null) {
                    Object item = java.lang.reflect.Array.get(arrObject, i);
 * Contributors:
    @Override

                        throw new DBCException("HALF_VECTOR cannot have NULL element");
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        return super.getValueFromObject(session, type, object, copy, validateValue);
                if (arrLength == 0) {
 *
            boolean copy, boolean validateValue) throws DBCException {
import org.jkiss.dbeaver.ext.hana.model.HANAConstants;
                    throw new DBCException("Non-NULL HALF_VECTOR cannot have 0 dimension");
            }
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
import java.sql.SQLException;
 *
                }
/*
        }
    }
import java.sql.Array;
    public static final HANAHalfVectorValueHandler INSTANCE = new HANAHalfVectorValueHandler();

                DBRProgressMonitor monitor = jdbcSession.getProgressMonitor();
 * limitations under the License.
import java.sql.Types;
        for (int i = 0; i < nvals.length; ++i) {
                return new JDBCCollection(monitor, elementType, elementValueHandler, contents);
 *
                } catch (DBException e) {
                }
                DBSDataType elementType = null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            } catch (SQLException e) {
            throws DBCException, SQLException {
            @NotNull JDBCCollection collection)
import org.jkiss.dbeaver.model.DBUtils;
