package org.jkiss.dbeaver.ext.db2.model.cache;
public class DB2ViewBaseDepCache extends JDBCObjectCache<DB2ViewBase, DB2ViewBaseDep> {
} *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
    {
    private static final String SQL = "SELECT * FROM SYSCAT.TABDEP WHERE TABSCHEMA = ? AND TABNAME = ? ORDER BY BSCHEMA,BNAME WITH UR";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        return new DB2ViewBaseDep(session.getProgressMonitor(), db2ViewBase, resultSet);
    @Override
import org.jkiss.code.NotNull;

 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    @NotNull
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2ViewBase db2ViewBase) throws SQLException
 * See the License for the specific language governing permissions and
        throws SQLException, DBException
 * You may obtain a copy of the License at
 *

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

 * Cache for dependencies for DB2 Views alike
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        dbStat.setString(2, db2ViewBase.getName());
/*
import java.sql.SQLException;
 * @author Denis Forveille
import org.jkiss.dbeaver.DBException;
 */
 * Unless required by applicable law or agreed to in writing, software
 * 

    @Override
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return dbStat;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * DBeaver - Universal Database Manager
    protected DB2ViewBaseDep fetchObject(@NotNull JDBCSession session, @NotNull DB2ViewBase db2ViewBase, @NotNull JDBCResultSet resultSet)
        final JDBCPreparedStatement dbStat = session.prepareStatement(SQL);
 * you may not use this file except in compliance with the License.
    }
        dbStat.setString(1, db2ViewBase.getParentObject().getName());
    }
    {
/**
import org.jkiss.dbeaver.ext.db2.model.DB2ViewBase;
import org.jkiss.dbeaver.ext.db2.model.DB2ViewBaseDep;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
