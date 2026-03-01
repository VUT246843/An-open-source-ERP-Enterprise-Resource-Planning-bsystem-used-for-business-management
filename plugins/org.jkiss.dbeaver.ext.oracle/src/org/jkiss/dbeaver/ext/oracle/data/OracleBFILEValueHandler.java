    }
        try {
 * DBeaver - Universal Database Manager
    }
        Object object;
            return new OracleContentBFILE(session.getExecutionContext(), object);
import org.jkiss.dbeaver.model.exec.DBCSession;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.oracle.data;
 *
import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.code.NotNull;

 * BFILE type support
    public DBDContent getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
 *     http://www.apache.org/licenses/LICENSE-2.0
            object = null;
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
    @Override
public class OracleBFILEValueHandler extends JDBCContentValueHandler {

        }
        } else {
import org.jkiss.dbeaver.model.exec.DBCException;
            return new OracleContentBFILE(session.getExecutionContext(), null);
 * You may obtain a copy of the License at
    {
 */

            return new OracleContentBFILE(session.getExecutionContext(), null);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import java.sql.SQLException;
 * See the License for the specific language governing permissions and


 *
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        if (object == null) {
        if (object == null) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (SQLException e) {
/**

    protected DBDContent fetchColumnValue(DBCSession session, JDBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException, SQLException
        }
    public static final OracleBFILEValueHandler INSTANCE = new OracleBFILEValueHandler();
 */
/*
 * limitations under the License.
}

        return super.getValueFromObject(session, type, object, copy, validateValue);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

        } else if (object instanceof OracleContentBFILE) {
    {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            object = resultSet.getObject(index);
            return copy ? (OracleContentBFILE)((OracleContentBFILE) object).cloneValue(session.getProgressMonitor()) : (OracleContentBFILE) object;
