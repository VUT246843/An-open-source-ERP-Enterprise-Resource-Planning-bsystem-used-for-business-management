
import java.sql.Types;
                preparedStatement.setObject(paramIndex, data, Types.OTHER);
        return MimeTypes.TEXT_JSON;
        }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
            if (data != null) {
 * See the License for the specific language governing permissions and
        DBSTypedObject columnType,
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentChars;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        JDBCPreparedStatement preparedStatement,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                preparedStatement.setNull(paramIndex, columnType.getTypeID());
    {

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    {
    public String getContentType()
        int paramIndex)
    private PostgreContentJSON(PostgreContentJSON copyFrom) {
        super(executionContext, json);

 * Unless required by applicable law or agreed to in writing, software
    }

 * JSON content
    public PostgreContentJSON cloneValue(DBRProgressMonitor monitor)
    }
        super(copyFrom);
 * distributed under the License is distributed on an "AS IS" BASIS,
            throw new DBCException(e, session.getExecutionContext());
    public PostgreContentJSON(DBCExecutionContext executionContext, String json)
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    }


        throws DBCException
        JDBCSession session,
 * limitations under the License.
 *
package org.jkiss.dbeaver.ext.postgresql.model.data;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

public class PostgreContentJSON extends JDBCContentChars {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
import org.jkiss.dbeaver.model.exec.DBCException;


    @NotNull
    }
    public void bindParameter(
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.MimeTypes;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
        catch (SQLException e) {
    }
        return new PostgreContentJSON(this);
            } else {

/**
        }
    {
/*
import java.sql.SQLException;
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        try {
    {
