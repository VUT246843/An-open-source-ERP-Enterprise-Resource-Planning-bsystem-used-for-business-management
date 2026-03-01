 * Unless required by applicable law or agreed to in writing, software
        try {
 * you may not use this file except in compliance with the License.
    @NotNull
    public Class<Ref> getValueObjectType(@NotNull DBSTypedObject attribute)
                false, false, 0, 0, 0);

                typeName = ((Ref) object).getBaseTypeName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * JDBC reference value handler.
    @Override
        throws DBCException, SQLException
        JDBCReference reference = (JDBCReference) value;
import org.jkiss.dbeaver.model.DBUtils;
                Types.REF,
import org.jkiss.code.NotNull;
    private static final Log log = Log.getLog(JDBCReferenceValueHandler.class);
 *

        if (ref instanceof Ref) {
                "Synthetic struct type for reference '" + typeName + "'",
        }
    {
 *
            dataType = new JDBCDataType(
    @Override
    public synchronized String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format)
import java.sql.Ref;
        return Ref.class;
        JDBCSession session,
    {
            } else {
            return new JDBCReference(dataType, object);
        if (object == null) {
        int paramIndex,
    protected void bindParameter(
    @Override
        Object ref = reference.getValue();
        }
import org.jkiss.dbeaver.model.struct.DBSDataType;
}
            statement.setRef(paramIndex, (Ref) ref);


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBValueFormatting;
import java.sql.SQLException;
        } else if (object instanceof JDBCReference) {
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
import org.jkiss.dbeaver.DBException;
            return (JDBCReference)object;

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } else {
            }
import org.jkiss.dbeaver.model.exec.DBCException;
    @NotNull
 * limitations under the License.
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * distributed under the License is distributed on an "AS IS" BASIS,
                session.getDataSource().getContainer(),
     * NumberFormat is not thread safe thus this method is synchronized.
 * See the License for the specific language governing permissions and
        }
    public static final JDBCReferenceValueHandler INSTANCE = new JDBCReferenceValueHandler();
            statement.setObject(paramIndex, ref);
/**
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                typeName,
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.Types;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
     */
        DBSTypedObject paramType,

        } catch (DBException e) {
    public JDBCReference getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
 *
        return DBValueFormatting.getDefaultValueDisplayString(value, format);
        try {
/*
        Object value)
        DBSDataType dataType = null;
 */
        } catch (SQLException e) {
        if (dataType == null) {
 *
            dataType = DBUtils.resolveDataType(session.getProgressMonitor(), session.getDataSource(), typeName);
        } else {
    }
 * You may obtain a copy of the License at
 * Handle STRUCT types.
 * @author Serge Rider

            log.error("Error resolving data type '" + typeName + "'", e);
            if (object instanceof Ref) {
                typeName = type.getTypeName();
        }

            return new JDBCReference(dataType, null);
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCReference;

            throw new DBCException(e, session.getExecutionContext());
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    {
        }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 */
import org.jkiss.dbeaver.model.exec.DBCSession;
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
        JDBCPreparedStatement statement,
        String typeName;
    /**
public class JDBCReferenceValueHandler extends JDBCComplexValueHandler {
import org.jkiss.dbeaver.Log;
