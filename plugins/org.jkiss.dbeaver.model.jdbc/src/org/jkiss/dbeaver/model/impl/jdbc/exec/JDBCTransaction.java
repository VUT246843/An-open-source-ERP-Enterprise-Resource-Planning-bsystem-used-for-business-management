 *
 * limitations under the License.

    }
                this.dbCon.setAutoCommit(true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
/*
public class JDBCTransaction implements AutoCloseable {
        if (oldAutoCommit) {

            } catch (SQLException e) {
            dbCon.setAutoCommit(false);
 * You may obtain a copy of the License at
        if (oldAutoCommit) {
 * DBeaver - Universal Database Manager
            if (JDBCUtils.isRollbackWarning(e)) {
import java.sql.Connection;
    private static final Log log = Log.getLog(JDBCTransaction.class);
            }
        }
                log.debug("Rollback warning: " + e.getMessage());
import java.sql.SQLException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void commit() throws SQLException {


    }
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.model.impl.jdbc.exec;
        this.dbCon = dbCon;
        dbCon.commit();
        }

    @Override
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    public void rollback() throws SQLException {
        this.oldAutoCommit = dbCon.getAutoCommit();
    }
    }
            dbCon.rollback();

        } catch (SQLException e) {
            }
            try {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 */

 *
                throw e;

 */
        try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void close() {
    public JDBCTransaction(Connection dbCon) throws SQLException {
    private final boolean oldAutoCommit;
}
    private final Connection dbCon;
        }
 * Simple transaction wrapper
            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
                log.error("Error recovering auto-commit mode after transaction end", e);
