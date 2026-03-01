    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
package org.jkiss.dbeaver.model.impl.jdbc.data.handlers;
            return object;
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        throws SQLException

            statement.setNull(paramIndex, paramType.getTypeID());
        } else {
    @Override
 * DBeaver - Universal Database Manager

    }
    {
        } else {

/**
import org.jkiss.dbeaver.utils.ContentUtils;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDValueDefaultGenerator;
    }
/*
        // Use getObject instead of getString because sometimes CHAR/VARCHAR holds something specific. E.g. FOR BIT DATA

public class JDBCStringValueHandler extends JDBCAbstractValueHandler implements DBDValueDefaultGenerator {
            return object.toString();

    }
    private static final Log log = Log.getLog(JDBCStringValueHandler.class);
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.code.NotNull;
    }
        throws SQLException

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * JDBC string value handler
 * Unless required by applicable law or agreed to in writing, software
        DBSTypedObject type,

 * You may obtain a copy of the License at
    public void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType,
import java.sql.SQLException;
            return new String((byte[])object);
}        return resultSet.getObject(index);
        } else if (object instanceof byte[]) {
import org.jkiss.dbeaver.model.exec.DBCException;
    public static final JDBCStringValueHandler INSTANCE = new JDBCStringValueHandler();
 * you may not use this file except in compliance with the License.
            return GeneralUtils.makeDisplayString(object);
        return String.class;
import org.jkiss.dbeaver.Log;
                              int paramIndex, Object value)
            return new String((char[])object);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        } else if (object instanceof DBDContent) {
    public Class<String> getValueObjectType(@NotNull DBSTypedObject attribute)
    {
            statement.setString(paramIndex, value.toString());
        JDBCResultSet resultSet,
            // Special workaround for #798 - convert array to string (weird stuff)
    }

    @Override
    public Object generateDefaultValue(DBCSession session, DBSTypedObject type) {
        DBCSession session,
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * See the License for the specific language governing permissions and
 *
    {
    }
        }

 *
    protected Object fetchColumnValue(
 *
        int index)
    {
    @NotNull
    public String getDefaultValueLabel() {
        if (object == null || object instanceof String) {
        }
            return ContentUtils.getContentStringValue(session.getProgressMonitor(), (DBDContent) object);
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else if (object instanceof char[]) {
        return "Empty string";
        if (value == null) {
        return "";

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 */
import org.jkiss.dbeaver.model.data.DBDContent;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else if (object.getClass().isArray()) {
