import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    protected XMLType createNewOracleObject(Connection connection) throws DBCException, IOException, SQLException
            if (storage != null) {
        }
        }
    {
            throw new DBCException(e, session.getExecutionContext());
    {
            throw new DBCException(e, session.getExecutionContext());
 */

            return new TemporaryContentStorage(tempFile);
    OracleContentXML(DBCExecutionContext executionContext, SQLXML xml)

                        paramIndex,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        DBSTypedObject columnType,
    public void bindParameter(
}
 * DBeaver - Universal Database Manager
                new Object[] {session.getOriginal(), stream});
import org.jkiss.dbeaver.model.exec.DBCException;
 * you may not use this file except in compliance with the License.
            ContentUtils.close(contentStream);
            catch (IOException e) {
                ContentUtils.deleteTempFile(monitor, tempFile);
                new Class[] {java.sql.Connection.class, java.io.InputStream.class},
                throw new DBCException(e);
        catch (IOException e) {
import org.jkiss.dbeaver.registry.driver.DriverUtils;
            } catch (Exception e) {
 *
        throws DBCException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        try {
        try {
            }
 * See the License for the specific language governing permissions and
                throw new DBCException(e);
            } else if (xml != null) {
            } catch (SQLException e) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                try (InputStream streamReader = storage.getContentStream()) {
import java.io.IOException;
                DriverUtils.getDriverClass(session.getExecutionContext().getDataSource(), OracleConstants.XMLTYPE_CLASS_NAME),
            try {
        final InputStream contentStream = storage.getContentStream();
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    {
        try {
        catch (SQLException e) {
        }
    }
*/
 *
            throw new DBCException("IO error while reading XML", e);
    static Object createXmlObject(JDBCSession session, InputStream stream) throws DBCException
    {
                    final Object xmlObject = createXmlObject(session, streamReader);
        int paramIndex)
            try {
            } else {
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentXML;
    protected DBDContentStorage makeStorageFromOpaque(DBRProgressMonitor monitor, XMLType opaque) throws DBCException
            }
        }
            throw new DBCException("Internal error when creating XMLType", e, session.getExecutionContext());
        } catch (SQLException e) {
/*
 * Unless required by applicable law or agreed to in writing, software

            }
                "createXML",
import java.sql.SQLException;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return BeanUtils.invokeStaticMethod(
                    preparedStatement.setObject(
                tempFile = ContentUtils.createTempContentFile(monitor, "opaque" + opaque.hashCode());
    @Override
public class OracleContentXML extends JDBCContentXML {
 */
            // Create new local storage



 * You may obtain a copy of the License at
import java.sql.SQLXML;
            return XMLType.createXML(connection, contentStream);
                }
        }

 * XML content
                preparedStatement.setNull(paramIndex, java.sql.Types.SQLXML, columnType.getTypeName());
 *
    }
        } finally {
package org.jkiss.dbeaver.ext.oracle.data;
    @Override
                    paramIndex,
import org.jkiss.utils.BeanUtils;

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    {
        return new OracleContentXML(executionContext, null);
        if (contentLength < 4000) {

                ContentUtils.copyReaderToFile(monitor, opaque.getClobVal().getCharacterStream(), contentLength, null, tempFile);
        JDBCSession session,
                return new StringContentStorage(opaque.getStringVal());
        } else {
    protected OracleContentXML createNewContent()
        super(executionContext, xml);
            IFile tempFile;
/**
    @Override
            try {
                throw new DBCException(e);
    {
    }
        }
import java.io.InputStream;
            }
        JDBCPreparedStatement preparedStatement,
        } catch (Throwable e) {
                    xml);
    @Override
    }
        long contentLength = opaque.getLength();
                        xmlObject);
 * distributed under the License is distributed on an "AS IS" BASIS,
                preparedStatement.setObject(
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
