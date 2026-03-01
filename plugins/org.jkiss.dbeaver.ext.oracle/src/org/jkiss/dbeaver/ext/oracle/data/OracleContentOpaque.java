 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * See the License for the specific language governing permissions and
    public OracleContentOpaque(DBCExecutionContext executionContext, OPAQUE_TYPE opaque) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.utils.ContentUtils;
        if (storage == null && opaque != null) {
    @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    @Override
        throws DBCException
    private OPAQUE_TYPE opaque;
            storage = makeStorageFromOpaque(monitor, opaque);
    {
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentLOB;
    @Override

        super.release();
    public String getContentType()

import java.io.InputStream;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        }
            throw new DBCException(e, session.getExecutionContext());
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
            if (storage != null) {
import org.jkiss.dbeaver.model.exec.DBCException;
    private static final Log log = Log.getLog(OracleContentOpaque.class);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
    public String getDisplayString(@NotNull DBDDisplayFormat format)
/*
            ContentUtils.close(tmpStream);

        int paramIndex)
    public boolean isNull()
    }

    }
                preparedStatement.setObject(paramIndex, createNewOracleObject(session.getOriginal()));
                preparedStatement.setNull(paramIndex, java.sql.Types.SQLXML);
        this.opaque = opaque;

import java.sql.SQLException;
 *
 * OracleContentOpaque


    {
public abstract class OracleContentOpaque<OPAQUE_TYPE extends Object> extends JDBCContentLOB {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    private InputStream tmpStream;

    }
package org.jkiss.dbeaver.ext.oracle.data;
        throws DBCException, IOException, SQLException;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSTypedObject columnType,
    protected abstract OracleContentOpaque createNewContent();
    protected abstract DBDContentStorage makeStorageFromOpaque(DBRProgressMonitor monitor, OPAQUE_TYPE opaque) throws DBCException;
    }
        catch (IOException e) {
    {
import org.jkiss.dbeaver.Log;
        return 0;//opaque.getLength();
        JDBCSession session,
                preparedStatement.setObject(paramIndex, opaque);
 * DBeaver - Universal Database Manager
        if (tmpStream != null) {
 *
    protected abstract String getOpaqueType();
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
    }
        JDBCPreparedStatement preparedStatement,
import java.io.IOException;
            opaque = null;
        catch (SQLException e) {
    {
    public long getLOBLength() throws DBCException {

        }
    protected abstract OPAQUE_TYPE createNewOracleObject(Connection connection)

import java.sql.Connection;
    }
import org.jkiss.dbeaver.utils.MimeTypes;

    @Override
            } else {

    }

        }

    {
    {

        return opaque == null && storage == null;
        }
    @Override
    @Override
            throw new DBCException("IO error while reading content", e);
 *
}
 */
            } else if (opaque != null) {
    @Override
        throws DBCException
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
import org.jkiss.code.NotNull;
        return MimeTypes.TEXT_XML;
            tmpStream = null;
    public void release()
    public void bindParameter(
 */
        return opaque == null && storage == null ? null : "[" + getOpaqueType() + "]";
 * @author Serge Rider
/**
        try {
        return storage;
        super(executionContext);
