

/*
    }
        } else if (object instanceof SQLXML) {
                    object = null;
                    }
                // XML content from some other driver?
        try {
            super.bindParameter(session, statement, paramType, paramIndex, value);

                Object xmlObject = OracleContentXML.createXmlObject(session, xmlValue.getBinaryStream());
                    Class<?> rsClass = originalRS.getClass().getClassLoader().loadClass("oracle.jdbc.OracleResultSet");
 * Copyright (C) 2010-2024 DBeaver Corp and others
            throw new DBCException("Unsupported object type: " + object.getClass().getName());
    @NotNull
                    session, new ByteArrayInputStream(strValue.getBytes(StandardCharsets.UTF_8)));
                statement.setObject(paramIndex, xmlObject );
                SQLXML xmlValue = ((JDBCContentXML) value).getRawValue();
 * You may obtain a copy of the License at
            return new OracleContentXML(session.getExecutionContext(), null);
                    object = method.invoke(originalRS, index);
                statement.setNull(paramIndex, java.sql.Types.SQLXML, paramType.getTypeName());
        }

        } else {
            return new OracleContentXML(session.getExecutionContext(), null);
 * Unless required by applicable law or agreed to in writing, software
            return new OracleContentXML(session.getExecutionContext(), new OracleXMLWrapper(object));
 *     http://www.apache.org/licenses/LICENSE-2.0
                        Method xmlConstructor = xmlType.getMethod("createXML", object.getClass());
 * DBeaver - Universal Database Manager

        } else if (object.getClass().getName().equals(OracleConstants.XMLTYPE_CLASS_NAME)) {
        return super.getValueFromObject(session, type, object, copy, validateValue);
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
public class OracleXMLValueHandler extends OracleCLOBValueHandler {
 * you may not use this file except in compliance with the License.
    protected DBDContent fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException
package org.jkiss.dbeaver.ext.oracle.data;
                    if (object != null) {
    {
        } catch (SQLException e) {

    @Override
        if (value instanceof OracleContentXML) {
            }
    {
 *
        if (object == null) {
                object = resultSet.getSQLXML(index);
import org.jkiss.dbeaver.model.DBUtils;

import java.sql.SQLXML;
            object = resultSet.getObject(index);

 */
    }
 * limitations under the License.
            try {
            return copy ? (OracleContentXML)((OracleContentXML) object).cloneValue(session.getProgressMonitor()) : (OracleContentXML) object;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            } catch (SQLException e1) {
                    ResultSet originalRS = resultSet.getOriginal();
        }
                statement.setObject(paramIndex, xmlObject );
 */
                    Method method = rsClass.getMethod("getOPAQUE", Integer.TYPE);
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentXML;

    public static final OracleXMLValueHandler INSTANCE = new OracleXMLValueHandler();
    public DBDContent getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.charset.StandardCharsets;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
                        Class<?> xmlType = object.getClass().getClassLoader().loadClass("oracle.xdb.XMLType");
                statement.setNull(paramIndex, java.sql.Types.SQLXML, paramType.getTypeName());
            return new OracleContentXML(session.getExecutionContext(), (SQLXML) object);
        return MimeTypes.TEXT_XML;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCException;
                try {
import org.jkiss.utils.CommonUtils;
        Object object;

}
                String strValue = CommonUtils.toString(value);
        } else {
import java.io.ByteArrayInputStream;
            if (((JDBCContentXML) value).isNull()) {
    }
    @Override
            }
 *
            if (DBUtils.isNullValue(value)) {
        } else if (value instanceof JDBCContentXML) {
            } else {

import java.sql.SQLException;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
*/
/**
        if (object == null) {
                }
 *
 * See the License for the specific language governing permissions and
        } else if (object instanceof OracleContentXML) {
import org.jkiss.dbeaver.utils.MimeTypes;
                        object = xmlConstructor.invoke(null, object);
 * XML type support
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.code.NotNull;
    public String getValueContentType(@NotNull DBSTypedObject attribute) {
    protected void bindParameter(JDBCSession session, JDBCPreparedStatement statement, DBSTypedObject paramType, int paramIndex, Object value) throws DBCException, SQLException {
        }
        }
                catch (Throwable e2) {
                // XML content from some other driver?
                Object xmlObject = OracleContentXML.createXmlObject(
        //OracleResultSet oracleResultSet = (OracleResultSet) resultSet.getOriginal();
/*
    @Override
                }
                object = null;
