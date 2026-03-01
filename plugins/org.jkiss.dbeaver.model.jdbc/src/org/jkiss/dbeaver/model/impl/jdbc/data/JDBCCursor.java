import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                throw new DBCException(e, resultSet.getSession().getExecutionContext());

        this.closeResultsOnRelease = closeResultsOnRelease;

        if (cursorName != null) {
        this.cursorName = cursorName;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

    public String getCursorName() {
        if (resultSet == null) {
import java.sql.SQLException;
        }
 */
 * Result set holder
    public String toString() {
    }
import org.jkiss.dbeaver.Log;
        this.resultSet = JDBCResultSetImpl.makeResultSet(session, null, resultSet, true);


}
    @Override
            }
 *
    }
 * You may obtain a copy of the License at
    public Object getRawValue() {
    public DBCResultSet openResultSet(@NotNull DBCSession session) throws DBCException {


    @Override
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetImpl;
import org.jkiss.code.Nullable;

        if (resultSet != null) {
import org.jkiss.dbeaver.model.exec.DBCResultSet;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return cursorName;
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
    private boolean closeResultsOnRelease = true;
        //super(session, null, original, description, true);
        if (resultSet != null) {
 */
            // Scroll to the beginning

    }
import java.sql.ResultSet;
    }
            return DBConstants.NULL_VALUE_LABEL;
/**
        }
                try {
 *
    }


                } catch (Exception e) {
            if (closeResultsOnRelease) {
import org.jkiss.dbeaver.model.DBConstants;
            resultSet = null;
 * Unless required by applicable law or agreed to in writing, software
    public void setCursorName(String cursorName) {
    public void release() {
    private JDBCResultSet resultSet;
    }
    @Override

    @Nullable
package org.jkiss.dbeaver.model.impl.jdbc.data;
        return resultSet;

            return cursorName;
 * you may not use this file except in compliance with the License.
            try {
        this.session = session;
    @Override
    public boolean isNull() {
    private JDBCSession session;
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
        return false;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    private static final Log log = Log.getLog(JDBCCursor.class);
    public boolean isModified() {
    public void setCloseResultsOnRelease(boolean closeResultsOnRelease) {
        }
    @Override
public class JDBCCursor implements DBDCursor {
import org.jkiss.code.NotNull;
                resultSet.absolute(1);
 * DBeaver - Universal Database Manager
    @NotNull
            }
    }
        return false;
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
    public JDBCCursor(JDBCSession session, ResultSet resultSet, String description) throws SQLException {
            } catch (SQLException e) {
        return resultSet;

 * See the License for the specific language governing permissions and
                    resultSet.close();
import org.jkiss.dbeaver.model.data.DBDCursor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return CommonUtils.toString(resultSet.getSourceStatement().getQueryString());
                    log.error(e);
                }
/*
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
    private String cursorName;
