 * Licensed under the Apache License, Version 2.0 (the "License");
                } catch (Throwable e) {
 *
/*
            }

                        } catch (Throwable e1) {
 *
    @Override
import org.jkiss.dbeaver.utils.MimeTypes;
                        }
            } else if (storage != null) {
 * limitations under the License.
                            }
        throws DBCException
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
                    }
        return xml == null && storage == null;
                        SQLXML sqlxml = preparedStatement.getConnection().createSQLXML();
    {
        return xml;
        if (storage == null && xml != null) {
    }
                            }
        return storage;
    @Override
            catch (IOException e) {
    private static final Log log = Log.getLog(JDBCContentXML.class);

    public String getDisplayString(@NotNull DBDDisplayFormat format)
                    }
        super.release();
    @Override
        try {

                }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
                        }
                throw new DBCException("IO error while reading content", e);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
        }
                            if (e1 instanceof SQLException && !JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e1)) {
    {
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
 */
                        if (e0 instanceof SQLException && !JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e0)) {
    }
    }
            throw new DBCException("IO error while reading content", e, session.getExecutionContext());
}

    }
        } catch (SQLException e) {
    }
                        sqlxml.setString(new JDBCSQLXMLImpl(storage).getString());
                                    streamReader,
                                preparedStatement.setCharacterStream(
    private void releaseXML() {
                                paramIndex,
import java.io.Reader;

                    } catch (Throwable e0) {
import java.io.IOException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                                streamReader);
            }
    protected SQLXML xml;
            xml = null;
        return MimeTypes.TEXT_XML;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                throw (SQLException) e1;

/**
                        preparedStatement.setSQLXML(paramIndex, sqlxml);
    @Override
                xml.free();
 * JDBCContentXML
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
        }
 * You may obtain a copy of the License at

import java.sql.SQLXML;
                            } catch (Throwable e2) {
        } catch (IOException e) {


 */
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                            throw (SQLException) e0;
                        Reader streamReader = storage.getContentReader();
 * @author Serge Rider
    {

            // Free blob - we don't need it anymore
                    preparedStatement.setSQLXML(paramIndex, new JDBCSQLXMLImpl(storage));
                log.debug(e);
    public String getContentType()
                                preparedStatement.setCharacterStream(
                                    paramIndex,
        JDBCPreparedStatement preparedStatement,
                        try {
import java.sql.SQLException;

            }
                                }
    public SQLXML getRawValue() {
    }
    @Override
    {
            try {
            if (xml != null) {
                                if (e2 instanceof SQLException && !JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e2)) {
            }
        return xml == null && storage == null ? null : "[XML]";
import org.jkiss.code.NotNull;
                                    streamReader,
                            preparedStatement.setCharacterStream(
            } else {
            } catch (SQLException e) {
                try {
        return new JDBCContentXML(executionContext, null);
    @Override
                throw new DBCException(e, executionContext);
                                    streamLength);
    }
                                    paramIndex,
            } catch (Exception e) {
 * DBeaver - Universal Database Manager
        JDBCSession session,
    public JDBCContentXML(DBCExecutionContext executionContext, SQLXML xml) {
                                    (int) streamLength);
                    try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        throws DBCException
                        // Try 3 jdbc methods to set character stream
public class JDBCContentXML extends JDBCContentLOB {
import org.jkiss.dbeaver.model.exec.DBCException;
    {
                preparedStatement.setNull(paramIndex, java.sql.Types.SQLXML);
 *
 * you may not use this file except in compliance with the License.
                                    throw (SQLException) e2;
        }
                    if (e instanceof SQLException && !JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e)) {
                storage = StringContentStorage.createFromReader(xml.getCharacterStream());
    }
    @Override
        DBSTypedObject columnType,
 * Unless required by applicable law or agreed to in writing, software


package org.jkiss.dbeaver.model.impl.jdbc.data;
                        throw (SQLException) e;
    }
            try {
import org.jkiss.dbeaver.utils.ContentUtils;

    }

 * See the License for the specific language governing permissions and
        int paramIndex)
        releaseXML();
    @Override
        super(executionContext);
                            try {
    {
        return -1;
    protected JDBCContentLOB createNewContent()
        if (xml != null) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        this.xml = xml;
    public boolean isNull()
            releaseXML();
                            long streamLength = ContentUtils.calculateContentLength(storage.getContentReader());
                preparedStatement.setSQLXML(paramIndex, xml);
import org.jkiss.dbeaver.Log;
    public void bindParameter(
    public long getLOBLength() throws DBCException {
    public void release()


            throw new DBCException(e, session.getExecutionContext());
